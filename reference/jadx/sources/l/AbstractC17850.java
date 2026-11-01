package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: VXN */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17850 extends AbstractC21378 implements InterfaceC12704, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C1972.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C1972.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C1972.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) C1972.$default$getOrDefault(this, obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C1972.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C10588.m26762(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C1972.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Float) C1972.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C3614) this).mo10715();
    }

    @Override // l.AbstractC21378, l.InterfaceC7765, l.InterfaceC6456
    public final Float get(Object obj) {
        return C10588.m26763(this, obj);
    }

    @Override // l.AbstractC21378, l.InterfaceC6456
    public final Object get(Object obj) {
        return C10588.m26763(this, obj);
    }

    @Override // l.AbstractC21378, l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo10713(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C10588.m26764(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C3614) this).m10712(((Float) obj).floatValue());
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC12704) {
            InterfaceC18660 interfaceC18660Mo10715 = ((InterfaceC12704) map).mo10715();
            InterfaceC6269 interfaceC6269Mo6816 = interfaceC18660Mo10715 instanceof InterfaceC16937 ? ((InterfaceC16937) interfaceC18660Mo10715).mo6816() : interfaceC18660Mo10715.iterator();
            while (interfaceC6269Mo6816.hasNext()) {
                InterfaceC0708 interfaceC0708 = (InterfaceC0708) interfaceC6269Mo6816.next();
                mo10711(interfaceC0708.mo3126(), interfaceC0708.mo3125());
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
            C10588.m26762(this, (Integer) entry.getKey(), (Float) entry.getValue());
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
        C3614 c3614 = (C3614) this;
        if (map.size() != c3614.f13294) {
            return false;
        }
        return ((AbstractCollection) c3614.mo10715()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C3614 c3614 = (C3614) this;
        InterfaceC18660 interfaceC18660Mo10715 = c3614.mo10715();
        InterfaceC6269 interfaceC6269Mo6816 = C6009.m16315(interfaceC18660Mo10715) ? ((InterfaceC16937) interfaceC18660Mo10715).mo6816() : ((C2203) interfaceC18660Mo10715).iterator();
        int i = c3614.f13294;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC0708 interfaceC0708 = (InterfaceC0708) interfaceC6269Mo6816.next();
                sb.append(String.valueOf(interfaceC0708.mo3125()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC0708.mo3126()));
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
