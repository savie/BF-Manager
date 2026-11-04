package l;

/* JADX INFO: renamed from: l.ۗۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3344 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8893 f10921;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC8327 f10922;

    public /* synthetic */ RunnableC3344(C8893 c8893, DialogInterfaceC8327 dialogInterfaceC8327) {
        this.f10921 = c8893;
        this.f10922 = dialogInterfaceC8327;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f10921.m23810()) {
            return;
        }
        this.f10922.dismiss();
    }
}
