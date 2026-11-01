package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ᩴۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18504 extends C9640 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23444 f58945;

    public C18504(C23444 c23444) {
        this.f58945 = c23444;
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۙ */
    public final void mo7023(ResultCallback resultCallback) {
        C23444 c23444 = this.f58945;
        ActivityC5677 activityC5677 = (ActivityC5677) c23444.requireActivity();
        if (c23444.mo19351()) {
            new C19916(activityC5677, new C5804(activityC5677, c23444, true), resultCallback).m10243();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ܰ */
    public final String mo7025() {
        return C6730.m18175(this.f58945.m51659()) + ".smali";
    }

    @Override // l.C9640
    /* JADX INFO: renamed from: ۚ */
    public final boolean mo7024() {
        return this.f58945.mo19351();
    }
}
