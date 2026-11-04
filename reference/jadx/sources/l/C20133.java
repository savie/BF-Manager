package l;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: l.ᩴ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAVD */
/* JADX INFO: loaded from: classes5.dex */
public final class C20133 implements InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20133 f64697 = new C20133();

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public final Object mo12124(C2759 c2759, Type type, Object obj) {
        C13945 c13945 = c2759.f9128;
        if (type != C14691.class) {
            if (c13945.f44222 == 8) {
                c13945.m33973(16);
                return null;
            }
            Map mapM46357 = m46357(type);
            C15657 c15657 = c2759.f9133;
            try {
                c2759.m9109(c15657, mapM46357, obj);
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    Type type3 = parameterizedType.getActualTypeArguments()[1];
                    if (String.class == type2) {
                        return m46358(c2759, obj, type3, mapM46357);
                    }
                    return m46356(c2759, mapM46357, type2, type3);
                }
                return c2759.m9121(mapM46357, obj);
            } finally {
                c2759.m9116(c15657);
            }
        }
        return (C14691) c2759.m9121((c13945.f44213 & EnumC7234.OrderedField.f23858) != 0 ? new C14691(new LinkedHashMap()) : new C14691(), null);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m46358(C2759 c2759, Object obj, Type type, Map map) {
        String strM33971;
        C13945 c13945 = c2759.f9128;
        C13420 c13420 = c2759.f9130;
        C11928 c11928 = c2759.f9125;
        if (c13945.f44222 != 12) {
            throw new C4251("syntax error, expect {, actual " + c13945.f44222);
        }
        C15657 c15657 = c2759.f9133;
        while (true) {
            try {
                c13945.m33952();
                char c = c13945.f44209;
                while (c == ',') {
                    c13945.m33935();
                    c13945.m33952();
                    c = c13945.f44209;
                }
                if (c == '\"') {
                    strM33971 = c13945.m33942(c11928, '\"');
                    c13945.m33952();
                    if (c13945.f44209 != ':') {
                        throw new C4251("syntax error, " + c13945.m33977());
                    }
                } else {
                    if (c == '}') {
                        c13945.m33935();
                        c13945.f44205 = 0;
                        c13945.m33973(16);
                        c2759.m9116(c15657);
                        return map;
                    }
                    if (c == '\'') {
                        strM33971 = c13945.m33942(c11928, '\'');
                        c13945.m33952();
                        if (c13945.f44209 != ':') {
                            throw new C4251("syntax error, " + c13945.m33977());
                        }
                    } else {
                        strM33971 = c13945.m33971(c11928);
                        c13945.m33952();
                        char c2 = c13945.f44209;
                        if (c2 != ':') {
                            throw new C4251("expect ':' at " + c13945.f44214 + ", actual " + c2);
                        }
                    }
                }
                c13945.m33935();
                c13945.m33952();
                c13945.f44205 = 0;
                Object objM9107 = null;
                if (strM33971 != "@type" || c13945.m33947(EnumC7234.DisableSpecialKeyDetect)) {
                    c13945.m33956();
                    c2759.m9116(c15657);
                    if (c13945.f44222 == 8) {
                        c13945.m33956();
                    } else {
                        objM9107 = c2759.m9107(strM33971, type);
                    }
                    map.put(strM33971, objM9107);
                    if (c2759.f9124 == 1) {
                        c2759.m9114(map, strM33971);
                    }
                    c2759.m9109(c15657, objM9107, strM33971);
                    int i = c13945.f44222;
                    if (i != 20 && i != 15) {
                        if (i == 13) {
                            c13945.m33956();
                            c2759.m9116(c15657);
                            return map;
                        }
                    }
                    c2759.m9116(c15657);
                    return map;
                }
                Class clsM33059 = c13420.m33059(c13945.m33942(c11928, '\"'), c13945.f44213, null);
                if (clsM33059 != map.getClass()) {
                    InterfaceC3725 interfaceC3725M33061 = c13420.m33061((Type) clsM33059);
                    c13945.m33973(16);
                    c2759.f9124 = 2;
                    if (c15657 != null && !(obj instanceof Integer)) {
                        c2759.m9117();
                    }
                    Map map2 = (Map) interfaceC3725M33061.mo12124(c2759, clsM33059, obj);
                    c2759.m9116(c15657);
                    return map2;
                }
                c13945.m33973(16);
                if (c13945.f44222 == 13) {
                    c13945.m33973(16);
                    c2759.m9116(c15657);
                    return map;
                }
            } catch (Throwable th) {
                c2759.m9116(c15657);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m46356(C2759 c2759, Map map, Type type, Type type2) {
        Object obj;
        C13945 c13945 = c2759.f9128;
        C13420 c13420 = c2759.f9130;
        int i = c13945.f44222;
        if (i != 12 && i != 16) {
            throw new C4251("syntax error, expect {, actual ".concat(C11109.m28059(i)));
        }
        InterfaceC3725 interfaceC3725M33061 = c13420.m33061(type);
        InterfaceC3725 interfaceC3725M33062 = c13420.m33061(type2);
        c13945.m33956();
        C15657 c15657 = c2759.f9133;
        while (true) {
            try {
                int i2 = c13945.f44222;
                if (i2 == 13) {
                    c13945.m33973(16);
                    c2759.m9116(c15657);
                    return map;
                }
                if (i2 == 4 && c13945.f44205 == 4 && c13945.f44211.startsWith("$ref", c13945.f44216 + 1) && !c13945.m33947(EnumC7234.DisableSpecialKeyDetect)) {
                    c13945.m33980();
                    if (c13945.f44222 != 4) {
                        throw new C4251("illegal ref, " + C11109.m28059(i2));
                    }
                    String strM33979 = c13945.m33979();
                    if ("..".equals(strM33979)) {
                        obj = c15657.f50881.f50882;
                    } else if ("$".equals(strM33979)) {
                        C15657 c15658 = c15657;
                        while (true) {
                            C15657 c15659 = c15658.f50881;
                            if (c15659 == null) {
                                break;
                            }
                            c15658 = c15659;
                        }
                        obj = c15658.f50882;
                    } else {
                        c2759.m9115(new C9470(c15657, strM33979));
                        c2759.f9124 = 1;
                        obj = null;
                    }
                    c13945.m33973(13);
                    if (c13945.f44222 != 13) {
                        throw new C4251("illegal ref");
                    }
                    c13945.m33973(16);
                    c2759.m9116(c15657);
                    return obj;
                }
                if (map.size() == 0 && i2 == 4 && "@type".equals(c13945.m33979()) && !c13945.m33947(EnumC7234.DisableSpecialKeyDetect)) {
                    c13945.m33980();
                    c13945.m33973(16);
                    if (c13945.f44222 == 13) {
                        c13945.m33956();
                        c2759.m9116(c15657);
                        return map;
                    }
                    c13945.m33956();
                }
                Object objMo12124 = interfaceC3725M33061.mo12124(c2759, type, null);
                if (c13945.f44222 != 17) {
                    throw new C4251("syntax error, expect :, actual " + c13945.f44222);
                }
                c13945.m33956();
                Object objMo12125 = interfaceC3725M33062.mo12124(c2759, type2, objMo12124);
                if (c2759.f9124 == 1) {
                    c2759.m9114(map, objMo12124);
                }
                map.put(objMo12124, objMo12125);
                if (c13945.f44222 == 16) {
                    c13945.m33956();
                }
            } catch (Throwable th) {
                c2759.m9116(c15657);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m46357(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentMapC17249.class) {
            return new ConcurrentMapC17249();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == C14691.class) {
            return new C14691();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return m46357(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C4251("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C4251("unsupport type " + type, (Throwable) e);
        }
    }
}
