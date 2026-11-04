package l;

/* JADX INFO: renamed from: l.ۚ᩻ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4YZ */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5998 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC17184 f20520;

    public RunnableC5998(AbstractC17184 abstractC17184) {
        this.f20520 = abstractC17184;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        synchronized (this.f20520.f56009) {
            obj = this.f20520.f56002;
            this.f20520.f56002 = AbstractC17184.f55999;
        }
        this.f20520.mo40353(obj);
    }
}
