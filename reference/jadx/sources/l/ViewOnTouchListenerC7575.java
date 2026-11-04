package l;

import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: l.۟ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 96WS */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnTouchListenerC7575 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f24965;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f24966;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24967;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f24968;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public boolean f24970;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f24971;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final ViewGroup f24972;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f24973;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f24974;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f24975;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public boolean f24976;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9801 f24978;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f24979;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final View f24980;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public float f24981;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public boolean f24982;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public float f24983;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public float f24984;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public float f24985;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public float f24986;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f24987;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public boolean f24988;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final int f24989;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public C13275 f24977 = C13275.f42404;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC1741 f24969 = new RunnableC1741(1, this);

    public ViewOnTouchListenerC7575(View view, InterfaceC9801 interfaceC9801) {
        this.f24980 = view;
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        this.f24972 = viewGroup;
        this.f24978 = interfaceC9801;
        this.f24971 = Math.round(view.getResources().getDisplayMetrics().density * 8.0f);
        this.f24985 = m20700(interfaceC9801.getFloat("hfpx", 0.0f));
        this.f24981 = m20700(interfaceC9801.getFloat("hfpy", 0.0f));
        this.f24989 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        int i = Build.VERSION.SDK_INT;
        int recommendedTimeoutMillis = EnumC7717.f25434;
        if (i >= 29 && accessibilityManager != null) {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(EnumC7717.f25434, 5);
        }
        this.f24987 = recommendedTimeoutMillis;
        view.setOnTouchListener(new ViewOnTouchListenerC0117(this));
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setMotionEventSplittingEnabled(false);
        }
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.᩶ۖ֫
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f67158.m20709();
            }
        });
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: l.ܿۖ֫
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                this.f58977.m20709();
            }
        });
        m20709();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20715(C13275 c13275) {
        this.f24977 = c13275;
        m20709();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20702(ViewOnTouchListenerC7575 viewOnTouchListenerC7575, View view, MotionEvent motionEvent) {
        int i = viewOnTouchListenerC7575.f24989;
        View view2 = viewOnTouchListenerC7575.f24980;
        if (!viewOnTouchListenerC7575.f24979) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            viewOnTouchListenerC7575.f24965 = true;
            viewOnTouchListenerC7575.f24973 = false;
            viewOnTouchListenerC7575.f24986 = motionEvent.getRawX();
            viewOnTouchListenerC7575.f24983 = motionEvent.getRawY();
            viewOnTouchListenerC7575.f24974 = view2.getX();
            viewOnTouchListenerC7575.f24968 = view2.getY();
            viewOnTouchListenerC7575.m20699();
            return false;
        }
        if (!viewOnTouchListenerC7575.f24965) {
            return true;
        }
        if (actionMasked == 5) {
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.setAction(3);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            viewOnTouchListenerC7575.m20704();
            viewOnTouchListenerC7575.m20703();
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked == 1 || actionMasked == 3) {
                boolean z = viewOnTouchListenerC7575.f24973;
                viewOnTouchListenerC7575.m20704();
                viewOnTouchListenerC7575.m20703();
                return z;
            }
            return viewOnTouchListenerC7575.f24973;
        }
        float rawX = motionEvent.getRawX() - viewOnTouchListenerC7575.f24986;
        float rawY = motionEvent.getRawY() - viewOnTouchListenerC7575.f24983;
        if (!viewOnTouchListenerC7575.f24973) {
            float f = i;
            if (Math.abs(rawX) > f || Math.abs(rawY) > f) {
                viewOnTouchListenerC7575.f24973 = true;
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent);
                motionEventObtain2.setAction(3);
                view.onTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                viewOnTouchListenerC7575.f24972.requestDisallowInterceptTouchEvent(true);
            }
        }
        if (viewOnTouchListenerC7575.f24973) {
            float fM20707 = viewOnTouchListenerC7575.m20707();
            float fM20706 = viewOnTouchListenerC7575.m20706();
            float fMax = Math.max(0.0f, viewOnTouchListenerC7575.m20712() - fM20707);
            float fMax2 = Math.max(0.0f, viewOnTouchListenerC7575.m20708() - fM20706);
            if (fMax > 0.0f) {
                viewOnTouchListenerC7575.f24985 = m20700(((viewOnTouchListenerC7575.f24974 + rawX) - fM20707) / fMax);
            }
            if (fMax2 > 0.0f) {
                viewOnTouchListenerC7575.f24981 = m20700(((viewOnTouchListenerC7575.f24968 + rawY) - fM20706) / fMax2);
            }
            viewOnTouchListenerC7575.f24988 = true;
            viewOnTouchListenerC7575.m20709();
        }
        return viewOnTouchListenerC7575.f24973;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m20704() {
        this.f24965 = false;
        this.f24973 = false;
        this.f24972.requestDisallowInterceptTouchEvent(false);
        if (this.f24988) {
            this.f24978.edit().putFloat("hfpx", this.f24985).putFloat("hfpy", this.f24981).apply();
            this.f24988 = false;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private float m20707() {
        return Math.max(this.f24972.getPaddingLeft(), this.f24977.f42407) + this.f24971;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private float m20706() {
        return Math.max(this.f24972.getPaddingTop(), this.f24977.f42408) + this.f24971;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private float m20712() {
        ViewGroup viewGroup = this.f24972;
        return ((viewGroup.getWidth() - Math.max(viewGroup.getPaddingRight(), this.f24977.f42406)) - this.f24980.getLayoutParams().width) - this.f24971;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private float m20708() {
        ViewGroup viewGroup = this.f24972;
        return ((viewGroup.getHeight() - Math.max(viewGroup.getPaddingBottom(), this.f24977.f42405)) - this.f24980.getLayoutParams().height) - this.f24971;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m20709() {
        ViewGroup viewGroup = this.f24972;
        if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
            return;
        }
        float fMax = (Math.max(0.0f, m20712() - m20707()) * this.f24985) + m20707();
        View view = this.f24980;
        view.setX(fMax);
        view.setY((Math.max(0.0f, m20708() - m20706()) * this.f24981) + m20706());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m20700(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return 0.0f;
        }
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20716(boolean z) {
        m20704();
        this.f24979 = z;
        this.f24982 = false;
        this.f24970 = false;
        if (z) {
            m20699();
        } else {
            m20711(false);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f24979) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.f24982 = true;
                this.f24976 = false;
                this.f24970 = false;
                this.f24975 = motionEvent.getX();
                float y = motionEvent.getY();
                this.f24984 = y;
                this.f24966 = y;
                return false;
            }
            if (actionMasked == 1) {
                if (this.f24982 && !this.f24976 && motionEvent.getEventTime() - motionEvent.getDownTime() < ViewConfiguration.getLongPressTimeout()) {
                    m20699();
                } else if (this.f24967) {
                    m20703();
                }
                this.f24982 = false;
                return false;
            }
            if (actionMasked != 2) {
                if (actionMasked == 3 || actionMasked == 5) {
                    this.f24982 = false;
                    this.f24970 = false;
                    return false;
                }
            } else if (this.f24982) {
                float x = motionEvent.getX() - this.f24975;
                float y2 = motionEvent.getY() - this.f24966;
                float fAbs = Math.abs(x);
                float f = this.f24989;
                if (fAbs > f || Math.abs(y2) > f) {
                    this.f24976 = true;
                }
                if (this.f24976 && (this.f24970 || Math.abs(y2) > Math.abs(x))) {
                    this.f24970 = true;
                    float y3 = motionEvent.getY() - this.f24984;
                    if (Math.abs(y3) > f) {
                        this.f24984 = motionEvent.getY();
                        if (y3 > 0.0f) {
                            m20699();
                            return false;
                        }
                        m20711(true);
                        return false;
                    }
                    if (this.f24967) {
                        m20703();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20714() {
        if (this.f24979 && this.f24970 && this.f24967) {
            m20703();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private void m20699() {
        if (this.f24979) {
            if (!this.f24967) {
                View view = this.f24980;
                view.animate().withEndAction(null).cancel();
                view.setVisibility(0);
                m20709();
                view.animate().alpha(1.0f).setDuration(180L).start();
                this.f24967 = true;
            }
            m20703();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m20703() {
        View view = this.f24980;
        RunnableC1741 runnableC1741 = this.f24969;
        view.removeCallbacks(runnableC1741);
        if (this.f24979 && this.f24967 && !this.f24965) {
            view.postDelayed(runnableC1741, this.f24987);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m20711(boolean z) {
        RunnableC1741 runnableC1741 = this.f24969;
        View view = this.f24980;
        view.removeCallbacks(runnableC1741);
        if (!z || this.f24967) {
            this.f24967 = false;
            view.animate().withEndAction(null).cancel();
            if (z) {
                view.animate().alpha(0.0f).setDuration(180L).withEndAction(new RunnableC16656(1, this)).start();
            } else {
                view.setAlpha(0.0f);
                view.setVisibility(8);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m20701(ViewOnTouchListenerC7575 viewOnTouchListenerC7575) {
        if (viewOnTouchListenerC7575.f24967) {
            return;
        }
        viewOnTouchListenerC7575.f24980.setVisibility(8);
    }
}
