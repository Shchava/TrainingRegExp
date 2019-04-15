package ua.trainig.view;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {

    static final String MESSAGES_BUNDLE_NAME = "messages";
    public final ResourceBundle messagesBundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));

    public View(){
    }

    public void print(String message){
        System.out.println(message);
    }

    public void printInputInvitation(String value){
        print(String.format(messagesBundle.getString("input.invitation"),value));
    };

    public void printWrongInput(String value, String format){
        print(String.format(messagesBundle.getString("input.wrong"),value,format));
    }

    public void printLoginExists(String login){
        print(String.format(messagesBundle.getString("input.login.exists"),login));
    }
}
