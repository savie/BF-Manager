package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩷᩵᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 09OR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21088 implements InterfaceC6667 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC19347 f68693;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final AbstractC5524 f68694;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14034 f68695;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f68696;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f68697;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final int f68698;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean f68699;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23206 f68700;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f68701;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68702;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20383 f68703;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f68704;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC5297 f68705;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Object[] f68706;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int[] f68707;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f68708;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final int[] f68692 = new int[0];

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f68691 = C15882.m37786();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m47497(int i) {
        return i & 1048575;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m47512(int i) {
        return (i & 267386880) >>> 20;
    }

    public C21088(int[] iArr, Object[] objArr, int i, int i2, InterfaceC23206 interfaceC23206, int[] iArr2, int i3, int i4, InterfaceC20383 interfaceC20383, AbstractC19347 abstractC19347, AbstractC5297 abstractC5297, AbstractC5524 abstractC5524, InterfaceC14034 interfaceC14034) {
        this.f68696 = iArr;
        this.f68706 = objArr;
        this.f68708 = i;
        this.f68698 = i2;
        this.f68701 = interfaceC23206 instanceof AbstractC16129;
        this.f68697 = abstractC5524 != null && abstractC5524.mo4623(interfaceC23206);
        this.f68699 = true;
        this.f68707 = iArr2;
        this.f68702 = i3;
        this.f68704 = i4;
        this.f68703 = interfaceC20383;
        this.f68693 = abstractC19347;
        this.f68705 = abstractC5297;
        this.f68694 = abstractC5524;
        this.f68700 = interfaceC23206;
        this.f68695 = interfaceC14034;
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
    public static C21088 m47501(InterfaceC13328 interfaceC13328, InterfaceC20383 interfaceC20383, AbstractC19347 abstractC19347, AbstractC5297 abstractC5297, AbstractC5524 abstractC5524, InterfaceC14034 interfaceC14034) {
        int iM36862;
        int iM36863;
        int i;
        int[] iArr;
        int i2;
        int iM26437;
        int i3;
        long jM37794;
        int iM37794;
        int iNumberOfTrailingZeros;
        int i4;
        int i5;
        int i6;
        Class clsM36866;
        int i7;
        if (!(interfaceC13328 instanceof C4550)) {
            C0317 c0317 = (C0317) interfaceC13328;
            C15403[] c15403ArrM1956 = c0317.m1956();
            if (c15403ArrM1956.length == 0) {
                iM36862 = 0;
                iM36863 = 0;
            } else {
                iM36862 = c15403ArrM1956[0].m36862();
                iM36863 = c15403ArrM1956[c15403ArrM1956.length - 1].m36862();
            }
            int length = c15403ArrM1956.length;
            int[] iArr2 = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            int i8 = 0;
            int i9 = 0;
            for (C15403 c15403 : c15403ArrM1956) {
                if (c15403.getType() == EnumC10464.f35750) {
                    i8++;
                } else if (c15403.getType().m26437() >= 18 && c15403.getType().m26437() <= 49) {
                    i9++;
                }
            }
            int[] iArr3 = i8 > 0 ? new int[i8] : null;
            int[] iArr4 = i9 > 0 ? new int[i9] : null;
            int[] iArrM1954 = c0317.m1954();
            int[] iArr5 = f68692;
            if (iArrM1954 == null) {
                iArrM1954 = iArr5;
            }
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i10 < c15403ArrM1956.length) {
                C15403 c15404 = c15403ArrM1956[i10];
                C15403[] c15403Arr = c15403ArrM1956;
                int iM36864 = c15404.m36862();
                C17560 c17560M36872 = c15404.m36872();
                if (c17560M36872 != null) {
                    iM26437 = c15404.getType().m26437() + 51;
                    i = iM36863;
                    iArr = iArr5;
                    int iM37795 = (int) C15882.m37794(c17560M36872.m40834());
                    jM37794 = C15882.m37794(c17560M36872.m40833());
                    i2 = i10;
                    i3 = iM37795;
                } else {
                    i = iM36863;
                    iArr = iArr5;
                    EnumC10464 type = c15404.getType();
                    i2 = i10;
                    int iM37796 = (int) C15882.m37794(c15404.m36865());
                    iM26437 = type.m26437();
                    if (!type.m26435() && !type.m26430()) {
                        Field fieldM36869 = c15404.m36869();
                        iM37794 = fieldM36869 == null ? 1048575 : (int) C15882.m37794(fieldM36869);
                        iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(c15404.m36870());
                        i4 = iM37796;
                    } else {
                        i3 = iM37796;
                        if (c15404.m36864() == null) {
                            iM37794 = 0;
                        } else {
                            jM37794 = C15882.m37794(c15404.m36864());
                        }
                        i4 = i3;
                        iNumberOfTrailingZeros = 0;
                    }
                    iArr2[i11] = c15404.m36862();
                    int i15 = i11 + 1;
                    if (c15404.m36871()) {
                        i5 = 536870912;
                    } else {
                        i5 = 0;
                    }
                    if (c15404.m36867()) {
                        i6 = 268435456;
                    } else {
                        i6 = 0;
                    }
                    iArr2[i15] = i5 | i6 | (iM26437 << 20) | i4;
                    iArr2[i11 + 2] = iM37794 | (iNumberOfTrailingZeros << 20);
                    clsM36866 = c15404.m36866();
                    if (c15404.m36863() != null) {
                        i7 = (i11 / 3) * 2;
                        objArr[i7] = c15404.m36863();
                        if (clsM36866 != null) {
                            objArr[i7 + 1] = clsM36866;
                        } else if (c15404.m36868() != null) {
                            objArr[i7 + 1] = c15404.m36868();
                        }
                    } else if (clsM36866 != null) {
                        objArr[((i11 / 3) * 2) + 1] = clsM36866;
                    } else if (c15404.m36868() != null) {
                        objArr[((i11 / 3) * 2) + 1] = c15404.m36868();
                    }
                    if (i12 < iArrM1954.length && iArrM1954[i12] == iM36864) {
                        iArrM1954[i12] = i11;
                        i12++;
                    }
                    if (c15404.getType() == EnumC10464.f35750) {
                        iArr3[i13] = i11;
                        i13++;
                    } else if (c15404.getType().m26437() < 18 && c15404.getType().m26437() <= 49) {
                        iArr4[i14] = (int) C15882.m37794(c15404.m36865());
                        i14++;
                    }
                    i10 = i2 + 1;
                    i11 += 3;
                    c15403ArrM1956 = c15403Arr;
                    iM36863 = i;
                    iArr5 = iArr;
                }
                iM37794 = (int) jM37794;
                i4 = i3;
                iNumberOfTrailingZeros = 0;
                iArr2[i11] = c15404.m36862();
                int i16 = i11 + 1;
                if (c15404.m36871()) {
                    i5 = 536870912;
                } else {
                    i5 = 0;
                }
                if (c15404.m36867()) {
                    i6 = 268435456;
                } else {
                    i6 = 0;
                }
                iArr2[i16] = i5 | i6 | (iM26437 << 20) | i4;
                iArr2[i11 + 2] = iM37794 | (iNumberOfTrailingZeros << 20);
                clsM36866 = c15404.m36866();
                if (c15404.m36863() != null) {
                    i7 = (i11 / 3) * 2;
                    objArr[i7] = c15404.m36863();
                    if (clsM36866 != null) {
                        objArr[i7 + 1] = clsM36866;
                    } else if (c15404.m36868() != null) {
                        objArr[i7 + 1] = c15404.m36868();
                    }
                } else if (clsM36866 != null) {
                    objArr[((i11 / 3) * 2) + 1] = clsM36866;
                } else if (c15404.m36868() != null) {
                    objArr[((i11 / 3) * 2) + 1] = c15404.m36868();
                }
                if (i12 < iArrM1954.length) {
                    iArrM1954[i12] = i11;
                    i12++;
                }
                if (c15404.getType() == EnumC10464.f35750) {
                    iArr3[i13] = i11;
                    i13++;
                } else if (c15404.getType().m26437() < 18) {
                }
                i10 = i2 + 1;
                i11 += 3;
                c15403ArrM1956 = c15403Arr;
                iM36863 = i;
                iArr5 = iArr;
            }
            int i17 = iM36863;
            int[] iArr6 = iArr5;
            if (iArr3 == null) {
                iArr3 = iArr6;
            }
            if (iArr4 == null) {
                iArr4 = iArr6;
            }
            int[] iArr7 = new int[iArrM1954.length + iArr3.length + iArr4.length];
            System.arraycopy(iArrM1954, 0, iArr7, 0, iArrM1954.length);
            System.arraycopy(iArr3, 0, iArr7, iArrM1954.length, iArr3.length);
            System.arraycopy(iArr4, 0, iArr7, iArrM1954.length + iArr3.length, iArr4.length);
            return new C21088(iArr2, objArr, iM36862, i17, c0317.mo1958(), iArr7, iArrM1954.length, iArrM1954.length + iArr3.length, interfaceC20383, abstractC19347, abstractC5297, abstractC5524, interfaceC14034);
        }
        throw null;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final Object mo18054() {
        return this.f68703.mo2897(this.f68700);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01c2  */
    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo18059(AbstractC16129 abstractC16129, AbstractC16129 abstractC161210) {
        int[] iArr = this.f68696;
        int length = iArr.length;
        int i = 0;
        while (true) {
            boolean zM50666 = true;
            if (i >= length) {
                AbstractC5297 abstractC5297 = this.f68705;
                if (abstractC5297.mo14687(abstractC16129).equals(abstractC5297.mo14687(abstractC161210))) {
                    if (!this.f68697) {
                        return true;
                    }
                    AbstractC5524 abstractC5524 = this.f68694;
                    return abstractC5524.mo4619((Object) abstractC16129).equals(abstractC5524.mo4619((Object) abstractC161210));
                }
            } else {
                int iM47524 = m47524(i);
                long j = iM47524 & 1048575;
                switch (m47512(iM47524)) {
                    case 0:
                        if (!m47511(abstractC16129, abstractC161210, i) || Double.doubleToLongBits(C15882.m37798(j, abstractC16129)) != Double.doubleToLongBits(C15882.m37798(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                    case 1:
                        if (!m47511(abstractC16129, abstractC161210, i) || Float.floatToIntBits(C15882.m37760(j, abstractC16129)) != Float.floatToIntBits(C15882.m37760(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                    case 2:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37765(j, abstractC16129) != C15882.m37765(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 3:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37765(j, abstractC16129) != C15882.m37765(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 4:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 5:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37765(j, abstractC16129) != C15882.m37765(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 6:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 7:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37784(j, abstractC16129) != C15882.m37784(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 8:
                        if (!m47511(abstractC16129, abstractC161210, i) || !C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                    case 9:
                        if (!m47511(abstractC16129, abstractC161210, i) || !C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                    case 10:
                        if (!m47511(abstractC16129, abstractC161210, i) || !C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                    case 11:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 12:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 13:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 14:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37765(j, abstractC16129) != C15882.m37765(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 15:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37791(j, abstractC16129) != C15882.m37791(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 16:
                        if (!m47511(abstractC16129, abstractC161210, i) || C15882.m37765(j, abstractC16129) != C15882.m37765(j, abstractC161210)) {
                            zM50666 = false;
                        }
                        break;
                    case 17:
                        if (!m47511(abstractC16129, abstractC161210, i) || !C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210))) {
                            zM50666 = false;
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
                        zM50666 = C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210));
                        break;
                    case 50:
                        zM50666 = C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210));
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
                        if (C15882.m37791(j2, abstractC16129) != C15882.m37791(j2, abstractC161210) || !C22896.m50666(C15882.m37785(j, abstractC16129), C15882.m37785(j, abstractC161210))) {
                            zM50666 = false;
                        }
                        break;
                }
                if (zM50666) {
                    i += 3;
                }
            }
        }
        return false;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final int mo18052(AbstractC16129 abstractC16129) {
        int i;
        int iM24887;
        int i2;
        int iM37791;
        int[] iArr = this.f68696;
        int length = iArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int iM47524 = m47524(i4);
            int i5 = iArr[i4];
            long j = 1048575 & iM47524;
            int iHashCode = 37;
            switch (m47512(iM47524)) {
                case 0:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(Double.doubleToLongBits(C15882.m37798(j, abstractC16129)));
                    i3 = iM24887 + i;
                    break;
                case 1:
                    i = i3 * 53;
                    iM24887 = Float.floatToIntBits(C15882.m37760(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 2:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(C15882.m37765(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 3:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(C15882.m37765(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 4:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 5:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(C15882.m37765(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 6:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 7:
                    i = i3 * 53;
                    iM24887 = C9779.m24888(C15882.m37784(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 8:
                    i = i3 * 53;
                    iM24887 = ((String) C15882.m37785(j, abstractC16129)).hashCode();
                    i3 = iM24887 + i;
                    break;
                case 9:
                    Object objM37785 = C15882.m37785(j, abstractC16129);
                    if (objM37785 != null) {
                        iHashCode = objM37785.hashCode();
                    }
                    i3 = (i3 * 53) + iHashCode;
                    break;
                case 10:
                    i = i3 * 53;
                    iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                    i3 = iM24887 + i;
                    break;
                case 11:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 12:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 13:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 14:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(C15882.m37765(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 15:
                    i2 = i3 * 53;
                    iM37791 = C15882.m37791(j, abstractC16129);
                    i3 = i2 + iM37791;
                    break;
                case 16:
                    i = i3 * 53;
                    iM24887 = C9779.m24887(C15882.m37765(j, abstractC16129));
                    i3 = iM24887 + i;
                    break;
                case 17:
                    Object objM37786 = C15882.m37785(j, abstractC16129);
                    if (objM37786 != null) {
                        iHashCode = objM37786.hashCode();
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
                    iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                    i3 = iM24887 + i;
                    break;
                case 50:
                    i = i3 * 53;
                    iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                    i3 = iM24887 + i;
                    break;
                case 51:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(Double.doubleToLongBits(((Double) C15882.m37785(j, abstractC16129)).doubleValue()));
                        i3 = iM24887 + i;
                    }
                    break;
                case 52:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = Float.floatToIntBits(((Float) C15882.m37785(j, abstractC16129)).floatValue());
                        i3 = iM24887 + i;
                    }
                    break;
                case 53:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(m47518(j, abstractC16129));
                        i3 = iM24887 + i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(m47518(j, abstractC16129));
                        i3 = iM24887 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case 56:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(m47518(j, abstractC16129));
                        i3 = iM24887 + i;
                    }
                    break;
                case 57:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24888(((Boolean) C15882.m37785(j, abstractC16129)).booleanValue());
                        i3 = iM24887 + i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = ((String) C15882.m37785(j, abstractC16129)).hashCode();
                        i3 = iM24887 + i;
                    }
                    break;
                case 60:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                        i3 = iM24887 + i;
                    }
                    break;
                case 61:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                        i3 = iM24887 + i;
                    }
                    break;
                case 62:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case 63:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case 64:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case 65:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(m47518(j, abstractC16129));
                        i3 = iM24887 + i;
                    }
                    break;
                case 66:
                    if (m47508(i5, i4, abstractC16129)) {
                        i2 = i3 * 53;
                        iM37791 = m47499(j, abstractC16129);
                        i3 = i2 + iM37791;
                    }
                    break;
                case 67:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C9779.m24887(m47518(j, abstractC16129));
                        i3 = iM24887 + i;
                    }
                    break;
                case 68:
                    if (m47508(i5, i4, abstractC16129)) {
                        i = i3 * 53;
                        iM24887 = C15882.m37785(j, abstractC16129).hashCode();
                        i3 = iM24887 + i;
                    }
                    break;
            }
        }
        int iHashCode2 = this.f68705.mo14687(abstractC16129).hashCode() + (i3 * 53);
        return this.f68697 ? (iHashCode2 * 53) + this.f68694.mo4619((Object) abstractC16129).hashCode() : iHashCode2;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18056(Object obj, Object obj2) {
        m47517(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f68696;
            if (i >= iArr.length) {
                int i2 = C22896.f74441;
                AbstractC5297 abstractC5297 = this.f68705;
                abstractC5297.mo14686(obj, abstractC5297.mo14676(abstractC5297.mo14687(obj), abstractC5297.mo14687(obj2)));
                if (this.f68697) {
                    AbstractC5524 abstractC5524 = this.f68694;
                    C8347 c8347Mo4619 = abstractC5524.mo4619(obj2);
                    if (c8347Mo4619.m21845()) {
                        return;
                    }
                    abstractC5524.mo4625(obj).m21840(c8347Mo4619);
                    return;
                }
                return;
            }
            int iM47524 = m47524(i);
            long j = 1048575 & iM47524;
            int i3 = iArr[i];
            switch (m47512(iM47524)) {
                case 0:
                    if (m47509(i, obj2)) {
                        C15882.m37777(obj, j, C15882.m37798(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 1:
                    if (m47509(i, obj2)) {
                        C15882.m37778(obj, j, C15882.m37760(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 2:
                    if (m47509(i, obj2)) {
                        C15882.m37779(obj, j, C15882.m37765(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 3:
                    if (m47509(i, obj2)) {
                        C15882.m37779(obj, j, C15882.m37765(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 4:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 5:
                    if (m47509(i, obj2)) {
                        C15882.m37779(obj, j, C15882.m37765(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 6:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 7:
                    if (m47509(i, obj2)) {
                        C15882.m37789(obj, j, C15882.m37784(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 8:
                    if (m47509(i, obj2)) {
                        C15882.m37774(j, obj, C15882.m37785(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 9:
                    m47502(i, obj, obj2);
                    break;
                case 10:
                    if (m47509(i, obj2)) {
                        C15882.m37774(j, obj, C15882.m37785(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 11:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 12:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 13:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 14:
                    if (m47509(i, obj2)) {
                        C15882.m37779(obj, j, C15882.m37765(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 15:
                    if (m47509(i, obj2)) {
                        C15882.m37773(C15882.m37791(j, obj2), j, obj);
                        m47515(i, obj);
                    }
                    break;
                case 16:
                    if (m47509(i, obj2)) {
                        C15882.m37779(obj, j, C15882.m37765(j, obj2));
                        m47515(i, obj);
                    }
                    break;
                case 17:
                    m47502(i, obj, obj2);
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
                    this.f68693.mo21204(j, obj, obj2);
                    break;
                case 50:
                    int i4 = C22896.f74441;
                    C15882.m37774(j, obj, this.f68695.mo8352(C15882.m37785(j, obj), C15882.m37785(j, obj2)));
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
                    if (m47508(i3, i, obj2)) {
                        C15882.m37774(j, obj, C15882.m37785(j, obj2));
                        m47514(i3, i, obj);
                    }
                    break;
                case 60:
                    m47522(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (m47508(i3, i, obj2)) {
                        C15882.m37774(j, obj, C15882.m37785(j, obj2));
                        m47514(i3, i, obj);
                    }
                    break;
                case 68:
                    m47522(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47502(int i, Object obj, Object obj2) {
        if (m47509(i, obj2)) {
            long jM47524 = m47524(i) & 1048575;
            Unsafe unsafe = f68691;
            Object object = unsafe.getObject(obj2, jM47524);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f68696[i] + " is present but null: " + obj2);
            }
            InterfaceC6667 interfaceC6667M47513 = m47513(i);
            if (!m47509(i, obj)) {
                if (!m47498(object)) {
                    unsafe.putObject(obj, jM47524, object);
                } else {
                    Object objMo18054 = interfaceC6667M47513.mo18054();
                    interfaceC6667M47513.mo18056(objMo18054, object);
                    unsafe.putObject(obj, jM47524, objMo18054);
                }
                m47515(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM47524);
            if (!m47498(object2)) {
                Object objMo18055 = interfaceC6667M47513.mo18054();
                interfaceC6667M47513.mo18056(objMo18055, object2);
                unsafe.putObject(obj, jM47524, objMo18055);
                object2 = objMo18055;
            }
            interfaceC6667M47513.mo18056(object2, object);
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
    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final int mo18053(AbstractC18079 abstractC18079) {
        int i;
        int i2;
        int i3;
        int i4;
        int iM48973;
        int iM48974;
        int iM48967;
        int iM48975;
        int iM48965;
        int iM48976;
        int serializedSize;
        int iM48959;
        int iM48964;
        InterfaceC23206 interfaceC23206;
        InterfaceC6667 interfaceC6667M47513;
        int iM50673;
        int iM48977;
        int size;
        int iM50653;
        int iM48978;
        int iM48961;
        int iM48979;
        int iM489710;
        int iM489510;
        int iM489711;
        int iM489712;
        Unsafe unsafe = f68691;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iM48968 = 0;
        C21088 c21088 = this;
        AbstractC18079 abstractC180710 = abstractC18079;
        while (true) {
            int[] iArr = c21088.f68696;
            if (i8 >= iArr.length) {
                AbstractC5297 abstractC5297 = c21088.f68705;
                int iMo14685 = iM48968 + abstractC5297.mo14685(abstractC5297.mo14687(abstractC180710));
                return c21088.f68697 ? iMo14685 + c21088.f68694.mo4619((Object) abstractC180710).m21836() : iMo14685;
            }
            int iM47524 = c21088.m47524(i8);
            int iM47512 = m47512(iM47524);
            int i9 = iArr[i8];
            int i10 = iArr[i8 + 2];
            int i11 = i10 & i5;
            if (iM47512 <= 17) {
                if (i11 != i6) {
                    i7 = i11 == i5 ? 0 : unsafe.getInt(abstractC180710, i11);
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
            long j = i5 & iM47524;
            if (iM47512 < EnumC10464.f35716.m26437() || iM47512 > EnumC10464.f35733.m26437()) {
                i11 = 0;
            }
            boolean z = c21088.f68699;
            switch (iM47512) {
                case 0:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48973 = AbstractC22044.m48973(i9);
                        iM48964 = iM48973 + 8;
                        iM48968 += iM48964;
                    }
                    break;
                case 1:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48974 = AbstractC22044.m48973(i9);
                        iM48965 = iM48974 + 4;
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 2:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48967(i9, unsafe.getLong(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 3:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48962(i9, unsafe.getLong(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 4:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48974(i9, unsafe.getInt(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 5:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48975 = AbstractC22044.m48973(i9);
                        iM48965 = iM48975 + 8;
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 6:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48965 = AbstractC22044.m48965(i9);
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 7:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48965 = AbstractC22044.m48961(i9);
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 8:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        Object object = unsafe.getObject(abstractC180710, j);
                        iM48968 += object instanceof AbstractC23725 ? AbstractC22044.m48968(i9, (AbstractC23725) object) : AbstractC22044.m48970((String) object) + AbstractC22044.m48973(i9);
                    }
                    c21088 = this;
                    break;
                case 9:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        Object object2 = unsafe.getObject(abstractC180710, j);
                        InterfaceC6667 interfaceC6667M47514 = c21088.m47513(i8);
                        int i12 = C22896.f74441;
                        if (object2 instanceof C15114) {
                            iM48964 = AbstractC22044.m48964(i9, (C15114) object2);
                        } else {
                            iM48976 = AbstractC22044.m48973(i9);
                            serializedSize = ((AbstractC18079) ((InterfaceC23206) object2)).getSerializedSize(interfaceC6667M47514);
                            iM48959 = AbstractC22044.m48959(serializedSize);
                            iM48964 = iM48959 + serializedSize + iM48976;
                        }
                        iM48968 += iM48964;
                    }
                    break;
                case 10:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48968(i9, (AbstractC23725) unsafe.getObject(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 11:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48960(i9, unsafe.getInt(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 12:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48967 = AbstractC22044.m48966(i9, unsafe.getInt(abstractC180710, j));
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 13:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48974 = AbstractC22044.m48973(i9);
                        iM48965 = iM48974 + 4;
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 14:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i4, i2, i3)) {
                        iM48975 = AbstractC22044.m48973(i9);
                        iM48965 = iM48975 + 8;
                        iM48968 += iM48965;
                    }
                    c21088 = this;
                    abstractC180710 = abstractC18079;
                    break;
                case 15:
                    i4 = i;
                    if (c21088.m47510(abstractC180710, i8, i, i2, i3)) {
                        int i13 = unsafe.getInt(abstractC180710, j);
                        iM48967 = AbstractC22044.m48959((i13 >> 31) ^ (i13 << 1)) + AbstractC22044.m48973(i9);
                        iM48968 += iM48967;
                    }
                    c21088 = this;
                    break;
                case 16:
                    if (c21088.m47510(abstractC180710, i8, i, i2, i3)) {
                        long j2 = unsafe.getLong(abstractC180710, j);
                        iM48968 += AbstractC22044.m48969((j2 >> 63) ^ (j2 << 1)) + AbstractC22044.m48973(i9);
                    }
                    i4 = i;
                    c21088 = this;
                    break;
                case 17:
                    if (c21088.m47510(abstractC180710, i8, i, i2, i3)) {
                        interfaceC23206 = (InterfaceC23206) unsafe.getObject(abstractC180710, j);
                        interfaceC6667M47513 = c21088.m47513(i8);
                        iM48979 = AbstractC22044.m48973(i9) * 2;
                        iM50653 = ((AbstractC18079) interfaceC23206).getSerializedSize(interfaceC6667M47513);
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 18:
                    iM50673 = C22896.m50673(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 19:
                    iM50673 = C22896.m50658(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(abstractC180710, j);
                    int i14 = C22896.f74441;
                    if (list.size() == 0) {
                        iM48977 = 0;
                    } else {
                        iM48977 = (AbstractC22044.m48973(i9) * list.size()) + C22896.m50670(list);
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(abstractC180710, j);
                    int i15 = C22896.f74441;
                    size = list2.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50653(list2);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(abstractC180710, j);
                    int i16 = C22896.f74441;
                    size = list3.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50674(list3);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 23:
                    iM50673 = C22896.m50673(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 24:
                    iM50673 = C22896.m50658(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(abstractC180710, j);
                    int i17 = C22896.f74441;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iM48961 = 0;
                    } else {
                        iM48961 = size2 * AbstractC22044.m48961(i9);
                    }
                    iM48968 += iM48961;
                    i4 = i;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(abstractC180710, j);
                    int i18 = C22896.f74441;
                    int size3 = list5.size();
                    if (size3 == 0) {
                        iM48977 = 0;
                    } else {
                        iM48977 = AbstractC22044.m48973(i9) * size3;
                        if (list5 instanceof InterfaceC17935) {
                            InterfaceC17935 interfaceC17935 = (InterfaceC17935) list5;
                            for (int i19 = 0; i19 < size3; i19++) {
                                Object objMo21384 = interfaceC17935.mo21384(i19);
                                if (objMo21384 instanceof AbstractC23725) {
                                    int size4 = ((AbstractC23725) objMo21384).size();
                                    iM48977 = AbstractC22044.m48959(size4) + size4 + iM48977;
                                } else {
                                    iM48977 = AbstractC22044.m48970((String) objMo21384) + iM48977;
                                }
                            }
                        } else {
                            for (int i20 = 0; i20 < size3; i20++) {
                                Object obj = list5.get(i20);
                                if (obj instanceof AbstractC23725) {
                                    int size5 = ((AbstractC23725) obj).size();
                                    iM48977 = AbstractC22044.m48959(size5) + size5 + iM48977;
                                } else {
                                    iM48977 = AbstractC22044.m48970((String) obj) + iM48977;
                                }
                            }
                        }
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(abstractC180710, j);
                    InterfaceC6667 interfaceC6667M47515 = c21088.m47513(i8);
                    int i21 = C22896.f74441;
                    int size6 = list6.size();
                    if (size6 == 0) {
                        iM48961 = 0;
                    } else {
                        int iM489713 = AbstractC22044.m48973(i9) * size6;
                        for (int i22 = 0; i22 < size6; i22++) {
                            Object obj2 = list6.get(i22);
                            int iM36204 = obj2 instanceof C15114 ? ((C15114) obj2).m36204() : ((AbstractC18079) ((InterfaceC23206) obj2)).getSerializedSize(interfaceC6667M47515);
                            iM489713 += AbstractC22044.m48959(iM36204) + iM36204;
                        }
                        iM48961 = iM489713;
                    }
                    iM48968 += iM48961;
                    i4 = i;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(abstractC180710, j);
                    int i23 = C22896.f74441;
                    int size7 = list7.size();
                    if (size7 == 0) {
                        iM48977 = 0;
                    } else {
                        iM48977 = AbstractC22044.m48973(i9) * size7;
                        for (int i24 = 0; i24 < list7.size(); i24++) {
                            int size8 = ((AbstractC23725) list7.get(i24)).size();
                            iM48977 += AbstractC22044.m48959(size8) + size8;
                        }
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(abstractC180710, j);
                    int i25 = C22896.f74441;
                    size = list8.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50681(list8);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(abstractC180710, j);
                    int i26 = C22896.f74441;
                    size = list9.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50659(list9);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 31:
                    iM50673 = C22896.m50658(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 32:
                    iM50673 = C22896.m50673(i9, (List) unsafe.getObject(abstractC180710, j));
                    iM48964 = iM50673;
                    i4 = i;
                    iM48968 += iM48964;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(abstractC180710, j);
                    int i27 = C22896.f74441;
                    size = list10.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50655(list10);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(abstractC180710, j);
                    int i28 = C22896.f74441;
                    size = list11.size();
                    if (size == 0) {
                        iM48977 = 0;
                    } else {
                        iM50653 = C22896.m50667(list11);
                        iM48978 = AbstractC22044.m48973(i9);
                        iM48979 = iM48978 * size;
                        iM48977 = iM48979 + iM50653;
                    }
                    iM48968 += iM48977;
                    i4 = i;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(abstractC180710, j);
                    int i29 = C22896.f74441;
                    iM50653 = list12.size() * 8;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(abstractC180710, j);
                    int i30 = C22896.f74441;
                    iM50653 = list13.size() * 4;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 37:
                    iM50653 = C22896.m50670((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 38:
                    iM50653 = C22896.m50653((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 39:
                    iM50653 = C22896.m50674((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(abstractC180710, j);
                    int i31 = C22896.f74441;
                    iM50653 = list14.size() * 8;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(abstractC180710, j);
                    int i32 = C22896.f74441;
                    iM50653 = list15.size() * 4;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(abstractC180710, j);
                    int i33 = C22896.f74441;
                    iM50653 = list16.size();
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 43:
                    iM50653 = C22896.m50681((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 44:
                    iM50653 = C22896.m50659((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    List list17 = (List) unsafe.getObject(abstractC180710, j);
                    int i34 = C22896.f74441;
                    iM50653 = list17.size() * 4;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(abstractC180710, j);
                    int i35 = C22896.f74441;
                    iM50653 = list18.size() * 8;
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 47:
                    iM50653 = C22896.m50655((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 48:
                    iM50653 = C22896.m50667((List) unsafe.getObject(abstractC180710, j));
                    if (iM50653 > 0) {
                        if (z) {
                            unsafe.putInt(abstractC180710, i11, iM50653);
                        }
                        iM489710 = AbstractC22044.m48973(i9);
                        iM489510 = AbstractC22044.m48959(iM50653);
                        iM48979 = iM489510 + iM489710;
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
                    }
                    i4 = i;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(abstractC180710, j);
                    InterfaceC6667 interfaceC6667M47516 = c21088.m47513(i8);
                    int i36 = C22896.f74441;
                    int size9 = list19.size();
                    if (size9 == 0) {
                        iM48961 = 0;
                    } else {
                        int iM489714 = 0;
                        for (int i37 = 0; i37 < size9; i37++) {
                            iM489714 += (AbstractC22044.m48973(i9) * 2) + ((AbstractC18079) ((InterfaceC23206) list19.get(i37))).getSerializedSize(interfaceC6667M47516);
                        }
                        iM48961 = iM489714;
                    }
                    iM48968 += iM48961;
                    i4 = i;
                    break;
                case 50:
                    c21088.f68695.mo8353(i9, unsafe.getObject(abstractC180710, j), c21088.m47519(i8));
                    i4 = i;
                    break;
                case 51:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM489711 = AbstractC22044.m48973(i9);
                        iM48973 = iM489711;
                        i4 = i;
                        iM48964 = iM48973 + 8;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 52:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM489712 = AbstractC22044.m48973(i9);
                        iM50673 = iM489712 + 4;
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 53:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48967(i9, m47518(j, abstractC180710));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48962(i9, m47518(j, abstractC180710));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48974(i9, m47499(j, abstractC180710));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 56:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM489711 = AbstractC22044.m48973(i9);
                        iM48973 = iM489711;
                        i4 = i;
                        iM48964 = iM48973 + 8;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 57:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48965(i9);
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48961(i9);
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        Object object3 = unsafe.getObject(abstractC180710, j);
                        iM48968 = (object3 instanceof AbstractC23725 ? AbstractC22044.m48968(i9, (AbstractC23725) object3) : AbstractC22044.m48970((String) object3) + AbstractC22044.m48973(i9)) + iM48968;
                    }
                    i4 = i;
                    break;
                case 60:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        Object object4 = unsafe.getObject(abstractC180710, j);
                        InterfaceC6667 interfaceC6667M47517 = c21088.m47513(i8);
                        int i38 = C22896.f74441;
                        if (object4 instanceof C15114) {
                            iM50673 = AbstractC22044.m48964(i9, (C15114) object4);
                            iM48964 = iM50673;
                            i4 = i;
                            iM48968 += iM48964;
                        } else {
                            int iM489715 = AbstractC22044.m48973(i9);
                            int serializedSize2 = ((AbstractC18079) ((InterfaceC23206) object4)).getSerializedSize(interfaceC6667M47517);
                            iM48976 = iM489715;
                            iM48959 = AbstractC22044.m48959(serializedSize2);
                            serializedSize = serializedSize2;
                            i4 = i;
                            iM48964 = iM48959 + serializedSize + iM48976;
                            iM48968 += iM48964;
                        }
                    } else {
                        i4 = i;
                    }
                    break;
                case 61:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48968(i9, (AbstractC23725) unsafe.getObject(abstractC180710, j));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 62:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48960(i9, m47499(j, abstractC180710));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 63:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM50673 = AbstractC22044.m48966(i9, m47499(j, abstractC180710));
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 64:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM489712 = AbstractC22044.m48973(i9);
                        iM50673 = iM489712 + 4;
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 65:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        iM489711 = AbstractC22044.m48973(i9);
                        iM48973 = iM489711;
                        i4 = i;
                        iM48964 = iM48973 + 8;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 66:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        int iM47499 = m47499(j, abstractC180710);
                        iM50673 = AbstractC22044.m48959((iM47499 >> 31) ^ (iM47499 << 1)) + AbstractC22044.m48973(i9);
                        iM48964 = iM50673;
                        i4 = i;
                        iM48968 += iM48964;
                    } else {
                        i4 = i;
                    }
                    break;
                case 67:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        long jM47518 = m47518(j, abstractC180710);
                        iM48961 = AbstractC22044.m48969((jM47518 >> 63) ^ (jM47518 << 1)) + AbstractC22044.m48973(i9);
                        iM48968 += iM48961;
                    }
                    i4 = i;
                    break;
                case 68:
                    if (c21088.m47508(i9, i8, abstractC180710)) {
                        interfaceC23206 = (InterfaceC23206) unsafe.getObject(abstractC180710, j);
                        interfaceC6667M47513 = c21088.m47513(i8);
                        iM48979 = AbstractC22044.m48973(i9) * 2;
                        iM50653 = ((AbstractC18079) interfaceC23206).getSerializedSize(interfaceC6667M47513);
                        iM48977 = iM48979 + iM50653;
                        iM48968 += iM48977;
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
    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18057(Object obj, InterfaceC12976 interfaceC12976) {
        Iterator itM21839;
        Map.Entry entry;
        C0876 c0876 = (C0876) interfaceC12976;
        c0876.getClass();
        if (EnumC0980.ASCENDING != EnumC0980.DESCENDING) {
            m47523(obj, interfaceC12976);
            return;
        }
        AbstractC5297 abstractC5297 = this.f68705;
        abstractC5297.mo14690(abstractC5297.mo14687(obj), interfaceC12976);
        boolean z = this.f68697;
        AbstractC5524 abstractC5524 = this.f68694;
        if (z) {
            C8347 c8347Mo4619 = abstractC5524.mo4619(obj);
            if (c8347Mo4619.m21845()) {
                itM21839 = null;
                entry = null;
            } else {
                itM21839 = c8347Mo4619.m21839();
                entry = (Map.Entry) itM21839.next();
            }
        } else {
            itM21839 = null;
            entry = null;
        }
        int[] iArr = this.f68696;
        int length = iArr.length;
        while (true) {
            length -= 3;
            if (length < 0) {
                while (entry != null) {
                    abstractC5524.mo4620(interfaceC12976, entry);
                    entry = itM21839.hasNext() ? (Map.Entry) itM21839.next() : null;
                }
                return;
            }
            int iM47524 = m47524(length);
            int i = iArr[length];
            while (entry != null && abstractC5524.mo4616(entry) > i) {
                abstractC5524.mo4620(interfaceC12976, entry);
                entry = itM21839.hasNext() ? (Map.Entry) itM21839.next() : null;
            }
            switch (m47512(iM47524)) {
                case 0:
                    if (m47509(length, obj)) {
                        c0876.m3517(i, C15882.m37798(iM47524 & 1048575, obj));
                    }
                    break;
                case 1:
                    if (m47509(length, obj)) {
                        c0876.m3515(C15882.m37760(iM47524 & 1048575, obj), i);
                    }
                    break;
                case 2:
                    if (m47509(length, obj)) {
                        c0876.m3539(i, C15882.m37765(iM47524 & 1048575, obj));
                    }
                    break;
                case 3:
                    if (m47509(length, obj)) {
                        c0876.m3529(i, C15882.m37765(iM47524 & 1048575, obj));
                    }
                    break;
                case 4:
                    if (m47509(length, obj)) {
                        c0876.m3532(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 5:
                    if (m47509(length, obj)) {
                        c0876.m3519(i, C15882.m37765(iM47524 & 1048575, obj));
                    }
                    break;
                case 6:
                    if (m47509(length, obj)) {
                        c0876.m3538(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 7:
                    if (m47509(length, obj)) {
                        c0876.m3526(i, C15882.m37784(iM47524 & 1048575, obj));
                    }
                    break;
                case 8:
                    if (m47509(length, obj)) {
                        m47503(i, C15882.m37785(iM47524 & 1048575, obj), interfaceC12976);
                    }
                    break;
                case 9:
                    if (m47509(length, obj)) {
                        c0876.m3541(i, C15882.m37785(iM47524 & 1048575, obj), m47513(length));
                    }
                    break;
                case 10:
                    if (m47509(length, obj)) {
                        c0876.m3525(i, (AbstractC23725) C15882.m37785(iM47524 & 1048575, obj));
                    }
                    break;
                case 11:
                    if (m47509(length, obj)) {
                        c0876.m3547(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 12:
                    if (m47509(length, obj)) {
                        c0876.m3518(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 13:
                    if (m47509(length, obj)) {
                        c0876.m3511(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 14:
                    if (m47509(length, obj)) {
                        c0876.m3533(i, C15882.m37765(iM47524 & 1048575, obj));
                    }
                    break;
                case 15:
                    if (m47509(length, obj)) {
                        c0876.m3528(i, C15882.m37791(iM47524 & 1048575, obj));
                    }
                    break;
                case 16:
                    if (m47509(length, obj)) {
                        c0876.m3512(i, C15882.m37765(iM47524 & 1048575, obj));
                    }
                    break;
                case 17:
                    if (m47509(length, obj)) {
                        c0876.m3521(i, C15882.m37785(iM47524 & 1048575, obj), m47513(length));
                    }
                    break;
                case 18:
                    C22896.m50677(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 19:
                    C22896.m50682(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 20:
                    C22896.m50672(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 21:
                    C22896.m50679(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 22:
                    C22896.m50654(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 23:
                    C22896.m50668(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 24:
                    C22896.m50656(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 25:
                    C22896.m50664(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 26:
                    int i2 = iArr[length];
                    List list = (List) C15882.m37785(iM47524 & 1048575, obj);
                    int i3 = C22896.f74441;
                    if (list != null && !list.isEmpty()) {
                        c0876.m3542(i2, list);
                    }
                    break;
                case 27:
                    C22896.m50676(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, m47513(length));
                    break;
                case 28:
                    int i4 = iArr[length];
                    List list2 = (List) C15882.m37785(iM47524 & 1048575, obj);
                    int i5 = C22896.f74441;
                    if (list2 != null && !list2.isEmpty()) {
                        c0876.m3523(i4, list2);
                    }
                    break;
                case 29:
                    C22896.m50680(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 30:
                    C22896.m50671(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 31:
                    C22896.m50657(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 32:
                    C22896.m50669(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 33:
                    C22896.m50683(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 34:
                    C22896.m50678(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, false);
                    break;
                case 35:
                    C22896.m50677(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 36:
                    C22896.m50682(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 37:
                    C22896.m50672(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 38:
                    C22896.m50679(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 39:
                    C22896.m50654(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 40:
                    C22896.m50668(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 41:
                    C22896.m50656(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 42:
                    C22896.m50664(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 43:
                    C22896.m50680(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 44:
                    C22896.m50671(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C22896.m50657(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 46:
                    C22896.m50669(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 47:
                    C22896.m50683(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 48:
                    C22896.m50678(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, true);
                    break;
                case 49:
                    C22896.m50663(iArr[length], (List) C15882.m37785(iM47524 & 1048575, obj), interfaceC12976, m47513(length));
                    break;
                case 50:
                    Object objM37785 = C15882.m37785(iM47524 & 1048575, obj);
                    if (objM37785 != null) {
                        Object objM47519 = m47519(length);
                        InterfaceC14034 interfaceC14034 = this.f68695;
                        interfaceC14034.mo8354(objM47519);
                        c0876.m3524(i, interfaceC14034.mo8351(objM37785));
                    }
                    break;
                case 51:
                    if (m47508(i, length, obj)) {
                        c0876.m3517(i, ((Double) C15882.m37785(iM47524 & 1048575, obj)).doubleValue());
                    }
                    break;
                case 52:
                    if (m47508(i, length, obj)) {
                        c0876.m3515(((Float) C15882.m37785(iM47524 & 1048575, obj)).floatValue(), i);
                    }
                    break;
                case 53:
                    if (m47508(i, length, obj)) {
                        c0876.m3539(i, m47518(iM47524 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (m47508(i, length, obj)) {
                        c0876.m3529(i, m47518(iM47524 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (m47508(i, length, obj)) {
                        c0876.m3532(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case 56:
                    if (m47508(i, length, obj)) {
                        c0876.m3519(i, m47518(iM47524 & 1048575, obj));
                    }
                    break;
                case 57:
                    if (m47508(i, length, obj)) {
                        c0876.m3538(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (m47508(i, length, obj)) {
                        c0876.m3526(i, ((Boolean) C15882.m37785(iM47524 & 1048575, obj)).booleanValue());
                    }
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (m47508(i, length, obj)) {
                        m47503(i, C15882.m37785(iM47524 & 1048575, obj), interfaceC12976);
                    }
                    break;
                case 60:
                    if (m47508(i, length, obj)) {
                        c0876.m3541(i, C15882.m37785(iM47524 & 1048575, obj), m47513(length));
                    }
                    break;
                case 61:
                    if (m47508(i, length, obj)) {
                        c0876.m3525(i, (AbstractC23725) C15882.m37785(iM47524 & 1048575, obj));
                    }
                    break;
                case 62:
                    if (m47508(i, length, obj)) {
                        c0876.m3547(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case 63:
                    if (m47508(i, length, obj)) {
                        c0876.m3518(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case 64:
                    if (m47508(i, length, obj)) {
                        c0876.m3511(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case 65:
                    if (m47508(i, length, obj)) {
                        c0876.m3533(i, m47518(iM47524 & 1048575, obj));
                    }
                    break;
                case 66:
                    if (m47508(i, length, obj)) {
                        c0876.m3528(i, m47499(iM47524 & 1048575, obj));
                    }
                    break;
                case 67:
                    if (m47508(i, length, obj)) {
                        c0876.m3512(i, m47518(iM47524 & 1048575, obj));
                    }
                    break;
                case 68:
                    if (m47508(i, length, obj)) {
                        c0876.m3521(i, C15882.m37785(iM47524 & 1048575, obj), m47513(length));
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47523(Object obj, InterfaceC12976 interfaceC12976) {
        Map.Entry entry;
        Iterator itM21847;
        int i;
        int i2;
        Map.Entry entry2;
        int i3;
        Map.Entry entry3;
        int[] iArr;
        int i4;
        boolean z = this.f68697;
        AbstractC5524 abstractC5524 = this.f68694;
        if (z) {
            C8347 c8347Mo4619 = abstractC5524.mo4619(obj);
            if (c8347Mo4619.m21845()) {
                entry = null;
                itM21847 = null;
            } else {
                itM21847 = c8347Mo4619.m21847();
                entry = (Map.Entry) itM21847.next();
            }
        } else {
            entry = null;
            itM21847 = null;
        }
        Iterator it = itM21847;
        int[] iArr2 = this.f68696;
        int length = iArr2.length;
        Unsafe unsafe = f68691;
        int i5 = 1048575;
        int i6 = 0;
        C21088 c21088 = this;
        int i7 = 0;
        while (i7 < length) {
            int iM47524 = c21088.m47524(i7);
            int i8 = iArr2[i7];
            int iM47512 = m47512(iM47524);
            if (iM47512 <= 17) {
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
            while (entry2 != null && abstractC5524.mo4616(entry2) <= i8) {
                abstractC5524.mo4620(interfaceC12976, entry2);
                entry2 = it.hasNext() ? (Map.Entry) it.next() : null;
            }
            long j = iM47524 & 1048575;
            switch (iM47512) {
                case 0:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3517(i8, C15882.m37798(j, obj));
                    }
                    break;
                case 1:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3515(C15882.m37760(j, obj), i8);
                    }
                    c21088 = this;
                    break;
                case 2:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3539(i8, unsafe.getLong(obj, j));
                    }
                    c21088 = this;
                    break;
                case 3:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3529(i8, unsafe.getLong(obj, j));
                    }
                    c21088 = this;
                    break;
                case 4:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3532(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 5:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3519(i8, unsafe.getLong(obj, j));
                    }
                    c21088 = this;
                    break;
                case 6:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3538(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 7:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3526(i8, C15882.m37784(j, obj));
                    }
                    c21088 = this;
                    break;
                case 8:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        m47503(i8, unsafe.getObject(obj, j), interfaceC12976);
                    }
                    c21088 = this;
                    break;
                case 9:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3541(i8, unsafe.getObject(obj, j), c21088.m47513(i7));
                    }
                    break;
                case 10:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3525(i8, (AbstractC23725) unsafe.getObject(obj, j));
                    }
                    c21088 = this;
                    break;
                case 11:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3547(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 12:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3518(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 13:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3511(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 14:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3533(i8, unsafe.getLong(obj, j));
                    }
                    c21088 = this;
                    break;
                case 15:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3528(i8, unsafe.getInt(obj, j));
                    }
                    c21088 = this;
                    break;
                case 16:
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3512(i8, unsafe.getLong(obj, j));
                    }
                    c21088 = this;
                    break;
                case 17:
                    iArr = iArr2;
                    i4 = length;
                    entry3 = entry2;
                    if (c21088.m47510(obj, i7, i, i2, i3)) {
                        ((C0876) interfaceC12976).m3521(i8, unsafe.getObject(obj, j), c21088.m47513(i7));
                    }
                    break;
                case 18:
                    C22896.m50677(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 19:
                    C22896.m50682(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 20:
                    C22896.m50672(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 21:
                    C22896.m50679(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 22:
                    C22896.m50654(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 23:
                    C22896.m50668(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 24:
                    C22896.m50656(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 25:
                    C22896.m50664(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 26:
                    int i11 = iArr2[i7];
                    List list = (List) unsafe.getObject(obj, j);
                    int i12 = C22896.f74441;
                    if (list != null && !list.isEmpty()) {
                        ((C0876) interfaceC12976).m3542(i11, list);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 27:
                    C22896.m50676(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, c21088.m47513(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 28:
                    int i13 = iArr2[i7];
                    List list2 = (List) unsafe.getObject(obj, j);
                    int i14 = C22896.f74441;
                    if (list2 != null && !list2.isEmpty()) {
                        ((C0876) interfaceC12976).m3523(i13, list2);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 29:
                    C22896.m50680(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 30:
                    C22896.m50671(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 31:
                    C22896.m50657(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 32:
                    C22896.m50669(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 33:
                    C22896.m50683(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 34:
                    C22896.m50678(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, false);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 35:
                    C22896.m50677(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 36:
                    C22896.m50682(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 37:
                    C22896.m50672(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 38:
                    C22896.m50679(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 39:
                    C22896.m50654(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 40:
                    C22896.m50668(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 41:
                    C22896.m50656(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 42:
                    C22896.m50664(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 43:
                    C22896.m50680(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 44:
                    C22896.m50671(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                    C22896.m50657(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 46:
                    C22896.m50669(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 47:
                    C22896.m50683(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 48:
                    C22896.m50678(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, true);
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 49:
                    C22896.m50663(iArr2[i7], (List) unsafe.getObject(obj, j), interfaceC12976, c21088.m47513(i7));
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 50:
                    Object object = unsafe.getObject(obj, j);
                    if (object != null) {
                        Object objM47519 = c21088.m47519(i7);
                        InterfaceC14034 interfaceC14034 = c21088.f68695;
                        interfaceC14034.mo8354(objM47519);
                        ((C0876) interfaceC12976).m3524(i8, interfaceC14034.mo8351(object));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 51:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3517(i8, ((Double) C15882.m37785(j, obj)).doubleValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 52:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3515(((Float) C15882.m37785(j, obj)).floatValue(), i8);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 53:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3539(i8, m47518(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3529(i8, m47518(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3532(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 56:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3519(i8, m47518(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 57:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3538(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3526(i8, ((Boolean) C15882.m37785(j, obj)).booleanValue());
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                    if (c21088.m47508(i8, i7, obj)) {
                        m47503(i8, unsafe.getObject(obj, j), interfaceC12976);
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 60:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3541(i8, unsafe.getObject(obj, j), c21088.m47513(i7));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 61:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3525(i8, (AbstractC23725) unsafe.getObject(obj, j));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 62:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3547(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 63:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3518(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 64:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3511(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 65:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3533(i8, m47518(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 66:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3528(i8, m47499(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 67:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3512(i8, m47518(j, obj));
                    }
                    entry3 = entry2;
                    iArr = iArr2;
                    i4 = length;
                    break;
                case 68:
                    if (c21088.m47508(i8, i7, obj)) {
                        ((C0876) interfaceC12976).m3521(i8, unsafe.getObject(obj, j), c21088.m47513(i7));
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
            abstractC5524.mo4620(interfaceC12976, entry);
            entry = it.hasNext() ? (Map.Entry) it.next() : null;
        }
        AbstractC5297 abstractC5297 = c21088.f68705;
        abstractC5297.mo14690(abstractC5297.mo14687(obj), interfaceC12976);
    }

    /* JADX WARN: Code duplicated, block: B:219:0x0610 A[Catch: all -> 0x0657, TRY_LEAVE, TryCatch #17 {all -> 0x0657, blocks: (B:217:0x060a, B:219:0x0610), top: B:261:0x060a }] */
    /* JADX WARN: Code duplicated, block: B:222:0x0618 A[LOOP:4: B:221:0x0616->B:222:0x0618, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x062b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:226:0x062d A[Catch: all -> 0x0601, TRY_ENTER, TryCatch #3 {all -> 0x0601, blocks: (B:203:0x05e0, B:226:0x062d, B:227:0x0631), top: B:253:0x05e0 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0639 A[LOOP:5: B:229:0x0637->B:230:0x0639, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:243:0x0668 A[LOOP:3: B:242:0x0666->B:243:0x0668, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:245:0x067a  */
    /* JADX WARN: Code duplicated, block: B:291:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0637 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:? A[RETURN, SYNTHETIC] */
    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18058(Object obj, InterfaceC13724 interfaceC13724, C2701 c2701) throws Throwable {
        Object obj2;
        int i;
        int[] iArr;
        AbstractC5297 abstractC5297;
        Object obj3;
        Object objMo14675;
        int i2;
        Object obj4;
        C8347 c8347Mo4625;
        C2701 c2702;
        Object obj5;
        Object obj6;
        Object objM50660;
        C21088 c21088 = this;
        Object obj7 = obj;
        C2701 c2703 = c2701;
        c2701.getClass();
        m47517(obj);
        AbstractC5297 abstractC5298 = c21088.f68705;
        int[] iArr2 = c21088.f68707;
        int i3 = c21088.f68704;
        int i4 = c21088.f68702;
        C8347 c8347 = null;
        Object objMo14676 = null;
        while (true) {
            try {
                int iMo12311 = interfaceC13724.mo12311();
                if (iMo12311 < c21088.f68708 || iMo12311 > c21088.f68698) {
                    i2 = -1;
                } else {
                    int[] iArr3 = c21088.f68696;
                    int length = (iArr3.length / 3) - 1;
                    int i5 = 0;
                    while (true) {
                        if (i5 <= length) {
                            int i6 = (length + i5) >>> 1;
                            int i7 = i6 * 3;
                            int i8 = length;
                            int i9 = iArr3[i7];
                            if (iMo12311 == i9) {
                                i2 = i7;
                            } else if (iMo12311 < i9) {
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
                    obj2 = objMo14676;
                    i = i3;
                    iArr = iArr2;
                    abstractC5297 = abstractC5298;
                    c21088 = this;
                    obj3 = obj7;
                    try {
                        int iM47524 = c21088.m47524(i2);
                        try {
                            int iM47512 = m47512(iM47524);
                            AbstractC19347 abstractC19347 = c21088.f68693;
                            switch (iM47512) {
                                case 0:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37777(obj3, m47497(iM47524), interfaceC13724.readDouble());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 1:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37778(obj3, m47497(iM47524), interfaceC13724.readFloat());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 2:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37779(obj3, m47497(iM47524), interfaceC13724.mo12298());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 3:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37779(obj3, m47497(iM47524), interfaceC13724.mo12294());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 4:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37773(interfaceC13724.mo12284(), m47497(iM47524), obj3);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 5:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37779(obj3, m47497(iM47524), interfaceC13724.mo12286());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 6:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37773(interfaceC13724.mo12321(), m47497(iM47524), obj3);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 7:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37789(obj3, m47497(iM47524), interfaceC13724.mo12308());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 8:
                                    i4 = i4;
                                    c2702 = c2703;
                                    c21088.m47507(obj3, iM47524, interfaceC13724);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 9:
                                    i4 = i4;
                                    c2702 = c2703;
                                    InterfaceC23206 interfaceC23206 = (InterfaceC23206) c21088.m47521(i2, obj3);
                                    interfaceC13724.mo12305(interfaceC23206, c21088.m47513(i2), c2702);
                                    c21088.m47516(i2, obj3, interfaceC23206);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 10:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37774(m47497(iM47524), obj3, interfaceC13724.mo12302());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 11:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37773(interfaceC13724.mo12282(), m47497(iM47524), obj3);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 12:
                                    i4 = i4;
                                    c2702 = c2703;
                                    int iMo12319 = interfaceC13724.mo12319();
                                    InterfaceC6250 interfaceC6250M47500 = c21088.m47500(i2);
                                    if (interfaceC6250M47500 == null || interfaceC6250M47500.mo10866(iMo12319)) {
                                        C15882.m37773(iMo12319, iM47524 & 1048575, obj3);
                                        c21088.m47515(i2, obj3);
                                        objM50660 = obj2;
                                    } else {
                                        objM50660 = C22896.m50660(obj3, iMo12311, iMo12319, obj2, abstractC5297);
                                    }
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 13:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37773(interfaceC13724.mo12315(), iM47524 & 1048575, obj3);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 14:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37779(obj3, iM47524 & 1048575, interfaceC13724.mo12300());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 15:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37773(interfaceC13724.mo12280(), iM47524 & 1048575, obj3);
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 16:
                                    i4 = i4;
                                    c2702 = c2703;
                                    C15882.m37779(obj3, iM47524 & 1048575, interfaceC13724.mo12309());
                                    c21088.m47515(i2, obj3);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 17:
                                    i4 = i4;
                                    c2702 = c2703;
                                    InterfaceC23206 interfaceC23207 = (InterfaceC23206) c21088.m47521(i2, obj3);
                                    interfaceC13724.mo12288(interfaceC23207, c21088.m47513(i2), c2702);
                                    c21088.m47516(i2, obj3, interfaceC23207);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 18:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12316(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 19:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12314(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 20:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12283(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 21:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12301(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 22:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12310(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 23:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12303(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 24:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12318(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 25:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12320(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 26:
                                    i4 = i4;
                                    c2702 = c2703;
                                    if ((536870912 & iM47524) != 0) {
                                        interfaceC13724.mo12281(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    } else {
                                        interfaceC13724.mo12312(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    }
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 27:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12307(abstractC19347.mo21205(iM47524 & 1048575, obj3), c21088.m47513(i2), c2702);
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 28:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12296(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 29:
                                    i4 = i4;
                                    c2702 = c2703;
                                    interfaceC13724.mo12295(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 30:
                                    i4 = i4;
                                    c2702 = c2703;
                                    List listMo21205 = abstractC19347.mo21205(iM47524 & 1048575, obj3);
                                    interfaceC13724.mo12293(listMo21205);
                                    objM50660 = C22896.m50661(obj, iMo12311, listMo21205, c21088.m47500(i2), obj2, abstractC5297);
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 31:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12289(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 32:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12322(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 33:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12285(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 34:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12306(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 35:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12316(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 36:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12314(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 37:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12283(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 38:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12301(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 39:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12310(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 40:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12303(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 41:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12318(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 42:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12320(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 43:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12295(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 44:
                                    i4 = i4;
                                    c2702 = c2703;
                                    try {
                                        List listMo21206 = abstractC19347.mo21205(iM47524 & 1048575, obj3);
                                        interfaceC13724.mo12293(listMo21206);
                                        objMo14675 = obj2;
                                        try {
                                            objM50660 = C22896.m50661(obj, iMo12311, listMo21206, c21088.m47500(i2), obj2, abstractC5297);
                                            objMo14675 = objM50660;
                                        } catch (C3427 unused) {
                                            obj2 = objMo14675;
                                            objMo14675 = obj2;
                                            try {
                                                if (abstractC5297.mo14683(interfaceC13724)) {
                                                    if (objMo14675 == null) {
                                                        objMo14675 = abstractC5297.mo14675(obj3);
                                                    }
                                                    if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                        while (i4 < i) {
                                                            m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                            i4++;
                                                        }
                                                        if (objMo14675 == null) {
                                                            return;
                                                        }
                                                        abstractC5297.mo14689(obj3, objMo14675);
                                                        return;
                                                    }
                                                } else if (!interfaceC13724.mo12297()) {
                                                    while (i4 < i) {
                                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                        i4++;
                                                    }
                                                    if (objMo14675 == null) {
                                                        return;
                                                    }
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                    return;
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                obj2 = objMo14675;
                                                objMo14675 = obj2;
                                                while (i4 < i) {
                                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                    i4++;
                                                }
                                                if (objMo14675 != null) {
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj2 = objMo14675;
                                            objMo14675 = obj2;
                                            while (i4 < i) {
                                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                i4++;
                                            }
                                            if (objMo14675 != null) {
                                                abstractC5297.mo14689(obj3, objMo14675);
                                            }
                                            throw th;
                                        }
                                    } catch (C3427 unused2) {
                                        objMo14675 = obj2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objMo14675 = obj2;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case WXMediaMessage.IMediaObject.TYPE_BUSINESS_CARD /* 45 */:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12289(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 46:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12322(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 47:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12285(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 48:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    interfaceC13724.mo12306(abstractC19347.mo21205(iM47524 & 1048575, obj3));
                                    obj2 = obj6;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 49:
                                    i4 = i4;
                                    c2702 = c2703;
                                    obj6 = obj2;
                                    try {
                                        interfaceC13724.mo12290(abstractC19347.mo21205(iM47524 & 1048575, obj3), c21088.m47513(i2), c2702);
                                        obj2 = obj6;
                                        objM50660 = obj2;
                                        objMo14675 = objM50660;
                                    } catch (C3427 unused3) {
                                        obj2 = obj6;
                                        objMo14675 = obj2;
                                        if (abstractC5297.mo14683(interfaceC13724)) {
                                            if (objMo14675 == null) {
                                                objMo14675 = abstractC5297.mo14675(obj3);
                                            }
                                            if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                while (i4 < i) {
                                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                    i4++;
                                                }
                                                if (objMo14675 == null) {
                                                    return;
                                                }
                                                abstractC5297.mo14689(obj3, objMo14675);
                                                return;
                                            }
                                        } else if (!interfaceC13724.mo12297()) {
                                            while (i4 < i) {
                                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                i4++;
                                            }
                                            if (objMo14675 == null) {
                                                return;
                                            }
                                            abstractC5297.mo14689(obj3, objMo14675);
                                            return;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        obj2 = obj6;
                                        objMo14675 = obj2;
                                        while (i4 < i) {
                                            m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                            i4++;
                                        }
                                        if (objMo14675 != null) {
                                            abstractC5297.mo14689(obj3, objMo14675);
                                        }
                                        throw th;
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 50:
                                    try {
                                        obj5 = obj2;
                                        i4 = i4;
                                        C2701 c2704 = c2703;
                                        try {
                                            m47505(obj, i2, c21088.m47519(i2), c2701, interfaceC13724);
                                            throw null;
                                        } catch (C3427 unused4) {
                                            obj6 = obj5;
                                            c2702 = c2704;
                                            obj2 = obj6;
                                            objMo14675 = obj2;
                                            if (abstractC5297.mo14683(interfaceC13724)) {
                                                if (!interfaceC13724.mo12297()) {
                                                    while (i4 < i) {
                                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                        i4++;
                                                    }
                                                    if (objMo14675 == null) {
                                                        return;
                                                    }
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo14676 = objMo14675;
                                                c2703 = c2702;
                                                iArr2 = iArr;
                                                abstractC5298 = abstractC5297;
                                                i3 = i;
                                            } else {
                                                if (objMo14675 == null) {
                                                    objMo14675 = abstractC5297.mo14675(obj3);
                                                }
                                                if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                    while (i4 < i) {
                                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                        i4++;
                                                    }
                                                    if (objMo14675 == null) {
                                                        return;
                                                    }
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo14676 = objMo14675;
                                                c2703 = c2702;
                                                iArr2 = iArr;
                                                abstractC5298 = abstractC5297;
                                                i3 = i;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            obj6 = obj5;
                                            obj2 = obj6;
                                            objMo14675 = obj2;
                                            while (i4 < i) {
                                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                i4++;
                                            }
                                            if (objMo14675 != null) {
                                                abstractC5297.mo14689(obj3, objMo14675);
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
                                    C15882.m37774(iM47524 & 1048575, obj3, Double.valueOf(interfaceC13724.readDouble()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 52:
                                    C15882.m37774(iM47524 & 1048575, obj3, Float.valueOf(interfaceC13724.readFloat()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 53:
                                    C15882.m37774(iM47524 & 1048575, obj3, Long.valueOf(interfaceC13724.mo12298()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish512Cipher.ROTATION_3_2 /* 54 */:
                                    C15882.m37774(iM47524 & 1048575, obj3, Long.valueOf(interfaceC13724.mo12294()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_1_3 /* 55 */:
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(interfaceC13724.mo12284()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 56:
                                    C15882.m37774(iM47524 & 1048575, obj3, Long.valueOf(interfaceC13724.mo12286()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 57:
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(interfaceC13724.mo12321()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                                    C15882.m37774(iM47524 & 1048575, obj3, Boolean.valueOf(interfaceC13724.mo12308()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case ThreefishEngine.Threefish1024Cipher.ROTATION_2_6 /* 59 */:
                                    c21088.m47507(obj3, iM47524, interfaceC13724);
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 60:
                                    InterfaceC23206 interfaceC23208 = (InterfaceC23206) c21088.m47520(iMo12311, i2, obj3);
                                    interfaceC13724.mo12305(interfaceC23208, c21088.m47513(i2), c2703);
                                    c21088.m47504(obj3, iMo12311, i2, interfaceC23208);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 61:
                                    C15882.m37774(iM47524 & 1048575, obj3, interfaceC13724.mo12302());
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 62:
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(interfaceC13724.mo12282()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 63:
                                    int iMo123110 = interfaceC13724.mo12319();
                                    InterfaceC6250 interfaceC6250M47501 = c21088.m47500(i2);
                                    if (interfaceC6250M47501 != null && !interfaceC6250M47501.mo10866(iMo123110)) {
                                        objMo14675 = C22896.m50660(obj3, iMo12311, iMo123110, obj2, abstractC5297);
                                        i4 = i4;
                                        c2702 = c2703;
                                        objM50660 = objMo14675;
                                        objMo14675 = objM50660;
                                        obj7 = obj3;
                                        i4 = i4;
                                        objMo14676 = objMo14675;
                                        c2703 = c2702;
                                        iArr2 = iArr;
                                        abstractC5298 = abstractC5297;
                                        i3 = i;
                                    }
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(iMo123110));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 64:
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(interfaceC13724.mo12315()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 65:
                                    C15882.m37774(iM47524 & 1048575, obj3, Long.valueOf(interfaceC13724.mo12300()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 66:
                                    C15882.m37774(iM47524 & 1048575, obj3, Integer.valueOf(interfaceC13724.mo12280()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 67:
                                    C15882.m37774(iM47524 & 1048575, obj3, Long.valueOf(interfaceC13724.mo12309()));
                                    c21088.m47514(iMo12311, i2, obj3);
                                    i4 = i4;
                                    c2702 = c2703;
                                    objM50660 = obj2;
                                    objMo14675 = objM50660;
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                case 68:
                                    try {
                                        InterfaceC23206 interfaceC23209 = (InterfaceC23206) c21088.m47520(iMo12311, i2, obj3);
                                        interfaceC13724.mo12288(interfaceC23209, c21088.m47513(i2), c2703);
                                        c21088.m47504(obj3, iMo12311, i2, interfaceC23209);
                                        i4 = i4;
                                        c2702 = c2703;
                                        objM50660 = obj2;
                                        objMo14675 = objM50660;
                                    } catch (C3427 unused5) {
                                        objMo14675 = obj2;
                                        i4 = i4;
                                        c2702 = c2703;
                                        if (abstractC5297.mo14683(interfaceC13724)) {
                                            if (objMo14675 == null) {
                                                objMo14675 = abstractC5297.mo14675(obj3);
                                            }
                                            if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                while (i4 < i) {
                                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                    i4++;
                                                }
                                                if (objMo14675 == null) {
                                                    return;
                                                }
                                                abstractC5297.mo14689(obj3, objMo14675);
                                                return;
                                            }
                                        } else if (!interfaceC13724.mo12297()) {
                                            while (i4 < i) {
                                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                i4++;
                                            }
                                            if (objMo14675 == null) {
                                                return;
                                            }
                                            abstractC5297.mo14689(obj3, objMo14675);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                                default:
                                    i4 = i4;
                                    c2702 = c2703;
                                    if (obj2 == null) {
                                        try {
                                            objMo14675 = abstractC5297.mo14675(obj3);
                                        } catch (C3427 unused6) {
                                            objMo14675 = obj2;
                                            if (abstractC5297.mo14683(interfaceC13724)) {
                                                if (!interfaceC13724.mo12297()) {
                                                    while (i4 < i) {
                                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                        i4++;
                                                    }
                                                    if (objMo14675 == null) {
                                                        return;
                                                    }
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo14676 = objMo14675;
                                                c2703 = c2702;
                                                iArr2 = iArr;
                                                abstractC5298 = abstractC5297;
                                                i3 = i;
                                            } else {
                                                if (objMo14675 == null) {
                                                    objMo14675 = abstractC5297.mo14675(obj3);
                                                }
                                                if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                    while (i4 < i) {
                                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                        i4++;
                                                    }
                                                    if (objMo14675 == null) {
                                                        return;
                                                    }
                                                    abstractC5297.mo14689(obj3, objMo14675);
                                                    return;
                                                }
                                                obj7 = obj3;
                                                i4 = i4;
                                                objMo14676 = objMo14675;
                                                c2703 = c2702;
                                                iArr2 = iArr;
                                                abstractC5298 = abstractC5297;
                                                i3 = i;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            objMo14675 = obj2;
                                        }
                                    } else {
                                        objMo14675 = obj2;
                                    }
                                    try {
                                        try {
                                            if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                while (i4 < i) {
                                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                    i4++;
                                                }
                                                if (objMo14675 == null) {
                                                    return;
                                                }
                                                abstractC5297.mo14689(obj3, objMo14675);
                                                return;
                                            }
                                            objM50660 = objMo14675;
                                            objMo14675 = objM50660;
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                        break;
                                    } catch (C3427 unused7) {
                                        if (abstractC5297.mo14683(interfaceC13724)) {
                                            if (objMo14675 == null) {
                                                objMo14675 = abstractC5297.mo14675(obj3);
                                            }
                                            if (!abstractC5297.m14682(objMo14675, interfaceC13724)) {
                                                while (i4 < i) {
                                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                    i4++;
                                                }
                                                if (objMo14675 == null) {
                                                    return;
                                                }
                                                abstractC5297.mo14689(obj3, objMo14675);
                                                return;
                                            }
                                        } else if (!interfaceC13724.mo12297()) {
                                            while (i4 < i) {
                                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                                i4++;
                                            }
                                            if (objMo14675 == null) {
                                                return;
                                            }
                                            abstractC5297.mo14689(obj3, objMo14675);
                                            return;
                                        }
                                    }
                                    obj7 = obj3;
                                    i4 = i4;
                                    objMo14676 = objMo14675;
                                    c2703 = c2702;
                                    iArr2 = iArr;
                                    abstractC5298 = abstractC5297;
                                    i3 = i;
                                    break;
                            }
                        } catch (C3427 unused8) {
                            i4 = i4;
                            c2702 = c2703;
                        } catch (Throwable th9) {
                            th = th9;
                            i4 = i4;
                            objMo14675 = obj2;
                            while (i4 < i) {
                                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                i4++;
                            }
                            if (objMo14675 != null) {
                                abstractC5297.mo14689(obj3, objMo14675);
                            }
                            throw th;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                    }
                } else {
                    if (iMo12311 == Integer.MAX_VALUE) {
                        for (int i10 = i4; i10 < i3; i10++) {
                            m47506(obj, iArr2[i10], objMo14676, abstractC5298, obj);
                        }
                        if (objMo14676 != null) {
                            abstractC5298.mo14689(obj7, objMo14676);
                            return;
                        }
                        return;
                    }
                    try {
                        boolean z = c21088.f68697;
                        AbstractC5524 abstractC5524 = c21088.f68694;
                        Object objMo4618 = !z ? null : abstractC5524.mo4618(c2703, c21088.f68700, iMo12311);
                        if (objMo4618 != null) {
                            if (c8347 == null) {
                                try {
                                    c8347Mo4625 = abstractC5524.mo4625(obj7);
                                } catch (Throwable th11) {
                                    th = th11;
                                    i = i3;
                                    iArr = iArr2;
                                    abstractC5297 = abstractC5298;
                                    i4 = i4;
                                    objMo14675 = objMo14676;
                                    obj3 = obj7;
                                    obj2 = objMo14675;
                                    objMo14675 = obj2;
                                    while (i4 < i) {
                                        m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                        i4++;
                                    }
                                    if (objMo14675 != null) {
                                        abstractC5297.mo14689(obj3, objMo14675);
                                    }
                                    throw th;
                                }
                            } else {
                                c8347Mo4625 = c8347;
                            }
                            obj2 = objMo14676;
                            Object obj8 = objMo4618;
                            i = i3;
                            iArr = iArr2;
                            AbstractC5297 abstractC5299 = abstractC5298;
                            obj4 = obj7;
                            try {
                                objMo14676 = abstractC5524.mo4617(obj, interfaceC13724, obj8, c2701, c8347Mo4625, obj2, abstractC5299);
                                abstractC5298 = abstractC5299;
                                c8347 = c8347Mo4625;
                            } catch (Throwable th12) {
                                th = th12;
                                abstractC5297 = abstractC5299;
                                i = i;
                                obj3 = obj4;
                                objMo14675 = obj2;
                                while (i4 < i) {
                                    m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                    i4++;
                                }
                                if (objMo14675 != null) {
                                    abstractC5297.mo14689(obj3, objMo14675);
                                }
                                throw th;
                            }
                        } else {
                            Object obj9 = objMo14676;
                            i = i3;
                            iArr = iArr2;
                            abstractC5297 = abstractC5298;
                            obj4 = obj7;
                            try {
                                if (abstractC5297.mo14683(interfaceC13724)) {
                                    objMo14676 = obj9;
                                    if (interfaceC13724.mo12297()) {
                                        abstractC5298 = abstractC5297;
                                    }
                                } else {
                                    objMo14676 = obj9 == null ? abstractC5297.mo14675(obj4) : obj9;
                                    try {
                                        if (!abstractC5297.m14682(objMo14676, interfaceC13724)) {
                                        }
                                        abstractC5298 = abstractC5297;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        obj2 = objMo14676;
                                        obj3 = obj4;
                                        objMo14675 = obj2;
                                        while (i4 < i) {
                                            m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                                            i4++;
                                        }
                                        if (objMo14675 != null) {
                                            abstractC5297.mo14689(obj3, objMo14675);
                                        }
                                        throw th;
                                    }
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                objMo14676 = obj9;
                            }
                        }
                        i3 = i;
                        obj7 = obj4;
                        iArr2 = iArr;
                        c21088 = this;
                    } catch (Throwable th15) {
                        th = th15;
                        obj2 = objMo14676;
                        i = i3;
                        iArr = iArr2;
                        abstractC5297 = abstractC5298;
                        obj4 = obj7;
                    }
                }
            } catch (Throwable th16) {
                th = th16;
                obj2 = objMo14676;
                i = i3;
                iArr = iArr2;
                abstractC5297 = abstractC5298;
                obj3 = obj7;
            }
            while (i4 < i) {
                m47506(obj, iArr[i4], objMo14675, abstractC5297, obj);
                i4++;
            }
            if (objMo14675 != null) {
                abstractC5297.mo14689(obj3, objMo14675);
            }
            throw th;
        }
        int i11 = i4;
        while (i11 < i) {
            AbstractC5297 abstractC52910 = abstractC5297;
            m47506(obj, iArr[i11], objMo14676, abstractC52910, obj);
            i11++;
            abstractC5297 = abstractC52910;
            i = i;
        }
        AbstractC5297 abstractC52911 = abstractC5297;
        if (objMo14676 != null) {
            abstractC52911.mo14689(obj4, objMo14676);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private InterfaceC6667 m47513(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f68706;
        InterfaceC6667 interfaceC6667 = (InterfaceC6667) objArr[i2];
        if (interfaceC6667 != null) {
            return interfaceC6667;
        }
        InterfaceC6667 interfaceC6667M35322 = C14739.m35321().m35322((Class) objArr[i2 + 1]);
        objArr[i2] = interfaceC6667M35322;
        return interfaceC6667M35322;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Object m47519(int i) {
        return this.f68706[(i / 3) * 2];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC6250 m47500(int i) {
        return (InterfaceC6250) this.f68706[((i / 3) * 2) + 1];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Object m47521(int i, Object obj) {
        InterfaceC6667 interfaceC6667M47513 = m47513(i);
        long jM47524 = m47524(i) & 1048575;
        if (!m47509(i, obj)) {
            return interfaceC6667M47513.mo18054();
        }
        Object object = f68691.getObject(obj, jM47524);
        if (m47498(object)) {
            return object;
        }
        Object objMo18054 = interfaceC6667M47513.mo18054();
        if (object != null) {
            interfaceC6667M47513.mo18056(objMo18054, object);
        }
        return objMo18054;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m47516(int i, Object obj, Object obj2) {
        f68691.putObject(obj, m47524(i) & 1048575, obj2);
        m47515(i, obj);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private Object m47520(int i, int i2, Object obj) {
        InterfaceC6667 interfaceC6667M47513 = m47513(i2);
        if (!m47508(i, i2, obj)) {
            return interfaceC6667M47513.mo18054();
        }
        Object object = f68691.getObject(obj, m47524(i2) & 1048575);
        if (m47498(object)) {
            return object;
        }
        Object objMo18054 = interfaceC6667M47513.mo18054();
        if (object != null) {
            interfaceC6667M47513.mo18056(objMo18054, object);
        }
        return objMo18054;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47504(Object obj, int i, int i2, Object obj2) {
        f68691.putObject(obj, m47524(i2) & 1048575, obj2);
        m47514(i, i2, obj);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e A[SYNTHETIC] */
    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ۙ */
    public final void mo18055(Object obj) {
        if (m47498(obj)) {
            if (obj instanceof AbstractC16129) {
                AbstractC16129 abstractC16129 = (AbstractC16129) obj;
                abstractC16129.setMemoizedSerializedSize(Integer.MAX_VALUE);
                abstractC16129.memoizedHashCode = 0;
                abstractC16129.m38185();
            }
            int[] iArr = this.f68696;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int iM47524 = m47524(i);
                long j = 1048575 & iM47524;
                int iM47512 = m47512(iM47524);
                if (iM47512 != 9) {
                    if (iM47512 != 60 && iM47512 != 68) {
                        switch (iM47512) {
                            case 17:
                                if (m47509(i, obj)) {
                                    m47513(i).mo18055(f68691.getObject(obj, j));
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
                                this.f68693.mo21203(j, obj);
                                break;
                            case 50:
                                Unsafe unsafe = f68691;
                                Object object = unsafe.getObject(obj, j);
                                if (object != null) {
                                    unsafe.putObject(obj, j, this.f68695.mo8355(object));
                                }
                                break;
                        }
                    } else if (m47508(iArr[i], i, obj)) {
                        m47513(i).mo18055(f68691.getObject(obj, j));
                    }
                } else if (m47509(i, obj)) {
                    m47513(i).mo18055(f68691.getObject(obj, j));
                }
            }
            this.f68705.mo14684(obj);
            if (this.f68697) {
                this.f68694.mo4624(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private final void m47505(Object obj, int i, Object obj2, C2701 c2701, InterfaceC13724 interfaceC13724) {
        long jM47524 = m47524(i) & 1048575;
        Object objM37785 = C15882.m37785(jM47524, obj);
        InterfaceC14034 interfaceC14034 = this.f68695;
        if (objM37785 == null) {
            objM37785 = interfaceC14034.mo8356(obj2);
            C15882.m37774(jM47524, obj, objM37785);
        } else if (interfaceC14034.mo8358(objM37785)) {
            Object objMo8356 = interfaceC14034.mo8356(obj2);
            interfaceC14034.mo8352(objMo8356, objM37785);
            C15882.m37774(jM47524, obj, objMo8356);
            objM37785 = objMo8356;
        }
        interfaceC14034.mo8357(objM37785);
        interfaceC14034.mo8354(obj2);
        interfaceC13724.mo12292();
        throw null;
    }

    @Override // l.InterfaceC6667
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo18060(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.f68702) {
            int i6 = this.f68707[i5];
            int[] iArr = this.f68696;
            int i7 = iArr[i6];
            int iM47524 = m47524(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = f68691.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & iM47524) == 0 || m47510(obj, i6, i, i2, i10)) {
                int iM47512 = m47512(iM47524);
                if (iM47512 == 9 || iM47512 == 17) {
                    if (!m47510(obj, i6, i, i2, i10) || m47513(i6).mo18060(C15882.m37785(iM47524 & 1048575, obj))) {
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                } else {
                    if (iM47512 != 27) {
                        if (iM47512 == 60 || iM47512 == 68) {
                            if (!m47508(i7, i6, obj) || m47513(i6).mo18060(C15882.m37785(iM47524 & 1048575, obj))) {
                            }
                        } else if (iM47512 != 49) {
                            if (iM47512 != 50) {
                                continue;
                            } else {
                                Object objM37785 = C15882.m37785(iM47524 & 1048575, obj);
                                InterfaceC14034 interfaceC14034 = this.f68695;
                                if (!interfaceC14034.mo8351(objM37785).isEmpty()) {
                                    interfaceC14034.mo8354(m47519(i6));
                                    throw null;
                                }
                            }
                        }
                        i5++;
                        i3 = i;
                        i4 = i2;
                    }
                    List list = (List) C15882.m37785(iM47524 & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        InterfaceC6667 interfaceC6667M47513 = m47513(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (interfaceC6667M47513.mo18060(list.get(i11))) {
                            }
                        }
                    }
                    i5++;
                    i3 = i;
                    i4 = i2;
                }
            }
        }
        return !this.f68697 || this.f68694.mo4619(obj).m21835();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47503(int i, Object obj, InterfaceC12976 interfaceC12976) {
        if (obj instanceof String) {
            ((C0876) interfaceC12976).m3522(i, (String) obj);
        } else {
            ((C0876) interfaceC12976).m3525(i, (AbstractC23725) obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47507(Object obj, int i, InterfaceC13724 interfaceC13724) {
        if ((536870912 & i) != 0) {
            C15882.m37774(i & 1048575, obj, interfaceC13724.mo12299());
        } else if (this.f68701) {
            C15882.m37774(i & 1048575, obj, interfaceC13724.mo12317());
        } else {
            C15882.m37774(i & 1048575, obj, interfaceC13724.mo12302());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47506(Object obj, int i, Object obj2, AbstractC5297 abstractC5297, Object obj3) {
        InterfaceC6250 interfaceC6250M47500;
        int i2 = this.f68696[i];
        Object objM37785 = C15882.m37785(m47524(i) & 1048575, obj);
        if (objM37785 == null || (interfaceC6250M47500 = m47500(i)) == null) {
            return;
        }
        InterfaceC14034 interfaceC14034 = this.f68695;
        Map mapMo8357 = interfaceC14034.mo8357(objM37785);
        interfaceC14034.mo8354(m47519(i));
        for (Map.Entry entry : mapMo8357.entrySet()) {
            if (!interfaceC6250M47500.mo10866(((Integer) entry.getValue()).intValue())) {
                if (obj2 == null) {
                    abstractC5297.mo14675(obj3);
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m47522(int i, Object obj, Object obj2) {
        int[] iArr = this.f68696;
        int i2 = iArr[i];
        if (m47508(i2, i, obj2)) {
            long jM47524 = m47524(i) & 1048575;
            Unsafe unsafe = f68691;
            Object object = unsafe.getObject(obj2, jM47524);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2);
            }
            InterfaceC6667 interfaceC6667M47513 = m47513(i);
            if (!m47508(i2, i, obj)) {
                if (!m47498(object)) {
                    unsafe.putObject(obj, jM47524, object);
                } else {
                    Object objMo18054 = interfaceC6667M47513.mo18054();
                    interfaceC6667M47513.mo18056(objMo18054, object);
                    unsafe.putObject(obj, jM47524, objMo18054);
                }
                m47514(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jM47524);
            if (!m47498(object2)) {
                Object objMo18055 = interfaceC6667M47513.mo18054();
                interfaceC6667M47513.mo18056(objMo18055, object2);
                unsafe.putObject(obj, jM47524, objMo18055);
                object2 = objMo18055;
            }
            interfaceC6667M47513.mo18056(object2, object);
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private int m47524(int i) {
        return this.f68696[i + 1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47508(int i, int i2, Object obj) {
        return C15882.m37791((long) (this.f68696[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47509(int i, Object obj) {
        boolean zEquals;
        int i2 = this.f68696[i + 2];
        long j = i2 & 1048575;
        if (j == 1048575) {
            int iM47524 = m47524(i);
            long j2 = iM47524 & 1048575;
            switch (m47512(iM47524)) {
                case 0:
                    if (Double.doubleToRawLongBits(C15882.m37798(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 1:
                    if (Float.floatToRawIntBits(C15882.m37760(j2, obj)) == 0) {
                        return false;
                    }
                    break;
                case 2:
                    if (C15882.m37765(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (C15882.m37765(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 4:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (C15882.m37765(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 6:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 7:
                    return C15882.m37784(j2, obj);
                case 8:
                    Object objM37785 = C15882.m37785(j2, obj);
                    if (objM37785 instanceof String) {
                        zEquals = ((String) objM37785).isEmpty();
                    } else if (objM37785 instanceof AbstractC23725) {
                        zEquals = AbstractC23725.f76778.equals(objM37785);
                    } else {
                        throw new IllegalArgumentException();
                    }
                    return !zEquals;
                case 9:
                    if (C15882.m37785(j2, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    zEquals = AbstractC23725.f76778.equals(C15882.m37785(j2, obj));
                    return !zEquals;
                case 11:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (C15882.m37765(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (C15882.m37791(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (C15882.m37765(j2, obj) == 0) {
                        return false;
                    }
                    break;
                case 17:
                    if (C15882.m37785(j2, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & C15882.m37791(j, obj)) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m47514(int i, int i2, Object obj) {
        C15882.m37773(i, this.f68696[i2 + 2] & 1048575, obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m47515(int i, Object obj) {
        int i2 = this.f68696[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        C15882.m37773((1 << (i2 >>> 20)) | C15882.m37791(j, obj), j, obj);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m47498(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC16129) {
            return ((AbstractC16129) obj).m38186();
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m47517(Object obj) {
        if (!m47498(obj)) {
            throw new IllegalArgumentException(C9023.m23354(obj, "Mutating immutable message: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47499(long j, Object obj) {
        return ((Integer) C15882.m37785(j, obj)).intValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m47518(long j, Object obj) {
        return ((Long) C15882.m37785(j, obj)).longValue();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47511(AbstractC16129 abstractC16129, AbstractC16129 abstractC161210, int i) {
        return m47509(i, (Object) abstractC16129) == m47509(i, (Object) abstractC161210);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47510(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return m47509(i, obj);
        }
        return (i3 & i4) != 0;
    }
}
