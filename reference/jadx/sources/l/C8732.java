package l;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۠ܶ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 01TM */
/* JADX INFO: loaded from: classes4.dex */
public final class C8732 extends C5224 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23415(int i, byte[] bArr, int i2, int i3) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13952 m23416(byte[] bArr) throws C21412, C13996, C4258 {
        for (int i = 0; i < 6; i++) {
            if (bArr[i] != C14698.f48037[i]) {
                throw new C21412("Input is not in the XZ format");
            }
        }
        if (!m23415(6, bArr, 2, 8)) {
            throw new C13996("XZ Stream Header is corrupt");
        }
        try {
            return m23413(6, bArr);
        } catch (C4258 unused) {
            throw new C4258("Unsupported options in XZ Stream Header");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13952 m23414(byte[] bArr) throws C13996, C4258 {
        byte b = bArr[10];
        byte[] bArr2 = C14698.f48036;
        if (b != bArr2[0] || bArr[11] != bArr2[1]) {
            throw new C13996("XZ Stream Footer is corrupt");
        }
        if (!m23415(4, bArr, 6, 0)) {
            throw new C13996("XZ Stream Footer is corrupt");
        }
        try {
            C13952 c13952M23413 = m23413(8, bArr);
            c13952M23413.f44254 = 0L;
            for (int i = 0; i < 4; i++) {
                c13952M23413.f44254 |= (long) ((bArr[i + 4] & 255) << (i * 8));
            }
            c13952M23413.f44254 = (c13952M23413.f44254 + 1) * 4;
            return c13952M23413;
        } catch (C4258 unused) {
            throw new C4258("Unsupported options in XZ Stream Footer");
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13952 m23413(int i, byte[] bArr) throws C4258 {
        if (bArr[i] == 0) {
            byte b = bArr[i + 1];
            if ((b & 255) < 16) {
                C13952 c13952 = new C13952();
                c13952.f44255 = b;
                return c13952;
            }
        }
        throw new C4258();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m23412(InputStream inputStream) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            throw new EOFException();
        }
        long j = i & 127;
        int i2 = 0;
        while ((i & 128) != 0) {
            i2++;
            if (i2 >= 9) {
                throw new C13996();
            }
            i = inputStream.read();
            if (i == -1) {
                throw new EOFException();
            }
            if (i == 0) {
                throw new C13996();
            }
            j |= ((long) (i & 127)) << (i2 * 7);
        }
        return j;
    }
}
