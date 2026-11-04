package l;

import com.google.android.material.motion.MotionUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: l.ܽܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: P5EC */
/* JADX INFO: loaded from: classes4.dex */
public final class C17719 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Calendar f58227 = Calendar.getInstance();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f58226 = false;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m41494(long j) {
        long time;
        Calendar calendar = f58227;
        synchronized (calendar) {
            calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
            calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
            calendar.set(5, ((int) (j >> 16)) & 31);
            calendar.set(11, ((int) (j >> 11)) & 31);
            calendar.set(12, ((int) (j >> 5)) & 63);
            calendar.set(13, ((int) (j << 1)) & 62);
            time = calendar.getTime().getTime();
        }
        return time;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m41497(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        int i = calendar.get(1);
        if (i < 1980) {
            return 2162688L;
        }
        return ((long) ((calendar.get(2) + 1) << 21)) | ((((long) i) - 1980) << 25) | ((long) (calendar.get(5) << 16)) | ((long) (calendar.get(11) << 11)) | ((long) (calendar.get(12) << 5)) | ((long) (calendar.get(13) >> 1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41495(long j, int i, byte[] bArr) {
        if (i + 8 > bArr.length) {
            throw new EOFException();
        }
        C6929.m19211(j, i, bArr);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41493(InputStream inputStream, byte[] bArr, int i) throws IOException {
        if (i < 0) {
            throw new IllegalArgumentException(C13645.m33382(i, "Length must not be negative: "));
        }
        int i2 = i;
        while (i2 > 0) {
            int i3 = inputStream.read(bArr, i - i2, i2);
            if (i3 == -1) {
                break;
            }
            i2 -= i3;
        }
        return i - i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m41498(InputStream inputStream, byte[] bArr, int i) throws IOException {
        int iM41493 = m41493(inputStream, bArr, i);
        if (iM41493 != i) {
            throw new EOFException(C6934.m19217("Length to read: ", i, iM41493, " actual: "));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m41492(int i) throws IOException {
        if (i == 1) {
            return 8;
        }
        if (i == 2) {
            return 12;
        }
        if (i == 3) {
            return 16;
        }
        throw new IOException("unable to determine salt length: invalid aes key strength");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41496(IOException iOException, C8002 c8002) throws ZipException {
        ZipException zipException = new ZipException("Error: " + iOException.getMessage() + " (" + c8002.getName() + MotionUtils.EASING_TYPE_FORMAT_END);
        zipException.initCause(iOException);
        throw zipException;
    }
}
