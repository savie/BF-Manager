package l;

import android.content.DialogInterface;
import bin.mt.plus.R;
import java.io.IOException;

/* JADX INFO: renamed from: l.֡۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: K5R1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0440 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ boolean f2006;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC22597 f2007;

    public C0440(ActivityC22597 activityC22597, boolean z) {
        this.f2007 = activityC22597;
        this.f2006 = z;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f2007, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() throws IOException {
        C6178 c6178 = new C6178();
        ActivityC22597 activityC22597 = this.f2007;
        activityC22597.f73046.f33797.m51897();
        activityC22597.f73046.f33797.m51893(c6178, (C3374) null);
        AbstractC22044 abstractC22044 = activityC22597.f73046.f33811;
        abstractC22044.getClass();
        abstractC22044.m49843(new C19301(c6178));
        activityC22597.f73046.f33806 = false;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        if (this.f2006) {
            this.f2007.finish();
        } else {
            C22673.m51152(R.string.MT_Protector);
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f2007.m40401(exc, (DialogInterface.OnDismissListener) null);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
