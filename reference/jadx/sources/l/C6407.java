package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۜ֡۟, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6407 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f21726 = {74, 77, 1, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17552(InterfaceC3800 interfaceC3800) throws IOException {
        InputStream inputStreamNewInputStream = C5212.newInputStream(interfaceC3800, new InterfaceC0978[0]);
        try {
            byte[] bArr = new byte[4];
            C20010.m45306(inputStreamNewInputStream, bArr, 4);
            byte b = bArr[0];
            byte[] bArr2 = f21726;
            if (b != bArr2[0] || bArr[1] != bArr2[1]) {
                throw new IOException("Invalid JMOD file: " + interfaceC3800.toString());
            }
            byte b2 = bArr[2];
            if (b2 <= 1 && (b2 != 1 || bArr[3] <= 0)) {
                if (inputStreamNewInputStream != null) {
                    inputStreamNewInputStream.close();
                }
            } else {
                throw new IOException("Unsupported jmod version: " + ((int) bArr[2]) + "." + ((int) bArr[3]) + " in " + interfaceC3800.toString());
            }
        } catch (Throwable th) {
            if (inputStreamNewInputStream != null) {
                try {
                    inputStreamNewInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
