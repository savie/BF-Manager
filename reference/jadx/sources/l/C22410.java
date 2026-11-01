package l;

/* JADX INFO: renamed from: l.᩹ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28VT */
/* JADX INFO: loaded from: classes.dex */
public final class C22410 implements InterfaceC4001 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f73135;

    public C22410(Runnable runnable) {
        this.f73135 = runnable;
    }

    @Override // l.InterfaceC4001
    public final void onSuccess() {
        C19954.f63907 = false;
        this.f73135.run();
    }

    @Override // l.InterfaceC4001
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo11496(Exception exc) {
        C19954.f63907 = false;
        return false;
    }

    @Override // l.InterfaceC4001
    public final void onCanceled() {
        C19954.f63907 = false;
    }
}
