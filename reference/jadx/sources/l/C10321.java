package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۤ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A91T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10321 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f35388;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC20904 f35389;

    public C10321(ActivityC20904 activityC20904, boolean z) {
        this.f35389 = activityC20904;
        this.f35388 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC20904 activityC20904 = this.f35389;
        activityC20904.f67931.setVisibility(8);
        activityC20904.f67930.m16335(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f35389.f67933 = C9616.m24523(this.f35388);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f35389.f67934.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f35389.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC20904 activityC20904 = this.f35389;
        activityC20904.f67930.m16335(false);
        if (activityC20904.f67933.isEmpty()) {
            activityC20904.f67931.setVisibility(0);
        }
    }
}
