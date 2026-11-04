package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: HIRF */
/* JADX INFO: loaded from: classes5.dex */
public final class C14627 extends AbstractC21572 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f47873;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22568 f47874;

    public C14627(ActivityC22568 activityC22568) {
        this.f47874 = activityC22568;
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerStateChanged(int i) {
        if (i == 2) {
            ActivityC22568 activityC22568 = this.f47874;
            if (activityC22568.f72940.m22057(8388611)) {
                activityC22568.f72935.m20364();
                activityC22568.mo44746();
            }
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerSlide(View view, float f) {
        if (view.getId() == R.id.MT_Protector) {
            if (f > 0.0f && !this.f47873) {
                ActivityC22568 activityC22568 = this.f47874;
                if (activityC22568.f72949 != null) {
                    activityC22568.f72929.m45517();
                }
            }
            this.f47873 = f > 0.0f;
        }
    }

    @Override // l.AbstractC21572, l.InterfaceC6656
    public final void onDrawerClosed(View view) {
        int id = view.getId();
        ActivityC22568 activityC22568 = this.f47874;
        if (id == R.id.MT_Protector) {
            activityC22568.f72935.m20364();
        }
        activityC22568.mo44746();
    }
}
