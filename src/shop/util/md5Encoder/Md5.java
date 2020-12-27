package shop.util.md5Encoder;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

    public static String MD5(String message) {

        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        byte[] digest = md.digest(message.getBytes(StandardCharsets.UTF_8));
        String md5 = DatatypeConverter.printHexBinary(digest);

        return md5;
    }
}
