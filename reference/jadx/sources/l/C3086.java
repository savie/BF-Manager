package l;

/* JADX INFO: renamed from: l.ۗ֫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3086 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f10011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int[] f10012 = new int[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10056(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f10012;
            if (i >= iArr.length) {
                return;
            }
            this.f10011 = (1 << i) | this.f10011;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m10059(int i) {
        return ((1 << i) & this.f10011) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10055(int i) {
        return this.f10012[i];
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m10062() {
        return Integer.bitCount(this.f10011);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10054() {
        if ((this.f10011 & 2) != 0) {
            return this.f10012[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m10058() {
        if ((this.f10011 & 16) != 0) {
            return this.f10012[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m10061(int i) {
        return (this.f10011 & 32) != 0 ? this.f10012[5] : i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m10060() {
        if ((this.f10011 & 128) != 0) {
            return this.f10012[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10057(C3086 c3086) {
        for (int i = 0; i < 10; i++) {
            if (c3086.m10059(i)) {
                m10056(i, c3086.f10012[i]);
            }
        }
    }
}
