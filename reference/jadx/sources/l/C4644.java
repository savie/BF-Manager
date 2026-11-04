package l;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۙۘۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes3.dex */
public final class C4644 extends AbstractC6727 implements Closeable {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f16432;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC11946 f16433;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public Object f16434;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f16435;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC17249 f16436;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f16437;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public volatile int f16438;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f16439;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f16440;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public Iterator f16441;

    public C4644(AbstractC11946 abstractC11946, C21622 c21622) {
        super(c21622, "pool");
        this.f16440 = 8;
        this.f16432 = 0;
        this.f16438 = 8;
        this.f16436 = new ConcurrentMapC17249();
        this.f16439 = new ArrayList();
        this.f16437 = new ReentrantReadWriteLock(true);
        this.f16435 = new AtomicInteger(0);
        this.f16433 = abstractC11946;
        m18775(c21622);
        this.f16440 = c21622.m49432();
        this.f16438 = c21622.m49439();
        m18772(-1);
        this.f16432 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m14477(Object obj, InterfaceC17913 interfaceC17913) {
        if (interfaceC17913 != null) {
            this.f16433.getClass();
            C1661 c1661M34475 = ((C14183) this.f16436.get(obj)).m34475();
            if (m18776()) {
                c1661M34475.addFirst(interfaceC17913);
            } else {
                c1661M34475.addLast(interfaceC17913);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m14491(Object obj) {
        boolean z;
        long millis = m18780().toMillis();
        AbstractC11946 abstractC11946 = this.f16433;
        if (!this.f22391) {
            boolean zM18778 = m18778();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C14183 c14183M14481 = m14481(obj);
            do {
                InterfaceC17913 interfaceC17913M14484 = null;
                while (true) {
                    if (interfaceC17913M14484 == null) {
                        try {
                            interfaceC17913M14484 = (InterfaceC17913) c14183M14481.m34475().pollFirst();
                            boolean zMo25429 = false;
                            z = interfaceC17913M14484 == null && (interfaceC17913M14484 = m14484(obj)) != null;
                            if (zM18778) {
                                if (interfaceC17913M14484 == null) {
                                    if (millis < 0) {
                                        interfaceC17913M14484 = (InterfaceC17913) c14183M14481.m34475().m5960();
                                    } else {
                                        C1661 c1661M34475 = c14183M14481.m34475();
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        interfaceC17913M14484 = (InterfaceC17913) c1661M34475.m5958(millis);
                                    }
                                }
                                if (interfaceC17913M14484 == null) {
                                    throw new NoSuchElementException("Timeout waiting for idle object, borrowMaxWaitMillis=" + millis);
                                }
                            } else if (interfaceC17913M14484 == null) {
                                throw new NoSuchElementException("Pool exhausted");
                            }
                            if (!interfaceC17913M14484.mo14211()) {
                                interfaceC17913M14484 = null;
                            }
                            if (interfaceC17913M14484 != null) {
                                try {
                                    abstractC11946.getClass();
                                } catch (Exception e) {
                                    try {
                                        EnumC17167 enumC17167 = EnumC17167.NORMAL;
                                        m14479(obj, interfaceC17913M14484, true);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        NoSuchElementException noSuchElementException = new NoSuchElementException("Unable to activate object");
                                        noSuchElementException.initCause(e);
                                        throw noSuchElementException;
                                    }
                                    interfaceC17913M14484 = null;
                                }
                                if (interfaceC17913M14484 != null && m18784()) {
                                    try {
                                        zMo25429 = abstractC11946.mo25429(obj, interfaceC17913M14484);
                                        th = null;
                                    } catch (Throwable th) {
                                        th = th;
                                        if (th instanceof ThreadDeath) {
                                            throw ((ThreadDeath) th);
                                        }
                                        if (th instanceof VirtualMachineError) {
                                            throw ((VirtualMachineError) th);
                                        }
                                    }
                                    if (!zMo25429) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            m14483(obj);
                            throw th2;
                        }
                    } else {
                        m14483(obj);
                        m18773(interfaceC17913M14484, C18257.ofMillis(System.currentTimeMillis() - jCurrentTimeMillis));
                        return interfaceC17913M14484.mo14204();
                    }
                }
                try {
                    EnumC17167 enumC17168 = EnumC17167.NORMAL;
                    m14479(obj, interfaceC17913M14484, true);
                    this.f22384.incrementAndGet();
                } catch (Exception unused2) {
                }
            } while (!z);
            NoSuchElementException noSuchElementException2 = new NoSuchElementException("Unable to validate object");
            noSuchElementException2.initCause(th);
            throw noSuchElementException2;
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m14490(Object obj) {
        try {
            C1661 c1661M34475 = m14481(obj).m34475();
            for (InterfaceC17913 interfaceC17913 = (InterfaceC17913) c1661M34475.pollFirst(); interfaceC17913 != null; interfaceC17913 = (InterfaceC17913) c1661M34475.pollFirst()) {
                try {
                    EnumC17167 enumC17167 = EnumC17167.NORMAL;
                    m14479(obj, interfaceC17913, true);
                } catch (Exception unused) {
                }
            }
        } finally {
            m14483(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m14478(final TreeMap treeMap, final Object obj, C14183 c14183) {
        if (c14183 != null) {
            C4937.forEach(c14183.m34475(), new Consumer() { // from class: l.ۜ᩺ۨ
                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return C12312.$default$andThen(this, consumer);
                }

                @Override // java.util.function.Consumer
                /* JADX INFO: renamed from: accept */
                public final void n(Object obj2) {
                    Object obj3 = obj;
                    treeMap.put((InterfaceC17913) obj2, obj3);
                }
            });
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    private void m14483(Object obj) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f16436;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16437;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C14183 c14183 = (C14183) concurrentMapC17249.get(obj);
            if (c14183.m34477().decrementAndGet() == 0 && c14183.m34476().get() == 0) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                if (c14183.m34476().get() == 0 && c14183.m34477().get() == 0) {
                    concurrentMapC17249.remove(obj);
                    this.f16439.remove(obj);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m14479(Object obj, InterfaceC17913 interfaceC17913, boolean z) {
        boolean zEquals;
        C14183 c14183M14481 = m14481(obj);
        try {
            synchronized (interfaceC17913) {
                zEquals = interfaceC17913.getState().equals(EnumC16421.IDLE);
                if (zEquals || z) {
                    zEquals = c14183M14481.m34475().removeFirstOccurrence(interfaceC17913);
                }
            }
            if (zEquals || z) {
                c14183M14481.m34474().remove(new C20897(interfaceC17913.mo14204()));
                interfaceC17913.invalidate();
                try {
                    this.f16433.mo25427(obj, interfaceC17913);
                    c14183M14481.m34476().decrementAndGet();
                    this.f22386.incrementAndGet();
                    this.f16435.decrementAndGet();
                    m14483(obj);
                    return true;
                } catch (Throwable th) {
                    c14183M14481.m34476().decrementAndGet();
                    this.f22386.incrementAndGet();
                    this.f16435.decrementAndGet();
                    throw th;
                }
            }
            m14483(obj);
            return false;
        } catch (Throwable th2) {
            m14483(obj);
            throw th2;
        }
    }

    @Override // l.AbstractC6727
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14486() {
        ConcurrentMapC17249 concurrentMapC17249 = this.f16436;
        int i = this.f16440;
        if (this.f16432 <= i) {
            i = this.f16432;
        }
        if (i < 1) {
            return;
        }
        for (Object obj : concurrentMapC17249.keySet()) {
            C14183 c14183 = (C14183) concurrentMapC17249.get(obj);
            int iM14476 = m14476(c14183);
            for (int i2 = 0; i2 < iM14476 && m14476(c14183) > 0; i2++) {
                m14487(obj);
                if (c14183 == null) {
                    c14183 = (C14183) concurrentMapC17249.get(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m14476(C14183 c14183) {
        if (c14183 != null) {
            int iM18781 = m18781();
            int i = this.f16438;
            int i2 = this.f16440;
            if (this.f16432 <= i2) {
                i2 = this.f16432;
            }
            int size = i2 - c14183.m34475().size();
            if (i > 0) {
                size = Math.min(size, Math.max(0, i - c14183.m34475().size()));
            }
            return iM18781 > 0 ? Math.min(size, Math.max(0, (iM18781 - (this.f16435.get() - m14485())) - m14485())) : size;
        }
        int i3 = this.f16440;
        return this.f16432 > i3 ? i3 : this.f16432;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    private void m14482() {
        int i = this.f16438;
        C1661 c1661 = null;
        Object obj = null;
        int i2 = 0;
        for (Map.Entry entry : this.f16436.entrySet()) {
            Object key = entry.getKey();
            C14183 c14183 = (C14183) entry.getValue();
            if (c14183 != null) {
                C1661 c1661M34475 = c14183.m34475();
                int iM5961 = c1661M34475.m5961();
                C14183 c14184 = (C14183) this.f16436.get(key);
                if ((c14184 != null ? c14184.m34474().size() - c14184.m34475().size() : 0) < i && iM5961 > i2) {
                    c1661 = c1661M34475;
                    obj = key;
                    i2 = iM5961;
                }
            }
        }
        if (c1661 != null) {
            m14481(obj);
            try {
                InterfaceC17913 interfaceC17913M14484 = m14484(obj);
                if (interfaceC17913M14484 != null) {
                    m14477(obj, interfaceC17913M14484);
                }
            } catch (Exception unused) {
            } finally {
                m14483(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private InterfaceC17913 m14484(Object obj) {
        boolean zM14479;
        int i = this.f16438;
        int i2 = i < 0 ? Integer.MAX_VALUE : i;
        int iM18781 = m18781();
        C14183 c14183 = (C14183) this.f16436.get(obj);
        boolean z = true;
        while (z) {
            int iIncrementAndGet = this.f16435.incrementAndGet();
            if (iM18781 <= -1 || iIncrementAndGet <= iM18781) {
                z = false;
            } else {
                this.f16435.decrementAndGet();
                if (m14485() == 0) {
                    return null;
                }
                final TreeMap treeMap = new TreeMap();
                C23217.forEach(this.f16436, new BiConsumer() { // from class: l.ۡ᩺ۨ
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        C4644.m14478(treeMap, obj2, (C14183) obj3);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C23501.$default$andThen(this, biConsumer);
                    }
                });
                int size = ((int) (((double) treeMap.size()) * 0.15d)) + 1;
                Iterator it = treeMap.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    InterfaceC17913 interfaceC17913 = (InterfaceC17913) entry.getKey();
                    try {
                        EnumC17167 enumC17167 = EnumC17167.NORMAL;
                        zM14479 = m14479(value, interfaceC17913, false);
                    } catch (Exception unused) {
                        zM14479 = true;
                    }
                    if (zM14479) {
                        size--;
                    }
                }
            }
        }
        Boolean bool = null;
        while (bool == null) {
            synchronized (c14183.f44844) {
                if (c14183.m34476().incrementAndGet() > i2) {
                    c14183.m34476().decrementAndGet();
                    if (c14183.f44846 == 0) {
                        bool = Boolean.FALSE;
                    } else {
                        c14183.f44844.wait();
                    }
                } else {
                    C14183.m34470(c14183);
                    bool = Boolean.TRUE;
                }
            }
        }
        if (!bool.booleanValue()) {
            this.f16435.decrementAndGet();
            return null;
        }
        try {
            try {
                AbstractC11946 abstractC11946 = this.f16433;
                InterfaceC17913 interfaceC17913Mo25428 = abstractC11946.mo25428(abstractC11946.mo25426(obj));
                synchronized (c14183.f44844) {
                    C14183.m34473(c14183);
                    c14183.f44844.notifyAll();
                }
                this.f22405.incrementAndGet();
                c14183.m34474().put(new C20897(((C4489) interfaceC17913Mo25428).mo14204()), interfaceC17913Mo25428);
                return interfaceC17913Mo25428;
            } catch (Exception e) {
                this.f16435.decrementAndGet();
                c14183.m34476().decrementAndGet();
                throw e;
            }
        } catch (Throwable th) {
            synchronized (c14183.f44844) {
                C14183.m34473(c14183);
                c14183.f44844.notifyAll();
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f22391) {
            return;
        }
        synchronized (this.f22383) {
            if (this.f22391) {
                return;
            }
            m18774(C18257.ofMillis(-1L));
            this.f22391 = true;
            C4937.forEach(this.f16436.keySet(), new C1779(2, this));
            m18777();
            C4937.forEach(this.f16436.values(), new C8963());
            C4937.forEach(this.f16436.keySet(), new C1779(2, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14487(Object obj) {
        if (!this.f22391) {
            m14481(obj);
            try {
                m14477(obj, m14484(obj));
                return;
            } finally {
                m14483(obj);
            }
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0141 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x00fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x0114 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x00c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ee A[Catch: all -> 0x0172, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x0129 A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x013b A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x013e A[Catch: all -> 0x0172, TryCatch #0 {, blocks: (B:8:0x0011, B:12:0x0024, B:14:0x0035, B:18:0x0049, B:20:0x004e, B:38:0x00aa, B:40:0x00ae, B:43:0x00b2, B:44:0x00bc, B:94:0x0168, B:56:0x00ee, B:59:0x00fe, B:73:0x0129, B:75:0x0137, B:77:0x013b, B:78:0x013d, B:79:0x013e, B:80:0x0140, B:81:0x0141, B:83:0x0147, B:67:0x011e, B:69:0x0122, B:84:0x0154, B:85:0x0156, B:86:0x0157, B:87:0x0159, B:88:0x015a, B:61:0x0105, B:50:0x00de, B:52:0x00e2, B:54:0x00e6, B:89:0x015e, B:90:0x0160, B:91:0x0161, B:92:0x0163, B:93:0x0164, B:22:0x0054, B:24:0x0058, B:29:0x007a, B:31:0x0082, B:34:0x0095, B:37:0x00a7, B:26:0x005e, B:28:0x0071, B:96:0x016c, B:97:0x016f, B:98:0x0170, B:15:0x003a, B:11:0x0022, B:27:0x006c, B:64:0x0114, B:47:0x00c6), top: B:106:0x0011, inners: #1, #2, #3, #4, #5, #6 }] */
    @Override // l.AbstractC6727
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo14492() {
        int iCeil;
        C23881 c23881;
        InterfaceC17913 next;
        Deque dequeM53383;
        boolean zMo49173;
        boolean z;
        boolean zMo25429;
        if (this.f22391) {
            throw new IllegalStateException("Pool not open");
        }
        if (m14485() > 0) {
            InterfaceC21643 interfaceC21643M18779 = m18779();
            synchronized (this.f22398) {
                C18257 c18257M18770 = m18770();
                C18257 c18257M18771 = m18771();
                int i = this.f16440;
                if (this.f16432 <= i) {
                    i = this.f16432;
                }
                C14929 c14929 = new C14929(c18257M18770, c18257M18771, i);
                boolean zM18782 = m18782();
                int iM14485 = m14485();
                int iM18783 = m18783();
                if (iM18783 >= 0) {
                    iCeil = Math.min(iM18783, iM14485);
                } else {
                    iCeil = (int) Math.ceil(((double) iM14485) / Math.abs(iM18783));
                }
                int i2 = 0;
                while (i2 < iCeil) {
                    C23881 c23882 = this.f22390;
                    Object th = null;
                    if (c23882 == null || !c23882.hasNext()) {
                        Iterator it = this.f16441;
                        if (it == null || !it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            Lock lock = this.f16437.readLock();
                            lock.lock();
                            try {
                                arrayList.addAll(this.f16439);
                                lock.unlock();
                                this.f16441 = arrayList.iterator();
                            } catch (Throwable th2) {
                                lock.unlock();
                                throw th2;
                            }
                        }
                        while (this.f16441.hasNext()) {
                            Object next2 = this.f16441.next();
                            this.f16434 = next2;
                            C14183 c14183 = (C14183) this.f16436.get(next2);
                            if (c14183 != null) {
                                C23881 c23883 = new C23881(this, c14183.m34475());
                                this.f22390 = c23883;
                                if (c23883.hasNext()) {
                                    break;
                                } else {
                                    this.f22390 = null;
                                }
                            }
                        }
                        c23881 = this.f22390;
                        if (c23881 == null) {
                            return;
                        }
                        try {
                            next = c23881.next();
                            dequeM53383 = this.f22390.m53383();
                            if (next.mo14208()) {
                                try {
                                    zMo49173 = interfaceC21643M18779.mo49173(c14929, next, ((C14183) this.f16436.get(this.f16434)).m34475().size());
                                } catch (Throwable th3) {
                                    if (th3 instanceof ThreadDeath) {
                                        throw ((ThreadDeath) th3);
                                    }
                                    if (!(th3 instanceof VirtualMachineError)) {
                                        new Exception(th3);
                                        zMo49173 = false;
                                    } else {
                                        throw ((VirtualMachineError) th3);
                                    }
                                }
                                if (zMo49173) {
                                    Object obj = this.f16434;
                                    EnumC17167 enumC17167 = EnumC17167.NORMAL;
                                    m14479(obj, next, true);
                                    this.f22393.incrementAndGet();
                                } else {
                                    if (zM18782) {
                                        try {
                                            this.f16433.getClass();
                                            z = true;
                                        } catch (Exception unused) {
                                            Object obj2 = this.f16434;
                                            EnumC17167 enumC17168 = EnumC17167.NORMAL;
                                            m14479(obj2, next, true);
                                            this.f22393.incrementAndGet();
                                            z = false;
                                        }
                                        if (z) {
                                            try {
                                                zMo25429 = this.f16433.mo25429(this.f16434, next);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (th instanceof ThreadDeath) {
                                                    throw ((ThreadDeath) th);
                                                }
                                                if (th instanceof VirtualMachineError) {
                                                    throw ((VirtualMachineError) th);
                                                }
                                                zMo25429 = false;
                                            }
                                            if (!zMo25429) {
                                                Object obj3 = this.f16434;
                                                EnumC17167 enumC17169 = EnumC17167.NORMAL;
                                                m14479(obj3, next, true);
                                                this.f22393.incrementAndGet();
                                                if (th != null) {
                                                    if (th instanceof RuntimeException) {
                                                        throw ((RuntimeException) th);
                                                    }
                                                    throw ((Error) th);
                                                }
                                            } else {
                                                try {
                                                    this.f16433.getClass();
                                                } catch (Exception unused2) {
                                                    Object obj4 = this.f16434;
                                                    EnumC17167 enumC171610 = EnumC17167.NORMAL;
                                                    m14479(obj4, next, true);
                                                    this.f22393.incrementAndGet();
                                                }
                                            }
                                        }
                                    }
                                    next.mo14207(dequeM53383);
                                }
                            } else {
                                i2--;
                            }
                        } catch (NoSuchElementException unused3) {
                            i2--;
                            this.f22390 = null;
                        }
                        i2++;
                    } else {
                        c23881 = this.f22390;
                        if (c23881 == null) {
                            return;
                        }
                        next = c23881.next();
                        dequeM53383 = this.f22390.m53383();
                        if (next.mo14208()) {
                            i2--;
                        } else {
                            zMo49173 = interfaceC21643M18779.mo49173(c14929, next, ((C14183) this.f16436.get(this.f16434)).m34475().size());
                            if (zMo49173) {
                                Object obj5 = this.f16434;
                                EnumC17167 enumC171611 = EnumC17167.NORMAL;
                                m14479(obj5, next, true);
                                this.f22393.incrementAndGet();
                            } else {
                                if (zM18782) {
                                    this.f16433.getClass();
                                    z = true;
                                    if (z) {
                                        zMo25429 = this.f16433.mo25429(this.f16434, next);
                                        if (!zMo25429) {
                                            Object obj6 = this.f16434;
                                            EnumC17167 enumC171612 = EnumC17167.NORMAL;
                                            m14479(obj6, next, true);
                                            this.f22393.incrementAndGet();
                                            if (th != null) {
                                                if (th instanceof RuntimeException) {
                                                    throw ((RuntimeException) th);
                                                }
                                                throw ((Error) th);
                                            }
                                        } else {
                                            this.f16433.getClass();
                                        }
                                    }
                                }
                                next.mo14207(dequeM53383);
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m14485() {
        return C1170.stream(this.f16436.values()).mapToInt(new C1506()).sum();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m14494(Object obj) {
        C14183 c14183 = (C14183) this.f16436.get(obj);
        if (c14183 != null) {
            return c14183.m34475().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    private boolean m14480() {
        return C1170.stream(this.f16436.values()).anyMatch(new C2997());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m14488(Object obj, Object obj2) {
        C14183 c14183 = (C14183) this.f16436.get(obj);
        InterfaceC17913 interfaceC17913 = (InterfaceC17913) c14183.m34474().get(new C20897(obj2));
        if (interfaceC17913 == null) {
            throw new IllegalStateException("Object not currently part of this pool");
        }
        synchronized (interfaceC17913) {
            if (interfaceC17913.getState() != EnumC16421.INVALID) {
                m14479(obj, interfaceC17913, true);
            }
        }
        if (c14183.f44842.m5959()) {
            m14487(obj);
        }
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    private C14183 m14481(Object obj) {
        ConcurrentMapC17249 concurrentMapC17249 = this.f16436;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f16437;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C14183 c14183 = (C14183) concurrentMapC17249.get(obj);
            if (c14183 == null) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                c14183 = (C14183) concurrentMapC17249.get(obj);
                if (c14183 == null) {
                    c14183 = new C14183();
                    c14183.m34477().incrementAndGet();
                    concurrentMapC17249.put(obj, c14183);
                    this.f16439.add(obj);
                } else {
                    c14183.m34477().incrementAndGet();
                }
            } else {
                c14183.m34477().incrementAndGet();
            }
            return c14183;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m14493(Object obj, Object obj2) {
        C14183 c14183 = (C14183) this.f16436.get(obj);
        if (c14183 == null) {
            throw new IllegalStateException("No keyed pool found under the given key.");
        }
        InterfaceC17913 interfaceC17913 = (InterfaceC17913) c14183.m34474().get(new C20897(obj2));
        if (interfaceC17913 != null) {
            synchronized (interfaceC17913) {
                if (interfaceC17913.getState() != EnumC16421.ALLOCATED) {
                    throw new IllegalStateException("Object has already been returned to this pool or is invalid");
                }
                interfaceC17913.mo14205();
            }
            C18257 c18257Mo14210 = interfaceC17913.mo14210();
            try {
                try {
                    try {
                        this.f16433.getClass();
                        if (interfaceC17913.mo14209()) {
                            int i = this.f16440;
                            C1661 c1661M34475 = c14183.m34475();
                            if (this.f22391 || (i > -1 && i <= c1661M34475.size())) {
                                try {
                                    EnumC17167 enumC17167 = EnumC17167.NORMAL;
                                    m14479(obj, interfaceC17913, true);
                                } catch (Exception unused) {
                                }
                            } else {
                                if (m18776()) {
                                    c1661M34475.addFirst(interfaceC17913);
                                } else {
                                    c1661M34475.addLast(interfaceC17913);
                                }
                                if (this.f22391) {
                                    m14490(obj);
                                }
                            }
                            if (m14480()) {
                                m14482();
                            }
                            m18785(c18257Mo14210);
                            return;
                        }
                        throw new IllegalStateException("Object has already been returned to this pool");
                    } catch (Exception unused2) {
                        if (c14183.f44842.m5959()) {
                            try {
                                m14487(obj);
                            } catch (Exception unused3) {
                            }
                        }
                        if (m14480()) {
                            m14482();
                        }
                        m18785(c18257Mo14210);
                        return;
                    }
                } catch (Exception unused4) {
                    EnumC17167 enumC17168 = EnumC17167.NORMAL;
                    m14479(obj, interfaceC17913, true);
                    if (c14183.f44842.m5959()) {
                        m14487(obj);
                    }
                    if (m14480()) {
                        m14482();
                    }
                    m18785(c18257Mo14210);
                    return;
                }
            } catch (Throwable th) {
                if (m14480()) {
                    m14482();
                }
                m18785(c18257Mo14210);
                throw th;
            }
        }
        throw new IllegalStateException("Returned object not currently part of this pool");
    }

    @Override // l.AbstractC6727, l.AbstractC25373
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo14489(StringBuilder sb) {
        super.mo14489(sb);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f16440);
        sb.append(", minIdlePerKey=");
        sb.append(this.f16432);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f16438);
        sb.append(", factory=");
        sb.append(this.f16433);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", poolMap=");
        sb.append(this.f16436);
        sb.append(", poolKeyList=");
        sb.append(this.f16439);
        sb.append(", keyLock=");
        sb.append(this.f16437);
        sb.append(", numTotal=");
        sb.append(this.f16435);
        sb.append(", evictionKeyIterator=");
        sb.append(this.f16441);
        sb.append(", evictionKey=");
        sb.append(this.f16434);
        sb.append(", abandonedConfig=");
        sb.append((Object) null);
    }
}
