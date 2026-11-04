package l;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.google.android.material.snackbar.SnackbarManager;

/* JADX INFO: renamed from: l.ۖܿ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 34UR */
/* JADX INFO: loaded from: classes3.dex */
public final class C2829 extends AbstractC12218 implements InterfaceC18931 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f9294;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f9295;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f9297;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f9298;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f9299;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final ValueAnimator f9300;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f9301;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final int f9302;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f9303;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Drawable f9304;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f9305;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f9306;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f9308;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f9310;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final StateListDrawable f9312;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Drawable f9313;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9316;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f9318;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C25227 f9319;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f9321;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int[] f9293 = {R.attr.state_pressed};

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int[] f9292 = new int[0];

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f9315 = 0;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f9296 = 0;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f9309 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f9311 = false;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f9320 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f9317 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int[] f9307 = new int[2];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f9314 = new int[2];

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9315(boolean z) {
    }

    public C2829(C25227 c25227, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9300 = valueAnimatorOfFloat;
        this.f9298 = 0;
        RunnableC19237 runnableC19237 = new RunnableC19237(this);
        this.f9303 = runnableC19237;
        C10286 c10286 = new C10286(this);
        this.f9312 = stateListDrawable;
        this.f9313 = drawable;
        this.f9306 = stateListDrawable2;
        this.f9304 = drawable2;
        this.f9301 = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f9302 = Math.max(i, drawable.getIntrinsicWidth());
        this.f9299 = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f9321 = Math.max(i, drawable2.getIntrinsicWidth());
        this.f9305 = i2;
        this.f9310 = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C1338(this));
        valueAnimatorOfFloat.addUpdateListener(new C9540(this));
        C25227 c25228 = this.f9319;
        if (c25228 == c25227) {
            return;
        }
        if (c25228 != null) {
            c25228.removeItemDecoration(this);
            this.f9319.removeOnItemTouchListener(this);
            this.f9319.removeOnScrollListener(c10286);
            this.f9319.removeCallbacks(runnableC19237);
        }
        this.f9319 = c25227;
        c25227.addItemDecoration(this);
        this.f9319.addOnItemTouchListener(this);
        this.f9319.addOnScrollListener(c10286);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9311() {
        this.f9319.invalidate();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9312(int i) {
        C25227 c25227;
        int i2;
        Runnable runnable = this.f9303;
        StateListDrawable stateListDrawable = this.f9312;
        if (i == 2 && this.f9320 != 2) {
            stateListDrawable.setState(f9293);
            this.f9319.removeCallbacks(runnable);
        }
        if (i == 0) {
            m9311();
        } else {
            m9317();
        }
        if (this.f9320 == 2 && i != 2) {
            stateListDrawable.setState(f9292);
            this.f9319.removeCallbacks(runnable);
            c25227 = this.f9319;
            i2 = 1200;
        } else {
            if (i == 1) {
                this.f9319.removeCallbacks(runnable);
                c25227 = this.f9319;
                i2 = SnackbarManager.SHORT_DURATION_MS;
            }
            this.f9320 = i;
        }
        c25227.postDelayed(runnable, i2);
        this.f9320 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m9318(float f, float f2) {
        int layoutDirection = this.f9319.getLayoutDirection();
        int i = this.f9301;
        if (layoutDirection == 1) {
            if (f > i) {
                return false;
            }
        } else if (f < this.f9315 - i) {
            return false;
        }
        int i2 = this.f9316;
        int i3 = this.f9294 / 2;
        return f2 >= ((float) (i2 - i3)) && f2 <= ((float) (i3 + i2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m9317() {
        int i = this.f9298;
        ValueAnimator valueAnimator = this.f9300;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f9298 = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // l.AbstractC12218
    public final void onDrawOver(Canvas canvas, C25227 c25227, C15529 c15529) {
        if (this.f9315 != this.f9319.getWidth() || this.f9296 != this.f9319.getHeight()) {
            this.f9315 = this.f9319.getWidth();
            this.f9296 = this.f9319.getHeight();
            m9312(0);
            return;
        }
        if (this.f9298 != 0) {
            if (this.f9309) {
                int i = this.f9315;
                int i2 = this.f9301;
                int i3 = i - i2;
                int i4 = this.f9316;
                int i5 = this.f9294;
                int i6 = i4 - (i5 / 2);
                StateListDrawable stateListDrawable = this.f9312;
                stateListDrawable.setBounds(0, 0, i2, i5);
                int i7 = this.f9302;
                int i8 = this.f9296;
                Drawable drawable = this.f9313;
                drawable.setBounds(0, 0, i7, i8);
                if (this.f9319.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i2, i6);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i2, -i6);
                } else {
                    canvas.translate(i3, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i6);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i3, -i6);
                }
            }
            if (this.f9311) {
                int i9 = this.f9296;
                int i10 = this.f9299;
                int i11 = i9 - i10;
                int i12 = this.f9308;
                int i13 = this.f9295;
                int i14 = i12 - (i13 / 2);
                StateListDrawable stateListDrawable2 = this.f9306;
                stateListDrawable2.setBounds(0, 0, i13, i10);
                int i15 = this.f9315;
                int i16 = this.f9321;
                Drawable drawable2 = this.f9304;
                drawable2.setBounds(0, 0, i15, i16);
                canvas.translate(0.0f, i11);
                drawable2.draw(canvas);
                canvas.translate(i14, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i14, -i11);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9313(int i, int i2) {
        int iComputeVerticalScrollRange = this.f9319.computeVerticalScrollRange();
        int i3 = this.f9296;
        int i4 = iComputeVerticalScrollRange - i3;
        int i5 = this.f9305;
        this.f9309 = i4 > 0 && i3 >= i5;
        int iComputeHorizontalScrollRange = this.f9319.computeHorizontalScrollRange();
        int i6 = this.f9315;
        boolean z = iComputeHorizontalScrollRange - i6 > 0 && i6 >= i5;
        this.f9311 = z;
        boolean z2 = this.f9309;
        if (!z2 && !z) {
            if (this.f9320 != 0) {
                m9312(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i3;
            this.f9316 = (int) ((((f / 2.0f) + i2) * f) / iComputeVerticalScrollRange);
            this.f9294 = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.f9311) {
            float f2 = i6;
            this.f9308 = (int) ((((f2 / 2.0f) + i) * f2) / iComputeHorizontalScrollRange);
            this.f9295 = Math.min(i6, (i6 * i6) / iComputeHorizontalScrollRange);
        }
        int i7 = this.f9320;
        if (i7 == 0 || i7 == 1) {
            m9312(1);
        }
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo9319(MotionEvent motionEvent) {
        int i = this.f9320;
        if (i != 1) {
            return i == 2;
        }
        boolean zM9318 = m9318(motionEvent.getX(), motionEvent.getY());
        boolean zM9316 = m9316(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zM9318 && !zM9316) {
            return false;
        }
        if (zM9316) {
            this.f9317 = 1;
            this.f9318 = (int) motionEvent.getX();
        } else if (zM9318) {
            this.f9317 = 2;
            this.f9297 = (int) motionEvent.getY();
        }
        m9312(2);
        return true;
    }

    @Override // l.InterfaceC18931
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo9314(MotionEvent motionEvent) {
        if (this.f9320 == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zM9318 = m9318(motionEvent.getX(), motionEvent.getY());
            boolean zM9316 = m9316(motionEvent.getX(), motionEvent.getY());
            if (zM9318 || zM9316) {
                if (zM9316) {
                    this.f9317 = 1;
                    this.f9318 = (int) motionEvent.getX();
                } else if (zM9318) {
                    this.f9317 = 2;
                    this.f9297 = (int) motionEvent.getY();
                }
                m9312(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f9320 == 2) {
            this.f9297 = 0.0f;
            this.f9318 = 0.0f;
            m9312(1);
            this.f9317 = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f9320 == 2) {
            m9317();
            int i = this.f9317;
            int i2 = this.f9310;
            if (i == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.f9314;
                iArr[0] = i2;
                int i3 = this.f9315 - i2;
                iArr[1] = i3;
                float fMax = Math.max(i2, Math.min(i3, x));
                if (Math.abs(this.f9308 - fMax) >= 2.0f) {
                    int iM9310 = m9310(this.f9318, fMax, iArr, this.f9319.computeHorizontalScrollRange(), this.f9319.computeHorizontalScrollOffset(), this.f9315);
                    if (iM9310 != 0) {
                        this.f9319.scrollBy(iM9310, 0);
                    }
                    this.f9318 = fMax;
                }
            }
            if (this.f9317 == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f9307;
                iArr2[0] = i2;
                int i4 = this.f9296 - i2;
                iArr2[1] = i4;
                float fMax2 = Math.max(i2, Math.min(i4, y));
                if (Math.abs(this.f9316 - fMax2) < 2.0f) {
                    return;
                }
                int iM9311 = m9310(this.f9297, fMax2, iArr2, this.f9319.computeVerticalScrollRange(), this.f9319.computeVerticalScrollOffset(), this.f9296);
                if (iM9311 != 0) {
                    this.f9319.scrollBy(0, iM9311);
                }
                this.f9297 = fMax2;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m9310(float f, float f2, int[] iArr, int i, int i2, int i3) {
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
    public final boolean m9316(float f, float f2) {
        if (f2 < this.f9296 - this.f9299) {
            return false;
        }
        int i = this.f9308;
        int i2 = this.f9295;
        return f >= ((float) (i - (i2 / 2))) && f <= ((float) ((i2 / 2) + i));
    }
}
