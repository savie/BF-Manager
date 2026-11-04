package l;

/* JADX INFO: renamed from: l.۟᩷᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: P8NZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8160 implements InterfaceC2436 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26926;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13500 f26927;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15648 f26928;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22847 f26929;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f26930;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public InterfaceC4365 f26931;

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8210() {
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8211(C3509 c3509) {
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2436 mo8213(boolean z) {
        return this;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final /* bridge */ /* synthetic */ InterfaceC2436 mo8212(InterfaceC4365 interfaceC4365) {
        m22075(interfaceC4365);
        return this;
    }

    public C8160(InterfaceC15670 interfaceC15670, InterfaceC1603 interfaceC1603) {
        C22847 c22847 = new C22847(interfaceC1603);
        C13500 c13500 = new C13500();
        C20773 c20773 = new C20773();
        this.f26930 = interfaceC15670;
        this.f26929 = c22847;
        this.f26927 = c13500;
        this.f26931 = c20773;
        this.f26926 = 1048576;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m22075(InterfaceC4365 interfaceC4365) {
        C20782.m47563(interfaceC4365, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f26931 = interfaceC4365;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22074(C15648 c15648) {
        this.f26928 = c15648;
    }

    @Override // l.InterfaceC2436
    /* JADX INFO: renamed from: ۙ */
    public final C19347 mo8214(C14902 c14902) {
        c14902.f48681.getClass();
        return new C19347(c14902, this.f26930, this.f26929, this.f26927.m33171(c14902), this.f26931, this.f26926, this.f26928);
    }
}
