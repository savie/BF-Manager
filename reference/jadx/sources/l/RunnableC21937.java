package l;

/* JADX INFO: renamed from: l.᩷۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC21937 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f70811;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70812;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f70813;

    public /* synthetic */ RunnableC21937(int i, Object obj, Object obj2) {
        this.f70811 = i;
        this.f70813 = obj;
        this.f70812 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f70811) {
            case 0:
                C24132.m53721((C24132) this.f70813, (C24238) this.f70812);
                break;
            case 1:
                ((InterfaceC1830) this.f70813).mo6333((C15253) this.f70812);
                break;
            default:
                ActivityC0848 activityC0848 = (ActivityC0848) this.f70813;
                ((C11967) this.f70812).m29977(activityC0848, activityC0848.f3180);
                break;
        }
    }
}
