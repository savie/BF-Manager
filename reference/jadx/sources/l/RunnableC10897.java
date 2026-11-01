package l;

/* JADX INFO: renamed from: l.ۧۡܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10897 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f37081;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23597 f37082;

    public RunnableC10897(C23597 c23597) {
        this.f37082 = c23597;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m27304(float f, float f2, boolean z) {
        if (this.f37081) {
            return;
        }
        this.f37081 = true;
        this.f37082.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f37081 = false;
        int i = C23597.f76445;
        this.f37082.getClass();
    }
}
