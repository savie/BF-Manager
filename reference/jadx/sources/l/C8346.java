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

/* JADX INFO: renamed from: l.۠ᩳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 6AIE */
/* JADX INFO: loaded from: classes4.dex */
public final class C8346 extends AbstractC4817 implements Closeable {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f28914;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public final ConcurrentMapC13783 f28915;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public Iterator f28916;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public Object f28917;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final AtomicInteger f28918;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final ReentrantReadWriteLock f28919;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public volatile int f28920;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f28921;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public volatile int f28922;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12684 f28923;

    public C8346(AbstractC12684 abstractC12684, C23978 c23978) {
        super(c23978, "pool");
        this.f28922 = 8;
        this.f28920 = 0;
        this.f28914 = 8;
        this.f28915 = new ConcurrentMapC13783();
        this.f28921 = new ArrayList();
        this.f28919 = new ReentrantReadWriteLock(true);
        this.f28918 = new AtomicInteger(0);
        this.f28923 = abstractC12684;
        m13386(c23978);
        this.f28922 = c23978.m44747();
        this.f28914 = c23978.m44753();
        m13382(-1);
        this.f28920 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m21800(Object obj, InterfaceC11273 interfaceC11273) {
        if (interfaceC11273 != null) {
            this.f28923.getClass();
            C0583 c0583M43608 = ((C18929) this.f28915.get(obj)).m43608();
            if (m13390()) {
                c0583M43608.addFirst(interfaceC11273);
            } else {
                c0583M43608.addLast(interfaceC11273);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m21811(Object obj) {
        boolean z;
        long millis = m13392().toMillis();
        AbstractC12684 abstractC12684 = this.f28923;
        if (!this.f16938) {
            boolean zM13380 = m13380();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C18929 c18929M21797 = m21797(obj);
            do {
                InterfaceC11273 interfaceC11273M21803 = null;
                while (true) {
                    if (interfaceC11273M21803 == null) {
                        try {
                            interfaceC11273M21803 = (InterfaceC11273) c18929M21797.m43608().pollFirst();
                            boolean zMo16192 = false;
                            z = interfaceC11273M21803 == null && (interfaceC11273M21803 = m21803(obj)) != null;
                            if (zM13380) {
                                if (interfaceC11273M21803 == null) {
                                    if (millis < 0) {
                                        interfaceC11273M21803 = (InterfaceC11273) c18929M21797.m43608().m2770();
                                    } else {
                                        C0583 c0583M43608 = c18929M21797.m43608();
                                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                        interfaceC11273M21803 = (InterfaceC11273) c0583M43608.m2769(millis);
                                    }
                                }
                                if (interfaceC11273M21803 == null) {
                                    throw new NoSuchElementException("Timeout waiting for idle object, borrowMaxWaitMillis=" + millis);
                                }
                            } else if (interfaceC11273M21803 == null) {
                                throw new NoSuchElementException("Pool exhausted");
                            }
                            if (!interfaceC11273M21803.mo28251()) {
                                interfaceC11273M21803 = null;
                            }
                            if (interfaceC11273M21803 != null) {
                                try {
                                    abstractC12684.getClass();
                                } catch (Exception e) {
                                    try {
                                        EnumC6333 enumC6333 = EnumC6333.NORMAL;
                                        m21802(obj, interfaceC11273M21803, true);
                                    } catch (Exception unused) {
                                    }
                                    if (z) {
                                        NoSuchElementException noSuchElementException = new NoSuchElementException("Unable to activate object");
                                        noSuchElementException.initCause(e);
                                        throw noSuchElementException;
                                    }
                                    interfaceC11273M21803 = null;
                                }
                                if (interfaceC11273M21803 != null && m13394()) {
                                    try {
                                        zMo16192 = abstractC12684.mo16192(obj, interfaceC11273M21803);
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
                                    if (!zMo16192) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            m21805(obj);
                            throw th2;
                        }
                    } else {
                        m21805(obj);
                        m13384(interfaceC11273M21803, C21813.ofMillis(System.currentTimeMillis() - jCurrentTimeMillis));
                        return interfaceC11273M21803.mo28254();
                    }
                }
                try {
                    EnumC6333 enumC6334 = EnumC6333.NORMAL;
                    m21802(obj, interfaceC11273M21803, true);
                    this.f16936.incrementAndGet();
                } catch (Exception unused2) {
                }
            } while (!z);
            NoSuchElementException noSuchElementException2 = new NoSuchElementException("Unable to validate object");
            noSuchElementException2.initCause(th);
            throw noSuchElementException2;
        }
        throw new IllegalStateException("Pool not open");
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m21810(Object obj) {
        try {
            C0583 c0583M43608 = m21797(obj).m43608();
            for (InterfaceC11273 interfaceC11273 = (InterfaceC11273) c0583M43608.pollFirst(); interfaceC11273 != null; interfaceC11273 = (InterfaceC11273) c0583M43608.pollFirst()) {
                try {
                    EnumC6333 enumC6333 = EnumC6333.NORMAL;
                    m21802(obj, interfaceC11273, true);
                } catch (Exception unused) {
                }
            }
        } finally {
            m21805(obj);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m21801(TreeMap treeMap, Object obj, C18929 c18929) {
        if (c18929 != null) {
            C0356.forEach(c18929.m43608(), new C23115(1, treeMap, obj));
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m21805(Object obj) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f28915;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28919;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C18929 c18929 = (C18929) concurrentMapC13783.get(obj);
            if (c18929.m43606().decrementAndGet() == 0 && c18929.m43609().get() == 0) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                if (c18929.m43609().get() == 0 && c18929.m43606().get() == 0) {
                    concurrentMapC13783.remove(obj);
                    this.f28921.remove(obj);
                }
            }
        } finally {
            lock.unlock();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m21802(Object obj, InterfaceC11273 interfaceC11273, boolean z) {
        boolean zEquals;
        C18929 c18929M21797 = m21797(obj);
        try {
            synchronized (interfaceC11273) {
                zEquals = interfaceC11273.getState().equals(EnumC23973.IDLE);
                if (zEquals || z) {
                    zEquals = c18929M21797.m43608().removeFirstOccurrence(interfaceC11273);
                }
            }
            if (zEquals || z) {
                c18929M21797.m43607().remove(new C9862(interfaceC11273.mo28254()));
                interfaceC11273.invalidate();
                try {
                    this.f28923.mo16190(obj, interfaceC11273);
                    c18929M21797.m43609().decrementAndGet();
                    this.f16941.incrementAndGet();
                    this.f28918.decrementAndGet();
                    m21805(obj);
                    return true;
                } catch (Throwable th) {
                    c18929M21797.m43609().decrementAndGet();
                    this.f16941.incrementAndGet();
                    this.f28918.decrementAndGet();
                    throw th;
                }
            }
            m21805(obj);
            return false;
        } catch (Throwable th2) {
            m21805(obj);
            throw th2;
        }
    }

    @Override // l.AbstractC4817
    /* JADX INFO: renamed from: ۙ */
    public final void mo13381() {
        ConcurrentMapC13783 concurrentMapC13783 = this.f28915;
        int i = this.f28922;
        if (this.f28920 <= i) {
            i = this.f28920;
        }
        if (i < 1) {
            return;
        }
        for (Object obj : concurrentMapC13783.keySet()) {
            C18929 c18929 = (C18929) concurrentMapC13783.get(obj);
            int iM21799 = m21799(c18929);
            for (int i2 = 0; i2 < iM21799 && m21799(c18929) > 0; i2++) {
                m21807(obj);
                if (c18929 == null) {
                    c18929 = (C18929) concurrentMapC13783.get(obj);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m21799(C18929 c18929) {
        if (c18929 != null) {
            int iM13396 = m13396();
            int i = this.f28914;
            int i2 = this.f28922;
            if (this.f28920 <= i2) {
                i2 = this.f28920;
            }
            int size = i2 - c18929.m43608().size();
            if (i > 0) {
                size = Math.min(size, Math.max(0, i - c18929.m43608().size()));
            }
            return iM13396 > 0 ? Math.min(size, Math.max(0, (iM13396 - (this.f28918.get() - m21809())) - m21809())) : size;
        }
        int i3 = this.f28922;
        return this.f28920 > i3 ? i3 : this.f28920;
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m21798() {
        int i = this.f28914;
        C0583 c0583 = null;
        Object obj = null;
        int i2 = 0;
        for (Map.Entry entry : this.f28915.entrySet()) {
            Object key = entry.getKey();
            C18929 c18929 = (C18929) entry.getValue();
            if (c18929 != null) {
                C0583 c0583M43608 = c18929.m43608();
                int iM2772 = c0583M43608.m2772();
                C18929 c189210 = (C18929) this.f28915.get(key);
                if ((c189210 != null ? c189210.m43607().size() - c189210.m43608().size() : 0) < i && iM2772 > i2) {
                    c0583 = c0583M43608;
                    obj = key;
                    i2 = iM2772;
                }
            }
        }
        if (c0583 != null) {
            m21797(obj);
            try {
                InterfaceC11273 interfaceC11273M21803 = m21803(obj);
                if (interfaceC11273M21803 != null) {
                    m21800(obj, interfaceC11273M21803);
                }
            } catch (Exception unused) {
            } finally {
                m21805(obj);
            }
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    private InterfaceC11273 m21803(Object obj) {
        boolean zM21802;
        int i = this.f28914;
        int i2 = i < 0 ? Integer.MAX_VALUE : i;
        int iM13396 = m13396();
        C18929 c18929 = (C18929) this.f28915.get(obj);
        boolean z = true;
        while (z) {
            int iIncrementAndGet = this.f28918.incrementAndGet();
            if (iM13396 <= -1 || iIncrementAndGet <= iM13396) {
                z = false;
            } else {
                this.f28918.decrementAndGet();
                if (m21809() == 0) {
                    return null;
                }
                final TreeMap treeMap = new TreeMap();
                C2492.forEach(this.f28915, new BiConsumer() { // from class: l.ܶᩳ᩵
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj2, Object obj3) {
                        C8346.m21801(treeMap, obj2, (C18929) obj3);
                    }

                    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return C2866.$default$andThen(this, biConsumer);
                    }
                });
                int size = ((int) (((double) treeMap.size()) * 0.15d)) + 1;
                Iterator it = treeMap.entrySet().iterator();
                while (it.hasNext() && size > 0) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object value = entry.getValue();
                    InterfaceC11273 interfaceC11273 = (InterfaceC11273) entry.getKey();
                    try {
                        EnumC6333 enumC6333 = EnumC6333.NORMAL;
                        zM21802 = m21802(value, interfaceC11273, false);
                    } catch (Exception unused) {
                        zM21802 = true;
                    }
                    if (zM21802) {
                        size--;
                    }
                }
            }
        }
        Boolean bool = null;
        while (bool == null) {
            synchronized (c18929.f61246) {
                if (c18929.m43609().incrementAndGet() > i2) {
                    c18929.m43609().decrementAndGet();
                    if (c18929.f61244 == 0) {
                        bool = Boolean.FALSE;
                    } else {
                        c18929.f61246.wait();
                    }
                } else {
                    C18929.m43604(c18929);
                    bool = Boolean.TRUE;
                }
            }
        }
        if (!bool.booleanValue()) {
            this.f28918.decrementAndGet();
            return null;
        }
        try {
            try {
                AbstractC12684 abstractC12684 = this.f28923;
                InterfaceC11273 interfaceC11273Mo16191 = abstractC12684.mo16191(abstractC12684.mo16189(obj));
                synchronized (c18929.f61246) {
                    C18929.m43601(c18929);
                    c18929.f61246.notifyAll();
                }
                this.f16945.incrementAndGet();
                c18929.m43607().put(new C9862(((C11874) interfaceC11273Mo16191).mo28254()), interfaceC11273Mo16191);
                return interfaceC11273Mo16191;
            } catch (Exception e) {
                this.f28918.decrementAndGet();
                c18929.m43609().decrementAndGet();
                throw e;
            }
        } catch (Throwable th) {
            synchronized (c18929.f61246) {
                C18929.m43601(c18929);
                c18929.f61246.notifyAll();
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f16938) {
            return;
        }
        synchronized (this.f16944) {
            if (this.f16938) {
                return;
            }
            m13385(C21813.ofMillis(-1L));
            this.f16938 = true;
            C0356.forEach(this.f28915.keySet(), new C2445(1, this));
            m13389();
            C0356.forEach(this.f28915.values(), new C18223());
            C0356.forEach(this.f28915.keySet(), new C2445(1, this));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21807(Object obj) {
        if (!this.f16938) {
            m21797(obj);
            try {
                m21800(obj, m21803(obj));
                return;
            } finally {
                m21805(obj);
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
    @Override // l.AbstractC4817
    /* JADX INFO: renamed from: ۨ */
    public final void mo13388() {
        int iCeil;
        C14801 c14801;
        InterfaceC11273 next;
        Deque dequeM35467;
        boolean zMo15227;
        boolean z;
        boolean zMo16192;
        if (this.f16938) {
            throw new IllegalStateException("Pool not open");
        }
        if (m21809() > 0) {
            InterfaceC5523 interfaceC5523M13397 = m13397();
            synchronized (this.f16928) {
                C21813 c21813M13387 = m13387();
                C21813 c21813M13395 = m13395();
                int i = this.f28922;
                if (this.f28920 <= i) {
                    i = this.f28920;
                }
                C2700 c2700 = new C2700(c21813M13387, c21813M13395, i);
                boolean zM13379 = m13379();
                int iM21809 = m21809();
                int iM13393 = m13393();
                if (iM13393 >= 0) {
                    iCeil = Math.min(iM13393, iM21809);
                } else {
                    iCeil = (int) Math.ceil(((double) iM21809) / Math.abs(iM13393));
                }
                int i2 = 0;
                while (i2 < iCeil) {
                    C14801 c14802 = this.f16935;
                    Object th = null;
                    if (c14802 == null || !c14802.hasNext()) {
                        Iterator it = this.f28916;
                        if (it == null || !it.hasNext()) {
                            ArrayList arrayList = new ArrayList();
                            Lock lock = this.f28919.readLock();
                            lock.lock();
                            try {
                                arrayList.addAll(this.f28921);
                                lock.unlock();
                                this.f28916 = arrayList.iterator();
                            } catch (Throwable th2) {
                                lock.unlock();
                                throw th2;
                            }
                        }
                        while (this.f28916.hasNext()) {
                            Object next2 = this.f28916.next();
                            this.f28917 = next2;
                            C18929 c18929 = (C18929) this.f28915.get(next2);
                            if (c18929 != null) {
                                C14801 c14803 = new C14801(this, c18929.m43608());
                                this.f16935 = c14803;
                                if (c14803.hasNext()) {
                                    break;
                                } else {
                                    this.f16935 = null;
                                }
                            }
                        }
                        c14801 = this.f16935;
                        if (c14801 == null) {
                            return;
                        }
                        try {
                            next = c14801.next();
                            dequeM35467 = this.f16935.m35467();
                            if (next.mo28259()) {
                                try {
                                    zMo15227 = interfaceC5523M13397.mo15227(c2700, next, ((C18929) this.f28915.get(this.f28917)).m43608().size());
                                } catch (Throwable th3) {
                                    if (th3 instanceof ThreadDeath) {
                                        throw ((ThreadDeath) th3);
                                    }
                                    if (!(th3 instanceof VirtualMachineError)) {
                                        new Exception(th3);
                                        zMo15227 = false;
                                    } else {
                                        throw ((VirtualMachineError) th3);
                                    }
                                }
                                if (zMo15227) {
                                    Object obj = this.f28917;
                                    EnumC6333 enumC6333 = EnumC6333.NORMAL;
                                    m21802(obj, next, true);
                                    this.f16953.incrementAndGet();
                                } else {
                                    if (zM13379) {
                                        try {
                                            this.f28923.getClass();
                                            z = true;
                                        } catch (Exception unused) {
                                            Object obj2 = this.f28917;
                                            EnumC6333 enumC6334 = EnumC6333.NORMAL;
                                            m21802(obj2, next, true);
                                            this.f16953.incrementAndGet();
                                            z = false;
                                        }
                                        if (z) {
                                            try {
                                                zMo16192 = this.f28923.mo16192(this.f28917, next);
                                            } catch (Throwable th4) {
                                                th = th4;
                                                if (th instanceof ThreadDeath) {
                                                    throw ((ThreadDeath) th);
                                                }
                                                if (th instanceof VirtualMachineError) {
                                                    throw ((VirtualMachineError) th);
                                                }
                                                zMo16192 = false;
                                            }
                                            if (!zMo16192) {
                                                Object obj3 = this.f28917;
                                                EnumC6333 enumC6335 = EnumC6333.NORMAL;
                                                m21802(obj3, next, true);
                                                this.f16953.incrementAndGet();
                                                if (th != null) {
                                                    if (th instanceof RuntimeException) {
                                                        throw ((RuntimeException) th);
                                                    }
                                                    throw ((Error) th);
                                                }
                                            } else {
                                                try {
                                                    this.f28923.getClass();
                                                } catch (Exception unused2) {
                                                    Object obj4 = this.f28917;
                                                    EnumC6333 enumC6336 = EnumC6333.NORMAL;
                                                    m21802(obj4, next, true);
                                                    this.f16953.incrementAndGet();
                                                }
                                            }
                                        }
                                    }
                                    next.mo28253(dequeM35467);
                                }
                            } else {
                                i2--;
                            }
                        } catch (NoSuchElementException unused3) {
                            i2--;
                            this.f16935 = null;
                        }
                        i2++;
                    } else {
                        c14801 = this.f16935;
                        if (c14801 == null) {
                            return;
                        }
                        next = c14801.next();
                        dequeM35467 = this.f16935.m35467();
                        if (next.mo28259()) {
                            i2--;
                        } else {
                            zMo15227 = interfaceC5523M13397.mo15227(c2700, next, ((C18929) this.f28915.get(this.f28917)).m43608().size());
                            if (zMo15227) {
                                Object obj5 = this.f28917;
                                EnumC6333 enumC6337 = EnumC6333.NORMAL;
                                m21802(obj5, next, true);
                                this.f16953.incrementAndGet();
                            } else {
                                if (zM13379) {
                                    this.f28923.getClass();
                                    z = true;
                                    if (z) {
                                        zMo16192 = this.f28923.mo16192(this.f28917, next);
                                        if (!zMo16192) {
                                            Object obj6 = this.f28917;
                                            EnumC6333 enumC6338 = EnumC6333.NORMAL;
                                            m21802(obj6, next, true);
                                            this.f16953.incrementAndGet();
                                            if (th != null) {
                                                if (th instanceof RuntimeException) {
                                                    throw ((RuntimeException) th);
                                                }
                                                throw ((Error) th);
                                            }
                                        } else {
                                            this.f28923.getClass();
                                        }
                                    }
                                }
                                next.mo28253(dequeM35467);
                            }
                        }
                        i2++;
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final int m21809() {
        return C9030.stream(this.f28915.values()).mapToInt(new C23163()).sum();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m21806(Object obj) {
        C18929 c18929 = (C18929) this.f28915.get(obj);
        if (c18929 != null) {
            return c18929.m43608().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    private boolean m21804() {
        return C9030.stream(this.f28915.values()).anyMatch(new C21751());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21808(Object obj, Object obj2) {
        C18929 c18929 = (C18929) this.f28915.get(obj);
        InterfaceC11273 interfaceC11273 = (InterfaceC11273) c18929.m43607().get(new C9862(obj2));
        if (interfaceC11273 == null) {
            throw new IllegalStateException("Object not currently part of this pool");
        }
        synchronized (interfaceC11273) {
            if (interfaceC11273.getState() != EnumC23973.INVALID) {
                m21802(obj, interfaceC11273, true);
            }
        }
        if (c18929.f61247.m2771()) {
            m21807(obj);
        }
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    private C18929 m21797(Object obj) {
        ConcurrentMapC13783 concurrentMapC13783 = this.f28915;
        ReentrantReadWriteLock reentrantReadWriteLock = this.f28919;
        Lock lock = reentrantReadWriteLock.readLock();
        try {
            lock.lock();
            C18929 c18929 = (C18929) concurrentMapC13783.get(obj);
            if (c18929 == null) {
                lock.unlock();
                lock = reentrantReadWriteLock.writeLock();
                lock.lock();
                c18929 = (C18929) concurrentMapC13783.get(obj);
                if (c18929 == null) {
                    c18929 = new C18929();
                    c18929.m43606().incrementAndGet();
                    concurrentMapC13783.put(obj, c18929);
                    this.f28921.add(obj);
                } else {
                    c18929.m43606().incrementAndGet();
                }
            } else {
                c18929.m43606().incrementAndGet();
            }
            return c18929;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21812(Object obj, Object obj2) {
        C18929 c18929 = (C18929) this.f28915.get(obj);
        if (c18929 == null) {
            throw new IllegalStateException("No keyed pool found under the given key.");
        }
        InterfaceC11273 interfaceC11273 = (InterfaceC11273) c18929.m43607().get(new C9862(obj2));
        if (interfaceC11273 != null) {
            synchronized (interfaceC11273) {
                if (interfaceC11273.getState() != EnumC23973.ALLOCATED) {
                    throw new IllegalStateException("Object has already been returned to this pool or is invalid");
                }
                interfaceC11273.mo28252();
            }
            C21813 c21813Mo28257 = interfaceC11273.mo28257();
            try {
                try {
                    try {
                        this.f28923.getClass();
                        if (interfaceC11273.mo28255()) {
                            int i = this.f28922;
                            C0583 c0583M43608 = c18929.m43608();
                            if (this.f16938 || (i > -1 && i <= c0583M43608.size())) {
                                try {
                                    EnumC6333 enumC6333 = EnumC6333.NORMAL;
                                    m21802(obj, interfaceC11273, true);
                                } catch (Exception unused) {
                                }
                            } else {
                                if (m13390()) {
                                    c0583M43608.addFirst(interfaceC11273);
                                } else {
                                    c0583M43608.addLast(interfaceC11273);
                                }
                                if (this.f16938) {
                                    m21810(obj);
                                }
                            }
                            if (m21804()) {
                                m21798();
                            }
                            m13391(c21813Mo28257);
                            return;
                        }
                        throw new IllegalStateException("Object has already been returned to this pool");
                    } catch (Exception unused2) {
                        if (c18929.f61247.m2771()) {
                            try {
                                m21807(obj);
                            } catch (Exception unused3) {
                            }
                        }
                        if (m21804()) {
                            m21798();
                        }
                        m13391(c21813Mo28257);
                        return;
                    }
                } catch (Exception unused4) {
                    EnumC6333 enumC6334 = EnumC6333.NORMAL;
                    m21802(obj, interfaceC11273, true);
                    if (c18929.f61247.m2771()) {
                        m21807(obj);
                    }
                    if (m21804()) {
                        m21798();
                    }
                    m13391(c21813Mo28257);
                    return;
                }
            } catch (Throwable th) {
                if (m21804()) {
                    m21798();
                }
                m13391(c21813Mo28257);
                throw th;
            }
        }
        throw new IllegalStateException("Returned object not currently part of this pool");
    }

    @Override // l.AbstractC4817, l.AbstractC17622
    /* JADX INFO: renamed from: ۙ */
    public final void mo13383(StringBuilder sb) {
        super.mo13383(sb);
        sb.append(", maxIdlePerKey=");
        sb.append(this.f28922);
        sb.append(", minIdlePerKey=");
        sb.append(this.f28920);
        sb.append(", maxTotalPerKey=");
        sb.append(this.f28914);
        sb.append(", factory=");
        sb.append(this.f28923);
        sb.append(", fairness=");
        sb.append(false);
        sb.append(", poolMap=");
        sb.append(this.f28915);
        sb.append(", poolKeyList=");
        sb.append(this.f28921);
        sb.append(", keyLock=");
        sb.append(this.f28919);
        sb.append(", numTotal=");
        sb.append(this.f28918);
        sb.append(", evictionKeyIterator=");
        sb.append(this.f28916);
        sb.append(", evictionKey=");
        sb.append(this.f28917);
        sb.append(", abandonedConfig=");
        sb.append((Object) null);
    }
}
