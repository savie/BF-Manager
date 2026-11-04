package l;

import com.alipay.sdk.m.y.l;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩴ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J1LL */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19482 extends AbstractC22466 implements InterfaceC19722, InterfaceC16613 {
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
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ int mo13100(String str, C7924 c7924) {
        return C21960.m49688(this, str, c7924);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C1698.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C1698.$default$merge(this, obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C21960.m49689(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C1698.$default$putIfAbsent(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C1698.$default$replace(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return mo7847();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (containsKey(obj)) {
            return Integer.valueOf(mo7846(obj));
        }
        return null;
    }

    @Override // l.AbstractC22466, l.InterfaceC21433, java.util.Map
    public final Integer get(Object obj) {
        return C8295.m22386(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo7849(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo13099(int i, String str) {
        int iMo7848 = mo7848(str);
        return (iMo7848 != 0 || containsKey(str)) ? iMo7848 : i;
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC19722) {
            InterfaceC15224 interfaceC15224M32419 = C13009.m32419((InterfaceC19722) map);
            while (interfaceC15224M32419.hasNext()) {
                InterfaceC10771 interfaceC10771 = (InterfaceC10771) interfaceC15224M32419.next();
                mo7845(interfaceC10771.mo27440(), interfaceC10771.getKey());
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
            C21960.m49689(this, entry.getKey(), (Integer) entry.getValue());
            size = i;
        }
    }

    public int hashCode() {
        int size = size();
        InterfaceC15224 interfaceC15224M32419 = C13009.m32419(this);
        int iHashCode = 0;
        while (true) {
            int i = size - 1;
            if (size == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC10771) interfaceC15224M32419.next()).hashCode();
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
        return mo7847().containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15224 interfaceC15224M32419 = C13009.m32419(this);
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
                InterfaceC10771 interfaceC10771 = (InterfaceC10771) interfaceC15224M32419.next();
                if (this == interfaceC10771.getKey()) {
                    sb.append("(this map)");
                } else {
                    sb.append(String.valueOf(interfaceC10771.getKey()));
                }
                sb.append("=>");
                sb.append(String.valueOf(interfaceC10771.mo27440()));
                size = i;
            } else {
                sb.append(l.d);
                return sb.toString();
            }
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean remove(Object obj, Object obj2) {
        return C1698.$default$remove(this, obj, obj2);
    }
}
