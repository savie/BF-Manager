package l;

import android.view.View;

/* JADX INFO: renamed from: l.ܺۡۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 75NJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15825 extends AbstractC0447 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f51225;

    public C15825(ActivityC11632 activityC11632) {
        this.f51225 = activityC11632;
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerOpened(View view) {
        ActivityC11632 activityC11632 = this.f51225;
        if (activityC11632.f39066) {
            activityC11632.f39067.setVisibility(0);
            activityC11632.f39067.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerClosed(View view) {
        ActivityC11632 activityC11632 = this.f51225;
        activityC11632.f39077.m28844(false);
        if (activityC11632.f39067.getVisibility() == 0) {
            activityC11632.f39067.setVisibility(8);
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerSlide(View view, float f) {
        ActivityC11632 activityC11632 = this.f51225;
        if (activityC11632.f39066) {
            if (f == 0.0f) {
                if (activityC11632.f39067.getVisibility() == 0) {
                    activityC11632.f39067.setVisibility(8);
                }
            } else {
                if (activityC11632.f39067.getVisibility() != 0) {
                    activityC11632.f39067.setVisibility(0);
                }
                activityC11632.f39067.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f51225.f39061.findFocus();
            if (viewFindFocus instanceof C6111) {
                C6111 c6111 = (C6111) viewFindFocus;
                c6111.m17069();
                c6111.m16915();
            }
        }
    }
}
