package l;

/* JADX INFO: renamed from: l.ᩳ᩻ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5U9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18386 implements InterfaceC24031 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Runnable f58631;

    @Override // l.InterfaceC24031
    public final void onTransitionCancel(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionPause(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionResume(AbstractC11766 abstractC11766) {
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766) {
        throw null;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionStart(AbstractC11766 abstractC11766, boolean z) {
    }

    public C18386(Runnable runnable) {
        this.f58631 = runnable;
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766) {
        this.f58631.run();
    }

    @Override // l.InterfaceC24031
    public final void onTransitionEnd(AbstractC11766 abstractC11766, boolean z) {
        onTransitionEnd(abstractC11766);
    }
}
