package l;

import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.۫֨᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6UY */
/* JADX INFO: loaded from: classes4.dex */
public final class C12768 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f40863 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final int[] f40864;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31654(C6178 c6178, int i, long j, int i2, int i3) {
        if (i2 < 0 || i2 > 1048576 || j <= 0 || i < 1 || i > 6) {
            throw new IOException("Invalid recovery record");
        }
        int position = (int) c6178.getPosition();
        c6178.writeInt(1380266573);
        c6178.writeInt(i);
        c6178.writeInt(i2);
        c6178.writeInt(i3);
        c6178.m17803(j);
        c6178.writeInt(m31650(position, c6178.m17808()));
        c6178.writeInt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15005 m31653(C20348 c20348) {
        if (c20348.available() < 32) {
            throw new IOException("Truncated recovery header");
        }
        int iM46744 = c20348.m46744();
        if (c20348.readInt() != 1380266573) {
            throw new IOException("Invalid recovery record magic");
        }
        int i = c20348.readInt();
        int i2 = c20348.readInt();
        int i3 = c20348.readInt();
        long j = c20348.readLong();
        int i4 = c20348.readInt();
        if (i < 1 || i > 6 || i2 < 0 || i2 > 1048576 || j <= 0 || i4 != m31650(iM46744, c20348.f65270) || c20348.readInt() != 0) {
            throw new IOException("Invalid recovery record header");
        }
        return new C15005(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31650(int i, byte[] bArr) {
        int i2 = i + 24;
        int i3 = -1;
        while (i < i2) {
            i3 = f40864[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
            i++;
        }
        return ~i3;
    }

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            int i2 = i;
            for (int i3 = 0; i3 < 8; i3++) {
                i2 = ((i2 & 1) == 0 ? 0 : -306674912) ^ (i2 >>> 1);
            }
            iArr[i] = i2;
        }
        f40864 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31655(C6178 c6178, long j, int i) {
        if (j < 0 || i < 0 || i > 1048576) {
            throw new IOException("Invalid recovery footer");
        }
        c6178.writeInt(1178939981);
        c6178.writeInt(i + 48);
        c6178.m17803(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m31651(long j, byte[] bArr) throws IOException {
        if (bArr.length != 16) {
            throw new IOException("Truncated recovery footer");
        }
        return m31652(new C20348(bArr), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m31652(C20348 c20348, long j) throws IOException {
        if (c20348.available() < 16) {
            throw new IOException("Truncated recovery footer");
        }
        int i = c20348.readInt();
        int i2 = c20348.readInt();
        long j2 = c20348.readLong();
        if (i == 1178939981 && i2 >= 48 && i2 <= 1048624 && j2 >= 0) {
            long j3 = i2;
            if (j >= j3 && j2 == j - j3) {
                return j2;
            }
        }
        throw new IOException("Invalid recovery record footer");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m31649(int i, int i2, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        return (int) crc32.getValue();
    }
}
