package l;

/* JADX INFO: renamed from: l.۬ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H8BL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13762 extends C18585 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4552 f43685;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13762(C4552 c4552) {
        super(InterfaceC0686.f2581);
        this.f43685 = c4552;
    }

    @Override // l.C18585, l.InterfaceC21569
    /* JADX INFO: renamed from: ᩷ */
    public final void mo19390(C14902 c14902, Exception exc) {
        boolean zM49278 = C21706.m49278(exc);
        C4552 c4552 = this.f43685;
        if (!zM49278 && !c4552.f16168 && !c4552.mo2982()) {
            C4552.m14292(c4552, c14902, c4552.f16171, c4552.f16170, c4552.f16174);
            return;
        }
        c4552.f16164 = false;
        c4552.f16165 = false;
        super.mo19390(c14902, exc);
    }

    @Override // l.C18585, l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo19388(C14902 c14902, Exception exc) {
        C4552 c4552 = this.f43685;
        if (!c4552.f16168 && !c4552.mo2982()) {
            C4552.m14292(c4552, c14902, c4552.f16171, c4552.f16170, c4552.f16174);
            return;
        }
        c4552.f16164 = false;
        c4552.f16165 = false;
        super.mo19388(c14902, exc);
    }

    @Override // l.C18585, l.InterfaceC21569
    /* JADX INFO: renamed from: ۙ */
    public final void mo19389(C14902 c14902, C19093 c19093, long j) {
        C4552 c4552 = this.f43685;
        c4552.f16164 = false;
        c4552.f16165 = true;
        super.mo19389(c14902, c19093, j);
    }
}
