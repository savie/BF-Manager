package l;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ListView;

/* JADX INFO: renamed from: l.᩵֡᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: J5LW */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnTouchListenerC20208 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f64871 = C6907.m19160(33.0f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f64872;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f64873;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f64874 = true;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f64875;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f64876;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f64877;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3966 f64878;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f64879;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public ListView f64880;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f64881;

    public ViewOnTouchListenerC20208(C3966 c3966, C19987 c19987) {
        if (c19987 != null) {
            this.f64880 = c19987;
            if (this.f64877 == 0) {
                this.f64877 = ViewConfiguration.get(c19987.getContext()).getScaledTouchSlop();
            }
        }
        this.f64878 = c3966;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        if (!this.f64880.isEnabled()) {
            m46480();
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        C3966 c3966 = this.f64878;
        if (actionMasked != 0) {
            int i = f64871;
            if (actionMasked == 1) {
                if (this.f64873 && (view2 = this.f64879) != null) {
                    view2.scrollTo(0, 0);
                    if (Math.abs((int) ((motionEvent.getX() - this.f64872) * 0.75f)) >= i) {
                        c3966.m12734(this.f64881, this.f64879);
                    }
                }
                m46480();
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3) {
                    if (this.f64873 && (view3 = this.f64879) != null) {
                        view3.scrollTo(0, 0);
                    }
                    m46480();
                    return false;
                }
            } else if (this.f64879 != null) {
                int x = (int) ((motionEvent.getX() - this.f64872) * 0.75f);
                int y = (int) (motionEvent.getY() - this.f64875);
                if (!this.f64876 && Math.abs(x) > this.f64877) {
                    if (Math.abs(y) < this.f64877) {
                        this.f64873 = true;
                        this.f64880.requestDisallowInterceptTouchEvent(true);
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction((motionEvent.getActionIndex() << 8) | 3);
                        this.f64880.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    } else {
                        this.f64876 = true;
                    }
                }
                if (this.f64873) {
                    int i2 = -i;
                    if (x <= i2) {
                        if (this.f64874) {
                            c3966.m12739();
                            this.f64874 = false;
                        }
                        x = i2;
                    } else if (x >= i) {
                        if (this.f64874) {
                            c3966.m12739();
                            this.f64874 = false;
                        }
                        x = i;
                    } else {
                        this.f64874 = true;
                    }
                    float fAbs = Math.abs(x) / i;
                    if (fAbs < 0.0f) {
                        fAbs = 0.0f;
                    } else if (fAbs > 1.0f) {
                        fAbs = 1.0f;
                    }
                    this.f64879.scrollTo(-((int) (((float) Math.sin(fAbs * 1.5707964f)) * x)), 0);
                    return true;
                }
            }
        } else {
            m46480();
            Rect rect = new Rect();
            int childCount = this.f64880.getChildCount();
            int x2 = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.f64880.getChildAt(i3);
                rect.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                if (rect.contains(x2, y2)) {
                    this.f64879 = childAt;
                    break;
                }
            }
            View view4 = this.f64879;
            if (view4 != null) {
                try {
                    int positionForView = this.f64880.getPositionForView(view4);
                    this.f64881 = positionForView;
                    if (c3966.m12738(positionForView)) {
                        this.f64872 = motionEvent.getX();
                        this.f64875 = motionEvent.getY();
                        return false;
                    }
                    this.f64879 = null;
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46480() {
        this.f64872 = 0.0f;
        this.f64875 = 0.0f;
        this.f64881 = -1;
        this.f64879 = null;
        this.f64873 = false;
        this.f64876 = false;
        this.f64874 = true;
    }
}
