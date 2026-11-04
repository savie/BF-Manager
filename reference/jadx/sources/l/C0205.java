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

/* JADX INFO: renamed from: l.֡ۚ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: B6LA */
/* JADX INFO: loaded from: classes3.dex */
public final class C0205 extends AbstractC13628 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final GestureDetector f1370;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f1371;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f1372;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public InterfaceC6917 f1373;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public float f1374;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final SparseArray f1375;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final OverScroller f1376;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public boolean f1377;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f1378;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final Handler f1379;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C12137 f1380;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f1381;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Bundle f1382;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public boolean f1383;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public double f1384;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f1385;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object f1386;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final ScaleGestureDetector f1387;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public boolean f1388;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public float f1389;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final RunnableC6172 f1390;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f1391;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Matrix f1392;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public int f1393;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public ValueAnimator f1394;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f1395;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final Paint f1396;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C5600 f1397;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final RectF f1398;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final Matrix f1399;

    /* JADX WARN: Type inference failed for: r2v4, types: [l.ۛۚ֫] */
    public C0205(ActivityC15913 activityC15913) {
        super(activityC15913, null);
        this.f1397 = new C5600(getResources().getDisplayMetrics().density);
        this.f1375 = new SparseArray();
        this.f1396 = new Paint(3);
        Paint paint = new Paint(1);
        this.f1372 = paint;
        this.f1399 = new Matrix();
        this.f1392 = new Matrix();
        this.f1398 = new RectF();
        this.f1379 = new Handler(Looper.getMainLooper());
        this.f1390 = new Runnable() { // from class: l.ۛۚ֫
            @Override // java.lang.Runnable
            public final void run() {
                this.f21026.m1629();
            }
        };
        this.f1391 = -1;
        this.f1395 = -16777216;
        this.f1374 = 1.0f;
        this.f1376 = new OverScroller(activityC15913);
        paint.setTextSize(getResources().getDisplayMetrics().scaledDensity * 16.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        setFocusable(true);
        setClickable(true);
        setImportantForAccessibility(1);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(activityC15913, new C24072(this));
        this.f1387 = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f1370 = new GestureDetector(activityC15913, new C14374(this));
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1643(int i) {
        C12137 c12137 = this.f1380;
        return c12137 != null && c12137.m30343(i) < this.f1384 + ((double) (((float) getHeight()) / this.f1374)) && this.f1380.m30343(i) + this.f1380.m30341(i) > this.f1384;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1641(InterfaceC6917 interfaceC6917) {
        this.f1373 = interfaceC6917;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int mo1650() {
        return this.f1391;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void mo1646(int i) {
        this.f1395 = i;
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo1647() {
        if (!this.f1376.isFinished()) {
            return true;
        }
        ValueAnimator valueAnimator = this.f1394;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean mo1652() {
        return this.f1383;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1642(InterfaceC8408 interfaceC8408, int i) {
        if (interfaceC8408.getCount() <= 0 || i < 0 || i >= interfaceC8408.getCount()) {
            throw new IllegalArgumentException("Invalid gallery position");
        }
        mo1649();
        this.f1386 = interfaceC8408;
        C12137 c12137 = new C12137(interfaceC8408.getCount());
        this.f1380 = c12137;
        c12137.m30339(getWidth(), getResources().getDisplayMetrics().density, getHeight());
        this.f1391 = i;
        this.f1378 = true;
        this.f1384 = this.f1380.m30343(i);
        interfaceC8408.onPageSelected(this.f1391);
        m1635(this.f1391);
        m1629();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C21088 m1611(float f) {
        C12137 c12137 = this.f1380;
        if (c12137 == null || this.f1391 < 0) {
            return null;
        }
        double d = this.f1384 + ((double) (f / this.f1374));
        int iM30337 = c12137.m30337(d);
        return new C21088(iM30337, (d - this.f1380.m30343(iM30337)) / Math.max(1.0d, this.f1380.m30341(iM30337)), f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1618(C21088 c21088) {
        if (this.f1378) {
            this.f1384 = Math.min(0.0d, (this.f1380.m30341(this.f1391) - ((double) (getHeight() / this.f1374))) / 2.0d) + this.f1380.m30343(this.f1391);
        } else if (c21088 != null) {
            int i = c21088.f67369;
            this.f1384 = ((c21088.f67367 * this.f1380.m30341(i)) + this.f1380.m30343(i)) - ((double) (c21088.f67368 / this.f1374));
        }
        m1620();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f1380 == null) {
            return;
        }
        C21088 c21088 = (i3 <= 0 || i4 <= 0) ? new C21088(this.f1391, 0.0d, 0.0f) : m1611(i4 / 2.0f);
        mo1639();
        if (i3 > 0) {
            float f2 = i3;
            f = ((f2 / 2.0f) - this.f1389) / (f2 * this.f1374);
        } else {
            f = 0.5f;
        }
        this.f1380.m30339(i, getResources().getDisplayMetrics().density, i2);
        float f3 = i;
        this.f1389 = (f3 / 2.0f) - ((f * f3) * this.f1374);
        m1618(new C21088(c21088.f67369, c21088.f67367, i4 > 0 ? i2 / 2.0f : 0.0f));
        m1625();
        m1629();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, l.۠ۚ֫] */
    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1644(int i, long j, InterfaceC4854 interfaceC4854) {
        if (interfaceC4854.getWidth() <= 0 || interfaceC4854.getHeight() <= 0 || interfaceC4854.mo2501() < 1 || interfaceC4854.mo2501() > 8) {
            interfaceC4854.close();
            throw new IllegalArgumentException("Invalid gallery renderer geometry");
        }
        C18104 c18104 = (C18104) this.f1375.get(i);
        ?? r2 = this.f1386;
        if (r2 == 0 || c18104 == null || c18104.f59256 != j || r2.getItemId(c18104.f59258) != c18104.f59255) {
            interfaceC4854.close();
            return false;
        }
        C21088 c21088M1611 = m1611(0.0f);
        boolean z = this.f1384 == m1622();
        boolean z2 = this.f1384 == m1608();
        InterfaceC4854 interfaceC4855 = c18104.f59257;
        float[] fArr = c18104.f59254;
        c18104.f59257 = interfaceC4854;
        c18104.f59253 = false;
        this.f1380.m30340(i, C18969.m44063(interfaceC4854.getWidth(), interfaceC4854.getHeight(), interfaceC4854.mo2501()), C18969.m44064(interfaceC4854.getWidth(), interfaceC4854.getHeight(), interfaceC4854.mo2501()));
        C18969.m44062(interfaceC4854.getWidth(), interfaceC4854.getHeight(), interfaceC4854.mo2501(), fArr);
        c18104.f59260.setValues(fArr);
        if (interfaceC4855 != null && interfaceC4855 != interfaceC4854) {
            interfaceC4855.close();
        }
        m1618(c21088M1611);
        if (!this.f1378 && this.f1382 == null) {
            if (z) {
                this.f1384 = m1622();
            } else if (z2) {
                this.f1384 = m1608();
            }
        }
        m1625();
        Handler handler = this.f1379;
        RunnableC6172 runnableC6172 = this.f1390;
        handler.removeCallbacks(runnableC6172);
        handler.post(runnableC6172);
        invalidate();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private void m1635(int i) {
        if (i < 0 || i >= this.f1380.m30336()) {
            return;
        }
        SparseArray sparseArray = this.f1375;
        if (sparseArray.get(i) != null) {
            return;
        }
        long itemId = this.f1386.getItemId(i);
        long j = this.f1385 + 1;
        this.f1385 = j;
        C18104 c18104 = new C18104(itemId, i, j);
        sparseArray.put(i, c18104);
        this.f1386.mo22605(this, i, c18104.f59256);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m1617(C18104 c18104) {
        this.f1386.mo22604(c18104.f59258, c18104.f59256);
        InterfaceC4854 interfaceC4854 = c18104.f59257;
        if (interfaceC4854 != null) {
            interfaceC4854.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public void m1629() {
        SparseArray sparseArray = this.f1375;
        if (this.f1386 == null || getWidth() <= 0 || getHeight() <= 0 || this.f1388) {
            return;
        }
        this.f1388 = true;
        try {
            m1620();
            int iM30337 = this.f1380.m30337(this.f1384);
            int iM30338 = this.f1380.m30337(this.f1384 + ((double) (getHeight() / this.f1374)));
            double dMin = Math.min(this.f1380.m30345() - 0.001d, this.f1384 + ((double) (getHeight() / (this.f1374 * 2.0f))));
            int iM30339 = this.f1380.m30337(dMin);
            if (!this.f1378 && this.f1382 == null && dMin <= this.f1380.m30343(iM30339) + this.f1380.m30341(iM30339) && iM30339 != this.f1391) {
                this.f1391 = iM30339;
                this.f1386.onPageSelected(iM30339);
                InterfaceC6917 interfaceC6917 = this.f1373;
                if (interfaceC6917 != null) {
                    interfaceC6917.mo19203(this.f1391);
                }
            }
            for (int size = sparseArray.size() - 1; size >= 0; size--) {
                C18104 c18104 = (C18104) sparseArray.valueAt(size);
                int i = c18104.f59258;
                if (i < iM30337 - 1 || i > iM30338 + 1) {
                    sparseArray.removeAt(size);
                    m1617(c18104);
                }
            }
            m1635(this.f1391);
            for (int i2 = iM30337; i2 <= iM30338; i2++) {
                m1635(i2);
            }
            m1635(iM30337 - 1);
            m1635(iM30338 + 1);
            this.f1386.mo22603();
            invalidate();
        } finally {
            this.f1388 = false;
        }
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo1651(int i) {
        SparseArray sparseArray = this.f1375;
        C18104 c18104 = (C18104) sparseArray.get(i);
        if (c18104 == null || this.f1386 == null) {
            return false;
        }
        m1617(c18104);
        sparseArray.remove(i);
        m1635(i);
        invalidate();
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l.۠ۚ֫] */
    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1640(int i, int i2, long j) {
        C18104 c18104 = (C18104) this.f1375.get(i);
        ?? r1 = this.f1386;
        if (r1 == 0 || c18104 == null || c18104.f59256 != j || r1.getItemId(c18104.f59258) != c18104.f59255) {
            return;
        }
        c18104.f59253 = true;
        c18104.f59259 = i2;
        if (i == this.f1391) {
            this.f1382 = null;
        }
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0104  */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, l.۠ۚ֫] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, l.۠ۚ֫] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        canvas.drawColor(this.f1395);
        if (this.f1380 == null) {
            return;
        }
        int i = this.f1395 == -1 ? -12303292 : -3355444;
        Paint paint = this.f1372;
        paint.setColor(i);
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f1375;
            if (i2 >= sparseArray.size()) {
                return;
            }
            C18104 c18104 = (C18104) sparseArray.valueAt(i2);
            C12137 c12137 = this.f1380;
            int i3 = c18104.f59258;
            float fM30343 = (float) ((c12137.m30343(i3) - this.f1384) * ((double) this.f1374));
            float fM30341 = ((float) (this.f1380.m30341(i3) * ((double) this.f1374))) + fM30343;
            boolean z = fM30343 < ((float) getHeight()) && fM30341 > 0.0f;
            if (c18104.f59257 == null) {
                if (z && !this.f1386.mo22606(i3)) {
                    canvas.drawText(getResources().getString(c18104.f59253 ? c18104.f59259 : R.string.MT_Protector), getWidth() / 2.0f, (Math.min(getHeight(), fM30341) + Math.max(0.0f, fM30343)) / 2.0f, paint);
                }
                f2 = 2.0f;
                paint = paint;
            } else {
                float fM30344 = ((float) this.f1380.m30344(i3)) * this.f1374;
                float width = (((getWidth() * this.f1374) - (this.f1380.m30342(i3) * fM30344)) / 2.0f) + this.f1389;
                float fM30346 = (((float) this.f1380.m30346(i3)) * this.f1374) + fM30343;
                Matrix matrix = this.f1399;
                matrix.setTranslate(width, fM30346);
                matrix.preScale(fM30344, fM30344);
                matrix.preConcat(c18104.f59260);
                RectF rectF = this.f1398;
                rectF.setEmpty();
                if (z) {
                    Matrix matrix2 = this.f1392;
                    if (matrix.invert(matrix2)) {
                        f = 0.0f;
                        rectF.set(0.0f, Math.max(0.0f, fM30343), getWidth(), Math.min(getHeight(), fM30341));
                        matrix2.mapRect(rectF);
                    } else {
                        f = 0.0f;
                    }
                } else {
                    f = 0.0f;
                }
                c18104.f59257.mo2503(rectF, fM30344, z);
                if (z) {
                    int iSave = canvas.save();
                    canvas.clipRect(f, Math.max(f, fM30343), getWidth(), Math.min(getHeight(), fM30341));
                    canvas.concat(matrix);
                    c18104.f59257.mo2502(canvas, this.f1396);
                    canvas.restoreToCount(iSave);
                }
                f2 = 2.0f;
            }
            if (z && this.f1386.mo22606(i3) && this.f1393 <= 1) {
                int iSave2 = canvas.save();
                canvas.clipRect(0.0f, Math.max(0.0f, fM30343), getWidth(), Math.min(getHeight(), fM30341));
                this.f1397.m16581(canvas, getWidth() / f2, (Math.min(getHeight(), fM30341) + Math.max(0.0f, fM30343)) / f2);
                canvas.restoreToCount(iSave2);
            }
            i2++;
            paint = paint;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public double m1622() {
        C12137 c12137 = this.f1380;
        if (c12137 == null) {
            return 0.0d;
        }
        return Math.min(0.0d, (c12137.m30341(0) - ((double) (getHeight() / this.f1374))) / 2.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public double m1608() {
        if (this.f1380 == null) {
            return 0.0d;
        }
        double height = getHeight() / this.f1374;
        double dM1622 = m1622();
        double dM30345 = this.f1380.m30345() - height;
        C12137 c12137 = this.f1380;
        return Math.max(dM1622, Math.max(0.0d, (height - c12137.m30341(c12137.m30336() - 1)) / 2.0d) + dM30345);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m1620() {
        this.f1384 = Math.max(m1622(), Math.min(m1608(), this.f1384));
        this.f1389 = Math.max((1.0f - this.f1374) * getWidth(), Math.min(0.0f, this.f1389));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void m1612(float f, float f2) {
        this.f1378 = false;
        this.f1382 = null;
        this.f1384 -= (double) (f2 / this.f1374);
        this.f1389 += f;
        m1629();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1615(C0205 c0205, float f, float f2, float f3) {
        if (c0205.f1380 == null) {
            return;
        }
        c0205.f1378 = false;
        c0205.f1382 = null;
        float fMax = Math.max(1.0f, Math.min(5.0f, f));
        double d = c0205.f1384;
        float f4 = c0205.f1374;
        c0205.f1389 = f2 - (((f2 - c0205.f1389) * fMax) / f4);
        c0205.f1374 = fMax;
        c0205.f1384 = (d + ((double) (f3 / f4))) - ((double) (f3 / fMax));
        c0205.m1629();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int pointerCount;
        if (this.f1386 == null) {
            return false;
        }
        boolean z = this.f1393 > 1;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            pointerCount = 0;
        } else {
            pointerCount = motionEvent.getPointerCount() - (actionMasked == 6 ? 1 : 0);
        }
        this.f1393 = pointerCount;
        if (actionMasked == 0) {
            m1638();
            this.f1383 = true;
            this.f1377 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f1377 = true;
            m1638();
        }
        this.f1387.onTouchEvent(motionEvent);
        this.f1370.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1383 = false;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (actionMasked == 3) {
                m1638();
            }
            invalidate();
        }
        if (z != (this.f1393 > 1)) {
            invalidate();
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.۠ۚ֫] */
    @Override // android.view.View
    public final boolean performClick() {
        int i;
        super.performClick();
        if (this.f1373 == null) {
            return true;
        }
        ?? r0 = this.f1386;
        if (r0 == 0 || (i = this.f1391) < 0 || !r0.mo22606(i)) {
            this.f1373.mo19201();
            return true;
        }
        this.f1373.mo19204(this.f1391);
        return true;
    }

    @Override // android.view.View
    public final void computeScroll() {
        OverScroller overScroller = this.f1376;
        if (overScroller.computeScrollOffset()) {
            m1612(overScroller.getCurrX() - this.f1381, this.f1371 - overScroller.getCurrY());
            this.f1381 = overScroller.getCurrX();
            this.f1371 = overScroller.getCurrY();
            postInvalidateOnAnimation();
        }
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    private void m1638() {
        this.f1376.forceFinished(true);
        ValueAnimator valueAnimator = this.f1394;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1394 = null;
        }
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo1639() {
        m1638();
        this.f1383 = false;
        this.f1393 = 0;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        this.f1370.onTouchEvent(motionEventObtain);
        this.f1387.onTouchEvent(motionEventObtain);
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
        mo1639();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        mo1639();
        this.f1379.removeCallbacks(this.f1390);
        super.onDetachedFromWindow();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void mo1649() {
        mo1639();
        this.f1379.removeCallbacks(this.f1390);
        Object obj = this.f1386;
        SparseArray sparseArray = this.f1375;
        if (obj != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                m1617((C18104) sparseArray.valueAt(i));
            }
        }
        sparseArray.clear();
        this.f1386 = null;
        this.f1380 = null;
        this.f1391 = -1;
        this.f1378 = false;
        this.f1382 = null;
        this.f1384 = 0.0d;
        this.f1374 = 1.0f;
        this.f1389 = 0.0f;
        invalidate();
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final Bundle mo1648() {
        InterfaceC4854 interfaceC4854;
        if (this.f1382 != null) {
            return new Bundle(this.f1382);
        }
        if (this.f1380 == null || this.f1391 < 0 || getWidth() == 0 || !this.f1380.m30347(this.f1391)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("continuous", true);
        double dMax = Math.max(this.f1380.m30343(this.f1391), Math.min(this.f1380.m30343(this.f1391) + this.f1380.m30341(this.f1391), this.f1384 + ((double) (getHeight() / (this.f1374 * 2.0f)))));
        bundle.putDouble("fraction", (dMax - this.f1380.m30343(this.f1391)) / this.f1380.m30341(this.f1391));
        bundle.putFloat("screenY", (float) (((dMax - this.f1384) * ((double) this.f1374)) / ((double) getHeight())));
        C18104 c18104 = (C18104) this.f1375.get(this.f1391);
        bundle.putInt("orientation", (c18104 == null || (interfaceC4854 = c18104.f59257) == null) ? 0 : interfaceC4854.mo2501());
        bundle.putFloat("zoom", this.f1374);
        bundle.putFloat("centerX", ((getWidth() / 2.0f) - this.f1389) / (getWidth() * this.f1374));
        bundle.putInt("width", this.f1380.m30342(this.f1391));
        bundle.putInt("height", this.f1380.m30338(this.f1391));
        return bundle;
    }

    @Override // l.AbstractC13628
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo1645(Bundle bundle) {
        this.f1382 = null;
        if (bundle == null || this.f1386 == null || !bundle.getBoolean("continuous")) {
            return false;
        }
        double d = bundle.getDouble("fraction", Double.NaN);
        float f = bundle.getFloat("zoom", Float.NaN);
        float f2 = bundle.getFloat("centerX", Float.NaN);
        float f3 = bundle.getFloat("screenY", Float.NaN);
        if (d < 0.0d || d > 1.0d || f < 1.0f || f > 5.0f || f2 < 0.0f || f2 > 1.0f || f3 < 0.0f || f3 > 1.0f) {
            return false;
        }
        this.f1382 = new Bundle(bundle);
        m1625();
        return true;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private void m1625() {
        if (this.f1382 == null || this.f1380 == null || getWidth() <= 0 || getHeight() <= 0 || !this.f1380.m30347(this.f1391)) {
            return;
        }
        Bundle bundle = this.f1382;
        C18104 c18104 = (C18104) this.f1375.get(this.f1391);
        if (bundle.getInt("width") != this.f1380.m30342(this.f1391) || bundle.getInt("height") != this.f1380.m30338(this.f1391) || c18104 == null || c18104.f59257 == null || bundle.getInt("orientation") != c18104.f59257.mo2501()) {
            this.f1382 = null;
            return;
        }
        this.f1378 = false;
        this.f1374 = bundle.getFloat("zoom");
        this.f1389 = (getWidth() / 2.0f) - ((bundle.getFloat("centerX") * getWidth()) * this.f1374);
        m1618(new C21088(this.f1391, bundle.getDouble("fraction"), bundle.getFloat("screenY") * getHeight()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l.۠ۚ֫] */
    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setScrollable(true);
        ?? r0 = this.f1386;
        if (r0 != 0 && (i = this.f1391) >= 0 && r0.mo22606(i)) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, getResources().getString(R.string.MT_Protector)));
        }
        if (this.f1384 > m1622()) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (this.f1384 < m1608()) {
            accessibilityNodeInfo.addAction(4096);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i == 4096 || i == 8192) {
            m1638();
            m1612(0.0f, getHeight() * 0.8f * (i == 4096 ? -1 : 1));
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
