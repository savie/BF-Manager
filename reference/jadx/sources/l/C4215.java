package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۘܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4215 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f15403;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC21369 f15404;

    public C4215(ActivityC21369 activityC21369, boolean z) {
        this.f15404 = activityC21369;
        this.f15403 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        ActivityC21369 activityC21369 = this.f15404;
        activityC21369.f68061.setVisibility(8);
        activityC21369.f68057.m10021(true);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f15404.f68059 = C0486.m2347(this.f15403);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f15404.f68058.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f15404.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        ActivityC21369 activityC21369 = this.f15404;
        activityC21369.f68057.m10021(false);
        if (activityC21369.f68059.isEmpty()) {
            activityC21369.f68061.setVisibility(0);
        }
    }
}
