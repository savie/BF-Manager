package l;

/* JADX INFO: renamed from: l.᩷֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC20519 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f66495;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f66496;

    public /* synthetic */ RunnableC20519(int i, Object obj) {
        this.f66495 = i;
        this.f66496 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f66495) {
            case 0:
                ((InterfaceC10642) this.f66496).m26831();
                break;
            case 1:
                C17648.m41121(((C16714) this.f66496).f53512);
                break;
            default:
                ((AbstractC12652) this.f66496).cancel();
                break;
        }
    }
}
