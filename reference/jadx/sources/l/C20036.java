package l;

import com.alipay.sdk.app.OpenAuthTask;
import java.nio.ShortBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ᩴ᩵ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68KO */
/* JADX INFO: loaded from: classes5.dex */
public final class C20036 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f64354;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final float f64355;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final float f64356;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public double f64357;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f64358;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f64359;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final short[] f64360;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f64361;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f64362;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f64363;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f64364;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f64365;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public short[] f64366;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f64367;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f64368;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f64369;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public short[] f64370;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final float f64371;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f64372;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public short[] f64373;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f64374;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public int f64375;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f64376;

    public C20036(float f, int i, float f2, int i2, int i3) {
        this.f64365 = i;
        this.f64372 = i2;
        this.f64371 = f;
        this.f64355 = f2;
        this.f64356 = i / i3;
        this.f64376 = i / 400;
        int i4 = i / 65;
        this.f64358 = i4;
        int i5 = i4 * 2;
        this.f64354 = i5;
        this.f64360 = new short[i5];
        this.f64373 = new short[i5 * i2];
        this.f64366 = new short[i5 * i2];
        this.f64370 = new short[i5 * i2];
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m46086() {
        return this.f64369 * this.f64372 * 2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m46088(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i = this.f64372;
        int i2 = iRemaining / i;
        short[] sArrM46081 = m46081(this.f64373, this.f64369, i2);
        this.f64373 = sArrM46081;
        shortBuffer.get(sArrM46081, this.f64369 * i, ((i2 * i) * 2) / 2);
        this.f64369 += i2;
        m46082();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46085(ShortBuffer shortBuffer) {
        C20782.m47568(this.f64374 >= 0);
        int iRemaining = shortBuffer.remaining();
        int i = this.f64372;
        int iMin = Math.min(iRemaining / i, this.f64374);
        shortBuffer.put(this.f64366, 0, iMin * i);
        int i2 = this.f64374 - iMin;
        this.f64374 = i2;
        short[] sArr = this.f64366;
        System.arraycopy(sArr, iMin * i, sArr, 0, i2 * i);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m46089() {
        int i = this.f64369;
        float f = this.f64371;
        float f2 = this.f64355;
        double d = f / f2;
        double d2 = this.f64356 * f2;
        int i2 = this.f64364;
        int i3 = this.f64374 + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + this.f64357) + ((double) this.f64362)) / d2) + 0.5d));
        this.f64357 = 0.0d;
        short[] sArr = this.f64373;
        int i4 = this.f64354 * 2;
        this.f64373 = m46081(sArr, i, i4 + i);
        int i5 = 0;
        while (true) {
            int i6 = this.f64372;
            if (i5 >= i4 * i6) {
                break;
            }
            this.f64373[(i6 * i) + i5] = 0;
            i5++;
        }
        this.f64369 = i4 + this.f64369;
        m46082();
        if (this.f64374 > i3) {
            this.f64374 = Math.max(i3, 0);
        }
        this.f64369 = 0;
        this.f64364 = 0;
        this.f64362 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46084() {
        this.f64369 = 0;
        this.f64374 = 0;
        this.f64362 = 0;
        this.f64368 = 0;
        this.f64367 = 0;
        this.f64364 = 0;
        this.f64375 = 0;
        this.f64359 = 0;
        this.f64361 = 0;
        this.f64363 = 0;
        this.f64357 = 0.0d;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m46087() {
        C20782.m47568(this.f64374 >= 0);
        return this.f64374 * this.f64372 * 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private short[] m46081(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f64372;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m46080(short[] sArr, int i, int i2) {
        short[] sArrM46081 = m46081(this.f64366, this.f64374, i2);
        this.f64366 = sArrM46081;
        int i3 = this.f64372;
        System.arraycopy(sArr, i * i3, sArrM46081, this.f64374 * i3, i3 * i2);
        this.f64374 += i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m46083(short[] sArr, int i, int i2) {
        int i3 = this.f64354 / i2;
        int i4 = this.f64372;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C12669.m31436(i7, i5, i6, i9)];
            }
            this.f64360[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m46078(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f64372;
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
        this.f64361 = i6 / i7;
        this.f64363 = i8 / i5;
        return i7;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m46082() {
        int i;
        int i2;
        int iM46078;
        int i3;
        int iRound;
        int iRound2;
        int i4;
        int i5;
        int i6;
        int i7;
        long j;
        long j2;
        int i8 = this.f64374;
        float f = this.f64371;
        float f2 = this.f64355;
        double d = f / f2;
        float f3 = this.f64356 * f2;
        int i9 = this.f64365;
        int i10 = 1;
        int i11 = this.f64372;
        int i12 = 0;
        if (d > 1.0000100135803223d || d < 0.9999899864196777d) {
            int i13 = this.f64369;
            int i14 = this.f64354;
            if (i13 >= i14) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f64364;
                    if (i16 > 0) {
                        int iMin = Math.min(i14, i16);
                        m46080(this.f64373, i15, iMin);
                        this.f64364 -= iMin;
                        i15 += iMin;
                        i2 = i8;
                        i = i9;
                    } else {
                        short[] sArr = this.f64373;
                        int i17 = i9 > 4000 ? i9 / OpenAuthTask.SYS_ERR : 1;
                        int i18 = this.f64358;
                        int i19 = this.f64376;
                        if (i11 == i10 && i17 == i10) {
                            iM46078 = m46078(sArr, i15, i19, i18);
                            i2 = i8;
                            i = i9;
                        } else {
                            m46083(sArr, i15, i17);
                            i = i9;
                            i2 = i8;
                            short[] sArr2 = this.f64360;
                            iM46078 = m46078(sArr2, i12, i19 / i17, i18 / i17);
                            if (i17 != 1) {
                                int i20 = iM46078 * i17;
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
                                    iM46078 = m46078(sArr, i15, i19, i18);
                                } else {
                                    m46083(sArr, i15, 1);
                                    iM46078 = m46078(sArr2, i12, i19, i18);
                                }
                            }
                        }
                        int i24 = this.f64361;
                        int i25 = this.f64363;
                        if (i24 == 0 || (i3 = this.f64375) == 0 || i25 > i24 * 3 || i24 * 2 <= this.f64359 * 3) {
                            i3 = iM46078;
                        }
                        this.f64359 = i24;
                        this.f64375 = iM46078;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f64373;
                            if (d >= 2.0d) {
                                double d2 = (((double) i3) / (d - 1.0d)) + this.f64357;
                                iRound2 = (int) Math.round(d2);
                                this.f64357 = d2 - ((double) iRound2);
                            } else {
                                double d3 = (((2.0d - d) * ((double) i3)) / (d - 1.0d)) + this.f64357;
                                int iRound3 = (int) Math.round(d3);
                                this.f64364 = iRound3;
                                this.f64357 = d3 - ((double) iRound3);
                                iRound2 = i3;
                            }
                            short[] sArrM46081 = m46081(this.f64366, this.f64374, iRound2);
                            this.f64366 = sArrM46081;
                            int i26 = i15;
                            m46079(iRound2, this.f64372, sArrM46081, this.f64374, sArr3, i26, sArr3, i15 + i3);
                            this.f64374 += iRound2;
                            i15 = i3 + iRound2 + i26;
                        } else {
                            int i27 = i15;
                            short[] sArr4 = this.f64373;
                            if (d < 0.5d) {
                                double d4 = ((((double) i3) * d) / (1.0d - d)) + this.f64357;
                                iRound = (int) Math.round(d4);
                                this.f64357 = d4 - ((double) iRound);
                            } else {
                                double d5 = ((((2.0d * d) - 1.0d) * ((double) i3)) / (1.0d - d)) + this.f64357;
                                int iRound4 = (int) Math.round(d5);
                                this.f64364 = iRound4;
                                this.f64357 = d5 - ((double) iRound4);
                                iRound = i3;
                            }
                            int i28 = i3 + iRound;
                            short[] sArrM46082 = m46081(this.f64366, this.f64374, i28);
                            this.f64366 = sArrM46082;
                            System.arraycopy(sArr4, i27 * i11, sArrM46082, this.f64374 * i11, i3 * i11);
                            m46079(iRound, this.f64372, this.f64366, this.f64374 + i3, sArr4, i27 + i3, sArr4, i27);
                            this.f64374 += i28;
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
                int i29 = this.f64369 - i15;
                short[] sArr5 = this.f64373;
                System.arraycopy(sArr5, i15 * i11, sArr5, 0, i29 * i11);
                this.f64369 = i29;
            }
            if (f3 != 1.0f || this.f64374 == (i4 = i2)) {
            }
            int i30 = i;
            long j3 = (long) (i30 / f3);
            long j4 = i30;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i31 = this.f64374 - i4;
            short[] sArrM46083 = m46081(this.f64370, this.f64362, i31);
            this.f64370 = sArrM46083;
            System.arraycopy(this.f64366, i4 * i11, sArrM46083, this.f64362 * i11, i31 * i11);
            this.f64374 = i4;
            this.f64362 += i31;
            int i32 = 0;
            while (true) {
                i5 = this.f64362;
                i6 = i5 - 1;
                if (i32 >= i6) {
                    break;
                }
                while (true) {
                    i7 = this.f64368 + 1;
                    j = i7;
                    long j5 = j * j3;
                    j2 = this.f64367;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    this.f64366 = m46081(this.f64366, this.f64374, 1);
                    int i33 = 0;
                    while (i33 < i11) {
                        short[] sArr6 = this.f64366;
                        int i34 = (this.f64374 * i11) + i33;
                        short[] sArr7 = this.f64370;
                        int i35 = (i32 * i11) + i33;
                        short s = sArr7[i35];
                        short s2 = sArr7[i35 + i11];
                        long j6 = ((long) this.f64367) * j4;
                        int i36 = this.f64368;
                        int i37 = i33;
                        long j7 = ((long) (i36 + 1)) * j3;
                        long j8 = j7 - j6;
                        long j9 = j7 - (((long) i36) * j3);
                        sArr6[i34] = (short) ((((j9 - j8) * ((long) s2)) + (((long) s) * j8)) / j9);
                        i33 = i37 + 1;
                        j4 = j4;
                    }
                    this.f64367++;
                    this.f64374++;
                    j4 = j4;
                }
                long j10 = j4;
                this.f64368 = i7;
                if (j == j10) {
                    this.f64368 = 0;
                    C20782.m47568(j2 == j3);
                    this.f64367 = 0;
                }
                i32++;
                j4 = j10;
            }
            if (i6 == 0) {
                return;
            }
            short[] sArr8 = this.f64370;
            System.arraycopy(sArr8, i6 * i11, sArr8, 0, (i5 - i6) * i11);
            this.f64362 -= i6;
            return;
        }
        m46080(this.f64373, 0, this.f64369);
        this.f64369 = 0;
        i2 = i8;
        i = i9;
        if (f3 != 1.0f) {
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46079(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
