package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩷ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4646 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21829 extends AbstractC5491 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7718 f70882;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21829(ActivityC7718 activityC7718, ActivityC7718 activityC7719, boolean z) {
        super(activityC7719, z);
        this.f70882 = activityC7718;
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6920(C2668 c2668, String str) {
        ActivityC7718 activityC7718 = this.f70882;
        activityC7718.f25533.f36086 = true;
        activityC7718.f25533.f36089 = 0;
        int size = activityC7718.f25533.f36085.f68265.size();
        for (int i = 0; i < size; i++) {
            if (c2668.m8214(activityC7718.f25533.f36085.f68265.m10939(i))) {
                int[] iArr = activityC7718.f25533.f36084;
                C10541 c10541 = activityC7718.f25533;
                int i2 = c10541.f36089;
                c10541.f36089 = i2 + 1;
                iArr[i2] = i;
            }
        }
        activityC7718.setTitle(activityC7718.getString(R.string.MT_Protector, str));
        activityC7718.f25531.notifyDataSetChanged();
    }

    @Override // l.AbstractC5491
    /* JADX INFO: renamed from: ۙ */
    public final void mo6919() {
        ActivityC7718 activityC7718 = this.f70882;
        activityC7718.f25533.f36086 = false;
        activityC7718.setTitle(activityC7718.f25533.f36082);
        activityC7718.f25531.notifyDataSetChanged();
    }
}
