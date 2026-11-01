package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ܽ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: C5R9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16896 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m39570(C12283 c12283, long j) throws IOException {
        if (j < 0) {
            c12283.getClass();
            c12283.write("-0x", 0, 3);
            c12283.mo6726(-j);
            if (j < -2147483648L) {
                c12283.write(76);
                return;
            }
            return;
        }
        c12283.getClass();
        c12283.write("0x", 0, 2);
        c12283.mo6726(j);
        if (j > 2147483647L) {
            c12283.write(76);
        }
    }
}
