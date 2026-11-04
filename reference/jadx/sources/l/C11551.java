package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۧۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes3.dex */
public final class C11551 extends Thread {

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f36320 = AtomicIntegerFieldUpdater.newUpdater(C11551.class, "workerCtl$volatile");
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f36321;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC16772 f36322;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public EnumC24978 f36323;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f36324;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18264 f36325;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f36326;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C24941 f36327;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f36328;

    public C11551() {
        throw null;
    }

    public C11551(ExecutorC16772 executorC16772, int i) {
        this.f36322 = executorC16772;
        setDaemon(true);
        setContextClassLoader(ExecutorC16772.class.getClassLoader());
        this.f36325 = new C18264();
        this.f36327 = new C24941();
        this.f36323 = EnumC24978.DORMANT;
        this.nextParkedWorker = ExecutorC16772.f54124;
        int iNanoTime = (int) System.nanoTime();
        this.f36321 = iNanoTime == 0 ? 42 : iNanoTime;
        m29064(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29058() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m29064(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36322.f54133);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m29061(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m29063() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC12297 m29060(boolean z) {
        AbstractRunnableC12297 abstractRunnableC12297M29057;
        AbstractRunnableC12297 abstractRunnableC12297M29058;
        long j;
        EnumC24978 enumC24978 = this.f36323;
        EnumC24978 enumC24979 = EnumC24978.CPU_ACQUIRED;
        ExecutorC16772 executorC16772 = this.f36322;
        C18264 c18264 = this.f36325;
        if (enumC24978 != enumC24979) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC16772.f54125;
            do {
                j = atomicLongFieldUpdater.get(executorC16772);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    AbstractRunnableC12297 abstractRunnableC12297M42414 = c18264.m42414();
                    if (abstractRunnableC12297M42414 != null) {
                        return abstractRunnableC12297M42414;
                    }
                    AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) executorC16772.f54134.m54852();
                    return abstractRunnableC12297 == null ? m29056(1) : abstractRunnableC12297;
                }
            } while (!ExecutorC16772.f54125.compareAndSet(executorC16772, j, j - 4398046511104L));
            this.f36323 = EnumC24978.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m29059(executorC16772.f54131 * 2) == 0;
            if (z2 && (abstractRunnableC12297M29058 = m29057()) != null) {
                return abstractRunnableC12297M29058;
            }
            AbstractRunnableC12297 abstractRunnableC12297M42415 = c18264.m42415();
            if (abstractRunnableC12297M42415 != null) {
                return abstractRunnableC12297M42415;
            }
            if (!z2 && (abstractRunnableC12297M29057 = m29057()) != null) {
                return abstractRunnableC12297M29057;
            }
        } else {
            AbstractRunnableC12297 abstractRunnableC12297M29059 = m29057();
            if (abstractRunnableC12297M29059 != null) {
                return abstractRunnableC12297M29059;
            }
        }
        return m29056(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29062(EnumC24978 enumC24978) {
        EnumC24978 enumC24979 = this.f36323;
        boolean z = enumC24979 == EnumC24978.CPU_ACQUIRED;
        if (z) {
            ExecutorC16772.f54125.addAndGet(this.f36322, 4398046511104L);
        }
        if (enumC24979 != enumC24978) {
            this.f36323 = enumC24978;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.f36322.isTerminated()) {
                    EnumC24978 enumC24978 = this.f36323;
                    EnumC24978 enumC24979 = EnumC24978.TERMINATED;
                    if (enumC24978 == enumC24979) {
                        break loop0;
                    }
                    AbstractRunnableC12297 abstractRunnableC12297M29060 = m29060(this.f36328);
                    if (abstractRunnableC12297M29060 != null) {
                        this.f36326 = 0L;
                        ExecutorC16772 executorC16772 = this.f36322;
                        int iMo18057 = abstractRunnableC12297M29060.f39532.mo18057();
                        this.f36324 = 0L;
                        if (this.f36323 == EnumC24978.PARKING) {
                            this.f36323 = EnumC24978.BLOCKING;
                        }
                        if (iMo18057 != 0 && m29062(EnumC24978.BLOCKING)) {
                            executorC16772.m39591();
                        }
                        executorC16772.getClass();
                        try {
                            abstractRunnableC12297M29060.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (iMo18057 != 0) {
                            ExecutorC16772.f54125.addAndGet(executorC16772, -2097152L);
                            if (this.f36323 == enumC24979) {
                                break;
                            }
                            this.f36323 = EnumC24978.DORMANT;
                            break;
                        }
                        break;
                    }
                    this.f36328 = false;
                    if (this.f36326 != 0) {
                        if (z) {
                            m29062(EnumC24978.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f36326);
                            this.f36326 = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker != ExecutorC16772.f54124) {
                        f36320.set(this, -1);
                        while (this.nextParkedWorker != ExecutorC16772.f54124) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f36320;
                            if (atomicIntegerFieldUpdater.get(this) != -1 || this.f36322.isTerminated()) {
                                break;
                            }
                            EnumC24978 enumC249710 = this.f36323;
                            EnumC24978 enumC249711 = EnumC24978.TERMINATED;
                            if (enumC249710 == enumC249711) {
                                break;
                            }
                            m29062(EnumC24978.PARKING);
                            Thread.interrupted();
                            if (this.f36324 == 0) {
                                this.f36324 = System.nanoTime() + this.f36322.f54128;
                            }
                            LockSupport.parkNanos(this.f36322.f54128);
                            if (System.nanoTime() - this.f36324 >= 0) {
                                this.f36324 = 0L;
                                ExecutorC16772 executorC16773 = this.f36322;
                                synchronized (executorC16773.f54130) {
                                    if (!executorC16773.isTerminated()) {
                                        if (((int) (ExecutorC16772.f54125.get(executorC16773) & 2097151)) > executorC16773.f54131) {
                                            if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m29064(0);
                                                executorC16773.m39590(this, i, 0);
                                                int andDecrement = (int) (ExecutorC16772.f54125.getAndDecrement(executorC16773) & 2097151);
                                                if (andDecrement != i) {
                                                    Object objM26699 = executorC16773.f54130.m26699(andDecrement);
                                                    C15243.m36586(objM26699);
                                                    C11551 c11551 = (C11551) objM26699;
                                                    executorC16773.f54130.m26700(i, c11551);
                                                    c11551.m29064(i);
                                                    executorC16773.m39590(c11551, andDecrement, i);
                                                }
                                                executorC16773.f54130.m26700(andDecrement, null);
                                                C11471 c11471 = C11471.f36082;
                                                this.f36323 = enumC249711;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        this.f36322.m39589(this);
                    }
                } else {
                    break loop0;
                }
            }
        }
        m29062(EnumC24978.TERMINATED);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m29059(int i) {
        int i2 = this.f36321;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f36321 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC12297 m29057() {
        int iM29059 = m29059(2);
        ExecutorC16772 executorC16772 = this.f36322;
        if (iM29059 == 0) {
            AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) executorC16772.f54132.m54852();
            return abstractRunnableC12297 != null ? abstractRunnableC12297 : (AbstractRunnableC12297) executorC16772.f54134.m54852();
        }
        AbstractRunnableC12297 abstractRunnableC12298 = (AbstractRunnableC12297) executorC16772.f54134.m54852();
        return abstractRunnableC12298 != null ? abstractRunnableC12298 : (AbstractRunnableC12297) executorC16772.f54132.m54852();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC12297 m29056(int i) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC16772.f54125;
        ExecutorC16772 executorC16772 = this.f36322;
        int i2 = (int) (atomicLongFieldUpdater.get(executorC16772) & 2097151);
        if (i2 < 2) {
            return null;
        }
        int iM29059 = m29059(i2);
        long jMin = C25227.FOREVER_NS;
        for (int i3 = 0; i3 < i2; i3++) {
            iM29059++;
            if (iM29059 > i2) {
                iM29059 = 1;
            }
            C11551 c11551 = (C11551) executorC16772.f54130.m26699(iM29059);
            if (c11551 != null && c11551 != this) {
                C18264 c18264 = c11551.f36325;
                C24941 c24941 = this.f36327;
                long jM42411 = c18264.m42411(i, c24941);
                if (jM42411 == -1) {
                    AbstractRunnableC12297 abstractRunnableC12297 = (AbstractRunnableC12297) c24941.f80717;
                    c24941.f80717 = null;
                    return abstractRunnableC12297;
                }
                if (jM42411 > 0) {
                    jMin = Math.min(jMin, jM42411);
                }
            }
        }
        if (jMin == C25227.FOREVER_NS) {
            jMin = 0;
        }
        this.f36326 = jMin;
        return null;
    }
}
