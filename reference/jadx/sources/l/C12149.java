package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۨۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P9RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C12149 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m30355(String str) {
        InputStream resourceAsStream = C12149.class.getResourceAsStream(str);
        try {
            if (C6929.m19208(0, C5125.m15501(resourceAsStream, 4)) != -1201511941) {
                throw new IOException("Bad magic");
            }
            byte[] bArrM46522 = C20244.m46522(resourceAsStream, 0);
            for (int i = 0; i < bArrM46522.length; i++) {
                bArrM46522[i] = (byte) (bArrM46522[i] ^ (bArrM46522.length / 2));
            }
            resourceAsStream.close();
            return bArrM46522;
        } catch (Throwable th) {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
