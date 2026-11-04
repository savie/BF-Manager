package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۘ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 246 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22554 extends C8973 implements InterfaceC10619, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C8973, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // l.C8973
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C1698.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C1698.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C1698.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C1698.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C9718.m25304(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C1698.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Float) C1698.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // l.InterfaceC10619
    /* JADX INFO: renamed from: ۖ */
    public final InterfaceC7767 mo27095() {
        return C1055.f3784;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C24901.f80578;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C16652.f53800;
    }

    @Override // java.util.Map, l.InterfaceC16613
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
        return mo27095();
    }

    @Override // l.C8973
    public final Object clone() {
        return C15094.f49281;
    }

    @Override // l.AbstractC18144, l.InterfaceC3007, l.InterfaceC21433, java.util.Map
    public final Float get(Object obj) {
        return C9718.m25305(this, obj);
    }

    @Override // l.AbstractC18144, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C9718.m25305(this, obj);
    }

    @Override // l.C8973, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC18144, l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C9718.m25306(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean remove(Object obj, Object obj2) {
        return C1698.$default$remove(this, obj, obj2);
    }
}
