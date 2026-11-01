package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.᩹֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 560O */
/* JADX INFO: loaded from: classes4.dex */
public final class C21977 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3631 f71286;

    public C21977(C3631 c3631) {
        this.f71286 = c3631;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C3631 c3631 = this.f71286;
        ArrayList arrayList = new ArrayList(c3631.f13337);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2220) arrayList.get(i)).onAnimationStart(c3631);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3631 c3631 = this.f71286;
        ArrayList arrayList = new ArrayList(c3631.f13337);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC2220) arrayList.get(i)).onAnimationEnd(c3631);
        }
    }
}
