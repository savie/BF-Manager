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

/* JADX INFO: renamed from: l.ܺۗ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: BAUQ */
/* JADX INFO: loaded from: classes5.dex */
public final class C15676 extends AbstractC8620 implements Map, Cloneable, Serializable, InvocationHandler {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Map f50901;

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f50901.put((String) obj, obj2);
    }

    public C15676() {
        this(0, false);
    }

    public C15676(Map map) {
        this.f50901 = map;
    }

    public C15676(int i, boolean z) {
        if (z) {
            this.f50901 = new LinkedHashMap(16);
        } else {
            this.f50901 = new HashMap(16);
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f50901.size();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f50901.isEmpty();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f50901.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f50901.containsValue(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.f50901.get(obj);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Boolean m37350() {
        Object obj = this.f50901.get(am.aE);
        if (obj == null) {
            return null;
        }
        return C8219.m21525(obj);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m37351(String str) {
        Object obj = this.f50901.get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m37352(String str) {
        Integer numM21529 = C8219.m21529(this.f50901.get(str));
        if (numM21529 == null) {
            return 0;
        }
        return numM21529.intValue();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m37353(String str) {
        Boolean boolM21525 = C8219.m21525(this.f50901.get(str));
        if (boolM21525 == null) {
            return false;
        }
        return boolM21525.booleanValue();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C10031 m37346(String str) {
        Object obj = this.f50901.get(str);
        if (obj instanceof C10031) {
            return (C10031) obj;
        }
        if (obj instanceof String) {
            return (C10031) AbstractC8620.m22394(AbstractC8620.f29749, (String) obj);
        }
        return (C10031) AbstractC8620.m22395(obj);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37349(String str, Object obj) {
        this.f50901.put(str, obj);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.f50901.putAll(map);
    }

    @Override // java.util.Map
    public final void clear() {
        this.f50901.clear();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f50901.remove(obj);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f50901.keySet();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f50901.values();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f50901.entrySet();
    }

    public final Object clone() {
        return new C15676(new LinkedHashMap(this.f50901));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.f50901.equals(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.f50901.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length;
        Class<?> cls = Void.TYPE;
        String strName = null;
        Map map = this.f50901;
        if (length == 1) {
            if (method.getName().equals(AnnotationHandler.EQUAL)) {
                return Boolean.valueOf(map.equals(objArr[0]));
            }
            if (method.getReturnType() != cls) {
                throw new C20614("illegal setter");
            }
            InterfaceC17086 interfaceC17086 = (InterfaceC17086) method.getAnnotation(InterfaceC17086.class);
            String strName2 = (interfaceC17086 == null || interfaceC17086.name().length() == 0) ? null : interfaceC17086.name();
            if (strName2 == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new C20614("illegal setter");
                }
                String strSubstring = name.substring(3);
                if (strSubstring.length() == 0) {
                    throw new C20614("illegal setter");
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
            throw new C20614("illegal getter");
        }
        InterfaceC17086 interfaceC17087 = (InterfaceC17086) method.getAnnotation(InterfaceC17086.class);
        if (interfaceC17087 != null && interfaceC17087.name().length() != 0) {
            strName = interfaceC17087.name();
        }
        if (strName == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                String strSubstring2 = name2.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new C20614("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            } else {
                if (!name2.startsWith(am.ae)) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(map.hashCode());
                    }
                    if (name2.startsWith(AnnotationHandler.STRING)) {
                        return mo19151();
                    }
                    throw new C20614("illegal getter");
                }
                String strSubstring3 = name2.substring(2);
                if (strSubstring3.length() == 0) {
                    throw new C20614("illegal getter");
                }
                strName = Character.toLowerCase(strSubstring3.charAt(0)) + strSubstring3.substring(1);
            }
        }
        return C8219.m21512(map.get(strName), method.getGenericReturnType(), C0893.f3598);
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final Map m37347() {
        return this.f50901;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m37348(Class cls, C0893 c0893) {
        return (cls != Map.class && (cls != Object.class || this.f50901.containsKey("@type"))) ? C8219.m21531(this, cls, c0893) : this;
    }
}
