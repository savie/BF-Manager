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

/* JADX INFO: renamed from: l.ᩴ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: R5PD */
/* JADX INFO: loaded from: classes5.dex */
public final class C19822 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Charset f63713;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final C16794 f63714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f63715;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C16794 f63716;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final AbstractC8699 f63717;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final C16794 f63718;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Method f63719;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Charset f63720;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final TimeZone f63721;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final C16794 f63722;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C16794 f63723;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Charset f63724;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Comparator f63725;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static final Pattern f63726;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final AbstractC10190 f63727;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final String[] f63728 = new String[0];

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Charset f63729;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final Charset f63730;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45588(char c) {
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
    public static boolean m45606(InterfaceC13810 interfaceC13810, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long jNanoTime = System.nanoTime();
        long jMo50550 = interfaceC13810.mo4181().mo50553() ? interfaceC13810.mo4181().mo50550() - jNanoTime : Long.MAX_VALUE;
        interfaceC13810.mo4181().mo15812(Math.min(jMo50550, timeUnit.toNanos(i)) + jNanoTime);
        try {
            C1879 c1879 = new C1879();
            while (interfaceC13810.mo4186(c1879, 8192L) != -1) {
                c1879.m6436();
            }
            if (jMo50550 == C25227.FOREVER_NS) {
                interfaceC13810.mo4181().mo50548();
                return true;
            }
            interfaceC13810.mo4181().mo15812(jNanoTime + jMo50550);
            return true;
        } catch (InterruptedIOException unused) {
            if (jMo50550 == C25227.FOREVER_NS) {
                interfaceC13810.mo4181().mo50548();
                return false;
            }
            interfaceC13810.mo4181().mo15812(jNanoTime + jMo50550);
            return false;
        } catch (Throwable th) {
            if (jMo50550 == C25227.FOREVER_NS) {
                interfaceC13810.mo4181().mo50548();
            } else {
                interfaceC13810.mo4181().mo15812(jNanoTime + jMo50550);
            }
            throw th;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f63715 = bArr;
        C1879 c1879 = new C1879();
        c1879.write(bArr, 0, 0);
        Method declaredMethod = null;
        f63717 = AbstractC8699.m23389(null, 0, c1879);
        f63727 = AbstractC10190.m26309((C16157) null, bArr);
        f63714 = C16794.m39652("efbbbf");
        f63716 = C16794.m39652("feff");
        f63718 = C16794.m39652("fffe");
        f63723 = C16794.m39652("0000ffff");
        f63722 = C16794.m39652("ffff0000");
        f63729 = Charset.forName(a.D);
        Charset.forName(LocalizedMessage.DEFAULT_ENCODING);
        f63720 = Charset.forName("UTF-16BE");
        f63713 = Charset.forName("UTF-16LE");
        f63730 = Charset.forName("UTF-32BE");
        f63724 = Charset.forName("UTF-32LE");
        f63721 = C10646.getTimeZone("GMT");
        f63725 = new C10871();
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
        }
        f63719 = declaredMethod;
        f63726 = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45602(Throwable th, IOException iOException) {
        Method method = f63719;
        if (method != null) {
            try {
                method.invoke(th, iOException);
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45605(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45601(Closeable closeable) {
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
    public static void m45603(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m45604(e)) {
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
    public static List m45597(List list) {
        return C4681.unmodifiableList(new ArrayList(list));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45598(Object... objArr) {
        return C4681.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ThreadFactory m45599(String str, boolean z) {
        return new ThreadFactoryC22806(str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String[] m45607(Comparator comparator, String[] strArr, String[] strArr2) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m45611(Comparator comparator, String[] strArr, String[] strArr2) {
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
    public static String m45594(C16903 c16903, boolean z) {
        String strM39872;
        if (c16903.m39872().contains(":")) {
            strM39872 = "[" + c16903.m39872() + "]";
        } else {
            strM39872 = c16903.m39872();
        }
        if (!z && c16903.m39880() == C16903.m39862(c16903.m39873())) {
            return strM39872;
        }
        StringBuilder sbM10405 = C3188.m10405(strM39872, ":");
        sbM10405.append(c16903.m39880());
        return sbM10405.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45604(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m45609(int i, int i2, String str) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static int m45608(int i, int i2, String str) {
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
    public static int m45591(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45590(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45593(String str) {
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
        InetAddress inetAddressM45595 = (str.startsWith("[") && str.endsWith("]")) ? m45595(1, str.length() - 1, str) : m45595(0, str.length(), str);
        if (inetAddressM45595 == null) {
            return null;
        }
        byte[] address = inetAddressM45595.getAddress();
        if (address.length != 16) {
            throw new AssertionError(C14442.m34865("Invalid IPv6 address: '", str, "'"));
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
        C1879 c1879 = new C1879();
        while (i2 < address.length) {
            if (i2 == i) {
                c1879.m6455writeByte(58);
                i2 += i4;
                if (i2 == 16) {
                    c1879.m6455writeByte(58);
                }
            } else {
                if (i2 > 0) {
                    c1879.m6455writeByte(58);
                }
                c1879.m6454(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return c1879.m6446();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m45610(String str) {
        return f63726.matcher(str).matches();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Charset m45596(InterfaceC25000 interfaceC25000, Charset charset) {
        C16794 c16794 = f63714;
        if (interfaceC25000.mo4188(c16794)) {
            interfaceC25000.skip(c16794.mo23081());
            return f63729;
        }
        C16794 c16795 = f63716;
        if (interfaceC25000.mo4188(c16795)) {
            interfaceC25000.skip(c16795.mo23081());
            return f63720;
        }
        C16794 c16796 = f63718;
        if (interfaceC25000.mo4188(c16796)) {
            interfaceC25000.skip(c16796.mo23081());
            return f63713;
        }
        C16794 c16797 = f63723;
        if (interfaceC25000.mo4188(c16797)) {
            interfaceC25000.skip(c16797.mo23081());
            return f63730;
        }
        C16794 c16798 = f63722;
        if (!interfaceC25000.mo4188(c16798)) {
            return charset;
        }
        interfaceC25000.skip(c16798.mo23081());
        return f63724;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45589(long j, TimeUnit timeUnit) {
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
    public static AssertionError m45592(String str, Exception exc) {
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
    public static InetAddress m45595(int i, int i2, String str) {
        int i3;
        int i4;
        int iM45588;
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
                    iM45588 = m45588(str.charAt(i));
                    if (iM45588 == -1) {
                        break;
                        break;
                    }
                    i3 = (i3 << 4) + iM45588;
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
                iM45588 = m45588(str.charAt(i));
                if (iM45588 == -1) {
                    break;
                }
                i3 = (i3 << 4) + iM45588;
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
    public static C11682 m45600(ArrayList arrayList) {
        C1988 c1988 = new C1988();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C23334 c23334 = (C23334) it.next();
            AbstractC4906.f17137.mo15057(c1988, c23334.f75578.mo23092(), c23334.f75577.mo23092());
        }
        return c1988.m6809();
    }
}
