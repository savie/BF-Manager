package l;

/* JADX INFO: renamed from: l.ۗۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3117 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10090;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f10091;

    public /* synthetic */ RunnableC3117(C24132 c24132, int i) {
        this.f10090 = i;
        this.f10091 = c24132;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10090) {
            case 0:
                this.f10091.m53767();
                break;
            default:
                C24132.m53846(this.f10091);
                break;
        }
    }
}
