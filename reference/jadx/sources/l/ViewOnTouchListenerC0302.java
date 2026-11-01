package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.֡ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 96WS */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnTouchListenerC0302 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public float f1624;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC6025 f1625;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f1626;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public boolean f1627;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public boolean f1628;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public boolean f1629;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public float f1631;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f1632;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f1634;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f1635;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public boolean f1636;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final ViewGroup f1637;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public boolean f1638;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f1639;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public float f1640;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f1641;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final View f1642;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f1643;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f1644;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f1645;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public float f1646;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final int f1647;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f1648;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public C13954 f1633 = C13954.f45911;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC7358 f1630 = new Runnable() { // from class: l.۟ۡۘ
        @Override // java.lang.Runnable
        public final void run() {
            this.f24432.m1843(true);
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [l.۟ۡۘ] */
    public ViewOnTouchListenerC0302(View view, InterfaceC6025 interfaceC6025) {
        this.f1642 = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f1637 = viewGroup;
        this.f1625 = interfaceC6025;
        this.f1634 = Math.round(view.getResources().getDisplayMetrics().density * 8.0f);
        this.f1631 = m1834(interfaceC6025.getFloat("hfpx", 0.0f));
        this.f1646 = m1834(interfaceC6025.getFloat("hfpy", 0.0f));
        this.f1647 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        int i = Build.VERSION.SDK_INT;
        int recommendedTimeoutMillis = EnumC21522.f69929;
        if (i >= 29 && accessibilityManager != null) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(EnumC21522.f69929, 5);
        }
        this.f1639 = recommendedTimeoutMillis;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: l.᩷ۡۘ
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ViewOnTouchListenerC0302.m1836(this.f67568, motionEvent);
            }
        });
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ܺۡۘ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f51226.m1841();
            }
        });
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩶ۡۘ
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f64202.m1841();
            }
        });
        m1841();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1846(C13954 c13954) {
        this.f1633 = c13954;
        m1841();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1836(ViewOnTouchListenerC0302 viewOnTouchListenerC0302, MotionEvent motionEvent) {
        int i = viewOnTouchListenerC0302.f1647;
        View view = viewOnTouchListenerC0302.f1642;
        if (!viewOnTouchListenerC0302.f1628) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            viewOnTouchListenerC0302.f1643 = true;
            viewOnTouchListenerC0302.f1626 = false;
            viewOnTouchListenerC0302.f1645 = motionEvent.getRawX();
            viewOnTouchListenerC0302.f1624 = motionEvent.getRawY();
            viewOnTouchListenerC0302.f1648 = view.getX();
            viewOnTouchListenerC0302.f1640 = view.getY();
            viewOnTouchListenerC0302.m1833();
            return false;
        }
        if (!viewOnTouchListenerC0302.f1643) {
            return true;
        }
        if (actionMasked == 5) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            viewOnTouchListenerC0302.m1838();
            viewOnTouchListenerC0302.m1840();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = viewOnTouchListenerC0302.f1626;
                viewOnTouchListenerC0302.m1838();
                viewOnTouchListenerC0302.m1840();
                return z;
            }
            return viewOnTouchListenerC0302.f1626;
        }
        float rawX = motionEvent.getRawX() - viewOnTouchListenerC0302.f1645;
        float rawY = motionEvent.getRawY() - viewOnTouchListenerC0302.f1624;
        if (!viewOnTouchListenerC0302.f1626) {
            float f = i;
            if (Math.abs(rawX) > f || Math.abs(rawY) > f) {
                viewOnTouchListenerC0302.f1626 = true;
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.setAction(3);
                view.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                viewOnTouchListenerC0302.f1637.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (viewOnTouchListenerC0302.f1626) {
            float fM1844 = viewOnTouchListenerC0302.m1844();
            float fM1830 = viewOnTouchListenerC0302.m1830();
            float fMax = Math.max(0.0f, viewOnTouchListenerC0302.m1831() - fM1844);
            float fMax2 = Math.max(0.0f, viewOnTouchListenerC0302.m1837() - fM1830);
            if (fMax > 0.0f) {
                viewOnTouchListenerC0302.f1631 = m1834(((viewOnTouchListenerC0302.f1648 + rawX) - fM1844) / fMax);
            }
            if (fMax2 > 0.0f) {
                viewOnTouchListenerC0302.f1646 = m1834(((viewOnTouchListenerC0302.f1640 + rawY) - fM1830) / fMax2);
            }
            viewOnTouchListenerC0302.f1627 = true;
            viewOnTouchListenerC0302.m1841();
        }
        return viewOnTouchListenerC0302.f1626;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m1838() {
        this.f1643 = false;
        this.f1626 = false;
        this.f1637.requestDisallowInterceptTouchEvent(false);
        if (this.f1627) {
            this.f1625.edit().putFloat("hfpx", this.f1631).putFloat("hfpy", this.f1646).apply();
            this.f1627 = false;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private float m1844() {
        return Math.max(this.f1637.getPaddingLeft(), this.f1633.f45915) + this.f1634;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private float m1830() {
        return Math.max(this.f1637.getPaddingTop(), this.f1633.f45912) + this.f1634;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private float m1831() {
        ViewGroup viewGroup = this.f1637;
        return ((viewGroup.getWidth() - Math.max(viewGroup.getPaddingRight(), this.f1633.f45914)) - this.f1642.getLayoutParams().width) - this.f1634;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private float m1837() {
        ViewGroup viewGroup = this.f1637;
        return ((viewGroup.getHeight() - Math.max(viewGroup.getPaddingBottom(), this.f1633.f45913)) - this.f1642.getLayoutParams().height) - this.f1634;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m1841() {
        ViewGroup viewGroup = this.f1637;
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            return;
        }
        float fMax = (Math.max(0.0f, m1831() - m1844()) * this.f1631) + m1844();
        View view = this.f1642;
        view.setX(fMax);
        view.setY((Math.max(0.0f, m1837() - m1830()) * this.f1646) + m1830());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m1834(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1847(boolean z) {
        m1838();
        this.f1628 = z;
        this.f1641 = false;
        this.f1638 = false;
        if (z) {
            m1833();
        } else {
            m1843(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f1628) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f1641 = true;
                this.f1636 = false;
                this.f1638 = false;
                this.f1632 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f1644 = y;
                this.f1635 = y;
                return false;
            }
            if (actionMasked == 1) {
                if (this.f1641 && !this.f1636 && motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                    m1833();
                } else if (this.f1629) {
                    m1840();
                }
                this.f1641 = false;
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3 || actionMasked == 5) {
                    this.f1641 = false;
                    this.f1638 = false;
                    return false;
                }
            } else if (this.f1641) {
                float x = motionEvent.getX() - this.f1632;
                float y2 = motionEvent.getY() - this.f1635;
                float fAbs = Math.abs(x);
                float f = this.f1647;
                if (fAbs > f || Math.abs(y2) > f) {
                    this.f1636 = true;
                }
                if (this.f1636 && (this.f1638 || Math.abs(y2) > Math.abs(x))) {
                    this.f1638 = true;
                    float y3 = motionEvent.getY() - this.f1644;
                    if (Math.abs(y3) > f) {
                        this.f1644 = motionEvent.getY();
                        if (y3 > 0.0f) {
                            m1833();
                            return false;
                        }
                        m1843(true);
                        return false;
                    }
                    if (this.f1629) {
                        m1840();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1845() {
        if (this.f1628 && this.f1638 && this.f1629) {
            m1840();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private void m1833() {
        if (this.f1628) {
            if (!this.f1629) {
                View view = this.f1642;
                view.animate().withEndAction(null).cancel();
                view.setVisibility(0);
                m1841();
                view.animate().alpha(1.0f).setDuration(180L).start();
                this.f1629 = true;
            }
            m1840();
        }
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m1840() {
        View view = this.f1642;
        RunnableC7358 runnableC7358 = this.f1630;
        view.removeCallbacks(runnableC7358);
        if (this.f1628 && this.f1629 && !this.f1643) {
            view.postDelayed(runnableC7358, this.f1639);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m1843(boolean z) {
        RunnableC7358 runnableC7358 = this.f1630;
        View view = this.f1642;
        view.removeCallbacks(runnableC7358);
        if (!z || this.f1629) {
            this.f1629 = false;
            view.animate().withEndAction(null).cancel();
            if (z) {
                view.animate().alpha(0.0f).setDuration(180L).withEndAction(new RunnableC4035(1, this)).start();
            } else {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m1835(ViewOnTouchListenerC0302 viewOnTouchListenerC0302) {
        if (viewOnTouchListenerC0302.f1629) {
            return;
        }
        viewOnTouchListenerC0302.f1642.setVisibility(8);
    }
}
