package l;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩺ۢܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes.dex */
public final class C22912 extends AbstractC22206 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final long f74481;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f74482;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final long f74483;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final long f74484;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f74485;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final long f74486;

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final C15151 mo3889(AbstractC21500 abstractC21500) {
        C15151 c15151;
        C15151 c15152 = C15151.f49492;
        do {
            c15151 = abstractC21500.f69868;
            if (c15152 == c15151) {
                break;
            }
        } while (!mo3894(abstractC21500, c15151, c15152));
        return c15151;
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e) {
                throw new RuntimeException("Could not initialize intrinsics", e.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new C6683());
        }
        try {
            f74481 = unsafe.objectFieldOffset(AbstractC21500.class.getDeclaredField("֡"));
            f74482 = unsafe.objectFieldOffset(AbstractC21500.class.getDeclaredField("ܺ"));
            f74484 = unsafe.objectFieldOffset(AbstractC21500.class.getDeclaredField("᩶"));
            f74486 = unsafe.objectFieldOffset(C15151.class.getDeclaredField("ܰ"));
            f74483 = unsafe.objectFieldOffset(C15151.class.getDeclaredField("ۙ"));
            f74485 = unsafe;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Unsafe m50691() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final void mo3890(C15151 c15151, Thread thread) {
        f74485.putObject(c15151, f74486, thread);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final void mo3891(C15151 c15151, C15151 c15152) {
        f74485.putObject(c15151, f74483, c15152);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3894(AbstractC21500 abstractC21500, C15151 c15151, C15151 c15152) {
        return C3860.m11180(f74485, abstractC21500, f74481, c15151, c15152);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3893(AbstractC21500 abstractC21500, C13740 c13740, C13740 c13741) {
        return C3860.m11180(f74485, abstractC21500, f74482, c13740, c13741);
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final C13740 mo3888(AbstractC21500 abstractC21500, C13740 c13740) {
        C13740 c13741;
        do {
            c13741 = abstractC21500.f69869;
            if (c13740 == c13741) {
                break;
            }
        } while (!mo3893(abstractC21500, c13741, c13740));
        return c13741;
    }

    @Override // l.AbstractC22206
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo3892(AbstractC21500 abstractC21500, Object obj, Object obj2) {
        return C3860.m11180(f74485, abstractC21500, f74484, obj, obj2);
    }
}
