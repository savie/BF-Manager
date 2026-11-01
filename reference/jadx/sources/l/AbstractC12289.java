package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.۫۠ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 859N */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12289 extends AbstractC16522 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f41095;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public C17227 f41096;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public long f41097;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f41098;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f41099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f41100;

    /* JADX INFO: renamed from: ۨ */
    public abstract Animator[] mo16211();

    public AbstractC12289(BaseAdapter baseAdapter) {
        super(baseAdapter);
        this.f41095 = true;
        this.f41098 = true;
        this.f41099 = -1;
        this.f41100 = true;
        if (baseAdapter instanceof AbstractC12289) {
            ((AbstractC12289) baseAdapter).f41100 = false;
        }
    }

    @Override // l.AbstractC16522, l.InterfaceC23578
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30531(C10878 c10878) {
        super.mo30531(c10878);
        this.f41096 = new C17227(c10878);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m30530() {
        if (m38886() == null) {
            throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
        }
        this.f41096.m40165();
        this.f41098 = true;
        this.f41099 = -1;
        this.f41097 = System.currentTimeMillis();
        if (m38884() instanceof AbstractC12289) {
            ((AbstractC12289) m38884()).m30530();
        }
    }

    @Override // l.AbstractC16522, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = this.f41100;
        if (z) {
            if (m38886() == null) {
                throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
            }
            if (view != null) {
                this.f41096.m40167(view);
            }
        }
        View view2 = super.getView(i, view, viewGroup);
        if (z && this.f41095 && System.currentTimeMillis() - this.f41097 < 500) {
            boolean z2 = this.f41098 && ((i2 = this.f41099) == -1 || i2 == i);
            this.f41098 = z2;
            if (z2) {
                this.f41099 = i;
            }
            Animator[] animatorArrMo16211 = m38884() instanceof AbstractC12289 ? ((AbstractC12289) m38884()).mo16211() : new Animator[0];
            Animator[] animatorArrMo16212 = mo16211();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, view2.getAlpha());
            int length = animatorArrMo16211.length + animatorArrMo16212.length;
            Animator[] animatorArr = new Animator[length + 1];
            int i3 = 0;
            while (i3 < animatorArrMo16211.length) {
                animatorArr[i3] = animatorArrMo16211[i3];
                i3++;
            }
            for (Animator animator : animatorArrMo16212) {
                animatorArr[i3] = animator;
                i3++;
            }
            animatorArr[length] = objectAnimatorOfFloat;
            this.f41096.m40166(i, view2, animatorArr);
        }
        return view2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30532(boolean z) {
        this.f41095 = z;
    }
}
