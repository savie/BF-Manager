package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.᩺ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17L3 */
/* JADX INFO: loaded from: classes.dex */
public final class C24182 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final byte[] f78320 = {74, 77, 1, 0};

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54156(InterfaceC24329 interfaceC24329) throws IOException {
        InputStream inputStreamNewInputStream = C3445.newInputStream(interfaceC24329, new InterfaceC12394[0]);
        try {
            byte[] bArrM15501 = C5125.m15501(inputStreamNewInputStream, 4);
            if (bArrM15501.length != 4) {
                throw new IOException("Invalid JMOD file: " + interfaceC24329);
            }
            byte b = bArrM15501[0];
            byte[] bArr = f78320;
            if (b != bArr[0] || bArrM15501[1] != bArr[1]) {
                throw new IOException("Invalid JMOD file: " + interfaceC24329.toString());
            }
            byte b2 = bArrM15501[2];
            if (b2 > 1 || (b2 == 1 && bArrM15501[3] > 0)) {
                throw new IOException("Unsupported jmod version: " + ((int) bArrM15501[2]) + "." + ((int) bArrM15501[3]) + " in " + interfaceC24329.toString());
            }
            inputStreamNewInputStream.close();
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
