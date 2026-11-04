package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.᩵֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: U2R9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20244 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m46520(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                C20196.m46453(autoCloseable);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m46522(InputStream inputStream, int i) throws IOException {
        try {
            if (i <= 0) {
                i = 32;
            }
            C9982 c9982 = new C9982(i);
            C5125.m15496(inputStream, c9982);
            byte[] bArr = c9982.f32079;
            int length = bArr.length;
            int i2 = c9982.f32081;
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
    public static byte[] m46521(long j, InputStream inputStream) throws IOException {
        byte[] bArr = new byte[UMErrorCode.E_UM_BE_DEFLATE_FAILED];
        C5125.m15498(inputStream, bArr);
        int iM19208 = C6929.m19208(52, bArr);
        C9982 c9982 = new C9982(iM19208 + 208);
        c9982.write(bArr, 0, UMErrorCode.E_UM_BE_DEFLATE_FAILED);
        int iMin = (int) (Math.min(iM19208 + 4, j) - ((long) UMErrorCode.E_UM_BE_DEFLATE_FAILED));
        byte[] bArr2 = new byte[4096];
        while (iMin > 0) {
            int i = inputStream.read(bArr2, 0, Math.min(4096, iMin));
            if (i == -1) {
                throw new EOFException();
            }
            c9982.write(bArr2, 0, i);
            iMin -= i;
        }
        int iM19209 = C6929.m19208(c9982.f32081 - 4, c9982.f32079) * 12;
        while (iM19209 > 0) {
            int i2 = inputStream.read(bArr2, 0, Math.min(4096, iM19209));
            if (i2 == -1) {
                throw new EOFException();
            }
            c9982.write(bArr2, 0, i2);
            iM19209 -= i2;
        }
        byte[] bArr3 = c9982.f32079;
        int length = bArr3.length;
        int i3 = c9982.f32081;
        if (length == i3) {
            return bArr3;
        }
        C18450.m42990(bArr3.length, 0, i3);
        byte[] bArr4 = i3 == 0 ? C9498.f30777 : new byte[i3];
        System.arraycopy(bArr3, 0, bArr4, 0, i3);
        return bArr4;
    }
}
