package l;

/* JADX INFO: renamed from: l.۫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q63C */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12149 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10738 f40652;

    public RunnableC12149(C10738 c10738) {
        this.f40652 = c10738;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C10738 c10738 = this.f40652;
        c10738.m26976();
        c10738.f36604 = c10738.f36611.animate().translationY(-c10738.f36611.getHeight()).setListener(c10738.f36612);
    }
}
