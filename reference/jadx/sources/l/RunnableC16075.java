package l;

/* JADX INFO: renamed from: l.ܺܿۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 55FS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC16075 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f51990;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f51991;

    public /* synthetic */ RunnableC16075(int i, Object obj) {
        this.f51990 = i;
        this.f51991 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f51990) {
            case 0:
                C17485.m40690((C17485) this.f51991);
                break;
            case 1:
                DialogC13082.m32301((DialogC13082) this.f51991);
                break;
            case 2:
                ServiceC12465.m30943((ServiceC12465) this.f51991);
                break;
            default:
                C9246.m23763((C9246) this.f51991);
                break;
        }
    }
}
