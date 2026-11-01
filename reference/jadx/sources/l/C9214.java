package l;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.OverScroller;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۡ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C9214 extends AbstractC17679 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31305;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public double f31306;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Handler f31307;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C9649 f31308;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public long f31309;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final Paint f31310;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f31311;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public int f31312;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f31313;

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public boolean f31314;

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public float f31315;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public boolean f31316;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f31317;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public Bundle f31318;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f31319;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f31320;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Paint f31321;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public InterfaceC12741 f31322;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public float f31323;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C0103 f31324;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final GestureDetector f31325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Matrix f31326;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public boolean f31327;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final RectF f31328;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f31329;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f31330;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC15564 f31331;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f31332;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f31333;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C23325 f31334;

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ܶ᩻۬] */
    public C9214(ActivityC15481 activityC15481) {
        super(activityC15481, null);
        this.f31308 = new C9649(getResources().getDisplayMetrics().density);
        this.f31311 = new SparseArray();
        this.f31321 = new Paint(3);
        Paint paint = new Paint(1);
        this.f31310 = paint;
        this.f31333 = new Matrix();
        this.f31326 = new Matrix();
        this.f31328 = new RectF();
        this.f31307 = new Handler(Looper.getMainLooper());
        this.f31331 = new Runnable() { // from class: l.ܶ᩻۬
            @Override // java.lang.Runnable
            public final void run() {
                this.f50624.m23725();
            }
        };
        this.f31305 = -1;
        this.f31330 = -16777216;
        this.f31315 = 1.0f;
        this.f31320 = new OverScroller(activityC15481);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        setFocusable(true);
        setClickable(true);
        setImportantForAccessibility(1);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activityC15481, new C21913(this));
        this.f31332 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f31325 = new GestureDetector(activityC15481, new C19091(this));
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo23733(int i) {
        C23325 c23325 = this.f31334;
        return c23325 != null && c23325.m51410(i) < this.f31306 + ((double) (((float) getHeight()) / this.f31315)) && this.f31334.m51410(i) + this.f31334.m51407(i) > this.f31306;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final void mo19696(InterfaceC12741 interfaceC12741) {
        this.f31322 = interfaceC12741;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ܰ */
    public final int mo19708() {
        return this.f31305;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۨ */
    public final void mo19705(int i) {
        this.f31330 = i;
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo19706() {
        if (!this.f31320.isFinished()) {
            return true;
        }
        ValueAnimator valueAnimator = this.f31329;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo19687() {
        return this.f31314;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final void mo19695(C0103 c0103, int i) {
        if (c0103.m1122() <= 0 || i < 0 || i >= c0103.m1122()) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo19700();
        this.f31324 = c0103;
        C23325 c23325 = new C23325(c0103.m1122());
        this.f31334 = c23325;
        c23325.m51404(getWidth(), getResources().getDisplayMetrics().density, getHeight());
        this.f31305 = i;
        this.f31319 = true;
        this.f31306 = this.f31334.m51410(i);
        c0103.m1121(this.f31305);
        m23704(this.f31305);
        m23725();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8508 m23707(float f) {
        C23325 c23325 = this.f31334;
        if (c23325 == null || this.f31305 < 0) {
            return null;
        }
        double d = this.f31306 + ((double) (f / this.f31315));
        int iM51402 = c23325.m51402(d);
        return new C8508(iM51402, (d - this.f31334.m51410(iM51402)) / Math.max(1.0d, this.f31334.m51407(iM51402)), f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23709(C8508 c8508) {
        if (this.f31319) {
            this.f31306 = Math.min(0.0d, (this.f31334.m51407(this.f31305) - ((double) (getHeight() / this.f31315))) / 2.0d) + this.f31334.m51410(this.f31305);
        } else if (c8508 != null) {
            int i = c8508.f29487;
            this.f31306 = ((c8508.f29485 * this.f31334.m51407(i)) + this.f31334.m51410(i)) - ((double) (c8508.f29486 / this.f31315));
        }
        m23722();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f31334 == null) {
            return;
        }
        C8508 c8508 = (i3 <= 0 || i4 <= 0) ? new C8508(this.f31305, 0.0d, 0.0f) : m23707(i4 / 2.0f);
        mo19691();
        if (i3 > 0) {
            float f2 = i3;
            f = ((f2 / 2.0f) - this.f31323) / (f2 * this.f31315);
        } else {
            f = 0.5f;
        }
        this.f31334.m51404(i, getResources().getDisplayMetrics().density, i2);
        float f3 = i;
        this.f31323 = (f3 / 2.0f) - ((f * f3) * this.f31315);
        m23709(new C8508(c8508.f29487, c8508.f29485, i4 > 0 ? i2 / 2.0f : 0.0f));
        m23702();
        m23725();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19698(int i, long j, InterfaceC12471 interfaceC12471) {
        int i2;
        C20565 c20565 = (C20565) interfaceC12471;
        C20937 c20937 = c20565.f67004;
        if (c20937.f68250 <= 0 || c20937.f68251 <= 0 || (i2 = c20937.f68246) < 1 || i2 > 8) {
            c20565.m46411();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C19797 c19797 = (C19797) this.f31311.get(i);
        if (!m23715(c19797, j)) {
            c20565.m46411();
            return false;
        }
        C8508 c8508M23707 = m23707(0.0f);
        boolean z = this.f31306 == m23717();
        boolean z2 = this.f31306 == m23705();
        InterfaceC12471 interfaceC12472 = c19797.f63572;
        float[] fArr = c19797.f63570;
        c19797.f63572 = interfaceC12471;
        c19797.f63567 = false;
        C23325 c23325 = this.f31334;
        C20937 c20938 = c20565.f67004;
        int iM2183 = C0418.m2183(c20938.f68250, c20938.f68251, c20938.f68246);
        C20937 c20939 = c20565.f67004;
        c23325.m51405(i, iM2183, C0418.m2184(c20939.f68250, c20939.f68251, c20939.f68246));
        C20937 c209310 = c20565.f67004;
        C0418.m2180(c209310.f68250, c209310.f68251, c209310.f68246, fArr);
        c19797.f63566.setValues(fArr);
        if (interfaceC12472 != null && interfaceC12472 != interfaceC12471) {
            ((C20565) interfaceC12472).m46411();
        }
        m23709(c8508M23707);
        if (!this.f31319 && this.f31318 == null) {
            if (z) {
                this.f31306 = m23717();
            } else if (z2) {
                this.f31306 = m23705();
            }
        }
        m23702();
        Handler handler = this.f31307;
        RunnableC15564 runnableC15564 = this.f31331;
        handler.removeCallbacks(runnableC15564);
        handler.post(runnableC15564);
        invalidate();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m23715(C19797 c19797, long j) {
        return this.f31324 != null && c19797 != null && c19797.f63565 == j && ((long) c19797.f63568) + 1 == c19797.f63569;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m23704(int i) {
        if (i < 0 || i >= this.f31334.m51401()) {
            return;
        }
        SparseArray sparseArray = this.f31311;
        if (sparseArray.get(i) != null) {
            return;
        }
        this.f31324.getClass();
        long j = this.f31309 + 1;
        this.f31309 = j;
        C19797 c19797 = new C19797(((long) i) + 1, i, j);
        sparseArray.put(i, c19797);
        this.f31324.m1130(i, c19797.f63565);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m23714(C19797 c19797) {
        this.f31324.m1124(c19797.f63568, c19797.f63565);
        InterfaceC12471 interfaceC12471 = c19797.f63572;
        if (interfaceC12471 != null) {
            ((C20565) interfaceC12471).m46411();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public void m23725() {
        SparseArray sparseArray = this.f31311;
        if (this.f31324 == null || getWidth() <= 0 || getHeight() <= 0 || this.f31327) {
            return;
        }
        this.f31327 = true;
        try {
            m23722();
            int iM51402 = this.f31334.m51402(this.f31306);
            int iM51403 = this.f31334.m51402(this.f31306 + ((double) (getHeight() / this.f31315)));
            double dMin = Math.min(this.f31334.m51408() - 0.001d, this.f31306 + ((double) (getHeight() / (this.f31315 * 2.0f))));
            int iM51404 = this.f31334.m51402(dMin);
            if (!this.f31319 && this.f31318 == null && dMin <= this.f31334.m51410(iM51404) + this.f31334.m51407(iM51404) && iM51404 != this.f31305) {
                this.f31305 = iM51404;
                this.f31324.m1121(iM51404);
                InterfaceC12741 interfaceC12741 = this.f31322;
                if (interfaceC12741 != null) {
                    interfaceC12741.mo18821(this.f31305);
                }
            }
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                C19797 c19797 = (C19797) sparseArray.valueAt(size);
                int i = c19797.f63568;
                if (i < iM51402 - 1 || i > iM51403 + 1) {
                    sparseArray.removeAt(size);
                    m23714(c19797);
                }
            }
            m23704(this.f31305);
            for (int i2 = iM51402; i2 <= iM51403; i2++) {
                m23704(i2);
            }
            m23704(iM51402 - 1);
            m23704(iM51403 + 1);
            this.f31324.m1128();
            invalidate();
        } finally {
            this.f31327 = false;
        }
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo19712(int i) {
        SparseArray sparseArray = this.f31311;
        C19797 c19797 = (C19797) sparseArray.get(i);
        if (c19797 == null || this.f31324 == null) {
            return false;
        }
        m23714(c19797);
        sparseArray.remove(i);
        m23704(i);
        invalidate();
        return true;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final void mo19694(int i, int i2, long j) {
        C19797 c19797 = (C19797) this.f31311.get(i);
        if (m23715(c19797, j)) {
            c19797.f63567 = true;
            c19797.f63571 = i2;
            if (i == this.f31305) {
                this.f31318 = null;
            }
            invalidate();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        canvas.drawColor(this.f31330);
        if (this.f31334 == null) {
            return;
        }
        int i = this.f31330 == -1 ? -12303292 : -3355444;
        Paint paint = this.f31310;
        paint.setColor(i);
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f31311;
            if (i2 >= sparseArray.size()) {
                return;
            }
            C19797 c19797 = (C19797) sparseArray.valueAt(i2);
            C23325 c23325 = this.f31334;
            int i3 = c19797.f63568;
            float fM51410 = (float) ((c23325.m51410(i3) - this.f31306) * ((double) this.f31315));
            float fM51407 = ((float) (this.f31334.m51407(i3) * ((double) this.f31315))) + fM51410;
            boolean z = fM51410 < ((float) getHeight()) && fM51407 > 0.0f;
            if (c19797.f63572 == null) {
                if (z && !this.f31324.m1129(i3)) {
                    canvas.drawText(getResources().getString(c19797.f63567 ? c19797.f63571 : R.string.MT_Protector), getWidth() / 2.0f, (Math.min(getHeight(), fM51407) + Math.max(0.0f, fM51410)) / 2.0f, paint);
                }
                f2 = 2.0f;
                paint = paint;
            } else {
                float fM51406 = ((float) this.f31334.m51406(i3)) * this.f31315;
                float width = (((getWidth() * this.f31315) - (this.f31334.m51399(i3) * fM51406)) / 2.0f) + this.f31323;
                float fM51409 = (((float) this.f31334.m51409(i3)) * this.f31315) + fM51410;
                Matrix matrix = this.f31333;
                matrix.setTranslate(width, fM51409);
                matrix.preScale(fM51406, fM51406);
                matrix.preConcat(c19797.f63566);
                RectF rectF = this.f31328;
                rectF.setEmpty();
                if (z) {
                    Matrix matrix2 = this.f31326;
                    if (matrix.invert(matrix2)) {
                        f = 0.0f;
                        rectF.set(0.0f, Math.max(0.0f, fM51410), getWidth(), Math.min(getHeight(), fM51407));
                        matrix2.mapRect(rectF);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                ((C20565) c19797.f63572).m46408(rectF, fM51406, z);
                if (z) {
                    int iSave = canvas.save();
                    canvas.clipRect(f, Math.max(f, fM51410), getWidth(), Math.min(getHeight(), fM51407));
                    canvas.concat(matrix);
                    ((C20565) c19797.f63572).m46407(canvas, this.f31321);
                    canvas.restoreToCount(iSave);
                }
                f2 = 2.0f;
            }
            if (z && this.f31324.m1129(i3) && this.f31312 <= 1) {
                int iSave2 = canvas.save();
                canvas.clipRect(0.0f, Math.max(0.0f, fM51410), getWidth(), Math.min(getHeight(), fM51407));
                this.f31308.m24544(canvas, getWidth() / f2, (Math.min(getHeight(), fM51407) + Math.max(0.0f, fM51410)) / f2);
                canvas.restoreToCount(iSave2);
            }
            i2++;
            paint = paint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public double m23717() {
        C23325 c23325 = this.f31334;
        if (c23325 == null) {
            return 0.0d;
        }
        return Math.min(0.0d, (c23325.m51407(0) - ((double) (getHeight() / this.f31315))) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public double m23705() {
        if (this.f31334 == null) {
            return 0.0d;
        }
        double height = getHeight() / this.f31315;
        double dM23717 = m23717();
        double dM51408 = this.f31334.m51408() - height;
        C23325 c23325 = this.f31334;
        return Math.max(dM23717, Math.max(0.0d, (height - c23325.m51407(c23325.m51401() - 1)) / 2.0d) + dM51408);
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m23722() {
        this.f31306 = Math.max(m23717(), Math.min(m23705(), this.f31306));
        this.f31323 = Math.max((1.0f - this.f31315) * getWidth(), Math.min(0.0f, this.f31323));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m23708(float f, float f2) {
        this.f31319 = false;
        this.f31318 = null;
        this.f31306 -= (double) (f2 / this.f31315);
        this.f31323 += f;
        m23725();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23712(C9214 c9214, float f, float f2, float f3) {
        if (c9214.f31334 == null) {
            return;
        }
        c9214.f31319 = false;
        c9214.f31318 = null;
        float fMax = Math.max(1.0f, Math.min(5.0f, f));
        double d = c9214.f31306;
        float f4 = c9214.f31315;
        c9214.f31323 = f2 - (((f2 - c9214.f31323) * fMax) / f4);
        c9214.f31315 = fMax;
        c9214.f31306 = (d + ((double) (f3 / f4))) - ((double) (f3 / fMax));
        c9214.m23725();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount;
        if (this.f31324 == null) {
            return false;
        }
        boolean z = this.f31312 > 1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            pointerCount = 0;
        } else {
            pointerCount = motionEvent.getPointerCount() - (actionMasked == 6 ? 1 : 0);
        }
        this.f31312 = pointerCount;
        if (actionMasked == 0) {
            m23732();
            this.f31314 = true;
            this.f31316 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f31316 = true;
            m23732();
        }
        this.f31332.onTouchEvent(motionEvent);
        this.f31325.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f31314 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (actionMasked == 3) {
                m23732();
            }
            invalidate();
        }
        if (z != (this.f31312 > 1)) {
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        int i;
        super.performClick();
        if (this.f31322 == null) {
            return true;
        }
        C0103 c0103 = this.f31324;
        if (c0103 == null || (i = this.f31305) < 0 || !c0103.m1129(i)) {
            this.f31322.mo18819();
            return true;
        }
        this.f31322.mo18822(this.f31305);
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f31320;
        if (overScroller.computeScrollOffset()) {
            m23708(overScroller.getCurrX() - this.f31313, this.f31317 - overScroller.getCurrY());
            this.f31313 = overScroller.getCurrX();
            this.f31317 = overScroller.getCurrY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    private void m23732() {
        this.f31320.forceFinished(true);
        ValueAnimator valueAnimator = this.f31329;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f31329 = null;
        }
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final void mo19691() {
        m23732();
        this.f31314 = false;
        this.f31312 = 0;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f31325.onTouchEvent(motionEventObtain);
        this.f31332.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            return;
        }
        mo19691();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        mo19691();
        this.f31307.removeCallbacks(this.f31331);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۚ */
    public final void mo19700() {
        mo19691();
        this.f31307.removeCallbacks(this.f31331);
        C0103 c0103 = this.f31324;
        SparseArray sparseArray = this.f31311;
        if (c0103 != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                m23714((C19797) sparseArray.valueAt(i));
            }
        }
        sparseArray.clear();
        this.f31324 = null;
        this.f31334 = null;
        this.f31305 = -1;
        this.f31319 = false;
        this.f31318 = null;
        this.f31306 = 0.0d;
        this.f31315 = 1.0f;
        this.f31323 = 0.0f;
        invalidate();
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ᩹ */
    public final Bundle mo19713() {
        InterfaceC12471 interfaceC12471;
        if (this.f31318 != null) {
            return new Bundle(this.f31318);
        }
        if (this.f31334 == null || this.f31305 < 0 || getWidth() == 0 || !this.f31334.m51400(this.f31305)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("continuous", true);
        double dMax = Math.max(this.f31334.m51410(this.f31305), Math.min(this.f31334.m51410(this.f31305) + this.f31334.m51407(this.f31305), this.f31306 + ((double) (getHeight() / (this.f31315 * 2.0f)))));
        bundle.putDouble("fraction", (dMax - this.f31334.m51410(this.f31305)) / this.f31334.m51407(this.f31305));
        bundle.putFloat("screenY", (float) (((dMax - this.f31306) * ((double) this.f31315)) / ((double) getHeight())));
        C19797 c19797 = (C19797) this.f31311.get(this.f31305);
        bundle.putInt("orientation", (c19797 == null || (interfaceC12471 = c19797.f63572) == null) ? 0 : ((C20565) interfaceC12471).f67004.f68246);
        bundle.putFloat("zoom", this.f31315);
        bundle.putFloat("centerX", ((getWidth() / 2.0f) - this.f31323) / (getWidth() * this.f31315));
        bundle.putInt("width", this.f31334.m51399(this.f31305));
        bundle.putInt("height", this.f31334.m51403(this.f31305));
        return bundle;
    }

    @Override // l.AbstractC17679
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo19699(Bundle bundle) {
        this.f31318 = null;
        if (bundle == null || this.f31324 == null || !bundle.getBoolean("continuous")) {
            return false;
        }
        double d = bundle.getDouble("fraction", Double.NaN);
        float f = bundle.getFloat("zoom", Float.NaN);
        float f2 = bundle.getFloat("centerX", Float.NaN);
        float f3 = bundle.getFloat("screenY", Float.NaN);
        if (d < 0.0d || d > 1.0d || f < 1.0f || f > 5.0f || f2 < 0.0f || f2 > 1.0f || f3 < 0.0f || f3 > 1.0f) {
            return false;
        }
        this.f31318 = new Bundle(bundle);
        m23702();
        return true;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private void m23702() {
        if (this.f31318 == null || this.f31334 == null || getWidth() <= 0 || getHeight() <= 0 || !this.f31334.m51400(this.f31305)) {
            return;
        }
        Bundle bundle = this.f31318;
        C19797 c19797 = (C19797) this.f31311.get(this.f31305);
        if (bundle.getInt("width") != this.f31334.m51399(this.f31305) || bundle.getInt("height") != this.f31334.m51403(this.f31305) || c19797 == null || c19797.f63572 == null || bundle.getInt("orientation") != ((C20565) c19797.f63572).f67004.f68246) {
            this.f31318 = null;
            return;
        }
        this.f31319 = false;
        this.f31315 = bundle.getFloat("zoom");
        this.f31323 = (getWidth() / 2.0f) - ((bundle.getFloat("centerX") * getWidth()) * this.f31315);
        m23709(new C8508(this.f31305, bundle.getDouble("fraction"), bundle.getFloat("screenY") * getHeight()));
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(true);
        C0103 c0103 = this.f31324;
        if (c0103 != null && (i = this.f31305) >= 0 && c0103.m1129(i)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (this.f31306 > m23717()) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (this.f31306 < m23705()) {
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            m23732();
            m23708(0.0f, getHeight() * 0.8f * (i == 4096 ? -1 : 1));
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 20 || i == 93) {
            return performAccessibilityAction(4096, null);
        }
        if (i == 19 || i == 92) {
            return performAccessibilityAction(8192, null);
        }
        return super.onKeyDown(i, keyEvent);
    }
}
