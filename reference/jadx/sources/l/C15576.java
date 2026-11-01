package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: l.ܺ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6SP */
/* JADX INFO: loaded from: classes4.dex */
public final class C15576 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m37224(InputStream inputStream, long j, OutputStream outputStream) throws IOException {
        int iM37221;
        PushbackInputStream pushbackInputStream = new PushbackInputStream(inputStream, 2);
        int iM37222 = m37221((InputStream) pushbackInputStream);
        int iM37223 = m37221((InputStream) pushbackInputStream);
        int i = (iM37223 << 8) | iM37222;
        byte[] bArr = new byte[8192];
        if (i != 10831 && i != 10847) {
            pushbackInputStream.unread(new byte[]{(byte) iM37222, (byte) iM37223});
            m37223(pushbackInputStream, outputStream, bArr, j);
            return;
        }
        byte[] bArr2 = new byte[6];
        for (int i2 = 0; i2 < 6; i2++) {
            bArr2[i2] = (byte) m37221((InputStream) pushbackInputStream);
        }
        C17367 c17367 = new C17367(bArr2);
        int i3 = c17367.readInt();
        int iM40462 = c17367.m40462();
        if (i3 > 0) {
            long j2 = i3;
            if (j2 <= j && iM40462 == (131071 + j2) / 131072) {
                for (int i4 = 0; i4 < iM40462; i4++) {
                    if (i == 10831) {
                        iM37221 = m37221((InputStream) pushbackInputStream) | (m37221((InputStream) pushbackInputStream) << 8);
                    } else {
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            if (i5 <= 28) {
                                int iM37224 = m37221((InputStream) pushbackInputStream);
                                if (i5 == 28 && (iM37224 & 248) != 0) {
                                    throw new IOException("Legacy compression block length overflows");
                                }
                                i6 |= (iM37224 & 127) << i5;
                                if ((iM37224 & 128) == 0) {
                                    iM37221 = i6;
                                    break;
                                }
                                i5 += 7;
                            } else {
                                throw new IOException("Invalid legacy compression block length");
                            }
                        }
                    }
                    if (iM37221 <= 0) {
                        throw new IOException("Invalid legacy compression block length");
                    }
                    C20514 c20514 = new C20514(pushbackInputStream, iM37221);
                    long jMin = Math.min(131072L, j2);
                    if (m37223(c20514, outputStream, bArr, jMin) != jMin || c20514.f66488 != 0) {
                        throw new IOException("Legacy compression block does not match declared length");
                    }
                    j2 -= jMin;
                }
                if (pushbackInputStream.read() != -1) {
                    throw new IOException("Trailing bytes in legacy compression container");
                }
                return;
            }
        }
        throw new IOException("Invalid legacy compression block count or total length");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m37223(InputStream inputStream, OutputStream outputStream, byte[] bArr, long j) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new C7108(inputStream), 1024);
        long j2 = 0;
        while (true) {
            try {
                int i = gZIPInputStream.read(bArr);
                if (i == -1) {
                    gZIPInputStream.close();
                    return j2;
                }
                if (i <= 0) {
                    throw new IOException("Legacy decompression made no progress");
                }
                long j3 = i;
                if (j3 > j - j2) {
                    throw new IOException("Legacy state exceeds decompression limit");
                }
                outputStream.write(bArr, 0, i);
                j2 += j3;
            } catch (Throwable th) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m37221(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i >= 0) {
            return i;
        }
        throw new EOFException("Truncated legacy compression container");
    }
}
