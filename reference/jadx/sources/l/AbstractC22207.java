package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1DS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22207 extends AbstractC2450 implements InterfaceC9321, InterfaceC4464 {
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

    @Override // l.InterfaceC17081
    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo15965(char c);

    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C12143.m30216(this, (Character) obj, obj2);
    }

    public InterfaceC18660 entrySet() {
        return mo8794();
    }

    @Override // l.AbstractC2450, l.InterfaceC6456
    public final Object get(Object obj) {
        return C12143.m30217(this, obj);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C12143.m30218(this, obj);
    }

    @Override // l.AbstractC2450, l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo15965(((Character) obj).charValue());
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
        if (map instanceof InterfaceC9321) {
            InterfaceC6269 interfaceC6269M33219 = C13597.m33219((InterfaceC9321) map);
            while (interfaceC6269M33219.hasNext()) {
                InterfaceC14260 interfaceC14260 = (InterfaceC14260) interfaceC6269M33219.next();
                mo7435(interfaceC14260.mo14566(), interfaceC14260.getValue());
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
            C12143.m30216(this, (Character) entry.getKey(), entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC6269 interfaceC6269M33219 = C13597.m33219(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC14260) interfaceC6269M33219.next()).hashCode();
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
        return mo8794().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M33219 = C13597.m33219(this);
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
                InterfaceC14260 interfaceC14260 = (InterfaceC14260) interfaceC6269M33219.next();
                sb.append(String.valueOf(interfaceC14260.mo14566()));
                sb.append("=>");
                if (this == interfaceC14260.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC14260.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
