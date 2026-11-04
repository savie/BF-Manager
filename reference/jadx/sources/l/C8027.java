package l;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۟ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8027 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f26643;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C8005 f26644 = new C8005();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Unsafe f26645;

    static {
        Unsafe unsafe = C5746.f19778;
        f26645 = unsafe;
        try {
            f26643 = unsafe.objectFieldOffset(C8005.class.getDeclaredField("ۙ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m21893() {
        f26645.putOrderedInt(f26644, f26643, 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21892() {
        f26645.putIntVolatile(f26644, f26643, 0);
    }
}
