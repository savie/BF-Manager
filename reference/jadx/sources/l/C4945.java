package l;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۙܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C4945 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13588 m15150(AbstractC22044 abstractC22044, long j, int i) {
        InputStream inputStreamMo4290 = abstractC22044.mo4290();
        try {
            C13588 c13588M15149 = m15149(inputStreamMo4290, j, i, C15022.m36183());
            inputStreamMo4290.close();
            return c13588M15149;
        } catch (Throwable th) {
            if (inputStreamMo4290 != null) {
                try {
                    inputStreamMo4290.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x006b A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13588 m15149(InputStream inputStream, long j, int i, MessageDigest messageDigest) throws C10186, IOException {
        long jMax;
        long jMin;
        long j2 = j;
        long jM18217 = C6437.m18217("byteOffset", j2, i);
        byte[] bArr = new byte[65536];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        long j3 = 0;
        int i3 = 0;
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == 0) {
                int i5 = inputStream.read();
                if (i5 < 0) {
                    break;
                }
                bArr[i2] = (byte) i5;
                i4 = 1;
                long jM18218 = C6437.m18217("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM18218, jM18217);
                if (jMax < jMin) {
                    int i6 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i6);
                    i3 += i6;
                }
                i2 = 0;
                j2 = j;
                j3 = jM18218;
            } else {
                if (i4 < 0) {
                    break;
                }
                long jM18219 = C6437.m18217("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM18219, jM18217);
                if (jMax < jMin) {
                    int i7 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i7);
                    i3 += i7;
                }
                i2 = 0;
                j2 = j;
                j3 = jM18219;
            }
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr2, i2, bArr3, i2, i3);
        return new C13588(j, j3, C15022.m36182(messageDigest.digest()).substring(i2, 16), bArr3);
    }
}
