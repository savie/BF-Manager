package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9193 extends AbstractC9939 implements InterfaceC11868, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

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

    @Override // l.InterfaceC23057, l.InterfaceC11868
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo13467(int i);

    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C11122.m28072(this, (Integer) obj, obj2);
    }

    public InterfaceC7767 entrySet() {
        return mo13468();
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C11122.m28075(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C11122.m28074(this, obj);
    }

    @Override // l.AbstractC9939, l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        return C11122.m28073(this, obj);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return C1698.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC11868) {
            InterfaceC15224 interfaceC15224M41687 = C17835.m41687((InterfaceC11868) map);
            while (interfaceC15224M41687.hasNext()) {
                InterfaceC5903 interfaceC5903 = (InterfaceC5903) interfaceC15224M41687.next();
                mo13466(interfaceC5903.mo3870(), interfaceC5903.getValue());
            }
            return;
        }
        int size = map.size();
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            C11122.m28072(this, (Integer) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC15224 interfaceC15224M41687 = C17835.m41687(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC5903) interfaceC15224M41687.next()).hashCode();
            size = i;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (map.size() != size()) {
            return false;
        }
        return mo13468().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15224 interfaceC15224M41687 = C17835.m41687(this);
        int size = size();
        boolean z = true;
        while (true) {
            int i = size - 1;
            if (size != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC5903 interfaceC5903 = (InterfaceC5903) interfaceC15224M41687.next();
                sb.append(String.valueOf(interfaceC5903.mo3870()));
                sb.append("=>");
                if (this == interfaceC5903.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC5903.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
