package l;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: l.ᩳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19001 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19479 f61556;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3071 f61557;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC19479 f61558;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC3071 f61559;

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        C15243.m36590(backEvent, "backEvent");
        this.f61557.invoke(new C18584(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        C15243.m36590(backEvent, "backEvent");
        this.f61559.invoke(new C18584(backEvent));
    }

    public C19001(InterfaceC3071 interfaceC3071, InterfaceC3071 interfaceC3072, InterfaceC19479 interfaceC19479, InterfaceC19479 interfaceC194710) {
        this.f61559 = interfaceC3071;
        this.f61557 = interfaceC3072;
        this.f61558 = interfaceC19479;
        this.f61556 = interfaceC194710;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f61558.mo4064();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f61556.mo4064();
    }
}
