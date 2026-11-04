package l;

/* JADX INFO: renamed from: l.ܶܶ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: OAIH */
/* JADX INFO: loaded from: classes5.dex */
public final class C16180 implements InterfaceC24457 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23640 f52514;

    public C16180(C23640 c23640) {
        this.f52514 = c23640;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C23640 c23640 = this.f52514;
        c23640.f76690.m6378(j);
        c23640.mo16842(c23640.f76690);
        c23640.mo16838(j4);
        c23640.mo16839(c23640.f76690.m6380());
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f52514.f76685;
    }

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final void mo3465() {
        C23640 c23640 = this.f52514;
        String str = (String) c23640.f76683.f69449.get();
        if (str != null) {
            c23640.mo16841(str);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C23640 c23640 = this.f52514;
        return c23640.mo924() || c23640.f76689.get() != null;
    }
}
