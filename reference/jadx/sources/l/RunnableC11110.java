package l;

/* JADX INFO: renamed from: l.ۧܺ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6W9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11110 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f37697;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f37698;

    public /* synthetic */ RunnableC11110(int i, Object obj) {
        this.f37697 = i;
        this.f37698 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f37697) {
            case 0:
                ((C12521) this.f37698).accept(Boolean.FALSE);
                break;
            default:
                ((InterfaceC5374) this.f37698).mo7957();
                break;
        }
    }
}
