package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.֡ۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes3.dex */
public final class C0343 extends AbstractC24188 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public byte[] f1835;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f1836;

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo2082(int i) {
        return (i % 2) + ((this.f1835.length + 1) / 2) + 4;
    }

    public C0343(int i, byte[] bArr) {
        super(EnumC7779.f25668);
        if (bArr.length % i != 0) {
            throw new RuntimeException(C14442.m34864(i, "There are not a whole number of ", " byte elements"));
        }
        this.f1836 = i;
        this.f1835 = bArr;
    }

    public C0343(byte[] bArr, int i) {
        super(EnumC7779.f25668);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for an ArrayData pseudo-instruction");
        }
        if (bArr[i + 1] != 3) {
            throw new RuntimeException("Invalid sub-opcode byte for an ArrayData pseudo-instruction");
        }
        int iM31238 = C12556.m31238(i + 2, bArr);
        this.f1836 = iM31238;
        int iM31233 = C12556.m31233(i + 4, bArr) * iM31238;
        byte[] bArr2 = new byte[iM31233];
        this.f1835 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, iM31233);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo2086(C24166 c24166, int i) {
        c24166.m54131(4);
        byte[] bArr = this.f1835;
        int length = bArr.length;
        int i2 = this.f1836;
        c24166.m54138(0);
        c24166.m54138(3);
        c24166.m54139(i2);
        c24166.m54134(length / i2);
        c24166.m54133(bArr, 0, bArr.length);
        c24166.m54131(2);
    }

    @Override // l.AbstractC24188
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final EnumC7801 mo2083() {
        return EnumC7801.ArrayData;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int m2084() {
        return this.f1836;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int m2087() {
        return this.f1835.length / this.f1836;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Iterator m2085() {
        return new C21226(this);
    }
}
