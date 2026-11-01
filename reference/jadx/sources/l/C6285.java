package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۛ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6285 extends AbstractC5491 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f21280;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6285(ActivityC3588 activityC3588, ActivityC3588 activityC3589, boolean z) {
        super(activityC3589, z);
        this.f21280 = activityC3588;
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6920(C2668 c2668, String str) {
        ActivityC3588 activityC3588 = this.f21280;
        activityC3588.f13204.f7895 = true;
        activityC3588.f13204.f7899 = 0;
        activityC3588.f13204.f7891 = new int[activityC3588.f13204.f7898.length];
        for (int i = 0; i < activityC3588.f13204.f7898.length; i++) {
            if (c2668.m8214(activityC3588.f13204.f7898[i].m35176())) {
                int[] iArr = activityC3588.f13204.f7891;
                C2177 c2177 = activityC3588.f13204;
                int i2 = c2177.f7899;
                c2177.f7899 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC3588.setTitle(activityC3588.getString(R.string.MT_Protector, str));
        activityC3588.f13203.notifyDataSetChanged();
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6919() {
        ActivityC3588 activityC3588 = this.f21280;
        activityC3588.f13204.f7895 = false;
        activityC3588.m31016(R.string.MT_Protector);
        activityC3588.f13203.notifyDataSetChanged();
    }
}
