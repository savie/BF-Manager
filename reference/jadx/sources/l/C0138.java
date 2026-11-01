package l;

/* JADX INFO: renamed from: l.֡ۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0138 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f1160;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f1161 = new byte[1048576];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f1162;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C10723 f1163;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5614 f1164;

    public C0138(C10723 c10723, InterfaceC5614 interfaceC5614) {
        this.f1163 = c10723;
        this.f1164 = interfaceC5614;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1216(int i) {
        int i2 = this.f1160;
        int i3 = i2 + 1;
        this.f1160 = i3;
        byte[] bArr = this.f1161;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length) {
            m1214();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1217(int i, byte[] bArr) throws C1105 {
        int i2 = 0;
        while (i > 0) {
            byte[] bArr2 = this.f1161;
            int iMin = Math.min(i, bArr2.length - this.f1160);
            System.arraycopy(bArr, i2, bArr2, this.f1160, iMin);
            int i3 = this.f1160 + iMin;
            this.f1160 = i3;
            i2 += iMin;
            i -= iMin;
            if (i3 == bArr2.length) {
                m1214();
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m1215() throws C1105 {
        m1214();
        C23423.m51589(this.f1164);
        return this.f1162;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m1214() throws C1105 {
        if (this.f1160 == 0) {
            return;
        }
        C23423.m51589(this.f1164);
        int i = this.f1162;
        int i2 = this.f1160;
        if (i > Integer.MAX_VALUE - i2) {
            throw new C3015();
        }
        this.f1163.m26949(i2, this.f1161);
        this.f1162 += this.f1160;
        this.f1160 = 0;
    }
}
