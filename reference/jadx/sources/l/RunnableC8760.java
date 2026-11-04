package l;

/* JADX INFO: renamed from: l.۠ܽۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6AW */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8760 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14854 f28470;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10953 f28471;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f28472;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19904 f28473;

    public RunnableC8760(C10953 c10953, C19904 c19904, String str, C14854 c14854) {
        this.f28471 = c10953;
        this.f28473 = c19904;
        this.f28472 = str;
        this.f28470 = c14854;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (((C23678) this.f28471.f34619.f42128.get(this.f28473.f64055.getBinder())) == null) {
            return;
        }
        String str = this.f28472;
        C11743 c11743 = new C11743(str, this.f28470);
        c11743.m21880(2);
        c11743.m21882();
        if (!c11743.m21884()) {
            throw new IllegalStateException(C25272.m56409("onLoadItem must call detach() or sendResult() before returning for id=", str));
        }
    }
}
