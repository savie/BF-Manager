package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۨ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11720 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f39393;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C11369 f39394 = new C11369();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f39395;

    static {
        Unsafe unsafe = C10309.f35350;
        f39395 = unsafe;
        try {
            f39393 = unsafe.objectFieldOffset(C11369.class.getDeclaredField("ۙ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m29304() {
        f39395.putOrderedInt(f39394, f39393, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29303() {
        f39395.putIntVolatile(f39394, f39393, 0);
    }
}
