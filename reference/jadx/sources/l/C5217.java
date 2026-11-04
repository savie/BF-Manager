package l;

import com.umeng.analytics.pro.am;
import com.umeng.analytics.pro.d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۙ᩹ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8AVO */
/* JADX INFO: loaded from: classes3.dex */
public class C5217 implements InterfaceC3725 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f18401;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final AbstractC23863[] f18402;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Class f18403;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public transient int[] f18404;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public transient long[] f18405;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final AbstractC23863[] f18406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22371 f18407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public ConcurrentMapC17249 f18408;

    /* JADX WARN: Code duplicated, block: B:171:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:175:0x03da  */
    /* JADX WARN: Code duplicated, block: B:187:0x0406  */
    /* JADX WARN: Code duplicated, block: B:190:0x040e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0414  */
    /* JADX WARN: Code duplicated, block: B:193:0x041f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0435  */
    /* JADX WARN: Code duplicated, block: B:196:0x0451  */
    /* JADX WARN: Code duplicated, block: B:200:0x045e  */
    /* JADX WARN: Code duplicated, block: B:202:0x0468  */
    /* JADX WARN: Code duplicated, block: B:203:0x0486  */
    /* JADX WARN: Code duplicated, block: B:205:0x048a  */
    /* JADX WARN: Code duplicated, block: B:206:0x048f  */
    /* JADX WARN: Code duplicated, block: B:208:0x0493  */
    /* JADX WARN: Code duplicated, block: B:209:0x0498  */
    /* JADX WARN: Code duplicated, block: B:227:0x052a A[PHI: r35 r36 r37
      0x052a: PHI (r35v2 int) = (r35v1 int), (r35v1 int), (r35v3 int), (r35v3 int) binds: [B:219:0x04e4, B:221:0x04ee, B:225:0x0526, B:226:0x0528] A[DONT_GENERATE, DONT_INLINE]
      0x052a: PHI (r36v2 int) = (r36v1 int), (r36v1 int), (r36v3 int), (r36v3 int) binds: [B:219:0x04e4, B:221:0x04ee, B:225:0x0526, B:226:0x0528] A[DONT_GENERATE, DONT_INLINE]
      0x052a: PHI (r37v1 l.ᩳܶܺ) = (r37v0 l.ᩳܶܺ), (r37v0 l.ᩳܶܺ), (r37v0 l.ᩳܶܺ), (r37v2 l.ᩳܶܺ) binds: [B:219:0x04e4, B:221:0x04ee, B:225:0x0526, B:226:0x0528] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:233:0x0578  */
    /* JADX WARN: Code duplicated, block: B:236:0x0583  */
    /* JADX WARN: Code duplicated, block: B:238:0x0587  */
    /* JADX WARN: Code duplicated, block: B:242:0x0597  */
    /* JADX WARN: Code duplicated, block: B:244:0x059f  */
    /* JADX WARN: Code duplicated, block: B:248:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:250:0x05af  */
    /* JADX WARN: Code duplicated, block: B:252:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:254:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:255:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:257:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:262:0x05db  */
    /* JADX WARN: Code duplicated, block: B:265:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:271:0x0600  */
    /* JADX WARN: Code duplicated, block: B:273:0x0612  */
    /* JADX WARN: Code duplicated, block: B:275:0x0620  */
    /* JADX WARN: Code duplicated, block: B:281:0x0631  */
    /* JADX WARN: Code duplicated, block: B:283:0x0647  */
    /* JADX WARN: Code duplicated, block: B:285:0x0652  */
    /* JADX WARN: Code duplicated, block: B:289:0x067a  */
    /* JADX WARN: Code duplicated, block: B:291:0x0686  */
    /* JADX WARN: Code duplicated, block: B:305:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:308:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:314:0x0766  */
    /* JADX WARN: Code duplicated, block: B:324:0x0789  */
    /* JADX WARN: Code duplicated, block: B:327:0x0798  */
    /* JADX WARN: Code duplicated, block: B:329:0x079c  */
    /* JADX WARN: Code duplicated, block: B:334:0x07b7 A[LOOP:12: B:333:0x07b5->B:334:0x07b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:348:0x0563 A[EDGE_INSN: B:348:0x0563->B:230:0x0563 BREAK  A[LOOP:3: B:173:0x03d4->B:229:0x0558], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:351:0x05a5 A[EDGE_INSN: B:351:0x05a5->B:246:0x05a5 BREAK  A[LOOP:4: B:231:0x0572->B:245:0x05a2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:354:0x05a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x05a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x05f2 A[EDGE_INSN: B:357:0x05f2->B:268:0x05f2 BREAK  A[LOOP:5: B:247:0x05a9->B:267:0x05e9], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x05e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x0627 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:366:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:370:0x0621 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:377:0x07a1 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:202:0x0468, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:308:0x06d0, please report this as an issue */
    public C5217(C13420 c13420, Class cls, Type type) {
        Constructor<?> constructor;
        Class<? super Object> cls2;
        Method[] methodArr;
        Constructor<?> constructor2;
        Field[] fieldArr;
        Constructor<?> constructor3;
        int i;
        Class<? super Object> cls3;
        Constructor<?> constructor4;
        Object obj;
        Class<InterfaceC19167> cls4;
        Field[] fieldArr2;
        Method method;
        Object obj2;
        HashMap map;
        Class<InterfaceC19167> cls5;
        InterfaceC19167 interfaceC19167;
        Class<InterfaceC19167> cls6;
        String str;
        int iOrdinal;
        int iM5815;
        C22371 c22371;
        HashMap map2;
        InterfaceC19167 interfaceC19168;
        Constructor<?> constructor5;
        InterfaceC19167 interfaceC19169;
        C16558[] c16558Arr;
        int length;
        int i2;
        C16558[] c16558Arr2;
        int length2;
        int i3;
        C16558 c16558;
        Class cls7;
        AbstractC23863 c23117;
        int i4;
        Constructor<?> constructor6;
        Class cls8;
        int i5;
        int i6;
        Class<InterfaceC19167> cls9;
        Class<? super Object> cls10;
        ArrayList<Field> arrayList;
        int length3;
        int i7;
        Class<Collection> cls11;
        Class<Map> cls12;
        Class<? super Object> superclass;
        Class cls13;
        int i8;
        int i9;
        int i10;
        Method method2;
        String name;
        Class<?> returnType;
        InterfaceC19167 interfaceC191610;
        String strName;
        String name2;
        int size;
        int i11;
        boolean z;
        InterfaceC19167 interfaceC191611;
        String strName2;
        int i12;
        int i13;
        Class<? super Object> cls14;
        Field[] declaredFields;
        int length4;
        int i14;
        Field field;
        int modifiers;
        Class cls15;
        Class<?> type2;
        Field field2;
        int modifiers2;
        Class<?> type3;
        Method method3;
        String name3;
        Class<?> returnType2;
        InterfaceC19167 interfaceC19167M10223;
        int iOrdinal2;
        int iM5816;
        char cCharAt;
        String strM10219;
        Field fieldM10220;
        InterfaceC19167 interfaceC191612;
        Method method4;
        int modifiers3 = cls.getModifiers();
        ArrayList arrayList2 = new ArrayList();
        HashMap map3 = new HashMap();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        boolean zM10232 = C3134.m10232(cls);
        int i15 = modifiers3 & 1024;
        int i16 = 0;
        Constructor<?> declaredConstructor = null;
        if (i15 == 0 && (declaredConstructors.length == 1 || !zM10232)) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(null);
            } catch (Exception unused) {
            }
            if (declaredConstructor != null || !cls.isMemberClass() || (modifiers3 & 8) != 0) {
                constructor = declaredConstructor;
                break;
            }
            int length5 = declaredConstructors.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length5) {
                    constructor = declaredConstructor;
                    break;
                }
                Constructor<?> constructor7 = declaredConstructors[i17];
                Class<?>[] parameterTypes = constructor7.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    constructor = constructor7;
                    break;
                }
                i17++;
            }
        } else {
            constructor = null;
        }
        ArrayList arrayList3 = new ArrayList();
        Method method5 = null;
        Class superclass2 = cls;
        while (true) {
            cls2 = Object.class;
            if (superclass2 == null || superclass2 == cls2) {
                break;
            }
            Method[] declaredMethods = superclass2.getDeclaredMethods();
            int length6 = declaredMethods.length;
            while (i16 < length6) {
                int i18 = length6;
                Method method6 = declaredMethods[i16];
                Method[] methodArr2 = declaredMethods;
                int modifiers4 = method6.getModifiers();
                if ((modifiers4 & 8) != 0) {
                    if (method6.isAnnotationPresent(InterfaceC7980.class)) {
                        if (method5 != null) {
                            throw new C4251("multi-json creator");
                        }
                        method5 = method6;
                    }
                    i16++;
                    length6 = i18;
                    declaredMethods = methodArr2;
                } else {
                    if ((modifiers4 & 2) == 0) {
                        method4 = method5;
                        if ((modifiers4 & 256) == 0 && (modifiers4 & 4) == 0) {
                            arrayList3.add(method6);
                        }
                    }
                    method5 = method4;
                    i16++;
                    length6 = i18;
                    declaredMethods = methodArr2;
                }
                method4 = method5;
                method5 = method4;
                i16++;
                length6 = i18;
                declaredMethods = methodArr2;
            }
            superclass2 = superclass2.getSuperclass();
            i16 = 0;
        }
        int size2 = arrayList3.size();
        Method[] methodArr3 = new Method[size2];
        arrayList3.toArray(methodArr3);
        Field[] declaredFields2 = cls.getDeclaredFields();
        boolean z2 = cls.isInterface() || i15 != 0;
        Class<InterfaceC19167> cls16 = InterfaceC19167.class;
        String[] strArr = null;
        if (constructor == null || z2) {
            Object obj3 = InterfaceC10216.class;
            int length7 = declaredConstructors.length;
            methodArr = methodArr3;
            int i19 = 0;
            while (true) {
                if (i19 >= length7) {
                    constructor2 = null;
                    break;
                }
                int i20 = length7;
                constructor2 = declaredConstructors[i19];
                if (((InterfaceC7980) constructor2.getAnnotation(InterfaceC7980.class)) != null) {
                    break;
                }
                i19++;
                length7 = i20;
            }
            Constructor<?> constructor8 = constructor2;
            String str2 = "illegal json creator";
            if (constructor8 == null) {
                fieldArr = declaredFields2;
                constructor3 = constructor8;
                i = size2;
                cls3 = cls2;
                constructor4 = constructor;
                obj = obj3;
                cls4 = cls16;
                if (method5 != null) {
                    C3134.m10225(cls, method5, modifiers3);
                    Class<?>[] parameterTypes2 = method5.getParameterTypes();
                    if (parameterTypes2.length > 0) {
                        Type[] genericParameterTypes = method5.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations = method5.getParameterAnnotations();
                        int i21 = 0;
                        while (i21 < parameterTypes2.length) {
                            Annotation[] annotationArr = parameterAnnotations[i21];
                            int length8 = annotationArr.length;
                            int i22 = 0;
                            while (true) {
                                if (i22 >= length8) {
                                    interfaceC19168 = null;
                                    break;
                                }
                                Annotation annotation = annotationArr[i22];
                                if (annotation instanceof InterfaceC19167) {
                                    interfaceC19168 = (InterfaceC19167) annotation;
                                    break;
                                }
                                i22++;
                            }
                            if (interfaceC19168 == null) {
                                throw new C4251("illegal json creator");
                            }
                            Field[] fieldArr3 = fieldArr;
                            C22371.m50444(arrayList2, new C16558(interfaceC19168.name(), cls, parameterTypes2[i21], genericParameterTypes[i21], C3134.m10220(cls, interfaceC19168.name(), fieldArr3, map3), interfaceC19168.ordinal(), EnumC1643.m5815(interfaceC19168.serialzeFeatures())));
                            i21++;
                            fieldArr = fieldArr3;
                            parameterTypes2 = parameterTypes2;
                            map3 = map3;
                        }
                        int size3 = arrayList2.size();
                        C16558[] c16558Arr3 = new C16558[size3];
                        arrayList2.toArray(c16558Arr3);
                        C16558[] c16558Arr4 = new C16558[size3];
                        System.arraycopy(c16558Arr3, 0, c16558Arr4, 0, size3);
                        Arrays.sort(c16558Arr4);
                        c22371 = new C22371(cls, null, null, method5, c16558Arr3, Arrays.equals(c16558Arr3, c16558Arr4) ? c16558Arr3 : c16558Arr4, (InterfaceC10216) cls.getAnnotation(obj), null);
                        map2 = null;
                    }
                } else {
                    map3 = map3;
                    fieldArr2 = fieldArr;
                    if (z2) {
                        method = method5;
                        obj2 = obj;
                        map = map3;
                        cls5 = cls4;
                    } else {
                        if (!zM10232 || declaredConstructors.length <= 0) {
                            throw new C4251(C24966.m55772(cls, "default constructor not found. "));
                        }
                        String[] strArrM10242 = C3134.m10242(cls);
                        if (strArrM10242 == null) {
                            throw new C4251(C24966.m55772(cls, "default constructor not found. "));
                        }
                        Constructor<?> constructor9 = constructor3;
                        for (Constructor<?> constructor10 : declaredConstructors) {
                            Class<?>[] parameterTypes3 = constructor10.getParameterTypes();
                            if ((parameterTypes3.length <= 0 || !parameterTypes3[parameterTypes3.length - 1].getName().equals("l.᩷ۡ᩵")) && (constructor9 == null || constructor9.getParameterTypes().length < parameterTypes3.length)) {
                                constructor9 = constructor10;
                            }
                        }
                        constructor9.setAccessible(true);
                        C3134.m10225(cls, constructor9, modifiers3);
                        Class<?>[] parameterTypes4 = constructor9.getParameterTypes();
                        Type[] genericParameterTypes2 = constructor9.getGenericParameterTypes();
                        Annotation[][] parameterAnnotations2 = constructor9.getParameterAnnotations();
                        int i23 = 0;
                        while (i23 < parameterTypes4.length) {
                            String str3 = strArrM10242[i23];
                            Annotation[] annotationArr2 = parameterAnnotations2[i23];
                            int length9 = annotationArr2.length;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length9) {
                                    interfaceC19167 = null;
                                    break;
                                }
                                Annotation annotation2 = annotationArr2[i24];
                                if (annotation2 instanceof InterfaceC19167) {
                                    interfaceC19167 = (InterfaceC19167) annotation2;
                                    break;
                                }
                                i24++;
                            }
                            Class<?> cls17 = parameterTypes4[i23];
                            Type type4 = genericParameterTypes2[i23];
                            HashMap map4 = map3;
                            Field fieldM10221 = C3134.m10220(cls, str3, fieldArr2, map4);
                            if (fieldM10221 == null || interfaceC19167 != null) {
                                cls6 = cls4;
                            } else {
                                cls6 = cls4;
                                interfaceC19167 = (InterfaceC19167) fieldM10221.getAnnotation(cls6);
                            }
                            if (interfaceC19167 != null) {
                                iOrdinal = interfaceC19167.ordinal();
                                iM5815 = EnumC1643.m5815(interfaceC19167.serialzeFeatures());
                                String strName3 = interfaceC19167.name();
                                str = strName3.length() != 0 ? strName3 : str3;
                            } else {
                                str = str3;
                                iOrdinal = 0;
                                iM5815 = 0;
                            }
                            C22371.m50444(arrayList2, new C16558(str, cls, cls17, type4, fieldM10221, iOrdinal, iM5815));
                            i23++;
                            cls4 = cls6;
                            map3 = map4;
                            method5 = method5;
                            constructor9 = constructor9;
                            obj = obj;
                        }
                        constructor3 = constructor9;
                        method = method5;
                        obj2 = obj;
                        map = map3;
                        cls5 = cls4;
                        int size4 = arrayList2.size();
                        C16558[] c16558Arr5 = new C16558[size4];
                        arrayList2.toArray(c16558Arr5);
                        C16558[] c16558Arr6 = new C16558[size4];
                        System.arraycopy(c16558Arr5, 0, c16558Arr6, 0, size4);
                        Arrays.sort(c16558Arr6);
                        String[] strArr2 = new String[size4];
                        for (int i25 = 0; i25 < size4; i25++) {
                            strArr2[i25] = c16558Arr5[i25].f53585;
                        }
                        strArr = strArr2;
                    }
                    constructor6 = constructor4;
                    if (constructor4 != null) {
                        C3134.m10225(cls, constructor6, modifiers3);
                    }
                    cls8 = cls;
                    i5 = 0;
                    while (true) {
                        i6 = i;
                        if (i5 < i6) {
                            break;
                        }
                        method3 = methodArr[i5];
                        name3 = method3.getName();
                        if (name3.length() < 4 && (((returnType2 = method3.getReturnType()) == Void.TYPE || returnType2 == method3.getDeclaringClass()) && method3.getParameterTypes().length == 1)) {
                            InterfaceC19167 interfaceC191613 = (InterfaceC19167) method3.getAnnotation(cls5);
                            interfaceC19167M10223 = interfaceC191613 == null ? C3134.m10223(method3, cls8) : interfaceC191613;
                            if (interfaceC19167M10223 != null) {
                                if (interfaceC19167M10223.deserialize()) {
                                    iOrdinal2 = interfaceC19167M10223.ordinal();
                                    iM5816 = EnumC1643.m5815(interfaceC19167M10223.serialzeFeatures());
                                    if (interfaceC19167M10223.name().length() != 0) {
                                        C22371.m50444(arrayList2, new C16558(interfaceC19167M10223.name(), method3, null, cls8, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                                        C3134.m10225(cls8, method3, modifiers3);
                                    }
                                }
                                i6 = i6;
                                i5 = i5;
                                map = map;
                                cls3 = cls3;
                                cls5 = cls5;
                            } else {
                                iOrdinal2 = 0;
                                iM5816 = 0;
                            }
                            if (name3.startsWith("set")) {
                                cCharAt = name3.charAt(3);
                                if (Character.isUpperCase(cCharAt)) {
                                    int i26 = C3134.f10148;
                                    strM10219 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                } else if (cCharAt == '_') {
                                    strM10219 = name3.substring(4);
                                } else if (cCharAt == 'f') {
                                    strM10219 = name3.substring(3);
                                } else if (name3.length() >= 5 || !Character.isUpperCase(name3.charAt(4))) {
                                    i6 = i6;
                                    i5 = i5;
                                    map = map;
                                    cls3 = cls3;
                                    cls5 = cls5;
                                } else {
                                    strM10219 = C3134.m10219(name3.substring(3));
                                }
                                fieldM10220 = C3134.m10220(cls8, strM10219, fieldArr2, map);
                                if (fieldM10220 == null && method3.getParameterTypes()[0] == Boolean.TYPE) {
                                    fieldM10220 = C3134.m10220(cls8, am.ae + Character.toUpperCase(strM10219.charAt(0)) + strM10219.substring(1), fieldArr2, map);
                                }
                                if (fieldM10220 != null || (interfaceC191612 = (InterfaceC19167) fieldM10220.getAnnotation(cls5)) == null) {
                                    C22371.m50444(arrayList2, new C16558(strM10219, method3, null, cls, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                                    C3134.m10225(cls, method3, modifiers3);
                                } else {
                                    iOrdinal2 = interfaceC191612.ordinal();
                                    iM5816 = EnumC1643.m5815(interfaceC191612.serialzeFeatures());
                                    if (interfaceC191612.name().length() != 0) {
                                        C22371.m50444(arrayList2, new C16558(interfaceC191612.name(), method3, fieldM10220, cls8, type, iOrdinal2, iM5816, interfaceC19167M10223, interfaceC191612));
                                    } else {
                                        if (interfaceC19167M10223 == null) {
                                            interfaceC19167M10223 = interfaceC191612;
                                        }
                                        C22371.m50444(arrayList2, new C16558(strM10219, method3, null, cls, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                                        C3134.m10225(cls, method3, modifiers3);
                                    }
                                }
                                cls8 = cls;
                            } else {
                                i6 = i6;
                                i5 = i5;
                                map = map;
                                cls3 = cls3;
                                cls5 = cls5;
                            }
                        } else {
                            i6 = i6;
                            i5 = i5;
                            map = map;
                            cls3 = cls3;
                            cls5 = cls5;
                        }
                        i5++;
                        cls5 = cls5;
                        map = map;
                        i = i6;
                        cls3 = cls3;
                    }
                    cls9 = cls5;
                    cls10 = cls3;
                    arrayList = new ArrayList(fieldArr2.length);
                    length3 = fieldArr2.length;
                    i7 = 0;
                    while (true) {
                        cls11 = Collection.class;
                        cls12 = Map.class;
                        if (i7 < length3) {
                            break;
                        }
                        field2 = fieldArr2[i7];
                        modifiers2 = field2.getModifiers();
                        if ((modifiers2 & 8) == 0) {
                            if ((modifiers2 & 16) != 0) {
                                type3 = field2.getType();
                                if (cls12.isAssignableFrom(type3) || cls11.isAssignableFrom(type3)) {
                                    if ((field2.getModifiers() & 1) != 0) {
                                        arrayList.add(field2);
                                    }
                                }
                            } else if ((field2.getModifiers() & 1) != 0) {
                                arrayList.add(field2);
                            }
                        }
                        i7++;
                    }
                    superclass = cls8.getSuperclass();
                    while (superclass != null) {
                        cls14 = cls10;
                        if (superclass != cls14) {
                            break;
                        }
                        declaredFields = superclass.getDeclaredFields();
                        length4 = declaredFields.length;
                        i14 = 0;
                        while (i14 < length4) {
                            field = declaredFields[i14];
                            modifiers = field.getModifiers();
                            if ((modifiers & 8) != 0) {
                                cls15 = cls8;
                            } else {
                                if ((modifiers & 16) != 0) {
                                    cls15 = cls8;
                                    type2 = field.getType();
                                    if (!cls12.isAssignableFrom(type2) || cls11.isAssignableFrom(type2)) {
                                    }
                                } else {
                                    cls15 = cls8;
                                }
                                if ((modifiers & 1) != 0) {
                                    arrayList.add(field);
                                }
                            }
                            i14++;
                            cls8 = cls15;
                        }
                        superclass = superclass.getSuperclass();
                        cls10 = cls14;
                    }
                    Class cls18 = cls8;
                    cls13 = cls18;
                    for (Field field3 : arrayList) {
                        name2 = field3.getName();
                        size = arrayList2.size();
                        z = false;
                        for (i11 = 0; i11 < size; i11++) {
                            if (((C16558) arrayList2.get(i11)).f53585.equals(name2)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            interfaceC191611 = (InterfaceC19167) field3.getAnnotation(cls9);
                            if (interfaceC191611 != null) {
                                int iOrdinal3 = interfaceC191611.ordinal();
                                int iM5817 = EnumC1643.m5815(interfaceC191611.serialzeFeatures());
                                strName2 = interfaceC191611.name().length() != 0 ? interfaceC191611.name() : name2;
                                i12 = iOrdinal3;
                                i13 = iM5817;
                            } else {
                                strName2 = name2;
                                i12 = 0;
                                i13 = 0;
                            }
                            C3134.m10225(cls13, field3, modifiers3);
                            C22371.m50444(arrayList2, new C16558(strName2, null, field3, cls13, type, i12, i13, null, interfaceC191611));
                            cls13 = cls;
                        }
                    }
                    i8 = 4;
                    i9 = i6;
                    i10 = 0;
                    while (i10 < i9) {
                        method2 = methodArr[i10];
                        name = method2.getName();
                        if (name.length() >= i8 && name.startsWith("get") && Character.isUpperCase(name.charAt(3)) && method2.getParameterTypes().length == 0) {
                            returnType = method2.getReturnType();
                            if (!cls11.isAssignableFrom(returnType) || cls12.isAssignableFrom(returnType)) {
                                interfaceC191610 = (InterfaceC19167) method2.getAnnotation(cls9);
                                if (interfaceC191610 != null) {
                                    strName = interfaceC191610.name();
                                    strName = strName.length() <= 0 ? Character.toLowerCase(name.charAt(3)) + name.substring(i8) : strName;
                                }
                                C22371.m50444(arrayList2, new C16558(strName, method2, null, cls, type, 0, 0, interfaceC191610, null));
                                C3134.m10225(cls, method2, modifiers3);
                            }
                        }
                        i10++;
                        cls11 = cls11;
                        cls12 = cls12;
                        i9 = i9;
                        i8 = 4;
                    }
                    int size5 = arrayList2.size();
                    C16558[] c16558Arr7 = new C16558[size5];
                    arrayList2.toArray(c16558Arr7);
                    C16558[] c16558Arr8 = new C16558[size5];
                    System.arraycopy(c16558Arr7, 0, c16558Arr8, 0, size5);
                    Arrays.sort(c16558Arr8);
                    c22371 = new C22371(cls, constructor6, constructor3, method, c16558Arr7, c16558Arr8, (InterfaceC10216) cls.getAnnotation(obj2), strArr);
                    map2 = null;
                }
                this.f18403 = cls;
                this.f18407 = c22371;
                c16558Arr = c22371.f72422;
                this.f18402 = new AbstractC23863[c16558Arr.length];
                length = c16558Arr.length;
                for (i2 = 0; i2 < length; i2++) {
                    c16558 = c16558Arr[i2];
                    cls7 = c16558.f53586;
                    if (cls7 != List.class || cls7 == ArrayList.class || (cls7.isArray() && !cls7.getComponentType().isPrimitive())) {
                        c23117 = new C23117(cls, c16558);
                    } else {
                        c23117 = new C1268(cls, c16558);
                    }
                    this.f18402[i2] = c23117;
                    for (String str4 : c16558.f53591) {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        map2.put(str4, c23117);
                    }
                }
                this.f18401 = map2;
                c16558Arr2 = c22371.f72428;
                this.f18406 = new AbstractC23863[c16558Arr2.length];
                length2 = c16558Arr2.length;
                for (i3 = 0; i3 < length2; i3++) {
                    this.f18406[i3] = m15697(c16558Arr2[i3].f53585);
                }
            }
            C3134.m10225(cls, constructor8, modifiers3);
            Class<?>[] parameterTypes5 = constructor8.getParameterTypes();
            Type[] genericParameterTypes3 = constructor8.getGenericParameterTypes();
            Annotation[][] parameterAnnotations3 = constructor8.getParameterAnnotations();
            int i27 = 0;
            while (i27 < parameterTypes5.length) {
                Annotation[] annotationArr3 = parameterAnnotations3[i27];
                int length10 = annotationArr3.length;
                String str5 = str2;
                int i28 = 0;
                while (true) {
                    if (i28 >= length10) {
                        interfaceC19169 = null;
                        break;
                    }
                    int i29 = length10;
                    Annotation annotation3 = annotationArr3[i28];
                    Annotation[] annotationArr4 = annotationArr3;
                    if (annotation3 instanceof InterfaceC19167) {
                        interfaceC19169 = (InterfaceC19167) annotation3;
                        break;
                    } else {
                        i28++;
                        length10 = i29;
                        annotationArr3 = annotationArr4;
                    }
                }
                if (interfaceC19169 == null) {
                    throw new C4251(str5);
                }
                Class<?> cls19 = parameterTypes5[i27];
                Type type5 = genericParameterTypes3[i27];
                Field fieldM10222 = C3134.m10220(cls, interfaceC19169.name(), declaredFields2, map3);
                if (fieldM10222 != null) {
                    C3134.m10225(cls, fieldM10222, modifiers3);
                }
                C22371.m50444(arrayList2, new C16558(interfaceC19169.name(), cls, cls19, type5, fieldM10222, interfaceC19169.ordinal(), EnumC1643.m5815(interfaceC19169.serialzeFeatures())));
                i27++;
                str2 = str5;
                declaredFields2 = declaredFields2;
                constructor8 = constructor8;
                cls2 = cls2;
                parameterTypes5 = parameterTypes5;
                size2 = size2;
                cls16 = cls16;
                obj3 = obj3;
                constructor = constructor;
            }
            fieldArr = declaredFields2;
            constructor3 = constructor8;
            i = size2;
            cls3 = cls2;
            constructor4 = constructor;
            obj = obj3;
            cls4 = cls16;
            int size6 = arrayList2.size();
            C16558[] c16558Arr9 = new C16558[size6];
            arrayList2.toArray(c16558Arr9);
            C16558[] c16558Arr10 = new C16558[size6];
            System.arraycopy(c16558Arr9, 0, c16558Arr10, 0, size6);
            Arrays.sort(c16558Arr10);
            String[] strArr3 = new String[size6];
            for (int i30 = 0; i30 < size6; i30++) {
                strArr3[i30] = c16558Arr9[i30].f53585;
            }
            strArr = strArr3;
            fieldArr2 = fieldArr;
            constructor5 = constructor3;
        } else {
            constructor5 = null;
            cls4 = cls16;
            methodArr = methodArr3;
            i = size2;
            cls3 = cls2;
            constructor4 = constructor;
            obj = InterfaceC10216.class;
            fieldArr2 = declaredFields2;
        }
        constructor3 = constructor5;
        method = method5;
        obj2 = obj;
        map = map3;
        cls5 = cls4;
        constructor6 = constructor4;
        if (constructor4 != null) {
            C3134.m10225(cls, constructor6, modifiers3);
        }
        cls8 = cls;
        i5 = 0;
        while (true) {
            i6 = i;
            if (i5 < i6) {
                break;
                break;
            }
            method3 = methodArr[i5];
            name3 = method3.getName();
            if (name3.length() < 4) {
                i6 = i6;
                i5 = i5;
                map = map;
                cls3 = cls3;
                cls5 = cls5;
            } else {
                InterfaceC19167 interfaceC191614 = (InterfaceC19167) method3.getAnnotation(cls5);
                interfaceC19167M10223 = interfaceC191614 == null ? C3134.m10223(method3, cls8) : interfaceC191614;
                if (interfaceC19167M10223 != null) {
                    if (interfaceC19167M10223.deserialize()) {
                        iOrdinal2 = interfaceC19167M10223.ordinal();
                        iM5816 = EnumC1643.m5815(interfaceC19167M10223.serialzeFeatures());
                        if (interfaceC19167M10223.name().length() != 0) {
                            C22371.m50444(arrayList2, new C16558(interfaceC19167M10223.name(), method3, null, cls8, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                            C3134.m10225(cls8, method3, modifiers3);
                        }
                    }
                    i6 = i6;
                    i5 = i5;
                    map = map;
                    cls3 = cls3;
                    cls5 = cls5;
                } else {
                    iOrdinal2 = 0;
                    iM5816 = 0;
                }
                if (name3.startsWith("set")) {
                    i6 = i6;
                    i5 = i5;
                    map = map;
                    cls3 = cls3;
                    cls5 = cls5;
                } else {
                    cCharAt = name3.charAt(3);
                    if (Character.isUpperCase(cCharAt)) {
                        int i210 = C3134.f10148;
                        strM10219 = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                    } else if (cCharAt == '_') {
                        strM10219 = name3.substring(4);
                    } else if (cCharAt == 'f') {
                        strM10219 = name3.substring(3);
                    } else {
                        if (name3.length() >= 5) {
                        }
                        i6 = i6;
                        i5 = i5;
                        map = map;
                        cls3 = cls3;
                        cls5 = cls5;
                    }
                    fieldM10220 = C3134.m10220(cls8, strM10219, fieldArr2, map);
                    if (fieldM10220 == null) {
                        fieldM10220 = C3134.m10220(cls8, am.ae + Character.toUpperCase(strM10219.charAt(0)) + strM10219.substring(1), fieldArr2, map);
                    }
                    if (fieldM10220 != null) {
                        C22371.m50444(arrayList2, new C16558(strM10219, method3, null, cls, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                        C3134.m10225(cls, method3, modifiers3);
                    } else {
                        C22371.m50444(arrayList2, new C16558(strM10219, method3, null, cls, type, iOrdinal2, iM5816, interfaceC19167M10223, null));
                        C3134.m10225(cls, method3, modifiers3);
                    }
                    cls8 = cls;
                }
            }
            i5++;
            cls5 = cls5;
            map = map;
            i = i6;
            cls3 = cls3;
        }
        cls9 = cls5;
        cls10 = cls3;
        arrayList = new ArrayList(fieldArr2.length);
        length3 = fieldArr2.length;
        i7 = 0;
        while (true) {
            cls11 = Collection.class;
            cls12 = Map.class;
            if (i7 < length3) {
                break;
                break;
            }
            field2 = fieldArr2[i7];
            modifiers2 = field2.getModifiers();
            if ((modifiers2 & 8) == 0) {
                if ((modifiers2 & 16) != 0) {
                    type3 = field2.getType();
                    if (cls12.isAssignableFrom(type3)) {
                        if ((field2.getModifiers() & 1) != 0) {
                            arrayList.add(field2);
                        }
                    } else if ((field2.getModifiers() & 1) != 0) {
                        arrayList.add(field2);
                    }
                } else if ((field2.getModifiers() & 1) != 0) {
                    arrayList.add(field2);
                }
            }
            i7++;
        }
        superclass = cls8.getSuperclass();
        while (superclass != null) {
            cls14 = cls10;
            if (superclass != cls14) {
                break;
                break;
            }
            declaredFields = superclass.getDeclaredFields();
            length4 = declaredFields.length;
            i14 = 0;
            while (i14 < length4) {
                field = declaredFields[i14];
                modifiers = field.getModifiers();
                if ((modifiers & 8) != 0) {
                    cls15 = cls8;
                } else {
                    if ((modifiers & 16) != 0) {
                        cls15 = cls8;
                        type2 = field.getType();
                        if (!cls12.isAssignableFrom(type2)) {
                        }
                    } else {
                        cls15 = cls8;
                    }
                    if ((modifiers & 1) != 0) {
                        arrayList.add(field);
                    }
                }
                i14++;
                cls8 = cls15;
            }
            superclass = superclass.getSuperclass();
            cls10 = cls14;
        }
        Class cls110 = cls8;
        cls13 = cls110;
        while (r1.hasNext()) {
            name2 = field3.getName();
            size = arrayList2.size();
            z = false;
            while (i11 < size) {
                if (((C16558) arrayList2.get(i11)).f53585.equals(name2)) {
                    z = true;
                }
            }
            if (!z) {
                interfaceC191611 = (InterfaceC19167) field3.getAnnotation(cls9);
                if (interfaceC191611 != null) {
                    int iOrdinal4 = interfaceC191611.ordinal();
                    int iM5818 = EnumC1643.m5815(interfaceC191611.serialzeFeatures());
                    strName2 = interfaceC191611.name().length() != 0 ? interfaceC191611.name() : name2;
                    i12 = iOrdinal4;
                    i13 = iM5818;
                } else {
                    strName2 = name2;
                    i12 = 0;
                    i13 = 0;
                }
                C3134.m10225(cls13, field3, modifiers3);
                C22371.m50444(arrayList2, new C16558(strName2, null, field3, cls13, type, i12, i13, null, interfaceC191611));
                cls13 = cls;
            }
        }
        i8 = 4;
        i9 = i6;
        i10 = 0;
        while (i10 < i9) {
            method2 = methodArr[i10];
            name = method2.getName();
            if (name.length() >= i8) {
                returnType = method2.getReturnType();
                if (!cls11.isAssignableFrom(returnType)) {
                }
                interfaceC191610 = (InterfaceC19167) method2.getAnnotation(cls9);
                if (interfaceC191610 != null) {
                    strName = interfaceC191610.name();
                    if (strName.length() <= 0) {
                    }
                }
                C22371.m50444(arrayList2, new C16558(strName, method2, null, cls, type, 0, 0, interfaceC191610, null));
                C3134.m10225(cls, method2, modifiers3);
            }
            i10++;
            cls11 = cls11;
            cls12 = cls12;
            i9 = i9;
            i8 = 4;
        }
        int size7 = arrayList2.size();
        C16558[] c16558Arr11 = new C16558[size7];
        arrayList2.toArray(c16558Arr11);
        C16558[] c16558Arr12 = new C16558[size7];
        System.arraycopy(c16558Arr11, 0, c16558Arr12, 0, size7);
        Arrays.sort(c16558Arr12);
        c22371 = new C22371(cls, constructor6, constructor3, method, c16558Arr11, c16558Arr12, (InterfaceC10216) cls.getAnnotation(obj2), strArr);
        map2 = null;
        this.f18403 = cls;
        this.f18407 = c22371;
        c16558Arr = c22371.f72422;
        this.f18402 = new AbstractC23863[c16558Arr.length];
        length = c16558Arr.length;
        while (i2 < length) {
            c16558 = c16558Arr[i2];
            cls7 = c16558.f53586;
            if (cls7 != List.class) {
                c23117 = new C23117(cls, c16558);
            } else {
                c23117 = new C23117(cls, c16558);
            }
            this.f18402[i2] = c23117;
            while (i4 < r8) {
                if (map2 == null) {
                    map2 = new HashMap();
                }
                map2.put(str4, c23117);
            }
        }
        this.f18401 = map2;
        c16558Arr2 = c22371.f72428;
        this.f18406 = new AbstractC23863[c16558Arr2.length];
        length2 = c16558Arr2.length;
        while (i3 < length2) {
            this.f18406[i3] = m15697(c16558Arr2[i3].f53585);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15696(C2759 c2759, Type type) {
        Object objNewInstance;
        boolean z = type instanceof Class;
        Class cls = this.f18403;
        if (z && cls.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new C14691(0, (c2759.f9128.f44213 & EnumC7234.OrderedField.f23858) != 0));
        }
        C22371 c22371 = this.f18407;
        Constructor constructor = c22371.f72425;
        int i = c22371.f72432;
        Method method = c22371.f72430;
        if ((constructor == null && method == null) || (method != null && i > 0)) {
            return null;
        }
        try {
            if (i != 0) {
                objNewInstance = constructor.newInstance(c2759.f9133.f50882);
            } else if (constructor != null) {
                objNewInstance = constructor.newInstance(null);
            } else {
                objNewInstance = method.invoke(null, null);
            }
            if (c2759 != null && (c2759.f9128.f44213 & EnumC7234.InitStringFieldAsEmpty.f23858) != 0) {
                for (C16558 c16558 : c22371.f72428) {
                    if (c16558.f53586 == String.class) {
                        Method method2 = c16558.f53587;
                        if (method2 != null) {
                            method2.invoke(objNewInstance, "");
                        } else {
                            c16558.f53592.set(objNewInstance, "");
                        }
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e) {
            throw new C4251("create instance error, class ".concat(cls.getName()), (Throwable) e);
        }
    }

    @Override // l.InterfaceC3725
    /* JADX INFO: renamed from: ۙ */
    public Object mo12124(C2759 c2759, Type type, Object obj) {
        return m15693(c2759, type, obj);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01aa A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ae A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01bb A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01de  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e1 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01ed A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x02ec A[Catch: IllegalAccessException -> 0x0359, TRY_LEAVE, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x02f6 A[Catch: IllegalAccessException -> 0x0359, TRY_ENTER, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:183:0x0301 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x030c  */
    /* JADX WARN: Code duplicated, block: B:187:0x0310 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:189:0x0318  */
    /* JADX WARN: Code duplicated, block: B:190:0x031b A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:192:0x0326 A[Catch: IllegalAccessException -> 0x0359, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:196:0x0335 A[Catch: IllegalAccessException -> 0x0359, TRY_ENTER, TryCatch #0 {IllegalAccessException -> 0x0359, blocks: (B:10:0x0025, B:12:0x0029, B:14:0x0034, B:16:0x0040, B:18:0x0044, B:22:0x0053, B:21:0x004f, B:25:0x005f, B:29:0x006e, B:28:0x006a, B:30:0x0076, B:15:0x0038, B:33:0x0081, B:36:0x0089, B:47:0x00b0, B:49:0x00b7, B:51:0x00bb, B:55:0x00ca, B:54:0x00c6, B:58:0x00d5, B:62:0x00e4, B:61:0x00e0, B:63:0x00eb, B:48:0x00b4, B:39:0x0092, B:41:0x009c, B:45:0x00ab, B:44:0x00a7, B:65:0x00f2, B:66:0x010a, B:67:0x010b, B:69:0x0111, B:71:0x011b, B:73:0x0127, B:75:0x012d, B:79:0x013c, B:78:0x0138, B:82:0x0148, B:86:0x0157, B:85:0x0153, B:87:0x015f, B:72:0x011f, B:88:0x0164, B:90:0x0168, B:103:0x0198, B:106:0x01aa, B:108:0x01b5, B:110:0x01bb, B:114:0x01ca, B:113:0x01c6, B:117:0x01d6, B:121:0x01e5, B:120:0x01e1, B:122:0x01ed, B:107:0x01ae, B:93:0x017b, B:96:0x0188, B:104:0x01a4, B:123:0x01f2, B:125:0x01f8, B:128:0x0202, B:140:0x023b, B:142:0x0244, B:146:0x0253, B:145:0x024f, B:149:0x025f, B:153:0x026e, B:152:0x026a, B:154:0x0276, B:131:0x020c, B:136:0x0219, B:138:0x0227, B:139:0x0233, B:155:0x027b, B:156:0x0295, B:159:0x029a, B:162:0x02a4, B:164:0x02b6, B:168:0x02c5, B:167:0x02c1, B:171:0x02d1, B:175:0x02e0, B:174:0x02dc, B:176:0x02e8, B:177:0x02ec, B:180:0x02f6, B:184:0x0305, B:193:0x0329, B:196:0x0335, B:199:0x033c, B:200:0x0341, B:203:0x0346, B:206:0x034d, B:207:0x0352, B:183:0x0301, B:187:0x0310, B:191:0x031f, B:190:0x031b, B:192:0x0326), top: B:222:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x033b  */
    /* JADX WARN: Code duplicated, block: B:201:0x0342  */
    /* JADX WARN: Code duplicated, block: B:228:0x033c A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private Object m15692(C2759 c2759, Type type, Object obj) {
        char c;
        String str;
        int i;
        int i2;
        char cCharAt;
        int i3;
        char cCharAt2;
        Enum enumValueOf;
        boolean z;
        int i4;
        char c2;
        int i5;
        char cCharAt3;
        int i6;
        char cCharAt4;
        String strM33970;
        C13945 c13945 = c2759.f9128;
        Object objM15696 = m15696(c2759, type);
        AbstractC23863[] abstractC23863Arr = this.f18402;
        int length = abstractC23863Arr.length;
        int i7 = 0;
        while (i7 < length) {
            char c3 = i7 == length + (-1) ? ']' : ',';
            AbstractC23863 abstractC23863 = abstractC23863Arr[i7];
            C16558 c16558 = abstractC23863.f77258;
            Class cls = c16558.f53586;
            Field field = c16558.f53592;
            boolean z2 = c16558.f53581;
            try {
                if (cls == Integer.TYPE) {
                    long jM33966 = c13945.m33966();
                    String str2 = c13945.f44211;
                    int i8 = c13945.f44210;
                    int i9 = (int) jM33966;
                    if (z2) {
                        field.setInt(objM15696, i9);
                    } else {
                        abstractC23863.mo17349(objM15696, new Integer(i9));
                    }
                    char c4 = c13945.f44209;
                    if (c4 == ',') {
                        int i10 = c13945.f44206 + 1;
                        c13945.f44206 = i10;
                        c13945.f44209 = i10 >= i8 ? (char) 26 : str2.charAt(i10);
                        c13945.f44222 = 16;
                    } else if (c4 == ']') {
                        int i11 = c13945.f44206 + 1;
                        c13945.f44206 = i11;
                        c13945.f44209 = i11 >= i8 ? (char) 26 : str2.charAt(i11);
                        c13945.f44222 = 15;
                    } else {
                        c13945.m33956();
                    }
                } else {
                    if (cls == String.class) {
                        char c5 = c13945.f44209;
                        int i12 = c13945.f44210;
                        String str3 = c13945.f44211;
                        if (c5 == '\"') {
                            strM33970 = c13945.m33970();
                        } else {
                            if (c5 != 'n' || !str3.startsWith("null", c13945.f44206)) {
                                throw new C4251("not match string. feild : " + obj);
                            }
                            int i13 = c13945.f44206 + 4;
                            c13945.f44206 = i13;
                            c13945.f44209 = i13 >= i12 ? (char) 26 : str3.charAt(i13);
                            strM33970 = null;
                        }
                        if (z2) {
                            field.set(objM15696, strM33970);
                        } else {
                            abstractC23863.mo17349(objM15696, strM33970);
                        }
                        char c6 = c13945.f44209;
                        if (c6 == ',') {
                            int i14 = c13945.f44206 + 1;
                            c13945.f44206 = i14;
                            c13945.f44209 = i14 >= i12 ? (char) 26 : str3.charAt(i14);
                            c13945.f44222 = 16;
                        } else if (c6 == ']') {
                            int i15 = c13945.f44206 + 1;
                            c13945.f44206 = i15;
                            c13945.f44209 = i15 >= i12 ? (char) 26 : str3.charAt(i15);
                            c13945.f44222 = 15;
                        } else {
                            c13945.m33956();
                        }
                    } else if (cls == Long.TYPE) {
                        long jM33967 = c13945.m33966();
                        String str4 = c13945.f44211;
                        int i16 = c13945.f44210;
                        if (z2) {
                            field.setLong(objM15696, jM33967);
                        } else {
                            abstractC23863.mo17349(objM15696, new Long(jM33967));
                        }
                        char c7 = c13945.f44209;
                        if (c7 == ',') {
                            int i17 = c13945.f44206 + 1;
                            c13945.f44206 = i17;
                            c13945.f44209 = i17 >= i16 ? (char) 26 : str4.charAt(i17);
                            c13945.f44222 = 16;
                        } else if (c7 == ']') {
                            int i18 = c13945.f44206 + 1;
                            c13945.f44206 = i18;
                            c13945.f44209 = i18 >= i16 ? (char) 26 : str4.charAt(i18);
                            c13945.f44222 = 15;
                        } else {
                            c13945.m33956();
                        }
                    } else if (cls == Boolean.TYPE) {
                        String str5 = c13945.f44211;
                        String str6 = c13945.f44211;
                        int i19 = c13945.f44210;
                        if (str5.startsWith("false", c13945.f44206)) {
                            i4 = 5;
                            z = false;
                        } else if (str5.startsWith("true", c13945.f44206)) {
                            z = true;
                            i4 = 4;
                        } else {
                            char c8 = c13945.f44209;
                            if (c8 == '1') {
                                z = true;
                            } else {
                                if (c8 == '0') {
                                    z = false;
                                } else {
                                    c13945.f44215 = -1;
                                    z = false;
                                }
                                if (z2) {
                                    field.setBoolean(objM15696, z);
                                } else {
                                    abstractC23863.mo17349(objM15696, Boolean.valueOf(z));
                                }
                                c2 = c13945.f44209;
                                if (c2 == ',') {
                                    i6 = c13945.f44206 + 1;
                                    c13945.f44206 = i6;
                                    if (i6 >= i19) {
                                        cCharAt4 = 26;
                                    } else {
                                        cCharAt4 = str6.charAt(i6);
                                    }
                                    c13945.f44209 = cCharAt4;
                                    c13945.f44222 = 16;
                                } else if (c2 == ']') {
                                    i5 = c13945.f44206 + 1;
                                    c13945.f44206 = i5;
                                    if (i5 >= i19) {
                                        cCharAt3 = 26;
                                    } else {
                                        cCharAt3 = str6.charAt(i5);
                                    }
                                    c13945.f44209 = cCharAt3;
                                    c13945.f44222 = 15;
                                } else {
                                    c13945.m33956();
                                }
                            }
                            i4 = 1;
                        }
                        int i20 = c13945.f44206 + i4;
                        c13945.f44206 = i20;
                        c13945.f44209 = c13945.m33939(i20);
                        if (z2) {
                            field.setBoolean(objM15696, z);
                        } else {
                            abstractC23863.mo17349(objM15696, Boolean.valueOf(z));
                        }
                        c2 = c13945.f44209;
                        if (c2 == ',') {
                            i6 = c13945.f44206 + 1;
                            c13945.f44206 = i6;
                            if (i6 >= i19) {
                                cCharAt4 = 26;
                            } else {
                                cCharAt4 = str6.charAt(i6);
                            }
                            c13945.f44209 = cCharAt4;
                            c13945.f44222 = 16;
                        } else if (c2 == ']') {
                            i5 = c13945.f44206 + 1;
                            c13945.f44206 = i5;
                            if (i5 >= i19) {
                                cCharAt3 = 26;
                            } else {
                                cCharAt3 = str6.charAt(i5);
                            }
                            c13945.f44209 = cCharAt3;
                            c13945.f44222 = 15;
                        } else {
                            c13945.m33956();
                        }
                    } else if (cls.isEnum()) {
                        char c9 = c13945.f44209;
                        String str7 = c13945.f44211;
                        int i21 = c13945.f44210;
                        if (c9 == '\"') {
                            String strM33941 = c13945.m33941(c2759.f9125);
                            enumValueOf = strM33941 == null ? null : Enum.valueOf(cls, strM33941);
                        } else {
                            if (c9 < '0' || c9 > '9') {
                                throw new C4251("illegal enum." + c13945.m33977());
                            }
                            int iM33966 = (int) c13945.m33966();
                            C1268 c1268 = (C1268) abstractC23863;
                            C13420 c13420 = c2759.f9130;
                            if (c1268.f4560 == null) {
                                C16558 c16559 = c1268.f77258;
                                c1268.f4560 = c13420.m33060(c16559.f53586, c16559.f53589);
                            }
                            enumValueOf = ((C8725) c1268.f4560).f28402[iM33966];
                        }
                        abstractC23863.mo17349(objM15696, enumValueOf);
                        char c10 = c13945.f44209;
                        if (c10 == ',') {
                            int i22 = c13945.f44206 + 1;
                            c13945.f44206 = i22;
                            c13945.f44209 = i22 >= i21 ? (char) 26 : str7.charAt(i22);
                            c13945.f44222 = 16;
                        } else if (c10 == ']') {
                            int i23 = c13945.f44206 + 1;
                            c13945.f44206 = i23;
                            c13945.f44209 = i23 >= i21 ? (char) 26 : str7.charAt(i23);
                            c13945.f44222 = 15;
                        } else {
                            c13945.m33956();
                        }
                    } else if (cls == Date.class) {
                        char c11 = c13945.f44209;
                        String str8 = c13945.f44211;
                        int i24 = c13945.f44210;
                        if (c11 == '1') {
                            abstractC23863.mo17349(objM15696, new Date(c13945.m33966()));
                            char c12 = c13945.f44209;
                            if (c12 == ',') {
                                int i25 = c13945.f44206 + 1;
                                c13945.f44206 = i25;
                                c13945.f44209 = i25 >= i24 ? (char) 26 : str8.charAt(i25);
                                c13945.f44222 = 16;
                            } else if (c12 == ']') {
                                int i26 = c13945.f44206 + 1;
                                c13945.f44206 = i26;
                                c13945.f44209 = i26 >= i24 ? (char) 26 : str8.charAt(i26);
                                c13945.f44222 = 15;
                            } else {
                                c13945.m33956();
                            }
                        } else {
                            c = c13945.f44209;
                            str = c13945.f44211;
                            i = c13945.f44210;
                            if (c == '[') {
                                i3 = c13945.f44206 + 1;
                                c13945.f44206 = i3;
                                if (i3 >= i) {
                                    cCharAt2 = 26;
                                } else {
                                    cCharAt2 = str.charAt(i3);
                                }
                                c13945.f44209 = cCharAt2;
                                c13945.f44222 = 14;
                            } else if (c == '{') {
                                i2 = c13945.f44206 + 1;
                                c13945.f44206 = i2;
                                if (i2 >= i) {
                                    cCharAt = 26;
                                } else {
                                    cCharAt = str.charAt(i2);
                                }
                                c13945.f44209 = cCharAt;
                                c13945.f44222 = 12;
                            } else {
                                c13945.m33956();
                            }
                            abstractC23863.mo4587(c2759, objM15696, c16558.f53589, null);
                            if (c3 == ']') {
                                if (c13945.f44222 == 15) {
                                    throw new C4251("syntax error");
                                }
                            } else if (c3 == ',' && c13945.f44222 != 16) {
                                throw new C4251("syntax error");
                            }
                        }
                    } else {
                        c = c13945.f44209;
                        str = c13945.f44211;
                        i = c13945.f44210;
                        if (c == '[') {
                            i3 = c13945.f44206 + 1;
                            c13945.f44206 = i3;
                            if (i3 >= i) {
                                cCharAt2 = 26;
                            } else {
                                cCharAt2 = str.charAt(i3);
                            }
                            c13945.f44209 = cCharAt2;
                            c13945.f44222 = 14;
                        } else if (c == '{') {
                            i2 = c13945.f44206 + 1;
                            c13945.f44206 = i2;
                            if (i2 >= i) {
                                cCharAt = 26;
                            } else {
                                cCharAt = str.charAt(i2);
                            }
                            c13945.f44209 = cCharAt;
                            c13945.f44222 = 12;
                        } else {
                            c13945.m33956();
                        }
                        abstractC23863.mo4587(c2759, objM15696, c16558.f53589, null);
                        if (c3 == ']') {
                            if (c13945.f44222 == 15) {
                                throw new C4251("syntax error");
                            }
                        } else {
                            if (c3 == ',') {
                                throw new C4251("syntax error");
                            }
                            continue;
                        }
                    }
                    i7++;
                }
                i7++;
            } catch (IllegalAccessException e) {
                throw new C4251(C8947.m23910(new StringBuilder("set "), c16558.f53585, d.O), (Throwable) e);
            }
        }
        if (c13945.f44209 != ',') {
            c13945.m33956();
            return objM15696;
        }
        int i27 = c13945.f44206 + 1;
        c13945.f44206 = i27;
        c13945.f44209 = i27 >= c13945.f44210 ? (char) 26 : c13945.f44211.charAt(i27);
        c13945.f44222 = 16;
        return objM15696;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 21791. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private java.lang.Object m15693(l.C2759 r48, java.lang.reflect.Type r49, java.lang.Object r50) {
        /*
            Method dump skipped, instruction units count: 2179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C5217.m15693(l.ۖܶܺ, java.lang.reflect.Type, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC23863 m15697(String str) {
        if (str == null) {
            return null;
        }
        boolean z = this.f18407.f72427;
        int i = 0;
        AbstractC23863[] abstractC23863Arr = this.f18402;
        if (z) {
            while (i < abstractC23863Arr.length) {
                AbstractC23863 abstractC23863 = abstractC23863Arr[i];
                if (abstractC23863.f77258.f53585.equalsIgnoreCase(str)) {
                    return abstractC23863;
                }
                i++;
            }
            return null;
        }
        int length = abstractC23863Arr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int iCompareTo = abstractC23863Arr[i3].f77258.f53585.compareTo(str);
            if (iCompareTo < 0) {
                i2 = i3 + 1;
            } else {
                if (iCompareTo <= 0) {
                    return abstractC23863Arr[i3];
                }
                length = i3 - 1;
            }
        }
        HashMap map = this.f18401;
        if (map != null) {
            return (AbstractC23863) map.get(str);
        }
        if (this.f18405 == null) {
            long[] jArr = new long[abstractC23863Arr.length];
            for (int i4 = 0; i4 < abstractC23863Arr.length; i4++) {
                jArr[i4] = C3134.m10237(abstractC23863Arr[i4].f77258.f53585);
            }
            Arrays.sort(jArr);
            this.f18405 = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.f18405, C3134.m10237(str));
        if (iBinarySearch >= 0) {
            if (this.f18404 == null) {
                int[] iArr = new int[this.f18405.length];
                Arrays.fill(iArr, -1);
                while (i < abstractC23863Arr.length) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f18405, C3134.m10237(abstractC23863Arr[i].f77258.f53585));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i;
                    }
                    i++;
                }
                this.f18404 = iArr;
            }
            int i5 = this.f18404[iBinarySearch];
            if (i5 != -1) {
                return abstractC23863Arr[i5];
            }
        }
        return m15694(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m15691(C2759 c2759, String str, Object obj, Type type, HashMap map) {
        Type typeM38962;
        C13945 c13945 = c2759.f9128;
        AbstractC23863 abstractC23863M15697 = m15697(str);
        if (abstractC23863M15697 == null) {
            abstractC23863M15697 = m15694(str);
        }
        int i = EnumC7234.SupportNonPublicField.f23858;
        Class cls = this.f18403;
        if (abstractC23863M15697 == null && ((c13945.f44213 & i) != 0 || (i & this.f18407.f72424) != 0)) {
            if (this.f18408 == null) {
                ConcurrentMapC17249 concurrentMapC17249 = new ConcurrentMapC17249(1, 0.75f, 1);
                for (Class superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        String name = field.getName();
                        if (m15697(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentMapC17249.put(name, field);
                            }
                        }
                    }
                }
                this.f18408 = concurrentMapC17249;
            }
            Object obj2 = this.f18408.get(str);
            if (obj2 != null) {
                if (obj2 instanceof AbstractC23863) {
                    abstractC23863M15697 = (AbstractC23863) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    abstractC23863M15697 = new C1268(cls, new C16558(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.f18408.put(str, abstractC23863M15697);
                }
            }
        }
        if (abstractC23863M15697 != null) {
            c13945.m33980();
            abstractC23863M15697.mo4587(c2759, obj, type, map);
            return true;
        }
        if ((c13945.f44213 & EnumC7234.IgnoreNotMatch.f23858) == 0) {
            throw new C4251("setter not found, class " + cls.getName() + ", property " + str);
        }
        c13945.m33980();
        ArrayList arrayList = c2759.f9123;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            typeM38962 = null;
            while (it.hasNext()) {
                typeM38962 = ((InterfaceC16403) it.next()).m38962();
            }
        } else {
            typeM38962 = null;
        }
        if (typeM38962 != null) {
            c2759.m9107((String) null, typeM38962);
        } else {
            c2759.m9106((Object) null);
        }
        if (obj instanceof InterfaceC17149) {
            ((InterfaceC17149) obj).m40292();
            return false;
        }
        ArrayList arrayList2 = c2759.f9129;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((InterfaceC17895) it2.next()).m41744();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC23863 m15694(String str) {
        boolean zStartsWith;
        long jM10237 = C3134.m10237(str);
        long[] jArr = this.f18405;
        AbstractC23863[] abstractC23863Arr = this.f18402;
        if (jArr == null) {
            long[] jArr2 = new long[abstractC23863Arr.length];
            for (int i = 0; i < abstractC23863Arr.length; i++) {
                jArr2[i] = C3134.m10237(abstractC23863Arr[i].f77258.f53585);
            }
            Arrays.sort(jArr2);
            this.f18405 = jArr2;
        }
        int iBinarySearch = Arrays.binarySearch(this.f18405, jM10237);
        if (iBinarySearch < 0) {
            zStartsWith = str.startsWith(am.ae);
            if (zStartsWith) {
                iBinarySearch = Arrays.binarySearch(this.f18405, C3134.m10237(str.substring(2)));
            }
        } else {
            zStartsWith = false;
        }
        if (iBinarySearch >= 0) {
            if (this.f18404 == null) {
                int[] iArr = new int[this.f18405.length];
                Arrays.fill(iArr, -1);
                for (int i2 = 0; i2 < abstractC23863Arr.length; i2++) {
                    int iBinarySearch2 = Arrays.binarySearch(this.f18405, C3134.m10237(abstractC23863Arr[i2].f77258.f53585));
                    if (iBinarySearch2 >= 0) {
                        iArr[iBinarySearch2] = i2;
                    }
                }
                this.f18404 = iArr;
            }
            int i3 = this.f18404[iBinarySearch];
            if (i3 != -1) {
                AbstractC23863 abstractC23863 = abstractC23863Arr[i3];
                Class cls = abstractC23863.f77258.f53586;
                if (!zStartsWith || cls == Boolean.TYPE || cls == Boolean.class) {
                    return abstractC23863;
                }
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:147:0x025c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0260  */
    /* JADX WARN: Code duplicated, block: B:156:0x0276  */
    /* JADX WARN: Code duplicated, block: B:158:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0281  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m15695(Map map, C13420 c13420) throws IllegalAccessException, InvocationTargetException {
        double d;
        double d2;
        double d3;
        float f;
        float f2;
        float f3;
        String str;
        Object objM10217;
        C22371 c22371 = this.f18407;
        Constructor constructor = c22371.f72423;
        Constructor constructor2 = c22371.f72423;
        boolean z = false;
        if (constructor == null) {
            Object objM15696 = m15696((C2759) null, this.f18403);
            for (Map.Entry entry : map.entrySet()) {
                AbstractC23863 abstractC23863M15697 = m15697((String) entry.getKey());
                if (abstractC23863M15697 != null) {
                    C16558 c16558 = abstractC23863M15697.f77258;
                    Object value = entry.getValue();
                    Class cls = Boolean.TYPE;
                    Class cls2 = Double.TYPE;
                    Class cls3 = Float.TYPE;
                    Class cls4 = Long.TYPE;
                    Class cls5 = Integer.TYPE;
                    if (value == null) {
                        Class cls6 = c16558.f53586;
                        if (cls6 == cls5) {
                            value = Integer.valueOf(z ? 1 : 0);
                        } else if (cls6 == cls4) {
                            value = 0L;
                        } else if (cls6 == Short.TYPE) {
                            value = Short.valueOf(z ? (short) 1 : (short) 0);
                        } else if (cls6 == Byte.TYPE) {
                            value = Byte.valueOf(z ? (byte) 1 : (byte) 0);
                        } else if (cls6 == cls3) {
                            value = Float.valueOf(0.0f);
                        } else if (cls6 == cls2) {
                            value = Double.valueOf(0.0d);
                        } else if (cls6 == Character.TYPE) {
                            value = '0';
                        } else if (cls6 == cls) {
                            value = Boolean.FALSE;
                        }
                    }
                    Method method = c16558.f53587;
                    if (method != null) {
                        Object[] objArr = new Object[1];
                        objArr[z ? 1 : 0] = C3134.m10217(value, method.getGenericParameterTypes()[z ? 1 : 0], c13420);
                        method.invoke(objM15696, objArr);
                    } else {
                        Field field = c16558.f53592;
                        Type type = c16558.f53589;
                        if (type == cls) {
                            if (value == Boolean.FALSE) {
                                field.setBoolean(objM15696, z);
                            } else if (value == Boolean.TRUE) {
                                field.setBoolean(objM15696, true);
                            } else {
                                str = c16558.f53582;
                                if (str == null && type == Date.class && (value instanceof String)) {
                                    try {
                                        objM10217 = new SimpleDateFormat(str).parse((String) value);
                                    } catch (ParseException unused) {
                                        objM10217 = null;
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM10217 = C3134.m10216(value, (ParameterizedType) type, c13420);
                                } else {
                                    objM10217 = C3134.m10217(value, type, c13420);
                                }
                                field.set(objM15696, objM10217);
                            }
                        } else if (type == cls5) {
                            if (value instanceof Number) {
                                field.setInt(objM15696, ((Number) value).intValue());
                            } else {
                                str = c16558.f53582;
                                if (str == null) {
                                    if (type instanceof ParameterizedType) {
                                        objM10217 = C3134.m10216(value, (ParameterizedType) type, c13420);
                                    } else {
                                        objM10217 = C3134.m10217(value, type, c13420);
                                    }
                                } else if (type instanceof ParameterizedType) {
                                    objM10217 = C3134.m10216(value, (ParameterizedType) type, c13420);
                                } else {
                                    objM10217 = C3134.m10217(value, type, c13420);
                                }
                                field.set(objM15696, objM10217);
                            }
                        } else {
                            if (type != cls4) {
                                char c = '.';
                                char c2 = '-';
                                if (type == cls3) {
                                    if (value instanceof Number) {
                                        field.setFloat(objM15696, ((Number) value).floatValue());
                                    } else if (value instanceof String) {
                                        String str2 = (String) value;
                                        if (str2.length() <= 10) {
                                            int i = C3134.f10148;
                                            int length = str2.length();
                                            if (length < 10) {
                                                int i2 = 0;
                                                boolean z2 = false;
                                                long j = 0;
                                                char c3 = '9';
                                                int i3 = 0;
                                                while (true) {
                                                    if (i2 < length) {
                                                        char cCharAt = str2.charAt(i2);
                                                        if (cCharAt == '-' && i2 == 0) {
                                                            z2 = true;
                                                        } else if (cCharAt == c) {
                                                            if (i3 != 0) {
                                                                f = Float.parseFloat(str2);
                                                            } else {
                                                                i3 = (length - i2) - 1;
                                                            }
                                                        } else if (cCharAt < '0' || cCharAt > c3) {
                                                            f = Float.parseFloat(str2);
                                                        } else {
                                                            j = (j * 10) + ((long) (cCharAt - '0'));
                                                        }
                                                        i2++;
                                                        c3 = '9';
                                                        c = '.';
                                                    } else {
                                                        if (z2) {
                                                            j = -j;
                                                        }
                                                        switch (i3) {
                                                            case 0:
                                                                f = j;
                                                                break;
                                                            case 1:
                                                                f2 = j;
                                                                f3 = 10.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 2:
                                                                f2 = j;
                                                                f3 = 100.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 3:
                                                                f2 = j;
                                                                f3 = 1000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 4:
                                                                f2 = j;
                                                                f3 = 10000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 5:
                                                                f2 = j;
                                                                f3 = 100000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 6:
                                                                f2 = j;
                                                                f3 = 1000000.0f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 7:
                                                                f2 = j;
                                                                f3 = 1.0E7f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 8:
                                                                f2 = j;
                                                                f3 = 1.0E8f;
                                                                f = f2 / f3;
                                                                break;
                                                            case 9:
                                                                f2 = j;
                                                                f3 = 1.0E9f;
                                                                f = f2 / f3;
                                                                break;
                                                            default:
                                                                f = Float.parseFloat(str2);
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                f = Float.parseFloat(str2);
                                            }
                                        } else {
                                            f = Float.parseFloat(str2);
                                        }
                                        field.setFloat(objM15696, f);
                                    }
                                } else if (type == cls2) {
                                    if (value instanceof Number) {
                                        field.setDouble(objM15696, ((Number) value).doubleValue());
                                    } else if (value instanceof String) {
                                        String str3 = (String) value;
                                        if (str3.length() <= 10) {
                                            int i4 = C3134.f10148;
                                            int length2 = str3.length();
                                            if (length2 <= 10) {
                                                int i5 = 0;
                                                boolean z3 = false;
                                                long j2 = 0;
                                                char c4 = '.';
                                                int i6 = 0;
                                                while (true) {
                                                    if (i5 < length2) {
                                                        char cCharAt2 = str3.charAt(i5);
                                                        if (cCharAt2 == c2 && i5 == 0) {
                                                            z3 = true;
                                                        } else if (cCharAt2 == c4) {
                                                            if (i6 != 0) {
                                                                d = Double.parseDouble(str3);
                                                            } else {
                                                                i6 = (length2 - i5) - 1;
                                                            }
                                                        } else if (cCharAt2 < '0' || cCharAt2 > '9') {
                                                            d = Double.parseDouble(str3);
                                                        } else {
                                                            j2 = (j2 * 10) + ((long) (cCharAt2 - '0'));
                                                            i5++;
                                                            c2 = '-';
                                                            c4 = '.';
                                                        }
                                                        i5++;
                                                        c2 = '-';
                                                        c4 = '.';
                                                    } else {
                                                        if (z3) {
                                                            j2 = -j2;
                                                        }
                                                        switch (i6) {
                                                            case 0:
                                                                d = j2;
                                                                break;
                                                            case 1:
                                                                d2 = j2;
                                                                d3 = 10.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 2:
                                                                d2 = j2;
                                                                d3 = 100.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 3:
                                                                d2 = j2;
                                                                d3 = 1000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 4:
                                                                d2 = j2;
                                                                d3 = 10000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 5:
                                                                d2 = j2;
                                                                d3 = 100000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 6:
                                                                d2 = j2;
                                                                d3 = 1000000.0d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 7:
                                                                d2 = j2;
                                                                d3 = 1.0E7d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 8:
                                                                d2 = j2;
                                                                d3 = 1.0E8d;
                                                                d = d2 / d3;
                                                                break;
                                                            case 9:
                                                                d2 = j2;
                                                                d3 = 1.0E9d;
                                                                d = d2 / d3;
                                                                break;
                                                            default:
                                                                d = Double.parseDouble(str3);
                                                                break;
                                                        }
                                                    }
                                                }
                                            } else {
                                                d = Double.parseDouble(str3);
                                            }
                                        } else {
                                            d = Double.parseDouble(str3);
                                        }
                                        field.setDouble(objM15696, d);
                                    }
                                } else if (value != null && type == value.getClass()) {
                                    field.set(objM15696, value);
                                }
                            } else if (value instanceof Number) {
                                field.setLong(objM15696, ((Number) value).longValue());
                            }
                            str = c16558.f53582;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    objM10217 = C3134.m10216(value, (ParameterizedType) type, c13420);
                                } else {
                                    objM10217 = C3134.m10217(value, type, c13420);
                                }
                            } else if (type instanceof ParameterizedType) {
                                objM10217 = C3134.m10216(value, (ParameterizedType) type, c13420);
                            } else {
                                objM10217 = C3134.m10217(value, type, c13420);
                            }
                            field.set(objM15696, objM10217);
                        }
                    }
                    z = false;
                }
            }
            return objM15696;
        }
        C16558[] c16558Arr = c22371.f72428;
        int length3 = c16558Arr.length;
        Object[] objArr2 = new Object[length3];
        for (int i7 = 0; i7 < length3; i7++) {
            C16558 c16559 = c16558Arr[i7];
            Object objM10214 = map.get(c16559.f53585);
            if (objM10214 == null) {
                objM10214 = C3134.m10214(c16559.f53586);
            }
            objArr2[i7] = objM10214;
        }
        if (constructor2 == null) {
            return null;
        }
        try {
            return constructor2.newInstance(objArr2);
        } catch (Exception e) {
            throw new C4251("create instance error, " + constructor2.toGenericString(), (Throwable) e);
        }
    }
}
