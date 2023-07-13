package com.cliordering;
import java.util.Scanner;
public class Main {

    public static boolean run = false; //remember, since we are accessing htis in a static method below,
                                        //this must also be static.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        run = true;
        System.out.println("WELCOME to the FOOD ORDERING APPARATUS! \nThis program allows you to order various foods directly from your terminal. \nTo start, enter your EMAIL ADDRESS so that we may identify you on the system and begin preparing your order.");
        System.out.println("Hit x to exit the program at any time.");
        while (run == true){
            //TODO: CREATE OTHER MOCK VIEWS NOT JUST CUSTOMER AS IT IS HERE.

            String nxtcom = reader.nextLine();

            switch (nxtcom){
                //TODO: ADD DIFFERENT OPTIONS FOR CUSTOMERS, DRIVERS, DISPATCHERS OR ADMIN!
                case "x":
                    System.out.println("Thank you for using the food ordering apparatus program application. Have a pleasant day!");
                    run = false;
                    break;

                default:
                    System.out.println("You entered: \n" + nxtcom); //TODO: ADD ERROR CHECKING!
                    //TODO: CALL DATABASE, CHECK IF EMAIL ADDRESS EXISTS,
                    //TRUE ? PROMPT USER CONFIRM TO USE LAST ADDRESS : THIS WILL BE A NEW USER, ADD NEW RECORD TO DB
                    //IFF USER IN PREV. CHOOSES TO UPDATE ADDRESS, RUN UPDATE QUERY AGAINST DB!
                    //TODO: SIMILAR LOGIC TO PAYMENT, SLIGHTLY MORE COMPLEX BECAUSE PAYMENT INFO IS A SECRET :^)
                    System.out.println("Please enter a FOOD you would like to EAT.");

                    String food = reader.nextLine();
                    System.out.println("You have requested a " + food + ". Now please enter your ADDRESS.");

                    String address = reader.nextLine();
                    System.out.println("You have entered the following address: \n" + address);
                    //TODO add prompting re incorrect address, modify address capability!
                    System.out.println("Please enter your PAYMENT INFORMATION. \nWe currently accept bank transfers, credit cards / checks, and IOUs.");

                    String payment = reader.nextLine();
                    System.out.println("Your payment information is:\n" + payment);
                    System.out.println("Your order is being processed and will arrive shortly.\nNext we will call the ordering method implementation so sit tight and let us take care of you! :-)");

                    run = false; //TODO SHOULD NOT EXIT IMMEDIATELY AFTER, instead display something like a fun fact maybe.

            }


        }


    }
}