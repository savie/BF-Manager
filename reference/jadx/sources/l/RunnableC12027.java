package l;

/* JADX INFO: renamed from: l.ۨ֫֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 46LQ */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12027 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f38762;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9153 f38763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC7663 f38764;

    public /* synthetic */ RunnableC12027(InterfaceC7663 interfaceC7663, C9153 c9153, int i) {
        this.f38762 = i;
        this.f38764 = interfaceC7663;
        this.f38763 = c9153;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38762) {
            case 0:
                C7553.m20633((C7553) this.f38764, this.f38763);
                break;
            default:
                C17685.m41389((C17685) this.f38764, this.f38763);
                break;
        }
    }
}
