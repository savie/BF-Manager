package l;

/* JADX INFO: renamed from: l.֨֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0836 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3143;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3144;

    public /* synthetic */ RunnableC0836(int i, Object obj) {
        this.f3143 = i;
        this.f3144 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3143;
        Object obj = this.f3144;
        switch (i) {
            case 0:
                int i2 = C24943.f80720;
                ((C24943) obj).m55697(false);
                break;
            default:
                C21576.m49068(new RunnableC22836(0, (C23582) obj));
                break;
        }
    }
}
