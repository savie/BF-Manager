package l;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: renamed from: l.۠۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 38G7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8032 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f26293;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public float f26294;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f26295;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f26296;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f26297;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f26298;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f26299;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public int f26300;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public Bitmap f26301;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final float f26302;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f26303;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f26304;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public float f26305;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public StaticLayout f26306;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final TextPaint f26307;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f26308;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final float f26309;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Rect f26310;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final float f26311;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public int f26312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Paint f26313;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final Paint f26314;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f26315;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public float f26316;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f26317;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f26318;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final float f26319;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Layout.Alignment f26320;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f26321;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public int f26322;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f26323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f26324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public CharSequence f26325;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public float f26326;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f26327;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public StaticLayout f26328;

    public C8032(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.lineSpacingExtra, R.attr.lineSpacingMultiplier}, 0, 0);
        this.f26302 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f26309 = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f26324 = fRound;
        this.f26319 = fRound;
        this.f26311 = fRound;
        TextPaint textPaint = new TextPaint();
        this.f26307 = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f26314 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f26313 = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0228  */
    /* JADX WARN: Code duplicated, block: B:105:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x0256  */
    /* JADX WARN: Code duplicated, block: B:111:0x0283 A[LOOP:1: B:110:0x0281->B:111:0x0283, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:124:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:125:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:127:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:130:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:135:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:138:0x030f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0312  */
    /* JADX WARN: Code duplicated, block: B:141:0x0317  */
    /* JADX WARN: Code duplicated, block: B:143:0x032c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0337  */
    /* JADX WARN: Code duplicated, block: B:145:0x0344 A[PHI: r6
      0x0344: PHI (r6v33 int) = (r6v29 int), (r6v41 int) binds: [B:144:0x0337, B:136:0x030c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x034b  */
    /* JADX WARN: Code duplicated, block: B:149:0x034e  */
    /* JADX WARN: Code duplicated, block: B:151:0x0352  */
    /* JADX WARN: Code duplicated, block: B:152:0x0354  */
    /* JADX WARN: Code duplicated, block: B:154:0x0398  */
    /* JADX WARN: Code duplicated, block: B:156:0x03ca  */
    /* JADX WARN: Code duplicated, block: B:157:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:163:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:167:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:168:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:170:0x03ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x019b  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:89:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0216 A[LOOP:0: B:96:0x0214->B:97:0x0216, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:95:0x0206, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21143(C0612 c0612, C1723 c1723, float f, float f2, float f3, Canvas canvas, int i, int i2, int i3, int i4) {
        boolean z;
        int i5;
        TextPaint textPaint;
        CharSequence charSequence;
        boolean z2;
        Layout.Alignment alignment;
        int i6;
        boolean z3;
        Bitmap bitmap;
        float f4;
        int iRound;
        float f5;
        int iRound2;
        int i7;
        float f6;
        int i8;
        float f7;
        boolean z4;
        CharSequence charSequence2;
        SpannableStringBuilder spannableStringBuilder;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f8;
        int i14;
        SpannableStringBuilder spannableStringBuilder2;
        Layout.Alignment alignment2;
        int height;
        int lineCount;
        int iMax;
        int i15;
        int i16;
        int i17;
        float f9;
        int iMax2;
        int iMin;
        int i18;
        float f10;
        int iRound3;
        int lineBottom;
        float f11;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Bitmap bitmap2 = c0612.f2649;
        float f12 = c0612.f2656;
        float f13 = c0612.f2651;
        int i27 = c0612.f2655;
        float f14 = c0612.f2646;
        int i28 = c0612.f2647;
        int i29 = c0612.f2650;
        float f15 = c0612.f2654;
        Layout.Alignment alignment3 = c0612.f2657;
        CharSequence charSequence3 = c0612.f2663;
        boolean z5 = bitmap2 == null;
        if (!z5) {
            z = z5;
            i5 = -16777216;
        } else {
            if (TextUtils.isEmpty(charSequence3)) {
                return;
            }
            z = z5;
            i5 = c0612.f2660 ? c0612.f2652 : c1723.f6831;
        }
        CharSequence charSequence4 = this.f26325;
        TextPaint textPaint2 = this.f26307;
        if ((charSequence4 == charSequence3 || (charSequence4 != null && charSequence4.equals(charSequence3))) && C13638.equals(this.f26320, alignment3) && this.f26301 == bitmap2 && this.f26294 == f15 && this.f26298 == i29) {
            if (Integer.valueOf(this.f26312).equals(Integer.valueOf(i28)) && this.f26303 == f14 && Integer.valueOf(this.f26327).equals(Integer.valueOf(i27)) && this.f26316 == f13 && this.f26326 == f12 && this.f26304 == c1723.f6826 && this.f26299 == c1723.f6827 && this.f26300 == i5 && this.f26308 == c1723.f6829 && this.f26322 == c1723.f6830 && C13638.equals(textPaint2.getTypeface(), c1723.f6828) && this.f26305 == f) {
                textPaint = textPaint2;
                if (this.f26321 == f2) {
                    z2 = z;
                    if (this.f26296 == f3) {
                        charSequence = charSequence3;
                        if (this.f26323 == i) {
                            alignment = alignment3;
                            if (this.f26318 == i2) {
                                f15 = f15;
                                if (this.f26293 == i3) {
                                    i29 = i29;
                                    if (this.f26317 == i4) {
                                        m21142(canvas, z2);
                                        return;
                                    }
                                } else {
                                    i29 = i29;
                                }
                            }
                        } else {
                            alignment = alignment3;
                        }
                        i29 = i29;
                        i6 = i28;
                        f15 = f15;
                    } else {
                        f15 = f15;
                        i29 = i29;
                        alignment = alignment3;
                        charSequence = charSequence3;
                    }
                    i6 = i28;
                }
                this.f26325 = charSequence;
                this.f26320 = alignment;
                this.f26301 = bitmap2;
                this.f26294 = f15;
                this.f26298 = i29;
                this.f26312 = i6;
                this.f26303 = f14;
                this.f26327 = i27;
                this.f26316 = f13;
                this.f26326 = f12;
                this.f26304 = c1723.f6826;
                this.f26299 = c1723.f6827;
                this.f26300 = i5;
                this.f26308 = c1723.f6829;
                this.f26322 = c1723.f6830;
                textPaint.setTypeface(c1723.f6828);
                this.f26305 = f;
                this.f26321 = f2;
                this.f26296 = f3;
                this.f26323 = i;
                this.f26318 = i2;
                this.f26293 = i3;
                this.f26317 = i4;
                if (z2) {
                    this.f26325.getClass();
                    charSequence2 = this.f26325;
                    if (charSequence2 instanceof SpannableStringBuilder) {
                        spannableStringBuilder = (SpannableStringBuilder) charSequence2;
                    } else {
                        spannableStringBuilder = new SpannableStringBuilder(this.f26325);
                    }
                    i9 = this.f26293 - this.f26323;
                    i10 = this.f26317 - this.f26318;
                    textPaint.setTextSize(this.f26305);
                    i11 = (int) ((this.f26305 * 0.125f) + 0.5f);
                    i12 = i11 * 2;
                    i13 = i9 - i12;
                    f8 = this.f26316;
                    if (f8 != -3.4028235E38f) {
                        i13 = (int) (i13 * f8);
                    }
                    if (i13 <= 0) {
                        C0303.m1848("Skipped drawing subtitle cue (insufficient space)");
                        z4 = z2;
                    } else {
                        if (this.f26321 > 0.0f) {
                            i14 = 0;
                            spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f26321), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            i14 = 0;
                        }
                        spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                        if (this.f26308 == 1) {
                            for (ForegroundColorSpan foregroundColorSpan : (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i14, spannableStringBuilder2.length(), ForegroundColorSpan.class)) {
                                spannableStringBuilder2.removeSpan(foregroundColorSpan);
                            }
                        }
                        if (Color.alpha(this.f26299) > 0) {
                            i25 = this.f26308;
                            if (i25 != 0 || i25 == 2) {
                                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f26299), 0, spannableStringBuilder.length(), 16711680);
                            } else {
                                spannableStringBuilder2.setSpan(new BackgroundColorSpan(this.f26299), 0, spannableStringBuilder2.length(), 16711680);
                            }
                        }
                        alignment2 = this.f26320;
                        if (alignment2 == null) {
                            alignment2 = Layout.Alignment.ALIGN_CENTER;
                        }
                        StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i13, alignment2, this.f26309, this.f26302, true);
                        this.f26328 = staticLayout;
                        height = staticLayout.getHeight();
                        lineCount = this.f26328.getLineCount();
                        iMax = 0;
                        i15 = 0;
                        while (i15 < lineCount) {
                            iMax = Math.max((int) Math.ceil(this.f26328.getLineWidth(i15)), iMax);
                            i15++;
                            lineCount = lineCount;
                            i11 = i11;
                            z2 = z2;
                        }
                        z3 = z2;
                        i16 = i11;
                        if (this.f26316 != -3.4028235E38f || iMax >= i13) {
                            i13 = iMax;
                        }
                        i17 = i13 + i12;
                        f9 = this.f26303;
                        if (f9 != -3.4028235E38f) {
                            int iRound4 = Math.round(i9 * f9);
                            int i30 = this.f26323;
                            i23 = iRound4 + i30;
                            i24 = this.f26327;
                            if (i24 != 1) {
                                i23 = ((i23 * 2) - i17) / 2;
                            } else if (i24 == 2) {
                                i23 -= i17;
                            }
                            iMax2 = Math.max(i23, i30);
                            iMin = Math.min(i17 + iMax2, this.f26293);
                        } else {
                            iMax2 = this.f26323 + ((i9 - i17) / 2);
                            iMin = iMax2 + i17;
                        }
                        i18 = iMin - iMax2;
                        if (i18 <= 0) {
                            C0303.m1848("Skipped drawing subtitle cue (invalid horizontal positioning)");
                        } else {
                            f10 = this.f26294;
                            if (f10 != -3.4028235E38f) {
                                if (this.f26298 == 0) {
                                    iRound3 = Math.round(i10 * f10) + this.f26318;
                                    i22 = this.f26312;
                                    if (i22 == 2) {
                                        iRound3 -= height;
                                    } else if (i22 == 1) {
                                        iRound3 = ((iRound3 * 2) - height) / 2;
                                    }
                                } else {
                                    lineBottom = this.f26328.getLineBottom(0) - this.f26328.getLineTop(0);
                                    f11 = this.f26294;
                                    if (f11 >= 0.0f) {
                                        iRound3 = Math.round(f11 * lineBottom) + this.f26318;
                                    } else {
                                        iRound3 = Math.round((f11 + 1.0f) * lineBottom) + this.f26317;
                                        iRound3 -= height;
                                    }
                                }
                                i19 = iRound3 + height;
                                i20 = this.f26317;
                                if (i19 > i20) {
                                    iRound3 = i20 - height;
                                } else {
                                    i21 = this.f26318;
                                    if (iRound3 < i21) {
                                        iRound3 = i21;
                                    }
                                }
                            } else {
                                iRound3 = (this.f26317 - height) - ((int) (i10 * this.f26296));
                            }
                            TextPaint textPaint3 = textPaint;
                            Layout.Alignment alignment4 = alignment2;
                            this.f26328 = new StaticLayout(spannableStringBuilder, textPaint3, i18, alignment4, this.f26309, this.f26302, true);
                            this.f26306 = new StaticLayout(spannableStringBuilder2, textPaint3, i18, alignment4, this.f26309, this.f26302, true);
                            this.f26315 = iMax2;
                            this.f26297 = iRound3;
                            this.f26295 = i16;
                        }
                    }
                    m21142(canvas, z4);
                }
                z3 = z2;
                this.f26301.getClass();
                bitmap = this.f26301;
                int i31 = this.f26293;
                int i32 = this.f26323;
                int i33 = this.f26317;
                int i34 = this.f26318;
                float f16 = i31 - i32;
                float f17 = (this.f26303 * f16) + i32;
                f4 = i33 - i34;
                float f18 = (this.f26294 * f4) + i34;
                iRound = Math.round(f16 * this.f26316);
                f5 = this.f26326;
                if (f5 != -3.4028235E38f) {
                    iRound2 = Math.round(f4 * f5);
                } else {
                    iRound2 = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound);
                }
                i7 = this.f26327;
                if (i7 == 2) {
                    f6 = iRound;
                } else {
                    if (i7 == 1) {
                        f6 = iRound / 2;
                    }
                    int iRound5 = Math.round(f17);
                    i8 = this.f26312;
                    if (i8 == 2) {
                        f7 = iRound2;
                    } else {
                        if (i8 == 1) {
                            f7 = iRound2 / 2;
                        }
                        int iRound6 = Math.round(f18);
                        this.f26310 = new Rect(iRound5, iRound6, iRound + iRound5, iRound2 + iRound6);
                    }
                    f18 -= f7;
                    int iRound7 = Math.round(f18);
                    this.f26310 = new Rect(iRound5, iRound7, iRound + iRound5, iRound2 + iRound7);
                }
                f17 -= f6;
                int iRound8 = Math.round(f17);
                i8 = this.f26312;
                if (i8 == 2) {
                    f7 = iRound2;
                } else {
                    if (i8 == 1) {
                        f7 = iRound2 / 2;
                    }
                    int iRound9 = Math.round(f18);
                    this.f26310 = new Rect(iRound8, iRound9, iRound + iRound8, iRound2 + iRound9);
                }
                f18 -= f7;
                int iRound10 = Math.round(f18);
                this.f26310 = new Rect(iRound8, iRound10, iRound + iRound8, iRound2 + iRound10);
                z4 = z3;
                m21142(canvas, z4);
            }
            textPaint = textPaint2;
            charSequence = charSequence3;
        } else {
            canvas = canvas;
            charSequence = charSequence3;
            textPaint = textPaint2;
        }
        i6 = i28;
        alignment = alignment3;
        z2 = z;
        this.f26325 = charSequence;
        this.f26320 = alignment;
        this.f26301 = bitmap2;
        this.f26294 = f15;
        this.f26298 = i29;
        this.f26312 = i6;
        this.f26303 = f14;
        this.f26327 = i27;
        this.f26316 = f13;
        this.f26326 = f12;
        this.f26304 = c1723.f6826;
        this.f26299 = c1723.f6827;
        this.f26300 = i5;
        this.f26308 = c1723.f6829;
        this.f26322 = c1723.f6830;
        textPaint.setTypeface(c1723.f6828);
        this.f26305 = f;
        this.f26321 = f2;
        this.f26296 = f3;
        this.f26323 = i;
        this.f26318 = i2;
        this.f26293 = i3;
        this.f26317 = i4;
        if (z2) {
            this.f26325.getClass();
            charSequence2 = this.f26325;
            if (charSequence2 instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence2;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(this.f26325);
            }
            i9 = this.f26293 - this.f26323;
            i10 = this.f26317 - this.f26318;
            textPaint.setTextSize(this.f26305);
            i11 = (int) ((this.f26305 * 0.125f) + 0.5f);
            i12 = i11 * 2;
            i13 = i9 - i12;
            f8 = this.f26316;
            if (f8 != -3.4028235E38f) {
                i13 = (int) (i13 * f8);
            }
            if (i13 <= 0) {
                C0303.m1848("Skipped drawing subtitle cue (insufficient space)");
                z4 = z2;
            } else {
                if (this.f26321 > 0.0f) {
                    i14 = 0;
                    spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) this.f26321), 0, spannableStringBuilder.length(), 16711680);
                } else {
                    i14 = 0;
                }
                spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                if (this.f26308 == 1) {
                    while (i26 < r14) {
                        spannableStringBuilder2.removeSpan(foregroundColorSpan);
                    }
                }
                if (Color.alpha(this.f26299) > 0) {
                    i25 = this.f26308;
                    if (i25 != 0) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f26299), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f26299), 0, spannableStringBuilder.length(), 16711680);
                    }
                }
                alignment2 = this.f26320;
                if (alignment2 == null) {
                    alignment2 = Layout.Alignment.ALIGN_CENTER;
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder, textPaint, i13, alignment2, this.f26309, this.f26302, true);
                this.f26328 = staticLayout2;
                height = staticLayout2.getHeight();
                lineCount = this.f26328.getLineCount();
                iMax = 0;
                i15 = 0;
                while (i15 < lineCount) {
                    iMax = Math.max((int) Math.ceil(this.f26328.getLineWidth(i15)), iMax);
                    i15++;
                    lineCount = lineCount;
                    i11 = i11;
                    z2 = z2;
                }
                z3 = z2;
                i16 = i11;
                if (this.f26316 != -3.4028235E38f) {
                    i13 = iMax;
                } else {
                    i13 = iMax;
                }
                i17 = i13 + i12;
                f9 = this.f26303;
                if (f9 != -3.4028235E38f) {
                    int iRound11 = Math.round(i9 * f9);
                    int i35 = this.f26323;
                    i23 = iRound11 + i35;
                    i24 = this.f26327;
                    if (i24 != 1) {
                        i23 = ((i23 * 2) - i17) / 2;
                    } else if (i24 == 2) {
                        i23 -= i17;
                    }
                    iMax2 = Math.max(i23, i35);
                    iMin = Math.min(i17 + iMax2, this.f26293);
                } else {
                    iMax2 = this.f26323 + ((i9 - i17) / 2);
                    iMin = iMax2 + i17;
                }
                i18 = iMin - iMax2;
                if (i18 <= 0) {
                    C0303.m1848("Skipped drawing subtitle cue (invalid horizontal positioning)");
                } else {
                    f10 = this.f26294;
                    if (f10 != -3.4028235E38f) {
                        if (this.f26298 == 0) {
                            iRound3 = Math.round(i10 * f10) + this.f26318;
                            i22 = this.f26312;
                            if (i22 == 2) {
                                iRound3 -= height;
                            } else if (i22 == 1) {
                                iRound3 = ((iRound3 * 2) - height) / 2;
                            }
                        } else {
                            lineBottom = this.f26328.getLineBottom(0) - this.f26328.getLineTop(0);
                            f11 = this.f26294;
                            if (f11 >= 0.0f) {
                                iRound3 = Math.round(f11 * lineBottom) + this.f26318;
                            } else {
                                iRound3 = Math.round((f11 + 1.0f) * lineBottom) + this.f26317;
                                iRound3 -= height;
                            }
                        }
                        i19 = iRound3 + height;
                        i20 = this.f26317;
                        if (i19 > i20) {
                            iRound3 = i20 - height;
                        } else {
                            i21 = this.f26318;
                            if (iRound3 < i21) {
                                iRound3 = i21;
                            }
                        }
                    } else {
                        iRound3 = (this.f26317 - height) - ((int) (i10 * this.f26296));
                    }
                    TextPaint textPaint4 = textPaint;
                    Layout.Alignment alignment5 = alignment2;
                    this.f26328 = new StaticLayout(spannableStringBuilder, textPaint4, i18, alignment5, this.f26309, this.f26302, true);
                    this.f26306 = new StaticLayout(spannableStringBuilder2, textPaint4, i18, alignment5, this.f26309, this.f26302, true);
                    this.f26315 = iMax2;
                    this.f26297 = iRound3;
                    this.f26295 = i16;
                }
            }
            m21142(canvas, z4);
        }
        z3 = z2;
        this.f26301.getClass();
        bitmap = this.f26301;
        int i36 = this.f26293;
        int i37 = this.f26323;
        int i38 = this.f26317;
        int i39 = this.f26318;
        float f19 = i36 - i37;
        float f110 = (this.f26303 * f19) + i37;
        f4 = i38 - i39;
        float f111 = (this.f26294 * f4) + i39;
        iRound = Math.round(f19 * this.f26316);
        f5 = this.f26326;
        if (f5 != -3.4028235E38f) {
            iRound2 = Math.round(f4 * f5);
        } else {
            iRound2 = Math.round((bitmap.getHeight() / bitmap.getWidth()) * iRound);
        }
        i7 = this.f26327;
        if (i7 == 2) {
            f6 = iRound;
        } else {
            if (i7 == 1) {
                f6 = iRound / 2;
            }
            int iRound12 = Math.round(f110);
            i8 = this.f26312;
            if (i8 == 2) {
                f7 = iRound2;
            } else {
                if (i8 == 1) {
                    f7 = iRound2 / 2;
                }
                int iRound13 = Math.round(f111);
                this.f26310 = new Rect(iRound12, iRound13, iRound + iRound12, iRound2 + iRound13);
            }
            f111 -= f7;
            int iRound14 = Math.round(f111);
            this.f26310 = new Rect(iRound12, iRound14, iRound + iRound12, iRound2 + iRound14);
        }
        f110 -= f6;
        int iRound15 = Math.round(f110);
        i8 = this.f26312;
        if (i8 == 2) {
            f7 = iRound2;
        } else {
            if (i8 == 1) {
                f7 = iRound2 / 2;
            }
            int iRound16 = Math.round(f111);
            this.f26310 = new Rect(iRound15, iRound16, iRound + iRound15, iRound2 + iRound16);
        }
        f111 -= f7;
        int iRound17 = Math.round(f111);
        this.f26310 = new Rect(iRound15, iRound17, iRound + iRound15, iRound2 + iRound17);
        z4 = z3;
        m21142(canvas, z4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21142(Canvas canvas, boolean z) {
        if (!z) {
            this.f26310.getClass();
            this.f26301.getClass();
            canvas.drawBitmap(this.f26301, (Rect) null, this.f26310, this.f26313);
            return;
        }
        StaticLayout staticLayout = this.f26328;
        StaticLayout staticLayout2 = this.f26306;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.f26315, this.f26297);
        if (Color.alpha(this.f26300) > 0) {
            int i = this.f26300;
            Paint paint = this.f26314;
            paint.setColor(i);
            canvas.drawRect(-this.f26295, 0.0f, staticLayout.getWidth() + this.f26295, staticLayout.getHeight(), paint);
        }
        int i2 = this.f26308;
        TextPaint textPaint = this.f26307;
        if (i2 == 1) {
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStrokeWidth(this.f26324);
            textPaint.setColor(this.f26322);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else {
            float f = this.f26319;
            if (i2 == 2) {
                float f2 = this.f26311;
                textPaint.setShadowLayer(f, f2, f2, this.f26322);
            } else if (i2 == 3 || i2 == 4) {
                boolean z2 = i2 == 3;
                int i3 = z2 ? -1 : this.f26322;
                int i4 = z2 ? this.f26322 : -1;
                float f3 = f / 2.0f;
                textPaint.setColor(this.f26304);
                textPaint.setStyle(Paint.Style.FILL);
                float f4 = -f3;
                textPaint.setShadowLayer(f, f4, f4, i3);
                staticLayout2.draw(canvas);
                textPaint.setShadowLayer(f, f3, f3, i4);
            }
        }
        textPaint.setColor(this.f26304);
        textPaint.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }
}
