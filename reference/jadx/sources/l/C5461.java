package l;

import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۚۛܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes2.dex */
public final class C5461 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10854 m16293(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC10854 enumC10854Check = ((InterfaceC22789) it.next()).check();
            if (enumC10854Check != EnumC10854.INDECISIVE) {
                return enumC10854Check;
            }
        }
        return EnumC10854.ALLOW;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m16294(Object obj, AccessibleObject accessibleObject) {
        return AbstractC12918.f41302.mo31992(obj, accessibleObject);
    }
}
