package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.۟᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7669 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f25360;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public short[] f25361;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f25362;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f25363;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f25364;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f25365;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f25366;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final float f25367;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public int f25368;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f25369;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final short[] f25370;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f25371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25372;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public int f25373;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f25374;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public short[] f25375;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f25376;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public short[] f25377;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f25378;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final float f25379;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f25380;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f25381;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f25382;

    public C7669(float f, int i, float f2, int i2, int i3) {
        this.f25381 = i;
        this.f25372 = i2;
        this.f25378 = f;
        this.f25367 = f2;
        this.f25379 = i / i3;
        this.f25382 = i / 400;
        int i4 = i / 65;
        this.f25371 = i4;
        int i5 = i4 * 2;
        this.f25362 = i5;
        this.f25370 = new short[i5];
        this.f25361 = new short[i5 * i2];
        this.f25375 = new short[i5 * i2];
        this.f25377 = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m20260() {
        return this.f25364 * this.f25372 * 2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m20262(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f25372;
        int i2 = iRemaining / i;
        short[] sArrM20255 = m20255(this.f25361, this.f25364, i2);
        this.f25361 = sArrM20255;
        shortBuffer.get(sArrM20255, this.f25364 * i, ((i2 * i) * 2) / 2);
        this.f25364 += i2;
        m20254();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20259(ShortBuffer shortBuffer) {
        C2023.m6510(this.f25376 >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.f25372;
        int iMin = Math.min(iRemaining / i, this.f25376);
        shortBuffer.put(this.f25375, 0, iMin * i);
        int i2 = this.f25376 - iMin;
        this.f25376 = i2;
        short[] sArr = this.f25375;
        System.arraycopy(sArr, iMin * i, sArr, 0, i2 * i);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m20257() {
        int i = this.f25364;
        float f = this.f25378;
        float f2 = this.f25367;
        double d = f / f2;
        double d2 = this.f25379 * f2;
        int i2 = this.f25374;
        int i3 = this.f25376 + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.f25363) + ((double) this.f25368)) / d2) + 0.5d));
        this.f25363 = 0.0d;
        short[] sArr = this.f25361;
        int i4 = this.f25362 * 2;
        this.f25361 = m20255(sArr, i, i4 + i);
        int i5 = 0;
        while (true) {
            int i6 = this.f25372;
            if (i5 >= i4 * i6) {
                break;
            }
            this.f25361[(i6 * i) + i5] = 0;
            i5++;
        }
        this.f25364 = i4 + this.f25364;
        m20254();
        if (this.f25376 > i3) {
            this.f25376 = Math.max(i3, 0);
        }
        this.f25364 = 0;
        this.f25374 = 0;
        this.f25368 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m20258() {
        this.f25364 = 0;
        this.f25376 = 0;
        this.f25368 = 0;
        this.f25380 = 0;
        this.f25373 = 0;
        this.f25374 = 0;
        this.f25366 = 0;
        this.f25369 = 0;
        this.f25365 = 0;
        this.f25360 = 0;
        this.f25363 = 0.0d;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m20261() {
        C2023.m6510(this.f25376 >= 0);
        return this.f25376 * this.f25372 * 2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private short[] m20255(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f25372;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m20253(short[] sArr, int i, int i2) {
        short[] sArrM20255 = m20255(this.f25375, this.f25376, i2);
        this.f25375 = sArrM20255;
        int i3 = this.f25372;
        System.arraycopy(sArr, i * i3, sArrM20255, this.f25376 * i3, i3 * i2);
        this.f25376 += i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m20256(short[] sArr, int i, int i2) {
        int i3 = this.f25362 / i2;
        int i4 = this.f25372;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C1694.m5620(i7, i5, i6, i9)];
            }
            this.f25370[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m20251(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f25372;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f25365 = i6 / i7;
        this.f25360 = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private void m20254() {
        int i;
        int i2;
        int iM20251;
        int i3;
        int iRound;
        int iRound2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8 = this.f25376;
        float f = this.f25378;
        float f2 = this.f25367;
        double d = f / f2;
        float f3 = this.f25379 * f2;
        int i9 = this.f25381;
        int i10 = 1;
        int i11 = this.f25372;
        int i12 = 0;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.f25364;
            int i14 = this.f25362;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f25374;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        m20253(this.f25361, i15, iMin);
                        this.f25374 -= iMin;
                        i15 += iMin;
                        i2 = i8;
                        i = i9;
                    } else {
                        short[] sArr = this.f25361;
                        int i17 = i9 > 4000 ? i9 / OpenAuthTask.SYS_ERR : 1;
                        int i18 = this.f25371;
                        int i19 = this.f25382;
                        if (i11 == i10 && i17 == i10) {
                            iM20251 = m20251(sArr, i15, i19, i18);
                            i2 = i8;
                            i = i9;
                        } else {
                            m20256(sArr, i15, i17);
                            i = i9;
                            i2 = i8;
                            short[] sArr2 = this.f25370;
                            iM20251 = m20251(sArr2, i12, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iM20251 * i17;
                                int i21 = i17 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                if (i22 >= i19) {
                                    i19 = i22;
                                }
                                if (i23 <= i18) {
                                    i18 = i23;
                                }
                                if (i11 == 1) {
                                    iM20251 = m20251(sArr, i15, i19, i18);
                                } else {
                                    m20256(sArr, i15, 1);
                                    iM20251 = m20251(sArr2, i12, i19, i18);
                                }
                            }
                        }
                        int i24 = this.f25365;
                        int i25 = this.f25360;
                        if (i24 == 0 || (i3 = this.f25366) == 0 || i25 > i24 * 3 || i24 * 2 <= this.f25369 * 3) {
                            i3 = iM20251;
                        }
                        this.f25369 = i24;
                        this.f25366 = iM20251;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f25361;
                            if (d >= 2.0d) {
                                double d2 = (((double) i3) / (d - 1.0d)) + this.f25363;
                                iRound2 = (int) Math.round(d2);
                                this.f25363 = d2 - ((double) iRound2);
                            } else {
                                double d3 = (((2.0d - d) * ((double) i3)) / (d - 1.0d)) + this.f25363;
                                int iRound3 = (int) Math.round(d3);
                                this.f25374 = iRound3;
                                this.f25363 = d3 - ((double) iRound3);
                                iRound2 = i3;
                            }
                            short[] sArrM20255 = m20255(this.f25375, this.f25376, iRound2);
                            this.f25375 = sArrM20255;
                            int i26 = i15;
                            m20252(iRound2, this.f25372, sArrM20255, this.f25376, sArr3, i26, sArr3, i15 + i3);
                            this.f25376 += iRound2;
                            i15 = i3 + iRound2 + i26;
                        } else {
                            int i27 = i15;
                            short[] sArr4 = this.f25361;
                            if (d < 0.5d) {
                                double d4 = ((((double) i3) * d) / (1.0d - d)) + this.f25363;
                                iRound = (int) Math.round(d4);
                                this.f25363 = d4 - ((double) iRound);
                            } else {
                                double d5 = ((((2.0d * d) - 1.0d) * ((double) i3)) / (1.0d - d)) + this.f25363;
                                int iRound4 = (int) Math.round(d5);
                                this.f25374 = iRound4;
                                this.f25363 = d5 - ((double) iRound4);
                                iRound = i3;
                            }
                            int i28 = i3 + iRound;
                            short[] sArrM20256 = m20255(this.f25375, this.f25376, i28);
                            this.f25375 = sArrM20256;
                            System.arraycopy(sArr4, i27 * i11, sArrM20256, this.f25376 * i11, i3 * i11);
                            m20252(iRound, this.f25372, this.f25375, this.f25376 + i3, sArr4, i27 + i3, sArr4, i27);
                            this.f25376 += i28;
                            i15 = i27 + iRound;
                        }
                    }
                    if (i15 + i14 > i13) {
                        break;
                    }
                    i10 = 1;
                    i12 = 0;
                    i9 = i;
                    i8 = i2;
                }
                int i29 = this.f25364 - i15;
                short[] sArr5 = this.f25361;
                System.arraycopy(sArr5, i15 * i11, sArr5, 0, i29 * i11);
                this.f25364 = i29;
            }
            if (f3 != 1.0f || this.f25376 == (i4 = i2)) {
            }
            int i30 = i;
            long j3 = (long) (i30 / f3);
            long j4 = i30;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i31 = this.f25376 - i4;
            short[] sArrM20257 = m20255(this.f25377, this.f25368, i31);
            this.f25377 = sArrM20257;
            System.arraycopy(this.f25375, i4 * i11, sArrM20257, this.f25368 * i11, i31 * i11);
            this.f25376 = i4;
            this.f25368 += i31;
            int i32 = 0;
            while (true) {
                i5 = this.f25368;
                i6 = i5 - 1;
                if (i32 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f25380 + 1;
                    j = i7;
                    long j5 = j * j3;
                    j2 = this.f25373;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f25375 = m20255(this.f25375, this.f25376, 1);
                    int i33 = 0;
                    while (i33 < i11) {
                        short[] sArr6 = this.f25375;
                        int i34 = (this.f25376 * i11) + i33;
                        short[] sArr7 = this.f25377;
                        int i35 = (i32 * i11) + i33;
                        short s = sArr7[i35];
                        short s2 = sArr7[i35 + i11];
                        long j6 = ((long) this.f25373) * j4;
                        int i36 = this.f25380;
                        int i37 = i33;
                        long j7 = ((long) (i36 + 1)) * j3;
                        long j8 = j7 - j6;
                        long j9 = j7 - (((long) i36) * j3);
                        sArr6[i34] = (short) ((((j9 - j8) * ((long) s2)) + (((long) s) * j8)) / j9);
                        i33 = i37 + 1;
                        j4 = j4;
                    }
                    this.f25373++;
                    this.f25376++;
                    j4 = j4;
                }
                long j10 = j4;
                this.f25380 = i7;
                if (j == j10) {
                    this.f25380 = 0;
                    C2023.m6510(j2 == j3);
                    this.f25373 = 0;
                }
                i32++;
                j4 = j10;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f25377;
            System.arraycopy(sArr8, i6 * i11, sArr8, 0, (i5 - i6) * i11);
            this.f25368 -= i6;
            return;
        }
        m20253(this.f25361, 0, this.f25364);
        this.f25364 = 0;
        i2 = i8;
        i = i9;
        if (f3 != 1.0f) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m20252(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }
}
