package l;

/* JADX INFO: renamed from: l.ܶ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C15439 implements InterfaceC8530 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f50310 = true;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7824 f50311;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f50312;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C7677 f50313;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f50314;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11601 f50315;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f50316;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public InterfaceC8530 f50317;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C19113 f50318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16186 f50319;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C19113 f50320;

    public C15439(AbstractC9677 abstractC9677, C2427 c2427, InterfaceC7824 interfaceC7824) {
        this.f50311 = interfaceC7824;
        C11601 c11601 = new C11601(null, abstractC9677, c2427, EnumC13718.NORMAL, null);
        c11601.m28926(new C18966(interfaceC7824));
        this.f50315 = c11601;
        C6971 c6971 = new C6971(this, interfaceC7824);
        this.f50320 = c6971;
        C23200 c23200 = new C23200(this);
        this.f50318 = c23200;
        C7677 c7677 = new C7677(abstractC9677, c11601, c6971);
        this.f50313 = c7677;
        this.f50319 = new C16186(c11601, c23200);
        this.f50317 = c7677;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36950(C15439 c15439, C13689 c13689, InterfaceC8530 interfaceC8530, C19113 c19113, C19113 c19114) {
        c15439.f50317.reset();
        c15439.f50317 = interfaceC8530;
        c19113.m43915(InterfaceC8530.f29532);
        c19114.m43915(c15439.f50311);
        c15439.f50316 = false;
        c15439.f50312 = true;
        c15439.f50317.mo20301(c13689);
    }

    @Override // l.InterfaceC8530
    public final void reset() {
        this.f50317.reset();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20300(int i, RunnableC11352 runnableC11352) {
        this.f50317.mo20300(i, runnableC11352);
    }

    @Override // l.InterfaceC8530
    public final int getCurrentPosition() {
        return this.f50317.getCurrentPosition();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ܰ */
    public final void mo20304() {
        this.f50317.mo20304();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۖ */
    public final void mo20297() {
        this.f50317.mo20297();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20298() {
        this.f50313.mo20298();
        this.f50319.mo20298();
        C11601 c11601 = this.f50315;
        c11601.m28927();
        c11601.m28928();
        this.f50314 = true;
    }

    @Override // l.InterfaceC8530
    public final void pause() {
        if (this.f50312) {
            return;
        }
        if (this.f50316) {
            this.f50317.pause();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    @Override // l.InterfaceC8530
    public final void start() {
        if (this.f50312) {
            return;
        }
        if (this.f50316) {
            this.f50317.start();
            return;
        }
        throw new IllegalStateException("MusicPlayer is not prepared");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20301(C13689 c13689) {
        boolean z;
        if (this.f50312 || this.f50314) {
            throw new IllegalStateException();
        }
        C14704 c14704 = c13689.f45157;
        if (c14704 != null) {
            Object obj = c14704.f48035;
            if ((obj instanceof InterfaceC2557) && ((InterfaceC2557) obj).getName().toLowerCase().endsWith(".wav")) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = true;
        }
        this.f50310 = z;
        InterfaceC8530 interfaceC8530 = z ? this.f50313 : this.f50319;
        InterfaceC8530 interfaceC8531 = this.f50317;
        if (interfaceC8531 != interfaceC8530) {
            interfaceC8531.reset();
            this.f50317 = interfaceC8530;
            InterfaceC7824 interfaceC7824 = this.f50311;
            C19113 c19113 = this.f50320;
            InterfaceC7824 interfaceC7825 = InterfaceC8530.f29532;
            C19113 c19114 = this.f50318;
            if (z) {
                c19114.m43915(interfaceC7825);
                c19113.m43915(interfaceC7824);
            } else {
                c19113.m43915(interfaceC7825);
                c19114.m43915(interfaceC7824);
            }
        }
        this.f50316 = false;
        this.f50312 = true;
        this.f50317.mo20301(c13689);
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo20302() {
        return this.f50312;
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۙ */
    public final void mo20299(float f) {
        if (this.f50316) {
            this.f50317.mo20299(f);
        }
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo20303() {
        return this.f50316;
    }

    @Override // l.InterfaceC8530
    public final boolean isPlaying() {
        return this.f50317.isPlaying();
    }

    @Override // l.InterfaceC8530
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo20296() {
        return this.f50314;
    }
}
