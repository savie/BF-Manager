package l;

/* JADX INFO: renamed from: l.ۧ᩸۠, reason: contains not printable characters */
/* JADX INFO: compiled from: ZA1E */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11264 extends AbstractC14792 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f38076 = C13488.m32997(AbstractC11264.class);

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public byte f38077;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f38078;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC14792 f38079;

    public AbstractC11264(InterfaceC10601 interfaceC10601, byte b, String str) {
        super(interfaceC10601, b, str);
        this.f38077 = (byte) -1;
        this.f38078 = 0;
        this.f38079 = null;
    }

    public AbstractC11264(InterfaceC10601 interfaceC10601) {
        this(interfaceC10601, null);
    }

    public AbstractC11264(InterfaceC10601 interfaceC10601, AbstractC14792 abstractC14792) {
        super(interfaceC10601);
        this.f38077 = (byte) -1;
        this.f38078 = 0;
        this.f38079 = abstractC14792;
        if (abstractC14792 != null) {
            this.f38077 = (byte) abstractC14792.mo24564();
        }
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14792 m28229() {
        return this.f38079;
    }

    @Override // l.AbstractC14792, l.InterfaceC3314
    /* JADX INFO: renamed from: getNext */
    public final InterfaceC3314 mo9818() {
        return this.f38079;
    }

    @Override // l.AbstractC14792, l.InterfaceC3314
    /* JADX INFO: renamed from: getNext */
    public final AbstractC14792 mo9818() {
        return this.f38079;
    }

    @Override // l.AbstractC14792, l.InterfaceC3314
    /* JADX INFO: renamed from: ۚ */
    public final InterfaceC3314 mo9818() {
        return this.f38079;
    }

    @Override // l.InterfaceC4913
    /* JADX INFO: renamed from: ᩶ */
    public final InterfaceC4913 mo13671() {
        return this.f38079;
    }

    @Override // l.AbstractC14792, l.InterfaceC9666
    /* JADX INFO: renamed from: ۙ */
    public final int mo24565(int i, byte[] bArr) {
        this.f48358 = i;
        m35456(i, bArr);
        int i2 = i + 32;
        int i3 = i + 35;
        int iMo2724 = mo2724(i + 37, bArr);
        int i4 = iMo2724 + 4;
        int i5 = iMo2724 + 5 + i2;
        int i6 = i4 / 2;
        this.f48376 = i6;
        bArr[i2] = (byte) (i6 & 255);
        int i7 = i5 + 2;
        int iMo2725 = mo2725(i7, bArr);
        this.f48372 = iMo2725;
        bArr[i5] = (byte) (iMo2725 & 255);
        bArr[i5 + 1] = (byte) ((iMo2725 >> 8) & 255);
        int i8 = i7 + iMo2725;
        if (this.f38079 != null) {
            m35454().getClass();
        }
        this.f38077 = (byte) -1;
        this.f38079 = null;
        bArr[i + 33] = -1;
        bArr[i + 34] = 0;
        bArr[i3] = -34;
        bArr[i + 36] = -34;
        int i9 = ((i8 - i2) + i2) - i;
        this.f48369 = i9;
        C23964 c23964 = this.f48373;
        if (c23964 != null) {
            c23964.m52788(bArr, this.f48358, i9, this, mo9821());
        }
        return this.f48369;
    }

    @Override // l.AbstractC14792, l.InterfaceC9666
    public final int decode(byte[] bArr) throws C2796 {
        this.f48358 = 4;
        m35445(bArr);
        int iM28228 = m28228(36, bArr) + 32;
        this.f48369 = iM28228;
        if (m35438()) {
            System.arraycopy(bArr, 4, new byte[iM28228], 0, iM28228);
        }
        if (m35446(4, iM28228, bArr)) {
            return iM28228;
        }
        throw new C2796("Signature verification failed for ".concat(getClass().getName()));
    }

    public AbstractC11264(InterfaceC10601 interfaceC10601, byte b, AbstractC14792 abstractC14792) {
        super(interfaceC10601, b, null);
        this.f38077 = (byte) -1;
        this.f38078 = 0;
        this.f38079 = abstractC14792;
        if (abstractC14792 != null) {
            this.f38077 = (byte) abstractC14792.mo24564();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int m28228(int i, byte[] bArr) {
        byte b;
        int i2 = i + 1;
        byte b2 = bArr[i];
        this.f48376 = b2;
        if (b2 != 0) {
            this.f38077 = bArr[i2];
            int iM13545 = C4850.m13545(i + 3, bArr);
            this.f38078 = iM13545;
            if (iM13545 == 0) {
                this.f38077 = (byte) -1;
            }
            if (this.f48376 > 2) {
                mo2726(i + 5, bArr);
                if (mo24564() == -94) {
                    C4102 c4102 = (C4102) this;
                    if (c4102.m11647() && c4102.m11646() != 1) {
                        this.f48376 += 8;
                    }
                }
            }
            i2 += this.f48376 * 2;
        }
        int iM13546 = C4850.m13545(i2, bArr);
        this.f48372 = iM13546;
        int iM28228 = i2 + 2;
        if (iM13546 != 0) {
            int iMo2727 = mo2727(iM28228, bArr);
            if (iMo2727 != this.f48372) {
                InterfaceC4314 interfaceC4314 = f38076;
                if (interfaceC4314.mo12133()) {
                    StringBuilder sbM40153 = C17214.m40153(iMo2727, "Short read, have ", ", want ");
                    sbM40153.append(this.f48372);
                    interfaceC4314.mo12127(sbM40153.toString());
                }
            }
            iM28228 += this.f48372;
        }
        if (this.f48374 != 0 || (b = this.f38077) == -1) {
            this.f38077 = (byte) -1;
            this.f38079 = null;
        } else {
            AbstractC14792 abstractC14792 = this.f38079;
            if (abstractC14792 == null) {
                this.f38077 = (byte) -1;
                throw new C17655("no andx command supplied with response");
            }
            int i3 = this.f48358;
            int i4 = this.f38078 + i3;
            abstractC14792.f48358 = i3;
            abstractC14792.mo24570(b);
            AbstractC14792 abstractC14793 = this.f38079;
            abstractC14793.f48374 = this.f48374;
            abstractC14793.m35444(m35450());
            AbstractC14792 abstractC14794 = this.f38079;
            abstractC14794.f48356 = this.f48356;
            abstractC14794.f48380 = this.f48380;
            abstractC14794.f48361 = this.f48361;
            abstractC14794.f48371 = this.f48371;
            abstractC14794.f48366 = this.f48366;
            abstractC14794.m35453(m35449());
            AbstractC14792 abstractC14795 = this.f38079;
            if (abstractC14795 instanceof AbstractC11264) {
                iM28228 = i4 + ((AbstractC11264) abstractC14795).m28228(i4, bArr);
            } else {
                int iMo2726 = i4 + 1;
                int i5 = abstractC14795.f48376;
                bArr[i4] = (byte) (i5 & 255);
                if (i5 != 0 && i5 > 2) {
                    iMo2726 += abstractC14795.mo2726(iMo2726, bArr);
                }
                this.f38079.f48372 = C4850.m13545(iMo2726, bArr);
                int i6 = iMo2726 + 2;
                AbstractC14792 abstractC14796 = this.f38079;
                if (abstractC14796.f48372 != 0) {
                    abstractC14796.mo2727(i6, bArr);
                    i6 += this.f38079.f48372;
                }
                iM28228 = i6;
            }
            this.f38079.mo17296();
        }
        return iM28228 - i;
    }

    @Override // l.AbstractC14792
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",andxCommand=0x");
        C18855.m43491(this.f38077, 2, ",andxOffset=", sb);
        sb.append(this.f38078);
        return new String(sb.toString());
    }
}
