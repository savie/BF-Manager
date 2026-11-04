package l;

/* JADX INFO: renamed from: l.ܰۙ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X4HD */
/* JADX INFO: loaded from: classes5.dex */
public final class C14361 implements InterfaceC11309 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9651 f45285;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC18837 f45286;

    public C14361(InterfaceC18837 interfaceC18837, C9651 c9651) {
        this.f45286 = interfaceC18837;
        this.f45285 = c9651;
    }

    @Override // l.InterfaceC11309
    public final void onSuccess() {
        this.f45286.mo1269(this.f45285, false);
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo28582(Exception exc) {
        return this.f45286.mo1270(exc);
    }

    @Override // l.InterfaceC11309
    /* JADX INFO: renamed from: ۙ */
    public final void mo28581() {
        this.f45286.mo1268();
    }
}
