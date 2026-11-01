package l;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Typeface;

/* JADX INFO: renamed from: l.ܶ֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1TQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C14874 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final float f48621;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f48622;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float[] f48623;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final float f48624;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f48625;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final Typeface f48626;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f48627;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4916 f48628;

    public C14874(float f, Typeface typeface) {
        C4916 c4916 = new C4916();
        this.f48628 = c4916;
        this.f48623 = new float[127];
        this.f48621 = f;
        this.f48626 = typeface;
        c4916.setTypeface(typeface);
        c4916.setAntiAlias(true);
        c4916.setTextSize(f);
        int iCeil = (int) Math.ceil(c4916.getFontSpacing());
        this.f48625 = iCeil;
        int iCeil2 = (int) Math.ceil(c4916.ascent());
        this.f48627 = iCeil2;
        this.f48622 = iCeil + iCeil2;
        this.f48624 = c4916.measureText("X");
        StringBuilder sb = new StringBuilder(" ");
        for (int i = 0; i < this.f48623.length; i++) {
            sb.setCharAt(0, (char) i);
            this.f48623[i] = this.f48628.measureText(sb, 0, 1);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35570(C5575 c5575, Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int codePoint;
        C14874 c14874 = this;
        C5575 c5576 = c5575;
        boolean zM15434 = c5575.m15434();
        int i9 = i + c5576.f19153;
        int i10 = c5576.f19142;
        int iM15437 = c5575.m15437();
        int iM15435 = c5575.m15435();
        boolean zM15440 = c5575.m15440();
        C4869 c4869M15433 = c5575.m15433();
        C11926 c11926 = c5576.f19121;
        int[] iArr = c11926.f40021;
        int[] iArr2 = c11926.f40021;
        int iM15424 = c5575.m15424();
        if (zM15434) {
            canvas.drawColor(iArr[256], PorterDuff.Mode.SRC);
        }
        float f = c14874.f48622;
        int i11 = i;
        while (i11 < i9) {
            float f2 = f + c14874.f48625;
            int i12 = (i11 == iM15435 && zM15440) ? iM15437 : -1;
            if (i11 < i2 || i11 > i3) {
                i6 = -1;
                i7 = -1;
            } else {
                int i13 = i11 == i2 ? i4 : -1;
                i6 = i11 == i3 ? i5 : c5576.f19142;
                i7 = i13;
            }
            C18981 c18981M13565 = c4869M15433.m13565(c4869M15433.m13573(i11));
            char[] cArr = c18981M13565.f61445;
            long j = 0;
            int i14 = -1;
            int i15 = 0;
            float f3 = 0.0f;
            boolean z = false;
            int i16 = i11;
            int iM43680 = c18981M13565.m43680();
            boolean z2 = false;
            boolean z3 = false;
            int i17 = 0;
            int i18 = 0;
            while (i18 < i10) {
                C4869 c4869 = c4869M15433;
                char c = cArr[i17];
                boolean zIsHighSurrogate = Character.isHighSurrogate(c);
                int i19 = zIsHighSurrogate ? 2 : 1;
                int codePoint2 = zIsHighSurrogate ? Character.toCodePoint(c, cArr[i17 + 1]) : c;
                int iM31705 = C12757.m31705(codePoint2);
                int i20 = i10;
                boolean z4 = i12 == i18 || (iM31705 == 2 && i12 == i18 + 1);
                boolean z5 = i18 >= i7 && i18 <= i6;
                long jM43685 = c18981M13565.m43685(i18);
                C18981 c18981 = c18981M13565;
                float[] fArr = c14874.f48623;
                int i21 = i6;
                float fMeasureText = codePoint2 < fArr.length ? fArr[codePoint2] : c14874.f48628.measureText(cArr, i17, i19);
                boolean z6 = ((double) Math.abs((fMeasureText / c14874.f48624) - ((float) iM31705))) > 0.01d;
                if (jM43685 == j && z4 == z2 && z5 == z3 && !z6 && !z) {
                    iM43680 = iM43680;
                    i7 = i7;
                    iArr2 = iArr2;
                    iArr = iArr;
                    i19 = i19;
                    cArr = cArr;
                    i18 = i18;
                    i8 = i14;
                    z6 = z;
                    iM15435 = iM15435;
                    i9 = i9;
                    i12 = i12;
                    iM31705 = iM31705;
                    i17 = i17;
                } else {
                    if (i18 != 0) {
                        m35569(canvas, cArr, iArr, f2, i14, i18 - i14, i15, i17 - i15, f3, z2 ? iArr2[258] : 0, z3 ? iArr2[259] : 0, iM15424, j, zM15434);
                    }
                    f3 = 0.0f;
                    i8 = i18;
                    z2 = z4;
                    i15 = i17;
                    z3 = z5;
                    j = jM43685;
                }
                f3 += fMeasureText;
                i18 += iM31705;
                i17 += i19;
                int i22 = iM43680;
                while (i17 < i22) {
                    char c2 = cArr[i17];
                    if (Character.isHighSurrogate(c2)) {
                        codePoint = c2;
                        codePoint = Character.toCodePoint(c2, cArr[i17 + 1]);
                    }
                    codePoint = c2;
                    if (C12757.m31705(codePoint) > 0) {
                        break;
                    } else {
                        i17 += Character.isHighSurrogate(cArr[i17]) ? 2 : 1;
                    }
                }
                c14874 = this;
                i14 = i8;
                iM43680 = i22;
                c4869M15433 = c4869;
                iM15435 = iM15435;
                i10 = i20;
                i9 = i9;
                c18981M13565 = c18981;
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
            C4869 c48610 = c4869M15433;
            int i23 = iM15435;
            int i24 = i10;
            int i25 = i9;
            m35569(canvas, cArr, iArr4, f2, i14, i24 - i14, i15, i17 - i15, f3, z2 ? iArr3[258] : 0, z3 ? iArr3[259] : 0, iM15424, j, zM15434);
            i11 = i16 + 1;
            c14874 = this;
            c5576 = c5575;
            f = f2;
            c4869M15433 = c48610;
            iM15435 = i23;
            i10 = i24;
            i9 = i25;
            iArr2 = iArr3;
            iArr = iArr4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m35569(Canvas canvas, char[] cArr, int[] iArr, float f, int i, int i2, int i3, int i4, float f2, int i5, int i6, int i7, long j, boolean z) {
        int i8;
        float f3;
        float f4;
        boolean z2;
        C4916 c4916;
        C4916 c4917;
        int i9;
        int iMin;
        int iMin2;
        int iMin3;
        float f5;
        int iM3277 = C0761.m3277(j);
        int i10 = (int) (j & 2047);
        int iM3275 = C0761.m3275(j);
        boolean z3 = (i10 & 9) != 0;
        boolean z4 = (i10 & 4) != 0;
        boolean z5 = (i10 & 2) != 0;
        boolean z6 = (i10 & 64) != 0;
        boolean z7 = (i10 & 256) != 0;
        if ((iM3277 & (-16777216)) != -16777216) {
            if (z3 && iM3277 >= 0 && iM3277 < 8) {
                iM3277 += 8;
            }
            iM3277 = iArr[iM3277];
        }
        if ((iM3275 & (-16777216)) != -16777216) {
            iM3275 = iArr[iM3275];
        }
        if (z ^ ((i10 & 16) != 0)) {
            i8 = iM3275;
        } else {
            i8 = iM3277;
            iM3277 = iM3275;
        }
        float f6 = this.f48624;
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
        int i13 = this.f48627;
        int i14 = this.f48622;
        C4916 c4918 = this.f48628;
        if (iM3277 != i12) {
            c4918.setColor(iM3277);
            c4916 = c4918;
            canvas.drawRect(f3, (f - i14) + i13, f4, f, c4916);
        } else {
            c4916 = c4918;
        }
        if (i6 != 0) {
            C4916 c4919 = c4916;
            c4919.setColor(i6);
            canvas.drawRect(f3, f - (i14 - i13), f4 + 1.0f, f, c4919);
        }
        if (i5 != 0) {
            C4916 c49110 = c4916;
            c49110.setColor(i5);
            float f12 = i14 - i13;
            if (i7 == 1) {
                f12 = (float) (((double) f12) / 4.0d);
            } else {
                if (i7 == 2) {
                    i14 = i14;
                    f5 = (float) (((double) f4) - (((double) ((f4 - f3) * 3.0f)) / 4.0d));
                    f12 = f12;
                }
                c4917 = c49110;
                canvas.drawRect(f3, f - f12, f5, f, c49110);
            }
            f5 = f4;
            c4917 = c49110;
            canvas.drawRect(f3, f - f12, f5, f, c49110);
        } else {
            c4917 = c4916;
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
                if (C14043.f46170) {
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
            c4917.setFakeBoldText(z3);
            c4917.setUnderlineText(z4);
            c4917.setTextSkewX(z8 ? -0.35f : 0.0f);
            c4917.setStrikeThruText(z9);
            c4917.setColor(i9);
            canvas.drawText(cArr, i3, i4, f3, f - i14, c4917);
        }
        if (z2) {
            canvas.restore();
        }
    }
}
