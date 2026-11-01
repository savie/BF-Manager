package l;

/* JADX INFO: renamed from: l.۬ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C13276 extends AbstractC11264 implements InterfaceC14087 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f44087;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public byte f44088;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f44089;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f44090;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f44091;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f44092;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f44093;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f44094;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f44095;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C13276(InterfaceC10601 interfaceC10601, String str, int i, int i2, int i3, int i4, int i5) {
        super(interfaceC10601, (byte) -94, str);
        this.f44094 = i2 | 137;
        this.f44087 = i4;
        this.f44089 = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.f44095 = 5;
            } else {
                this.f44095 = 4;
            }
        } else if ((i & 16) != 16) {
            this.f44095 = 1;
        } else if ((i & 32) == 32) {
            this.f44095 = 2;
        } else {
            this.f44095 = 3;
        }
        if ((i5 & 1) == 0) {
            this.f44091 = i5 | 64;
        } else {
            this.f44091 = i5;
        }
        this.f44090 = 2;
        this.f44088 = (byte) 3;
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4913 mo9821() {
        return (C4102) super.mo9821();
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC9522 mo9821() {
        return (C4102) super.mo9821();
    }

    @Override // l.AbstractC14792, l.InterfaceC3314, l.InterfaceC9666
    /* JADX INFO: renamed from: ܰ */
    public final AbstractC14792 mo9821() {
        return (C4102) super.mo9821();
    }

    @Override // l.InterfaceC14087
    /* JADX INFO: renamed from: ܰ */
    public final InterfaceC4913 mo13364(InterfaceC19067 interfaceC19067) {
        C4102 c4102 = new C4102(interfaceC19067.mo29449());
        mo24567((InterfaceC4913) c4102);
        return c4102;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m32760() {
        this.f44092 |= 22;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        bArr[i] = 0;
        this.f44093 = i + 1;
        C4850.m13550(this.f44092, i + 3, bArr);
        C4850.m13550(0, i + 7, bArr);
        C4850.m13550(this.f44094, i + 11, bArr);
        C4850.m13548(0L, i + 15, bArr);
        C4850.m13550(this.f44087, i + 23, bArr);
        C4850.m13550(this.f44089, i + 27, bArr);
        C4850.m13550(this.f44095, i + 31, bArr);
        C4850.m13550(this.f44091, i + 35, bArr);
        C4850.m13550(this.f44090, i + 39, bArr);
        bArr[i + 43] = this.f44088;
        return (i + 44) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int iM35440 = m35440(this.f48357, i, bArr);
        C4850.m13546(m35449() ? this.f48357.length() * 2 : iM35440, this.f44093, bArr);
        return iM35440;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        C18855.m43491(this.f44092, 2, ",rootDirectoryFid=0,desiredAccess=0x", sb);
        C18855.m43491(this.f44094, 4, ",allocationSize=0,extFileAttributes=0x", sb);
        C18855.m43491(this.f44087, 4, ",shareAccess=0x", sb);
        C18855.m43491(this.f44089, 4, ",createDisposition=0x", sb);
        C18855.m43491(this.f44095, 4, ",createOptions=0x", sb);
        C18855.m43491(this.f44091, 8, ",impersonationLevel=0x", sb);
        C18855.m43491(this.f44090, 4, ",securityFlags=0x", sb);
        C18855.m43491(this.f44088, 2, ",name=", sb);
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
