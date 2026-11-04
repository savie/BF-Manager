package l;

/* JADX INFO: renamed from: l.ۗ֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3073 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f9991;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f9992;

    public /* synthetic */ RunnableC3073(int i, Object obj) {
        this.f9991 = i;
        this.f9992 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9991) {
            case 0:
                ((C24132) this.f9992).requestFocus();
                break;
            default:
                ((C13378) this.f9992).mo32985();
                break;
        }
    }
}
