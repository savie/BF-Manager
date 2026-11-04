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

/* JADX INFO: renamed from: l.ܽ۫ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 866M */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17589 implements Map, Serializable, InterfaceC16613 {
    public static final long serialVersionUID = 912559;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Map.Entry[] f57114 = new Map.Entry[0];

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C1698.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1698.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C1698.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public abstract AbstractC8639 entrySet();

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public abstract AbstractC8639 keySet();

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C1698.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C1698.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return C1698.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return C1698.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, obj, obj2, obj3);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public abstract AbstractC4911 values();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo33237();

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static AbstractC17589 m41248() {
        return C15307.m36761(5, new Object[]{"amp", a.p, "apos", "'", "gt", ">", "lt", "<", "quot", "\""}, null);
    }

    public static AbstractC17589 of() {
        return C15307.f50041;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C25049 m41247() {
        return new C25049(4);
    }

    public static AbstractC17589 copyOf(Map map) {
        if ((map instanceof AbstractC17589) && !(map instanceof SortedMap)) {
            AbstractC17589 abstractC17589 = (AbstractC17589) map;
            if (!abstractC17589.mo33237()) {
                return abstractC17589;
            }
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        C25049 c25049 = new C25049(setEntrySet != null ? setEntrySet.size() : 4);
        if (C1402.m5130(setEntrySet)) {
            int size = (setEntrySet.size() + c25049.f81024) * 2;
            Object[] objArr = c25049.f81023;
            if (size > objArr.length) {
                c25049.f81023 = Arrays.copyOf(objArr, AbstractC13924.m33910(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c25049.mo14569(entry.getKey(), entry.getValue());
        }
        return c25049.mo14570();
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

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return C15769.m37710(this, obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C12324.m30737(entrySet());
    }

    public final String toString() {
        return C15769.m37709(this);
    }

    public Object writeReplace() {
        return new C16843(this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }
}
