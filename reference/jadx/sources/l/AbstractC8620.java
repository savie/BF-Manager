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

/* JADX INFO: renamed from: l.ۡۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AV2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8620 implements InterfaceC19909, InterfaceC7208 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static TimeZone f29746 = TimeZone.getDefault();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static Locale f29748 = Locale.getDefault();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static int f29749 = (EnumC9326.UseBigDecimal.f31669 | EnumC9326.SortFeidFastMatch.f31669) | EnumC9326.IgnoreNotMatch.f31669;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static String f29745 = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static int f29747 = ((EnumC3984.QuoteFieldNames.f14811 | EnumC3984.SkipTransientField.f14811) | EnumC3984.WriteEnumUsingToString.f14811) | EnumC3984.SortField.f14811;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15676 m22396(String str) {
        int i = f29749;
        Object objM22394 = m22394(i, str);
        if ((objM22394 instanceof C15676) || objM22394 == null) {
            return (C15676) objM22394;
        }
        C15676 c15676 = (C15676) m22395(objM22394);
        if ((i & EnumC9326.SupportAutoType.f31669) != 0) {
            c15676.m37349("@type", objM22394.getClass().getName());
        }
        return c15676;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m22394(int i, String str) {
        if (str == null) {
            return null;
        }
        C14265 c14265 = new C14265(str, C0893.f3598, i);
        Object objM34396 = c14265.m34396((Object) null);
        c14265.m34395();
        c14265.close();
        return objM34396;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final C15676 m22397(String str, EnumC9326... enumC9326Arr) {
        int i = f29749;
        int i2 = i;
        for (EnumC9326 enumC9326 : enumC9326Arr) {
            i2 |= enumC9326.f31669;
        }
        Object objM22394 = m22394(i2, str);
        if (objM22394 instanceof C15676) {
            return (C15676) objM22394;
        }
        C15676 c15676 = (C15676) m22395(objM22394);
        boolean z = (i & EnumC9326.SupportAutoType.f31669) != 0;
        if (!z) {
            for (EnumC9326 enumC9327 : enumC9326Arr) {
                if (enumC9327 == EnumC9326.SupportAutoType) {
                    z = true;
                }
            }
        }
        if (z) {
            c15676.m37349("@type", objM22394.getClass().getName());
        }
        return c15676;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final String m22398(Object obj) {
        C1162 c1162 = C1162.f5199;
        C13158 c13158 = new C13158(f29747, new EnumC3984[0]);
        try {
            new C23473(c13158, c1162).m51725(obj);
            return c13158.toString();
        } finally {
            c13158.close();
        }
    }

    public final String toString() {
        return mo19151();
    }

    @Override // l.InterfaceC7208
    /* JADX INFO: renamed from: ۨ */
    public final String mo19151() {
        C13158 c13158 = new C13158(f29747, EnumC3984.f14806);
        try {
            new C23473(c13158, C1162.f5199).m51725(this);
            return c13158.toString();
        } finally {
            c13158.close();
        }
    }

    @Override // l.InterfaceC19909
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo22399(Appendable appendable) {
        C13158 c13158 = new C13158(f29747, EnumC3984.f14806);
        try {
            try {
                new C23473(c13158, C1162.f5199).m51725(this);
                appendable.append(c13158.toString());
                c13158.close();
            } catch (IOException e) {
                throw new C20614(e.getMessage(), (Throwable) e);
            }
        } catch (Throwable th) {
            c13158.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m22395(Object obj) {
        Map map;
        C1162 c1162 = C1162.f5199;
        if (obj != null) {
            if (obj instanceof AbstractC8620) {
                return (AbstractC8620) obj;
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
                C15676 c15676 = new C15676(map);
                for (Map.Entry entry : map2.entrySet()) {
                    Object key = entry.getKey();
                    int i = C8219.f28613;
                    c15676.m37349(key == null ? null : key.toString(), m22395(entry.getValue()));
                }
                return c15676;
            }
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                C10031 c10031 = new C10031(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    c10031.add(m22395(it.next()));
                }
                return c10031;
            }
            Class<?> cls = obj.getClass();
            if (cls.isEnum()) {
                return ((Enum) obj).name();
            }
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                C10031 c10032 = new C10031(length);
                for (int i2 = 0; i2 < length; i2++) {
                    c10032.add(m22395(Array.get(obj, i2)));
                }
                return c10032;
            }
            if (C0893.m3566((Class) cls)) {
                return obj;
            }
            InterfaceC11747 interfaceC11747M4271 = c1162.m4271(cls);
            if (interfaceC11747M4271 instanceof C14301) {
                C14301 c14301 = (C14301) interfaceC11747M4271;
                C15676 c15677 = new C15676();
                try {
                    for (Map.Entry entry2 : c14301.m34527(obj).entrySet()) {
                        c15677.m37349((String) entry2.getKey(), m22395(entry2.getValue()));
                    }
                    return c15677;
                } catch (Exception e) {
                    throw new C20614("toJSON error", (Throwable) e);
                }
            }
        }
        return null;
    }
}
