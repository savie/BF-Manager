package l;

/* JADX INFO: renamed from: l.ۜۚۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y1R8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6923 implements InterfaceC19492 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C6923 f22923 = new C6923();

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5605(int i, byte[] bArr) {
        byte b;
        long j;
        int[][] iArr = C0957.f3503;
        int i2 = 0;
        long j2 = 0;
        long j3 = 1;
        int i3 = 1;
        int i4 = 1;
        while (i2 < i - 1) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                i4++;
                if (-95 <= b2 && b2 <= -9 && -95 <= (b = bArr[i2 + 1]) && b <= -2) {
                    i3++;
                    j3 += 500;
                    int i5 = b2 + 95;
                    int i6 = iArr[i5][b + 95];
                    if (i6 != 0) {
                        j = i6;
                    } else if (15 <= i5 && i5 < 55) {
                        j = 200;
                    }
                    j2 += j;
                }
                i2++;
            }
            i2++;
        }
        return (int) (((j2 / j3) * 50.0f) + ((i3 / i4) * 50.0f));
    }

    @Override // l.InterfaceC19492
    /* JADX INFO: renamed from: ۙ */
    public final int mo5604() {
        return C2448.f7860;
    }
}
