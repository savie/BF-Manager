package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۛᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6227 extends AbstractC17516 implements InterfaceC6248, InterfaceC4464 {
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
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // l.InterfaceC6248
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public /* synthetic */ int mo17279(String str, C22112 c22112) {
        return C16832.m39480(this, str, c22112);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C1972.$default$getOrDefault(this, obj, (Integer) obj2);
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
    public final Set entrySet() {
        return mo17317();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return Integer.valueOf(mo18020(obj));
        }
        return null;
    }

    @Override // l.AbstractC17516, l.InterfaceC6456
    public final Integer get(Object obj) {
        return C21065.m47474(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo17316(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo17278(int i, String str) {
        int iMo18022 = mo18022(str);
        return (iMo18022 != 0 || containsKey(str)) ? iMo18022 : i;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC6248) {
            InterfaceC6269 interfaceC6269M52649 = C23888.m52649((InterfaceC6248) map);
            while (interfaceC6269M52649.hasNext()) {
                InterfaceC12599 interfaceC12599 = (InterfaceC12599) interfaceC6269M52649.next();
                mo18019(interfaceC12599.mo7336(), interfaceC12599.getKey());
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
            C16832.m39481(this, entry.getKey(), (Integer) entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public int hashCode() {
        int size = size();
        InterfaceC6269 interfaceC6269M52649 = C23888.m52649(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC12599) interfaceC6269M52649.next()).hashCode();
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
        return mo17317().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M52649 = C23888.m52649(this);
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
                InterfaceC12599 interfaceC12599 = (InterfaceC12599) interfaceC6269M52649.next();
                if (this == interfaceC12599.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC12599.getKey()));
                }
                sb.append("=>");
                sb.append(String.valueOf(interfaceC12599.mo7336()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean remove(Object obj, Object obj2) {
        return C1972.$default$remove(this, obj, obj2);
    }
}
