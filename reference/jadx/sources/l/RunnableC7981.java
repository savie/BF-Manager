package l;

/* JADX INFO: renamed from: l.۠ۛۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7981 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f26200;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f26201;

    public /* synthetic */ RunnableC7981(int i, Object obj) {
        this.f26200 = i;
        this.f26201 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f26200;
        Object obj = this.f26201;
        switch (i) {
            case 0:
                InterfaceC19083 interfaceC19083 = (InterfaceC19083) obj;
                int i2 = ActivityC5677.f19358;
                interfaceC19083.mo30475();
                interfaceC19083.mo30474();
                break;
            case 1:
                ((C6938) obj).invalidateMenu();
                break;
            case 2:
                ServiceC12465.m30962((ServiceC12465) obj);
                break;
            case 3:
                C0103 c0103 = (C0103) obj;
                c0103.f1063.post(new RunnableC18517(3, c0103));
                break;
            case 4:
                ((C7236) obj).m50125(new C1547());
                break;
            default:
                ((AbstractC20413) obj).cancel();
                break;
        }
    }
}
