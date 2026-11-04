package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ۜܰۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7185 extends C9959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16332 f23732;

    public C7185(C16332 c16332) {
        this.f23732 = c16332;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ */
    public final void mo4581(ResultCallback resultCallback) {
        C16332 c16332 = this.f23732;
        ActivityC0848 activityC0848 = (ActivityC0848) c16332.requireActivity();
        if (c16332.mo24170()) {
            new C13349(activityC0848, new C17078(activityC0848, c16332, true), resultCallback).m8197();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩷ */
    public final String mo4583() {
        return C11293.m28558(this.f23732.m38820()) + ".smali";
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩴ */
    public final boolean mo4582() {
        return this.f23732.mo24170();
    }
}
