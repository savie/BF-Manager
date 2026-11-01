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
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩶ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M4LF */
/* JADX INFO: loaded from: classes4.dex */
public final class C20010 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C15777 f64053;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f64054;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final byte[] f64055;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final C20715 f64056;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m45298(InputStream inputStream) {
        Charset charsetDefaultCharset = StandardCharsets.UTF_8;
        int i = C22832.f74282;
        if (charsetDefaultCharset == null) {
            charsetDefaultCharset = Charset.defaultCharset();
        }
        return (List) C18701.lines(new BufferedReader(new InputStreamReader(inputStream, charsetDefaultCharset))).collect(C1890.toList());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.᩷ۜ᩵] */
    /* JADX WARN: Type inference failed for: r1v2, types: [l.ܺۜ᩵] */
    static {
        char c = File.separatorChar;
        f64054 = new byte[0];
        System.lineSeparator();
        EnumC0253.LF.getString();
        EnumC0253.CRLF.getString();
        final C19304 c19304 = new C19304();
        f64056 = new ThreadLocal() { // from class: l.᩷ۜ᩵
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c19304.getClass();
                return new byte[8192];
            }
        };
        f64055 = new byte[8192];
        final C8721 c8721 = new C8721(0);
        f64053 = new ThreadLocal() { // from class: l.ܺۜ᩵
            @Override // java.lang.ThreadLocal
            public final Object initialValue() {
                c8721.getClass();
                return new char[8192];
            }
        };
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45296(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        C13638.requireNonNull(inputStream, "inputStream");
        C13638.requireNonNull(outputStream, "outputStream");
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
    public static void m45299(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m45303(InputStream inputStream, InputStream inputStream2) {
        if (inputStream == inputStream2) {
            return true;
        }
        return C5898.m16136(Channels.newChannel(inputStream), Channels.newChannel(inputStream2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45302(InputStream inputStream, Writer writer, Charset charset) throws IOException {
        int i = C22832.f74282;
        if (charset == null) {
            charset = Charset.defaultCharset();
        }
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        char[] cArr = (char[]) f64053.get();
        Arrays.fill(cArr, (char) 0);
        while (true) {
            int i2 = inputStreamReader.read(cArr);
            if (-1 == i2) {
                return;
            } else {
                writer.write(cArr, 0, i2);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45301(InputStream inputStream, OutputStream outputStream) throws IOException {
        m45296(inputStream, outputStream, 8192);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m45304() {
        byte[] bArr = f64055;
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45300(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream, long j) throws IOException {
        byte[] bArr = (byte[]) f64056.get();
        Arrays.fill(bArr, (byte) 0);
        long j2 = 0;
        if (j == 0) {
            return;
        }
        int length = bArr.length;
        int iMin = (j <= 0 || j >= ((long) length)) ? length : (int) j;
        while (iMin > 0) {
            int i = inputStream.read(bArr, 0, iMin);
            if (-1 == i) {
                return;
            }
            byteArrayOutputStream.write(bArr, 0, i);
            j2 += (long) i;
            if (j > 0) {
                iMin = (int) Math.min(j - j2, length);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m45293(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i == 0) {
            return 0;
        }
        C13638.requireNonNull(inputStream);
        if (i < 0) {
            throw new IllegalArgumentException(C8479.m22141(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i - i2, i2);
            if (-1 == i3) {
                break;
            }
            i2 -= i3;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m45306(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iM45293 = m45293(inputStream, bArr, i);
        if (iM45293 != i) {
            throw new EOFException(C2271.m6967("Length to read: ", i, iM45293, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45294(long j, InputStream inputStream) {
        return m45295(inputStream, j, new C10132());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m45295(InputStream inputStream, long j, Supplier supplier) {
        if (j < 0) {
            throw new IllegalArgumentException(C15489.m37074(j, "Skip count must be non-negative, actual: "));
        }
        long j2 = j;
        while (j2 > 0) {
            byte[] bArr = (byte[]) supplier.get();
            long j3 = inputStream.read(bArr, 0, (int) Math.min(j2, bArr.length));
            if (j3 < 0) {
                break;
            }
            j2 -= j3;
        }
        return j - j2;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m45305(long j, InputStream inputStream) throws EOFException {
        long jM45295 = m45295(inputStream, j, new C10132());
        if (jM45295 == j) {
            return;
        }
        StringBuilder sbM39970 = C17114.m39970("Bytes to skip: ", " actual: ", j);
        sbM39970.append(jM45295);
        throw new EOFException(sbM39970.toString());
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static byte[] m45307(InputStream inputStream) {
        int i = C22374.f73051;
        new C5440();
        C22374 c22374M15040 = C5440.m15040();
        C2617 c2617 = new C2617(new C8015(0), new C3078(7, c22374M15040));
        try {
            m45301(inputStream, c2617);
            byte[] bArrMo35530 = c22374M15040.mo35530();
            c2617.close();
            return bArrMo35530;
        } catch (Throwable th) {
            try {
                c2617.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m45297(InputStream inputStream, Charset charset) throws IOException {
        C11791 c11791 = new C11791();
        m45302(inputStream, c11791, charset);
        return c11791.toString();
    }
}
