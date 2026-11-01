package l;

import android.view.View;

/* JADX INFO: renamed from: l.ۛ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6341 extends AbstractC20537 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC11281 f21393;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC20537 f21394;

    public C6341(DialogInterfaceOnCancelListenerC11281 dialogInterfaceOnCancelListenerC11281, AbstractC20537 abstractC20537) {
        this.f21393 = dialogInterfaceOnCancelListenerC11281;
        this.f21394 = abstractC20537;
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ۙ */
    public final View mo12110(int i) {
        AbstractC20537 abstractC20537 = this.f21394;
        if (abstractC20537.mo12111()) {
            return abstractC20537.mo12110(i);
        }
        return this.f21393.onFindViewById(i);
    }

    @Override // l.AbstractC20537
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo12111() {
        return this.f21394.mo12111() || this.f21393.onHasView();
    }
}
