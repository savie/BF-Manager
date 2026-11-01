package l;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;

/* JADX INFO: renamed from: l.ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractViewOnTouchListenerC2955 implements View.OnTouchListener {

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final int f11062 = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f11063;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f11064;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float[] f11065;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public Runnable f11066;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float[] f11067;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public float[] f11068;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float[] f11069;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final View f11070;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f11071;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final C1544 f11072;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f11073;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11074;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final AccelerateInterpolator f11075;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f11076;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f11077;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public float[] f11078;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static float m8779(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract boolean mo8782(int i);

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public abstract void mo8783(int i);

    public AbstractViewOnTouchListenerC2955(View view) {
        C1544 c1544 = new C1544();
        this.f11072 = c1544;
        this.f11075 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f11068 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f11067 = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f11065 = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f11078 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f11069 = fArr5;
        this.f11070 = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f11071 = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f11074 = f11062;
        c1544.m5327();
        c1544.m5320();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m8781(boolean z) {
        if (this.f11076 && !z) {
            if (this.f11064) {
                this.f11063 = false;
            } else {
                this.f11072.m5329();
            }
        }
        this.f11076 = z;
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
            boolean r0 = r8.f11076
            r1 = 0
            if (r0 != 0) goto L7
            goto L8f
        L7:
            int r0 = r10.getActionMasked()
            l.֫ۗ r2 = r8.f11072
            r3 = 1
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1a
            r4 = 2
            if (r0 == r4) goto L29
            r9 = 3
            if (r0 == r9) goto L1a
            goto L8f
        L1a:
            boolean r9 = r8.f11064
            if (r9 == 0) goto L21
            r8.f11063 = r1
            return r1
        L21:
            r2.m5329()
            return r1
        L25:
            r8.f11073 = r3
            r8.f11077 = r1
        L29:
            float r0 = r10.getX()
            int r4 = r9.getWidth()
            float r4 = (float) r4
            android.view.View r5 = r8.f11070
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r0 = r8.m8780(r1, r0, r4, r6)
            float r10 = r10.getY()
            int r9 = r9.getHeight()
            float r9 = (float) r9
            int r4 = r5.getHeight()
            float r4 = (float) r4
            float r9 = r8.m8780(r3, r10, r9, r4)
            r2.m5324(r0, r9)
            boolean r9 = r8.f11063
            if (r9 != 0) goto L8f
            int r9 = r2.m5321()
            r2.m5326()
            if (r9 == 0) goto L8f
            boolean r9 = r8.mo8782(r9)
            if (r9 != 0) goto L66
            goto L8f
        L66:
            java.lang.Runnable r9 = r8.f11066
            if (r9 != 0) goto L71
            l.ۢۗ r9 = new l.ۢۗ
            r9.<init>(r8)
            r8.f11066 = r9
        L71:
            r8.f11063 = r3
            r8.f11064 = r3
            boolean r9 = r8.f11077
            if (r9 != 0) goto L86
            int r9 = r8.f11074
            if (r9 <= 0) goto L86
            java.lang.Runnable r10 = r8.f11066
            long r6 = (long) r9
            int r9 = l.C5031.f17539
            r5.postOnAnimationDelayed(r10, r6)
            goto L8d
        L86:
            java.lang.Runnable r9 = r8.f11066
            l.ۢۗ r9 = (l.RunnableC9307) r9
            r9.run()
        L8d:
            r8.f11077 = r3
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.AbstractViewOnTouchListenerC2955.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    /* JADX WARN: Code duplicated, block: B:15:0x004d  */
    /* JADX WARN: Code duplicated, block: B:17:0x0054  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m8780(int i, float f, float f2, float f3) {
        float fM8779;
        float interpolation;
        float f4;
        float f5;
        float f6;
        float fM87710 = m8779(this.f11068[i] * f2, 0.0f, this.f11067[i]);
        float fM8778 = m8778(f2 - f, fM87710) - m8778(f, fM87710);
        AccelerateInterpolator accelerateInterpolator = this.f11075;
        if (fM8778 >= 0.0f) {
            if (fM8778 > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fM8778);
            } else {
                fM8779 = 0.0f;
            }
            if (fM8779 == 0.0f) {
                return 0.0f;
            }
            float f7 = this.f11065[i];
            f4 = this.f11078[i];
            f5 = this.f11069[i];
            f6 = f7 * f3;
            if (fM8779 > 0.0f) {
                return m8779(fM8779 * f6, f4, f5);
            }
            return -m8779((-fM8779) * f6, f4, f5);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fM8778);
        fM8779 = m8779(interpolation, -1.0f, 1.0f);
        if (fM8779 == 0.0f) {
            return 0.0f;
        }
        float f8 = this.f11065[i];
        f4 = this.f11078[i];
        f5 = this.f11069[i];
        f6 = f8 * f3;
        if (fM8779 > 0.0f) {
            return m8779(fM8779 * f6, f4, f5);
        }
        return -m8779((-fM8779) * f6, f4, f5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m8778(float f, float f2) {
        if (f2 != 0.0f) {
            int i = this.f11071;
            if (i == 0 || i == 1) {
                if (f < f2) {
                    if (f >= 0.0f) {
                        return 1.0f - (f / f2);
                    }
                    if (this.f11063 && i == 1) {
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
