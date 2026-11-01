package l;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.google.android.material.snackbar.SnackbarManager;

/* JADX INFO: renamed from: l.ᩳܽܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18178 extends AbstractC3236 implements InterfaceC4086 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f58078;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f58079;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f58080;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f58081;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f58082;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int f58084;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Drawable f58085;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f58088;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f58089;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f58090;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f58091;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f58092;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f58094;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f58096;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Drawable f58097;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C17492 f58099;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f58101;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f58102;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f58104;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f58105;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int[] f58077 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int[] f58076 = new int[0];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f58100 = 0;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f58087 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f58098 = false;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f58103 = false;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f58086 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f58093 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int[] f58095 = new int[2];

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f58083 = new int[2];

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ۙ */
    public final void mo2547(boolean z) {
    }

    public C18178(C17492 c17492, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f58089 = valueAnimatorOfFloat;
        this.f58082 = 0;
        RunnableC6889 runnableC6889 = new RunnableC6889(this);
        this.f58090 = runnableC6889;
        C23118 c23118 = new C23118(this);
        this.f58078 = stateListDrawable;
        this.f58097 = drawable;
        this.f58079 = stateListDrawable2;
        this.f58085 = drawable2;
        this.f58091 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f58084 = Math.max(i, drawable.getIntrinsicWidth());
        this.f58092 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f58105 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f58088 = i2;
        this.f58094 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C15357(this));
        valueAnimatorOfFloat.addUpdateListener(new C21706(this));
        C17492 c17493 = this.f58099;
        if (c17493 == c17492) {
            return;
        }
        if (c17493 != null) {
            c17493.removeItemDecoration(this);
            this.f58099.removeOnItemTouchListener(this);
            this.f58099.removeOnScrollListener(c23118);
            this.f58099.removeCallbacks(runnableC6889);
        }
        this.f58099 = c17492;
        c17492.addItemDecoration(this);
        this.f58099.addOnItemTouchListener(this);
        this.f58099.addOnScrollListener(c23118);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42299() {
        this.f58099.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42300(int i) {
        C17492 c17492;
        int i2;
        Runnable runnable = this.f58090;
        StateListDrawable stateListDrawable = this.f58078;
        if (i == 2 && this.f58086 != 2) {
            stateListDrawable.setState(f58077);
            this.f58099.removeCallbacks(runnable);
        }
        if (i == 0) {
            m42299();
        } else {
            m42303();
        }
        if (this.f58086 == 2 && i != 2) {
            stateListDrawable.setState(f58076);
            this.f58099.removeCallbacks(runnable);
            c17492 = this.f58099;
            i2 = 1200;
        } else {
            if (i == 1) {
                this.f58099.removeCallbacks(runnable);
                c17492 = this.f58099;
                i2 = SnackbarManager.SHORT_DURATION_MS;
            }
            this.f58086 = i;
        }
        c17492.postDelayed(runnable, i2);
        this.f58086 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42304(float f, float f2) {
        int i = C5031.f17539;
        int layoutDirection = this.f58099.getLayoutDirection();
        int i2 = this.f58091;
        if (layoutDirection == 1) {
            if (f > i2) {
                return false;
            }
        } else if (f < this.f58100 - i2) {
            return false;
        }
        int i3 = this.f58101;
        int i4 = this.f58096 / 2;
        return f2 >= ((float) (i3 - i4)) && f2 <= ((float) (i4 + i3));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42303() {
        int i = this.f58082;
        ValueAnimator valueAnimator = this.f58089;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f58082 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // l.AbstractC3236
    public final void onDrawOver(Canvas canvas, C17492 c17492, C16082 c16082) {
        int i = this.f58100;
        C17492 c17493 = this.f58099;
        if (i != c17493.getWidth() || this.f58087 != c17493.getHeight()) {
            this.f58100 = c17493.getWidth();
            this.f58087 = c17493.getHeight();
            m42300(0);
            return;
        }
        if (this.f58082 != 0) {
            if (this.f58098) {
                int i2 = this.f58100;
                int i3 = this.f58091;
                int i4 = i2 - i3;
                int i5 = this.f58101;
                int i6 = this.f58096;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f58078;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f58084;
                int i9 = this.f58087;
                Drawable drawable = this.f58097;
                drawable.setBounds(0, 0, i8, i9);
                int i10 = C5031.f17539;
                if (c17493.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f58103) {
                int i11 = this.f58087;
                int i12 = this.f58092;
                int i13 = i11 - i12;
                int i14 = this.f58104;
                int i15 = this.f58081;
                int i16 = i14 - (i15 / 2);
                StateListDrawable stateListDrawable2 = this.f58079;
                stateListDrawable2.setBounds(0, 0, i15, i12);
                int i17 = this.f58100;
                int i18 = this.f58105;
                Drawable drawable2 = this.f58085;
                drawable2.setBounds(0, 0, i17, i18);
                canvas.translate(0.0f, i13);
                drawable2.draw(canvas);
                canvas.translate(i16, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i16, -i13);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42301(int i, int i2) {
        int iComputeVerticalScrollRange = this.f58099.computeVerticalScrollRange();
        int i3 = this.f58087;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = this.f58088;
        this.f58098 = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = this.f58099.computeHorizontalScrollRange();
        int i6 = this.f58100;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        this.f58103 = z;
        boolean z2 = this.f58098;
        if (!z2 && !z) {
            if (this.f58086 != 0) {
                m42300(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f58101 = (int) ((((f / 2.0f) + i2) * f) / iComputeVerticalScrollRange);
            this.f58096 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f58103) {
            float f2 = i6;
            this.f58104 = (int) ((((f2 / 2.0f) + i) * f2) / iComputeHorizontalScrollRange);
            this.f58081 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = this.f58086;
        if (i7 == 0 || i7 == 1) {
            m42300(1);
        }
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo2548(MotionEvent motionEvent) {
        int i = this.f58086;
        if (i != 1) {
            return i == 2;
        }
        boolean zM42304 = m42304(motionEvent.getX(), motionEvent.getY());
        boolean zM42302 = m42302(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM42304 && !zM42302) {
            return false;
        }
        if (zM42302) {
            this.f58093 = 1;
            this.f58080 = (int) motionEvent.getX();
        } else if (zM42304) {
            this.f58093 = 2;
            this.f58102 = (int) motionEvent.getY();
        }
        m42300(2);
        return true;
    }

    @Override // l.InterfaceC4086
    /* JADX INFO: renamed from: ۙ */
    public final void mo2546(MotionEvent motionEvent) {
        if (this.f58086 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM42304 = m42304(motionEvent.getX(), motionEvent.getY());
            boolean zM42302 = m42302(motionEvent.getX(), motionEvent.getY());
            if (zM42304 || zM42302) {
                if (zM42302) {
                    this.f58093 = 1;
                    this.f58080 = (int) motionEvent.getX();
                } else if (zM42304) {
                    this.f58093 = 2;
                    this.f58102 = (int) motionEvent.getY();
                }
                m42300(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f58086 == 2) {
            this.f58102 = 0.0f;
            this.f58080 = 0.0f;
            m42300(1);
            this.f58093 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f58086 == 2) {
            m42303();
            int i = this.f58093;
            int i2 = this.f58094;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f58083;
                iArr[0] = i2;
                int i3 = this.f58100 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f58104 - fMax) >= 2.0f) {
                    int iM42298 = m42298(this.f58080, fMax, iArr, this.f58099.computeHorizontalScrollRange(), this.f58099.computeHorizontalScrollOffset(), this.f58100);
                    if (iM42298 != 0) {
                        this.f58099.scrollBy(iM42298, 0);
                    }
                    this.f58080 = fMax;
                }
            }
            if (this.f58093 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f58095;
                iArr2[0] = i2;
                int i4 = this.f58087 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f58101 - fMax2) < 2.0f) {
                    return;
                }
                int iM42299 = m42298(this.f58102, fMax2, iArr2, this.f58099.computeVerticalScrollRange(), this.f58099.computeVerticalScrollOffset(), this.f58087);
                if (iM42299 != 0) {
                    this.f58099.scrollBy(0, iM42299);
                }
                this.f58102 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m42298(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 != 0) {
            int i5 = i - i3;
            int i6 = (int) (((f2 - f) / i4) * i5);
            int i7 = i2 + i6;
            if (i7 < i5 && i7 >= 0) {
                return i6;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42302(float f, float f2) {
        if (f2 < this.f58087 - this.f58092) {
            return false;
        }
        int i = this.f58104;
        int i2 = this.f58081;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }
}
