package l;

import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ܺ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: F67X */
/* JADX INFO: loaded from: classes.dex */
public final class C22395 extends AbstractC4300 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public byte[] f73102;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73103;

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۙ */
    public final int mo12097(int i) {
        return (i % 2) + ((this.f73102.length + 1) / 2) + 4;
    }

    public C22395(int i, byte[] bArr) {
        super(EnumC0772.f3223);
        if (bArr.length % i != 0) {
            throw new RuntimeException(C2271.m6966(i, "There are not a whole number of ", " byte elements"));
        }
        this.f73103 = i;
        this.f73102 = bArr;
    }

    public C22395(byte[] bArr, int i) {
        super(EnumC0772.f3223);
        if (bArr[i] != 0) {
            throw new RuntimeException("Invalid opcode byte for an ArrayData pseudo-instruction");
        }
        if (bArr[i + 1] != 3) {
            throw new RuntimeException("Invalid sub-opcode byte for an ArrayData pseudo-instruction");
        }
        int iM35087 = C14611.m35087(i + 2, bArr);
        this.f73103 = iM35087;
        int iM35077 = C14611.m35077(i + 4, bArr) * iM35087;
        byte[] bArr2 = new byte[iM35077];
        this.f73102 = bArr2;
        System.arraycopy(bArr, i + 8, bArr2, 0, iM35077);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ܰ */
    public final void mo4759(C4651 c4651, int i) {
        c4651.m12835(4);
        byte[] bArr = this.f73102;
        int length = bArr.length;
        int i2 = this.f73103;
        c4651.m12841(0);
        c4651.m12841(3);
        c4651.m12833(i2);
        c4651.m12839(length / i2);
        c4651.m12837(bArr, 0, bArr.length);
        c4651.m12835(2);
    }

    @Override // l.AbstractC4300
    /* JADX INFO: renamed from: ۜ */
    public final EnumC1227 mo4758() {
        return EnumC1227.ArrayData;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int m49665() {
        return this.f73103;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int m49667() {
        return this.f73102.length / this.f73103;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Iterator m49666() {
        return new C2638(this);
    }
}
