package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۟۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7898 extends AbstractC10276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20763 f26248;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f26249;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f26250;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f26251;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7898(ActivityC22597 activityC22597, ActivityC22597 activityC22598) {
        super(activityC22598);
        this.f26250 = activityC22597;
        this.f26249 = activityC22597.f73046.f33813.size();
        this.f26251 = 0;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final String mo5948() {
        int i = this.f26251;
        if (i >= this.f26249) {
            return null;
        }
        C12558 c12558 = this.f26250.f73046.f33813;
        this.f26251 = i + 1;
        C20763 item = c12558.getItem(i);
        this.f26248 = item;
        return item.getValue();
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final void mo5950(String str) {
        this.f26248.m47468(str);
        this.f26250.f73046.f33806 = true;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ */
    public final void mo5949(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC22597 activityC22597 = this.f26250;
            C22673.m51154((CharSequence) activityC22597.getString(R.string.MT_Protector, objArr));
            activityC22597.f73050.notifyDataSetChanged();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }
}
