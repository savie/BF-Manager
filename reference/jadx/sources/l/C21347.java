package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩸ۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C21347 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f69465;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10059 f69466;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f69467;

    public C21347(ActivityC5677 activityC5677, C10059 c10059, ResultCallback resultCallback) {
        this.f69467 = activityC5677;
        this.f69466 = c10059;
        this.f69465 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f69467, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f69466.mo15975();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f69467.m15679();
        C15829.m37611(R.string.MT_Protector);
        ResultCallback resultCallback = this.f69465;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f69466.mo15974(exc) != null) {
            this.f69467.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f69465;
        if (resultCallback != null) {
            resultCallback.onFailure(C2641.m8151(exc));
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۖ */
    public final void mo1156() {
        m10251();
    }
}
