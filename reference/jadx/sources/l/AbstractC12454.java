package l;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: renamed from: l.ۨܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AV2 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12454 implements InterfaceC21405, InterfaceC24389 {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static TimeZone f40024 = TimeZone.getDefault();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static Locale f40023 = Locale.getDefault();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f40027 = (EnumC7234.UseBigDecimal.f23858 | EnumC7234.SortFeidFastMatch.f23858) | EnumC7234.IgnoreNotMatch.f23858;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static String f40026 = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int f40025 = ((EnumC1643.QuoteFieldNames.f5702 | EnumC1643.SkipTransientField.f5702) | EnumC1643.WriteEnumUsingToString.f5702) | EnumC1643.SortField.f5702;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14691 m30925(String str) {
        int i = f40027;
        Object objM30923 = m30923(i, str);
        if ((objM30923 instanceof C14691) || objM30923 == null) {
            return (C14691) objM30923;
        }
        C14691 c14691 = (C14691) m30924(objM30923);
        if ((i & EnumC7234.SupportAutoType.f23858) != 0) {
            c14691.m35340("@type", objM30923.getClass().getName());
        }
        return c14691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m30923(int i, String str) {
        if (str == null) {
            return null;
        }
        C2759 c2759 = new C2759(str, C13420.f42747, i);
        Object objM9106 = c2759.m9106((Object) null);
        c2759.m9118();
        c2759.close();
        return objM9106;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C14691 m30926(String str, EnumC7234... enumC7234Arr) {
        int i = f40027;
        int i2 = i;
        for (EnumC7234 enumC7234 : enumC7234Arr) {
            i2 |= enumC7234.f23858;
        }
        Object objM30923 = m30923(i2, str);
        if (objM30923 instanceof C14691) {
            return (C14691) objM30923;
        }
        C14691 c14691 = (C14691) m30924(objM30923);
        boolean z = (i & EnumC7234.SupportAutoType.f23858) != 0;
        if (!z) {
            for (EnumC7234 enumC7235 : enumC7234Arr) {
                if (enumC7235 == EnumC7234.SupportAutoType) {
                    z = true;
                }
            }
        }
        if (z) {
            c14691.m35340("@type", objM30923.getClass().getName());
        }
        return c14691;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final String m30927(Object obj) {
        C12829 c12829 = C12829.f41097;
        C5372 c5372 = new C5372(f40025, new EnumC1643[0]);
        try {
            new C9690(c5372, c12829).m25277(obj);
            return c5372.toString();
        } finally {
            c5372.close();
        }
    }

    public final String toString() {
        return mo30929();
    }

    @Override // l.InterfaceC24389
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String mo30929() {
        C5372 c5372 = new C5372(f40025, EnumC1643.f5696);
        try {
            new C9690(c5372, C12829.f41097).m25277(this);
            return c5372.toString();
        } finally {
            c5372.close();
        }
    }

    @Override // l.InterfaceC21405
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo30928(Appendable appendable) {
        C5372 c5372 = new C5372(f40025, EnumC1643.f5696);
        try {
            try {
                new C9690(c5372, C12829.f41097).m25277(this);
                appendable.append(c5372.toString());
                c5372.close();
            } catch (IOException e) {
                throw new C4251(e.getMessage(), (Throwable) e);
            }
        } catch (Throwable th) {
            c5372.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m30924(Object obj) {
        Map map;
        C12829 c12829 = C12829.f41097;
        if (obj != null) {
            if (obj instanceof AbstractC12454) {
                return (AbstractC12454) obj;
            }
            if (obj instanceof Map) {
                Map map2 = (Map) obj;
                int size = map2.size();
                if (map2 instanceof LinkedHashMap) {
                    map = new LinkedHashMap(size);
                } else if (map2 instanceof TreeMap) {
                    map = new TreeMap();
                } else {
                    map = new HashMap(size);
                }
                C14691 c14691 = new C14691(map);
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    int i = C3134.f10148;
                    c14691.m35340(key == null ? null : key.toString(), m30924(entry.getValue()));
                }
                return c14691;
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                C6489 c6489 = new C6489(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c6489.add(m30924(it.next()));
                }
                return c6489;
            }
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return ((Enum) obj).name();
            }
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                C6489 c64810 = new C6489(length);
                for (int i2 = 0; i2 < length; i2++) {
                    c64810.add(m30924(Array.get(obj, i2)));
                }
                return c64810;
            }
            if (C13420.m33058((Class) cls)) {
                return obj;
            }
            InterfaceC10591 interfaceC10591M31835 = c12829.m31835(cls);
            if (interfaceC10591M31835 instanceof C2979) {
                C2979 c2979 = (C2979) interfaceC10591M31835;
                C14691 c14692 = new C14691();
                try {
                    for (Map.Entry entry2 : c2979.m9698(obj).entrySet()) {
                        c14692.m35340((String) entry2.getKey(), m30924(entry2.getValue()));
                    }
                    return c14692;
                } catch (Exception e) {
                    throw new C4251("toJSON error", (Throwable) e);
                }
            }
        }
        return null;
    }
}
