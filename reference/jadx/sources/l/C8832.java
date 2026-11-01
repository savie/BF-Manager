package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۡۧۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8832 extends AbstractC0447 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f30361;

    public C8832(ActivityC5677 activityC5677) {
        this.f30361 = activityC5677;
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerOpened(View view) {
        ActivityC5677 activityC5677 = this.f30361;
        if (activityC5677.f19375) {
            activityC5677.f19381.setVisibility(0);
            activityC5677.f19381.setAlpha(1.0f);
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerClosed(View view) {
        ActivityC5677 activityC5677 = this.f30361;
        activityC5677.f19371.m28844(false);
        if (activityC5677.f19381.getVisibility() == 0) {
            activityC5677.f19381.setVisibility(8);
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerSlide(View view, float f) {
        ActivityC5677 activityC5677 = this.f30361;
        if (activityC5677.f19375) {
            if (f == 0.0f) {
                if (activityC5677.f19381.getVisibility() == 0) {
                    activityC5677.f19381.setVisibility(8);
                }
            } else {
                if (activityC5677.f19381.getVisibility() != 0) {
                    activityC5677.f19381.setVisibility(0);
                }
                activityC5677.f19381.setAlpha(f);
            }
        }
    }

    @Override // l.AbstractC0447, l.InterfaceC7503
    public final void onDrawerStateChanged(int i) {
        if (i == 2 || i == 1) {
            View viewFindFocus = this.f30361.f19384.findFocus();
            if (viewFindFocus instanceof C6111) {
                C6111 c6111 = (C6111) viewFindFocus;
                c6111.m17069();
                c6111.m16915();
            }
        }
    }
}
