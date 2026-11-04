package l;

/* JADX INFO: renamed from: l.ܺ᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K6MS */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17181 implements InterfaceC7509 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7509 f55995;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f55996;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f55997;

    public /* synthetic */ C17181(InterfaceC7509 interfaceC7509, boolean z, AbstractActivityC17204 abstractActivityC17204) {
        this.f55995 = interfaceC7509;
        this.f55997 = z;
        this.f55996 = abstractActivityC17204;
    }

    @Override // l.InterfaceC7509
    /* JADX INFO: renamed from: ۫ */
    public final boolean mo924() {
        if (this.f55995.mo924()) {
            return true;
        }
        if (!this.f55997) {
            return false;
        }
        AbstractActivityC17204 abstractActivityC17204 = this.f55996;
        return abstractActivityC17204.isFinishing() || abstractActivityC17204.isDestroyed();
    }
}
