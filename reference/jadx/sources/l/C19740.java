package l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ᩴۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: H14L */
/* JADX INFO: loaded from: classes5.dex */
public final class C19740 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C8730 f63539 = new C8730();

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final ArrayList f63540;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public float f63541;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f63542;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f63543;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f63544;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public float f63545;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f63546;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Matrix f63547;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C5570 f63548;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final HashSet f63549;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f63550;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f63551;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public float f63552;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f63553;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f63554;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public RectF f63555;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f63556;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final List f63557;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f63558;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public float f63559;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public int f63560;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45497(C21978 c21978) {
        if (c21978.f70920.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int iM45504 = m45504();
        int i = m45498().f70921;
        int i2 = c21978.f70921;
        if (iM45504 > i2 || i2 > i) {
            int i3 = this.f63546;
            ArrayList arrayList = this.f63540;
            List list = this.f63557;
            if (i3 == -1) {
                list.add(0, new C21978(-1, ""));
                arrayList.add(0, null);
                this.f63546 = 0;
            }
            C10789 c10789 = new C10789();
            list.add(this.f63546, c21978);
            arrayList.add(this.f63546, c10789);
            C11974 c11974M39679 = C14035.f44476.m39679(C17941.f58779);
            int length = c21978.f70920.length();
            if (length != 0) {
                c10789.f34249.add(new C22724(length, c11974M39679));
            }
            this.f63546++;
        }
    }

    public C19740(C5570 c5570, int i, ArrayList arrayList) {
        this.f63546 = -1;
        this.f63555 = new RectF();
        this.f63543 = C3296.m10878();
        this.f63556 = 0;
        this.f63547 = new Matrix();
        this.f63548 = c5570;
        this.f63550 = i;
        this.f63557 = arrayList;
        this.f63549 = new HashSet();
        if (arrayList.size() > 210) {
            int size = arrayList.size() / 2;
            arrayList.set(size - 100, new C21978(-1, "......"));
            arrayList.subList(size - 99, size + 100).clear();
        }
        int size2 = arrayList.size();
        boolean z = true;
        int i2 = 0;
        while (true) {
            String strSubstring = null;
            if (i2 >= size2) {
                break;
            }
            C21978 c21978 = (C21978) arrayList.get(i2);
            if (!c21978.f70920.isEmpty()) {
                if (c21978.f70920.startsWith(".sparse-switch") || c21978.f70920.startsWith(".packed-switch")) {
                    z = false;
                } else if (z) {
                    if (c21978.f70920.length() > 100) {
                        c21978.f70920 = C18969.m44060(100, c21978.f70920);
                    }
                    if (c21978.f70920.startsWith(":")) {
                        int iIndexOf = c21978.f70920.indexOf(32);
                        strSubstring = iIndexOf == -1 ? c21978.f70920 : c21978.f70920.substring(0, iIndexOf);
                    }
                    if (strSubstring != null) {
                        this.f63549.add(strSubstring);
                    }
                }
            }
            i2++;
        }
        this.f63540 = new ArrayList(arrayList.size());
        C21407 c21407 = new C21407();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C21978 c21979 = (C21978) it.next();
            if (c21979.f70920.isEmpty()) {
                this.f63540.add(null);
            } else {
                C10789 c10789 = new C10789();
                this.f63540.add(c10789);
                try {
                    c21407.m48710(C14035.f44477.m47279(c21979.f70920, f63539).m38515());
                    while (c21407.m48714()) {
                        C11974 c11974M48712 = c21407.m48712();
                        int iM48715 = c21407.m48715();
                        int iM48709 = c21407.m48709();
                        if (iM48715 != iM48709) {
                            c10789.f34249.add(new C22724(iM48709, c11974M48712));
                        }
                    }
                } catch (C5767 unused) {
                    C11974 c11974M39685 = C14035.f44476.m39685();
                    int length = c21979.f70920.length();
                    if (length != 0) {
                        c10789.f34249.add(new C22724(length, c11974M39685));
                    }
                }
                c10789.f34249.trimToSize();
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m45504() {
        return ((C21978) this.f63557.get(this.f63546 + 1)).f70921;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45495(Paint paint) {
        float fontSpacing = paint.getFontSpacing();
        List list = this.f63557;
        if (list.isEmpty()) {
            this.f63552 = 4.0f * fontSpacing;
            this.f63553 = (fontSpacing * 3.0f) + paint.measureText("EXIT");
            float fMeasureText = paint.measureText("0") * 0.6f;
            this.f63541 = fMeasureText;
            this.f63558 = fMeasureText;
            this.f63551 = true;
            return;
        }
        this.f63552 = list.size() * fontSpacing;
        float fMeasureText2 = paint.measureText("0");
        float length = (String.valueOf(((C21978) C7750.m21093(1, list)).f70921).length() + 1) * fMeasureText2;
        this.f63558 = 0.7f * fMeasureText2;
        this.f63541 = fMeasureText2 * 0.5f;
        if (this.f63551) {
            this.f63553 = m45490(this.f63560, paint);
        } else {
            this.f63560 = 0;
            int size = list.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                float fM45490 = m45490(i, paint);
                if (fM45490 > f) {
                    this.f63560 = i;
                    f = fM45490;
                }
            }
            this.f63553 = f;
            this.f63551 = true;
        }
        this.f63552 = (this.f63541 * 2.0f) + this.f63552;
        this.f63553 = (this.f63558 * 2.0f) + length + this.f63553;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m45490(int i, Paint paint) {
        C21978 c21978 = (C21978) this.f63557.get(i);
        C10789 c10789 = (C10789) this.f63540.get(i);
        float f = 0.0f;
        if (!c21978.f70920.isEmpty() && c10789 != null) {
            int i2 = 0;
            for (C22724 c22724 : c10789.f34249) {
                float fMeasureText = paint.measureText(c21978.f70920, i2, c22724.f73761);
                c22724.f73760 = fMeasureText;
                f += fMeasureText;
                i2 = c22724.f73761;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float m45499() {
        if (!this.f63551) {
            throw new IllegalStateException("Need measure");
        }
        return this.f63553;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float m45503() {
        if (!this.f63551) {
            throw new IllegalStateException("Need measure");
        }
        return this.f63552;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45493(float f, float f2, float f3, float f4) {
        this.f63559 = f;
        this.f63542 = f2;
        this.f63545 = f3;
        this.f63554 = f4;
        this.f63544 = true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final float m45501() {
        if (!this.f63544) {
            throw new IllegalStateException("Need layout");
        }
        return this.f63559;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float m45500() {
        if (!this.f63544) {
            throw new IllegalStateException("Need layout");
        }
        return this.f63542;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float m45502() {
        if (!this.f63544) {
            throw new IllegalStateException("Need layout");
        }
        return this.f63545;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m45492() {
        if (!this.f63544) {
            throw new IllegalStateException("Need layout");
        }
        return this.f63554;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0422  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45494(Canvas canvas, C10232 c10232, C10232 c10233, RectF rectF, float f) {
        boolean z;
        int iSave;
        float f2;
        float f3;
        float f4;
        float f5;
        List list;
        C5570 c5570;
        int i;
        int iSave2;
        ArrayList arrayList;
        boolean z2;
        int i2;
        C21978 c21978;
        C21978 c21979;
        C5570 c5571;
        C5570 c5572;
        C19740 c19740;
        C21978 c219710;
        int i3;
        C21978 c219711;
        int i4;
        Canvas canvas2 = canvas;
        float f6 = this.f63559;
        float f7 = this.f63542;
        if (rectF.intersects(f6, f7, this.f63545 + f6, this.f63554 + f7)) {
            List list2 = this.f63557;
            boolean zIsEmpty = list2.isEmpty();
            float fontSpacing = c10232.getFontSpacing();
            float f8 = -c10232.getFontMetrics().ascent;
            float fM45492 = zIsEmpty ? m45492() / 4.0f : (m45492() - (this.f63541 * 2.0f)) / list2.size();
            float f9 = (f8 / fontSpacing) * fM45492;
            float fM45501 = m45501();
            float fM45500 = m45500();
            float f10 = fM45501 * f;
            float f11 = fM45500 * f;
            float f12 = this.f63545 * f;
            float f13 = this.f63554 * f;
            float f14 = ((this.f63558 + this.f63541) / 4.0f) * f;
            float fMeasureText = c10232.measureText("0");
            float length = zIsEmpty ? 0.0f : (String.valueOf(((C21978) C7750.m21093(1, list2)).f70921).length() + 1) * fMeasureText;
            float f15 = length * f;
            float f16 = f12 + f10;
            RectF rectF2 = this.f63555;
            rectF2.set(f10, f11, f16, f13 + f11);
            C5570 c5573 = this.f63548;
            int i5 = c5573.f19353;
            List list3 = list2;
            Paint.Style style = Paint.Style.FILL;
            c10232.setStyle(style);
            C5570 c5574 = c5573;
            if (i5 == this.f63550) {
                float f17 = C14035.f44475;
                c10232.setColor(C3296.m10871(-13421779, -1309));
            } else {
                float f18 = C14035.f44475;
                c10232.setColor(zIsEmpty ? C3296.m10871(-13948117, -328966) : C3296.m10871(-13948117, -1));
            }
            canvas2.drawRoundRect(rectF2, f14, f14, c10232);
            if (!zIsEmpty) {
                rectF2.right = rectF2.left + f14 + f14;
                c10232.setColor(C3296.m10871(-13223878, -986896));
                canvas2.drawRoundRect(rectF2, f14, f14, c10232);
                rectF2.left = rectF2.right - f14;
                rectF2.right = f15 + f10;
                canvas2.drawRect(rectF2, c10232);
                c10232.setStyle(Paint.Style.STROKE);
                c10232.setColor(C3296.m10871(-11184811, -3092272));
                c10232.setStrokeWidth(1.0f * f);
                float f19 = rectF2.right;
                canvas.drawLine(f19, rectF2.top, f19, rectF2.bottom, c10232);
            }
            rectF2.left = f10;
            rectF2.right = f16;
            c10232.setStyle(Paint.Style.STROKE);
            c10232.setColor(C3296.m10871(-11513776, -4144960));
            c10232.setStrokeWidth(C14035.f44475 * 1.5f * f);
            canvas2.drawRoundRect(rectF2, f14, f14, c10232);
            if (zIsEmpty) {
                c10232.setTextAlign(Paint.Align.CENTER);
                c10232.setStyle(style);
                c10232.setColor(C3296.m10871(-7829368, -16777216));
                iSave = canvas.save();
                canvas2.scale(f, f);
                canvas.drawText("EXIT", 0, 4, (this.f63545 / 2.0f) + fM45501, (fM45492 * 1.5f) + fM45500 + f9, (Paint) c10232);
                canvas2.restoreToCount(iSave);
                c10232.setTextAlign(Paint.Align.LEFT);
                z = false;
            } else {
                C19740 c19741 = this;
                float f20 = c19741.f63541;
                float f21 = fM45500 + f20;
                float f22 = f20 + f9 + fM45500;
                float f23 = fM45501 + c19741.f63558 + length;
                float f24 = (fM45501 + length) - fMeasureText;
                boolean z3 = f <= 0.15f;
                c10232.setStyle(style);
                int size = list3.size();
                int i6 = 0;
                float f25 = f21;
                Canvas canvas3 = canvas2;
                int i7 = 0;
                float f26 = f22;
                z = false;
                while (i7 < size) {
                    if (i7 > 0) {
                        f26 += fM45492;
                        f25 += fM45492;
                    }
                    float f27 = f26;
                    float f28 = f25;
                    RectF rectF3 = rectF;
                    int i8 = size;
                    int i9 = i6;
                    if (rectF3.intersects(rectF3.left, f28, rectF3.right, f28 + fM45492)) {
                        if (f24 < rectF3.left || fM45501 > rectF3.right) {
                            list = list3;
                        } else {
                            list = list3;
                            int i10 = ((C21978) list.get(i7)).f70921;
                            if (i10 != -1) {
                                String strValueOf = String.valueOf(i10);
                                if (z) {
                                    iSave2 = i9;
                                } else {
                                    iSave2 = canvas3.save();
                                    canvas3.scale(f, f);
                                    z = true;
                                }
                                float f29 = f24;
                                for (int length2 = strValueOf.length() - 1; length2 >= 0; length2--) {
                                    canvas3.drawText(strValueOf, length2, length2 + 1, f29, f27, (Paint) c10233);
                                    f29 -= fMeasureText;
                                }
                            }
                            arrayList = c19741.f63540;
                            if (z3) {
                                f2 = f28;
                                c21979 = (C21978) list.get(i7);
                                C10789 c10789 = (C10789) arrayList.get(i7);
                                i2 = iSave2;
                                if (!c21979.f70920.isEmpty() || c10789 == null) {
                                    z2 = z;
                                    f3 = f24;
                                    f4 = fM45492;
                                    f5 = f23;
                                    c5570 = c5574;
                                    i = i7;
                                    list = list;
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    int i11 = i7;
                                    if (c19741.f63543 != C3296.m10878()) {
                                        c19741.f63543 = C3296.m10878();
                                        c5571 = c5574;
                                        c5571.f19351 -= (long) c19741.f63556;
                                        m45491();
                                    } else {
                                        c5571 = c5574;
                                    }
                                    float f30 = f27 - f9;
                                    Iterator it = c10789.f34249.iterator();
                                    C10232 c10234 = c10232;
                                    float f31 = f23;
                                    int iSave3 = i2;
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        C22724 c22724 = (C22724) it.next();
                                        float f32 = c22724.f73760;
                                        Iterator it2 = it;
                                        C11974 c11974 = c22724.f73762;
                                        float f33 = f24;
                                        int i13 = c22724.f73761;
                                        float f34 = f31 + f32;
                                        float f35 = f23;
                                        if (f34 < rectF3.left || f31 > rectF3.right) {
                                            i13 = i13;
                                            c5572 = c5571;
                                            c19740 = c19741;
                                            rectF = rectF3;
                                            c219710 = c21979;
                                            int i14 = i11;
                                            fM45492 = fM45492;
                                            i3 = i14;
                                            iSave3 = iSave3;
                                        } else {
                                            int i15 = i13 - i12;
                                            if (10 >= i15 || i15 >= 100) {
                                                c219710 = c21979;
                                                int iSave4 = iSave3;
                                                i13 = i13;
                                                c5572 = c5571;
                                                c19740 = c19741;
                                                rectF = rectF;
                                                int i16 = i11;
                                                fM45492 = fM45492;
                                                i3 = i16;
                                                c10234.setColor(c11974.m30045());
                                                if (!z) {
                                                    iSave4 = canvas3.save();
                                                    canvas3.scale(f, f);
                                                    z = true;
                                                }
                                                iSave3 = iSave4;
                                                canvas3.drawText(c219710.f70920, i12, c22724.f73761, f31, f30 + f9, (Paint) c10234);
                                            } else {
                                                Bitmap bitmap = c22724.f73759;
                                                if (bitmap == null) {
                                                    i4 = iSave3;
                                                    if (c5571.f19351 >= 5242880) {
                                                        c10234.setColor(c11974.m30045());
                                                        if (z) {
                                                            iSave3 = i4;
                                                        } else {
                                                            iSave3 = canvas3.save();
                                                            canvas3.scale(f, f);
                                                            z = true;
                                                        }
                                                        canvas3.drawText(c21979.f70920, i12, c22724.f73761, f31, f30 + f9, (Paint) c10234);
                                                        canvas3 = canvas;
                                                        rectF = rectF;
                                                        c219710 = c21979;
                                                        i13 = i13;
                                                        c5572 = c5571;
                                                        c19740 = this;
                                                        int i17 = i11;
                                                        fM45492 = fM45492;
                                                        i3 = i17;
                                                    } else {
                                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, (int) ((f32 * 0.1f) + 0.5f)), Math.max(1, (int) ((fM45492 * 0.1f) + 0.5f)), Bitmap.Config.ARGB_4444);
                                                        c22724.f73759 = bitmapCreateBitmap;
                                                        Canvas canvas4 = new Canvas(bitmapCreateBitmap);
                                                        canvas4.scale(0.1f, 0.1f);
                                                        c10234.setColor(c11974.m30045());
                                                        c219711 = c21979;
                                                        c5572 = c5571;
                                                        i3 = i11;
                                                        canvas4.drawText(c21979.f70920, i12, c22724.f73761, 0.0f, f9, (Paint) c10232);
                                                        int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth() * 2;
                                                        c19740 = this;
                                                        c19740.f63556 += height;
                                                        c5572.f19351 += (long) height;
                                                        canvas3 = canvas;
                                                        c10234 = c10232;
                                                        bitmap = bitmapCreateBitmap;
                                                    }
                                                } else {
                                                    c219711 = c21979;
                                                    i4 = iSave3;
                                                    c5572 = c5571;
                                                    c19740 = c19741;
                                                    i3 = i11;
                                                }
                                                Matrix matrix = c19740.f63547;
                                                matrix.reset();
                                                float f36 = 10.0f * f;
                                                matrix.setScale(f36, f36);
                                                matrix.postTranslate(f31 * f, f30 * f);
                                                int i18 = i4;
                                                if (z) {
                                                    canvas3.restoreToCount(i18);
                                                    z = false;
                                                }
                                                canvas3.drawBitmap(bitmap, matrix, c10234);
                                                iSave3 = i18;
                                                c219710 = c219711;
                                            }
                                        }
                                        c21979 = c219710;
                                        rectF3 = rectF;
                                        f31 = f34;
                                        it = it2;
                                        f23 = f35;
                                        i12 = i13;
                                        c19741 = c19740;
                                        c5571 = c5572;
                                        f24 = f33;
                                        float f37 = fM45492;
                                        i11 = i3;
                                        fM45492 = f37;
                                    }
                                    i6 = iSave3;
                                    f3 = f24;
                                    f5 = f23;
                                    c5570 = c5571;
                                    int i19 = i11;
                                    f4 = fM45492;
                                    i = i19;
                                    z = z;
                                    list = list;
                                }
                            } else {
                                z2 = z;
                                i2 = iSave2;
                                f2 = f28;
                                f3 = f24;
                                f4 = fM45492;
                                f5 = f23;
                                c5570 = c5574;
                                i = i7;
                                c21978 = (C21978) list.get(i);
                                C10789 c107810 = (C10789) arrayList.get(i);
                                if (!c21978.f70920.isEmpty() || c107810 == null) {
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    if (!z2) {
                                        int iSave5 = canvas3.save();
                                        canvas3.scale(f, f);
                                        i2 = iSave5;
                                        z2 = true;
                                    }
                                    float f38 = f5;
                                    int i20 = 0;
                                    for (C22724 c22725 : c107810.f34249) {
                                        float f39 = f38 + c22725.f73760;
                                        if (f39 >= rectF3.left && f38 <= rectF3.right) {
                                            c10232.setColor(c22725.f73762.m30045());
                                            canvas3.drawText(c21978.f70920, i20, c22725.f73761, f38, f27, (Paint) c10232);
                                        }
                                        i20 = c22725.f73761;
                                        f38 = f39;
                                        canvas3 = canvas3;
                                    }
                                    i6 = i2;
                                    z = z2;
                                }
                            }
                        }
                        iSave2 = i9;
                        arrayList = c19741.f63540;
                        if (z3) {
                            f2 = f28;
                            c21979 = (C21978) list.get(i7);
                            C10789 c107811 = (C10789) arrayList.get(i7);
                            i2 = iSave2;
                            if (c21979.f70920.isEmpty()) {
                            }
                            z2 = z;
                            f3 = f24;
                            f4 = fM45492;
                            f5 = f23;
                            c5570 = c5574;
                            i = i7;
                            list = list;
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        } else {
                            z2 = z;
                            i2 = iSave2;
                            f2 = f28;
                            f3 = f24;
                            f4 = fM45492;
                            f5 = f23;
                            c5570 = c5574;
                            i = i7;
                            c21978 = (C21978) list.get(i);
                            C10789 c107812 = (C10789) arrayList.get(i);
                            if (c21978.f70920.isEmpty()) {
                            }
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        }
                    } else {
                        f2 = f28;
                        f3 = f24;
                        f4 = fM45492;
                        f5 = f23;
                        list = list3;
                        c5570 = c5574;
                        i = i7;
                        i6 = i9;
                    }
                    i7 = i + 1;
                    c19741 = this;
                    list3 = list;
                    c5574 = c5570;
                    f26 = f27;
                    size = i8;
                    f25 = f2;
                    fM45492 = f4;
                    f24 = f3;
                    f23 = f5;
                }
                iSave = i6;
                canvas2 = canvas3;
            }
            if (z) {
                canvas2.restoreToCount(iSave);
            }
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m45491() {
        for (C10789 c10789 : this.f63540) {
            if (c10789 != null) {
                for (C22724 c22724 : c10789.f34249) {
                    Bitmap bitmap = c22724.f73759;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c22724.f73759 = null;
                    }
                }
            }
        }
        this.f63556 = 0;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21978 m45498() {
        return (C21978) C7750.m21093(1, this.f63557);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C19740.class == obj.getClass() && this.f63550 == ((C19740) obj).f63550;
    }

    public final int hashCode() {
        return this.f63550;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45496(C6178 c6178) {
        c6178.writeInt(this.f63550);
        List<C21978> list = this.f63557;
        c6178.writeInt(list.size());
        for (C21978 c21978 : list) {
            c6178.writeInt(c21978.f70921);
            c6178.m17800(c21978.f70920);
        }
        HashSet hashSet = this.f63549;
        c6178.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c6178.m17800((String) it.next());
        }
        C17195 c17195 = new C17195();
        ArrayList<C10789> arrayList = this.f63540;
        for (C10789 c10789 : arrayList) {
            if (c10789 != null) {
                Iterator it2 = c10789.f34249.iterator();
                while (it2.hasNext()) {
                    c17195.m40362(((C22724) it2.next()).f73762);
                }
            }
        }
        c17195.m40360(c6178);
        c6178.writeInt(arrayList.size());
        for (C10789 c107810 : arrayList) {
            if (c107810 == null) {
                c6178.writeInt(-1);
            } else {
                ArrayList<C22724> arrayList2 = c107810.f34249;
                c6178.writeInt(arrayList2.size());
                for (C22724 c22724 : arrayList2) {
                    c6178.writeByte(c17195.m40358(c22724.f73762));
                    c6178.writeInt(c22724.f73761);
                    c6178.m17781(c22724.f73760);
                }
            }
        }
        c6178.writeByte(this.f63551 ? (byte) 1 : (byte) 0);
        c6178.writeInt(this.f63560);
        c6178.m17781(this.f63558);
        c6178.m17781(this.f63541);
        c6178.m17781(this.f63553);
        c6178.m17781(this.f63552);
        c6178.writeByte(this.f63544 ? (byte) 1 : (byte) 0);
        c6178.m17781(this.f63559);
        c6178.m17781(this.f63542);
        c6178.m17781(this.f63545);
        c6178.m17781(this.f63554);
        c6178.writeInt(this.f63546);
    }

    public C19740(C5570 c5570, C20348 c20348) {
        this.f63546 = -1;
        this.f63555 = new RectF();
        this.f63543 = C3296.m10878();
        this.f63556 = 0;
        this.f63547 = new Matrix();
        this.f63548 = c5570;
        this.f63550 = c20348.readInt();
        int i = c20348.readInt();
        this.f63557 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f63557.add(new C21978(c20348.readInt(), c20348.m46758()));
        }
        int i3 = c20348.readInt();
        this.f63549 = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f63549.add(c20348.m46758());
        }
        C17195 c17195 = new C17195();
        c17195.m40361(c20348);
        int i5 = c20348.readInt();
        this.f63540 = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = c20348.readInt();
            if (i7 == -1) {
                this.f63540.add(null);
            } else {
                C10789 c10789 = new C10789();
                c10789.f34249.ensureCapacity(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    C22724 c22724 = new C22724(c20348.readInt(), c17195.m40359(c20348.readByte() & 255));
                    c22724.f73760 = c20348.m46747();
                    c10789.f34249.add(c22724);
                }
                this.f63540.add(c10789);
            }
        }
        this.f63551 = c20348.readByte() != 0;
        this.f63560 = c20348.readInt();
        this.f63558 = c20348.m46747();
        this.f63541 = c20348.m46747();
        this.f63553 = c20348.m46747();
        this.f63552 = c20348.m46747();
        this.f63544 = c20348.readByte() != 0;
        this.f63559 = c20348.m46747();
        this.f63542 = c20348.m46747();
        this.f63545 = c20348.m46747();
        this.f63554 = c20348.m46747();
        this.f63546 = c20348.readInt();
    }
}
