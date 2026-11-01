package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֡۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C0259 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C2414 f1528;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f1529;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f1530;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23229 f1531;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C3329 f1532;

    public C0259(C20409 c20409, ActivityC11632 activityC11632) {
        this.f1529 = c20409;
        this.f1530 = activityC11632;
        this.f1531 = C23229.m51233(c20409.getViewLifecycleOwner());
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        this.f1532 = this.f1529.f66125.m17000().mo2398();
        m10245(this.f1530);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        C3329 c3329 = this.f1532;
        try {
            this.f1528 = C21444.m48031("", C13976.m33821(c3329.toString()), ApplicationC0716.f2992.mo16345((byte) 0, "dex_decompile_engine"));
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
        if (this.f1531.m51236()) {
            C20409 c20409 = this.f1529;
            if (!c20409.f66138 || c20409.isDetached() || c20409.m13344()) {
                return;
            }
            if (!this.f1528.f9691.m4686()) {
                C1313 c1313 = this.f1528.f9691;
                c1313.getClass();
                this.f1530.m31000(C4820.m13401(c1313, R.string.MT_Protector), false);
                return;
            }
            ActivityC21135.m47561(c20409.f66130, this.f1528, c20409.m13346().m31431() + ".java");
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f1531.m51236()) {
            C20409 c20409 = this.f1529;
            if (!c20409.f66138 || c20409.isDetached() || c20409.m13344()) {
                return;
            }
            c20409.m46062(exc, this.f1530);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        C3329 c3329 = this.f1532;
        if (c3329 != null) {
            c3329.close();
        }
        m10251();
    }
}
