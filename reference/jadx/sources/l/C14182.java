package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۬᩺ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K14B */
/* JADX INFO: loaded from: classes5.dex */
public final class C14182 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10608 f44839;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C5570 f44840;

    public C14182(C10608 c10608) {
        this.f44839 = c10608;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        C10608 c10608 = this.f44839;
        c10608.f33676.setVisibility(0);
        c10608.f33683 = true;
        c10608.f33680 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C10608 c10608 = this.f44839;
        c10608.f33679.m30724();
        if (c10608.f33678) {
            this.f44840 = C10608.m27082(c10608);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        C10608 c10608 = this.f44839;
        if (c10608.f33678) {
            c10608.f33681.m41040(this.f44840);
            if (this.f44840 == null) {
                C22673.m51152(R.string.MT_Protector);
            }
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        C10608 c10608 = this.f44839;
        if (c10608.f33678) {
            c10608.f33680 = true;
            c10608.f33686.m51299(exc);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        C10608 c10608 = this.f44839;
        if (c10608.f33678) {
            c10608.f33676.setVisibility(8);
        }
        c10608.f33683 = false;
    }
}
