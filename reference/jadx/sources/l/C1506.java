package l;

import android.animation.Animator;
import com.google.android.material.animation.AnimatableView;

/* JADX INFO: renamed from: l.֫֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1E5 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1506 implements InterfaceC17547, InterfaceC21921, AnimatableView.Listener {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6081;

    public /* synthetic */ C1506(Object obj) {
        this.f6081 = obj;
    }

    @Override // com.google.android.material.animation.AnimatableView.Listener
    public void onAnimationEnd() {
        ((Animator) this.f6081).start();
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C6027) this.f6081).mo21455(i);
    }

    @Override // l.InterfaceC6258
    /* JADX INFO: renamed from: ۙ */
    public void mo4798(AbstractC20745 abstractC20745) {
        ((C8485) this.f6081).m37937(abstractC20745);
    }
}
