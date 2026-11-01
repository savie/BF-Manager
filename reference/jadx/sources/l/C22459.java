package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩹ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes.dex */
public final class C22459 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C13662 f73311;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f73312;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f73313;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6936 f73314;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public AbstractC11462 f73315;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2288 f73316;

    public C22459(C6936 c6936, C11545 c11545, InterfaceC2288 interfaceC2288, Runnable runnable) {
        this.f73314 = c6936;
        this.f73313 = c11545;
        this.f73316 = interfaceC2288;
        this.f73312 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f73311 = this.f73313.m28770(true, (Runnable) new RunnableC17894(2, this.f73316));
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f73315 = this.f73316.mo2001(this.f73313.m28817().m28617());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C6936 c6936 = this.f73314;
        if (c6936.f23324 || !this.f73311.m33366()) {
            AbstractC11462 abstractC11462 = this.f73315;
            if (abstractC11462 != null) {
                abstractC11462.m28627();
                return;
            }
            return;
        }
        c6936.m18632(this.f73313, this.f73315);
        Runnable runnable = this.f73312;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f73311.m33367()) {
            return;
        }
        if ((exc instanceof C4987) || (exc instanceof C8142)) {
            C15829.m37612(0, exc.getMessage()).m37622();
        } else {
            this.f73314.m18638().m31002(exc, (DialogInterface.OnDismissListener) null);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f73311.m33365();
    }
}
