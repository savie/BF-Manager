package l;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: l.֨᩺ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes3.dex */
public final class C1511 implements InterfaceC16075 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C2257 f5251;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final List f5252;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C24281 f5253;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20792 f5254;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C14583 f5255;

    public C1511(C24281 c24281, InterfaceC20792 interfaceC20792, C14583 c14583, C2257 c2257, List list) {
        this.f5253 = c24281;
        this.f5254 = interfaceC20792;
        this.f5255 = c14583;
        this.f5251 = c2257;
        this.f5252 = list;
    }

    @Override // l.InterfaceC16075
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC17567 mo1459(C24522 c24522, C6446 c6446) {
        Class clsM18232 = c6446.m18232();
        if (!Object.class.isAssignableFrom(clsM18232)) {
            return null;
        }
        int i = C1971.f6612;
        if (!Modifier.isStatic(clsM18232.getModifiers()) && (clsM18232.isAnonymousClass() || clsM18232.isLocalClass())) {
            return new C14934();
        }
        EnumC10854 enumC10854M16293 = C5461.m16293(clsM18232, this.f5252);
        if (enumC10854M16293 == EnumC10854.BLOCK_ALL) {
            throw new C8113(C20551.m47117(clsM18232, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = enumC10854M16293 == EnumC10854.BLOCK_INACCESSIBLE;
        return C1971.m6788(clsM18232) ? new C10459(clsM18232, m5364(c24522, c6446, clsM18232, z, true), z) : new C8223(this.f5253.m54297(c6446, true), m5364(c24522, c6446, clsM18232, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5366(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C5461.m16294(obj, accessibleObject)) {
            throw new C8113(C14483.m34972(C1971.m6781(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5365(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C1971.m6783(field) + " and " + C1971.m6783(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C19410 m5364(C24522 c24522, C6446 c6446, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        String strValue;
        List listAsList;
        List<String> listSingletonList;
        C6446 c6447;
        AbstractC17567 abstractC17567M54785;
        int i;
        AbstractC0765 abstractC0765;
        if (cls.isInterface()) {
            return C19410.f62740;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C6446 c6446M18230 = c6446;
        boolean z5 = z;
        Class clsM18232 = cls;
        while (clsM18232 != Object.class) {
            Field[] declaredFields = clsM18232.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (clsM18232 == cls || declaredFields.length <= 0) {
                z3 = z5;
            } else {
                EnumC10854 enumC10854M16293 = C5461.m16293(clsM18232, this.f5252);
                if (enumC10854M16293 == EnumC10854.BLOCK_ALL) {
                    throw new C8113("ReflectionAccessFilter does not permit using reflection for " + clsM18232 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = enumC10854M16293 == EnumC10854.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                C14583 c14583 = this.f5255;
                boolean zM35184 = c14583.m35184(field, z6);
                boolean zM35185 = c14583.m35184(field, z7);
                boolean z8 = !zM35185;
                if (zM35184 && zM35185) {
                    i2 = i2;
                    i = length;
                } else {
                    if (!z2) {
                        z4 = z8;
                        method = null;
                    } else if (Modifier.isStatic(field.getModifiers())) {
                        method = null;
                        z4 = false;
                    } else {
                        Method methodM6785 = C1971.m6785(clsM18232, field);
                        if (!z3) {
                            C1971.m6786(methodM6785);
                        }
                        if (methodM6785.getAnnotation(InterfaceC3397.class) != null && field.getAnnotation(InterfaceC3397.class) == null) {
                            throw new C8113(C14442.m34865("@SerializedName on ", C1971.m6781(methodM6785, z7), " is not supported"));
                        }
                        z4 = z8;
                        method = methodM6785;
                    }
                    if (!z3 && method == null) {
                        C1971.m6786((AccessibleObject) field);
                    }
                    Type typeM21403 = C7872.m21403(clsM18232, c6446M18230.m18233(), field.getGenericType());
                    InterfaceC3397 interfaceC3397 = (InterfaceC3397) field.getAnnotation(InterfaceC3397.class);
                    if (interfaceC3397 == null) {
                        InterfaceC20792 interfaceC20792 = this.f5254;
                        strValue = interfaceC20792.mo7412(field);
                        listAsList = interfaceC20792.mo7411(field);
                    } else {
                        strValue = interfaceC3397.value();
                        listAsList = Arrays.asList(interfaceC3397.alternate());
                    }
                    if (listAsList.isEmpty()) {
                        listSingletonList = Collections.singletonList(strValue);
                    } else {
                        ArrayList arrayList = new ArrayList(listAsList.size() + 1);
                        arrayList.add(strValue);
                        arrayList.addAll(listAsList);
                        listSingletonList = arrayList;
                    }
                    String str = (String) listSingletonList.get(0);
                    C6446 c6446M18231 = C6446.m18230(typeM21403);
                    Class clsM18233 = c6446M18231.m18232();
                    boolean z9 = clsM18233 != null && clsM18233.isPrimitive();
                    int modifiers = field.getModifiers();
                    boolean z10 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                    InterfaceC23535 interfaceC23535 = (InterfaceC23535) field.getAnnotation(InterfaceC23535.class);
                    if (interfaceC23535 != null) {
                        c6447 = c6446M18231;
                        abstractC17567M54785 = this.f5251.m7685(this.f5253, c24522, c6446M18231, interfaceC23535, false);
                    } else {
                        c6447 = c6446M18231;
                        abstractC17567M54785 = null;
                    }
                    boolean z11 = abstractC17567M54785 != null;
                    C6446 c6448 = c6447;
                    if (abstractC17567M54785 == null) {
                        abstractC17567M54785 = c24522.m54785(c6448);
                    }
                    AbstractC17567 c7477 = zM35184 ? abstractC17567M54785 : z11 ? abstractC17567M54785 : new C7477(c24522, abstractC17567M54785, c6448.m18233());
                    i = length;
                    C21648 c21648 = new C21648(str, field, z3, method, c7477, abstractC17567M54785, z9, z10);
                    if (z4) {
                        for (String str2 : listSingletonList) {
                            AbstractC0765 abstractC0766 = (AbstractC0765) linkedHashMap.put(str2, c21648);
                            if (abstractC0766 != null) {
                                m5365(cls, str2, abstractC0766.f2771, field);
                                throw null;
                            }
                        }
                    }
                    if (!zM35184 && (abstractC0765 = (AbstractC0765) linkedHashMap2.put(str, c21648)) != null) {
                        m5365(cls, str, abstractC0765.f2771, field);
                        throw null;
                    }
                }
                i2++;
                z6 = true;
                length = i;
                z7 = false;
            }
            c6446M18230 = C6446.m18230(C7872.m21403(clsM18232, c6446M18230.m18233(), clsM18232.getGenericSuperclass()));
            clsM18232 = c6446M18230.m18232();
            z5 = z3;
        }
        return new C19410(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }
}
