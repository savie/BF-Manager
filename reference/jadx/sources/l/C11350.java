package l;

/* JADX INFO: renamed from: l.ۧۘۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: V742 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11350 implements InterfaceC15670 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC15670 f35748;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public InterfaceC23130 f35749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC15079 f35751;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f35753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f35754;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C24622 f35747 = new C24622();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC23285 f35752 = InterfaceC23285.f75442;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f35750 = true;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28659(C8367 c8367) {
        this.f35751 = c8367;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28658(C5385 c5385) {
        this.f35749 = c5385;
        this.f35754 = c5385 == null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28661(InterfaceC23285 interfaceC23285) {
        this.f35752 = interfaceC23285;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28660(InterfaceC15670 interfaceC15670) {
        this.f35748 = interfaceC15670;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28657(int i) {
        this.f35753 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m28662() {
        this.f35750 = false;
    }

    @Override // l.InterfaceC15670
    /* JADX INFO: renamed from: ۙ */
    public final C24777 mo3996() {
        InterfaceC15670 interfaceC15670 = this.f35748;
        C1656 c1656M16070 = null;
        InterfaceC13433 interfaceC13433Mo3996 = interfaceC15670 != null ? interfaceC15670.mo3996() : null;
        int i = this.f35753;
        InterfaceC15079 interfaceC15079 = this.f35751;
        interfaceC15079.getClass();
        if (!this.f35754 && interfaceC13433Mo3996 != null) {
            InterfaceC23130 interfaceC23130 = this.f35749;
            if (interfaceC23130 == null) {
                C5385 c5385 = new C5385();
                c5385.m16071(interfaceC15079);
                c1656M16070 = c5385.m16070();
            } else {
                c1656M16070 = ((C5385) interfaceC23130).m16070();
            }
        }
        return new C24777(interfaceC15079, interfaceC13433Mo3996, this.f35747.mo3996(), c1656M16070, this.f35752, i, this.f35750);
    }
}
