package l;

/* JADX INFO: renamed from: l.ܺۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: O3Z6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16744 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC1829 m39520(char[] cArr, int i, boolean z) {
        int i2;
        C11523 c24950 = z ? new C24950(i) : new C11523();
        int[] iArr = new int[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = i4 + 1;
            iArr[i4] = i3;
            do {
                char c = cArr[i3];
                if (c == '\r' || c == '\n') {
                    if (c != '\r' || (i2 = i3 + 1) >= i || cArr[i2] != '\n') {
                        i3++;
                        break;
                    }
                    i3 += 2;
                    break;
                }
                if (c == '\t') {
                    c24950.mo29015(i3);
                }
                i3++;
            } while (i3 < i);
            i4 = i5;
        }
        int[] iArr2 = new int[i4];
        c24950.f36268 = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, i4);
        return c24950;
    }
}
