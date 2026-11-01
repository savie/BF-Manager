package l;

/* JADX INFO: renamed from: l.᩷ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21036 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f68515;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f68516;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public byte[] f68517;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public C23154 f68518;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public String f68519;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f68520;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public String f68521;

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

    public C21036(InterfaceC19067 interfaceC19067, C23154 c23154, AbstractC14792 abstractC14792, Object obj) throws C12303 {
        super(interfaceC19067.mo29449(), (byte) 115, abstractC14792);
        this.f68517 = null;
        this.f68518 = c23154;
        int iM51148 = c23154.m51148();
        this.f68520 = iM51148;
        C9853 c9853M51147 = c23154.m51147();
        int i = c9853M51147.f33648;
        if (i != 1) {
            if (i == 0) {
                if (obj instanceof C18652) {
                    C18652 c18652 = (C18652) obj;
                    this.f68515 = new byte[0];
                    this.f68516 = new byte[0];
                    if (!c18652.mo43144()) {
                        String strM43140 = c18652.m43140();
                        this.f68521 = strM43140;
                        if (m35449()) {
                            this.f68521 = strM43140.toUpperCase();
                        }
                        this.f68519 = c18652.mo43139() != null ? c18652.mo43139().toUpperCase() : "?";
                        return;
                    }
                    this.f68521 = "";
                    this.f68519 = "";
                    return;
                }
                throw new C12303("Unsupported credential type");
            }
            throw new C12303("Unsupported");
        }
        if (obj instanceof C18652) {
            C18652 c18653 = (C18652) obj;
            if (c18653.mo43144()) {
                this.f68515 = new byte[0];
                this.f68516 = new byte[0];
                this.f68520 = Integer.MAX_VALUE & iM51148;
                if (c18653.mo43145()) {
                    String strM43141 = c18653.m43140();
                    this.f68521 = strM43141;
                    if (m35449()) {
                        this.f68521 = strM43141.toUpperCase();
                    }
                    this.f68519 = c18653.mo43139() != null ? c18653.mo43139().toUpperCase() : "?";
                    return;
                }
                this.f68521 = "";
                this.f68519 = "";
                return;
            }
            String strM43142 = c18653.m43140();
            this.f68521 = strM43142;
            if (m35449()) {
                this.f68521 = strM43142.toUpperCase();
            }
            this.f68519 = c18653.mo43139() != null ? c18653.mo43139().toUpperCase() : "?";
            if (c9853M51147.f33646) {
                byte[] bArrM43143 = c18653.m43143(interfaceC19067, c9853M51147.f33652);
                this.f68515 = bArrM43143;
                byte[] bArrM43147 = c18653.m43147(interfaceC19067, c9853M51147.f33652);
                this.f68516 = bArrM43147;
                if (bArrM43143.length == 0 && bArrM43147.length == 0) {
                    throw new RuntimeException("Null setup prohibited.");
                }
                return;
            }
            if (((C9895) interfaceC19067.mo29449()).m25081()) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            String password = c18653.getPassword();
            byte[] bArr = new byte[(password.length() + 1) * 2];
            this.f68515 = bArr;
            this.f68516 = new byte[0];
            m35440(password, 0, bArr);
            return;
        }
        if (obj instanceof byte[]) {
            this.f68517 = (byte[]) obj;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported credential type ");
            sb.append(obj != null ? obj.getClass() : "NULL");
            throw new C12303(sb.toString());
        }
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        int i2;
        C23154 c23154 = this.f68518;
        C4850.m13546(c23154.m51150(), i, bArr);
        C4850.m13546(c23154.m51149(), i + 2, bArr);
        C4850.m13546(((C9895) m35454()).m25044(), i + 4, bArr);
        C4850.m13550(0, i + 6, bArr);
        int i3 = i + 10;
        byte[] bArr2 = this.f68517;
        if (bArr2 != null) {
            C4850.m13546(bArr2.length, i3, bArr);
            i2 = i + 12;
        } else {
            C4850.m13546(this.f68515.length, i3, bArr);
            C4850.m13546(this.f68516.length, i + 12, bArr);
            i2 = i + 14;
        }
        bArr[i2] = 0;
        bArr[i2 + 1] = 0;
        bArr[i2 + 2] = 0;
        bArr[i2 + 3] = 0;
        C4850.m13550(this.f68520, i2 + 4, bArr);
        return (i2 + 8) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int iM35440;
        byte[] bArr2 = this.f68517;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            iM35440 = bArr2.length + i;
        } else {
            byte[] bArr3 = this.f68515;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            int length = bArr3.length + i;
            byte[] bArr4 = this.f68516;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + bArr4.length;
            int iM35441 = length2 + m35440(this.f68521, length2, bArr);
            iM35440 = m35440(this.f68519, iM35441, bArr) + iM35441;
        }
        int iM35442 = iM35440 + m35440(((C9895) m35454()).m25056(), iM35440, bArr);
        return (iM35442 + m35440(((C9895) m35454()).m25060(), iM35442, bArr)) - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndX[");
        sb.append(super.toString());
        sb.append(",snd_buf_size=");
        C23154 c23154 = this.f68518;
        sb.append(c23154.m51150());
        sb.append(",maxMpxCount=");
        sb.append(c23154.m51149());
        sb.append(",VC_NUMBER=");
        sb.append(((C9895) m35454()).m25044());
        sb.append(",sessionKey=0,lmHash.length=");
        byte[] bArr = this.f68515;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",ntHash.length=");
        byte[] bArr2 = this.f68516;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(",capabilities=");
        sb.append(this.f68520);
        sb.append(",accountName=");
        sb.append(this.f68521);
        sb.append(",primaryDomain=");
        sb.append(this.f68519);
        sb.append(",NATIVE_OS=");
        sb.append(((C9895) m35454()).m25056());
        sb.append(",NATIVE_LANMAN=");
        sb.append(((C9895) m35454()).m25060());
        sb.append("]");
        return new String(sb.toString());
    }
}
