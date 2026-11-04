package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: YAH9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18164 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f59380;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f59381;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC0855 f59382;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C8796 f59383;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f59384;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f59385;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f59386;

    public C18164(C24132 c24132, AbstractActivityC17204 abstractActivityC17204, InterfaceC0855 interfaceC0855, boolean z) {
        this.f59386 = c24132;
        this.f59380 = abstractActivityC17204;
        this.f59382 = interfaceC0855;
        this.f59385 = z;
        this.f59381 = C11555.m29069(c24132);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f59384 = this.f59386.m54021().mo15337();
        AbstractActivityC17204 abstractActivityC17204 = this.f59380;
        if (abstractActivityC17204 != null) {
            m8191(abstractActivityC17204, R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C24132 c24132 = this.f59386;
        C15508 c15508 = this.f59384;
        try {
            C11228 c11228 = new C11228(C2503.toPath(c24132.getContext().getCacheDir()).resolve("format-output"), C19304.m44676());
            try {
                this.f59382.mo3491(c24132, c15508, this.f59385, c11228);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedException();
                }
                this.f59383 = c11228.finish();
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
        if (this.f59381.m29071()) {
            C18910.m43899(this.f59386, this.f59383);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f59381.m29071()) {
            if (this.f59382 == InterfaceC0855.f3216 && (exc instanceof C4511)) {
                C4511 c4511 = (C4511) exc;
                C15301.m36736(c4511.f16093, c4511.f16098).m36745(this.f59386);
            }
            AbstractActivityC17204 abstractActivityC17204 = this.f59380;
            if (abstractActivityC17204 != null) {
                final C24132 c24132 = this.f59386;
                C18910.m43897(abstractActivityC17204, c24132, exc, this.f59385, false, new Runnable() { // from class: l.᩶ۜ᩸
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (this.f67532.f59381.m29071()) {
                            C18910.m43915(c24132, false);
                        }
                    }
                });
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        try {
            C8796 c8796 = this.f59383;
            if (c8796 != null) {
                c8796.close();
            }
        } finally {
            C15508 c15508 = this.f59384;
            if (c15508 != null) {
                c15508.close();
            }
            m8196();
        }
    }
}
