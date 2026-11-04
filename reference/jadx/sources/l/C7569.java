package l;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.۟֫᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7YB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7569 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m20681(byte b, byte b2) {
        int i;
        int i2;
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = b2 & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        int i6 = i5 & 3;
        if (i5 >= 16) {
            i2 = 2500 << i6;
        } else if (i5 >= 12) {
            i2 = 10000 << (i5 & 1);
        } else {
            i2 = i6 == 3 ? 60000 : 10000 << i6;
        }
        return ((long) i) * ((long) i2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20684(char c) {
        return c == '\n' || c == '\t' || c == ' ';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20685(long j, long j2) {
        return j - j2 <= 80000;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m20686(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) ^ (charSequence2 == null)) {
            return false;
        }
        if (charSequence == null) {
            return true;
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < length2) {
            if (charSequence.charAt(i) == charSequence2.charAt(i2)) {
                i++;
                i2++;
            } else {
                boolean z = false;
                while (i != length && m20684(charSequence.charAt(i))) {
                    i++;
                    z = true;
                }
                while (i2 != length2 && m20684(charSequence2.charAt(i2))) {
                    i2++;
                    z = true;
                }
                if (!z) {
                    return false;
                }
            }
        }
        while (i != length) {
            if (!m20684(charSequence.charAt(i))) {
                return false;
            }
            i++;
        }
        while (i2 != length2) {
            if (!m20684(charSequence2.charAt(i2))) {
                return false;
            }
            i2++;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m20682(C21287 c21287, int i, int i2) {
        c21287.m48510(i);
        if (c21287.m48486() < 5) {
            return -9223372036854775807L;
        }
        int iM48500 = c21287.m48500();
        if ((8388608 & iM48500) != 0 || ((2096896 & iM48500) >> 8) != i2 || (iM48500 & 32) == 0 || c21287.m48493() < 7 || c21287.m48486() < 7 || (c21287.m48493() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        c21287.m48490(0, 6, bArr);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20680(ByteBuffer byteBuffer) {
        int i;
        if ((byteBuffer.get(5) & 2) == 0) {
            i = 0;
        } else {
            byte b = byteBuffer.get(26);
            int i2 = 28;
            int i3 = 28;
            for (int i4 = 0; i4 < b; i4++) {
                i3 += byteBuffer.get(i4 + 27);
            }
            byte b2 = byteBuffer.get(i3 + 26);
            for (int i5 = 0; i5 < b2; i5++) {
                i2 += byteBuffer.get(i3 + 27 + i5);
            }
            i = i3 + i2;
        }
        int i6 = byteBuffer.get(i + 26) + 27 + i;
        return (int) ((m20681(byteBuffer.get(i6), byteBuffer.limit() - i6 > 1 ? byteBuffer.get(i6 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m20689(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && m20684(charSequence.charAt(i2))) {
            i2++;
        }
        while (i2 < length && m20684(charSequence.charAt(length - 1))) {
            length--;
        }
        while (i < length2 && m20684(charSequence2.charAt(i))) {
            i++;
        }
        while (i < length2 && m20684(charSequence2.charAt(length2 - 1))) {
            length2--;
        }
        return TextUtils.equals(new C3901(i2, length, charSequence), new C3901(i, length2, charSequence2));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m20687(ByteBuffer byteBuffer) {
        return (int) ((m20681(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m20688(byte[] bArr) {
        return m20681(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m20683(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m20679(int i, int i2, CharSequence charSequence) {
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 31) + charSequence.charAt(i);
            i++;
        }
        return iCharAt;
    }
}
