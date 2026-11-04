package l;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: l.ۧ۟᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: L5CA */
/* JADX INFO: loaded from: classes3.dex */
public class C11476 extends FrameLayout {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final DecelerateInterpolator f36085 = new DecelerateInterpolator(10.0f);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f36086;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public FrameLayout f36087;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C13495 f36088;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public float f36089;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f36090;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f36091;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public C4765 f36092;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f36093;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float f36094;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC14460 f36095;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f36096;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f36097;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f36098;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public View f36099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public DecelerateInterpolator f36100;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public float f36101;

    public C11476(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36100 = new DecelerateInterpolator();
        this.f36095 = new InterfaceC14460() { // from class: l.ᩴ۟᩻
            @Override // l.InterfaceC14460
            /* JADX INFO: renamed from: ۙ */
            public final void mo34929(View view) {
                C11476.m28843(this.f63377);
            }
        };
        this.f36097 = true;
        this.f36101 = this.f36093 / 100.0f;
        this.f36086 = System.currentTimeMillis();
        m28842();
    }

    public C11476(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36100 = new DecelerateInterpolator();
        this.f36095 = new InterfaceC14460() { // from class: l.ᩴ۟᩻
            @Override // l.InterfaceC14460
            /* JADX INFO: renamed from: ۙ */
            public final void mo34929(View view) {
                C11476.m28843(this.f63377);
            }
        };
        this.f36097 = true;
        this.f36101 = this.f36093 / 100.0f;
        this.f36086 = System.currentTimeMillis();
        m28842();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m28842() {
        if (isInEditMode()) {
            return;
        }
        if (getChildCount() > 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f36090 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f36093 = TypedValue.applyDimension(1, 150.0f, getContext().getResources().getDisplayMetrics());
        post(new Runnable() { // from class: l.ܳ۟᩻
            @Override // java.lang.Runnable
            public final void run() {
                C11476.m28841(this.f49635);
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28841(C11476 c11476) {
        c11476.f36099 = c11476.getChildAt(0);
        FrameLayout frameLayout = new FrameLayout(c11476.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 48;
        frameLayout.setLayoutParams(layoutParams);
        c11476.f36087 = frameLayout;
        super.addView(frameLayout);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m28843(C11476 c11476) {
        int translationY = (int) c11476.f36099.getTranslationY();
        c11476.f36087.getLayoutParams().height = translationY;
        c11476.f36087.requestLayout();
        C4765 c4765 = c11476.f36092;
        if (c4765 != null) {
            C10730 c10730 = c4765.f16720;
            c10730.f34078.m51075(translationY * 2);
            c10730.f34078.invalidate();
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m28844() {
        C24158 c24158M51085 = C22666.m51085(this.f36099);
        c24158M51085.m54127(0.0f);
        c24158M51085.m54122(this.f36100);
        c24158M51085.m54124(this.f36095);
        c24158M51085.m54125();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() >= 1) {
            throw new RuntimeException("You can only attach one child");
        }
        this.f36099 = view;
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zCanScrollVertically;
        if (this.f36098) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f36096 = motionEvent.getX();
            float y = motionEvent.getY();
            this.f36089 = y;
            this.f36094 = y;
            this.f36097 = false;
        } else if (action == 2) {
            if (this.f36097) {
                return true;
            }
            float x = motionEvent.getX();
            float y2 = motionEvent.getY() - this.f36089;
            float fAbs = Math.abs(x - this.f36096);
            if (y2 > this.f36090 && y2 > fAbs) {
                View view = this.f36099;
                if (view == null) {
                    zCanScrollVertically = false;
                } else {
                    zCanScrollVertically = ((view instanceof C19987) && ((C19987) view).m45950()) ? true : this.f36099.canScrollVertically(-1);
                }
                if (!zCanScrollVertically) {
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28846(float f) {
        this.f36093 = f;
        this.f36101 = f / 100.0f;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d9  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f36098 || this.f36097) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            if (this.f36099 != null) {
                m28844();
            }
        } else if (action == 2) {
            float y = motionEvent.getY();
            this.f36094 = y;
            float f = y - this.f36091;
            float fCurrentTimeMillis = (System.currentTimeMillis() - this.f36086) * this.f36101;
            if (f > 0.0f) {
                if (f > fCurrentTimeMillis) {
                    this.f36094 = this.f36091 + fCurrentTimeMillis;
                }
            } else if ((-f) > fCurrentTimeMillis) {
                this.f36094 = this.f36091 - fCurrentTimeMillis;
            }
            this.f36091 = this.f36094;
            this.f36086 = System.currentTimeMillis();
            float f2 = this.f36093 * 2.0f;
            float f3 = this.f36094 - this.f36089;
            float fMin = Math.min(f2, f3);
            float fMax = Math.max(f2, f3);
            float f4 = 0.0f <= fMin ? fMin : 0.0f;
            if (f4 < fMax) {
                fMax = f4;
            }
            if (this.f36099 != null) {
                float interpolation = (f36085.getInterpolation((fMax / this.f36093) / 2.0f) * fMax) / 2.0f;
                this.f36099.setTranslationY(interpolation);
                this.f36087.getLayoutParams().height = (int) interpolation;
                this.f36087.requestLayout();
                C4765 c4765 = this.f36092;
                if (c4765 != null) {
                    C10730 c10730 = c4765.f16720;
                    c10730.f34078.f73601 = true;
                    c10730.f34078.m51075((int) (interpolation * 2.0f));
                    c10730.f34078.invalidate();
                }
            }
            if (fMax == this.f36093 * 2.0f) {
                if (this.f36099 != null) {
                    m28844();
                    this.f36098 = true;
                    C13495 c13495 = this.f36088;
                    if (c13495 != null) {
                        C10730.m27321(c13495.f42914);
                    }
                } else {
                    m28844();
                }
                this.f36097 = true;
                return true;
            }
        } else {
            if (action != 3) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.f36099 != null) {
                m28844();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28845() {
        if (this.f36097) {
            return;
        }
        if (this.f36099 != null) {
            m28844();
        }
        this.f36097 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28848(InterfaceC5511 interfaceC5511) {
        this.f36088 = (C13495) interfaceC5511;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m28847(InterfaceC1782 interfaceC1782) {
        this.f36092 = (C4765) interfaceC1782;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public void m28849() {
        if (this.f36099 != null) {
            m28844();
        }
        this.f36098 = false;
    }
}
