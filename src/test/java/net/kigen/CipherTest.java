package net.kigen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CipherTest {
    @Test
    void encrypt_encryptSentenceWithKey_String() {
        Cipher output = new Cipher();
        String expected = "PCOG";
        output.setKey(2);
        output.setMessage("name");
        assertEquals(expected, output.encrypt());
    }

    @Test
    void encrypt_passSpaceCharacterAsIs_String() {
        Cipher output = new Cipher();
        String expected = "P COG";
        output.setKey(2);
        output.setMessage("n ame");
        assertEquals(expected, output.encrypt());
    }
}
