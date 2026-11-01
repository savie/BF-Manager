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

/* JADX INFO: renamed from: l.۠ܰܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 95VI */
/* JADX INFO: loaded from: classes3.dex */
public final class C8219 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static volatile Method f28610 = null;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f28611 = false;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static volatile Method f28612 = null;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f28613 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f28614 = false;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static volatile Class f28615 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static volatile boolean f28616 = false;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static volatile Method f28617 = null;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static volatile HashMap f28618 = null;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final ConcurrentMapC13783 f28619;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f28620 = true;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static volatile Constructor f28621;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public static volatile boolean f28622;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m21528(Class cls) {
        if (f28615 == null && !f28622) {
            try {
                f28615 = InterfaceC6615.class;
            } catch (Throwable unused) {
                f28622 = true;
            }
        }
        if (f28615 == null) {
            return false;
        }
        return cls.isAnnotationPresent(f28615);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String[] m21535(Class cls) {
        if (f28621 == null && !f28611) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f28621 = cls2.getConstructor(Class.class);
                f28610 = cls2.getMethod("getConstructors", null);
                f28617 = InterfaceC23343.class.getMethod("getParameters", null);
                f28612 = InterfaceC14171.class.getMethod("getName", null);
            } catch (Throwable unused) {
                f28611 = true;
            }
        }
        if (f28621 == null || f28614) {
            return null;
        }
        try {
            Iterator it = ((Iterable) f28610.invoke(f28621.newInstance(cls), null)).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) f28617.invoke(next, null);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) f28617.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) f28612.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable unused2) {
            f28614 = true;
            return null;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Byte m21504(Object obj) {
        if (obj instanceof Number) {
            return Byte.valueOf(((Number) obj).byteValue());
        }
        if (!(obj instanceof String)) {
            throw new C20614(C9023.m23354(obj, "can not cast to byte, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Byte.valueOf(Byte.parseByte(str));
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final Short m21524(Object obj) {
        if (obj instanceof Number) {
            return Short.valueOf(((Number) obj).shortValue());
        }
        if (!(obj instanceof String)) {
            throw new C20614(C9023.m23354(obj, "can not cast to short, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Short.valueOf(Short.parseShort(str));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final BigDecimal m21516(Object obj) {
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final BigInteger m21534(Object obj) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final Float m21503(Object obj) {
        if (obj instanceof Number) {
            return Float.valueOf(((Number) obj).floatValue());
        }
        if (!(obj instanceof String)) {
            throw new C20614(C9023.m23354(obj, "can not cast to float, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return Float.valueOf(Float.parseFloat(string));
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static final Double m21536(Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (!(obj instanceof String)) {
            throw new C20614(C9023.m23354(obj, "can not cast to double, value : "));
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(string));
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final Date m21523(Object obj) {
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
                String str2 = AbstractC8620.f29745;
                if (length != str2.length()) {
                    if (str.length() == 10) {
                        str2 = "yyyy-MM-dd";
                    } else if (str.length() == 19) {
                        str2 = "yyyy-MM-dd HH:mm:ss";
                    } else {
                        str2 = (str.length() == 29 && str.charAt(26) == ':' && str.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                    }
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, AbstractC8620.f29748);
                simpleDateFormat.setTimeZone(AbstractC8620.f29746);
                try {
                    return simpleDateFormat.parse(str);
                } catch (ParseException unused) {
                    throw new C20614("can not cast to Date, value : ".concat(str));
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
        throw new C20614(C9023.m23354(obj, "can not cast to Date, value : "));
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final Long m21507(Object obj) {
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
                C2974 c2974 = new C2974(str);
                Calendar calendar = c2974.m8852(false) ? c2974.f11136 : null;
                c2974.m8849();
                if (calendar != null) {
                    return Long.valueOf(calendar.getTimeInMillis());
                }
            }
        }
        throw new C20614(C9023.m23354(obj, "can not cast to long, value : "));
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final Integer m21529(Object obj) {
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
            throw new C20614(C9023.m23354(obj, "can not cast to int, value : "));
        }
        String str = (String) obj;
        if (str.length() == 0 || "null".equals(str)) {
            return null;
        }
        return Integer.valueOf(Integer.parseInt(str));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final Boolean m21525(Object obj) {
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
        throw new C20614(C9023.m23354(obj, "can not cast to int, value : "));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m21513(Map map, Class cls, C0893 c0893) {
        return m21510((Object) map, cls, c0893);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m21510(Object obj, Class cls, C0893 c0893) {
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
                            Array.set(objNewInstance, i, m21510(it.next(), (Class) cls.getComponentType(), c0893));
                            i++;
                        }
                        return objNewInstance;
                    }
                    if (cls == byte[].class) {
                        if (obj instanceof byte[]) {
                            return (byte[]) obj;
                        }
                        if (!(obj instanceof String)) {
                            throw new C20614(C9023.m23354(obj, "can not cast to int, value : "));
                        }
                        String str = (String) obj;
                        return C2974.m8814(0, str.length(), str);
                    }
                }
                if (!cls.isAssignableFrom(obj.getClass())) {
                    if (cls == Boolean.TYPE || cls == Boolean.class) {
                        return m21525(obj);
                    }
                    if (cls == Byte.TYPE || cls == Byte.class) {
                        return m21504(obj);
                    }
                    if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
                        String str2 = (String) obj;
                        if (str2.length() == 1) {
                            return Character.valueOf(str2.charAt(0));
                        }
                    }
                    if (cls == Short.TYPE || cls == Short.class) {
                        return m21524(obj);
                    }
                    if (cls == Integer.TYPE || cls == Integer.class) {
                        return m21529(obj);
                    }
                    if (cls == Long.TYPE || cls == Long.class) {
                        return m21507(obj);
                    }
                    if (cls == Float.TYPE || cls == Float.class) {
                        return m21503(obj);
                    }
                    if (cls == Double.TYPE || cls == Double.class) {
                        return m21536(obj);
                    }
                    if (cls == String.class) {
                        return obj.toString();
                    }
                    if (cls == BigDecimal.class) {
                        return m21516(obj);
                    }
                    if (cls == BigInteger.class) {
                        return m21534(obj);
                    }
                    if (cls == Date.class) {
                        return m21523(obj);
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
                            throw new C20614("can not cast to : ".concat(cls.getName()));
                        } catch (Exception e) {
                            throw new C20614("can not cast to : ".concat(cls.getName()), (Throwable) e);
                        }
                    }
                    if (Calendar.class.isAssignableFrom(cls)) {
                        Date dateM21523 = m21523(obj);
                        if (cls == Calendar.class) {
                            calendar = Calendar.getInstance(AbstractC8620.f29746, AbstractC8620.f29748);
                        } else {
                            try {
                                calendar = (Calendar) cls.newInstance();
                            } catch (Exception e2) {
                                throw new C20614("can not cast to : ".concat(cls.getName()), (Throwable) e2);
                            }
                        }
                        calendar.setTime(dateM21523);
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
                    throw new C20614("can not cast to : ".concat(cls.getName()));
                }
            } else if (cls != Map.class) {
                Map map = (Map) obj;
                if (cls != Object.class || map.containsKey("@type")) {
                    return m21531(map, cls, c0893);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m21512(Object obj, Type type, C0893 c0893) {
        if (obj == null) {
            return null;
        }
        if (type instanceof Class) {
            return m21510(obj, (Class) type, c0893);
        }
        if (type instanceof ParameterizedType) {
            return m21511(obj, (ParameterizedType) type, c0893);
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
        throw new C20614("can not cast to : " + type);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final Object m21511(Object obj, ParameterizedType parameterizedType, C0893 c0893) {
        Object objM21512;
        Collection hashSet;
        Object objM21513;
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
                        if (obj2 != null && obj2.getClass() == C15676.class) {
                            objM21512 = ((C15676) obj2).m37348((Class) type, c0893);
                        } else {
                            objM21512 = m21510(obj2, (Class) type, c0893);
                        }
                    } else {
                        objM21512 = m21512(obj2, type, c0893);
                    }
                    arrayList.add(objM21512);
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
                        if (obj3 != null && obj3.getClass() == C15676.class) {
                            objM21513 = ((C15676) obj3).m37348((Class) type2, c0893);
                        } else {
                            objM21513 = m21510(obj3, (Class) type2, c0893);
                        }
                    } else {
                        objM21513 = m21512(obj3, type2, c0893);
                    }
                    hashSet.add(objM21513);
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
                    map.put(m21512(entry.getKey(), type3, c0893), m21512(entry.getValue(), type4, c0893));
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
            return m21512(obj, rawType, c0893);
        }
        throw new C20614("can not cast to : " + parameterizedType);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final Object m21531(Map map, Class cls, C0893 c0893) {
        C15676 c15676;
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
                if (c0893 == null) {
                    c0893 = C0893.f3598;
                }
                Class clsM3567 = c0893.m3567(str4, 0, null);
                if (clsM3567 == null) {
                    throw new ClassNotFoundException(str4.concat(" not found"));
                }
                if (!clsM3567.equals(cls)) {
                    return m21531(map, clsM3567, c0893);
                }
            }
            if (cls.isInterface()) {
                if (map instanceof C15676) {
                    c15676 = (C15676) map;
                } else {
                    c15676 = new C15676(map);
                }
                if (c0893 == null) {
                    c0893 = C0893.f3598;
                }
                if (c0893.m3569((Type) cls) == null) {
                    return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, c15676);
                }
                C14265 c14265 = new C14265(AbstractC8620.m22398(c15676), C0893.f3598, AbstractC8620.f29749);
                Object objM34397 = c14265.m34397((String) null, cls);
                c14265.m34395();
                c14265.close();
                return objM34397;
            }
            if (cls == String.class && (map instanceof C15676)) {
                return map.toString();
            }
            if (c0893 == null) {
                c0893 = C0893.f3598;
            }
            InterfaceC7950 interfaceC7950M3569 = c0893.m3569((Type) cls);
            C4421 c4421 = interfaceC7950M3569 instanceof C4421 ? (C4421) interfaceC7950M3569 : null;
            if (c4421 == null) {
                throw new C20614("can not get javaBeanDeserializer");
            }
            return c4421.m12353(map, c0893);
        } catch (Exception e) {
            throw new C20614(e.getMessage(), (Throwable) e);
        }
    }

    static {
        ConcurrentMapC13783 concurrentMapC13783 = new ConcurrentMapC13783(36, 0.75f, 1);
        f28619 = concurrentMapC13783;
        concurrentMapC13783.put(ClassTransform.BYTE, Byte.TYPE);
        concurrentMapC13783.put(ClassTransform.SHORT, Short.TYPE);
        concurrentMapC13783.put(ClassTransform.INTEGER, Integer.TYPE);
        concurrentMapC13783.put(ClassTransform.LONG, Long.TYPE);
        concurrentMapC13783.put(ClassTransform.FLOAT, Float.TYPE);
        concurrentMapC13783.put(ClassTransform.DOUBLE, Double.TYPE);
        concurrentMapC13783.put(ClassTransform.BOOLEAN, Boolean.TYPE);
        concurrentMapC13783.put(ClassTransform.CHARACTER, Character.TYPE);
        concurrentMapC13783.put("[byte", byte[].class);
        concurrentMapC13783.put("[short", short[].class);
        concurrentMapC13783.put("[int", int[].class);
        concurrentMapC13783.put("[long", long[].class);
        concurrentMapC13783.put("[float", float[].class);
        concurrentMapC13783.put("[double", double[].class);
        concurrentMapC13783.put("[boolean", boolean[].class);
        concurrentMapC13783.put("[char", char[].class);
        concurrentMapC13783.put("[B", byte[].class);
        concurrentMapC13783.put("[S", short[].class);
        concurrentMapC13783.put("[I", int[].class);
        concurrentMapC13783.put("[J", long[].class);
        concurrentMapC13783.put("[F", float[].class);
        concurrentMapC13783.put("[D", double[].class);
        concurrentMapC13783.put("[C", char[].class);
        concurrentMapC13783.put("[Z", boolean[].class);
        concurrentMapC13783.put("java.util.HashMap", HashMap.class);
        concurrentMapC13783.put("java.util.TreeMap", TreeMap.class);
        concurrentMapC13783.put("java.util.Date", Date.class);
        concurrentMapC13783.put("com.alibaba.fastjson.JSONObject", C15676.class);
        concurrentMapC13783.put("java.util.concurrent.ConcurrentHashMap", ConcurrentMapC13783.class);
        concurrentMapC13783.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentMapC13783.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentMapC13783.put("java.lang.RuntimeException", RuntimeException.class);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Class m21526(String str) {
        return (Class) f28619.get(str);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Class m21505(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new C20614("className too long. ".concat(str));
        }
        ConcurrentMapC13783 concurrentMapC13783 = f28619;
        Class<?> cls = (Class) concurrentMapC13783.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class clsM21505 = m21505(str.substring(1));
            if (clsM21505 == null) {
                return null;
            }
            return Array.newInstance((Class<?>) clsM21505, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(l.b)) {
            return m21505(str.substring(1, str.length() - 1));
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
            concurrentMapC13783.put(str, cls);
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
      0x0239: PHI (r28v3 l.ܽۗ᩺) = (r24v5 l.ܽۗ᩺), (r24v5 l.ܽۗ᩺), (r28v5 l.ܽۗ᩺), (r28v6 l.ܽۗ᩺) binds: [B:128:0x029a, B:145:0x02f5, B:120:0x0253, B:116:0x0233] A[DONT_GENERATE, DONT_INLINE]
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
    public static ArrayList m21517(Class cls, int i, InterfaceC5797 interfaceC5797, boolean z, EnumC16381 enumC16381) {
        Class<? super Object> cls2;
        boolean z2;
        String[] strArrOrders;
        int i2;
        int i3;
        String[] strArr;
        boolean z3;
        Field[] fieldArr;
        Class<? super Object> cls3;
        EnumC16381 enumC16382;
        Annotation[][] annotationArr;
        short[] sArr;
        Annotation[][] parameterAnnotations;
        short[] sArr2;
        Constructor<?>[] constructorArr;
        InterfaceC17086 interfaceC17086;
        Annotation[][] annotationArr2;
        int iM11482;
        int iOrdinal;
        Field[] fieldArr2;
        EnumC16381 enumC16383;
        String strSubstring;
        int i4;
        InterfaceC17086 interfaceC17087;
        char cCharAt;
        String strM21514;
        Field fieldM21515;
        InterfaceC17086 interfaceC17088;
        boolean z4;
        EnumC16381 enumC16384;
        short[] sArr3;
        String[] strArrM21535;
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
        boolean zM21528 = m21528(cls);
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
        EnumC16381 enumC16385 = enumC16381;
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
                    enumC16382 = enumC16385;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                }
                sArr5 = sArr6;
                strArr4 = strArr;
                annotationArr5 = annotationArr;
                enumC16385 = enumC16382;
                cls2 = cls3;
                declaredFields = fieldArr;
            } else {
                strArr = strArr4;
                z3 = true;
            }
            InterfaceC17086 interfaceC17086M21518 = (InterfaceC17086) method2.getAnnotation(InterfaceC17086.class);
            if (interfaceC17086M21518 == null) {
                interfaceC17086M21518 = m21518(method2, cls);
            }
            if (zM21528) {
                annotationArr = annotationArr5;
                if (f28618 != null || f28616) {
                    enumC16382 = enumC16385;
                    cls3 = cls2;
                    fieldArr = declaredFields;
                } else {
                    enumC16382 = enumC16385;
                    try {
                        HashMap map2 = new HashMap();
                        cls3 = cls2;
                        try {
                            int i8 = C7114.f23806;
                            fieldArr = declaredFields;
                            try {
                                map2.put(C7114.class, new String[]{"getEndInclusive", "isEmpty"});
                                int i9 = C16287.f52463;
                                map2.put(C16287.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(C16992.class, new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.ܺ֡۠"), new String[]{"getEndInclusive", "isEmpty"});
                                map2.put(Class.forName("l.᩷֡۠"), new String[]{"getEndInclusive", "isEmpty"});
                                f28618 = map2;
                            } catch (Throwable unused) {
                                f28616 = z3;
                            }
                        } catch (Throwable unused2) {
                            fieldArr = declaredFields;
                            f28616 = z3;
                            if (f28618 != null) {
                                sArr5 = sArr6;
                                strArr4 = strArr;
                                annotationArr5 = annotationArr;
                                enumC16385 = enumC16382;
                                cls2 = cls3;
                                declaredFields = fieldArr;
                            }
                            if (interfaceC17086M21518 == null) {
                                interfaceC17086M21518 = interfaceC17086M21518;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC17086 = interfaceC17086M21518;
                                annotationArr2 = parameterAnnotations;
                            } else {
                                interfaceC17086M21518 = interfaceC17086M21518;
                                sArr = sArr6;
                                parameterAnnotations = annotationArr;
                                sArr2 = sArr;
                                constructorArr = declaredConstructors;
                                interfaceC17086 = interfaceC17086M21518;
                                annotationArr2 = parameterAnnotations;
                            }
                            if (interfaceC17086 != null) {
                                if (interfaceC17086.serialize()) {
                                    iOrdinal = interfaceC17086.ordinal();
                                    iM11482 = EnumC3984.m11482(interfaceC17086.serialzeFeatures());
                                    if (interfaceC17086.name().length() != 0) {
                                        String strName = interfaceC17086.name();
                                        m21520(cls, method2, i7);
                                        enumC16382 = enumC16382;
                                        i7 = i7;
                                        cls3 = cls3;
                                        linkedHashMap.put(strName, new C15275(strName, method2, null, cls, null, iOrdinal, iM11482, interfaceC17086, null));
                                    }
                                } else {
                                    i7 = i7;
                                    enumC16382 = enumC16382;
                                    cls3 = cls3;
                                }
                                fieldArr2 = fieldArr;
                                fieldArr2 = fieldArr2;
                                enumC16385 = enumC16382;
                                i7 = i7;
                                declaredFields = fieldArr2;
                                annotationArr5 = annotationArr2;
                                sArr5 = sArr2;
                                declaredConstructors = constructorArr;
                                strArr4 = strArr;
                                cls2 = cls3;
                            } else {
                                iM11482 = 0;
                                iOrdinal = 0;
                            }
                            if (name.startsWith("get")) {
                                if (name.length() >= 4) {
                                    if (name.equals("getClass")) {
                                        fieldArr2 = fieldArr;
                                    } else {
                                        cCharAt = name.charAt(3);
                                        if (Character.isUpperCase(cCharAt)) {
                                            strM21514 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                        } else if (cCharAt == '_') {
                                            strM21514 = name.substring(4);
                                        } else if (cCharAt == 'f') {
                                            strM21514 = name.substring(3);
                                        } else if (name.length() < 5) {
                                        }
                                        if (m21521(cls, interfaceC5797, strM21514)) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            fieldArr2 = fieldArr;
                                            fieldM21515 = m21515(cls, strM21514, fieldArr2, map);
                                            if (fieldM21515 != null) {
                                                interfaceC17088 = (InterfaceC17086) fieldM21515.getAnnotation(InterfaceC17086.class);
                                                if (interfaceC17088 != null) {
                                                    if (interfaceC17088.serialize()) {
                                                        iOrdinal = interfaceC17088.ordinal();
                                                        iM11482 = EnumC3984.m11482(interfaceC17088.serialzeFeatures());
                                                        if (interfaceC17088.name().length() != 0) {
                                                            strM21514 = interfaceC17088.name();
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
                                                InterfaceC17086 interfaceC17089 = interfaceC17088;
                                                int i10 = iOrdinal;
                                                int i11 = iM11482;
                                                enumC16384 = enumC16382;
                                                if (enumC16384 != null) {
                                                    strM21514 = enumC16384.m38569(strM21514);
                                                }
                                                String str = strM21514;
                                                m21520(cls, method2, i7);
                                                iOrdinal = i10;
                                                linkedHashMap.put(str, new C15275(str, method2, fieldM21515, cls, null, iOrdinal, i11, interfaceC17086, interfaceC17089));
                                                iM11482 = i11;
                                            } else {
                                                interfaceC17088 = null;
                                            }
                                            z4 = false;
                                            InterfaceC17086 interfaceC170810 = interfaceC17088;
                                            int i12 = iOrdinal;
                                            int i13 = iM11482;
                                            enumC16384 = enumC16382;
                                            if (enumC16384 != null) {
                                                strM21514 = enumC16384.m38569(strM21514);
                                            }
                                            String str2 = strM21514;
                                            m21520(cls, method2, i7);
                                            iOrdinal = i12;
                                            linkedHashMap.put(str2, new C15275(str2, method2, fieldM21515, cls, null, iOrdinal, i13, interfaceC17086, interfaceC170810));
                                            iM11482 = i13;
                                        }
                                    }
                                    fieldArr2 = fieldArr2;
                                    enumC16385 = enumC16382;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                }
                                enumC16383 = enumC16381;
                                fieldArr2 = fieldArr;
                                i7 = i;
                                enumC16385 = enumC16383;
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
                                enumC16383 = enumC16381;
                            } else {
                                fieldArr2 = fieldArr2;
                                enumC16383 = enumC16381;
                            }
                            i7 = i;
                            enumC16385 = enumC16383;
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
                if (f28618 != null && (strArr2 = (String[]) f28618.get(cls)) != null && Arrays.binarySearch(strArr2, name) >= 0) {
                    sArr5 = sArr6;
                    strArr4 = strArr;
                    annotationArr5 = annotationArr;
                    enumC16385 = enumC16382;
                    cls2 = cls3;
                    declaredFields = fieldArr;
                }
            } else {
                annotationArr = annotationArr5;
                enumC16382 = enumC16385;
                cls3 = cls2;
                fieldArr = declaredFields;
            }
            if (interfaceC17086M21518 == null || !zM21528) {
                interfaceC17086M21518 = interfaceC17086M21518;
                sArr = sArr6;
                parameterAnnotations = annotationArr;
            } else {
                if (declaredConstructors == null) {
                    declaredConstructors = cls.getDeclaredConstructors();
                    if (declaredConstructors.length == 1) {
                        parameterAnnotations = declaredConstructors[0].getParameterAnnotations();
                        strArrM21535 = m21535(cls);
                        if (strArrM21535 != null) {
                            String[] strArr5 = new String[strArrM21535.length];
                            interfaceC17086M21518 = interfaceC17086M21518;
                            System.arraycopy(strArrM21535, 0, strArr5, 0, strArrM21535.length);
                            Arrays.sort(strArr5);
                            short[] sArr7 = new short[strArrM21535.length];
                            for (short s = 0; s < strArrM21535.length; s = (short) (s + 1)) {
                                sArr7[Arrays.binarySearch(strArr5, strArrM21535[s])] = s;
                            }
                            strArrM21535 = strArr5;
                            sArr3 = sArr7;
                            declaredConstructors = declaredConstructors;
                        } else {
                            interfaceC17086M21518 = interfaceC17086M21518;
                            sArr3 = sArr6;
                        }
                    }
                    if (strArrM21535 == null && sArr3 != null && name.startsWith("get")) {
                        String strM21515 = m21514(name.substring(3));
                        int iBinarySearch = Arrays.binarySearch(strArrM21535, strM21515);
                        if (iBinarySearch < 0) {
                            constructorArr = declaredConstructors;
                            int i14 = 0;
                            while (true) {
                                if (i14 < strArrM21535.length) {
                                    if (strM21515.equalsIgnoreCase(strArrM21535[i14])) {
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
                                        if (annotation instanceof InterfaceC17086) {
                                            interfaceC17086 = (InterfaceC17086) annotation;
                                            annotationArr2 = parameterAnnotations;
                                            strArr = strArrM21535;
                                        } else {
                                            i6++;
                                            sArr3 = sArr2;
                                            annotationArr3 = annotationArr4;
                                        }
                                    }
                                    if (interfaceC17086 != null) {
                                        if (interfaceC17086.serialize()) {
                                            i7 = i7;
                                            enumC16382 = enumC16382;
                                            cls3 = cls3;
                                        } else {
                                            iOrdinal = interfaceC17086.ordinal();
                                            iM11482 = EnumC3984.m11482(interfaceC17086.serialzeFeatures());
                                            if (interfaceC17086.name().length() != 0) {
                                                String strName2 = interfaceC17086.name();
                                                m21520(cls, method2, i7);
                                                enumC16382 = enumC16382;
                                                i7 = i7;
                                                cls3 = cls3;
                                                linkedHashMap.put(strName2, new C15275(strName2, method2, null, cls, null, iOrdinal, iM11482, interfaceC17086, null));
                                            }
                                        }
                                        fieldArr2 = fieldArr;
                                        fieldArr2 = fieldArr2;
                                        enumC16385 = enumC16382;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    } else {
                                        iM11482 = 0;
                                        iOrdinal = 0;
                                    }
                                    if (name.startsWith("get")) {
                                        if (name.length() >= 4) {
                                            if (name.equals("getClass")) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                cCharAt = name.charAt(3);
                                                if (Character.isUpperCase(cCharAt)) {
                                                    strM21514 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                                } else if (cCharAt == '_') {
                                                    strM21514 = name.substring(4);
                                                } else if (cCharAt == 'f') {
                                                    strM21514 = name.substring(3);
                                                } else {
                                                    if (name.length() < 5 && Character.isUpperCase(name.charAt(4))) {
                                                        strM21514 = m21514(name.substring(3));
                                                    }
                                                    i7 = i;
                                                    enumC16385 = enumC16383;
                                                    declaredFields = fieldArr2;
                                                    annotationArr5 = annotationArr2;
                                                    sArr5 = sArr2;
                                                    declaredConstructors = constructorArr;
                                                    strArr4 = strArr;
                                                    cls2 = cls3;
                                                }
                                                if (m21521(cls, interfaceC5797, strM21514)) {
                                                    fieldArr2 = fieldArr;
                                                } else {
                                                    fieldArr2 = fieldArr;
                                                    fieldM21515 = m21515(cls, strM21514, fieldArr2, map);
                                                    if (fieldM21515 != null) {
                                                        interfaceC17088 = (InterfaceC17086) fieldM21515.getAnnotation(InterfaceC17086.class);
                                                        if (interfaceC17088 != null) {
                                                            if (interfaceC17088.serialize()) {
                                                                iOrdinal = interfaceC17088.ordinal();
                                                                iM11482 = EnumC3984.m11482(interfaceC17088.serialzeFeatures());
                                                                if (interfaceC17088.name().length() != 0) {
                                                                    strM21514 = interfaceC17088.name();
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
                                                        InterfaceC17086 interfaceC170811 = interfaceC17088;
                                                        int i15 = iOrdinal;
                                                        int i16 = iM11482;
                                                        enumC16384 = enumC16382;
                                                        if (enumC16384 != null && !z4) {
                                                            strM21514 = enumC16384.m38569(strM21514);
                                                        }
                                                        String str3 = strM21514;
                                                        m21520(cls, method2, i7);
                                                        iOrdinal = i15;
                                                        linkedHashMap.put(str3, new C15275(str3, method2, fieldM21515, cls, null, iOrdinal, i16, interfaceC17086, interfaceC170811));
                                                        iM11482 = i16;
                                                    } else {
                                                        interfaceC17088 = null;
                                                    }
                                                    z4 = false;
                                                    InterfaceC17086 interfaceC170812 = interfaceC17088;
                                                    int i17 = iOrdinal;
                                                    int i18 = iM11482;
                                                    enumC16384 = enumC16382;
                                                    if (enumC16384 != null) {
                                                        strM21514 = enumC16384.m38569(strM21514);
                                                    }
                                                    String str4 = strM21514;
                                                    m21520(cls, method2, i7);
                                                    iOrdinal = i17;
                                                    linkedHashMap.put(str4, new C15275(str4, method2, fieldM21515, cls, null, iOrdinal, i18, interfaceC17086, interfaceC170812));
                                                    iM11482 = i18;
                                                }
                                            }
                                            fieldArr2 = fieldArr2;
                                            enumC16385 = enumC16382;
                                            i7 = i7;
                                            declaredFields = fieldArr2;
                                            annotationArr5 = annotationArr2;
                                            sArr5 = sArr2;
                                            declaredConstructors = constructorArr;
                                            strArr4 = strArr;
                                            cls2 = cls3;
                                        }
                                        enumC16383 = enumC16381;
                                        fieldArr2 = fieldArr;
                                        i7 = i;
                                        enumC16385 = enumC16383;
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
                                        enumC16383 = enumC16381;
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
                                            enumC16383 = enumC16381;
                                        }
                                        if (m21521(cls, interfaceC5797, strSubstring)) {
                                            fieldArr2 = fieldArr2;
                                            enumC16383 = enumC16381;
                                        } else {
                                            Field fieldM21516 = m21515(cls, strSubstring, fieldArr2, map);
                                            if (fieldM21516 == null) {
                                                fieldM21516 = m21515(cls, name, fieldArr2, map);
                                            }
                                            Field field = fieldM21516;
                                            if (field != null) {
                                                InterfaceC17086 interfaceC170813 = (InterfaceC17086) field.getAnnotation(InterfaceC17086.class);
                                                if (interfaceC170813 != null) {
                                                    if (interfaceC170813.serialize()) {
                                                        iOrdinal = interfaceC170813.ordinal();
                                                        iM11482 = EnumC3984.m11482(interfaceC170813.serialzeFeatures());
                                                        if (interfaceC170813.name().length() != 0) {
                                                            strSubstring = interfaceC170813.name();
                                                        }
                                                    } else {
                                                        fieldArr2 = fieldArr2;
                                                        enumC16383 = enumC16381;
                                                    }
                                                }
                                                interfaceC17087 = interfaceC170813;
                                                i4 = iM11482;
                                            } else {
                                                i4 = iM11482;
                                                interfaceC17087 = null;
                                            }
                                            enumC16383 = enumC16381;
                                            if (enumC16383 != null) {
                                                strSubstring = enumC16383.m38569(strSubstring);
                                            }
                                            String str5 = strSubstring;
                                            m21520(cls, field, i);
                                            m21520(cls, method2, i);
                                            linkedHashMap.put(str5, new C15275(str5, method2, field, cls, null, iOrdinal, i4, interfaceC17086, interfaceC17087));
                                        }
                                    }
                                    i7 = i;
                                    enumC16385 = enumC16383;
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
                                    if (annotation instanceof InterfaceC17086) {
                                        interfaceC17086 = (InterfaceC17086) annotation;
                                        annotationArr2 = parameterAnnotations;
                                        strArr = strArrM21535;
                                    } else {
                                        i6++;
                                        sArr3 = sArr2;
                                        annotationArr3 = annotationArr4;
                                    }
                                }
                                if (interfaceC17086 != null) {
                                    if (interfaceC17086.serialize()) {
                                        i7 = i7;
                                        enumC16382 = enumC16382;
                                        cls3 = cls3;
                                    } else {
                                        iOrdinal = interfaceC17086.ordinal();
                                        iM11482 = EnumC3984.m11482(interfaceC17086.serialzeFeatures());
                                        if (interfaceC17086.name().length() != 0) {
                                            String strName3 = interfaceC17086.name();
                                            m21520(cls, method2, i7);
                                            enumC16382 = enumC16382;
                                            i7 = i7;
                                            cls3 = cls3;
                                            linkedHashMap.put(strName3, new C15275(strName3, method2, null, cls, null, iOrdinal, iM11482, interfaceC17086, null));
                                        }
                                    }
                                    fieldArr2 = fieldArr;
                                    fieldArr2 = fieldArr2;
                                    enumC16385 = enumC16382;
                                    i7 = i7;
                                    declaredFields = fieldArr2;
                                    annotationArr5 = annotationArr2;
                                    sArr5 = sArr2;
                                    declaredConstructors = constructorArr;
                                    strArr4 = strArr;
                                    cls2 = cls3;
                                } else {
                                    iM11482 = 0;
                                    iOrdinal = 0;
                                }
                                if (name.startsWith("get")) {
                                    if (name.length() >= 4) {
                                        if (name.equals("getClass")) {
                                            fieldArr2 = fieldArr;
                                        } else {
                                            cCharAt = name.charAt(3);
                                            if (Character.isUpperCase(cCharAt)) {
                                                strM21514 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                                            } else if (cCharAt == '_') {
                                                strM21514 = name.substring(4);
                                            } else if (cCharAt == 'f') {
                                                strM21514 = name.substring(3);
                                            } else if (name.length() < 5) {
                                            }
                                            if (m21521(cls, interfaceC5797, strM21514)) {
                                                fieldArr2 = fieldArr;
                                            } else {
                                                fieldArr2 = fieldArr;
                                                fieldM21515 = m21515(cls, strM21514, fieldArr2, map);
                                                if (fieldM21515 != null) {
                                                    interfaceC17088 = (InterfaceC17086) fieldM21515.getAnnotation(InterfaceC17086.class);
                                                    if (interfaceC17088 != null) {
                                                        if (interfaceC17088.serialize()) {
                                                            iOrdinal = interfaceC17088.ordinal();
                                                            iM11482 = EnumC3984.m11482(interfaceC17088.serialzeFeatures());
                                                            if (interfaceC17088.name().length() != 0) {
                                                                strM21514 = interfaceC17088.name();
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
                                                    InterfaceC17086 interfaceC170814 = interfaceC17088;
                                                    int i19 = iOrdinal;
                                                    int i110 = iM11482;
                                                    enumC16384 = enumC16382;
                                                    if (enumC16384 != null) {
                                                        strM21514 = enumC16384.m38569(strM21514);
                                                    }
                                                    String str6 = strM21514;
                                                    m21520(cls, method2, i7);
                                                    iOrdinal = i19;
                                                    linkedHashMap.put(str6, new C15275(str6, method2, fieldM21515, cls, null, iOrdinal, i110, interfaceC17086, interfaceC170814));
                                                    iM11482 = i110;
                                                } else {
                                                    interfaceC17088 = null;
                                                }
                                                z4 = false;
                                                InterfaceC17086 interfaceC170815 = interfaceC17088;
                                                int i111 = iOrdinal;
                                                int i112 = iM11482;
                                                enumC16384 = enumC16382;
                                                if (enumC16384 != null) {
                                                    strM21514 = enumC16384.m38569(strM21514);
                                                }
                                                String str7 = strM21514;
                                                m21520(cls, method2, i7);
                                                iOrdinal = i111;
                                                linkedHashMap.put(str7, new C15275(str7, method2, fieldM21515, cls, null, iOrdinal, i112, interfaceC17086, interfaceC170815));
                                                iM11482 = i112;
                                            }
                                        }
                                        fieldArr2 = fieldArr2;
                                        enumC16385 = enumC16382;
                                        i7 = i7;
                                        declaredFields = fieldArr2;
                                        annotationArr5 = annotationArr2;
                                        sArr5 = sArr2;
                                        declaredConstructors = constructorArr;
                                        strArr4 = strArr;
                                        cls2 = cls3;
                                    }
                                    enumC16383 = enumC16381;
                                    fieldArr2 = fieldArr;
                                    i7 = i;
                                    enumC16385 = enumC16383;
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
                                    enumC16383 = enumC16381;
                                } else {
                                    fieldArr2 = fieldArr2;
                                    enumC16383 = enumC16381;
                                }
                                i7 = i;
                                enumC16385 = enumC16383;
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
                    strArr = strArrM21535;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                sArr3 = sArr6;
                strArrM21535 = strArr;
                parameterAnnotations = annotationArr;
                if (strArrM21535 == null) {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM21535;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                } else {
                    sArr4 = sArr3;
                    constructorArr = declaredConstructors;
                    strArr = strArrM21535;
                    sArr = sArr4;
                    declaredConstructors = constructorArr;
                }
                if (interfaceC17086 != null) {
                    if (interfaceC17086.serialize()) {
                        i7 = i7;
                        enumC16382 = enumC16382;
                        cls3 = cls3;
                    } else {
                        iOrdinal = interfaceC17086.ordinal();
                        iM11482 = EnumC3984.m11482(interfaceC17086.serialzeFeatures());
                        if (interfaceC17086.name().length() != 0) {
                            String strName4 = interfaceC17086.name();
                            m21520(cls, method2, i7);
                            enumC16382 = enumC16382;
                            i7 = i7;
                            cls3 = cls3;
                            linkedHashMap.put(strName4, new C15275(strName4, method2, null, cls, null, iOrdinal, iM11482, interfaceC17086, null));
                        }
                    }
                    fieldArr2 = fieldArr;
                    fieldArr2 = fieldArr2;
                    enumC16385 = enumC16382;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                } else {
                    iM11482 = 0;
                    iOrdinal = 0;
                }
                if (name.startsWith("get")) {
                    if (name.length() >= 4) {
                        if (name.equals("getClass")) {
                            fieldArr2 = fieldArr;
                        } else {
                            cCharAt = name.charAt(3);
                            if (Character.isUpperCase(cCharAt)) {
                                strM21514 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                            } else if (cCharAt == '_') {
                                strM21514 = name.substring(4);
                            } else if (cCharAt == 'f') {
                                strM21514 = name.substring(3);
                            } else if (name.length() < 5) {
                            }
                            if (m21521(cls, interfaceC5797, strM21514)) {
                                fieldArr2 = fieldArr;
                            } else {
                                fieldArr2 = fieldArr;
                                fieldM21515 = m21515(cls, strM21514, fieldArr2, map);
                                if (fieldM21515 != null) {
                                    interfaceC17088 = (InterfaceC17086) fieldM21515.getAnnotation(InterfaceC17086.class);
                                    if (interfaceC17088 != null) {
                                        if (interfaceC17088.serialize()) {
                                            iOrdinal = interfaceC17088.ordinal();
                                            iM11482 = EnumC3984.m11482(interfaceC17088.serialzeFeatures());
                                            if (interfaceC17088.name().length() != 0) {
                                                strM21514 = interfaceC17088.name();
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
                                    InterfaceC17086 interfaceC170816 = interfaceC17088;
                                    int i113 = iOrdinal;
                                    int i114 = iM11482;
                                    enumC16384 = enumC16382;
                                    if (enumC16384 != null) {
                                        strM21514 = enumC16384.m38569(strM21514);
                                    }
                                    String str8 = strM21514;
                                    m21520(cls, method2, i7);
                                    iOrdinal = i113;
                                    linkedHashMap.put(str8, new C15275(str8, method2, fieldM21515, cls, null, iOrdinal, i114, interfaceC17086, interfaceC170816));
                                    iM11482 = i114;
                                } else {
                                    interfaceC17088 = null;
                                }
                                z4 = false;
                                InterfaceC17086 interfaceC170817 = interfaceC17088;
                                int i115 = iOrdinal;
                                int i116 = iM11482;
                                enumC16384 = enumC16382;
                                if (enumC16384 != null) {
                                    strM21514 = enumC16384.m38569(strM21514);
                                }
                                String str9 = strM21514;
                                m21520(cls, method2, i7);
                                iOrdinal = i115;
                                linkedHashMap.put(str9, new C15275(str9, method2, fieldM21515, cls, null, iOrdinal, i116, interfaceC17086, interfaceC170817));
                                iM11482 = i116;
                            }
                        }
                        fieldArr2 = fieldArr2;
                        enumC16385 = enumC16382;
                        i7 = i7;
                        declaredFields = fieldArr2;
                        annotationArr5 = annotationArr2;
                        sArr5 = sArr2;
                        declaredConstructors = constructorArr;
                        strArr4 = strArr;
                        cls2 = cls3;
                    }
                    enumC16383 = enumC16381;
                    fieldArr2 = fieldArr;
                    i7 = i;
                    enumC16385 = enumC16383;
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
                    enumC16383 = enumC16381;
                } else {
                    fieldArr2 = fieldArr2;
                    enumC16383 = enumC16381;
                }
                i7 = i;
                enumC16385 = enumC16383;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            }
            sArr2 = sArr;
            constructorArr = declaredConstructors;
            interfaceC17086 = interfaceC17086M21518;
            annotationArr2 = parameterAnnotations;
            if (interfaceC17086 != null) {
                if (interfaceC17086.serialize()) {
                    i7 = i7;
                    enumC16382 = enumC16382;
                    cls3 = cls3;
                } else {
                    iOrdinal = interfaceC17086.ordinal();
                    iM11482 = EnumC3984.m11482(interfaceC17086.serialzeFeatures());
                    if (interfaceC17086.name().length() != 0) {
                        String strName5 = interfaceC17086.name();
                        m21520(cls, method2, i7);
                        enumC16382 = enumC16382;
                        i7 = i7;
                        cls3 = cls3;
                        linkedHashMap.put(strName5, new C15275(strName5, method2, null, cls, null, iOrdinal, iM11482, interfaceC17086, null));
                    }
                }
                fieldArr2 = fieldArr;
                fieldArr2 = fieldArr2;
                enumC16385 = enumC16382;
                i7 = i7;
                declaredFields = fieldArr2;
                annotationArr5 = annotationArr2;
                sArr5 = sArr2;
                declaredConstructors = constructorArr;
                strArr4 = strArr;
                cls2 = cls3;
            } else {
                iM11482 = 0;
                iOrdinal = 0;
            }
            if (name.startsWith("get")) {
                if (name.length() >= 4) {
                    if (name.equals("getClass")) {
                        fieldArr2 = fieldArr;
                    } else {
                        cCharAt = name.charAt(3);
                        if (Character.isUpperCase(cCharAt)) {
                            strM21514 = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                        } else if (cCharAt == '_') {
                            strM21514 = name.substring(4);
                        } else if (cCharAt == 'f') {
                            strM21514 = name.substring(3);
                        } else if (name.length() < 5) {
                        }
                        if (m21521(cls, interfaceC5797, strM21514)) {
                            fieldArr2 = fieldArr;
                        } else {
                            fieldArr2 = fieldArr;
                            fieldM21515 = m21515(cls, strM21514, fieldArr2, map);
                            if (fieldM21515 != null) {
                                interfaceC17088 = (InterfaceC17086) fieldM21515.getAnnotation(InterfaceC17086.class);
                                if (interfaceC17088 != null) {
                                    if (interfaceC17088.serialize()) {
                                        iOrdinal = interfaceC17088.ordinal();
                                        iM11482 = EnumC3984.m11482(interfaceC17088.serialzeFeatures());
                                        if (interfaceC17088.name().length() != 0) {
                                            strM21514 = interfaceC17088.name();
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
                                InterfaceC17086 interfaceC170818 = interfaceC17088;
                                int i117 = iOrdinal;
                                int i118 = iM11482;
                                enumC16384 = enumC16382;
                                if (enumC16384 != null) {
                                    strM21514 = enumC16384.m38569(strM21514);
                                }
                                String str10 = strM21514;
                                m21520(cls, method2, i7);
                                iOrdinal = i117;
                                linkedHashMap.put(str10, new C15275(str10, method2, fieldM21515, cls, null, iOrdinal, i118, interfaceC17086, interfaceC170818));
                                iM11482 = i118;
                            } else {
                                interfaceC17088 = null;
                            }
                            z4 = false;
                            InterfaceC17086 interfaceC170819 = interfaceC17088;
                            int i119 = iOrdinal;
                            int i1110 = iM11482;
                            enumC16384 = enumC16382;
                            if (enumC16384 != null) {
                                strM21514 = enumC16384.m38569(strM21514);
                            }
                            String str11 = strM21514;
                            m21520(cls, method2, i7);
                            iOrdinal = i119;
                            linkedHashMap.put(str11, new C15275(str11, method2, fieldM21515, cls, null, iOrdinal, i1110, interfaceC17086, interfaceC170819));
                            iM11482 = i1110;
                        }
                    }
                    fieldArr2 = fieldArr2;
                    enumC16385 = enumC16382;
                    i7 = i7;
                    declaredFields = fieldArr2;
                    annotationArr5 = annotationArr2;
                    sArr5 = sArr2;
                    declaredConstructors = constructorArr;
                    strArr4 = strArr;
                    cls2 = cls3;
                }
                enumC16383 = enumC16381;
                fieldArr2 = fieldArr;
                i7 = i;
                enumC16385 = enumC16383;
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
                enumC16383 = enumC16381;
            } else {
                fieldArr2 = fieldArr2;
                enumC16383 = enumC16381;
            }
            i7 = i;
            enumC16385 = enumC16383;
            declaredFields = fieldArr2;
            annotationArr5 = annotationArr2;
            sArr5 = sArr2;
            declaredConstructors = constructorArr;
            strArr4 = strArr;
            cls2 = cls3;
        }
        Class<? super Object> cls4 = cls2;
        Field[] fieldArr3 = declaredFields;
        EnumC16381 enumC16386 = enumC16385;
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
            InterfaceC17086 interfaceC170820 = (InterfaceC17086) field4.getAnnotation(InterfaceC17086.class);
            String name2 = field4.getName();
            if (interfaceC170820 == null) {
                i2 = 0;
                i3 = 0;
            } else if (interfaceC170820.serialize()) {
                int iOrdinal2 = interfaceC170820.ordinal();
                int iM11483 = EnumC3984.m11482(interfaceC170820.serialzeFeatures());
                if (interfaceC170820.name().length() != 0) {
                    name2 = interfaceC170820.name();
                }
                i2 = iOrdinal2;
                i3 = iM11483;
            }
            if (enumC16386 != null) {
                name2 = enumC16386.m38569(name2);
            }
            String str12 = name2;
            if (!linkedHashMap.containsKey(str12)) {
                m21520(cls, field4, i7);
                linkedHashMap.put(str12, new C15275(str12, null, field4, cls, null, i2, i3, null, interfaceC170820));
            }
            i7 = i;
            enumC16386 = enumC16386;
        }
        ArrayList arrayList3 = new ArrayList();
        if (interfaceC5797 == null) {
            z2 = false;
            strArrOrders = strArr3;
        } else {
            strArrOrders = interfaceC5797.orders();
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
                arrayList3.add((C15275) linkedHashMap.get(str13));
            }
        } else {
            Iterator it = linkedHashMap.values().iterator();
            while (it.hasNext()) {
                arrayList3.add((C15275) it.next());
            }
            if (z) {
                Collections.sort(arrayList3);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17086 m21518(Method method, Class cls) {
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
                                InterfaceC17086 interfaceC17086 = (InterfaceC17086) method2.getAnnotation(InterfaceC17086.class);
                                if (interfaceC17086 == null) {
                                    break;
                                }
                                return interfaceC17086;
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
                        InterfaceC17086 interfaceC17087 = (InterfaceC17086) method3.getAnnotation(InterfaceC17086.class);
                        if (interfaceC17087 == null) {
                            break;
                        }
                        return interfaceC17087;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m21521(Class cls, InterfaceC5797 interfaceC5797, String str) {
        if (interfaceC5797 != null && interfaceC5797.ignores() != null) {
            for (String str2 : interfaceC5797.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !m21521(superclass, (InterfaceC5797) superclass.getAnnotation(InterfaceC5797.class), str)) ? false : true;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m21506(Type type) {
        Type genericSuperclass;
        if (type instanceof ParameterizedType) {
            return true;
        }
        return (type instanceof Class) && (genericSuperclass = ((Class) type).getGenericSuperclass()) != Object.class && m21506(genericSuperclass);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Type m21527(Type type) {
        return type instanceof Class ? m21527(((Class) type).getGenericSuperclass()) : type;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Class m21508(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return m21508(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (type instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                return m21508(upperBounds[0]);
            }
            return Object.class;
        }
        return Object.class;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m21514(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m21520(Class cls, Member member, int i) {
        if (member == 0 || !f28620) {
            return;
        }
        Class superclass = cls.getSuperclass();
        if ((superclass != null && superclass != Object.class) || (member.getModifiers() & 1) == 0 || (i & 1) == 0) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (AccessControlException unused) {
                f28620 = false;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Field m21515(Class cls, String str, Field[] fieldArr, HashMap map) {
        Field fieldM21532 = m21532(cls, str, fieldArr, map);
        if (fieldM21532 == null) {
            fieldM21532 = m21532(cls, C0252.m1693("_", str), fieldArr, map);
        }
        if (fieldM21532 == null) {
            fieldM21532 = m21532(cls, C0252.m1693("m_", str), fieldArr, map);
        }
        if (fieldM21532 != null) {
            return fieldM21532;
        }
        return m21532(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, map);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Field m21532(Class cls, String str, Field[] fieldArr, HashMap map) {
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
        return m21515(superclass, str, declaredFields, map);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static Type m21533(Type type) {
        Type typeM21533;
        if (type instanceof ParameterizedType) {
            typeM21533 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (typeM21533 instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) typeM21533).getUpperBounds();
                if (upperBounds.length == 1) {
                    typeM21533 = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                typeM21533 = null;
            } else {
                typeM21533 = m21533(cls.getGenericSuperclass());
            }
        } else {
            typeM21533 = null;
        }
        return typeM21533 == null ? Object.class : typeM21533;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Object m21509(Class cls) {
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
    public static boolean m21522(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < typeArr.length; i++) {
            Type type = typeArr[i];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (m21522(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i] = new C18802(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m21530(String str) {
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
    public static void m21519(Class cls, String str) {
        f28619.put(str, cls);
    }
}
