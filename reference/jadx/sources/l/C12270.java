package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.۫۟᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E4JE */
/* JADX INFO: loaded from: classes3.dex */
public final class C12270 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30493(C12283 c12283, String str, String str2, String str3) throws IOException {
        if (str != null) {
            c12283.write(34);
            C9461.m24219(c12283, str);
            c12283.write(34);
        } else {
            c12283.getClass();
            c12283.write("null", 0, 4);
        }
        c12283.write(58);
        if (str2 != null) {
            c12283.write(str2, 0, str2.length());
        } else {
            c12283.write("V", 0, 1);
        }
        if (str3 != null) {
            c12283.write(", ", 0, 2);
            c12283.write(34);
            C9461.m24219(c12283, str3);
            c12283.write(34);
        }
    }
}
