package l;

import android.animation.ValueAnimator;

/* JADX INFO: renamed from: l.ۜܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC6889 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18178 f23197;

    public RunnableC6889(C18178 c18178) {
        this.f23197 = c18178;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C18178 c18178 = this.f23197;
        ValueAnimator valueAnimator = c18178.f58089;
        int i = c18178.f58082;
        if (i == 1) {
            valueAnimator.cancel();
        } else if (i != 2) {
            return;
        }
        c18178.f58082 = 3;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        valueAnimator.setDuration(500);
        valueAnimator.start();
    }
}
