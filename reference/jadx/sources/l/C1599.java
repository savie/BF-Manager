package l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.֫֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1599 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m5611(AbstractC22044 abstractC22044, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamMo4290;
        InputStream inputStream = null;
        if (!abstractC22044.mo4304()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            inputStreamMo4290 = abstractC22044.mo4290();
            while (true) {
                try {
                    int i = inputStreamMo4290.read(bArr, 0, 1024);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        String strM36182 = C15022.m36182(messageDigest.digest());
                        C20244.m46520(inputStreamMo4290);
                        return strM36182;
                    }
                } catch (Exception unused) {
                    C20244.m46520(inputStreamMo4290);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamMo4290;
                    C20244.m46520(inputStream);
                    throw th;
                }
            }
        } catch (Exception unused2) {
            inputStreamMo4290 = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m5612(File file) throws Throwable {
        FileInputStream fileInputStream;
        try {
            int i = C0147.f1116;
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrM46522 = C20244.m46522(fileInputStream, 0);
                C5125.m15494((Closeable) fileInputStream);
                return bArrM46522;
            } catch (Throwable th) {
                th = th;
                C5125.m15494((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
