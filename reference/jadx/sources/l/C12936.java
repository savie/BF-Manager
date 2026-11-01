package l;

import android.text.TextUtils;
import java.util.function.IntUnaryOperator;

/* JADX INFO: renamed from: l.۬ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12936 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f42984;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f42985;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final IntUnaryOperator f42986;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float[] f42987;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f42988;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f42989;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final float f42990;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f42991;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f42992;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6585 f42993;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f42994;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f42995;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final CharSequence f42996;

    public C12936(C6585 c6585, CharSequence charSequence, int i, int i2, float f, IntUnaryOperator intUnaryOperator) {
        this.f42993 = c6585;
        this.f42996 = charSequence;
        this.f42985 = i;
        this.f42988 = i;
        this.f42989 = i;
        this.f42992 = i2;
        this.f42990 = f;
        this.f42986 = intUnaryOperator;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m32046() {
        return this.f42994;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m32045(int i) {
        char cCharAt = this.f42996.charAt(i);
        byte bM17214 = C6210.m17214(cCharAt);
        if (bM17214 != 15 || C9739.m24695(cCharAt)) {
            return bM17214 == 8 && !this.f42993.f22165;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final float m32047(float f, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = this.f42989;
        if (i < i6 || i > (i2 = this.f42992)) {
            throw new IndexOutOfBoundsException();
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f42987;
        int i7 = 1;
        if (fArr != null && i <= this.f42988 && i >= (i5 = this.f42984) && i <= this.f42995) {
            return Math.min(f, i == i5 ? this.f42991 : fArr[(i - i5) - 1] + this.f42991);
        }
        float[] fArr2 = null;
        if (i < this.f42988) {
            this.f42985 = i6;
            this.f42988 = i6;
            this.f42994 = 0.0f;
            this.f42987 = null;
        }
        while (true) {
            int i8 = this.f42988;
            if (i8 >= i) {
                break;
            }
            float f2 = this.f42994;
            if (f2 >= f) {
                break;
            }
            C6585 c6585 = this.f42993;
            C4916 c4916 = c6585.f22196;
            if (i8 < i2) {
                if (i8 >= this.f42985) {
                    IntUnaryOperator intUnaryOperator = this.f42986;
                    int iMin = intUnaryOperator == null ? i2 : Math.min(i2, intUnaryOperator.applyAsInt(i8));
                    this.f42985 = iMin;
                    if (iMin <= this.f42988) {
                        throw new IllegalArgumentException("Invalid text segment end");
                    }
                }
                int i9 = this.f42988;
                int i10 = this.f42985;
                CharSequence charSequence = this.f42996;
                int iM45558 = C20149.m45558(i9, i10, charSequence);
                float[] fArr3 = this.f42987;
                if (fArr3 != null && (i3 = this.f42988) >= (i4 = this.f42984) && i3 < this.f42995) {
                    this.f42994 = this.f42991 + fArr3[(iM45558 - i4) - i7];
                } else if (m32045(this.f42988)) {
                    this.f42984 = this.f42988;
                    this.f42995 = iM45558;
                    while (true) {
                        int i11 = this.f42995;
                        int i12 = this.f42985;
                        if (i11 >= i12) {
                            break;
                        }
                        int iM45559 = C20149.m45558(i11, i12, charSequence);
                        int i13 = this.f42995;
                        if (iM45559 - i13 == i7 && !m32045(i13)) {
                            break;
                        }
                        this.f42995 = iM45559;
                    }
                    int i14 = this.f42995;
                    int i15 = this.f42984;
                    int i16 = i14 - i15;
                    char[] cArr = new char[i16];
                    TextUtils.getChars(charSequence, i15, i14, cArr, 0);
                    float[] fArr4 = new float[i16];
                    this.f42987 = fArr4;
                    c4916.getTextWidths(cArr, 0, i16, fArr4);
                    double d = 0.0d;
                    int i17 = 0;
                    while (i17 < i16) {
                        float[] fArr5 = this.f42987;
                        int i18 = i17;
                        d += (double) fArr5[i17];
                        fArr5[i18] = (float) Math.ceil(d);
                        i17 = i18 + 1;
                    }
                    this.f42987[i16 - 1] = c4916.measureText(cArr, 0, i16);
                    int i19 = this.f42984;
                    while (true) {
                        int i20 = this.f42995;
                        if (i19 >= i20) {
                            break;
                        }
                        int iM455510 = C20149.m45558(i19, i20, charSequence);
                        int i21 = this.f42984;
                        float f3 = i19 == i21 ? 0.0f : this.f42987[(i19 - i21) - 1];
                        while (true) {
                            i19++;
                            if (i19 < iM455510) {
                                this.f42987[(i19 - this.f42984) - 1] = f3;
                            }
                        }
                        i19 = iM455510;
                    }
                    float f4 = this.f42994;
                    this.f42991 = f4;
                    this.f42994 = f4 + this.f42987[(iM45558 - this.f42984) - 1];
                    fArr2 = null;
                } else {
                    this.f42987 = fArr2;
                    float f5 = this.f42994;
                    this.f42994 = c6585.m17858(charSequence, this.f42988, iM45558, this.f42990 + f5) + f5;
                }
                this.f42988 = iM45558;
            }
            if (this.f42988 > i) {
                return Math.min(f, f2);
            }
            i7 = 1;
        }
        return Math.min(f, this.f42994);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m32048(float f) {
        int i;
        int i2;
        float f2;
        if (f <= 0.0f) {
            return this.f42989;
        }
        do {
            i = this.f42988;
            i2 = this.f42992;
            if (i >= i2) {
                return i2;
            }
            f2 = this.f42994;
        } while (((m32047(Float.POSITIVE_INFINITY, C20149.m45558(i, i2, this.f42996)) - f2) / 2.0f) + f2 <= f);
        return i;
    }
}
