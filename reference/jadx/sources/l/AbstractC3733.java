package l;

import java.io.IOException;

/* JADX INFO: renamed from: l.ۘۚۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: H61Y */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3733 implements InterfaceC5727 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C19805 f13557 = new C19805(10);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized String m10926(C1388 c1388, int i, int i2) {
        try {
            C12907 c12907M10933 = m10933(new C22079(c1388), i, i2);
            if (c12907M10933 == null) {
                return null;
            }
            int i3 = c12907M10933.f42901;
            byte[] bArr = new byte[i3];
            c1388.seek(c12907M10933.f42899);
            c1388.m4864(bArr, 0, i3);
            return m10925(0, c12907M10933.f42901, bArr);
        } catch (IOException e) {
            throw new C3214(e);
        }
        throw th;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private synchronized String m10927(C12429 c12429, int i, int i2) {
        C12907 c12907M10922 = m10922(new C11496(c12429), i, i2);
        if (c12907M10922 == null) {
            return null;
        }
        StringBuilder sb = (StringBuilder) f13557.m45009();
        if (sb == null) {
            sb = new StringBuilder();
        }
        try {
            C23967.m52798(sb, c12429.m30893(), c12907M10922.f42899, c12907M10922.f42901);
            String string = sb.toString();
            if ((string.length() & EnumC23529.f76192) != c12907M10922.f42900) {
                m10928(sb);
                return null;
            }
            m10928(sb);
            return string;
        } catch (Throwable th) {
            m10928(sb);
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10929(int i, int i2, int i3) {
        return i >= 0 && i2 >= 0 && ((long) i) + ((long) i2) <= ((long) i3);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m10939(int i) {
        if (i >= 0 && i < size()) {
            return getItem(i).getValue();
        }
        return C20149.m45565(i, size()).toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m10934(String str) {
        for (int i = 0; i < size(); i++) {
            InterfaceC12078 item = getItem(i);
            if (!item.mo11445() && item.getValue().equals(str)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Iterable m10938() {
        return new C5145(this);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Iterable m10937() {
        return new C5145(this);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m10932(C12429 c12429, int i, boolean z, int i2) {
        try {
            C11496 c11496 = new C11496(c12429);
            C12907 c12907M10922 = z ? m10922(c11496, i, i2) : m10933(c11496, i, i2);
            if (c12907M10922 == null) {
                return -1;
            }
            return c12907M10922.f42902;
        } catch (IOException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m10936(C12429 c12429, int i, boolean z, int i2) {
        try {
            if (z) {
                return m10927(c12429, i, i2);
            }
            synchronized (this) {
                C12907 c12907M10933 = m10933(new C11496(c12429), i, i2);
                if (c12907M10933 == null) {
                    return null;
                }
                return m10925(c12907M10933.f42899, c12907M10933.f42901, c12429.m30893());
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m10931(C1388 c1388, int i, boolean z, int i2) {
        try {
            C22079 c22079 = new C22079(c1388);
            C12907 c12907M10922 = z ? m10922(c22079, i, i2) : m10933(c22079, i, i2);
            if (c12907M10922 == null) {
                return -1;
            }
            return c12907M10922.f42902;
        } catch (IOException e) {
            throw new C3214(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10925(int i, int i2, byte[] bArr) {
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
    public final String m10935(C1388 c1388, int i, boolean z, int i2) {
        if (!z) {
            return m10926(c1388, i, i2);
        }
        synchronized (this) {
            try {
                C12907 c12907M10922 = m10922(new C22079(c1388), i, i2);
                if (c12907M10922 == null) {
                    return null;
                }
                StringBuilder sb = (StringBuilder) f13557.m45009();
                if (sb == null) {
                    sb = new StringBuilder();
                }
                int i3 = c12907M10922.f42901;
                byte[] bArr = new byte[i3];
                c1388.seek(c12907M10922.f42899);
                c1388.m4864(bArr, 0, i3);
                try {
                    C23967.m52798(sb, bArr, 0, c12907M10922.f42901);
                    String string = sb.toString();
                    if ((string.length() & EnumC23529.f76192) != c12907M10922.f42900) {
                        m10928(sb);
                        return null;
                    }
                    m10928(sb);
                    return string;
                } catch (Throwable th) {
                    m10928(sb);
                    throw th;
                }
            } catch (IOException e) {
                throw new C3214(e);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10923(int i, int i2, int i3, int i4, int i5) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C12907 m10933(InterfaceC0911 interfaceC0911, int i, int i2) throws IOException {
        long jM10924;
        int i3 = 2;
        if (!m10929(i, 2, i2)) {
            return null;
        }
        int iM10924 = m10924(interfaceC0911, i, i2);
        if ((32768 & iM10924) != 0) {
            i3 = 4;
            if (!m10929(i, 4, i2)) {
                return null;
            }
            jM10924 = ((long) m10924(interfaceC0911, i + 2, i2)) | (((long) (iM10924 & EnumC23529.f76192)) << 16);
        } else {
            jM10924 = iM10924;
        }
        int i4 = i + i3;
        long j = jM10924 * 2;
        long j2 = ((long) i4) + j;
        long j3 = 2 + j2;
        if (j > 2147483647L || j2 > 2147483647L || j3 > i2 || m10924(interfaceC0911, (int) j2, i2) != 0) {
            return null;
        }
        return new C12907(i4, (int) j, (int) j3, -1);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C12907 m10922(InterfaceC0911 interfaceC0911, int i, int i2) {
        C2322 c2322M10930;
        int i3;
        long j;
        int i4;
        C2322 c2322M10931 = m10930(interfaceC0911, i, i2);
        if (c2322M10931 == null || (c2322M10930 = m10930(interfaceC0911, c2322M10931.f8242, i2)) == null) {
            return null;
        }
        int i5 = c2322M10930.f8242;
        long j2 = c2322M10930.f8243;
        long j3 = 0;
        long j4 = -1;
        long j5 = j2;
        while (true) {
            if (j5 > j4) {
                long j6 = ((long) i5) + j5;
                j = 1;
                i3 = i5;
                if (j6 < i2) {
                    if (interfaceC0911.mo3631((int) j6) != 0) {
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
        return new C12907(i6, i4, (int) j7, c2322M10931.f8243);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C2322 m10930(InterfaceC0911 interfaceC0911, int i, int i2) {
        if (!m10929(i, 1, i2)) {
            return null;
        }
        int iMo3631 = interfaceC0911.mo3631(i);
        if ((iMo3631 & 128) == 0) {
            return new C2322(iMo3631, i + 1);
        }
        if (m10929(i, 2, i2)) {
            return new C2322(interfaceC0911.mo3631(i + 1) | ((iMo3631 & 127) << 8), i + 2);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m10924(InterfaceC0911 interfaceC0911, int i, int i2) throws IOException {
        if (!m10929(i, 2, i2)) {
            throw new IOException("Unexpected end of string data");
        }
        return interfaceC0911.mo3630(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10928(StringBuilder sb) {
        sb.setLength(0);
        if (sb.capacity() <= 6144) {
            f13557.m45011(sb);
        }
    }
}
