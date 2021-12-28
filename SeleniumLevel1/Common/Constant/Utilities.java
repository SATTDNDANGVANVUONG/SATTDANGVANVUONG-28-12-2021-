package Constant;

import java.util.Random;

public class Utilities {
    public static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    public static String generateRandomPassword(int len) {
        String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                + "lmnopqrstuvwxyzghfghg6";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public static String generateRandomPasspost(int len) {
        String chars = "012345678912334453534343434343453145352353"
                + "234234324234343444334332444";
        Random rnd = new Random();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(chars.charAt(rnd.nextInt(chars.length())));
        return sb.toString();
    }

    public static String generateRandomEmail() {
        String randomEmail = generateRandomPassword(7) + "@gmail.com";
        return randomEmail;
    }

}
