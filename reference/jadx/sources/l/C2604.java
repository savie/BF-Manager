package l;

/* JADX INFO: renamed from: l.ۖܶۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2604 implements InterfaceC5657 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final String f10205;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C13895 f10206;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f10207;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8079(AbstractC3062 abstractC3062, C20690 c20690) {
        C13465.m32966(c20690, "registry");
        C13465.m32966(abstractC3062, "lifecycle");
        if (this.f10207) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f10207 = true;
        abstractC3062.mo9171(this);
        c20690.m46525(this.f10205, this.f10206.m33732());
    }

    public C2604(String str, C13895 c13895) {
        this.f10205 = str;
        this.f10206 = c13895;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13895 m8078() {
        return this.f10206;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m8080() {
        return this.f10207;
    }

    @Override // l.InterfaceC5657
    /* JADX INFO: renamed from: ۙ */
    public final void mo4164(InterfaceC1423 interfaceC1423, EnumC1651 enumC1651) {
        if (enumC1651 == EnumC1651.ON_DESTROY) {
            this.f10207 = false;
            interfaceC1423.getLifecycle().mo9172(this);
        }
    }
}
