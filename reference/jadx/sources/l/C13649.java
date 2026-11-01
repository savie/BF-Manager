package l;

import android.view.View;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܰۜۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: K1PX */
/* JADX INFO: loaded from: classes4.dex */
public final class C13649 extends AbstractC14217 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC7298 f45016;

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo4244(View view, Object obj) {
        return view == obj;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ܰ */
    public final int mo4245() {
        return 2;
    }

    public C13649(ActivityC7298 activityC7298) {
        this.f45016 = activityC7298;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final CharSequence mo4241(int i) {
        return this.f45016.getString(i == 0 ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final Object mo4242(C19383 c19383, int i) {
        ActivityC7298 activityC7298 = this.f45016;
        C17492 c17492 = i == 0 ? activityC7298.f24234.f69598 : activityC7298.f24233.f17983;
        c19383.addView(c17492);
        return c17492;
    }

    @Override // l.AbstractC14217
    /* JADX INFO: renamed from: ۙ */
    public final void mo4243(C19383 c19383, int i, Object obj) {
        ActivityC7298 activityC7298 = this.f45016;
        c19383.removeView(i == 0 ? activityC7298.f24234.f69598 : activityC7298.f24233.f17983);
    }
}
