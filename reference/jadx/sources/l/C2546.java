package l;

import java.util.concurrent.RejectedExecutionException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۖ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2546 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final int f10066;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f10067;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final long f10068;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static final int f10069;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C5369 f10070;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f10071;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int f10072;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractFutureC23009[] f10073;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18069 f10074;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f10076;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public volatile int f10077;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public volatile int f10079;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public int f10075 = 4096;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile int f10078 = 4096;

    public C2546(C5369 c5369, C18069 c18069) {
        this.f10070 = c5369;
        this.f10074 = c18069;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7931(AbstractFutureC23009 abstractFutureC23009) {
        int length;
        int i = this.f10075;
        AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
        if (abstractFutureC23009Arr == null || (length = abstractFutureC23009Arr.length) <= 0) {
            return;
        }
        long j = (((long) ((length - 1) & i)) << f10066) + ((long) f10069);
        C5369 c5369 = this.f10070;
        this.f10075 = i + 1;
        f10067.putOrderedObject(abstractFutureC23009Arr, j, abstractFutureC23009);
        int i2 = this.f10078 - i;
        if (i2 == 0) {
            C11720.m29303();
            c5369.m14885();
        } else if (i2 + length == 1) {
            m7929();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7929() {
        int i;
        AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
        int length = abstractFutureC23009Arr != null ? abstractFutureC23009Arr.length : 0;
        int i2 = length > 0 ? length << 1 : 8192;
        if (i2 < 8192 || i2 > 67108864) {
            throw new RejectedExecutionException("Queue capacity exceeded");
        }
        AbstractFutureC23009[] abstractFutureC23009Arr2 = new AbstractFutureC23009[i2];
        this.f10073 = abstractFutureC23009Arr2;
        if (abstractFutureC23009Arr == null || (i = length - 1) <= 0) {
            return;
        }
        int i3 = this.f10075;
        int i4 = this.f10078;
        if (i3 - i4 > 0) {
            int i5 = i2 - 1;
            do {
                long j = (((long) (i4 & i)) << f10066) + ((long) f10069);
                Unsafe unsafe = f10067;
                AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j);
                if (abstractFutureC23009 != null && C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC23009)) {
                    abstractFutureC23009Arr2[i4 & i5] = abstractFutureC23009;
                }
                i4++;
            } while (i4 != i3);
            C11720.m29304();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractFutureC23009 m7934() {
        int i;
        int length;
        while (true) {
            int i2 = this.f10078;
            int i3 = this.f10075;
            AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
            if (abstractFutureC23009Arr == null || (i = i2 - i3) >= 0 || (length = abstractFutureC23009Arr.length) <= 0) {
                return null;
            }
            long j = (((long) ((length - 1) & i2)) << f10066) + ((long) f10069);
            Unsafe unsafe = f10067;
            AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j);
            int i4 = i2 + 1;
            if (i2 == this.f10078) {
                if (abstractFutureC23009 != null) {
                    if (C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC23009)) {
                        this.f10078 = i4;
                        return abstractFutureC23009;
                    }
                } else if (i == -1) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m7928(AbstractFutureC23009 abstractFutureC23009) {
        int length;
        int i = this.f10078;
        int i2 = this.f10075;
        AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
        if (abstractFutureC23009Arr == null || i == i2 || (length = abstractFutureC23009Arr.length) <= 0) {
            return false;
        }
        int i3 = i2 - 1;
        if (!C23364.m51478(f10067, abstractFutureC23009Arr, (((long) ((length - 1) & i3)) << f10066) + ((long) f10069), abstractFutureC23009)) {
            return false;
        }
        this.f10075 = i3;
        C11720.m29304();
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7935(int i) {
        int length;
        while (true) {
            int i2 = this.f10078;
            int i3 = this.f10075;
            AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
            if (abstractFutureC23009Arr == null || i2 == i3 || (length = abstractFutureC23009Arr.length) <= 0) {
                return;
            }
            int i4 = i3 - 1;
            AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) C5369.m14870((((long) ((length - 1) & i4)) << f10066) + ((long) f10069), abstractFutureC23009Arr);
            if (abstractFutureC23009 == null) {
                return;
            }
            this.f10075 = i4;
            C11720.m29304();
            abstractFutureC23009.m50893();
            if (i != 0 && (i = i - 1) == 0) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7930(int i) {
        int i2;
        int length;
        do {
            int i3 = 0;
            while (true) {
                int i4 = this.f10078;
                int i5 = this.f10075;
                AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
                if (abstractFutureC23009Arr == null || (i2 = i4 - i5) >= 0 || (length = abstractFutureC23009Arr.length) <= 0) {
                    return;
                }
                int i6 = i4 + 1;
                AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) C5369.m14870((((long) (i4 & (length - 1))) << f10066) + ((long) f10069), abstractFutureC23009Arr);
                if (abstractFutureC23009 != null) {
                    this.f10078 = i6;
                    abstractFutureC23009.m50893();
                    if (i != 0 && (i3 = i3 + 1) == i) {
                        return;
                    }
                }
            }
        } while (i2 != -1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7936(AbstractFutureC23009 abstractFutureC23009) {
        AbstractFutureC23009[] abstractFutureC23009Arr;
        int length;
        int i = this.f10078;
        int i2 = this.f10075;
        if (i - i2 >= 0 || (abstractFutureC23009Arr = this.f10073) == null || (length = abstractFutureC23009Arr.length) <= 0) {
            return;
        }
        int i3 = length - 1;
        int i4 = i2 - 1;
        int i5 = i4;
        while (true) {
            long j = ((i5 & i3) << f10066) + f10069;
            Unsafe unsafe = f10067;
            AbstractFutureC23009 abstractFutureC230010 = (AbstractFutureC23009) unsafe.getObject(abstractFutureC23009Arr, j);
            if (abstractFutureC230010 == null) {
                return;
            }
            if (abstractFutureC230010 == abstractFutureC23009) {
                if (C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC230010)) {
                    this.f10075 = i4;
                    while (i5 != i4) {
                        int i6 = i5 + 1;
                        int i7 = f10066;
                        int i8 = f10069;
                        long j2 = ((i6 & i3) << i7) + i8;
                        Unsafe unsafe2 = f10067;
                        AbstractFutureC23009 abstractFutureC230011 = (AbstractFutureC23009) unsafe2.getObject(abstractFutureC23009Arr, j2);
                        unsafe2.putObjectVolatile(abstractFutureC23009Arr, j2, (Object) null);
                        unsafe2.putOrderedObject(abstractFutureC23009Arr, ((i5 & i3) << i7) + i8, abstractFutureC230011);
                        i5 = i6;
                    }
                    C11720.m29304();
                    abstractFutureC230010.m50893();
                    return;
                }
                return;
            }
            i5--;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7932() {
        return f10067.compareAndSwapInt(this, f10068, 0, 1);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m7933(AbstractFutureC23009 abstractFutureC23009) {
        int length;
        int i = this.f10075;
        int i2 = i - 1;
        AbstractFutureC23009[] abstractFutureC23009Arr = this.f10073;
        if (abstractFutureC23009Arr != null && (length = abstractFutureC23009Arr.length) > 0) {
            boolean z = true;
            long j = (((long) ((length - 1) & i2)) << f10066) + ((long) f10069);
            Unsafe unsafe = f10067;
            if (((AbstractFutureC23009) unsafe.getObject(abstractFutureC23009Arr, j)) == abstractFutureC23009) {
                long j2 = f10068;
                if (unsafe.compareAndSwapInt(this, j2, 0, 1)) {
                    if (this.f10075 == i && this.f10073 == abstractFutureC23009Arr && C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC23009)) {
                        this.f10075 = i2;
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
        Unsafe unsafe = C10309.f35350;
        f10067 = unsafe;
        try {
            f10068 = unsafe.objectFieldOffset(C2546.class.getDeclaredField("᩹"));
            f10069 = unsafe.arrayBaseOffset(AbstractFutureC23009[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC23009[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f10066 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
