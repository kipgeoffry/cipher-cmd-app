package net.kigen;

public class Cipher {
    private String message = "";
    private int key = 0;
    private final String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    // Cipher Constructor
    public Cipher() {
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
    public String encrypt() {
        message = this.getMessage().toUpperCase();
        StringBuilder output = new StringBuilder();
        for (char ch : message.toCharArray()) {
            char newCh = ch;
            int chPos = this.alphabets.indexOf(ch);
            if (chPos != -1) {
                int newChPos = chPos + this.getKey();
                if (newChPos > 25) {
                    newChPos = newChPos - 26;
                }
                newCh = this.alphabets.charAt(newChPos);
            }
            output.append(newCh);
        }
        return output.toString();
    }

    //Decryption Logic goes here
    public String decrypt() {
        message = this.getMessage().toUpperCase();
        StringBuilder decryptedMessage = new StringBuilder();

        for (char decryptedXter : message.toCharArray()) {
            char newXter = decryptedXter;
            int characterPos = this.alphabets.indexOf(decryptedXter);
            if (characterPos != -1) {
                int newXterPos = characterPos - this.getKey();
                if (newXterPos < 0) {
                    newXterPos = 26 + newXterPos;
                }
                newXter = this.alphabets.charAt(newXterPos);
            }
            decryptedMessage.append(newXter);

        }
        return decryptedMessage.toString();
    }
}
