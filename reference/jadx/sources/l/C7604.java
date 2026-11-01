package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟ܿ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: J6WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C7604 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12543 f25150;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f25151;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC21009 f25152;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C17887 f25153;

    public C7604(C12543 c12543, InterfaceC21009 interfaceC21009, Runnable runnable) {
        this.f25150 = c12543;
        this.f25152 = interfaceC21009;
        this.f25151 = runnable;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10252(this.f25150.f41986, 200);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f25153 = this.f25152.run();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        C12543 c12543 = this.f25150;
        if (!c12543.f41984.m44375() || c12543.f41986.isFinishing()) {
            return;
        }
        c12543.m31201();
        Runnable runnable = this.f25151;
        if (runnable != null) {
            runnable.run();
        }
        C17887 c17887 = this.f25153;
        if (c17887 != null) {
            C12543.m31179(c12543, c17887.f56647);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C12543 c12543 = this.f25150;
        if (!c12543.f41984.m44375() || c12543.f41986.isFinishing()) {
            return;
        }
        c12543.m31201();
        C15829.m37618(R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f25153 = null;
        this.f25150.f41988 = false;
        m10251();
    }
}
