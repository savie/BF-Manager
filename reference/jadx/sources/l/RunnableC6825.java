package l;

/* JADX INFO: renamed from: l.ۜܳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6825 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20502 f23000;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23001;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC10625 f23002;

    public /* synthetic */ RunnableC6825(InterfaceC10625 interfaceC10625, C20502 c20502, int i) {
        this.f23001 = i;
        this.f23002 = interfaceC10625;
        this.f23000 = c20502;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23001) {
            case 0:
                C8943.m23236((C8943) this.f23002, this.f23000);
                break;
            default:
                C10916.m27361((C10916) this.f23002, this.f23000);
                break;
        }
    }
}
