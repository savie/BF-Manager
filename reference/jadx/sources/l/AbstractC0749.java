package l;

import java.io.IOException;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: l.֡᩹᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P1SF */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0749 extends AbstractC20886 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f2727;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public int f2728;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final AbstractC25362 f2729;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final int[][] f2730;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C14918 f2731;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f2732;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14918 f2733;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int[] f2734;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f2735;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C7461 f2736;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f2737;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int[][] f2738;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f2739;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f2740;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C18648 f2741;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public abstract int mo3097();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC0749 m3083(C7461 c7461, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, C0573 c0573) {
        if (i3 == 1) {
            return new C8207(c7461, i, i2, i4, i5, i6, i7, i8, c0573);
        }
        if (i3 == 2) {
            return new C19394(c7461, i, i2, i4, i5, i6, i7, i8, c0573);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3092(C0573 c0573) {
        this.f2729.mo17391(c0573);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m3086(int i) {
        if (i <= 4 && i >= 0) {
            return i;
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
        return ((31 - iNumberOfLeadingZeros) << 1) + ((i >>> (30 - iNumberOfLeadingZeros)) & 1);
    }

    public AbstractC0749(C7461 c7461, AbstractC25362 abstractC25362, int i, int i2, int i3, int i4) {
        super(i2);
        this.f2728 = 0;
        this.f2735 = 0;
        Class cls = Integer.TYPE;
        this.f2730 = (int[][]) Array.newInstance((Class<?>) cls, 4, 128);
        this.f2734 = new int[16];
        this.f2740 = 0;
        this.f2727 = -1;
        this.f2737 = 0;
        this.f2736 = c7461;
        this.f2729 = abstractC25362;
        this.f2739 = i4;
        this.f2741 = new C18648(this, i);
        this.f2733 = new C14918(this, i2, i4);
        this.f2731 = new C14918(this, i2, i4);
        int iM3086 = m3086(i3 - 1) + 1;
        this.f2732 = iM3086;
        this.f2738 = (int[][]) Array.newInstance((Class<?>) cls, 4, iM3086);
        mo3090();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC25362 m3094() {
        return this.f2729;
    }

    @Override // l.AbstractC20886
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo3090() {
        super.mo3090();
        this.f2741.m43412();
        this.f2733.mo35895();
        this.f2731.mo35895();
        this.f2728 = 0;
        this.f2735 = 0;
        this.f2737 = this.f2727 + 1 + this.f2737;
        this.f2727 = -1;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m3096() {
        return this.f2737;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m3095() {
        this.f2737 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m3098() {
        try {
            if (!this.f2729.m56728() && !m3082()) {
                return false;
            }
            while (this.f2737 <= 2096879 && this.f2736.m20491() <= 65510) {
                if (!m3085()) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            throw new Error();
        }
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    private boolean m3082() {
        if (!this.f2729.m56727(0)) {
            return false;
        }
        m3091(1);
        this.f2736.m20489(this.f66851[this.f66848.m5322()], 0, 0);
        this.f2741.m43413();
        this.f2727--;
        this.f2737++;
        return true;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    private boolean m3085() {
        int i = this.f2727 + 1;
        AbstractC25362 abstractC25362 = this.f2729;
        if (!abstractC25362.m56727(i)) {
            return false;
        }
        int iMo3097 = mo3097();
        int iM56722 = (abstractC25362.m56722() - this.f2727) & this.f66845;
        int i2 = this.f2740;
        short[][] sArr = this.f66851;
        C1495 c1495 = this.f66848;
        C7461 c7461 = this.f2736;
        if (i2 == -1) {
            c7461.m20489(sArr[c1495.m5322()], iM56722, 0);
            this.f2741.m43411();
        } else {
            c7461.m20489(sArr[c1495.m5322()], iM56722, 1);
            int i3 = this.f2740;
            int[] iArr = this.f66852;
            short[] sArr2 = this.f66849;
            if (i3 < 4) {
                c7461.m20489(sArr2, c1495.m5322(), 1);
                int i4 = this.f2740;
                short[] sArr3 = this.f66847;
                if (i4 == 0) {
                    c7461.m20489(sArr3, c1495.m5322(), 0);
                    c7461.m20489(this.f66846[c1495.m5322()], iM56722, iMo3097 != 1 ? 1 : 0);
                } else {
                    int i5 = iArr[i4];
                    c7461.m20489(sArr3, c1495.m5322(), 1);
                    short[] sArr4 = this.f66843;
                    if (i4 == 1) {
                        c7461.m20489(sArr4, c1495.m5322(), 0);
                    } else {
                        c7461.m20489(sArr4, c1495.m5322(), 1);
                        c7461.m20489(this.f66841, c1495.m5322(), i4 - 2);
                        if (i4 == 3) {
                            iArr[3] = iArr[2];
                        }
                        iArr[2] = iArr[1];
                    }
                    iArr[1] = iArr[0];
                    iArr[0] = i5;
                }
                if (iMo3097 == 1) {
                    c1495.m5325();
                } else {
                    this.f2731.m35896(iMo3097, iM56722);
                    c1495.m5327();
                }
            } else {
                c7461.m20489(sArr2, c1495.m5322(), 0);
                int i6 = this.f2740 - 4;
                c1495.m5326();
                this.f2733.m35896(iMo3097, iM56722);
                int iM3086 = m3086(i6);
                c7461.m20488(this.f66850[iMo3097 < 6 ? iMo3097 - 2 : 3], iM3086);
                if (iM3086 >= 4) {
                    int i7 = iM3086 >>> 1;
                    int i8 = i6 - (((iM3086 & 1) | 2) << (i7 - 1));
                    if (iM3086 < 14) {
                        short[] sArr5 = this.f66844[iM3086 - 4];
                        int length = sArr5.length | i8;
                        int i9 = 1;
                        do {
                            int i10 = length & 1;
                            length >>>= 1;
                            c7461.m20489(sArr5, i9, i10);
                            i9 = (i9 << 1) | i10;
                        } while (length != 1);
                    } else {
                        c7461.m20485(i8 >>> 4, i7 - 5);
                        short[] sArr6 = this.f66842;
                        int length2 = (i8 & 15) | sArr6.length;
                        int i11 = 1;
                        do {
                            int i12 = length2 & 1;
                            length2 >>>= 1;
                            c7461.m20489(sArr6, i11, i12);
                            i11 = (i11 << 1) | i12;
                        } while (length2 != 1);
                        this.f2735--;
                    }
                }
                iArr[3] = iArr[2];
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i6;
                this.f2728--;
            }
        }
        this.f2727 -= iMo3097;
        this.f2737 += iMo3097;
        return true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C17902 m3099() {
        this.f2727++;
        return this.f2729.mo17392();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3091(int i) {
        this.f2727 += i;
        this.f2729.mo17393(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3089(int i, C1495 c1495, int i2) {
        return m3088(C7461.m20481(this.f66849[c1495.m5322()], 1) + C7461.m20481(this.f66851[c1495.m5322()][i2], 1), 0, c1495, i2) + this.f2731.m35897(i, i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3088(int i, int i2, C1495 c1495, int i3) {
        short[] sArr = this.f66847;
        if (i2 == 0) {
            return C7461.m20481(this.f66846[c1495.m5322()][i3], 1) + C7461.m20481(sArr[c1495.m5322()], 0) + i;
        }
        int iM20481 = C7461.m20481(sArr[c1495.m5322()], 1) + i;
        short[] sArr2 = this.f66843;
        if (i2 == 1) {
            return C7461.m20481(sArr2[c1495.m5322()], 0) + iM20481;
        }
        return C7461.m20481(this.f66841[c1495.m5322()], i2 - 2) + C7461.m20481(sArr2[c1495.m5322()], 1) + iM20481;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m3087(int i, int i2, int i3, int i4) {
        int iM35897 = i + this.f2733.m35897(i3, i4);
        int i5 = i3 < 6 ? i3 - 2 : 3;
        if (i2 < 128) {
            return iM35897 + this.f2730[i5][i2];
        }
        return this.f2738[i5][m3086(i2)] + this.f2734[i2 & 15] + iM35897;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m3093() {
        int[][] iArr;
        int i;
        int[][] iArr2;
        int i2;
        int i3 = 1;
        if (this.f2728 <= 0) {
            this.f2728 = 128;
            int i4 = 0;
            while (true) {
                iArr = this.f2730;
                i = 14;
                iArr2 = this.f2738;
                if (i4 >= 4) {
                    break;
                }
                int i5 = 0;
                while (true) {
                    i2 = this.f2732;
                    if (i5 >= i2) {
                        break;
                    }
                    iArr2[i4][i5] = C7461.m20482(this.f66850[i4], i5);
                    i5++;
                }
                while (i < i2) {
                    int[] iArr3 = iArr2[i4];
                    int i6 = iArr3[i];
                    int i7 = C7461.f24584;
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
                short[][] sArr = this.f66844;
                int length = sArr[i12].length;
                int i13 = 0;
                while (i13 < length) {
                    short[] sArr2 = sArr[i12];
                    int i14 = C7461.f24584;
                    int length2 = (i10 - i11) | sArr2.length;
                    int iM20481 = 0;
                    int i15 = 1;
                    do {
                        int i16 = length2 & 1;
                        length2 >>>= i3;
                        iM20481 += C7461.m20481(sArr2[i15], i16);
                        i15 = (i15 << 1) | i16;
                        i3 = 1;
                    } while (length2 != 1);
                    for (int i17 = 0; i17 < 4; i17++) {
                        iArr[i17][i10] = iArr2[i17][i9] + iM20481;
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
        if (this.f2735 <= 0) {
            this.f2735 = 16;
            for (int i18 = 0; i18 < 16; i18++) {
                int i19 = C7461.f24584;
                short[] sArr3 = this.f66842;
                int length3 = sArr3.length | i18;
                int iM20482 = 0;
                int i20 = 1;
                do {
                    int i21 = length3 & 1;
                    length3 >>>= 1;
                    iM20482 += C7461.m20481(sArr3[i20], i21);
                    i20 = (i20 << 1) | i21;
                } while (length3 != 1);
                this.f2734[i18] = iM20482;
            }
        }
        this.f2733.m35898();
        this.f2731.m35898();
    }
}
