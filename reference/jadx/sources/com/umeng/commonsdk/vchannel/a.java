package com.umeng.commonsdk.vchannel;

import l.C15489;
import l.C9023;

/* JADX INFO: compiled from: Y5AS */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static String a = "https://pslog.umeng.com";
    public static String b = "https://pslog.umeng.com/";
    public static String c = "explog";
    public static final String d = "analytics";
    public static final String e = "ekv";
    public static final String f = "id";
    public static final String g = "ts";
    public static final String h = "ds";
    public static final String i = "pn";
    public static String j = "";

    static {
        String strM37074 = C15489.m37074(System.currentTimeMillis(), "SUB");
        StringBuilder sbM23356 = C9023.m23356(strM37074);
        sbM23356.append(String.format("%0" + (32 - strM37074.length()) + "d", 0));
        j = sbM23356.toString();
    }
}
