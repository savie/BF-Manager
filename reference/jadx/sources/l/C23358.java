package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩻֨ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes.dex */
public final class C23358 extends AbstractC1472 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f75666;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C12202 f75667;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC13125 f75668;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f75669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23358(ActivityC13125 activityC13125, ActivityC13125 activityC13126) {
        super(activityC13126);
        this.f75668 = activityC13125;
        this.f75669 = activityC13125.f43713.f5092.size();
        this.f75666 = 0;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final String mo5118() {
        int i = this.f75666;
        if (i >= this.f75669) {
            return null;
        }
        C17140 c17140 = this.f75668.f43713.f5092;
        this.f75666 = i + 1;
        C12202 item = c17140.getItem(i);
        this.f75667 = item;
        return item.getValue();
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5120(String str) {
        this.f75667.m30301(str);
        this.f75668.f43713.f5074 = true;
    }

    @Override // l.AbstractC1472
    /* JADX INFO: renamed from: ۙ */
    public final void mo5119(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC13125 activityC13125 = this.f75668;
            C15829.m37613((CharSequence) activityC13125.getString(R.string.MT_Protector, objArr));
            activityC13125.f43711.notifyDataSetChanged();
            return;
        }
        C15829.m37611(R.string.MT_Protector);
    }
}
