package l;

import java.util.HashSet;

/* JADX INFO: renamed from: l.ۨ۠ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8MQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C11572 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashSet f38916 = new HashSet();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String f38917 = "media3.common";

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized String m28867() {
        return f38917;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized void m28868(String str) {
        if (f38916.add(str)) {
            f38917 += ", " + str;
        }
    }
}
