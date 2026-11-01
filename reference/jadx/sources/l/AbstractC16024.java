package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5T */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC16024 extends AbstractC20962 implements InterfaceC19739, InterfaceC4464 {
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

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        C7038 c7038 = (C7038) this;
        boolean zMo18877 = c7038.mo18877(jLongValue);
        Object objMo18876 = c7038.mo18876(jLongValue, obj2);
        if (zMo18877) {
            return objMo18876;
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C7038) this).mo18878();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        C7038 c7038 = (C7038) this;
        if (c7038.mo18877(jLongValue)) {
            return c7038.m18879(jLongValue);
        }
        return null;
    }

    @Override // l.AbstractC20962, l.InterfaceC6456
    public final Object get(Object obj) {
        return C23267.m51349(this, obj);
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C7038) this).mo18877(((Long) obj).longValue());
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return C1972.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC19739) {
            InterfaceC6269 interfaceC6269M26725 = C10567.m26725((InterfaceC19739) map);
            while (interfaceC6269M26725.hasNext()) {
                InterfaceC19033 interfaceC19033 = (InterfaceC19033) interfaceC6269M26725.next();
                mo18876(interfaceC19033.mo43767(), interfaceC19033.getValue());
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
            Long l2 = (Long) entry.getKey();
            Object value = entry.getValue();
            long jLongValue = l2.longValue();
            C7038 c7038 = (C7038) this;
            c7038.mo18877(jLongValue);
            c7038.mo18876(jLongValue, value);
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C7038) this).f23647;
        InterfaceC6269 interfaceC6269M26725 = C10567.m26725(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC19033) interfaceC6269M26725.next()).hashCode();
            i = i2;
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
        C7038 c7038 = (C7038) this;
        if (map.size() != c7038.f23647) {
            return false;
        }
        return ((AbstractCollection) c7038.mo18878()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M26725 = C10567.m26725(this);
        int i = ((C7038) this).f23647;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC19033 interfaceC19033 = (InterfaceC19033) interfaceC6269M26725.next();
                sb.append(String.valueOf(interfaceC19033.mo43767()));
                sb.append("=>");
                if (this == interfaceC19033.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC19033.getValue()));
                }
                i = i2;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
