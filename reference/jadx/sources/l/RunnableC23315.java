package l;

/* JADX INFO: renamed from: l.᩺᩻֨, reason: contains not printable characters */
/* JADX INFO: compiled from: A6XJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC23315 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f75587;

    public /* synthetic */ RunnableC23315(int i) {
        this.f75587 = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.f75587) {
            case 0:
                int i = ServiceC8498.f29454;
                try {
                    C4205.m11860();
                } catch (C7028 e) {
                    C0577.m2747("MT MCP radare2 prewarm failed", e);
                    return;
                }
                break;
            default:
                C16924.m39612();
                break;
        }
    }
}
