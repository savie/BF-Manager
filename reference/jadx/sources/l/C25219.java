package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.᩻ᩳۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: E4JE */
/* JADX INFO: loaded from: classes.dex */
public final class C25219 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m56227(C2161 c2161, String str, String str2, String str3) throws IOException {
        if (str != null) {
            c2161.write(34);
            C3652.m11836(c2161, str);
            c2161.write(34);
        } else {
            c2161.getClass();
            c2161.write("null", 0, 4);
        }
        c2161.write(58);
        if (str2 != null) {
            c2161.write(str2, 0, str2.length());
        } else {
            c2161.write("V", 0, 1);
        }
        if (str3 != null) {
            c2161.write(", ", 0, 2);
            c2161.write(34);
            C3652.m11836(c2161, str3);
            c2161.write(34);
        }
    }
}
