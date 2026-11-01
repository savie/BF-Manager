package l;

/* JADX INFO: renamed from: l.ۨۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1PJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11454 implements InterfaceC17803 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C11454 f38555 = new C11454();

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3481(int i, byte[] bArr) {
        byte b;
        long j;
        int[][] iArr = C2280.f8140;
        int i2 = 0;
        long j2 = 0;
        long j3 = 1;
        int i3 = 1;
        int i4 = 1;
        while (i2 < i - 1) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                i4++;
                if (-95 <= b2 && b2 <= -7 && ((64 <= (b = bArr[i2 + 1]) && b <= 126) || (-95 <= b && b <= -2))) {
                    i3++;
                    j3 += 500;
                    int i5 = b2 + 95;
                    int i6 = iArr[i5][(64 > b || b > 126) ? b + 159 : b - 64];
                    if (i6 != 0) {
                        j = i6;
                    } else if (3 <= i5 && i5 <= 37) {
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

    @Override // l.InterfaceC17803
    /* JADX INFO: renamed from: ۙ */
    public final int mo3480() {
        return C22037.f71421;
    }
}
