package l;

/* JADX INFO: renamed from: l.ܳ۫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: I254 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15347 implements InterfaceC24457 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5653 f50103;

    public C15347(C5653 c5653) {
        this.f50103 = c5653;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C5653 c5653 = this.f50103;
        c5653.f19529.m6378(j);
        c5653.mo16842(c5653.f19529);
        c5653.mo16838(j4);
        c5653.mo16839(c5653.f19529.m6380());
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f50103.f19534;
    }

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final void mo3465() {
        C5653 c5653 = this.f50103;
        String str = (String) c5653.f19524.get();
        if (str != null) {
            c5653.mo16841(str);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C5653 c5653 = this.f50103;
        return c5653.mo924() || c5653.f19528.get() != null;
    }
}
