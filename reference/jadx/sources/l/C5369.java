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
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.ۚ۬۠, reason: contains not printable characters */
/* JADX INFO: compiled from: H6Q8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5369 extends AbstractExecutorService implements AutoCloseable {

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final RuntimePermission f18541;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final int f18542;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f18543;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final int f18544;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f18545;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final C5369 f18546;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f18547;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final long f18548;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final long f18549;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final C9253 f18550;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC2901 f18551;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public volatile long f18552;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final Thread.UncaughtExceptionHandler f18553;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f18554;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f18555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f18556;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f18557;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public volatile int f18558;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile long f18559;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C2546[] f18560;

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        C10664.m26864(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractFutureC23009 c6780;
        runnable.getClass();
        if (runnable instanceof AbstractFutureC23009) {
            c6780 = (AbstractFutureC23009) runnable;
        } else {
            c6780 = new C6780(runnable);
        }
        m14878(c6780);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        runnable.getClass();
        AbstractFutureC23009 runnableFutureC13131 = runnable instanceof AbstractFutureC23009 ? (AbstractFutureC23009) runnable : new RunnableFutureC13131(runnable);
        m14878(runnableFutureC13131);
        return runnableFutureC13131;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f18541);
        }
        m14875(false, true);
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(f18541);
        }
        m14875(true, true);
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AccessControlContext m14871(Permission... permissionArr) {
        Permissions permissions = new Permissions();
        for (Permission permission : permissionArr) {
            permissions.add(permission);
        }
        return new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, permissions)});
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14872(Object obj, long j, long j2) {
        Unsafe unsafe;
        long longVolatile;
        do {
            unsafe = f18543;
            longVolatile = unsafe.getLongVolatile(obj, j);
        } while (!unsafe.compareAndSwapLong(obj, j, longVolatile, longVolatile + j2));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m14870(long j, Object obj) {
        Unsafe unsafe;
        Object objectVolatile;
        do {
            unsafe = f18543;
            objectVolatile = unsafe.getObjectVolatile(obj, j);
        } while (!C23364.m51478(unsafe, obj, j, objectVolatile));
        return objectVolatile;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private boolean m14869() throws Throwable {
        InterfaceC2901 interfaceC2901 = this.f18551;
        C18069 th = null;
        if (interfaceC2901 != null) {
            try {
                C18069 c18069Mo8709 = interfaceC2901.mo8709(this);
                if (c18069Mo8709 != null) {
                    try {
                        c18069Mo8709.start();
                        return true;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                C18069 c18069 = th;
                th = c18069Mo8709;
                th = c18069;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            th = null;
        }
        m14883(th, th);
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14877(long j) throws Throwable {
        long j2 = j;
        do {
            long j3 = ((281474976710656L + j2) & (-281474976710656L)) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j2) & 281470681743360L);
            if (this.f18559 == j2 && f18543.compareAndSwapLong(this, f18549, j2, j3)) {
                m14869();
                return;
            } else {
                j2 = this.f18559;
                if ((140737488355328L & j2) == 0) {
                    return;
                }
            }
        } while (((int) j2) == 0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2546 m14881(C18069 c18069) {
        int i;
        int length;
        c18069.setDaemon(true);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f18553;
        if (uncaughtExceptionHandler != null) {
            c18069.setUncaughtExceptionHandler(uncaughtExceptionHandler);
        }
        C2546 c2546 = new C2546(this, c18069);
        int i2 = this.f18558 & 65536;
        String str = this.f18555;
        if (str == null) {
            return c2546;
        }
        synchronized (str) {
            C2546[] c2546Arr = this.f18560;
            int i3 = this.f18557 - 1640531527;
            this.f18557 = i3;
            i = 0;
            if (c2546Arr != null && (length = c2546Arr.length) > 1) {
                int i4 = length - 1;
                int i5 = i3 & i4;
                int i6 = ((i3 << 1) | 1) & i4;
                int i7 = length >>> 1;
                while (true) {
                    C2546 c2547 = c2546Arr[i6];
                    if (c2547 == null || c2547.f10079 == 1073741824) {
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
                c2546.f10076 = i8;
                c2546.f10079 = i8;
                if (i6 < length) {
                    c2546Arr[i6] = c2546;
                } else {
                    int i9 = length << 1;
                    C2546[] c2546Arr2 = new C2546[i9];
                    c2546Arr2[i6] = c2546;
                    int i10 = i9 - 1;
                    while (i < length) {
                        C2546 c2548 = c2546Arr[i];
                        if (c2548 != null) {
                            c2546Arr2[c2548.f10076 & i10 & 126] = c2548;
                        }
                        int i11 = i + 1;
                        if (i11 >= length) {
                            break;
                        }
                        c2546Arr2[i11] = c2546Arr[i11];
                        i += 2;
                    }
                    this.f18560 = c2546Arr2;
                }
                i = i5;
            }
        }
        c18069.setName(str.concat(Integer.toString(i)));
        return c2546;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14883(C18069 c18069, Throwable th) throws Throwable {
        C2546 c2546;
        int i;
        Unsafe unsafe;
        long j;
        long j2;
        C2546 c2547 = null;
        if (c18069 == null) {
            c2546 = c2547;
            i = 0;
        } else {
            c2546 = c18069.f57783;
            if (c2546 != null) {
                String str = this.f18555;
                long j3 = ((long) c2546.f10071) & 4294967295L;
                int i2 = c2546.f10076 & 65535;
                if (str != null) {
                    synchronized (str) {
                        C2546[] c2546Arr = this.f18560;
                        if (c2546Arr != null && c2546Arr.length > i2 && c2546Arr[i2] == c2546) {
                            c2546Arr[i2] = null;
                        }
                        this.f18552 += j3;
                    }
                }
                i = c2546.f10079;
            } else {
                c2547 = c2546;
                c2546 = c2547;
                i = 0;
            }
        }
        if (i != 1073741824) {
            do {
                unsafe = f18543;
                j = f18549;
                j2 = this.f18559;
            } while (!unsafe.compareAndSwapLong(this, j, j2, ((j2 - 281474976710656L) & (-281474976710656L)) | ((j2 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & 281470681743360L) | (j2 & 4294967295L)));
        }
        if (c2546 != null) {
            while (true) {
                AbstractFutureC23009 abstractFutureC23009M7934 = c2546.m7934();
                if (abstractFutureC23009M7934 == null) {
                    break;
                } else if (abstractFutureC23009M7934.f74779 >= 0) {
                    try {
                        abstractFutureC23009M7934.cancel(false);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (!m14875(false, false) && c2546 != null && c2546.f10073 != null) {
            m14885();
        }
        if (th == null) {
            AbstractFutureC23009.m50889();
        } else {
            int i3 = AbstractFutureC23009.f74778;
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m14885() {
        int i;
        C2546 c2546;
        while (true) {
            long j = this.f18559;
            if (j >= 0) {
                return;
            }
            int i2 = (int) j;
            if (i2 == 0) {
                if ((140737488355328L & j) != 0) {
                    m14877(j);
                    return;
                }
                return;
            }
            C2546[] c2546Arr = this.f18560;
            if (c2546Arr == null || c2546Arr.length <= (i = 65535 & i2) || (c2546 = c2546Arr[i]) == null) {
                return;
            }
            int i3 = i2 & Integer.MAX_VALUE;
            int i4 = c2546.f10079;
            long j2 = (((long) c2546.f10072) & 4294967295L) | ((281474976710656L + j) & (-4294967296L));
            C18069 c18069 = c2546.f10074;
            if (i2 == i4 && f18543.compareAndSwapLong(this, f18549, j, j2)) {
                c2546.f10079 = i3;
                if (c2546.f10077 < 0) {
                    LockSupport.unpark(c18069);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private int m14876(C2546 c2546) {
        int length;
        Thread.State state;
        long j = this.f18559;
        C2546[] c2546Arr = this.f18560;
        short s = (short) (j >>> 32);
        if (s >= 0) {
            if (c2546Arr == null || (length = c2546Arr.length) <= 0 || c2546 == null) {
                return 0;
            }
            int i = (int) j;
            if (i != 0) {
                C2546 c2547 = c2546Arr[i & (length - 1)];
                int i2 = c2546.f10079;
                long j2 = (-4294967296L) & (i2 < 0 ? 281474976710656L + j : j);
                int i3 = i & Integer.MAX_VALUE;
                if (c2547 == null) {
                    return 0;
                }
                int i4 = c2547.f10079;
                C18069 c18069 = c2547.f10074;
                long j3 = (((long) c2547.f10072) & 4294967295L) | j2;
                if (i4 != i || !f18543.compareAndSwapLong(this, f18549, j, j3)) {
                    return 0;
                }
                c2547.f10079 = i3;
                if (c2547.f10077 < 0) {
                    LockSupport.unpark(c18069);
                }
                return i2 < 0 ? -1 : 1;
            }
            if (((int) (j >> 48)) - ((short) (this.f18556 & 65535)) > 0) {
                return f18543.compareAndSwapLong(this, f18549, j, (281474976710655L & j) | ((-281474976710656L) & (j - 281474976710656L))) ? 1 : 0;
            }
            int i5 = this.f18558 & 65535;
            int i6 = i5 + s;
            int i7 = 0;
            int i8 = i6;
            for (int i9 = 1; i9 < length; i9 += 2) {
                C2546 c2548 = c2546Arr[i9];
                if (c2548 != null) {
                    if (c2548.f10077 == 0) {
                        return 0;
                    }
                    i8--;
                    C18069 c180610 = c2548.f10074;
                    if (c180610 != null && ((state = c180610.getState()) == Thread.State.BLOCKED || state == Thread.State.WAITING)) {
                        i7++;
                    }
                }
            }
            if (i8 != 0 || this.f18559 != j) {
                return 0;
            }
            if (i6 >= 32767 || s >= (this.f18556 >>> 16)) {
                if (i7 < i5) {
                    Thread.yield();
                    return 0;
                }
                throw new RejectedExecutionException("Thread limit exceeded replacing blocked worker");
            }
        }
        return (f18543.compareAndSwapLong(this, f18549, j, ((-281470681743361L) & j) | ((Blake2xsDigest.MAX_NUMBER_BLOCKS + j) & 281470681743360L)) && m14869()) ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0096  */
    /* JADX WARN: Code duplicated, block: B:43:0x009f  */
    /* JADX WARN: Code duplicated, block: B:95:0x00ab A[EDGE_INSN: B:95:0x00ab->B:46:0x00ab BREAK  A[LOOP:1: B:9:0x001d->B:44:0x00a1], SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m14886(C2546 c2546) {
        int i;
        long j;
        C2546 c2547;
        AbstractFutureC23009[] abstractFutureC23009Arr;
        int length;
        c2546.m7929();
        int iM23154 = c2546.f10076 ^ C8898.m23154();
        if (iM23154 == 0) {
            iM23154 = 1;
        }
        int i2 = 0;
        C5369 c5369 = this;
        C2546 c2548 = c2546;
        while (true) {
            C2546[] c2546Arr = c5369.f18560;
            if (c2546Arr == null) {
                return;
            }
            int length2 = c2546Arr.length;
            int i3 = length2 - 1;
            boolean z = false;
            C2546 c2549 = c2548;
            int i4 = length2;
            while (true) {
                if (i4 <= 0) {
                    i = 65536;
                    break;
                }
                int i5 = iM23154 & i3;
                if (i5 < 0 || i5 >= length2 || (c2547 = c2546Arr[i5]) == null) {
                    i = 65536;
                    if (z) {
                        break;
                    } else {
                        iM23154++;
                    }
                } else {
                    int i6 = c2547.f10078;
                    if (i6 - c2547.f10075 >= 0 || (abstractFutureC23009Arr = c2547.f10073) == null || (length = abstractFutureC23009Arr.length) <= 0) {
                        i = 65536;
                        if (z) {
                            break;
                            break;
                        }
                        iM23154++;
                    } else {
                        int i7 = c2547.f10076;
                        long j2 = (((long) ((length - 1) & i6)) << f18547) + ((long) f18542);
                        Unsafe unsafe = f18543;
                        AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j2);
                        if (abstractFutureC23009 != null) {
                            int i8 = i6 + 1;
                            if (i6 == c2547.f10078 && C23364.m51478(unsafe, abstractFutureC23009Arr, j2, abstractFutureC23009)) {
                                c2547.f10078 = i8;
                                if (i8 - c2547.f10075 < 0 && i7 != i2) {
                                    c5369.m14885();
                                }
                                c2546.f10077 = i7;
                                abstractFutureC23009.m50893();
                                if ((c2546.f10076 & 65536) != 0) {
                                    c2546.m7930(1024);
                                } else {
                                    c2546.m7935(1024);
                                }
                                C18069 c18069 = c2546.f10074;
                                c2546.f10071++;
                                c2546.f10077 = 0;
                                if (c18069 != null) {
                                    c18069.mo42065();
                                }
                                i2 = i7;
                            }
                        }
                        c2549 = c2546;
                        z = true;
                    }
                }
                i4--;
                c2546Arr = c2546Arr;
                length2 = length2;
            }
            if (z) {
                int i9 = iM23154 ^ (iM23154 << 13);
                int i10 = i9 ^ (i9 >>> 17);
                iM23154 = i10 ^ (i10 << 5);
            } else {
                int i11 = c2549.f10079;
                if (i11 >= 0) {
                    int i12 = (i11 + i) | Integer.MIN_VALUE;
                    c2549.f10079 = i12;
                    do {
                        j = c5369.f18559;
                        c2549.f10072 = (int) j;
                    } while (!f18543.compareAndSwapLong(c5369, f18549, j, (((long) i12) & 4294967295L) | ((j - 281474976710656L) & (-4294967296L))));
                } else {
                    int i13 = c2549.f10072;
                    c2549.f10077 = -1073741824;
                    int i14 = 0;
                    while (c2549.f10079 < 0) {
                        int i15 = c5369.f18558;
                        if (i15 < 0) {
                            return;
                        }
                        long j3 = c5369.f18559;
                        int i16 = (65535 & i15) + ((int) (j3 >> 48));
                        if (i16 <= 0 && (i15 & 262144) != 0 && c5369.m14875(false, false)) {
                            return;
                        }
                        i14++;
                        if ((i14 & 1) == 0) {
                            Thread.interrupted();
                        } else if (i16 <= 0 && i13 != 0 && i11 == ((int) j3)) {
                            long jCurrentTimeMillis = System.currentTimeMillis() + c5369.f18554;
                            LockSupport.parkUntil(c5369, jCurrentTimeMillis);
                            if (c5369.f18559 == j3 && jCurrentTimeMillis - System.currentTimeMillis() <= 20) {
                                if (f18543.compareAndSwapLong(c5369, f18549, j3, (((long) i13) & 4294967295L) | ((j3 - Blake2xsDigest.MAX_NUMBER_BLOCKS) & (-4294967296L)))) {
                                    c2549.f10079 = 1073741824;
                                    return;
                                }
                            }
                        } else {
                            LockSupport.park(this);
                        }
                        c5369 = this;
                    }
                    c2549.f10077 = 0;
                }
                i2 = 0;
            }
            c2548 = c2549;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m14880(C2546 c2546, AbstractFutureC23009 abstractFutureC23009, long j) {
        long millis;
        C2546 c2547;
        AbstractFutureC23009[] abstractFutureC23009Arr;
        int length;
        if (c2546 == null) {
            return 0;
        }
        c2546.m7936(abstractFutureC23009);
        int i = c2546.f10077;
        int i2 = c2546.f10076;
        int i3 = abstractFutureC23009.f74779;
        while (i3 >= 0) {
            boolean z = true;
            int iM23154 = C8898.m23154() | 1;
            C2546[] c2546Arr = this.f18560;
            if (c2546Arr == null) {
                z = false;
                break;
            }
            int length2 = c2546Arr.length;
            int i4 = length2 - 1;
            int i5 = -length2;
            while (true) {
                if (i5 >= length2) {
                    z = false;
                    break;
                }
                int i6 = (iM23154 + i5) & i4;
                if (i6 >= 0 && i6 < length2 && (c2547 = c2546Arr[i6]) != null && c2547.f10077 == i2) {
                    int i7 = c2547.f10078;
                    if (i7 - c2547.f10075 < 0 && (abstractFutureC23009Arr = c2547.f10073) != null && (length = abstractFutureC23009Arr.length) > 0) {
                        int i8 = c2547.f10076;
                        long j2 = (((long) ((length - 1) & i7)) << f18547) + ((long) f18542);
                        Unsafe unsafe = f18543;
                        AbstractFutureC23009 abstractFutureC230010 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j2);
                        if (abstractFutureC230010 == null) {
                            break;
                        }
                        int i9 = i7 + 1;
                        if (i7 != c2547.f10078 || i2 != c2547.f10077 || !C23364.m51478(unsafe, abstractFutureC23009Arr, j2, abstractFutureC230010)) {
                            break;
                            break;
                            break;
                        }
                        c2547.f10078 = i9;
                        c2546.f10077 = i8;
                        abstractFutureC230010.m50893();
                        c2546.f10077 = i;
                        break;
                    }
                }
                i5 += 2;
            }
            i3 = abstractFutureC23009.f74779;
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
                    int iM14876 = m14876(c2546);
                    if (iM14876 != 0) {
                        abstractFutureC23009.m50890(millis);
                        m14872(this, f18549, iM14876 > 0 ? 281474976710656L : 0L);
                    }
                    i3 = abstractFutureC23009.f74779;
                }
            }
            return i3;
        }
        return i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14882(C2546 c2546) {
        int i;
        boolean z;
        boolean z2;
        C2546 c2547;
        int i2;
        AbstractFutureC23009[] abstractFutureC23009Arr;
        int i3 = c2546.f10077;
        int i4 = c2546.f10076 & 65536;
        byte b = -1;
        byte b2 = -1;
        int i5 = i3;
        while (true) {
            if (i4 != 0) {
                c2546.m7930(0);
            } else {
                c2546.m7935(0);
            }
            if (b2 == b && c2546.f10079 >= 0) {
                b2 = 1;
            }
            int iM23154 = C8898.m23154();
            C2546[] c2546Arr = this.f18560;
            long j = 281474976710656L;
            if (c2546Arr != null) {
                int length = c2546Arr.length;
                int i6 = length - 1;
                z2 = true;
                int i7 = length;
                while (true) {
                    if (i7 <= 0) {
                        i = i4;
                        z = true;
                        break;
                    }
                    int i8 = (iM23154 - i7) & i6;
                    if (i8 < 0 || i8 >= length || (c2547 = c2546Arr[i8]) == null) {
                        i = i4;
                        iM23154 = iM23154;
                    } else {
                        int i9 = c2547.f10078;
                        i = i4;
                        if (i9 - c2547.f10075 < 0 && (abstractFutureC23009Arr = c2547.f10073) != null) {
                            i2 = 1073741824;
                            int length2 = abstractFutureC23009Arr.length;
                            if (length2 > 0) {
                                if (b2 == 0) {
                                    m14872(this, f18549, j);
                                    b2 = 1;
                                }
                                long j2 = (((long) ((length2 - 1) & i9)) << f18547) + ((long) f18542);
                                Unsafe unsafe = f18543;
                                AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j2);
                                if (abstractFutureC23009 != null) {
                                    int i10 = i9 + 1;
                                    if (i9 == c2547.f10078 && C23364.m51478(unsafe, abstractFutureC23009Arr, j2, abstractFutureC23009)) {
                                        c2547.f10078 = i10;
                                        c2546.f10077 = c2547.f10076;
                                        abstractFutureC23009.m50893();
                                        c2546.f10077 = i3;
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
                        if ((c2547.f10077 & i2) == 0) {
                            z2 = false;
                        }
                    }
                    i7--;
                    j = 281474976710656L;
                    i4 = i;
                    iM23154 = iM23154;
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
                    c2546.f10077 = 1073741824;
                    i5 = 1073741824;
                }
                if (b2 == 1) {
                    m14872(this, f18549, -281474976710656L);
                    b2 = 0;
                }
            }
            b = -1;
            i4 = i;
        }
        if (b2 == 0) {
            m14872(this, f18549, 281474976710656L);
        }
        c2546.f10077 = i3;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private AbstractFutureC23009 m14879() {
        C2546[] c2546Arr;
        int length;
        C2546 c2546;
        int i;
        AbstractFutureC23009[] abstractFutureC23009Arr;
        int length2;
        while ((this.f18558 & Integer.MIN_VALUE) == 0 && (c2546Arr = this.f18560) != null && (length = c2546Arr.length) > 0) {
            int i2 = length - 1;
            int iM23154 = C8898.m23154();
            int i3 = iM23154 >>> 16;
            int i4 = iM23154 & i2;
            int i5 = i3 | 1;
            int i6 = 0;
            int i7 = 0;
            int i8 = i4;
            while (true) {
                c2546 = c2546Arr[i8];
                if (c2546 != null) {
                    i = c2546.f10078;
                    i6 += i;
                    if (i - c2546.f10075 < 0 && (abstractFutureC23009Arr = c2546.f10073) != null && (length2 = abstractFutureC23009Arr.length) > 0) {
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
            long j = (((long) ((length2 - 1) & i)) << f18547) + ((long) f18542);
            Unsafe unsafe = f18543;
            AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j);
            if (abstractFutureC23009 != null) {
                int i9 = i + 1;
                if (i == c2546.f10078 && C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC23009)) {
                    c2546.f10078 = i9;
                    return abstractFutureC23009;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006b  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m14878(AbstractFutureC23009 abstractFutureC23009) {
        int length;
        boolean z;
        boolean z2;
        int length2;
        int length3;
        int length4;
        C2546 c2546;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C18069) {
            C18069 c18069 = (C18069) threadCurrentThread;
            if (c18069.f57782 == this && (c2546 = c18069.f57783) != null) {
                c2546.m7931(abstractFutureC23009);
                return;
            }
        }
        int iM23148 = C8898.m23148();
        if (iM23148 == 0) {
            C8898.m23155();
            iM23148 = C8898.m23148();
        }
        int iM23149 = iM23148;
        while (true) {
            int i = this.f18558;
            C2546[] c2546Arr = this.f18560;
            if ((i & 262144) != 0 || c2546Arr == null || (length = c2546Arr.length) <= 0) {
                break;
            }
            C2546 c2547 = c2546Arr[(length - 1) & iM23149 & 126];
            if (c2547 == null) {
                String str = this.f18555;
                int i2 = (iM23149 | 1073741824) & (-65538);
                C2546 c2548 = new C2546(this, null);
                c2548.f10076 = i2;
                c2548.f10077 = 1073741824;
                c2548.f10079 = 1;
                if (str != null) {
                    synchronized (str) {
                        C2546[] c2546Arr2 = this.f18560;
                        if (c2546Arr2 == null || (length4 = c2546Arr2.length) <= 0) {
                            z = false;
                            z2 = false;
                        } else {
                            int i3 = i2 & (length4 - 1) & 126;
                            if (c2546Arr2[i3] == null) {
                                c2546Arr2[i3] = c2548;
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
                c2547 = c2548;
            } else if (c2547.m7932()) {
                int i4 = c2547.f10078;
                int i5 = c2547.f10075;
                AbstractFutureC23009[] abstractFutureC23009Arr = c2547.f10073;
                if (abstractFutureC23009Arr == null || (length2 = abstractFutureC23009Arr.length) <= 0) {
                    z2 = true;
                } else {
                    int i6 = length2 - 1;
                    int i7 = i4 - i5;
                    if (i6 + i7 > 0) {
                        abstractFutureC23009Arr[i6 & i5] = abstractFutureC23009;
                        c2547.f10075 = i5 + 1;
                        c2547.f10079 = 0;
                        if (i7 < 0 && c2547.f10078 - i5 < -1) {
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
                        c2547.m7929();
                        int i8 = c2547.f10075;
                        AbstractFutureC23009[] abstractFutureC23009Arr2 = c2547.f10073;
                        if (abstractFutureC23009Arr2 != null && (length3 = abstractFutureC23009Arr2.length) > 0) {
                            abstractFutureC23009Arr2[(length3 - 1) & i8] = abstractFutureC23009;
                            c2547.f10075 = i8 + 1;
                        }
                        c2547.f10079 = 0;
                    } catch (Throwable th) {
                        c2547.f10079 = 0;
                        throw th;
                    }
                }
                m14885();
                return;
            }
            iM23149 = C8898.m23149(iM23149);
        }
        throw new RejectedExecutionException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m14884(AbstractFutureC23009 abstractFutureC23009) {
        int length;
        C2546 c2546;
        int iM23148 = C8898.m23148();
        C2546[] c2546Arr = this.f18560;
        return c2546Arr != null && (length = c2546Arr.length) > 0 && (c2546 = c2546Arr[(iM23148 & (length - 1)) & 126]) != null && c2546.m7933(abstractFutureC23009);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14875(boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        int i5;
        while (true) {
            int i6 = this.f18558;
            if ((262144 & i6) != 0) {
                while (true) {
                    int i7 = this.f18558;
                    int i8 = 65535;
                    int i9 = 1;
                    if ((Integer.MIN_VALUE & i7) != 0) {
                        while ((this.f18558 & 524288) == 0) {
                            long j2 = 0;
                            while (true) {
                                long j3 = this.f18559;
                                C2546[] c2546Arr = this.f18560;
                                if (c2546Arr != null) {
                                    for (C2546 c2546 : c2546Arr) {
                                        if (c2546 != null) {
                                            C18069 c18069 = c2546.f10074;
                                            while (true) {
                                                AbstractFutureC23009 abstractFutureC23009M7934 = c2546.m7934();
                                                if (abstractFutureC23009M7934 == null) {
                                                    break;
                                                }
                                                if (abstractFutureC23009M7934.f74779 >= 0) {
                                                    try {
                                                        abstractFutureC23009M7934.cancel(false);
                                                    } catch (Throwable unused) {
                                                    }
                                                }
                                            }
                                            if (c18069 != null) {
                                                try {
                                                    c18069.interrupt();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            j3 += (((long) c2546.f10079) << 32) + ((long) c2546.f10078);
                                        }
                                    }
                                }
                                i = this.f18558;
                                i2 = i & 524288;
                                if (i2 != 0) {
                                    break;
                                }
                                if (this.f18560 == c2546Arr) {
                                    if (j2 == j3) {
                                        break;
                                    }
                                    j2 = j3;
                                }
                            }
                            if (i2 != 0 || (i & 65535) + ((short) (this.f18559 >>> 32)) > 0) {
                                break;
                            }
                            if (f18543.compareAndSwapInt(this, f18548, i, i | 524288)) {
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
                            long j5 = this.f18559;
                            C2546[] c2546Arr2 = this.f18560;
                            if ((i7 & i8) + ((int) (j5 >> 48)) > 0) {
                                i4 = Integer.MIN_VALUE;
                                j = j4;
                            } else if (c2546Arr2 != null) {
                                int i10 = 0;
                                while (true) {
                                    if (i10 < c2546Arr2.length) {
                                        C2546 c2547 = c2546Arr2[i10];
                                        if (c2547 != null) {
                                            int i11 = c2547.f10077;
                                            int i12 = c2547.f10079;
                                            int i13 = c2547.f10076;
                                            int i14 = c2547.f10078;
                                            if (i14 != c2547.f10075 || ((i13 & 1) == i9 && (i11 >= 0 || i12 >= 0))) {
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
                            i5 = this.f18558;
                            if ((i5 & i4) != 0) {
                                break;
                            }
                            if (i9 != 0) {
                                return false;
                            }
                            if (this.f18560 != c2546Arr2) {
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
                        f18543.compareAndSwapInt(this, f18548, i3, i3 | i4);
                    }
                }
            } else {
                if (!z2 || this == f18546) {
                    return false;
                }
                f18543.compareAndSwapInt(this, f18548, i6, i6 | 262144);
            }
        }
    }

    public C5369() {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        int iAvailableProcessors = -1;
        InterfaceC2901 c13837 = null;
        try {
            String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism");
            iAvailableProcessors = property != null ? Integer.parseInt(property) : -1;
            String property2 = System.getProperty("java.util.concurrent.ForkJoinPool.common.threadFactory");
            InterfaceC2901 interfaceC2901 = (InterfaceC2901) (property2 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property2).getConstructor(null).newInstance(null));
            try {
                String property3 = System.getProperty("java.util.concurrent.ForkJoinPool.common.exceptionHandler");
                uncaughtExceptionHandler = (Thread.UncaughtExceptionHandler) (property3 == null ? null : ClassLoader.getSystemClassLoader().loadClass(property3).getConstructor(null).newInstance(null));
            } catch (Exception unused) {
                uncaughtExceptionHandler = null;
            }
            c13837 = interfaceC2901;
        } catch (Exception unused2) {
            uncaughtExceptionHandler = null;
        }
        if (c13837 == null) {
            if (System.getSecurityManager() == null) {
                c13837 = f18550;
            } else {
                c13837 = new C13837();
            }
        }
        if (iAvailableProcessors < 0 && (iAvailableProcessors = Runtime.getRuntime().availableProcessors() - 1) <= 0) {
            iAvailableProcessors = 1;
        }
        iAvailableProcessors = iAvailableProcessors > 32767 ? EnumC23529.f76192 : iAvailableProcessors;
        long j = -iAvailableProcessors;
        long j2 = ((j << 48) & (-281474976710656L)) | ((j << 32) & 281470681743360L);
        int i = ((1 - iAvailableProcessors) & 65535) | (f18544 << 16);
        int i2 = iAvailableProcessors > 1 ? iAvailableProcessors - 1 : 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        this.f18555 = "FJPool.commonPool-worker-";
        this.f18560 = new C2546[((i6 | (i6 >>> 16)) + 1) << 1];
        this.f18551 = c13837;
        this.f18553 = uncaughtExceptionHandler;
        this.f18554 = 60000L;
        this.f18556 = i;
        this.f18558 = iAvailableProcessors;
        this.f18559 = j2;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        RunnableFutureC22303 runnableFutureC22303 = new RunnableFutureC22303(callable);
        m14878(runnableFutureC22303);
        return runnableFutureC22303;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        RunnableFutureC1135 runnableFutureC1135 = new RunnableFutureC1135(runnable, obj);
        m14878(runnableFutureC1135);
        return runnableFutureC1135;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        try {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                RunnableFutureC22303 runnableFutureC22303 = new RunnableFutureC22303((Callable) it.next());
                arrayList.add(runnableFutureC22303);
                m14878(runnableFutureC22303);
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractFutureC23009) arrayList.get(i)).m50892();
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
        long j2 = this.f18552;
        C2546[] c2546Arr = this.f18560;
        long j3 = 0;
        if (c2546Arr != null) {
            j = 0;
            i = 0;
            for (int i2 = 0; i2 < c2546Arr.length; i2++) {
                C2546 c2546 = c2546Arr[i2];
                if (c2546 != null) {
                    int i3 = c2546.f10078 - c2546.f10075;
                    int i4 = i3 >= 0 ? 0 : -i3;
                    if ((i2 & 1) == 0) {
                        j += (long) i4;
                    } else {
                        j3 += (long) i4;
                        j2 += ((long) c2546.f10071) & 4294967295L;
                        C18069 c18069 = c2546.f10074;
                        if (c18069 != null && (state = c18069.getState()) != Thread.State.BLOCKED && state != Thread.State.WAITING && state != Thread.State.TIMED_WAITING) {
                            i++;
                        }
                    }
                }
            }
        } else {
            i = 0;
            j = 0;
        }
        int i5 = this.f18558;
        int i6 = 65535 & i5;
        long j4 = this.f18559;
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
        ASN1BMPString$$ExternalSyntheticOutline0.m(sb, super.toString(), "[", str, ", parallelism = ");
        C23821.m52500(sb, i6, ", size = ", i7, ", active = ");
        C23821.m52500(sb, i9, ", running = ", i, ", steals = ");
        sb.append(j2);
        sb.append(", tasks = ");
        sb.append(j3);
        sb.append(", submissions = ");
        return C15037.m36023(sb, j, "]");
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return (this.f18558 & 524288) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return (this.f18558 & 262144) != 0;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        boolean z;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this != f18546) {
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
            if (threadCurrentThread instanceof C18069) {
                C18069 c18069 = (C18069) threadCurrentThread;
                if (c18069.f57782 == this) {
                    m14882(c18069.f57783);
                    return false;
                }
            }
            long jNanoTime2 = System.nanoTime();
            while (true) {
                AbstractFutureC23009 abstractFutureC23009M14879 = m14879();
                if (abstractFutureC23009M14879 != null) {
                    abstractFutureC23009M14879.m50893();
                } else {
                    while (true) {
                        long j2 = this.f18559;
                        int i = this.f18558;
                        int i2 = 65535 & i;
                        int i3 = ((short) (j2 >>> 32)) + i2;
                        int i4 = i2 + ((int) (j2 >> 48));
                        if ((i & (-2146959360)) == 0) {
                            if (i4 <= 0) {
                                C2546[] c2546Arr = this.f18560;
                                if (c2546Arr != null) {
                                    int i5 = 1;
                                    while (true) {
                                        if (i5 < c2546Arr.length) {
                                            C2546 c2546 = c2546Arr[i5];
                                            if (c2546 != null) {
                                                if ((c2546.f10077 & 1073741824) != 0) {
                                                    i3--;
                                                }
                                            }
                                            i5 += 2;
                                        }
                                    }
                                }
                                if (i3 != 0 || this.f18559 != j2) {
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
    public static void m14874(C18424 c18424) {
        C18069 c18069;
        C5369 c5369;
        C2546 c2546;
        long j = c18424.f58745;
        long j2 = f18549;
        Thread threadCurrentThread = Thread.currentThread();
        long j3 = 0;
        if ((threadCurrentThread instanceof C18069) && (c5369 = (c18069 = (C18069) threadCurrentThread).f57782) != null && (c2546 = c18069.f57783) != null) {
            while (!c18424.m42746()) {
                int iM14876 = c5369.m14876(c2546);
                if (iM14876 != 0) {
                    try {
                        if (!c18424.m42746()) {
                            while (!c18424.m42746()) {
                                if (j == 0) {
                                    LockSupport.park(c18424);
                                } else {
                                    LockSupport.parkNanos(c18424, c18424.f58743);
                                }
                            }
                        }
                        return;
                    } finally {
                        m14872(c5369, j2, iM14876 > 0 ? 281474976710656L : 0L);
                    }
                }
            }
            return;
        }
        if (c18424.m42746()) {
            return;
        }
        while (!c18424.m42746()) {
            if (j == 0) {
                LockSupport.park(c18424);
            } else {
                LockSupport.parkNanos(c18424, c18424.f58743);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14873(Executor executor, C18424 c18424) {
        int iM23148;
        C2546 c2546;
        C2546[] c2546Arr;
        int length;
        int i;
        int length2;
        if (!(executor instanceof C5369)) {
            return;
        }
        C5369 c5369 = (C5369) executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread instanceof C18069) {
            C18069 c18069 = (C18069) threadCurrentThread;
            if (c18069.f57782 == c5369) {
                c2546 = c18069.f57783;
            } else {
                iM23148 = C8898.m23148();
                if (iM23148 != 0 || (c2546Arr = c5369.f18560) == null || (length = c2546Arr.length) <= 0) {
                    c2546 = null;
                } else {
                    c2546 = c2546Arr[iM23148 & (length - 1) & 126];
                }
            }
        } else {
            iM23148 = C8898.m23148();
            if (iM23148 != 0) {
                c2546 = null;
            } else {
                c2546 = null;
            }
        }
        if (c2546 == null) {
            return;
        }
        while (true) {
            int i2 = c2546.f10078;
            int i3 = c2546.f10075;
            AbstractFutureC23009[] abstractFutureC23009Arr = c2546.f10073;
            if (abstractFutureC23009Arr == null || (i = i2 - i3) >= 0 || (length2 = abstractFutureC23009Arr.length) <= 0) {
                return;
            }
            long j = (((long) ((length2 - 1) & i2)) << f18547) + ((long) f18542);
            Unsafe unsafe = f18543;
            AbstractFutureC23009 abstractFutureC23009 = (AbstractFutureC23009) unsafe.getObjectVolatile(abstractFutureC23009Arr, j);
            if (c18424.m42746()) {
                return;
            }
            int i4 = i2 + 1;
            if (i2 == c2546.f10078) {
                if (abstractFutureC23009 == null) {
                    if (i == -1) {
                        return;
                    }
                } else {
                    if (!(abstractFutureC23009 instanceof InterfaceC6429)) {
                        return;
                    }
                    if (C23364.m51478(unsafe, abstractFutureC23009Arr, j, abstractFutureC23009)) {
                        c2546.f10078 = i4;
                        abstractFutureC23009.m50893();
                    }
                }
            }
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new RunnableFutureC1135(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new RunnableFutureC22303(callable);
    }

    static {
        Unsafe unsafe = C10309.f35350;
        f18543 = unsafe;
        try {
            f18549 = unsafe.objectFieldOffset(C5369.class.getDeclaredField("᩶"));
            f18548 = unsafe.objectFieldOffset(C5369.class.getDeclaredField("ܿ"));
            f18542 = unsafe.arrayBaseOffset(AbstractFutureC23009[].class);
            int iArrayIndexScale = unsafe.arrayIndexScale(AbstractFutureC23009[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new ExceptionInInitializerError("array index scale not a power of two");
            }
            f18547 = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
            int i = 256;
            try {
                String property = System.getProperty("java.util.concurrent.ForkJoinPool.common.maximumSpares");
                if (property != null) {
                    i = Integer.parseInt(property);
                }
            } catch (Exception unused) {
            }
            f18544 = i;
            f18550 = new C9253();
            f18541 = new RuntimePermission("modifyThread");
            C5369 c5369 = (C5369) AccessController.doPrivileged(new C14192());
            f18546 = c5369;
            f18545 = Math.max(c5369.f18558 & 65535, 1);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
