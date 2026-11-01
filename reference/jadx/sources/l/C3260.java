package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ۬ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1Z */
/* JADX INFO: loaded from: classes3.dex */
public final class C3260 extends C6083 implements InterfaceC9612, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

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
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // l.C6083, java.util.Map
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

    @Override // l.C6083
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C12434.m30905(this, (Integer) obj, obj2);
    }

    @Override // java.util.Map
    public final Collection values() {
        return C8783.f30203;
    }

    @Override // l.InterfaceC9612, l.InterfaceC4485
    /* JADX INFO: renamed from: ۬ */
    public final InterfaceC18660 mo8949() {
        return C8783.f30203;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C3551.f13068;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C6083
    public final Object clone() {
        return C13576.f44769;
    }

    @Override // java.util.Map
    public final InterfaceC18660 entrySet() {
        return mo8949();
    }

    @Override // l.C6083, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final Object get(Object obj) {
        return C12434.m30908(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C12434.m30907(this, obj);
    }

    @Override // l.AbstractC19262, l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        return C12434.m30906(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }
}
