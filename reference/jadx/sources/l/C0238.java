package l;

/* JADX INFO: renamed from: l.֡ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes2.dex */
public final class C0238 implements InterfaceC12414 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1425;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f1426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f1427;

    public C0238(int i) {
        this.f1427 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1607(AbstractC3384 abstractC3384) {
        this.f1425 = false;
        this.f1426 = false;
        C17352.m40379(abstractC3384, false, this);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo1609(int i) {
        if (i == this.f1427) {
            this.f1425 = true;
        }
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1606(int i) {
        if (i == this.f1427) {
            this.f1426 = true;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m1611() {
        return this.f1426;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m1608() {
        return this.f1425;
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo1610(int i) {
        mo1609(i);
    }

    @Override // l.InterfaceC12414
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo1605(int i) {
        mo1606(i);
    }
}
