package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ᩴ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20062 implements InterfaceC19777 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C6178 f64469 = new C6178();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f64470;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9378 f64471;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f64472;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23582 f64473;

    public C20062(C16332 c16332, C24132 c24132, C23582 c23582, C9378 c9378) {
        this.f64472 = c16332;
        this.f64470 = c24132;
        this.f64473 = c23582;
        this.f64471 = c9378;
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ᩷ */
    public final void mo34769() {
        C6178 c6178 = this.f64469;
        c6178.writeInt(1382253409);
        C16332 c16332 = this.f64472;
        c6178.writeInt(c16332.f53033.m46607(c16332.m38820()));
        c6178.writeInt(1382253409);
        this.f64470.m53910(c6178, true);
        c6178.writeInt(1382253409);
        C23582 c23582 = this.f64473;
        c23582.m52823(c6178);
        c6178.writeInt(1382253409);
        c23582.m52809(c6178);
    }

    @Override // l.InterfaceC19777
    /* JADX INFO: renamed from: ۙ */
    public final void mo34768() {
        try {
            this.f64471.m24701();
            byte[] bArrM37704 = C15768.m37704(this.f64469.size(), this.f64469.m17808());
            synchronized (this.f64472) {
                this.f64471.m24696(bArrM37704);
            }
        } catch (IOException e) {
            this.f64472.f53044.m51299(e);
        }
    }
}
