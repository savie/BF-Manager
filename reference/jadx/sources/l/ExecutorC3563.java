package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ۗ᩻۠, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorC3563 implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;
    public volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C11761 f13125;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f13126;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f13127;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final long f13128;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C9210 f13129;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11761 f13130;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final C21203 f13121 = new C21203("NOT_IN_STACK");

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f13123 = AtomicLongFieldUpdater.newUpdater(ExecutorC3563.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f13124 = AtomicLongFieldUpdater.newUpdater(ExecutorC3563.class, "controlState");

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f13122 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC3563.class, "_isTerminated");

    public ExecutorC3563(int i, int i2, long j) {
        this.f13127 = i;
        this.f13126 = i2;
        this.f13128 = j;
        if (i < 1) {
            throw new IllegalArgumentException(C2271.m6966(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C2271.m6967("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C2271.m6966(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f13125 = new C11761();
        this.f13130 = new C11761();
        this.parkedWorkersStack = 0L;
        this.f13129 = new C9210(i + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10550(C2152 c2152) {
        long j;
        int iM6706;
        if (c2152.m6711() != f13121) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iM6706 = c2152.m6706();
            c2152.m6709(this.f13129.m23699((int) (2097151 & j)));
        } while (!f13123.compareAndSet(this, j, ((long) iM6706) | ((2097152 + j) & (-2097152))));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC22344 abstractRunnableC22344M6708;
        if (f13122.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C2152 c2152 = null;
            C2152 c2153 = threadCurrentThread instanceof C2152 ? (C2152) threadCurrentThread : null;
            if (c2153 != null && C13465.m32965(c2153.f7825, this)) {
                c2152 = c2153;
            }
            synchronized (this.f13129) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM23699 = this.f13129.m23699(i2);
                    C13465.m32962(objM23699);
                    C2152 c2154 = (C2152) objM23699;
                    if (c2154 != c2152) {
                        while (c2154.isAlive()) {
                            LockSupport.unpark(c2154);
                            c2154.join(10000L);
                        }
                        c2154.f7827.m36604(this.f13130);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f13130.m18962();
            this.f13125.m18962();
            while (true) {
                if (c2152 != null) {
                    abstractRunnableC22344M6708 = c2152.m6708(true);
                    if (abstractRunnableC22344M6708 == null) {
                        abstractRunnableC22344M6708 = (AbstractRunnableC22344) this.f13125.m18964();
                        if (abstractRunnableC22344M6708 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC22344M6708 = (AbstractRunnableC22344) this.f13125.m18964();
                    if (abstractRunnableC22344M6708 == null && (abstractRunnableC22344M6708 = (AbstractRunnableC22344) this.f13130.m18964()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC22344M6708.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c2152 != null) {
                c2152.m6710(EnumC9915.TERMINATED);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m10549(runnable, C6821.f22988);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10549(Runnable runnable, InterfaceC1176 interfaceC1176) {
        AbstractRunnableC22344 c3998;
        AbstractRunnableC22344 abstractRunnableC22344M36603;
        boolean zM18963;
        C6821.f22985.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC22344) {
            c3998 = (AbstractRunnableC22344) runnable;
            c3998.f72948 = jNanoTime;
            c3998.f72949 = interfaceC1176;
        } else {
            c3998 = new C3998(runnable, jNanoTime, interfaceC1176);
        }
        Thread threadCurrentThread = Thread.currentThread();
        C2152 c2152 = null;
        C2152 c2153 = threadCurrentThread instanceof C2152 ? (C2152) threadCurrentThread : null;
        if (c2153 != null && C13465.m32965(c2153.f7825, this)) {
            c2152 = c2153;
        }
        if (c2152 == null || c2152.f7826 == EnumC9915.TERMINATED || (c3998.f72949.mo4307() == 0 && c2152.f7826 == EnumC9915.BLOCKING)) {
            abstractRunnableC22344M36603 = c3998;
        } else {
            c2152.f7830 = true;
            abstractRunnableC22344M36603 = c2152.f7827.m36603(c3998);
        }
        if (abstractRunnableC22344M36603 != null) {
            if (abstractRunnableC22344M36603.f72949.mo4307() == 1) {
                zM18963 = this.f13130.m18963(abstractRunnableC22344M36603);
            } else {
                zM18963 = this.f13125.m18963(abstractRunnableC22344M36603);
            }
            if (!zM18963) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        if (c3998.f72949.mo4307() != 0) {
            long jAddAndGet = f13124.addAndGet(this, 2097152L);
            if (m10548() || m10547(jAddAndGet)) {
                return;
            }
            m10548();
            return;
        }
        m10552();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m10552() {
        if (m10548() || m10547(this.controlState)) {
            return;
        }
        m10548();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final boolean m10547(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f13127;
        if (i < i2) {
            int iM10546 = m10546();
            if (iM10546 == 1 && i2 > 1) {
                m10546();
            }
            if (iM10546 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private final int m10546() {
        synchronized (this.f13129) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f13127) {
                return 0;
            }
            if (i >= this.f13126) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f13129.m23699(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C2152 c2152 = new C2152(this, i3);
            this.f13129.m23700(i3, c2152);
            if (i3 != ((int) (2097151 & f13124.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c2152.start();
            return i2 + 1;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int iM23698 = this.f13129.m23698();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM23698; i6++) {
            C2152 c2152 = (C2152) this.f13129.m23699(i6);
            if (c2152 != null) {
                int iM36601 = c2152.f7827.m36601();
                int i7 = C14854.f48552[c2152.f7826.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM36601);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM36601);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM36601 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM36601);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        StringBuilder sb4 = new StringBuilder("DefaultDispatcher@");
        sb4.append(C13961.m33816(this));
        sb4.append("[Pool Size {core = ");
        sb4.append(this.f13127);
        sb4.append(", max = ");
        C23821.m52500(sb4, this.f13126, "}, Worker States {CPU = ", i, ", blocking = ");
        C23821.m52500(sb4, i2, ", parked = ", i3, ", dormant = ");
        C23821.m52500(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f13125.m18965());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f13130.m18965());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(this.f13127 - ((int) ((9223367638808264704L & j) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m10551(C2152 c2152, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iM6706 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM6706 == i) {
                if (i2 == 0) {
                    Object objM6711 = c2152.m6711();
                    while (true) {
                        if (objM6711 == f13121) {
                            iM6706 = -1;
                            break;
                        }
                        if (objM6711 == null) {
                            iM6706 = 0;
                            break;
                        }
                        C2152 c2153 = (C2152) objM6711;
                        iM6706 = c2153.m6706();
                        if (iM6706 != 0) {
                            break;
                        } else {
                            objM6711 = c2153.m6711();
                        }
                    }
                } else {
                    iM6706 = i2;
                }
            }
            if (iM6706 >= 0 && f13123.compareAndSet(this, j, j2 | ((long) iM6706))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private final boolean m10548() {
        C21203 c21203;
        int i;
        while (true) {
            long j = this.parkedWorkersStack;
            C2152 c2152 = (C2152) this.f13129.m23699((int) (2097151 & j));
            if (c2152 == null) {
                c2152 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM6711 = c2152.m6711();
                while (true) {
                    c21203 = f13121;
                    if (objM6711 == c21203) {
                        i = -1;
                        break;
                    }
                    if (objM6711 == null) {
                        i = 0;
                        break;
                    }
                    C2152 c2153 = (C2152) objM6711;
                    int iM6706 = c2153.m6706();
                    if (iM6706 != 0) {
                        i = iM6706;
                        break;
                    }
                    objM6711 = c2153.m6711();
                }
                if (i >= 0 && f13123.compareAndSet(this, j, ((long) i) | j2)) {
                    c2152.m6709(c21203);
                }
            }
            if (c2152 == null) {
                return false;
            }
            if (C2152.f7823.compareAndSet(c2152, -1, 0)) {
                LockSupport.unpark(c2152);
                return true;
            }
        }
    }
}
