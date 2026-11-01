package l;

/* JADX INFO: renamed from: l.۫۬ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 91HA */
/* JADX INFO: loaded from: classes3.dex */
public final class C12429 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f41465;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C19805 f41466 = new C19805();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final short m30889(int i) {
        byte[] bArr = this.f41465;
        return (short) ((bArr[i] & 255) | ((bArr[i + 1] & 255) << 8));
    }

    public C12429(byte[] bArr) {
        this.f41465 = bArr;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte m30897(int i) {
        return this.f41465[i];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m30896(int i) {
        return C15157.m36336(i, this.f41465);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m30895(int i) {
        return this.f41465[i] & 255;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m30898(int i) {
        return C15157.m36347(i, this.f41465);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] m30894(int i, int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = C15157.m36336(i, this.f41465);
            i += 4;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30891(int i, byte[] bArr) {
        System.arraycopy(this.f41465, i, bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m30890(int i) {
        if (i < 0) {
            return -1;
        }
        byte[] bArr = this.f41465;
        if (bArr.length < i) {
            return -1;
        }
        return bArr.length - i;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23718 m30888(int i) {
        C23718 c23718 = (C23718) this.f41466.m45009();
        if (c23718 != null) {
            c23718.m52232(i);
            return c23718;
        }
        return new C23718(this, i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30892(C23718 c23718) {
        this.f41466.m45011(c23718);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m30893() {
        return this.f41465;
    }
}
