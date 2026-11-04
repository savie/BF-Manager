package l;

import com.umeng.analytics.pro.am;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.core.AnnotationHandler;

/* JADX INFO: renamed from: l.ܰܶܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C14691 extends AbstractC12454 implements Map, Cloneable, Serializable, InvocationHandler {

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final Map f48012;

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f48012.put((String) obj, obj2);
    }

    public C14691() {
        this(0, false);
    }

    public C14691(Map map) {
        this.f48012 = map;
    }

    public C14691(int i, boolean z) {
        if (z) {
            this.f48012 = new LinkedHashMap(16);
        } else {
            this.f48012 = new HashMap(16);
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f48012.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f48012.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f48012.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f48012.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f48012.get(obj);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m35341(String str) {
        Integer numM10228 = C3134.m10228(this.f48012.get(str));
        if (numM10228 == null) {
            return 0;
        }
        return numM10228.intValue();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Boolean m35342() {
        Object obj = this.f48012.get(am.aE);
        if (obj == null) {
            return null;
        }
        return C3134.m10229(obj);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String m35343(String str) {
        Object obj = this.f48012.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m35344(String str) {
        Boolean boolM10229 = C3134.m10229(this.f48012.get(str));
        if (boolM10229 == null) {
            return false;
        }
        return boolM10229.booleanValue();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6489 m35345(String str) {
        Object obj = this.f48012.get(str);
        if (obj instanceof C6489) {
            return (C6489) obj;
        }
        if (obj instanceof String) {
            return (C6489) AbstractC12454.m30923(AbstractC12454.f40027, (String) obj);
        }
        return (C6489) AbstractC12454.m30924(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m35340(String str, Object obj) {
        this.f48012.put(str, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f48012.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f48012.clear();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f48012.remove(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f48012.keySet();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f48012.values();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f48012.entrySet();
    }

    public final Object clone() {
        return new C14691(new LinkedHashMap(this.f48012));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f48012.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f48012.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class<?> cls = Void.TYPE;
        String strName = null;
        Map map = this.f48012;
        if (length == 1) {
            if (method.getName().equals(AnnotationHandler.EQUAL)) {
                return Boolean.valueOf(map.equals(objArr[0]));
            }
            if (method.getReturnType() != cls) {
                throw new C4251("illegal setter");
            }
            InterfaceC19167 interfaceC19167 = (InterfaceC19167) method.getAnnotation(InterfaceC19167.class);
            String strName2 = (interfaceC19167 == null || interfaceC19167.name().length() == 0) ? null : interfaceC19167.name();
            if (strName2 == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new C4251("illegal setter");
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    throw new C4251("illegal setter");
                }
                strName2 = Character.toLowerCase(strSubstring.charAt(0)) + strSubstring.substring(1);
            }
            map.put(strName2, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == cls) {
            throw new C4251("illegal getter");
        }
        InterfaceC19167 interfaceC19168 = (InterfaceC19167) method.getAnnotation(InterfaceC19167.class);
        if (interfaceC19168 != null && interfaceC19168.name().length() != 0) {
            strName = interfaceC19168.name();
        }
        if (strName == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new C4251("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith(am.ae)) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(map.hashCode());
                    }
                    if (name2.startsWith(AnnotationHandler.STRING)) {
                        return mo30929();
                    }
                    throw new C4251("illegal getter");
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    throw new C4251("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return C3134.m10217(map.get(strName), method.getGenericReturnType(), C13420.f42747);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final Map m35338() {
        return this.f48012;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m35339(Class cls, C13420 c13420) {
        return (cls != Map.class && (cls != Object.class || this.f48012.containsKey("@type"))) ? C3134.m10238(this, cls, c13420) : this;
    }
}
