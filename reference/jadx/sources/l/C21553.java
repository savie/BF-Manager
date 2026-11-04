package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes.dex */
public final class C21553 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f68835;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21553(ActivityC22957 activityC22957, ActivityC22957 activityC22958, boolean z) {
        super(activityC22958, z);
        this.f68835 = activityC22957;
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8146(C11273 c11273, String str) {
        ActivityC22957 activityC22957 = this.f68835;
        activityC22957.f74569.f24304 = true;
        activityC22957.f74569.f24301 = 0;
        activityC22957.f74569.f24307 = new int[activityC22957.f74569.f24303.length];
        for (int i = 0; i < activityC22957.f74569.f24303.length; i++) {
            if (c11273.m28527(activityC22957.f74569.f24303[i].m10827())) {
                int[] iArr = activityC22957.f74569.f24307;
                C7382 c7382 = activityC22957.f74569;
                int i2 = c7382.f24301;
                c7382.f24301 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC22957.setTitle(activityC22957.getString(R.string.MT_Protector, str));
        activityC22957.f74574.notifyDataSetChanged();
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8145() {
        ActivityC22957 activityC22957 = this.f68835;
        activityC22957.f74569.f24304 = false;
        activityC22957.m40418(R.string.MT_Protector);
        activityC22957.f74574.notifyDataSetChanged();
    }
}
