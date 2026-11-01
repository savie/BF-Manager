package l;

import java.util.Enumeration;

/* JADX INFO: renamed from: l.ۚᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 69YC */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5535 extends AbstractC14792 implements Enumeration {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f18963;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public int f18964;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte f18965;

    /* JADX INFO: renamed from: ۙܰ, reason: not valid java name and contains not printable characters */
    public int f18966;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f18967;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18968;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f18969;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public int f18970;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f18971;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f18972;

    /* JADX INFO: renamed from: ۨܰ, reason: not valid java name and contains not printable characters */
    public byte[] f18973;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f18974;

    /* JADX INFO: renamed from: ܰܰ, reason: not valid java name and contains not printable characters */
    public int f18975;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC22180[] f18976;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f18977;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f18978;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f18979;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f18980;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public volatile boolean f18981;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f18982;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public boolean f18983;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo2802(int i, int i2, byte[] bArr);

    /* JADX INFO: renamed from: ܰ */
    public abstract int mo2803(byte[] bArr);

    public AbstractC5535(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
        this.f18977 = true;
        this.f18981 = true;
    }

    public AbstractC5535(InterfaceC10601 interfaceC10601, int i) {
        super(interfaceC10601, (byte) 50);
        this.f18977 = true;
        this.f18981 = true;
        this.f18965 = (byte) 1;
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int m15242() {
        return this.f18969;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m15235(byte[] bArr) {
        this.f18973 = bArr;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m15234() {
        byte[] bArr = this.f18973;
        this.f18973 = null;
        return bArr;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final byte m15239() {
        return this.f18965;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m15236(byte b) {
        this.f18965 = b;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m15238() {
        return this.f18970;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m15241(int i) {
        this.f18970 = i;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m15237() {
        return this.f18963;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m15233(int i) {
        this.f18963 = i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22180[] m15240() {
        return this.f18976;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15232(InterfaceC22180[] interfaceC22180Arr) {
        this.f18976 = interfaceC22180Arr;
    }

    @Override // l.AbstractC14792, l.InterfaceC9666, l.InterfaceC9522
    public final void reset() {
        super.reset();
        this.f18980 = 0;
        this.f18977 = true;
        this.f18981 = true;
        this.f18968 = false;
        this.f18983 = false;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.f48374 == 0 && this.f18977;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        if (this.f18981) {
            this.f18981 = false;
        }
        return this;
    }

    @Override // l.AbstractC14792, l.InterfaceC9666
    public final int decode(byte[] bArr) throws C2796 {
        int iDecode = super.decode(bArr);
        if (this.f48372 == 0) {
            mo2727(iDecode + 4, bArr);
        }
        if (this.f18981) {
            this.f18981 = false;
        }
        return iDecode;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        int iM13545 = C4850.m13545(i, bArr);
        this.f18975 = iM13545;
        if (this.f18980 == 0) {
            this.f18980 = iM13545;
        }
        this.f18966 = C4850.m13545(i + 2, bArr);
        this.f18979 = C4850.m13545(i + 6, bArr);
        this.f18972 = C4850.m13545(i + 8, bArr);
        this.f18967 = C4850.m13545(i + 10, bArr);
        this.f18969 = C4850.m13545(i + 12, bArr);
        this.f18982 = C4850.m13545(i + 14, bArr);
        this.f18971 = C4850.m13545(i + 16, bArr);
        this.f18964 = bArr[i + 18] & 255;
        return (i + 20) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        this.f18974 = 0;
        this.f18978 = 0;
        int i2 = this.f18979;
        if (i2 > 0) {
            int i3 = this.f18972 - (i - this.f48358);
            this.f18978 = i3;
            int i4 = i + i3;
            System.arraycopy(bArr, i4, this.f18973, this.f18967, i2);
            i = i4 + this.f18979;
        }
        int i5 = this.f18969;
        if (i5 > 0) {
            int i6 = this.f18982 - (i - this.f48358);
            this.f18974 = i6;
            System.arraycopy(bArr, i + i6, this.f18973, this.f18980 + this.f18971, i5);
        }
        if (!this.f18983 && this.f18967 + this.f18979 == this.f18975) {
            this.f18983 = true;
        }
        if (!this.f18968 && this.f18971 + this.f18969 == this.f18966) {
            this.f18968 = true;
        }
        if (this.f18983 && this.f18968) {
            mo2803(this.f18973);
            mo2802(this.f18980, this.f18966, this.f18973);
            this.f18977 = false;
        }
        return this.f18978 + this.f18979 + this.f18974 + this.f18969;
    }

    @Override // l.AbstractC14792
    public String toString() {
        return new String(super.toString() + ",totalParameterCount=" + this.f18975 + ",totalDataCount=" + this.f18966 + ",parameterCount=" + this.f18979 + ",parameterOffset=" + this.f18972 + ",parameterDisplacement=" + this.f18967 + ",dataCount=" + this.f18969 + ",dataOffset=" + this.f18982 + ",dataDisplacement=" + this.f18971 + ",setupCount=" + this.f18964 + ",pad=" + this.f18978 + ",pad1=" + this.f18974);
    }
}
