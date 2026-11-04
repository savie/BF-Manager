package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽ֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17255 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۬ܶۙ, reason: not valid java name and contains not printable characters */
    private static final short[] f56209;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f56210;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public String f56211;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f56212;

    static {
        ApplicationC23172.m52091(128);
        f56209 = new short[]{3540, 20135, 20148, 20149, 20133, 20096, 20143, 20138, 20131, 20214, 20214, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20215, 20214, 20214, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20203, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 20214, 7500, 46, 44, 49, 52, 59, 61, 42, 14, 63, 42, 54};
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public native void mo1134();

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
    }

    public C17255(ActivityC0848 activityC0848) {
        this.f56210 = activityC0848;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        boolean z = exc instanceof C20523;
        ActivityC0848 activityC0848 = this.f56210;
        if (z) {
            activityC0848.finish();
        } else {
            activityC0848.m40402((Throwable) exc, true);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f56210.m40418(R.id.MT_Protector).setVisibility(8);
    }
}
