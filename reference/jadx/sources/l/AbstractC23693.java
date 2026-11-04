package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩹ܽ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: WCM1 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23693 extends AbstractC16233 implements InterfaceC20665, InterfaceC16613 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC16613
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1698.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C1698.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C1698.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C1698.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) C1698.$default$getOrDefault(this, obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C1698.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C16189.m38419(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C1698.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final Object replace(Object obj, Object obj2) {
        return (Character) C1698.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1698.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C2020) this).mo6942();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        C2020 c2020 = (C2020) this;
        if (c2020.mo6944(cCharValue)) {
            return Character.valueOf(c2020.m6945(cCharValue));
        }
        return null;
    }

    @Override // l.AbstractC16233, l.InterfaceC25141, l.InterfaceC21433, java.util.Map
    public final Character get(Object obj) {
        return C11714.m29432(this, obj);
    }

    @Override // l.AbstractC16233, l.InterfaceC21433, java.util.Map
    public final Object get(Object obj) {
        return C11714.m29432(this, obj);
    }

    @Override // l.InterfaceC21433, java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C2020) this).mo6944(((Character) obj).charValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        char cCharValue = ((Character) obj).charValue();
        C2020 c2020 = (C2020) this;
        char[] cArr = c2020.f6732;
        int i = c2020.f6731;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return false;
            }
            if (cArr[i2] == cCharValue) {
                return true;
            }
            i = i2;
        }
    }

    @Override // java.util.Map, l.InterfaceC16613
    public final void forEach(BiConsumer biConsumer) {
        C1698.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC20665) {
            InterfaceC15224 interfaceC15224M18330 = C6495.m18330((InterfaceC20665) map);
            while (interfaceC15224M18330.hasNext()) {
                InterfaceC23649 interfaceC23649 = (InterfaceC23649) interfaceC15224M18330.next();
                mo6943(interfaceC23649.mo45846(), interfaceC23649.mo45847());
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
            C16189.m38419(this, (Character) entry.getKey(), (Character) entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C2020) this).f6731;
        InterfaceC15224 interfaceC15224M18330 = C6495.m18330(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC23649) interfaceC15224M18330.next()).hashCode();
            i = i2;
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
        C2020 c2020 = (C2020) this;
        if (map.size() != c2020.f6731) {
            return false;
        }
        return ((AbstractCollection) c2020.mo6942()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC15224 interfaceC15224M18330 = C6495.m18330(this);
        int i = ((C2020) this).f6731;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC23649 interfaceC23649 = (InterfaceC23649) interfaceC15224M18330.next();
                sb.append(String.valueOf(interfaceC23649.mo45846()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC23649.mo45847()));
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
