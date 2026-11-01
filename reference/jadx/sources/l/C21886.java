package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.᩸᩺ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class C21886 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f71001;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f71002;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f71003;

    public C21886(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < i || i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid syntax cache reader range");
        }
        this.f71001 = bArr;
        this.f71002 = i;
        this.f71003 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48678() {
        return this.f71002;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m48677() {
        return this.f71003 - this.f71002;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48681() {
        m48676(1);
        int i = this.f71002;
        this.f71002 = i + 1;
        return this.f71001[i] & 255;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m48682() {
        m48676(4);
        int iM43829 = C19064.m43829(this.f71002, this.f71001);
        this.f71002 += 4;
        return iM43829;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m48679(int i) {
        int iM48682 = m48682();
        if (iM48682 < 0 || iM48682 > i) {
            throw new IllegalArgumentException("Invalid syntax cache string length");
        }
        m48676(iM48682);
        String str = new String(this.f71001, this.f71002, iM48682, StandardCharsets.UTF_8);
        this.f71002 += iM48682;
        return str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m48680() {
        if (this.f71002 != this.f71003) {
            throw new IllegalArgumentException("Trailing syntax cache payload");
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m48676(int i) {
        if (i < 0 || i > this.f71003 - this.f71002) {
            throw new IndexOutOfBoundsException("Truncated syntax cache payload");
        }
    }
}
