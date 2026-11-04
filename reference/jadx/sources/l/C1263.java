package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.֨ܶۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C1263 extends C9959 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C25350 f4556;

    public C1263(C25350 c25350) {
        this.f4556 = c25350;
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4581(ResultCallback resultCallback) {
        C25350 c25350 = this.f4556;
        ActivityC0848 activityC0848 = (ActivityC0848) c25350.requireActivity();
        if (c25350.mo24170()) {
            new C23112(activityC0848, new C11923(activityC0848, c25350, true), resultCallback).m8197();
        } else if (resultCallback != null) {
            resultCallback.onSuccess();
        }
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo4583() {
        return C11293.m28558(this.f4556.m56683()) + ".xml";
    }

    @Override // l.C9959
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean mo4582() {
        return this.f4556.mo24170();
    }
}
