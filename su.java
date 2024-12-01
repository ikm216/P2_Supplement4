import java.security.*;

public class su{
    public static String hexChars(){
        SecureRandom rand = new SecureRandom();
        byte[] bytes = new byte[16];
        rand.nextBytes(bytes);

        StringBuilder hex = new StringBuilder();
        for(byte by: bytes){
            hex.append(String.format("%02x", by));
        }

        return String.format("%s-%s-%s-%s-%s", hex.substring(0, 8), hex.substring(8, 12),
        hex.substring(12, 16),
        hex.substring(16, 20),
        hex.substring(20, 32));
    }
}