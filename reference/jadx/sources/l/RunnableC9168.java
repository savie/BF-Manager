package l;

/* JADX INFO: renamed from: l.ۡۚ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: E411 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9168 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f29756;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f29757;

    public /* synthetic */ RunnableC9168(int i, Object obj) {
        this.f29756 = i;
        this.f29757 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f29756) {
            case 0:
                ((InterfaceC24334) this.f29757).getClass();
                break;
            case 1:
                C21447 c21447 = (C21447) this.f29757;
                c21447.f68431.m41427(c21447);
                break;
            case 2:
                ((AbstractC19594) this.f29757).cancel();
                break;
            default:
                ((C11018) this.f29757).f34795 = null;
                break;
        }
    }
}
