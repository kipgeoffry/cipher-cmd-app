package net.kigen;

import java.util.Scanner;

public class FrontEnd {
    public void Operation() {
        Cipher cipher = new Cipher();
        System.out.print("Select an Operation to Perform: e to Encrypt or d to Decrypt:: ");
        Scanner myScanner = new Scanner(System.in);
        String ops = myScanner.nextLine().toLowerCase();

        if( ops.startsWith("e")) {
            String operation = "Encryption";
            cipher.setProcess(1);
        } else if (ops.startsWith("d")) {
            String operation = "Decryption";
            cipher.setProcess(2);
        } else {
            System.out.println("Invalid Operation");
        }

        System.out.print("Enter your Message to ${operation} ::");
                String message = myScanner.nextLine();
                cipher.setMessage(message);
        System.out.print("Enter ${operation} key::");
                int key = myScanner.nextInt();
                if (key < 0 || key > 25){
                    System.out.println("Invalid key,Key should be a number from 1 to 25");
                } else{
                    cipher.setKey(key);
                }
    }
}
