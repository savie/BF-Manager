package l;

/* JADX INFO: renamed from: l.ۡ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1H1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9725 implements InterfaceC5252, AutoCloseable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C10471 f31374;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final String f31375;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f31376;

    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25316(AbstractC8585 abstractC8585, C15266 c15266) {
        C15243.m36590(c15266, "registry");
        C15243.m36590(abstractC8585, "lifecycle");
        if (this.f31376) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f31376 = true;
        abstractC8585.mo23077(this);
        c15266.m36621(this.f31375, this.f31374.m26893());
    }

    public C9725(String str, C10471 c10471) {
        this.f31375 = str;
        this.f31374 = c10471;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10471 m25315() {
        return this.f31374;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m25317() {
        return this.f31376;
    }

    @Override // l.InterfaceC5252
    /* JADX INFO: renamed from: ۙ */
    public final void mo2183(InterfaceC11217 interfaceC11217, EnumC9330 enumC9330) {
        if (enumC9330 == EnumC9330.ON_DESTROY) {
            this.f31376 = false;
            interfaceC11217.getLifecycle().mo23078(this);
        }
    }
}
