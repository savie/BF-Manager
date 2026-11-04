package l;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: l.ۙܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class C5043 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f17464;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f17465;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f17466;

    public C5043(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < i || i2 > bArr.length) {
            throw new IndexOutOfBoundsException("Invalid syntax cache reader range");
        }
        this.f17464 = bArr;
        this.f17465 = i;
        this.f17466 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15271() {
        return this.f17465;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m15276() {
        return this.f17466 - this.f17465;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m15273() {
        m15270(1);
        int i = this.f17465;
        this.f17465 = i + 1;
        return this.f17464[i] & 255;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m15275() {
        m15270(4);
        int iM27868 = C11008.m27868(this.f17465, this.f17464);
        this.f17465 += 4;
        return iM27868;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15272(int i) {
        int iM15275 = m15275();
        if (iM15275 < 0 || iM15275 > i) {
            throw new IllegalArgumentException("Invalid syntax cache string length");
        }
        m15270(iM15275);
        String str = new String(this.f17464, this.f17465, iM15275, StandardCharsets.UTF_8);
        this.f17465 += iM15275;
        return str;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m15274() {
        if (this.f17465 != this.f17466) {
            throw new IllegalArgumentException("Trailing syntax cache payload");
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m15270(int i) {
        if (i < 0 || i > this.f17466 - this.f17465) {
            throw new IndexOutOfBoundsException("Truncated syntax cache payload");
        }
    }
}
