package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫ۛ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1736 extends AbstractC21572 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f5935;

    public C1736(ActivityC18143 activityC18143) {
        this.f5935 = activityC18143;
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerOpened(View view) {
        ActivityC18143 activityC18143 = this.f5935;
        if (activityC18143.f59345) {
            activityC18143.f59327.setVisibility(0);
            activityC18143.f59327.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        ActivityC18143 activityC18143 = this.f5935;
        activityC18143.f59328.m23774(false);
        if (activityC18143.f59327.getVisibility() == 0) {
            activityC18143.f59327.setVisibility(8);
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
        ActivityC18143 activityC18143 = this.f5935;
        if (activityC18143.f59345) {
            if (f == 0.0f) {
                if (activityC18143.f59327.getVisibility() == 0) {
                    activityC18143.f59327.setVisibility(8);
                }
            } else {
                if (activityC18143.f59327.getVisibility() != 0) {
                    activityC18143.f59327.setVisibility(0);
                }
                activityC18143.f59327.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f5935.f59333.findFocus();
            if (viewFindFocus instanceof C24132) {
                C24132 c24132 = (C24132) viewFindFocus;
                c24132.m53967();
                c24132.m53970();
            }
        }
    }
}
