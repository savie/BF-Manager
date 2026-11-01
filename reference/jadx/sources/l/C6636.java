package l;

/* JADX INFO: renamed from: l.ۜ۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 59V3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6636 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f22414;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f22415;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f22416;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C6636(int i, InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601);
        this.f22414 = bArr;
        this.f22416 = i;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final int m17997() {
        return this.f22415;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        int iM13545 = C4850.m13545(i, bArr);
        if (iM13545 == 9) {
            return m31352(i, bArr);
        }
        if (iM13545 != 17) {
            throw new C2796("Expected structureSize = 17");
        }
        short s = bArr[i + 2];
        this.f22415 = C4850.m13549(i + 4, bArr);
        C4850.m13549(i + 8, bArr);
        int i2 = i + 16;
        int iM31366 = m31366() + s;
        int i3 = this.f22415;
        int i4 = this.f22416;
        int i5 = i3 + i4;
        byte[] bArr2 = this.f22414;
        if (i5 > bArr2.length) {
            throw new C2796("Buffer to small for read response");
        }
        System.arraycopy(bArr, iM31366, bArr2, i4, i3);
        return Math.max(i2, iM31366 + this.f22415) - i;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo17998() {
        return m31351() != -2147483643 && super.mo17998();
    }
}
