package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.᩸ܽ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21700 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f70384 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f70385;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final float f70386;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float f70387;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18878 f70388;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f70389;

    public RunnableC21700(ViewOnTouchListenerC18878 viewOnTouchListenerC18878, float f, float f2, float f3, float f4) {
        this.f70388 = viewOnTouchListenerC18878;
        this.f70386 = f3;
        this.f70389 = f4;
        this.f70385 = f;
        this.f70387 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18878 viewOnTouchListenerC18878 = this.f70388;
        ImageView imageViewM43539 = viewOnTouchListenerC18878.m43539();
        if (imageViewM43539 == null) {
            return;
        }
        float interpolation = ViewOnTouchListenerC18878.f61126.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f70384) * 1.0f) / 300));
        float f = this.f70385;
        viewOnTouchListenerC18878.m43543(C0280.m1792(this.f70387, f, interpolation, f) / viewOnTouchListenerC18878.m43538(), this.f70386, this.f70389);
        if (interpolation < 1.0f) {
            imageViewM43539.postOnAnimation(this);
        }
    }
}
