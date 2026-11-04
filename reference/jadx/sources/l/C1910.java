package l;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: renamed from: l.֫ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7IM */
/* JADX INFO: loaded from: classes2.dex */
public class C1910 extends View {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public MotionEvent f6428;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f6429;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C16079 f6430;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f6431;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float f6432;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6433;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f6434;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f6435;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public InterfaceC9409 f6436;

    public C1910(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1910(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6435 = new int[2];
        this.f6432 = ViewConfiguration.get(context).getScaledTouchSlop();
        setFocusable(true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6577(C16079 c16079, InterfaceC9409 interfaceC9409, View view) {
        this.f6430 = c16079;
        this.f6436 = interfaceC9409;
        this.f6434 = view;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[PHI: r0
      0x0073: PHI (r0v18 android.view.MotionEvent) = (r0v17 android.view.MotionEvent), (r0v21 android.view.MotionEvent) binds: [B:33:0x0071, B:30:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C16079 c16079;
        MotionEvent motionEvent2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            MotionEvent motionEvent3 = this.f6428;
            if (motionEvent3 != null) {
                motionEvent3.recycle();
                this.f6428 = null;
            }
            this.f6433 = 0;
            InterfaceC9409 interfaceC9409 = this.f6436;
            if ((interfaceC9409 != null && interfaceC9409.mo24787(motionEvent.getRawX(), motionEvent.getRawY())) || (c16079 = this.f6430) == null || c16079.getVisibility() != 0) {
                return false;
            }
            this.f6429 = motionEvent.getRawX();
            this.f6431 = motionEvent.getRawY();
            this.f6428 = MotionEvent.obtain(motionEvent);
            m6576(this.f6434, motionEvent);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                int i = this.f6433;
                if (i == 1 || i == 2) {
                    return m6575(motionEvent);
                }
                float fAbs = Math.abs(motionEvent.getRawX() - this.f6429);
                float fAbs2 = Math.abs(motionEvent.getRawY() - this.f6431);
                if (Math.max(fAbs, fAbs2) <= this.f6432) {
                    return true;
                }
                if (fAbs2 > fAbs) {
                    this.f6433 = 1;
                    View view = this.f6434;
                    if (view != null && view.getVisibility() == 0) {
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(3);
                        m6576(this.f6434, motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    MotionEvent motionEvent4 = this.f6428;
                    if (motionEvent4 != null) {
                        m6576(this.f6430, motionEvent4);
                        motionEvent2 = this.f6428;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                            this.f6428 = null;
                        }
                    }
                } else {
                    this.f6433 = 2;
                    motionEvent2 = this.f6428;
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                        this.f6428 = null;
                    }
                }
                return m6575(motionEvent);
            }
            if (actionMasked != 3) {
                return m6575(motionEvent);
            }
        }
        if (this.f6433 == 0) {
            this.f6433 = 2;
        }
        boolean zM6575 = m6575(motionEvent);
        MotionEvent motionEvent5 = this.f6428;
        if (motionEvent5 != null) {
            motionEvent5.recycle();
            this.f6428 = null;
        }
        this.f6433 = 0;
        return zM6575;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m6575(MotionEvent motionEvent) {
        int i = this.f6433;
        if (i == 1) {
            return m6576(this.f6430, motionEvent);
        }
        if (i == 2) {
            return m6576(this.f6434, motionEvent);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m6576(View view, MotionEvent motionEvent) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr = this.f6435;
        view.getLocationOnScreen(iArr);
        motionEventObtain.offsetLocation((motionEvent.getRawX() - iArr[0]) - motionEvent.getX(), (motionEvent.getRawY() - iArr[1]) - motionEvent.getY());
        boolean zDispatchTouchEvent = view.dispatchTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        return zDispatchTouchEvent;
    }
}
