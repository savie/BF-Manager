package l;

/* JADX INFO: renamed from: l.֨᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: J6S5 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1493 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5202;

    public /* synthetic */ RunnableC1493(int i, Object obj, Object obj2) {
        this.f5200 = i;
        this.f5202 = obj;
        this.f5201 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5200) {
            case 0:
                C8950 c8950 = (C8950) this.f5202;
                FutureC23690 futureC23690 = (FutureC23690) this.f5201;
                c8950.getClass();
                C21576.m49068(new RunnableC9695(0, c8950, futureC23690));
                break;
            case 1:
                C4374.m13880((C4374) this.f5202, this.f5201);
                break;
            default:
                C22713.m51207((C22713) this.f5202, (C17074) this.f5201);
                break;
        }
    }
}
