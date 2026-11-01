package l;

import com.alipay.sdk.m.y.l;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: WCM1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11624 extends AbstractC13741 implements InterfaceC5086, InterfaceC4464 {
    public static final long serialVersionUID = -4940583368468432370L;

    @Override // java.util.Map, l.InterfaceC4464
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        C1972.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object compute(Object obj, BiFunction biFunction) {
        return (Character) C1972.$default$compute(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfAbsent(Object obj, Function function) {
        return (Character) C1972.$default$computeIfAbsent(this, (Character) obj, function);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        return (Character) C1972.$default$computeIfPresent(this, (Character) obj, biFunction);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object getOrDefault(Object obj, Object obj2) {
        return (Character) C1972.$default$getOrDefault(this, obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return (Character) C1972.$default$merge(this, (Character) obj, (Character) obj2, biFunction);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object put(Object obj, Object obj2) {
        return C13554.m33142(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object putIfAbsent(Object obj, Object obj2) {
        return (Character) C1972.$default$putIfAbsent(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final Object replace(Object obj, Object obj2) {
        return (Character) C1972.$default$replace(this, (Character) obj, (Character) obj2);
    }

    @Override // java.util.Map, l.InterfaceC4464
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        return C1972.$default$replace(this, (Character) obj, (Character) obj2, (Character) obj3);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return ((C14447) this).mo14178();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (obj == null) {
            return null;
        }
        char cCharValue = ((Character) obj).charValue();
        C14447 c14447 = (C14447) this;
        if (c14447.mo9551(cCharValue)) {
            return Character.valueOf(c14447.m34849(cCharValue));
        }
        return null;
    }

    @Override // l.AbstractC13741, l.InterfaceC9508, l.InterfaceC6456
    public final Character get(Object obj) {
        return C1745.m5787(this, obj);
    }

    @Override // l.AbstractC13741, l.InterfaceC6456
    public final Object get(Object obj) {
        return C1745.m5787(this, obj);
    }

    @Override // l.InterfaceC6456
    public final boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        return ((C14447) this).mo9551(((Character) obj).charValue());
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        char cCharValue = ((Character) obj).charValue();
        C14447 c14447 = (C14447) this;
        char[] cArr = c14447.f47385;
        int i = c14447.f47387;
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

    @Override // java.util.Map, l.InterfaceC4464
    public final void forEach(BiConsumer biConsumer) {
        C1972.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        if (map instanceof InterfaceC5086) {
            InterfaceC6269 interfaceC6269M3464 = C0852.m3464((InterfaceC5086) map);
            while (interfaceC6269M3464.hasNext()) {
                InterfaceC11437 interfaceC11437 = (InterfaceC11437) interfaceC6269M3464.next();
                mo24344(interfaceC11437.mo28551(), interfaceC11437.mo28552());
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
            C13554.m33142(this, (Character) entry.getKey(), (Character) entry.getValue());
            size = i;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        int i = ((C14447) this).f47387;
        InterfaceC6269 interfaceC6269M3464 = C0852.m3464(this);
        int iHashCode = 0;
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return iHashCode;
            }
            iHashCode += ((InterfaceC11437) interfaceC6269M3464.next()).hashCode();
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
        C14447 c14447 = (C14447) this;
        if (map.size() != c14447.f47387) {
            return false;
        }
        return ((AbstractCollection) c14447.mo14178()).containsAll(map.entrySet());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        InterfaceC6269 interfaceC6269M3464 = C0852.m3464(this);
        int i = ((C14447) this).f47387;
        boolean z = true;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                InterfaceC11437 interfaceC11437 = (InterfaceC11437) interfaceC6269M3464.next();
                sb.append(String.valueOf(interfaceC11437.mo28551()));
                sb.append("=>");
                sb.append(String.valueOf(interfaceC11437.mo28552()));
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
