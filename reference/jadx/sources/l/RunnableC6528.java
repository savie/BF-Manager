package l;

/* JADX INFO: renamed from: l.ۛܽۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: E1KB */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6528 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21943;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21944;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21945;

    public /* synthetic */ RunnableC6528(int i, Object obj, Object obj2) {
        this.f21943 = i;
        this.f21945 = obj;
        this.f21944 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21943) {
            case 0:
                C19206.m44510((C19206) this.f21945, (String) this.f21944);
                break;
            case 1:
                C4374.m13879((C4374) this.f21945, (InterfaceC5417) this.f21944);
                break;
            default:
                C22713.m51199((C22713) this.f21945, (String) this.f21944);
                break;
        }
    }
}
