package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۫֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YC5H */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12769 extends AbstractC15006 implements InterfaceC19526, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C21764.m49329(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1698.$default$computeIfAbsent(this, obj, function);
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C21764.m49333(this, obj, biFunction);
    }

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C21764.m49328(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo12503();
    }

    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return (obj3 != null || containsKey(obj)) ? obj3 : obj2;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null || containsKey(obj)) {
            return obj3;
        }
        put(obj, obj2);
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (!C17359.equals(obj3, obj2)) {
            return false;
        }
        if (obj3 == null && !containsKey(obj)) {
            return false;
        }
        remove(obj);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        Object obj4 = get(obj);
        if (!C17359.equals(obj4, obj2)) {
            return false;
        }
        if (obj4 == null && !containsKey(obj)) {
            return false;
        }
        put(obj, obj3);
        return true;
    }

    public Object replace(Object obj, Object obj2) {
        if (containsKey(obj)) {
            return put(obj, obj2);
        }
        return null;
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC19526) {
            InterfaceC15224 interfaceC15224M31774 = C12813.m31774((InterfaceC19526) map);
            while (interfaceC15224M31774.hasNext()) {
                InterfaceC10575 interfaceC10575 = (InterfaceC10575) interfaceC15224M31774.next();
                put(interfaceC10575.getKey(), interfaceC10575.getValue());
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
            put(entry.getKey(), entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC15224 interfaceC15224M31774 = C12813.m31774(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC10575) interfaceC15224M31774.next()).hashCode();
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
        return mo12503().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15224 interfaceC15224M31774 = C12813.m31774(this);
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
                InterfaceC10575 interfaceC10575 = (InterfaceC10575) interfaceC15224M31774.next();
                if (this == interfaceC10575.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC10575.getKey()));
                }
                sb.append("=>");
                if (this == interfaceC10575.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC10575.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
