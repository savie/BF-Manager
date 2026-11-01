package l;

import android.animation.ValueAnimator;
import android.opengl.Matrix;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.ViewConfiguration;
import android.view.animation.LinearInterpolator;

/* JADX INFO: renamed from: l.᩻۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes.dex */
public final class C23562 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public ValueAnimator f76288;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f76289;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f76290;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f76291;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f76292;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f76293;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f76296;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float f76298;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f76299;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f76300;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final GestureDetector f76302;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final RunnableC7361 f76303;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f76304;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f76305;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long f76306;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final float[] f76307;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final TextureView f76308;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public long f76311;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float[] f76313;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f76314;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final float f76316;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f76317;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final float[] f76295 = new float[16];

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float[] f76294 = new float[16];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float[] f76315 = new float[16];

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C4904 f76310 = new C4904();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f76312 = -1;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final RunnableC16506 f76309 = new Runnable() { // from class: l.ܽ۟᩺
        @Override // java.lang.Runnable
        public final void run() {
            this.f53023.m51928();
        }
    };

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Runnable f76301 = new RunnableC12273(this);

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Runnable f76297 = new RunnableC17211(this);

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ܽ۟᩺] */
    public C23562(TextureView textureView, RunnableC7361 runnableC7361) {
        float[] fArr = new float[16];
        this.f76307 = fArr;
        this.f76308 = textureView;
        this.f76303 = runnableC7361;
        this.f76316 = textureView.getResources().getDisplayMetrics().density;
        this.f76300 = ViewConfiguration.get(textureView.getContext()).getScaledTouchSlop();
        Matrix.setIdentityM(fArr, 0);
        GestureDetector gestureDetector = new GestureDetector(textureView.getContext(), new C5922(this));
        this.f76302 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m51961(boolean z) {
        if (this.f76314 == z) {
            return;
        }
        this.f76314 = z;
        if (!z) {
            boolean z2 = this.f76293;
            m51939();
            this.f76290 = z2;
            m51956();
            m51948();
            this.f76312 = -1;
            this.f76305 = false;
            this.f76317 = false;
            TextureView textureView = this.f76308;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            this.f76302.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        float[] fArr = this.f76313;
        if (fArr != null) {
            m51936(fArr, this.f76306, this.f76296);
        } else if (this.f76290) {
            m51928();
        } else {
            m51944();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m51960(MotionEvent motionEvent) {
        if (!this.f76314) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        TextureView textureView = this.f76308;
        if (actionMasked == 0) {
            this.f76317 = true;
            this.f76292 = false;
            m51939();
            m51956();
            m51948();
            this.f76312 = -1;
            this.f76305 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        this.f76302.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            if (actionMasked == 3) {
                m51956();
                m51948();
            }
            if (actionMasked == 1 && !this.f76305) {
                textureView.performClick();
            }
            this.f76312 = -1;
            this.f76305 = false;
            this.f76317 = false;
            if (textureView.getParent() != null) {
                textureView.getParent().requestDisallowInterceptTouchEvent(false);
            }
            m51944();
            return true;
        }
        if (motionEvent.getPointerCount() != 1) {
            this.f76312 = -1;
            this.f76305 = false;
            m51956();
            m51948();
            return true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int pointerId = motionEvent.getPointerId(0);
        if (actionMasked == 2 && this.f76312 == pointerId) {
            float f = x - this.f76298;
            float f2 = y - this.f76299;
            if (!this.f76305 && Math.hypot(f, f2) <= this.f76300) {
                return true;
            }
            this.f76305 = true;
            m51948();
            float f3 = this.f76316;
            float f4 = (f2 / f3) * 0.75f;
            float f5 = (f / f3) * 0.75f;
            m51931(f4, f5);
            this.f76310.m13631(f4, f5);
            if (!this.f76291) {
                this.f76291 = true;
                this.f76311 = 0L;
                textureView.postOnAnimation(this.f76297);
            }
        }
        this.f76312 = pointerId;
        this.f76298 = x;
        this.f76299 = y;
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51958(long j, boolean z) {
        float[] fArr = new float[16];
        if (z) {
            Matrix.setRotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
        } else {
            Matrix.setIdentityM(fArr, 0);
        }
        m51936(fArr, j, 0.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51959(boolean z) {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        m51936(fArr, 600L, z ? -45.0f : 45.0f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m51936(final float[] fArr, long j, final float f) {
        if (j < 0) {
            throw new IllegalArgumentException("Negative rotation duration");
        }
        this.f76292 = false;
        m51939();
        m51956();
        m51948();
        this.f76308.removeCallbacks(this.f76309);
        if (!this.f76314) {
            this.f76313 = fArr;
            this.f76306 = j;
            this.f76296 = f;
            return;
        }
        this.f76313 = null;
        this.f76296 = 0.0f;
        float[] fArr2 = new float[16];
        final float[] fArr3 = new float[16];
        Matrix.transposeM(fArr2, 0, fArr, 0);
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, this.f76307, 0);
        final C3099 c3099 = new C3099(fArr3);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f76288 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f76288.setInterpolator(new LinearInterpolator());
        this.f76288.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.֡۟᩺
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C23562.m51935(this.f1568, fArr, fArr3, c3099, f, valueAnimator);
            }
        });
        this.f76288.addListener(new C10862(this));
        this.f76288.start();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51935(C23562 c23562, float[] fArr, float[] fArr2, C3099 c3099, float f, ValueAnimator valueAnimator) {
        float[] fArr3 = c23562.f76294;
        float[] fArr4 = c23562.f76295;
        float[] fArr5 = c23562.f76307;
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue < 1.0f) {
            float fMax = Math.max(0.0f, Math.min(1.0f, fFloatValue));
            Matrix.setRotateM(fArr2, 0, (1.0f - ((3.0f - (fMax * 2.0f)) * (fMax * fMax))) * c3099.f11689, c3099.f11691, c3099.f11690, c3099.f11688);
            Matrix.multiplyMM(fArr5, 0, fArr, 0, fArr2, 0);
            if (f != 0.0f) {
                Matrix.setRotateM(fArr4, 0, f * ((float) ((1.0d - Math.cos(((double) fFloatValue) * 6.283185307179586d)) / 2.0d)), -0.819152f, 0.573576f, 0.0f);
                Matrix.multiplyMM(fArr3, 0, fArr4, 0, fArr5, 0);
                System.arraycopy(fArr3, 0, fArr5, 0, 16);
            }
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 16);
        }
        c23562.f76303.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m51931(float f, float f2) {
        float fHypot = (float) Math.hypot(f, f2);
        if (fHypot == 0.0f) {
            return;
        }
        float[] fArr = this.f76295;
        Matrix.setRotateM(fArr, 0, fHypot, f, f2, 0.0f);
        float[] fArr2 = this.f76294;
        float[] fArr3 = this.f76307;
        Matrix.multiplyMM(fArr2, 0, fArr, 0, fArr3, 0);
        System.arraycopy(fArr2, 0, fArr3, 0, 16);
        this.f76303.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public void m51956() {
        this.f76291 = false;
        this.f76308.removeCallbacks(this.f76297);
        this.f76310.m13633();
        this.f76311 = 0L;
        m51944();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m51948() {
        ValueAnimator valueAnimator = this.f76288;
        if (valueAnimator != null) {
            this.f76288 = null;
            valueAnimator.cancel();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m51937() {
        return (!this.f76314 || this.f76317 || this.f76291 || this.f76288 != null || this.f76293 || this.f76292) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public void m51944() {
        TextureView textureView = this.f76308;
        RunnableC16506 runnableC16506 = this.f76309;
        textureView.removeCallbacks(runnableC16506);
        if (m51937()) {
            textureView.postDelayed(runnableC16506, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public void m51928() {
        if (m51937()) {
            if (!this.f76290) {
                System.arraycopy(this.f76307, 0, this.f76315, 0, 16);
                this.f76304 = 0L;
            }
            this.f76290 = false;
            this.f76289 = System.nanoTime() - this.f76304;
            this.f76293 = true;
            this.f76308.postOnAnimation(this.f76301);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public void m51939() {
        this.f76293 = false;
        this.f76290 = false;
        RunnableC16506 runnableC16506 = this.f76309;
        TextureView textureView = this.f76308;
        textureView.removeCallbacks(runnableC16506);
        textureView.removeCallbacks(this.f76301);
    }
}
