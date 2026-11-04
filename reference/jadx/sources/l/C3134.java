package l;

import com.alipay.sdk.m.y.l;
import com.umeng.analytics.pro.am;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import org.simpleframework.xml.transform.ClassTransform;

/* JADX INFO: renamed from: l.ۗۗܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes2.dex */
public final class C3134 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static volatile Method f10147 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f10148 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static volatile Method f10149 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f10150 = false;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static volatile Class f10151 = null;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static volatile Method f10152 = null;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static volatile Constructor f10153 = null;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC17249 f10154;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static boolean f10155 = true;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f10156;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static volatile HashMap f10157;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static volatile boolean f10158;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static volatile boolean f10159;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m10232(Class cls) {
        if (f10151 == null && !f10159) {
            try {
                f10151 = InterfaceC13490.class;
            } catch (Throwable unused) {
                f10159 = true;
            }
        }
        if (f10151 == null) {
            return false;
        }
        return cls.isAnnotationPresent(f10151);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String[] m10242(Class cls) {
        if (f10153 == null && !f10158) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f10153 = cls2.getConstructor(Class.class);
                f10152 = cls2.getMethod("getConstructors", null);
                f10149 = InterfaceC13751.class.getMethod("getParameters", null);
                f10147 = InterfaceC4607.class.getMethod("getName", null);
            } catch (Throwable unused) {
                f10158 = true;
            }
        }
        if (f10153 == null || f10156) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f10152.invoke(f10153.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f10149.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) f10149.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) f10147.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable unused2) {
            f10156 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Byte m10243(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new C4251(C14483.m34971("can not cast to byte, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final Short m10233(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new C4251(C14483.m34971("can not cast to short, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal m10221(Object obj) {
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigDecimal(string);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final BigInteger m10241(Object obj) {
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Float m10234(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new C4251(C14483.m34971("can not cast to float, value : ", obj));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final Double m10235(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new C4251(C14483.m34971("can not cast to double, value : ", obj));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final Date m10236(Object obj) {
        long jLongValue;
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            jLongValue = (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
        } else if (obj instanceof Number) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof String) {
            String str = (String) obj;
            if (str.indexOf(45) != -1) {
                int length = str.length();
                String str2 = AbstractC12454.f40026;
                if (length != str2.length()) {
                    if (str.length() == 10) {
                        str2 = "yyyy-MM-dd";
                    } else if (str.length() == 19) {
                        str2 = "yyyy-MM-dd HH:mm:ss";
                    } else {
                        str2 = (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, AbstractC12454.f40023);
                simpleDateFormat.setTimeZone(AbstractC12454.f40024);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new C4251("can not cast to Date, value : ".concat(str));
                }
            }
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            jLongValue = Long.parseLong(str);
        } else {
            jLongValue = -1;
        }
        if (jLongValue >= 0) {
            return new Date(jLongValue);
        }
        throw new C4251(C14483.m34971("can not cast to Date, value : ", obj));
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final Long m10212(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            return (iScale < -100 || iScale > 100) ? Long.valueOf(bigDecimal.longValueExact()) : Long.valueOf(bigDecimal.longValue());
        }
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                C13945 c13945 = new C13945(str);
                Calendar calendar = c13945.m33975(false) ? c13945.f44219 : null;
                c13945.m33972();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new C4251(C14483.m34971("can not cast to long, value : ", obj));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Integer m10228(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            return (iScale < -100 || iScale > 100) ? Integer.valueOf(bigDecimal.intValueExact()) : Integer.valueOf(bigDecimal.intValue());
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (!(obj instanceof String)) {
            throw new C4251(C14483.m34971("can not cast to int, value : ", obj));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final Boolean m10229(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(((BigDecimal) obj).intValueExact() == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new C4251(C14483.m34971("can not cast to int, value : ", obj));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m10218(Map map, Class cls, C13420 c13420) {
        return m10215((Object) map, cls, c13420);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m10215(Object obj, Class cls, C13420 c13420) {
        Calendar calendar;
        if (obj == null) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls != obj.getClass()) {
            if (!(obj instanceof Map)) {
                int i = 0;
                if (cls.isArray()) {
                    if (obj instanceof Collection) {
                        Collection collection = (Collection) obj;
                        Object objNewInstance = Array.newInstance(cls.getComponentType(), collection.size());
                        Iterator it = collection.iterator();
                        while (it.hasNext()) {
                            Array.set(objNewInstance, i, m10215(it.next(), (Class) cls.getComponentType(), c13420));
                            i++;
                        }
                        return objNewInstance;
                    }
                    if (cls == byte[].class) {
                        if (obj instanceof byte[]) {
                            return (byte[]) obj;
                        }
                        if (!(obj instanceof String)) {
                            throw new C4251(C14483.m34971("can not cast to int, value : ", obj));
                        }
                        String str = (String) obj;
                        return C13945.m33930(0, str.length(), str);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        return m10229(obj);
                    }
                    if (cls == Byte.TYPE || cls == Byte.class) {
                        return m10243(obj);
                    }
                    if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                        String str2 = (String) obj;
                        if (str2.length() == 1) {
                            return Character.valueOf(str2.charAt(0));
                        }
                    }
                    if (cls == Short.TYPE || cls == Short.class) {
                        return m10233(obj);
                    }
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return m10228(obj);
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return m10212(obj);
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return m10234(obj);
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return m10235(obj);
                    }
                    if (cls == String.class) {
                        return obj.toString();
                    }
                    if (cls == BigDecimal.class) {
                        return m10221(obj);
                    }
                    if (cls == BigInteger.class) {
                        return m10241(obj);
                    }
                    if (cls == Date.class) {
                        return m10236(obj);
                    }
                    if (cls.isEnum()) {
                        try {
                            if (obj instanceof String) {
                                String str3 = (String) obj;
                                if (str3.length() == 0) {
                                    return null;
                                }
                                return Enum.valueOf(cls, str3);
                            }
                            if ((obj instanceof Integer) || (obj instanceof Long)) {
                                int iIntValue = ((Number) obj).intValue();
                                Object[] enumConstants = cls.getEnumConstants();
                                if (iIntValue < enumConstants.length) {
                                    return enumConstants[iIntValue];
                                }
                            }
                            throw new C4251("can not cast to : ".concat(cls.getName()));
                        } catch (Exception e) {
                            throw new C4251("can not cast to : ".concat(cls.getName()), (Throwable) e);
                        }
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateM10236 = m10236(obj);
                        if (cls == Calendar.class) {
                            calendar = Calendar.getInstance(AbstractC12454.f40024, AbstractC12454.f40023);
                        } else {
                            try {
                                calendar = (Calendar) cls.newInstance();
                            } catch (Exception e2) {
                                throw new C4251("can not cast to : ".concat(cls.getName()), (Throwable) e2);
                            }
                        }
                        calendar.setTime(dateM10236);
                        return calendar;
                    }
                    if (obj instanceof String) {
                        String str4 = (String) obj;
                        if (str4.length() == 0 || "null".equals(str4)) {
                            return null;
                        }
                        if (cls == Currency.class) {
                            return Currency.getInstance(str4);
                        }
                    }
                    throw new C4251("can not cast to : ".concat(cls.getName()));
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey("@type")) {
                    return m10238(map, cls, c13420);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m10217(Object obj, Type type, C13420 c13420) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return m10215(obj, (Class) type, c13420);
        }
        if (type instanceof ParameterizedType) {
            return m10216(obj, (ParameterizedType) type, c13420);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new C4251("can not cast to : " + type);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m10216(Object obj, ParameterizedType parameterizedType, C13420 c13420) {
        Object objM10217;
        Collection hashSet;
        Object objM10218;
        if (obj == null) {
            return obj;
        }
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object obj2 = list.get(i);
                    if (type instanceof Class) {
                        if (obj2 != null && obj2.getClass() == C14691.class) {
                            objM10217 = ((C14691) obj2).m35339((Class) type, c13420);
                        } else {
                            objM10217 = m10215(obj2, (Class) type, c13420);
                        }
                    } else {
                        objM10217 = m10217(obj2, type, c13420);
                    }
                    arrayList.add(objM10217);
                }
                return arrayList;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                if (rawType != Set.class && rawType != HashSet.class) {
                    if (rawType == TreeSet.class) {
                        hashSet = new TreeSet();
                    } else {
                        hashSet = new ArrayList();
                    }
                } else {
                    hashSet = new HashSet();
                }
                for (Object obj3 : (Iterable) obj) {
                    if (type2 instanceof Class) {
                        if (obj3 != null && obj3.getClass() == C14691.class) {
                            objM10218 = ((C14691) obj3).m35339((Class) type2, c13420);
                        } else {
                            objM10218 = m10215(obj3, (Class) type2, c13420);
                        }
                    } else {
                        objM10218 = m10217(obj3, type2, c13420);
                    }
                    hashSet.add(objM10218);
                }
                return hashSet;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    map.put(m10217(entry.getKey(), type3, c13420), m10217(entry.getValue(), type4, c13420));
                }
                return map;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return m10217(obj, rawType, c13420);
        }
        throw new C4251("can not cast to : " + parameterizedType);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final Object m10238(Map map, Class cls, C13420 c13420) {
        C14691 c14691;
        int iIntValue = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    if (number instanceof BigDecimal) {
                        iIntValue = ((BigDecimal) number).intValueExact();
                    } else {
                        iIntValue = number.intValue();
                    }
                }
                return new StackTraceElement(str, str2, str3, iIntValue);
            }
            Object obj = map.get("@type");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (c13420 == null) {
                    c13420 = C13420.f42747;
                }
                Class clsM33059 = c13420.m33059(str4, 0, null);
                if (clsM33059 == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!clsM33059.equals(cls)) {
                    return m10238(map, clsM33059, c13420);
                }
            }
            if (cls.isInterface()) {
                if (map instanceof C14691) {
                    c14691 = (C14691) map;
                } else {
                    c14691 = new C14691(map);
                }
                if (c13420 == null) {
                    c13420 = C13420.f42747;
                }
                if (c13420.m33061((Type) cls) == null) {
                    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, c14691);
                }
                C2759 c2759 = new C2759(AbstractC12454.m30927(c14691), C13420.f42747, AbstractC12454.f40027);
                Object objM9107 = c2759.m9107((String) null, cls);
                c2759.m9118();
                c2759.close();
                return objM9107;
            }
            if (cls == String.class && (map instanceof C14691)) {
                return map.toString();
            }
            if (c13420 == null) {
                c13420 = C13420.f42747;
            }
            InterfaceC3725 interfaceC3725M33061 = c13420.m33061((Type) cls);
            C5217 c5217 = interfaceC3725M33061 instanceof C5217 ? (C5217) interfaceC3725M33061 : null;
            if (c5217 == null) {
                throw new C4251("can not get javaBeanDeserializer");
            }
            return c5217.m15695(map, c13420);
        } catch (Exception e) {
            throw new C4251(e.getMessage(), (Throwable) e);
        }
    }

    static {
        ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(36, 0.75f, 1);
        f10154 = concurrentMapC17249;
        concurrentMapC17249.put(ClassTransform.BYTE, Byte.TYPE);
        concurrentMapC17249.put(ClassTransform.SHORT, Short.TYPE);
        concurrentMapC17249.put(ClassTransform.INTEGER, Integer.TYPE);
        concurrentMapC17249.put(ClassTransform.LONG, Long.TYPE);
        concurrentMapC17249.put(ClassTransform.FLOAT, Float.TYPE);
        concurrentMapC17249.put(ClassTransform.DOUBLE, Double.TYPE);
        concurrentMapC17249.put(ClassTransform.BOOLEAN, Boolean.TYPE);
        concurrentMapC17249.put(ClassTransform.CHARACTER, Character.TYPE);
        concurrentMapC17249.put("[byte", byte[].class);
        concurrentMapC17249.put("[short", short[].class);
        concurrentMapC17249.put("[int", int[].class);
        concurrentMapC17249.put("[long", long[].class);
        concurrentMapC17249.put("[float", float[].class);
        concurrentMapC17249.put("[double", double[].class);
        concurrentMapC17249.put("[boolean", boolean[].class);
        concurrentMapC17249.put("[char", char[].class);
        concurrentMapC17249.put("[B", byte[].class);
        concurrentMapC17249.put("[S", short[].class);
        concurrentMapC17249.put("[I", int[].class);
        concurrentMapC17249.put("[J", long[].class);
        concurrentMapC17249.put("[F", float[].class);
        concurrentMapC17249.put("[D", double[].class);
        concurrentMapC17249.put("[C", char[].class);
        concurrentMapC17249.put("[Z", boolean[].class);
        concurrentMapC17249.put("java.util.HashMap", HashMap.class);
        concurrentMapC17249.put("java.util.TreeMap", TreeMap.class);
        concurrentMapC17249.put("java.util.Date", Date.class);
        concurrentMapC17249.put("com.alibaba.fastjson.JSONObject", C14691.class);
        concurrentMapC17249.put("java.util.concurrent.ConcurrentHashMap", ConcurrentMapC17249.class);
        concurrentMapC17249.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentMapC17249.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentMapC17249.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Class m10230(String str) {
        return (Class) f10154.get(str);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Class m10244(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new C4251("className too long. ".concat(str));
        }
        ConcurrentMapC17249 concurrentMapC17249 = f10154;
        Class<?> cls = (Class) concurrentMapC17249.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class clsM10244 = m10244(str.substring(1));
            if (clsM10244 == null) {
                return null;
            }
            return Array.newInstance((Class<?>) clsM10244, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return m10244(str.substring(1, str.length() - 1));
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null) {
                return contextClassLoader.loadClass(str);
            }
        } catch (Exception unused) {
        }
        try {
            cls = Class.forName(str);
            concurrentMapC17249.put(str, cls);
            return cls;
        } catch (Exception unused2) {
            return cls;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:107:0x0208 A[LOOP:5: B:103:0x01f3->B:107:0x0208, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x0212  */
    /* JADX WARN: Code duplicated, block: B:111:0x021d  */
    /* JADX WARN: Code duplicated, block: B:114:0x022d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0233  */
    /* JADX WARN: Code duplicated, block: B:117:0x0239 A[PHI: r28 r29 r30
      0x0239: PHI (r28v3 l.֡ܶܺ) = (r24v5 l.֡ܶܺ), (r24v5 l.֡ܶܺ), (r28v5 l.֡ܶܺ), (r28v6 l.֡ܶܺ) binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r29v3 int) = (r7v1 int), (r7v1 int), (r29v5 int), (r29v6 int) binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]
      0x0239: PHI (r30v7 java.lang.Class<? super ? super java.lang.Object>) = 
      (r25v2 java.lang.Class<? super ? super java.lang.Object>)
      (r25v2 java.lang.Class<? super ? super java.lang.Object>)
      (r30v9 java.lang.Class<? super ? super java.lang.Object>)
      (r30v10 java.lang.Class<? super ? super java.lang.Object>)
     binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:118:0x023d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0253  */
    /* JADX WARN: Code duplicated, block: B:121:0x0278  */
    /* JADX WARN: Code duplicated, block: B:122:0x027f  */
    /* JADX WARN: Code duplicated, block: B:125:0x028d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0294  */
    /* JADX WARN: Code duplicated, block: B:130:0x029d  */
    /* JADX WARN: Code duplicated, block: B:132:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:135:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:136:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:138:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:139:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:141:0x02de  */
    /* JADX WARN: Code duplicated, block: B:147:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0300  */
    /* JADX WARN: Code duplicated, block: B:151:0x0308  */
    /* JADX WARN: Code duplicated, block: B:154:0x0317  */
    /* JADX WARN: Code duplicated, block: B:156:0x032d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0333  */
    /* JADX WARN: Code duplicated, block: B:161:0x033f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:165:0x0377  */
    /* JADX WARN: Code duplicated, block: B:168:0x0388  */
    /* JADX WARN: Code duplicated, block: B:202:0x043f  */
    /* JADX WARN: Code duplicated, block: B:310:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:311:0x01ff A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:132:0x02a8, please report this as an issue */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m10222(Class cls, int i, InterfaceC10216 interfaceC10216, boolean z, EnumC0522 enumC0522) {
        Class<? super Object> cls2;
        boolean z2;
        String[] strArrOrders;
        int i2;
        int i3;
        String[] strArr;
        boolean z3;
        Field[] fieldArr;
        Class<? super Object> cls3;
        EnumC0522 enumC0523;
        Annotation[][] annotationArr;
        short[] sArr;
        Annotation[][] parameterAnnotations;
        short[] sArr2;
        Constructor<?>[] constructorArr;
        InterfaceC19167 interfaceC19167;
        Annotation[][] annotationArr2;
        int iM5815;
        int iOrdinal;
        Field[] fieldArr2;
        EnumC0522 enumC0524;
        String strSubstring;
        int i4;
        InterfaceC19167 interfaceC19168;
        char cCharAt;
        String strM10219;
        Field fieldM10220;
        InterfaceC19167 interfaceC19169;
        boolean z4;
        EnumC0522 enumC0525;
        short[] sArr3;
        String[] strArrM10242;
        short[] sArr4;
        int i5;
        Annotation[] annotationArr3;
        int length;
        int i6;
        Annotation annotation;
        Annotation[] annotationArr4;
        String[] strArr2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap map = new HashMap();
        Field[] declaredFields = cls.getDeclaredFields();
        boolean zM10232 = m10232(cls);
        ArrayList<Method> arrayList = new ArrayList();
        Class superclass = cls;
        while (true) {
            cls2 = Object.class;
            if (superclass == null || superclass == cls2) {
                break;
            }
            for (Method method : superclass.getDeclaredMethods()) {
                int modifiers = method.getModifiers();
                if ((modifiers & 8) == 0 && (modifiers & 2) == 0 && (modifiers & 256) == 0 && (modifiers & 4) == 0 && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && method.getReturnType() != ClassLoader.class && method.getDeclaringClass() != cls2) {
                    arrayList.add(method);
                }
            }
            superclass = superclass.getSuperclass();
        }
        String[] strArr3 = null;
        int i7 = i;
        EnumC0522 enumC0526 = enumC0522;
        short[] sArr5 = null;
        Constructor<?>[] declaredConstructors = null;
        String[] strArr4 = null;
        Annotation[][] annotationArr5 = null;
        for (Method method2 : arrayList) {
            String name = method2.getName();
            short[] sArr6 = sArr5;
            if (name.equals("getMetaClass")) {
                z3 = true;
                strArr = strArr4;
                if (method2.getReturnType().getName().equals("groovy.lang.MetaClass")) {
                    annotationArr = annotationArr5;
                    enumC0523 = enumC0526;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                }
                sArr5 = sArr6;
                strArr4 = strArr;
                annotationArr5 = annotationArr;
                enumC0526 = enumC0523;
                cls2 = cls3;
                declaredFields = fieldArr;
            } else {
                strArr = strArr4;
                z3 = true;
            }
            InterfaceC19167 interfaceC19167M10223 = (InterfaceC19167) method2.getAnnotation(InterfaceC19167.class);
            if (interfaceC19167M10223 == null) {
                interfaceC19167M10223 = m10223(method2, cls);
            }
            if (zM10232) {
                annotationArr = annotationArr5;
                if (f10157 != null || f10150) {
                    enumC0523 = enumC0526;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                } else {
                    enumC0523 = enumC0526;
                    try {
                        HashMap map2 = new HashMap();
                        cls3 = cls2;
                        try {
                            int i8 = C18227.f59508;
                            fieldArr = declaredFields;
                            try {
                                map2.put(C18227.class, new String[]{"getEndInclusive", "isEmpty"});
                                int i9 = C1074.f3853;
                                map2.put(C1074.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(C2565.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.۟ۡ᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.֡ۡ᩵"), new String[]{"getEndInclusive", "isEmpty"});
                                f10157 = map2;
                            } catch (Throwable unused) {
                                f10150 = z3;
                            }
                        } catch (Throwable unused2) {
                            fieldArr = declaredFields;
                            f10150 = z3;
                            if (f10157 != null) {
                                sArr5 = sArr6;
                                strArr4 = strArr;
                                annotationArr5 = annotationArr;
                                enumC0526 = enumC0523;
                                cls2 = cls3;
                                declaredFields = fieldArr;
                            }
                            if (interfaceC19167M10223 == null) {
                                interfaceC19167M10223 = interfaceC19167M10223;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC19167 = interfaceC19167M10223;
                                annotationArr2 = parameterAnnotations;
                            } else {
                                interfaceC19167M10223 = interfaceC19167M10223;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC19167 = interfaceC19167M10223;
                                annotationArr2 = parameterAnnotations;
                            }
                            if (interfaceC19167 != null) {
                                if (interfaceC19167.serialize()) {
                                    iOrdinal = interfaceC19167.ordinal();
                                    iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                                    if (interfaceC19167.name().length() != 0) {
                                        String strName = interfaceC19167.name();
                                        m10225(cls, method2, i7);
                                        enumC0523 = enumC0523;
                                        i7 = i7;
                                        cls3 = cls3;
                                        linkedHashMap.put(strName, new C16558(strName, method2, null, cls, null, iOrdinal, iM5815, interfaceC19167, null));
                                    }
                                } else {
                                    i7 = i7;
                                    enumC0523 = enumC0523;
                                    cls3 = cls3;
                                }
                                fieldArr2 = fieldArr;
                                fieldArr2 = fieldArr2;
                                enumC0526 = enumC0523;
                                i7 = i7;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                iM5815 = 0;
                                iOrdinal = 0;
                            }
                            if (name.startsWith("get")) {
                                if (name.length() >= 4) {
                                    if (name.equals("getClass")) {
                                        fieldArr2 = fieldArr;
                                    } else {
                                        cCharAt = name.charAt(3);
                                        if (Character.isUpperCase(cCharAt)) {
                                            strM10219 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                        } else if (cCharAt == '_') {
                                            strM10219 = name.substring(4);
                                        } else if (cCharAt == 'f') {
                                            strM10219 = name.substring(3);
                                        } else if (name.length() < 5) {
                                        }
                                        if (m10226(cls, interfaceC10216, strM10219)) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            fieldArr2 = fieldArr;
                                            fieldM10220 = m10220(cls, strM10219, fieldArr2, map);
                                            if (fieldM10220 != null) {
                                                interfaceC19169 = (InterfaceC19167) fieldM10220.getAnnotation(InterfaceC19167.class);
                                                if (interfaceC19169 != null) {
                                                    if (interfaceC19169.serialize()) {
                                                        iOrdinal = interfaceC19169.ordinal();
                                                        iM5815 = EnumC1643.m5815(interfaceC19169.serialzeFeatures());
                                                        if (interfaceC19169.name().length() != 0) {
                                                            strM10219 = interfaceC19169.name();
                                                            z4 = true;
                                                        }
                                                    }
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                InterfaceC19167 interfaceC191610 = interfaceC19169;
                                                int i10 = iOrdinal;
                                                int i11 = iM5815;
                                                enumC0525 = enumC0523;
                                                if (enumC0525 != null) {
                                                    strM10219 = enumC0525.m2483(strM10219);
                                                }
                                                String str = strM10219;
                                                m10225(cls, method2, i7);
                                                iOrdinal = i10;
                                                linkedHashMap.put(str, new C16558(str, method2, fieldM10220, cls, null, iOrdinal, i11, interfaceC19167, interfaceC191610));
                                                iM5815 = i11;
                                            } else {
                                                interfaceC19169 = null;
                                            }
                                            z4 = false;
                                            InterfaceC19167 interfaceC191611 = interfaceC19169;
                                            int i12 = iOrdinal;
                                            int i13 = iM5815;
                                            enumC0525 = enumC0523;
                                            if (enumC0525 != null) {
                                                strM10219 = enumC0525.m2483(strM10219);
                                            }
                                            String str2 = strM10219;
                                            m10225(cls, method2, i7);
                                            iOrdinal = i12;
                                            linkedHashMap.put(str2, new C16558(str2, method2, fieldM10220, cls, null, iOrdinal, i13, interfaceC19167, interfaceC191611));
                                            iM5815 = i13;
                                        }
                                    }
                                    fieldArr2 = fieldArr2;
                                    enumC0526 = enumC0523;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                enumC0524 = enumC0522;
                                fieldArr2 = fieldArr;
                                i7 = i;
                                enumC0526 = enumC0524;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                fieldArr2 = fieldArr;
                            }
                            if (name.startsWith(am.ae)) {
                                fieldArr2 = fieldArr2;
                                enumC0524 = enumC0522;
                            } else {
                                fieldArr2 = fieldArr2;
                                enumC0524 = enumC0522;
                            }
                            i7 = i;
                            enumC0526 = enumC0524;
                            declaredFields = fieldArr2;
                            annotationArr5 = annotationArr2;
                            sArr5 = sArr2;
                            declaredConstructors = constructorArr;
                            strArr4 = strArr;
                            cls2 = cls3;
                        }
                    } catch (Throwable unused3) {
                        cls3 = cls2;
                    }
                }
                if (f10157 != null && (strArr2 = (String[]) f10157.get(cls)) != null && Arrays.binarySearch(strArr2, name) >= 0) {
                    sArr5 = sArr6;
                    strArr4 = strArr;
                    annotationArr5 = annotationArr;
                    enumC0526 = enumC0523;
                    cls2 = cls3;
                    declaredFields = fieldArr;
                }
            } else {
                annotationArr = annotationArr5;
                enumC0523 = enumC0526;
                cls3 = cls2;
                fieldArr = declaredFields;
            }
            if (interfaceC19167M10223 == null || !zM10232) {
                interfaceC19167M10223 = interfaceC19167M10223;
                sArr = sArr6;
                parameterAnnotations = annotationArr;
            } else {
                if (declaredConstructors == null) {
                    declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length == 1) {
                        parameterAnnotations = declaredConstructors[0].getParameterAnnotations();
                        strArrM10242 = m10242(cls);
                        if (strArrM10242 != null) {
                            String[] strArr5 = new String[strArrM10242.length];
                            interfaceC19167M10223 = interfaceC19167M10223;
                            System.arraycopy(strArrM10242, 0, strArr5, 0, strArrM10242.length);
                            Arrays.sort(strArr5);
                            short[] sArr7 = new short[strArrM10242.length];
                            for (short s = 0; s < strArrM10242.length; s = (short) (s + 1)) {
                                sArr7[Arrays.binarySearch(strArr5, strArrM10242[s])] = s;
                            }
                            strArrM10242 = strArr5;
                            sArr3 = sArr7;
                            declaredConstructors = declaredConstructors;
                        } else {
                            interfaceC19167M10223 = interfaceC19167M10223;
                            sArr3 = sArr6;
                        }
                    }
                    if (strArrM10242 == null && sArr3 != null && name.startsWith("get")) {
                        String strM102110 = m10219(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(strArrM10242, strM102110);
                        if (iBinarySearch < 0) {
                            constructorArr = declaredConstructors;
                            int i14 = 0;
                            while (true) {
                                if (i14 < strArrM10242.length) {
                                    if (strM102110.equalsIgnoreCase(strArrM10242[i14])) {
                                        i5 = i14;
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            if (i5 >= 0 && (annotationArr3 = parameterAnnotations[sArr3[i5]]) != null) {
                                length = annotationArr3.length;
                                i6 = 0;
                                while (true) {
                                    if (i6 < length) {
                                        sArr2 = sArr3;
                                        annotation = annotationArr3[i6];
                                        annotationArr4 = annotationArr3;
                                        if (annotation instanceof InterfaceC19167) {
                                            interfaceC19167 = (InterfaceC19167) annotation;
                                            annotationArr2 = parameterAnnotations;
                                            strArr = strArrM10242;
                                        } else {
                                            i6++;
                                            sArr3 = sArr2;
                                            annotationArr3 = annotationArr4;
                                        }
                                    }
                                    if (interfaceC19167 != null) {
                                        if (interfaceC19167.serialize()) {
                                            i7 = i7;
                                            enumC0523 = enumC0523;
                                            cls3 = cls3;
                                        } else {
                                            iOrdinal = interfaceC19167.ordinal();
                                            iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                                            if (interfaceC19167.name().length() != 0) {
                                                String strName2 = interfaceC19167.name();
                                                m10225(cls, method2, i7);
                                                enumC0523 = enumC0523;
                                                i7 = i7;
                                                cls3 = cls3;
                                                linkedHashMap.put(strName2, new C16558(strName2, method2, null, cls, null, iOrdinal, iM5815, interfaceC19167, null));
                                            }
                                        }
                                        fieldArr2 = fieldArr;
                                        fieldArr2 = fieldArr2;
                                        enumC0526 = enumC0523;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        iM5815 = 0;
                                        iOrdinal = 0;
                                    }
                                    if (name.startsWith("get")) {
                                        if (name.length() >= 4) {
                                            if (name.equals("getClass")) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                cCharAt = name.charAt(3);
                                                if (Character.isUpperCase(cCharAt)) {
                                                    strM10219 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                                } else if (cCharAt == '_') {
                                                    strM10219 = name.substring(4);
                                                } else if (cCharAt == 'f') {
                                                    strM10219 = name.substring(3);
                                                } else {
                                                    if (name.length() < 5 && Character.isUpperCase(name.charAt(4))) {
                                                        strM10219 = m10219(name.substring(3));
                                                    }
                                                    i7 = i;
                                                    enumC0526 = enumC0524;
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                if (m10226(cls, interfaceC10216, strM10219)) {
                                                    fieldArr2 = fieldArr;
                                                } else {
                                                    fieldArr2 = fieldArr;
                                                    fieldM10220 = m10220(cls, strM10219, fieldArr2, map);
                                                    if (fieldM10220 != null) {
                                                        interfaceC19169 = (InterfaceC19167) fieldM10220.getAnnotation(InterfaceC19167.class);
                                                        if (interfaceC19169 != null) {
                                                            if (interfaceC19169.serialize()) {
                                                                iOrdinal = interfaceC19169.ordinal();
                                                                iM5815 = EnumC1643.m5815(interfaceC19169.serialzeFeatures());
                                                                if (interfaceC19169.name().length() != 0) {
                                                                    strM10219 = interfaceC19169.name();
                                                                    z4 = true;
                                                                }
                                                            }
                                                            declaredFields = fieldArr2;
                                                            annotationArr5 = annotationArr2;
                                                            sArr5 = sArr2;
                                                            declaredConstructors = constructorArr;
                                                            strArr4 = strArr;
                                                            cls2 = cls3;
                                                        }
                                                        InterfaceC19167 interfaceC191612 = interfaceC19169;
                                                        int i15 = iOrdinal;
                                                        int i16 = iM5815;
                                                        enumC0525 = enumC0523;
                                                        if (enumC0525 != null && !z4) {
                                                            strM10219 = enumC0525.m2483(strM10219);
                                                        }
                                                        String str3 = strM10219;
                                                        m10225(cls, method2, i7);
                                                        iOrdinal = i15;
                                                        linkedHashMap.put(str3, new C16558(str3, method2, fieldM10220, cls, null, iOrdinal, i16, interfaceC19167, interfaceC191612));
                                                        iM5815 = i16;
                                                    } else {
                                                        interfaceC19169 = null;
                                                    }
                                                    z4 = false;
                                                    InterfaceC19167 interfaceC191613 = interfaceC19169;
                                                    int i17 = iOrdinal;
                                                    int i18 = iM5815;
                                                    enumC0525 = enumC0523;
                                                    if (enumC0525 != null) {
                                                        strM10219 = enumC0525.m2483(strM10219);
                                                    }
                                                    String str4 = strM10219;
                                                    m10225(cls, method2, i7);
                                                    iOrdinal = i17;
                                                    linkedHashMap.put(str4, new C16558(str4, method2, fieldM10220, cls, null, iOrdinal, i18, interfaceC19167, interfaceC191613));
                                                    iM5815 = i18;
                                                }
                                            }
                                            fieldArr2 = fieldArr2;
                                            enumC0526 = enumC0523;
                                            i7 = i7;
                                            declaredFields = fieldArr2;
                                            annotationArr5 = annotationArr2;
                                            sArr5 = sArr2;
                                            declaredConstructors = constructorArr;
                                            strArr4 = strArr;
                                            cls2 = cls3;
                                        }
                                        enumC0524 = enumC0522;
                                        fieldArr2 = fieldArr;
                                        i7 = i;
                                        enumC0526 = enumC0524;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        fieldArr2 = fieldArr;
                                    }
                                    if (name.startsWith(am.ae) || name.length() < 3) {
                                        fieldArr2 = fieldArr2;
                                        enumC0524 = enumC0522;
                                    } else {
                                        char cCharAt2 = name.charAt(2);
                                        if (Character.isUpperCase(cCharAt2)) {
                                            strSubstring = Character.toLowerCase(name.charAt(2)) + name.substring(3);
                                        } else if (cCharAt2 == '_') {
                                            strSubstring = name.substring(3);
                                        } else if (cCharAt2 == 'f') {
                                            strSubstring = name.substring(2);
                                        } else {
                                            fieldArr2 = fieldArr2;
                                            enumC0524 = enumC0522;
                                        }
                                        if (m10226(cls, interfaceC10216, strSubstring)) {
                                            fieldArr2 = fieldArr2;
                                            enumC0524 = enumC0522;
                                        } else {
                                            Field fieldM10221 = m10220(cls, strSubstring, fieldArr2, map);
                                            if (fieldM10221 == null) {
                                                fieldM10221 = m10220(cls, name, fieldArr2, map);
                                            }
                                            Field field = fieldM10221;
                                            if (field != null) {
                                                InterfaceC19167 interfaceC191614 = (InterfaceC19167) field.getAnnotation(InterfaceC19167.class);
                                                if (interfaceC191614 != null) {
                                                    if (interfaceC191614.serialize()) {
                                                        iOrdinal = interfaceC191614.ordinal();
                                                        iM5815 = EnumC1643.m5815(interfaceC191614.serialzeFeatures());
                                                        if (interfaceC191614.name().length() != 0) {
                                                            strSubstring = interfaceC191614.name();
                                                        }
                                                    } else {
                                                        fieldArr2 = fieldArr2;
                                                        enumC0524 = enumC0522;
                                                    }
                                                }
                                                interfaceC19168 = interfaceC191614;
                                                i4 = iM5815;
                                            } else {
                                                i4 = iM5815;
                                                interfaceC19168 = null;
                                            }
                                            enumC0524 = enumC0522;
                                            if (enumC0524 != null) {
                                                strSubstring = enumC0524.m2483(strSubstring);
                                            }
                                            String str5 = strSubstring;
                                            m10225(cls, field, i);
                                            m10225(cls, method2, i);
                                            linkedHashMap.put(str5, new C16558(str5, method2, field, cls, null, iOrdinal, i4, interfaceC19167, interfaceC19168));
                                        }
                                    }
                                    i7 = i;
                                    enumC0526 = enumC0524;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                            }
                            sArr4 = sArr3;
                        } else {
                            constructorArr = declaredConstructors;
                        }
                        i5 = iBinarySearch;
                        if (i5 >= 0) {
                            length = annotationArr3.length;
                            i6 = 0;
                            while (true) {
                                if (i6 < length) {
                                    sArr2 = sArr3;
                                    annotation = annotationArr3[i6];
                                    annotationArr4 = annotationArr3;
                                    if (annotation instanceof InterfaceC19167) {
                                        interfaceC19167 = (InterfaceC19167) annotation;
                                        annotationArr2 = parameterAnnotations;
                                        strArr = strArrM10242;
                                    } else {
                                        i6++;
                                        sArr3 = sArr2;
                                        annotationArr3 = annotationArr4;
                                    }
                                }
                                if (interfaceC19167 != null) {
                                    if (interfaceC19167.serialize()) {
                                        i7 = i7;
                                        enumC0523 = enumC0523;
                                        cls3 = cls3;
                                    } else {
                                        iOrdinal = interfaceC19167.ordinal();
                                        iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                                        if (interfaceC19167.name().length() != 0) {
                                            String strName3 = interfaceC19167.name();
                                            m10225(cls, method2, i7);
                                            enumC0523 = enumC0523;
                                            i7 = i7;
                                            cls3 = cls3;
                                            linkedHashMap.put(strName3, new C16558(strName3, method2, null, cls, null, iOrdinal, iM5815, interfaceC19167, null));
                                        }
                                    }
                                    fieldArr2 = fieldArr;
                                    fieldArr2 = fieldArr2;
                                    enumC0526 = enumC0523;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    iM5815 = 0;
                                    iOrdinal = 0;
                                }
                                if (name.startsWith("get")) {
                                    if (name.length() >= 4) {
                                        if (name.equals("getClass")) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            cCharAt = name.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                strM10219 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                            } else if (cCharAt == '_') {
                                                strM10219 = name.substring(4);
                                            } else if (cCharAt == 'f') {
                                                strM10219 = name.substring(3);
                                            } else if (name.length() < 5) {
                                            }
                                            if (m10226(cls, interfaceC10216, strM10219)) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                fieldArr2 = fieldArr;
                                                fieldM10220 = m10220(cls, strM10219, fieldArr2, map);
                                                if (fieldM10220 != null) {
                                                    interfaceC19169 = (InterfaceC19167) fieldM10220.getAnnotation(InterfaceC19167.class);
                                                    if (interfaceC19169 != null) {
                                                        if (interfaceC19169.serialize()) {
                                                            iOrdinal = interfaceC19169.ordinal();
                                                            iM5815 = EnumC1643.m5815(interfaceC19169.serialzeFeatures());
                                                            if (interfaceC19169.name().length() != 0) {
                                                                strM10219 = interfaceC19169.name();
                                                                z4 = true;
                                                            }
                                                        }
                                                        declaredFields = fieldArr2;
                                                        annotationArr5 = annotationArr2;
                                                        sArr5 = sArr2;
                                                        declaredConstructors = constructorArr;
                                                        strArr4 = strArr;
                                                        cls2 = cls3;
                                                    }
                                                    InterfaceC19167 interfaceC191615 = interfaceC19169;
                                                    int i19 = iOrdinal;
                                                    int i110 = iM5815;
                                                    enumC0525 = enumC0523;
                                                    if (enumC0525 != null) {
                                                        strM10219 = enumC0525.m2483(strM10219);
                                                    }
                                                    String str6 = strM10219;
                                                    m10225(cls, method2, i7);
                                                    iOrdinal = i19;
                                                    linkedHashMap.put(str6, new C16558(str6, method2, fieldM10220, cls, null, iOrdinal, i110, interfaceC19167, interfaceC191615));
                                                    iM5815 = i110;
                                                } else {
                                                    interfaceC19169 = null;
                                                }
                                                z4 = false;
                                                InterfaceC19167 interfaceC191616 = interfaceC19169;
                                                int i111 = iOrdinal;
                                                int i112 = iM5815;
                                                enumC0525 = enumC0523;
                                                if (enumC0525 != null) {
                                                    strM10219 = enumC0525.m2483(strM10219);
                                                }
                                                String str7 = strM10219;
                                                m10225(cls, method2, i7);
                                                iOrdinal = i111;
                                                linkedHashMap.put(str7, new C16558(str7, method2, fieldM10220, cls, null, iOrdinal, i112, interfaceC19167, interfaceC191616));
                                                iM5815 = i112;
                                            }
                                        }
                                        fieldArr2 = fieldArr2;
                                        enumC0526 = enumC0523;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    enumC0524 = enumC0522;
                                    fieldArr2 = fieldArr;
                                    i7 = i;
                                    enumC0526 = enumC0524;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    fieldArr2 = fieldArr;
                                }
                                if (name.startsWith(am.ae)) {
                                    fieldArr2 = fieldArr2;
                                    enumC0524 = enumC0522;
                                } else {
                                    fieldArr2 = fieldArr2;
                                    enumC0524 = enumC0522;
                                }
                                i7 = i;
                                enumC0526 = enumC0524;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            }
                        }
                        sArr4 = sArr3;
                    } else {
                        sArr4 = sArr3;
                        constructorArr = declaredConstructors;
                    }
                    strArr = strArrM10242;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                sArr3 = sArr6;
                strArrM10242 = strArr;
                parameterAnnotations = annotationArr;
                if (strArrM10242 == null) {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM10242;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                } else {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM10242;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                if (interfaceC19167 != null) {
                    if (interfaceC19167.serialize()) {
                        i7 = i7;
                        enumC0523 = enumC0523;
                        cls3 = cls3;
                    } else {
                        iOrdinal = interfaceC19167.ordinal();
                        iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                        if (interfaceC19167.name().length() != 0) {
                            String strName4 = interfaceC19167.name();
                            m10225(cls, method2, i7);
                            enumC0523 = enumC0523;
                            i7 = i7;
                            cls3 = cls3;
                            linkedHashMap.put(strName4, new C16558(strName4, method2, null, cls, null, iOrdinal, iM5815, interfaceC19167, null));
                        }
                    }
                    fieldArr2 = fieldArr;
                    fieldArr2 = fieldArr2;
                    enumC0526 = enumC0523;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    iM5815 = 0;
                    iOrdinal = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4) {
                        if (name.equals("getClass")) {
                            fieldArr2 = fieldArr;
                        } else {
                            cCharAt = name.charAt(3);
                            if (Character.isUpperCase(cCharAt)) {
                                strM10219 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                            } else if (cCharAt == '_') {
                                strM10219 = name.substring(4);
                            } else if (cCharAt == 'f') {
                                strM10219 = name.substring(3);
                            } else if (name.length() < 5) {
                            }
                            if (m10226(cls, interfaceC10216, strM10219)) {
                                fieldArr2 = fieldArr;
                            } else {
                                fieldArr2 = fieldArr;
                                fieldM10220 = m10220(cls, strM10219, fieldArr2, map);
                                if (fieldM10220 != null) {
                                    interfaceC19169 = (InterfaceC19167) fieldM10220.getAnnotation(InterfaceC19167.class);
                                    if (interfaceC19169 != null) {
                                        if (interfaceC19169.serialize()) {
                                            iOrdinal = interfaceC19169.ordinal();
                                            iM5815 = EnumC1643.m5815(interfaceC19169.serialzeFeatures());
                                            if (interfaceC19169.name().length() != 0) {
                                                strM10219 = interfaceC19169.name();
                                                z4 = true;
                                            }
                                        }
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    InterfaceC19167 interfaceC191617 = interfaceC19169;
                                    int i113 = iOrdinal;
                                    int i114 = iM5815;
                                    enumC0525 = enumC0523;
                                    if (enumC0525 != null) {
                                        strM10219 = enumC0525.m2483(strM10219);
                                    }
                                    String str8 = strM10219;
                                    m10225(cls, method2, i7);
                                    iOrdinal = i113;
                                    linkedHashMap.put(str8, new C16558(str8, method2, fieldM10220, cls, null, iOrdinal, i114, interfaceC19167, interfaceC191617));
                                    iM5815 = i114;
                                } else {
                                    interfaceC19169 = null;
                                }
                                z4 = false;
                                InterfaceC19167 interfaceC191618 = interfaceC19169;
                                int i115 = iOrdinal;
                                int i116 = iM5815;
                                enumC0525 = enumC0523;
                                if (enumC0525 != null) {
                                    strM10219 = enumC0525.m2483(strM10219);
                                }
                                String str9 = strM10219;
                                m10225(cls, method2, i7);
                                iOrdinal = i115;
                                linkedHashMap.put(str9, new C16558(str9, method2, fieldM10220, cls, null, iOrdinal, i116, interfaceC19167, interfaceC191618));
                                iM5815 = i116;
                            }
                        }
                        fieldArr2 = fieldArr2;
                        enumC0526 = enumC0523;
                        i7 = i7;
                        declaredFields = fieldArr2;
                        annotationArr5 = annotationArr2;
                        sArr5 = sArr2;
                        declaredConstructors = constructorArr;
                        strArr4 = strArr;
                        cls2 = cls3;
                    }
                    enumC0524 = enumC0522;
                    fieldArr2 = fieldArr;
                    i7 = i;
                    enumC0526 = enumC0524;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    fieldArr2 = fieldArr;
                }
                if (name.startsWith(am.ae)) {
                    fieldArr2 = fieldArr2;
                    enumC0524 = enumC0522;
                } else {
                    fieldArr2 = fieldArr2;
                    enumC0524 = enumC0522;
                }
                i7 = i;
                enumC0526 = enumC0524;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            }
            sArr2 = sArr;
            constructorArr = declaredConstructors;
            interfaceC19167 = interfaceC19167M10223;
            annotationArr2 = parameterAnnotations;
            if (interfaceC19167 != null) {
                if (interfaceC19167.serialize()) {
                    i7 = i7;
                    enumC0523 = enumC0523;
                    cls3 = cls3;
                } else {
                    iOrdinal = interfaceC19167.ordinal();
                    iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                    if (interfaceC19167.name().length() != 0) {
                        String strName5 = interfaceC19167.name();
                        m10225(cls, method2, i7);
                        enumC0523 = enumC0523;
                        i7 = i7;
                        cls3 = cls3;
                        linkedHashMap.put(strName5, new C16558(strName5, method2, null, cls, null, iOrdinal, iM5815, interfaceC19167, null));
                    }
                }
                fieldArr2 = fieldArr;
                fieldArr2 = fieldArr2;
                enumC0526 = enumC0523;
                i7 = i7;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                iM5815 = 0;
                iOrdinal = 0;
            }
            if (name.startsWith("get")) {
                if (name.length() >= 4) {
                    if (name.equals("getClass")) {
                        fieldArr2 = fieldArr;
                    } else {
                        cCharAt = name.charAt(3);
                        if (Character.isUpperCase(cCharAt)) {
                            strM10219 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                        } else if (cCharAt == '_') {
                            strM10219 = name.substring(4);
                        } else if (cCharAt == 'f') {
                            strM10219 = name.substring(3);
                        } else if (name.length() < 5) {
                        }
                        if (m10226(cls, interfaceC10216, strM10219)) {
                            fieldArr2 = fieldArr;
                        } else {
                            fieldArr2 = fieldArr;
                            fieldM10220 = m10220(cls, strM10219, fieldArr2, map);
                            if (fieldM10220 != null) {
                                interfaceC19169 = (InterfaceC19167) fieldM10220.getAnnotation(InterfaceC19167.class);
                                if (interfaceC19169 != null) {
                                    if (interfaceC19169.serialize()) {
                                        iOrdinal = interfaceC19169.ordinal();
                                        iM5815 = EnumC1643.m5815(interfaceC19169.serialzeFeatures());
                                        if (interfaceC19169.name().length() != 0) {
                                            strM10219 = interfaceC19169.name();
                                            z4 = true;
                                        }
                                    }
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                InterfaceC19167 interfaceC191619 = interfaceC19169;
                                int i117 = iOrdinal;
                                int i118 = iM5815;
                                enumC0525 = enumC0523;
                                if (enumC0525 != null) {
                                    strM10219 = enumC0525.m2483(strM10219);
                                }
                                String str10 = strM10219;
                                m10225(cls, method2, i7);
                                iOrdinal = i117;
                                linkedHashMap.put(str10, new C16558(str10, method2, fieldM10220, cls, null, iOrdinal, i118, interfaceC19167, interfaceC191619));
                                iM5815 = i118;
                            } else {
                                interfaceC19169 = null;
                            }
                            z4 = false;
                            InterfaceC19167 interfaceC1916110 = interfaceC19169;
                            int i119 = iOrdinal;
                            int i1110 = iM5815;
                            enumC0525 = enumC0523;
                            if (enumC0525 != null) {
                                strM10219 = enumC0525.m2483(strM10219);
                            }
                            String str11 = strM10219;
                            m10225(cls, method2, i7);
                            iOrdinal = i119;
                            linkedHashMap.put(str11, new C16558(str11, method2, fieldM10220, cls, null, iOrdinal, i1110, interfaceC19167, interfaceC1916110));
                            iM5815 = i1110;
                        }
                    }
                    fieldArr2 = fieldArr2;
                    enumC0526 = enumC0523;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                }
                enumC0524 = enumC0522;
                fieldArr2 = fieldArr;
                i7 = i;
                enumC0526 = enumC0524;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                fieldArr2 = fieldArr;
            }
            if (name.startsWith(am.ae)) {
                fieldArr2 = fieldArr2;
                enumC0524 = enumC0522;
            } else {
                fieldArr2 = fieldArr2;
                enumC0524 = enumC0522;
            }
            i7 = i;
            enumC0526 = enumC0524;
            declaredFields = fieldArr2;
            annotationArr5 = annotationArr2;
            sArr5 = sArr2;
            declaredConstructors = constructorArr;
            strArr4 = strArr;
            cls2 = cls3;
        }
        Class<? super Object> cls4 = cls2;
        Field[] fieldArr3 = declaredFields;
        EnumC0522 enumC0527 = enumC0526;
        ArrayList<Field> arrayList2 = new ArrayList(fieldArr3.length);
        for (Field field2 : fieldArr3) {
            if ((field2.getModifiers() & 8) == 0 && !field2.getName().equals("this$0") && (field2.getModifiers() & 1) != 0) {
                arrayList2.add(field2);
            }
        }
        Class<? super Object> superclass2 = cls.getSuperclass();
        while (superclass2 != null) {
            Class<? super Object> cls5 = cls4;
            if (superclass2 == cls5) {
                break;
            }
            for (Field field3 : superclass2.getDeclaredFields()) {
                if ((field3.getModifiers() & 8) == 0 && (field3.getModifiers() & 1) != 0) {
                    arrayList2.add(field3);
                }
            }
            superclass2 = superclass2.getSuperclass();
            cls4 = cls5;
        }
        for (Field field4 : arrayList2) {
            InterfaceC19167 interfaceC191620 = (InterfaceC19167) field4.getAnnotation(InterfaceC19167.class);
            String name2 = field4.getName();
            if (interfaceC191620 == null) {
                i2 = 0;
                i3 = 0;
            } else if (interfaceC191620.serialize()) {
                int iOrdinal2 = interfaceC191620.ordinal();
                int iM5816 = EnumC1643.m5815(interfaceC191620.serialzeFeatures());
                if (interfaceC191620.name().length() != 0) {
                    name2 = interfaceC191620.name();
                }
                i2 = iOrdinal2;
                i3 = iM5816;
            }
            if (enumC0527 != null) {
                name2 = enumC0527.m2483(name2);
            }
            String str12 = name2;
            if (!linkedHashMap.containsKey(str12)) {
                m10225(cls, field4, i7);
                linkedHashMap.put(str12, new C16558(str12, null, field4, cls, null, i2, i3, null, interfaceC191620));
            }
            i7 = i;
            enumC0527 = enumC0527;
        }
        ArrayList arrayList3 = new ArrayList();
        if (interfaceC10216 == null) {
            z2 = false;
            strArrOrders = strArr3;
        } else {
            strArrOrders = interfaceC10216.orders();
            if (strArrOrders != null && strArrOrders.length == linkedHashMap.size()) {
                int length2 = strArrOrders.length;
                int i20 = 0;
                while (true) {
                    if (i20 >= length2) {
                        z2 = true;
                    } else if (linkedHashMap.containsKey(strArrOrders[i20])) {
                        i20++;
                    }
                }
            }
            strArr3 = strArrOrders;
            z2 = false;
            strArrOrders = strArr3;
        }
        if (z2) {
            for (String str13 : strArrOrders) {
                arrayList3.add((C16558) linkedHashMap.get(str13));
            }
        } else {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList3.add((C16558) it.next());
            }
            if (z) {
                Collections.sort(arrayList3);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19167 m10223(Method method, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length == parameterTypes2.length) {
                        int i = 0;
                        while (true) {
                            if (i < parameterTypes.length) {
                                if (!parameterTypes[i].equals(parameterTypes2[i])) {
                                    break;
                                }
                                i++;
                            } else {
                                InterfaceC19167 interfaceC19167 = (InterfaceC19167) method2.getAnnotation(InterfaceC19167.class);
                                if (interfaceC19167 == null) {
                                    break;
                                }
                                return interfaceC19167;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || !Modifier.isAbstract(superclass.getModifiers())) {
            return null;
        }
        Class<?>[] parameterTypes3 = method.getParameterTypes();
        for (Method method3 : superclass.getMethods()) {
            Class<?>[] parameterTypes4 = method3.getParameterTypes();
            if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                int i2 = 0;
                while (true) {
                    if (i2 < parameterTypes3.length) {
                        if (!parameterTypes4[i2].equals(parameterTypes3[i2])) {
                            break;
                        }
                        i2++;
                    } else {
                        InterfaceC19167 interfaceC19168 = (InterfaceC19167) method3.getAnnotation(InterfaceC19167.class);
                        if (interfaceC19168 == null) {
                            break;
                        }
                        return interfaceC19168;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10226(Class cls, InterfaceC10216 interfaceC10216, String str) {
        if (interfaceC10216 != null && interfaceC10216.ignores() != null) {
            for (String str2 : interfaceC10216.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !m10226(superclass, (InterfaceC10216) superclass.getAnnotation(InterfaceC10216.class), str)) ? false : true;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m10245(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && m10245(genericSuperclass);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Type m10231(Type type) {
        return type instanceof Class ? m10231(((Class) type).getGenericSuperclass()) : type;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m10213(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m10213(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m10213(upperBounds[0]);
            }
            return Object.class;
        }
        return Object.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m10219(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10225(Class cls, Member member, int i) {
        if (member == 0 || !f10155) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if ((superclass != null && superclass != Object.class) || (member.getModifiers() & 1) == 0 || (i & 1) == 0) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (AccessControlException unused) {
                f10155 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field m10220(Class cls, String str, Field[] fieldArr, HashMap map) {
        Field fieldM10239 = m10239(cls, str, fieldArr, map);
        if (fieldM10239 == null) {
            fieldM10239 = m10239(cls, C25272.m56409("_", str), fieldArr, map);
        }
        if (fieldM10239 == null) {
            fieldM10239 = m10239(cls, C25272.m56409("m_", str), fieldArr, map);
        }
        if (fieldM10239 != null) {
            return fieldM10239;
        }
        return m10239(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, map);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Field m10239(Class cls, String str, Field[] fieldArr, HashMap map) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name) || (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name))) {
                return field;
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Field[] declaredFields = (Field[]) map.get(superclass);
        if (declaredFields == null) {
            declaredFields = superclass.getDeclaredFields();
            map.put(superclass, declaredFields);
        }
        return m10220(superclass, str, declaredFields, map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static Type m10240(Type type) {
        Type typeM10240;
        if (type instanceof ParameterizedType) {
            typeM10240 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (typeM10240 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) typeM10240).getUpperBounds();
                if (upperBounds.length == 1) {
                    typeM10240 = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                typeM10240 = null;
            } else {
                typeM10240 = m10240(cls.getGenericSuperclass());
            }
        } else {
            typeM10240 = null;
        }
        return typeM10240 == null ? Object.class : typeM10240;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m10214(Class cls) {
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return cls == Character.TYPE ? '0' : null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m10227(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (m10227(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new C23272(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i2 = 0; i2 < typeVariableArr.length; i2++) {
                    if (type.equals(typeVariableArr[i2])) {
                        typeArr[i] = typeArr2[i2];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static long m10237(String str) {
        if (str == null) {
            return 0L;
        }
        long j = -3750763034362895579L;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j = (j ^ ((long) cCharAt)) * 1099511628211L;
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m10224(Class cls, String str) {
        f10154.put(str, cls);
    }
}
