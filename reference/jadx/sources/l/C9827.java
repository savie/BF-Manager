package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۢۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes3.dex */
public final class C9827 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2370 f31638;

    public C9827(C2370 c2370) {
        this.f31638 = c2370;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C2370 c2370 = this.f31638;
        ArrayList arrayList = new ArrayList(c2370.f7631);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7591) arrayList.get(i)).onAnimationStart(c2370);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2370 c2370 = this.f31638;
        ArrayList arrayList = new ArrayList(c2370.f7631);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC7591) arrayList.get(i)).onAnimationEnd(c2370);
        }
    }
}
