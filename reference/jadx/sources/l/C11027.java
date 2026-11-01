package l;

import android.content.DialogInterface;

/* JADX INFO: renamed from: l.ۧ۬᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 08W3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11027 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f37478;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC14555 f37479;

    public C11027(ActivityC14555 activityC14555, boolean z) {
        this.f37479 = activityC14555;
        this.f37478 = z;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        ActivityC14555 activityC14555 = this.f37479;
        activityC14555.f47655.setVisibility(8);
        activityC14555.f47657.m16335(true);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f37479.f47658 = C9616.m24527(this.f37478);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f37479.f47654.getAdapter().notifyDataSetChanged();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f37479.m31002(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        ActivityC14555 activityC14555 = this.f37479;
        activityC14555.f47657.m16335(false);
        if (activityC14555.f47658.isEmpty()) {
            activityC14555.f47655.setVisibility(0);
        }
    }
}
