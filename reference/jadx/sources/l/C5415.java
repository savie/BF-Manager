package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۚܳܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes3.dex */
public final class C5415 extends C2592 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC22349 f18702;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21445 f18703;

    public C5415(ViewTreeObserverOnPreDrawListenerC22349 viewTreeObserverOnPreDrawListenerC22349, C21445 c21445) {
        this.f18702 = viewTreeObserverOnPreDrawListenerC22349;
        this.f18703 = c21445;
    }

    @Override // l.C2592, l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        ((ArrayList) this.f18703.getOrDefault(this.f18702.f73018, null)).remove(abstractC11766);
        abstractC11766.removeListener(this);
    }
}
