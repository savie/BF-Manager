package l;

/* JADX INFO: renamed from: l.ܳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B4S2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14540 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47611;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f47612;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f47613;

    public /* synthetic */ RunnableC14540(int i, int i2, Object obj) {
        this.f47612 = i2;
        this.f47613 = obj;
        this.f47611 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47612) {
            case 0:
                C12859.m31891((String[]) this.f47613, this.f47611);
                break;
            default:
                ActivityC15481.m37036((ActivityC15481) this.f47613, this.f47611);
                break;
        }
    }
}
