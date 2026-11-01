package l;

import com.alipay.sdk.m.w.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.bouncycastle.i18n.LocalizedMessage;

/* JADX INFO: renamed from: l.֡ۗ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes2.dex */
public final class C0140 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Charset f1165;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final String[] f1166 = new String[0];

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Charset f1167;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f1168;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Comparator f1169;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final C14511 f1170;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final C14511 f1171;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final Method f1172;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final AbstractC19191 f1173;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C14511 f1174;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final AbstractC21307 f1175;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C14511 f1176;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final C14511 f1177;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Charset f1178;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f1179;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Charset f1180;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final TimeZone f1181;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final Charset f1182;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1218(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1236(InterfaceC10008 interfaceC10008, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jMo9651 = interfaceC10008.mo2292().mo9647() ? interfaceC10008.mo2292().mo9651() - jNanoTime : Long.MAX_VALUE;
        interfaceC10008.mo2292().mo9649(Math.min(jMo9651, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C6043 c6043 = new C6043();
            while (interfaceC10008.mo2293(c6043, 8192L) != -1) {
                c6043.m16407();
            }
            if (jMo9651 == C17492.FOREVER_NS) {
                interfaceC10008.mo2292().mo9648();
                return true;
            }
            interfaceC10008.mo2292().mo9649(jNanoTime + jMo9651);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo9651 == C17492.FOREVER_NS) {
                interfaceC10008.mo2292().mo9648();
                return false;
            }
            interfaceC10008.mo2292().mo9649(jNanoTime + jMo9651);
            return false;
        } catch (Throwable th) {
            if (jMo9651 == C17492.FOREVER_NS) {
                interfaceC10008.mo2292().mo9648();
            } else {
                interfaceC10008.mo2292().mo9649(jNanoTime + jMo9651);
            }
            throw th;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f1168 = bArr;
        C6043 c6043 = new C6043();
        c6043.write(bArr, 0, 0);
        Method declaredMethod = null;
        f1173 = AbstractC19191.m44049(null, 0, c6043);
        f1175 = AbstractC21307.m47777((C9501) null, bArr);
        f1171 = C14511.m34936("efbbbf");
        f1174 = C14511.m34936("feff");
        f1170 = C14511.m34936("fffe");
        f1176 = C14511.m34936("0000ffff");
        f1177 = C14511.m34936("ffff0000");
        f1178 = Charset.forName(a.D);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f1165 = Charset.forName("UTF-16BE");
        f1167 = Charset.forName("UTF-16LE");
        f1182 = Charset.forName("UTF-32BE");
        f1180 = Charset.forName("UTF-32LE");
        f1181 = C12557.getTimeZone("GMT");
        f1169 = new C15664();
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f1172 = declaredMethod;
        f1179 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1232(Throwable th, IOException iOException) {
        Method method = f1172;
        if (method != null) {
            try {
                method.invoke(th, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1235(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1231(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m1233(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m1234(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                if (!"bio == null".equals(e2.getMessage())) {
                    throw e2;
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m1227(List list) {
        return C0561.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m1228(Object... objArr) {
        return C0561.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadFactory m1229(String str, boolean z) {
        return new ThreadFactoryC19897(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m1237(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m1241(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1224(C14440 c14440, boolean z) {
        String strM34748;
        if (c14440.m34748().contains(":")) {
            strM34748 = "[" + c14440.m34748() + "]";
        } else {
            strM34748 = c14440.m34748();
        }
        if (!z && c14440.m34740() == C14440.m34733(c14440.m34747())) {
            return strM34748;
        }
        StringBuilder sbM8976 = C3012.m8976(strM34748, ":");
        sbM8976.append(c14440.m34740());
        return sbM8976.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m1234(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m1239(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static int m1238(int i, int i2, String str) {
        while (true) {
            i2--;
            if (i2 < i) {
                return i;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i2 + 1;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1221(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1220(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1223(String str) {
        int i = -1;
        int i2 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i2 < lowerCase.length()) {
                    char cCharAt = lowerCase.charAt(i2);
                    if (cCharAt <= 31 || cCharAt >= 127 || " #%/:?@[\\]".indexOf(cCharAt) != -1) {
                        return null;
                    }
                    i2++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressM1225 = (str.startsWith("[") && str.endsWith("]")) ? m1225(1, str.length() - 1, str) : m1225(0, str.length(), str);
        if (inetAddressM1225 == null) {
            return null;
        }
        byte[] address = inetAddressM1225.getAddress();
        if (address.length != 16) {
            throw new AssertionError(C16523.m38890("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        C6043 c6043 = new C6043();
        while (i2 < address.length) {
            if (i2 == i) {
                c6043.m16434writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c6043.m16434writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c6043.m16434writeByte(58);
                }
                c6043.m16432(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c6043.m16427();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m1240(String str) {
        return f1179.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Charset m1226(InterfaceC23683 interfaceC23683, Charset charset) {
        C14511 c14511 = f1171;
        if (interfaceC23683.mo16424(c14511)) {
            interfaceC23683.skip(c14511.mo34938());
            return f1178;
        }
        C14511 c14512 = f1174;
        if (interfaceC23683.mo16424(c14512)) {
            interfaceC23683.skip(c14512.mo34938());
            return f1165;
        }
        C14511 c14513 = f1170;
        if (interfaceC23683.mo16424(c14513)) {
            interfaceC23683.skip(c14513.mo34938());
            return f1167;
        }
        C14511 c14514 = f1176;
        if (interfaceC23683.mo16424(c14514)) {
            interfaceC23683.skip(c14514.mo34938());
            return f1182;
        }
        C14511 c14515 = f1177;
        if (!interfaceC23683.mo16424(c14515)) {
            return charset;
        }
        interfaceC23683.skip(c14515.mo34938());
        return f1180;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m1219(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        long millis = timeUnit.toMillis(j);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException("timeout too large.");
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException("timeout too small.");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AssertionError m1222(String str, Exception exc) {
        AssertionError assertionError = new AssertionError(str);
        try {
            assertionError.initCause(exc);
        } catch (IllegalStateException unused) {
        }
        return assertionError;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[LOOP:1: B:55:0x0095->B:59:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x00a8 A[EDGE_INSN: B:85:0x00a8->B:60:0x00a8 BREAK  A[LOOP:1: B:55:0x0095->B:59:0x00a2], SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InetAddress m1225(int i, int i2, String str) {
        int i3;
        int i4;
        int iM1218;
        byte[] bArr = new byte[16];
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (i < i2) {
            if (i5 == 16) {
                return null;
            }
            int i8 = i + 2;
            if (i8 <= i2 && str.regionMatches(i, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                i = i7;
                i3 = 0;
                while (i < i2) {
                    iM1218 = m1218(str.charAt(i));
                    if (iM1218 == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM1218;
                    i++;
                }
                i4 = i - i7;
                return i4 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (!str.regionMatches(i, ":", 0, 1)) {
                    if (!str.regionMatches(i, ".", 0, 1)) {
                        return null;
                    }
                    int i9 = i5 - 2;
                    int i10 = i9;
                    while (i7 < i2) {
                        if (i10 == 16) {
                            return null;
                        }
                        if (i10 != i9) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i11 = i7;
                        int i12 = 0;
                        while (i11 < i2) {
                            char cCharAt = str.charAt(i11);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            if ((i12 == 0 && i7 != i11) || (i12 = ((i12 * 10) + cCharAt) - 48) > 255) {
                                return null;
                            }
                            i11++;
                        }
                        if (i11 - i7 == 0) {
                            return null;
                        }
                        bArr[i10] = (byte) i12;
                        i10++;
                        i7 = i11;
                    }
                    if (i10 == i5 + 2) {
                        i5 += 2;
                        break;
                    }
                    return null;
                }
                i++;
            }
            i7 = i;
            i = i7;
            i3 = 0;
            while (i < i2) {
                iM1218 = m1218(str.charAt(i));
                if (iM1218 == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM1218;
                i++;
            }
            i4 = i - i7;
            if (i4 == 0 && i4 <= 4) {
                int i13 = i5 + 1;
                bArr[i5] = (byte) (255 & (i3 >>> 8));
                i5 += 2;
                bArr[i13] = (byte) (i3 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i14 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i14, i14);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C10912 m1230(ArrayList arrayList) {
        C5972 c5972 = new C5972();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C3013 c3013 = (C3013) it.next();
            AbstractC7196.f24003.mo19138(c5972, c3013.f11269.mo34948(), c3013.f11268.mo34948());
        }
        return c5972.m16265();
    }
}
