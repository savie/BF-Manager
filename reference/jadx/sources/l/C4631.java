package l;

/* JADX INFO: renamed from: l.ۙۨ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EI */
/* JADX INFO: loaded from: classes2.dex */
public final class C4631 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f16361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f16362 = new int[10];

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12784(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f16362;
            if (i >= iArr.length) {
                return;
            }
            this.f16361 = (1 << i) | this.f16361;
            iArr[i] = i2;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m12787(int i) {
        return ((1 << i) & this.f16361) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12783(int i) {
        return this.f16362[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m12781() {
        return Integer.bitCount(this.f16361);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m12782() {
        if ((this.f16361 & 2) != 0) {
            return this.f16362[1];
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m12786() {
        if ((this.f16361 & 16) != 0) {
            return this.f16362[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12789(int i) {
        return (this.f16361 & 32) != 0 ? this.f16362[5] : i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m12788() {
        if ((this.f16361 & 128) != 0) {
            return this.f16362[7];
        }
        return 65535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12785(C4631 c4631) {
        for (int i = 0; i < 10; i++) {
            if (c4631.m12787(i)) {
                m12784(i, c4631.f16362[i]);
            }
        }
    }
}
