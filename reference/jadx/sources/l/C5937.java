package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۚ᩸ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 68AX */
/* JADX INFO: loaded from: classes3.dex */
public final class C5937 extends AbstractC8909 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC8909 f20288 = new C5937(5);

    @Override // l.AbstractC8909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo17251(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C23800.m53094(0, i, bArr);
        C23800.m53094(0, i2, bArr2);
        int i9 = 15;
        int i10 = 1;
        if (i < 65547) {
            int i11 = i - 5;
            int i12 = i - 12;
            if (i >= 13) {
                short[] sArr = new short[8192];
                int i13 = 1;
                i7 = 0;
                int i14 = 0;
                loop0: while (true) {
                    int i15 = i10 << C9313.f30257;
                    int i16 = 1;
                    while (true) {
                        int i17 = i16 + i13;
                        int i18 = i15 + 1;
                        int i19 = i15 >>> C9313.f30257;
                        if (i17 > i12) {
                            break loop0;
                        }
                        int iM53093 = (C23800.m53093(i13, bArr) * (-1640531535)) >>> 19;
                        i8 = sArr[iM53093] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM53093] = (short) i13;
                        if (C25329.m56605(i8, i13, bArr)) {
                            break;
                        }
                        i13 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    int iM56607 = C25329.m56607(i8, bArr, i13, i7);
                    int i20 = i13 - iM56607;
                    int i21 = i8 - iM56607;
                    int i22 = i20 - i7;
                    int iM56606 = i14 + 1;
                    if (iM56606 + i22 + 8 + (i22 >>> 8) > i2) {
                        throw new C2602("maxDestLen is too small");
                    }
                    if (i22 >= i9) {
                        bArr2[i14] = (byte) 240;
                        iM56606 = C25329.m56606(i22 - 15, iM56606, bArr2);
                    } else {
                        bArr2[i14] = (byte) (i22 << 4);
                    }
                    C25329.m56604(i7, bArr, iM56606, bArr2, i22);
                    int i23 = iM56606 + i22;
                    while (true) {
                        short s = (short) (i20 - i21);
                        bArr2[i23] = (byte) s;
                        bArr2[i23 + 1] = (byte) (s >>> 8);
                        int iM56608 = i23 + 2;
                        int i24 = i20 + 4;
                        int iM56601 = C25329.m56601(i21 + 4, bArr, i24, i11);
                        if (i23 + 8 + (iM56601 >>> 8) > i2) {
                            throw new C2602("maxDestLen is too small");
                        }
                        i20 = i24 + iM56601;
                        if (iM56601 >= 15) {
                            bArr2[i14] = (byte) (15 | bArr2[i14]);
                            iM56608 = C25329.m56606(iM56601 - 15, iM56608, bArr2);
                        } else {
                            bArr2[i14] = (byte) (iM56601 | bArr2[i14]);
                        }
                        i14 = iM56608;
                        if (i20 > i12) {
                            i7 = i20;
                            break loop0;
                        }
                        int i25 = i20 - 2;
                        sArr[(C23800.m53093(i25, bArr) * (-1640531535)) >>> 19] = (short) i25;
                        int iM53094 = (C23800.m53093(i20, bArr) * (-1640531535)) >>> 19;
                        int i26 = sArr[iM53094] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM53094] = (short) i20;
                        if (!C25329.m56605(i20, i26, bArr)) {
                            break;
                        }
                        i23 = i14 + 1;
                        bArr2[i14] = (byte) 0;
                        i21 = i26;
                    }
                    i7 = i20;
                    i10 = 1;
                    i13 = i20 + 1;
                    i9 = 15;
                }
                i6 = i14;
            } else {
                i6 = 0;
                i7 = 0;
            }
            return C25329.m56602(bArr, i7, i - i7, bArr2, i6, i2);
        }
        int i27 = -1640531535;
        int i28 = 1;
        int i29 = i - 5;
        int i30 = i - 12;
        int[] iArr = new int[4096];
        int i31 = 0;
        Arrays.fill(iArr, 0);
        int i32 = 0;
        int i33 = 1;
        loop3: while (true) {
            int i34 = i28 << C9313.f30257;
            int i35 = 1;
            while (true) {
                int i36 = i35 + i33;
                int i37 = i34 + 1;
                int i38 = i34 >>> C9313.f30257;
                if (i36 > i30) {
                    i3 = i31;
                    break loop3;
                }
                int iM53095 = (C23800.m53093(i33, bArr) * i27) >>> 20;
                i4 = iArr[iM53095];
                i5 = i33 - i4;
                iArr[iM53095] = i33;
                if (i5 >= 65536 || !C25329.m56605(i4, i33, bArr)) {
                    i33 = i36;
                    i34 = i37;
                    i35 = i38;
                    i27 = -1640531535;
                }
            }
            int iM56609 = C25329.m56607(i4, bArr, i33, i31);
            i3 = i33 - iM56609;
            int i39 = i4 - iM56609;
            int i40 = i3 - i31;
            int iM566010 = i32 + 1;
            if (iM566010 + i40 + 8 + (i40 >>> 8) > i2) {
                throw new C2602("maxDestLen is too small");
            }
            if (i40 >= 15) {
                bArr2[i32] = (byte) 240;
                iM566010 = C25329.m56606(i40 - 15, iM566010, bArr2);
            } else {
                bArr2[i32] = (byte) (i40 << 4);
            }
            C25329.m56604(i31, bArr, iM566010, bArr2, i40);
            int i41 = iM566010 + i40;
            while (true) {
                bArr2[i41] = (byte) i5;
                bArr2[i41 + 1] = (byte) (i5 >>> 8);
                int iM566011 = i41 + 2;
                int i42 = i3 + 4;
                int iM56602 = C25329.m56601(i39 + 4, bArr, i42, i29);
                if (i41 + 8 + (iM56602 >>> 8) > i2) {
                    throw new C2602("maxDestLen is too small");
                }
                i3 = i42 + iM56602;
                if (iM56602 >= 15) {
                    bArr2[i32] = (byte) (15 | bArr2[i32]);
                    iM566011 = C25329.m56606(iM56602 - 15, iM566011, bArr2);
                } else {
                    bArr2[i32] = (byte) (iM56602 | bArr2[i32]);
                }
                i32 = iM566011;
                if (i3 > i30) {
                    break loop3;
                }
                int i43 = i3 - 2;
                iArr[(C23800.m53093(i43, bArr) * (-1640531535)) >>> 20] = i43;
                int iM53096 = (C23800.m53093(i3, bArr) * (-1640531535)) >>> 20;
                i39 = iArr[iM53096];
                iArr[iM53096] = i3;
                i5 = i3 - i39;
                if (i5 >= 65536 || !C25329.m56605(i39, i3, bArr)) {
                    i31 = i3;
                    i28 = 1;
                    i33 = i3 + 1;
                    i27 = -1640531535;
                } else {
                    i41 = i32 + 1;
                    bArr2[i32] = (byte) 0;
                }
            }
        }
        return C25329.m56602(bArr, i3, i - i3, bArr2, i32, i2);
    }
}
