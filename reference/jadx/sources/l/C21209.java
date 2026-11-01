package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.᩷᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21209 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC23844 m47672(Enum r0, Enum... enumArr) {
        return C3237.m9690(EnumSet.of(r0, enumArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashSet m47669(int i) {
        int iCeil;
        if (i < 3) {
            C20296.m45806(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC7804 m47671(Set set, AbstractC23844 abstractC23844) {
        C18304.m42513(set, "set1");
        C18304.m42513(abstractC23844, "set2");
        return new C8510(set, abstractC23844);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m47670(Set set, InterfaceC19010 interfaceC19010) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof C19799)) {
                return new C9216(collection, interfaceC19010);
            }
            C19799 c19799 = (C19799) collection;
            return new C9216((SortedSet) c19799.f21057, C19716.m44842(c19799.f21056, interfaceC19010));
        }
        if (!(set instanceof C19799)) {
            set.getClass();
            return new C19799(set, interfaceC19010);
        }
        C19799 c197910 = (C19799) set;
        return new C19799((Set) c197910.f21057, C19716.m44842(c197910.f21056, interfaceC19010));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m47668(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47673(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
