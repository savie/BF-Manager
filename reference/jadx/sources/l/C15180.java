package l;

/* JADX INFO: renamed from: l.ܶۧ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: M6WW */
/* JADX INFO: loaded from: classes4.dex */
public final class C15180 implements InterfaceC1692 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20824 f49564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f49565;

    public C15180(C20824 c20824, boolean z) {
        this.f49564 = c20824;
        this.f49565 = z;
    }

    @Override // l.InterfaceC1692
    /* JADX INFO: renamed from: ۙ */
    public final void mo3908(String str) {
        C20824 c20824 = this.f49564;
        c20824.m46847();
        if (c20824.m46829()) {
            C20824.m46835(c20824, str, this.f49565);
        }
    }

    @Override // l.InterfaceC1692
    public final void onCanceled() {
        this.f49564.m46847();
    }
}
