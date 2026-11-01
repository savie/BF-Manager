package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.ܺۘۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: O1K3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15683 implements ResultCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f50922;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C15683(Runnable runnable) {
        this.f50922 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        this.f50922.run();
    }
}
