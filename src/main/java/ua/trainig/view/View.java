package ua.trainig.view;


import ua.trainig.model.Model;

public class View {
    public static final String INPUT_NEXT_NUMBER = "Input number";
    public static final String WRONG_INPUT_DATA = "Wrong input, reenter ";
    public static final String RANGE_MESSAGE = "Range where number is : [%d - %d] \n";
    public static final String NumberIsLesser = "Number %d is lesser than needed";
    public static final String NumberIsBigger = "Number %d is bigger than needed";
    public static final String NumberIsGuessed = "Congratulations, number %d guessed";
    public static final String StatisticAnnouncement = "Actions : ";
    public static final String AttemptsAnnouncement = "Attempts : ";


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
