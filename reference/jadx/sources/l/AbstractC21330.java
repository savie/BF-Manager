package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.᩸ۘۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21330 extends AbstractC5102 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20625 f69417;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14981 f69418;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f69419;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final int f69420;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[][] f69421;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C6513 f69422;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C6513 f69423;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f69424;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f69425;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int[] f69426;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f69427;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[][] f69428;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f69429;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC9606 f69430;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f69431;

    /* JADX INFO: renamed from: ۚ */
    public abstract int mo41381();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC21330 m47843(C20625 c20625, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C17720 c17720) {
        if (i3 == 1) {
            return new C17802(c20625, i, i2, i4, i5, i6, i7, i8, c17720);
        }
        if (i3 == 2) {
            return new C18508(c20625, i, i2, i4, i5, i6, i7, i8, c17720);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47852(C17720 c17720) {
        this.f69430.mo24491(c17720);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m47845(int i) {
        if (i <= 4 && i >= 0) {
            return i;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        return ((31 - iNumberOfLeadingZeros) << 1) + ((i >>> (30 - iNumberOfLeadingZeros)) & 1);
    }

    public AbstractC21330(C20625 c20625, AbstractC9606 abstractC9606, int i, int i2, int i3, int i4) {
        super(i2);
        this.f69419 = 0;
        this.f69431 = 0;
        Class cls = Integer.TYPE;
        this.f69421 = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.f69426 = new int[16];
        this.f69427 = 0;
        this.f69424 = -1;
        this.f69425 = 0;
        this.f69417 = c20625;
        this.f69430 = abstractC9606;
        this.f69429 = i4;
        this.f69418 = new C14981(this, i);
        this.f69423 = new C6513(this, i2, i4);
        this.f69422 = new C6513(this, i2, i4);
        int iM47845 = m47845(i3 - 1) + 1;
        this.f69420 = iM47845;
        this.f69428 = (int[][]) Array.newInstance((Class<?>) cls, 4, iM47845);
        mo10858();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC9606 m47853() {
        return this.f69430;
    }

    @Override // l.AbstractC5102
    /* JADX INFO: renamed from: ۙ */
    public void mo10858() {
        super.mo10858();
        this.f69418.m35958();
        this.f69423.mo17716();
        this.f69422.mo17716();
        this.f69419 = 0;
        this.f69431 = 0;
        this.f69425 = this.f69424 + 1 + this.f69425;
        this.f69424 = -1;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m47856() {
        return this.f69425;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m47846() {
        this.f69425 = 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m47855() {
        try {
            if (!this.f69430.m24484() && !m47841()) {
                return false;
            }
            while (this.f69425 <= 2096879 && this.f69417.m46494() <= 65510) {
                if (!m47844()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    private boolean m47841() {
        if (!this.f69430.m24497(0)) {
            return false;
        }
        m47851(1);
        this.f69417.m46492(this.f17778[this.f17786.m44132()], 0, 0);
        this.f69418.m35959();
        this.f69424--;
        this.f69425++;
        return true;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m47844() {
        int i = this.f69424 + 1;
        AbstractC9606 abstractC9606 = this.f69430;
        if (!abstractC9606.m24497(i)) {
            return false;
        }
        int iMo41381 = mo41381();
        int iM24493 = (abstractC9606.m24493() - this.f69424) & this.f17782;
        int i2 = this.f69427;
        short[][] sArr = this.f17778;
        C19214 c19214 = this.f17786;
        C20625 c20625 = this.f69417;
        if (i2 == -1) {
            c20625.m46492(sArr[c19214.m44132()], iM24493, 0);
            this.f69418.m35957();
        } else {
            c20625.m46492(sArr[c19214.m44132()], iM24493, 1);
            int i3 = this.f69427;
            int[] iArr = this.f17788;
            short[] sArr2 = this.f17781;
            if (i3 < 4) {
                c20625.m46492(sArr2, c19214.m44132(), 1);
                int i4 = this.f69427;
                short[] sArr3 = this.f17787;
                if (i4 == 0) {
                    c20625.m46492(sArr3, c19214.m44132(), 0);
                    c20625.m46492(this.f17777[c19214.m44132()], iM24493, iMo41381 != 1 ? 1 : 0);
                } else {
                    int i5 = iArr[i4];
                    c20625.m46492(sArr3, c19214.m44132(), 1);
                    short[] sArr4 = this.f17784;
                    if (i4 == 1) {
                        c20625.m46492(sArr4, c19214.m44132(), 0);
                    } else {
                        c20625.m46492(sArr4, c19214.m44132(), 1);
                        c20625.m46492(this.f17779, c19214.m44132(), i4 - 2);
                        if (i4 == 3) {
                            iArr[3] = iArr[2];
                        }
                        iArr[2] = iArr[1];
                    }
                    iArr[1] = iArr[0];
                    iArr[0] = i5;
                }
                if (iMo41381 == 1) {
                    c19214.m44130();
                } else {
                    this.f69422.m17717(iMo41381, iM24493);
                    c19214.m44134();
                }
            } else {
                c20625.m46492(sArr2, c19214.m44132(), 0);
                int i6 = this.f69427 - 4;
                c19214.m44137();
                this.f69423.m17717(iMo41381, iM24493);
                int iM47845 = m47845(i6);
                c20625.m46491(this.f17785[iMo41381 < 6 ? iMo41381 - 2 : 3], iM47845);
                if (iM47845 >= 4) {
                    int i7 = iM47845 >>> 1;
                    int i8 = i6 - (((iM47845 & 1) | 2) << (i7 - 1));
                    if (iM47845 < 14) {
                        short[] sArr5 = this.f17783[iM47845 - 4];
                        int length = sArr5.length | i8;
                        int i9 = 1;
                        do {
                            int i10 = length & 1;
                            length >>>= 1;
                            c20625.m46492(sArr5, i9, i10);
                            i9 = (i9 << 1) | i10;
                        } while (length != 1);
                    } else {
                        c20625.m46495(i8 >>> 4, i7 - 5);
                        short[] sArr6 = this.f17780;
                        int length2 = (i8 & 15) | sArr6.length;
                        int i11 = 1;
                        do {
                            int i12 = length2 & 1;
                            length2 >>>= 1;
                            c20625.m46492(sArr6, i11, i12);
                            i11 = (i11 << 1) | i12;
                        } while (length2 != 1);
                        this.f69431--;
                    }
                }
                iArr[3] = iArr[2];
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i6;
                this.f69419--;
            }
        }
        this.f69424 -= iMo41381;
        this.f69425 += iMo41381;
        return true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C4396 m47847() {
        this.f69424++;
        return this.f69430.mo24496();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m47851(int i) {
        this.f69424 += i;
        this.f69430.mo24483(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47850(int i, C19214 c19214, int i2) {
        return m47849(C20625.m46486(this.f17781[c19214.m44132()], 1) + C20625.m46486(this.f17778[c19214.m44132()][i2], 1), 0, c19214, i2) + this.f69422.m17718(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47849(int i, int i2, C19214 c19214, int i3) {
        short[] sArr = this.f17787;
        if (i2 == 0) {
            return C20625.m46486(this.f17777[c19214.m44132()][i3], 1) + C20625.m46486(sArr[c19214.m44132()], 0) + i;
        }
        int iM46486 = C20625.m46486(sArr[c19214.m44132()], 1) + i;
        short[] sArr2 = this.f17784;
        if (i2 == 1) {
            return C20625.m46486(sArr2[c19214.m44132()], 0) + iM46486;
        }
        return C20625.m46486(this.f17779[c19214.m44132()], i2 - 2) + C20625.m46486(sArr2[c19214.m44132()], 1) + iM46486;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m47848(int i, int i2, int i3, int i4) {
        int iM17718 = i + this.f69423.m17718(i3, i4);
        int i5 = i3 < 6 ? i3 - 2 : 3;
        if (i2 < 128) {
            return iM17718 + this.f69421[i5][i2];
        }
        return this.f69428[i5][m47845(i2)] + this.f69426[i2 & 15] + iM17718;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m47854() {
        int[][] iArr;
        int i;
        int[][] iArr2;
        int i2;
        int i3 = 1;
        if (this.f69419 <= 0) {
            this.f69419 = 128;
            int i4 = 0;
            while (true) {
                iArr = this.f69421;
                i = 14;
                iArr2 = this.f69428;
                if (i4 >= 4) {
                    break;
                }
                int i5 = 0;
                while (true) {
                    i2 = this.f69420;
                    if (i5 >= i2) {
                        break;
                    }
                    iArr2[i4][i5] = C20625.m46487(this.f17785[i4], i5);
                    i5++;
                }
                while (i < i2) {
                    int[] iArr3 = iArr2[i4];
                    int i6 = iArr3[i];
                    int i7 = C20625.f67181;
                    iArr3[i] = i6 + (((i >>> 1) - 5) << 4);
                    i++;
                }
                for (int i8 = 0; i8 < 4; i8++) {
                    iArr[i4][i8] = iArr2[i4][i8];
                }
                i4++;
            }
            int i9 = 4;
            int i10 = 4;
            while (i9 < i) {
                int i11 = ((i9 & 1) | 2) << ((i9 >>> 1) - i3);
                int i12 = i9 - 4;
                short[][] sArr = this.f17783;
                int length = sArr[i12].length;
                int i13 = 0;
                while (i13 < length) {
                    short[] sArr2 = sArr[i12];
                    int i14 = C20625.f67181;
                    int length2 = (i10 - i11) | sArr2.length;
                    int iM46486 = 0;
                    int i15 = 1;
                    do {
                        int i16 = length2 & 1;
                        length2 >>>= i3;
                        iM46486 += C20625.m46486(sArr2[i15], i16);
                        i15 = (i15 << 1) | i16;
                        i3 = 1;
                    } while (length2 != 1);
                    for (int i17 = 0; i17 < 4; i17++) {
                        iArr[i17][i10] = iArr2[i17][i9] + iM46486;
                    }
                    i10++;
                    i13++;
                    i3 = 1;
                }
                i9++;
                i = 14;
                i3 = 1;
            }
        }
        if (this.f69431 <= 0) {
            this.f69431 = 16;
            for (int i18 = 0; i18 < 16; i18++) {
                int i19 = C20625.f67181;
                short[] sArr3 = this.f17780;
                int length3 = sArr3.length | i18;
                int iM46487 = 0;
                int i20 = 1;
                do {
                    int i21 = length3 & 1;
                    length3 >>>= 1;
                    iM46487 += C20625.m46486(sArr3[i20], i21);
                    i20 = (i20 << 1) | i21;
                } while (length3 != 1);
                this.f69426[i18] = iM46487;
            }
        }
        this.f69423.m17719();
        this.f69422.m17719();
    }
}
