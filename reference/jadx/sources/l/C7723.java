package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7723 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f25448;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f25449;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC8313 f25450;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8796 f25451;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f25452;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f25453;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f25454;

    public C7723(C24132 c24132, AbstractActivityC17204 abstractActivityC17204, InterfaceC8313 interfaceC8313, boolean z) {
        this.f25454 = c24132;
        this.f25448 = abstractActivityC17204;
        this.f25450 = interfaceC8313;
        this.f25453 = z;
        this.f25449 = C11555.m29069(c24132);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f25452 = this.f25454.m54021().mo15337();
        AbstractActivityC17204 abstractActivityC17204 = this.f25448;
        if (abstractActivityC17204 != null) {
            m8191(abstractActivityC17204, R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C24132 c24132 = this.f25454;
        C15508 c15508 = this.f25452;
        try {
            C11228 c11228 = new C11228(C2503.toPath(c24132.getContext().getCacheDir()).resolve("format-output"), C19304.m44676());
            try {
                this.f25450.mo7925(c15508, this.f25453, c11228);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f25451 = c11228.finish();
                c11228.close();
                if (c15508 != null) {
                    c15508.close();
                }
            } catch (Throwable th) {
                try {
                    c11228.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (c15508 != null) {
                try {
                    c15508.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f25449.m29071()) {
            C18910.m43899(this.f25454, this.f25451);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        AbstractActivityC17204 abstractActivityC17204;
        if (this.f25449.m29071() && (abstractActivityC17204 = this.f25448) != null) {
            final C24132 c24132 = this.f25454;
            C18910.m43897(abstractActivityC17204, c24132, exc, this.f25453, true, new Runnable() { // from class: l.֡ۜ᩸
                @Override // java.lang.Runnable
                public final void run() {
                    if (this.f1554.f25449.m29071()) {
                        C18910.m43903(c24132, false);
                    }
                }
            });
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        try {
            C8796 c8796 = this.f25451;
            if (c8796 != null) {
                c8796.close();
            }
        } finally {
            C15508 c15508 = this.f25452;
            if (c15508 != null) {
                c15508.close();
            }
            m8196();
        }
    }
}
