package bin.mt.plus;

import l.C18980;
import l.C23217;
import l.ConcurrentMapC17249;

/* JADX INFO: loaded from: classes.dex */
public class Features {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f14;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f15;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f16;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC17249 f17 = new ConcurrentMapC17249();

    public static native Object[] analyze(byte[] bArr);

    public static native boolean deleteFile(String str);

    public static native String getABI();

    public static native String uid2name(int i);

    static {
        System.loadLibrary("mt1");
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m45(int i) {
        String str = (String) C23217.computeIfAbsent(f17, Integer.valueOf(i), new C18980(0));
        if (str != null && i >= 20000 && !f16 && i < 30000) {
            f16 = true;
        }
        if (str != null && i >= 30000 && !f14 && i < 40000) {
            f14 = true;
        }
        if (str != null && i >= 99910000 && !f15 && i < 99920000) {
            f15 = true;
        }
        return str;
    }
}
