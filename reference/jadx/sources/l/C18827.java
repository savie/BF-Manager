package l;

import java.util.function.BooleanSupplier;

/* JADX INFO: renamed from: l.ᩴܳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 77HY */
/* JADX INFO: loaded from: classes5.dex */
public final class C18827 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f61004;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f61005;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ BooleanSupplier f61006;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2557 f61007;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C13662 f61008;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11545 f61009;

    public C18827(C11545 c11545, BooleanSupplier booleanSupplier, InterfaceC2557 interfaceC2557, Runnable runnable) {
        this.f61009 = c11545;
        this.f61006 = booleanSupplier;
        this.f61007 = interfaceC2557;
        this.f61005 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f61008 = this.f61009.m28818();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f61004 = this.f61006.getAsBoolean();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f61008.m33367()) {
            return;
        }
        if (this.f61004) {
            C8265.m21685(this.f61009, this.f61007);
        } else {
            this.f61005.run();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f61008.m33367()) {
            return;
        }
        C8265.m21685(this.f61009, this.f61007);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f61008.m33365();
    }
}
