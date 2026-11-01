package l;

/* JADX INFO: renamed from: l.᩷᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21131 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68805;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12665 f68806;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11960 f68807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68808;

    public RunnableC21131(C12665 c12665, C11960 c11960, int i, int i2) {
        this.f68806 = c12665;
        this.f68807 = c11960;
        this.f68805 = i;
        this.f68808 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C12665 c12665 = this.f68806;
        if (c12665.f42295 != this) {
            return;
        }
        c12665.f42295 = null;
        C16193 c16193 = c12665.f42289;
        int i = this.f68805;
        C11960 c11960 = this.f68807;
        if (c16193.m38288(i, c11960)) {
            C12665.m31477(c12665, c11960, this.f68808);
        }
    }
}
