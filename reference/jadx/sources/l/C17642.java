package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17642 extends C21170 implements InterfaceC12704, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C21170, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // l.C21170
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C1972.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C1972.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C1972.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C1972.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C10588.m26762(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C1972.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Float) C1972.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // l.InterfaceC12704
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC18660 mo10715() {
        return C8783.f30203;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C3551.f13068;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C4444.f15833;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo10715();
    }

    @Override // l.C21170
    public final Object clone() {
        return C11293.f38131;
    }

    @Override // l.AbstractC21378, l.InterfaceC7765, l.InterfaceC6456
    public final Float get(Object obj) {
        return C10588.m26763(this, obj);
    }

    @Override // l.AbstractC21378, l.InterfaceC6456
    public final Object get(Object obj) {
        return C10588.m26763(this, obj);
    }

    @Override // l.C21170, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC21378, l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C10588.m26764(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        return C1972.$default$remove(this, obj, obj2);
    }
}
