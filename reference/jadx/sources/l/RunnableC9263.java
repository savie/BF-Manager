package l;

/* JADX INFO: renamed from: l.ۡۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 79RF */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9263 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30123;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f30124;

    public /* synthetic */ RunnableC9263(int i, Object obj) {
        this.f30123 = i;
        this.f30124 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30123) {
            case 0:
                ((InterfaceC22494) this.f30124).m50722();
                break;
            case 1:
                C1863.m6394((C1863) this.f30124);
                break;
            case 2:
                ((InterfaceC19845) this.f30124).mo45704();
                break;
            default:
                ((C2088) this.f30124).postInvalidateOnAnimation();
                break;
        }
    }
}
