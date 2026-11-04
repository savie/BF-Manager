package l;

/* JADX INFO: renamed from: l.᩸۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4ML */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC22836 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f74015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f74016;

    public /* synthetic */ RunnableC22836(int i, Object obj) {
        this.f74015 = i;
        this.f74016 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f74015) {
            case 0:
                C23582.m52800((C23582) this.f74016);
                break;
            case 1:
                ((InterfaceC21322) this.f74016).mo26317();
                break;
            case 2:
                ((ActivityC18143) this.f74016).m42306(false);
                break;
            case 3:
                C2012.m6914((C2012) this.f74016);
                break;
            case 4:
                ((C11223) this.f74016).f35392.setVisibility(0);
                break;
            default:
                ((C13511) this.f74016).m33185();
                break;
        }
    }
}
