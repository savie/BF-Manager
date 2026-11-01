package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WCA8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9156 extends C21855 implements InterfaceC19739, InterfaceC4464 {
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

    @Override // l.C21855, java.util.Map
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

    @Override // l.C21855
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        mo18876(((Long) obj).longValue(), obj2);
        throw null;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C8783.f30203;
    }

    @Override // l.InterfaceC19739
    /* JADX INFO: renamed from: ۠ */
    public final InterfaceC18660 mo18878() {
        return C8783.f30203;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C19634.f63036;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C21855
    public final Object clone() {
        return C10567.f36170;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo18878();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // l.C21855, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC20962, l.InterfaceC6456
    public final Object get(Object obj) {
        return C23267.m51349(this, obj);
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }
}
