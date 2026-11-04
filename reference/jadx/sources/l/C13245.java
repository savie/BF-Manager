package l;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۫ܽܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: O7SL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13245 extends AbstractC11007 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final long f42320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final long f42321;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final long f42322;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final long f42323;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Unsafe f42324;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long f42325;

    static {
        Unsafe unsafeM32803;
        try {
            try {
                unsafeM32803 = Unsafe.getUnsafe();
            } catch (Exception e) {
                throw new RuntimeException("Could not initialize intrinsics", e);
            }
        } catch (SecurityException unused) {
            try {
                unsafeM32803 = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new C15482());
            } catch (Exception unused2) {
                unsafeM32803 = m32803();
                Unsafe unsafe = unsafeM32803;
            }
        }
        try {
            f42325 = unsafeM32803.objectFieldOffset(AbstractC2059.class.getDeclaredField("ܿ"));
            f42320 = unsafeM32803.objectFieldOffset(AbstractC2059.class.getDeclaredField("ܰ"));
            f42321 = unsafeM32803.objectFieldOffset(AbstractC2059.class.getDeclaredField("᩶"));
            f42322 = unsafeM32803.objectFieldOffset(C5788.class.getDeclaredField("᩷"));
            f42323 = unsafeM32803.objectFieldOffset(C5788.class.getDeclaredField("ۙ"));
            f42324 = unsafeM32803;
        } catch (NoSuchFieldException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ Unsafe m32803() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final void mo27856(C5788 c5788, Thread thread) {
        f42324.putObject(c5788, f42322, thread);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final void mo27857(C5788 c5788, C5788 c5789) {
        f42324.putObject(c5788, f42323, c5789);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27859(AbstractC2059 abstractC2059, C5788 c5788, C5788 c5789) {
        return C19958.m45882(f42324, abstractC2059, f42325, c5788, c5789);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27860(AbstractC2059 abstractC2059, C7257 c7257, C7257 c7258) {
        return C19958.m45882(f42324, abstractC2059, f42320, c7257, c7258);
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final C7257 mo27855(AbstractC2059 abstractC2059, C7257 c7257) {
        C7257 c7258;
        do {
            c7258 = abstractC2059.f6855;
            if (c7257 == c7258) {
                break;
            }
        } while (!mo27860(abstractC2059, c7258, c7257));
        return c7258;
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final C5788 mo27854(AbstractC2059 abstractC2059, C5788 c5788) {
        C5788 c5789;
        do {
            c5789 = abstractC2059.f6856;
            if (c5788 == c5789) {
                break;
            }
        } while (!mo27859(abstractC2059, c5789, c5788));
        return c5789;
    }

    @Override // l.AbstractC11007
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo27858(AbstractC2059 abstractC2059, Object obj, Object obj2) {
        return C19958.m45882(f42324, abstractC2059, f42321, obj, obj2);
    }
}
