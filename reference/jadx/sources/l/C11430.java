package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۧۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C11430 extends AbstractC6323 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f35937;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11430(ActivityC18143 activityC18143) {
        super(true);
        this.f35937 = activityC18143;
    }

    @Override // l.AbstractC6323
    /* JADX INFO: renamed from: ᩷ */
    public final void mo2768() {
        ActivityC18143 activityC18143 = this.f35937;
        if (activityC18143.f59333.m22057(8388611)) {
            if (activityC18143.f59328.m23776()) {
                activityC18143.f59328.m23774(true);
                return;
            } else {
                activityC18143.f59333.m22037(8388611);
                return;
            }
        }
        if (activityC18143.f59340 != -1) {
            ComponentCallbacksC11612 componentCallbacksC11612M10441 = activityC18143.m11155().m10441(R.id.MT_Protector);
            if ((componentCallbacksC11612M10441 instanceof C7941) && ((C7941) componentCallbacksC11612M10441).m21632()) {
                return;
            }
        }
        activityC18143.m42306(true);
    }
}
