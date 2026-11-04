package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۤ۠ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C10744 implements InterfaceC7762 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final InterfaceC12062 f34110;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean f34111;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f34112;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f34113;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18775 f34114;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int f34115;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final AbstractC7038 f34116;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int[] f34117;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final int f34118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19695 f34119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object[] f34120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f34121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f34122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final AbstractC4077 f34123;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final AbstractC3990 f34124;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f34125;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[] f34109 = new int[0];

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f34108 = C22832.m51515();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m27376(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static long m27383(int i) {
        return i & 1048575;
    }

    public C10744(int[] iArr, Object[] objArr, int i, int i2, InterfaceC18775 interfaceC18775, int[] iArr2, int i3, int i4, InterfaceC19695 interfaceC19695, AbstractC7038 abstractC7038, AbstractC3990 abstractC3990, AbstractC4077 abstractC4077, InterfaceC12062 interfaceC12062) {
        this.f34112 = iArr;
        this.f34120 = objArr;
        this.f34125 = i;
        this.f34115 = i2;
        this.f34113 = interfaceC18775 instanceof AbstractC22701;
        this.f34121 = abstractC4077 != null && abstractC4077.mo2101(interfaceC18775);
        this.f34111 = true;
        this.f34117 = iArr2;
        this.f34122 = i3;
        this.f34118 = i4;
        this.f34119 = interfaceC19695;
        this.f34116 = abstractC7038;
        this.f34124 = abstractC3990;
        this.f34123 = abstractC4077;
        this.f34114 = interfaceC18775;
        this.f34110 = interfaceC12062;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x0120  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:63:0x014c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0151  */
    /* JADX WARN: Code duplicated, block: B:66:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0162  */
    /* JADX WARN: Code duplicated, block: B:69:0x016b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0171  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:80:0x0197  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10744 m27358(InterfaceC18029 interfaceC18029, InterfaceC19695 interfaceC19695, AbstractC7038 abstractC7038, AbstractC3990 abstractC3990, AbstractC4077 abstractC4077, InterfaceC12062 interfaceC12062) {
        int iM25908;
        int iM25909;
        int i;
        int[] iArr;
        int i2;
        int iM14338;
        int i3;
        long jM51527;
        int iM51527;
        int iNumberOfTrailingZeros;
        int i4;
        int i5;
        int i6;
        Class clsM25906;
        int i7;
        if (!(interfaceC18029 instanceof C20441)) {
            C15176 c15176 = (C15176) interfaceC18029;
            C10042[] c10042ArrM36492 = c15176.m36492();
            if (c10042ArrM36492.length == 0) {
                iM25908 = 0;
                iM25909 = 0;
            } else {
                iM25908 = c10042ArrM36492[0].m25908();
                iM25909 = c10042ArrM36492[c10042ArrM36492.length - 1].m25908();
            }
            int length = c10042ArrM36492.length;
            int[] iArr2 = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            int i8 = 0;
            int i9 = 0;
            for (C10042 c10042 : c10042ArrM36492) {
                if (c10042.getType() == EnumC4561.f16223) {
                    i8++;
                } else if (c10042.getType().m14338() >= 18 && c10042.getType().m14338() <= 49) {
                    i9++;
                }
            }
            int[] iArr3 = i8 > 0 ? new int[i8] : null;
            int[] iArr4 = i9 > 0 ? new int[i9] : null;
            int[] iArrM36494 = c15176.m36494();
            int[] iArr5 = f34109;
            if (iArrM36494 == null) {
                iArrM36494 = iArr5;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i10 < c10042ArrM36492.length) {
                C10042 c10043 = c10042ArrM36492[i10];
                C10042[] c10042Arr = c10042ArrM36492;
                int iM259010 = c10043.m25908();
                C1796 c1796M25914 = c10043.m25914();
                if (c1796M25914 != null) {
                    iM14338 = c10043.getType().m14338() + 51;
                    i = iM25909;
                    iArr = iArr5;
                    int iM51528 = (int) C22832.m51527(c1796M25914.m6275());
                    jM51527 = C22832.m51527(c1796M25914.m6274());
                    i2 = i10;
                    i3 = iM51528;
                } else {
                    i = iM25909;
                    iArr = iArr5;
                    EnumC4561 type = c10043.getType();
                    i2 = i10;
                    int iM51529 = (int) C22832.m51527(c10043.m25910());
                    iM14338 = type.m14338();
                    if (!type.m14336() && !type.m14335()) {
                        Field fieldM25909 = c10043.m25909();
                        iM51527 = fieldM25909 == null ? 1048575 : (int) C22832.m51527(fieldM25909);
                        iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(c10043.m25913());
                        i4 = iM51529;
                    } else {
                        i3 = iM51529;
                        if (c10043.m25905() == null) {
                            iM51527 = 0;
                        } else {
                            jM51527 = C22832.m51527(c10043.m25905());
                        }
                        i4 = i3;
                        iNumberOfTrailingZeros = 0;
                    }
                    iArr2[i11] = c10043.m25908();
                    int i15 = i11 + 1;
                    if (c10043.m25911()) {
                        i5 = 536870912;
                    } else {
                        i5 = 0;
                    }
                    if (c10043.m25907()) {
                        i6 = 268435456;
                    } else {
                        i6 = 0;
                    }
                    iArr2[i15] = i5 | i6 | (iM14338 << 20) | i4;
                    iArr2[i11 + 2] = iM51527 | (iNumberOfTrailingZeros << 20);
                    clsM25906 = c10043.m25906();
                    if (c10043.m25904() != null) {
                        i7 = (i11 / 3) * 2;
                        objArr[i7] = c10043.m25904();
                        if (clsM25906 != null) {
                            objArr[i7 + 1] = clsM25906;
                        } else if (c10043.m25912() != null) {
                            objArr[i7 + 1] = c10043.m25912();
                        }
                    } else if (clsM25906 != null) {
                        objArr[((i11 / 3) * 2) + 1] = clsM25906;
                    } else if (c10043.m25912() != null) {
                        objArr[((i11 / 3) * 2) + 1] = c10043.m25912();
                    }
                    if (i12 < iArrM36494.length && iArrM36494[i12] == iM259010) {
                        iArrM36494[i12] = i11;
                        i12++;
                    }
                    if (c10043.getType() == EnumC4561.f16223) {
                        iArr3[i13] = i11;
                        i13++;
                    } else if (c10043.getType().m14338() < 18 && c10043.getType().m14338() <= 49) {
                        iArr4[i14] = (int) C22832.m51527(c10043.m25910());
                        i14++;
                    }
                    i10 = i2 + 1;
                    i11 += 3;
                    c10042ArrM36492 = c10042Arr;
                    iM25909 = i;
                    iArr5 = iArr;
                }
                iM51527 = (int) jM51527;
                i4 = i3;
                iNumberOfTrailingZeros = 0;
                iArr2[i11] = c10043.m25908();
                int i16 = i11 + 1;
                if (c10043.m25911()) {
                    i5 = 536870912;
                } else {
                    i5 = 0;
                }
                if (c10043.m25907()) {
                    i6 = 268435456;
                } else {
                    i6 = 0;
                }
                iArr2[i16] = i5 | i6 | (iM14338 << 20) | i4;
                iArr2[i11 + 2] = iM51527 | (iNumberOfTrailingZeros << 20);
                clsM25906 = c10043.m25906();
                if (c10043.m25904() != null) {
                    i7 = (i11 / 3) * 2;
                    objArr[i7] = c10043.m25904();
                    if (clsM25906 != null) {
                        objArr[i7 + 1] = clsM25906;
                    } else if (c10043.m25912() != null) {
                        objArr[i7 + 1] = c10043.m25912();
                    }
                } else if (clsM25906 != null) {
                    objArr[((i11 / 3) * 2) + 1] = clsM25906;
                } else if (c10043.m25912() != null) {
                    objArr[((i11 / 3) * 2) + 1] = c10043.m25912();
                }
                if (i12 < iArrM36494.length) {
                    iArrM36494[i12] = i11;
                    i12++;
                }
                if (c10043.getType() == EnumC4561.f16223) {
                    iArr3[i13] = i11;
                    i13++;
                } else if (c10043.getType().m14338() < 18) {
                }
                i10 = i2 + 1;
                i11 += 3;
                c10042ArrM36492 = c10042Arr;
                iM25909 = i;
                iArr5 = iArr;
            }
            int i17 = iM25909;
            int[] iArr6 = iArr5;
            if (iArr3 == null) {
                iArr3 = iArr6;
            }
            if (iArr4 == null) {
                iArr4 = iArr6;
            }
            int[] iArr7 = new int[iArrM36494.length + iArr3.length + iArr4.length];
            System.arraycopy(iArrM36494, 0, iArr7, 0, iArrM36494.length);
            System.arraycopy(iArr3, 0, iArr7, iArrM36494.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr7, iArrM36494.length + iArr3.length, iArr4.length);
            return new C10744(iArr2, objArr, iM25908, i17, c15176.mo36493(), iArr7, iArrM36494.length, iArrM36494.length + iArr3.length, interfaceC19695, abstractC7038, abstractC3990, abstractC4077, interfaceC12062);
        }
        throw null;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final Object mo21139() {
        return this.f34119.mo32393(this.f34114);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo21144(AbstractC22701 abstractC22701, AbstractC22701 abstractC22702) {
        int[] iArr = this.f34112;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM43985 = true;
            if (i >= length) {
                AbstractC3990 abstractC3990 = this.f34124;
                if (abstractC3990.mo3901(abstractC22701).equals(abstractC3990.mo3901(abstractC22702))) {
                    if (!this.f34121) {
                        return true;
                    }
                    AbstractC4077 abstractC4077 = this.f34123;
                    return abstractC4077.mo2097((Object) abstractC22701).equals(abstractC4077.mo2097((Object) abstractC22702));
                }
            } else {
                int iM27375 = m27375(i);
                long j = iM27375 & 1048575;
                switch (m27376(iM27375)) {
                    case 0:
                        if (!m27369(abstractC22701, abstractC22702, i) || Double.doubleToLongBits(C22832.m51522(j, abstractC22701)) != Double.doubleToLongBits(C22832.m51522(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 1:
                        if (!m27369(abstractC22701, abstractC22702, i) || Float.floatToIntBits(C22832.m51521(j, abstractC22701)) != Float.floatToIntBits(C22832.m51521(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 2:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51496(j, abstractC22701) != C22832.m51496(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 3:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51496(j, abstractC22701) != C22832.m51496(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 4:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 5:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51496(j, abstractC22701) != C22832.m51496(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 6:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 7:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51524(j, abstractC22701) != C22832.m51524(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 8:
                        if (!m27369(abstractC22701, abstractC22702, i) || !C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 9:
                        if (!m27369(abstractC22701, abstractC22702, i) || !C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 10:
                        if (!m27369(abstractC22701, abstractC22702, i) || !C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 11:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 12:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 13:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 14:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51496(j, abstractC22701) != C22832.m51496(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 15:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51514(j, abstractC22701) != C22832.m51514(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 16:
                        if (!m27369(abstractC22701, abstractC22702, i) || C22832.m51496(j, abstractC22701) != C22832.m51496(j, abstractC22702)) {
                            zM43985 = false;
                        }
                        break;
                    case 17:
                        if (!m27369(abstractC22701, abstractC22702, i) || !C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zM43985 = C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702));
                        break;
                    case 50:
                        zM43985 = C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    case 56:
                    case 57:
                    case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j2 = iArr[i + 2] & 1048575;
                        if (C22832.m51514(j2, abstractC22701) != C22832.m51514(j2, abstractC22702) || !C18949.m43985(C22832.m51520(j, abstractC22701), C22832.m51520(j, abstractC22702))) {
                            zM43985 = false;
                        }
                        break;
                }
                if (zM43985) {
                    i += 3;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final int mo21138(AbstractC22701 abstractC22701) {
        int i;
        int iM52660;
        int i2;
        int iM51514;
        int[] iArr = this.f34112;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM27375 = m27375(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM27375;
            int iHashCode = 37;
            switch (m27376(iM27375)) {
                case 0:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(Double.doubleToLongBits(C22832.m51522(j, abstractC22701)));
                    i3 = iM52660 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM52660 = Float.floatToIntBits(C22832.m51521(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(C22832.m51496(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(C22832.m51496(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 5:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(C22832.m51496(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 7:
                    i = i3 * 53;
                    iM52660 = C23447.m52661(C22832.m51524(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iM52660 = ((String) C22832.m51520(j, abstractC22701)).hashCode();
                    i3 = iM52660 + i;
                    break;
                case 9:
                    Object objM51520 = C22832.m51520(j, abstractC22701);
                    if (objM51520 != null) {
                        iHashCode = objM51520.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                    i3 = iM52660 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 14:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(C22832.m51496(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM51514 = C22832.m51514(j, abstractC22701);
                    i3 = i2 + iM51514;
                    break;
                case 16:
                    i = i3 * 53;
                    iM52660 = C23447.m52660(C22832.m51496(j, abstractC22701));
                    i3 = iM52660 + i;
                    break;
                case 17:
                    Object objM51521 = C22832.m51520(j, abstractC22701);
                    if (objM51521 != null) {
                        iHashCode = objM51521.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                    i3 = iM52660 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                    i3 = iM52660 + i;
                    break;
                case 51:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(Double.doubleToLongBits(((Double) C22832.m51520(j, abstractC22701)).doubleValue()));
                        i3 = iM52660 + i;
                    }
                    break;
                case 52:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = Float.floatToIntBits(((Float) C22832.m51520(j, abstractC22701)).floatValue());
                        i3 = iM52660 + i;
                    }
                    break;
                case 53:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(m27377(j, abstractC22701));
                        i3 = iM52660 + i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(m27377(j, abstractC22701));
                        i3 = iM52660 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case 56:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(m27377(j, abstractC22701));
                        i3 = iM52660 + i;
                    }
                    break;
                case 57:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52661(((Boolean) C22832.m51520(j, abstractC22701)).booleanValue());
                        i3 = iM52660 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = ((String) C22832.m51520(j, abstractC22701)).hashCode();
                        i3 = iM52660 + i;
                    }
                    break;
                case 60:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                        i3 = iM52660 + i;
                    }
                    break;
                case 61:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                        i3 = iM52660 + i;
                    }
                    break;
                case 62:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case 63:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case 64:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case 65:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(m27377(j, abstractC22701));
                        i3 = iM52660 + i;
                    }
                    break;
                case 66:
                    if (m27366(i5, i4, abstractC22701)) {
                        i2 = i3 * 53;
                        iM51514 = m27357(j, abstractC22701);
                        i3 = i2 + iM51514;
                    }
                    break;
                case 67:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C23447.m52660(m27377(j, abstractC22701));
                        i3 = iM52660 + i;
                    }
                    break;
                case 68:
                    if (m27366(i5, i4, abstractC22701)) {
                        i = i3 * 53;
                        iM52660 = C22832.m51520(j, abstractC22701).hashCode();
                        i3 = iM52660 + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f34124.mo3901(abstractC22701).hashCode() + (i3 * 53);
        return this.f34121 ? (iHashCode2 * 53) + this.f34123.mo2097((Object) abstractC22701).hashCode() : iHashCode2;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21141(Object obj, Object obj2) {
        m27374(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f34112;
            if (i >= iArr.length) {
                int i2 = C18949.f61453;
                AbstractC3990 abstractC3990 = this.f34124;
                abstractC3990.mo3898(obj, abstractC3990.mo3890(abstractC3990.mo3901(obj), abstractC3990.mo3901(obj2)));
                if (this.f34121) {
                    AbstractC4077 abstractC4077 = this.f34123;
                    C8551 c8551Mo2097 = abstractC4077.mo2097(obj2);
                    if (c8551Mo2097.m22908()) {
                        return;
                    }
                    abstractC4077.mo2103(obj).m22901(c8551Mo2097);
                    return;
                }
                return;
            }
            int iM27375 = m27375(i);
            long j = 1048575 & iM27375;
            int i3 = iArr[i];
            switch (m27376(iM27375)) {
                case 0:
                    if (m27367(i, obj2)) {
                        C22832.m51508(obj, j, C22832.m51522(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 1:
                    if (m27367(i, obj2)) {
                        C22832.m51509(obj, j, C22832.m51521(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 2:
                    if (m27367(i, obj2)) {
                        C22832.m51510(obj, j, C22832.m51496(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 3:
                    if (m27367(i, obj2)) {
                        C22832.m51510(obj, j, C22832.m51496(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 4:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 5:
                    if (m27367(i, obj2)) {
                        C22832.m51510(obj, j, C22832.m51496(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 6:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 7:
                    if (m27367(i, obj2)) {
                        C22832.m51518(obj, j, C22832.m51524(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 8:
                    if (m27367(i, obj2)) {
                        C22832.m51505(j, obj, C22832.m51520(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 9:
                    m27361(i, obj, obj2);
                    break;
                case 10:
                    if (m27367(i, obj2)) {
                        C22832.m51505(j, obj, C22832.m51520(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 11:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 12:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 13:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 14:
                    if (m27367(i, obj2)) {
                        C22832.m51510(obj, j, C22832.m51496(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 15:
                    if (m27367(i, obj2)) {
                        C22832.m51504(C22832.m51514(j, obj2), j, obj);
                        m27372(i, obj);
                    }
                    break;
                case 16:
                    if (m27367(i, obj2)) {
                        C22832.m51510(obj, j, C22832.m51496(j, obj2));
                        m27372(i, obj);
                    }
                    break;
                case 17:
                    m27361(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f34116.mo8612(j, obj, obj2);
                    break;
                case 50:
                    int i4 = C18949.f61453;
                    C22832.m51505(j, obj, this.f34110.mo17597(C22832.m51520(j, obj), C22832.m51520(j, obj2)));
                    break;
                case 51:
                case 52:
                case 53:
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                case 56:
                case 57:
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m27366(i3, i, obj2)) {
                        C22832.m51505(j, obj, C22832.m51520(j, obj2));
                        m27371(i3, i, obj);
                    }
                    break;
                case 60:
                    m27381(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m27366(i3, i, obj2)) {
                        C22832.m51505(j, obj, C22832.m51520(j, obj2));
                        m27371(i3, i, obj);
                    }
                    break;
                case 68:
                    m27381(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27361(int i, Object obj, Object obj2) {
        if (m27367(i, obj2)) {
            long jM27375 = m27375(i) & 1048575;
            Unsafe unsafe = f34108;
            Object object = unsafe.getObject(obj2, jM27375);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f34112[i] + " is present but null: " + obj2);
            }
            InterfaceC7762 interfaceC7762M27370 = m27370(i);
            if (!m27367(i, obj)) {
                if (!m27384(object)) {
                    unsafe.putObject(obj, jM27375, object);
                } else {
                    Object objMo21139 = interfaceC7762M27370.mo21139();
                    interfaceC7762M27370.mo21141(objMo21139, object);
                    unsafe.putObject(obj, jM27375, objMo21139);
                }
                m27372(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM27375);
            if (!m27384(object2)) {
                Object objMo211310 = interfaceC7762M27370.mo21139();
                interfaceC7762M27370.mo21141(objMo211310, object2);
                unsafe.putObject(obj, jM27375, objMo211310);
                object2 = objMo211310;
            }
            interfaceC7762M27370.mo21141(object2, object);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:239:0x0560  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e A[PHI: r11
      0x008e: PHI (r11v4 int) = 
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v12 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v1 int)
      (r11v15 int)
      (r11v1 int)
      (r11v16 int)
      (r11v1 int)
     binds: [B:21:0x005f, B:245:0x0599, B:162:0x0389, B:157:0x036a, B:152:0x034b, B:147:0x0330, B:142:0x0314, B:137:0x02f8, B:132:0x02d8, B:127:0x02b8, B:122:0x029a, B:117:0x027e, B:112:0x0262, B:107:0x0242, B:102:0x0222, B:97:0x0206, B:88:0x01ba, B:85:0x01b0, B:81:0x01a2, B:78:0x0192, B:75:0x0182, B:72:0x0172, B:69:0x0167, B:66:0x015b, B:63:0x014f, B:56:0x012b, B:61:0x0147, B:50:0x00f9, B:47:0x00e7, B:44:0x00d7, B:41:0x00c7, B:38:0x00bb, B:35:0x00af, B:32:0x0095, B:29:0x008d, B:27:0x0079, B:249:0x05b4, B:24:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x01db  */
    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final int mo21137(AbstractC9427 abstractC9427) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM35765;
        int iM35766;
        int iM35760;
        int iM35767;
        int iM35768;
        int iM35769;
        int serializedSize;
        int iM35763;
        int iM35759;
        InterfaceC18775 interfaceC18775;
        InterfaceC7762 interfaceC7762M27370;
        int iM43999;
        int iM357610;
        int size;
        int iM43990;
        int iM357611;
        int iM35772;
        int iM357612;
        int iM357613;
        int iM35764;
        int iM357614;
        int iM357615;
        Unsafe unsafe = f34108;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iM35761 = 0;
        C10744 c10744 = this;
        AbstractC9427 abstractC9428 = abstractC9427;
        while (true) {
            int[] iArr = c10744.f34112;
            if (i8 >= iArr.length) {
                AbstractC3990 abstractC3990 = c10744.f34124;
                int iMo3897 = iM35761 + abstractC3990.mo3897(abstractC3990.mo3901(abstractC9428));
                return c10744.f34121 ? iMo3897 + c10744.f34123.mo2097((Object) abstractC9428).m22911() : iMo3897;
            }
            int iM27375 = c10744.m27375(i8);
            int iM27376 = m27376(iM27375);
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 2];
            int i11 = i10 & i5;
            if (iM27376 <= 17) {
                if (i11 != i6) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(abstractC9428, i11);
                    i6 = i11;
                }
                i3 = 1 << (i10 >>> 20);
                i = i6;
                i2 = i7;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
            }
            long j = i5 & iM27375;
            if (iM27376 < EnumC4561.f16187.m14338() || iM27376 > EnumC4561.f16202.m14338()) {
                i11 = 0;
            }
            boolean z = c10744.f34111;
            switch (iM27376) {
                case 0:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35765 = AbstractC14846.m35765(i9);
                        iM35759 = iM35765 + 8;
                        iM35761 += iM35759;
                    }
                    break;
                case 1:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35766 = AbstractC14846.m35765(i9);
                        iM35768 = iM35766 + 4;
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 2:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35760(i9, unsafe.getLong(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 3:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35773(i9, unsafe.getLong(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 4:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35766(i9, unsafe.getInt(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 5:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35767 = AbstractC14846.m35765(i9);
                        iM35768 = iM35767 + 8;
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 6:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35768 = AbstractC14846.m35767(i9);
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 7:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35768 = AbstractC14846.m35772(i9);
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 8:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        Object object = unsafe.getObject(abstractC9428, j);
                        iM35761 += object instanceof AbstractC17084 ? AbstractC14846.m35761(i9, (AbstractC17084) object) : AbstractC14846.m35769((String) object) + AbstractC14846.m35765(i9);
                    }
                    c10744 = this;
                    break;
                case 9:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        Object object2 = unsafe.getObject(abstractC9428, j);
                        InterfaceC7762 interfaceC7762M27371 = c10744.m27370(i8);
                        int i12 = C18949.f61453;
                        if (object2 instanceof C10020) {
                            iM35759 = AbstractC14846.m35759(i9, (C10020) object2);
                        } else {
                            iM35769 = AbstractC14846.m35765(i9);
                            serializedSize = ((AbstractC9427) ((InterfaceC18775) object2)).getSerializedSize(interfaceC7762M27371);
                            iM35763 = AbstractC14846.m35763(serializedSize);
                            iM35759 = iM35763 + serializedSize + iM35769;
                        }
                        iM35761 += iM35759;
                    }
                    break;
                case 10:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35761(i9, (AbstractC17084) unsafe.getObject(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 11:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35764(i9, unsafe.getInt(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 12:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35760 = AbstractC14846.m35768(i9, unsafe.getInt(abstractC9428, j));
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 13:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35766 = AbstractC14846.m35765(i9);
                        iM35768 = iM35766 + 4;
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 14:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i4, i2, i3)) {
                        iM35767 = AbstractC14846.m35765(i9);
                        iM35768 = iM35767 + 8;
                        iM35761 += iM35768;
                    }
                    c10744 = this;
                    abstractC9428 = abstractC9427;
                    break;
                case 15:
                    i4 = i;
                    if (c10744.m27368(abstractC9428, i8, i, i2, i3)) {
                        int i13 = unsafe.getInt(abstractC9428, j);
                        iM35760 = AbstractC14846.m35763((i13 >> 31) ^ (i13 << 1)) + AbstractC14846.m35765(i9);
                        iM35761 += iM35760;
                    }
                    c10744 = this;
                    break;
                case 16:
                    if (c10744.m27368(abstractC9428, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(abstractC9428, j);
                        iM35761 += AbstractC14846.m35762((j2 >> 63) ^ (j2 << 1)) + AbstractC14846.m35765(i9);
                    }
                    i4 = i;
                    c10744 = this;
                    break;
                case 17:
                    if (c10744.m27368(abstractC9428, i8, i, i2, i3)) {
                        interfaceC18775 = (InterfaceC18775) unsafe.getObject(abstractC9428, j);
                        interfaceC7762M27370 = c10744.m27370(i8);
                        iM357612 = AbstractC14846.m35765(i9) * 2;
                        iM43990 = ((AbstractC9427) interfaceC18775).getSerializedSize(interfaceC7762M27370);
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 18:
                    iM43999 = C18949.m43999(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 19:
                    iM43999 = C18949.m43977(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC9428, j);
                    int i14 = C18949.f61453;
                    if (list.size() == 0) {
                        iM357610 = 0;
                    } else {
                        iM357610 = (AbstractC14846.m35765(i9) * list.size()) + C18949.m43987(list);
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC9428, j);
                    int i15 = C18949.f61453;
                    size = list2.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m43990(list2);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC9428, j);
                    int i16 = C18949.f61453;
                    size = list3.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m44000(list3);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 23:
                    iM43999 = C18949.m43999(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 24:
                    iM43999 = C18949.m43977(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC9428, j);
                    int i17 = C18949.f61453;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM35772 = 0;
                    } else {
                        iM35772 = size2 * AbstractC14846.m35772(i9);
                    }
                    iM35761 += iM35772;
                    i4 = i;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC9428, j);
                    int i18 = C18949.f61453;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM357610 = 0;
                    } else {
                        iM357610 = AbstractC14846.m35765(i9) * size3;
                        if (list5 instanceof InterfaceC9274) {
                            InterfaceC9274 interfaceC9274 = (InterfaceC9274) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objMo4025 = interfaceC9274.mo4025(i19);
                                if (objMo4025 instanceof AbstractC17084) {
                                    int size4 = ((AbstractC17084) objMo4025).size();
                                    iM357610 = AbstractC14846.m35763(size4) + size4 + iM357610;
                                } else {
                                    iM357610 = AbstractC14846.m35769((String) objMo4025) + iM357610;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof AbstractC17084) {
                                    int size5 = ((AbstractC17084) obj).size();
                                    iM357610 = AbstractC14846.m35763(size5) + size5 + iM357610;
                                } else {
                                    iM357610 = AbstractC14846.m35769((String) obj) + iM357610;
                                }
                            }
                        }
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC9428, j);
                    InterfaceC7762 interfaceC7762M27372 = c10744.m27370(i8);
                    int i21 = C18949.f61453;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iM35772 = 0;
                    } else {
                        int iM357616 = AbstractC14846.m35765(i9) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj2 = list6.get(i22);
                            int iM25869 = obj2 instanceof C10020 ? ((C10020) obj2).m25869() : ((AbstractC9427) ((InterfaceC18775) obj2)).getSerializedSize(interfaceC7762M27372);
                            iM357616 += AbstractC14846.m35763(iM25869) + iM25869;
                        }
                        iM35772 = iM357616;
                    }
                    iM35761 += iM35772;
                    i4 = i;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC9428, j);
                    int i23 = C18949.f61453;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iM357610 = 0;
                    } else {
                        iM357610 = AbstractC14846.m35765(i9) * size7;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int size8 = ((AbstractC17084) list7.get(i24)).size();
                            iM357610 += AbstractC14846.m35763(size8) + size8;
                        }
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC9428, j);
                    int i25 = C18949.f61453;
                    size = list8.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m43992(list8);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC9428, j);
                    int i26 = C18949.f61453;
                    size = list9.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m43978(list9);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 31:
                    iM43999 = C18949.m43977(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 32:
                    iM43999 = C18949.m43999(i9, (List) unsafe.getObject(abstractC9428, j));
                    iM35759 = iM43999;
                    i4 = i;
                    iM35761 += iM35759;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC9428, j);
                    int i27 = C18949.f61453;
                    size = list10.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m44004(list10);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC9428, j);
                    int i28 = C18949.f61453;
                    size = list11.size();
                    if (size == 0) {
                        iM357610 = 0;
                    } else {
                        iM43990 = C18949.m43997(list11);
                        iM357611 = AbstractC14846.m35765(i9);
                        iM357612 = iM357611 * size;
                        iM357610 = iM357612 + iM43990;
                    }
                    iM35761 += iM357610;
                    i4 = i;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC9428, j);
                    int i29 = C18949.f61453;
                    iM43990 = list12.size() * 8;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC9428, j);
                    int i30 = C18949.f61453;
                    iM43990 = list13.size() * 4;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 37:
                    iM43990 = C18949.m43987((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 38:
                    iM43990 = C18949.m43990((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 39:
                    iM43990 = C18949.m44000((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC9428, j);
                    int i31 = C18949.f61453;
                    iM43990 = list14.size() * 8;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC9428, j);
                    int i32 = C18949.f61453;
                    iM43990 = list15.size() * 4;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC9428, j);
                    int i33 = C18949.f61453;
                    iM43990 = list16.size();
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 43:
                    iM43990 = C18949.m43992((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 44:
                    iM43990 = C18949.m43978((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC9428, j);
                    int i34 = C18949.f61453;
                    iM43990 = list17.size() * 4;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC9428, j);
                    int i35 = C18949.f61453;
                    iM43990 = list18.size() * 8;
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 47:
                    iM43990 = C18949.m44004((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 48:
                    iM43990 = C18949.m43997((List) unsafe.getObject(abstractC9428, j));
                    if (iM43990 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC9428, i11, iM43990);
                        }
                        iM357613 = AbstractC14846.m35765(i9);
                        iM35764 = AbstractC14846.m35763(iM43990);
                        iM357612 = iM35764 + iM357613;
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC9428, j);
                    InterfaceC7762 interfaceC7762M27373 = c10744.m27370(i8);
                    int i36 = C18949.f61453;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iM35772 = 0;
                    } else {
                        int iM357617 = 0;
                        for (int i37 = 0; i37 < size9; i37++) {
                            iM357617 += (AbstractC14846.m35765(i9) * 2) + ((AbstractC9427) ((InterfaceC18775) list19.get(i37))).getSerializedSize(interfaceC7762M27373);
                        }
                        iM35772 = iM357617;
                    }
                    iM35761 += iM35772;
                    i4 = i;
                    break;
                case 50:
                    c10744.f34110.mo17598(i9, unsafe.getObject(abstractC9428, j), c10744.m27378(i8));
                    i4 = i;
                    break;
                case 51:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM357614 = AbstractC14846.m35765(i9);
                        iM35765 = iM357614;
                        i4 = i;
                        iM35759 = iM35765 + 8;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 52:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM357615 = AbstractC14846.m35765(i9);
                        iM43999 = iM357615 + 4;
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 53:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35760(i9, m27377(j, abstractC9428));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35773(i9, m27377(j, abstractC9428));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35766(i9, m27357(j, abstractC9428));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 56:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM357614 = AbstractC14846.m35765(i9);
                        iM35765 = iM357614;
                        i4 = i;
                        iM35759 = iM35765 + 8;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 57:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35767(i9);
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35772(i9);
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        Object object3 = unsafe.getObject(abstractC9428, j);
                        iM35761 = (object3 instanceof AbstractC17084 ? AbstractC14846.m35761(i9, (AbstractC17084) object3) : AbstractC14846.m35769((String) object3) + AbstractC14846.m35765(i9)) + iM35761;
                    }
                    i4 = i;
                    break;
                case 60:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        Object object4 = unsafe.getObject(abstractC9428, j);
                        InterfaceC7762 interfaceC7762M27374 = c10744.m27370(i8);
                        int i38 = C18949.f61453;
                        if (object4 instanceof C10020) {
                            iM43999 = AbstractC14846.m35759(i9, (C10020) object4);
                            iM35759 = iM43999;
                            i4 = i;
                            iM35761 += iM35759;
                        } else {
                            int iM357618 = AbstractC14846.m35765(i9);
                            int serializedSize2 = ((AbstractC9427) ((InterfaceC18775) object4)).getSerializedSize(interfaceC7762M27374);
                            iM35769 = iM357618;
                            iM35763 = AbstractC14846.m35763(serializedSize2);
                            serializedSize = serializedSize2;
                            i4 = i;
                            iM35759 = iM35763 + serializedSize + iM35769;
                            iM35761 += iM35759;
                        }
                    } else {
                        i4 = i;
                    }
                    break;
                case 61:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35761(i9, (AbstractC17084) unsafe.getObject(abstractC9428, j));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 62:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35764(i9, m27357(j, abstractC9428));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 63:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM43999 = AbstractC14846.m35768(i9, m27357(j, abstractC9428));
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 64:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM357615 = AbstractC14846.m35765(i9);
                        iM43999 = iM357615 + 4;
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 65:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        iM357614 = AbstractC14846.m35765(i9);
                        iM35765 = iM357614;
                        i4 = i;
                        iM35759 = iM35765 + 8;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 66:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        int iM27357 = m27357(j, abstractC9428);
                        iM43999 = AbstractC14846.m35763((iM27357 >> 31) ^ (iM27357 << 1)) + AbstractC14846.m35765(i9);
                        iM35759 = iM43999;
                        i4 = i;
                        iM35761 += iM35759;
                    } else {
                        i4 = i;
                    }
                    break;
                case 67:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        long jM27377 = m27377(j, abstractC9428);
                        iM35772 = AbstractC14846.m35762((jM27377 >> 63) ^ (jM27377 << 1)) + AbstractC14846.m35765(i9);
                        iM35761 += iM35772;
                    }
                    i4 = i;
                    break;
                case 68:
                    if (c10744.m27366(i9, i8, abstractC9428)) {
                        interfaceC18775 = (InterfaceC18775) unsafe.getObject(abstractC9428, j);
                        interfaceC7762M27370 = c10744.m27370(i8);
                        iM357612 = AbstractC14846.m35765(i9) * 2;
                        iM43990 = ((AbstractC9427) interfaceC18775).getSerializedSize(interfaceC7762M27370);
                        iM357610 = iM357612 + iM43990;
                        iM35761 += iM357610;
                    }
                    i4 = i;
                    break;
                default:
                    i4 = i;
                    break;
            }
            i8 += 3;
            i6 = i4;
            i7 = i2;
            i5 = 1048575;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0031  */
    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21143(Object obj, InterfaceC18356 interfaceC18356) {
        Iterator itM22898;
        Map.Entry entry;
        C21560 c21560 = (C21560) interfaceC18356;
        c21560.getClass();
        if (EnumC21340.ASCENDING != EnumC21340.DESCENDING) {
            m27382(obj, interfaceC18356);
            return;
        }
        AbstractC3990 abstractC3990 = this.f34124;
        abstractC3990.mo3904(abstractC3990.mo3901(obj), interfaceC18356);
        boolean z = this.f34121;
        AbstractC4077 abstractC4077 = this.f34123;
        if (z) {
            C8551 c8551Mo2097 = abstractC4077.mo2097(obj);
            if (c8551Mo2097.m22908()) {
                itM22898 = null;
                entry = null;
            } else {
                itM22898 = c8551Mo2097.m22898();
                entry = (Map.Entry) itM22898.next();
            }
        } else {
            itM22898 = null;
            entry = null;
        }
        int[] iArr = this.f34112;
        int length = iArr.length;
        while (true) {
            length -= 3;
            if (length < 0) {
                while (entry != null) {
                    abstractC4077.mo2100(interfaceC18356, entry);
                    entry = itM22898.hasNext() ? (Map.Entry) itM22898.next() : null;
                }
                return;
            }
            int iM27375 = m27375(length);
            int i = iArr[length];
            while (entry != null && abstractC4077.mo2094(entry) > i) {
                abstractC4077.mo2100(interfaceC18356, entry);
                entry = itM22898.hasNext() ? (Map.Entry) itM22898.next() : null;
            }
            switch (m27376(iM27375)) {
                case 0:
                    if (m27367(length, obj)) {
                        c21560.m48992(i, C22832.m51522(iM27375 & 1048575, obj));
                    }
                    break;
                case 1:
                    if (m27367(length, obj)) {
                        c21560.m48990(C22832.m51521(iM27375 & 1048575, obj), i);
                    }
                    break;
                case 2:
                    if (m27367(length, obj)) {
                        c21560.m49020(i, C22832.m51496(iM27375 & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m27367(length, obj)) {
                        c21560.m49016(i, C22832.m51496(iM27375 & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m27367(length, obj)) {
                        c21560.m49004(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 5:
                    if (m27367(length, obj)) {
                        c21560.m48994(i, C22832.m51496(iM27375 & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m27367(length, obj)) {
                        c21560.m49019(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m27367(length, obj)) {
                        c21560.m49001(i, C22832.m51524(iM27375 & 1048575, obj));
                    }
                    break;
                case 8:
                    if (m27367(length, obj)) {
                        m27362(i, C22832.m51520(iM27375 & 1048575, obj), interfaceC18356);
                    }
                    break;
                case 9:
                    if (m27367(length, obj)) {
                        c21560.m49022(i, C22832.m51520(iM27375 & 1048575, obj), m27370(length));
                    }
                    break;
                case 10:
                    if (m27367(length, obj)) {
                        c21560.m49000(i, (AbstractC17084) C22832.m51520(iM27375 & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m27367(length, obj)) {
                        c21560.m49010(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 12:
                    if (m27367(length, obj)) {
                        c21560.m48993(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 13:
                    if (m27367(length, obj)) {
                        c21560.m49025(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m27367(length, obj)) {
                        c21560.m49005(i, C22832.m51496(iM27375 & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m27367(length, obj)) {
                        c21560.m49015(i, C22832.m51514(iM27375 & 1048575, obj));
                    }
                    break;
                case 16:
                    if (m27367(length, obj)) {
                        c21560.m49026(i, C22832.m51496(iM27375 & 1048575, obj));
                    }
                    break;
                case 17:
                    if (m27367(length, obj)) {
                        c21560.m48996(i, C22832.m51520(iM27375 & 1048575, obj), m27370(length));
                    }
                    break;
                case 18:
                    C18949.m44003(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 19:
                    C18949.m43993(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 20:
                    C18949.m43986(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 21:
                    C18949.m43994(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 22:
                    C18949.m43991(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 23:
                    C18949.m43998(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 24:
                    C18949.m44005(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 25:
                    C18949.m43983(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 26:
                    int i2 = iArr[length];
                    List list = (List) C22832.m51520(iM27375 & 1048575, obj);
                    int i3 = C18949.f61453;
                    if (list != null && !list.isEmpty()) {
                        c21560.m49023(i2, list);
                    }
                    break;
                case 27:
                    C18949.m44002(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, m27370(length));
                    break;
                case 28:
                    int i4 = iArr[length];
                    List list2 = (List) C22832.m51520(iM27375 & 1048575, obj);
                    int i5 = C18949.f61453;
                    if (list2 != null && !list2.isEmpty()) {
                        c21560.m48998(i4, list2);
                    }
                    break;
                case 29:
                    C18949.m43996(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 30:
                    C18949.m43988(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 31:
                    C18949.m43976(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 32:
                    C18949.m43989(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 33:
                    C18949.m44006(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 34:
                    C18949.m43995(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, false);
                    break;
                case 35:
                    C18949.m44003(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 36:
                    C18949.m43993(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 37:
                    C18949.m43986(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 38:
                    C18949.m43994(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 39:
                    C18949.m43991(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 40:
                    C18949.m43998(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 41:
                    C18949.m44005(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 42:
                    C18949.m43983(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 43:
                    C18949.m43996(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 44:
                    C18949.m43988(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C18949.m43976(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 46:
                    C18949.m43989(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 47:
                    C18949.m44006(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 48:
                    C18949.m43995(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, true);
                    break;
                case 49:
                    C18949.m43982(iArr[length], (List) C22832.m51520(iM27375 & 1048575, obj), interfaceC18356, m27370(length));
                    break;
                case 50:
                    Object objM51520 = C22832.m51520(iM27375 & 1048575, obj);
                    if (objM51520 != null) {
                        Object objM27378 = m27378(length);
                        InterfaceC12062 interfaceC12062 = this.f34110;
                        interfaceC12062.mo17599(objM27378);
                        c21560.m48999(i, interfaceC12062.mo17604(objM51520));
                    }
                    break;
                case 51:
                    if (m27366(i, length, obj)) {
                        c21560.m48992(i, ((Double) C22832.m51520(iM27375 & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m27366(i, length, obj)) {
                        c21560.m48990(((Float) C22832.m51520(iM27375 & 1048575, obj)).floatValue(), i);
                    }
                    break;
                case 53:
                    if (m27366(i, length, obj)) {
                        c21560.m49020(i, m27377(iM27375 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m27366(i, length, obj)) {
                        c21560.m49016(i, m27377(iM27375 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m27366(i, length, obj)) {
                        c21560.m49004(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m27366(i, length, obj)) {
                        c21560.m48994(i, m27377(iM27375 & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m27366(i, length, obj)) {
                        c21560.m49019(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m27366(i, length, obj)) {
                        c21560.m49001(i, ((Boolean) C22832.m51520(iM27375 & 1048575, obj)).booleanValue());
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m27366(i, length, obj)) {
                        m27362(i, C22832.m51520(iM27375 & 1048575, obj), interfaceC18356);
                    }
                    break;
                case 60:
                    if (m27366(i, length, obj)) {
                        c21560.m49022(i, C22832.m51520(iM27375 & 1048575, obj), m27370(length));
                    }
                    break;
                case 61:
                    if (m27366(i, length, obj)) {
                        c21560.m49000(i, (AbstractC17084) C22832.m51520(iM27375 & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m27366(i, length, obj)) {
                        c21560.m49010(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m27366(i, length, obj)) {
                        c21560.m48993(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m27366(i, length, obj)) {
                        c21560.m49025(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m27366(i, length, obj)) {
                        c21560.m49005(i, m27377(iM27375 & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m27366(i, length, obj)) {
                        c21560.m49015(i, m27357(iM27375 & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m27366(i, length, obj)) {
                        c21560.m49026(i, m27377(iM27375 & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m27366(i, length, obj)) {
                        c21560.m48996(i, C22832.m51520(iM27375 & 1048575, obj), m27370(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m27382(Object obj, InterfaceC18356 interfaceC18356) {
        Map.Entry entry;
        Iterator itM22904;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Map.Entry entry3;
        int[] iArr;
        int i4;
        boolean z = this.f34121;
        AbstractC4077 abstractC4077 = this.f34123;
        if (z) {
            C8551 c8551Mo2097 = abstractC4077.mo2097(obj);
            if (c8551Mo2097.m22908()) {
                entry = null;
                itM22904 = null;
            } else {
                itM22904 = c8551Mo2097.m22904();
                entry = (Map.Entry) itM22904.next();
            }
        } else {
            entry = null;
            itM22904 = null;
        }
        Iterator it = itM22904;
        int[] iArr2 = this.f34112;
        int length = iArr2.length;
        Unsafe unsafe = f34108;
        int i5 = 1048575;
        int i6 = 0;
        C10744 c10744 = this;
        int i7 = 0;
        while (i7 < length) {
            int iM27375 = c10744.m27375(i7);
            int i8 = iArr2[i7];
            int iM27376 = m27376(iM27375);
            if (iM27376 <= 17) {
                int i9 = iArr2[i7 + 2];
                Map.Entry entry4 = entry;
                int i10 = i9 & 1048575;
                if (i10 != i5) {
                    i6 = i10 == 1048575 ? 0 : unsafe.getInt(obj, i10);
                    i5 = i10;
                }
                i = i5;
                i2 = i6;
                i3 = 1 << (i9 >>> 20);
                entry2 = entry4;
            } else {
                i = i5;
                i2 = i6;
                entry2 = entry;
                i3 = 0;
            }
            while (entry2 != null && abstractC4077.mo2094(entry2) <= i8) {
                abstractC4077.mo2100(interfaceC18356, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iM27375 & 1048575;
            switch (iM27376) {
                case 0:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m48992(i8, C22832.m51522(j, obj));
                    }
                    break;
                case 1:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m48990(C22832.m51521(j, obj), i8);
                    }
                    c10744 = this;
                    break;
                case 2:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49020(i8, unsafe.getLong(obj, j));
                    }
                    c10744 = this;
                    break;
                case 3:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49016(i8, unsafe.getLong(obj, j));
                    }
                    c10744 = this;
                    break;
                case 4:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49004(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 5:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m48994(i8, unsafe.getLong(obj, j));
                    }
                    c10744 = this;
                    break;
                case 6:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49019(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 7:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49001(i8, C22832.m51524(j, obj));
                    }
                    c10744 = this;
                    break;
                case 8:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        m27362(i8, unsafe.getObject(obj, j), interfaceC18356);
                    }
                    c10744 = this;
                    break;
                case 9:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49022(i8, unsafe.getObject(obj, j), c10744.m27370(i7));
                    }
                    break;
                case 10:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49000(i8, (AbstractC17084) unsafe.getObject(obj, j));
                    }
                    c10744 = this;
                    break;
                case 11:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49010(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 12:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m48993(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 13:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49025(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 14:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49005(i8, unsafe.getLong(obj, j));
                    }
                    c10744 = this;
                    break;
                case 15:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49015(i8, unsafe.getInt(obj, j));
                    }
                    c10744 = this;
                    break;
                case 16:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m49026(i8, unsafe.getLong(obj, j));
                    }
                    c10744 = this;
                    break;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    entry3 = entry2;
                    if (c10744.m27368(obj, i7, i, i2, i3)) {
                        ((C21560) interfaceC18356).m48996(i8, unsafe.getObject(obj, j), c10744.m27370(i7));
                    }
                    break;
                case 18:
                    C18949.m44003(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 19:
                    C18949.m43993(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 20:
                    C18949.m43986(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 21:
                    C18949.m43994(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 22:
                    C18949.m43991(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 23:
                    C18949.m43998(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 24:
                    C18949.m44005(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 25:
                    C18949.m43983(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 26:
                    int i11 = iArr2[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = C18949.f61453;
                    if (list != null && !list.isEmpty()) {
                        ((C21560) interfaceC18356).m49023(i11, list);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 27:
                    C18949.m44002(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, c10744.m27370(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 28:
                    int i13 = iArr2[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = C18949.f61453;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C21560) interfaceC18356).m48998(i13, list2);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 29:
                    C18949.m43996(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 30:
                    C18949.m43988(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 31:
                    C18949.m43976(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 32:
                    C18949.m43989(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 33:
                    C18949.m44006(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 34:
                    C18949.m43995(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 35:
                    C18949.m44003(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 36:
                    C18949.m43993(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 37:
                    C18949.m43986(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 38:
                    C18949.m43994(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 39:
                    C18949.m43991(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 40:
                    C18949.m43998(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 41:
                    C18949.m44005(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 42:
                    C18949.m43983(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 43:
                    C18949.m43996(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 44:
                    C18949.m43988(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C18949.m43976(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 46:
                    C18949.m43989(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 47:
                    C18949.m44006(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 48:
                    C18949.m43995(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 49:
                    C18949.m43982(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC18356, c10744.m27370(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objM27378 = c10744.m27378(i7);
                        InterfaceC12062 interfaceC12062 = c10744.f34110;
                        interfaceC12062.mo17599(objM27378);
                        ((C21560) interfaceC18356).m48999(i8, interfaceC12062.mo17604(object));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 51:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m48992(i8, ((Double) C22832.m51520(j, obj)).doubleValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 52:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m48990(((Float) C22832.m51520(j, obj)).floatValue(), i8);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 53:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49020(i8, m27377(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49016(i8, m27377(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49004(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 56:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m48994(i8, m27377(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 57:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49019(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49001(i8, ((Boolean) C22832.m51520(j, obj)).booleanValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c10744.m27366(i8, i7, obj)) {
                        m27362(i8, unsafe.getObject(obj, j), interfaceC18356);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 60:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49022(i8, unsafe.getObject(obj, j), c10744.m27370(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 61:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49000(i8, (AbstractC17084) unsafe.getObject(obj, j));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 62:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49010(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 63:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m48993(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 64:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49025(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 65:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49005(i8, m27377(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 66:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49015(i8, m27357(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 67:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m49026(i8, m27377(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 68:
                    if (c10744.m27366(i8, i7, obj)) {
                        ((C21560) interfaceC18356).m48996(i8, unsafe.getObject(obj, j), c10744.m27370(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                default:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
            }
            i7 += 3;
            i5 = i;
            i6 = i2;
            iArr2 = iArr;
            length = i4;
            entry = entry3;
        }
        while (entry != null) {
            abstractC4077.mo2100(interfaceC18356, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        AbstractC3990 abstractC3990 = c10744.f34124;
        abstractC3990.mo3904(abstractC3990.mo3901(obj), interfaceC18356);
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0610 A[Catch: all -> 0x0657, TRY_LEAVE, TryCatch #17 {all -> 0x0657, blocks: (B:217:0x060a, B:219:0x0610), top: B:261:0x060a }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0618 A[LOOP:4: B:221:0x0616->B:222:0x0618, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x062b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x062d A[Catch: all -> 0x0601, TRY_ENTER, TryCatch #3 {all -> 0x0601, blocks: (B:203:0x05e0, B:226:0x062d, B:227:0x0631), top: B:255:0x05e0 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0639 A[LOOP:5: B:229:0x0637->B:230:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0668 A[LOOP:3: B:242:0x0666->B:243:0x0668, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x067a  */
    /* JADX WARN: Code duplicated, block: B:291:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21142(Object obj, InterfaceC12236 interfaceC12236, C24215 c24215) throws Throwable {
        Object obj2;
        int i;
        int[] iArr;
        AbstractC3990 abstractC3990;
        Object obj3;
        Object objMo3889;
        int i2;
        Object obj4;
        C8551 c8551Mo2103;
        C24215 c24216;
        Object obj5;
        Object obj6;
        Object objM43979;
        C10744 c10744 = this;
        Object obj7 = obj;
        C24215 c24217 = c24215;
        c24215.getClass();
        m27374(obj);
        AbstractC3990 abstractC3991 = c10744.f34124;
        int[] iArr2 = c10744.f34117;
        int i3 = c10744.f34118;
        int i4 = c10744.f34122;
        C8551 c8551 = null;
        Object objMo38810 = null;
        while (true) {
            try {
                int iMo30549 = interfaceC12236.mo30549();
                if (iMo30549 < c10744.f34125 || iMo30549 > c10744.f34115) {
                    i2 = -1;
                } else {
                    int[] iArr3 = c10744.f34112;
                    int length = (iArr3.length / 3) - 1;
                    int i5 = 0;
                    while (true) {
                        if (i5 <= length) {
                            int i6 = (length + i5) >>> 1;
                            int i7 = i6 * 3;
                            int i8 = length;
                            int i9 = iArr3[i7];
                            if (iMo30549 == i9) {
                                i2 = i7;
                            } else if (iMo30549 < i9) {
                                length = i6 - 1;
                            } else {
                                i5 = i6 + 1;
                                length = i8;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                }
                if (i2 >= 0) {
                    obj2 = objMo38810;
                    i = i3;
                    iArr = iArr2;
                    abstractC3990 = abstractC3991;
                    c10744 = this;
                    obj3 = obj7;
                    try {
                        int iM27375 = c10744.m27375(i2);
                        try {
                            int iM27376 = m27376(iM27375);
                            AbstractC7038 abstractC7038 = c10744.f34116;
                            switch (iM27376) {
                                case 0:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51508(obj3, m27383(iM27375), interfaceC12236.readDouble());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 1:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51509(obj3, m27383(iM27375), interfaceC12236.readFloat());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 2:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51510(obj3, m27383(iM27375), interfaceC12236.mo30544());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 3:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51510(obj3, m27383(iM27375), interfaceC12236.mo30542());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 4:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51504(interfaceC12236.mo30528(), m27383(iM27375), obj3);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 5:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51510(obj3, m27383(iM27375), interfaceC12236.mo30532());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 6:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51504(interfaceC12236.mo30568(), m27383(iM27375), obj3);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 7:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51518(obj3, m27383(iM27375), interfaceC12236.mo30563());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 8:
                                    i4 = i4;
                                    c24216 = c24217;
                                    c10744.m27365(obj3, iM27375, interfaceC12236);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 9:
                                    i4 = i4;
                                    c24216 = c24217;
                                    InterfaceC18775 interfaceC18775 = (InterfaceC18775) c10744.m27380(i2, obj3);
                                    interfaceC12236.mo30560(interfaceC18775, c10744.m27370(i2), c24216);
                                    c10744.m27373(i2, obj3, interfaceC18775);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 10:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51505(m27383(iM27375), obj3, interfaceC12236.mo30537());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 11:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51504(interfaceC12236.mo30564(), m27383(iM27375), obj3);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 12:
                                    i4 = i4;
                                    c24216 = c24217;
                                    int iMo30547 = interfaceC12236.mo30547();
                                    InterfaceC11512 interfaceC11512M27359 = c10744.m27359(i2);
                                    if (interfaceC11512M27359 == null || interfaceC11512M27359.mo2924(iMo30547)) {
                                        C22832.m51504(iMo30547, iM27375 & 1048575, obj3);
                                        c10744.m27372(i2, obj3);
                                        objM43979 = obj2;
                                    } else {
                                        objM43979 = C18949.m43979(obj3, iMo30549, iMo30547, obj2, abstractC3990);
                                    }
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 13:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51504(interfaceC12236.mo30557(), iM27375 & 1048575, obj3);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 14:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51510(obj3, iM27375 & 1048575, interfaceC12236.mo30540());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 15:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51504(interfaceC12236.mo30545(), iM27375 & 1048575, obj3);
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 16:
                                    i4 = i4;
                                    c24216 = c24217;
                                    C22832.m51510(obj3, iM27375 & 1048575, interfaceC12236.mo30551());
                                    c10744.m27372(i2, obj3);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 17:
                                    i4 = i4;
                                    c24216 = c24217;
                                    InterfaceC18775 interfaceC18776 = (InterfaceC18775) c10744.m27380(i2, obj3);
                                    interfaceC12236.mo30534(interfaceC18776, c10744.m27370(i2), c24216);
                                    c10744.m27373(i2, obj3, interfaceC18776);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 18:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30558(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 19:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30567(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 20:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30565(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 21:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30541(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 22:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30552(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 23:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30538(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 24:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30554(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 25:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30548(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 26:
                                    i4 = i4;
                                    c24216 = c24217;
                                    if ((536870912 & iM27375) != 0) {
                                        interfaceC12236.mo30546(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    } else {
                                        interfaceC12236.mo30550(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    }
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 27:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30562(abstractC7038.mo8613(iM27375 & 1048575, obj3), c10744.m27370(i2), c24216);
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 28:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30530(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 29:
                                    i4 = i4;
                                    c24216 = c24217;
                                    interfaceC12236.mo30543(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 30:
                                    i4 = i4;
                                    c24216 = c24217;
                                    List listMo8613 = abstractC7038.mo8613(iM27375 & 1048575, obj3);
                                    interfaceC12236.mo30556(listMo8613);
                                    objM43979 = C18949.m43980(obj, iMo30549, listMo8613, c10744.m27359(i2), obj2, abstractC3990);
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 31:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30535(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 32:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30569(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 33:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30529(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 34:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30561(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 35:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30558(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 36:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30567(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 37:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30565(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 38:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30541(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 39:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30552(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 40:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30538(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 41:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30554(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 42:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30548(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 43:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30543(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 44:
                                    i4 = i4;
                                    c24216 = c24217;
                                    try {
                                        List listMo8614 = abstractC7038.mo8613(iM27375 & 1048575, obj3);
                                        interfaceC12236.mo30556(listMo8614);
                                        objMo3889 = obj2;
                                        try {
                                            objM43979 = C18949.m43980(obj, iMo30549, listMo8614, c10744.m27359(i2), obj2, abstractC3990);
                                            objMo3889 = objM43979;
                                        } catch (C3309 unused) {
                                            obj2 = objMo3889;
                                            objMo3889 = obj2;
                                            try {
                                                if (abstractC3990.mo3896(interfaceC12236)) {
                                                    if (objMo3889 == null) {
                                                        objMo3889 = abstractC3990.mo3889(obj3);
                                                    }
                                                    if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                        while (i4 < i) {
                                                            m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                            i4++;
                                                        }
                                                        if (objMo3889 == null) {
                                                            return;
                                                        }
                                                        abstractC3990.mo3903(obj3, objMo3889);
                                                        return;
                                                    }
                                                } else if (!interfaceC12236.mo30531()) {
                                                    while (i4 < i) {
                                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                        i4++;
                                                    }
                                                    if (objMo3889 == null) {
                                                        return;
                                                    }
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                obj2 = objMo3889;
                                                objMo3889 = obj2;
                                                while (i4 < i) {
                                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                    i4++;
                                                }
                                                if (objMo3889 != null) {
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = objMo3889;
                                            objMo3889 = obj2;
                                            while (i4 < i) {
                                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                i4++;
                                            }
                                            if (objMo3889 != null) {
                                                abstractC3990.mo3903(obj3, objMo3889);
                                            }
                                            throw th;
                                        }
                                    } catch (C3309 unused2) {
                                        objMo3889 = obj2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objMo3889 = obj2;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30535(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 46:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30569(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 47:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30529(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 48:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    interfaceC12236.mo30561(abstractC7038.mo8613(iM27375 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 49:
                                    i4 = i4;
                                    c24216 = c24217;
                                    obj6 = obj2;
                                    try {
                                        interfaceC12236.mo30536(abstractC7038.mo8613(iM27375 & 1048575, obj3), c10744.m27370(i2), c24216);
                                        obj2 = obj6;
                                        objM43979 = obj2;
                                        objMo3889 = objM43979;
                                    } catch (C3309 unused3) {
                                        obj2 = obj6;
                                        objMo3889 = obj2;
                                        if (abstractC3990.mo3896(interfaceC12236)) {
                                            if (objMo3889 == null) {
                                                objMo3889 = abstractC3990.mo3889(obj3);
                                            }
                                            if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                while (i4 < i) {
                                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                    i4++;
                                                }
                                                if (objMo3889 == null) {
                                                    return;
                                                }
                                                abstractC3990.mo3903(obj3, objMo3889);
                                                return;
                                            }
                                        } else if (!interfaceC12236.mo30531()) {
                                            while (i4 < i) {
                                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                i4++;
                                            }
                                            if (objMo3889 == null) {
                                                return;
                                            }
                                            abstractC3990.mo3903(obj3, objMo3889);
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj6;
                                        objMo3889 = obj2;
                                        while (i4 < i) {
                                            m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                            i4++;
                                        }
                                        if (objMo3889 != null) {
                                            abstractC3990.mo3903(obj3, objMo3889);
                                        }
                                        throw th;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 50:
                                    try {
                                        obj5 = obj2;
                                        i4 = i4;
                                        C24215 c24218 = c24217;
                                        try {
                                            m27364(obj, i2, c10744.m27378(i2), c24215, interfaceC12236);
                                            throw null;
                                        } catch (C3309 unused4) {
                                            obj6 = obj5;
                                            c24216 = c24218;
                                            obj2 = obj6;
                                            objMo3889 = obj2;
                                            if (abstractC3990.mo3896(interfaceC12236)) {
                                                if (!interfaceC12236.mo30531()) {
                                                    while (i4 < i) {
                                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                        i4++;
                                                    }
                                                    if (objMo3889 == null) {
                                                        return;
                                                    }
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo38810 = objMo3889;
                                                c24217 = c24216;
                                                iArr2 = iArr;
                                                abstractC3991 = abstractC3990;
                                                i3 = i;
                                            } else {
                                                if (objMo3889 == null) {
                                                    objMo3889 = abstractC3990.mo3889(obj3);
                                                }
                                                if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                    while (i4 < i) {
                                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                        i4++;
                                                    }
                                                    if (objMo3889 == null) {
                                                        return;
                                                    }
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo38810 = objMo3889;
                                                c24217 = c24216;
                                                iArr2 = iArr;
                                                abstractC3991 = abstractC3990;
                                                i3 = i;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj6 = obj5;
                                            obj2 = obj6;
                                            objMo3889 = obj2;
                                            while (i4 < i) {
                                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                i4++;
                                            }
                                            if (objMo3889 != null) {
                                                abstractC3990.mo3903(obj3, objMo3889);
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        obj5 = obj2;
                                        i4 = i4;
                                    }
                                    break;
                                case 51:
                                    C22832.m51505(iM27375 & 1048575, obj3, Double.valueOf(interfaceC12236.readDouble()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 52:
                                    C22832.m51505(iM27375 & 1048575, obj3, Float.valueOf(interfaceC12236.readFloat()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 53:
                                    C22832.m51505(iM27375 & 1048575, obj3, Long.valueOf(interfaceC12236.mo30544()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    C22832.m51505(iM27375 & 1048575, obj3, Long.valueOf(interfaceC12236.mo30542()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(interfaceC12236.mo30528()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 56:
                                    C22832.m51505(iM27375 & 1048575, obj3, Long.valueOf(interfaceC12236.mo30532()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 57:
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(interfaceC12236.mo30568()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    C22832.m51505(iM27375 & 1048575, obj3, Boolean.valueOf(interfaceC12236.mo30563()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    c10744.m27365(obj3, iM27375, interfaceC12236);
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 60:
                                    InterfaceC18775 interfaceC18777 = (InterfaceC18775) c10744.m27379(iMo30549, i2, obj3);
                                    interfaceC12236.mo30560(interfaceC18777, c10744.m27370(i2), c24217);
                                    c10744.m27360(iMo30549, i2, obj3, interfaceC18777);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 61:
                                    C22832.m51505(iM27375 & 1048575, obj3, interfaceC12236.mo30537());
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 62:
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(interfaceC12236.mo30564()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 63:
                                    int iMo30548 = interfaceC12236.mo30547();
                                    InterfaceC11512 interfaceC11512M273510 = c10744.m27359(i2);
                                    if (interfaceC11512M273510 != null && !interfaceC11512M273510.mo2924(iMo30548)) {
                                        objMo3889 = C18949.m43979(obj3, iMo30549, iMo30548, obj2, abstractC3990);
                                        i4 = i4;
                                        c24216 = c24217;
                                        objM43979 = objMo3889;
                                        objMo3889 = objM43979;
                                        obj7 = obj3;
                                        i4 = i4;
                                        objMo38810 = objMo3889;
                                        c24217 = c24216;
                                        iArr2 = iArr;
                                        abstractC3991 = abstractC3990;
                                        i3 = i;
                                    }
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(iMo30548));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 64:
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(interfaceC12236.mo30557()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 65:
                                    C22832.m51505(iM27375 & 1048575, obj3, Long.valueOf(interfaceC12236.mo30540()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 66:
                                    C22832.m51505(iM27375 & 1048575, obj3, Integer.valueOf(interfaceC12236.mo30545()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 67:
                                    C22832.m51505(iM27375 & 1048575, obj3, Long.valueOf(interfaceC12236.mo30551()));
                                    c10744.m27371(iMo30549, i2, obj3);
                                    i4 = i4;
                                    c24216 = c24217;
                                    objM43979 = obj2;
                                    objMo3889 = objM43979;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                case 68:
                                    try {
                                        InterfaceC18775 interfaceC18778 = (InterfaceC18775) c10744.m27379(iMo30549, i2, obj3);
                                        interfaceC12236.mo30534(interfaceC18778, c10744.m27370(i2), c24217);
                                        c10744.m27360(iMo30549, i2, obj3, interfaceC18778);
                                        i4 = i4;
                                        c24216 = c24217;
                                        objM43979 = obj2;
                                        objMo3889 = objM43979;
                                    } catch (C3309 unused5) {
                                        objMo3889 = obj2;
                                        i4 = i4;
                                        c24216 = c24217;
                                        if (abstractC3990.mo3896(interfaceC12236)) {
                                            if (objMo3889 == null) {
                                                objMo3889 = abstractC3990.mo3889(obj3);
                                            }
                                            if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                while (i4 < i) {
                                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                    i4++;
                                                }
                                                if (objMo3889 == null) {
                                                    return;
                                                }
                                                abstractC3990.mo3903(obj3, objMo3889);
                                                return;
                                            }
                                        } else if (!interfaceC12236.mo30531()) {
                                            while (i4 < i) {
                                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                i4++;
                                            }
                                            if (objMo3889 == null) {
                                                return;
                                            }
                                            abstractC3990.mo3903(obj3, objMo3889);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                                default:
                                    i4 = i4;
                                    c24216 = c24217;
                                    if (obj2 == null) {
                                        try {
                                            objMo3889 = abstractC3990.mo3889(obj3);
                                        } catch (C3309 unused6) {
                                            objMo3889 = obj2;
                                            if (abstractC3990.mo3896(interfaceC12236)) {
                                                if (!interfaceC12236.mo30531()) {
                                                    while (i4 < i) {
                                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                        i4++;
                                                    }
                                                    if (objMo3889 == null) {
                                                        return;
                                                    }
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo38810 = objMo3889;
                                                c24217 = c24216;
                                                iArr2 = iArr;
                                                abstractC3991 = abstractC3990;
                                                i3 = i;
                                            } else {
                                                if (objMo3889 == null) {
                                                    objMo3889 = abstractC3990.mo3889(obj3);
                                                }
                                                if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                    while (i4 < i) {
                                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                        i4++;
                                                    }
                                                    if (objMo3889 == null) {
                                                        return;
                                                    }
                                                    abstractC3990.mo3903(obj3, objMo3889);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo38810 = objMo3889;
                                                c24217 = c24216;
                                                iArr2 = iArr;
                                                abstractC3991 = abstractC3990;
                                                i3 = i;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            objMo3889 = obj2;
                                        }
                                    } else {
                                        objMo3889 = obj2;
                                    }
                                    try {
                                        try {
                                            if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                while (i4 < i) {
                                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                    i4++;
                                                }
                                                if (objMo3889 == null) {
                                                    return;
                                                }
                                                abstractC3990.mo3903(obj3, objMo3889);
                                                return;
                                            }
                                            objM43979 = objMo3889;
                                            objMo3889 = objM43979;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                        break;
                                    } catch (C3309 unused7) {
                                        if (abstractC3990.mo3896(interfaceC12236)) {
                                            if (objMo3889 == null) {
                                                objMo3889 = abstractC3990.mo3889(obj3);
                                            }
                                            if (!abstractC3990.m12908(objMo3889, interfaceC12236)) {
                                                while (i4 < i) {
                                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                    i4++;
                                                }
                                                if (objMo3889 == null) {
                                                    return;
                                                }
                                                abstractC3990.mo3903(obj3, objMo3889);
                                                return;
                                            }
                                        } else if (!interfaceC12236.mo30531()) {
                                            while (i4 < i) {
                                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                                i4++;
                                            }
                                            if (objMo3889 == null) {
                                                return;
                                            }
                                            abstractC3990.mo3903(obj3, objMo3889);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo38810 = objMo3889;
                                    c24217 = c24216;
                                    iArr2 = iArr;
                                    abstractC3991 = abstractC3990;
                                    i3 = i;
                                    break;
                            }
                        } catch (C3309 unused8) {
                            i4 = i4;
                            c24216 = c24217;
                        } catch (Throwable th9) {
                            th = th9;
                            i4 = i4;
                            objMo3889 = obj2;
                            while (i4 < i) {
                                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                i4++;
                            }
                            if (objMo3889 != null) {
                                abstractC3990.mo3903(obj3, objMo3889);
                            }
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    if (iMo30549 == Integer.MAX_VALUE) {
                        for (int i10 = i4; i10 < i3; i10++) {
                            m27363(obj, iArr2[i10], objMo38810, abstractC3991, obj);
                        }
                        if (objMo38810 != null) {
                            abstractC3991.mo3903(obj7, objMo38810);
                            return;
                        }
                        return;
                    }
                    try {
                        boolean z = c10744.f34121;
                        AbstractC4077 abstractC4077 = c10744.f34123;
                        Object objMo2096 = !z ? null : abstractC4077.mo2096(c24217, c10744.f34114, iMo30549);
                        if (objMo2096 != null) {
                            if (c8551 == null) {
                                try {
                                    c8551Mo2103 = abstractC4077.mo2103(obj7);
                                } catch (Throwable th11) {
                                    th = th11;
                                    i = i3;
                                    iArr = iArr2;
                                    abstractC3990 = abstractC3991;
                                    i4 = i4;
                                    objMo3889 = objMo38810;
                                    obj3 = obj7;
                                    obj2 = objMo3889;
                                    objMo3889 = obj2;
                                    while (i4 < i) {
                                        m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                        i4++;
                                    }
                                    if (objMo3889 != null) {
                                        abstractC3990.mo3903(obj3, objMo3889);
                                    }
                                    throw th;
                                }
                            } else {
                                c8551Mo2103 = c8551;
                            }
                            obj2 = objMo38810;
                            Object obj8 = objMo2096;
                            i = i3;
                            iArr = iArr2;
                            AbstractC3990 abstractC3992 = abstractC3991;
                            obj4 = obj7;
                            try {
                                objMo38810 = abstractC4077.mo2095(obj, interfaceC12236, obj8, c24215, c8551Mo2103, obj2, abstractC3992);
                                abstractC3991 = abstractC3992;
                                c8551 = c8551Mo2103;
                            } catch (Throwable th12) {
                                th = th12;
                                abstractC3990 = abstractC3992;
                                i = i;
                                obj3 = obj4;
                                objMo3889 = obj2;
                                while (i4 < i) {
                                    m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                    i4++;
                                }
                                if (objMo3889 != null) {
                                    abstractC3990.mo3903(obj3, objMo3889);
                                }
                                throw th;
                            }
                        } else {
                            Object obj9 = objMo38810;
                            i = i3;
                            iArr = iArr2;
                            abstractC3990 = abstractC3991;
                            obj4 = obj7;
                            try {
                                if (abstractC3990.mo3896(interfaceC12236)) {
                                    objMo38810 = obj9;
                                    if (interfaceC12236.mo30531()) {
                                        abstractC3991 = abstractC3990;
                                    }
                                } else {
                                    objMo38810 = obj9 == null ? abstractC3990.mo3889(obj4) : obj9;
                                    try {
                                        if (!abstractC3990.m12908(objMo38810, interfaceC12236)) {
                                        }
                                        abstractC3991 = abstractC3990;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = objMo38810;
                                        obj3 = obj4;
                                        objMo3889 = obj2;
                                        while (i4 < i) {
                                            m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                                            i4++;
                                        }
                                        if (objMo3889 != null) {
                                            abstractC3990.mo3903(obj3, objMo3889);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                objMo38810 = obj9;
                            }
                        }
                        i3 = i;
                        obj7 = obj4;
                        iArr2 = iArr;
                        c10744 = this;
                    } catch (Throwable th15) {
                        th = th15;
                        obj2 = objMo38810;
                        i = i3;
                        iArr = iArr2;
                        abstractC3990 = abstractC3991;
                        obj4 = obj7;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = objMo38810;
                i = i3;
                iArr = iArr2;
                abstractC3990 = abstractC3991;
                obj3 = obj7;
            }
            while (i4 < i) {
                m27363(obj, iArr[i4], objMo3889, abstractC3990, obj);
                i4++;
            }
            if (objMo3889 != null) {
                abstractC3990.mo3903(obj3, objMo3889);
            }
            throw th;
        }
        int i11 = i4;
        while (i11 < i) {
            AbstractC3990 abstractC3993 = abstractC3990;
            m27363(obj, iArr[i11], objMo38810, abstractC3993, obj);
            i11++;
            abstractC3990 = abstractC3993;
            i = i;
        }
        AbstractC3990 abstractC3994 = abstractC3990;
        if (objMo38810 != null) {
            abstractC3994.mo3903(obj4, objMo38810);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private InterfaceC7762 m27370(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f34120;
        InterfaceC7762 interfaceC7762 = (InterfaceC7762) objArr[i2];
        if (interfaceC7762 != null) {
            return interfaceC7762;
        }
        InterfaceC7762 interfaceC7762M40959 = C17457.m40958().m40959((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC7762M40959;
        return interfaceC7762M40959;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Object m27378(int i) {
        return this.f34120[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC11512 m27359(int i) {
        return (InterfaceC11512) this.f34120[((i / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Object m27380(int i, Object obj) {
        InterfaceC7762 interfaceC7762M27370 = m27370(i);
        long jM27375 = m27375(i) & 1048575;
        if (!m27367(i, obj)) {
            return interfaceC7762M27370.mo21139();
        }
        Object object = f34108.getObject(obj, jM27375);
        if (m27384(object)) {
            return object;
        }
        Object objMo21139 = interfaceC7762M27370.mo21139();
        if (object != null) {
            interfaceC7762M27370.mo21141(objMo21139, object);
        }
        return objMo21139;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27373(int i, Object obj, Object obj2) {
        f34108.putObject(obj, m27375(i) & 1048575, obj2);
        m27372(i, obj);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private Object m27379(int i, int i2, Object obj) {
        InterfaceC7762 interfaceC7762M27370 = m27370(i2);
        if (!m27366(i, i2, obj)) {
            return interfaceC7762M27370.mo21139();
        }
        Object object = f34108.getObject(obj, m27375(i2) & 1048575);
        if (m27384(object)) {
            return object;
        }
        Object objMo21139 = interfaceC7762M27370.mo21139();
        if (object != null) {
            interfaceC7762M27370.mo21141(objMo21139, object);
        }
        return objMo21139;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27360(int i, int i2, Object obj, Object obj2) {
        f34108.putObject(obj, m27375(i2) & 1048575, obj2);
        m27371(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ۙ */
    public final void mo21140(Object obj) {
        if (m27384(obj)) {
            if (obj instanceof AbstractC22701) {
                AbstractC22701 abstractC22701 = (AbstractC22701) obj;
                abstractC22701.setMemoizedSerializedSize(Integer.MAX_VALUE);
                abstractC22701.memoizedHashCode = 0;
                abstractC22701.m51178();
            }
            int[] iArr = this.f34112;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM27375 = m27375(i);
                long j = 1048575 & iM27375;
                int iM27376 = m27376(iM27375);
                if (iM27376 != 9) {
                    if (iM27376 != 60 && iM27376 != 68) {
                        switch (iM27376) {
                            case 17:
                                if (m27367(i, obj)) {
                                    m27370(i).mo21140(f34108.getObject(obj, j));
                                }
                                break;
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.f34116.mo8611(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f34108;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f34110.mo17602(object));
                                }
                                break;
                        }
                    } else if (m27366(iArr[i], i, obj)) {
                        m27370(i).mo21140(f34108.getObject(obj, j));
                    }
                } else if (m27367(i, obj)) {
                    m27370(i).mo21140(f34108.getObject(obj, j));
                }
            }
            this.f34124.mo3900(obj);
            if (this.f34121) {
                this.f34123.mo2102(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m27364(Object obj, int i, Object obj2, C24215 c24215, InterfaceC12236 interfaceC12236) {
        long jM27375 = m27375(i) & 1048575;
        Object objM51520 = C22832.m51520(jM27375, obj);
        InterfaceC12062 interfaceC12062 = this.f34110;
        if (objM51520 == null) {
            objM51520 = interfaceC12062.mo17600(obj2);
            C22832.m51505(jM27375, obj, objM51520);
        } else if (interfaceC12062.mo17601(objM51520)) {
            Object objMo17600 = interfaceC12062.mo17600(obj2);
            interfaceC12062.mo17597(objMo17600, objM51520);
            C22832.m51505(jM27375, obj, objMo17600);
            objM51520 = objMo17600;
        }
        interfaceC12062.mo17603(objM51520);
        interfaceC12062.mo17599(obj2);
        interfaceC12236.mo30555();
        throw null;
    }

    @Override // l.InterfaceC7762
    /* JADX INFO: renamed from: ᩷ */
    public final boolean mo21145(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f34122) {
            int i6 = this.f34117[i5];
            int[] iArr = this.f34112;
            int i7 = iArr[i6];
            int iM27375 = m27375(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f34108.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iM27375) == 0 || m27368(obj, i6, i, i2, i10)) {
                int iM27376 = m27376(iM27375);
                if (iM27376 == 9 || iM27376 == 17) {
                    if (!m27368(obj, i6, i, i2, i10) || m27370(i6).mo21145(C22832.m51520(iM27375 & 1048575, obj))) {
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                } else {
                    if (iM27376 != 27) {
                        if (iM27376 == 60 || iM27376 == 68) {
                            if (!m27366(i7, i6, obj) || m27370(i6).mo21145(C22832.m51520(iM27375 & 1048575, obj))) {
                            }
                        } else if (iM27376 != 49) {
                            if (iM27376 != 50) {
                                continue;
                            } else {
                                Object objM51520 = C22832.m51520(iM27375 & 1048575, obj);
                                InterfaceC12062 interfaceC12062 = this.f34110;
                                if (!interfaceC12062.mo17604(objM51520).isEmpty()) {
                                    interfaceC12062.mo17599(m27378(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) C22832.m51520(iM27375 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC7762 interfaceC7762M27370 = m27370(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (interfaceC7762M27370.mo21145(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
        }
        return !this.f34121 || this.f34123.mo2097(obj).m22906();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27362(int i, Object obj, InterfaceC18356 interfaceC18356) {
        if (obj instanceof String) {
            ((C21560) interfaceC18356).m48997(i, (String) obj);
        } else {
            ((C21560) interfaceC18356).m49000(i, (AbstractC17084) obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27365(Object obj, int i, InterfaceC12236 interfaceC12236) {
        if ((536870912 & i) != 0) {
            C22832.m51505(i & 1048575, obj, interfaceC12236.mo30539());
        } else if (this.f34113) {
            C22832.m51505(i & 1048575, obj, interfaceC12236.mo30553());
        } else {
            C22832.m51505(i & 1048575, obj, interfaceC12236.mo30537());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m27363(Object obj, int i, Object obj2, AbstractC3990 abstractC3990, Object obj3) {
        InterfaceC11512 interfaceC11512M27359;
        int i2 = this.f34112[i];
        Object objM51520 = C22832.m51520(m27375(i) & 1048575, obj);
        if (objM51520 == null || (interfaceC11512M27359 = m27359(i)) == null) {
            return;
        }
        InterfaceC12062 interfaceC12062 = this.f34110;
        Map mapMo17603 = interfaceC12062.mo17603(objM51520);
        interfaceC12062.mo17599(m27378(i));
        for (Map.Entry entry : mapMo17603.entrySet()) {
            if (!interfaceC11512M27359.mo2924(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC3990.mo3889(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m27381(int i, Object obj, Object obj2) {
        int[] iArr = this.f34112;
        int i2 = iArr[i];
        if (m27366(i2, i, obj2)) {
            long jM27375 = m27375(i) & 1048575;
            Unsafe unsafe = f34108;
            Object object = unsafe.getObject(obj2, jM27375);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC7762 interfaceC7762M27370 = m27370(i);
            if (!m27366(i2, i, obj)) {
                if (!m27384(object)) {
                    unsafe.putObject(obj, jM27375, object);
                } else {
                    Object objMo21139 = interfaceC7762M27370.mo21139();
                    interfaceC7762M27370.mo21141(objMo21139, object);
                    unsafe.putObject(obj, jM27375, objMo21139);
                }
                m27371(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM27375);
            if (!m27384(object2)) {
                Object objMo211310 = interfaceC7762M27370.mo21139();
                interfaceC7762M27370.mo21141(objMo211310, object2);
                unsafe.putObject(obj, jM27375, objMo211310);
                object2 = objMo211310;
            }
            interfaceC7762M27370.mo21141(object2, object);
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private int m27375(int i) {
        return this.f34112[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27366(int i, int i2, Object obj) {
        return C22832.m51514((long) (this.f34112[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27367(int i, Object obj) {
        boolean zEquals;
        int i2 = this.f34112[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM27375 = m27375(i);
            long j2 = iM27375 & 1048575;
            switch (m27376(iM27375)) {
                case 0:
                    if (Double.doubleToRawLongBits(C22832.m51522(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C22832.m51521(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C22832.m51496(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C22832.m51496(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C22832.m51496(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C22832.m51524(j2, obj);
                case 8:
                    Object objM51520 = C22832.m51520(j2, obj);
                    if (objM51520 instanceof String) {
                        zEquals = ((String) objM51520).isEmpty();
                    } else if (objM51520 instanceof AbstractC17084) {
                        zEquals = AbstractC17084.f55772.equals(objM51520);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return !zEquals;
                case 9:
                    if (C22832.m51520(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    zEquals = AbstractC17084.f55772.equals(C22832.m51520(j2, obj));
                    return !zEquals;
                case 11:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C22832.m51496(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C22832.m51514(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C22832.m51496(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C22832.m51520(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C22832.m51514(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27371(int i, int i2, Object obj) {
        C22832.m51504(i, this.f34112[i2 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m27372(int i, Object obj) {
        int i2 = this.f34112[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C22832.m51504((1 << (i2 >>> 20)) | C22832.m51514(j, obj), j, obj);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m27384(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC22701) {
            return ((AbstractC22701) obj).m51179();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m27374(Object obj) {
        if (!m27384(obj)) {
            throw new IllegalArgumentException(C14483.m34971("Mutating immutable message: ", obj));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m27357(long j, Object obj) {
        return ((Integer) C22832.m51520(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m27377(long j, Object obj) {
        return ((Long) C22832.m51520(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27369(AbstractC22701 abstractC22701, AbstractC22701 abstractC22702, int i) {
        return m27367(i, (Object) abstractC22701) == m27367(i, (Object) abstractC22702);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m27368(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m27367(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
