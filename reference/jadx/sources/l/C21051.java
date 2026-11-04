package l;

/* JADX INFO: renamed from: l.᩶ۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C21051 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C24132 f67275;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C4621 f67276;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f67277;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C11555 f67278;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C4883 f67279;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0168 f67280;

    static {
        ApplicationC23172.m52091(151);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C21051(C0168 c0168) {
        this.f67280 = c0168;
        this.f67278 = C11555.m29068(c0168.getViewLifecycleOwner());
        this.f67276 = c0168.f1213;
        this.f67275 = c0168.f1217;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f67275.m54050();
        this.f67277 = true;
        C0168 c0168 = this.f67280;
        c0168.f1207++;
        c0168.f1218 = this;
        c0168.f1226 = true;
        c0168.f1217.m53900(c0168.f1227, true, false);
        c0168.f1210 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws Exception {
        C0168 c0168 = this.f67280;
        if (c0168.f1218 == this && this.f67278.m29071() && c0168.f1228) {
            C4883 c4883 = this.f67279;
            C4621 c4621 = this.f67276;
            if (c4883 != null) {
                c4621.m14429(c4883);
            } else if (!(c4621.m14430() instanceof C22037)) {
                c4621.m14429(new C22037());
            }
            c4621.mo14428(c0168.f1224, c0168.f1217.m54021());
            c0168.f1217.m54093();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C0168 c0168 = this.f67280;
        if (c0168.f1218 == this && this.f67278.m29071()) {
            C0168.m1403(c0168, exc);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0168 c0168 = this.f67280;
        try {
            if (this.f67277) {
                this.f67275.m53960();
            }
            if (c0168.f1218 != this || !this.f67278.m29071()) {
                C4883 c4883 = this.f67279;
                if (c4883 != null) {
                    c4883.close();
                }
            } else {
                if (c0168.f1228) {
                    c0168.f1208.m52827();
                    c0168.f1217.m53900(c0168.f1227, false, !c0168.f1210);
                }
            }
        } finally {
            if (this.f67277) {
                c0168.f1207--;
            }
            if (c0168.f1218 == this) {
                c0168.f1218 = null;
                c0168.f1226 = false;
            }
        }
    }
}
