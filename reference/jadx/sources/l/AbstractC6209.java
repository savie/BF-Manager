package l;

/* JADX INFO: renamed from: l.ۛۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA1E */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6209 extends AbstractC3971 {

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f21124 = C16980.m40037(AbstractC6209.class);

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f21125;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public byte f21126;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC3971 f21127;

    public AbstractC6209(InterfaceC5878 interfaceC5878, byte b, String str) {
        super(interfaceC5878, b, str);
        this.f21126 = (byte) -1;
        this.f21125 = 0;
        this.f21127 = null;
    }

    public AbstractC6209(InterfaceC5878 interfaceC5878) {
        this(interfaceC5878, null);
    }

    public AbstractC6209(InterfaceC5878 interfaceC5878, AbstractC3971 abstractC3971) {
        super(interfaceC5878);
        this.f21126 = (byte) -1;
        this.f21125 = 0;
        this.f21127 = abstractC3971;
        if (abstractC3971 != null) {
            this.f21126 = (byte) abstractC3971.mo10330();
        }
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC3971 m17848() {
        return this.f21127;
    }

    @Override // l.AbstractC3971, l.InterfaceC21299
    /* JADX INFO: renamed from: getNext */
    public final AbstractC3971 mo12790() {
        return this.f21127;
    }

    @Override // l.AbstractC3971, l.InterfaceC21299
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC21299 mo12790() {
        return this.f21127;
    }

    @Override // l.AbstractC3971, l.InterfaceC21299
    /* JADX INFO: renamed from: ᩴ */
    public final InterfaceC21299 mo12790() {
        return this.f21127;
    }

    @Override // l.InterfaceC18315
    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC18315 mo17847() {
        return this.f21127;
    }

    @Override // l.AbstractC3971, l.InterfaceC14585
    /* JADX INFO: renamed from: ۙ */
    public final int mo10305(int i, byte[] bArr) {
        this.f13597 = i;
        m12786(i, bArr);
        int i2 = i + 32;
        int i3 = i + 35;
        int iMo1723 = mo1723(i + 37, bArr);
        int i4 = iMo1723 + 4;
        int i5 = iMo1723 + 5 + i2;
        int i6 = i4 / 2;
        this.f13609 = i6;
        bArr[i2] = (byte) (i6 & 255);
        int i7 = i5 + 2;
        int iMo1724 = mo1724(i7, bArr);
        this.f13598 = iMo1724;
        bArr[i5] = (byte) (iMo1724 & 255);
        bArr[i5 + 1] = (byte) ((iMo1724 >> 8) & 255);
        int i8 = i7 + iMo1724;
        if (this.f21127 != null) {
            m12793().getClass();
        }
        this.f21126 = (byte) -1;
        this.f21127 = null;
        bArr[i + 33] = -1;
        bArr[i + 34] = 0;
        bArr[i3] = -34;
        bArr[i + 36] = -34;
        int i9 = ((i8 - i2) + i2) - i;
        this.f13607 = i9;
        C24109 c24109 = this.f13583;
        if (c24109 != null) {
            c24109.m53659(bArr, this.f13597, i9, this, mo1727());
        }
        return this.f13607;
    }

    @Override // l.AbstractC3971, l.InterfaceC14585
    public final int decode(byte[] bArr) throws C19061 {
        this.f13597 = 4;
        m12768(bArr);
        int iM17846 = m17846(36, bArr) + 32;
        this.f13607 = iM17846;
        if (m12754()) {
            System.arraycopy(bArr, 4, new byte[iM17846], 0, iM17846);
        }
        if (m12769(4, iM17846, bArr)) {
            return iM17846;
        }
        throw new C19061("Signature verification failed for ".concat(getClass().getName()));
    }

    public AbstractC6209(InterfaceC5878 interfaceC5878, byte b, AbstractC3971 abstractC3971) {
        super(interfaceC5878, b, null);
        this.f21126 = (byte) -1;
        this.f21125 = 0;
        this.f21127 = abstractC3971;
        if (abstractC3971 != null) {
            this.f21126 = (byte) abstractC3971.mo10330();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int m17846(int i, byte[] bArr) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.f13609 = b2;
        if (b2 != 0) {
            this.f21126 = bArr[i2];
            int iM2318 = C0481.m2318(i + 3, bArr);
            this.f21125 = iM2318;
            if (iM2318 == 0) {
                this.f21126 = (byte) -1;
            }
            if (this.f13609 > 2) {
                mo1722(i + 5, bArr);
                if (mo10330() == -94) {
                    C6954 c6954 = (C6954) this;
                    if (c6954.m19255() && c6954.m19252() != 1) {
                        this.f13609 += 8;
                    }
                }
            }
            i2 += this.f13609 * 2;
        }
        int iM2319 = C0481.m2318(i2, bArr);
        this.f13598 = iM2319;
        int iM17846 = i2 + 2;
        if (iM2319 != 0) {
            int iMo1725 = mo1725(iM17846, bArr);
            if (iMo1725 != this.f13598) {
                InterfaceC25186 interfaceC25186 = f21124;
                if (interfaceC25186.mo13713()) {
                    StringBuilder sbM12235 = C3769.m12235(iMo1725, "Short read, have ", ", want ");
                    sbM12235.append(this.f13598);
                    interfaceC25186.mo13717(sbM12235.toString());
                }
            }
            iM17846 += this.f13598;
        }
        if (this.f13604 != 0 || (b = this.f21126) == -1) {
            this.f21126 = (byte) -1;
            this.f21127 = null;
        } else {
            AbstractC3971 abstractC3971 = this.f21127;
            if (abstractC3971 == null) {
                this.f21126 = (byte) -1;
                throw new C3640("no andx command supplied with response");
            }
            int i3 = this.f13597;
            int i4 = this.f21125 + i3;
            abstractC3971.f13597 = i3;
            abstractC3971.mo10331(b);
            AbstractC3971 abstractC3972 = this.f21127;
            abstractC3972.f13604 = this.f13604;
            abstractC3972.m12762(m12779());
            AbstractC3971 abstractC3973 = this.f21127;
            abstractC3973.f13591 = this.f13591;
            abstractC3973.f13610 = this.f13610;
            abstractC3973.f13605 = this.f13605;
            abstractC3973.f13601 = this.f13601;
            abstractC3973.f13594 = this.f13594;
            abstractC3973.m12792(m12781());
            AbstractC3971 abstractC3974 = this.f21127;
            if (abstractC3974 instanceof AbstractC6209) {
                iM17846 = i4 + ((AbstractC6209) abstractC3974).m17846(i4, bArr);
            } else {
                int iMo1722 = i4 + 1;
                int i5 = abstractC3974.f13609;
                bArr[i4] = (byte) (i5 & 255);
                if (i5 != 0 && i5 > 2) {
                    iMo1722 += abstractC3974.mo1722(iMo1722, bArr);
                }
                this.f21127.f13598 = C0481.m2318(iMo1722, bArr);
                int i6 = iMo1722 + 2;
                AbstractC3971 abstractC3975 = this.f21127;
                if (abstractC3975.f13598 != 0) {
                    abstractC3975.mo1725(i6, bArr);
                    i6 += this.f21127.f13598;
                }
                iM17846 = i6;
            }
            this.f21127.mo12752();
        }
        return iM17846 - i;
    }

    @Override // l.AbstractC3971
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",andxCommand=0x");
        C8008.m21876(this.f21126, 2, ",andxOffset=", sb);
        sb.append(this.f21125);
        return new String(sb.toString());
    }
}
