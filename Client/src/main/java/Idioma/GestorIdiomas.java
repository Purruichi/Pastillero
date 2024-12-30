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
    private HashMap<String, String> textosEspañol;
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
        textosEspañol = new HashMap<>();
        textosIngles = new HashMap<>();
        textosFrances = new HashMap<>();

        // Textos en español
        //CambiarContrasena
        textosEspañol.put("lblTitleNewPassword", "Nueva Contraseña");
        textosEspañol.put("lblPassword", "Contraseña:");
        textosEspañol.put("lblConfirm", "Confirmar Contraseña:");
        textosEspañol.put("labelLogIn", "Iniciar Sesión");
        textosEspañol.put("lblError", "Ambas contraseñas no coinciden.");
        //LogIn
        textosEspañol.put("lblTitleLogIn", "Iniciar Sesión");
        textosEspañol.put("lblForgotPass", "¿Olvidaste tu contraseña?");
        textosEspañol.put("lblSignUpAccess", "¿No tienes una cuenta? Regístrate aquí");
        textosEspañol.put("lblTitleSignUp", "Registro");
        textosEspañol.put("lblPassword", "Contraseña:");
        textosEspañol.put("lblConfirmPassword", "Confirmar Contraseña:");
        textosEspañol.put("lblErrorLogIn", "El usuario o la contraseña son incorrectos");
        textosEspañol.put("lblErrorSignUp", "Ambas contraseñas no coinciden");
        textosEspañol.put("labelLogIn", "Iniciar Sesión");
        textosEspañol.put("lblSignUp", "Registrarse");
        textosEspañol.put("usernameField", "Nombre de usuario");
        textosEspañol.put("passField", "Contraseña");
        textosEspañol.put("newEmailField", "Correo Electrónico");
        textosEspañol.put("newUsernameField", "Nombre de Usuario");
        textosEspañol.put("newPassField", "Contraseña");
        textosEspañol.put("confirmPassField", "Contraseña");        
        //VerifyEmailWindow
        textosEspañol.put("lblEmail", "Introduce tu correo electrónico:");
        textosEspañol.put("lblSend", "Enviar Código");
        textosEspañol.put("lblCode", "Introduce el código de verificación:");
        textosEspañol.put("lblConfirm", "Confirmar");
        textosEspañol.put("txtFieldEmail", "Correo Electrónico");
        textosEspañol.put("txtFieldCode", "Código de Verificación");        
        //anadir
        textosEspañol.put("lblType", "TIPO");
        textosEspañol.put("txtFieldName", "Nombre");
        textosEspañol.put("txtFieldDose", "Dosis");
        textosEspañol.put("jLabel1", "INFORMACIÓN GENERAL");
        textosEspañol.put("txtFieldFrequency", "Frecuencia");
        textosEspañol.put("txtFieldRemaining", "Cantidad restante");
        textosEspañol.put("lblTimeline", "LÍNEA DE TIEMPO Y HORARIO");
        textosEspañol.put("btnAnadir", "Aceptar");
        textosEspañol.put("btnCancelar", "Cancelar");        
        //quitar
        textosEspañol.put("medicamentos", "ELIMINAR MEDICINAS:");
        textosEspañol.put("textoAceptar", "CONFIRMAR ELIMINACIÓN");        
        //mainWindow
        textosEspañol.put("lblName", "NOMBRE:");
        textosEspañol.put("lblRemainig", "CANTIDAD RESTANTE:");
        textosEspañol.put("lblDose", "DOSIS:");
        textosEspañol.put("lblFrequency", "FRECUENCIA:");
        textosEspañol.put("lblName2", "NOMBRE:");
        textosEspañol.put("lblRemainig2", "CANTIDAD RESTANTE:");
        textosEspañol.put("lblDose2", "DOSIS:");
        textosEspañol.put("lblFrequency2", "FRECUENCIA:");
        textosEspañol.put("datename", "Fecha:");
        textosEspañol.put("date", "Fecha actual");
        textosEspañol.put("lblAjustes", "Ajustes");
        textosEspañol.put("lblAdd", "Añadir");
        textosEspañol.put("lblRemove", "Eliminar");        
        //PanelMedicines
        textosEspañol.put("lblName", "NOMBRE:");
        textosEspañol.put("lblRemainig", "CANTIDAD RESTANTE:");
        textosEspañol.put("lblDose", "DOSIS:");
        textosEspañol.put("lblFrequency", "FRECUENCIA:");        
        //Ajustes
        textosEspañol.put("lblAjustes", "Configuraciones");
        textosEspañol.put("jNotificacionONOFF", "Notificaciones DESACTIVADAS");
        textosEspañol.put("jNumContacto", "Número de contacto");
        textosEspañol.put("jManualUso", "Manual de la App");
        textosEspañol.put("jDeleteCuenta", "Eliminar tu cuenta");
        textosEspañol.put("jButtonSoporte", "Ayuda y soporte");
        textosEspañol.put("jButtonNotificacion", "Notificaciones");
        textosEspañol.put("jButtonIdioma", "Idioma");
        textosEspañol.put("lblContact", "Si tiene alguna duda contacte con el número +34 618 89 90 46");
        
        
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
        textosFrances.put("lblForgotPass", "Mot de passe oublié ?");
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
        textosFrances.put("lblCode", "Entrez le code de vérification :");
        textosFrances.put("lblConfirm", "Confirmer");
        textosFrances.put("txtFieldEmail", "Adresse e-mail");
        textosFrances.put("txtFieldCode", "Code de vérification");
        //anadir
        textosFrances.put("lblType", "TYPE");
        textosFrances.put("txtFieldName", "Nom");
        textosFrances.put("txtFieldDose", "Dose");
        textosFrances.put("jLabel1", "INFORMATIONS GÉNÉRALES");
        textosFrances.put("txtFieldFrequency", "Fréquence");
        textosFrances.put("txtFieldRemaining", "Quantité restante");
        textosFrances.put("lblTimeline", "CHRONOLOGIE ET HORAIRE");
        textosFrances.put("btnAnadir", "Accepter");
        textosFrances.put("btnCancelar", "Annuler");
        //quitar
        textosFrances.put("medicamentos", "SUPPRIMER MÉDICAMENTS :");
        textosFrances.put("textoAceptar", "CONFIRMER LA SUPPRESSION");
        //mainWindow
        textosFrances.put("lblName", "NOM :");
        textosFrances.put("lblRemainig", "QUANTITÉ RESTANTE :");
        textosFrances.put("lblDose", "DOSE :");
        textosFrances.put("lblFrequency", "FRÉQUENCE :");
        textosFrances.put("lblName2", "NOM :");
        textosFrances.put("lblRemainig2", "QUANTITÉ RESTANTE :");
        textosFrances.put("lblDose2", "DOSE :");
        textosFrances.put("lblFrequency2", "FRÉQUENCE :");
        textosFrances.put("datename", "Date :");
        textosFrances.put("date", "Date actuelle");
        textosFrances.put("lblAjustes", "Paramètres");
        textosFrances.put("lblAdd", "Ajouter");
        textosFrances.put("lblRemove", "Supprimer");
        //PanelMedicines
        textosFrances.put("lblName", "NOM :");
        textosFrances.put("lblRemainig", "QUANTITÉ RESTANTE :");
        textosFrances.put("lblDose", "DOSE :");
        textosFrances.put("lblFrequency", "FRÉQUENCE :");
        //Ajustes
        textosFrances.put("lblAjustes", "Configurations");
        textosFrances.put("jNotificacionONOFF", "Notifications DÉSACTIVÉES");
        textosFrances.put("jNumContacto", "Numéro de contact");
        textosFrances.put("jManualUso", "Manuel de l'application");
        textosFrances.put("jDeleteCuenta", "Supprimer votre compte");
        textosFrances.put("jButtonSoporte", "Aide et support");
        textosFrances.put("jButtonNotificacion", "Notifications");
        textosFrances.put("jButtonIdioma", "Langue");
        textosFrances.put("lblContact","Si vous avez des questions, veuillez contacter le numéro +34 618 89 90 46.");

    }

    public void cambiarIdioma(String idioma) {
        if ("English".equals(idioma)) {
            textos = textosIngles;
        } else if ("Español".equals(idioma)) {
            textos = textosEspañol;
        } else if("Français".equals(idioma)){
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
