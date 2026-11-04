package l;

import android.text.TextUtils;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.ᩴۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19608 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final IntUnaryOperator f63186;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f63187;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f63188;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final float f63189;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f63190;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f63191;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public int f63192;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5438 f63193;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public float f63194;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f63195;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f63196;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f63197;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final CharSequence f63198;

    public C19608(C5438 c5438, CharSequence charSequence, int i, int i2, float f, IntUnaryOperator intUnaryOperator) {
        this.f63193 = c5438;
        this.f63198 = charSequence;
        this.f63197 = i;
        this.f63195 = i;
        this.f63190 = i;
        this.f63196 = i2;
        this.f63189 = f;
        this.f63186 = intUnaryOperator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m45253() {
        return this.f63194;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m45252(int i) {
        char cCharAt = this.f63198.charAt(i);
        byte bM2252 = C0435.m2252(cCharAt);
        if (bM2252 != 15 || C9383.m24706(cCharAt)) {
            return bM2252 == 8 && !this.f63193.f18966;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m45254(float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f63190;
        if (i < i8 || i > (i2 = this.f63196)) {
            throw new IndexOutOfBoundsException();
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f63187;
        int i9 = 1;
        if (fArr != null && i <= this.f63195 && i >= (i7 = this.f63191) && i <= this.f63192) {
            return Math.min(f, i == i7 ? this.f63188 : fArr[(i - i7) - 1] + this.f63188);
        }
        float[] fArr2 = null;
        if (i < this.f63195) {
            this.f63197 = i8;
            this.f63195 = i8;
            this.f63194 = 0.0f;
            this.f63187 = null;
        }
        while (true) {
            int i10 = this.f63195;
            if (i10 >= i) {
                break;
            }
            float f2 = this.f63194;
            if (f2 >= f) {
                break;
            }
            if (i10 >= i2) {
                i3 = i8;
                i4 = i2;
            } else {
                C5438 c5438 = this.f63193;
                C12895 c12895 = c5438.f18980;
                C10232 c10232 = c5438.f18967;
                CharSequence charSequence = this.f63198;
                if (c12895 != null) {
                    int iM6073 = C1709.m6073(this.f63195, i2, charSequence);
                    this.f63195 = iM6073;
                    this.f63194 = c5438.m16175(i8, iM6073, charSequence);
                    i3 = i8;
                    i4 = i2;
                } else {
                    int i11 = this.f63195;
                    if (i11 >= this.f63197) {
                        IntUnaryOperator intUnaryOperator = this.f63186;
                        int iMin = intUnaryOperator == null ? i2 : Math.min(i2, intUnaryOperator.applyAsInt(i11));
                        this.f63197 = iMin;
                        if (iMin <= this.f63195) {
                            throw new IllegalArgumentException("Invalid text segment end");
                        }
                    }
                    int iM6074 = C1709.m6073(this.f63195, this.f63197, charSequence);
                    float[] fArr3 = this.f63187;
                    if (fArr3 != null && (i5 = this.f63195) >= (i6 = this.f63191) && i5 < this.f63192) {
                        this.f63194 = this.f63188 + fArr3[(iM6074 - i6) - i9];
                        i3 = i8;
                        i4 = i2;
                    } else if (m45252(this.f63195)) {
                        this.f63191 = this.f63195;
                        this.f63192 = iM6074;
                        while (true) {
                            int i12 = this.f63192;
                            int i13 = this.f63197;
                            if (i12 >= i13) {
                                break;
                            }
                            int iM6075 = C1709.m6073(i12, i13, charSequence);
                            int i14 = this.f63192;
                            if (iM6075 - i14 == i9 && !m45252(i14)) {
                                break;
                            }
                            this.f63192 = iM6075;
                        }
                        int i15 = this.f63192;
                        int i16 = this.f63191;
                        int i17 = i15 - i16;
                        char[] cArr = new char[i17];
                        TextUtils.getChars(charSequence, i16, i15, cArr, 0);
                        float[] fArr4 = new float[i17];
                        this.f63187 = fArr4;
                        c10232.getTextWidths(cArr, 0, i17, fArr4);
                        double d = 0.0d;
                        int i18 = 0;
                        while (i18 < i17) {
                            float[] fArr5 = this.f63187;
                            d += (double) fArr5[i18];
                            fArr5[i18] = (float) Math.ceil(d);
                            i18++;
                            i8 = i8;
                            i2 = i2;
                        }
                        i3 = i8;
                        i4 = i2;
                        this.f63187[i17 - 1] = c10232.measureText(cArr, 0, i17);
                        int i19 = this.f63191;
                        while (true) {
                            int i20 = this.f63192;
                            if (i19 >= i20) {
                                break;
                            }
                            int iM6076 = C1709.m6073(i19, i20, charSequence);
                            int i21 = this.f63191;
                            float f3 = i19 == i21 ? 0.0f : this.f63187[(i19 - i21) - 1];
                            while (true) {
                                i19++;
                                if (i19 < iM6076) {
                                    this.f63187[(i19 - this.f63191) - 1] = f3;
                                }
                            }
                            i19 = iM6076;
                        }
                        float f4 = this.f63194;
                        this.f63188 = f4;
                        this.f63194 = f4 + this.f63187[(iM6074 - this.f63191) - 1];
                        fArr2 = null;
                    } else {
                        i3 = i8;
                        i4 = i2;
                        this.f63187 = fArr2;
                        float f5 = this.f63194;
                        this.f63194 = c5438.m16194(charSequence, this.f63195, iM6074, this.f63189 + f5) + f5;
                    }
                    this.f63195 = iM6074;
                }
            }
            if (this.f63195 > i) {
                return Math.min(f, f2);
            }
            i9 = 1;
            i8 = i3;
            i2 = i4;
        }
        return Math.min(f, this.f63194);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45255(float f) {
        int i;
        int i2;
        float f2;
        if (f <= 0.0f) {
            return this.f63190;
        }
        do {
            i = this.f63195;
            i2 = this.f63196;
            if (i >= i2) {
                return i2;
            }
            f2 = this.f63194;
        } while (((m45254(Float.POSITIVE_INFINITY, C1709.m6073(i, i2, this.f63198)) - f2) / 2.0f) + f2 <= f);
        return i;
    }
}
