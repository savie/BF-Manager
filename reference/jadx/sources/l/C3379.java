package l;

/* JADX INFO: renamed from: l.ۗۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 81Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3379 implements InterfaceC23517 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f11007;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f11008 = 1;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC23517 f11009;

    public C3379(InterfaceC23517 interfaceC23517) {
        this.f11009 = interfaceC23517;
    }

    @Override // l.InterfaceC23517
    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final void mo11092() {
        this.f11009.mo11092();
    }

    @Override // l.InterfaceC23517
    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final void mo11095() {
        this.f11009.mo11095();
    }

    @Override // l.InterfaceC23517
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void mo11090() {
        this.f11009.mo11090();
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m11091(int i) {
        if (i <= 0) {
            i = 1;
        }
        this.f11008 = i;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11093(int i) {
        this.f11007 += i;
    }

    @Override // l.InterfaceC23517
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo11094(int i) {
        this.f11009.mo11094((i / this.f11008) + this.f11007);
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f11009.mo924();
    }
}
