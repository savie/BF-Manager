package l;

import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.Permissions;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۢܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10263 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f32769;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f32770;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final int f32771;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final long f32772;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final RuntimePermission f32773;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final int f32774;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final C14738 f32775;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final C10263 f32776;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final long f32777;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f32778;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f32779;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Thread.UncaughtExceptionHandler f32780;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f32781;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f32782;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public C19214[] f32783;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public volatile long f32784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f32785;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC21452 f32786;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public volatile int f32787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile long f32788;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C12501.m31058(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractFutureC13992 c7281;
        runnable.getClass();
        if (runnable instanceof AbstractFutureC13992) {
            c7281 = (AbstractFutureC13992) runnable;
        } else {
            c7281 = new C7281(runnable);
        }
        m26464(c7281);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        AbstractFutureC13992 runnableFutureC2806 = runnable instanceof AbstractFutureC13992 ? (AbstractFutureC13992) runnable : new RunnableFutureC2806(runnable);
        m26464(runnableFutureC2806);
        return runnableFutureC2806;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f32773);
        }
        m26459(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f32773);
        }
        m26459(true, true);
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AccessControlContext m26455(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26456(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f32778;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m26454(long j, Object obj) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f32778;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!C6536.m18413(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private boolean m26461() throws Throwable {
        InterfaceC21452 interfaceC21452 = this.f32786;
        C10965 th = null;
        if (interfaceC21452 != null) {
            try {
                C10965 c10965Mo2585 = interfaceC21452.mo2585(this);
                if (c10965Mo2585 != null) {
                    try {
                        c10965Mo2585.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C10965 c10965 = th;
                th = c10965Mo2585;
                th = c10965;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            th = null;
        }
        m26467(th, th);
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26463(long j) {
        long j2 = j;
        do {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j2) & 281470681743360L);
            if (this.f32788 == j2 && f32778.compareAndSwapLong(this, f32777, j2, j3)) {
                m26461();
                return;
            } else {
                j2 = this.f32788;
                if ((140737488355328L & j2) == 0) {
                    return;
                }
            }
        } while (((int) j2) == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19214 m26466(C10965 c10965) {
        int i;
        int length;
        c10965.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f32780;
        if (uncaughtExceptionHandler != null) {
            c10965.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C19214 c19214 = new C19214(this, c10965);
        int i2 = this.f32787 & 65536;
        String str = this.f32781;
        if (str == null) {
            return c19214;
        }
        synchronized (str) {
            C19214[] c19214Arr = this.f32783;
            int i3 = this.f32779 - 1640531527;
            this.f32779 = i3;
            i = 0;
            if (c19214Arr != null && (length = c19214Arr.length) > 1) {
                int i4 = length - 1;
                int i5 = i3 & i4;
                int i6 = ((i3 << 1) | 1) & i4;
                int i7 = length >>> 1;
                while (true) {
                    C19214 c19215 = c19214Arr[i6];
                    if (c19215 == null || c19215.f62148 == 1073741824) {
                        break;
                        break;
                    }
                    i7--;
                    if (i7 == 0) {
                        i6 = length | 1;
                        break;
                    }
                    i6 = (i6 + 2) & i4;
                }
                int i8 = i2 | i6 | (i3 & 1073610752);
                c19214.f62145 = i8;
                c19214.f62148 = i8;
                if (i6 < length) {
                    c19214Arr[i6] = c19214;
                } else {
                    int i9 = length << 1;
                    C19214[] c19214Arr2 = new C19214[i9];
                    c19214Arr2[i6] = c19214;
                    int i10 = i9 - 1;
                    while (i < length) {
                        C19214 c19216 = c19214Arr[i];
                        if (c19216 != null) {
                            c19214Arr2[c19216.f62145 & i10 & 126] = c19216;
                        }
                        int i11 = i + 1;
                        if (i11 >= length) {
                            break;
                        }
                        c19214Arr2[i11] = c19214Arr[i11];
                        i += 2;
                    }
                    this.f32783 = c19214Arr2;
                }
                i = i5;
            }
        }
        c10965.setName(str.concat(Integer.toString(i)));
        return c19214;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26467(C10965 c10965, Throwable th) throws Throwable {
        C19214 c19214;
        int i;
        Unsafe unsafe;
        long j;
        long j2;
        C19214 c19215 = null;
        if (c10965 == null) {
            c19214 = c19215;
            i = 0;
        } else {
            c19214 = c10965.f34641;
            if (c19214 != null) {
                String str = this.f32781;
                long j3 = ((long) c19214.f62151) & 4294967295L;
                int i2 = c19214.f62145 & 65535;
                if (str != null) {
                    synchronized (str) {
                        C19214[] c19214Arr = this.f32783;
                        if (c19214Arr != null && c19214Arr.length > i2 && c19214Arr[i2] == c19214) {
                            c19214Arr[i2] = null;
                        }
                        this.f32784 += j3;
                    }
                }
                i = c19214.f62148;
            } else {
                c19215 = c19214;
                c19214 = c19215;
                i = 0;
            }
        }
        if (i != 1073741824) {
            do {
                unsafe = f32778;
                j = f32777;
                j2 = this.f32788;
            } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & 281470681743360L) | (j2 & 4294967295L)));
        }
        if (c19214 != null) {
            while (true) {
                AbstractFutureC13992 abstractFutureC13992M44546 = c19214.m44546();
                if (abstractFutureC13992M44546 == null) {
                    break;
                } else if (abstractFutureC13992M44546.f44352 >= 0) {
                    try {
                        abstractFutureC13992M44546.cancel(false);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (!m26459(false, false) && c19214 != null && c19214.f62143 != null) {
            m26470();
        }
        if (th == null) {
            AbstractFutureC13992.m34089();
        } else {
            int i3 = AbstractFutureC13992.f44351;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26470() {
        int i;
        C19214 c19214;
        while (true) {
            long j = this.f32788;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    m26463(j);
                    return;
                }
                return;
            }
            C19214[] c19214Arr = this.f32783;
            if (c19214Arr == null || c19214Arr.length <= (i = 65535 & i2) || (c19214 = c19214Arr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = c19214.f62148;
            long j2 = (((long) c19214.f62142) & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            C10965 c10965 = c19214.f62149;
            if (i2 == i4 && f32778.compareAndSwapLong(this, f32777, j, j2)) {
                c19214.f62148 = i3;
                if (c19214.f62144 < 0) {
                    LockSupport.unpark(c10965);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private int m26460(C19214 c19214) {
        int length;
        Thread.State state;
        long j = this.f32788;
        C19214[] c19214Arr = this.f32783;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (c19214Arr == null || (length = c19214Arr.length) <= 0 || c19214 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C19214 c19215 = c19214Arr[i & (length - 1)];
                int i2 = c19214.f62148;
                long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (c19215 == null) {
                    return 0;
                }
                int i4 = c19215.f62148;
                C10965 c10965 = c19215.f62149;
                long j3 = (((long) c19215.f62142) & 4294967295L) | j2;
                if (i4 != i || !f32778.compareAndSwapLong(this, f32777, j, j3)) {
                    return 0;
                }
                c19215.f62148 = i3;
                if (c19215.f62144 < 0) {
                    LockSupport.unpark(c10965);
                }
                return i2 < 0 ? -1 : 1;
            }
            if (((int) (j >> 48)) - ((short) (this.f32785 & 65535)) > 0) {
                return f32778.compareAndSwapLong(this, f32777, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
            }
            int i5 = this.f32787 & 65535;
            int i6 = i5 + s;
            int i7 = 0;
            int i8 = i6;
            for (int i9 = 1; i9 < length; i9 += 2) {
                C19214 c19216 = c19214Arr[i9];
                if (c19216 != null) {
                    if (c19216.f62144 == 0) {
                        return 0;
                    }
                    i8--;
                    C10965 c10966 = c19216.f62149;
                    if (c10966 != null && ((state = c10966.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                        i7++;
                    }
                }
            }
            if (i8 != 0 || this.f32788 != j) {
                return 0;
            }
            if (i6 >= 32767 || s >= (this.f32785 >>> 16)) {
                if (i7 < i5) {
                    Thread.yield();
                    return 0;
                }
                throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
            }
        }
        return (f32778.compareAndSwapLong(this, f32777, j, ((-281470681743361L) & j) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j) & 281470681743360L)) && m26461()) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ab A[EDGE_INSN: B:95:0x00ab->B:46:0x00ab BREAK  A[LOOP:1: B:9:0x001d->B:44:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26471(C19214 c19214) {
        int i;
        long j;
        C19214 c19215;
        AbstractFutureC13992[] abstractFutureC13992Arr;
        int length;
        c19214.m44541();
        int iM32718 = c19214.f62145 ^ C13203.m32718();
        if (iM32718 == 0) {
            iM32718 = 1;
        }
        int i2 = 0;
        C10263 c10263 = this;
        C19214 c19216 = c19214;
        while (true) {
            C19214[] c19214Arr = c10263.f32783;
            if (c19214Arr == null) {
                return;
            }
            int length2 = c19214Arr.length;
            int i3 = length2 - 1;
            boolean z = false;
            C19214 c19217 = c19216;
            int i4 = length2;
            while (true) {
                if (i4 <= 0) {
                    i = 65536;
                    break;
                }
                int i5 = iM32718 & i3;
                if (i5 < 0 || i5 >= length2 || (c19215 = c19214Arr[i5]) == null) {
                    i = 65536;
                    if (z) {
                        break;
                    } else {
                        iM32718++;
                    }
                } else {
                    int i6 = c19215.f62150;
                    if (i6 - c19215.f62146 >= 0 || (abstractFutureC13992Arr = c19215.f62143) == null || (length = abstractFutureC13992Arr.length) <= 0) {
                        i = 65536;
                        if (z) {
                            break;
                            break;
                        }
                        iM32718++;
                    } else {
                        int i7 = c19215.f62145;
                        long j2 = (((long) ((length - 1) & i6)) << f32770) + ((long) f32771);
                        Unsafe unsafe = f32778;
                        AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j2);
                        if (abstractFutureC13992 != null) {
                            int i8 = i6 + 1;
                            if (i6 == c19215.f62150 && C6536.m18413(unsafe, abstractFutureC13992Arr, j2, abstractFutureC13992)) {
                                c19215.f62150 = i8;
                                if (i8 - c19215.f62146 < 0 && i7 != i2) {
                                    c10263.m26470();
                                }
                                c19214.f62144 = i7;
                                abstractFutureC13992.m34093();
                                if ((c19214.f62145 & 65536) != 0) {
                                    c19214.m44542(1024);
                                } else {
                                    c19214.m44547(1024);
                                }
                                C10965 c10965 = c19214.f62149;
                                c19214.f62151++;
                                c19214.f62144 = 0;
                                if (c10965 != null) {
                                    c10965.mo27796();
                                }
                                i2 = i7;
                            }
                        }
                        c19217 = c19214;
                        z = true;
                    }
                }
                i4--;
                c19214Arr = c19214Arr;
                length2 = length2;
            }
            if (z) {
                int i9 = iM32718 ^ (iM32718 << 13);
                int i10 = i9 ^ (i9 >>> 17);
                iM32718 = i10 ^ (i10 << 5);
            } else {
                int i11 = c19217.f62148;
                if (i11 >= 0) {
                    int i12 = (i11 + i) | Integer.MIN_VALUE;
                    c19217.f62148 = i12;
                    do {
                        j = c10263.f32788;
                        c19217.f62142 = (int) j;
                    } while (!f32778.compareAndSwapLong(c10263, f32777, j, (((long) i12) & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i13 = c19217.f62142;
                    c19217.f62144 = -1073741824;
                    int i14 = 0;
                    while (c19217.f62148 < 0) {
                        int i15 = c10263.f32787;
                        if (i15 < 0) {
                            return;
                        }
                        long j3 = c10263.f32788;
                        int i16 = (65535 & i15) + ((int) (j3 >> 48));
                        if (i16 <= 0 && (i15 & 262144) != 0 && c10263.m26459(false, false)) {
                            return;
                        }
                        i14++;
                        if ((i14 & 1) == 0) {
                            Thread.interrupted();
                        } else if (i16 <= 0 && i13 != 0 && i11 == ((int) j3)) {
                            long jCurrentTimeMillis = System.currentTimeMillis() + c10263.f32782;
                            LockSupport.parkUntil(c10263, jCurrentTimeMillis);
                            if (c10263.f32788 == j3 && jCurrentTimeMillis - System.currentTimeMillis() <= 20) {
                                if (f32778.compareAndSwapLong(c10263, f32777, j3, (((long) i13) & 4294967295L) | ((j3 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & (-4294967296L)))) {
                                    c19217.f62148 = 1073741824;
                                    return;
                                }
                            }
                        } else {
                            LockSupport.park(this);
                        }
                        c10263 = this;
                    }
                    c19217.f62144 = 0;
                }
                i2 = 0;
            }
            c19216 = c19217;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m26465(C19214 c19214, AbstractFutureC13992 abstractFutureC13992, long j) {
        long millis;
        C19214 c19215;
        AbstractFutureC13992[] abstractFutureC13992Arr;
        int length;
        if (c19214 == null) {
            return 0;
        }
        c19214.m44548(abstractFutureC13992);
        int i = c19214.f62144;
        int i2 = c19214.f62145;
        int i3 = abstractFutureC13992.f44352;
        while (i3 >= 0) {
            boolean z = true;
            int iM32718 = C13203.m32718() | 1;
            C19214[] c19214Arr = this.f32783;
            if (c19214Arr == null) {
                z = false;
                break;
            }
            int length2 = c19214Arr.length;
            int i4 = length2 - 1;
            int i5 = -length2;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                int i6 = (iM32718 + i5) & i4;
                if (i6 >= 0 && i6 < length2 && (c19215 = c19214Arr[i6]) != null && c19215.f62144 == i2) {
                    int i7 = c19215.f62150;
                    if (i7 - c19215.f62146 < 0 && (abstractFutureC13992Arr = c19215.f62143) != null && (length = abstractFutureC13992Arr.length) > 0) {
                        int i8 = c19215.f62145;
                        long j2 = (((long) ((length - 1) & i7)) << f32770) + ((long) f32771);
                        Unsafe unsafe = f32778;
                        AbstractFutureC13992 abstractFutureC13993 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j2);
                        if (abstractFutureC13993 == null) {
                            break;
                        }
                        int i9 = i7 + 1;
                        if (i7 != c19215.f62150 || i2 != c19215.f62144 || !C6536.m18413(unsafe, abstractFutureC13992Arr, j2, abstractFutureC13993)) {
                            break;
                            break;
                            break;
                        }
                        c19215.f62150 = i9;
                        c19214.f62144 = i8;
                        abstractFutureC13993.m34093();
                        c19214.f62144 = i;
                        break;
                    }
                }
                i5 += 2;
            }
            i3 = abstractFutureC13992.f44352;
            if (i3 >= 0) {
                if (!z) {
                    if (j == 0) {
                        millis = 0;
                    } else {
                        long jNanoTime = j - System.nanoTime();
                        if (jNanoTime > 0) {
                            millis = TimeUnit.NANOSECONDS.toMillis(jNanoTime);
                            if (millis <= 0) {
                                millis = 1;
                            }
                        }
                    }
                    int iM26460 = m26460(c19214);
                    if (iM26460 != 0) {
                        abstractFutureC13992.m34090(millis);
                        m26456(this, f32777, iM26460 > 0 ? 281474976710656L : 0L);
                    }
                    i3 = abstractFutureC13992.f44352;
                }
            }
            return i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26468(C19214 c19214) {
        int i;
        boolean z;
        boolean z2;
        C19214 c19215;
        int i2;
        AbstractFutureC13992[] abstractFutureC13992Arr;
        int i3 = c19214.f62144;
        int i4 = c19214.f62145 & 65536;
        byte b = -1;
        byte b2 = -1;
        int i5 = i3;
        while (true) {
            if (i4 != 0) {
                c19214.m44542(0);
            } else {
                c19214.m44547(0);
            }
            if (b2 == b && c19214.f62148 >= 0) {
                b2 = 1;
            }
            int iM32718 = C13203.m32718();
            C19214[] c19214Arr = this.f32783;
            long j = 281474976710656L;
            if (c19214Arr != null) {
                int length = c19214Arr.length;
                int i6 = length - 1;
                z2 = true;
                int i7 = length;
                while (true) {
                    if (i7 <= 0) {
                        i = i4;
                        z = true;
                        break;
                    }
                    int i8 = (iM32718 - i7) & i6;
                    if (i8 < 0 || i8 >= length || (c19215 = c19214Arr[i8]) == null) {
                        i = i4;
                        iM32718 = iM32718;
                    } else {
                        int i9 = c19215.f62150;
                        i = i4;
                        if (i9 - c19215.f62146 < 0 && (abstractFutureC13992Arr = c19215.f62143) != null) {
                            i2 = 1073741824;
                            int length2 = abstractFutureC13992Arr.length;
                            if (length2 > 0) {
                                if (b2 == 0) {
                                    m26456(this, f32777, j);
                                    b2 = 1;
                                }
                                long j2 = (((long) ((length2 - 1) & i9)) << f32770) + ((long) f32771);
                                Unsafe unsafe = f32778;
                                AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j2);
                                if (abstractFutureC13992 != null) {
                                    int i10 = i9 + 1;
                                    if (i9 == c19215.f62150 && C6536.m18413(unsafe, abstractFutureC13992Arr, j2, abstractFutureC13992)) {
                                        c19215.f62150 = i10;
                                        c19214.f62144 = c19215.f62145;
                                        abstractFutureC13992.m34093();
                                        c19214.f62144 = i3;
                                        i5 = i3;
                                    }
                                }
                                z = false;
                                z2 = false;
                                break;
                            }
                        } else {
                            i2 = 1073741824;
                        }
                        if ((c19215.f62144 & i2) == 0) {
                            z2 = false;
                        }
                    }
                    i7--;
                    j = 281474976710656L;
                    i4 = i;
                    iM32718 = iM32718;
                }
            } else {
                i = i4;
                z = true;
                z2 = true;
            }
            if (z2) {
                break;
            }
            if (z) {
                if (i5 != 1073741824) {
                    c19214.f62144 = 1073741824;
                    i5 = 1073741824;
                }
                if (b2 == 1) {
                    m26456(this, f32777, -281474976710656L);
                    b2 = 0;
                }
            }
            b = -1;
            i4 = i;
        }
        if (b2 == 0) {
            m26456(this, f32777, 281474976710656L);
        }
        c19214.f62144 = i3;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private AbstractFutureC13992 m26462() {
        C19214[] c19214Arr;
        int length;
        C19214 c19214;
        int i;
        AbstractFutureC13992[] abstractFutureC13992Arr;
        int length2;
        while ((this.f32787 & Integer.MIN_VALUE) == 0 && (c19214Arr = this.f32783) != null && (length = c19214Arr.length) > 0) {
            int i2 = length - 1;
            int iM32718 = C13203.m32718();
            int i3 = iM32718 >>> 16;
            int i4 = iM32718 & i2;
            int i5 = i3 | 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = i4;
            while (true) {
                c19214 = c19214Arr[i8];
                if (c19214 != null) {
                    i = c19214.f62150;
                    i6 += i;
                    if (i - c19214.f62146 < 0 && (abstractFutureC13992Arr = c19214.f62143) != null && (length2 = abstractFutureC13992Arr.length) > 0) {
                        break;
                    }
                }
                i8 = (i8 + i5) & i2;
                if (i8 == i4) {
                    if (i7 == i6) {
                        return null;
                    }
                    i7 = i6;
                    i6 = 0;
                }
            }
            long j = (((long) ((length2 - 1) & i)) << f32770) + ((long) f32771);
            Unsafe unsafe = f32778;
            AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j);
            if (abstractFutureC13992 != null) {
                int i9 = i + 1;
                if (i == c19214.f62150 && C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13992)) {
                    c19214.f62150 = i9;
                    return abstractFutureC13992;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m26464(AbstractFutureC13992 abstractFutureC13992) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        C19214 c19214;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C10965) {
            C10965 c10965 = (C10965) threadCurrentThread;
            if (c10965.f34640 == this && (c19214 = c10965.f34641) != null) {
                c19214.m44543(abstractFutureC13992);
                return;
            }
        }
        int iM32712 = C13203.m32712();
        if (iM32712 == 0) {
            C13203.m32719();
            iM32712 = C13203.m32712();
        }
        int iM32713 = iM32712;
        while (true) {
            int i = this.f32787;
            C19214[] c19214Arr = this.f32783;
            if ((i & 262144) != 0 || c19214Arr == null || (length = c19214Arr.length) <= 0) {
                break;
            }
            C19214 c19215 = c19214Arr[(length - 1) & iM32713 & 126];
            if (c19215 == null) {
                String str = this.f32781;
                int i2 = (iM32713 | 1073741824) & (-65538);
                C19214 c19216 = new C19214(this, null);
                c19216.f62145 = i2;
                c19216.f62144 = 1073741824;
                c19216.f62148 = 1;
                if (str != null) {
                    synchronized (str) {
                        C19214[] c19214Arr2 = this.f32783;
                        if (c19214Arr2 == null || (length4 = c19214Arr2.length) <= 0) {
                            z = false;
                            z2 = false;
                        } else {
                            int i3 = i2 & (length4 - 1) & 126;
                            if (c19214Arr2[i3] == null) {
                                c19214Arr2[i3] = c19216;
                                z = true;
                                z2 = true;
                            } else {
                                z = false;
                                z2 = false;
                            }
                        }
                    }
                } else {
                    z = false;
                    z2 = false;
                }
                c19215 = c19216;
            } else if (c19215.m44544()) {
                int i4 = c19215.f62150;
                int i5 = c19215.f62146;
                AbstractFutureC13992[] abstractFutureC13992Arr = c19215.f62143;
                if (abstractFutureC13992Arr == null || (length2 = abstractFutureC13992Arr.length) <= 0) {
                    z2 = true;
                } else {
                    int i6 = length2 - 1;
                    int i7 = i4 - i5;
                    if (i6 + i7 > 0) {
                        abstractFutureC13992Arr[i6 & i5] = abstractFutureC13992;
                        c19215.f62146 = i5 + 1;
                        c19215.f62148 = 0;
                        if (i7 < 0 && c19215.f62150 - i5 < -1) {
                            return;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = true;
                    }
                }
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            if (z) {
                if (z2) {
                    try {
                        c19215.m44541();
                        int i8 = c19215.f62146;
                        AbstractFutureC13992[] abstractFutureC13992Arr2 = c19215.f62143;
                        if (abstractFutureC13992Arr2 != null && (length3 = abstractFutureC13992Arr2.length) > 0) {
                            abstractFutureC13992Arr2[(length3 - 1) & i8] = abstractFutureC13992;
                            c19215.f62146 = i8 + 1;
                        }
                        c19215.f62148 = 0;
                    } catch (Throwable th) {
                        c19215.f62148 = 0;
                        throw th;
                    }
                }
                m26470();
                return;
            }
            iM32713 = C13203.m32713(iM32713);
        }
        throw new RejectedExecutionException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26469(AbstractFutureC13992 abstractFutureC13992) {
        int length;
        C19214 c19214;
        int iM32712 = C13203.m32712();
        C19214[] c19214Arr = this.f32783;
        return c19214Arr != null && (length = c19214Arr.length) > 0 && (c19214 = c19214Arr[(iM32712 & (length - 1)) & 126]) != null && c19214.m44545(abstractFutureC13992);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m26459(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        while (true) {
            int i6 = this.f32787;
            if ((262144 & i6) != 0) {
                while (true) {
                    int i7 = this.f32787;
                    int i8 = 65535;
                    int i9 = 1;
                    if ((Integer.MIN_VALUE & i7) != 0) {
                        while ((this.f32787 & 524288) == 0) {
                            long j2 = 0;
                            while (true) {
                                long j3 = this.f32788;
                                C19214[] c19214Arr = this.f32783;
                                if (c19214Arr != null) {
                                    for (C19214 c19214 : c19214Arr) {
                                        if (c19214 != null) {
                                            C10965 c10965 = c19214.f62149;
                                            while (true) {
                                                AbstractFutureC13992 abstractFutureC13992M44546 = c19214.m44546();
                                                if (abstractFutureC13992M44546 == null) {
                                                    break;
                                                }
                                                if (abstractFutureC13992M44546.f44352 >= 0) {
                                                    try {
                                                        abstractFutureC13992M44546.cancel(false);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (c10965 != null) {
                                                try {
                                                    c10965.interrupt();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            j3 += (((long) c19214.f62148) << 32) + ((long) c19214.f62150);
                                        }
                                    }
                                }
                                i = this.f32787;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f32783 == c19214Arr) {
                                    if (j2 == j3) {
                                        break;
                                    }
                                    j2 = j3;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (this.f32788 >>> 32)) > 0) {
                                break;
                            }
                            if (f32778.compareAndSwapInt(this, f32772, i, i | 524288)) {
                                synchronized (this) {
                                    notifyAll();
                                }
                                break;
                            }
                        }
                        return true;
                    }
                    if (z) {
                        i3 = i7;
                        i4 = Integer.MIN_VALUE;
                    } else {
                        long j4 = 0;
                        while (true) {
                            long j5 = this.f32788;
                            C19214[] c19214Arr2 = this.f32783;
                            if ((i7 & i8) + ((int) (j5 >> 48)) > 0) {
                                i4 = Integer.MIN_VALUE;
                                j = j4;
                            } else if (c19214Arr2 != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < c19214Arr2.length) {
                                        C19214 c19215 = c19214Arr2[i10];
                                        if (c19215 != null) {
                                            int i11 = c19215.f62144;
                                            int i12 = c19215.f62148;
                                            int i13 = c19215.f62145;
                                            int i14 = c19215.f62150;
                                            if (i14 != c19215.f62146 || ((i13 & 1) == i9 && (i11 >= 0 || i12 >= 0))) {
                                                j = j4;
                                                i9 = 1;
                                                i4 = Integer.MIN_VALUE;
                                            } else {
                                                j5 = (((long) i11) << 48) + (((long) i12) << 32) + (((long) i14) << 16) + ((long) i13) + j5;
                                            }
                                        }
                                        i10++;
                                        i9 = 1;
                                        j4 = j4;
                                    } else {
                                        j = j4;
                                        i4 = Integer.MIN_VALUE;
                                        i9 = 0;
                                    }
                                }
                            } else {
                                j = j4;
                                i4 = Integer.MIN_VALUE;
                                i9 = 0;
                            }
                            i5 = this.f32787;
                            if ((i5 & i4) != 0) {
                                break;
                            }
                            if (i9 != 0) {
                                return false;
                            }
                            if (this.f32783 != c19214Arr2) {
                                j4 = j;
                            } else {
                                if (j == j5) {
                                    break;
                                }
                                j4 = j5;
                            }
                            i9 = 1;
                            i7 = i5;
                            i8 = 65535;
                        }
                        i3 = i5;
                    }
                    if ((i3 & i4) == 0) {
                        f32778.compareAndSwapInt(this, f32772, i3, i3 | i4);
                    }
                }
            } else {
                if (!z2 || this == f32776) {
                    return false;
                }
                f32778.compareAndSwapInt(this, f32772, i6, i6 | 262144);
            }
        }
    }

    public C10263() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int iAvailableProcessors = -1;
        InterfaceC21452 c0569 = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            iAvailableProcessors = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            InterfaceC21452 interfaceC21452 = (InterfaceC21452) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                uncaughtExceptionHandler = null;
            }
            c0569 = interfaceC21452;
        } catch (Exception unused2) {
            uncaughtExceptionHandler = null;
        }
        if (c0569 == null) {
            if (System.getSecurityManager() == null) {
                c0569 = f32775;
            } else {
                c0569 = new C0569();
            }
        }
        if (iAvailableProcessors < 0 && (iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            iAvailableProcessors = 1;
        }
        iAvailableProcessors = iAvailableProcessors > 32767 ? EnumC6121.f20881 : iAvailableProcessors;
        long j = -iAvailableProcessors;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - iAvailableProcessors) & 65535) | (f32774 << 16);
        int i2 = iAvailableProcessors > 1 ? iAvailableProcessors - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.f32781 = "FJPool.commonPool-worker-";
        this.f32783 = new C19214[((i6 | (i6 >>> 16)) + 1) << 1];
        this.f32786 = c0569;
        this.f32780 = uncaughtExceptionHandler;
        this.f32782 = 60000L;
        this.f32785 = i;
        this.f32787 = iAvailableProcessors;
        this.f32788 = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        RunnableFutureC1315 runnableFutureC1315 = new RunnableFutureC1315(callable);
        m26464(runnableFutureC1315);
        return runnableFutureC1315;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        RunnableFutureC9517 runnableFutureC9517 = new RunnableFutureC9517(runnable, obj);
        m26464(runnableFutureC9517);
        return runnableFutureC9517;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RunnableFutureC1315 runnableFutureC1315 = new RunnableFutureC1315((Callable) it.next());
                arrayList.add(runnableFutureC1315);
                m26464(runnableFutureC1315);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractFutureC13992) arrayList.get(i)).m34092();
            }
            return arrayList;
        } catch (Throwable th) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((Future) arrayList.get(i2)).cancel(false);
            }
            throw th;
        }
    }

    public final String toString() {
        int i;
        long j;
        String str;
        Thread.State state;
        long j2 = this.f32784;
        C19214[] c19214Arr = this.f32783;
        long j3 = 0;
        if (c19214Arr != null) {
            j = 0;
            i = 0;
            for (int i2 = 0; i2 < c19214Arr.length; i2++) {
                C19214 c19214 = c19214Arr[i2];
                if (c19214 != null) {
                    int i3 = c19214.f62150 - c19214.f62146;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j += (long) i4;
                    } else {
                        j3 += (long) i4;
                        j2 += ((long) c19214.f62151) & 4294967295L;
                        C10965 c10965 = c19214.f62149;
                        if (c10965 != null && (state = c10965.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
            j = 0;
        }
        int i5 = this.f32787;
        int i6 = 65535 & i5;
        long j4 = this.f32788;
        int i7 = ((short) (j4 >>> 32)) + i6;
        int i8 = ((int) (j4 >> 48)) + i6;
        int i9 = i8 >= 0 ? i8 : 0;
        if ((524288 & i5) != 0) {
            str = "Terminated";
        } else if ((Integer.MIN_VALUE & i5) != 0) {
            str = "Terminating";
        } else {
            str = (i5 & 262144) != 0 ? "Shutting down" : "Running";
        }
        StringBuilder sb = new StringBuilder();
        C4794.m14774(sb, super.toString(), "[", str, ", parallelism = ");
        sb.append(i6);
        sb.append(", size = ");
        sb.append(i7);
        sb.append(", active = ");
        sb.append(i9);
        sb.append(", running = ");
        sb.append(i);
        sb.append(", steals = ");
        sb.append(j2);
        sb.append(", tasks = ");
        sb.append(j3);
        sb.append(", submissions = ");
        return C2764.m9137(sb, j, "]");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f32787 & 524288) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f32787 & 262144) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this != f32776) {
            long nanos = timeUnit.toNanos(j);
            if (isTerminated()) {
                return true;
            }
            if (nanos > 0) {
                long jNanoTime = System.nanoTime() + nanos;
                synchronized (this) {
                    while (!isTerminated()) {
                        if (nanos <= 0) {
                            return false;
                        }
                        long millis = TimeUnit.NANOSECONDS.toMillis(nanos);
                        if (millis <= 0) {
                            millis = 1;
                        }
                        wait(millis);
                        nanos = jNanoTime - System.nanoTime();
                    }
                    return true;
                }
            }
        } else {
            long nanos2 = timeUnit.toNanos(j);
            Thread threadCurrentThread = Thread.currentThread();
            if (threadCurrentThread instanceof C10965) {
                C10965 c10965 = (C10965) threadCurrentThread;
                if (c10965.f34640 == this) {
                    m26468(c10965.f34641);
                    return false;
                }
            }
            long jNanoTime2 = System.nanoTime();
            while (true) {
                AbstractFutureC13992 abstractFutureC13992M26462 = m26462();
                if (abstractFutureC13992M26462 != null) {
                    abstractFutureC13992M26462.m34093();
                } else {
                    while (true) {
                        long j2 = this.f32788;
                        int i = this.f32787;
                        int i2 = 65535 & i;
                        int i3 = ((short) (j2 >>> 32)) + i2;
                        int i4 = i2 + ((int) (j2 >> 48));
                        if ((i & (-2146959360)) == 0) {
                            if (i4 <= 0) {
                                C19214[] c19214Arr = this.f32783;
                                if (c19214Arr != null) {
                                    int i5 = 1;
                                    while (true) {
                                        if (i5 < c19214Arr.length) {
                                            C19214 c19214 = c19214Arr[i5];
                                            if (c19214 != null) {
                                                if ((c19214.f62144 & 1073741824) != 0) {
                                                    i3--;
                                                }
                                            }
                                            i5 += 2;
                                        }
                                    }
                                }
                                if (i3 != 0 || this.f32788 != j2) {
                                }
                            }
                            z = false;
                            if (!z || System.nanoTime() - jNanoTime2 > nanos2) {
                                break;
                            }
                            Thread.yield();
                        }
                        z = true;
                        if (!z) {
                            break;
                        }
                        Thread.yield();
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26458(C22944 c22944) {
        C10965 c10965;
        C10263 c10263;
        C19214 c19214;
        long j = c22944.f74551;
        long j2 = f32777;
        Thread threadCurrentThread = Thread.currentThread();
        long j3 = 0;
        if ((threadCurrentThread instanceof C10965) && (c10263 = (c10965 = (C10965) threadCurrentThread).f34640) != null && (c19214 = c10965.f34641) != null) {
            while (!c22944.m51750()) {
                int iM26460 = c10263.m26460(c19214);
                if (iM26460 != 0) {
                    try {
                        if (!c22944.m51750()) {
                            while (!c22944.m51750()) {
                                if (j == 0) {
                                    LockSupport.park(c22944);
                                } else {
                                    LockSupport.parkNanos(c22944, c22944.f74549);
                                }
                            }
                        }
                        return;
                    } finally {
                        m26456(c10263, j2, iM26460 > 0 ? 281474976710656L : 0L);
                    }
                }
            }
            return;
        }
        if (c22944.m51750()) {
            return;
        }
        while (!c22944.m51750()) {
            if (j == 0) {
                LockSupport.park(c22944);
            } else {
                LockSupport.parkNanos(c22944, c22944.f74549);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26457(Executor executor, C22944 c22944) {
        int iM32712;
        C19214 c19214;
        C19214[] c19214Arr;
        int length;
        int i;
        int length2;
        if (!(executor instanceof C10263)) {
            return;
        }
        C10263 c10263 = (C10263) executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C10965) {
            C10965 c10965 = (C10965) threadCurrentThread;
            if (c10965.f34640 == c10263) {
                c19214 = c10965.f34641;
            } else {
                iM32712 = C13203.m32712();
                if (iM32712 != 0 || (c19214Arr = c10263.f32783) == null || (length = c19214Arr.length) <= 0) {
                    c19214 = null;
                } else {
                    c19214 = c19214Arr[iM32712 & (length - 1) & 126];
                }
            }
        } else {
            iM32712 = C13203.m32712();
            if (iM32712 != 0) {
                c19214 = null;
            } else {
                c19214 = null;
            }
        }
        if (c19214 == null) {
            return;
        }
        while (true) {
            int i2 = c19214.f62150;
            int i3 = c19214.f62146;
            AbstractFutureC13992[] abstractFutureC13992Arr = c19214.f62143;
            if (abstractFutureC13992Arr == null || (i = i2 - i3) >= 0 || (length2 = abstractFutureC13992Arr.length) <= 0) {
                return;
            }
            long j = (((long) ((length2 - 1) & i2)) << f32770) + ((long) f32771);
            Unsafe unsafe = f32778;
            AbstractFutureC13992 abstractFutureC13992 = (AbstractFutureC13992) unsafe.getObjectVolatile(abstractFutureC13992Arr, j);
            if (c22944.m51750()) {
                return;
            }
            int i4 = i2 + 1;
            if (i2 == c19214.f62150) {
                if (abstractFutureC13992 == null) {
                    if (i == -1) {
                        return;
                    }
                } else {
                    if (!(abstractFutureC13992 instanceof InterfaceC7259)) {
                        return;
                    }
                    if (C6536.m18413(unsafe, abstractFutureC13992Arr, j, abstractFutureC13992)) {
                        c19214.f62150 = i4;
                        abstractFutureC13992.m34093();
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC9517(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC1315(callable);
    }

    static {
        Unsafe unsafe = C5746.f19778;
        f32778 = unsafe;
        try {
            f32777 = unsafe.objectFieldOffset(C10263.class.getDeclaredField("᩶"));
            f32772 = unsafe.objectFieldOffset(C10263.class.getDeclaredField("ᩳ"));
            f32771 = unsafe.arrayBaseOffset(AbstractFutureC13992[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC13992[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f32770 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            f32774 = i;
            f32775 = new C14738();
            f32773 = new RuntimePermission("modifyThread");
            C10263 c10263 = (C10263) AccessController.doPrivileged(new C24436());
            f32776 = c10263;
            f32769 = Math.max(c10263.f32787 & 65535, 1);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
