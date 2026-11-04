package l;

/* JADX INFO: renamed from: l.᩷ۡ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes.dex */
public final class C21958 implements InterfaceC12261 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f70875;

    @Override // l.InterfaceC12261
    public final void onTransitionCancel(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionPause(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionResume(AbstractC0329 abstractC0329) {
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329) {
        throw null;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionStart(AbstractC0329 abstractC0329, boolean z) {
    }

    public C21958(Runnable runnable) {
        this.f70875 = runnable;
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329) {
        this.f70875.run();
    }

    @Override // l.InterfaceC12261
    public final void onTransitionEnd(AbstractC0329 abstractC0329, boolean z) {
        onTransitionEnd(abstractC0329);
    }
}
