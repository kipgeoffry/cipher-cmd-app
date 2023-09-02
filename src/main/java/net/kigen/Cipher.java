package net.kigen;

public class Cipher {
    private String message = "";
    private int key = 0;

    // Cipher Constructor
    public Cipher(){
    }


    //Encryption Logic here
    public String encrypt(){

        return "ENCRYPTED";
    };

    //Decryption Logic goes here
    public String decrypt(){

        return "DECRYPTED";
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

}
