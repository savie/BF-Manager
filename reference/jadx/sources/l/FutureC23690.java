package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.᩹ܽ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes.dex */
public final class FutureC23690 implements Future, InterfaceC20706 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final long f76809;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Unsafe f76810;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final C9495 f76811 = new C9495(null);

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final boolean f76812;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final long f76813;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final Executor f76814;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final long f76815;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public volatile Object f76816;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile AbstractRunnableC11009 f76817;

    @Override // l.InterfaceC20706
    /* JADX INFO: renamed from: ۙ */
    public final FutureC23690 mo47379() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52942(AbstractRunnableC11009 abstractRunnableC11009) {
        AbstractRunnableC11009 abstractRunnableC110010 = this.f76817;
        m52923(abstractRunnableC11009, abstractRunnableC110010);
        return C19192.m44463(f76810, this, f76813, abstractRunnableC110010, abstractRunnableC11009);
    }

    static {
        Executor executorC19960;
        boolean z = C10263.f32769 > 1;
        f76812 = z;
        if (!z) {
            executorC19960 = new ExecutorC19960();
        } else {
            executorC19960 = C10263.f32776;
        }
        f76814 = executorC19960;
        Unsafe unsafe = C5746.f19778;
        f76810 = unsafe;
        try {
            f76815 = unsafe.objectFieldOffset(FutureC23690.class.getDeclaredField("ܰ"));
            f76813 = unsafe.objectFieldOffset(FutureC23690.class.getDeclaredField("᩶"));
            f76809 = unsafe.objectFieldOffset(AbstractRunnableC11009.class.getDeclaredField("֨"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m52944() {
        C1293.m4686(f76810, this, f76815);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m52945(Object obj) {
        Unsafe unsafe = f76810;
        if (obj == null) {
            obj = f76811;
        }
        return C10241.m26374(unsafe, this, f76815, obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static C9495 m52924(Throwable th) {
        if (!(th instanceof C3552)) {
            th = new C3552(th);
        }
        return new C9495(th);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52952(Throwable th) {
        C10241.m26374(f76810, this, f76815, m52924(th));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Object m52927(Object obj, Throwable th) {
        if (!(th instanceof C3552)) {
            th = new C3552(th);
        } else if ((obj instanceof C9495) && th == ((C9495) obj).f30768) {
            return obj;
        }
        return new C9495(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52936(Object obj, Throwable th) {
        C10241.m26374(f76810, this, f76815, m52927(obj, th));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52951(Object obj) {
        Throwable th;
        Unsafe unsafe = f76810;
        if ((obj instanceof C9495) && (th = ((C9495) obj).f30768) != null && !(th instanceof C3552)) {
            obj = new C9495(new C3552(th));
        }
        C10241.m26374(unsafe, this, f76815, obj);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static Object m52926(Object obj) throws ExecutionException, InterruptedException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        }
        if (!(obj instanceof C9495)) {
            return obj;
        }
        Throwable th = ((C9495) obj).f30768;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if ((th instanceof C3552) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new ExecutionException(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52920(C19762 c19762, Executor executor) {
        if (f76812 || executor != C10263.f32776) {
            executor.getClass();
        } else {
            executor = f76814;
        }
        FutureC23690 futureC23690 = new FutureC23690();
        RunnableC8750 runnableC8750 = new RunnableC8750();
        runnableC8750.f28454 = futureC23690;
        runnableC8750.f28455 = c19762;
        executor.execute(runnableC8750);
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52925(Runnable runnable, Executor executor) {
        if (f76812 || executor != C10263.f32776) {
            executor.getClass();
        } else {
            executor = f76814;
        }
        FutureC23690 futureC23690 = new FutureC23690();
        RunnableC2784 runnableC2784 = new RunnableC2784();
        runnableC2784.f9173 = futureC23690;
        runnableC2784.f9174 = runnable;
        executor.execute(runnableC2784);
        return futureC23690;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52948(Runnable runnable, Executor executor) {
        if (f76812 || executor != C10263.f32776) {
            executor.getClass();
        } else {
            executor = f76814;
        }
        return m52929(runnable, executor);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m52923(AbstractRunnableC11009 abstractRunnableC11009, AbstractRunnableC11009 abstractRunnableC110010) {
        f76810.putOrderedObject(abstractRunnableC11009, f76809, abstractRunnableC110010);
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m52946() {
        while (true) {
            FutureC23690 futureC23690Mo7115 = this;
            while (true) {
                AbstractRunnableC11009 abstractRunnableC11009 = futureC23690Mo7115.f76817;
                if (abstractRunnableC11009 == null) {
                    if (futureC23690Mo7115 == this || (abstractRunnableC11009 = this.f76817) == null) {
                        return;
                    } else {
                        futureC23690Mo7115 = this;
                    }
                }
                AbstractRunnableC11009 abstractRunnableC110010 = abstractRunnableC11009;
                AbstractRunnableC11009 abstractRunnableC110011 = abstractRunnableC110010.f34773;
                Unsafe unsafe = f76810;
                if (C19192.m44463(unsafe, futureC23690Mo7115, f76813, abstractRunnableC110010, abstractRunnableC110011)) {
                    if (abstractRunnableC110011 != null) {
                        if (futureC23690Mo7115 != this) {
                            while (!m52942(abstractRunnableC110010)) {
                            }
                        } else {
                            C19958.m45882(unsafe, abstractRunnableC110010, f76809, abstractRunnableC110011, null);
                        }
                    }
                    futureC23690Mo7115 = abstractRunnableC110010.mo7115(-1);
                    if (futureC23690Mo7115 == null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52950() {
        AbstractRunnableC11009 abstractRunnableC11009;
        boolean zM44463 = false;
        while (true) {
            abstractRunnableC11009 = this.f76817;
            if (abstractRunnableC11009 == null || abstractRunnableC11009.mo16890()) {
                break;
            }
            zM44463 = C19192.m44463(f76810, this, f76813, abstractRunnableC11009, abstractRunnableC11009.f34773);
        }
        if (abstractRunnableC11009 == null || zM44463) {
            return;
        }
        AbstractRunnableC11009 abstractRunnableC110010 = abstractRunnableC11009.f34773;
        AbstractRunnableC11009 abstractRunnableC110011 = abstractRunnableC11009;
        while (abstractRunnableC110010 != null) {
            AbstractRunnableC11009 abstractRunnableC110012 = abstractRunnableC110010.f34773;
            if (!abstractRunnableC110010.mo16890()) {
                C19958.m45882(f76810, abstractRunnableC110011, f76809, abstractRunnableC110010, abstractRunnableC110012);
                return;
            } else {
                abstractRunnableC110011 = abstractRunnableC110010;
                abstractRunnableC110010 = abstractRunnableC110012;
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52953(AbstractRunnableC11009 abstractRunnableC11009) {
        while (!m52942(abstractRunnableC11009)) {
            if (this.f76816 != null) {
                m52923(abstractRunnableC11009, (AbstractRunnableC11009) null);
                break;
            }
        }
        if (this.f76816 != null) {
            abstractRunnableC11009.mo7115(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52934(FutureC23690 futureC23690, int i) {
        if (futureC23690 != null && futureC23690.f76817 != null) {
            Object obj = futureC23690.f76816;
            if (obj == null) {
                futureC23690.m52950();
            }
            if (i >= 0 && (obj != null || futureC23690.f76816 != null)) {
                futureC23690.m52946();
            }
        }
        if (this.f76816 == null || this.f76817 == null) {
            return null;
        }
        if (i < 0) {
            return this;
        }
        m52946();
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52949(InterfaceC25138 interfaceC25138) {
        Object obj = this.f76816;
        if (obj != null) {
            FutureC23690 futureC23690 = new FutureC23690();
            if (obj instanceof C9495) {
                Throwable th = ((C9495) obj).f30768;
                if (th != null) {
                    futureC23690.f76816 = m52927(obj, th);
                    return futureC23690;
                }
                obj = null;
            }
            try {
                Object objApply = interfaceC25138.apply(obj);
                if (objApply == null) {
                    objApply = f76811;
                }
                futureC23690.f76816 = objApply;
                return futureC23690;
            } catch (Throwable th2) {
                futureC23690.f76816 = m52924(th2);
                return futureC23690;
            }
        }
        FutureC23690 futureC23691 = new FutureC23690();
        C13247 c13247 = new C13247(null, futureC23691, this);
        c13247.f42328 = interfaceC25138;
        m52953((AbstractRunnableC11009) c13247);
        return futureC23691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52932(C8227 c8227) {
        Object obj = this.f76816;
        if (obj != null) {
            FutureC23690 futureC23690 = new FutureC23690();
            if (obj instanceof C9495) {
                Throwable th = ((C9495) obj).f30768;
                if (th != null) {
                    futureC23690.f76816 = m52927(obj, th);
                    return futureC23690;
                }
                obj = null;
            }
            try {
                c8227.m22132(obj);
                futureC23690.f76816 = f76811;
                return futureC23690;
            } catch (Throwable th2) {
                futureC23690.f76816 = m52924(th2);
                return futureC23690;
            }
        }
        FutureC23690 futureC23691 = new FutureC23690();
        C15484 c15484 = new C15484(null, futureC23691, this);
        c15484.f50404 = c8227;
        m52953((AbstractRunnableC11009) c15484);
        return futureC23691;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private FutureC23690 m52929(Runnable runnable, Executor executor) {
        Throwable th;
        Object obj = this.f76816;
        if (obj != null) {
            FutureC23690 futureC23690 = new FutureC23690();
            if ((obj instanceof C9495) && (th = ((C9495) obj).f30768) != null) {
                futureC23690.f76816 = m52927(obj, th);
                return futureC23690;
            }
            try {
                if (executor != null) {
                    executor.execute(new C17722(null, futureC23690, this, runnable));
                    return futureC23690;
                }
                runnable.run();
                futureC23690.f76816 = f76811;
                return futureC23690;
            } catch (Throwable th2) {
                futureC23690.f76816 = m52924(th2);
                return futureC23690;
            }
        }
        FutureC23690 futureC23691 = new FutureC23690();
        m52953((AbstractRunnableC11009) new C17722(executor, futureC23691, this, runnable));
        return futureC23691;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52939(Object obj, InterfaceC2017 interfaceC2017, C16230 c16230) {
        Throwable th;
        if (this.f76816 == null) {
            Throwable th2 = null;
            Object obj2 = null;
            if (c16230 != null) {
                try {
                    if (!c16230.m16889()) {
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (th2 != null) {
                        th = th2;
                    }
                    m52936(obj, th);
                    return true;
                }
            }
            if (obj instanceof C9495) {
                th = ((C9495) obj).f30768;
            } else {
                th = null;
                obj2 = obj;
            }
            try {
                interfaceC2017.mo1355(obj2, th);
                if (th == null) {
                    C10241.m26374(f76810, this, f76815, obj);
                    return true;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                th = th;
                if (th2 != null) {
                    th = th2;
                }
            }
            m52936(obj, th);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52940(Object obj, InterfaceC11711 interfaceC11711, C25182 c25182) {
        if (this.f76816 != null) {
            return true;
        }
        if (c25182 != null) {
            try {
                if (!c25182.m16889()) {
                    return false;
                }
            } catch (Throwable th) {
                m52952(th);
                return true;
            }
        }
        Throwable th2 = null;
        if (obj instanceof C9495) {
            th2 = ((C9495) obj).f30768;
            obj = null;
        }
        m52945(interfaceC11711.mo14221(obj, th2));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52941(Object obj, InterfaceC25138 interfaceC25138, C11755 c11755) {
        Throwable th;
        if (this.f76816 != null) {
            return true;
        }
        if (c11755 != null) {
            try {
                if (!c11755.m16889()) {
                    return false;
                }
            } catch (Throwable th2) {
                m52952(th2);
                return true;
            }
        }
        if (!(obj instanceof C9495) || (th = ((C9495) obj).f30768) == null) {
            C10241.m26374(f76810, this, f76815, obj);
            return true;
        }
        m52945(interfaceC25138.apply(th));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52922(FutureC23690[] futureC23690Arr, int i, int i2) {
        FutureC23690 futureC23690M52922;
        FutureC23690 futureC23690M52923;
        Object obj;
        Throwable th;
        C9495 c9495 = f76811;
        FutureC23690 futureC23690 = new FutureC23690();
        if (i > i2) {
            futureC23690.f76816 = c9495;
            return futureC23690;
        }
        int i3 = (i + i2) >>> 1;
        if (i == i3) {
            futureC23690M52922 = futureC23690Arr[i];
        } else {
            futureC23690M52922 = m52922(futureC23690Arr, i, i3);
        }
        if (futureC23690M52922 == null) {
            throw null;
        }
        if (i == i2) {
            futureC23690M52923 = futureC23690M52922;
        } else {
            int i4 = i3 + 1;
            futureC23690M52923 = i2 == i4 ? futureC23690Arr[i2] : m52922(futureC23690Arr, i4, i2);
        }
        if (futureC23690M52923 == null) {
            throw null;
        }
        Object obj2 = futureC23690M52922.f76816;
        if (obj2 == null || (obj = futureC23690M52923.f76816) == null) {
            C5044 c5044 = new C5044(null, futureC23690, futureC23690M52922);
            c5044.f44300 = futureC23690M52923;
            while (futureC23690M52922.f76816 == null) {
                if (futureC23690M52922.m52942((AbstractRunnableC11009) c5044)) {
                    if (futureC23690M52923.f76816 == null) {
                        C22198 c22198 = new C22198();
                        c22198.f71524 = c5044;
                        futureC23690M52923.m52953((AbstractRunnableC11009) c22198);
                        return futureC23690;
                    }
                    if (futureC23690M52922.f76816 != null) {
                        c5044.mo7115(0);
                    }
                    return futureC23690;
                }
            }
            futureC23690M52923.m52953((AbstractRunnableC11009) c5044);
            return futureC23690;
        }
        if (!(obj2 instanceof C9495) || (th = ((C9495) obj2).f30768) == null) {
            if (!(obj instanceof C9495) || (th = ((C9495) obj).f30768) == null) {
                futureC23690.f76816 = c9495;
                return futureC23690;
            }
            obj2 = obj;
        }
        futureC23690.f76816 = m52927(obj2, th);
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m52918(boolean z) {
        if (z && Thread.interrupted()) {
            return null;
        }
        boolean zM52942 = false;
        C22944 c22944 = null;
        while (true) {
            Object obj = this.f76816;
            if (obj != null) {
                if (c22944 != null) {
                    c22944.f74552 = null;
                    if (c22944.f74548) {
                        Thread.currentThread().interrupt();
                    }
                }
                m52946();
                return obj;
            }
            if (c22944 == null) {
                c22944 = new C22944(0L, 0L, z);
                if (Thread.currentThread() instanceof C10965) {
                    C10263.m26457(f76814, c22944);
                }
            } else if (!zM52942) {
                zM52942 = m52942((AbstractRunnableC11009) c22944);
            } else {
                if (z && c22944.f74548) {
                    c22944.f74552 = null;
                    m52950();
                    return null;
                }
                try {
                    C10263.m26458(c22944);
                } catch (InterruptedException unused) {
                    c22944.f74548 = true;
                }
            }
        }
    }

    public FutureC23690() {
    }

    public FutureC23690(Object obj) {
        this.f76816 = obj;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52928(Object obj) {
        if (obj == null) {
            obj = f76811;
        }
        return new FutureC23690(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f76816 != null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object objM52918 = this.f76816;
        if (objM52918 == null) {
            objM52918 = m52918(true);
        }
        return m52926(objM52918);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        Object obj;
        long nanos = timeUnit.toNanos(j);
        Object obj2 = this.f76816;
        if (obj2 == null) {
            long jNanoTime = System.nanoTime() + nanos;
            long j2 = 0;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            boolean z = false;
            C22944 c22944 = null;
            Object obj3 = null;
            boolean zM52942 = false;
            while (true) {
                if (!z) {
                    boolean zInterrupted = Thread.interrupted();
                    if (zInterrupted) {
                        obj2 = obj3;
                    } else {
                        Object obj4 = this.f76816;
                        if (obj4 == null && nanos > j2) {
                            if (c22944 == null) {
                                obj = obj4;
                                C22944 c22945 = new C22944(nanos, jNanoTime, true);
                                if (Thread.currentThread() instanceof C10965) {
                                    C10263.m26457(f76814, c22945);
                                }
                                c22944 = c22945;
                            } else {
                                obj = obj4;
                                if (!zM52942) {
                                    zM52942 = m52942((AbstractRunnableC11009) c22944);
                                } else {
                                    try {
                                        C10263.m26458(c22944);
                                        z = c22944.f74548;
                                        nanos = c22944.f74549;
                                    } catch (InterruptedException unused) {
                                        z = true;
                                    }
                                    obj3 = obj;
                                }
                                j2 = 0;
                            }
                            obj3 = obj;
                            z = zInterrupted;
                            j2 = 0;
                        } else {
                            obj2 = obj4;
                        }
                    }
                    z = zInterrupted;
                    break;
                }
                obj2 = obj3;
                break;
            }
            if (c22944 != null) {
                c22944.f74552 = null;
                if (obj2 == null) {
                    m52950();
                }
            }
            if (obj2 != null) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m52946();
            } else {
                if (!z) {
                    throw new TimeoutException();
                }
                obj2 = null;
            }
        }
        return m52926(obj2);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Object m52947() {
        Object objM52918 = this.f76816;
        if (objM52918 == null) {
            objM52918 = m52918(false);
        }
        if (!(objM52918 instanceof C9495)) {
            return objM52918;
        }
        Throwable th = ((C9495) objM52918).f30768;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if (th instanceof C3552) {
            throw ((C3552) th);
        }
        throw new C3552(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52935(Object obj) {
        m52945(obj);
        m52946();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52937(Throwable th) {
        th.getClass();
        C10241.m26374(f76810, this, f76815, new C9495(th));
        m52946();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52930(Runnable runnable) {
        return m52929(runnable, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52921(FutureC23690... futureC23690Arr) {
        return m52922(futureC23690Arr, 0, futureC23690Arr.length - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        if (this.f76816 == null) {
            if (C10241.m26374(f76810, this, f76815, new C9495(new CancellationException()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        m52946();
        return z2 || isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object obj = this.f76816;
        return (obj instanceof C9495) && (((C9495) obj).f30768 instanceof CancellationException);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m52954() {
        Object obj = this.f76816;
        return (obj instanceof C9495) && obj != f76811;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final String toString() {
        String strM34864;
        Object obj = this.f76816;
        int i = 0;
        for (AbstractRunnableC11009 abstractRunnableC11009 = this.f76817; abstractRunnableC11009 != null; abstractRunnableC11009 = abstractRunnableC11009.f34773) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj == null) {
            strM34864 = i == 0 ? "[Not completed]" : C14442.m34864(i, "[Not completed, ", " dependents]");
        } else if (obj instanceof C9495) {
            C9495 c9495 = (C9495) obj;
            if (c9495.f30768 != null) {
                strM34864 = "[Completed exceptionally: " + c9495.f30768 + "]";
            } else {
                strM34864 = "[Completed normally]";
            }
        } else {
            strM34864 = "[Completed normally]";
        }
        sb.append(strM34864);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52931(InterfaceC2017 interfaceC2017) {
        FutureC23690 futureC23690 = new FutureC23690();
        Object obj = this.f76816;
        if (obj == null) {
            C16230 c16230 = new C16230(null, futureC23690, this);
            c16230.f52722 = interfaceC2017;
            m52953((AbstractRunnableC11009) c16230);
            return futureC23690;
        }
        futureC23690.m52939(obj, interfaceC2017, (C16230) null);
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52933(InterfaceC11711 interfaceC11711) {
        FutureC23690 futureC23690 = new FutureC23690();
        Object obj = this.f76816;
        if (obj == null) {
            C25182 c25182 = new C25182(null, futureC23690, this);
            c25182.f81394 = interfaceC11711;
            m52953((AbstractRunnableC11009) c25182);
            return futureC23690;
        }
        futureC23690.m52940(obj, interfaceC11711, (C25182) null);
        return futureC23690;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52938(InterfaceC25138 interfaceC25138) {
        FutureC23690 futureC23690 = new FutureC23690();
        Object obj = this.f76816;
        if (obj == null) {
            C11755 c11755 = new C11755(null, futureC23690, this);
            c11755.f38003 = interfaceC25138;
            m52953((AbstractRunnableC11009) c11755);
            return;
        }
        futureC23690.m52941(obj, interfaceC25138, (C11755) null);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final FutureC23690 m52943(InterfaceC25138 interfaceC25138) {
        Throwable th;
        FutureC23690 futureC23690 = new FutureC23690();
        Object obj = this.f76816;
        if (obj == null) {
            C2061 c2061 = new C2061(null, futureC23690, this);
            c2061.f6859 = interfaceC25138;
            m52953((AbstractRunnableC11009) c2061);
            return futureC23690;
        }
        if (obj instanceof C9495) {
            Throwable th2 = ((C9495) obj).f30768;
            if (th2 != null) {
                futureC23690.f76816 = m52927(obj, th2);
                return futureC23690;
            }
            obj = null;
        }
        try {
            FutureC23690 futureC23690Mo47379 = ((InterfaceC20706) interfaceC25138.apply(obj)).mo47379();
            Object c9495 = futureC23690Mo47379.f76816;
            if (c9495 != null) {
                if ((c9495 instanceof C9495) && (th = ((C9495) c9495).f30768) != null && !(th instanceof C3552)) {
                    c9495 = new C9495(new C3552(th));
                }
                futureC23690.f76816 = c9495;
                return futureC23690;
            }
            futureC23690Mo47379.m52953((AbstractRunnableC11009) new C16976(null, futureC23690, futureC23690Mo47379));
            return futureC23690;
        } catch (Throwable th3) {
            futureC23690.f76816 = m52924(th3);
            return futureC23690;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC23690 m52919(IllegalStateException illegalStateException) {
        return new FutureC23690(new C9495(illegalStateException));
    }
}
