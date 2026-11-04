package l;

/* JADX INFO: renamed from: l.ۡۤۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6Y9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9309 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30246;

    public /* synthetic */ RunnableC9309(int i) {
        this.f30246 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30246) {
            case 0:
                C6679.m18693();
                break;
            default:
                int i = ServiceC6459.f21716;
                try {
                    C7735.m21061();
                } catch (C18922 e) {
                    C20653.m47272("MT MCP radare2 prewarm failed", e);
                }
                break;
        }
    }
}
