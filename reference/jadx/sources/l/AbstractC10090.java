package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4N1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10090 extends AbstractC19262 implements InterfaceC9612, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

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

    @Override // l.InterfaceC17372, l.InterfaceC9612
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo8945(int i);

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C12434.m30905(this, (Integer) obj, obj2);
    }

    @Override // l.InterfaceC9612, java.util.Map
    public InterfaceC18660 entrySet() {
        return mo8949();
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

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return C1972.$default$getOrDefault(this, obj, obj2);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC9612) {
            InterfaceC6269 interfaceC6269M33181 = C13576.m33181((InterfaceC9612) map);
            while (interfaceC6269M33181.hasNext()) {
                InterfaceC14551 interfaceC14551 = (InterfaceC14551) interfaceC6269M33181.next();
                mo8944(interfaceC14551.mo17726(), interfaceC14551.getValue());
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
            C12434.m30905(this, (Integer) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC6269 interfaceC6269M33181 = C13576.m33181(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC14551) interfaceC6269M33181.next()).hashCode();
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
        return mo8949().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M33181 = C13576.m33181(this);
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
                InterfaceC14551 interfaceC14551 = (InterfaceC14551) interfaceC6269M33181.next();
                sb.append(String.valueOf(interfaceC14551.mo17726()));
                sb.append("=>");
                if (this == interfaceC14551.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC14551.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
