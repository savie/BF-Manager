package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: QIY */
/* JADX INFO: loaded from: classes5.dex */
public final class C15050 extends C13754 implements InterfaceC19526, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map, l.InterfaceC16613
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C21764.m49329(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1698.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C21764.m49333(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // l.C13754, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C21764.m49328(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return null;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // l.C13754
    public final String toString() {
        return "{}";
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C1055.f3784;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C1055.f3784;
    }

    @Override // l.InterfaceC19526
    /* JADX INFO: renamed from: ۧ᩷ */
    public final InterfaceC7767 mo12503() {
        return C1055.f3784;
    }

    @Override // l.InterfaceC19526, java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C13754
    public final Object clone() {
        return C12813.f41048;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo12503();
    }

    @Override // l.C13754, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        put(obj, obj2);
        throw null;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean remove(Object obj, Object obj2) {
        C17359.equals(null, obj2);
        return false;
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        C17359.equals(null, obj2);
        return false;
    }
}
