package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.᩶᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8MQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f69041 = new HashSet();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f69042 = "media3.common";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m49138() {
        return f69042;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m49139(String str) {
        if (f69041.add(str)) {
            f69042 += ", " + str;
        }
    }
}
