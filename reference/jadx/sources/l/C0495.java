package l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.֡ܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GS */
/* JADX INFO: loaded from: classes2.dex */
public final class C0495 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m2373(String str, byte[] bArr, String str2) throws C3317, C20252 {
        C11080 c11080;
        int i;
        int[] iArr;
        int[] iArr2;
        C11080 c11081;
        int i2;
        C23780 c23780;
        try {
            C16724 c16724 = new C16724(bArr);
            C11080[] c11080Arr = c16724.f53557;
            int length = c11080Arr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    c11080 = null;
                    break;
                }
                c11080 = c11080Arr[i3];
                if (c11080 != null) {
                    C23780 c23781 = c11080.f37606.f53555;
                    if ((c23781 == null ? null : c23781.m52320(c11080.f37605)).equals(".hash")) {
                        break;
                    }
                }
                i3++;
            }
            ByteBuffer byteBuffer = c16724.f53556;
            if (c11080 == null) {
                i = 0;
                iArr = null;
                iArr2 = null;
            } else {
                int i4 = (int) c11080.f37608;
                i = byteBuffer.getInt(i4);
                int i5 = byteBuffer.getInt(i4 + 4);
                int i6 = i4 + 8;
                int[] iArr3 = new int[i];
                int[] iArr4 = new int[i5];
                for (int i7 = 0; i7 < i; i7++) {
                    iArr3[i7] = byteBuffer.getInt(i6);
                    i6 += 4;
                }
                for (int i8 = 0; i8 < i5; i8++) {
                    iArr4[i8] = byteBuffer.getInt(i6);
                    i6 += 4;
                }
                iArr = iArr3;
                iArr2 = iArr4;
            }
            int length2 = c11080Arr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    c11081 = null;
                    break;
                }
                c11081 = c11080Arr[i9];
                if (c11081 != null) {
                    C23780 c23782 = c11081.f37606.f53555;
                    if (".dynsym".equals(c23782 == null ? null : c23782.m52320(c11081.f37605))) {
                        break;
                    }
                }
                i9++;
            }
            C9669 c9669 = (C9669) c11081;
            if (c9669 != null) {
                C11080 c11082 = c9669.f37606.f53557[c9669.f37610];
                long j = c9669.f37607;
                int i10 = j == 0 ? 0 : (int) (c9669.f37609 / j);
                C14608[] c14608Arr = new C14608[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    c14608Arr[i11] = c9669.m24573(i11);
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 < i10) {
                    C14608 c14608 = c14608Arr[i12];
                    int i14 = i13 + 1;
                    strArr[i13] = (c14608 == null || (c23780 = c14608.f47804) == null) ? null : c23780.m52320(c14608.f47802);
                    i12++;
                    i13 = i14;
                }
                boolean z = false;
                for (int i15 = 0; i15 < i10; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null && str3.startsWith(str)) {
                        if (str2.length() != str.length()) {
                            throw new C3317();
                        }
                        StringBuilder sbM23356 = C9023.m23356(str2);
                        sbM23356.append(strArr[i15].substring(str.length()));
                        String string = sbM23356.toString();
                        C14608 c14609 = c14608Arr[i15];
                        byteBuffer.position((int) (c14609.f47804.f37608 + ((long) c14609.f47802)));
                        byteBuffer.put(str2.getBytes());
                        if (c11080 != null) {
                            long j2 = i;
                            int iM2372 = (int) (m2372(strArr[i15]) % j2);
                            int iM2373 = (int) (m2372(string) % j2);
                            if (iM2373 != iM2372 && iArr[iM2373] != i15) {
                                int i16 = iArr[iM2372];
                                if (i16 != i15) {
                                    int i17 = 0;
                                    while (true) {
                                        int i18 = iArr2[i16];
                                        if (i18 == 0) {
                                            break;
                                        }
                                        int i19 = i17 + 1;
                                        if (i17 >= iArr2.length) {
                                            break;
                                        }
                                        if (i18 == i15) {
                                            iArr2[i16] = 0;
                                            break;
                                        }
                                        i17 = i19;
                                    }
                                } else {
                                    iArr[iM2372] = 0;
                                }
                                int i20 = iArr[iM2373];
                                if (i20 == 0) {
                                    iArr[iM2373] = i15;
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        i2 = iArr2[i20];
                                        if (i2 == 0) {
                                            break;
                                        }
                                        int i22 = i21 + 1;
                                        if (i21 == iArr2.length) {
                                            throw new C20252("Fix hash table failed");
                                        }
                                        if (i2 == i15) {
                                            break;
                                        }
                                        i20 = i2;
                                        i21 = i22;
                                    }
                                    if (i2 == 0) {
                                        iArr2[i20] = i15;
                                    }
                                }
                            }
                        }
                        z = true;
                    }
                }
                if (!z) {
                    return null;
                }
                byteBuffer.position(((int) c11080.f37608) + 8);
                for (int i23 : iArr) {
                    byteBuffer.putInt(i23);
                }
                for (int i24 : iArr2) {
                    byteBuffer.putInt(i24);
                }
                byteBuffer.flip();
                return byteBuffer.array();
            }
        } catch (IOException unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m2372(String str) {
        long j = 0;
        for (char c : str.toCharArray()) {
            j = (j << 4) + ((long) c);
            long j2 = 4026531840L & j;
            if (j2 != 0) {
                j = (j ^ (j2 >> 24)) & (~j2);
            }
        }
        return 2147483647L & j;
    }
}
