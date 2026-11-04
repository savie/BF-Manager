package l;

/* JADX INFO: renamed from: l.ۛ᩶ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: E8KH */
/* JADX INFO: loaded from: classes3.dex */
public final class C6634 implements InterfaceC11986 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public InterfaceC4002 f22155;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C2510 f22156;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f22157 = true;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public InterfaceC11986 f22158;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f22159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final InterfaceC12599 f22160;

    public C6634(InterfaceC12599 interfaceC12599, InterfaceC14814 interfaceC14814) {
        this.f22160 = interfaceC12599;
        this.f22156 = new C2510(interfaceC14814);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18569() {
        this.f22159 = true;
        this.f22156.m8394();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18572() {
        this.f22159 = false;
        this.f22156.m8399();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18570(long j) {
        this.f22156.m8395(j);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m18573(InterfaceC4002 interfaceC4002) throws C18566 {
        InterfaceC11986 interfaceC11986;
        InterfaceC11986 interfaceC11986Mo12947 = interfaceC4002.mo12947();
        if (interfaceC11986Mo12947 == null || interfaceC11986Mo12947 == (interfaceC11986 = this.f22158)) {
            return;
        }
        if (interfaceC11986 != null) {
            throw C18566.m43144(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f22158 = interfaceC11986Mo12947;
        this.f22155 = interfaceC4002;
        interfaceC11986Mo12947.mo8396(this.f22156.mo8397());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18571(InterfaceC4002 interfaceC4002) {
        if (interfaceC4002 == this.f22155) {
            this.f22158 = null;
            this.f22155 = null;
            this.f22157 = true;
        }
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ᩹ */
    public final long mo8400() {
        if (this.f22157) {
            return this.f22156.mo8400();
        }
        InterfaceC11986 interfaceC11986 = this.f22158;
        interfaceC11986.getClass();
        return interfaceC11986.mo8400();
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۧ */
    public final boolean mo8398() {
        if (this.f22157) {
            this.f22156.getClass();
            return false;
        }
        InterfaceC11986 interfaceC11986 = this.f22158;
        interfaceC11986.getClass();
        return interfaceC11986.mo8398();
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۙ */
    public final void mo8396(C7445 c7445) {
        InterfaceC11986 interfaceC11986 = this.f22158;
        if (interfaceC11986 != null) {
            interfaceC11986.mo8396(c7445);
            c7445 = this.f22158.mo8397();
        }
        this.f22156.mo8396(c7445);
    }

    @Override // l.InterfaceC11986
    /* JADX INFO: renamed from: ۤ */
    public final C7445 mo8397() {
        InterfaceC11986 interfaceC11986 = this.f22158;
        if (interfaceC11986 != null) {
            return interfaceC11986.mo8397();
        }
        return this.f22156.mo8397();
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m18568(boolean z) {
        C7445 c7445Mo8397;
        InterfaceC4002 interfaceC4002 = this.f22155;
        C2510 c2510 = this.f22156;
        if (interfaceC4002 == null || interfaceC4002.mo11190() || ((z && this.f22155.getState() != 2) || (!this.f22155.mo11189() && (z || this.f22155.mo12948())))) {
            this.f22157 = true;
            if (this.f22159) {
                c2510.m8394();
            }
        } else {
            InterfaceC11986 interfaceC11986 = this.f22158;
            interfaceC11986.getClass();
            long jMo8400 = interfaceC11986.mo8400();
            if (!this.f22157) {
                c2510.m8395(jMo8400);
                c7445Mo8397 = interfaceC11986.mo8397();
                if (!c7445Mo8397.equals(c2510.mo8397())) {
                    c2510.mo8396(c7445Mo8397);
                    ((C11240) this.f22160).m28449(c7445Mo8397);
                }
            } else if (jMo8400 < c2510.mo8400()) {
                c2510.m8399();
            } else {
                this.f22157 = false;
                if (this.f22159) {
                    c2510.m8394();
                }
                c2510.m8395(jMo8400);
                c7445Mo8397 = interfaceC11986.mo8397();
                if (!c7445Mo8397.equals(c2510.mo8397())) {
                    c2510.mo8396(c7445Mo8397);
                    ((C11240) this.f22160).m28449(c7445Mo8397);
                }
            }
        }
        return mo8400();
    }
}
