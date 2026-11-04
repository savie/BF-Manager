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

/* JADX INFO: renamed from: l.ۚ᩸ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public final class ConcurrentMapC5942 extends AbstractMap implements ConcurrentMap, InterfaceC3079 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Set f20335;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final AbstractC12874 f20336;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12653 f20337;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final EnumC4099 f20338;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public final AbstractQueue f20339;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public Collection f20340;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f20341;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final long f20342;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final long f20343;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public Set f20344;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public final InterfaceC5920 f20345;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public final int f20346;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC4099 f20347;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC3704 f20348;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f20349;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12874 f20350;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC4845 f20351;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final long f20352;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC15614 f20353;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final AbstractC20836 f20354;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public final int f20355;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final C3353[] f20356;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public static final Logger f20333 = Logger.getLogger(ConcurrentMapC5942.class.getName());

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final C24566 f20334 = new C24566();

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final Queue f20332 = new C4428();

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C15757.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C15757.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C15757.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C15757.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C15757.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C15757.$default$replaceAll(this, biFunction);
    }

    public ConcurrentMapC5942(C23820 c23820, AbstractC20836 abstractC20836) {
        long j;
        Collection concurrentLinkedQueue;
        int i = c23820.f77147;
        InterfaceC6908 interfaceC6908 = c23820.f77146;
        this.f20349 = Math.min(i == -1 ? 4 : i, 65536);
        EnumC4099 enumC4099 = c23820.f77156;
        EnumC4099 enumC40910 = EnumC4099.f13963;
        EnumC4099 enumC40911 = (EnumC4099) C20333.m46713(enumC4099, enumC40910);
        this.f20338 = enumC40911;
        this.f20347 = (EnumC4099) C20333.m46713(c23820.f77155, enumC40910);
        this.f20336 = (AbstractC12874) C20333.m46713(c23820.f77158, ((EnumC4099) C20333.m46713(c23820.f77156, enumC40910)).mo13192());
        this.f20350 = (AbstractC12874) C20333.m46713(c23820.f77154, ((EnumC4099) C20333.m46713(c23820.f77155, enumC40910)).mo13192());
        if (c23820.f77149 == 0 || c23820.f77157 == 0) {
            j = 0;
        } else {
            j = c23820.f77153 == null ? c23820.f77152 : c23820.f77151;
        }
        this.f20343 = j;
        InterfaceC12653 interfaceC12653 = c23820.f77153;
        EnumC16360 enumC16360 = EnumC16360.INSTANCE;
        InterfaceC12653 interfaceC12654 = (InterfaceC12653) C20333.m46713(interfaceC12653, enumC16360);
        this.f20337 = interfaceC12654;
        long j2 = c23820.f77157;
        this.f20342 = j2 == -1 ? 0L : j2;
        long j3 = c23820.f77149;
        this.f20352 = j3 == -1 ? 0L : j3;
        this.f20341 = 0L;
        InterfaceC3704 interfaceC3704 = c23820.f77148;
        EnumC17852 enumC17852 = EnumC17852.INSTANCE;
        InterfaceC3704 interfaceC3705 = (InterfaceC3704) C20333.m46713(interfaceC3704, enumC17852);
        this.f20348 = interfaceC3705;
        if (interfaceC3705 == enumC17852) {
            concurrentLinkedQueue = f20332;
        } else {
            concurrentLinkedQueue = new ConcurrentLinkedQueue();
        }
        this.f20339 = (AbstractQueue) concurrentLinkedQueue;
        int i2 = 0;
        boolean z = m17299() || 0 > 0 || m17298();
        AbstractC15614 abstractC15614M37346 = c23820.f77159;
        if (abstractC15614M37346 == null) {
            abstractC15614M37346 = z ? AbstractC15614.m37346() : C23820.f77144;
        }
        this.f20353 = abstractC15614M37346;
        this.f20351 = EnumC4845.m14881(enumC40911, m17298() || m17295() || m17298(), m17299() || m17299() || 0 > 0);
        this.f20345 = (InterfaceC5920) interfaceC6908.get();
        this.f20354 = abstractC20836;
        int iMin = Math.min(16, 1073741824);
        if (m17295() && interfaceC12654 == enumC16360) {
            iMin = (int) Math.min(iMin, j);
        }
        int i3 = 1;
        int i4 = 0;
        while (i3 < this.f20349 && (!m17295() || ((long) i3) * 20 <= this.f20343)) {
            i4++;
            i3 <<= 1;
        }
        this.f20346 = 32 - i4;
        this.f20355 = i3 - 1;
        this.f20356 = new C3353[i3];
        int i5 = iMin / i3;
        int i6 = 1;
        while (i6 < (i5 * i3 < iMin ? i5 + 1 : i5)) {
            i6 <<= 1;
        }
        if (m17295()) {
            long j4 = this.f20343;
            long j5 = i3;
            long j6 = (j4 / j5) + 1;
            long j7 = j4 % j5;
            while (true) {
                C3353[] c3353Arr = this.f20356;
                if (i2 >= c3353Arr.length) {
                    return;
                }
                if (i2 == j7) {
                    j6--;
                }
                long j8 = j6;
                c3353Arr[i2] = new C3353(this, i6, j8, (InterfaceC5920) interfaceC6908.get());
                i2++;
                j6 = j8;
            }
        } else {
            while (true) {
                C3353[] c3353Arr2 = this.f20356;
                if (i2 >= c3353Arr2.length) {
                    return;
                }
                c3353Arr2[i2] = new C3353(this, i6, -1L, (InterfaceC5920) interfaceC6908.get());
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17295() {
        return this.f20343 >= 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m17299() {
        return this.f20352 > 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m17298() {
        return this.f20342 > 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM17293 = m17293(obj);
        return m17297(iM17293).m11003(obj, iM17293, obj2, false);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM17293 = m17293(obj);
        return m17297(iM17293).m11003(obj, iM17293, obj2, true);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.lock();
        try {
            long jMo37347 = c3353M17297.f10940.f20353.mo37347();
            c3353M17297.m11025(jMo37347);
            AtomicReferenceArray atomicReferenceArray = c3353M17297.f10942;
            int length = iM17293 & (atomicReferenceArray.length() - 1);
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM17293 && key != null && c3353M17297.f10940.f20336.m31910(obj, key)) {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj3 = interfaceC10064Mo7552.get();
                    if (obj3 == null) {
                        if (!interfaceC10064Mo7552.mo2147()) {
                            break;
                        }
                        c3353M17297.f10952++;
                        InterfaceC2213 interfaceC2213M11011 = c3353M17297.m11011(interfaceC2213, next, key, obj3, interfaceC10064Mo7552, EnumC23842.f77216);
                        int i = c3353M17297.f10953 - 1;
                        atomicReferenceArray.set(length, interfaceC2213M11011);
                        c3353M17297.f10953 = i;
                        break;
                    }
                    c3353M17297.f10952++;
                    c3353M17297.m11015(obj, obj3, interfaceC10064Mo7552.mo2148(), EnumC23842.f77212);
                    c3353M17297.m11017(next, obj, obj2, jMo37347);
                    c3353M17297.m11016(next);
                    return obj3;
                }
            }
            return null;
        } finally {
            c3353M17297.unlock();
            c3353M17297.m11022();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj3.getClass();
        if (obj2 == null) {
            return false;
        }
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.lock();
        try {
            long jMo37347 = c3353M17297.f10940.f20353.mo37347();
            c3353M17297.m11025(jMo37347);
            AtomicReferenceArray atomicReferenceArray = c3353M17297.f10942;
            int length = (atomicReferenceArray.length() - 1) & iM17293;
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            InterfaceC2213 next = interfaceC2213;
            while (next != null) {
                Object key = next.getKey();
                if (next.getHash() != iM17293 || key == null || !c3353M17297.f10940.f20336.m31910(obj, key)) {
                    int i = length;
                    next = next.getNext();
                    length = i;
                } else {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj4 = interfaceC10064Mo7552.get();
                    if (obj4 == null) {
                        if (!interfaceC10064Mo7552.mo2147()) {
                            break;
                        }
                        c3353M17297.f10952++;
                        InterfaceC2213 interfaceC2213M11011 = c3353M17297.m11011(interfaceC2213, next, key, obj4, interfaceC10064Mo7552, EnumC23842.f77216);
                        int i2 = c3353M17297.f10953 - 1;
                        atomicReferenceArray.set(length, interfaceC2213M11011);
                        c3353M17297.f10953 = i2;
                        break;
                    }
                    if (c3353M17297.f10940.f20350.m31910(obj2, obj4)) {
                        c3353M17297.f10952++;
                        c3353M17297.m11015(obj, obj4, interfaceC10064Mo7552.mo2148(), EnumC23842.f77212);
                        c3353M17297.m11017(next, obj, obj3, jMo37347);
                        c3353M17297.m11016(next);
                        c3353M17297.unlock();
                        c3353M17297.m11022();
                        return true;
                    }
                    c3353M17297.m11027(next, jMo37347);
                    break;
                }
            }
            c3353M17297.unlock();
            c3353M17297.m11022();
            return false;
        } catch (Throwable th) {
            c3353M17297.unlock();
            c3353M17297.m11022();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m17294(Object obj, AbstractC20836 abstractC20836) {
        InterfaceC2213 interfaceC2213M11009;
        obj.getClass();
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.getClass();
        abstractC20836.getClass();
        try {
            try {
                if (c3353M17297.f10953 != 0 && (interfaceC2213M11009 = c3353M17297.m11009(iM17293, obj)) != null) {
                    long jMo37347 = c3353M17297.f10940.f20353.mo37347();
                    Object objM11006 = c3353M17297.m11006(interfaceC2213M11009, jMo37347);
                    if (objM11006 != null) {
                        c3353M17297.m11020(interfaceC2213M11009, jMo37347);
                        c3353M17297.f10947.mo17230();
                        Object objM11007 = c3353M17297.m11007(interfaceC2213M11009, obj, iM17293, objM11006, jMo37347, abstractC20836);
                        c3353M17297.m11028();
                        return objM11007;
                    }
                    InterfaceC10064 interfaceC10064Mo7552 = interfaceC2213M11009.mo7552();
                    if (interfaceC10064Mo7552.mo2146()) {
                        Object objM11008 = c3353M17297.m11008(interfaceC2213M11009, obj, interfaceC10064Mo7552);
                        c3353M17297.m11028();
                        return objM11008;
                    }
                }
                Object objM11005 = c3353M17297.m11005(obj, iM17293, abstractC20836);
                c3353M17297.m11028();
                return objM11005;
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof Error) {
                    throw new C17720((Error) cause);
                }
                if (cause instanceof RuntimeException) {
                    throw new C8025(cause);
                }
                throw e;
            }
        } catch (Throwable th) {
            c3353M17297.m11028();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m17296(InterfaceC2213 interfaceC2213, long j) {
        interfaceC2213.getClass();
        if (!m17298() || j - interfaceC2213.mo7556() < this.f20342) {
            return m17299() && j - interfaceC2213.mo7550() >= this.f20352;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17293(Object obj) {
        int iM31909 = this.f20336.m31909(obj);
        int i = iM31909 + ((iM31909 << 15) ^ (-12931));
        int i2 = i ^ (i >>> 10);
        int i3 = i2 + (i2 << 3);
        int i4 = i3 ^ (i3 >>> 6);
        int i5 = (i4 << 2) + (i4 << 14) + i4;
        return (i5 >>> 16) ^ i5;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3353 m17297(int i) {
        return this.f20356[(i >>> this.f20346) & this.f20355];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        C3353[] c3353Arr = this.f20356;
        long j = 0;
        for (C3353 c3353 : c3353Arr) {
            if (c3353.f10953 != 0) {
                return false;
            }
            j += (long) c3353.f10952;
        }
        if (j == 0) {
            return true;
        }
        for (C3353 c3354 : c3353Arr) {
            if (c3354.f10953 != 0) {
                return false;
            }
            j -= (long) c3354.f10952;
        }
        return j == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        long jMax = 0;
        for (C3353 c3353 : this.f20356) {
            jMax += (long) Math.max(0, c3353.f10953);
        }
        return C18444.m42974(jMax);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[Catch: all -> 0x006a, TRY_ENTER, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x004f A[Catch: all -> 0x006a, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0063 A[Catch: all -> 0x006a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x006a, blocks: (B:6:0x000f, B:8:0x0013, B:25:0x0045, B:27:0x004f, B:30:0x0063, B:11:0x0022, B:13:0x002a, B:16:0x0033, B:18:0x0038, B:19:0x003b, B:15:0x0030), top: B:38:0x000f, inners: #0 }] */
    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        InterfaceC2213 interfaceC2213;
        Object obj2;
        if (obj == null) {
            return null;
        }
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.getClass();
        try {
            if (c3353M17297.f10953 != 0) {
                long jMo37347 = c3353M17297.f10940.f20353.mo37347();
                InterfaceC2213 interfaceC2213M11009 = c3353M17297.m11009(iM17293, obj);
                if (interfaceC2213M11009 != null) {
                    if (!c3353M17297.f10940.m17296(interfaceC2213M11009, jMo37347)) {
                        interfaceC2213 = interfaceC2213M11009;
                    } else if (c3353M17297.tryLock()) {
                        try {
                            c3353M17297.m11013(jMo37347);
                            c3353M17297.unlock();
                        } catch (Throwable th) {
                            c3353M17297.unlock();
                            throw th;
                        }
                    }
                    if (interfaceC2213 == null) {
                        obj2 = interfaceC2213.mo7552().get();
                        if (obj2 != null) {
                            c3353M17297.m11020(interfaceC2213, jMo37347);
                            Object objM11007 = c3353M17297.m11007(interfaceC2213, interfaceC2213.getKey(), iM17293, obj2, jMo37347, c3353M17297.f10940.f20354);
                            c3353M17297.m11028();
                            return objM11007;
                        }
                        c3353M17297.m11021();
                    } else {
                        c3353M17297.m11028();
                        return null;
                    }
                }
                interfaceC2213 = null;
                if (interfaceC2213 == null) {
                    obj2 = interfaceC2213.mo7552().get();
                    if (obj2 != null) {
                        c3353M17297.m11020(interfaceC2213, jMo37347);
                        Object objM11008 = c3353M17297.m11007(interfaceC2213, interfaceC2213.getKey(), iM17293, obj2, jMo37347, c3353M17297.f10940.f20354);
                        c3353M17297.m11028();
                        return objM11008;
                    }
                    c3353M17297.m11021();
                } else {
                    c3353M17297.m11028();
                    return null;
                }
            }
            c3353M17297.m11028();
            return null;
        } catch (Throwable th2) {
            c3353M17297.m11028();
            throw th2;
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC3079, l.InterfaceC16613
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
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.getClass();
        try {
            if (c3353M17297.f10953 == 0) {
                c3353M17297.m11028();
                return false;
            }
            long jMo37347 = c3353M17297.f10940.f20353.mo37347();
            InterfaceC2213 interfaceC2213M11009 = c3353M17297.m11009(iM17293, obj);
            if (interfaceC2213M11009 != null) {
                if (c3353M17297.f10940.m17296(interfaceC2213M11009, jMo37347)) {
                    if (c3353M17297.tryLock()) {
                        try {
                            c3353M17297.m11013(jMo37347);
                            c3353M17297.unlock();
                        } catch (Throwable th) {
                            c3353M17297.unlock();
                            throw th;
                        }
                    }
                }
                if (interfaceC2213M11009 == null) {
                    boolean z = interfaceC2213M11009.mo7552().get() != null;
                    c3353M17297.m11028();
                    return z;
                }
                c3353M17297.m11028();
                return false;
            }
            interfaceC2213M11009 = null;
            if (interfaceC2213M11009 == null) {
                if (interfaceC2213M11009.mo7552().get() != null) {
                }
                c3353M17297.m11028();
                return z;
            }
            c3353M17297.m11028();
            return false;
        } catch (Throwable th2) {
            c3353M17297.m11028();
            throw th2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        long jMo37347 = this.f20353.mo37347();
        C3353[] c3353Arr = this.f20356;
        long j = -1;
        int i = 0;
        while (i < 3) {
            int length = c3353Arr.length;
            long j2 = 0;
            int i2 = 0;
            while (i2 < length) {
                C3353 c3353 = c3353Arr[i2];
                int i3 = c3353.f10953;
                AtomicReferenceArray atomicReferenceArray = c3353.f10942;
                for (int i4 = 0; i4 < atomicReferenceArray.length(); i4++) {
                    InterfaceC2213 next = (InterfaceC2213) atomicReferenceArray.get(i4);
                    while (next != null) {
                        C3353[] c3353Arr2 = c3353Arr;
                        Object objM11006 = c3353.m11006(next, jMo37347);
                        long j3 = jMo37347;
                        if (objM11006 != null && this.f20350.m31910(obj, objM11006)) {
                            return true;
                        }
                        next = next.getNext();
                        c3353Arr = c3353Arr2;
                        jMo37347 = j3;
                    }
                }
                j2 += (long) c3353.f10952;
                i2++;
                jMo37347 = jMo37347;
            }
            long j4 = jMo37347;
            C3353[] c3353Arr3 = c3353Arr;
            if (j2 == j) {
                return false;
            }
            i++;
            j = j2;
            c3353Arr = c3353Arr3;
            jMo37347 = j4;
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
        EnumC23842 enumC23842;
        if (obj == null) {
            return null;
        }
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.lock();
        try {
            c3353M17297.m11025(c3353M17297.f10940.f20353.mo37347());
            AtomicReferenceArray atomicReferenceArray = c3353M17297.f10942;
            int length = iM17293 & (atomicReferenceArray.length() - 1);
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM17293 && key != null && c3353M17297.f10940.f20336.m31910(obj, key)) {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj2 = interfaceC10064Mo7552.get();
                    if (obj2 != null) {
                        enumC23842 = EnumC23842.f77211;
                    } else {
                        if (!interfaceC10064Mo7552.mo2147()) {
                            break;
                        }
                        enumC23842 = EnumC23842.f77216;
                    }
                    EnumC23842 enumC23843 = enumC23842;
                    c3353M17297.f10952++;
                    InterfaceC2213 interfaceC2213M11011 = c3353M17297.m11011(interfaceC2213, next, key, obj2, interfaceC10064Mo7552, enumC23843);
                    int i = c3353M17297.f10953 - 1;
                    atomicReferenceArray.set(length, interfaceC2213M11011);
                    c3353M17297.f10953 = i;
                    return obj2;
                }
            }
            return null;
        } finally {
            c3353M17297.unlock();
            c3353M17297.m11022();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, l.InterfaceC16613
    public final boolean remove(Object obj, Object obj2) {
        EnumC23842 enumC23842;
        boolean z = false;
        if (obj == null || obj2 == null) {
            return false;
        }
        int iM17293 = m17293(obj);
        C3353 c3353M17297 = m17297(iM17293);
        c3353M17297.lock();
        try {
            c3353M17297.m11025(c3353M17297.f10940.f20353.mo37347());
            AtomicReferenceArray atomicReferenceArray = c3353M17297.f10942;
            int length = iM17293 & (atomicReferenceArray.length() - 1);
            InterfaceC2213 interfaceC2213 = (InterfaceC2213) atomicReferenceArray.get(length);
            for (InterfaceC2213 next = interfaceC2213; next != null; next = next.getNext()) {
                Object key = next.getKey();
                if (next.getHash() == iM17293 && key != null && c3353M17297.f10940.f20336.m31910(obj, key)) {
                    InterfaceC10064 interfaceC10064Mo7552 = next.mo7552();
                    Object obj3 = interfaceC10064Mo7552.get();
                    if (c3353M17297.f10940.f20350.m31910(obj2, obj3)) {
                        enumC23842 = EnumC23842.f77211;
                    } else {
                        if (obj3 != null || !interfaceC10064Mo7552.mo2147()) {
                            break;
                            break;
                        }
                        enumC23842 = EnumC23842.f77216;
                    }
                    c3353M17297.f10952++;
                    InterfaceC2213 interfaceC2213M11011 = c3353M17297.m11011(interfaceC2213, next, key, obj3, interfaceC10064Mo7552, enumC23842);
                    int i = c3353M17297.f10953 - 1;
                    atomicReferenceArray.set(length, interfaceC2213M11011);
                    c3353M17297.f10953 = i;
                    if (enumC23842 != EnumC23842.f77211) {
                        break;
                    }
                    z = true;
                    break;
                }
            }
            return z;
        } finally {
            c3353M17297.unlock();
            c3353M17297.m11022();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        for (C3353 c3353 : this.f20356) {
            if (c3353.f10953 != 0) {
                c3353.lock();
                try {
                    c3353.m11025(c3353.f10940.f20353.mo37347());
                    AtomicReferenceArray atomicReferenceArray = c3353.f10942;
                    for (int i = 0; i < atomicReferenceArray.length(); i++) {
                        for (InterfaceC2213 next = (InterfaceC2213) atomicReferenceArray.get(i); next != null; next = next.getNext()) {
                            if (next.mo7552().mo2147()) {
                                Object key = next.getKey();
                                Object obj = next.mo7552().get();
                                EnumC23842 enumC23842 = (key == null || obj == null) ? EnumC23842.f77216 : EnumC23842.f77211;
                                next.getHash();
                                c3353.m11015(key, obj, next.mo7552().mo2148(), enumC23842);
                            }
                        }
                    }
                    for (int i2 = 0; i2 < atomicReferenceArray.length(); i2++) {
                        atomicReferenceArray.set(i2, null);
                    }
                    ConcurrentMapC5942 concurrentMapC5942 = c3353.f10940;
                    if (concurrentMapC5942.f20338 != EnumC4099.f13963) {
                        while (c3353.f10951.poll() != null) {
                        }
                    }
                    if (concurrentMapC5942.f20347 != EnumC4099.f13963) {
                        while (c3353.f10949.poll() != null) {
                        }
                    }
                    c3353.f10943.clear();
                    c3353.f10950.clear();
                    c3353.f10948.set(0);
                    c3353.f10952++;
                    c3353.f10953 = 0;
                    c3353.unlock();
                    c3353.m11022();
                } catch (Throwable th) {
                    c3353.unlock();
                    c3353.m11022();
                    throw th;
                }
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.f20344;
        if (set != null) {
            return set;
        }
        C15285 c15285 = new C15285(this);
        this.f20344 = c15285;
        return c15285;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f20340;
        if (collection != null) {
            return collection;
        }
        C1116 c1116 = new C1116(this);
        this.f20340 = c1116;
        return c1116;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f20335;
        if (set != null) {
            return set;
        }
        C10810 c10810 = new C10810(this);
        this.f20335 = c10810;
        return c10810;
    }
}
