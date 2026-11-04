package l;

import java.util.Arrays;

/* JADX INFO: renamed from: l.ܺ֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: W8PF */
/* JADX INFO: loaded from: classes4.dex */
public final class C16518 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15772 m39146(C21287 c21287) {
        c21287.m48503(1);
        int iM48501 = c21287.m48501();
        long jM48516 = ((long) c21287.m48516()) + ((long) iM48501);
        int i = iM48501 / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            long jM48518 = c21287.m48518();
            if (jM48518 == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jM48518;
            jArrCopyOf2[i2] = c21287.m48518();
            c21287.m48503(2);
        }
        c21287.m48503((int) (jM48516 - ((long) c21287.m48516())));
        return new C15772(jArrCopyOf, jArrCopyOf2);
    }
}
