package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1L7 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7973 extends AbstractC18556 implements InterfaceC18432, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Integer) C1972.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Integer) C1972.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Integer) C1972.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C1972.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C1972.$default$merge(this, (Integer) obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C14905.m35651(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C1972.$default$putIfAbsent(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C1972.$default$replace(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Integer) obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // l.InterfaceC6456
    public final Object get(Object obj) {
        int iIntValue;
        int i;
        if (obj != null && ((i = get((iIntValue = ((Integer) obj).intValue()))) != mo42952() || mo26879(iIntValue))) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C10672) this).mo26882();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C10672 c10672 = (C10672) this;
        if (c10672.mo26879(iIntValue)) {
            return Integer.valueOf(c10672.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C10672) this).mo26879(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C10672) this).m26877(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC18432) {
            InterfaceC18660 interfaceC18660Mo26882 = ((InterfaceC18432) map).mo26882();
            InterfaceC6269 interfaceC6269Mo1027 = interfaceC18660Mo26882 instanceof InterfaceC17726 ? ((InterfaceC17726) interfaceC18660Mo26882).mo1027() : interfaceC18660Mo26882.iterator();
            while (interfaceC6269Mo1027.hasNext()) {
                InterfaceC21254 interfaceC21254 = (InterfaceC21254) interfaceC6269Mo1027.next();
                mo26878(interfaceC21254.mo45097(), interfaceC21254.mo45096());
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
            C14905.m35651(this, (Integer) entry.getKey(), (Integer) entry.getValue());
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
        C10672 c10672 = (C10672) this;
        if (map.size() != c10672.f36410) {
            return false;
        }
        return ((AbstractCollection) c10672.mo26882()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C10672 c10672 = (C10672) this;
        InterfaceC18660 interfaceC18660Mo26882 = c10672.mo26882();
        InterfaceC6269 interfaceC6269Mo1027 = C6009.m16315(interfaceC18660Mo26882) ? ((InterfaceC17726) interfaceC18660Mo26882).mo1027() : ((C0087) interfaceC18660Mo26882).iterator();
        int i = c10672.f36410;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC21254 interfaceC21254 = (InterfaceC21254) interfaceC6269Mo1027.next();
                sb.append(String.valueOf(interfaceC21254.mo45097()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC21254.mo45096()));
                i = i2;
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
