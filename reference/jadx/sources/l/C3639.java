package l;

/* JADX INFO: renamed from: l.ۗ᩵ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W142 */
/* JADX INFO: loaded from: classes3.dex */
public class C3639 implements InterfaceC7509 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12919 f12460;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC24457 f12461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f12462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f12463;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3639 m11788(InterfaceC23711 interfaceC23711) {
        if (interfaceC23711 == null) {
            return null;
        }
        if (interfaceC23711 instanceof InterfaceC3573) {
            return new C3639((InterfaceC3573) interfaceC23711);
        }
        if (interfaceC23711 instanceof InterfaceC24457) {
            return new C3639((InterfaceC24457) interfaceC23711);
        }
        return new C3639(interfaceC23711);
    }

    public C3639(InterfaceC23711 interfaceC23711) {
        this.f12461 = new C17809(interfaceC23711);
        this.f12463 = false;
        this.f12460 = null;
    }

    public C3639(InterfaceC3573 interfaceC3573) {
        this.f12461 = new C16317(interfaceC3573);
        this.f12463 = false;
        this.f12460 = null;
    }

    public C3639(InterfaceC24457 interfaceC24457) {
        this.f12461 = interfaceC24457;
        this.f12463 = true;
        C12919 c12919Mo12171 = interfaceC24457.mo12171();
        if (c12919Mo12171 == null) {
            c12919Mo12171 = new C12919();
            c12919Mo12171.m31997();
            this.f12462 = true;
        }
        this.f12460 = c12919Mo12171;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public boolean mo924() {
        return this.f12461.mo924();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11790(long j, long j2, long j3) {
        if (this.f12463) {
            C12919 c12919 = this.f12460;
            if (j > 0) {
                c12919.m31995(j);
            }
            this.f12461.mo12170(j, j2, j3, c12919.m31994());
            return;
        }
        this.f12461.mo12170(j, j2, j3, 0L);
    }

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public void mo11789() {
        this.f12461.mo3465();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void mo11791() {
        if (this.f12462) {
            this.f12460.m31996();
        }
    }
}
