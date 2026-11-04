package l;

/* JADX INFO: renamed from: l.۟ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: O700 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC8004 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C16800 f26578;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2783 f26579;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f26580;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f26581;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20881 f26582;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C1270 f26583;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C6711 f26584;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f26585;

    public RunnableC8004(C2783 c2783, InterfaceC9629 interfaceC9629, C16800 c16800, int i, C6711 c6711, C1270 c1270, int i2, C20881 c20881) {
        this.f26579 = c2783;
        this.f26581 = interfaceC9629;
        this.f26578 = c16800;
        this.f26580 = i;
        this.f26584 = c6711;
        this.f26583 = c1270;
        this.f26585 = i2;
        this.f26582 = c20881;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM53944;
        boolean z;
        boolean z2;
        if (m21861() != 2) {
            return;
        }
        C6711 c6711 = this.f26584;
        if (c6711 != null && c6711.m18743()) {
            zM53944 = this.f26579.f9172.m53934(this.f26584.m18746(), this.f26584.m18738(), this.f26582.m47721());
        } else {
            zM53944 = this.f26579.f9172.m53944(this.f26582.m47721());
        }
        if (!zM53944) {
            this.f26579.f9172.postDelayed(this, 100L);
            return;
        }
        synchronized (this.f26579) {
            if (this.f26579.f9171.f62066 == this) {
                boolean z3 = this.f26579.f9171.f62057;
                z = this.f26579.f9171.f62058;
                this.f26579.f9171.f62066 = null;
                this.f26579.m9154();
                C6711 c6712 = this.f26584;
                if (c6712 == null || z3) {
                    this.f26579.m9189();
                } else if (!c6712.m18743()) {
                    C2783 c2783 = this.f26579;
                    C2783.m9165(c2783, this.f26581, c2783.f9171.f62068.m47720(this.f26582));
                } else {
                    this.f26579.m9172(this.f26581, this.f26584);
                }
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
        }
        if (z2) {
            C24132 c24132 = this.f26579.f9172;
            c24132.m54030();
            c24132.invalidate();
            if (z) {
                this.f26579.m9193(this.f26581);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21861() {
        synchronized (this.f26579) {
            if (this.f26579.f9171.f62066 != this) {
                return 0;
            }
            int i = 1;
            boolean z = this.f26579.f9172.m54021() == this.f26581 && C2783.m9190(this.f26579) == this.f26578 && this.f26581.mo15344() == this.f26580 && this.f26579.f9167.f32720 == this.f26585 && this.f26579.f9171.f62059 == this.f26582 && this.f26579.m9181(this.f26581, this.f26580);
            boolean z2 = this.f26579.f9167.f32711 == this.f26583 && this.f26579.f9167.f32721 == this.f26584 && this.f26581.length() == this.f26583.m4628();
            if (z && z2) {
                if (this.f26579.f9172.isAttachedToWindow() && this.f26579.f9172.m53878() && !this.f26579.f9172.m53976()) {
                    i = 2;
                }
                return i;
            }
            this.f26579.f9171.f62066 = null;
            return 0;
        }
    }
}
