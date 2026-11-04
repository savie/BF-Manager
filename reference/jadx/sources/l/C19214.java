package l;

import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ᩳܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19214 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f62138;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final int f62139;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f62140;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f62141;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f62142;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractFutureC13992[] f62143;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public volatile int f62144;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f62145;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10263 f62147;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile int f62148;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C10965 f62149;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f62151;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62146 = 4096;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public volatile int f62150 = 4096;

    public C19214(C10263 c10263, C10965 c10965) {
        this.f62147 = c10263;
        this.f62149 = c10965;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44543(AbstractFutureC13992 abstractFutureC13992) {
        int length;
        int i = this.f62146;
        AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
        if (abstractFutureC13992Arr == null || (length = abstractFutureC13992Arr.length) <= 0) {
            return;
        }
        long j = (((long) ((length - 1) & i)) << f62139) + ((long) f62141);
        C10263 c10263 = this.f62147;
        this.f62146 = i + 1;
        f62138.putOrderedObject(abstractFutureC13992Arr, j, abstractFutureC13992);
        int i2 = this.f62150 - i;
        if (i2 == 0) {
            C8027.m21892();
            c10263.m26470();
        } else if (i2 + length == 1) {
            m44541();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44541() {
        int i;
        AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
        int length = abstractFutureC13992Arr != null ? abstractFutureC13992Arr.length : 0;
        int i2 = length > 0 ? length << 1 : 8192;
        if (i2 < 8192 || i2 > 67108864) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        AbstractFutureC13992[] abstractFutureC13992Arr2 = new AbstractFutureC13992[i2];
        this.f62143 = abstractFutureC13992Arr2;
        if (abstractFutureC13992Arr == null || (i = length - 1) <= 0) {
            return;
        }
        int i3 = this.f62146;
        int i4 = this.f62150;
        if (i3 - i4 > 0) {
            int i5 = i2 - 1;
            do {
                long j = (((long) (i4 & i)) << f62139) + ((long) f62141);
                Unsafe unsafe = f62138;
                AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j);
                if (abstractFutureC13992 != null && C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13992)) {
                    abstractFutureC13992Arr2[i4 & i5] = abstractFutureC13992;
                }
                i4++;
            } while (i4 != i3);
            C8027.m21893();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractFutureC13992 m44546() {
        int i;
        int length;
        while (true) {
            int i2 = this.f62150;
            int i3 = this.f62146;
            AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
            if (abstractFutureC13992Arr == null || (i = i2 - i3) >= 0 || (length = abstractFutureC13992Arr.length) <= 0) {
                return null;
            }
            long j = (((long) ((length - 1) & i2)) << f62139) + ((long) f62141);
            Unsafe unsafe = f62138;
            AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j);
            int i4 = i2 + 1;
            if (i2 == this.f62150) {
                if (abstractFutureC13992 != null) {
                    if (C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13992)) {
                        this.f62150 = i4;
                        return abstractFutureC13992;
                    }
                } else if (i == -1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m44549(AbstractFutureC13992 abstractFutureC13992) {
        int length;
        int i = this.f62150;
        int i2 = this.f62146;
        AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
        if (abstractFutureC13992Arr == null || i == i2 || (length = abstractFutureC13992Arr.length) <= 0) {
            return false;
        }
        int i3 = i2 - 1;
        if (!C6536.m18413(f62138, abstractFutureC13992Arr, (((long) ((length - 1) & i3)) << f62139) + ((long) f62141), abstractFutureC13992)) {
            return false;
        }
        this.f62146 = i3;
        C8027.m21893();
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44547(int i) {
        int length;
        while (true) {
            int i2 = this.f62150;
            int i3 = this.f62146;
            AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
            if (abstractFutureC13992Arr == null || i2 == i3 || (length = abstractFutureC13992Arr.length) <= 0) {
                return;
            }
            int i4 = i3 - 1;
            AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) C10263.m26454((((long) ((length - 1) & i4)) << f62139) + ((long) f62141), abstractFutureC13992Arr);
            if (abstractFutureC13992 == null) {
                return;
            }
            this.f62146 = i4;
            C8027.m21893();
            abstractFutureC13992.m34093();
            if (i != 0 && (i = i - 1) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44542(int i) {
        int i2;
        int length;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f62150;
                int i5 = this.f62146;
                AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
                if (abstractFutureC13992Arr == null || (i2 = i4 - i5) >= 0 || (length = abstractFutureC13992Arr.length) <= 0) {
                    return;
                }
                int i6 = i4 + 1;
                AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) C10263.m26454((((long) (i4 & (length - 1))) << f62139) + ((long) f62141), abstractFutureC13992Arr);
                if (abstractFutureC13992 != null) {
                    this.f62150 = i6;
                    abstractFutureC13992.m34093();
                    if (i != 0 && (i3 = i3 + 1) == i) {
                        return;
                    }
                }
            }
        } while (i2 != -1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m44548(AbstractFutureC13992 abstractFutureC13992) {
        AbstractFutureC13992[] abstractFutureC13992Arr;
        int length;
        int i = this.f62150;
        int i2 = this.f62146;
        if (i - i2 >= 0 || (abstractFutureC13992Arr = this.f62143) == null || (length = abstractFutureC13992Arr.length) <= 0) {
            return;
        }
        int i3 = length - 1;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            long j = ((i5 & i3) << f62139) + f62141;
            Unsafe unsafe = f62138;
            AbstractFutureC13992 abstractFutureC13993 = (AbstractFutureC13992) unsafe.getObject(abstractFutureC13992Arr, j);
            if (abstractFutureC13993 == null) {
                return;
            }
            if (abstractFutureC13993 == abstractFutureC13992) {
                if (C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13993)) {
                    this.f62146 = i4;
                    while (i5 != i4) {
                        int i6 = i5 + 1;
                        int i7 = f62139;
                        int i8 = f62141;
                        long j2 = ((i6 & i3) << i7) + i8;
                        Unsafe unsafe2 = f62138;
                        AbstractFutureC13992 abstractFutureC13994 = (AbstractFutureC13992) unsafe2.getObject(abstractFutureC13992Arr, j2);
                        unsafe2.putObjectVolatile(abstractFutureC13992Arr, j2, (Object) null);
                        unsafe2.putOrderedObject(abstractFutureC13992Arr, ((i5 & i3) << i7) + i8, abstractFutureC13994);
                        i5 = i6;
                    }
                    C8027.m21893();
                    abstractFutureC13993.m34093();
                    return;
                }
                return;
            }
            i5--;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m44544() {
        return f62138.compareAndSwapInt(this, f62140, 0, 1);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m44545(AbstractFutureC13992 abstractFutureC13992) {
        int length;
        int i = this.f62146;
        int i2 = i - 1;
        AbstractFutureC13992[] abstractFutureC13992Arr = this.f62143;
        if (abstractFutureC13992Arr != null && (length = abstractFutureC13992Arr.length) > 0) {
            boolean z = true;
            long j = (((long) ((length - 1) & i2)) << f62139) + ((long) f62141);
            Unsafe unsafe = f62138;
            if (((AbstractFutureC13992) unsafe.getObject(abstractFutureC13992Arr, j)) == abstractFutureC13992) {
                long j2 = f62140;
                if (unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                    if (this.f62146 == i && this.f62143 == abstractFutureC13992Arr && C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13992)) {
                        this.f62146 = i2;
                    } else {
                        z = false;
                    }
                    unsafe.putOrderedInt(this, j2, 0);
                    return z;
                }
            }
        }
        return false;
    }

    static {
        Unsafe unsafe = C5746.f19778;
        f62138 = unsafe;
        try {
            f62140 = unsafe.objectFieldOffset(C19214.class.getDeclaredField("ܳ"));
            f62141 = unsafe.arrayBaseOffset(AbstractFutureC13992[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC13992[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f62139 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
