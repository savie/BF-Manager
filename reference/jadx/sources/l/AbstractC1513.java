package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.֨᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 69YC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1513 extends AbstractC3971 implements Enumeration {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f5260;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f5261;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC9627[] f5262;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f5263;

    /* JADX INFO: renamed from: ۙ᩷, reason: not valid java name and contains not printable characters */
    public int f5264;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f5265;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public int f5266;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f5267;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f5268;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public boolean f5269;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f5270;

    /* JADX INFO: renamed from: ۤ᩷, reason: not valid java name and contains not printable characters */
    public byte[] f5271;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f5272;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public byte f5273;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f5274;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f5275;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f5276;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f5277;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f5278;

    /* JADX INFO: renamed from: ᩷᩷, reason: not valid java name and contains not printable characters */
    public int f5279;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public boolean f5280;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo5378(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract int mo5379(byte[] bArr);

    public AbstractC1513(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
        this.f5274 = true;
        this.f5278 = true;
    }

    public AbstractC1513(InterfaceC5878 interfaceC5878, int i) {
        super(interfaceC5878, (byte) 50);
        this.f5274 = true;
        this.f5278 = true;
        this.f5273 = (byte) 1;
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int m5383() {
        return this.f5272;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m5373(byte[] bArr) {
        this.f5271 = bArr;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m5371() {
        byte[] bArr = this.f5271;
        this.f5271 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final byte m5381() {
        return this.f5273;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m5380(byte b) {
        this.f5273 = b;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m5375() {
        return this.f5266;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final void m5382(int i) {
        this.f5266 = i;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int m5376() {
        return this.f5275;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m5374(int i) {
        this.f5275 = i;
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9627[] m5377() {
        return this.f5262;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5372(InterfaceC9627[] interfaceC9627Arr) {
        this.f5262 = interfaceC9627Arr;
    }

    @Override // l.AbstractC3971, l.InterfaceC14585, l.InterfaceC17965
    public final void reset() {
        super.reset();
        this.f5277 = 0;
        this.f5274 = true;
        this.f5278 = true;
        this.f5280 = false;
        this.f5269 = false;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f13604 == 0 && this.f5274;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.f5278) {
            this.f5278 = false;
        }
        return this;
    }

    @Override // l.AbstractC3971, l.InterfaceC14585
    public final int decode(byte[] bArr) throws C19061 {
        int iDecode = super.decode(bArr);
        if (this.f13598 == 0) {
            mo1725(iDecode + 4, bArr);
        }
        if (this.f5278) {
            this.f5278 = false;
        }
        return iDecode;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        int iM2318 = C0481.m2318(i, bArr);
        this.f5279 = iM2318;
        if (this.f5277 == 0) {
            this.f5277 = iM2318;
        }
        this.f5264 = C0481.m2318(i + 2, bArr);
        this.f5276 = C0481.m2318(i + 6, bArr);
        this.f5261 = C0481.m2318(i + 8, bArr);
        this.f5270 = C0481.m2318(i + 10, bArr);
        this.f5272 = C0481.m2318(i + 12, bArr);
        this.f5263 = C0481.m2318(i + 14, bArr);
        this.f5265 = C0481.m2318(i + 16, bArr);
        this.f5268 = bArr[i + 18] & 255;
        return (i + 20) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        this.f5267 = 0;
        this.f5260 = 0;
        int i2 = this.f5276;
        if (i2 > 0) {
            int i3 = this.f5261 - (i - this.f13597);
            this.f5260 = i3;
            int i4 = i + i3;
            System.arraycopy(bArr, i4, this.f5271, this.f5270, i2);
            i = i4 + this.f5276;
        }
        int i5 = this.f5272;
        if (i5 > 0) {
            int i6 = this.f5263 - (i - this.f13597);
            this.f5267 = i6;
            System.arraycopy(bArr, i + i6, this.f5271, this.f5277 + this.f5265, i5);
        }
        if (!this.f5269 && this.f5270 + this.f5276 == this.f5279) {
            this.f5269 = true;
        }
        if (!this.f5280 && this.f5265 + this.f5272 == this.f5264) {
            this.f5280 = true;
        }
        if (this.f5269 && this.f5280) {
            mo5379(this.f5271);
            mo5378(this.f5277, this.f5264, this.f5271);
            this.f5274 = false;
        }
        return this.f5260 + this.f5276 + this.f5267 + this.f5272;
    }

    @Override // l.AbstractC3971
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f5279 + ",totalDataCount=" + this.f5264 + ",parameterCount=" + this.f5276 + ",parameterOffset=" + this.f5261 + ",parameterDisplacement=" + this.f5270 + ",dataCount=" + this.f5272 + ",dataOffset=" + this.f5263 + ",dataDisplacement=" + this.f5265 + ",setupCount=" + this.f5268 + ",pad=" + this.f5260 + ",pad1=" + this.f5267);
    }
}
