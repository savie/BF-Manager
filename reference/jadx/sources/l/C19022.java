package l;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ᩳۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: G1TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C19022 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f61622;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Typeface f61623;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f61624;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f61625;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C10232 f61626;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final float f61627;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f61628;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f61629;

    public C19022(float f, Typeface typeface) {
        C10232 c10232 = new C10232();
        this.f61626 = c10232;
        this.f61622 = new float[127];
        this.f61625 = f;
        this.f61623 = typeface;
        c10232.setTypeface(typeface);
        c10232.setAntiAlias(true);
        c10232.setTextSize(f);
        int iCeil = (int) Math.ceil(c10232.getFontSpacing());
        this.f61624 = iCeil;
        int iCeil2 = (int) Math.ceil(c10232.ascent());
        this.f61628 = iCeil2;
        this.f61629 = iCeil + iCeil2;
        this.f61627 = c10232.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < this.f61622.length; i++) {
            sb.setCharAt(0, (char) i);
            this.f61622[i] = this.f61626.measureText(sb, 0, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44113(C18605 c18605, Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int codePoint;
        C19022 c19022 = this;
        C18605 c18606 = c18605;
        boolean zM43264 = c18605.m43264();
        int i9 = i + c18606.f60484;
        int i10 = c18606.f60461;
        int iM43269 = c18605.m43269();
        int iM43263 = c18605.m43263();
        boolean zM43271 = c18605.m43271();
        C24573 c24573M43268 = c18605.m43268();
        C14875 c14875 = c18606.f60472;
        int[] iArr = c14875.f48607;
        int[] iArr2 = c14875.f48607;
        int iM43270 = c18605.m43270();
        if (zM43264) {
            canvas.drawColor(iArr[256], PorterDuff.Mode.SRC);
        }
        float f = c19022.f61629;
        int i11 = i;
        while (i11 < i9) {
            float f2 = f + c19022.f61624;
            int i12 = (i11 == iM43263 && zM43271) ? iM43269 : -1;
            if (i11 < i2 || i11 > i3) {
                i6 = -1;
                i7 = -1;
            } else {
                int i13 = i11 == i2 ? i4 : -1;
                i6 = i11 == i3 ? i5 : c18606.f60461;
                i7 = i13;
            }
            C14129 c14129M54881 = c24573M43268.m54881(c24573M43268.m54889(i11));
            char[] cArr = c14129M54881.f44697;
            long j = 0;
            int i14 = -1;
            int i15 = 0;
            float f3 = 0.0f;
            boolean z = false;
            int i16 = i11;
            int iM34341 = c14129M54881.m34341();
            boolean z2 = false;
            boolean z3 = false;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C24573 c24573 = c24573M43268;
                char c = cArr[i17];
                boolean zIsHighSurrogate = Character.isHighSurrogate(c);
                int i19 = zIsHighSurrogate ? 2 : 1;
                int codePoint2 = zIsHighSurrogate ? Character.toCodePoint(c, cArr[i17 + 1]) : c;
                int iM48443 = C21260.m48443(codePoint2);
                int i20 = i10;
                boolean z4 = i12 == i18 || (iM48443 == 2 && i12 == i18 + 1);
                boolean z5 = i18 >= i7 && i18 <= i6;
                long jM34346 = c14129M54881.m34346(i18);
                C14129 c14129 = c14129M54881;
                float[] fArr = c19022.f61622;
                int i21 = i6;
                float fMeasureText = codePoint2 < fArr.length ? fArr[codePoint2] : c19022.f61626.measureText(cArr, i17, i19);
                boolean z6 = ((double) Math.abs((fMeasureText / c19022.f61627) - ((float) iM48443))) > 0.01d;
                if (jM34346 == j && z4 == z2 && z5 == z3 && !z6 && !z) {
                    iM34341 = iM34341;
                    i7 = i7;
                    iArr2 = iArr2;
                    iArr = iArr;
                    i19 = i19;
                    cArr = cArr;
                    i18 = i18;
                    i8 = i14;
                    z6 = z;
                    iM43263 = iM43263;
                    i9 = i9;
                    i12 = i12;
                    iM48443 = iM48443;
                    i17 = i17;
                } else {
                    if (i18 != 0) {
                        m44112(canvas, cArr, iArr, f2, i14, i18 - i14, i15, i17 - i15, f3, z2 ? iArr2[258] : 0, z3 ? iArr2[259] : 0, iM43270, j, zM43264);
                    }
                    f3 = 0.0f;
                    i8 = i18;
                    z2 = z4;
                    i15 = i17;
                    z3 = z5;
                    j = jM34346;
                }
                f3 += fMeasureText;
                i18 += iM48443;
                i17 += i19;
                int i22 = iM34341;
                while (i17 < i22) {
                    char c2 = cArr[i17];
                    if (Character.isHighSurrogate(c2)) {
                        codePoint = c2;
                        codePoint = Character.toCodePoint(c2, cArr[i17 + 1]);
                    }
                    codePoint = c2;
                    if (C21260.m48443(codePoint) > 0) {
                        break;
                    } else {
                        i17 += Character.isHighSurrogate(cArr[i17]) ? 2 : 1;
                    }
                }
                c19022 = this;
                i14 = i8;
                iM34341 = i22;
                c24573M43268 = c24573;
                iM43263 = iM43263;
                i10 = i20;
                i9 = i9;
                c14129M54881 = c14129;
                i6 = i21;
                z = z6;
                i7 = i7;
                i12 = i12;
                iArr2 = iArr2;
                iArr = iArr;
                cArr = cArr;
            }
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            C24573 c24574 = c24573M43268;
            int i23 = iM43263;
            int i24 = i10;
            int i25 = i9;
            m44112(canvas, cArr, iArr4, f2, i14, i24 - i14, i15, i17 - i15, f3, z2 ? iArr3[258] : 0, z3 ? iArr3[259] : 0, iM43270, j, zM43264);
            i11 = i16 + 1;
            c19022 = this;
            c18606 = c18605;
            f = f2;
            c24573M43268 = c24574;
            iM43263 = i23;
            i10 = i24;
            i9 = i25;
            iArr2 = iArr3;
            iArr = iArr4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m44112(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, long j, boolean z) {
        int i8;
        float f3;
        float f4;
        boolean z2;
        C10232 c10232;
        C10232 c10233;
        int i9;
        int iMin;
        int iMin2;
        int iMin3;
        float f5;
        int iM35097 = C14546.m35097(j);
        int i10 = (int) (j & 2047);
        int iM35095 = C14546.m35095(j);
        boolean z3 = (i10 & 9) != 0;
        boolean z4 = (i10 & 4) != 0;
        boolean z5 = (i10 & 2) != 0;
        boolean z6 = (i10 & 64) != 0;
        boolean z7 = (i10 & 256) != 0;
        if ((iM35097 & (-16777216)) != -16777216) {
            if (z3 && iM35097 >= 0 && iM35097 < 8) {
                iM35097 += 8;
            }
            iM35097 = iArr[iM35097];
        }
        if ((iM35095 & (-16777216)) != -16777216) {
            iM35095 = iArr[iM35095];
        }
        if (z ^ ((i10 & 16) != 0)) {
            i8 = iM35095;
        } else {
            i8 = iM35097;
            iM35097 = iM35095;
        }
        float f6 = this.f61627;
        float f7 = i * f6;
        float f8 = i2;
        float f9 = (f8 * f6) + f7;
        float f10 = f2 / f6;
        int i11 = i8;
        boolean z8 = z5;
        boolean z9 = z6;
        if (Math.abs(f10 - f8) > 0.01d) {
            canvas.save();
            canvas.scale(f8 / f10, 1.0f);
            float f11 = f10 / f8;
            f3 = f7 * f11;
            f4 = f9 * f11;
            z2 = true;
        } else {
            f3 = f7;
            f4 = f9;
            z2 = false;
        }
        int i12 = iArr[257];
        int i13 = this.f61628;
        int i14 = this.f61629;
        C10232 c10234 = this.f61626;
        if (iM35097 != i12) {
            c10234.setColor(iM35097);
            c10232 = c10234;
            canvas.drawRect(f3, (f - i14) + i13, f4, f, c10232);
        } else {
            c10232 = c10234;
        }
        if (i6 != 0) {
            C10232 c10235 = c10232;
            c10235.setColor(i6);
            canvas.drawRect(f3, f - (i14 - i13), f4 + 1.0f, f, c10235);
        }
        if (i5 != 0) {
            C10232 c10236 = c10232;
            c10236.setColor(i5);
            float f12 = i14 - i13;
            if (i7 == 1) {
                f12 = (float) (((double) f12) / 4.0d);
            } else {
                if (i7 == 2) {
                    i14 = i14;
                    f5 = (float) (((double) f4) - (((double) ((f4 - f3) * 3.0f)) / 4.0d));
                    f12 = f12;
                }
                c10233 = c10236;
                canvas.drawRect(f3, f - f12, f5, f, c10236);
            }
            f5 = f4;
            c10233 = c10236;
            canvas.drawRect(f3, f - f12, f5, f, c10236);
        } else {
            c10233 = c10232;
            i14 = i14;
        }
        if ((i10 & 32) == 0) {
            if (i5 != 0) {
                i9 = iArr[256];
            } else if (i6 != 0) {
                i9 = iArr[257];
            } else if (z7) {
                int i15 = (i11 >> 16) & 255;
                int i16 = (i11 >> 8) & 255;
                int i17 = i11 & 255;
                if (C4435.f15888) {
                    iMin = (i15 * 2) / 3;
                    iMin2 = (i16 * 2) / 3;
                    iMin3 = (i17 * 2) / 3;
                } else {
                    iMin = Math.min(255, (i15 * 4) / 3);
                    iMin2 = Math.min(255, (i16 * 4) / 3);
                    iMin3 = Math.min(255, (i17 * 4) / 3);
                }
                i9 = ((iMin << 16) - 16777216) + (iMin2 << 8) + iMin3;
            } else {
                i9 = i11;
            }
            c10233.setFakeBoldText(z3);
            c10233.setUnderlineText(z4);
            c10233.setTextSkewX(z8 ? -0.35f : 0.0f);
            c10233.setStrikeThruText(z9);
            c10233.setColor(i9);
            canvas.drawText(cArr, i3, i4, f3, f - i14, c10233);
        }
        if (z2) {
            canvas.restore();
        }
    }
}
