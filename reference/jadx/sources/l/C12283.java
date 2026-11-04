package l;

import android.app.Activity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.ۨۢ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AM8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12283 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Executor f39481;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public InterfaceC16758 f39482;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public InterfaceC9211 f39483;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7404 f39484;

    public C12283(C7404 c7404, Executor executor) {
        C15243.m36590(executor, "executor");
        this.f39484 = c7404;
        this.f39481 = executor;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30672(InterfaceC16758 interfaceC16758) {
        this.f39482 = interfaceC16758;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30671(Activity activity) {
        InterfaceC9211 interfaceC9211 = this.f39483;
        if (interfaceC9211 != null) {
            ((C15374) interfaceC9211).mo24382((CancellationException) null);
        }
        this.f39483 = C5527.m16443(C8509.m22823(new C3992(this.f39481)), new C20488(this, activity, null));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30670() {
        InterfaceC9211 interfaceC9211 = this.f39483;
        if (interfaceC9211 == null) {
            return;
        }
        ((C15374) interfaceC9211).mo24382((CancellationException) null);
    }
}
