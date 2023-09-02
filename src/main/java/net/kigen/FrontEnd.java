package net.kigen;

import java.util.Scanner;

public class FrontEnd {
    Cipher cipher = new Cipher();
    Scanner myScanner = new Scanner(System.in);
    public void Operation() {
        System.out.print("Select an Operation to Perform: e to Encrypt or d to Decrypt:: ");
        String ops = myScanner.nextLine().toLowerCase();

        if( ops.startsWith("e")) {
            String operation = "Encryption";
            userIO(operation,cipher.encrypt());
        } else if (ops.startsWith("d")) {
            String operation = "Decryption";
            userIO(operation,cipher.decrypt());
        } else {
            System.out.println("Invalid Operation");
        }
    }
    private void userIO(String operation, String output){
        System.out.print( "Enter your Message to ${operation} ::");
        String message = myScanner.nextLine();
        cipher.setMessage(message);
        System.out.print("Enter ${operation} key::");
        int key = myScanner.nextInt();
        if (key < 1 || key > 25){
            System.out.println("Invalid key,Key should be a number from 1 to 25");
        } else{
            cipher.setKey(key);
        }
        System.out.println("Your ${operation} message is ::" + output);
    }
}
