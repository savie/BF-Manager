package l;

import java.io.IOException;
import java.util.zip.CRC32;

/* JADX INFO: renamed from: l.ۙۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6UY */
/* JADX INFO: loaded from: classes2.dex */
public final class C4451 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f15844 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final int[] f15845;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12408(C11018 c11018, int i, long j, int i2, int i3) {
        if (i2 < 0 || i2 > 1048576 || j <= 0 || i < 1 || i > 6) {
            throw new IOException("Invalid recovery record");
        }
        int position = (int) c11018.getPosition();
        c11018.writeInt(1380266573);
        c11018.writeInt(i);
        c11018.writeInt(i2);
        c11018.writeInt(i3);
        c11018.m27791(j);
        c11018.writeInt(m12404(position, c11018.m27788()));
        c11018.writeInt(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3370 m12407(C17367 c17367) {
        if (c17367.available() < 32) {
            throw new IOException("Truncated recovery header");
        }
        int iM40445 = c17367.m40445();
        if (c17367.readInt() != 1380266573) {
            throw new IOException("Invalid recovery record magic");
        }
        int i = c17367.readInt();
        int i2 = c17367.readInt();
        int i3 = c17367.readInt();
        long j = c17367.readLong();
        int i4 = c17367.readInt();
        if (i < 1 || i > 6 || i2 < 0 || i2 > 1048576 || j <= 0 || i4 != m12404(iM40445, c17367.f55260) || c17367.readInt() != 0) {
            throw new IOException("Invalid recovery record header");
        }
        return new C3370(i, i2, i3, j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12404(int i, byte[] bArr) {
        int i2 = i + 24;
        int i3 = -1;
        while (i < i2) {
            i3 = f15845[(i3 ^ bArr[i]) & 255] ^ (i3 >>> 8);
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
        f15845 = iArr;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12409(C11018 c11018, long j, int i) {
        if (j < 0 || i < 0 || i > 1048576) {
            throw new IOException("Invalid recovery footer");
        }
        c11018.writeInt(1178939981);
        c11018.writeInt(i + 48);
        c11018.m27791(j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12405(long j, byte[] bArr) throws IOException {
        if (bArr.length != 16) {
            throw new IOException("Truncated recovery footer");
        }
        return m12406(new C17367(bArr), j);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m12406(C17367 c17367, long j) throws IOException {
        if (c17367.available() < 16) {
            throw new IOException("Truncated recovery footer");
        }
        int i = c17367.readInt();
        int i2 = c17367.readInt();
        long j2 = c17367.readLong();
        if (i == 1178939981 && i2 >= 48 && i2 <= 1048624 && j2 >= 0) {
            long j3 = i2;
            if (j >= j3 && j2 == j - j3) {
                return j2;
            }
        }
        throw new IOException("Invalid recovery record footer");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12403(int i, int i2, byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr, i, i2);
        return (int) crc32.getValue();
    }
}
