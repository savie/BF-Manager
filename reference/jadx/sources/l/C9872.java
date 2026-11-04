package l;

import bin.mt.plugin.api.util.ResultCallback;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۢۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes.dex */
public final class C9872 extends AbstractC2432 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9431 f31767;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ResultCallback f31768;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC18143 f31769;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f31770;

    static {
        ApplicationC23172.m52091(88);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public native void mo1134();

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩴ */
    public native void mo1136();

    public C9872(C7941 c7941, ActivityC18143 activityC18143, ResultCallback resultCallback, C9431 c9431) {
        this.f31770 = c7941;
        this.f31769 = activityC18143;
        this.f31768 = resultCallback;
        this.f31767 = c9431;
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ᩷ */
    public final void mo1137() {
        m8191(this.f31769, this.f31770.m21611() ? R.string.MT_Protector : R.string.MT_Protector);
    }

    @Override // l.AbstractC2432
    /* JADX INFO: renamed from: ۙ */
    public final void mo1135(Exception exc) {
        this.f31770.m21528(exc, this.f31769, this.f31767);
        ResultCallback resultCallback = this.f31768;
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
