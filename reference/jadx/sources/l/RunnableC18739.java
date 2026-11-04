package l;

/* JADX INFO: renamed from: l.ᩳ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC18739 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2332 f60900;

    public RunnableC18739(C2332 c2332) {
        this.f60900 = c2332;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2332 c2332 = this.f60900;
        c2332.m7862();
        c2332.f7526 = c2332.f7546.animate().translationY(0.0f).setListener(c2332.f7542);
    }
}
