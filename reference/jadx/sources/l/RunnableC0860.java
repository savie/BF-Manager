package l;

/* JADX INFO: renamed from: l.֨ۘۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0860 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3512;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3513;

    public /* synthetic */ RunnableC0860(int i, Object obj) {
        this.f3512 = i;
        this.f3513 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3512) {
            case 0:
                ((ActivityC4471) this.f3513).finish();
                break;
            case 1:
                ((ActivityC11632) this.f3513).m29017(false);
                break;
            case 2:
                C3040.m9080((C3040) this.f3513);
                break;
            default:
                C0346.m2011((C17485) this.f3513);
                break;
        }
    }
}
