package l;

/* JADX INFO: renamed from: l.۠ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I29D */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC8017 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26271;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26272;

    public /* synthetic */ RunnableC8017(int i, Object obj) {
        this.f26271 = i;
        this.f26272 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f26271;
        Object obj = this.f26272;
        switch (i) {
            case 0:
                C5900.m16153((C5900) obj);
                break;
            case 1:
                ((C11734) obj).f39442.setVisibility(0);
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
