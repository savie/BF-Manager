package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C3907 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f13356;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11555 f13357;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f13358;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C6806 f13359;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C15508 f13360;

    public C3907(C7941 c7941, ActivityC18143 activityC18143) {
        this.f13356 = c7941;
        this.f13358 = activityC18143;
        this.f13357 = C11555.m29068(c7941.getViewLifecycleOwner());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        this.f13360 = this.f13356.f26387.m54021().mo15337();
        m8190(this.f13358);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C15508 c15508 = this.f13360;
        try {
            this.f13359 = C11650.m29284("", C13994.m34094(c15508.toString()), ApplicationC17729.f58258.mo7901((byte) 0, "dex_decompile_engine"));
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
        if (this.f13357.m29071()) {
            C7941 c7941 = this.f13356;
            if (!c7941.f26408 || c7941.isDetached() || c7941.m19927()) {
                return;
            }
            if (!this.f13359.f22668.m33676()) {
                C13778 c13778 = this.f13359.f22668;
                c13778.getClass();
                this.f13358.m40400(C1364.m5010(c13778, R.string.MT_Protector), false);
                return;
            }
            ActivityC4300.m13681(c7941.f26398, this.f13359, c7941.m19934().m9059() + ".java");
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f13357.m29071()) {
            C7941 c7941 = this.f13356;
            if (!c7941.f26408 || c7941.isDetached() || c7941.m19927()) {
                return;
            }
            C7941.m21539(c7941, exc, this.f13358);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C15508 c15508 = this.f13360;
        if (c15508 != null) {
            c15508.close();
        }
        m8196();
    }
}
