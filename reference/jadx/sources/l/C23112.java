package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸᩹ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes.dex */
public final class C23112 extends AbstractC2432 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11923 f74963;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f74964;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC0848 f74965;

    public C23112(ActivityC0848 activityC0848, C11923 c11923, ResultCallback resultCallback) {
        this.f74965 = activityC0848;
        this.f74963 = c11923;
        this.f74964 = resultCallback;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f74965, R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public final void mo1136() {
        this.f74963.mo29882();
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1134() {
        this.f74965.m3440();
        C22673.m51152(R.string.MT_Protector);
        ResultCallback resultCallback = this.f74964;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        if (this.f74963.mo29881(exc) != null) {
            this.f74965.m40401(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f74964;
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
