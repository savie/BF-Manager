package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻᩹᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: XSY */
/* JADX INFO: loaded from: classes2.dex */
public final class C25361 extends C20139 implements InterfaceC11934, InterfaceC16613 {
    public static final long serialVersionUID = -7046029254386353129L;

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
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // java.util.Map, l.InterfaceC16613
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return obj2;
    }

    @Override // l.C20139, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

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

    @Override // l.C20139
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C11188.m28189(this, (Character) obj, obj2);
    }

    @Override // java.util.Map
    public final Collection values() {
        return C1055.f3784;
    }

    @Override // l.InterfaceC11934, l.InterfaceC10442
    /* JADX INFO: renamed from: ܳ */
    public final InterfaceC7767 mo19859() {
        return C1055.f3784;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C25273.f81633;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // l.C20139
    public final Object clone() {
        return C17901.f58640;
    }

    @Override // java.util.Map
    public final InterfaceC7767 entrySet() {
        return mo19859();
    }

    @Override // l.C20139, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC3555, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C11188.m28190(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C11188.m28191(this, obj);
    }

    @Override // l.AbstractC3555, l.InterfaceC21433, java.util.Map
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
}
