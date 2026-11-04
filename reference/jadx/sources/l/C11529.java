package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۧۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5R9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11529 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29030(C2161 c2161, long j) throws IOException {
        if (j < 0) {
            c2161.getClass();
            c2161.write("-0x", 0, 3);
            c2161.mo7441(-j);
            if (j < -2147483648L) {
                c2161.write(76);
                return;
            }
            return;
        }
        c2161.getClass();
        c2161.write("0x", 0, 2);
        c2161.mo7441(j);
        if (j > 2147483647L) {
            c2161.write(76);
        }
    }
}
