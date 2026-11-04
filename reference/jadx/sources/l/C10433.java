package l;

/* JADX INFO: renamed from: l.ۢ᩹۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 28AQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C10433 implements InterfaceC24457 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1485 f33159;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12919 f33160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC24628 f33161;

    public C10433(C1485 c1485, InterfaceC24628 interfaceC24628, C12919 c12919) {
        this.f33159 = c1485;
        this.f33161 = interfaceC24628;
        this.f33160 = c12919;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C1485 c1485 = this.f33159;
        c1485.f5161.m6378(j);
        C4424 c4424 = c1485.f5161;
        InterfaceC24628 interfaceC24628 = this.f33161;
        interfaceC24628.mo12113(c4424);
        interfaceC24628.mo12115(j4);
        interfaceC24628.setProgress(c1485.f5161.m6380());
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        return this.f33159.f5169.mo924();
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f33160;
    }

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final void mo3465() {
        String str = (String) this.f33159.f5160.get();
        if (str != null) {
            this.f33161.setName(str);
        }
    }
}
