package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PC84 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12460 extends C16935 implements InterfaceC20665, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C16935, java.util.Map
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

    @Override // l.C16935
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C1698.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C1698.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C1698.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C1698.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C16189.m38419(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C1698.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Character) C1698.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // l.InterfaceC20665
    /* JADX INFO: renamed from: ۖۙ */
    public final InterfaceC7767 mo6942() {
        return C1055.f3784;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C25273.f81633;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C25273.f81633;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo6942();
    }

    @Override // l.C16935
    public final Object clone() {
        return C6495.f21813;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // l.C16935, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC16233, l.InterfaceC25141, l.InterfaceC21433, java.util.Map
    public final Character get(Object obj) {
        return C11714.m29432(this, obj);
    }

    @Override // l.AbstractC16233, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C11714.m29432(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return false;
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
