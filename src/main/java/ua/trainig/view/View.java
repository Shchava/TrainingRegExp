package ua.trainig.view;


import ua.trainig.model.Model;

public class View {

    public View(){

    }

    public void print(String message){
        System.out.println(message);
    }

    public void printInputInvitation(String value){
        print(String.format(TextConstants.INPUTINVITATION,value));
    };

    public void printWrongInput(String value, String format){
        print(String.format(TextConstants.WRONGINPUT,value,format));
    }
}
