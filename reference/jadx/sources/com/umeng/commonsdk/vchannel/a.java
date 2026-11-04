package com.umeng.commonsdk.vchannel;

import l.C10732;
import l.C24770;

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
        String strM55292 = C24770.m55292(System.currentTimeMillis(), "SUB");
        StringBuilder sbM27333 = C10732.m27333(strM55292);
        sbM27333.append(String.format("%0" + (32 - strM55292.length()) + "d", 0));
        j = sbM27333.toString();
    }
}
