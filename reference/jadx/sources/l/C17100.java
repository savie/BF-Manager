package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܿۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C17100 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10751 m39921(C2460 c2460) {
        c2460.m7535(1);
        int iM7525 = c2460.m7525();
        long jM7500 = ((long) c2460.m7500()) + ((long) iM7525);
        int i = iM7525 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM7529 = c2460.m7529();
            if (jM7529 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM7529;
            jArrCopyOf2[i2] = c2460.m7529();
            c2460.m7535(2);
        }
        c2460.m7535((int) (jM7500 - ((long) c2460.m7500())));
        return new C10751(jArrCopyOf, jArrCopyOf2);
    }
}
