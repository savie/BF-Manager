package l;

/* JADX INFO: renamed from: l.ᩳ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 59X2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17925 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f56928;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f56929;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f56930;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7778 f56931;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C17925(int i, InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601);
        this.f56928 = bArr;
        this.f56930 = i;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m41618() {
        return this.f56930;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7778 m41617(Class cls) throws C12303 {
        InterfaceC7778 interfaceC7778 = this.f56931;
        if (interfaceC7778 == null) {
            throw new C12303("Failed to decode output data");
        }
        if (cls.isAssignableFrom(interfaceC7778.getClass())) {
            return interfaceC7778;
        }
        throw new C12303("Incompatible response data " + interfaceC7778.getClass());
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7778 m41620() {
        return this.f56931;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final int m41619() {
        return this.f56929;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܶۙ */
    public final boolean mo17998() {
        int i;
        int i2;
        int iM31351 = m31351();
        if (iM31351 == -1073741811) {
            return false;
        }
        if (iM31351 == -1073741811 && ((i2 = this.f56930) == 1327346 || i2 == 1343730)) {
            return false;
        }
        return !(iM31351 == -2147483643 && ((i = this.f56930) == 1163287 || i == 1130508 || i == 393620)) && super.mo17998();
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        int iM13545 = C4850.m13545(i, bArr);
        if (iM13545 == 9) {
            return m31352(i, bArr);
        }
        if (iM13545 != 49) {
            throw new C2796("Expected structureSize = 49");
        }
        this.f56930 = C4850.m13549(i + 4, bArr);
        System.arraycopy(bArr, i + 8, new byte[16], 0, 16);
        int iM31366 = m31366() + C4850.m13549(i + 24, bArr);
        int iM13549 = C4850.m13549(i + 28, bArr);
        int iM31367 = m31366() + C4850.m13549(i + 32, bArr);
        int iM135410 = C4850.m13549(i + 36, bArr);
        C4850.m13549(i + 40, bArr);
        int i2 = i + 48;
        byte[] bArr2 = this.f56928;
        InterfaceC7778 c21847 = null;
        if (bArr2 == null) {
            switch (this.f56930) {
                case 393620:
                    c21847 = new C21847();
                    break;
                case 1130508:
                    c21847 = new C8048();
                    break;
                case 1310840:
                    c21847 = new C19337();
                    break;
                case 1311236:
                    c21847 = new C10165();
                    break;
                case 1327346:
                case 1343730:
                    c21847 = new C18631();
                    break;
            }
        }
        this.f56931 = c21847;
        int iMax = Math.max(iM31366 + iM13549, i2);
        if (bArr2 != null) {
            if (iM135410 > bArr2.length) {
                throw new C2796("Output length exceeds buffer size");
            }
            System.arraycopy(bArr, iM31367, bArr2, 0, iM135410);
        } else {
            InterfaceC7778 interfaceC7778 = this.f56931;
            if (interfaceC7778 != null) {
                interfaceC7778.mo1805(iM31367, iM135410, bArr);
            }
        }
        this.f56929 = iM135410;
        return Math.max(iM31367 + iM135410, iMax) - i;
    }
}
