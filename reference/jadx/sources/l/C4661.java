package l;

/* JADX INFO: renamed from: l.ۙ۬ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C4661 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C23229 f16465;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C6111 f16466;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f16467;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C15267 f16468;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C12819 f16469;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11718 f16470;

    static {
        ApplicationC6132.m17119(70);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C4661(C11718 c11718) {
        this.f16470 = c11718;
        this.f16465 = C23229.m51233(c11718.getViewLifecycleOwner());
        this.f16468 = c11718.f39380;
        this.f16466 = c11718.f39378;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f16466.m16905();
        this.f16467 = true;
        C11718 c11718 = this.f16470;
        c11718.f39388++;
        c11718.f39382 = this;
        c11718.f39385 = true;
        c11718.f39378.m16854(c11718.f39373, true, false);
        c11718.f39386 = false;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws Exception {
        C11718 c11718 = this.f16470;
        if (c11718.f39382 == this && this.f16465.m51236() && c11718.f39391) {
            C12819 c12819 = this.f16469;
            C15267 c15267 = this.f16468;
            if (c12819 != null) {
                c15267.m36572(c12819);
            } else if (!(c15267.m36573() instanceof C3645)) {
                c15267.m36572(new C3645());
            }
            c15267.mo10753(c11718.f39389, c11718.f39378.m17000());
            c11718.f39378.m16902();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C11718 c11718 = this.f16470;
        if (c11718.f39382 == this && this.f16465.m51236()) {
            C11718.m29267(c11718, exc);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11718 c11718 = this.f16470;
        try {
            if (this.f16467) {
                this.f16466.m17001();
            }
            if (c11718.f39382 != this || !this.f16465.m51236()) {
                C12819 c12819 = this.f16469;
                if (c12819 != null) {
                    c12819.close();
                }
            } else {
                if (c11718.f39391) {
                    c11718.f39381.m46377();
                    c11718.f39378.m16854(c11718.f39373, false, !c11718.f39386);
                }
            }
        } finally {
            if (this.f16467) {
                c11718.f39388--;
            }
            if (c11718.f39382 == this) {
                c11718.f39382 = null;
                c11718.f39385 = false;
            }
        }
    }
}
