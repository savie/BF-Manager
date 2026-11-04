package l;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.ۙܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 44YF */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC5028 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f17422;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int[] f17423 = new int[2];

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final float f17424;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Runnable f17425;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f17426;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17427;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f17428;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final View f17429;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Runnable f17430;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC16501 mo12194();

    /* JADX INFO: renamed from: ᩷ */
    public abstract boolean mo12195();

    public AbstractViewOnTouchListenerC5028(View view) {
        this.f17429 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f17424 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f17426 = tapTimeout;
        this.f17422 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        C9479 c9479;
        boolean z2 = this.f17428;
        View view2 = this.f17429;
        if (!z2) {
            if (view2.isEnabled()) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 0) {
                    this.f17427 = motionEvent.getPointerId(0);
                    if (this.f17430 == null) {
                        this.f17430 = new RunnableC7243(this);
                    }
                    view2.postDelayed(this.f17430, this.f17426);
                    if (this.f17425 == null) {
                        this.f17425 = new RunnableC13954(this);
                    }
                    view2.postDelayed(this.f17425, this.f17422);
                } else if (actionMasked == 1) {
                    m15251();
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f17427);
                    if (iFindPointerIndex >= 0) {
                        float x = motionEvent.getX(iFindPointerIndex);
                        float y = motionEvent.getY(iFindPointerIndex);
                        float f = this.f17424;
                        float f2 = -f;
                        if (x < f2 || y < f2 || x >= (view2.getRight() - view2.getLeft()) + f || y >= (view2.getBottom() - view2.getTop()) + f) {
                            m15251();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            z = mo12195();
                        }
                    }
                } else if (actionMasked == 3) {
                    m15251();
                }
            }
            if (z) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        } else {
            InterfaceC16501 interfaceC16501Mo12194 = mo12194();
            if (interfaceC16501Mo12194 == null || !interfaceC16501Mo12194.isShowing() || (c9479 = (C9479) interfaceC16501Mo12194.mo39127()) == null || !c9479.isShown()) {
                if (mo14897()) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f17423;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                c9479.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zM24864 = c9479.m24864(motionEventObtainNoHistory, this.f17427);
                motionEventObtainNoHistory.recycle();
                int actionMasked2 = motionEvent.getActionMasked();
                boolean z3 = (actionMasked2 == 1 || actionMasked2 == 3) ? false : true;
                if (zM24864 && z3) {
                    z = true;
                } else if (mo14897()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        this.f17428 = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f17428 = false;
        this.f17427 = -1;
        Runnable runnable = this.f17430;
        if (runnable != null) {
            this.f17429.removeCallbacks(runnable);
        }
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo14897() {
        InterfaceC16501 interfaceC16501Mo12194 = mo12194();
        if (interfaceC16501Mo12194 == null || !interfaceC16501Mo12194.isShowing()) {
            return true;
        }
        interfaceC16501Mo12194.dismiss();
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m15251() {
        Runnable runnable = this.f17425;
        View view = this.f17429;
        if (runnable != null) {
            view.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f17430;
        if (runnable2 != null) {
            view.removeCallbacks(runnable2);
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m15252() {
        m15251();
        View view = this.f17429;
        if (view.isEnabled() && !view.isLongClickable() && mo12195()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f17428 = true;
        }
    }
}
