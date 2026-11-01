package l;

/* JADX INFO: renamed from: l.ۖ᩻ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2853 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10779;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f10780;

    public /* synthetic */ RunnableC2853(C6111 c6111, int i) {
        this.f10779 = i;
        this.f10780 = c6111;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10779) {
            case 0:
                C6111.m16740(this.f10780);
                break;
            default:
                this.f10780.requestFocus();
                break;
        }
    }
}
