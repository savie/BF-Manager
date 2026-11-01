package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: P676 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11225 extends AbstractC1472 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f37978;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3588 f37979;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C14655 f37980;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11225(ActivityC3588 activityC3588, ActivityC3588 activityC3589) {
        super(activityC3589);
        this.f37979 = activityC3588;
        this.f37978 = 0;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final String mo5118() {
        int i = this.f37978;
        ActivityC3588 activityC3588 = this.f37979;
        if (i >= activityC3588.f13204.f7898.length) {
            return null;
        }
        C14655[] c14655Arr = activityC3588.f13204.f7898;
        int i2 = this.f37978;
        this.f37978 = i2 + 1;
        C14655 c14655 = c14655Arr[i2];
        this.f37980 = c14655;
        return c14655.m35176();
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5120(String str) {
        this.f37980.m35178(str);
        ActivityC3588.f13200 = true;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5119(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC3588 activityC3588 = this.f37979;
            C15829.m37613((CharSequence) activityC3588.getString(R.string.MT_Protector, objArr));
            activityC3588.f13203.notifyDataSetChanged();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }
}
