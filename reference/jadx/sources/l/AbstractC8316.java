package l;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.۠ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8316 extends AbstractC19605 implements InterfaceC5493 {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28840 = AtomicReferenceFieldUpdater.newUpdater(AbstractC8316.class, Object.class, "_queue");

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f28841 = AtomicReferenceFieldUpdater.newUpdater(AbstractC8316.class, Object.class, "_delayed");
    public volatile /* synthetic */ Object _queue = null;
    public volatile /* synthetic */ Object _delayed = null;
    public volatile /* synthetic */ int _isCompleted = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m21740(AbstractC8316 abstractC8316) {
        return abstractC8316._isCompleted;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21744(long j, AbstractRunnableC18193 abstractRunnableC18193) {
        int iM42311;
        Thread threadMo14851;
        if (this._isCompleted != 0) {
            iM42311 = 1;
        } else {
            C18899 c18899 = (C18899) this._delayed;
            if (c18899 == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28841;
                C18899 c188910 = new C18899();
                c188910.f61181 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c188910) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                C13465.m32962(obj);
                c18899 = (C18899) obj;
            }
            iM42311 = abstractRunnableC18193.m42311(j, c18899, (RunnableC11844) this);
        }
        if (iM42311 != 0) {
            if (iM42311 == 1) {
                mo29538(j, abstractRunnableC18193);
                return;
            } else {
                if (iM42311 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C18899 c188911 = (C18899) this._delayed;
        if ((c188911 != null ? (AbstractRunnableC18193) c188911.m17534() : null) != abstractRunnableC18193 || Thread.currentThread() == (threadMo14851 = mo14851())) {
            return;
        }
        LockSupport.unpark(threadMo14851);
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final boolean m21745() {
        if (!m48462()) {
            return false;
        }
        C18899 c18899 = (C18899) this._delayed;
        if (c18899 != null && !c18899.m17536()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof C15560) {
            return ((C15560) obj).m37202();
        }
        return obj == C9022.f30822;
    }

    @Override // l.AbstractC21721
    public void shutdown() {
        AbstractRunnableC18193 abstractRunnableC18193;
        C21390.m47941();
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28840;
                C21203 c21203 = C9022.f30822;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c21203)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof C15560) {
                    ((C15560) obj).m37200();
                    break;
                }
                if (obj == C9022.f30822) {
                    break;
                }
                C15560 c15560 = new C15560(8, true);
                c15560.m37199((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28840;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c15560)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        while (m21743() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C18899 c18899 = (C18899) this._delayed;
            if (c18899 == null || (abstractRunnableC18193 = (AbstractRunnableC18193) c18899.m17530()) == null) {
                return;
            } else {
                mo29538(jNanoTime, abstractRunnableC18193);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ae  */
    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m21743() {
        C18899 c18899;
        AbstractRunnableC18193 abstractRunnableC18193;
        InterfaceC11326 interfaceC11326M17532;
        if (!m48465()) {
            C18899 c188910 = (C18899) this._delayed;
            Runnable runnable = null;
            if (c188910 != null && !c188910.m17536()) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (c188910) {
                        InterfaceC11326 interfaceC11326M17531 = c188910.m17531();
                        if (interfaceC11326M17531 == null) {
                            interfaceC11326M17532 = null;
                        } else {
                            AbstractRunnableC18193 abstractRunnableC18194 = (AbstractRunnableC18193) interfaceC11326M17531;
                            interfaceC11326M17532 = ((jNanoTime - abstractRunnableC18194.f58138) > 0L ? 1 : ((jNanoTime - abstractRunnableC18194.f58138) == 0L ? 0 : -1)) >= 0 ? m21741(abstractRunnableC18194) : false ? c188910.m17532(0) : null;
                        }
                    }
                } while (((AbstractRunnableC18193) interfaceC11326M17532) != null);
            }
            loop1: while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    break;
                }
                if (obj instanceof C15560) {
                    C15560 c15560 = (C15560) obj;
                    Object objM37201 = c15560.m37201();
                    if (objM37201 != C15560.f50615) {
                        runnable = (Runnable) objM37201;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28840;
                    C15560 c15560M37198 = c15560.m37198();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c15560M37198) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == C9022.f30822) {
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28840;
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            if (super.m48464() != 0) {
                Object obj2 = this._queue;
                if (obj2 == null) {
                    c18899 = (C18899) this._delayed;
                    if (c18899 == null && (abstractRunnableC18193 = (AbstractRunnableC18193) c18899.m17534()) != null) {
                        long jNanoTime2 = abstractRunnableC18193.f58138 - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                } else if (obj2 instanceof C15560) {
                    if (((C15560) obj2).m37202()) {
                        c18899 = (C18899) this._delayed;
                        return c18899 == null ? C17492.FOREVER_NS : C17492.FOREVER_NS;
                    }
                } else if (obj2 == C9022.f30822) {
                    return C17492.FOREVER_NS;
                }
            }
        }
        return 0L;
    }

    @Override // l.AbstractC12405
    /* JADX INFO: renamed from: ۙ */
    public final void mo8623(InterfaceC22386 interfaceC22386, Runnable runnable) {
        mo21742(runnable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo21742(Runnable runnable) {
        if (m21741(runnable)) {
            Thread threadMo14851 = mo14851();
            if (Thread.currentThread() != threadMo14851) {
                LockSupport.unpark(threadMo14851);
                return;
            }
            return;
        }
        RunnableC11844.f39749.mo21742(runnable);
    }

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final void m21746() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private final boolean m21741(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28840;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C15560)) {
                if (obj == C9022.f30822) {
                    return false;
                }
                C15560 c15560 = new C15560(8, true);
                c15560.m37199((Runnable) obj);
                c15560.m37199(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f28840;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c15560)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return true;
            }
            C15560 c15561 = (C15560) obj;
            int iM37199 = c15561.m37199(runnable);
            if (iM37199 == 0) {
                return true;
            }
            if (iM37199 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f28840;
                C15560 c15560M37198 = c15561.m37198();
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c15560M37198) && atomicReferenceFieldUpdater3.get(this) == obj) {
                }
            } else if (iM37199 == 2) {
                return false;
            }
        }
    }
}
