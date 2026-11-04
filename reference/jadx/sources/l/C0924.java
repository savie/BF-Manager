package l;

import bin.mt.plugin.api.util.ResultCallback;

/* JADX INFO: renamed from: l.֨ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes3.dex */
public final class C0924 implements ResultCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7941 f3440;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ String f3441;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f3442;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19106 f3443;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24132 f3444;

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onFailure(String str) {
    }

    public C0924(C7941 c7941, C24132 c24132, InterfaceC19106 interfaceC19106, String str, Runnable runnable) {
        this.f3440 = c7941;
        this.f3444 = c24132;
        this.f3443 = interfaceC19106;
        this.f3441 = str;
        this.f3442 = runnable;
    }

    @Override // bin.mt.plugin.api.util.ResultCallback
    public final void onSuccess() {
        C7941 c7941 = this.f3440;
        C24132 c24132 = c7941.f26387;
        if (c24132 == this.f3444) {
            if (c24132 == null || c24132.m54021() == this.f3443) {
                if (!this.f3441.equals(c7941.m19934().f30601.mo4294()) || c7941.m19933()) {
                    return;
                }
                this.f3442.run();
            }
        }
    }
}
