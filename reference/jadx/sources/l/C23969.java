package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.᩺֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23969 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f77570;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2776 f77571;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f77572;

    public C23969(ActivityC0848 activityC0848, AbstractC22044 abstractC22044, C2776 c2776) {
        this.f77572 = activityC0848;
        this.f77570 = abstractC22044;
        this.f77571 = c2776;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8190(this.f77572);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws C3090 {
        ActivityC0848 activityC0848 = this.f77572;
        C21664.m49203(this.f77570, activityC0848.f3191.m24699());
        activityC0848.f3183 = true;
        activityC0848.m3420(false);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        int iIndexOf;
        ActivityC0848 activityC0848 = this.f77572;
        AbstractC3191 abstractC3191M11155 = activityC0848.m11155();
        if (abstractC3191M11155.m10467() || (iIndexOf = activityC0848.f3173.indexOf(this.f77571)) == -1) {
            return;
        }
        C24406 c24406 = new C24406();
        AbstractC9051 abstractC9051 = (AbstractC9051) activityC0848.f3173.set(iIndexOf, c24406);
        AbstractC4573 abstractC4573M10492 = abstractC3191M11155.m10492();
        abstractC4573M10492.m14352(0, 0);
        abstractC4573M10492.mo14360(abstractC9051);
        abstractC4573M10492.m14357(c24406, "000000-0000-0000-0000-000000000001");
        abstractC4573M10492.mo14359();
        activityC0848.f3175.remove("000000-0000-0000-0000-000000000002");
        if (activityC0848.f3189 != null) {
            activityC0848.f3189.notifyItemChanged(iIndexOf);
        }
        C9378 c9378M3442 = activityC0848.m3442();
        abstractC9051.m24173(c9378M3442).m24697();
        C24238.m54225(abstractC9051.m24166(c9378M3442).m24699()).m52938((InterfaceC25138) new C12669(10));
        abstractC9051.m24162(c9378M3442).m24697();
        activityC0848.m3355();
        ActivityC0848.m3385(activityC0848);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f77572.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        this.f77572.f3186 = false;
        m8196();
    }
}
