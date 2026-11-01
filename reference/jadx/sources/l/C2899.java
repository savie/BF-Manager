package l;

/* JADX INFO: renamed from: l.ۗ֨ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C2899 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C12819 f10935;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final C20556 f10936;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C15267 f10937;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f10938;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f10939;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11718 f10940;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f10941;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C6111 f10942;

    static {
        ApplicationC6132.m17119(50);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C2899(C11718 c11718) {
        this.f10940 = c11718;
        this.f10938 = C23229.m51233(c11718.getViewLifecycleOwner());
        this.f10937 = c11718.f39380;
        this.f10942 = c11718.f39378;
        this.f10936 = c11718.f39381;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f10942.m16905();
        this.f10939 = true;
        C11718 c11718 = this.f10940;
        c11718.f39388++;
        c11718.f39382 = this;
        c11718.f39385 = true;
        c11718.f39376 = false;
        c11718.f39378.m16854(c11718.f39373, true, false);
        c11718.f39386 = false;
        c11718.f39381.m46369(".java");
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() throws Exception {
        C11718 c11718 = this.f10940;
        if (c11718.f39382 == this && this.f10938.m51236() && c11718.f39391) {
            C12819 c12819 = this.f10935;
            C15267 c15267 = this.f10937;
            if (c12819 != null) {
                c15267.m36572(c12819);
            } else if (!(c15267.m36573() instanceof C3645)) {
                c15267.m36572(new C3645());
            }
            c15267.mo10753(c11718.f39389, c11718.f39378.m17000());
            if (this.f10941) {
                c11718.f39378.m16919();
            } else {
                c11718.f39378.m16902();
            }
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        C11718 c11718 = this.f10940;
        if (c11718.f39382 == this && this.f10938.m51236()) {
            C11718.m29267(c11718, exc);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C11718 c11718 = this.f10940;
        try {
            if (this.f10939) {
                this.f10942.m17001();
            }
            if (c11718.f39382 != this || !this.f10938.m51236()) {
                C12819 c12819 = this.f10935;
                if (c12819 != null) {
                    c12819.close();
                }
            } else {
                if (c11718.f39391) {
                    c11718.f39378.m16854(c11718.f39373, false, !c11718.f39386);
                }
            }
        } finally {
            if (this.f10939) {
                c11718.f39388--;
            }
            if (c11718.f39382 == this) {
                c11718.f39382 = null;
                c11718.f39385 = false;
                c11718.f39376 = true;
            }
        }
    }
}
