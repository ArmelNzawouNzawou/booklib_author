package com.caniksea.adp3.practical.booklib.authormodule.util;

public class StringHelper {


    public static boolean isNullorEmpty(String str) {
        if (str == null) return true;
        if (str.isEmpty()) return true;
        if (str.equalsIgnoreCase("null")) return true;
        return false;
    }
}
