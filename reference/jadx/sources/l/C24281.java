package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import org.bouncycastle.asn1.ASN1BMPString$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩺ۨܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8AM */
/* JADX INFO: loaded from: classes.dex */
public final class C24281 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f78594;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f78595;

    public C24281(List list, Map map) {
        this.f78594 = map;
        this.f78595 = list;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m54296(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22615 m54297(C6446 c6446, boolean z) {
        InterfaceC22615 c18136;
        InterfaceC22615 c6599;
        String strM6789;
        Type typeM18233 = c6446.m18233();
        Class clsM18232 = c6446.m18232();
        Map map = this.f78594;
        InterfaceC14824 interfaceC14824 = (InterfaceC14824) map.get(typeM18233);
        if (interfaceC14824 != null) {
            return new C12346(interfaceC14824, typeM18233);
        }
        InterfaceC14824 interfaceC14825 = (InterfaceC14824) map.get(clsM18232);
        if (interfaceC14825 != null) {
            return new C12346(interfaceC14825, typeM18233);
        }
        InterfaceC22615 c20551 = null;
        if (EnumSet.class.isAssignableFrom(clsM18232)) {
            c18136 = new C5256(4, typeM18233);
        } else {
            c18136 = clsM18232 == EnumMap.class ? new C18136(typeM18233) : null;
        }
        if (c18136 != null) {
            return c18136;
        }
        EnumC10854 enumC10854M16293 = C5461.m16293(clsM18232, this.f78595);
        if (Modifier.isAbstract(clsM18232.getModifiers())) {
            c6599 = null;
        } else {
            try {
                Constructor declaredConstructor = clsM18232.getDeclaredConstructor(null);
                EnumC10854 enumC10854 = EnumC10854.ALLOW;
                if (enumC10854M16293 == enumC10854 || (AbstractC12918.f41302.mo31992(null, declaredConstructor) && (enumC10854M16293 != EnumC10854.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                    c6599 = (enumC10854M16293 != enumC10854 || (strM6789 = C1971.m6789(declaredConstructor)) == null) ? new C6599(5, declaredConstructor) : new C6381(strM6789);
                } else {
                    c6599 = new C6381(C20551.m47117(clsM18232, "Unable to invoke no-args constructor of ", "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter."));
                }
            } catch (NoSuchMethodException unused) {
                c6599 = null;
            }
        }
        if (c6599 != null) {
            return c6599;
        }
        if (Collection.class.isAssignableFrom(clsM18232)) {
            if (clsM18232.isAssignableFrom(ArrayList.class)) {
                c20551 = new C22972();
            } else if (clsM18232.isAssignableFrom(LinkedHashSet.class)) {
                c20551 = new C13107();
            } else if (clsM18232.isAssignableFrom(TreeSet.class)) {
                c20551 = new C14442();
            } else if (clsM18232.isAssignableFrom(ArrayDeque.class)) {
                c20551 = new C5781();
            }
        } else if (Map.class.isAssignableFrom(clsM18232)) {
            if (clsM18232.isAssignableFrom(LinkedHashMap.class)) {
                c20551 = new ASN1BMPString$$ExternalSyntheticOutline0(4);
            } else if (clsM18232.isAssignableFrom(TreeMap.class)) {
                c20551 = new ExternalValue$$ExternalSyntheticOutline0(7);
            } else if (clsM18232.isAssignableFrom(ConcurrentMapC17249.class)) {
                c20551 = new C24966(9);
            } else if (clsM18232.isAssignableFrom(ConcurrentSkipListMap.class)) {
                c20551 = new C20551(0);
            }
        }
        if (c20551 != null) {
            return c20551;
        }
        String strM54296 = m54296(clsM18232);
        if (strM54296 != null) {
            return new C6381(strM54296);
        }
        if (z) {
            return enumC10854M16293 != EnumC10854.ALLOW ? new C6381(C20551.m47117(clsM18232, "Unable to create instance of ", "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.")) : new C10912(clsM18232);
        }
        return new C6381(C20551.m47117(clsM18232, "Unable to create instance of ", "; Register an InstanceCreator or a TypeAdapter for this type."));
    }

    public final String toString() {
        return this.f78594.toString();
    }
}
