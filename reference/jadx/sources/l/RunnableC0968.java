package l;

import bin.mt.plugin.api.util.AsyncTask;

/* JADX INFO: renamed from: l.֨۟ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: VAJH */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC0968 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3798;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f3799;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f3800;

    public /* synthetic */ RunnableC0968(int i, Object obj, Object obj2) {
        this.f3799 = i;
        this.f3800 = obj;
        this.f3798 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3799) {
            case 0:
                AbstractC17902.m41550((AbstractC17902) this.f3800, (AbstractActivityC12483) this.f3798);
                break;
            case 1:
                C19271.m44220((C19271) this.f3800, (Exception) this.f3798);
                break;
            default:
                ((AsyncTask) this.f3800).lambda$handleError$2((Exception) this.f3798);
                break;
        }
    }
}
