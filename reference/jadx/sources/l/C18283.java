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

/* JADX INFO: renamed from: l.ᩳ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes4.dex */
public final class C18283 extends ReentrantLock {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f58333;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int f58334;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final ReferenceQueue f58335;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f58336;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f58337 = new AtomicInteger();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public long f58338;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f58339;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f58340;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public volatile AtomicReferenceArray f58341;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f58342;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC21937 f58343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f58344;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public volatile int f58345;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC22392 f58346;

    public C18283(ConcurrentMapC21937 concurrentMapC21937, int i, long j, InterfaceC22392 interfaceC22392) {
        Collection concurrentLinkedQueue;
        Collection c2180;
        Collection c0519;
        this.f58343 = concurrentMapC21937;
        this.f58340 = j;
        interfaceC22392.getClass();
        this.f58346 = interfaceC22392;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(i);
        int length = (atomicReferenceArray.length() * 3) / 4;
        this.f58334 = length;
        if (concurrentMapC21937.f71149 == EnumC15337.INSTANCE && length == j) {
            this.f58334 = length + 1;
        }
        this.f58341 = atomicReferenceArray;
        EnumC10523 enumC10523 = concurrentMapC21937.f71159;
        EnumC10523 enumC10524 = EnumC10523.f36019;
        this.f58333 = enumC10523 != enumC10524 ? new ReferenceQueue() : null;
        this.f58335 = concurrentMapC21937.f71145 != enumC10524 ? new ReferenceQueue() : null;
        if (!concurrentMapC21937.m48760() && !concurrentMapC21937.m48756()) {
            concurrentLinkedQueue = ConcurrentMapC21937.f71141;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f58339 = (AbstractQueue) concurrentLinkedQueue;
        if (!concurrentMapC21937.m48758()) {
            c2180 = ConcurrentMapC21937.f71141;
        } else {
            c2180 = new C2180();
        }
        this.f58336 = (AbstractQueue) c2180;
        if (!concurrentMapC21937.m48760() && !concurrentMapC21937.m48756()) {
            c0519 = ConcurrentMapC21937.f71141;
        } else {
            c0519 = new C0519();
        }
        this.f58342 = (AbstractQueue) c0519;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 m42480(InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610) {
        Object key = interfaceC0769.getKey();
        if (key == null) {
            return null;
        }
        InterfaceC12639 interfaceC12639Mo3304 = interfaceC0769.mo3304();
        Object obj = interfaceC12639Mo3304.get();
        if (obj == null && interfaceC12639Mo3304.mo4754()) {
            return null;
        }
        InterfaceC0769 interfaceC0769Mo6266 = this.f58343.f71144.mo6266(this, interfaceC0769, interfaceC07610, key);
        interfaceC0769Mo6266.mo3303(interfaceC12639Mo3304.mo4751(this.f58335, obj, interfaceC0769Mo6266));
        return interfaceC0769Mo6266;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42487(InterfaceC0769 interfaceC0769, Object obj, Object obj2, long j) {
        InterfaceC12639 interfaceC12639Mo3304 = interfaceC0769.mo3304();
        ConcurrentMapC21937 concurrentMapC21937 = this.f58343;
        int iMo20649 = concurrentMapC21937.f71149.mo20649(obj, obj2);
        C18304.m42522("Weights must be non-negative", iMo20649 >= 0);
        interfaceC0769.mo3303(concurrentMapC21937.f71145.mo22038(this, interfaceC0769, obj2, iMo20649));
        m42482();
        this.f58338 += (long) iMo20649;
        if (concurrentMapC21937.m48760()) {
            interfaceC0769.mo3301(j);
        }
        if (concurrentMapC21937.m48758() || concurrentMapC21937.f71153 > 0) {
            interfaceC0769.mo2937(j);
        }
        this.f58342.add(interfaceC0769);
        this.f58336.add(interfaceC0769);
        interfaceC12639Mo3304.mo4752(obj2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42475(Object obj, int i, AbstractC18864 abstractC18864) {
        C1349 c1349;
        InterfaceC12639 interfaceC12639Mo3304;
        Object objM42474;
        lock();
        try {
            long jMo8123 = this.f58343.f71151.mo8123();
            m42494(jMo8123);
            boolean z = true;
            int i2 = this.f58345 - 1;
            AtomicReferenceArray atomicReferenceArray = this.f58341;
            int length = (atomicReferenceArray.length() - 1) & i;
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            InterfaceC0769 interfaceC0769Mo6265 = interfaceC0769;
            while (true) {
                c1349 = null;
                if (interfaceC0769Mo6265 == null) {
                    interfaceC12639Mo3304 = null;
                    break;
                }
                Object key = interfaceC0769Mo6265.getKey();
                if (interfaceC0769Mo6265.getHash() != i || key == null || !this.f58343.f71154.m34035(obj, key)) {
                    interfaceC0769Mo6265 = interfaceC0769Mo6265.getNext();
                } else {
                    interfaceC12639Mo3304 = interfaceC0769Mo6265.mo3304();
                    if (!interfaceC12639Mo3304.mo4753()) {
                        Object obj2 = interfaceC12639Mo3304.get();
                        if (obj2 == null) {
                            m42485(key, obj2, interfaceC12639Mo3304.mo4755(), EnumC21231.f69157);
                        } else if (this.f58343.m48757(interfaceC0769Mo6265, jMo8123)) {
                            m42485(key, obj2, interfaceC12639Mo3304.mo4755(), EnumC21231.f69152);
                        } else {
                            m42496(interfaceC0769Mo6265, jMo8123);
                            this.f58346.mo32707();
                            unlock();
                            m42489();
                            return obj2;
                        }
                        this.f58336.remove(interfaceC0769Mo6265);
                        this.f58342.remove(interfaceC0769Mo6265);
                        this.f58345 = i2;
                        break;
                    }
                    z = false;
                    break;
                }
            }
            if (z) {
                c1349 = new C1349();
                if (interfaceC0769Mo6265 == null) {
                    EnumC9693 enumC9693 = this.f58343.f71144;
                    obj.getClass();
                    interfaceC0769Mo6265 = enumC9693.mo6265(this, obj, i, interfaceC0769);
                    interfaceC0769Mo6265.mo3303(c1349);
                    atomicReferenceArray.set(length, interfaceC0769Mo6265);
                } else {
                    interfaceC0769Mo6265.mo3303(c1349);
                }
            }
            unlock();
            m42489();
            if (z) {
                try {
                    synchronized (interfaceC0769Mo6265) {
                        objM42474 = m42474(obj, i, c1349, c1349.m4750(obj, abstractC18864));
                    }
                    this.f58346.mo32705();
                    return objM42474;
                } catch (Throwable th) {
                    this.f58346.mo32705();
                    throw th;
                }
            }
            return m42478(interfaceC0769Mo6265, obj, interfaceC12639Mo3304);
        } catch (Throwable th2) {
            unlock();
            m42489();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42478(InterfaceC0769 interfaceC0769, Object obj, InterfaceC12639 interfaceC12639) {
        InterfaceC22392 interfaceC22392 = this.f58346;
        if (!interfaceC12639.mo4753()) {
            throw new AssertionError();
        }
        C18304.m42521(obj, "Recursive load of: %s", !Thread.holdsLock(interfaceC0769));
        try {
            Object objMo4749 = interfaceC12639.mo4749();
            if (objMo4749 == null) {
                throw new C18158("CacheLoader returned null for key " + obj + ".");
            }
            m42491(interfaceC0769, this.f58343.f71151.mo8123());
            interfaceC22392.mo32705();
            return objMo4749;
        } catch (Throwable th) {
            interfaceC22392.mo32705();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42474(Object obj, int i, C1349 c1349, InterfaceFutureC12329 interfaceFutureC12329) throws Throwable {
        Object objM34846;
        InterfaceC22392 interfaceC22392 = this.f58346;
        try {
            objM34846 = C14446.m34846(interfaceFutureC12329);
            try {
                if (objM34846 == null) {
                    throw new C18158("CacheLoader returned null for key " + obj + ".");
                }
                C6309 c6309 = c1349.f5681;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                interfaceC22392.mo32709(c6309.m17408());
                m42484(obj, i, c1349, objM34846);
                return objM34846;
            } catch (Throwable th) {
                th = th;
                if (objM34846 == null) {
                    C6309 c63010 = c1349.f5681;
                    TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
                    interfaceC22392.mo32706(c63010.m17408());
                    lock();
                    try {
                        AtomicReferenceArray atomicReferenceArray = this.f58341;
                        int length = (atomicReferenceArray.length() - 1) & i;
                        InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
                        for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                            Object key = next.getKey();
                            if (next.getHash() == i && key != null && this.f58343.f71154.m34035(obj, key)) {
                                if (next.mo3304() != c1349) {
                                    break;
                                }
                                if (c1349.f5683.mo4754()) {
                                    next.mo3303(c1349.f5683);
                                    break;
                                }
                                atomicReferenceArray.set(length, m42492(interfaceC0769, next));
                                break;
                            }
                        }
                    } finally {
                        unlock();
                        m42489();
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            objM34846 = null;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42477(InterfaceC0769 interfaceC0769, final Object obj, final int i, Object obj2, long j, AbstractC18864 abstractC18864) {
        Object objM34846;
        C1349 c1349;
        final C1349 c13410;
        if (this.f58343.f71153 > 0 && j - interfaceC0769.mo2936() > this.f58343.f71153 && !interfaceC0769.mo3304().mo4753()) {
            lock();
            try {
                long jMo8123 = this.f58343.f71151.mo8123();
                m42494(jMo8123);
                AtomicReferenceArray atomicReferenceArray = this.f58341;
                int length = (atomicReferenceArray.length() - 1) & i;
                InterfaceC0769 interfaceC07610 = (InterfaceC0769) atomicReferenceArray.get(length);
                InterfaceC0769 next = interfaceC07610;
                while (true) {
                    objM34846 = null;
                    if (next != null) {
                        Object key = next.getKey();
                        if (next.getHash() != i || key == null || !this.f58343.f71154.m34035(obj, key)) {
                            next = next.getNext();
                        } else {
                            InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                            if (!interfaceC12639Mo3304.mo4753() && jMo8123 - next.mo2936() >= this.f58343.f71153) {
                                this.f58344++;
                                c1349 = new C1349(interfaceC12639Mo3304);
                                next.mo3303(c1349);
                            } else {
                                unlock();
                                m42489();
                                c13410 = null;
                                break;
                            }
                        }
                    } else {
                        this.f58344++;
                        c1349 = new C1349();
                        EnumC9693 enumC9693 = this.f58343.f71144;
                        obj.getClass();
                        InterfaceC0769 interfaceC0769Mo6265 = enumC9693.mo6265(this, obj, i, interfaceC07610);
                        interfaceC0769Mo6265.mo3303(c1349);
                        atomicReferenceArray.set(length, interfaceC0769Mo6265);
                    }
                    unlock();
                    m42489();
                    c13410 = c1349;
                    break;
                }
                if (c13410 != null) {
                    final InterfaceFutureC12329 interfaceFutureC12329M4750 = c13410.m4750(obj, abstractC18864);
                    interfaceFutureC12329M4750.mo1994(new Runnable() { // from class: l.᩸᩶ܶ
                        @Override // java.lang.Runnable
                        public final void run() {
                            C18283 c18283 = this.f70624;
                            Object obj3 = obj;
                            int i2 = i;
                            C1349 c13411 = c13410;
                            try {
                                c18283.m42474(obj3, i2, c13411, interfaceFutureC12329M4750);
                            } catch (Throwable th) {
                                ConcurrentMapC21937.f71142.log(Level.WARNING, "Exception thrown during refresh", th);
                                c13411.f5682.mo14564(th);
                            }
                        }
                    }, C5978.m16274());
                    if (interfaceFutureC12329M4750.isDone()) {
                        try {
                            objM34846 = C14446.m34846(interfaceFutureC12329M4750);
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (objM34846 != null) {
                    return objM34846;
                }
            } catch (Throwable th) {
                unlock();
                m42489();
                throw th;
            }
        }
        return obj2;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m42497() {
        if (tryLock()) {
            try {
                m42493();
            } finally {
                unlock();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[EDGE_INSN: B:47:0x0112->B:48:0x0115 BREAK  A[LOOP:3: B:26:0x00b6->B:41:0x0102]] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42493() {
        int i = 0;
        if (this.f58343.f71159 != EnumC10523.f36019) {
            int i2 = 0;
            do {
                Object objPoll = this.f58333.poll();
                if (objPoll == null) {
                    break;
                }
                InterfaceC0769 interfaceC0769 = (InterfaceC0769) objPoll;
                ConcurrentMapC21937 concurrentMapC21937 = this.f58343;
                concurrentMapC21937.getClass();
                int hash = interfaceC0769.getHash();
                C18283 c18283M48759 = concurrentMapC21937.m48759(hash);
                c18283M48759.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray = c18283M48759.f58341;
                    int length = hash & (atomicReferenceArray.length() - 1);
                    InterfaceC0769 interfaceC07610 = (InterfaceC0769) atomicReferenceArray.get(length);
                    for (InterfaceC0769 next = interfaceC07610; next != null; next = next.getNext()) {
                        if (next == interfaceC0769) {
                            c18283M48759.f58344++;
                            InterfaceC0769 interfaceC0769M42481 = c18283M48759.m42481(interfaceC07610, next, next.getKey(), next.mo3304().get(), next.mo3304(), EnumC21231.f69157);
                            int i3 = c18283M48759.f58345 - 1;
                            atomicReferenceArray.set(length, interfaceC0769M42481);
                            c18283M48759.f58345 = i3;
                            break;
                        }
                    }
                    c18283M48759.unlock();
                    c18283M48759.m42489();
                    i2++;
                } catch (Throwable th) {
                    c18283M48759.unlock();
                    c18283M48759.m42489();
                    throw th;
                }
            } while (i2 != 16);
        }
        if (this.f58343.f71145 != EnumC10523.f36019) {
            do {
                Object objPoll2 = this.f58335.poll();
                if (objPoll2 == null) {
                    return;
                }
                InterfaceC12639 interfaceC12639 = (InterfaceC12639) objPoll2;
                ConcurrentMapC21937 concurrentMapC21938 = this.f58343;
                concurrentMapC21938.getClass();
                InterfaceC0769 entry = interfaceC12639.getEntry();
                int hash2 = entry.getHash();
                C18283 c18283M487510 = concurrentMapC21938.m48759(hash2);
                Object key = entry.getKey();
                c18283M487510.lock();
                try {
                    AtomicReferenceArray atomicReferenceArray2 = c18283M487510.f58341;
                    int length2 = hash2 & (atomicReferenceArray2.length() - 1);
                    InterfaceC0769 interfaceC07611 = (InterfaceC0769) atomicReferenceArray2.get(length2);
                    InterfaceC0769 next2 = interfaceC07611;
                    while (true) {
                        if (next2 == null) {
                            c18283M487510.unlock();
                            if (!c18283M487510.isHeldByCurrentThread()) {
                                c18283M487510.m42489();
                                break;
                            }
                            break;
                        }
                        Object key2 = next2.getKey();
                        if (next2.getHash() == hash2 && key2 != null && c18283M487510.f58343.f71154.m34035(key, key2)) {
                            if (next2.mo3304() != interfaceC12639) {
                                c18283M487510.unlock();
                                if (!c18283M487510.isHeldByCurrentThread()) {
                                    c18283M487510.m42489();
                                    break;
                                }
                                break;
                            }
                            c18283M487510.f58344++;
                            InterfaceC0769 interfaceC0769M42482 = c18283M487510.m42481(interfaceC07611, next2, key2, interfaceC12639.get(), interfaceC12639, EnumC21231.f69157);
                            int i4 = c18283M487510.f58345 - 1;
                            atomicReferenceArray2.set(length2, interfaceC0769M42482);
                            c18283M487510.f58345 = i4;
                            c18283M487510.unlock();
                            if (!c18283M487510.isHeldByCurrentThread()) {
                                c18283M487510.m42489();
                                break;
                            }
                            break;
                        }
                        next2 = next2.getNext();
                    }
                    i++;
                } catch (Throwable th2) {
                    c18283M487510.unlock();
                    if (!c18283M487510.isHeldByCurrentThread()) {
                        c18283M487510.m42489();
                    }
                    throw th2;
                }
            } while (i != 16);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42491(InterfaceC0769 interfaceC0769, long j) {
        if (this.f58343.m48760()) {
            interfaceC0769.mo3301(j);
        }
        this.f58339.add(interfaceC0769);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42496(InterfaceC0769 interfaceC0769, long j) {
        if (this.f58343.m48760()) {
            interfaceC0769.mo3301(j);
        }
        this.f58342.add(interfaceC0769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42482() {
        while (true) {
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) this.f58339.poll();
            if (interfaceC0769 == null) {
                return;
            }
            AbstractQueue abstractQueue = this.f58342;
            if (abstractQueue.contains(interfaceC0769)) {
                abstractQueue.add(interfaceC0769);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42483(long j) {
        InterfaceC0769 interfaceC0769;
        InterfaceC0769 interfaceC07610;
        m42482();
        do {
            interfaceC0769 = (InterfaceC0769) this.f58336.peek();
            ConcurrentMapC21937 concurrentMapC21937 = this.f58343;
            if (interfaceC0769 == null || !concurrentMapC21937.m48757(interfaceC0769, j)) {
                do {
                    interfaceC07610 = (InterfaceC0769) this.f58342.peek();
                    if (interfaceC07610 == null || !concurrentMapC21937.m48757(interfaceC07610, j)) {
                        return;
                    }
                } while (m42488(interfaceC07610, interfaceC07610.getHash(), EnumC21231.f69152));
                throw new AssertionError();
            }
        } while (m42488(interfaceC0769, interfaceC0769.getHash(), EnumC21231.f69152));
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42485(Object obj, Object obj2, int i, EnumC21231 enumC21231) {
        this.f58338 -= (long) i;
        if (enumC21231.mo10670()) {
            this.f58346.mo32708();
        }
        ConcurrentMapC21937 concurrentMapC21937 = this.f58343;
        if (concurrentMapC21937.f71150 != ConcurrentMapC21937.f71141) {
            concurrentMapC21937.f71150.offer(new C18409(obj, obj2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42486(InterfaceC0769 interfaceC0769) {
        InterfaceC0769 interfaceC07610;
        if (this.f58343.m48756()) {
            m42482();
            long jMo4755 = interfaceC0769.mo3304().mo4755();
            long j = this.f58340;
            if (jMo4755 > j && !m42488(interfaceC0769, interfaceC0769.getHash(), EnumC21231.f69156)) {
                throw new AssertionError();
            }
            while (this.f58338 > j) {
                Iterator it = this.f58342.iterator();
                do {
                    if (!it.hasNext()) {
                        throw new AssertionError();
                    }
                    interfaceC07610 = (InterfaceC0769) it.next();
                } while (interfaceC07610.mo3304().mo4755() <= 0);
                if (!m42488(interfaceC07610, interfaceC07610.getHash(), EnumC21231.f69156)) {
                    throw new AssertionError();
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 m42479(int i, Object obj) {
        AtomicReferenceArray atomicReferenceArray = this.f58341;
        for (InterfaceC0769 next = (InterfaceC0769) atomicReferenceArray.get((atomicReferenceArray.length() - 1) & i); next != null; next = next.getNext()) {
            if (next.getHash() == i) {
                Object key = next.getKey();
                if (key == null) {
                    m42497();
                } else if (this.f58343.f71154.m34035(obj, key)) {
                    return next;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42476(InterfaceC0769 interfaceC0769, long j) {
        if (interfaceC0769.getKey() == null) {
            m42497();
            return null;
        }
        Object obj = interfaceC0769.mo3304().get();
        if (obj == null) {
            m42497();
            return null;
        }
        if (!this.f58343.m48757(interfaceC0769, j)) {
            return obj;
        }
        if (!tryLock()) {
            return null;
        }
        try {
            m42483(j);
            return null;
        } finally {
            unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m42473(Object obj, int i, Object obj2, boolean z) {
        int i2;
        lock();
        try {
            long jMo8123 = this.f58343.f71151.mo8123();
            m42494(jMo8123);
            if (this.f58345 + 1 > this.f58334) {
                m42490();
            }
            AtomicReferenceArray atomicReferenceArray = this.f58341;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f58343.f71154.m34035(obj, key)) {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj3 = interfaceC12639Mo3304.get();
                    if (obj3 != null) {
                        if (z) {
                            m42496(next, jMo8123);
                        } else {
                            this.f58344++;
                            m42485(obj, obj3, interfaceC12639Mo3304.mo4755(), EnumC21231.f69153);
                            m42487(next, obj, obj2, jMo8123);
                            m42486(next);
                        }
                        return obj3;
                    }
                    this.f58344++;
                    if (interfaceC12639Mo3304.mo4754()) {
                        m42485(obj, obj3, interfaceC12639Mo3304.mo4755(), EnumC21231.f69157);
                        m42487(next, obj, obj2, jMo8123);
                        i2 = this.f58345;
                    } else {
                        m42487(next, obj, obj2, jMo8123);
                        i2 = this.f58345 + 1;
                    }
                    this.f58345 = i2;
                    m42486(next);
                    return null;
                }
            }
            this.f58344++;
            InterfaceC0769 interfaceC0769Mo6265 = this.f58343.f71144.mo6265(this, obj, i, interfaceC0769);
            m42487(interfaceC0769Mo6265, obj, obj2, jMo8123);
            atomicReferenceArray.set(length, interfaceC0769Mo6265);
            this.f58345++;
            m42486(interfaceC0769Mo6265);
            return null;
        } finally {
            unlock();
            m42489();
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m42490() {
        AtomicReferenceArray atomicReferenceArray = this.f58341;
        int length = atomicReferenceArray.length();
        if (length >= 1073741824) {
            return;
        }
        int i = this.f58345;
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(length << 1);
        this.f58334 = (atomicReferenceArray2.length() * 3) / 4;
        int length2 = atomicReferenceArray2.length() - 1;
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC0769 next = (InterfaceC0769) atomicReferenceArray.get(i2);
            if (next != null) {
                InterfaceC0769 next2 = next.getNext();
                int hash = next.getHash() & length2;
                if (next2 == null) {
                    atomicReferenceArray2.set(hash, next);
                } else {
                    InterfaceC0769 interfaceC0769 = next;
                    while (next2 != null) {
                        int hash2 = next2.getHash() & length2;
                        if (hash2 != hash) {
                            interfaceC0769 = next2;
                            hash = hash2;
                        }
                        next2 = next2.getNext();
                    }
                    atomicReferenceArray2.set(hash, interfaceC0769);
                    while (next != interfaceC0769) {
                        int hash3 = next.getHash() & length2;
                        InterfaceC0769 interfaceC0769M42480 = m42480(next, (InterfaceC0769) atomicReferenceArray2.get(hash3));
                        if (interfaceC0769M42480 != null) {
                            atomicReferenceArray2.set(hash3, interfaceC0769M42480);
                        } else {
                            m42495(next);
                            i--;
                        }
                        next = next.getNext();
                    }
                }
            }
        }
        this.f58341 = atomicReferenceArray2;
        this.f58345 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42484(Object obj, int i, C1349 c1349, Object obj2) {
        lock();
        try {
            long jMo8123 = this.f58343.f71151.mo8123();
            m42494(jMo8123);
            int i2 = this.f58345 + 1;
            if (i2 > this.f58334) {
                m42490();
                i2 = this.f58345 + 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.f58341;
            int length = i & (atomicReferenceArray.length() - 1);
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == i && key != null && this.f58343.f71154.m34035(obj, key)) {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj3 = interfaceC12639Mo3304.get();
                    if (c1349 == interfaceC12639Mo3304 || (obj3 == null && interfaceC12639Mo3304 != ConcurrentMapC21937.f71143)) {
                        this.f58344++;
                        if (c1349.f5683.mo4754()) {
                            m42485(obj, obj3, c1349.f5683.mo4755(), obj3 == null ? EnumC21231.f69157 : EnumC21231.f69153);
                            i2--;
                        }
                        m42487(next, obj, obj2, jMo8123);
                        this.f58345 = i2;
                        m42486(next);
                    } else {
                        m42485(obj, obj2, 0, EnumC21231.f69153);
                    }
                }
            }
            this.f58344++;
            EnumC9693 enumC9693 = this.f58343.f71144;
            obj.getClass();
            InterfaceC0769 interfaceC0769Mo6265 = enumC9693.mo6265(this, obj, i, interfaceC0769);
            m42487(interfaceC0769Mo6265, obj, obj2, jMo8123);
            atomicReferenceArray.set(length, interfaceC0769Mo6265);
            this.f58345 = i2;
            m42486(interfaceC0769Mo6265);
        } finally {
            unlock();
            m42489();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 m42481(InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610, Object obj, Object obj2, InterfaceC12639 interfaceC12639, EnumC21231 enumC21231) {
        m42485(obj, obj2, interfaceC12639.mo4755(), enumC21231);
        this.f58336.remove(interfaceC07610);
        this.f58342.remove(interfaceC07610);
        if (interfaceC12639.mo4753()) {
            interfaceC12639.mo4752(null);
            return interfaceC0769;
        }
        return m42492(interfaceC0769, interfaceC07610);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0769 m42492(InterfaceC0769 interfaceC0769, InterfaceC0769 interfaceC07610) {
        int i = this.f58345;
        InterfaceC0769 next = interfaceC07610.getNext();
        while (interfaceC0769 != interfaceC07610) {
            InterfaceC0769 interfaceC0769M42480 = m42480(interfaceC0769, next);
            if (interfaceC0769M42480 != null) {
                next = interfaceC0769M42480;
            } else {
                m42495(interfaceC0769);
                i--;
            }
            interfaceC0769 = interfaceC0769.getNext();
        }
        this.f58345 = i;
        return next;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42495(InterfaceC0769 interfaceC0769) {
        Object key = interfaceC0769.getKey();
        interfaceC0769.getHash();
        m42485(key, interfaceC0769.mo3304().get(), interfaceC0769.mo3304().mo4755(), EnumC21231.f69157);
        this.f58336.remove(interfaceC0769);
        this.f58342.remove(interfaceC0769);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m42488(InterfaceC0769 interfaceC0769, int i, EnumC21231 enumC21231) {
        AtomicReferenceArray atomicReferenceArray = this.f58341;
        int length = i & (atomicReferenceArray.length() - 1);
        InterfaceC0769 interfaceC07610 = (InterfaceC0769) atomicReferenceArray.get(length);
        for (InterfaceC0769 next = interfaceC07610; next != null; next = next.getNext()) {
            if (next == interfaceC0769) {
                this.f58344++;
                InterfaceC0769 interfaceC0769M42481 = m42481(interfaceC07610, next, next.getKey(), next.mo3304().get(), next.mo3304(), enumC21231);
                int i2 = this.f58345 - 1;
                atomicReferenceArray.set(length, interfaceC0769M42481);
                this.f58345 = i2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void m42472() {
        if ((this.f58337.incrementAndGet() & 63) == 0) {
            m42494(this.f58343.f71151.mo8123());
            m42489();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m42494(long j) {
        if (tryLock()) {
            try {
                m42493();
                m42483(j);
                this.f58337.set(0);
            } finally {
                unlock();
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m42489() {
        if (isHeldByCurrentThread()) {
            return;
        }
        while (true) {
            ConcurrentMapC21937 concurrentMapC21937 = this.f58343;
            C18409 c18409 = (C18409) concurrentMapC21937.f71150.poll();
            if (c18409 == null) {
                return;
            }
            try {
                concurrentMapC21937.f71148.mo41238(c18409);
            } catch (Throwable th) {
                ConcurrentMapC21937.f71142.log(Level.WARNING, "Exception thrown by removal listener", th);
            }
        }
    }
}
