package l;

/* JADX INFO: renamed from: l.֨ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1303 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f4685;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f4686;

    public RunnableC1303(C10953 c10953, C19904 c19904) {
        this.f4685 = c10953;
        this.f4686 = c19904;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23678 c23678 = (C23678) this.f4685.f34619.f42128.remove(this.f4686.f64055.getBinder());
        if (c23678 != null) {
            ((C19904) c23678.f76776).f64055.getBinder().unlinkToDeath(c23678, 0);
        }
    }
}
