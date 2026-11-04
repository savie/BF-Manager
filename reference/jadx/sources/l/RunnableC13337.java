package l;

/* JADX INFO: renamed from: l.۫᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T6QN */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13337 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42548;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2984 f42549;

    public /* synthetic */ RunnableC13337(InterfaceC2984 interfaceC2984, int i) {
        this.f42548 = i;
        this.f42549 = interfaceC2984;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42548) {
            case 0:
                C16320.m38721((C16320) this.f42549);
                break;
            default:
                ((C12679) this.f42549).m31460();
                break;
        }
    }
}
