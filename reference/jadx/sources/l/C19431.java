package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵ۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: U2R9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19431 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44468(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C9023.m23359(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m44470(InputStream inputStream, int i) throws IOException {
        try {
            if (i <= 0) {
                i = 32;
            }
            C19551 c19551 = new C19551(i);
            C20010.m45301(inputStream, c19551);
            byte[] bArr = c19551.f62829;
            int length = bArr.length;
            int i2 = c19551.f62830;
            if (length == i2) {
                if (inputStream != null) {
                    inputStream.close();
                }
                return bArr;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            if (inputStream != null) {
                inputStream.close();
            }
            return bArrCopyOf;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m44469(long j, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        C20010.m45306(inputStream, bArr, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iM36336 = C15157.m36336(52, bArr);
        C19551 c19551 = new C19551(iM36336 + 208);
        c19551.write(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iMin = (int) (Math.min(iM36336 + 4, j) - ((long) UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        byte[] bArr2 = new byte[4096];
        while (iMin > 0) {
            int i = inputStream.read(bArr2, 0, Math.min(4096, iMin));
            if (i == -1) {
                throw new EOFException();
            }
            c19551.write(bArr2, 0, i);
            iMin -= i;
        }
        int iM36337 = C15157.m36336(c19551.f62830 - 4, c19551.f62829) * 12;
        while (iM36337 > 0) {
            int i2 = inputStream.read(bArr2, 0, Math.min(4096, iM36337));
            if (i2 == -1) {
                throw new EOFException();
            }
            c19551.write(bArr2, 0, i2);
            iM36337 -= i2;
        }
        byte[] bArr3 = c19551.f62829;
        int length = bArr3.length;
        int i3 = c19551.f62830;
        if (length == i3) {
            return bArr3;
        }
        C7000.m18807(bArr3.length, 0, i3);
        byte[] bArr4 = i3 == 0 ? C8574.f29651 : new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        return bArr4;
    }
}
