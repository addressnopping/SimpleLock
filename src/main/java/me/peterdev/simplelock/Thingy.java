package me.peterdev.simplelock;

import me.peterdev.simplelock.work.*;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.*;

/**
 * @author PeterDev
 * @since 10/19/2021 at 4:24 p.m
 */

public class Thingy {
    public Thingy() {
        Checker.doCheck();
        if (!Checker.doCheck()) {
            showMessage();
            throw new Crasher("");
        }
    }
    public static void showMessage() {
        copyToClipboard();
        JOptionPane.showMessageDialog((Component)null, "HWID: " + Generator.getHWID(), "Copied to clipboard!", 0);
    }
    public static void copyToClipboard() {
        StringSelection selection = new StringSelection(Generator.getHWID());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, selection);
    }
}
