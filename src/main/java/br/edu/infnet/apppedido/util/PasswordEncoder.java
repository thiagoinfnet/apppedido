package br.edu.infnet.apppedido.util;

import java.security.MessageDigest;

public class PasswordEncoder {

    public static String encodePasswordSHA256(String originalPassword) {
        try {
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = algorithm.digest(originalPassword.getBytes("UTF-8"));

            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            return hexString.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static boolean isPasswordCorrect(String userProvidedPassword, String storedPassword) {
        String hashedUserPassword = encodePasswordSHA256(userProvidedPassword);
        return hashedUserPassword.equals(storedPassword);
    }
}
