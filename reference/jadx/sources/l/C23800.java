package l;

import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.᩹᩶᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 39TA */
/* JADX INFO: loaded from: classes.dex */
public final class C23800 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53094(int i, int i2, byte[] bArr) {
        if (i2 < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
        if (i2 > 0) {
            if (i < 0 || i >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i);
            }
            int i3 = (i + i2) - 1;
            if (i3 < 0 || i3 >= bArr.length) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m53096(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 'J' || cCharAt == 'D';
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m53097(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m53093(int i, byte[] bArr) {
        if (C16377.f53164 == ByteOrder.BIG_ENDIAN) {
            return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        }
        return m53097(i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m53095(List list, C16340 c16340) {
        int iM38841 = c16340.m38841();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C16340) it.next()).m38841() == iM38841) {
                it.remove();
            }
        }
        list.add(c16340);
    }
}
