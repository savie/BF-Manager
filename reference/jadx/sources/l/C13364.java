package l;

/* JADX INFO: renamed from: l.۫᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes4.dex */
public final class C13364 implements InterfaceC12314 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3669 f42607;

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ void mo29776(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ۤ */
    public final /* synthetic */ void mo29777(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩴ */
    public final /* synthetic */ void mo29779(InterfaceC11217 interfaceC11217) {
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩷ */
    public final void mo29780(InterfaceC11217 interfaceC11217) {
    }

    public C13364(C3669 c3669) {
        this.f42607 = c3669;
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ܳ */
    public final void mo29778(InterfaceC11217 interfaceC11217) {
        if (!this.f42607.f12633 || C3669.f12617 == null) {
            return;
        }
        C3669.f12617.m53132();
    }

    @Override // l.InterfaceC12314
    /* JADX INFO: renamed from: ᩸ */
    public final void mo29781(InterfaceC11217 interfaceC11217) {
        float[] fArr = C11369.f35782;
        boolean z = false;
        boolean z2 = ApplicationC17729.f58258.getBoolean("mbp", false);
        C3669 c3669 = this.f42607;
        if (z2 || C3669.f12617 == null) {
            c3669.f12633 = false;
            return;
        }
        if (C3669.f12617.f77121 && (C3669.f12617.f77115.isPlaying() || C3669.f12617.f77115.mo2983() || C3669.f12617.m53107())) {
            z = true;
        }
        c3669.f12633 = z;
        C3669.f12617.m53124();
    }
}
