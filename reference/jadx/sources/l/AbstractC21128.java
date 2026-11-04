package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩶ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: NC7Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC21128 extends AbstractC14414 implements InterfaceC23891, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Byte) C1698.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Byte) C1698.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Byte) C1698.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Byte) C1698.$default$getOrDefault(this, obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Byte) C1698.$default$merge(this, (Integer) obj, (Byte) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C17177.m40343(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Byte) C1698.$default$putIfAbsent(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Byte) C1698.$default$replace(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Integer) obj, (Byte) obj2, (Byte) obj3);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        int iIntValue;
        byte b;
        if (obj != null && ((b = get((iIntValue = ((Integer) obj).intValue()))) != 0 || mo5392(iIntValue))) {
            return Byte.valueOf(b);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C1516) this).mo5394();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C1516 c1516 = (C1516) this;
        if (c1516.mo5392(iIntValue)) {
            return Byte.valueOf(c1516.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C1516) this).mo5392(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C1516) this).m5391(((Byte) obj).byteValue());
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC23891) {
            InterfaceC7767 interfaceC7767Mo5394 = ((InterfaceC23891) map).mo5394();
            InterfaceC15224 interfaceC15224Mo38993 = interfaceC7767Mo5394 instanceof InterfaceC16431 ? ((InterfaceC16431) interfaceC7767Mo5394).mo38993() : interfaceC7767Mo5394.iterator();
            while (interfaceC15224Mo38993.hasNext()) {
                InterfaceC17923 interfaceC17923 = (InterfaceC17923) interfaceC15224Mo38993.next();
                mo5390(interfaceC17923.mo41836(), interfaceC17923.mo41837());
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
            C17177.m40343(this, (Integer) entry.getKey(), (Byte) entry.getValue());
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
        C1516 c1516 = (C1516) this;
        if (map.size() != c1516.f5292) {
            return false;
        }
        return ((AbstractCollection) c1516.mo5394()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C1516 c1516 = (C1516) this;
        InterfaceC7767 interfaceC7767Mo5394 = c1516.mo5394();
        InterfaceC15224 interfaceC15224Mo38993 = C1402.m5130(interfaceC7767Mo5394) ? ((InterfaceC16431) interfaceC7767Mo5394).mo38993() : ((C18669) interfaceC7767Mo5394).iterator();
        int i = c1516.f5292;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC17923 interfaceC17923 = (InterfaceC17923) interfaceC15224Mo38993.next();
                sb.append(String.valueOf(interfaceC17923.mo41837()));
                sb.append("=>");
                sb.append(String.valueOf((int) interfaceC17923.mo41836()));
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
