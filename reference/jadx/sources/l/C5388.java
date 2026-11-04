package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۚۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5388 extends AbstractC24700 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC23288 f18877;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5388(ActivityC23288 activityC23288, ActivityC23288 activityC23289, boolean z) {
        super(activityC23289, z);
        this.f18877 = activityC23288;
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8146(C11273 c11273, String str) {
        ActivityC23288 activityC23288 = this.f18877;
        activityC23288.f75446.f51482 = true;
        activityC23288.f75446.f51487 = 0;
        int size = activityC23288.f75446.f51488.f48832.size();
        for (int i = 0; i < size; i++) {
            if (c11273.m28527(activityC23288.f75446.f51488.f48832.m15441(i))) {
                int[] iArr = activityC23288.f75446.f51489;
                C15828 c15828 = activityC23288.f75446;
                int i2 = c15828.f51487;
                c15828.f51487 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC23288.setTitle(activityC23288.getString(R.string.MT_Protector, str));
        activityC23288.f75448.notifyDataSetChanged();
    }

    @Override // l.AbstractC24700
    /* JADX INFO: renamed from: ۙ */
    public final void mo8145() {
        ActivityC23288 activityC23288 = this.f18877;
        activityC23288.f75446.f51482 = false;
        activityC23288.setTitle(activityC23288.f75446.f51484);
        activityC23288.f75448.notifyDataSetChanged();
    }
}
