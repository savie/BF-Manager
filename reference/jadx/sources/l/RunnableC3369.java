package l;

/* JADX INFO: renamed from: l.ۗܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3369 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f12484;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceC19356 f12485;

    public /* synthetic */ RunnableC3369(C12543 c12543, DialogInterfaceC19356 dialogInterfaceC19356) {
        this.f12484 = c12543;
        this.f12485 = dialogInterfaceC19356;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f12484.m31202()) {
            return;
        }
        this.f12485.dismiss();
    }
}
