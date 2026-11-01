package l;

/* JADX INFO: renamed from: l.᩸ۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC21385 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f69532;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f69533;

    public /* synthetic */ RunnableC21385(int i, Object obj) {
        this.f69532 = i;
        this.f69533 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f69532;
        Object obj = this.f69533;
        switch (i) {
            case 0:
                int i2 = C3040.f11359;
                ((C3040) obj).m9119(false);
                break;
            default:
                C16737.m39273(new RunnableC14912(0, (C20556) obj));
                break;
        }
    }
}
