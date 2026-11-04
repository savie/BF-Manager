package l;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: l.ۚ֡᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes3.dex */
public final class C5288 extends C23188 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18612;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11999 f18613;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11800 f18614;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5288(C11999 c11999, AbstractC11800 abstractC11800, int i, float f, float f2, float f3, float f4, int i2, AbstractC11800 abstractC11801) {
        super(abstractC11800, i, f, f2, f3, f4);
        this.f18613 = c11999;
        this.f18612 = i2;
        this.f18614 = abstractC11801;
    }

    @Override // l.C23188, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f75147) {
            return;
        }
        int i = this.f18612;
        AbstractC11800 abstractC11800 = this.f18614;
        C11999 c11999 = this.f18613;
        if (i <= 0) {
            c11999.f38680.mo25773(c11999.f38692, abstractC11800);
        } else {
            c11999.f38696.add(abstractC11800.itemView);
            this.f75149 = true;
            if (i > 0) {
                c11999.f38692.post(new RunnableC1559(c11999, this, i));
            }
        }
        View view = c11999.f38686;
        View view2 = abstractC11800.itemView;
        if (view == view2) {
            c11999.m30176(view2);
        }
    }
}
