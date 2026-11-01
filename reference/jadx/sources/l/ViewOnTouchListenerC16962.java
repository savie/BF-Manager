package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.ܽ᩺᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J5LW */
/* JADX INFO: loaded from: classes4.dex */
public final class ViewOnTouchListenerC16962 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f54281 = C13932.m33769(33.0f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public View f54282;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f54283;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f54284;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f54285;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f54286 = true;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C5900 f54287;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f54288;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ListView f54289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f54290;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f54291;

    public ViewOnTouchListenerC16962(C5900 c5900, C6606 c6606) {
        if (c6606 != null) {
            this.f54289 = c6606;
            if (this.f54283 == 0) {
                this.f54283 = ViewConfiguration.get(c6606.getContext()).getScaledTouchSlop();
            }
        }
        this.f54287 = c5900;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        if (!this.f54289.isEnabled()) {
            m39755();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        C5900 c5900 = this.f54287;
        if (actionMasked != 0) {
            int i = f54281;
            if (actionMasked == 1) {
                if (this.f54284 && (view2 = this.f54282) != null) {
                    view2.scrollTo(0, 0);
                    if (Math.abs((int) ((motionEvent.getX() - this.f54288) * 0.75f)) >= i) {
                        c5900.m16159(this.f54290, this.f54282);
                    }
                }
                m39755();
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f54284 && (view3 = this.f54282) != null) {
                        view3.scrollTo(0, 0);
                    }
                    m39755();
                    return false;
                }
            } else if (this.f54282 != null) {
                int x = (int) ((motionEvent.getX() - this.f54288) * 0.75f);
                int y = (int) (motionEvent.getY() - this.f54285);
                if (!this.f54291 && Math.abs(x) > this.f54283) {
                    if (Math.abs(y) < this.f54283) {
                        this.f54284 = true;
                        this.f54289.requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f54289.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    } else {
                        this.f54291 = true;
                    }
                }
                if (this.f54284) {
                    int i2 = -i;
                    if (x <= i2) {
                        if (this.f54286) {
                            c5900.m16165();
                            this.f54286 = false;
                        }
                        x = i2;
                    } else if (x >= i) {
                        if (this.f54286) {
                            c5900.m16165();
                            this.f54286 = false;
                        }
                        x = i;
                    } else {
                        this.f54286 = true;
                    }
                    float fAbs = Math.abs(x) / i;
                    if (fAbs < 0.0f) {
                        fAbs = 0.0f;
                    } else if (fAbs > 1.0f) {
                        fAbs = 1.0f;
                    }
                    this.f54282.scrollTo(-((int) (((float) Math.sin(fAbs * 1.5707964f)) * x)), 0);
                    return true;
                }
            }
        } else {
            m39755();
            Rect rect = new Rect();
            int childCount = this.f54289.getChildCount();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f54289.getChildAt(i3);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains(x2, y2)) {
                    this.f54282 = childAt;
                    break;
                }
            }
            View view4 = this.f54282;
            if (view4 != null) {
                try {
                    int positionForView = this.f54289.getPositionForView(view4);
                    this.f54290 = positionForView;
                    if (c5900.m16163(positionForView)) {
                        this.f54288 = motionEvent.getX();
                        this.f54285 = motionEvent.getY();
                        return false;
                    }
                    this.f54282 = null;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m39755() {
        this.f54288 = 0.0f;
        this.f54285 = 0.0f;
        this.f54290 = -1;
        this.f54282 = null;
        this.f54284 = false;
        this.f54291 = false;
        this.f54286 = true;
    }
}
