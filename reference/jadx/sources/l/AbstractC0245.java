package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VXN */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0245 extends AbstractC18144 implements InterfaceC10619, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Float) C1698.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Float) C1698.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Float) C1698.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Float) C1698.$default$getOrDefault(this, obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Float) C1698.$default$merge(this, (Integer) obj, (Float) obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return C9718.m25304(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Float) C1698.$default$putIfAbsent(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Float) C1698.$default$replace(this, (Integer) obj, (Float) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Integer) obj, (Float) obj2, (Float) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C24046) this).mo27095();
    }

    @Override // l.AbstractC18144, l.InterfaceC3007, l.InterfaceC21433, java.util.Map
    public final Float get(Object obj) {
        return C9718.m25305(this, obj);
    }

    @Override // l.AbstractC18144, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C9718.m25305(this, obj);
    }

    @Override // l.AbstractC18144, l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return mo9815(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return C9718.m25306(this, obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C24046) this).m53600(((Float) obj).floatValue());
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        if (map instanceof InterfaceC10619) {
            InterfaceC7767 interfaceC7767Mo27095 = ((InterfaceC10619) map).mo27095();
            InterfaceC15224 interfaceC15224Mo49462 = interfaceC7767Mo27095 instanceof InterfaceC21808 ? ((InterfaceC21808) interfaceC7767Mo27095).mo49462() : interfaceC7767Mo27095.iterator();
            while (interfaceC15224Mo49462.hasNext()) {
                InterfaceC4654 interfaceC4654 = (InterfaceC4654) interfaceC15224Mo49462.next();
                mo9814(interfaceC4654.mo14509(), interfaceC4654.mo14508());
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
            C9718.m25304(this, (Integer) entry.getKey(), (Float) entry.getValue());
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
        C24046 c24046 = (C24046) this;
        if (map.size() != c24046.f77778) {
            return false;
        }
        return ((AbstractCollection) c24046.mo27095()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C24046 c24046 = (C24046) this;
        InterfaceC7767 interfaceC7767Mo27095 = c24046.mo27095();
        InterfaceC15224 interfaceC15224Mo49462 = C1402.m5130(interfaceC7767Mo27095) ? ((InterfaceC21808) interfaceC7767Mo27095).mo49462() : ((C23300) interfaceC7767Mo27095).iterator();
        int i = c24046.f77778;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC4654 interfaceC4654 = (InterfaceC4654) interfaceC15224Mo49462.next();
                sb.append(String.valueOf(interfaceC4654.mo14508()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC4654.mo14509()));
                i = i2;
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
