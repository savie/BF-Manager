package l;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1CD2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11188 extends C20360 implements InterfaceC6248, InterfaceC4464 {
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
    @Deprecated
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override // l.C20360, java.util.Map
    public final int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        return null;
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // l.C20360
    public final String toString() {
        return "{}";
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۖ */
    public final boolean mo17316(int i) {
        return false;
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ int mo17279(String str, C22112 c22112) {
        return C16832.m39480(this, str, c22112);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C1972.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C16832.m39481(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C1972.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C1972.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return C8783.f30203;
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۙۙ */
    public final InterfaceC18660 mo17317() {
        return C8783.f30203;
    }

    @Override // java.util.Map
    public final Collection values() {
        return C3551.f13068;
    }

    @Override // java.util.Map, l.InterfaceC4464
    @Deprecated
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) obj2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo17317();
    }

    @Override // l.C20360
    public final Object clone() {
        return C23888.f77390;
    }

    @Override // l.C20360, java.util.Map
    public final boolean equals(Object obj) {
        if (obj instanceof Map) {
            return ((Map) obj).isEmpty();
        }
        return false;
    }

    @Override // l.AbstractC17516, l.InterfaceC6456
    public final Integer get(Object obj) {
        return C21065.m47474(this, obj);
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
