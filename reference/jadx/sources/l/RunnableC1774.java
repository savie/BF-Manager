package l;

/* JADX INFO: renamed from: l.֫ۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1774 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6909;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6910;

    public /* synthetic */ RunnableC1774(int i, Object obj) {
        this.f6909 = i;
        this.f6910 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6909) {
            case 0:
                C6111.m16637((C6111) this.f6910);
                break;
            case 1:
                ((ActivityC1086) this.f6910).invalidateOptionsMenu();
                break;
            case 2:
                ((C12667) this.f6910).mo26443();
                break;
            default:
                ((C17485) this.f6910).m40694();
                break;
        }
    }
}
