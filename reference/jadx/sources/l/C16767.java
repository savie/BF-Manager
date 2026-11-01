package l;

import android.animation.Animator;
import android.view.View;

/* JADX INFO: renamed from: l.ܽܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: B66A */
/* JADX INFO: loaded from: classes4.dex */
public final class C16767 extends C1949 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f53666;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4647 f53667;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC12554 f53668;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16767(C4647 c4647, AbstractC12554 abstractC12554, int i, float f, float f2, float f3, float f4, int i2, AbstractC12554 abstractC12555) {
        super(abstractC12554, i, f, f2, f3, f4);
        this.f53667 = c4647;
        this.f53666 = i2;
        this.f53668 = abstractC12555;
    }

    @Override // l.C1949, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.f7341) {
            return;
        }
        int i = this.f53666;
        AbstractC12554 abstractC12554 = this.f53668;
        C4647 c4647 = this.f53667;
        if (i <= 0) {
            c4647.f16422.mo28055(c4647.f16432, abstractC12554);
        } else {
            c4647.f16431.add(abstractC12554.itemView);
            this.f7338 = true;
            if (i > 0) {
                c4647.f16432.post(new RunnableC12534(c4647, this, i));
            }
        }
        View view = c4647.f16430;
        View view2 = abstractC12554.itemView;
        if (view == view2) {
            c4647.m12828(view2);
        }
    }
}
