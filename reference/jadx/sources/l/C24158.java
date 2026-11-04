package l;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.᩺۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes.dex */
public final class C24158 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final WeakReference f78173;

    public C24158(View view) {
        this.f78173 = new WeakReference(view);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54121(long j) {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54120(float f) {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54127(float f) {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m54126() {
        View view = (View) this.f78173.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54122(Interpolator interpolator) {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m54128(long j) {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54119() {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m54125() {
        View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54123(InterfaceC4020 interfaceC4020) {
        View view = (View) this.f78173.get();
        if (view != null) {
            if (interfaceC4020 != null) {
                view.animate().setListener(new C6258(interfaceC4020, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m54124(final InterfaceC14460 interfaceC14460) {
        final View view = (View) this.f78173.get();
        if (view != null) {
            view.animate().setUpdateListener(interfaceC14460 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: l.ۨ۠
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    interfaceC14460.mo34929(view);
                }
            } : null);
        }
    }
}
