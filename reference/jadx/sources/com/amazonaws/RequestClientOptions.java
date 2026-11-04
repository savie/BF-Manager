package com.amazonaws;

import java.util.EnumMap;
import l.C20196;

/* JADX INFO: loaded from: classes.dex */
public final class RequestClientOptions {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumMap f103 = new EnumMap(Marker.class);

    public enum Marker {
        USER_AGENT
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m190(Marker marker) {
        return (String) this.f103.get(marker);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m191(String str) {
        Marker marker = Marker.USER_AGENT;
        EnumMap enumMap = this.f103;
        String strM46451 = (String) enumMap.get(marker);
        if (strM46451 == null) {
            strM46451 = "";
        }
        if (!strM46451.contains(str)) {
            strM46451 = C20196.m46451(strM46451, " ", str);
        }
        enumMap.put(marker, strM46451);
    }
}
