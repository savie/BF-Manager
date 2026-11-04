package l;

/* JADX INFO: renamed from: l.᩵᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 274A */
/* JADX INFO: loaded from: classes5.dex */
public final class C20845 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16281 f66738;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f66739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC16369 f66740;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f66741;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f66742 = false;

    public C20845(C16281 c16281, InterfaceC15670 interfaceC15670, InterfaceC16369 interfaceC16369) {
        this.f66738 = c16281;
        this.f66739 = interfaceC15670;
        this.f66741 = interfaceC15670;
        this.f66740 = interfaceC16369;
    }

    public C20845(C16281 c16281, C19133 c19133, InterfaceC15670 interfaceC15670, C8440 c8440) {
        this.f66738 = c16281;
        this.f66739 = c19133;
        this.f66741 = interfaceC15670;
        this.f66740 = c8440;
    }

    public C20845(C16281 c16281, InterfaceC15670 interfaceC15670, InterfaceC15670 interfaceC15671, InterfaceC16369 interfaceC16369) {
        this.f66738 = c16281;
        this.f66739 = interfaceC15670;
        this.f66741 = interfaceC15671;
        this.f66740 = interfaceC16369;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC13433 mo3996() {
        return new C3691(this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24777 m47666(C20845 c20845, C8367 c8367) {
        C5385 c5385 = new C5385();
        c5385.m16071(c8367);
        C11350 c11350 = new C11350();
        c11350.m28659(c8367);
        c11350.m28660(c20845.f66739);
        c11350.m28658(c5385);
        c11350.m28661(new C16076());
        c11350.m28657(2);
        c11350.m28662();
        return c11350.mo3996();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC15670 m47664(C16281 c16281) {
        C8367 c8367M38629 = c16281.m38629();
        if (c8367M38629 == null) {
            return C9703.f31331;
        }
        C11350 c11350 = new C11350();
        c11350.m28659(c8367M38629);
        c11350.m28660((InterfaceC15670) null);
        c11350.m28658((C5385) null);
        c11350.m28661(new C17861());
        c11350.m28657(0);
        c11350.m28662();
        return c11350;
    }
}
