package l;

import java.lang.reflect.AccessibleObject;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩸ۚ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U87V */
/* JADX INFO: loaded from: classes4.dex */
public final class C21380 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6480 m47919(Class cls) {
        Iterator it = Collections.EMPTY_LIST.iterator();
        while (it.hasNext()) {
            EnumC6480 enumC6480Check = ((InterfaceC22709) it.next()).check();
            if (enumC6480Check != EnumC6480.INDECISIVE) {
                return enumC6480Check;
            }
        }
        return EnumC6480.ALLOW;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47920(Object obj, AccessibleObject accessibleObject) {
        return AbstractC15031.f49007.mo17803(obj, accessibleObject);
    }
}
