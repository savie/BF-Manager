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

/* JADX INFO: renamed from: l.ۚۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: KAVD */
/* JADX INFO: loaded from: classes3.dex */
public final class C5127 implements InterfaceC7950 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5127 f17839 = new C5127();

    @Override // l.InterfaceC7950
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1395(C14265 c14265, Type type, Object obj) {
        C2974 c2974 = c14265.f46690;
        if (type != C15676.class) {
            if (c2974.f11130 == 8) {
                c2974.m8850(16);
                return null;
            }
            Map mapM14282 = m14282(type);
            C22061 c22061 = c14265.f46689;
            try {
                c14265.m34399(c22061, mapM14282, obj);
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type type2 = parameterizedType.getActualTypeArguments()[0];
                    Type type3 = parameterizedType.getActualTypeArguments()[1];
                    if (String.class == type2) {
                        return m14283(c14265, obj, type3, mapM14282);
                    }
                    return m14281(c14265, mapM14282, type2, type3);
                }
                return c14265.m34409(mapM14282, obj);
            } finally {
                c14265.m34405(c22061);
            }
        }
        return (C15676) c14265.m34409((c2974.f11142 & EnumC9326.OrderedField.f31669) != 0 ? new C15676(new LinkedHashMap()) : new C15676(), null);
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
    public static Map m14283(C14265 c14265, Object obj, Type type, Map map) {
        String strM8848;
        C2974 c2974 = c14265.f46690;
        C0893 c0893 = c14265.f46686;
        C6538 c6538 = c14265.f46682;
        if (c2974.f11130 != 12) {
            throw new C20614("syntax error, expect {, actual " + c2974.f11130);
        }
        C22061 c22061 = c14265.f46689;
        while (true) {
            try {
                c2974.m8843();
                char c = c2974.f11134;
                while (c == ',') {
                    c2974.m8823();
                    c2974.m8843();
                    c = c2974.f11134;
                }
                if (c == '\"') {
                    strM8848 = c2974.m8828(c6538, '\"');
                    c2974.m8843();
                    if (c2974.f11134 != ':') {
                        throw new C20614("syntax error, " + c2974.m8822());
                    }
                } else {
                    if (c == '}') {
                        c2974.m8823();
                        c2974.f11131 = 0;
                        c2974.m8850(16);
                        c14265.m34405(c22061);
                        return map;
                    }
                    if (c == '\'') {
                        strM8848 = c2974.m8828(c6538, '\'');
                        c2974.m8843();
                        if (c2974.f11134 != ':') {
                            throw new C20614("syntax error, " + c2974.m8822());
                        }
                    } else {
                        strM8848 = c2974.m8848(c6538);
                        c2974.m8843();
                        char c2 = c2974.f11134;
                        if (c2 != ':') {
                            throw new C20614("expect ':' at " + c2974.f11138 + ", actual " + c2);
                        }
                    }
                }
                c2974.m8823();
                c2974.m8843();
                c2974.f11131 = 0;
                Object objM34397 = null;
                if (strM8848 != "@type" || c2974.m8833(EnumC9326.DisableSpecialKeyDetect)) {
                    c2974.m8839();
                    c14265.m34405(c22061);
                    if (c2974.f11130 == 8) {
                        c2974.m8839();
                    } else {
                        objM34397 = c14265.m34397(strM8848, type);
                    }
                    map.put(strM8848, objM34397);
                    if (c14265.f46685 == 1) {
                        c14265.m34404(map, strM8848);
                    }
                    c14265.m34399(c22061, objM34397, strM8848);
                    int i = c2974.f11130;
                    if (i != 20 && i != 15) {
                        if (i == 13) {
                            c2974.m8839();
                            c14265.m34405(c22061);
                            return map;
                        }
                    }
                    c14265.m34405(c22061);
                    return map;
                }
                Class clsM3567 = c0893.m3567(c2974.m8828(c6538, '\"'), c2974.f11142, null);
                if (clsM3567 != map.getClass()) {
                    InterfaceC7950 interfaceC7950M3569 = c0893.m3569((Type) clsM3567);
                    c2974.m8850(16);
                    c14265.f46685 = 2;
                    if (c22061 != null && !(obj instanceof Integer)) {
                        c14265.m34408();
                    }
                    Map map2 = (Map) interfaceC7950M3569.mo1395(c14265, clsM3567, obj);
                    c14265.m34405(c22061);
                    return map2;
                }
                c2974.m8850(16);
                if (c2974.f11130 == 13) {
                    c2974.m8850(16);
                    c14265.m34405(c22061);
                    return map;
                }
            } catch (Throwable th) {
                c14265.m34405(c22061);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m14281(C14265 c14265, Map map, Type type, Type type2) {
        Object obj;
        C2974 c2974 = c14265.f46690;
        C0893 c0893 = c14265.f46686;
        int i = c2974.f11130;
        if (i != 12 && i != 16) {
            throw new C20614("syntax error, expect {, actual ".concat(C0735.m3199(i)));
        }
        InterfaceC7950 interfaceC7950M3569 = c0893.m3569(type);
        InterfaceC7950 interfaceC7950M35610 = c0893.m3569(type2);
        c2974.m8839();
        C22061 c22061 = c14265.f46689;
        while (true) {
            try {
                int i2 = c2974.f11130;
                if (i2 == 13) {
                    c2974.m8850(16);
                    c14265.m34405(c22061);
                    return map;
                }
                if (i2 == 4 && c2974.f11131 == 4 && c2974.f11132.startsWith("$ref", c2974.f11141 + 1) && !c2974.m8833(EnumC9326.DisableSpecialKeyDetect)) {
                    c2974.m8864();
                    if (c2974.f11130 != 4) {
                        throw new C20614("illegal ref, " + C0735.m3199(i2));
                    }
                    String strM8840 = c2974.m8840();
                    if ("..".equals(strM8840)) {
                        obj = c22061.f71486.f71487;
                    } else if ("$".equals(strM8840)) {
                        C22061 c22062 = c22061;
                        while (true) {
                            C22061 c22063 = c22062.f71486;
                            if (c22063 == null) {
                                break;
                            }
                            c22062 = c22063;
                        }
                        obj = c22062.f71487;
                    } else {
                        c14265.m34406(new C23437(c22061, strM8840));
                        c14265.f46685 = 1;
                        obj = null;
                    }
                    c2974.m8850(13);
                    if (c2974.f11130 != 13) {
                        throw new C20614("illegal ref");
                    }
                    c2974.m8850(16);
                    c14265.m34405(c22061);
                    return obj;
                }
                if (map.size() == 0 && i2 == 4 && "@type".equals(c2974.m8840()) && !c2974.m8833(EnumC9326.DisableSpecialKeyDetect)) {
                    c2974.m8864();
                    c2974.m8850(16);
                    if (c2974.f11130 == 13) {
                        c2974.m8839();
                        c14265.m34405(c22061);
                        return map;
                    }
                    c2974.m8839();
                }
                Object objMo1395 = interfaceC7950M3569.mo1395(c14265, type, null);
                if (c2974.f11130 != 17) {
                    throw new C20614("syntax error, expect :, actual " + c2974.f11130);
                }
                c2974.m8839();
                Object objMo1396 = interfaceC7950M35610.mo1395(c14265, type2, objMo1395);
                if (c14265.f46685 == 1) {
                    c14265.m34404(map, objMo1395);
                }
                map.put(objMo1395, objMo1396);
                if (c2974.f11130 == 16) {
                    c2974.m8839();
                }
            } catch (Throwable th) {
                c14265.m34405(c22061);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Map m14282(Type type) {
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
        if (type == ConcurrentMap.class || type == ConcurrentMapC13783.class) {
            return new ConcurrentMapC13783();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == C15676.class) {
            return new C15676();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            if (EnumMap.class.equals(rawType)) {
                return new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]);
            }
            return m14282(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new C20614("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e) {
            throw new C20614("unsupport type " + type, (Throwable) e);
        }
    }
}
