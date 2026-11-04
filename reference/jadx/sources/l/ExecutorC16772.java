package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.ܺۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: FAYC */
/* JADX INFO: loaded from: classes4.dex */
public final class ExecutorC16772 implements Executor, Closeable {
    public volatile /* synthetic */ int _isTerminated$volatile;
    public volatile /* synthetic */ long controlState$volatile;
    public volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long f54128;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final int f54129;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final C10388 f54130;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f54131;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C23486 f54132;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f54133;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C23486 f54134;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f54126 = AtomicLongFieldUpdater.newUpdater(ExecutorC16772.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicLongFieldUpdater f54125 = AtomicLongFieldUpdater.newUpdater(ExecutorC16772.class, "controlState$volatile");

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f54127 = AtomicIntegerFieldUpdater.newUpdater(ExecutorC16772.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C7406 f54124 = new C7406("NOT_IN_STACK");

    public ExecutorC16772(int i, int i2, long j, String str) {
        this.f54131 = i;
        this.f54129 = i2;
        this.f54128 = j;
        this.f54133 = str;
        if (i < 1) {
            throw new IllegalArgumentException(C14442.m34864(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(C6934.m19217("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(C14442.m34864(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f54132 = new C23486();
        this.f54134 = new C23486();
        this.f54130 = new C10388((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
        this._isTerminated$volatile = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39590(C11551 c11551, int i, int i2) {
        while (true) {
            long j = f54126.get(this);
            int iM29058 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM29058 == i) {
                if (i2 == 0) {
                    Object objM29063 = c11551.m29063();
                    while (true) {
                        if (objM29063 == f54124) {
                            iM29058 = -1;
                            break;
                        }
                        if (objM29063 == null) {
                            iM29058 = 0;
                            break;
                        }
                        C11551 c11552 = (C11551) objM29063;
                        iM29058 = c11552.m29058();
                        if (iM29058 != 0) {
                            break;
                        } else {
                            objM29063 = c11552.m29063();
                        }
                    }
                } else {
                    iM29058 = i2;
                }
            }
            if (iM29058 >= 0) {
                if (f54126.compareAndSet(this, j, j2 | ((long) iM29058))) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39589(C11551 c11551) {
        long j;
        int iM29058;
        if (c11551.m29063() != f54124) {
            return;
        }
        do {
            j = f54126.get(this);
            iM29058 = c11551.m29058();
            c11551.m29061(this.f54130.m26699((int) (2097151 & j)));
        } while (!f54126.compareAndSet(this, j, ((2097152 + j) & (-2097152)) | ((long) iM29058)));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private final boolean m39585() {
        C7406 c7406;
        int i;
        while (true) {
            long j = f54126.get(this);
            C11551 c11551 = (C11551) this.f54130.m26699((int) (2097151 & j));
            if (c11551 == null) {
                c11551 = null;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objM29063 = c11551.m29063();
                while (true) {
                    c7406 = f54124;
                    if (objM29063 == c7406) {
                        i = -1;
                        break;
                    }
                    if (objM29063 == null) {
                        i = 0;
                        break;
                    }
                    C11551 c11552 = (C11551) objM29063;
                    int iM29058 = c11552.m29058();
                    if (iM29058 != 0) {
                        i = iM29058;
                        break;
                    }
                    objM29063 = c11552.m29063();
                }
                if (i >= 0) {
                    if (f54126.compareAndSet(this, j, ((long) i) | j2)) {
                        c11551.m29061(c7406);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (c11551 == null) {
                return false;
            }
            if (C11551.f36320.compareAndSet(c11551, -1, 0)) {
                LockSupport.unpark(c11551);
                return true;
            }
        }
    }

    public final boolean isTerminated() {
        return f54127.get(this) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        AbstractRunnableC12297 abstractRunnableC12297M29060;
        if (f54127.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            C11551 c11551 = null;
            C11551 c11552 = threadCurrentThread instanceof C11551 ? (C11551) threadCurrentThread : null;
            if (c11552 != null && C15243.m36589(c11552.f36322, this)) {
                c11551 = c11552;
            }
            synchronized (this.f54130) {
                i = (int) (f54125.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objM26699 = this.f54130.m26699(i2);
                    C15243.m36586(objM26699);
                    C11551 c11553 = (C11551) objM26699;
                    if (c11553 != c11551) {
                        while (c11553.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(c11553);
                            c11553.join(10000L);
                        }
                        c11553.f36325.m42413(this.f54134);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f54134.m54850();
            this.f54132.m54850();
            while (true) {
                if (c11551 != null) {
                    abstractRunnableC12297M29060 = c11551.m29060(true);
                    if (abstractRunnableC12297M29060 == null) {
                        abstractRunnableC12297M29060 = (AbstractRunnableC12297) this.f54132.m54852();
                        if (abstractRunnableC12297M29060 == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    abstractRunnableC12297M29060 = (AbstractRunnableC12297) this.f54132.m54852();
                    if (abstractRunnableC12297M29060 == null && (abstractRunnableC12297M29060 = (AbstractRunnableC12297) this.f54134.m54852()) == null) {
                        break;
                    }
                }
                try {
                    abstractRunnableC12297M29060.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c11551 != null) {
                c11551.m29062(EnumC24978.TERMINATED);
            }
            f54126.set(this, 0L);
            f54125.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m39588(runnable, C14534.f45726);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39588(Runnable runnable, InterfaceC6332 interfaceC6332) {
        AbstractRunnableC12297 c4094;
        C14534.f45723.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof AbstractRunnableC12297) {
            c4094 = (AbstractRunnableC12297) runnable;
            c4094.f39531 = jNanoTime;
            c4094.f39532 = interfaceC6332;
        } else {
            c4094 = new C4094(runnable, jNanoTime, interfaceC6332);
        }
        boolean z = c4094.f39532.mo18057() == 1;
        long jAddAndGet = z ? f54125.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        C11551 c11551 = null;
        C11551 c11552 = threadCurrentThread instanceof C11551 ? (C11551) threadCurrentThread : null;
        if (c11552 != null && C15243.m36589(c11552.f36322, this)) {
            c11551 = c11552;
        }
        if (c11551 != null && c11551.f36323 != EnumC24978.TERMINATED && (c4094.f39532.mo18057() != 0 || c11551.f36323 != EnumC24978.BLOCKING)) {
            c11551.f36328 = true;
            c4094 = c11551.f36325.m42412(c4094);
        }
        if (c4094 != null) {
            if (!(c4094.f39532.mo18057() == 1 ? this.f54134.m54851(c4094) : this.f54132.m54851(c4094))) {
                throw new RejectedExecutionException(C8947.m23910(new StringBuilder(), this.f54133, " was terminated"));
            }
        }
        if (!z) {
            m39591();
        } else {
            if (m39585() || m39587(jAddAndGet)) {
                return;
            }
            m39585();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m39591() {
        if (m39585() || m39587(f54125.get(this))) {
            return;
        }
        m39585();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final boolean m39587(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f54131;
        if (i < i2) {
            int iM39586 = m39586();
            if (iM39586 == 1 && i2 > 1) {
                m39586();
            }
            if (iM39586 > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private final int m39586() {
        synchronized (this.f54130) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f54125;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f54131) {
                return 0;
            }
            if (i >= this.f54129) {
                return 0;
            }
            int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
            if (i3 <= 0 || this.f54130.m26699(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C11551 c11551 = new C11551(this, i3);
            this.f54130.m26700(i3, c11551);
            if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int i4 = i2 + 1;
            c11551.start();
            return i4;
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C10388 c10388 = this.f54130;
        int iM26698 = c10388.m26698();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iM26698; i6++) {
            C11551 c11551 = (C11551) c10388.m26699(i6);
            if (c11551 != null) {
                int iM42410 = c11551.f36325.m42410();
                int i7 = C1857.f6249[c11551.f36323.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iM42410);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iM42410);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (iM42410 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iM42410);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = f54125.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f54133);
        sb4.append('@');
        sb4.append(C21892.m49586(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.f54131;
        sb4.append(i8);
        sb4.append(", max = ");
        sb4.append(this.f54129);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i);
        sb4.append(", blocking = ");
        sb4.append(i2);
        sb4.append(", parked = ");
        sb4.append(i3);
        sb4.append(", dormant = ");
        sb4.append(i4);
        sb4.append(", terminated = ");
        sb4.append(i5);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f54132.m54853());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f54134.m54853());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
