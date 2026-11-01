package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C20016 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C2414 f64114;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f64115;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f64116;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f64117;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f64118;

    public C20016(C20409 c20409, ActivityC11632 activityC11632) {
        this.f64115 = c20409;
        this.f64116 = activityC11632;
        this.f64117 = C23229.m51233(c20409.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f64118 = this.f64115.f66125.m17000().mo2398();
        m10245(this.f64116);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f64118;
        try {
            String string = c3329.toString();
            C8255 c8255 = new C8255();
            c8255.f28708 = 28;
            C8485 c8485 = new C8485(C7474.m19963(28));
            C6843.m18449(string, c8485, c8255);
            C16246 c16246 = new C16246();
            c8485.m37936(c16246);
            this.f64114 = C21444.m48031("", c16246.m38374(), ApplicationC0716.f2992.mo16345((byte) 0, "dex_decompile_engine"));
            c3329.close();
        } catch (Throwable th) {
            if (c3329 != null) {
                try {
                    c3329.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        if (this.f64117.m51236()) {
            C20409 c20409 = this.f64115;
            if (!c20409.f66138 || c20409.isDetached() || c20409.m13344()) {
                return;
            }
            if (!this.f64114.f9691.m4686()) {
                C1313 c1313 = this.f64114.f9691;
                c1313.getClass();
                this.f64116.m31000(C4820.m13401(c1313, R.string.MT_Protector), false);
                return;
            }
            ActivityC21135.m47561(c20409.f66130, this.f64114, c20409.m13346().m31431() + ".java");
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f64117.m51236()) {
            C20409 c20409 = this.f64115;
            if (!c20409.f66138 || c20409.isDetached() || c20409.m13344()) {
                return;
            }
            c20409.m46062(exc, this.f64116);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f64118;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
