package l;

import java.util.AbstractMap;
import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.logging.Logger;

/* JADX INFO: renamed from: l.᩹֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes5.dex */
public final class ConcurrentMapC21937 extends AbstractMap implements ConcurrentMap, InterfaceC5315 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final EnumC9693 f71144;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC10523 f71145;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f71146;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public final C18283[] f71147;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final InterfaceC17703 f71148;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7826 f71149;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f71150;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC2635 f71151;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22392 f71152;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final long f71153;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final AbstractC14072 f71154;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public final int f71155;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f71156;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public Collection f71157;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public final int f71158;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC10523 f71159;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f71160;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Set f71161;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final long f71162;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC18864 f71163;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC14072 f71164;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public Set f71165;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final Logger f71142 = Logger.getLogger(ConcurrentMapC21937.class.getName());

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final C8987 f71143 = new C8987();

    /* JADX INFO: renamed from: ۜۙ, reason: not valid java name and contains not printable characters */
    public static final Queue f71141 = new C10398();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C11666.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C11666.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C11666.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C11666.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C11666.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C11666.$default$replaceAll(this, biFunction);
    }

    public ConcurrentMapC21937(C21686 c21686, AbstractC18864 abstractC18864) {
        long j;
        Collection concurrentLinkedQueue;
        int i = c21686.f70343;
        InterfaceC23949 interfaceC23949 = c21686.f70342;
        this.f71160 = Math.min(i == -1 ? 4 : i, 65536);
        EnumC10523 enumC10523 = c21686.f70344;
        EnumC10523 enumC10524 = EnumC10523.f36019;
        EnumC10523 enumC10525 = (EnumC10523) C15483.m37071(enumC10523, enumC10524);
        this.f71159 = enumC10525;
        this.f71145 = (EnumC10523) C15483.m37071(c21686.f70351, enumC10524);
        this.f71154 = (AbstractC14072) C15483.m37071(c21686.f70341, ((EnumC10523) C15483.m37071(c21686.f70344, enumC10524)).mo22039());
        this.f71164 = (AbstractC14072) C15483.m37071(c21686.f70349, ((EnumC10523) C15483.m37071(c21686.f70351, enumC10524)).mo22039());
        if (c21686.f70346 == 0 || c21686.f70348 == 0) {
            j = 0;
        } else {
            j = c21686.f70350 == null ? c21686.f70352 : c21686.f70340;
        }
        this.f71146 = j;
        InterfaceC7826 interfaceC7826 = c21686.f70350;
        EnumC15337 enumC15337 = EnumC15337.INSTANCE;
        InterfaceC7826 interfaceC7827 = (InterfaceC7826) C15483.m37071(interfaceC7826, enumC15337);
        this.f71149 = interfaceC7827;
        long j2 = c21686.f70348;
        this.f71156 = j2 == -1 ? 0L : j2;
        long j3 = c21686.f70346;
        this.f71162 = j3 == -1 ? 0L : j3;
        this.f71153 = 0L;
        InterfaceC17703 interfaceC17703 = c21686.f70347;
        EnumC23098 enumC23098 = EnumC23098.INSTANCE;
        InterfaceC17703 interfaceC17704 = (InterfaceC17703) C15483.m37071(interfaceC17703, enumC23098);
        this.f71148 = interfaceC17704;
        if (interfaceC17704 == enumC23098) {
            concurrentLinkedQueue = f71141;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f71150 = (AbstractQueue) concurrentLinkedQueue;
        int i2 = 0;
        boolean z = m48758() || 0 > 0 || m48760();
        AbstractC2635 abstractC2635M8122 = c21686.f70353;
        if (abstractC2635M8122 == null) {
            abstractC2635M8122 = z ? AbstractC2635.m8122() : C21686.f70338;
        }
        this.f71151 = abstractC2635M8122;
        this.f71144 = EnumC9693.m24656(enumC10525, m48760() || m48756() || m48760(), m48758() || m48758() || 0 > 0);
        this.f71152 = (InterfaceC22392) interfaceC23949.get();
        this.f71163 = abstractC18864;
        int iMin = Math.min(16, 1073741824);
        if (m48756() && interfaceC7827 == enumC15337) {
            iMin = (int) Math.min(iMin, j);
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f71160 && (!m48756() || ((long) i3) * 20 <= this.f71146)) {
            i4++;
            i3 <<= 1;
        }
        this.f71155 = 32 - i4;
        this.f71158 = i3 - 1;
        this.f71147 = new C18283[i3];
        int i5 = iMin / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < iMin ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        if (m48756()) {
            long j4 = this.f71146;
            long j5 = i3;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                C18283[] c18283Arr = this.f71147;
                if (i2 >= c18283Arr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                c18283Arr[i2] = new C18283(this, i6, j8, (InterfaceC22392) interfaceC23949.get());
                i2++;
                j6 = j8;
            }
        } else {
            while (true) {
                C18283[] c18283Arr2 = this.f71147;
                if (i2 >= c18283Arr2.length) {
                    return;
                }
                c18283Arr2[i2] = new C18283(this, i6, -1L, (InterfaceC22392) interfaceC23949.get());
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48756() {
        return this.f71146 >= 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m48758() {
        return this.f71162 > 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m48760() {
        return this.f71156 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM48754 = m48754(obj);
        return m48759(iM48754).m42473(obj, iM48754, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM48754 = m48754(obj);
        return m48759(iM48754).m42473(obj, iM48754, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.lock();
        try {
            long jMo8123 = c18283M48759.f58343.f71151.mo8123();
            c18283M48759.m42494(jMo8123);
            AtomicReferenceArray atomicReferenceArray = c18283M48759.f58341;
            int length = iM48754 & (atomicReferenceArray.length() - 1);
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM48754 && key != null && c18283M48759.f58343.f71154.m34035(obj, key)) {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj3 = interfaceC12639Mo3304.get();
                    if (obj3 == null) {
                        if (!interfaceC12639Mo3304.mo4754()) {
                            break;
                        }
                        c18283M48759.f58344++;
                        InterfaceC0769 interfaceC0769M42481 = c18283M48759.m42481(interfaceC0769, next, key, obj3, interfaceC12639Mo3304, EnumC21231.f69157);
                        int i = c18283M48759.f58345 - 1;
                        atomicReferenceArray.set(length, interfaceC0769M42481);
                        c18283M48759.f58345 = i;
                        break;
                    }
                    c18283M48759.f58344++;
                    c18283M48759.m42485(obj, obj3, interfaceC12639Mo3304.mo4755(), EnumC21231.f69153);
                    c18283M48759.m42487(next, obj, obj2, jMo8123);
                    c18283M48759.m42486(next);
                    return obj3;
                }
            }
            return null;
        } finally {
            c18283M48759.unlock();
            c18283M48759.m42489();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.lock();
        try {
            long jMo8123 = c18283M48759.f58343.f71151.mo8123();
            c18283M48759.m42494(jMo8123);
            AtomicReferenceArray atomicReferenceArray = c18283M48759.f58341;
            int length = (atomicReferenceArray.length() - 1) & iM48754;
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            InterfaceC0769 next = interfaceC0769;
            while (next != null) {
                Object key = next.getKey();
                if (next.getHash() != iM48754 || key == null || !c18283M48759.f58343.f71154.m34035(obj, key)) {
                    int i = length;
                    next = next.getNext();
                    length = i;
                } else {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj4 = interfaceC12639Mo3304.get();
                    if (obj4 == null) {
                        if (!interfaceC12639Mo3304.mo4754()) {
                            break;
                        }
                        c18283M48759.f58344++;
                        InterfaceC0769 interfaceC0769M42481 = c18283M48759.m42481(interfaceC0769, next, key, obj4, interfaceC12639Mo3304, EnumC21231.f69157);
                        int i2 = c18283M48759.f58345 - 1;
                        atomicReferenceArray.set(length, interfaceC0769M42481);
                        c18283M48759.f58345 = i2;
                        break;
                    }
                    if (c18283M48759.f58343.f71164.m34035(obj2, obj4)) {
                        c18283M48759.f58344++;
                        c18283M48759.m42485(obj, obj4, interfaceC12639Mo3304.mo4755(), EnumC21231.f69153);
                        c18283M48759.m42487(next, obj, obj3, jMo8123);
                        c18283M48759.m42486(next);
                        c18283M48759.unlock();
                        c18283M48759.m42489();
                        return true;
                    }
                    c18283M48759.m42496(next, jMo8123);
                    break;
                }
            }
            c18283M48759.unlock();
            c18283M48759.m42489();
            return false;
        } catch (Throwable th) {
            c18283M48759.unlock();
            c18283M48759.m42489();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m48755(Object obj, AbstractC18864 abstractC18864) {
        InterfaceC0769 interfaceC0769M42479;
        obj.getClass();
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.getClass();
        abstractC18864.getClass();
        try {
            try {
                if (c18283M48759.f58345 != 0 && (interfaceC0769M42479 = c18283M48759.m42479(iM48754, obj)) != null) {
                    long jMo8123 = c18283M48759.f58343.f71151.mo8123();
                    Object objM42476 = c18283M48759.m42476(interfaceC0769M42479, jMo8123);
                    if (objM42476 != null) {
                        c18283M48759.m42491(interfaceC0769M42479, jMo8123);
                        c18283M48759.f58346.mo32707();
                        Object objM42477 = c18283M48759.m42477(interfaceC0769M42479, obj, iM48754, objM42476, jMo8123, abstractC18864);
                        c18283M48759.m42472();
                        return objM42477;
                    }
                    InterfaceC12639 interfaceC12639Mo3304 = interfaceC0769M42479.mo3304();
                    if (interfaceC12639Mo3304.mo4753()) {
                        Object objM42478 = c18283M48759.m42478(interfaceC0769M42479, obj, interfaceC12639Mo3304);
                        c18283M48759.m42472();
                        return objM42478;
                    }
                }
                Object objM42475 = c18283M48759.m42475(obj, iM48754, abstractC18864);
                c18283M48759.m42472();
                return objM42475;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C19384((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new C23618(cause);
                }
                throw e;
            }
        } catch (Throwable th) {
            c18283M48759.m42472();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48757(InterfaceC0769 interfaceC0769, long j) {
        interfaceC0769.getClass();
        if (!m48760() || j - interfaceC0769.mo3306() < this.f71156) {
            return m48758() && j - interfaceC0769.mo2936() >= this.f71162;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48754(Object obj) {
        int iM34034 = this.f71154.m34034(obj);
        int i = iM34034 + ((iM34034 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C18283 m48759(int i) {
        return this.f71147[(i >>> this.f71155) & this.f71158];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C18283[] c18283Arr = this.f71147;
        long j = 0;
        for (C18283 c18283 : c18283Arr) {
            if (c18283.f58345 != 0) {
                return false;
            }
            j += (long) c18283.f58344;
        }
        if (j == 0) {
            return true;
        }
        for (C18283 c18284 : c18283Arr) {
            if (c18284.f58345 != 0) {
                return false;
            }
            j -= (long) c18284.f58344;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C18283 c18283 : this.f71147) {
            jMax += (long) Math.max(0, c18283.f58345);
        }
        return C17039.m39822(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        InterfaceC0769 interfaceC0769;
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.getClass();
        try {
            if (c18283M48759.f58345 != 0) {
                long jMo8123 = c18283M48759.f58343.f71151.mo8123();
                InterfaceC0769 interfaceC0769M42479 = c18283M48759.m42479(iM48754, obj);
                if (interfaceC0769M42479 != null) {
                    if (!c18283M48759.f58343.m48757(interfaceC0769M42479, jMo8123)) {
                        interfaceC0769 = interfaceC0769M42479;
                    } else if (c18283M48759.tryLock()) {
                        try {
                            c18283M48759.m42483(jMo8123);
                            c18283M48759.unlock();
                        } catch (Throwable th) {
                            c18283M48759.unlock();
                            throw th;
                        }
                    }
                    if (interfaceC0769 == null) {
                        obj2 = interfaceC0769.mo3304().get();
                        if (obj2 != null) {
                            c18283M48759.m42491(interfaceC0769, jMo8123);
                            Object objM42477 = c18283M48759.m42477(interfaceC0769, interfaceC0769.getKey(), iM48754, obj2, jMo8123, c18283M48759.f58343.f71163);
                            c18283M48759.m42472();
                            return objM42477;
                        }
                        c18283M48759.m42497();
                    } else {
                        c18283M48759.m42472();
                        return null;
                    }
                }
                interfaceC0769 = null;
                if (interfaceC0769 == null) {
                    obj2 = interfaceC0769.mo3304().get();
                    if (obj2 != null) {
                        c18283M48759.m42491(interfaceC0769, jMo8123);
                        Object objM42478 = c18283M48759.m42477(interfaceC0769, interfaceC0769.getKey(), iM48754, obj2, jMo8123, c18283M48759.f58343.f71163);
                        c18283M48759.m42472();
                        return objM42478;
                    }
                    c18283M48759.m42497();
                } else {
                    c18283M48759.m42472();
                    return null;
                }
            }
            c18283M48759.m42472();
            return null;
        } catch (Throwable th2) {
            c18283M48759.m42472();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC5315, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:6:0x000f, B:8:0x0013, B:24:0x0044, B:11:0x0023, B:13:0x002b, B:16:0x0034, B:18:0x0039, B:19:0x003c, B:15:0x0031), top: B:34:0x000f, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.getClass();
        try {
            if (c18283M48759.f58345 == 0) {
                c18283M48759.m42472();
                return false;
            }
            long jMo8123 = c18283M48759.f58343.f71151.mo8123();
            InterfaceC0769 interfaceC0769M42479 = c18283M48759.m42479(iM48754, obj);
            if (interfaceC0769M42479 != null) {
                if (c18283M48759.f58343.m48757(interfaceC0769M42479, jMo8123)) {
                    if (c18283M48759.tryLock()) {
                        try {
                            c18283M48759.m42483(jMo8123);
                            c18283M48759.unlock();
                        } catch (Throwable th) {
                            c18283M48759.unlock();
                            throw th;
                        }
                    }
                }
                if (interfaceC0769M42479 == null) {
                    boolean z = interfaceC0769M42479.mo3304().get() != null;
                    c18283M48759.m42472();
                    return z;
                }
                c18283M48759.m42472();
                return false;
            }
            interfaceC0769M42479 = null;
            if (interfaceC0769M42479 == null) {
                if (interfaceC0769M42479.mo3304().get() != null) {
                }
                c18283M48759.m42472();
                return z;
            }
            c18283M48759.m42472();
            return false;
        } catch (Throwable th2) {
            c18283M48759.m42472();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jMo8123 = this.f71151.mo8123();
        C18283[] c18283Arr = this.f71147;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c18283Arr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C18283 c18283 = c18283Arr[i2];
                int i3 = c18283.f58345;
                AtomicReferenceArray atomicReferenceArray = c18283.f58341;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC0769 next = (InterfaceC0769) atomicReferenceArray.get(i4);
                    while (next != null) {
                        C18283[] c18283Arr2 = c18283Arr;
                        Object objM42476 = c18283.m42476(next, jMo8123);
                        long j3 = jMo8123;
                        if (objM42476 != null && this.f71164.m34035(obj, objM42476)) {
                            return true;
                        }
                        next = next.getNext();
                        c18283Arr = c18283Arr2;
                        jMo8123 = j3;
                    }
                }
                j2 += (long) c18283.f58344;
                i2++;
                jMo8123 = jMo8123;
            }
            long j4 = jMo8123;
            C18283[] c18283Arr3 = c18283Arr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c18283Arr = c18283Arr3;
            jMo8123 = j4;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        EnumC21231 enumC21231;
        if (obj == null) {
            return null;
        }
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.lock();
        try {
            c18283M48759.m42494(c18283M48759.f58343.f71151.mo8123());
            AtomicReferenceArray atomicReferenceArray = c18283M48759.f58341;
            int length = iM48754 & (atomicReferenceArray.length() - 1);
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM48754 && key != null && c18283M48759.f58343.f71154.m34035(obj, key)) {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj2 = interfaceC12639Mo3304.get();
                    if (obj2 != null) {
                        enumC21231 = EnumC21231.f69155;
                    } else {
                        if (!interfaceC12639Mo3304.mo4754()) {
                            break;
                        }
                        enumC21231 = EnumC21231.f69157;
                    }
                    EnumC21231 enumC21232 = enumC21231;
                    c18283M48759.f58344++;
                    InterfaceC0769 interfaceC0769M42481 = c18283M48759.m42481(interfaceC0769, next, key, obj2, interfaceC12639Mo3304, enumC21232);
                    int i = c18283M48759.f58345 - 1;
                    atomicReferenceArray.set(length, interfaceC0769M42481);
                    c18283M48759.f58345 = i;
                    return obj2;
                }
            }
            return null;
        } finally {
            c18283M48759.unlock();
            c18283M48759.m42489();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        EnumC21231 enumC21231;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM48754 = m48754(obj);
        C18283 c18283M48759 = m48759(iM48754);
        c18283M48759.lock();
        try {
            c18283M48759.m42494(c18283M48759.f58343.f71151.mo8123());
            AtomicReferenceArray atomicReferenceArray = c18283M48759.f58341;
            int length = iM48754 & (atomicReferenceArray.length() - 1);
            InterfaceC0769 interfaceC0769 = (InterfaceC0769) atomicReferenceArray.get(length);
            for (InterfaceC0769 next = interfaceC0769; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM48754 && key != null && c18283M48759.f58343.f71154.m34035(obj, key)) {
                    InterfaceC12639 interfaceC12639Mo3304 = next.mo3304();
                    Object obj3 = interfaceC12639Mo3304.get();
                    if (c18283M48759.f58343.f71164.m34035(obj2, obj3)) {
                        enumC21231 = EnumC21231.f69155;
                    } else {
                        if (obj3 != null || !interfaceC12639Mo3304.mo4754()) {
                            break;
                            break;
                        }
                        enumC21231 = EnumC21231.f69157;
                    }
                    c18283M48759.f58344++;
                    InterfaceC0769 interfaceC0769M42481 = c18283M48759.m42481(interfaceC0769, next, key, obj3, interfaceC12639Mo3304, enumC21231);
                    int i = c18283M48759.f58345 - 1;
                    atomicReferenceArray.set(length, interfaceC0769M42481);
                    c18283M48759.f58345 = i;
                    if (enumC21231 != EnumC21231.f69155) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
            return z;
        } finally {
            c18283M48759.unlock();
            c18283M48759.m42489();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (C18283 c18283 : this.f71147) {
            if (c18283.f58345 != 0) {
                c18283.lock();
                try {
                    c18283.m42494(c18283.f58343.f71151.mo8123());
                    AtomicReferenceArray atomicReferenceArray = c18283.f58341;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (InterfaceC0769 next = (InterfaceC0769) atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.mo3304().mo4754()) {
                                Object key = next.getKey();
                                Object obj = next.mo3304().get();
                                EnumC21231 enumC21231 = (key == null || obj == null) ? EnumC21231.f69157 : EnumC21231.f69155;
                                next.getHash();
                                c18283.m42485(key, obj, next.mo3304().mo4755(), enumC21231);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    ConcurrentMapC21937 concurrentMapC21937 = c18283.f58343;
                    if (concurrentMapC21937.f71159 != EnumC10523.f36019) {
                        while (c18283.f58333.poll() != null) {
                        }
                    }
                    if (concurrentMapC21937.f71145 != EnumC10523.f36019) {
                        while (c18283.f58335.poll() != null) {
                        }
                    }
                    c18283.f58336.clear();
                    c18283.f58342.clear();
                    c18283.f58337.set(0);
                    c18283.f58344++;
                    c18283.f58345 = 0;
                    c18283.unlock();
                    c18283.m42489();
                } catch (Throwable th) {
                    c18283.unlock();
                    c18283.m42489();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f71165;
        if (set != null) {
            return set;
        }
        C2760 c2760 = new C2760(this);
        this.f71165 = c2760;
        return c2760;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f71157;
        if (collection != null) {
            return collection;
        }
        C17577 c17577 = new C17577(this);
        this.f71157 = c17577;
        return c17577;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f71161;
        if (set != null) {
            return set;
        }
        C4877 c4877 = new C4877(this);
        this.f71161 = c4877;
        return c4877;
    }
}
