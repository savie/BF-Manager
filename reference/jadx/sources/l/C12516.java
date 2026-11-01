package l;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Properties;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.۫ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12516 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C22518 f41884 = new C22518();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m31080(File file) throws Throwable {
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "r");
            try {
                byte[] bArrM31082 = m31082(randomAccessFile2);
                if (bArrM31082 != null) {
                    C16749 c16749 = new C16749();
                    Properties properties = new Properties();
                    c16749.f53627 = properties;
                    c16749.m39304(bArrM31082);
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
    public static byte[] m31082(RandomAccessFile randomAccessFile) throws IOException {
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
                int iM50032 = new C22518(bArr2).m50032();
                if (iM50032 == 0) {
                    return null;
                }
                byte[] bArr3 = new byte[iM50032];
                randomAccessFile.read(bArr3);
                return bArr3;
            }
        }
        throw new ZipException("archive is not a ZIP archive");
    }
}
