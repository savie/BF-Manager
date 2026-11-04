package l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ܶܳ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes5.dex */
public final class C16158 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f52454;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2386 f52455;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f52456;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f52457;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C2648 f52458;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f52459;

    public C16158(C8614 c8614, BooleanSupplier booleanSupplier, InterfaceC2386 interfaceC2386, Runnable runnable) {
        this.f52459 = c8614;
        this.f52456 = booleanSupplier;
        this.f52455 = interfaceC2386;
        this.f52454 = runnable;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f52458 = this.f52459.m23214();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f52457 = this.f52456.getAsBoolean();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f52458.m8779()) {
            return;
        }
        if (this.f52457) {
            C1663.m5985(this.f52459, this.f52455);
        } else {
            this.f52454.run();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f52458.m8779()) {
            return;
        }
        C1663.m5985(this.f52459, this.f52455);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f52458.m8777();
    }
}
