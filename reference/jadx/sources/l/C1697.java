package l;

/* JADX INFO: renamed from: l.֫۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: TA0G */
/* JADX INFO: loaded from: classes3.dex */
public final class C1697 extends AbstractC6240 implements InterfaceC7030 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public int f6717;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f6718;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final String mo5638() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.AbstractC6240, l.InterfaceC4913
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5635(InterfaceC3314 interfaceC3314) {
        if (mo17295()) {
            ((AbstractC12591) interfaceC3314).m31350(m31367());
        }
        super.mo5635(interfaceC3314);
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean mo5636() {
        return m31367() != -1;
    }

    @Override // l.InterfaceC7030
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo5637() {
        return (this.f6717 & 3) != 0 || (this.f6718 & 8) == 8;
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        if (C4850.m13545(i, bArr) != 16) {
            throw new C2796("Structure size is not 16");
        }
        byte b = bArr[i + 2];
        this.f6717 = C4850.m13549(i + 4, bArr);
        this.f6718 = C4850.m13549(i + 8, bArr);
        C4850.m13549(i + 12, bArr);
        return (i + 16) - i;
    }
}
