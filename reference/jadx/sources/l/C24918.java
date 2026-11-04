package l;

import android.content.DialogInterface;
import bin.mt.plus.Main;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻۠ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7Z8 */
/* JADX INFO: loaded from: classes.dex */
public final class C24918 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22044 f80638;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f80639;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8614 f80640;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public AbstractC22044 f80641;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C24236 f80642;

    public C24918(Main main, AbstractC22044 abstractC22044, C8614 c8614) {
        this.f80639 = main;
        this.f80638 = abstractC22044;
        this.f80640 = c8614;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f80639, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        C21246 c21246;
        AbstractC22044 abstractC22044 = this.f80638;
        AbstractC22044 abstractC22044M49868 = abstractC22044.m49868("resources.arsc");
        if (abstractC22044M49868.mo2934()) {
            try {
                c21246 = new C21246(abstractC22044M49868);
            } catch (Exception unused) {
                c21246 = null;
            }
        } else {
            c21246 = null;
        }
        if (c21246 == null) {
            c21246 = new C21246();
        }
        this.f80642 = C24236.m54217(C14955.m35982(abstractC22044.m49865()).m35991(), c21246, false);
        this.f80641 = this.f80640.m23170(abstractC22044.m49874() + ".png", false).m49839(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        new C11491(this, this.f80639, this.f80642.getIntrinsicWidth(), this.f80642.getIntrinsicHeight());
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f80639.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
