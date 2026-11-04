package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.֫ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1659 extends AbstractC10276 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C12558 f5741;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C20763 f5742;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f5743;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f5744;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1659(ActivityC23288 activityC23288, ActivityC23288 activityC23289) {
        super(activityC23289);
        this.f5743 = activityC23288;
        this.f5741 = activityC23288.f75446.f51488.f48832;
        this.f5744 = 0;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo5948() {
        int i = this.f5744;
        C12558 c12558 = this.f5741;
        if (i >= c12558.size()) {
            return null;
        }
        int i2 = this.f5744;
        this.f5744 = i2 + 1;
        C20763 item = c12558.getItem(i2);
        this.f5742 = item;
        return item.getValue();
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5950(String str) {
        this.f5742.m47468(str);
        this.f5743.f75446.f51490 = true;
    }

    @Override // l.AbstractC10276
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5949(int i) {
        if (i > 0) {
            Object[] objArr = {Integer.valueOf(i)};
            ActivityC23288 activityC23288 = this.f5743;
            C22673.m51154((CharSequence) activityC23288.getString(R.string.MT_Protector, objArr));
            activityC23288.f75448.notifyDataSetChanged();
            return;
        }
        C22673.m51152(R.string.MT_Protector);
    }
}
