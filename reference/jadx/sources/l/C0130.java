package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: renamed from: l.֡ۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: W8AM */
/* JADX INFO: loaded from: classes2.dex */
public final class C0130 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f1118;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f1119;

    public C0130() {
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this.f1118 = map;
        this.f1119 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m1196(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0112  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:73:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013e  */
    /* JADX WARN: Code duplicated, block: B:79:0x0146  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC3740 m1197(C11730 c11730, boolean z) {
        InterfaceC3740 c2544;
        InterfaceC3740 c23648;
        String strM39798;
        Type typeM29317 = c11730.m29317();
        Class clsM29316 = c11730.m29316();
        Map map = Collections.EMPTY_MAP;
        InterfaceC10984 interfaceC10984 = (InterfaceC10984) map.get(typeM29317);
        if (interfaceC10984 != null) {
            return new C9372(interfaceC10984, typeM29317);
        }
        InterfaceC10984 interfaceC10985 = (InterfaceC10984) map.get(clsM29316);
        if (interfaceC10985 != null) {
            return new C9058(interfaceC10985, typeM29317);
        }
        InterfaceC3740 c0242 = null;
        if (EnumSet.class.isAssignableFrom(clsM29316)) {
            c2544 = new C14415(typeM29317);
        } else {
            c2544 = clsM29316 == EnumMap.class ? new C2544(typeM29317) : null;
        }
        if (c2544 != null) {
            return c2544;
        }
        List list = Collections.EMPTY_LIST;
        EnumC6480 enumC6480M47919 = C21380.m47919(clsM29316);
        if (Modifier.isAbstract(clsM29316.getModifiers())) {
            c23648 = null;
        } else {
            try {
                Constructor declaredConstructor = clsM29316.getDeclaredConstructor(null);
                EnumC6480 enumC6480 = EnumC6480.ALLOW;
                if (enumC6480M47919 == enumC6480 || (AbstractC15031.f49007.mo17803(null, declaredConstructor) && (enumC6480M47919 != EnumC6480.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c23648 = (enumC6480M47919 != enumC6480 || (strM39798 = C17023.m39798(declaredConstructor)) == null) ? new C23648(8, declaredConstructor) : new C15952(strM39798);
                } else {
                    c23648 = new C0297(C16236.m38347(clsM29316, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
                c23648 = null;
            }
        }
        if (c23648 != null) {
            return c23648;
        }
        if (Collection.class.isAssignableFrom(clsM29316)) {
            if (clsM29316.isAssignableFrom(ArrayList.class)) {
                c0242 = new C9576();
            } else if (clsM29316.isAssignableFrom(LinkedHashSet.class)) {
                c0242 = new C17745(10);
            } else if (clsM29316.isAssignableFrom(TreeSet.class)) {
                c0242 = new C0589();
            } else if (clsM29316.isAssignableFrom(ArrayDeque.class)) {
                c0242 = new C23821();
            }
        } else if (Map.class.isAssignableFrom(clsM29316)) {
            if (clsM29316.isAssignableFrom(C0918.class)) {
                if (typeM29317 instanceof ParameterizedType) {
                    Type[] actualTypeArguments = ((ParameterizedType) typeM29317).getActualTypeArguments();
                    if (actualTypeArguments.length == 0 || C23415.m51555(actualTypeArguments[0]) != String.class) {
                        if (clsM29316.isAssignableFrom(LinkedHashMap.class)) {
                            c0242 = new C20630();
                        } else if (clsM29316.isAssignableFrom(TreeMap.class)) {
                            c0242 = new C8015(7);
                        } else if (clsM29316.isAssignableFrom(ConcurrentMapC13783.class)) {
                            c0242 = new C5038(7);
                        } else if (clsM29316.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            c0242 = new C0242(9);
                        }
                    }
                }
                c0242 = new C3184();
            } else if (clsM29316.isAssignableFrom(LinkedHashMap.class)) {
                c0242 = new C20630();
            } else if (clsM29316.isAssignableFrom(TreeMap.class)) {
                c0242 = new C8015(7);
            } else if (clsM29316.isAssignableFrom(ConcurrentMapC13783.class)) {
                c0242 = new C5038(7);
            } else if (clsM29316.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c0242 = new C0242(9);
            }
        }
        if (c0242 != null) {
            return c0242;
        }
        String strM1196 = m1196(clsM29316);
        if (strM1196 != null) {
            return new C6156(4, strM1196);
        }
        if (z) {
            return enumC6480M47919 != EnumC6480.ALLOW ? new C23527(3, C16236.m38347(clsM29316, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : new C1438(clsM29316);
        }
        return new C5672(4, C16236.m38347(clsM29316, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."));
    }

    public final String toString() {
        return this.f1118.toString();
    }
}
