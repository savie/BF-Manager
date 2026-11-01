package l;

/* JADX INFO: renamed from: l.۫۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Y23S */
/* JADX INFO: loaded from: classes3.dex */
public final class C12271 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30494(C20032 c20032) {
        return m30495(c20032, true) + m30495(c20032, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30495(C20032 c20032, boolean z) {
        int iM45362 = z ? c20032.m45362() : c20032.m45357();
        int iM45357 = z ? c20032.m45357() : c20032.m45362();
        byte[][] bArrM45363 = c20032.m45363();
        int i = 0;
        for (int i2 = 0; i2 < iM45362; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM45357; i4++) {
                byte b2 = z ? bArrM45363[i2][i4] : bArrM45363[i4][i2];
                if (b2 == b) {
                    i3++;
                } else {
                    if (i3 >= 5) {
                        i += i3 - 2;
                    }
                    b = b2;
                    i3 = 1;
                }
            }
            if (i3 >= 5) {
                i = (i3 - 2) + i;
            }
        }
        return i;
    }
}
