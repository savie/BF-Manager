package l;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: l.۫֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I6PU */
/* JADX INFO: loaded from: classes4.dex */
public final class FutureC12075 implements Future, InterfaceC5724 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final Executor f40411;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final long f40412;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Unsafe f40413;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C0784 f40414 = new C0784(null);

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final long f40415;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final long f40416;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final boolean f40417;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public volatile Object f40418;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile AbstractRunnableC17718 f40419;

    @Override // l.InterfaceC5724
    /* JADX INFO: renamed from: ۙ */
    public final FutureC12075 mo15778() {
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30026(AbstractRunnableC17718 abstractRunnableC17718) {
        AbstractRunnableC17718 abstractRunnableC17719 = this.f40419;
        m30008(abstractRunnableC17718, abstractRunnableC17719);
        return C2195.m6810(f40413, this, f40412, abstractRunnableC17719, abstractRunnableC17718);
    }

    static {
        Executor executorC7841;
        boolean z = C5369.f18545 > 1;
        f40417 = z;
        if (!z) {
            executorC7841 = new ExecutorC7841();
        } else {
            executorC7841 = C5369.f18546;
        }
        f40411 = executorC7841;
        Unsafe unsafe = C10309.f35350;
        f40413 = unsafe;
        try {
            f40416 = unsafe.objectFieldOffset(FutureC12075.class.getDeclaredField("ܺ"));
            f40412 = unsafe.objectFieldOffset(FutureC12075.class.getDeclaredField("᩶"));
            f40415 = unsafe.objectFieldOffset(AbstractRunnableC17718.class.getDeclaredField("ۧ"));
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m30029() {
        C21952.m48782(f40413, this, f40416);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m30030(Object obj) {
        Unsafe unsafe = f40413;
        if (obj == null) {
            obj = f40414;
        }
        return C5018.m13911(unsafe, this, f40416, obj);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C0784 m30010(Throwable th) {
        if (!(th instanceof C17013)) {
            th = new C17013(th);
        }
        return new C0784(th);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30035(Throwable th) {
        C5018.m13911(f40413, this, f40416, m30010(th));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Object m30012(Object obj, Throwable th) {
        if (!(th instanceof C17013)) {
            th = new C17013(th);
        } else if ((obj instanceof C0784) && th == ((C0784) obj).f3363) {
            return obj;
        }
        return new C0784(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30020(Object obj, Throwable th) {
        C5018.m13911(f40413, this, f40416, m30012(obj, th));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30034(Object obj) {
        Throwable th;
        Unsafe unsafe = f40413;
        if ((obj instanceof C0784) && (th = ((C0784) obj).f3363) != null && !(th instanceof C17013)) {
            obj = new C0784(new C17013(th));
        }
        C5018.m13911(unsafe, this, f40416, obj);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static Object m30009(Object obj) throws ExecutionException, InterruptedException {
        Throwable cause;
        if (obj == null) {
            throw new InterruptedException();
        }
        if (!(obj instanceof C0784)) {
            return obj;
        }
        Throwable th = ((C0784) obj).f3363;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if ((th instanceof C17013) && (cause = th.getCause()) != null) {
            th = cause;
        }
        throw new ExecutionException(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30004(C17818 c17818, Executor executor) {
        if (f40417 || executor != C5369.f18546) {
            executor.getClass();
        } else {
            executor = f40411;
        }
        FutureC12075 futureC12075 = new FutureC12075();
        RunnableC3606 runnableC3606 = new RunnableC3606();
        runnableC3606.f13260 = futureC12075;
        runnableC3606.f13261 = c17818;
        executor.execute(runnableC3606);
        return futureC12075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30005(RunnableC19331 runnableC19331, ThreadPoolExecutor threadPoolExecutor) {
        Executor executor;
        if (f40417 || threadPoolExecutor != C5369.f18546) {
            threadPoolExecutor.getClass();
            executor = threadPoolExecutor;
        } else {
            executor = f40411;
        }
        FutureC12075 futureC12075 = new FutureC12075();
        RunnableC12780 runnableC12780 = new RunnableC12780();
        runnableC12780.f42599 = futureC12075;
        runnableC12780.f42600 = runnableC19331;
        executor.execute(runnableC12780);
        return futureC12075;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30031(Runnable runnable, Executor executor) {
        if (f40417 || executor != C5369.f18546) {
            executor.getClass();
        } else {
            executor = f40411;
        }
        return m30011(runnable, executor);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m30008(AbstractRunnableC17718 abstractRunnableC17718, AbstractRunnableC17718 abstractRunnableC17719) {
        f40413.putOrderedObject(abstractRunnableC17718, f40415, abstractRunnableC17719);
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m30037() {
        while (true) {
            FutureC12075 futureC12075Mo1013 = this;
            while (true) {
                AbstractRunnableC17718 abstractRunnableC17718 = futureC12075Mo1013.f40419;
                if (abstractRunnableC17718 == null) {
                    if (futureC12075Mo1013 == this || (abstractRunnableC17718 = this.f40419) == null) {
                        return;
                    } else {
                        futureC12075Mo1013 = this;
                    }
                }
                AbstractRunnableC17718 abstractRunnableC17719 = abstractRunnableC17718;
                AbstractRunnableC17718 abstractRunnableC177110 = abstractRunnableC17719.f56253;
                Unsafe unsafe = f40413;
                if (C2195.m6810(unsafe, futureC12075Mo1013, f40412, abstractRunnableC17719, abstractRunnableC177110)) {
                    if (abstractRunnableC177110 != null) {
                        if (futureC12075Mo1013 != this) {
                            while (!m30026(abstractRunnableC17719)) {
                            }
                        } else {
                            C3860.m11180(unsafe, abstractRunnableC17719, f40415, abstractRunnableC177110, null);
                        }
                    }
                    futureC12075Mo1013 = abstractRunnableC17719.mo1013(-1);
                    if (futureC12075Mo1013 == null) {
                        break;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30033() {
        AbstractRunnableC17718 abstractRunnableC17718;
        boolean zM6810 = false;
        while (true) {
            abstractRunnableC17718 = this.f40419;
            if (abstractRunnableC17718 == null || abstractRunnableC17718.mo25178()) {
                break;
            }
            zM6810 = C2195.m6810(f40413, this, f40412, abstractRunnableC17718, abstractRunnableC17718.f56253);
        }
        if (abstractRunnableC17718 == null || zM6810) {
            return;
        }
        AbstractRunnableC17718 abstractRunnableC17719 = abstractRunnableC17718.f56253;
        AbstractRunnableC17718 abstractRunnableC177110 = abstractRunnableC17718;
        while (abstractRunnableC17719 != null) {
            AbstractRunnableC17718 abstractRunnableC177111 = abstractRunnableC17719.f56253;
            if (!abstractRunnableC17719.mo25178()) {
                C3860.m11180(f40413, abstractRunnableC177110, f40415, abstractRunnableC17719, abstractRunnableC177111);
                return;
            } else {
                abstractRunnableC177110 = abstractRunnableC17719;
                abstractRunnableC17719 = abstractRunnableC177111;
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m30036(AbstractRunnableC17718 abstractRunnableC17718) {
        while (!m30026(abstractRunnableC17718)) {
            if (this.f40418 != null) {
                m30008(abstractRunnableC17718, (AbstractRunnableC17718) null);
                break;
            }
        }
        if (this.f40418 != null) {
            abstractRunnableC17718.mo1013(0);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30017(FutureC12075 futureC12075, int i) {
        if (futureC12075 != null && futureC12075.f40419 != null) {
            Object obj = futureC12075.f40418;
            if (obj == null) {
                futureC12075.m30033();
            }
            if (i >= 0 && (obj != null || futureC12075.f40418 != null)) {
                futureC12075.m30037();
            }
        }
        if (this.f40418 == null || this.f40419 == null) {
            return null;
        }
        if (i < 0) {
            return this;
        }
        m30037();
        return null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30032(InterfaceC15954 interfaceC15954) {
        Object obj = this.f40418;
        if (obj != null) {
            FutureC12075 futureC12075 = new FutureC12075();
            if (obj instanceof C0784) {
                Throwable th = ((C0784) obj).f3363;
                if (th != null) {
                    futureC12075.f40418 = m30012(obj, th);
                    return futureC12075;
                }
                obj = null;
            }
            try {
                Object objApply = interfaceC15954.apply(obj);
                if (objApply == null) {
                    objApply = f40414;
                }
                futureC12075.f40418 = objApply;
                return futureC12075;
            } catch (Throwable th2) {
                futureC12075.f40418 = m30010(th2);
                return futureC12075;
            }
        }
        FutureC12075 futureC12076 = new FutureC12075();
        C8547 c8547 = new C8547(null, futureC12076, this);
        c8547.f29573 = interfaceC15954;
        m30036((AbstractRunnableC17718) c8547);
        return futureC12076;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30015(C3164 c3164) {
        Object obj = this.f40418;
        if (obj != null) {
            FutureC12075 futureC12075 = new FutureC12075();
            if (obj instanceof C0784) {
                Throwable th = ((C0784) obj).f3363;
                if (th != null) {
                    futureC12075.f40418 = m30012(obj, th);
                    return futureC12075;
                }
                obj = null;
            }
            try {
                c3164.m9564(obj);
                futureC12075.f40418 = f40414;
                return futureC12075;
            } catch (Throwable th2) {
                futureC12075.f40418 = m30010(th2);
                return futureC12075;
            }
        }
        FutureC12075 futureC12076 = new FutureC12075();
        C19130 c19130 = new C19130(null, futureC12076, this);
        c19130.f61799 = c3164;
        m30036((AbstractRunnableC17718) c19130);
        return futureC12076;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private FutureC12075 m30011(Runnable runnable, Executor executor) {
        Throwable th;
        Object obj = this.f40418;
        if (obj != null) {
            FutureC12075 futureC12075 = new FutureC12075();
            if ((obj instanceof C0784) && (th = ((C0784) obj).f3363) != null) {
                futureC12075.f40418 = m30012(obj, th);
                return futureC12075;
            }
            try {
                if (executor != null) {
                    executor.execute(new C0079(null, futureC12075, this, runnable));
                    return futureC12075;
                }
                runnable.run();
                futureC12075.f40418 = f40414;
                return futureC12075;
            } catch (Throwable th2) {
                futureC12075.f40418 = m30010(th2);
                return futureC12075;
            }
        }
        FutureC12075 futureC12076 = new FutureC12075();
        m30036((AbstractRunnableC17718) new C0079(executor, futureC12076, this, runnable));
        return futureC12076;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0031  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30023(Object obj, InterfaceC7486 interfaceC7486, C16308 c16308) {
        Throwable th;
        if (this.f40418 == null) {
            Throwable th2 = null;
            Object obj2 = null;
            if (c16308 != null) {
                try {
                    if (!c16308.m25177()) {
                        return false;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (th2 != null) {
                        th = th2;
                    }
                    m30020(obj, th);
                    return true;
                }
            }
            if (obj instanceof C0784) {
                th = ((C0784) obj).f3363;
            } else {
                th = null;
                obj2 = obj;
            }
            try {
                interfaceC7486.mo2142(obj2, th);
                if (th == null) {
                    C5018.m13911(f40413, this, f40416, obj);
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
            m30020(obj, th);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30025(Object obj, InterfaceC20892 interfaceC20892, C15603 c15603) {
        if (this.f40418 != null) {
            return true;
        }
        if (c15603 != null) {
            try {
                if (!c15603.m25177()) {
                    return false;
                }
            } catch (Throwable th) {
                m30035(th);
                return true;
            }
        }
        Throwable th2 = null;
        if (obj instanceof C0784) {
            th2 = ((C0784) obj).f3363;
            obj = null;
        }
        m30030(interfaceC20892.mo1795(obj, th2));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m30024(Object obj, InterfaceC15954 interfaceC15954, C20541 c20541) {
        Throwable th;
        if (this.f40418 != null) {
            return true;
        }
        if (c20541 != null) {
            try {
                if (!c20541.m25177()) {
                    return false;
                }
            } catch (Throwable th2) {
                m30035(th2);
                return true;
            }
        }
        if (!(obj instanceof C0784) || (th = ((C0784) obj).f3363) == null) {
            C5018.m13911(f40413, this, f40416, obj);
            return true;
        }
        m30030(interfaceC15954.apply(th));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30007(FutureC12075[] futureC12075Arr, int i, int i2) {
        FutureC12075 futureC12075M30007;
        FutureC12075 futureC12075M30008;
        Object obj;
        Throwable th;
        C0784 c0784 = f40414;
        FutureC12075 futureC12075 = new FutureC12075();
        if (i > i2) {
            futureC12075.f40418 = c0784;
            return futureC12075;
        }
        int i3 = (i + i2) >>> 1;
        if (i == i3) {
            futureC12075M30007 = futureC12075Arr[i];
        } else {
            futureC12075M30007 = m30007(futureC12075Arr, i, i3);
        }
        if (futureC12075M30007 == null) {
            throw null;
        }
        if (i == i2) {
            futureC12075M30008 = futureC12075M30007;
        } else {
            int i4 = i3 + 1;
            futureC12075M30008 = i2 == i4 ? futureC12075Arr[i2] : m30007(futureC12075Arr, i4, i2);
        }
        if (futureC12075M30008 == null) {
            throw null;
        }
        Object obj2 = futureC12075M30007.f40418;
        if (obj2 == null || (obj = futureC12075M30008.f40418) == null) {
            C14897 c14897 = new C14897(null, futureC12075, futureC12075M30007);
            c14897.f73808 = futureC12075M30008;
            while (futureC12075M30007.f40418 == null) {
                if (futureC12075M30007.m30026((AbstractRunnableC17718) c14897)) {
                    if (futureC12075M30008.f40418 == null) {
                        C21246 c21246 = new C21246();
                        c21246.f69204 = c14897;
                        futureC12075M30008.m30036((AbstractRunnableC17718) c21246);
                        return futureC12075;
                    }
                    if (futureC12075M30007.f40418 != null) {
                        c14897.mo1013(0);
                    }
                    return futureC12075;
                }
            }
            futureC12075M30008.m30036((AbstractRunnableC17718) c14897);
            return futureC12075;
        }
        if (!(obj2 instanceof C0784) || (th = ((C0784) obj2).f3363) == null) {
            if (!(obj instanceof C0784) || (th = ((C0784) obj).f3363) == null) {
                futureC12075.f40418 = c0784;
                return futureC12075;
            }
            obj2 = obj;
        }
        futureC12075.f40418 = m30012(obj2, th);
        return futureC12075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private Object m30002(boolean z) {
        if (z && Thread.interrupted()) {
            return null;
        }
        boolean zM30026 = false;
        C18424 c18424 = null;
        while (true) {
            Object obj = this.f40418;
            if (obj != null) {
                if (c18424 != null) {
                    c18424.f58742 = null;
                    if (c18424.f58744) {
                        Thread.currentThread().interrupt();
                    }
                }
                m30037();
                return obj;
            }
            if (c18424 == null) {
                c18424 = new C18424(0L, 0L, z);
                if (Thread.currentThread() instanceof C18069) {
                    C5369.m14873(f40411, c18424);
                }
            } else if (!zM30026) {
                zM30026 = m30026((AbstractRunnableC17718) c18424);
            } else {
                if (z && c18424.f58744) {
                    c18424.f58742 = null;
                    m30033();
                    return null;
                }
                try {
                    C5369.m14874(c18424);
                } catch (InterruptedException unused) {
                    c18424.f58744 = true;
                }
            }
        }
    }

    public FutureC12075() {
    }

    public FutureC12075(Object obj) {
        this.f40418 = obj;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30001(Object obj) {
        if (obj == null) {
            obj = f40414;
        }
        return new FutureC12075(obj);
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f40418 != null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object objM30002 = this.f40418;
        if (objM30002 == null) {
            objM30002 = m30002(true);
        }
        return m30009(objM30002);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws TimeoutException {
        Object obj;
        long nanos = timeUnit.toNanos(j);
        Object obj2 = this.f40418;
        if (obj2 == null) {
            long jNanoTime = System.nanoTime() + nanos;
            long j2 = 0;
            if (jNanoTime == 0) {
                jNanoTime = 1;
            }
            boolean z = false;
            C18424 c18424 = null;
            Object obj3 = null;
            boolean zM30026 = false;
            while (true) {
                if (!z) {
                    boolean zInterrupted = Thread.interrupted();
                    if (zInterrupted) {
                        obj2 = obj3;
                    } else {
                        Object obj4 = this.f40418;
                        if (obj4 == null && nanos > j2) {
                            if (c18424 == null) {
                                obj = obj4;
                                C18424 c18425 = new C18424(nanos, jNanoTime, true);
                                if (Thread.currentThread() instanceof C18069) {
                                    C5369.m14873(f40411, c18425);
                                }
                                c18424 = c18425;
                            } else {
                                obj = obj4;
                                if (!zM30026) {
                                    zM30026 = m30026((AbstractRunnableC17718) c18424);
                                } else {
                                    try {
                                        C5369.m14874(c18424);
                                        z = c18424.f58744;
                                        nanos = c18424.f58743;
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
            if (c18424 != null) {
                c18424.f58742 = null;
                if (obj2 == null) {
                    m30033();
                }
            }
            if (obj2 != null) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                m30037();
            } else {
                if (!z) {
                    throw new TimeoutException();
                }
                obj2 = null;
            }
        }
        return m30009(obj2);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Object m30027() {
        Object objM30002 = this.f40418;
        if (objM30002 == null) {
            objM30002 = m30002(false);
        }
        if (!(objM30002 instanceof C0784)) {
            return objM30002;
        }
        Throwable th = ((C0784) objM30002).f3363;
        if (th == null) {
            return null;
        }
        if (th instanceof CancellationException) {
            throw ((CancellationException) th);
        }
        if (th instanceof C17013) {
            throw ((C17013) th);
        }
        throw new C17013(th);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30019(Object obj) {
        m30030(obj);
        m30037();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30021(Throwable th) {
        th.getClass();
        C5018.m13911(f40413, this, f40416, new C0784(th));
        m30037();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30014(Runnable runnable) {
        return m30011(runnable, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30006(FutureC12075... futureC12075Arr) {
        return m30007(futureC12075Arr, 0, futureC12075Arr.length - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        if (this.f40418 == null) {
            if (C5018.m13911(f40413, this, f40416, new C0784(new CancellationException()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        m30037();
        return z2 || isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        Object obj = this.f40418;
        return (obj instanceof C0784) && (((C0784) obj).f3363 instanceof CancellationException);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m30013() {
        Object obj = this.f40418;
        return (obj instanceof C0784) && obj != f40414;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    public final String toString() {
        String strM6966;
        Object obj = this.f40418;
        int i = 0;
        for (AbstractRunnableC17718 abstractRunnableC17718 = this.f40419; abstractRunnableC17718 != null; abstractRunnableC17718 = abstractRunnableC17718.f56253) {
            i++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (obj == null) {
            strM6966 = i == 0 ? "[Not completed]" : C2271.m6966(i, "[Not completed, ", " dependents]");
        } else if (obj instanceof C0784) {
            C0784 c0784 = (C0784) obj;
            if (c0784.f3363 != null) {
                strM6966 = "[Completed exceptionally: " + c0784.f3363 + "]";
            } else {
                strM6966 = "[Completed normally]";
            }
        } else {
            strM6966 = "[Completed normally]";
        }
        sb.append(strM6966);
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30016(InterfaceC7486 interfaceC7486) {
        FutureC12075 futureC12075 = new FutureC12075();
        Object obj = this.f40418;
        if (obj == null) {
            C16308 c16308 = new C16308(null, futureC12075, this);
            c16308.f52515 = interfaceC7486;
            m30036((AbstractRunnableC17718) c16308);
            return futureC12075;
        }
        futureC12075.m30023(obj, interfaceC7486, (C16308) null);
        return futureC12075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30018(InterfaceC20892 interfaceC20892) {
        FutureC12075 futureC12075 = new FutureC12075();
        Object obj = this.f40418;
        if (obj == null) {
            C15603 c15603 = new C15603(null, futureC12075, this);
            c15603.f50738 = interfaceC20892;
            m30036((AbstractRunnableC17718) c15603);
            return futureC12075;
        }
        futureC12075.m30025(obj, interfaceC20892, (C15603) null);
        return futureC12075;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30022(InterfaceC15954 interfaceC15954) {
        FutureC12075 futureC12075 = new FutureC12075();
        Object obj = this.f40418;
        if (obj == null) {
            C20541 c20541 = new C20541(null, futureC12075, this);
            c20541.f66528 = interfaceC15954;
            m30036((AbstractRunnableC17718) c20541);
            return;
        }
        futureC12075.m30024(obj, interfaceC15954, (C20541) null);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final FutureC12075 m30028(InterfaceC15954 interfaceC15954) {
        Throwable th;
        FutureC12075 futureC12075 = new FutureC12075();
        Object obj = this.f40418;
        if (obj == null) {
            C7135 c7135 = new C7135(null, futureC12075, this);
            c7135.f23844 = interfaceC15954;
            m30036((AbstractRunnableC17718) c7135);
            return futureC12075;
        }
        if (obj instanceof C0784) {
            Throwable th2 = ((C0784) obj).f3363;
            if (th2 != null) {
                futureC12075.f40418 = m30012(obj, th2);
                return futureC12075;
            }
            obj = null;
        }
        try {
            FutureC12075 futureC12075Mo15778 = ((InterfaceC5724) interfaceC15954.apply(obj)).mo15778();
            Object c0784 = futureC12075Mo15778.f40418;
            if (c0784 != null) {
                if ((c0784 instanceof C0784) && (th = ((C0784) c0784).f3363) != null && !(th instanceof C17013)) {
                    c0784 = new C0784(new C17013(th));
                }
                futureC12075.f40418 = c0784;
                return futureC12075;
            }
            futureC12075Mo15778.m30036((AbstractRunnableC17718) new C19836(null, futureC12075, futureC12075Mo15778));
            return futureC12075;
        } catch (Throwable th3) {
            futureC12075.f40418 = m30010(th3);
            return futureC12075;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static FutureC12075 m30003(IllegalStateException illegalStateException) {
        return new FutureC12075(new C0784(illegalStateException));
    }
}
