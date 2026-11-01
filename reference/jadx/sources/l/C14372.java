package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܳ۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C14372 extends AbstractC3492 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC11632 f47107;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f47108;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f47109;

    static {
        ApplicationC6132.m17119(127);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public native void mo1157();

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۚ */
    public native void mo1159();

    public C14372(C20409 c20409, ActivityC11632 activityC11632, ResultCallback resultCallback) {
        this.f47109 = c20409;
        this.f47107 = activityC11632;
        this.f47108 = resultCallback;
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ܰ */
    public final void mo1160() {
        m10246(this.f47107, this.f47109.m46053() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC3492
    /* JADX INFO: renamed from: ۙ */
    public final void mo1158(Exception exc) {
        this.f47109.m46062(exc, this.f47107);
        ResultCallback resultCallback = this.f47108;
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
