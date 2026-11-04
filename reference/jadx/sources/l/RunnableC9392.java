package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9392 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC2681 f30487;

    public RunnableC9392(AbstractViewOnTouchListenerC2681 abstractViewOnTouchListenerC2681) {
        this.f30487 = abstractViewOnTouchListenerC2681;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC2681 abstractViewOnTouchListenerC2681 = this.f30487;
        View view = abstractViewOnTouchListenerC2681.f8538;
        C1190 c1190 = abstractViewOnTouchListenerC2681.f8544;
        if (abstractViewOnTouchListenerC2681.f8541) {
            if (abstractViewOnTouchListenerC2681.f8535) {
                abstractViewOnTouchListenerC2681.f8535 = false;
                c1190.m4382();
            }
            if (!c1190.m4389()) {
                int iM4391 = c1190.m4391();
                c1190.m4386();
                if (iM4391 != 0 && abstractViewOnTouchListenerC2681.mo8854(iM4391)) {
                    if (abstractViewOnTouchListenerC2681.f8531) {
                        abstractViewOnTouchListenerC2681.f8531 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    c1190.m4383();
                    abstractViewOnTouchListenerC2681.mo8855(c1190.m4390());
                    int i = C22666.f73603;
                    view.postOnAnimation(this);
                    return;
                }
            }
            abstractViewOnTouchListenerC2681.f8541 = false;
        }
    }
}
