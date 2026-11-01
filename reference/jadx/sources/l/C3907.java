package l;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: l.ۘۧ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 22T0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3907 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m11362(AbstractC20745 abstractC20745, String str) throws Throwable {
        Throwable th;
        InputStream inputStreamMo33970;
        InputStream inputStream = null;
        if (!abstractC20745.mo33971()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            inputStreamMo33970 = abstractC20745.mo33970();
            while (true) {
                try {
                    int i = inputStreamMo33970.read(bArr, 0, 1024);
                    if (i != -1) {
                        messageDigest.update(bArr, 0, i);
                    } else {
                        String strM49424 = C22253.m49424(messageDigest.digest());
                        C19431.m44468(inputStreamMo33970);
                        return strM49424;
                    }
                } catch (Exception unused) {
                    C19431.m44468(inputStreamMo33970);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamMo33970;
                    C19431.m44468(inputStream);
                    throw th;
                }
            }
        } catch (Exception unused2) {
            inputStreamMo33970 = null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m11363(File file) {
        FileInputStream fileInputStream;
        try {
            int i = C15071.f49127;
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArrM44470 = C19431.m44470(fileInputStream, 0);
                C20010.m45299((Closeable) fileInputStream);
                return bArrM44470;
            } catch (Throwable th) {
                th = th;
                C20010.m45299((Closeable) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
