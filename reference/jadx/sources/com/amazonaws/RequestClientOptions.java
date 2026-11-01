package com.amazonaws;

import java.util.EnumMap;
import l.C1679;

/* JADX INFO: loaded from: classes.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumMap f113 = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m196(Marker marker) {
        return (String) this.f113.get(marker);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m197(String str) {
        Marker marker = Marker.USER_AGENT;
        EnumMap enumMap = this.f113;
        String strM5594 = (String) enumMap.get(marker);
        if (strM5594 == null) {
            strM5594 = "";
        }
        if (!strM5594.contains(str)) {
            strM5594 = C1679.m5594(strM5594, " ", str);
        }
        enumMap.put(marker, strM5594);
    }
}
