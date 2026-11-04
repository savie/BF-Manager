package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜ᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes4.dex */
public final class C7471 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10608 f24728;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C5570 f24729;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f24730;

    public C7471(C10608 c10608) {
        this.f24728 = c10608;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10608 c10608 = this.f24728;
        c10608.f33676.setVisibility(0);
        c10608.f33683 = true;
        c10608.f33680 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C10608 c10608 = this.f24728;
        c10608.f33679.m30724();
        if (c10608.f33678) {
            if (!c10608.f33682) {
                C9378 c9378M24173 = c10608.m24173(c10608.f33675.m11163());
                if (c9378M24173.m24702()) {
                    C10608.m27077(c10608, C20348.m46740(c9378M24173.m24700()));
                    this.f24730 = true;
                    return;
                }
            }
            c10608.f33682 = false;
            this.f24729 = C10608.m27082(c10608);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C10608 c10608 = this.f24728;
        if (c10608.f33678 && !this.f24730) {
            c10608.f33681.m41040(this.f24729);
            if (this.f24729 == null) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C10608 c10608 = this.f24728;
        if (c10608.f33678) {
            c10608.f33680 = true;
            c10608.f33686.m51299(exc);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C10608 c10608 = this.f24728;
        if (c10608.f33678) {
            c10608.f33676.setVisibility(8);
        }
        c10608.f33683 = false;
    }
}
