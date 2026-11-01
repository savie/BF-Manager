package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: l.ۢۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9307 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractViewOnTouchListenerC2955 f31578;

    public RunnableC9307(AbstractViewOnTouchListenerC2955 abstractViewOnTouchListenerC2955) {
        this.f31578 = abstractViewOnTouchListenerC2955;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractViewOnTouchListenerC2955 abstractViewOnTouchListenerC2955 = this.f31578;
        View view = abstractViewOnTouchListenerC2955.f11070;
        C1544 c1544 = abstractViewOnTouchListenerC2955.f11072;
        if (abstractViewOnTouchListenerC2955.f11063) {
            if (abstractViewOnTouchListenerC2955.f11064) {
                abstractViewOnTouchListenerC2955.f11064 = false;
                c1544.m5322();
            }
            if (!c1544.m5325()) {
                int iM5321 = c1544.m5321();
                c1544.m5326();
                if (iM5321 != 0 && abstractViewOnTouchListenerC2955.mo8782(iM5321)) {
                    if (abstractViewOnTouchListenerC2955.f11073) {
                        abstractViewOnTouchListenerC2955.f11073 = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        view.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    c1544.m5323();
                    abstractViewOnTouchListenerC2955.mo8783(c1544.m5328());
                    int i = C5031.f17539;
                    view.postOnAnimation(this);
                    return;
                }
            }
            abstractViewOnTouchListenerC2955.f11063 = false;
        }
    }
}
