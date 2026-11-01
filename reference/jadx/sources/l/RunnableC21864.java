package l;

/* JADX INFO: renamed from: l.᩸᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21864 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AnimationAnimationListenerC18336 f70951;

    public RunnableC21864(AnimationAnimationListenerC18336 animationAnimationListenerC18336) {
        this.f70951 = animationAnimationListenerC18336;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimationAnimationListenerC18336 animationAnimationListenerC18336 = this.f70951;
        animationAnimationListenerC18336.f58495.endViewTransition(animationAnimationListenerC18336.f58492);
        animationAnimationListenerC18336.f58493.m47610();
    }
}
