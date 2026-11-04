package l;

import android.view.View;

/* JADX INFO: renamed from: l.۟ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z4K7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7949 extends AbstractC24293 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC19136 f26420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC24293 f26421;

    public C7949(DialogInterfaceOnCancelListenerC19136 dialogInterfaceOnCancelListenerC19136, AbstractC24293 abstractC24293) {
        this.f26420 = dialogInterfaceOnCancelListenerC19136;
        this.f26421 = abstractC24293;
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final View mo21642(int i) {
        AbstractC24293 abstractC24293 = this.f26421;
        if (abstractC24293.mo21643()) {
            return abstractC24293.mo21642(i);
        }
        return this.f26420.onFindViewById(i);
    }

    @Override // l.AbstractC24293
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo21643() {
        return this.f26421.mo21643() || this.f26420.onHasView();
    }
}
