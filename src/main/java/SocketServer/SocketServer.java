package SocketServer;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

import properties.properties;
import Customer.Customer;
import CustomerControler.CustomerControler;
import Message.Message;

public class SocketServer extends Thread {
	public static int port = Integer.parseInt(properties.getInstance().getProperty("port"));

	protected Socket socket;

	private SocketServer(Socket socket) {
		this.socket = socket;
		//Configure connections
		System.out.println("New client connected from " + socket.getInetAddress().getHostAddress());
		start();
	}

	public void run() {
            InputStream in = null;
            OutputStream out = null;
            try {
                in = socket.getInputStream();
                out = socket.getOutputStream();

                //first read the object that has been sent
                ObjectInputStream objectInputStream = new ObjectInputStream(in);
                Message mensajeIn = (Message)objectInputStream.readObject();
                //Object to return informations 
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
                Message mensajeOut = new Message();
                HashMap<String,Object> session = mensajeIn.getSession();
                
                switch (mensajeIn.getContext()) {
                    /*case "/getCustomers":
                            customerControler = new CustomerControler();
                            ArrayList<Customer> lista=new ArrayList<Customer>();
                            customerControler.getCustomers(lista);
                            mensajeOut.setContext("/getCustomersResponse");
                            //HashMap<String,Object> session=new HashMap<String, Object>();
                            session.put("Customers",lista);
                            mensajeOut.setSession(session);
                            objectOutputStream.writeObject(mensajeOut);		    		
                            break;
                            case "/getCustomer":
                                    int id= (int) session.get("id");
                                    customerControler = new CustomerControler();
                                    Customer cu=customerControler.getCustomer(id);
                                    if (cu!=null){
                                            System.out.println("id:"+cu.getId());
                                    }else {
                                            System.out.println("No encontrado en la base de datos");
                                    }

                                    mensajeOut.setContext("/getCustomerResponse");
                                    session.put("Customer",cu);
                                    mensajeOut.setSession(session);
                                    objectOutputStream.writeObject(mensajeOut);
                                    break;*/
                    case "/checkLogIn":
                        HashMap<String, String> userData = CustomerControler.checkLogIn((String)session.get("username"), (String)session.get("password"));
                        mensajeOut.setContext("/checkLogInResponse");
                        HashMap<String, Object> sessionOut = new HashMap<>();
                        sessionOut.put("check", true);
                        sessionOut.put("userData", userData);
                        mensajeOut.setSession(sessionOut);
                        objectOutputStream.writeObject(mensajeOut);

                    default:
                        System.out.println("\nParámetro no encontrado");
                        break;
                }

                //Lógica del controlador 
                //System.out.println("\n1.- He leído: "+mensaje.getContext());
                //System.out.println("\n2.- He leído: "+(String)mensaje.getSession().get("Nombre"));



                //Prueba para esperar
                /*try {
                    System.out.println("Me duermo");
                            Thread.sleep(15000);
                            System.out.println("Me levanto");
                    } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }*/
                    // create an object output stream from the output stream so we can send an object through it
                    /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);

                    //Create the object to send
                    String cadena=((String)mensaje.getSession().get("Nombre"));
                    cadena+=" añado información";
                    mensaje.getSession().put("Nombre", cadena);
                    //System.out.println("\n3.- He leído: "+(String)mensaje.getSession().get("Nombre"));
                    objectOutputStream.writeObject(mensaje);*
                    */

            } catch (IOException ex) {
                    System.out.println("Unable to get streams from client");
            } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
            } finally {
                    try {
                            in.close();
                            out.close();
                            socket.close();
                    } catch (IOException ex) {
                            ex.printStackTrace();
                    }
            }
	}

	public static void main(String[] args) {
		System.out.println("SocketServer Example - Listening port "+port);
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
			while (true) {
				/**
				 * create a new {@link SocketServer} object for each connection
				 * this will allow multiple client connections
				 */
				new SocketServer(server.accept());
			}
		} catch (IOException ex) {
			System.out.println("Unable to start server.");
		} finally {
			try {
				if (server != null)
					server.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}