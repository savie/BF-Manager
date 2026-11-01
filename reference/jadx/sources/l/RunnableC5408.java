package l;

/* JADX INFO: renamed from: l.ۚܳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C4QU */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC5408 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C14852 f18673;

    public RunnableC5408(C14852 c14852, C0219 c0219) {
        this.f18673 = c14852;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        try {
            C6696.m18104();
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        C16737.m39273(new Runnable(z) { // from class: l.ۖܳۚ
            @Override // java.lang.Runnable
            public final void run() {
                C22342.m49540(this.f10164.f18673);
            }
        });
    }
}
