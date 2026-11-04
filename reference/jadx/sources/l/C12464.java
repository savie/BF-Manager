package l;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: renamed from: l.ۨܺ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: H6IQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12464 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30956(AbstractC13057 abstractC13057, String str, C7837 c7837) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new C20669(abstractC13057.mo17428(), c7837), 16384));
        try {
            if (!"image/jpeg".equals(str)) {
                if (!"image/png".equals(str)) {
                    if (!"image/webp".equals(str)) {
                        throw new IOException("Unsupported EXIF container");
                    }
                    byte[] bArrM30958 = m30958(dataInputStream);
                    dataInputStream.close();
                    return bArrM30958;
                }
                byte[] bArrM30960 = m30960(dataInputStream);
                dataInputStream.close();
                return bArrM30960;
            }
            byte[] bArrM30954 = m30954(dataInputStream);
            dataInputStream.close();
            return bArrM30954;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30954(DataInputStream dataInputStream) throws IOException {
        int unsignedByte;
        if (dataInputStream.readUnsignedShort() != 65496) {
            throw new IOException("Invalid JPEG signature");
        }
        while (dataInputStream.readUnsignedByte() == 255) {
            do {
                unsignedByte = dataInputStream.readUnsignedByte();
            } while (unsignedByte == 255);
            if (unsignedByte == 218 || unsignedByte == 217) {
                return null;
            }
            if (unsignedByte != 1 && (unsignedByte < 208 || unsignedByte > 215)) {
                int unsignedShort = dataInputStream.readUnsignedShort();
                int i = unsignedShort - 2;
                if (i < 0) {
                    throw new IOException("Invalid JPEG segment size");
                }
                if (unsignedByte == 225 && i >= 6) {
                    byte[] bArr = new byte[6];
                    dataInputStream.readFully(bArr);
                    i = unsignedShort - 8;
                    if (bArr[0] == 69 && bArr[1] == 120 && bArr[2] == 105 && bArr[3] == 102 && bArr[4] == 0 && bArr[5] == 0) {
                        return m30955(dataInputStream, i);
                    }
                }
                m30959(dataInputStream, i);
            }
        }
        throw new IOException("Invalid JPEG marker");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static byte[] m30960(DataInputStream dataInputStream) throws IOException {
        int i;
        if (dataInputStream.readLong() != -8552249625308161526L) {
            throw new IOException("Invalid PNG signature");
        }
        do {
            long j = ((long) dataInputStream.readInt()) & 4294967295L;
            i = dataInputStream.readInt();
            if (i == 1700284774) {
                byte[] bArrM30955 = m30955(dataInputStream, j);
                CRC32 crc32 = new CRC32();
                crc32.update(new byte[]{101, 88, 73, 102});
                crc32.update(bArrM30955);
                if (crc32.getValue() == (((long) dataInputStream.readInt()) & 4294967295L)) {
                    return bArrM30955;
                }
                throw new IOException("Invalid PNG EXIF checksum");
            }
            m30959(dataInputStream, j + 4);
        } while (i != 1229278788);
        return null;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static byte[] m30958(DataInputStream dataInputStream) throws IOException {
        if (dataInputStream.readInt() != 1380533830) {
            throw new IOException("Invalid WebP signature");
        }
        long jReverseBytes = (((long) Integer.reverseBytes(dataInputStream.readInt())) & 4294967295L) - 4;
        if (dataInputStream.readInt() != 1464156752 || jReverseBytes < 0) {
            throw new IOException("Invalid WebP header");
        }
        while (jReverseBytes >= 8) {
            int i = dataInputStream.readInt();
            long jReverseBytes2 = Integer.reverseBytes(dataInputStream.readInt());
            long j = jReverseBytes2 & 4294967295L;
            long j2 = (jReverseBytes2 & 1) + j;
            if (j2 > jReverseBytes - 8) {
                throw new IOException("Invalid WebP chunk size");
            }
            if (i == 1163413830) {
                return m30955(dataInputStream, j);
            }
            m30959(dataInputStream, j2);
            jReverseBytes -= j2 + 8;
        }
        if (jReverseBytes == 0) {
            return null;
        }
        throw new IOException("Truncated WebP chunk");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30955(DataInputStream dataInputStream, long j) throws IOException {
        if (j < 8 || j > 2097152) {
            throw new IOException("Invalid EXIF block size");
        }
        byte[] bArr = new byte[(int) j];
        dataInputStream.readFully(bArr);
        return bArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30957(byte[] bArr) throws IOException {
        int i = (bArr.length >= 6 && bArr[0] == 69 && bArr[1] == 120 && bArr[2] == 105 && bArr[3] == 102 && bArr[4] == 0 && bArr[5] == 0) ? 6 : 0;
        if (bArr.length - i < 8) {
            throw new IOException("Truncated TIFF header");
        }
        byte b = bArr[i];
        boolean z = b == 73 && bArr[i + 1] == 73;
        boolean z2 = b == 77 && bArr[i + 1] == 77;
        if (!z && !z2) {
            throw new IOException("Invalid TIFF byte order");
        }
        int iM19212 = C6929.m19212(i + 2, bArr);
        long jM19208 = ((long) C6929.m19208(i + 4, bArr)) & 4294967295L;
        if (z2) {
            iM19212 = Short.reverseBytes((short) iM19212) & HPKE.aead_EXPORT_ONLY;
            jM19208 = ((long) Integer.reverseBytes((int) jM19208)) & 4294967295L;
        }
        if (iM19212 != 42 || jM19208 < 8 || jM19208 > (bArr.length - i) - 2) {
            throw new IOException("Invalid TIFF directory offset");
        }
        int iM19213 = C6929.m19212(((int) jM19208) + i, bArr);
        if (z2) {
            iM19213 = Short.reverseBytes((short) iM19213) & HPKE.aead_EXPORT_ONLY;
        }
        if (C11958.m29929(iM19213, 12L, jM19208 + 2, 4L) > bArr.length - i) {
            throw new IOException("Truncated TIFF directory");
        }
        if (i != 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[bArr.length + 6];
        bArr2[0] = 69;
        bArr2[1] = 120;
        bArr2[2] = 105;
        bArr2[3] = 102;
        System.arraycopy(bArr, 0, bArr2, 6, bArr.length);
        return bArr2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m30959(DataInputStream dataInputStream, long j) throws EOFException {
        while (j > 0) {
            long j2 = 1;
            long jSkip = j > 1 ? dataInputStream.skip(j - 1) : 0L;
            if (jSkip != 0) {
                j2 = jSkip;
            } else if (dataInputStream.read() < 0) {
                throw new EOFException("Truncated image container");
            }
            j -= j2;
        }
    }
}
