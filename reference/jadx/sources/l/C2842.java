package l;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۖ᩺۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R6YN */
/* JADX INFO: loaded from: classes2.dex */
public final class C2842 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C12016 m8600(AbstractC20745 abstractC20745, long j, int i) {
        InputStream inputStreamMo33970 = abstractC20745.mo33970();
        try {
            C12016 c12016M8599 = m8599(inputStreamMo33970, j, i, C22253.m49425());
            inputStreamMo33970.close();
            return c12016M8599;
        } catch (Throwable th) {
            if (inputStreamMo33970 != null) {
                try {
                    inputStreamMo33970.close();
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
    public static C12016 m8599(InputStream inputStream, long j, int i, MessageDigest messageDigest) throws C12731, IOException {
        long jMax;
        long jMin;
        long j2 = j;
        long jM38377 = C16249.m38377("byteOffset", j2, i);
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
                long jM38378 = C16249.m38377("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM38378, jM38377);
                if (jMax < jMin) {
                    int i6 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i6);
                    i3 += i6;
                }
                i2 = 0;
                j2 = j;
                j3 = jM38378;
            } else {
                if (i4 < 0) {
                    break;
                }
                long jM38379 = C16249.m38377("totalBytes", j3, i4);
                messageDigest.update(bArr, i2, i4);
                jMax = Math.max(j3, j2);
                jMin = Math.min(jM38379, jM38377);
                if (jMax < jMin) {
                    int i7 = (int) (jMin - jMax);
                    System.arraycopy(bArr, (int) (jMax - j3), bArr2, i3, i7);
                    i3 += i7;
                }
                i2 = 0;
                j2 = j;
                j3 = jM38379;
            }
        }
        byte[] bArr3 = new byte[i3];
        System.arraycopy(bArr2, i2, bArr3, i2, i3);
        return new C12016(j, j3, C22253.m49424(messageDigest.digest()).substring(i2, 16), bArr3);
    }
}
