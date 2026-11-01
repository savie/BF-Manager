package l;

/* JADX INFO: renamed from: l.ۛܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81VV */
/* JADX INFO: loaded from: classes3.dex */
public class C6090 implements InterfaceC17379 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f20606;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC17379 f20607;

    public C6090(InterfaceC17379 interfaceC17379) {
        this.f20607 = interfaceC17379;
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ܽ */
    public void mo2650() {
        this.f20606 = false;
        this.f20607.mo2650();
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ۙ */
    public final void mo2647(boolean z, boolean z2) {
        this.f20606 = true;
        this.f20607.mo2647(z, z2);
    }

    @Override // l.InterfaceC17379
    /* JADX INFO: renamed from: ۙ */
    public final void mo2646(int i, int i2) {
        float f = i2;
        this.f20607.mo2646(i, (int) (this.f20606 ? (f * 0.3f) + 70.0f : f * 0.7f));
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f20607.mo2357();
    }
}
