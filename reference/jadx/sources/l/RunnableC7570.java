package l;

/* JADX INFO: renamed from: l.۟֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7570 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f24950;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f24951;

    public /* synthetic */ RunnableC7570(int i, Object obj) {
        this.f24950 = i;
        this.f24951 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f24950) {
            case 0:
                ((C24943) this.f24951).m55682();
                break;
            case 1:
                ((C18495) this.f24951).destroy();
                break;
            default:
                ((C25350) this.f24951).m56626();
                break;
        }
    }
}
