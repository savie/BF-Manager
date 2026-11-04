package l;

import java.util.ArrayList;

/* JADX INFO: renamed from: l.ᩳۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18974 extends C7787 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC10023 f61516;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C14307 f61517;

    public C18974(ViewTreeObserverOnPreDrawListenerC10023 viewTreeObserverOnPreDrawListenerC10023, C14307 c14307) {
        this.f61516 = viewTreeObserverOnPreDrawListenerC10023;
        this.f61517 = c14307;
    }

    @Override // l.C7787, l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        ((ArrayList) this.f61517.get(this.f61516.f32147)).remove(abstractC0329);
        abstractC0329.removeListener(this);
    }
}
