package l;

import java.util.Arrays;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ܽܳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 68AX */
/* JADX INFO: loaded from: classes4.dex */
public final class C16700 extends AbstractC12568 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC12568 f53493 = new C16700(2);

    @Override // l.AbstractC12568
    /* JADX INFO: renamed from: ۙ */
    public final int mo2340(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        C23805.m52453(0, i, bArr);
        C23805.m52453(0, i2, bArr2);
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
                    int i15 = i10 << C21638.f70166;
                    int i16 = 1;
                    while (true) {
                        int i17 = i16 + i13;
                        int i18 = i15 + 1;
                        int i19 = i15 >>> C21638.f70166;
                        if (i17 > i12) {
                            break loop0;
                        }
                        int iM52458 = (C23805.m52458(i13, bArr) * (-1640531535)) >>> 19;
                        i8 = sArr[iM52458] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM52458] = (short) i13;
                        if (C17405.m40571(i8, i13, bArr)) {
                            break;
                        }
                        i13 = i17;
                        i15 = i18;
                        i16 = i19;
                    }
                    int iM40573 = C17405.m40573(i8, bArr, i13, i7);
                    int i20 = i13 - iM40573;
                    int i21 = i8 - iM40573;
                    int i22 = i20 - i7;
                    int iM40572 = i14 + 1;
                    if (iM40572 + i22 + 8 + (i22 >>> 8) > i2) {
                        throw new C18110("maxDestLen is too small");
                    }
                    if (i22 >= i9) {
                        bArr2[i14] = (byte) 240;
                        iM40572 = C17405.m40572(i22 - 15, iM40572, bArr2);
                    } else {
                        bArr2[i14] = (byte) (i22 << 4);
                    }
                    C17405.m40570(i7, bArr, iM40572, bArr2, i22);
                    int i23 = iM40572 + i22;
                    while (true) {
                        short s = (short) (i20 - i21);
                        bArr2[i23] = (byte) s;
                        bArr2[i23 + 1] = (byte) (s >>> 8);
                        int iM40574 = i23 + 2;
                        int i24 = i20 + 4;
                        int iM40567 = C17405.m40567(i21 + 4, bArr, i24, i11);
                        if (i23 + 8 + (iM40567 >>> 8) > i2) {
                            throw new C18110("maxDestLen is too small");
                        }
                        i20 = i24 + iM40567;
                        if (iM40567 >= 15) {
                            bArr2[i14] = (byte) (15 | bArr2[i14]);
                            iM40574 = C17405.m40572(iM40567 - 15, iM40574, bArr2);
                        } else {
                            bArr2[i14] = (byte) (iM40567 | bArr2[i14]);
                        }
                        i14 = iM40574;
                        if (i20 > i12) {
                            i7 = i20;
                            break loop0;
                        }
                        int i25 = i20 - 2;
                        sArr[(C23805.m52458(i25, bArr) * (-1640531535)) >>> 19] = (short) i25;
                        int iM52459 = (C23805.m52458(i20, bArr) * (-1640531535)) >>> 19;
                        int i26 = sArr[iM52459] & HPKE.aead_EXPORT_ONLY;
                        sArr[iM52459] = (short) i20;
                        if (!C17405.m40571(i20, i26, bArr)) {
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
            return C17405.m40568(bArr, i7, i - i7, bArr2, i6, i2);
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
            int i34 = i28 << C21638.f70166;
            int i35 = 1;
            while (true) {
                int i36 = i35 + i33;
                int i37 = i34 + 1;
                int i38 = i34 >>> C21638.f70166;
                if (i36 > i30) {
                    i3 = i31;
                    break loop3;
                }
                int iM524510 = (C23805.m52458(i33, bArr) * i27) >>> 20;
                i4 = iArr[iM524510];
                i5 = i33 - i4;
                iArr[iM524510] = i33;
                if (i5 >= 65536 || !C17405.m40571(i4, i33, bArr)) {
                    i33 = i36;
                    i34 = i37;
                    i35 = i38;
                    i27 = -1640531535;
                }
            }
            int iM40575 = C17405.m40573(i4, bArr, i33, i31);
            i3 = i33 - iM40575;
            int i39 = i4 - iM40575;
            int i40 = i3 - i31;
            int iM40576 = i32 + 1;
            if (iM40576 + i40 + 8 + (i40 >>> 8) > i2) {
                throw new C18110("maxDestLen is too small");
            }
            if (i40 >= 15) {
                bArr2[i32] = (byte) 240;
                iM40576 = C17405.m40572(i40 - 15, iM40576, bArr2);
            } else {
                bArr2[i32] = (byte) (i40 << 4);
            }
            C17405.m40570(i31, bArr, iM40576, bArr2, i40);
            int i41 = iM40576 + i40;
            while (true) {
                bArr2[i41] = (byte) i5;
                bArr2[i41 + 1] = (byte) (i5 >>> 8);
                int iM40577 = i41 + 2;
                int i42 = i3 + 4;
                int iM40568 = C17405.m40567(i39 + 4, bArr, i42, i29);
                if (i41 + 8 + (iM40568 >>> 8) > i2) {
                    throw new C18110("maxDestLen is too small");
                }
                i3 = i42 + iM40568;
                if (iM40568 >= 15) {
                    bArr2[i32] = (byte) (15 | bArr2[i32]);
                    iM40577 = C17405.m40572(iM40568 - 15, iM40577, bArr2);
                } else {
                    bArr2[i32] = (byte) (iM40568 | bArr2[i32]);
                }
                i32 = iM40577;
                if (i3 > i30) {
                    break loop3;
                }
                int i43 = i3 - 2;
                iArr[(C23805.m52458(i43, bArr) * (-1640531535)) >>> 20] = i43;
                int iM524511 = (C23805.m52458(i3, bArr) * (-1640531535)) >>> 20;
                i39 = iArr[iM524511];
                iArr[iM524511] = i3;
                i5 = i3 - i39;
                if (i5 >= 65536 || !C17405.m40571(i39, i3, bArr)) {
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
        return C17405.m40568(bArr, i3, i - i3, bArr2, i32, i2);
    }
}
