package l;

/* JADX INFO: renamed from: l.ۤ᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC11146 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35117;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Comparable f35118;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f35119;

    public /* synthetic */ RunnableC11146(Object obj, Comparable comparable, int i) {
        this.f35117 = i;
        this.f35119 = obj;
        this.f35118 = comparable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f35117) {
            case 0:
                ViewOnLayoutChangeListenerC6673.m18648((ViewOnLayoutChangeListenerC6673) this.f35119, (String) this.f35118);
                break;
            default:
                C18345.m42796((InterfaceC4043) this.f35119, (C2551) this.f35118);
                break;
        }
    }
}
