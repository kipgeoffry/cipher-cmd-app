package net.kigen;

public class Cipher {
    private String message = "";
    private int key = 0;
    private final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Cipher Constructor
    public Cipher(){
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    //Encryption Logic here
    public String encrypt(){
        message = this.getMessage().toUpperCase();
        String output = "";
        char[] ary = message.toCharArray();
        for (char ch : ary) {
            int chPos = this.alphabets.indexOf(ch);
            int newChPos = chPos + this.getKey();
            char newCh = this.alphabets.charAt(newChPos);
            output = output + newCh;

        }
        return output;

    }

    //Decryption Logic goes here
    public String decrypt(){
        char y = this.alphabets.charAt(this.getKey());

        return "DECRYPTED";
    }



}
