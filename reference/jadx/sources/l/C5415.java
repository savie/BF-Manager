package l;

/* JADX INFO: renamed from: l.ۚۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y23S */
/* JADX INFO: loaded from: classes2.dex */
public final class C5415 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16139(C19585 c19585) {
        return m16140(c19585, true) + m16140(c19585, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m16140(C19585 c19585, boolean z) {
        int iM45185 = z ? c19585.m45185() : c19585.m45187();
        int iM45187 = z ? c19585.m45187() : c19585.m45185();
        byte[][] bArrM45186 = c19585.m45186();
        int i = 0;
        for (int i2 = 0; i2 < iM45185; i2++) {
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < iM45187; i4++) {
                byte b2 = z ? bArrM45186[i2][i4] : bArrM45186[i4][i2];
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
