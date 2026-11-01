package l;

/* JADX INFO: renamed from: l.ܰ֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC13469 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f44536;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f44537;

    public /* synthetic */ RunnableC13469(int i, Object obj) {
        this.f44536 = i;
        this.f44537 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f44536;
        Object obj = this.f44537;
        switch (i) {
            case 0:
                C3589.m10663(((C13689) obj).f45154);
                break;
            default:
                C15087 c15087 = (C15087) obj;
                int i2 = ActivityC10957.f37270;
                if (c15087 != null) {
                    c15087.close();
                }
                break;
        }
    }
}
