package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.֨֫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 61L9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0858 implements ResultCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f3231;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11555 f3232;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C0858(C11555 c11555, Runnable runnable) {
        this.f3232 = c11555;
        this.f3231 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        if (this.f3232.m29071()) {
            this.f3231.run();
        }
    }
}
