package l;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.۟۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C7922 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final float[] f26310;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f26311;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f26312;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float[] f26314;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f26315;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final RunnableC4839 f26316;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f26317;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final GestureDetector f26318;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public boolean f26319;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public float f26323;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f26324;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f26325;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f26328;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f26329;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f26330;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final TextureView f26331;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f26332;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f26333;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f26335;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f26336;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f26338;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final float f26339;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float[] f26322 = new float[16];

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final float[] f26320 = new float[16];

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float[] f26326 = new float[16];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C2701 f26337 = new C2701();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26334 = -1;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final RunnableC4193 f26327 = new Runnable() { // from class: l.ۘ۬᩻
        @Override // java.lang.Runnable
        public final void run() {
            this.f15337.m21496();
        }
    };

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Runnable f26321 = new RunnableC14633(this);

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final Runnable f26313 = new RunnableC21347(this);

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ۘ۬᩻] */
    public C7922(TextureView textureView, RunnableC4839 runnableC4839) {
        float[] fArr = new float[16];
        this.f26310 = fArr;
        this.f26331 = textureView;
        this.f26316 = runnableC4839;
        this.f26339 = textureView.getResources().getDisplayMetrics().density;
        this.f26311 = ViewConfiguration.get(textureView.getContext()).getScaledTouchSlop();
        Matrix.setIdentityM(fArr, 0);
        GestureDetector gestureDetector = new GestureDetector(textureView.getContext(), new C18363(this));
        this.f26318 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21503(boolean z) {
        if (this.f26329 == z) {
            return;
        }
        this.f26329 = z;
        if (!z) {
            boolean z2 = this.f26332;
            m21491();
            this.f26336 = z2;
            m21486();
            m21494();
            this.f26334 = -1;
            this.f26328 = false;
            this.f26319 = false;
            TextureView textureView = this.f26331;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            this.f26318.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        float[] fArr = this.f26314;
        if (fArr != null) {
            m21476(fArr, this.f26325, this.f26338);
        } else if (this.f26336) {
            m21496();
        } else {
            m21480();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m21502(MotionEvent motionEvent) {
        if (!this.f26329) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        TextureView textureView = this.f26331;
        if (actionMasked == 0) {
            this.f26319 = true;
            this.f26315 = false;
            m21491();
            m21486();
            m21494();
            this.f26334 = -1;
            this.f26328 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f26318.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            if (actionMasked == 3) {
                m21486();
                m21494();
            }
            if (actionMasked == 1 && !this.f26328) {
                textureView.performClick();
            }
            this.f26334 = -1;
            this.f26328 = false;
            this.f26319 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            m21480();
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            this.f26334 = -1;
            this.f26328 = false;
            m21486();
            m21494();
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int pointerId = motionEvent.getPointerId(0);
        if (actionMasked == 2 && this.f26334 == pointerId) {
            float f = x - this.f26323;
            float f2 = y - this.f26317;
            if (!this.f26328 && Math.hypot(f, f2) <= this.f26311) {
                return true;
            }
            this.f26328 = true;
            m21494();
            float f3 = this.f26339;
            float f4 = (f2 / f3) * 0.75f;
            float f5 = (f / f3) * 0.75f;
            m21471(f4, f5);
            this.f26337.m8868(f4, f5);
            if (!this.f26312) {
                this.f26312 = true;
                this.f26333 = 0L;
                textureView.postOnAnimation(this.f26313);
            }
        }
        this.f26334 = pointerId;
        this.f26323 = x;
        this.f26317 = y;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21500(long j, boolean z) {
        float[] fArr = new float[16];
        if (z) {
            Matrix.setRotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
        m21476(fArr, j, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21501(boolean z) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        m21476(fArr, 600L, z ? -45.0f : 45.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21476(final float[] fArr, long j, final float f) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative rotation duration");
        }
        this.f26315 = false;
        m21491();
        m21486();
        m21494();
        this.f26331.removeCallbacks(this.f26327);
        if (!this.f26329) {
            this.f26314 = fArr;
            this.f26325 = j;
            this.f26338 = f;
            return;
        }
        this.f26314 = null;
        this.f26338 = 0.0f;
        float[] fArr2 = new float[16];
        final float[] fArr3 = new float[16];
        Matrix.transposeM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, this.f26310, 0);
        final C9412 c9412 = new C9412(fArr3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f26330 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f26330.setInterpolator(new LinearInterpolator());
        this.f26330.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.᩺۬᩻
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C7922.m21475(this.f78907, fArr, fArr3, c9412, f, valueAnimator);
            }
        });
        this.f26330.addListener(new C0464(this));
        this.f26330.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21475(C7922 c7922, float[] fArr, float[] fArr2, C9412 c9412, float f, ValueAnimator valueAnimator) {
        float[] fArr3 = c7922.f26320;
        float[] fArr4 = c7922.f26322;
        float[] fArr5 = c7922.f26310;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 1.0f) {
            float fMax = Math.max(0.0f, Math.min(1.0f, fFloatValue));
            Matrix.setRotateM(fArr2, 0, (1.0f - ((3.0f - (fMax * 2.0f)) * (fMax * fMax))) * c9412.f30546, c9412.f30548, c9412.f30547, c9412.f30549);
            Matrix.multiplyMM(fArr5, 0, fArr, 0, fArr2, 0);
            if (f != 0.0f) {
                Matrix.setRotateM(fArr4, 0, f * ((float) ((1.0d - Math.cos(((double) fFloatValue) * 6.283185307179586d)) / 2.0d)), -0.819152f, 0.573576f, 0.0f);
                Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
                System.arraycopy(fArr3, 0, fArr5, 0, 16);
            }
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 16);
        }
        c7922.f26316.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m21471(float f, float f2) {
        float fHypot = (float) Math.hypot(f, f2);
        if (fHypot == 0.0f) {
            return;
        }
        float[] fArr = this.f26322;
        Matrix.setRotateM(fArr, 0, fHypot, f, f2, 0.0f);
        float[] fArr2 = this.f26320;
        float[] fArr3 = this.f26310;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr3, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
        this.f26316.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public void m21486() {
        this.f26312 = false;
        this.f26331.removeCallbacks(this.f26313);
        this.f26337.m8870();
        this.f26333 = 0L;
        m21480();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m21494() {
        ValueAnimator valueAnimator = this.f26330;
        if (valueAnimator != null) {
            this.f26330 = null;
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21477() {
        return (!this.f26329 || this.f26319 || this.f26312 || this.f26330 != null || this.f26332 || this.f26315) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public void m21480() {
        TextureView textureView = this.f26331;
        RunnableC4193 runnableC4193 = this.f26327;
        textureView.removeCallbacks(runnableC4193);
        if (m21477()) {
            textureView.postDelayed(runnableC4193, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public void m21496() {
        if (m21477()) {
            if (!this.f26336) {
                System.arraycopy(this.f26310, 0, this.f26326, 0, 16);
                this.f26335 = 0L;
            }
            this.f26336 = false;
            this.f26324 = System.nanoTime() - this.f26335;
            this.f26332 = true;
            this.f26331.postOnAnimation(this.f26321);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public void m21491() {
        this.f26332 = false;
        this.f26336 = false;
        RunnableC4193 runnableC4193 = this.f26327;
        TextureView textureView = this.f26331;
        textureView.removeCallbacks(runnableC4193);
        textureView.removeCallbacks(this.f26321);
    }
}
