package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.᩷۬ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 01TM */
/* JADX INFO: loaded from: classes5.dex */
public final class C20894 extends C10336 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47003(int i, byte[] bArr, int i2, int i3) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        long value = crc32.getValue();
        for (int i4 = 0; i4 < 4; i4++) {
            if (((byte) (value >>> (i4 * 8))) != bArr[i3 + i4]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C20189 m47004(byte[] bArr) throws C6782, C19838, C15250 {
        for (int i = 0; i < 6; i++) {
            if (bArr[i] != C23011.f74786[i]) {
                throw new C15250("Input is not in the XZ format");
            }
        }
        if (!m47003(6, bArr, 2, 8)) {
            throw new C19838("XZ Stream Header is corrupt");
        }
        try {
            return m47001(6, bArr);
        } catch (C6782 unused) {
            throw new C6782("Unsupported options in XZ Stream Header");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20189 m47002(byte[] bArr) throws C6782, C19838 {
        byte b = bArr[10];
        byte[] bArr2 = C23011.f74785;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new C19838("XZ Stream Footer is corrupt");
        }
        if (!m47003(4, bArr, 6, 0)) {
            throw new C19838("XZ Stream Footer is corrupt");
        }
        try {
            C20189 c20189M47001 = m47001(8, bArr);
            c20189M47001.f65534 = 0L;
            for (int i = 0; i < 4; i++) {
                c20189M47001.f65534 |= (long) ((bArr[i + 4] & 255) << (i * 8));
            }
            c20189M47001.f65534 = (c20189M47001.f65534 + 1) * 4;
            return c20189M47001;
        } catch (C6782 unused) {
            throw new C6782("Unsupported options in XZ Stream Footer");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20189 m47001(int i, byte[] bArr) throws C6782 {
        if (bArr[i] == 0) {
            byte b = bArr[i + 1];
            if ((b & 255) < 16) {
                C20189 c20189 = new C20189();
                c20189.f65535 = b;
                return c20189;
            }
        }
        throw new C6782();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m47000(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        long j = i & 127;
        int i2 = 0;
        while ((i & 128) != 0) {
            i2++;
            if (i2 >= 9) {
                throw new C19838();
            }
            i = inputStream.read();
            if (i == -1) {
                throw new EOFException();
            }
            if (i == 0) {
                throw new C19838();
            }
            j |= ((long) (i & 127)) << (i2 * 7);
        }
        return j;
    }
}
