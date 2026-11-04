package l;

/* JADX INFO: renamed from: l.ܰۘۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51KR */
/* JADX INFO: loaded from: classes.dex */
public final class C14337 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C23582 f45222;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f45223;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C4621 f45224;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C4883 f45225;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f45226;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f45227;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0168 f45228;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C24132 f45229;

    static {
        ApplicationC23172.m52091(115);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C14337(C0168 c0168) {
        this.f45228 = c0168;
        this.f45223 = C11555.m29068(c0168.getViewLifecycleOwner());
        this.f45224 = c0168.f1213;
        this.f45229 = c0168.f1217;
        this.f45222 = c0168.f1208;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f45229.m54050();
        this.f45227 = true;
        C0168 c0168 = this.f45228;
        c0168.f1207++;
        c0168.f1218 = this;
        c0168.f1226 = true;
        c0168.f1211 = false;
        c0168.f1217.m53900(c0168.f1227, true, false);
        c0168.f1210 = false;
        c0168.f1208.m52807(".java");
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() throws Exception {
        C0168 c0168 = this.f45228;
        if (c0168.f1218 == this && this.f45223.m29071() && c0168.f1228) {
            C4883 c4883 = this.f45225;
            C4621 c4621 = this.f45224;
            if (c4883 != null) {
                c4621.m14429(c4883);
            } else if (!(c4621.m14430() instanceof C22037)) {
                c4621.m14429(new C22037());
            }
            c4621.mo14428(c0168.f1224, c0168.f1217.m54021());
            if (this.f45226) {
                c0168.f1217.m54105();
            } else {
                c0168.f1217.m54093();
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C0168 c0168 = this.f45228;
        if (c0168.f1218 == this && this.f45223.m29071()) {
            C0168.m1403(c0168, exc);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C0168 c0168 = this.f45228;
        try {
            if (this.f45227) {
                this.f45229.m53960();
            }
            if (c0168.f1218 != this || !this.f45223.m29071()) {
                C4883 c4883 = this.f45225;
                if (c4883 != null) {
                    c4883.close();
                }
            } else {
                if (c0168.f1228) {
                    c0168.f1217.m53900(c0168.f1227, false, !c0168.f1210);
                }
            }
        } finally {
            if (this.f45227) {
                c0168.f1207--;
            }
            if (c0168.f1218 == this) {
                c0168.f1218 = null;
                c0168.f1226 = false;
                c0168.f1211 = true;
            }
        }
    }
}
