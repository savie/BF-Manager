package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: NC7Z */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC15029 extends AbstractC22790 implements InterfaceC2825, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Byte) C1972.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Byte) C1972.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Byte) C1972.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Byte) C1972.$default$getOrDefault(this, obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Byte) C1972.$default$merge(this, (Integer) obj, (Byte) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C4942.m13721(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Byte) C1972.$default$putIfAbsent(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Byte) C1972.$default$replace(this, (Integer) obj, (Byte) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Integer) obj, (Byte) obj2, (Byte) obj3);
    }

    @Override // l.InterfaceC6456
    public final Object get(Object obj) {
        int iIntValue;
        byte b;
        if (obj != null && ((b = get((iIntValue = ((Integer) obj).intValue()))) != 0 || mo9047(iIntValue))) {
            return Byte.valueOf(b);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C9177) this).mo8578();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C9177 c9177 = (C9177) this;
        if (c9177.mo9047(iIntValue)) {
            return Byte.valueOf(c9177.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C9177) this).mo9047(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C9177) this).m23609(((Byte) obj).byteValue());
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC2825) {
            InterfaceC18660 interfaceC18660Mo8578 = ((InterfaceC2825) map).mo8578();
            InterfaceC6269 interfaceC6269Mo29885 = interfaceC18660Mo8578 instanceof InterfaceC11999 ? ((InterfaceC11999) interfaceC18660Mo8578).mo29885() : interfaceC18660Mo8578.iterator();
            while (interfaceC6269Mo29885.hasNext()) {
                InterfaceC14116 interfaceC14116 = (InterfaceC14116) interfaceC6269Mo29885.next();
                mo9046(interfaceC14116.mo34154(), interfaceC14116.mo34153());
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
            C4942.m13721(this, (Integer) entry.getKey(), (Byte) entry.getValue());
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
        C9177 c9177 = (C9177) this;
        if (map.size() != c9177.f31238) {
            return false;
        }
        return ((AbstractCollection) c9177.mo8578()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C9177 c9177 = (C9177) this;
        InterfaceC18660 interfaceC18660Mo8578 = c9177.mo8578();
        InterfaceC6269 interfaceC6269Mo29885 = C6009.m16315(interfaceC18660Mo8578) ? ((InterfaceC11999) interfaceC18660Mo8578).mo29885() : ((C21876) interfaceC18660Mo8578).iterator();
        int i = c9177.f31238;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC14116 interfaceC14116 = (InterfaceC14116) interfaceC6269Mo29885.next();
                sb.append(String.valueOf(interfaceC14116.mo34153()));
                sb.append("=>");
                sb.append(String.valueOf((int) interfaceC14116.mo34154()));
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
