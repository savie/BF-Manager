package l;

/* JADX INFO: renamed from: l.ۘۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4125 implements InterfaceC11442 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f13992;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f13993;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f13994;

    public C4125(int i) {
        this.f13994 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13233(AbstractC12384 abstractC12384) {
        this.f13992 = false;
        this.f13993 = false;
        C24869.m55395(abstractC12384, false, this);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۤ */
    public final void mo2553(int i) {
        if (i == this.f13994) {
            this.f13992 = true;
        }
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ۙ */
    public final void mo2552(int i) {
        if (i == this.f13994) {
            this.f13993 = true;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m13235() {
        return this.f13993;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m13234() {
        return this.f13992;
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2554(int i) {
        mo2553(i);
    }

    @Override // l.InterfaceC11442
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2555(int i) {
        mo2552(i);
    }
}
