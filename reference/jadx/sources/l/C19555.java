package l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.᩵ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: L5CA */
/* JADX INFO: loaded from: classes4.dex */
public class C19555 extends FrameLayout {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f62841 = new DecelerateInterpolator(10.0f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f62842;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C13205 f62843;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f62844;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f62845;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f62846;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f62847;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public FrameLayout f62848;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC19849 f62849;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public float f62850;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public float f62851;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C1209 f62852;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f62853;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public long f62854;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public View f62855;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DecelerateInterpolator f62856;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float f62857;

    public C19555(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f62856 = new DecelerateInterpolator();
        this.f62849 = new InterfaceC19849() { // from class: l.ܶܶ᩺
            @Override // l.InterfaceC19849
            /* JADX INFO: renamed from: ۙ */
            public final void mo28467(View view) {
                C19555.m44654(this.f49907);
            }
        };
        this.f62853 = true;
        this.f62851 = this.f62857 / 100.0f;
        this.f62854 = System.currentTimeMillis();
        m44653();
    }

    public C19555(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62856 = new DecelerateInterpolator();
        this.f62849 = new InterfaceC19849() { // from class: l.ܶܶ᩺
            @Override // l.InterfaceC19849
            /* JADX INFO: renamed from: ۙ */
            public final void mo28467(View view) {
                C19555.m44654(this.f49907);
            }
        };
        this.f62853 = true;
        this.f62851 = this.f62857 / 100.0f;
        this.f62854 = System.currentTimeMillis();
        m44653();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m44653() {
        if (isInEditMode()) {
            return;
        }
        if (getChildCount() > 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f62847 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f62857 = TypedValue.applyDimension(1, 150.0f, getContext().getResources().getDisplayMetrics());
        post(new Runnable() { // from class: l.᩸ܶ᩺
            @Override // java.lang.Runnable
            public final void run() {
                C19555.m44652(this.f70279);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44652(C19555 c19555) {
        c19555.f62855 = c19555.getChildAt(0);
        FrameLayout frameLayout = new FrameLayout(c19555.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        c19555.f62848 = frameLayout;
        super.addView(frameLayout);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m44654(C19555 c19555) {
        int translationY = (int) c19555.f62855.getTranslationY();
        c19555.f62848.getLayoutParams().height = translationY;
        c19555.f62848.requestLayout();
        C13205 c13205 = c19555.f62843;
        if (c13205 != null) {
            C6854 c6854 = c13205.f43934;
            c6854.f23065.m51077(translationY * 2);
            c6854.f23065.invalidate();
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m44650() {
        C20554 c20554M13980 = C5031.m13980(this.f62855);
        c20554M13980.m46330(0.0f);
        c20554M13980.m46325(this.f62856);
        c20554M13980.m46327(this.f62849);
        c20554M13980.m46328();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() >= 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f62855 = view;
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollVertically;
        if (this.f62842) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f62844 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f62845 = y;
            this.f62846 = y;
            this.f62853 = false;
        } else if (action == 2) {
            if (this.f62853) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY() - this.f62845;
            float fAbs = Math.abs(x - this.f62844);
            if (y2 > this.f62847 && y2 > fAbs) {
                View view = this.f62855;
                if (view == null) {
                    zCanScrollVertically = false;
                } else {
                    zCanScrollVertically = ((view instanceof C6606) && ((C6606) view).m17935()) ? true : this.f62855.canScrollVertically(-1);
                }
                if (!zCanScrollVertically) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44656(float f) {
        this.f62857 = f;
        this.f62851 = f / 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f62842 || this.f62853) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (this.f62855 != null) {
                m44650();
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f62846 = y;
            float f = y - this.f62850;
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f62854) * this.f62851;
            if (f > 0.0f) {
                if (f > fCurrentTimeMillis) {
                    this.f62846 = this.f62850 + fCurrentTimeMillis;
                }
            } else if ((-f) > fCurrentTimeMillis) {
                this.f62846 = this.f62850 - fCurrentTimeMillis;
            }
            this.f62850 = this.f62846;
            this.f62854 = System.currentTimeMillis();
            float f2 = this.f62857 * 2.0f;
            float f3 = this.f62846 - this.f62845;
            float fMin = Math.min(f2, f3);
            float fMax = Math.max(f2, f3);
            float f4 = 0.0f <= fMin ? fMin : 0.0f;
            if (f4 < fMax) {
                fMax = f4;
            }
            if (this.f62855 != null) {
                float interpolation = (f62841.getInterpolation((fMax / this.f62857) / 2.0f) * fMax) / 2.0f;
                this.f62855.setTranslationY(interpolation);
                this.f62848.getLayoutParams().height = (int) interpolation;
                this.f62848.requestLayout();
                C13205 c13205 = this.f62843;
                if (c13205 != null) {
                    C6854 c6854 = c13205.f43934;
                    c6854.f23065.f75000 = true;
                    c6854.f23065.m51077((int) (interpolation * 2.0f));
                    c6854.f23065.invalidate();
                }
            }
            if (fMax == this.f62857 * 2.0f) {
                if (this.f62855 != null) {
                    m44650();
                    this.f62842 = true;
                    C1209 c1209 = this.f62852;
                    if (c1209 != null) {
                        C6854.m18474(c1209.f5329);
                    }
                } else {
                    m44650();
                }
                this.f62853 = true;
                return true;
            }
        } else {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f62855 != null) {
                m44650();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44655() {
        if (this.f62853) {
            return;
        }
        if (this.f62855 != null) {
            m44650();
        }
        this.f62853 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44658(InterfaceC18849 interfaceC18849) {
        this.f62852 = (C1209) interfaceC18849;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m44657(InterfaceC8266 interfaceC8266) {
        this.f62843 = (C13205) interfaceC8266;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void m44659() {
        if (this.f62855 != null) {
            m44650();
        }
        this.f62842 = false;
    }
}
