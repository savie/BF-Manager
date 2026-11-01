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

/* JADX INFO: renamed from: l.ۡ᩹᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: H88J */
/* JADX INFO: loaded from: classes3.dex */
public final class C9179 implements InterfaceC20592 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final InterfaceC20861 f31239;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final List f31240;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C0130 f31241;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C9387 f31242;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C12126 f31243;

    public C9179(C0130 c0130, InterfaceC20861 interfaceC20861, C12126 c12126, C9387 c9387) {
        List list = Collections.EMPTY_LIST;
        this.f31241 = c0130;
        this.f31239 = interfaceC20861;
        this.f31243 = c12126;
        this.f31242 = c9387;
        this.f31240 = list;
    }

    @Override // l.InterfaceC20592
    /* JADX INFO: renamed from: ۙ */
    public final AbstractC7186 mo5183(C6044 c6044, C11730 c11730) {
        Class clsM29316 = c11730.m29316();
        if (!Object.class.isAssignableFrom(clsM29316)) {
            return null;
        }
        int i = C17023.f54385;
        if (!Modifier.isStatic(clsM29316.getModifiers()) && (clsM29316.isAnonymousClass() || clsM29316.isLocalClass())) {
            return new C23290();
        }
        List list = Collections.EMPTY_LIST;
        EnumC6480 enumC6480M47919 = C21380.m47919(clsM29316);
        if (enumC6480M47919 == EnumC6480.BLOCK_ALL) {
            throw new C9573(C16236.m38347(clsM29316, "ReflectionAccessFilter does not permit using reflection for ", ". Register a TypeAdapter for this type or adjust the access filter."));
        }
        boolean z = enumC6480M47919 == EnumC6480.BLOCK_INACCESSIBLE;
        return C17023.m39797(clsM29316) ? new C19762(clsM29316, m23612(c6044, c11730, clsM29316, z, true), z) : new C19056(this.f31241.m1197(c11730, true), m23612(c6044, c11730, clsM29316, z, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23614(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!C21380.m47920(obj, accessibleObject)) {
            throw new C9573(C15489.m37076(C17023.m39790(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23613(Class cls, String str, Field field, Field field2) {
        throw new IllegalArgumentException("Class " + cls.getName() + " declares multiple JSON fields named '" + str + "'; conflict is caused by fields " + C17023.m39792(field) + " and " + C17023.m39792(field2) + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("duplicate-fields"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private C8473 m23612(C6044 c6044, C11730 c11730, Class cls, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Method method;
        String strValue;
        List listAsList;
        List<String> listSingletonList;
        C11730 c11731;
        AbstractC7186 abstractC7186M16440;
        int i;
        AbstractC18350 abstractC18350;
        if (cls.isInterface()) {
            return C8473.f29379;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C11730 c11730M29314 = c11730;
        boolean z5 = z;
        Class clsM29316 = cls;
        while (clsM29316 != Object.class) {
            Field[] declaredFields = clsM29316.getDeclaredFields();
            boolean z6 = true;
            boolean z7 = false;
            if (clsM29316 == cls || declaredFields.length <= 0) {
                z3 = z5;
            } else {
                List list = Collections.EMPTY_LIST;
                EnumC6480 enumC6480M47919 = C21380.m47919(clsM29316);
                if (enumC6480M47919 == EnumC6480.BLOCK_ALL) {
                    throw new C9573("ReflectionAccessFilter does not permit using reflection for " + clsM29316 + " (supertype of " + cls + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
                z3 = enumC6480M47919 == EnumC6480.BLOCK_INACCESSIBLE;
            }
            int length = declaredFields.length;
            int i2 = 0;
            while (i2 < length) {
                Field field = declaredFields[i2];
                C12126 c12126 = this.f31243;
                boolean zM30185 = c12126.m30185(field, z6);
                boolean zM30186 = c12126.m30185(field, z7);
                boolean z8 = !zM30186;
                if (zM30185 && zM30186) {
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
                        Method methodM39794 = C17023.m39794(clsM29316, field);
                        if (!z3) {
                            C17023.m39795(methodM39794);
                        }
                        if (methodM39794.getAnnotation(InterfaceC19887.class) != null && field.getAnnotation(InterfaceC19887.class) == null) {
                            throw new C9573(C16523.m38890("@SerializedName on ", C17023.m39790(methodM39794, z7), " is not supported"));
                        }
                        z4 = z8;
                        method = methodM39794;
                    }
                    if (!z3 && method == null) {
                        C17023.m39795((AccessibleObject) field);
                    }
                    Type typeM51550 = C23415.m51550(clsM29316, c11730M29314.m29317(), field.getGenericType());
                    InterfaceC19887 interfaceC19887 = (InterfaceC19887) field.getAnnotation(InterfaceC19887.class);
                    if (interfaceC19887 == null) {
                        InterfaceC20861 interfaceC20861 = this.f31239;
                        strValue = interfaceC20861.mo19941(field);
                        listAsList = interfaceC20861.mo19940(field);
                    } else {
                        strValue = interfaceC19887.value();
                        listAsList = Arrays.asList(interfaceC19887.alternate());
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
                    C11730 c11730M29315 = C11730.m29314(typeM51550);
                    Class clsM29317 = c11730M29315.m29316();
                    boolean z9 = clsM29317 != null && clsM29317.isPrimitive();
                    int modifiers = field.getModifiers();
                    boolean z10 = Modifier.isStatic(modifiers) && Modifier.isFinal(modifiers);
                    InterfaceC15654 interfaceC15654 = (InterfaceC15654) field.getAnnotation(InterfaceC15654.class);
                    if (interfaceC15654 != null) {
                        c11731 = c11730M29315;
                        abstractC7186M16440 = this.f31242.m24080(this.f31241, c6044, c11730M29315, interfaceC15654, false);
                    } else {
                        c11731 = c11730M29315;
                        abstractC7186M16440 = null;
                    }
                    boolean z11 = abstractC7186M16440 != null;
                    C11730 c11732 = c11731;
                    if (abstractC7186M16440 == null) {
                        abstractC7186M16440 = c6044.m16440(c11732);
                    }
                    AbstractC7186 c16234 = zM30185 ? abstractC7186M16440 : z11 ? abstractC7186M16440 : new C16234(c6044, abstractC7186M16440, c11732.m29317());
                    i = length;
                    C15529 c15529 = new C15529(str, field, z3, method, c16234, abstractC7186M16440, z9, z10);
                    if (z4) {
                        for (String str2 : listSingletonList) {
                            AbstractC18350 abstractC18351 = (AbstractC18350) linkedHashMap.put(str2, c15529);
                            if (abstractC18351 != null) {
                                m23613(cls, str2, abstractC18351.f58534, field);
                                throw null;
                            }
                        }
                    }
                    if (!zM30185 && (abstractC18350 = (AbstractC18350) linkedHashMap2.put(str, c15529)) != null) {
                        m23613(cls, str, abstractC18350.f58534, field);
                        throw null;
                    }
                }
                i2++;
                z6 = true;
                length = i;
                z7 = false;
            }
            c11730M29314 = C11730.m29314(C23415.m51550(clsM29316, c11730M29314.m29317(), clsM29316.getGenericSuperclass()));
            clsM29316 = c11730M29314.m29316();
            z5 = z3;
        }
        return new C8473(new ArrayList(linkedHashMap2.values()), linkedHashMap);
    }
}
