package l;

/* JADX INFO: renamed from: l.ۗᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: DAPN */
/* JADX INFO: loaded from: classes2.dex */
public final class C3393 implements InterfaceC17526 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4826 f12530;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10472 f12531;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10472 f12532;

    public C3393(C4826 c4826, C10472 c10472, C10472 c10473) {
        this.f12530 = c4826;
        this.f12532 = c10472;
        this.f12531 = c10473;
    }

    @Override // l.InterfaceC17526
    public final void beforeStart() {
        this.f12530.f16978.beforeStart();
    }

    @Override // l.InterfaceC17526
    public final void onStart() {
        this.f12530.f16978.onStart();
    }

    @Override // l.InterfaceC17526
    /* JADX INFO: renamed from: ۙ */
    public final String mo6394(String str) {
        return this.f12530.f16976.m6936(str, this.f12532.f35824.f30911, this.f12531.f35824.f30911);
    }

    @Override // l.InterfaceC17526
    public final void onFinish() {
        this.f12530.f16978.onFinish();
    }

    @Override // l.InterfaceC17526
    public final void afterFinish() {
        this.f12530.f16978.afterFinish();
    }

    @Override // l.InterfaceC17526
    public final boolean onError(Exception exc) {
        return this.f12530.f16978.onError(exc);
    }

    @Override // l.InterfaceC17526
    public final String getId() {
        StringBuilder sb = new StringBuilder();
        C4826 c4826 = this.f12530;
        sb.append(c4826.f16978.getClass());
        sb.append(":");
        sb.append(c4826.f16978.hashCode());
        sb.append(":");
        sb.append(this.f12532.f35824.f30911);
        sb.append(":");
        sb.append(this.f12531.f35824.f30911);
        return sb.toString();
    }
}
