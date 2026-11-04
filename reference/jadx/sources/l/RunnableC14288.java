package l;

import android.widget.ImageView;

/* JADX INFO: renamed from: l.ܰۖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5PO */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC14288 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float f45117;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float f45118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float f45119;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f45120 = System.currentTimeMillis();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnTouchListenerC18018 f45121;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f45122;

    public RunnableC14288(ViewOnTouchListenerC18018 viewOnTouchListenerC18018, float f, float f2, float f3, float f4) {
        this.f45121 = viewOnTouchListenerC18018;
        this.f45119 = f3;
        this.f45122 = f4;
        this.f45118 = f;
        this.f45117 = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewOnTouchListenerC18018 viewOnTouchListenerC18018 = this.f45121;
        ImageView imageViewM42022 = viewOnTouchListenerC18018.m42022();
        if (imageViewM42022 == null) {
            return;
        }
        float interpolation = ViewOnTouchListenerC18018.f58981.getInterpolation(Math.min(1.0f, ((System.currentTimeMillis() - this.f45120) * 1.0f) / 300));
        float f = this.f45118;
        viewOnTouchListenerC18018.m42012(C19967.m45884(this.f45117, f, interpolation, f) / viewOnTouchListenerC18018.m42018(), this.f45119, this.f45122);
        if (interpolation < 1.0f) {
            imageViewM42022.postOnAnimation(this);
        }
    }
}
