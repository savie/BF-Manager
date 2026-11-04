package l;

/* JADX INFO: renamed from: l.᩻᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 09TX */
/* JADX INFO: loaded from: classes2.dex */
public final class C25380 extends AbstractC6209 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public C5242 f81935;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public String f81936;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81937;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81938;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public byte[] f81939;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public String f81940;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f81941;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C25380(InterfaceC23032 interfaceC23032, C5242 c5242, AbstractC3971 abstractC3971, Object obj) throws C20728 {
        super(interfaceC23032.mo2875(), (byte) 115, abstractC3971);
        this.f81938 = null;
        this.f81935 = c5242;
        int iM15752 = c5242.m15752();
        this.f81941 = iM15752;
        C21125 c21125M15750 = c5242.m15750();
        int i = c21125M15750.f67485;
        if (i != 1) {
            if (i == 0) {
                if (obj instanceof C19982) {
                    C19982 c19982 = (C19982) obj;
                    this.f81939 = new byte[0];
                    this.f81937 = new byte[0];
                    if (!c19982.mo45913()) {
                        String strM45909 = c19982.m45909();
                        this.f81936 = strM45909;
                        if (m12781()) {
                            this.f81936 = strM45909.toUpperCase();
                        }
                        this.f81940 = c19982.mo45915() != null ? c19982.mo45915().toUpperCase() : "?";
                        return;
                    }
                    this.f81936 = "";
                    this.f81940 = "";
                    return;
                }
                throw new C20728("Unsupported credential type");
            }
            throw new C20728("Unsupported");
        }
        if (obj instanceof C19982) {
            C19982 c19983 = (C19982) obj;
            if (c19983.mo45913()) {
                this.f81939 = new byte[0];
                this.f81937 = new byte[0];
                this.f81941 = Integer.MAX_VALUE & iM15752;
                if (c19983.mo45914()) {
                    String strM459010 = c19983.m45909();
                    this.f81936 = strM459010;
                    if (m12781()) {
                        this.f81936 = strM459010.toUpperCase();
                    }
                    this.f81940 = c19983.mo45915() != null ? c19983.mo45915().toUpperCase() : "?";
                    return;
                }
                this.f81936 = "";
                this.f81940 = "";
                return;
            }
            String strM459011 = c19983.m45909();
            this.f81936 = strM459011;
            if (m12781()) {
                this.f81936 = strM459011.toUpperCase();
            }
            this.f81940 = c19983.mo45915() != null ? c19983.mo45915().toUpperCase() : "?";
            if (c21125M15750.f67482) {
                byte[] bArrM45912 = c19983.m45912(interfaceC23032, c21125M15750.f67493);
                this.f81939 = bArrM45912;
                byte[] bArrM45916 = c19983.m45916(interfaceC23032, c21125M15750.f67493);
                this.f81937 = bArrM45916;
                if (bArrM45912.length == 0 && bArrM45916.length == 0) {
                    throw new RuntimeException("Null setup prohibited.");
                }
                return;
            }
            if (((C14826) interfaceC23032.mo2875()).m35726()) {
                throw new RuntimeException("Plain text passwords are disabled");
            }
            String password = c19983.getPassword();
            byte[] bArr = new byte[(password.length() + 1) * 2];
            this.f81939 = bArr;
            this.f81937 = new byte[0];
            m12758(password, 0, bArr);
            return;
        }
        if (obj instanceof byte[]) {
            this.f81938 = (byte[]) obj;
        } else {
            StringBuilder sb = new StringBuilder("Unsupported credential type ");
            sb.append(obj != null ? obj.getClass() : "NULL");
            throw new C20728(sb.toString());
        }
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        int i2;
        C5242 c5242 = this.f81935;
        C0481.m2319(c5242.m15754(), i, bArr);
        C0481.m2319(c5242.m15751(), i + 2, bArr);
        C0481.m2319(((C14826) m12793()).m35739(), i + 4, bArr);
        C0481.m2323(0, i + 6, bArr);
        int i3 = i + 10;
        byte[] bArr2 = this.f81938;
        if (bArr2 != null) {
            C0481.m2319(bArr2.length, i3, bArr);
            i2 = i + 12;
        } else {
            C0481.m2319(this.f81939.length, i3, bArr);
            C0481.m2319(this.f81937.length, i + 12, bArr);
            i2 = i + 14;
        }
        bArr[i2] = 0;
        bArr[i2 + 1] = 0;
        bArr[i2 + 2] = 0;
        bArr[i2 + 3] = 0;
        C0481.m2323(this.f81941, i2 + 4, bArr);
        return (i2 + 8) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int iM12758;
        byte[] bArr2 = this.f81938;
        if (bArr2 != null) {
            System.arraycopy(bArr2, 0, bArr, i, bArr2.length);
            iM12758 = bArr2.length + i;
        } else {
            byte[] bArr3 = this.f81939;
            System.arraycopy(bArr3, 0, bArr, i, bArr3.length);
            int length = bArr3.length + i;
            byte[] bArr4 = this.f81937;
            System.arraycopy(bArr4, 0, bArr, length, bArr4.length);
            int length2 = length + bArr4.length;
            int iM12759 = length2 + m12758(this.f81936, length2, bArr);
            iM12758 = m12758(this.f81940, iM12759, bArr) + iM12759;
        }
        int iM127510 = iM12758 + m12758(((C14826) m12793()).m35741(), iM12758, bArr);
        return (iM127510 + m12758(((C14826) m12793()).m35710(), iM127510, bArr)) - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSessionSetupAndX[");
        sb.append(super.toString());
        sb.append(",snd_buf_size=");
        C5242 c5242 = this.f81935;
        sb.append(c5242.m15754());
        sb.append(",maxMpxCount=");
        sb.append(c5242.m15751());
        sb.append(",VC_NUMBER=");
        sb.append(((C14826) m12793()).m35739());
        sb.append(",sessionKey=0,lmHash.length=");
        byte[] bArr = this.f81939;
        sb.append(bArr == null ? 0 : bArr.length);
        sb.append(",ntHash.length=");
        byte[] bArr2 = this.f81937;
        sb.append(bArr2 != null ? bArr2.length : 0);
        sb.append(",capabilities=");
        sb.append(this.f81941);
        sb.append(",accountName=");
        sb.append(this.f81936);
        sb.append(",primaryDomain=");
        sb.append(this.f81940);
        sb.append(",NATIVE_OS=");
        sb.append(((C14826) m12793()).m35741());
        sb.append(",NATIVE_LANMAN=");
        sb.append(((C14826) m12793()).m35710());
        sb.append("]");
        return new String(sb.toString());
    }
}
