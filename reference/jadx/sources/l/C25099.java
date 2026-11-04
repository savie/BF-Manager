package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩻ܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes.dex */
public final class C25099 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f81181;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC17639 f81182;

    public C25099(ActivityC17639 activityC17639, boolean z) {
        this.f81182 = activityC17639;
        this.f81181 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC17639 activityC17639 = this.f81182;
        activityC17639.f58000.setVisibility(8);
        activityC17639.f57997.m10021(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f81182.f57996 = C0486.m2343(this.f81181);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f81182.f57998.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f81182.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC17639 activityC17639 = this.f81182;
        activityC17639.f57997.m10021(false);
        if (activityC17639.f57996.isEmpty()) {
            activityC17639.f58000.setVisibility(0);
        }
    }
}
