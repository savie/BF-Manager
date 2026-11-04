package l;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Writer;
import java.nio.channels.Channels;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes2.dex */
public final class C5125 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f17846;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m15491(InputStream inputStream) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C18046.f59088;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return (List) C7724.lines(new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset))).collect(C2025.toList());
    }

    static {
        char c = File.separatorChar;
        f17846 = new byte[0];
        System.lineSeparator();
        EnumC22279.LF.getString();
        EnumC22279.CRLF.getString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m15489(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        C17359.requireNonNull(inputStream, "inputStream");
        C17359.requireNonNull(outputStream, "outputStream");
        long j = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (-1 == i2) {
                return j;
            }
            outputStream.write(bArr, 0, i2);
            j += (long) i2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15493(int i, int i2, byte[] bArr) {
        C17359.requireNonNull(bArr, "byte array");
        m15492(i, i2, bArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15499(char[] cArr, int i, int i2) {
        C17359.requireNonNull(cArr, "char array");
        m15492(i, i2, cArr.length);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15492(int i, int i2, int i3) {
        if ((i | i2 | i3) < 0 || i3 - i2 < i) {
            throw new IndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15494(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m15500(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        return C5871.m17102(Channels.newChannel(inputStream), Channels.newChannel(inputStream2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15497(InputStream inputStream, Writer writer, Charset charset) {
        int i = C18046.f59088;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        C13570 c13570M33276 = C13570.m33276();
        try {
            char[] cArrM33277 = c13570M33276.m33277();
            while (true) {
                int i2 = inputStreamReader.read(cArrM33277);
                if (-1 == i2) {
                    c13570M33276.close();
                    return;
                }
                writer.write(cArrM33277, 0, i2);
            }
        } catch (Throwable th) {
            if (c13570M33276 != null) {
                try {
                    c13570M33276.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15496(InputStream inputStream, OutputStream outputStream) throws IOException {
        m15489(inputStream, outputStream, 8192);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15495(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j) {
        C2384 c2384M8086 = C2384.m8086();
        try {
            byte[] bArrM8087 = c2384M8086.m8087();
            long j2 = 0;
            if (j != 0) {
                int length = bArrM8087.length;
                int iMin = (j <= 0 || j >= ((long) length)) ? length : (int) j;
                while (iMin > 0) {
                    int i = inputStream.read(bArrM8087, 0, iMin);
                    if (-1 == i) {
                        break;
                    }
                    byteArrayOutputStream.write(bArrM8087, 0, i);
                    j2 += (long) i;
                    if (j > 0) {
                        iMin = (int) Math.min(j - j2, length);
                    }
                }
            }
            c2384M8086.close();
        } catch (Throwable th) {
            if (c2384M8086 != null) {
                try {
                    c2384M8086.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m15503(InputStream inputStream) throws IOException {
        int i = C16070.f52076;
        C17562 c17562 = new C17562();
        c17562.m32894();
        C16070 c16070M41216 = c17562.m41216();
        int i2 = C22038.f71075;
        C4884 c4884 = new C4884();
        c4884.m34238(2147483640L);
        c4884.m34241();
        c4884.m46097(inputStream);
        C22038 c22038M14987 = c4884.m14987();
        try {
            c16070M41216.m36771(c22038M14987);
            c22038M14987.close();
            if (c16070M41216.size() > 2147483639) {
                throw new IOException(String.format("Cannot read more than %,d into a byte array", 2147483639));
            }
            return c16070M41216.mo32557();
        } catch (Throwable th) {
            try {
                c22038M14987.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m15487(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        m15493(i, i2, bArr);
        int i3 = i2;
        while (i3 > 0) {
            int i4 = inputStream.read(bArr, (i2 - i3) + i, i3);
            if (-1 == i4) {
                break;
            }
            i3 -= i4;
        }
        return i2 - i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m15498(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        int iM15487 = m15487(inputStream, bArr, 0, length);
        if (iM15487 != length) {
            throw new EOFException(C6934.m19217("Length to read: ", length, iM15487, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m15488(long j, InputStream inputStream) {
        C2384 c2384M8086 = C2384.m8086();
        try {
            C17359.requireNonNull(c2384M8086);
            if (j >= 0) {
                long j2 = j;
                while (j2 > 0) {
                    byte[] bArrM8087 = c2384M8086.m8087();
                    long j3 = inputStream.read(bArrM8087, 0, (int) Math.min(j2, bArrM8087.length));
                    if (j3 < 0) {
                        break;
                    }
                    j2 -= j3;
                }
                long j4 = j - j2;
                c2384M8086.close();
                return j4;
            }
            throw new IllegalArgumentException("Skip count must be non-negative, actual: " + j);
        } catch (Throwable th) {
            if (c2384M8086 != null) {
                try {
                    c2384M8086.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m15502(long j, InputStream inputStream) throws EOFException {
        long jM15488 = m15488(j, inputStream);
        if (jM15488 == j) {
            return;
        }
        StringBuilder sbM8289 = C2458.m8289("Bytes to skip: ", " actual: ", j);
        sbM8289.append(jM15488);
        throw new EOFException(sbM8289.toString());
    }

    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m15501(InputStream inputStream, int i) throws IOException {
        C17359.requireNonNull(inputStream, "input");
        if (i < 0) {
            throw new IllegalArgumentException(String.format("size < 0, size = %,d", Integer.valueOf(i)));
        }
        if (i != 0) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = inputStream.read(bArr, i2, i - i2);
                if (i3 == -1) {
                    break;
                }
                i2 += i3;
            }
            if (i2 == i) {
                return bArr;
            }
            throw new EOFException(String.format("Expected read size: %,d, actual: %,d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
        return f17846;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m15490(InputStream inputStream, Charset charset) {
        C16816 c16816 = new C16816();
        m15497(inputStream, c16816, charset);
        return c16816.toString();
    }
}
