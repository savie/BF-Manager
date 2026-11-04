package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫᩶ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13349 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17078 f42563;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f42564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f42565;

    public C13349(ActivityC0848 activityC0848, C17078 c17078, ResultCallback resultCallback) {
        this.f42565 = activityC0848;
        this.f42563 = c17078;
        this.f42564 = resultCallback;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f42565, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f42563.mo29882();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f42565.m3440();
        C22673.m51152(R.string.MT_Protector);
        ResultCallback resultCallback = this.f42564;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f42563.mo29881(exc) != null) {
            this.f42565.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f42564;
        if (resultCallback != null) {
            resultCallback.onFailure(C22327.m50390(exc));
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩸ */
    public final void mo1138() {
        m8196();
    }
}
