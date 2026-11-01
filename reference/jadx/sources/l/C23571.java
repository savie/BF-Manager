package l;

/* JADX INFO: renamed from: l.᩻۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 89UN */
/* JADX INFO: loaded from: classes2.dex */
public final class C23571 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f76358;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte[] f76359;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC6240, l.InterfaceC4913
    /* JADX INFO: renamed from: ۙ */
    public final void mo5635(InterfaceC3314 interfaceC3314) {
        if (mo17295()) {
            interfaceC3314.mo24572(m31344());
        }
        super.mo5635(interfaceC3314);
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܶۙ */
    public final boolean mo17998() {
        return m31351() != -1073741802 && super.mo17998();
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 9) {
            throw new C2796("Structure size != 9");
        }
        this.f76358 = C4850.m13545(i + 2, bArr);
        int iM13545 = C4850.m13545(i + 4, bArr);
        int iM13546 = C4850.m13545(i + 6, bArr);
        int i2 = i + 8;
        int iM31366 = i2 - (m31366() + iM13545);
        this.f76359 = new byte[iM13546];
        System.arraycopy(bArr, m31366() + iM13545, this.f76359, 0, iM13546);
        return ((i2 + iM31366) + iM13546) - i;
    }

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52001() {
        return (this.f76358 & 3) != 0;
    }

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public final int m52002() {
        return this.f76358;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m52000() {
        return this.f76359;
    }
}
