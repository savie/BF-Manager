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

/* JADX INFO: renamed from: l.ۗܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: H14L */
/* JADX INFO: loaded from: classes2.dex */
public final class C3353 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C14681 f12403 = new C14681();

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final HashSet f12404;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final List f12405;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12406;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f12407;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f12408;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final Matrix f12409;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public float f12410;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f12411;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final C11697 f12412;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public float f12413;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f12414;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public boolean f12415;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f12416;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f12417;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public boolean f12418;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f12419;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public RectF f12420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f12421;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f12422;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12423;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f12424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10003(C14644 c14644) {
        if (c14644.f47887.isEmpty()) {
            throw new IllegalArgumentException();
        }
        int iM9996 = m9996();
        int i = m10006().f47888;
        int i2 = c14644.f47888;
        if (iM9996 > i2 || i2 > i) {
            int i3 = this.f12414;
            ArrayList arrayList = this.f12406;
            List list = this.f12405;
            if (i3 == -1) {
                list.add(0, new C14644(-1, ""));
                arrayList.add(0, null);
                this.f12414 = 0;
            }
            C1942 c1942 = new C1942();
            list.add(this.f12414, c14644);
            arrayList.add(this.f12414, c1942);
            C15682 c15682M46955 = C11116.f37737.m46955(C16387.f52730);
            int length = c14644.f47887.length();
            if (length != 0) {
                c1942.f7326.add(new C9705(length, c15682M46955));
            }
            this.f12414++;
        }
    }

    public C3353(C11697 c11697, int i, ArrayList arrayList) {
        this.f12414 = -1;
        this.f12420 = new RectF();
        this.f12407 = C20368.m45991();
        this.f12416 = 0;
        this.f12409 = new Matrix();
        this.f12412 = c11697;
        this.f12423 = i;
        this.f12405 = arrayList;
        this.f12404 = new HashSet();
        if (arrayList.size() > 210) {
            int size = arrayList.size() / 2;
            arrayList.set(size - 100, new C14644(-1, "......"));
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
            C14644 c14644 = (C14644) arrayList.get(i2);
            if (!c14644.f47887.isEmpty()) {
                if (c14644.f47887.startsWith(".sparse-switch") || c14644.f47887.startsWith(".packed-switch")) {
                    z = false;
                } else if (z) {
                    if (c14644.f47887.length() > 100) {
                        c14644.f47887 = C13012.m32189(100, c14644.f47887);
                    }
                    if (c14644.f47887.startsWith(":")) {
                        int iIndexOf = c14644.f47887.indexOf(32);
                        strSubstring = iIndexOf == -1 ? c14644.f47887 : c14644.f47887.substring(0, iIndexOf);
                    }
                    if (strSubstring != null) {
                        this.f12404.add(strSubstring);
                    }
                }
            }
            i2++;
        }
        this.f12406 = new ArrayList(arrayList.size());
        C2793 c2793 = new C2793();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C14644 c14645 = (C14644) it.next();
            if (c14645.f47887.isEmpty()) {
                this.f12406.add(null);
            } else {
                C1942 c1942 = new C1942();
                this.f12406.add(c1942);
                try {
                    c2793.m8488(C11116.f37736.m6201(c14645.f47887, f12403).m30436());
                    while (c2793.m8490()) {
                        C15682 c15682M8491 = c2793.m8491();
                        int iM8492 = c2793.m8492();
                        int iM8487 = c2793.m8487();
                        if (iM8492 != iM8487) {
                            c1942.f7326.add(new C9705(iM8487, c15682M8491));
                        }
                    }
                } catch (C7297 unused) {
                    C15682 c15682M46969 = C11116.f37737.m46969();
                    int length = c14645.f47887.length();
                    if (length != 0) {
                        c1942.f7326.add(new C9705(length, c15682M46969));
                    }
                }
                c1942.f7326.trimToSize();
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m9996() {
        return ((C14644) this.f12405.get(this.f12414 + 1)).f47888;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10001(Paint paint) {
        float fontSpacing = paint.getFontSpacing();
        List list = this.f12405;
        if (list.isEmpty()) {
            this.f12417 = 4.0f * fontSpacing;
            this.f12422 = (fontSpacing * 3.0f) + paint.measureText("EXIT");
            float fMeasureText = paint.measureText("0") * 0.6f;
            this.f12411 = fMeasureText;
            this.f12419 = fMeasureText;
            this.f12418 = true;
            return;
        }
        this.f12417 = list.size() * fontSpacing;
        float fMeasureText2 = paint.measureText("0");
        float length = (String.valueOf(((C14644) C3012.m8974(1, list)).f47888).length() + 1) * fMeasureText2;
        this.f12419 = 0.7f * fMeasureText2;
        this.f12411 = fMeasureText2 * 0.5f;
        if (this.f12418) {
            this.f12422 = m9994(this.f12424, paint);
        } else {
            this.f12424 = 0;
            int size = list.size();
            float f = 0.0f;
            for (int i = 0; i < size; i++) {
                float fM9994 = m9994(i, paint);
                if (fM9994 > f) {
                    this.f12424 = i;
                    f = fM9994;
                }
            }
            this.f12422 = f;
            this.f12418 = true;
        }
        this.f12417 = (this.f12411 * 2.0f) + this.f12417;
        this.f12422 = (this.f12419 * 2.0f) + length + this.f12422;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m9994(int i, Paint paint) {
        C14644 c14644 = (C14644) this.f12405.get(i);
        C1942 c1942 = (C1942) this.f12406.get(i);
        float f = 0.0f;
        if (!c14644.f47887.isEmpty() && c1942 != null) {
            int i2 = 0;
            for (C9705 c9705 : c1942.f7326) {
                float fMeasureText = paint.measureText(c14644.f47887, i2, c9705.f32696);
                c9705.f32695 = fMeasureText;
                f += fMeasureText;
                i2 = c9705.f32696;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float m10005() {
        if (!this.f12418) {
            throw new IllegalStateException("Need measure");
        }
        return this.f12422;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final float m10007() {
        if (!this.f12418) {
            throw new IllegalStateException("Need measure");
        }
        return this.f12417;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9999(float f, float f2, float f3, float f4) {
        this.f12410 = f;
        this.f12421 = f2;
        this.f12413 = f3;
        this.f12408 = f4;
        this.f12415 = true;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final float m10008() {
        if (!this.f12415) {
            throw new IllegalStateException("Need layout");
        }
        return this.f12410;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float m9995() {
        if (!this.f12415) {
            throw new IllegalStateException("Need layout");
        }
        return this.f12421;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float m10004() {
        if (!this.f12415) {
            throw new IllegalStateException("Need layout");
        }
        return this.f12413;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m9998() {
        if (!this.f12415) {
            throw new IllegalStateException("Need layout");
        }
        return this.f12408;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x023d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0422  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10000(Canvas canvas, C4916 c4916, C4916 c4917, RectF rectF, float f) {
        boolean z;
        int iSave;
        float f2;
        float f3;
        float f4;
        float f5;
        List list;
        C11697 c11697;
        int i;
        int iSave2;
        ArrayList arrayList;
        boolean z2;
        int i2;
        C14644 c14644;
        C14644 c14645;
        C11697 c11698;
        C11697 c11699;
        C3353 c3353;
        C14644 c14646;
        int i3;
        C14644 c14647;
        int i4;
        Canvas canvas2 = canvas;
        float f6 = this.f12410;
        float f7 = this.f12421;
        if (rectF.intersects(f6, f7, this.f12413 + f6, this.f12408 + f7)) {
            List list2 = this.f12405;
            boolean zIsEmpty = list2.isEmpty();
            float fontSpacing = c4916.getFontSpacing();
            float f8 = -c4916.getFontMetrics().ascent;
            float fM9998 = zIsEmpty ? m9998() / 4.0f : (m9998() - (this.f12411 * 2.0f)) / list2.size();
            float f9 = (f8 / fontSpacing) * fM9998;
            float fM10008 = m10008();
            float fM9995 = m9995();
            float f10 = fM10008 * f;
            float f11 = fM9995 * f;
            float f12 = this.f12413 * f;
            float f13 = this.f12408 * f;
            float f14 = ((this.f12419 + this.f12411) / 4.0f) * f;
            float fMeasureText = c4916.measureText("0");
            float length = zIsEmpty ? 0.0f : (String.valueOf(((C14644) C3012.m8974(1, list2)).f47888).length() + 1) * fMeasureText;
            float f15 = length * f;
            float f16 = f12 + f10;
            RectF rectF2 = this.f12420;
            rectF2.set(f10, f11, f16, f13 + f11);
            C11697 c116910 = this.f12412;
            int i5 = c116910.f39324;
            List list3 = list2;
            Paint.Style style = Paint.Style.FILL;
            c4916.setStyle(style);
            C11697 c116911 = c116910;
            if (i5 == this.f12423) {
                float f17 = C11116.f37735;
                c4916.setColor(C20368.m45983(-13421779, -1309));
            } else {
                float f18 = C11116.f37735;
                c4916.setColor(zIsEmpty ? C20368.m45983(-13948117, -328966) : C20368.m45983(-13948117, -1));
            }
            canvas2.drawRoundRect(rectF2, f14, f14, c4916);
            if (!zIsEmpty) {
                rectF2.right = rectF2.left + f14 + f14;
                c4916.setColor(C20368.m45983(-13223878, -986896));
                canvas2.drawRoundRect(rectF2, f14, f14, c4916);
                rectF2.left = rectF2.right - f14;
                rectF2.right = f15 + f10;
                canvas2.drawRect(rectF2, c4916);
                c4916.setStyle(Paint.Style.STROKE);
                c4916.setColor(C20368.m45983(-11184811, -3092272));
                c4916.setStrokeWidth(1.0f * f);
                float f19 = rectF2.right;
                canvas.drawLine(f19, rectF2.top, f19, rectF2.bottom, c4916);
            }
            rectF2.left = f10;
            rectF2.right = f16;
            c4916.setStyle(Paint.Style.STROKE);
            c4916.setColor(C20368.m45983(-11513776, -4144960));
            c4916.setStrokeWidth(C11116.f37735 * 1.5f * f);
            canvas2.drawRoundRect(rectF2, f14, f14, c4916);
            if (zIsEmpty) {
                c4916.setTextAlign(Paint.Align.CENTER);
                c4916.setStyle(style);
                c4916.setColor(C20368.m45983(-7829368, -16777216));
                iSave = canvas.save();
                canvas2.scale(f, f);
                canvas.drawText("EXIT", 0, 4, (this.f12413 / 2.0f) + fM10008, (fM9998 * 1.5f) + fM9995 + f9, (Paint) c4916);
                canvas2.restoreToCount(iSave);
                c4916.setTextAlign(Paint.Align.LEFT);
                z = false;
            } else {
                C3353 c3354 = this;
                float f20 = c3354.f12411;
                float f21 = fM9995 + f20;
                float f22 = f20 + f9 + fM9995;
                float f23 = fM10008 + c3354.f12419 + length;
                float f24 = (fM10008 + length) - fMeasureText;
                boolean z3 = f <= 0.15f;
                c4916.setStyle(style);
                int size = list3.size();
                int i6 = 0;
                float f25 = f21;
                Canvas canvas3 = canvas2;
                int i7 = 0;
                float f26 = f22;
                z = false;
                while (i7 < size) {
                    if (i7 > 0) {
                        f26 += fM9998;
                        f25 += fM9998;
                    }
                    float f27 = f26;
                    float f28 = f25;
                    RectF rectF3 = rectF;
                    int i8 = size;
                    int i9 = i6;
                    if (rectF3.intersects(rectF3.left, f28, rectF3.right, f28 + fM9998)) {
                        if (f24 < rectF3.left || fM10008 > rectF3.right) {
                            list = list3;
                        } else {
                            list = list3;
                            int i10 = ((C14644) list.get(i7)).f47888;
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
                                    canvas3.drawText(strValueOf, length2, length2 + 1, f29, f27, (Paint) c4917);
                                    f29 -= fMeasureText;
                                }
                            }
                            arrayList = c3354.f12406;
                            if (z3) {
                                f2 = f28;
                                c14645 = (C14644) list.get(i7);
                                C1942 c1942 = (C1942) arrayList.get(i7);
                                i2 = iSave2;
                                if (!c14645.f47887.isEmpty() || c1942 == null) {
                                    z2 = z;
                                    f3 = f24;
                                    f4 = fM9998;
                                    f5 = f23;
                                    c11697 = c116911;
                                    i = i7;
                                    list = list;
                                    i6 = i2;
                                    z = z2;
                                    canvas3 = canvas3;
                                } else {
                                    int i11 = i7;
                                    if (c3354.f12407 != C20368.m45991()) {
                                        c3354.f12407 = C20368.m45991();
                                        c11698 = c116911;
                                        c11698.f39320 -= (long) c3354.f12416;
                                        m9997();
                                    } else {
                                        c11698 = c116911;
                                    }
                                    float f30 = f27 - f9;
                                    Iterator it = c1942.f7326.iterator();
                                    C4916 c4918 = c4916;
                                    float f31 = f23;
                                    int iSave3 = i2;
                                    int i12 = 0;
                                    while (it.hasNext()) {
                                        C9705 c9705 = (C9705) it.next();
                                        float f32 = c9705.f32695;
                                        Iterator it2 = it;
                                        C15682 c15682 = c9705.f32693;
                                        float f33 = f24;
                                        int i13 = c9705.f32696;
                                        float f34 = f31 + f32;
                                        float f35 = f23;
                                        if (f34 < rectF3.left || f31 > rectF3.right) {
                                            i13 = i13;
                                            c11699 = c11698;
                                            c3353 = c3354;
                                            rectF = rectF3;
                                            c14646 = c14645;
                                            int i14 = i11;
                                            fM9998 = fM9998;
                                            i3 = i14;
                                            iSave3 = iSave3;
                                        } else {
                                            int i15 = i13 - i12;
                                            if (10 >= i15 || i15 >= 100) {
                                                c14646 = c14645;
                                                int iSave4 = iSave3;
                                                i13 = i13;
                                                c11699 = c11698;
                                                c3353 = c3354;
                                                rectF = rectF;
                                                int i16 = i11;
                                                fM9998 = fM9998;
                                                i3 = i16;
                                                c4918.setColor(c15682.m37379());
                                                if (!z) {
                                                    iSave4 = canvas3.save();
                                                    canvas3.scale(f, f);
                                                    z = true;
                                                }
                                                iSave3 = iSave4;
                                                canvas3.drawText(c14646.f47887, i12, c9705.f32696, f31, f30 + f9, (Paint) c4918);
                                            } else {
                                                Bitmap bitmap = c9705.f32694;
                                                if (bitmap == null) {
                                                    i4 = iSave3;
                                                    if (c11698.f39320 >= 5242880) {
                                                        c4918.setColor(c15682.m37379());
                                                        if (z) {
                                                            iSave3 = i4;
                                                        } else {
                                                            iSave3 = canvas3.save();
                                                            canvas3.scale(f, f);
                                                            z = true;
                                                        }
                                                        canvas3.drawText(c14645.f47887, i12, c9705.f32696, f31, f30 + f9, (Paint) c4918);
                                                        canvas3 = canvas;
                                                        rectF = rectF;
                                                        c14646 = c14645;
                                                        i13 = i13;
                                                        c11699 = c11698;
                                                        c3353 = this;
                                                        int i17 = i11;
                                                        fM9998 = fM9998;
                                                        i3 = i17;
                                                    } else {
                                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(Math.max(1, (int) ((f32 * 0.1f) + 0.5f)), Math.max(1, (int) ((fM9998 * 0.1f) + 0.5f)), Bitmap.Config.ARGB_4444);
                                                        c9705.f32694 = bitmapCreateBitmap;
                                                        Canvas canvas4 = new Canvas(bitmapCreateBitmap);
                                                        canvas4.scale(0.1f, 0.1f);
                                                        c4918.setColor(c15682.m37379());
                                                        c14647 = c14645;
                                                        c11699 = c11698;
                                                        i3 = i11;
                                                        canvas4.drawText(c14645.f47887, i12, c9705.f32696, 0.0f, f9, (Paint) c4916);
                                                        int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth() * 2;
                                                        c3353 = this;
                                                        c3353.f12416 += height;
                                                        c11699.f39320 += (long) height;
                                                        canvas3 = canvas;
                                                        c4918 = c4916;
                                                        bitmap = bitmapCreateBitmap;
                                                    }
                                                } else {
                                                    c14647 = c14645;
                                                    i4 = iSave3;
                                                    c11699 = c11698;
                                                    c3353 = c3354;
                                                    i3 = i11;
                                                }
                                                Matrix matrix = c3353.f12409;
                                                matrix.reset();
                                                float f36 = 10.0f * f;
                                                matrix.setScale(f36, f36);
                                                matrix.postTranslate(f31 * f, f30 * f);
                                                int i18 = i4;
                                                if (z) {
                                                    canvas3.restoreToCount(i18);
                                                    z = false;
                                                }
                                                canvas3.drawBitmap(bitmap, matrix, c4918);
                                                iSave3 = i18;
                                                c14646 = c14647;
                                            }
                                        }
                                        c14645 = c14646;
                                        rectF3 = rectF;
                                        f31 = f34;
                                        it = it2;
                                        f23 = f35;
                                        i12 = i13;
                                        c3354 = c3353;
                                        c11698 = c11699;
                                        f24 = f33;
                                        float f37 = fM9998;
                                        i11 = i3;
                                        fM9998 = f37;
                                    }
                                    i6 = iSave3;
                                    f3 = f24;
                                    f5 = f23;
                                    c11697 = c11698;
                                    int i19 = i11;
                                    f4 = fM9998;
                                    i = i19;
                                    z = z;
                                    list = list;
                                }
                            } else {
                                z2 = z;
                                i2 = iSave2;
                                f2 = f28;
                                f3 = f24;
                                f4 = fM9998;
                                f5 = f23;
                                c11697 = c116911;
                                i = i7;
                                c14644 = (C14644) list.get(i);
                                C1942 c1943 = (C1942) arrayList.get(i);
                                if (!c14644.f47887.isEmpty() || c1943 == null) {
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
                                    for (C9705 c9706 : c1943.f7326) {
                                        float f39 = f38 + c9706.f32695;
                                        if (f39 >= rectF3.left && f38 <= rectF3.right) {
                                            c4916.setColor(c9706.f32693.m37379());
                                            canvas3.drawText(c14644.f47887, i20, c9706.f32696, f38, f27, (Paint) c4916);
                                        }
                                        i20 = c9706.f32696;
                                        f38 = f39;
                                        canvas3 = canvas3;
                                    }
                                    i6 = i2;
                                    z = z2;
                                }
                            }
                        }
                        iSave2 = i9;
                        arrayList = c3354.f12406;
                        if (z3) {
                            f2 = f28;
                            c14645 = (C14644) list.get(i7);
                            C1942 c1944 = (C1942) arrayList.get(i7);
                            i2 = iSave2;
                            if (c14645.f47887.isEmpty()) {
                            }
                            z2 = z;
                            f3 = f24;
                            f4 = fM9998;
                            f5 = f23;
                            c11697 = c116911;
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
                            f4 = fM9998;
                            f5 = f23;
                            c11697 = c116911;
                            i = i7;
                            c14644 = (C14644) list.get(i);
                            C1942 c1945 = (C1942) arrayList.get(i);
                            if (c14644.f47887.isEmpty()) {
                            }
                            i6 = i2;
                            z = z2;
                            canvas3 = canvas3;
                        }
                    } else {
                        f2 = f28;
                        f3 = f24;
                        f4 = fM9998;
                        f5 = f23;
                        list = list3;
                        c11697 = c116911;
                        i = i7;
                        i6 = i9;
                    }
                    i7 = i + 1;
                    c3354 = this;
                    list3 = list;
                    c116911 = c11697;
                    f26 = f27;
                    size = i8;
                    f25 = f2;
                    fM9998 = f4;
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

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m9997() {
        for (C1942 c1942 : this.f12406) {
            if (c1942 != null) {
                for (C9705 c9705 : c1942.f7326) {
                    Bitmap bitmap = c9705.f32694;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c9705.f32694 = null;
                    }
                }
            }
        }
        this.f12416 = 0;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C14644 m10006() {
        return (C14644) C3012.m8974(1, this.f12405);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C3353.class == obj.getClass() && this.f12423 == ((C3353) obj).f12423;
    }

    public final int hashCode() {
        return this.f12423;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10002(C11018 c11018) {
        c11018.writeInt(this.f12423);
        List<C14644> list = this.f12405;
        c11018.writeInt(list.size());
        for (C14644 c14644 : list) {
            c11018.writeInt(c14644.f47888);
            c11018.m27786(c14644.f47887);
        }
        HashSet hashSet = this.f12404;
        c11018.writeInt(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            c11018.m27786((String) it.next());
        }
        C0158 c0158 = new C0158();
        ArrayList<C1942> arrayList = this.f12406;
        for (C1942 c1942 : arrayList) {
            if (c1942 != null) {
                Iterator it2 = c1942.f7326.iterator();
                while (it2.hasNext()) {
                    c0158.m1260(((C9705) it2.next()).f32693);
                }
            }
        }
        c0158.m1258(c11018);
        c11018.writeInt(arrayList.size());
        for (C1942 c1943 : arrayList) {
            if (c1943 == null) {
                c11018.writeInt(-1);
            } else {
                ArrayList<C9705> arrayList2 = c1943.f7326;
                c11018.writeInt(arrayList2.size());
                for (C9705 c9705 : arrayList2) {
                    c11018.writeByte(c0158.m1256(c9705.f32693));
                    c11018.writeInt(c9705.f32696);
                    c11018.m27778(c9705.f32695);
                }
            }
        }
        c11018.writeByte(this.f12418 ? (byte) 1 : (byte) 0);
        c11018.writeInt(this.f12424);
        c11018.m27778(this.f12419);
        c11018.m27778(this.f12411);
        c11018.m27778(this.f12422);
        c11018.m27778(this.f12417);
        c11018.writeByte(this.f12415 ? (byte) 1 : (byte) 0);
        c11018.m27778(this.f12410);
        c11018.m27778(this.f12421);
        c11018.m27778(this.f12413);
        c11018.m27778(this.f12408);
        c11018.writeInt(this.f12414);
    }

    public C3353(C11697 c11697, C17367 c17367) {
        this.f12414 = -1;
        this.f12420 = new RectF();
        this.f12407 = C20368.m45991();
        this.f12416 = 0;
        this.f12409 = new Matrix();
        this.f12412 = c11697;
        this.f12423 = c17367.readInt();
        int i = c17367.readInt();
        this.f12405 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f12405.add(new C14644(c17367.readInt(), c17367.m40458()));
        }
        int i3 = c17367.readInt();
        this.f12404 = new HashSet(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            this.f12404.add(c17367.m40458());
        }
        C0158 c0158 = new C0158();
        c0158.m1259(c17367);
        int i5 = c17367.readInt();
        this.f12406 = new ArrayList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            int i7 = c17367.readInt();
            if (i7 == -1) {
                this.f12406.add(null);
            } else {
                C1942 c1942 = new C1942();
                c1942.f7326.ensureCapacity(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    C9705 c9705 = new C9705(c17367.readInt(), c0158.m1257(c17367.readByte() & 255));
                    c9705.f32695 = c17367.m40450();
                    c1942.f7326.add(c9705);
                }
                this.f12406.add(c1942);
            }
        }
        this.f12418 = c17367.readByte() != 0;
        this.f12424 = c17367.readInt();
        this.f12419 = c17367.m40450();
        this.f12411 = c17367.m40450();
        this.f12422 = c17367.m40450();
        this.f12417 = c17367.m40450();
        this.f12415 = c17367.readByte() != 0;
        this.f12410 = c17367.m40450();
        this.f12421 = c17367.m40450();
        this.f12413 = c17367.m40450();
        this.f12408 = c17367.m40450();
        this.f12414 = c17367.readInt();
    }
}
