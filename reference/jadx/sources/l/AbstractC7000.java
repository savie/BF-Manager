package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۟᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: T5T */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7000 extends AbstractC8491 implements InterfaceC10310, InterfaceC16613 {
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

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        long jLongValue = ((Long) obj).longValue();
        C4345 c4345 = (C4345) this;
        boolean zMo13847 = c4345.mo13847(jLongValue);
        Object objMo13846 = c4345.mo13846(jLongValue, obj2);
        if (zMo13847) {
            return objMo13846;
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C4345) this).mo5009();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        long jLongValue = ((Long) obj).longValue();
        C4345 c4345 = (C4345) this;
        if (c4345.mo13847(jLongValue)) {
            return c4345.m13848(jLongValue);
        }
        return null;
    }

    @Override // l.AbstractC8491, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C14785.m35629(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C4345) this).mo13847(((Long) obj).longValue());
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
    public final void putAll(Map map) {
        if (map instanceof InterfaceC10310) {
            InterfaceC15224 interfaceC15224M24986 = C9564.m24986((InterfaceC10310) map);
            while (interfaceC15224M24986.hasNext()) {
                InterfaceC8074 interfaceC8074 = (InterfaceC8074) interfaceC15224M24986.next();
                mo13846(interfaceC8074.mo21967(), interfaceC8074.getValue());
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
            C4345 c4345 = (C4345) this;
            c4345.mo13847(jLongValue);
            c4345.mo13846(jLongValue, value);
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C4345) this).f15714;
        InterfaceC15224 interfaceC15224M24986 = C9564.m24986(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC8074) interfaceC15224M24986.next()).hashCode();
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
        C4345 c4345 = (C4345) this;
        if (map.size() != c4345.f15714) {
            return false;
        }
        return ((AbstractCollection) c4345.mo5009()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15224 interfaceC15224M24986 = C9564.m24986(this);
        int i = ((C4345) this).f15714;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC8074 interfaceC8074 = (InterfaceC8074) interfaceC15224M24986.next();
                sb.append(String.valueOf(interfaceC8074.mo21967()));
                sb.append("=>");
                if (this == interfaceC8074.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC8074.getValue()));
                }
                i = i2;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
