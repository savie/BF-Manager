package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18301 extends AbstractC1472 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f58389;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C17140 f58390;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f58391;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C12202 f58392;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18301(ActivityC7718 activityC7718, ActivityC7718 activityC7719) {
        super(activityC7719);
        this.f58391 = activityC7718;
        this.f58390 = activityC7718.f25533.f36085.f68265;
        this.f58389 = 0;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final String mo5118() {
        int i = this.f58389;
        C17140 c17140 = this.f58390;
        if (i >= c17140.size()) {
            return null;
        }
        int i2 = this.f58389;
        this.f58389 = i2 + 1;
        C12202 item = c17140.getItem(i2);
        this.f58392 = item;
        return item.getValue();
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5120(String str) {
        this.f58392.m30301(str);
        this.f58391.f25533.f36087 = true;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5119(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC7718 activityC7718 = this.f58391;
            C15829.m37613((CharSequence) activityC7718.getString(R.string.MT_Protector, objArr));
            activityC7718.f25531.notifyDataSetChanged();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }
}
