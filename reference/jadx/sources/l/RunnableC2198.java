package l;

/* JADX INFO: renamed from: l.֫᩷᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: N1TT */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2198 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f7224;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f7225;

    public /* synthetic */ RunnableC2198(int i, Object obj) {
        this.f7224 = i;
        this.f7225 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7224) {
            case 0:
                ((ViewOnLayoutChangeListenerC6673) this.f7225).f22254.m39626();
                break;
            case 1:
                ((ServiceC10702) this.f7225).m27288();
                break;
            case 2:
                C13529.m33233((C13529) this.f7225);
                break;
            default:
                C0853.m3483((C0853) this.f7225);
                break;
        }
    }
}
