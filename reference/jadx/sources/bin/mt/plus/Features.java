package bin.mt.plus;

import l.C13688;
import l.C2492;
import l.ConcurrentMapC13783;

/* JADX INFO: loaded from: classes.dex */
public class Features {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static ConcurrentMapC13783 f25 = new ConcurrentMapC13783();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean f26;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f27;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean f28;

    public static native Object[] analyze(byte[] bArr);

    public static native boolean deleteFile(String str);

    public static native String getABI();

    public static native String uid2name(int i);

    static {
        System.loadLibrary("mt1");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m56(int i) {
        String str = (String) C2492.computeIfAbsent(f25, Integer.valueOf(i), new C13688(0));
        if (str != null && i >= 20000 && !f28 && i < 30000) {
            f28 = true;
        }
        if (str != null && i >= 30000 && !f26 && i < 40000) {
            f26 = true;
        }
        if (str != null && i >= 99910000 && !f27 && i < 99920000) {
            f27 = true;
        }
        return str;
    }
}
