package l;

/* JADX INFO: renamed from: l.ۙ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes3.dex */
public final class C4552 implements InterfaceC0686 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f16164;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f16165;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C9771 f16166;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f16167;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f16168 = true;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C9946 f16169;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C18585 f16170;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1569 f16171;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC0686 f16172;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final InterfaceC21569 f16173;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C18585 f16174;

    public C4552(AbstractC7629 abstractC7629, C0823 c0823, InterfaceC21569 interfaceC21569) {
        this.f16173 = interfaceC21569;
        C9771 c9771 = new C9771(null, abstractC7629, c0823, EnumC18722.NORMAL, null);
        c9771.m25473(new C22452(interfaceC21569));
        this.f16166 = c9771;
        C7051 c7051 = new C7051(this, interfaceC21569);
        this.f16174 = c7051;
        C13762 c13762 = new C13762(this);
        this.f16170 = c13762;
        C1569 c1569 = new C1569(abstractC7629, c9771, c7051);
        this.f16171 = c1569;
        this.f16169 = new C9946(c9771, c13762);
        this.f16172 = c1569;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14292(C4552 c4552, C14902 c14902, InterfaceC0686 interfaceC0686, C18585 c18585, C18585 c18586) {
        c4552.f16172.reset();
        c4552.f16172 = interfaceC0686;
        c18585.m43166(InterfaceC0686.f2581);
        c18586.m43166(c4552.f16173);
        c4552.f16165 = false;
        c4552.f16164 = true;
        c4552.f16172.mo2980(c14902);
    }

    @Override // l.InterfaceC0686
    public final void reset() {
        this.f16172.reset();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2979(int i, RunnableC11872 runnableC11872) {
        this.f16172.mo2979(i, runnableC11872);
    }

    @Override // l.InterfaceC0686
    public final int getCurrentPosition() {
        return this.f16172.getCurrentPosition();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2984() {
        this.f16172.mo2984();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩸ */
    public final void mo2985() {
        this.f16172.mo2985();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2977() {
        this.f16171.mo2977();
        this.f16169.mo2977();
        C9771 c9771 = this.f16166;
        c9771.m25476();
        c9771.m25474();
        this.f16167 = true;
    }

    @Override // l.InterfaceC0686
    public final void pause() {
        if (this.f16164) {
            return;
        }
        if (this.f16165) {
            this.f16172.pause();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC0686
    public final void start() {
        if (this.f16164) {
            return;
        }
        if (this.f16165) {
            this.f16172.start();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2980(C14902 c14902) {
        boolean z;
        if (this.f16164 || this.f16167) {
            throw new IllegalStateException();
        }
        C20870 c20870 = c14902.f48681;
        if (c20870 != null) {
            Object obj = c20870.f66803;
            if ((obj instanceof InterfaceC2386) && ((InterfaceC2386) obj).getName().toLowerCase().endsWith(".wav")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.f16168 = z;
        InterfaceC0686 interfaceC0686 = z ? this.f16171 : this.f16169;
        InterfaceC0686 interfaceC0687 = this.f16172;
        if (interfaceC0687 != interfaceC0686) {
            interfaceC0687.reset();
            this.f16172 = interfaceC0686;
            InterfaceC21569 interfaceC21569 = this.f16173;
            C18585 c18585 = this.f16174;
            InterfaceC21569 interfaceC215610 = InterfaceC0686.f2581;
            C18585 c18586 = this.f16170;
            if (z) {
                c18586.m43166(interfaceC215610);
                c18585.m43166(interfaceC21569);
            } else {
                c18585.m43166(interfaceC215610);
                c18586.m43166(interfaceC21569);
            }
        }
        this.f16165 = false;
        this.f16164 = true;
        this.f16172.mo2980(c14902);
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo2983() {
        return this.f16164;
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۙ */
    public final void mo2978(float f) {
        if (this.f16165) {
            this.f16172.mo2978(f);
        }
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo2981() {
        return this.f16165;
    }

    @Override // l.InterfaceC0686
    public final boolean isPlaying() {
        return this.f16172.isPlaying();
    }

    @Override // l.InterfaceC0686
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo2982() {
        return this.f16167;
    }
}
