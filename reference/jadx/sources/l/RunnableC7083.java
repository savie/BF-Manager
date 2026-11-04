package l;

/* JADX INFO: renamed from: l.ۜۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44TS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC7083 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Throwable f23348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23349;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23350;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23351;

    public /* synthetic */ RunnableC7083(Object obj, Object obj2, Throwable th, int i) {
        this.f23349 = i;
        this.f23351 = obj;
        this.f23350 = obj2;
        this.f23348 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23349) {
            case 0:
                C11908.m29798((C11908) this.f23351, (C2214) this.f23350, (RuntimeException) this.f23348);
                break;
            default:
                ((C19656) this.f23351).m45315((AbstractC13753) this.f23350, this.f23348);
                break;
        }
    }
}
