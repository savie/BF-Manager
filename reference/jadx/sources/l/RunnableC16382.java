package l;

/* JADX INFO: renamed from: l.ܽۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC16382 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f52715;

    public RunnableC16382(C10738 c10738) {
        this.f52715 = c10738;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10738 c10738 = this.f52715;
        c10738.m26976();
        c10738.f36604 = c10738.f36611.animate().translationY(0.0f).setListener(c10738.f36612);
    }
}
