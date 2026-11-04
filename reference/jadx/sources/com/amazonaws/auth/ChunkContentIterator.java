package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class ChunkContentIterator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f137;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f138;

    public ChunkContentIterator(byte[] bArr) {
        this.f138 = bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m211() {
        return this.f137 < this.f138.length;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m210(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (!m211()) {
            return -1;
        }
        byte[] bArr2 = this.f138;
        int iMin = Math.min(bArr2.length - this.f137, i2);
        System.arraycopy(bArr2, this.f137, bArr, i, iMin);
        this.f137 += iMin;
        return iMin;
    }
}
