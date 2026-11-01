package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.֫᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes2.dex */
public final class C2152 extends Thread {

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7823 = AtomicIntegerFieldUpdater.newUpdater(C2152.class, "workerCtl");
    public volatile int indexInArray;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public long f7824;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ExecutorC3563 f7825;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public EnumC9915 f7826;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C15289 f7827;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f7828;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f7829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f7830;

    public C2152() {
        throw null;
    }

    public C2152(ExecutorC3563 executorC3563, int i) {
        this.f7825 = executorC3563;
        setDaemon(true);
        this.f7827 = new C15289();
        this.f7826 = EnumC9915.DORMANT;
        this.workerCtl = 0;
        this.nextParkedWorker = ExecutorC3563.f13121;
        this.f7828 = AbstractC7820.f25741.mo20623();
        m6712(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6706() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m6712(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f7825.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m6709(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m6711() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractRunnableC22344 m6708(boolean z) {
        AbstractRunnableC22344 abstractRunnableC22344M6704;
        AbstractRunnableC22344 abstractRunnableC22344M6705;
        long j;
        AbstractRunnableC22344 abstractRunnableC22344M36606;
        if (this.f7826 != EnumC9915.CPU_ACQUIRED) {
            ExecutorC3563 executorC3563 = this.f7825;
            do {
                j = executorC3563.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (!z || (abstractRunnableC22344M36606 = this.f7827.m36606()) == null) {
                        abstractRunnableC22344M36606 = (AbstractRunnableC22344) this.f7825.f13130.m18964();
                    }
                    return abstractRunnableC22344M36606 == null ? m6705(true) : abstractRunnableC22344M36606;
                }
            } while (!ExecutorC3563.f13124.compareAndSet(executorC3563, j, j - 4398046511104L));
            this.f7826 = EnumC9915.CPU_ACQUIRED;
        }
        if (z) {
            boolean z2 = m6707(this.f7825.f13127 * 2) == 0;
            if (z2 && (abstractRunnableC22344M6705 = m6704()) != null) {
                return abstractRunnableC22344M6705;
            }
            AbstractRunnableC22344 abstractRunnableC22344M36607 = this.f7827.m36606();
            if (abstractRunnableC22344M36607 != null) {
                return abstractRunnableC22344M36607;
            }
            if (!z2 && (abstractRunnableC22344M6704 = m6704()) != null) {
                return abstractRunnableC22344M6704;
            }
        } else {
            AbstractRunnableC22344 abstractRunnableC22344M6706 = m6704();
            if (abstractRunnableC22344M6706 != null) {
                return abstractRunnableC22344M6706;
            }
        }
        return m6705(false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6710(EnumC9915 enumC9915) {
        EnumC9915 enumC9916 = this.f7826;
        boolean z = enumC9916 == EnumC9915.CPU_ACQUIRED;
        if (z) {
            ExecutorC3563.f13124.addAndGet(this.f7825, 4398046511104L);
        }
        if (enumC9916 != enumC9915) {
            this.f7826 = enumC9915;
        }
        return z;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (!this.f7825.isTerminated()) {
                    EnumC9915 enumC9915 = this.f7826;
                    EnumC9915 enumC9916 = EnumC9915.TERMINATED;
                    if (enumC9915 == enumC9916) {
                        break loop0;
                    }
                    AbstractRunnableC22344 abstractRunnableC22344M6708 = m6708(this.f7830);
                    if (abstractRunnableC22344M6708 != null) {
                        this.f7824 = 0L;
                        ExecutorC3563 executorC3563 = this.f7825;
                        int iMo4307 = abstractRunnableC22344M6708.f72949.mo4307();
                        this.f7829 = 0L;
                        if (this.f7826 == EnumC9915.PARKING) {
                            this.f7826 = EnumC9915.BLOCKING;
                        }
                        if (iMo4307 != 0 && m6710(EnumC9915.BLOCKING)) {
                            executorC3563.m10552();
                        }
                        executorC3563.getClass();
                        try {
                            abstractRunnableC22344M6708.run();
                        } catch (Throwable th) {
                            Thread threadCurrentThread = Thread.currentThread();
                            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                        }
                        if (iMo4307 != 0) {
                            ExecutorC3563.f13124.addAndGet(executorC3563, -2097152L);
                            if (this.f7826 == enumC9916) {
                                break;
                            }
                            this.f7826 = EnumC9915.DORMANT;
                            break;
                        }
                        break;
                    }
                    this.f7830 = false;
                    if (this.f7824 != 0) {
                        if (z) {
                            m6710(EnumC9915.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f7824);
                            this.f7824 = 0L;
                            break;
                        }
                        z = true;
                    } else if (this.nextParkedWorker == ExecutorC3563.f13121) {
                        this.f7825.m10550(this);
                    } else {
                        this.workerCtl = -1;
                        while (this.nextParkedWorker != ExecutorC3563.f13121 && this.workerCtl == -1 && !this.f7825.isTerminated()) {
                            EnumC9915 enumC9917 = this.f7826;
                            EnumC9915 enumC9918 = EnumC9915.TERMINATED;
                            if (enumC9917 == enumC9918) {
                                break;
                            }
                            m6710(EnumC9915.PARKING);
                            Thread.interrupted();
                            if (this.f7829 == 0) {
                                this.f7829 = System.nanoTime() + this.f7825.f13128;
                            }
                            LockSupport.parkNanos(this.f7825.f13128);
                            if (System.nanoTime() - this.f7829 >= 0) {
                                this.f7829 = 0L;
                                ExecutorC3563 executorC3564 = this.f7825;
                                synchronized (executorC3564.f13129) {
                                    if (!executorC3564.isTerminated()) {
                                        if (((int) (executorC3564.controlState & 2097151)) > executorC3564.f13127) {
                                            if (f7823.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m6712(0);
                                                executorC3564.m10551(this, i, 0);
                                                int andDecrement = (int) (ExecutorC3563.f13124.getAndDecrement(executorC3564) & 2097151);
                                                if (andDecrement != i) {
                                                    Object objM23699 = executorC3564.f13129.m23699(andDecrement);
                                                    C13465.m32962(objM23699);
                                                    C2152 c2152 = (C2152) objM23699;
                                                    executorC3564.f13129.m23700(i, c2152);
                                                    c2152.m6712(i);
                                                    executorC3564.m10551(c2152, andDecrement, i);
                                                }
                                                executorC3564.f13129.m23700(andDecrement, null);
                                                C7321 c7321 = C7321.f24318;
                                                this.f7826 = enumC9918;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        m6710(EnumC9915.TERMINATED);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m6707(int i) {
        int i2 = this.f7828;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f7828 = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC22344 m6704() {
        int iM6707 = m6707(2);
        ExecutorC3563 executorC3563 = this.f7825;
        if (iM6707 == 0) {
            AbstractRunnableC22344 abstractRunnableC22344 = (AbstractRunnableC22344) executorC3563.f13125.m18964();
            return abstractRunnableC22344 != null ? abstractRunnableC22344 : (AbstractRunnableC22344) executorC3563.f13130.m18964();
        }
        AbstractRunnableC22344 abstractRunnableC22345 = (AbstractRunnableC22344) executorC3563.f13130.m18964();
        return abstractRunnableC22345 != null ? abstractRunnableC22345 : (AbstractRunnableC22344) executorC3563.f13125.m18964();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final AbstractRunnableC22344 m6705(boolean z) {
        long jM36605;
        int i = (int) (this.f7825.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iM6707 = m6707(i);
        ExecutorC3563 executorC3563 = this.f7825;
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iM6707++;
            if (iM6707 > i) {
                iM6707 = 1;
            }
            C2152 c2152 = (C2152) executorC3563.f13129.m23699(iM6707);
            if (c2152 != null && c2152 != this) {
                if (z) {
                    jM36605 = this.f7827.m36602(c2152.f7827);
                } else {
                    jM36605 = this.f7827.m36605(c2152.f7827);
                }
                if (jM36605 == -1) {
                    return this.f7827.m36606();
                }
                if (jM36605 > 0) {
                    jMin = Math.min(jMin, jM36605);
                }
            }
        }
        if (jMin == C17492.FOREVER_NS) {
            jMin = 0;
        }
        this.f7824 = jMin;
        return null;
    }
}
