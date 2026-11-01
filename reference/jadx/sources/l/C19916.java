package l;

import android.content.DialogInterface;
import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.᩶ۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19916 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f63833;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5804 f63834;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC5677 f63835;

    public C19916(ActivityC5677 activityC5677, C5804 c5804, ResultCallback resultCallback) {
        this.f63835 = activityC5677;
        this.f63834 = c5804;
        this.f63833 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f63835, R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public final void mo1159() {
        this.f63834.mo15975();
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1157() {
        this.f63835.m15679();
        C15829.m37611(R.string.MT_Protector);
        ResultCallback resultCallback = this.f63833;
        if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        if (this.f63834.mo15974(exc) != null) {
            this.f63835.m31002(exc, (DialogInterface.OnDismissListener) null);
        }
        ResultCallback resultCallback = this.f63833;
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
