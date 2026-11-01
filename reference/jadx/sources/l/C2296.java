package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ۖۙۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2296 extends C9640 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7236 f8177;

    public C2296(C7236 c7236) {
        this.f8177 = c7236;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo7023(ResultCallback resultCallback) {
        C7236 c7236 = this.f8177;
        ActivityC5677 activityC5677 = (ActivityC5677) c7236.requireActivity();
        if (c7236.mo19351()) {
            new C21347(activityC5677, new C10059(activityC5677, c7236, true), resultCallback).m10243();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo7025() {
        return C6730.m18175(this.f8177.m19346()) + ".xml";
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo7024() {
        return this.f8177.mo19351();
    }
}
