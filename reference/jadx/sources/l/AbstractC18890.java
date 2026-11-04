package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: Q1L7 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18890 extends AbstractC7703 implements InterfaceC7637, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Integer) C1698.$default$compute(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Integer) C1698.$default$computeIfAbsent(this, (Integer) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Integer) C1698.$default$computeIfPresent(this, (Integer) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Integer) C1698.$default$getOrDefault(this, obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Integer) C1698.$default$merge(this, (Integer) obj, (Integer) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C21062.m48134(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Integer) C1698.$default$putIfAbsent(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Integer) C1698.$default$replace(this, (Integer) obj, (Integer) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Integer) obj, (Integer) obj2, (Integer) obj3);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        int iIntValue;
        int i;
        if (obj != null && ((i = get((iIntValue = ((Integer) obj).intValue()))) != mo20980() || mo34770(iIntValue))) {
            return Integer.valueOf(i);
        }
        return null;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C15399) this).mo20854();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        int iIntValue = ((Integer) obj).intValue();
        C15399 c15399 = (C15399) this;
        if (c15399.mo34770(iIntValue)) {
            return Integer.valueOf(c15399.remove(iIntValue));
        }
        return null;
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C15399) this).mo34770(((Integer) obj).intValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C15399) this).m36871(((Integer) obj).intValue());
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    public void putAll(Map map) {
        if (map instanceof InterfaceC7637) {
            InterfaceC7767 interfaceC7767Mo20854 = ((InterfaceC7637) map).mo20854();
            InterfaceC15224 interfaceC15224Mo1475 = interfaceC7767Mo20854 instanceof InterfaceC0179 ? ((InterfaceC0179) interfaceC7767Mo20854).mo1475() : interfaceC7767Mo20854.iterator();
            while (interfaceC15224Mo1475.hasNext()) {
                InterfaceC18078 interfaceC18078 = (InterfaceC18078) interfaceC15224Mo1475.next();
                mo20978(interfaceC18078.mo33340(), interfaceC18078.mo33339());
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
            C21062.m48134(this, (Integer) entry.getKey(), (Integer) entry.getValue());
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
        C15399 c15399 = (C15399) this;
        if (map.size() != c15399.f50197) {
            return false;
        }
        return ((AbstractCollection) c15399.mo20854()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        C15399 c15399 = (C15399) this;
        InterfaceC7767 interfaceC7767Mo20854 = c15399.mo20854();
        InterfaceC15224 interfaceC15224Mo1475 = C1402.m5130(interfaceC7767Mo20854) ? ((InterfaceC0179) interfaceC7767Mo20854).mo1475() : ((C4959) interfaceC7767Mo20854).iterator();
        int i = c15399.f50197;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC18078 interfaceC18078 = (InterfaceC18078) interfaceC15224Mo1475.next();
                sb.append(String.valueOf(interfaceC18078.mo33340()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC18078.mo33339()));
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
