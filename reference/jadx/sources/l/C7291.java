package l;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.۟ۛ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: P9RB */
/* JADX INFO: loaded from: classes3.dex */
public final class C7291 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m19433(String str) {
        InputStream resourceAsStream = C7291.class.getResourceAsStream(str);
        try {
            byte[] bArr = new byte[4];
            C20010.m45306(resourceAsStream, bArr, 4);
            if (C15157.m36336(0, bArr) != -1201511941) {
                throw new IOException("Bad magic");
            }
            byte[] bArrM44470 = C19431.m44470(resourceAsStream, 0);
            for (int i = 0; i < bArrM44470.length; i++) {
                bArrM44470[i] = (byte) (bArrM44470[i] ^ (bArrM44470.length / 2));
            }
            if (resourceAsStream != null) {
                resourceAsStream.close();
            }
            return bArrM44470;
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
