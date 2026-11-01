package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: YC5H */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23867 extends AbstractC11167 implements InterfaceC5939, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return C16523.m38889(this, obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return C1972.$default$computeIfAbsent(this, obj, function);
    }

    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return C16523.m38893(this, obj, biFunction);
    }

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return C16523.m38888(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo16212();
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
        if (!C13638.equals(obj3, obj2)) {
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
        if (!C13638.equals(obj4, obj2)) {
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
        if (map instanceof InterfaceC5939) {
            InterfaceC6269 interfaceC6269M52006 = C23579.m52006((InterfaceC5939) map);
            while (interfaceC6269M52006.hasNext()) {
                InterfaceC12290 interfaceC12290 = (InterfaceC12290) interfaceC6269M52006.next();
                put(interfaceC12290.getKey(), interfaceC12290.getValue());
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
        InterfaceC6269 interfaceC6269M52006 = C23579.m52006(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC12290) interfaceC6269M52006.next()).hashCode();
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
        return mo16212().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M52006 = C23579.m52006(this);
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
                InterfaceC12290 interfaceC12290 = (InterfaceC12290) interfaceC6269M52006.next();
                if (this == interfaceC12290.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC12290.getKey()));
                }
                sb.append("=>");
                if (this == interfaceC12290.getValue()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC12290.getValue()));
                }
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }
}
