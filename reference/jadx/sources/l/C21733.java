package l;

/* JADX INFO: renamed from: l.᩷֫۫, reason: contains not printable characters */
/* JADX INFO: compiled from: E2B3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C21733 implements InterfaceC24457 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22479 f69338;

    public C21733(C22479 c22479) {
        this.f69338 = c22479;
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ۙ */
    public final void mo12170(long j, long j2, long j3, long j4) {
        C22479 c22479 = this.f69338;
        c22479.f72756.m6378(j);
        c22479.mo16842(c22479.f72756);
        c22479.mo16838(j4);
        c22479.mo16839(c22479.f72756.m6380());
    }

    @Override // l.InterfaceC24457
    /* JADX INFO: renamed from: ܺۙ */
    public final C12919 mo12171() {
        return this.f69338.f72762;
    }

    @Override // l.InterfaceC23711
    /* JADX INFO: renamed from: ֫ۙ */
    public final void mo3465() {
        C22479 c22479 = this.f69338;
        String str = (String) c22479.f72751.get();
        if (str != null) {
            c22479.mo16841(str);
        }
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        C22479 c22479 = this.f69338;
        return c22479.mo924() || c22479.f72755.get() != null;
    }
}
