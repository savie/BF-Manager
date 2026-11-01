package l;

/* JADX INFO: renamed from: l.ۙ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W142 */
/* JADX INFO: loaded from: classes3.dex */
public class C4516 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f16072;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20267 f16073;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C16842 f16074;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f16075;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C4516 m12618(InterfaceC8978 interfaceC8978) {
        if (interfaceC8978 == null) {
            return null;
        }
        if (interfaceC8978 instanceof InterfaceC10389) {
            return new C4516((InterfaceC10389) interfaceC8978);
        }
        if (interfaceC8978 instanceof InterfaceC20267) {
            return new C4516((InterfaceC20267) interfaceC8978);
        }
        return new C4516(interfaceC8978);
    }

    public C4516(InterfaceC8978 interfaceC8978) {
        this.f16073 = new C2003(interfaceC8978);
        this.f16075 = false;
        this.f16074 = null;
    }

    public C4516(InterfaceC10389 interfaceC10389) {
        this.f16073 = new C9766(interfaceC10389);
        this.f16075 = false;
        this.f16074 = null;
    }

    public C4516(InterfaceC20267 interfaceC20267) {
        this.f16073 = interfaceC20267;
        this.f16075 = true;
        C16842 c16842Mo3131 = interfaceC20267.mo3131();
        if (c16842Mo3131 == null) {
            c16842Mo3131 = new C16842();
            c16842Mo3131.m39499();
            this.f16072 = true;
        }
        this.f16074 = c16842Mo3131;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public boolean mo2357() {
        return this.f16073.mo2357();
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo10127(long j, long j2, long j3) {
        if (this.f16075) {
            C16842 c16842 = this.f16074;
            if (j > 0) {
                c16842.m39497(j);
            }
            this.f16073.mo3130(j, j2, j3, c16842.m39496());
            return;
        }
        this.f16073.mo3130(j, j2, j3, 0L);
    }

    /* JADX INFO: renamed from: ۘۙ */
    public void mo10126() {
        this.f16073.mo2885();
    }

    /* JADX INFO: renamed from: ܰ */
    public void mo10128() {
        if (this.f16072) {
            this.f16074.m39498();
        }
    }
}
