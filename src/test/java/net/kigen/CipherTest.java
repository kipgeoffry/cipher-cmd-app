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

    @Test
    void encrypt_encryptWhenCharPosIsGreaterThan25_String() {
        Cipher output = new Cipher();
        String expected = "BC";
        output.setKey(7);
        output.setMessage("uv");
        assertEquals(expected, output.encrypt());
    }

    @Test
    void decrypt_getDecryptedMessage_String() {
        Cipher output = new Cipher();
        output.setMessage("RT");
        assertEquals("RT",output.getMessage());
    }

    @Test
    void decrypt_getDecryptKey_Integer() {
        Cipher output = new Cipher();
        output.setKey(4);
        assertEquals(4,output.getKey());

    }

    @Test
    void decrypt_decryptSentenceWithKey_String() {
        Cipher output = new Cipher();
        String expected = "BC";
        output.setKey(2);
        output.setMessage("DE");
        assertEquals(expected, output.decrypt());
    }
    @Test
    void decrypt_passSpaceCharacterAsIs_String() {
        Cipher output = new Cipher();
        String expected = "B C";
        output.setKey(2);
        output.setMessage("D E");
        assertEquals(expected, output.decrypt());
    }

    @Test
    void decrypt_decryptWhenCharPositionIsNegative_String() {
        Cipher output = new Cipher();
        String expected = "YZ";
        output.setKey(7);
        output.setMessage("FG");
        assertEquals(expected,output.decrypt());
    }
}
