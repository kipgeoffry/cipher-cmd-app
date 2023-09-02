package net.kigen;

public class Cipher {

    private String message = "";
    private int key = 0;
    private int process = 1;

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }

    public String encrypt(String message, int key){

        return "";
    };

    public String decrypt(String message, int key){

        return "";
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
