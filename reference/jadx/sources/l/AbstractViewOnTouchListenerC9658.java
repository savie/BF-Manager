package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractViewOnTouchListenerC9658 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f32469;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f32470;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int[] f32471 = new int[2];

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f32472;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f32473;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final int f32474;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final View f32475;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f32476;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Runnable f32477;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC6503 mo23973();

    /* JADX INFO: renamed from: ܰ */
    public abstract boolean mo23975();

    public AbstractViewOnTouchListenerC9658(View view) {
        this.f32475 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f32472 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f32470 = tapTimeout;
        this.f32474 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C6129 c6129;
        boolean z2 = this.f32469;
        View view2 = this.f32475;
        if (!z2) {
            if (view2.isEnabled()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f32473 = motionEvent.getPointerId(0);
                    if (this.f32476 == null) {
                        this.f32476 = new RunnableC14597(this);
                    }
                    view2.postDelayed(this.f32476, this.f32470);
                    if (this.f32477 == null) {
                        this.f32477 = new RunnableC1895(this);
                    }
                    view2.postDelayed(this.f32477, this.f32474);
                } else if (actionMasked == 1) {
                    m24556();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f32473);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f32472;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m24556();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = mo23975();
                        }
                    }
                } else if (actionMasked == 3) {
                    m24556();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        } else {
            InterfaceC6503 interfaceC6503Mo23973 = mo23973();
            if (interfaceC6503Mo23973 == null || !interfaceC6503Mo23973.isShowing() || (c6129 = (C6129) interfaceC6503Mo23973.mo17704()) == null || !c6129.isShown()) {
                if (mo23974()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f32471;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c6129.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM17111 = c6129.m17111(motionEventObtainNoHistory, this.f32473);
                motionEventObtainNoHistory.recycle();
                int actionMasked2 = motionEvent.getActionMasked();
                boolean z3 = (actionMasked2 == 1 || actionMasked2 == 3) ? false : true;
                if (zM17111 && z3) {
                    z = true;
                } else if (mo23974()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.f32469 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f32469 = false;
        this.f32473 = -1;
        Runnable runnable = this.f32476;
        if (runnable != null) {
            this.f32475.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ۨ */
    public boolean mo23974() {
        InterfaceC6503 interfaceC6503Mo23973 = mo23973();
        if (interfaceC6503Mo23973 == null || !interfaceC6503Mo23973.isShowing()) {
            return true;
        }
        interfaceC6503Mo23973.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m24556() {
        Runnable runnable = this.f32477;
        View view = this.f32475;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f32476;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m24557() {
        m24556();
        View view = this.f32475;
        if (view.isEnabled() && !view.isLongClickable() && mo23975()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f32469 = true;
        }
    }
}
