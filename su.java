import java.security.*;

public class su{
    public static String hexChars(){
        /**
     * Generates a random 32-character hexadecimal:
     *
     * @return A formatted string of random hexadecimal characters.
     */
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

    public static String hashString(String string){
        /**
     * Hashes a string.
     *
     * @param string The string to hash.
     * @return The hashed string in hexadecimal format.
     * @throws RuntimeException.
     */
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = messageDigest.digest(string.getBytes());

        StringBuilder hex = new StringBuilder();
        for(byte by: bytes){
            hex.append(String.format("%02x", by));
        }
        return hex.toString();
        }
        catch (NoSuchAlgorithmException e){
            throw new RuntimeException();
        }
    }
}