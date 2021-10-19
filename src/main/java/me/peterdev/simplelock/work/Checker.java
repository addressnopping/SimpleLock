package me.peterdev.simplelock.work;

import jdk.nashorn.internal.ir.debug.ClassHistogramElement;

import java.net.URL;
import java.util.Base64;
import java.util.Scanner;

/**
 * @author PeterDev
 * @since 10/19/2021 at 4:25 p.m
 */

public class Checker {
    public static String link = "The link of the HWID list(base64)";

    public static boolean doCheck() {
        try {
            String temp = new Scanner(new URL(new String(Base64.getDecoder().decode(link.getBytes()))).openStream(), "UTF-8").useDelimiter("\\A").next();
            return temp.contains(Generator.getHWID());
        }
        catch (Exception e) {
            return false;
        }
    }
}
