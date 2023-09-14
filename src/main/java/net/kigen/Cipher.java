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
        StringBuilder output = new StringBuilder();
        for (char ch : message.toCharArray()) {
            int chPos = this.alphabets.indexOf(ch);
            char newCh;
            if (chPos == -1) {
                newCh = ch;
            } else{
                int newChPos = chPos + this.getKey();
                newCh = this.alphabets.charAt(newChPos);
            }
            output.append(newCh);

        }
        return output.toString();
    }

    //Decryption Logic goes here
    public String decrypt(){
        char y = this.alphabets.charAt(this.getKey());

        return "DECRYPTED";
    }



}
