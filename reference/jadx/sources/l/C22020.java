package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۗᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PC84 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22020 extends C3156 implements InterfaceC5086, InterfaceC4464 {
    public static final long serialVersionUID = -7046029254386353129L;

    @Override // java.util.Map
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C3156, java.util.Map
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

    @Override // l.C3156
    public final String toString() {
        return "{}";
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C1972.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C1972.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C1972.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C1972.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C13554.m33142(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C1972.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Character) C1972.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // l.InterfaceC5086
    /* JADX INFO: renamed from: ܳۙ */
    public final InterfaceC18660 mo14178() {
        return C8783.f30203;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C3281.f12166;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C3281.f12166;
    }

    @Override // java.util.Map, l.InterfaceC4464
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
        return mo14178();
    }

    @Override // l.C3156
    public final Object clone() {
        return C0852.f3501;
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        return null;
    }

    @Override // l.C3156, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC13741, l.InterfaceC9508, l.InterfaceC6456
    public final Character get(Object obj) {
        return C1745.m5787(this, obj);
    }

    @Override // l.AbstractC13741, l.InterfaceC6456
    public final Object get(Object obj) {
        return C1745.m5787(this, obj);
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

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        return C1972.$default$remove(this, obj, obj2);
    }
}
