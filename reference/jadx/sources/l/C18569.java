package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܿ᩶ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18569 extends AbstractC10276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22957 f60334;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C3282 f60335;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f60336;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18569(ActivityC22957 activityC22957, ActivityC22957 activityC22958) {
        super(activityC22958);
        this.f60334 = activityC22957;
        this.f60336 = 0;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final String mo5948() {
        int i = this.f60336;
        ActivityC22957 activityC22957 = this.f60334;
        if (i >= activityC22957.f74569.f24303.length) {
            return null;
        }
        C3282[] c3282Arr = activityC22957.f74569.f24303;
        int i2 = this.f60336;
        this.f60336 = i2 + 1;
        C3282 c3282 = c3282Arr[i2];
        this.f60335 = c3282;
        return c3282.m10827();
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final void mo5950(String str) {
        this.f60335.m10824(str);
        ActivityC22957.f74567 = true;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final void mo5949(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC22957 activityC22957 = this.f60334;
            C22673.m51154((CharSequence) activityC22957.getString(R.string.MT_Protector, objArr));
            activityC22957.f74574.notifyDataSetChanged();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }
}
