package com.drypot.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Base64.Encoder;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        for (String arg : args) {
            System.out.println(makeHash(arg));
        }
    }

    public static String makeHash(String arg) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest dig = MessageDigest.getInstance("SHA-256");
        byte[] digest = dig.digest(arg.getBytes("UTF-16LE"));

        Encoder encoder = Base64.getEncoder();
        byte[] encodedBytes = encoder.encode(digest);

        return new String (encodedBytes);
    }
}
