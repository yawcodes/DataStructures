package playground;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class TestSecureRandom {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        System.out.println(secureRandom.toString());
    }
}
