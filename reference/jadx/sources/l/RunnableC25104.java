package l;

/* JADX INFO: renamed from: l.᩻ܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC25104 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AnimationAnimationListenerC16898 f81189;

    public RunnableC25104(AnimationAnimationListenerC16898 animationAnimationListenerC16898) {
        this.f81189 = animationAnimationListenerC16898;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationAnimationListenerC16898 animationAnimationListenerC16898 = this.f81189;
        animationAnimationListenerC16898.f55259.endViewTransition(animationAnimationListenerC16898.f55260);
        animationAnimationListenerC16898.f55257.m18238();
    }
}
