package l;

import java.util.LinkedList;

/* JADX INFO: renamed from: l.ܰ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: P9V5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13693 extends AbstractC6240 implements InterfaceC22553 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC4314 f45163 = C13488.m32997(C13693.class);

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f45164;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public long f45165;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public byte[] f45166;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final String f45167;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2006[] f45168;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f45169;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C13693(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
        this.f45166 = new byte[16];
        this.f45167 = str;
    }

    @Override // l.AbstractC6240, l.InterfaceC4913
    /* JADX INFO: renamed from: ۙ */
    public final void mo5635(InterfaceC3314 interfaceC3314) {
        if (mo17295() && (interfaceC3314 instanceof InterfaceC16824)) {
            ((InterfaceC16824) interfaceC3314).mo3798(this.f45166);
        }
        super.mo5635(interfaceC3314);
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return this.f45164;
    }

    @Override // l.InterfaceC22553
    public final long getSize() {
        return this.f45165;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final long m33398() {
        return this.f45165;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f45169;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m33399() {
        return this.f45166;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        int iM13549;
        if (C4850.m13545(i, bArr) != 89) {
            throw new C2796("Structure size is not 89");
        }
        byte b = bArr[i + 2];
        byte b2 = bArr[i + 3];
        C4850.m13549(i + 4, bArr);
        C4850.m13543(i + 8, bArr);
        C4850.m13543(i + 16, bArr);
        this.f45164 = C4850.m13543(i + 24, bArr);
        C4850.m13543(i + 32, bArr);
        C4850.m13547(i + 40, bArr);
        this.f45165 = C4850.m13547(i + 48, bArr);
        this.f45169 = C4850.m13549(i + 56, bArr);
        byte[] bArr2 = this.f45166;
        System.arraycopy(bArr, i + 64, bArr2, 0, 16);
        int iM135410 = C4850.m13549(i + 80, bArr);
        int iM135411 = C4850.m13549(i + 84, bArr);
        int iMax = i + 88;
        if (iM135410 > 0 && iM135411 > 0) {
            LinkedList linkedList = new LinkedList();
            int iM31366 = m31366() + iM135410;
            do {
                iM13549 = C4850.m13549(iM31366, bArr);
                int iM13545 = C4850.m13545(iM31366 + 4, bArr);
                int iM13546 = C4850.m13545(iM31366 + 6, bArr);
                int iM13547 = C4850.m13545(iM31366 + 10, bArr);
                int iM135412 = C4850.m13549(iM31366 + 12, bArr);
                int i2 = iM13545 + iM31366;
                System.arraycopy(bArr, i2, new byte[iM13546], 0, iM13546);
                int iMax2 = Math.max(Math.max(iM31366 + 16, i2 + iM13546), iM13547 + iM31366 + iM135412);
                if (iM13549 > 0) {
                    iM31366 += iM13549;
                }
                iMax = Math.max(iMax, iMax2);
            } while (iM13549 > 0);
            this.f45168 = (InterfaceC2006[]) linkedList.toArray(new InterfaceC2006[0]);
        }
        InterfaceC4314 interfaceC4314 = f45163;
        if (interfaceC4314.mo12125()) {
            interfaceC4314.mo12135("Opened " + this.f45167 + ": " + C5993.m16281(bArr2, 0, bArr2.length));
        }
        return iMax - i;
    }
}
