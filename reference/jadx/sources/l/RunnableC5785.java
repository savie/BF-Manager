package l;

/* JADX INFO: renamed from: l.ۚܽܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: F6G9 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5785 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22193 f19873;

    public RunnableC5785(C22193 c22193, C13921 c13921) {
        this.f19873 = c22193;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        try {
            C7756.m21114();
            z = false;
        } catch (Throwable unused) {
            z = true;
        }
        C21576.m49068(new Runnable(z) { // from class: l.۫ܽܳ
            @Override // java.lang.Runnable
            public final void run() {
                C2056.m7083(this.f42316.f19873);
            }
        });
    }
}
