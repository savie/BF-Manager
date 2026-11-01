package l;

/* JADX INFO: renamed from: l.ܶܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC15338 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C8988 f49946;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile int f49947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile boolean f49948;

    /* JADX INFO: renamed from: ܰ */
    public abstract void mo21701(int i, Thread thread, long j, String str, String str2, Throwable th);

    public AbstractC15338() {
        C8988 c8988 = C8988.f30760;
        String str = C18865.f61094;
        this.f49947 = 60;
        this.f49948 = true;
        this.f49946 = c8988;
        this.f49947 = 60;
        this.f49948 = true;
        this.f49946 = c8988;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36717(int i, Thread thread, long j, String str, String str2, Throwable th) {
        if (this.f49948 && i == (this.f49947 & i)) {
            mo21701(i, thread, j, str, str2, th);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8988 m36716() {
        return this.f49946;
    }
}
