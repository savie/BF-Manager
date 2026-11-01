package l;

/* JADX INFO: renamed from: l.ᩴۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D4F3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18474 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f58872;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f58873;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f58874;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f58875;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C18474 f58876;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58877;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C18474 f58878;

    public C18474() {
        this.f58874 = new byte[8192];
        this.f58873 = true;
        this.f58872 = false;
    }

    public C18474(byte[] bArr, int i, int i2) {
        this.f58874 = bArr;
        this.f58875 = i;
        this.f58877 = i2;
        this.f58872 = true;
        this.f58873 = false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18474 m42847() {
        this.f58872 = true;
        return new C18474(this.f58874, this.f58875, this.f58877);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18474 m42844() {
        C18474 c18474 = this.f58876;
        C18474 c18475 = c18474 != this ? c18474 : null;
        C18474 c18476 = this.f58878;
        c18476.f58876 = c18474;
        this.f58876.f58878 = c18476;
        this.f58876 = null;
        this.f58878 = null;
        return c18475;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42845(C18474 c18474) {
        c18474.f58878 = this;
        c18474.f58876 = this.f58876;
        this.f58876.f58878 = c18474;
        this.f58876 = c18474;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42846(C18474 c18474, int i) {
        boolean z = c18474.f58873;
        byte[] bArr = c18474.f58874;
        if (!z) {
            throw new IllegalArgumentException();
        }
        int i2 = c18474.f58877;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (c18474.f58872) {
                throw new IllegalArgumentException();
            }
            int i4 = c18474.f58875;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
            c18474.f58877 -= c18474.f58875;
            c18474.f58875 = 0;
        }
        System.arraycopy(this.f58874, this.f58875, bArr, c18474.f58877, i);
        c18474.f58877 += i;
        this.f58875 += i;
    }
}
