/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Idioma;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author bolli
 */
public class GestorIdiomas {
    private static GestorIdiomas instancia;
    private HashMap<String, String> textos;
    private HashMap<String, String> textosEspaniol;
    private HashMap<String, String> textosIngles;
    private HashMap<String, String> textosFrances;
    private List<Runnable> observadores;
    
    private GestorIdiomas() {    
        observadores = new ArrayList<>();
        inicializarTextos();
        textos = textosIngles; // Idioma por defecto
    }

    public static GestorIdiomas getInstance() {
        if (instancia == null) {
            instancia = new GestorIdiomas();
        }
        return instancia;
    }

    private void inicializarTextos() {
        textosEspaniol = new HashMap<>();
        textosIngles = new HashMap<>();
        textosFrances = new HashMap<>();

        // Textos en espaniol
        //CambiarContrasena
        textosEspaniol.put("lblTitleNewPassword", "Nueva Contrasena");
        textosEspaniol.put("lblPassword", "Contrasena:");
        textosEspaniol.put("lblConfirm", "Confirmar Contrasena:");
        textosEspaniol.put("labelLogIn", "Iniciar Sesion");
        textosEspaniol.put("lblError", "Ambas contraseñas no coinciden.");
        //LogIn
        textosEspaniol.put("lblTitleLogIn", "Iniciar Sesion");
        textosEspaniol.put("lblForgotPass", "¿Olvidaste tu contrasena?");
        textosEspaniol.put("lblSignUpAccess", "¿No tienes una cuenta? Registrate aqui");
        textosEspaniol.put("lblTitleSignUp", "Registro");
        textosEspaniol.put("lblPassword", "Contrasena:");
        textosEspaniol.put("lblConfirmPassword", "Confirmar Contrasena:");
        textosEspaniol.put("lblErrorLogIn", "El usuario o la contrasena son incorrectos");
        textosEspaniol.put("lblErrorSignUp", "Ambas contrasenas no coinciden");
        textosEspaniol.put("labelLogIn", "Iniciar Sesion");
        textosEspaniol.put("lblSignUp", "Registrarse");
        textosEspaniol.put("usernameField", "Nombre de usuario");
        textosEspaniol.put("passField", "Contrasena");
        textosEspaniol.put("newEmailField", "Correo Electronico");
        textosEspaniol.put("newUsernameField", "Nombre de Usuario");
        textosEspaniol.put("newPassField", "Contrasena");
        textosEspaniol.put("confirmPassField", "Contrasena");
        //VerifyEmailWindow
        textosEspaniol.put("lblEmail", "Introduce tu correo electronico:");
        textosEspaniol.put("lblSend", "Enviar Codigo");
        textosEspaniol.put("lblCode", "Introduce el código de verificacion:");
        textosEspaniol.put("lblConfirm", "Confirmar");
        textosEspaniol.put("txtFieldEmail", "Correo Electronico");
        textosEspaniol.put("txtFieldCode", "Código de Verificacion");
        //anadir
        textosEspaniol.put("lblType", "TIPO");
        textosEspaniol.put("txtFieldName", "Nombre");
        textosEspaniol.put("txtFieldDose", "Dosis");
        textosEspaniol.put("jLabel1", "INFORMACION GENERAL");
        textosEspaniol.put("txtFieldFrequency", "Frecuencia");
        textosEspaniol.put("txtFieldRemaining", "Cantidad restante");
        textosEspaniol.put("txtFieldDuration", "Duración");
        textosEspaniol.put("lblTimeline", "LINEA DE TIEMPO Y HORARIO");
        textosEspaniol.put("btnAnadir", "Aceptar");
        textosEspaniol.put("btnCancelar", "Cancelar");
        //quitar
        textosEspaniol.put("medicamentos", "ELIMINAR MEDICINAS:");
        textosEspaniol.put("textoAceptar", "CONFIRMAR ELIMINACION");
        //mainWindow
        textosEspaniol.put("lblName", "NOMBRE:");
        textosEspaniol.put("lblRemainig", "CANTIDAD RESTANTE:");
        textosEspaniol.put("lblDose", "DOSIS:");
        textosEspaniol.put("lblFrequency", "FRECUENCIA:");
        textosEspaniol.put("lblDuration", "DURACIÓN:");
        textosEspaniol.put("lblName2", "NOMBRE:");
        textosEspaniol.put("lblRemainig2", "CANTIDAD RESTANTE:");
        textosEspaniol.put("lblDose2", "DOSIS:");
        textosEspaniol.put("lblFrequency2", "FRECUENCIA:");
        textosEspaniol.put("datename", "Fecha:");
        textosEspaniol.put("date", "Fecha actual");
        textosEspaniol.put("lblAjustes", "Ajustes");
        textosEspaniol.put("lblAdd", "Añadir");
        textosEspaniol.put("lblRemove", "Eliminar");
        //PanelMedicines
        textosEspaniol.put("lblName", "NOMBRE:");
        textosEspaniol.put("lblRemainig", "CANTIDAD RESTANTE:");
        textosEspaniol.put("lblDose", "DOSIS:");
        textosEspaniol.put("lblFrequency", "FRECUENCIA:");
        textosEspaniol.put("lblDuration", "DURACIÓN:");
        //Ajustes
        textosEspaniol.put("lblAjustes", "Configuraciones");
        textosEspaniol.put("jNotificacionONOFF", "Notificaciones DESACTIVADAS");
        textosEspaniol.put("jNumContacto", "Numero de contacto");
        textosEspaniol.put("jManualUso", "Manual de la App");
        textosEspaniol.put("jDeleteCuenta", "Eliminar tu cuenta");
        textosEspaniol.put("jButtonSoporte", "Ayuda y soporte");
        textosEspaniol.put("jButtonNotificacion", "Notificaciones");
        textosEspaniol.put("jButtonIdioma", "Idioma");
        textosEspaniol.put("lblContact", "Si tiene alguna duda contacte con el numero +34 618 89 90 46");

        // Textos en inglés
        //CambiarContrasena
        textosIngles.put("lblTitleNewPassword", "New Password");
        textosIngles.put("lblPassword", "Password:");
        textosIngles.put("lblConfirm", "Confirm Password:");
        textosIngles.put("labelLogIn", "Log In");
        textosIngles.put("lblError", "Both passwords don't match.");        
        //LogIn
        textosIngles.put("lblTitleLogIn", "Log In");
        textosIngles.put("lblForgotPass", "Forgot your password?");
        textosIngles.put("lblSignUpAccess", "Don't have an account? Sign up here");
        textosIngles.put("lblTitleSignUp", "Sign Up");
        textosIngles.put("lblPassword", "Password:");
        textosIngles.put("lblConfirmPassword", "Confirm Password:");
        textosIngles.put("lblErrorLogIn", "Username or password are incorrect");
        textosIngles.put("lblErrorSignUp", "Both passwords don't match");
        textosIngles.put("labelLogIn", "Log In");
        textosIngles.put("lblSignUp", "Sign Up");
        textosIngles.put("usernameField", "Username");
        textosIngles.put("passField", "Password");
        textosIngles.put("newEmailField", "Email");
        textosIngles.put("newUsernameField", "Username");
        textosIngles.put("newPassField", "Password");
        textosIngles.put("confirmPassField", "Password");        
        //VerifyEmailWindow
        textosIngles.put("lblEmail", "Insert your Email:");
        textosIngles.put("lblSend", "Send Code");
        textosIngles.put("lblCode", "Insert the verification code:");
        textosIngles.put("lblConfirm", "Confirm");
        textosIngles.put("txtFieldEmail", "Email");
        textosIngles.put("txtFieldCode", "Verification Code");
        //anadir
        textosIngles.put("lblType", "TYPE");
        textosIngles.put("txtFieldName", "Name");
        textosIngles.put("txtFieldDose", "Dose");
        textosIngles.put("jLabel1", "GENERAL INFORMATION");
        textosIngles.put("txtFieldFrequency", "Frequency");
        textosIngles.put("txtFieldRemaining", "Remaining amount");
        textosIngles.put("txtFieldDuration", "Duration");
        textosIngles.put("lblTimeline", "TIMELINE & SCHEDULE");
        textosIngles.put("btnAnadir", "OK");
        textosIngles.put("btnCancelar", "CANCEL");
        //quitar
        textosIngles.put("medicamentos", "DELETE MEDICINES:");
        textosIngles.put("textoAceptar", "CONFIRM DELETE");
        //mainWindow 
        textosIngles.put("lblName", "NAME:");
        textosIngles.put("lblRemainig", "REMAINING:");
        textosIngles.put("lblDose", "DOSE:");
        textosIngles.put("lblFrequency", "FREQUENCY:");
        textosIngles.put("lblName2", "NAME:");
        textosIngles.put("lblRemainig2", "REMAINING:");
        textosIngles.put("lblDose2", "DOSE:");
        textosIngles.put("lblFrequency2", "FREQUENCY:");
        textosIngles.put("lblDuration", "DURATION:");
        textosIngles.put("datename", "Date:");
        textosIngles.put("date", "Current Date");
        textosIngles.put("lblAjustes", "Settings");
        textosIngles.put("lblAdd", "Add");
        textosIngles.put("lblRemove", "Remove");       
        //PanelMedicines
        textosIngles.put("lblName", "NAME:");
        textosIngles.put("lblRemainig", "REMAINING:");
        textosIngles.put("lblDose", "DOSE:");
        textosIngles.put("lblFrequency", "FREQUENCY:");
        textosIngles.put("lblDuration", "DURATION:");
        //Ajustes
        textosIngles.put("lblAjustes", "Settings");
        textosIngles.put("jNotificacionONOFF", "Notifications OFF");
        textosIngles.put("jNumContacto", "Contact number");
        textosIngles.put("jManualUso", "App Manual");
        textosIngles.put("jDeleteCuenta", "Delete your account");
        textosIngles.put("jButtonSoporte", "Help and support");
        textosIngles.put("jButtonNotificacion", "Notifications");
        textosIngles.put("jButtonIdioma", "Language");
        textosIngles.put("lblContact", "If you have any questions please contact the number +34 618 89 90 46 ");
        
        // Textos en francés
        //CambiarContrasena
        textosFrances.put("lblTitleNewPassword", "Nouveau Mot de Passe");
        textosFrances.put("lblPassword", "Mot de passe :");
        textosFrances.put("lblConfirm", "Confirmer le mot de passe :");
        textosFrances.put("labelLogIn", "Se connecter");
        textosFrances.put("lblError", "Les deux mots de passe ne correspondent pas.");
        //LogIn
        textosFrances.put("lblTitleLogIn", "Se connecter");
        textosFrances.put("lblForgotPass", "Mot de passe oublie ?");
        textosFrances.put("lblSignUpAccess", "Vous n'avez pas de compte ? Inscrivez-vous ici");
        textosFrances.put("lblTitleSignUp", "Inscription");
        textosFrances.put("lblPassword", "Mot de passe :");
        textosFrances.put("lblConfirmPassword", "Confirmer le mot de passe :");
        textosFrances.put("lblErrorLogIn", "Le nom d'utilisateur ou le mot de passe est incorrect");
        textosFrances.put("lblErrorSignUp", "Les deux mots de passe ne correspondent pas");
        textosFrances.put("labelLogIn", "Se connecter");
        textosFrances.put("lblSignUp", "S'inscrire");
        textosFrances.put("usernameField", "Nom d'utilisateur");
        textosFrances.put("passField", "Mot de passe");
        textosFrances.put("newEmailField", "Adresse e-mail");
        textosFrances.put("newUsernameField", "Nom d'utilisateur");
        textosFrances.put("newPassField", "Mot de passe");
        textosFrances.put("confirmPassField", "Mot de passe");
        //VerifyEmailWindow
        textosFrances.put("lblEmail", "Entrez votre adresse e-mail :");
        textosFrances.put("lblSend", "Envoyer le code");
        textosFrances.put("lblCode", "Entrez le code de verification :");
        textosFrances.put("lblConfirm", "Confirmer");
        textosFrances.put("txtFieldEmail", "Adresse e-mail");
        textosFrances.put("txtFieldCode", "Code de vrrification");
        //anadir
        textosFrances.put("lblType", "TYPE");
        textosFrances.put("txtFieldName", "Nom");
        textosFrances.put("txtFieldDose", "Dose");
        textosFrances.put("jLabel1", "INFORMATIONS GENERALES");
        textosFrances.put("txtFieldFrequency", "Frequence");
        textosFrances.put("txtFieldRemaining", "Quantite restante");
        textosFrances.put("txtFieldDuration", "Durée");
        textosFrances.put("lblTimeline", "CHRONOLOGIE ET HORAIRE");
        textosFrances.put("btnAnadir", "Accepter");
        textosFrances.put("btnCancelar", "Annuler");
        //quitar
        textosFrances.put("medicamentos", "SUPPRIMER MEDICAMENTS :");
        textosFrances.put("textoAceptar", "CONFIRMER LA SUPPRESSION");
        //mainWindow
        textosFrances.put("lblName", "NOM :");
        textosFrances.put("lblRemainig", "QUANTITE RESTANTE :");
        textosFrances.put("lblDose", "DOSE :");
        textosFrances.put("lblFrequency", "FREQUENCE :");
        textosFrances.put("lblName2", "NOM :");
        textosFrances.put("lblRemainig2", "QUANTITE RESTANTE :");
        textosFrances.put("lblDose2", "DOSE :");
        textosFrances.put("lblFrequency2", "FREQUENCE :");
        textosFrances.put("lblDuration", "DURÉE :");
        textosFrances.put("datename", "Date :");
        textosFrances.put("date", "Date actuelle");
        textosFrances.put("lblAjustes", "Parametres");
        textosFrances.put("lblAdd", "Ajouter");
        textosFrances.put("lblRemove", "Supprimer");
        //PanelMedicines
        textosFrances.put("lblName", "NOM :");
        textosFrances.put("lblRemainig", "QUANTITE RESTANTE :");
        textosFrances.put("lblDose", "DOSE :");
        textosFrances.put("lblFrequency", "FRÉQUENCE :");
        textosFrances.put("lblDuration", "DURÉE :");
        //Ajustes
        textosFrances.put("lblAjustes", "Configurations");
        textosFrances.put("jNotificacionONOFF", "Notifications DESACTIVEES");
        textosFrances.put("jNumContacto", "Numero de contact");
        textosFrances.put("jManualUso", "Manuel de l'application");
        textosFrances.put("jDeleteCuenta", "Supprimer votre compte");
        textosFrances.put("jButtonSoporte", "Aide et support");
        textosFrances.put("jButtonNotificacion", "Notifications");
        textosFrances.put("jButtonIdioma", "Langue");
        textosFrances.put("lblContact","Si vous avez des questions, veuillez contacter le numero +34 618 89 90 46.");

    }

    public void cambiarIdioma(String idioma) {
        if ("English".equals(idioma)) {
            textos = textosIngles;
        } else if ("Espanol".equals(idioma)) {
            textos = textosEspaniol;
        } else if("Francais".equals(idioma)){
            textos = textosFrances;
        }
        notificarCambio();
    }

    public String getTexto(String clave) {
        return textos.getOrDefault(clave, clave);
    }

    public void registrarObservador(Runnable observador) {
        observadores.add(observador);
    }

    private void notificarCambio() {
        for (Runnable observador : observadores) {
            observador.run();
        }
    }

    
}
