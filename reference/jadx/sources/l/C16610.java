package l;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: renamed from: l.ܽۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: K234 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16610 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15456 f53303;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4871 f53304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15456 f53305;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC4871 f53306;

    @Override // android.window.OnBackAnimationCallback
    public final void onBackProgressed(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        this.f53305.invoke(new C0443(backEvent));
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackStarted(BackEvent backEvent) {
        C13465.m32966(backEvent, "backEvent");
        this.f53303.invoke(new C0443(backEvent));
    }

    public C16610(InterfaceC15456 interfaceC15456, InterfaceC15456 interfaceC15457, InterfaceC4871 interfaceC4871, InterfaceC4871 interfaceC4872) {
        this.f53303 = interfaceC15456;
        this.f53305 = interfaceC15457;
        this.f53306 = interfaceC4871;
        this.f53304 = interfaceC4872;
    }

    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        this.f53306.mo3788();
    }

    @Override // android.window.OnBackAnimationCallback
    public final void onBackCancelled() {
        this.f53304.mo3788();
    }
}
