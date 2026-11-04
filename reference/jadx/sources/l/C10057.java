package l;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۢۤۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56JZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C10057 {
    /* JADX WARN: Code duplicated, block: B:88:0x0148 A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac, blocks: (B:3:0x0002, B:5:0x000f, B:7:0x001d, B:9:0x0020, B:11:0x0028, B:17:0x0042, B:19:0x0045, B:21:0x0058, B:24:0x0068, B:27:0x0072, B:30:0x0081, B:32:0x0092, B:36:0x0099, B:38:0x009c, B:53:0x00c4, B:51:0x00bb, B:55:0x00c7, B:60:0x00f4, B:67:0x0100, B:72:0x0112, B:74:0x0116, B:77:0x0127, B:79:0x012d, B:81:0x0134, B:93:0x0155, B:88:0x0148, B:90:0x014c, B:92:0x0152, B:82:0x0139, B:94:0x0158, B:97:0x016f, B:98:0x017d, B:100:0x0183, B:102:0x018f, B:105:0x0198, B:107:0x019c, B:109:0x01a0, B:111:0x01a6, B:113:0x01a9), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x014c A[Catch: IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac, TryCatch #0 {IOException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01ac, blocks: (B:3:0x0002, B:5:0x000f, B:7:0x001d, B:9:0x0020, B:11:0x0028, B:17:0x0042, B:19:0x0045, B:21:0x0058, B:24:0x0068, B:27:0x0072, B:30:0x0081, B:32:0x0092, B:36:0x0099, B:38:0x009c, B:53:0x00c4, B:51:0x00bb, B:55:0x00c7, B:60:0x00f4, B:67:0x0100, B:72:0x0112, B:74:0x0116, B:77:0x0127, B:79:0x012d, B:81:0x0134, B:93:0x0155, B:88:0x0148, B:90:0x014c, B:92:0x0152, B:82:0x0139, B:94:0x0158, B:97:0x016f, B:98:0x017d, B:100:0x0183, B:102:0x018f, B:105:0x0198, B:107:0x019c, B:109:0x01a0, B:111:0x01a6, B:113:0x01a9), top: B:117:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0151  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC18262 m25988(AbstractC21094 abstractC21094, int i) {
        int iMo10514;
        try {
            C7821 c7821 = new C7821();
            int iMo10510 = abstractC21094.mo10510();
            int i2 = i;
            while (i2 < iMo10510) {
                int iM25987 = m25987(abstractC21094, i2, iMo10510);
                int iMo10515 = abstractC21094.mo10514(i2 + 2);
                if (iMo10515 < 284) {
                    return EnumC18262.AOSP;
                }
                HashMap map = new HashMap();
                int i3 = i2 + iMo10515;
                while (i3 < iM25987) {
                    int iM25988 = m25987(abstractC21094, i3, iM25987);
                    int iMo10516 = abstractC21094.mo10514(i3);
                    int iMo10517 = abstractC21094.mo10514(i3 + 2);
                    if (iMo10516 == 514 || iMo10516 == 513) {
                        if (iMo10517 < 16) {
                            return EnumC18262.AOSP;
                        }
                        int iMo10518 = abstractC21094.mo10515(i3 + 8);
                        C19008 c19008 = (C19008) map.get(Integer.valueOf(iMo10518));
                        if (c19008 == null) {
                            c19008 = new C19008(0);
                            map.put(Integer.valueOf(iMo10518), c19008);
                        }
                        if (iMo10516 == 514) {
                            int iMo10513 = abstractC21094.mo10513(i3 + 12);
                            if (iMo10513 >= 0 && iMo10513 <= 65536) {
                                if ((((long) iMo10513) * 4) + ((long) i3) + ((long) iMo10517) <= iM25988) {
                                    c19008.f61573 = abstractC21094.mo42229(i3 + iMo10517, iMo10513);
                                }
                            }
                            return EnumC18262.AOSP;
                        }
                        if (iMo10517 < 24) {
                            return EnumC18262.AOSP;
                        }
                        int i4 = i3 + 20;
                        int iMo10519 = abstractC21094.mo10513(i4);
                        if (iMo10519 == 28 || iMo10519 == 32 || iMo10519 == 36 || iMo10519 == 48 || iMo10519 == 52 || iMo10519 == 76) {
                            long j = iMo10517;
                            if (((long) iMo10519) + 20 <= j) {
                                C20500 c20500M47001 = C20500.m47001(abstractC21094.m48157(i4), EnumC18262.MOTOROLA_76);
                                C16618 c16618M48157 = abstractC21094.m48157(i4);
                                EnumC18262 enumC18262 = EnumC18262.AOSP;
                                C20500 c20500M47002 = C20500.m47001(c16618M48157, enumC18262);
                                int iMo105110 = abstractC21094.mo10513(i3 + 12);
                                int iMo105111 = abstractC21094.mo10515(i3 + 9);
                                boolean z = true;
                                boolean z2 = (iMo105111 & 1) != 0;
                                if (z2 || (iMo105111 & 2) == 0) {
                                    z = false;
                                }
                                int i5 = z ? 2 : 4;
                                int iMo105112 = abstractC21094.mo10513(i3 + 16);
                                if (iMo105110 >= 0 && iMo105110 <= 65536 && iMo105112 >= iMo10517 && iMo105112 <= iM25988 - i3) {
                                    if ((((long) i5) * ((long) iMo105110)) + j <= iMo105112) {
                                        int[] iArr = new int[iMo105110];
                                        int i6 = 0;
                                        for (int i7 = 0; i7 < iMo105110; i7++) {
                                            int i8 = (i7 * i5) + i3 + iMo10517;
                                            int iMo105113 = z ? abstractC21094.mo10514(i8) : abstractC21094.mo10513(i8);
                                            if (z2) {
                                                int i9 = i6 + 1;
                                                if (z2) {
                                                    iMo10514 = abstractC21094.mo10514(i8);
                                                } else {
                                                    iMo10514 = i7;
                                                }
                                                iArr[i6] = iMo10514;
                                                i6 = i9;
                                            } else if (iMo105113 != (z ? 65535 : -1)) {
                                                int i10 = i6 + 1;
                                                if (z2) {
                                                    iMo10514 = abstractC21094.mo10514(i8);
                                                } else {
                                                    iMo10514 = i7;
                                                }
                                                iArr[i6] = iMo10514;
                                                i6 = i10;
                                            }
                                        }
                                        c19008.f61572.add(new C0363(c20500M47001, c20500M47002, iArr, i6));
                                    }
                                }
                                return enumC18262;
                            }
                        }
                        return EnumC18262.AOSP;
                    }
                    iM25987 = iM25987;
                    iMo10510 = iMo10510;
                    i3 = iM25988;
                    map = map;
                }
                int i11 = iMo10510;
                int i12 = iM25987;
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!((C19008) it.next()).m44097(c7821)) {
                        return EnumC18262.AOSP;
                    }
                }
                i2 = i12;
                iMo10510 = i11;
            }
            return (c7821.f26046 <= 0 || c7821.f26044 != 0 || c7821.f26045 >= c7821.f26043) ? EnumC18262.AOSP : EnumC18262.MOTOROLA_76;
        } catch (IOException | IllegalArgumentException | IndexOutOfBoundsException unused) {
            return EnumC18262.AOSP;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m25987(AbstractC21094 abstractC21094, int i, int i2) throws IOException {
        if (i >= 0) {
            long j = i;
            long j2 = i2;
            if (8 + j <= j2) {
                int iMo10513 = abstractC21094.mo10513(i + 4);
                int iMo10514 = abstractC21094.mo10514(i + 2);
                if (iMo10514 < 8 || iMo10513 < iMo10514 || j + ((long) iMo10513) > j2) {
                    throw new IOException("Invalid chunk bounds");
                }
                return i + iMo10513;
            }
        }
        throw new IOException("Invalid chunk offset");
    }
}
