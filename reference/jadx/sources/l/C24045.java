package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩺ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C24045 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f77768;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f77769;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f77770;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6806 f77771;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f77772;

    public C24045(C7941 c7941, ActivityC18143 activityC18143) {
        this.f77768 = c7941;
        this.f77770 = activityC18143;
        this.f77769 = C11555.m29068(c7941.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f77772 = this.f77768.f26387.m54021().mo15337();
        m8190(this.f77770);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f77772;
        try {
            String string = c15508.toString();
            C7118 c7118 = new C7118();
            c7118.f23465 = 28;
            C8850 c8850 = new C8850(C19647.m45292(28));
            C19051.m44161(string, c8850, c7118);
            C22781 c22781 = new C22781();
            c8850.m52043(c22781);
            this.f77771 = C11650.m29284("", c22781.m51385(), ApplicationC17729.f58258.mo7901((byte) 0, "dex_decompile_engine"));
            c15508.close();
        } catch (Throwable th) {
            if (c15508 != null) {
                try {
                    c15508.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f77769.m29071()) {
            C7941 c7941 = this.f77768;
            if (!c7941.f26408 || c7941.isDetached() || c7941.m19927()) {
                return;
            }
            if (!this.f77771.f22668.m33676()) {
                C13778 c13778 = this.f77771.f22668;
                c13778.getClass();
                this.f77770.m40400(C1364.m5010(c13778, R.string.MT_Protector), false);
                return;
            }
            ActivityC4300.m13681(c7941.f26398, this.f77771, c7941.m19934().m9059() + ".java");
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f77769.m29071()) {
            C7941 c7941 = this.f77768;
            if (!c7941.f26408 || c7941.isDetached() || c7941.m19927()) {
                return;
            }
            C7941.m21539(c7941, exc, this.f77770);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f77772;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
