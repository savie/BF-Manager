package l;

import com.alipay.sdk.m.w.a;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜܿܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6910 implements Map, Serializable, InterfaceC4464 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final Map.Entry[] f23242 = new Map.Entry[0];

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public transient AbstractC1826 f23243;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public transient AbstractC23844 f23244;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public transient AbstractC23844 f23245;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C1972.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1972.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C1972.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C1972.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C1972.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C1972.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C1972.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC23844 mo7130();

    /* JADX INFO: renamed from: ۚ */
    public abstract boolean mo7131();

    /* JADX INFO: renamed from: ۨ */
    public abstract AbstractC1826 mo7132();

    /* JADX INFO: renamed from: ܰ */
    public abstract AbstractC23844 mo7133();

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static AbstractC6910 m18531() {
        return C13449.m32935(5, new Object[]{"amp", a.p, "apos", "'", "gt", ">", "lt", "<", "quot", "\""}, null);
    }

    public static AbstractC6910 of() {
        return C13449.f44496;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static C13261 m18530() {
        return new C13261(4);
    }

    public static AbstractC6910 copyOf(Map map) {
        if ((map instanceof AbstractC6910) && !(map instanceof SortedMap)) {
            AbstractC6910 abstractC6910 = (AbstractC6910) map;
            if (!abstractC6910.mo7131()) {
                return abstractC6910;
            }
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C13261 c13261 = new C13261(setEntrySet != null ? setEntrySet.size() : 4);
        if (C6009.m16315(setEntrySet)) {
            int size = (setEntrySet.size() + c13261.f44036) * 2;
            Object[] objArr = c13261.f44035;
            if (size > objArr.length) {
                c13261.f44035 = Arrays.copyOf(objArr, AbstractC14528.m34968(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c13261.mo32741(entry.getKey(), entry.getValue());
        }
        return c13261.mo32742();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, java.util.SortedMap
    public AbstractC23844 entrySet() {
        AbstractC23844 abstractC23844 = this.f23244;
        if (abstractC23844 != null) {
            return abstractC23844;
        }
        AbstractC23844 abstractC23844Mo7130 = mo7130();
        this.f23244 = abstractC23844Mo7130;
        return abstractC23844Mo7130;
    }

    @Override // java.util.Map, java.util.SortedMap
    public AbstractC23844 keySet() {
        AbstractC23844 abstractC23844 = this.f23245;
        if (abstractC23844 != null) {
            return abstractC23844;
        }
        AbstractC23844 abstractC23844Mo7133 = mo7133();
        this.f23245 = abstractC23844Mo7133;
        return abstractC23844Mo7133;
    }

    @Override // java.util.Map, java.util.SortedMap
    public AbstractC1826 values() {
        AbstractC1826 abstractC1826 = this.f23243;
        if (abstractC1826 != null) {
            return abstractC1826;
        }
        AbstractC1826 abstractC1826Mo7132 = mo7132();
        this.f23243 = abstractC1826Mo7132;
        return abstractC1826Mo7132;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C8136.m21448(this, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C21209.m47668(entrySet());
    }

    public final String toString() {
        return C8136.m21447(this);
    }

    public Object writeReplace() {
        return new C4087(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
