package l;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: l.᩹ۜ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 2AYL */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23384 extends AbstractC3246 implements InterfaceC19654 {
    public volatile /* synthetic */ Object _delayed$volatile;
    public volatile /* synthetic */ int _isCompleted$volatile = 0;
    public volatile /* synthetic */ Object _queue$volatile;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75697 = AtomicReferenceFieldUpdater.newUpdater(AbstractC23384.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f75699 = AtomicReferenceFieldUpdater.newUpdater(AbstractC23384.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f75698 = AtomicIntegerFieldUpdater.newUpdater(AbstractC23384.class, "_isCompleted$volatile");

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final boolean m52548(AbstractC23384 abstractC23384) {
        abstractC23384.getClass();
        return f75698.get(abstractC23384) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m52552(long j, AbstractRunnableC17416 abstractRunnableC17416) {
        int iM40895;
        Thread threadMo10606;
        int i = f75698.get(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75699;
        if (i != 0) {
            iM40895 = 1;
        } else {
            C15924 c15924 = (C15924) atomicReferenceFieldUpdater.get(this);
            if (c15924 == null) {
                C15924 c15925 = new C15924();
                c15925.f51730 = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c15925) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                C15243.m36586(obj);
                c15924 = (C15924) obj;
            }
            iM40895 = abstractRunnableC17416.m40895(j, c15924, (RunnableC10703) this);
        }
        if (iM40895 != 0) {
            if (iM40895 == 1) {
                mo10605(j, abstractRunnableC17416);
                return;
            } else {
                if (iM40895 != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C15924 c15926 = (C15924) atomicReferenceFieldUpdater.get(this);
        if ((c15926 != null ? (AbstractRunnableC17416) c15926.m36645() : null) != abstractRunnableC17416 || Thread.currentThread() == (threadMo10606 = mo10606())) {
            return;
        }
        LockSupport.unpark(threadMo10606);
    }

    public final boolean isEmpty() {
        if (!m39385()) {
            return false;
        }
        C15924 c15924 = (C15924) f75699.get(this);
        if (c15924 != null && !c15924.m36647()) {
            return false;
        }
        Object obj = f75697.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof C14863) {
            return ((C14863) obj).m35805();
        }
        return obj == C20400.f65390;
    }

    @Override // l.AbstractC16670
    public void shutdown() {
        AbstractRunnableC17416 abstractRunnableC17416;
        C23580.m52771();
        f75698.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75697;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                C7406 c7406 = C20400.f65390;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c7406)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof C14863) {
                ((C14863) obj).m35804();
                break;
            } else {
                if (obj == C20400.f65390) {
                    break;
                }
                C14863 c14863 = new C14863(8, true);
                c14863.m35803((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c14863)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (m52550() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C15924 c15924 = (C15924) f75699.get(this);
            if (c15924 == null || (abstractRunnableC17416 = (AbstractRunnableC17416) c15924.m36648()) == null) {
                return;
            } else {
                mo10605(jNanoTime, abstractRunnableC17416);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final long m52550() {
        C15924 c15924;
        AbstractRunnableC17416 abstractRunnableC17416;
        InterfaceC13043 interfaceC13043M36643;
        if (!m39387()) {
            C15924 c15925 = (C15924) f75699.get(this);
            Runnable runnable = null;
            if (c15925 != null && !c15925.m36647()) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (c15925) {
                        InterfaceC13043 interfaceC13043M36642 = c15925.m36642();
                        if (interfaceC13043M36642 == null) {
                            interfaceC13043M36643 = null;
                        } else {
                            AbstractRunnableC17416 abstractRunnableC17417 = (AbstractRunnableC17416) interfaceC13043M36642;
                            interfaceC13043M36643 = ((jNanoTime - abstractRunnableC17417.f56618) > 0L ? 1 : ((jNanoTime - abstractRunnableC17417.f56618) == 0L ? 0 : -1)) >= 0 ? m52549(abstractRunnableC17417) : false ? c15925.m36643(0) : null;
                        }
                    }
                } while (((AbstractRunnableC17416) interfaceC13043M36643) != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75697;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj == null) {
                    break;
                }
                if (obj instanceof C14863) {
                    C14863 c14863 = (C14863) obj;
                    Object objM35806 = c14863.m35806();
                    if (objM35806 != C14863.f48585) {
                        runnable = (Runnable) objM35806;
                        break;
                    }
                    C14863 c14863M35808 = c14863.m35808();
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c14863M35808) && atomicReferenceFieldUpdater.get(this) == obj) {
                    }
                } else {
                    if (obj == C20400.f65390) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break loop1;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                }
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            if (super.m39388() != 0) {
                Object obj2 = f75697.get(this);
                if (obj2 == null) {
                    c15924 = (C15924) f75699.get(this);
                    if (c15924 == null && (abstractRunnableC17416 = (AbstractRunnableC17416) c15924.m36645()) != null) {
                        long jNanoTime2 = abstractRunnableC17416.f56618 - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                } else if (obj2 instanceof C14863) {
                    if (((C14863) obj2).m35805()) {
                        c15924 = (C15924) f75699.get(this);
                        return c15924 == null ? C25227.FOREVER_NS : C25227.FOREVER_NS;
                    }
                } else if (obj2 == C20400.f65390) {
                    return C25227.FOREVER_NS;
                }
            }
        }
        return 0L;
    }

    @Override // l.AbstractC18951
    /* JADX INFO: renamed from: ۙ */
    public final void mo11210(InterfaceC11536 interfaceC11536, Runnable runnable) {
        mo27298(runnable);
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo27298(Runnable runnable) {
        if (m52549(runnable)) {
            Thread threadMo10606 = mo10606();
            if (Thread.currentThread() != threadMo10606) {
                LockSupport.unpark(threadMo10606);
                return;
            }
            return;
        }
        RunnableC10703.f33995.mo27298(runnable);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private final boolean m52549(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f75697;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f75698.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C14863)) {
                if (obj == C20400.f65390) {
                    return false;
                }
                C14863 c14863 = new C14863(8, true);
                c14863.m35803((Runnable) obj);
                c14863.m35803(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c14863)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            C14863 c14864 = (C14863) obj;
            int iM35803 = c14864.m35803(runnable);
            if (iM35803 == 0) {
                return true;
            }
            if (iM35803 == 1) {
                C14863 c14863M35808 = c14864.m35808();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c14863M35808) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iM35803 == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final void m52551() {
        f75697.set(this, null);
        f75699.set(this, null);
    }
}
