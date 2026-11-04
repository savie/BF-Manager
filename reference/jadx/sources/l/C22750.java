package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.᩸ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C22750 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C6342 f73821 = new C6342();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m51288(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrM51290 = m51290(randomAccessFile2);
                if (bArrM51290 != null) {
                    C10815 c10815 = new C10815();
                    Properties properties = new Properties();
                    c10815.f34299 = properties;
                    c10815.m27552(bArrM51290);
                    String property = properties.getProperty("channelNo");
                    randomAccessFile2.close();
                    return property;
                }
                randomAccessFile2.close();
                return null;
            } catch (Throwable th) {
                th = th;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m51290(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] bArr = {(byte) 80, (byte) 75, (byte) 5, (byte) 6};
        int i = randomAccessFile.read();
        while (i != -1) {
            if (i != bArr[0] || randomAccessFile.read() != bArr[1] || randomAccessFile.read() != bArr[2] || randomAccessFile.read() != bArr[3]) {
                length--;
                randomAccessFile.seek(length);
                i = randomAccessFile.read();
            } else {
                randomAccessFile.seek(length + 20);
                byte[] bArr2 = new byte[2];
                randomAccessFile.readFully(bArr2);
                int iM18069 = new C6342(bArr2).m18069();
                if (iM18069 == 0) {
                    return null;
                }
                byte[] bArr3 = new byte[iM18069];
                randomAccessFile.read(bArr3);
                return bArr3;
            }
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
