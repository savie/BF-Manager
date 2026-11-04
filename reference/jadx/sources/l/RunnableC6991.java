package l;

/* JADX INFO: renamed from: l.ۜ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P50D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6991 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23054;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23055;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23056;

    public /* synthetic */ RunnableC6991(int i, int i2, Object obj) {
        this.f23054 = i2;
        this.f23056 = obj;
        this.f23055 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23054) {
            case 0:
                ((C8482) this.f23056).accept(this.f23055);
                break;
            default:
                ((AbstractC7727) this.f23056).m21011(this.f23055);
                break;
        }
    }
}
