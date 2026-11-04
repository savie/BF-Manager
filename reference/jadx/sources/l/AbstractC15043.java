package l;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/* JADX INFO: renamed from: l.ܳۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 859N */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15043 extends AbstractC19519 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f49096;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f49097;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f49098;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C12806 f49099;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f49100;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f49101;

    /* JADX INFO: renamed from: ۤ */
    public abstract Animator[] mo16002();

    public AbstractC15043(BaseAdapter baseAdapter) {
        super(baseAdapter);
        this.f49100 = true;
        this.f49098 = true;
        this.f49096 = -1;
        this.f49101 = true;
        if (baseAdapter instanceof AbstractC15043) {
            ((AbstractC15043) baseAdapter).f49101 = false;
        }
    }

    @Override // l.AbstractC19519, l.InterfaceC1620
    /* JADX INFO: renamed from: ۙ */
    public final void mo5718(C7172 c7172) {
        super.mo5718(c7172);
        this.f49099 = new C12806(c7172);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m36200() {
        if (m45066() == null) {
            throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
        }
        this.f49099.m31767();
        this.f49098 = true;
        this.f49096 = -1;
        this.f49097 = System.currentTimeMillis();
        if (m45064() instanceof AbstractC15043) {
            ((AbstractC15043) m45064()).m36200();
        }
    }

    @Override // l.AbstractC19519, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = this.f49101;
        if (z) {
            if (m45066() == null) {
                throw new IllegalStateException("Call setAbsListView() on this AnimationAdapter first!");
            }
            if (view != null) {
                this.f49099.m31769(view);
            }
        }
        View view2 = super.getView(i, view, viewGroup);
        if (z && this.f49100 && System.currentTimeMillis() - this.f49097 < 500) {
            boolean z2 = this.f49098 && ((i2 = this.f49096) == -1 || i2 == i);
            this.f49098 = z2;
            if (z2) {
                this.f49096 = i;
            }
            Animator[] animatorArrMo16002 = m45064() instanceof AbstractC15043 ? ((AbstractC15043) m45064()).mo16002() : new Animator[0];
            Animator[] animatorArrMo16003 = mo16002();
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, "alpha", 0.0f, view2.getAlpha());
            int length = animatorArrMo16002.length + animatorArrMo16003.length;
            Animator[] animatorArr = new Animator[length + 1];
            int i3 = 0;
            while (i3 < animatorArrMo16002.length) {
                animatorArr[i3] = animatorArrMo16002[i3];
                i3++;
            }
            for (Animator animator : animatorArrMo16003) {
                animatorArr[i3] = animator;
                i3++;
            }
            animatorArr[length] = objectAnimatorOfFloat;
            this.f49099.m31768(i, view2, animatorArr);
        }
        return view2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36199(boolean z) {
        this.f49100 = z;
    }
}
