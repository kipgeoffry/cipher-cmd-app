package net.kigen;

import java.util.Scanner;

public class FrontEnd {
    Cipher cipher = new Cipher();

    //class constructor
    public FrontEnd(){
    }
    public void Operation() {


        while (true){
            System.out.print("Select an Operation to Perform: e to Encrypt or d to Decrypt:");
                Scanner myScanner = new Scanner(System.in);
                String ops = myScanner.nextLine().toLowerCase();
                if( ops.startsWith("e")) {
                    String operation = "Encrypt";
                    userIO(operation,cipher.encrypt());
                } else if (ops.startsWith("d")) {
                    String operation = "Decrypt";
                    userIO(operation,cipher.decrypt());
                } else {
                    System.out.printf("%nInvalid Operation %n");
                }
            System.out.print("Do you want to Continue? Y or N :");
            String option = myScanner.next().toUpperCase();
            if(option.startsWith("N")){
                System.out.print("Thank you for using Caesar Cipher App.");
                break;
            }

        }

    }
    private void userIO(String operation, String output){
        System.out.printf( "Enter the Message to %s:%n",operation);
        Scanner myScanner = new Scanner(System.in);
        String message = myScanner.nextLine();
        cipher.setMessage(message);
        System.out.printf("Enter %sion key:", operation);
        int key = myScanner.nextInt();
        if (key < 1 || key > 25 ){   //TODO handle when input is integer and out of range.
            System.out.println("Invalid key,Key should be a number from 1 to 25");
            return;
        } else{
            cipher.setKey(key);
        }
        System.out.printf("Your %sed message is :%n%s %n%n", operation ,output);
    }
}
