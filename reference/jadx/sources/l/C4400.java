package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۘ᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4400 extends AbstractC6274 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC19974 f15828;

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo2999(View view, Object obj) {
        return view == obj;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ᩷ */
    public final int mo3000() {
        return 2;
    }

    public C4400(ActivityC19974 activityC19974) {
        this.f15828 = activityC19974;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo2996(int i) {
        return this.f15828.getString(i == 0 ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final Object mo2997(C15179 c15179, int i) {
        ActivityC19974 activityC19974 = this.f15828;
        C25227 c25227 = i == 0 ? activityC19974.f64184.f28995 : activityC19974.f64185.f60338;
        c15179.addView(c25227);
        return c25227;
    }

    @Override // l.AbstractC6274
    /* JADX INFO: renamed from: ۙ */
    public final void mo2998(C15179 c15179, int i, Object obj) {
        ActivityC19974 activityC19974 = this.f15828;
        c15179.removeView(i == 0 ? activityC19974.f64184.f28995 : activityC19974.f64185.f60338);
    }
}
