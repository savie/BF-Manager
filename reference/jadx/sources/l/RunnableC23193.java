package l;

/* JADX INFO: renamed from: l.᩹֨, reason: contains not printable characters */
/* JADX INFO: compiled from: DB1R */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23193 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0818 f75160;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f75161;

    public RunnableC23193(InterfaceC0818 interfaceC0818, Object obj) {
        this.f75160 = interfaceC0818;
        this.f75161 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f75160.accept(this.f75161);
    }
}
