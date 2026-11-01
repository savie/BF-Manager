package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes4.dex */
public final class C20554 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f66554;

    public C20554(View view) {
        this.f66554 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46324(long j) {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46323(float f) {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46330(float f) {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long m46329() {
        View view = (View) this.f66554.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46325(Interpolator interpolator) {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m46331(long j) {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46322() {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m46328() {
        View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46326(InterfaceC15616 interfaceC15616) {
        View view = (View) this.f66554.get();
        if (view != null) {
            if (interfaceC15616 != null) {
                view.animate().setListener(new C7148(interfaceC15616, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46327(final InterfaceC19849 interfaceC19849) {
        final View view = (View) this.f66554.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC19849 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۤ֫
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC19849.mo28467(view);
                }
            } : null);
        }
    }
}
