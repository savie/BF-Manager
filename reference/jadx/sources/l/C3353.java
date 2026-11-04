package l;

import java.lang.ref.ReferenceQueue;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* JADX INFO: renamed from: l.ۗۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3353 extends ReentrantLock {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC5942 f10940;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f10941;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile AtomicReferenceArray f10942;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f10943;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public long f10944;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f10945;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public int f10946;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5920 f10947;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f10948 = new AtomicInteger();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f10949;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f10950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f10951;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f10952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f10953;

    public C3353(ConcurrentMapC5942 concurrentMapC5942, int i, long j, InterfaceC5920 interfaceC5920) {
        Collection concurrentLinkedQueue;
        Collection c15636;
        Collection c8157;
        this.f10940 = concurrentMapC5942;
        this.f10945 = j;
        interfaceC5920.getClass();
        this.f10947 = interfaceC5920;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f10946 = length;
        if (concurrentMapC5942.f20337 == EnumC16360.INSTANCE && length == j) {
            this.f10946 = length + 1;
        }
        this.f10942 = atomicReferenceArray;
        EnumC4099 enumC4099 = concurrentMapC5942.f20338;
        EnumC4099 enumC40910 = EnumC4099.f13963;
        this.f10951 = enumC4099 != enumC40910 ? new ReferenceQueue() : null;
        this.f10949 = concurrentMapC5942.f20347 != enumC40910 ? new ReferenceQueue() : null;
        if (!concurrentMapC5942.m17298() && !concurrentMapC5942.m17295()) {
            concurrentLinkedQueue = ConcurrentMapC5942.f20332;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f10941 = (AbstractQueue) concurrentLinkedQueue;
        if (!concurrentMapC5942.m17299()) {
            c15636 = ConcurrentMapC5942.f20332;
        } else {
            c15636 = new C15636();
        }
        this.f10943 = (AbstractQueue) c15636;
        if (!concurrentMapC5942.m17298() && !concurrentMapC5942.m17295()) {
            c8157 = ConcurrentMapC5942.f20332;
        } else {
            c8157 = new C8157();
        }
        this.f10950 = (AbstractQueue) c8157;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 m11010(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214) {
        Object key = interfaceC2213.getKey();
        if (key == null) {
            return null;
        }
        InterfaceC10064 interfaceC10064Mo7552 = interfaceC2213.mo7552();
        Object obj = interfaceC10064Mo7552.get();
        if (obj == null && interfaceC10064Mo7552.mo2147()) {
            return null;
        }
        InterfaceC2213 interfaceC2213Mo5197 = this.f10940.f20351.mo5197(this, interfaceC2213, interfaceC2214, key);
        interfaceC2213Mo5197.mo7547(interfaceC10064Mo7552.mo2144(this.f10949, obj, interfaceC2213Mo5197));
        return interfaceC2213Mo5197;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11017(InterfaceC2213 interfaceC2213, Object obj, Object obj2, long j) {
        InterfaceC10064 interfaceC10064Mo7552 = interfaceC2213.mo7552();
        ConcurrentMapC5942 concurrentMapC5942 = this.f10940;
        int iMo3920 = concurrentMapC5942.f20337.mo3920(obj, obj2);
        C12128.m30314("Weights must be non-negative", iMo3920 >= 0);
        interfaceC2213.mo7547(concurrentMapC5942.f20347.mo13191(this, interfaceC2213, obj2, iMo3920));
        m11012();
        this.f10944 += (long) iMo3920;
        if (concurrentMapC5942.m17298()) {
            interfaceC2213.mo7545(j);
        }
        if (concurrentMapC5942.m17299() || concurrentMapC5942.f20341 > 0) {
            interfaceC2213.mo7548(j);
        }
        this.f10950.add(interfaceC2213);
        this.f10943.add(interfaceC2213);
        interfaceC10064Mo7552.mo2145(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11005(Object obj, int i, AbstractC20836 abstractC20836) {
        C1862 c1862;
        InterfaceC10064 interfaceC10064Mo7552;
        Object objM11004;
        lock();
        try {
            long jMo37347 = this.f10940.f20353.mo37347();
            m11025(jMo37347);
            boolean z = true;
            int i2 = this.f10953 - 1;
            AtomicReferenceArray atomicReferenceArray = this.f10942;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            InterfaceC2213 interfaceC2213Mo5196 = interfaceC2213;
            while (true) {
                c1862 = null;
                if (interfaceC2213Mo5196 == null) {
                    interfaceC10064Mo7552 = null;
                    break;
                }
                Object key = interfaceC2213Mo5196.getKey();
                if (interfaceC2213Mo5196.getHash() != i || key == null || !this.f10940.f20336.m31910(obj, key)) {
                    interfaceC2213Mo5196 = interfaceC2213Mo5196.getNext();
                } else {
                    interfaceC10064Mo7552 = interfaceC2213Mo5196.mo7552();
                    if (!interfaceC10064Mo7552.mo2146()) {
                        Object obj2 = interfaceC10064Mo7552.get();
                        if (obj2 == null) {
                            m11015(key, obj2, interfaceC10064Mo7552.mo2148(), EnumC23842.f77216);
                        } else if (this.f10940.m17296(interfaceC2213Mo5196, jMo37347)) {
                            m11015(key, obj2, interfaceC10064Mo7552.mo2148(), EnumC23842.f77214);
                        } else {
                            m11027(interfaceC2213Mo5196, jMo37347);
                            this.f10947.mo17230();
                            unlock();
                            m11022();
                            return obj2;
                        }
                        this.f10943.remove(interfaceC2213Mo5196);
                        this.f10950.remove(interfaceC2213Mo5196);
                        this.f10953 = i2;
                        break;
                    }
                    z = false;
                    break;
                }
            }
            if (z) {
                c1862 = new C1862();
                if (interfaceC2213Mo5196 == null) {
                    EnumC4845 enumC4845 = this.f10940.f20351;
                    obj.getClass();
                    interfaceC2213Mo5196 = enumC4845.mo5196(this, obj, i, interfaceC2213);
                    interfaceC2213Mo5196.mo7547(c1862);
                    atomicReferenceArray.set(length, interfaceC2213Mo5196);
                } else {
                    interfaceC2213Mo5196.mo7547(c1862);
                }
            }
            unlock();
            m11022();
            if (z) {
                try {
                    synchronized (interfaceC2213Mo5196) {
                        objM11004 = m11004(obj, i, c1862, c1862.m6392(obj, abstractC20836));
                    }
                    this.f10947.mo17228();
                    return objM11004;
                } catch (Throwable th) {
                    this.f10947.mo17228();
                    throw th;
                }
            }
            return m11008(interfaceC2213Mo5196, obj, interfaceC10064Mo7552);
        } catch (Throwable th2) {
            unlock();
            m11022();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11008(InterfaceC2213 interfaceC2213, Object obj, InterfaceC10064 interfaceC10064) {
        InterfaceC5920 interfaceC5920 = this.f10947;
        if (!interfaceC10064.mo2146()) {
            throw new AssertionError();
        }
        C12128.m30313(obj, "Recursive load of: %s", !Thread.holdsLock(interfaceC2213));
        try {
            Object objMo2149 = interfaceC10064.mo2149();
            if (objMo2149 == null) {
                throw new C3682("CacheLoader returned null for key " + obj + ".");
            }
            m11020(interfaceC2213, this.f10940.f20353.mo37347());
            interfaceC5920.mo17228();
            return objMo2149;
        } catch (Throwable th) {
            interfaceC5920.mo17228();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11004(Object obj, int i, C1862 c1862, InterfaceFutureC14736 interfaceFutureC14736) throws Throwable {
        Object objM44537;
        InterfaceC5920 interfaceC5920 = this.f10947;
        try {
            objM44537 = C19212.m44537(interfaceFutureC14736);
            try {
                if (objM44537 == null) {
                    throw new C3682("CacheLoader returned null for key " + obj + ".");
                }
                C2433 c2433 = c1862.f6264;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                interfaceC5920.mo17232(c2433.m8201());
                m11014(obj, i, c1862, objM44537);
                return objM44537;
            } catch (Throwable th) {
                th = th;
                if (objM44537 == null) {
                    C2433 c2434 = c1862.f6264;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    interfaceC5920.mo17229(c2434.m8201());
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f10942;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
                        for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                            Object key = next.getKey();
                            if (next.getHash() == i && key != null && this.f10940.f20336.m31910(obj, key)) {
                                if (next.mo7552() != c1862) {
                                    break;
                                }
                                if (c1862.f6265.mo2147()) {
                                    next.mo7547(c1862.f6265);
                                    break;
                                }
                                atomicReferenceArray.set(length, m11023(interfaceC2213, next));
                                break;
                            }
                        }
                    } finally {
                        unlock();
                        m11022();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objM44537 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11007(InterfaceC2213 interfaceC2213, final Object obj, final int i, Object obj2, long j, AbstractC20836 abstractC20836) {
        Object objM44537;
        C1862 c1862;
        final C1862 c1863;
        if (this.f10940.f20341 > 0 && j - interfaceC2213.mo7550() > this.f10940.f20341 && !interfaceC2213.mo7552().mo2146()) {
            C17359.requireNonNull(abstractC20836);
            lock();
            try {
                long jMo37347 = this.f10940.f20353.mo37347();
                m11025(jMo37347);
                AtomicReferenceArray atomicReferenceArray = this.f10942;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC2213 interfaceC2214 = (InterfaceC2213) atomicReferenceArray.get(length);
                InterfaceC2213 next = interfaceC2214;
                while (true) {
                    objM44537 = null;
                    if (next != null) {
                        Object key = next.getKey();
                        if (next.getHash() != i || key == null || !this.f10940.f20336.m31910(obj, key)) {
                            next = next.getNext();
                        } else {
                            InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                            if (!interfaceC10064Mo7552.mo2146() && jMo37347 - next.mo7550() >= this.f10940.f20341) {
                                this.f10952++;
                                c1862 = new C1862(interfaceC10064Mo7552);
                                next.mo7547(c1862);
                            } else {
                                unlock();
                                m11022();
                                c1863 = null;
                                break;
                            }
                        }
                    } else {
                        this.f10952++;
                        c1862 = new C1862();
                        EnumC4845 enumC4845 = this.f10940.f20351;
                        obj.getClass();
                        InterfaceC2213 interfaceC2213Mo5196 = enumC4845.mo5196(this, obj, i, interfaceC2214);
                        interfaceC2213Mo5196.mo7547(c1862);
                        atomicReferenceArray.set(length, interfaceC2213Mo5196);
                    }
                    unlock();
                    m11022();
                    c1863 = c1862;
                    break;
                }
                if (c1863 != null) {
                    final InterfaceFutureC14736 interfaceFutureC14736M6392 = c1863.m6392(obj, abstractC20836);
                    interfaceFutureC14736M6392.mo7375(new Runnable() { // from class: l.᩹ۤܽ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3353 c3353 = this.f75963;
                            Object obj3 = obj;
                            int i2 = i;
                            C1862 c1864 = c1863;
                            try {
                                c3353.m11004(obj3, i2, c1864, interfaceFutureC14736M6392);
                            } catch (Throwable th) {
                                ConcurrentMapC5942.f20333.log(Level.WARNING, "Exception thrown during refresh", th);
                                c1864.f6263.mo2584(th);
                            }
                        }
                    }, C18466.m43012());
                    if (interfaceFutureC14736M6392.isDone()) {
                        try {
                            objM44537 = C19212.m44537(interfaceFutureC14736M6392);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (objM44537 != null) {
                    return objM44537;
                }
            } catch (Throwable th) {
                unlock();
                m11022();
                throw th;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m11021() {
        if (tryLock()) {
            try {
                m11024();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[EDGE_INSN: B:47:0x0112->B:48:0x0115 BREAK  A[LOOP:3: B:26:0x00b6->B:41:0x0102]] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11024() {
        int i = 0;
        if (this.f10940.f20338 != EnumC4099.f13963) {
            int i2 = 0;
            do {
                Object objPoll = this.f10951.poll();
                if (objPoll == null) {
                    break;
                }
                InterfaceC2213 interfaceC2213 = (InterfaceC2213) objPoll;
                ConcurrentMapC5942 concurrentMapC5942 = this.f10940;
                concurrentMapC5942.getClass();
                int hash = interfaceC2213.getHash();
                C3353 c3353M17297 = concurrentMapC5942.m17297(hash);
                c3353M17297.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = c3353M17297.f10942;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    InterfaceC2213 interfaceC2214 = (InterfaceC2213) atomicReferenceArray.get(length);
                    for (InterfaceC2213 next = interfaceC2214; next != null; next = next.getNext()) {
                        if (next == interfaceC2213) {
                            c3353M17297.f10952++;
                            InterfaceC2213 interfaceC2213M11011 = c3353M17297.m11011(interfaceC2214, next, next.getKey(), next.mo7552().get(), next.mo7552(), EnumC23842.f77216);
                            int i3 = c3353M17297.f10953 - 1;
                            atomicReferenceArray.set(length, interfaceC2213M11011);
                            c3353M17297.f10953 = i3;
                            break;
                        }
                    }
                    c3353M17297.unlock();
                    c3353M17297.m11022();
                    i2++;
                } catch (Throwable th) {
                    c3353M17297.unlock();
                    c3353M17297.m11022();
                    throw th;
                }
            } while (i2 != 16);
        }
        if (this.f10940.f20347 != EnumC4099.f13963) {
            do {
                Object objPoll2 = this.f10949.poll();
                if (objPoll2 == null) {
                    return;
                }
                InterfaceC10064 interfaceC10064 = (InterfaceC10064) objPoll2;
                ConcurrentMapC5942 concurrentMapC5943 = this.f10940;
                concurrentMapC5943.getClass();
                InterfaceC2213 entry = interfaceC10064.getEntry();
                int hash2 = entry.getHash();
                C3353 c3353M17298 = concurrentMapC5943.m17297(hash2);
                Object key = entry.getKey();
                c3353M17298.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = c3353M17298.f10942;
                    int length2 = hash2 & (atomicReferenceArray2.length() - 1);
                    InterfaceC2213 interfaceC2215 = (InterfaceC2213) atomicReferenceArray2.get(length2);
                    InterfaceC2213 next2 = interfaceC2215;
                    while (true) {
                        if (next2 == null) {
                            c3353M17298.unlock();
                            if (!c3353M17298.isHeldByCurrentThread()) {
                                c3353M17298.m11022();
                                break;
                            }
                            break;
                        }
                        Object key2 = next2.getKey();
                        if (next2.getHash() == hash2 && key2 != null && c3353M17298.f10940.f20336.m31910(key, key2)) {
                            if (next2.mo7552() != interfaceC10064) {
                                c3353M17298.unlock();
                                if (!c3353M17298.isHeldByCurrentThread()) {
                                    c3353M17298.m11022();
                                    break;
                                }
                                break;
                            }
                            c3353M17298.f10952++;
                            InterfaceC2213 interfaceC2213M11012 = c3353M17298.m11011(interfaceC2215, next2, key2, interfaceC10064.get(), interfaceC10064, EnumC23842.f77216);
                            int i4 = c3353M17298.f10953 - 1;
                            atomicReferenceArray2.set(length2, interfaceC2213M11012);
                            c3353M17298.f10953 = i4;
                            c3353M17298.unlock();
                            if (!c3353M17298.isHeldByCurrentThread()) {
                                c3353M17298.m11022();
                                break;
                            }
                            break;
                        }
                        next2 = next2.getNext();
                    }
                    i++;
                } catch (Throwable th2) {
                    c3353M17298.unlock();
                    if (!c3353M17298.isHeldByCurrentThread()) {
                        c3353M17298.m11022();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11020(InterfaceC2213 interfaceC2213, long j) {
        if (this.f10940.m17298()) {
            interfaceC2213.mo7545(j);
        }
        this.f10941.add(interfaceC2213);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11027(InterfaceC2213 interfaceC2213, long j) {
        if (this.f10940.m17298()) {
            interfaceC2213.mo7545(j);
        }
        this.f10950.add(interfaceC2213);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11012() {
        while (true) {
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) this.f10941.poll();
            if (interfaceC2213 == null) {
                return;
            }
            AbstractQueue abstractQueue = this.f10950;
            if (abstractQueue.contains(interfaceC2213)) {
                abstractQueue.add(interfaceC2213);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11013(long j) {
        InterfaceC2213 interfaceC2213;
        InterfaceC2213 interfaceC2214;
        m11012();
        do {
            interfaceC2213 = (InterfaceC2213) this.f10943.peek();
            ConcurrentMapC5942 concurrentMapC5942 = this.f10940;
            if (interfaceC2213 == null || !concurrentMapC5942.m17296(interfaceC2213, j)) {
                do {
                    interfaceC2214 = (InterfaceC2213) this.f10950.peek();
                    if (interfaceC2214 == null || !concurrentMapC5942.m17296(interfaceC2214, j)) {
                        return;
                    }
                } while (m11018(interfaceC2214, interfaceC2214.getHash(), EnumC23842.f77214));
                throw new AssertionError();
            }
        } while (m11018(interfaceC2213, interfaceC2213.getHash(), EnumC23842.f77214));
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11015(Object obj, Object obj2, int i, EnumC23842 enumC23842) {
        this.f10944 -= (long) i;
        if (enumC23842.mo29788()) {
            this.f10947.mo17231();
        }
        ConcurrentMapC5942 concurrentMapC5942 = this.f10940;
        if (concurrentMapC5942.f20339 != ConcurrentMapC5942.f20332) {
            concurrentMapC5942.f20339.offer(new C20858(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11016(InterfaceC2213 interfaceC2213) {
        InterfaceC2213 interfaceC2214;
        if (this.f10940.m17295()) {
            m11012();
            long jMo2148 = interfaceC2213.mo7552().mo2148();
            long j = this.f10945;
            if (jMo2148 > j && !m11018(interfaceC2213, interfaceC2213.getHash(), EnumC23842.f77215)) {
                throw new AssertionError();
            }
            while (this.f10944 > j) {
                Iterator it = this.f10950.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new AssertionError();
                    }
                    interfaceC2214 = (InterfaceC2213) it.next();
                } while (interfaceC2214.mo7552().mo2148() <= 0);
                if (!m11018(interfaceC2214, interfaceC2214.getHash(), EnumC23842.f77215)) {
                    throw new AssertionError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 m11009(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f10942;
        for (InterfaceC2213 next = (InterfaceC2213) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                Object key = next.getKey();
                if (key == null) {
                    m11021();
                } else if (this.f10940.f20336.m31910(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11006(InterfaceC2213 interfaceC2213, long j) {
        if (interfaceC2213.getKey() == null) {
            m11021();
            return null;
        }
        Object obj = interfaceC2213.mo7552().get();
        if (obj == null) {
            m11021();
            return null;
        }
        if (!this.f10940.m17296(interfaceC2213, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            m11013(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m11003(Object obj, int i, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long jMo37347 = this.f10940.f20353.mo37347();
            m11025(jMo37347);
            if (this.f10953 + 1 > this.f10946) {
                m11019();
            }
            AtomicReferenceArray atomicReferenceArray = this.f10942;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f10940.f20336.m31910(obj, key)) {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj3 = interfaceC10064Mo7552.get();
                    if (obj3 != null) {
                        if (z) {
                            m11027(next, jMo37347);
                        } else {
                            this.f10952++;
                            m11015(obj, obj3, interfaceC10064Mo7552.mo2148(), EnumC23842.f77212);
                            m11017(next, obj, obj2, jMo37347);
                            m11016(next);
                        }
                        return obj3;
                    }
                    this.f10952++;
                    if (interfaceC10064Mo7552.mo2147()) {
                        m11015(obj, obj3, interfaceC10064Mo7552.mo2148(), EnumC23842.f77216);
                        m11017(next, obj, obj2, jMo37347);
                        i2 = this.f10953;
                    } else {
                        m11017(next, obj, obj2, jMo37347);
                        i2 = this.f10953 + 1;
                    }
                    this.f10953 = i2;
                    m11016(next);
                    return null;
                }
            }
            this.f10952++;
            InterfaceC2213 interfaceC2213Mo5196 = this.f10940.f20351.mo5196(this, obj, i, interfaceC2213);
            m11017(interfaceC2213Mo5196, obj, obj2, jMo37347);
            atomicReferenceArray.set(length, interfaceC2213Mo5196);
            this.f10953++;
            m11016(interfaceC2213Mo5196);
            return null;
        } finally {
            unlock();
            m11022();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m11019() {
        AtomicReferenceArray atomicReferenceArray = this.f10942;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f10953;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f10946 = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC2213 next = (InterfaceC2213) atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC2213 next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC2213 interfaceC2213 = next;
                    while (next2 != null) {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC2213 = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    }
                    atomicReferenceArray2.set(hash, interfaceC2213);
                    while (next != interfaceC2213) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC2213 interfaceC2213M11010 = m11010(next, (InterfaceC2213) atomicReferenceArray2.get(hash3));
                        if (interfaceC2213M11010 != null) {
                            atomicReferenceArray2.set(hash3, interfaceC2213M11010);
                        } else {
                            m11026(next);
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.f10942 = atomicReferenceArray2;
        this.f10953 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11014(Object obj, int i, C1862 c1862, Object obj2) {
        lock();
        try {
            long jMo37347 = this.f10940.f20353.mo37347();
            m11025(jMo37347);
            int i2 = this.f10953 + 1;
            if (i2 > this.f10946) {
                m11019();
                i2 = this.f10953 + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f10942;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f10940.f20336.m31910(obj, key)) {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj3 = interfaceC10064Mo7552.get();
                    if (c1862 == interfaceC10064Mo7552 || (obj3 == null && interfaceC10064Mo7552 != ConcurrentMapC5942.f20334)) {
                        this.f10952++;
                        if (c1862.f6265.mo2147()) {
                            m11015(obj, obj3, c1862.f6265.mo2148(), obj3 == null ? EnumC23842.f77216 : EnumC23842.f77212);
                            i2--;
                        }
                        m11017(next, obj, obj2, jMo37347);
                        this.f10953 = i2;
                        m11016(next);
                    } else {
                        m11015(obj, obj2, 0, EnumC23842.f77212);
                    }
                }
            }
            this.f10952++;
            EnumC4845 enumC4845 = this.f10940.f20351;
            obj.getClass();
            InterfaceC2213 interfaceC2213Mo5196 = enumC4845.mo5196(this, obj, i, interfaceC2213);
            m11017(interfaceC2213Mo5196, obj, obj2, jMo37347);
            atomicReferenceArray.set(length, interfaceC2213Mo5196);
            this.f10953 = i2;
            m11016(interfaceC2213Mo5196);
        } finally {
            unlock();
            m11022();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 m11011(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214, Object obj, Object obj2, InterfaceC10064 interfaceC10064, EnumC23842 enumC23842) {
        m11015(obj, obj2, interfaceC10064.mo2148(), enumC23842);
        this.f10943.remove(interfaceC2214);
        this.f10950.remove(interfaceC2214);
        if (interfaceC10064.mo2146()) {
            interfaceC10064.mo2145(null);
            return interfaceC2213;
        }
        return m11023(interfaceC2213, interfaceC2214);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC2213 m11023(InterfaceC2213 interfaceC2213, InterfaceC2213 interfaceC2214) {
        int i = this.f10953;
        InterfaceC2213 next = interfaceC2214.getNext();
        while (interfaceC2213 != interfaceC2214) {
            InterfaceC2213 interfaceC2213M11010 = m11010(interfaceC2213, next);
            if (interfaceC2213M11010 != null) {
                next = interfaceC2213M11010;
            } else {
                m11026(interfaceC2213);
                i--;
            }
            interfaceC2213 = interfaceC2213.getNext();
        }
        this.f10953 = i;
        return next;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11026(InterfaceC2213 interfaceC2213) {
        Object key = interfaceC2213.getKey();
        interfaceC2213.getHash();
        m11015(key, interfaceC2213.mo7552().get(), interfaceC2213.mo7552().mo2148(), EnumC23842.f77216);
        this.f10943.remove(interfaceC2213);
        this.f10950.remove(interfaceC2213);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11018(InterfaceC2213 interfaceC2213, int i, EnumC23842 enumC23842) {
        AtomicReferenceArray atomicReferenceArray = this.f10942;
        int length = i & (atomicReferenceArray.length() - 1);
        InterfaceC2213 interfaceC2214 = (InterfaceC2213) atomicReferenceArray.get(length);
        for (InterfaceC2213 next = interfaceC2214; next != null; next = next.getNext()) {
            if (next == interfaceC2213) {
                this.f10952++;
                InterfaceC2213 interfaceC2213M11011 = m11011(interfaceC2214, next, next.getKey(), next.mo7552().get(), next.mo7552(), enumC23842);
                int i2 = this.f10953 - 1;
                atomicReferenceArray.set(length, interfaceC2213M11011);
                this.f10953 = i2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final void m11028() {
        if ((this.f10948.incrementAndGet() & 63) == 0) {
            m11025(this.f10940.f20353.mo37347());
            m11022();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m11025(long j) {
        if (tryLock()) {
            try {
                m11024();
                m11013(j);
                this.f10948.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m11022() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            ConcurrentMapC5942 concurrentMapC5942 = this.f10940;
            C20858 c20858 = (C20858) concurrentMapC5942.f20339.poll();
            if (c20858 == null) {
                return;
            }
            try {
                concurrentMapC5942.f20348.mo12024(c20858);
            } catch (Throwable th) {
                ConcurrentMapC5942.f20333.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }
}
