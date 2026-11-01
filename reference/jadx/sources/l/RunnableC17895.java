package l;

/* JADX INFO: renamed from: l.ᩳۜ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U713 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC17895 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f56673;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56674;

    public /* synthetic */ RunnableC17895(int i, Object obj) {
        this.f56673 = i;
        this.f56674 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f56673;
        Object obj = this.f56674;
        switch (i) {
            case 0:
                ((C18601) obj).postInvalidateOnAnimation();
                break;
            default:
                String str = ((String[]) obj)[1];
                C9186 c9186 = C12792.f42615;
                C13465.m32966(str, "orderId");
                new Thread(new RunnableC23440(5, str)).start();
                break;
        }
    }
}
