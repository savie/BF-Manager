package l;

/* JADX INFO: renamed from: l.ܿ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC18603 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f60450;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9652 f60451;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f60452;

    /* JADX INFO: renamed from: ᩷ */
    public abstract void mo3025(int i, Thread thread, long j, String str, String str2, Throwable th);

    public AbstractC18603() {
        C9652 c9652 = C9652.f31193;
        String str = C19349.f62523;
        this.f60450 = 60;
        this.f60452 = true;
        this.f60451 = c9652;
        this.f60450 = 60;
        this.f60452 = true;
        this.f60451 = c9652;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43230(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (this.f60452 && i == (this.f60450 & i)) {
            mo3025(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9652 m43229() {
        return this.f60451;
    }
}
