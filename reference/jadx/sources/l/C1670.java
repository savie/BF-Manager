package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.֫۟ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes2.dex */
public final class C1670 implements ResultCallback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6111 f6652;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20409 f6653;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f6654;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f6655;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC2916 f6656;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C1670(C20409 c20409, C6111 c6111, InterfaceC2916 interfaceC2916, String str, Runnable runnable) {
        this.f6653 = c20409;
        this.f6652 = c6111;
        this.f6656 = interfaceC2916;
        this.f6655 = str;
        this.f6654 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        C20409 c20409 = this.f6653;
        C6111 c6111 = c20409.f66125;
        if (c6111 == this.f6652) {
            if (c6111 == null || c6111.m17000() == this.f6656) {
                if (!this.f6655.equals(c20409.m13346().f53983.mo33986()) || c20409.m13338()) {
                    return;
                }
                this.f6654.run();
            }
        }
    }
}
