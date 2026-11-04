package l;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.ۖ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC2681 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final int f8528 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final AccelerateInterpolator f8529;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float[] f8530;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f8531;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Runnable f8532;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float[] f8533;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f8534;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public boolean f8535;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public float[] f8536;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float[] f8537;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final View f8538;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float[] f8539;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f8540;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f8541;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f8542;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f8543;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final C1190 f8544;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m8851(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo8854(int i);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public abstract void mo8855(int i);

    public AbstractViewOnTouchListenerC2681(View view) {
        C1190 c1190 = new C1190();
        this.f8544 = c1190;
        this.f8529 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f8533 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8537 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f8539 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f8536 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f8530 = fArr5;
        this.f8538 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f8534 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8540 = f8528;
        c1190.m4385();
        c1190.m4387();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8853(boolean z) {
        if (this.f8542 && !z) {
            if (this.f8535) {
                this.f8541 = false;
            } else {
                this.f8544.m4388();
            }
        }
        this.f8542 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
    
        if (r0 != 3) goto L37;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            boolean r0 = r8.f8542
            r1 = 0
            if (r0 != 0) goto L7
            goto L8f
        L7:
            int r0 = r10.getActionMasked()
            l.֨۬ r2 = r8.f8544
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1a
            r4 = 2
            if (r0 == r4) goto L29
            r9 = 3
            if (r0 == r9) goto L1a
            goto L8f
        L1a:
            boolean r9 = r8.f8535
            if (r9 == 0) goto L21
            r8.f8541 = r1
            return r1
        L21:
            r2.m4388()
            return r1
        L25:
            r8.f8531 = r3
            r8.f8543 = r1
        L29:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f8538
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m8852(r0, r4, r6, r1)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m8852(r10, r9, r4, r3)
            r2.m4384(r0, r9)
            boolean r9 = r8.f8541
            if (r9 != 0) goto L8f
            int r9 = r2.m4391()
            r2.m4386()
            if (r9 == 0) goto L8f
            boolean r9 = r8.mo8854(r9)
            if (r9 != 0) goto L66
            goto L8f
        L66:
            java.lang.Runnable r9 = r8.f8532
            if (r9 != 0) goto L71
            l.ۡ۬ r9 = new l.ۡ۬
            r9.<init>(r8)
            r8.f8532 = r9
        L71:
            r8.f8541 = r3
            r8.f8535 = r3
            boolean r9 = r8.f8543
            if (r9 != 0) goto L86
            int r9 = r8.f8540
            if (r9 <= 0) goto L86
            java.lang.Runnable r10 = r8.f8532
            long r6 = (long) r9
            int r9 = l.C22666.f73603
            r5.postOnAnimationDelayed(r10, r6)
            goto L8d
        L86:
            java.lang.Runnable r9 = r8.f8532
            l.ۡ۬ r9 = (l.RunnableC9392) r9
            r9.run()
        L8d:
            r8.f8543 = r3
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC2681.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m8852(float f, float f2, float f3, int i) {
        float fM8851;
        float interpolation;
        float f4;
        float f5;
        float f6;
        float fM8852 = m8851(this.f8533[i] * f2, 0.0f, this.f8537[i]);
        float fM8850 = m8850(f2 - f, fM8852) - m8850(f, fM8852);
        AccelerateInterpolator accelerateInterpolator = this.f8529;
        if (fM8850 >= 0.0f) {
            if (fM8850 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM8850);
            } else {
                fM8851 = 0.0f;
            }
            if (fM8851 == 0.0f) {
                return 0.0f;
            }
            float f7 = this.f8539[i];
            f4 = this.f8536[i];
            f5 = this.f8530[i];
            f6 = f7 * f3;
            if (fM8851 > 0.0f) {
                return m8851(fM8851 * f6, f4, f5);
            }
            return -m8851((-fM8851) * f6, f4, f5);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM8850);
        fM8851 = m8851(interpolation, -1.0f, 1.0f);
        if (fM8851 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f8539[i];
        f4 = this.f8536[i];
        f5 = this.f8530[i];
        f6 = f8 * f3;
        if (fM8851 > 0.0f) {
            return m8851(fM8851 * f6, f4, f5);
        }
        return -m8851((-fM8851) * f6, f4, f5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m8850(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f8534;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f8541 && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f < 0.0f) {
                return f / (-f2);
            }
        }
        return 0.0f;
    }
}
