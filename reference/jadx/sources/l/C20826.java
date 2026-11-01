package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩷ۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C20826 extends AbstractC3492 {

    /* JADX INFO: renamed from: ۗܺܰ, reason: not valid java name and contains not printable characters */
    private static final short[] f67682;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public String f67683;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f67684;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f67685;

    static {
        ApplicationC6132.m17119(153);
        f67682 = new short[]{8108, 8924, 8911, 8910, 8926, 8955, 8916, 8913, 8920, 8845, 8845, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8844, 8845, 8845, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8848, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8845, 8241, -14013, -14015, -13988, -13991, -13994, -14000, -14009, -13981, -13998, -14009, -13989};
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public native void mo1157();

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
    }

    public C20826(ActivityC5677 activityC5677) {
        this.f67684 = activityC5677;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        boolean z = exc instanceof C17671;
        ActivityC5677 activityC5677 = this.f67684;
        if (z) {
            activityC5677.finish();
        } else {
            activityC5677.m31003((Throwable) exc, true);
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        this.f67684.m31016(R.id.MT_Protector).setVisibility(8);
    }
}
