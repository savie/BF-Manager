package l;

/* JADX INFO: renamed from: l.᩻᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: H1KB */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC25385 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81954;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81955;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f81956;

    public /* synthetic */ RunnableC25385(int i, int i2, Object obj) {
        this.f81954 = i2;
        this.f81956 = obj;
        this.f81955 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f81954) {
            case 0:
                ((C25227) this.f81956).scrollToPosition(this.f81955);
                break;
            default:
                C9341.m24610((String[]) this.f81956, this.f81955);
                break;
        }
    }
}
