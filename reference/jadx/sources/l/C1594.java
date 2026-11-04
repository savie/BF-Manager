package l;

import android.view.View;

/* JADX INFO: renamed from: l.֫֫ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1594 extends AbstractC21572 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f5493;

    public C1594(ActivityC0848 activityC0848) {
        this.f5493 = activityC0848;
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerOpened(View view) {
        ActivityC0848 activityC0848 = this.f5493;
        if (activityC0848.f3170) {
            activityC0848.f3174.setVisibility(0);
            activityC0848.f3174.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        ActivityC0848 activityC0848 = this.f5493;
        activityC0848.f3177.m23774(false);
        if (activityC0848.f3174.getVisibility() == 0) {
            activityC0848.f3174.setVisibility(8);
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
        ActivityC0848 activityC0848 = this.f5493;
        if (activityC0848.f3170) {
            if (f == 0.0f) {
                if (activityC0848.f3174.getVisibility() == 0) {
                    activityC0848.f3174.setVisibility(8);
                }
            } else {
                if (activityC0848.f3174.getVisibility() != 0) {
                    activityC0848.f3174.setVisibility(0);
                }
                activityC0848.f3174.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f5493.f3195.findFocus();
            if (viewFindFocus instanceof C24132) {
                C24132 c24132 = (C24132) viewFindFocus;
                c24132.m53967();
                c24132.m53970();
            }
        }
    }
}
