package l;

/* JADX INFO: renamed from: l.᩸ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 59X2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22856 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f74271;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f74272;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2149 f74273;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public int f74274;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C22856(int i, InterfaceC5878 interfaceC5878, byte[] bArr) {
        super(interfaceC5878);
        this.f74271 = bArr;
        this.f74274 = i;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final int m51575() {
        return this.f74274;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2149 m51576(Class cls) throws C20728 {
        InterfaceC2149 interfaceC2149 = this.f74273;
        if (interfaceC2149 == null) {
            throw new C20728("Failed to decode output data");
        }
        if (cls.isAssignableFrom(interfaceC2149.getClass())) {
            return interfaceC2149;
        }
        throw new C20728("Incompatible response data " + interfaceC2149.getClass());
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2149 m51578() {
        return this.f74273;
    }

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int m51577() {
        return this.f74272;
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ܺۙ */
    public final boolean mo10328() {
        int i;
        int i2;
        int iM10323 = m10323();
        if (iM10323 == -1073741811) {
            return false;
        }
        if (iM10323 == -1073741811 && ((i2 = this.f74274) == 1327346 || i2 == 1343730)) {
            return false;
        }
        return !(iM10323 == -2147483643 && ((i = this.f74274) == 1163287 || i == 1130508 || i == 393620)) && super.mo10328();
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        int iM2318 = C0481.m2318(i, bArr);
        if (iM2318 == 9) {
            return m10319(i, bArr);
        }
        if (iM2318 != 49) {
            throw new C19061("Expected structureSize = 49");
        }
        this.f74274 = C0481.m2322(i + 4, bArr);
        System.arraycopy(bArr, i + 8, new byte[16], 0, 16);
        int iM10327 = m10327() + C0481.m2322(i + 24, bArr);
        int iM2322 = C0481.m2322(i + 28, bArr);
        int iM10328 = m10327() + C0481.m2322(i + 32, bArr);
        int iM2323 = C0481.m2322(i + 36, bArr);
        C0481.m2322(i + 40, bArr);
        int i2 = i + 48;
        byte[] bArr2 = this.f74271;
        InterfaceC2149 c10682 = null;
        if (bArr2 == null) {
            switch (this.f74274) {
                case 393620:
                    c10682 = new C10682();
                    break;
                case 1130508:
                    c10682 = new C15396();
                    break;
                case 1310840:
                    c10682 = new C13159();
                    break;
                case 1311236:
                    c10682 = new C1973();
                    break;
                case 1327346:
                case 1343730:
                    c10682 = new C19872();
                    break;
            }
        }
        this.f74273 = c10682;
        int iMax = Math.max(iM10327 + iM2322, i2);
        if (bArr2 != null) {
            if (iM2323 > bArr2.length) {
                throw new C19061("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, iM10328, bArr2, 0, iM2323);
        } else {
            InterfaceC2149 interfaceC2149 = this.f74273;
            if (interfaceC2149 != null) {
                interfaceC2149.mo6138(iM10328, iM2323, bArr);
            }
        }
        this.f74272 = iM2323;
        return Math.max(iM10328 + iM2323, iMax) - i;
    }
}
