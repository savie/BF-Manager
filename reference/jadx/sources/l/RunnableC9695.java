package l;

/* JADX INFO: renamed from: l.ۡ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9695 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31303;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31304;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31305;

    public /* synthetic */ RunnableC9695(int i, Object obj, Object obj2) {
        this.f31303 = i;
        this.f31305 = obj;
        this.f31304 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31303) {
            case 0:
                C8950.m23926((C8950) this.f31305, (FutureC23690) this.f31304);
                break;
            default:
                C22713.m51201((C22713) this.f31305, (C15253) this.f31304);
                break;
        }
    }
}
