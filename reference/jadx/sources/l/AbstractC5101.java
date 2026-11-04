package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۙᩴۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5101 implements InterfaceC3412 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C20528 f17802 = new C20528(10);

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final C20528 f17803 = new C20528(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15428(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && ((long) i) + ((long) i2) <= ((long) i3);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private synchronized String m15433(AbstractC21094 abstractC21094, int i, int i2) {
        C14137 c14137M15435 = m15435(new C1460(abstractC21094), i, i2);
        if (c14137M15435 == null) {
            return null;
        }
        StringBuilder sb = (StringBuilder) f17802.m47061();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            if (abstractC21094 instanceof C3194) {
                C21443.m48763(sb, ((C3194) abstractC21094).m10517(), c14137M15435.f44712, c14137M15435.f44710);
            } else {
                byte[] bArrM15430 = m15430(c14137M15435.f44710);
                try {
                    abstractC21094.mo10511(c14137M15435.f44712, c14137M15435.f44710, bArrM15430);
                    C21443.m48763(sb, bArrM15430, 0, c14137M15435.f44710);
                    m15427(bArrM15430);
                } catch (Throwable th) {
                    m15427(bArrM15430);
                    throw th;
                }
            }
            String string = sb.toString();
            if ((string.length() & EnumC6121.f20881) != c14137M15435.f44709) {
                m15426(sb);
                return null;
            }
            m15426(sb);
            return string;
        } catch (Throwable th2) {
            m15426(sb);
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15441(int i) {
        if (i >= 0 && i < size()) {
            return getItem(i).getValue();
        }
        return C12295.m30686(i, size()).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m15436(String str) {
        for (int i = 0; i < size(); i++) {
            InterfaceC16090 item = getItem(i);
            if (!item.mo8825() && item.getValue().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Iterable m15440() {
        return new C2951(this);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Iterable m15439() {
        return new C2951(this);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15432(AbstractC21094 abstractC21094, int i, boolean z, int i2) {
        try {
            C1460 c1460 = new C1460(abstractC21094);
            C14137 c14137M15435 = z ? m15435(c1460, i, i2) : m15434(c1460, i, i2);
            if (c14137M15435 == null) {
                return -1;
            }
            return c14137M15435.f44711;
        } catch (IOException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15438(AbstractC21094 abstractC21094, int i, boolean z, int i2) {
        try {
            return z ? m15433(abstractC21094, i, i2) : m15425(abstractC21094, i, i2);
        } catch (C24824 e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized String m15425(AbstractC21094 abstractC21094, int i, int i2) {
        C14137 c14137M15434 = m15434(new C1460(abstractC21094), i, i2);
        if (c14137M15434 == null) {
            return null;
        }
        if (abstractC21094 instanceof C3194) {
            return m15423(c14137M15434.f44712, c14137M15434.f44710, ((C3194) abstractC21094).m10517());
        }
        byte[] bArrM15430 = m15430(c14137M15434.f44710);
        try {
            abstractC21094.mo10511(c14137M15434.f44712, c14137M15434.f44710, bArrM15430);
            String strM15423 = m15423(0, c14137M15434.f44710, bArrM15430);
            m15427(bArrM15430);
            return strM15423;
        } catch (Throwable th) {
            m15427(bArrM15430);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m15431(C13961 c13961, int i, boolean z, int i2) {
        try {
            C8917 c8917 = new C8917(c13961);
            C14137 c14137M15435 = z ? m15435(c8917, i, i2) : m15434(c8917, i, i2);
            if (c14137M15435 == null) {
                return -1;
            }
            return c14137M15435.f44711;
        } catch (IOException e) {
            throw new C1109(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized String m15424(C13961 c13961, int i, int i2) {
        try {
            C14137 c14137M15434 = m15434(new C8917(c13961), i, i2);
            if (c14137M15434 == null) {
                return null;
            }
            byte[] bArrM15430 = m15430(c14137M15434.f44710);
            try {
                c13961.seek(c14137M15434.f44712);
                c13961.readFully(bArrM15430, 0, c14137M15434.f44710);
                String strM15423 = m15423(0, c14137M15434.f44710, bArrM15430);
                m15427(bArrM15430);
                return strM15423;
            } catch (Throwable th) {
                m15427(bArrM15430);
                throw th;
            }
        } catch (IOException e) {
            throw new C1109(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15423(int i, int i2, byte[] bArr) {
        int i3;
        if (i < 0 || i2 < 0 || i > bArr.length || bArr.length - i < i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return "";
        }
        int i4 = i + i2;
        char[] cArr = new char[(i2 + 1) >>> 1];
        int i5 = 0;
        while (true) {
            int i6 = i + 1;
            if (i6 >= i4) {
                break;
            }
            char c = (char) (((bArr[i6] & 255) << 8) | (bArr[i] & 255));
            int i7 = i + 2;
            if (!Character.isHighSurrogate(c)) {
                if (Character.isLowSurrogate(c)) {
                    i3 = i5 + 1;
                    cArr[i5] = 65533;
                } else {
                    i3 = i5 + 1;
                    cArr[i5] = c;
                }
                i5 = i3;
                i = i7;
            } else if (i + 3 >= i4) {
                cArr[i5] = 65533;
                i5++;
                i = i4;
            } else {
                char c2 = (char) ((bArr[i7] & 255) | ((bArr[i + 3] & 255) << 8));
                if (Character.isLowSurrogate(c2)) {
                    int i8 = i5 + 1;
                    cArr[i5] = c;
                    i5 += 2;
                    cArr[i8] = c2;
                    i += 4;
                } else {
                    cArr[i5] = 65533;
                    i += 4;
                    i5++;
                }
            }
        }
        if (i < i4) {
            cArr[i5] = 65533;
            i5++;
        }
        return new String(cArr, 0, i5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m15437(C13961 c13961, int i, boolean z, int i2) {
        if (!z) {
            return m15424(c13961, i, i2);
        }
        synchronized (this) {
            try {
                C14137 c14137M15435 = m15435(new C8917(c13961), i, i2);
                if (c14137M15435 == null) {
                    return null;
                }
                StringBuilder sb = (StringBuilder) f17802.m47061();
                if (sb == null) {
                    sb = new StringBuilder();
                }
                byte[] bArrM15430 = m15430(c14137M15435.f44710);
                try {
                    c13961.seek(c14137M15435.f44712);
                    c13961.readFully(bArrM15430, 0, c14137M15435.f44710);
                    C21443.m48763(sb, bArrM15430, 0, c14137M15435.f44710);
                    String string = sb.toString();
                    if ((string.length() & EnumC6121.f20881) != c14137M15435.f44709) {
                        m15427(bArrM15430);
                        m15426(sb);
                        return null;
                    }
                    m15427(bArrM15430);
                    m15426(sb);
                    return string;
                } catch (Throwable th) {
                    m15427(bArrM15430);
                    m15426(sb);
                    throw th;
                }
            } catch (IOException e) {
                throw new C1109(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15421(int i, int i2, int i3, int i4, int i5) {
        long j = i;
        long j2 = ((long) i4) + j;
        if (i3 > i2 && i3 <= i4) {
            j2 = j + ((long) i3);
        }
        long jMin = Math.min(j2, Math.max(0L, i5));
        if (jMin <= 0) {
            return 0;
        }
        if (jMin >= 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jMin;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C14137 m15434(InterfaceC7426 interfaceC7426, int i, int i2) throws IOException {
        long jM15422;
        int i3 = 2;
        if (!m15428(i, 2, i2)) {
            return null;
        }
        int iM15422 = m15422(interfaceC7426, i, i2);
        if ((32768 & iM15422) != 0) {
            i3 = 4;
            if (!m15428(i, 4, i2)) {
                return null;
            }
            jM15422 = ((long) m15422(interfaceC7426, i + 2, i2)) | (((long) (iM15422 & EnumC6121.f20881)) << 16);
        } else {
            jM15422 = iM15422;
        }
        int i4 = i + i3;
        long j = jM15422 * 2;
        long j2 = ((long) i4) + j;
        long j3 = 2 + j2;
        if (j > 2147483647L || j2 > 2147483647L || j3 > i2 || m15422(interfaceC7426, (int) j2, i2) != 0) {
            return null;
        }
        return new C14137(i4, (int) j, (int) j3, -1);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C14137 m15435(InterfaceC7426 interfaceC7426, int i, int i2) {
        C9662 c9662M15429;
        int i3;
        long j;
        int i4;
        C9662 c9662M154210 = m15429(interfaceC7426, i, i2);
        if (c9662M154210 == null || (c9662M15429 = m15429(interfaceC7426, c9662M154210.f31205, i2)) == null) {
            return null;
        }
        int i5 = c9662M15429.f31205;
        long j2 = c9662M15429.f31206;
        long j3 = 0;
        long j4 = -1;
        long j5 = j2;
        while (true) {
            if (j5 > j4) {
                long j6 = ((long) i5) + j5;
                j = 1;
                i3 = i5;
                if (j6 < i2) {
                    if (interfaceC7426.mo5234((int) j6) != 0) {
                        j3++;
                        j4 = j5;
                        j5 = (j3 << 15) | j2;
                        i5 = i3;
                    } else if (j5 <= 2147483647L) {
                        i4 = (int) j5;
                        break;
                    }
                }
            } else {
                i3 = i5;
                j = 1;
            }
            i4 = -1;
            break;
        }
        if (i4 < 0) {
            return null;
        }
        int i6 = i3;
        long j7 = ((long) i6) + ((long) i4) + j;
        if (j7 > 2147483647L) {
            return null;
        }
        return new C14137(i6, i4, (int) j7, c9662M154210.f31206);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9662 m15429(InterfaceC7426 interfaceC7426, int i, int i2) {
        if (!m15428(i, 1, i2)) {
            return null;
        }
        int iMo5234 = interfaceC7426.mo5234(i);
        if ((iMo5234 & 128) == 0) {
            return new C9662(iMo5234, i + 1);
        }
        if (m15428(i, 2, i2)) {
            return new C9662(interfaceC7426.mo5234(i + 1) | ((iMo5234 & 127) << 8), i + 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15422(InterfaceC7426 interfaceC7426, int i, int i2) throws IOException {
        if (!m15428(i, 2, i2)) {
            throw new IOException("Unexpected end of string data");
        }
        return interfaceC7426.mo5233(i);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m15430(int i) {
        if (i > 4096) {
            return new byte[i];
        }
        byte[] bArr = (byte[]) f17803.m47061();
        return bArr == null ? new byte[4096] : bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15427(byte[] bArr) {
        if (bArr.length == 4096) {
            f17803.m47060(bArr);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15426(StringBuilder sb) {
        sb.setLength(0);
        if (sb.capacity() <= 6144) {
            f17802.m47060(sb);
        }
    }
}
