package l;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ᩷۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 067E */
/* JADX INFO: loaded from: classes4.dex */
public final class C15477 implements Map, Serializable, InterfaceC4464 {
    public static final long serialVersionUID = 8246714829545688274L;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final C15477 f50426 = new C15477();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

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

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return C1972.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C1972.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return C1972.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return C21826.f70878;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return C21826.f70878;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return C23238.f75405;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    private final Object readResolve() {
        return f50426;
    }
}
