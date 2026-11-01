package l;

/* JADX INFO: renamed from: l.ܺ۫᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes4.dex */
public final class C15944 implements InterfaceC4001 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14558 f51644;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17354 f51645;

    public C15944(InterfaceC17354 interfaceC17354, C14558 c14558) {
        this.f51645 = interfaceC17354;
        this.f51644 = c14558;
    }

    @Override // l.InterfaceC4001
    public final void onSuccess() {
        this.f51645.mo6536(this.f51644, false);
    }

    @Override // l.InterfaceC4001
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11496(Exception exc) {
        return this.f51645.mo6537(exc);
    }

    @Override // l.InterfaceC4001
    public final void onCanceled() {
        this.f51645.onCanceled();
    }
}
