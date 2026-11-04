package l;

/* JADX INFO: renamed from: l.۬֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 61KH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC13526 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f42980;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f42981;

    public /* synthetic */ RunnableC13526(int i, Object obj) {
        this.f42980 = i;
        this.f42981 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f42980;
        Object obj = this.f42981;
        switch (i) {
            case 0:
                C22015.m49800((String[]) obj);
                break;
            case 1:
                AbstractC1530.m5432(((RunnableC13462) obj).f42856);
                break;
            case 2:
                ((ActivityC3846) obj).m12438();
                break;
            default:
                InterfaceC19777 interfaceC19777 = (InterfaceC19777) obj;
                int i2 = ActivityC0848.f3169;
                interfaceC19777.mo34769();
                interfaceC19777.mo34768();
                break;
        }
    }
}
