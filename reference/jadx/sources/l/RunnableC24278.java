package l;

/* JADX INFO: renamed from: l.᩺ۨܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 123V */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC24278 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f78589;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78590;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f78591;

    public RunnableC24278(C8614 c8614, int i, int i2) {
        this.f78589 = c8614;
        this.f78590 = i;
        this.f78591 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8614 c8614 = this.f78589;
        if (this.f78590 != c8614.f28141.get()) {
            return;
        }
        if (c8614.m23193()) {
            C21576.m49068(this);
        } else {
            c8614.onItemClick(null, null, this.f78591, 0L);
        }
    }
}
