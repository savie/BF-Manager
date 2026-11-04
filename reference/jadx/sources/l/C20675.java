package l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.᩵ܺۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GS */
/* JADX INFO: loaded from: classes5.dex */
public final class C20675 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m47302(String str, byte[] bArr, String str2) throws C19183, C3521 {
        C14707 c14707;
        int i;
        int[] iArr;
        int[] iArr2;
        C14707 c14708;
        int i2;
        C21421 c21421;
        try {
            C12470 c12470 = new C12470(bArr);
            C14707[] c14707Arr = c12470.f40055;
            int length = c14707Arr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    c14707 = null;
                    break;
                }
                c14707 = c14707Arr[i3];
                if (c14707 != null) {
                    C21421 c21422 = c14707.f48049.f40057;
                    if ((c21422 == null ? null : c21422.m48723(c14707.f48051)).equals(".hash")) {
                        break;
                    }
                }
                i3++;
            }
            ByteBuffer byteBuffer = c12470.f40054;
            if (c14707 == null) {
                i = 0;
                iArr = null;
                iArr2 = null;
            } else {
                int i4 = (int) c14707.f48048;
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
            int length2 = c14707Arr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length2) {
                    c14708 = null;
                    break;
                }
                c14708 = c14707Arr[i9];
                if (c14708 != null) {
                    C21421 c21423 = c14708.f48049.f40057;
                    if (".dynsym".equals(c21423 == null ? null : c21423.m48723(c14708.f48051))) {
                        break;
                    }
                }
                i9++;
            }
            C7996 c7996 = (C7996) c14708;
            if (c7996 != null) {
                C14707 c14709 = c7996.f48049.f40055[c7996.f48053];
                long j = c7996.f48050;
                int i10 = j == 0 ? 0 : (int) (c7996.f48052 / j);
                C18437[] c18437Arr = new C18437[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    c18437Arr[i11] = c7996.m21802(i11);
                }
                String[] strArr = new String[i10];
                int i12 = 0;
                int i13 = 0;
                while (i12 < i10) {
                    C18437 c18437 = c18437Arr[i12];
                    int i14 = i13 + 1;
                    strArr[i13] = (c18437 == null || (c21421 = c18437.f60036) == null) ? null : c21421.m48723(c18437.f60034);
                    i12++;
                    i13 = i14;
                }
                boolean z = false;
                for (int i15 = 0; i15 < i10; i15++) {
                    String str3 = strArr[i15];
                    if (str3 != null && str3.startsWith(str)) {
                        if (str2.length() != str.length()) {
                            throw new C19183();
                        }
                        StringBuilder sbM27333 = C10732.m27333(str2);
                        sbM27333.append(strArr[i15].substring(str.length()));
                        String string = sbM27333.toString();
                        C18437 c18438 = c18437Arr[i15];
                        byteBuffer.position((int) (c18438.f60036.f48048 + ((long) c18438.f60034)));
                        byteBuffer.put(str2.getBytes());
                        if (c14707 != null) {
                            long j2 = i;
                            int iM47301 = (int) (m47301(strArr[i15]) % j2);
                            int iM47302 = (int) (m47301(string) % j2);
                            if (iM47302 != iM47301 && iArr[iM47302] != i15) {
                                int i16 = iArr[iM47301];
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
                                    iArr[iM47301] = 0;
                                }
                                int i20 = iArr[iM47302];
                                if (i20 == 0) {
                                    iArr[iM47302] = i15;
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        i2 = iArr2[i20];
                                        if (i2 == 0) {
                                            break;
                                        }
                                        int i22 = i21 + 1;
                                        if (i21 == iArr2.length) {
                                            throw new C3521("Fix hash table failed");
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
                byteBuffer.position(((int) c14707.f48048) + 8);
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
    public static long m47301(String str) {
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
