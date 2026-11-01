package l;

/* JADX INFO: renamed from: l.ۜۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6711 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC17295 f22617;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f22618;

    public RunnableC6711(InterfaceC17295 interfaceC17295, Object obj) {
        this.f22617 = interfaceC17295;
        this.f22618 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f22617.accept(this.f22618);
    }
}
