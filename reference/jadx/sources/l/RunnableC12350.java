package l;

/* JADX INFO: renamed from: l.ۨۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 97J6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC12350 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39669;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39670;

    public /* synthetic */ RunnableC12350(int i, Object obj) {
        this.f39669 = i;
        this.f39670 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39669) {
            case 0:
                C4147.m13293((C4147) this.f39670);
                break;
            case 1:
                ((AbstractActivityC10144) this.f39670).f32503.m47657();
                break;
            case 2:
                AbstractC9781.m25508((AbstractC9781) this.f39670);
                break;
            case 3:
                ((ActivityC22568) this.f39670).finish();
                break;
            default:
                C2012.m6917((C2012) this.f39670);
                break;
        }
    }
}
