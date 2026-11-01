package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9566 {
    /* JADX WARN: Code duplicated, block: B:88:0x0149 A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x014d A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ad, blocks: (B:3:0x0002, B:5:0x0010, B:7:0x001e, B:9:0x0021, B:11:0x0029, B:17:0x0043, B:19:0x0046, B:21:0x0059, B:24:0x0069, B:27:0x0073, B:30:0x0082, B:32:0x0093, B:36:0x009a, B:38:0x009d, B:53:0x00c5, B:51:0x00bc, B:55:0x00c8, B:60:0x00f5, B:67:0x0101, B:72:0x0113, B:74:0x0117, B:77:0x0128, B:79:0x012e, B:81:0x0135, B:93:0x0156, B:88:0x0149, B:90:0x014d, B:92:0x0153, B:82:0x013a, B:94:0x0159, B:97:0x0170, B:98:0x017e, B:100:0x0184, B:102:0x0190, B:105:0x0199, B:107:0x019d, B:109:0x01a1, B:111:0x01a7, B:113:0x01aa), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0152  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10977 m24422(C12429 c12429, int i) {
        int iM30898;
        try {
            C14505 c14505 = new C14505();
            int length = c12429.m30893().length;
            int i2 = i;
            while (i2 < length) {
                int iM24421 = m24421(c12429, i2, length);
                int iM30899 = c12429.m30898(i2 + 2);
                if (iM30899 < 284) {
                    return EnumC10977.AOSP;
                }
                HashMap map = new HashMap();
                int i3 = i2 + iM30899;
                while (i3 < iM24421) {
                    int iM24422 = m24421(c12429, i3, iM24421);
                    int iM308910 = c12429.m30898(i3);
                    int iM308911 = c12429.m30898(i3 + 2);
                    if (iM308910 == 514 || iM308910 == 513) {
                        if (iM308911 < 16) {
                            return EnumC10977.AOSP;
                        }
                        int iM30895 = c12429.m30895(i3 + 8);
                        C1803 c1803 = (C1803) map.get(Integer.valueOf(iM30895));
                        if (c1803 == null) {
                            c1803 = new C1803(0);
                            map.put(Integer.valueOf(iM30895), c1803);
                        }
                        if (iM308910 == 514) {
                            int iM30896 = c12429.m30896(i3 + 12);
                            if (iM30896 >= 0 && iM30896 <= 65536) {
                                if ((((long) iM30896) * 4) + ((long) i3) + ((long) iM308911) <= iM24422) {
                                    c1803.f6955 = c12429.m30894(i3 + iM308911, iM30896);
                                }
                            }
                            return EnumC10977.AOSP;
                        }
                        if (iM308911 < 24) {
                            return EnumC10977.AOSP;
                        }
                        int i4 = i3 + 20;
                        int iM30897 = c12429.m30896(i4);
                        if (iM30897 == 28 || iM30897 == 32 || iM30897 == 36 || iM30897 == 48 || iM30897 == 52 || iM30897 == 76) {
                            long j = iM308911;
                            if (((long) iM30897) + 20 <= j) {
                                C15916 c15916M37841 = C15916.m37841(c12429.m30888(i4), EnumC10977.MOTOROLA_76);
                                C23718 c23718M30888 = c12429.m30888(i4);
                                EnumC10977 enumC10977 = EnumC10977.AOSP;
                                C15916 c15916M37842 = C15916.m37841(c23718M30888, enumC10977);
                                int iM308912 = c12429.m30896(i3 + 12);
                                int iM308913 = c12429.m30895(i3 + 9);
                                boolean z = true;
                                boolean z2 = (iM308913 & 1) != 0;
                                if (z2 || (iM308913 & 2) == 0) {
                                    z = false;
                                }
                                int i5 = z ? 2 : 4;
                                int iM308914 = c12429.m30896(i3 + 16);
                                if (iM308912 >= 0 && iM308912 <= 65536 && iM308914 >= iM308911 && iM308914 <= iM24422 - i3) {
                                    if ((((long) i5) * ((long) iM308912)) + j <= iM308914) {
                                        int[] iArr = new int[iM308912];
                                        int i6 = 0;
                                        for (int i7 = 0; i7 < iM308912; i7++) {
                                            int i8 = (i7 * i5) + i3 + iM308911;
                                            int iM308915 = z ? c12429.m30898(i8) : c12429.m30896(i8);
                                            if (z2) {
                                                int i9 = i6 + 1;
                                                if (z2) {
                                                    iM30898 = c12429.m30898(i8);
                                                } else {
                                                    iM30898 = i7;
                                                }
                                                iArr[i6] = iM30898;
                                                i6 = i9;
                                            } else if (iM308915 != (z ? 65535 : -1)) {
                                                int i10 = i6 + 1;
                                                if (z2) {
                                                    iM30898 = c12429.m30898(i8);
                                                } else {
                                                    iM30898 = i7;
                                                }
                                                iArr[i6] = iM30898;
                                                i6 = i10;
                                            }
                                        }
                                        c1803.f6954.add(new C23677(c15916M37841, c15916M37842, iArr, i6));
                                    }
                                }
                                return enumC10977;
                            }
                        }
                        return EnumC10977.AOSP;
                    }
                    iM24421 = iM24421;
                    length = length;
                    i3 = iM24422;
                    map = map;
                }
                int i11 = length;
                int i12 = iM24421;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!((C1803) it.next()).m5886(c14505)) {
                        return EnumC10977.AOSP;
                    }
                }
                i2 = i12;
                length = i11;
            }
            return (c14505.f47520 <= 0 || c14505.f47522 != 0 || c14505.f47523 >= c14505.f47521) ? EnumC10977.AOSP : EnumC10977.MOTOROLA_76;
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return EnumC10977.AOSP;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m24421(C12429 c12429, int i, int i2) throws IOException {
        if (i >= 0) {
            long j = i;
            long j2 = i2;
            if (8 + j <= j2) {
                int iM30896 = c12429.m30896(i + 4);
                int iM30898 = c12429.m30898(i + 2);
                if (iM30898 < 8 || iM30896 < iM30898 || j + ((long) iM30896) > j2) {
                    throw new IOException("Invalid chunk bounds");
                }
                return i + iM30896;
            }
        }
        throw new IOException("Invalid chunk offset");
    }
}
