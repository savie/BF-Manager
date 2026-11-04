package l;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: renamed from: l.ۨۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T5OR */
/* JADX INFO: loaded from: classes3.dex */
public final class C12324 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC8639 m30740(Enum r0, Enum... enumArr) {
        return C10876.m27618(EnumSet.of(r0, enumArr));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashSet m30738(int i) {
        int iCeil;
        if (i < 3) {
            C19278.m44623(i, "expectedSize");
            iCeil = i + 1;
        } else {
            iCeil = i < 1073741824 ? (int) Math.ceil(((double) i) / 0.75d) : Integer.MAX_VALUE;
        }
        return new HashSet(iCeil);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC20529 m30741(Set set, AbstractC8639 abstractC8639) {
        C12128.m30305(set, "set1");
        C12128.m30305(abstractC8639, "set2");
        return new C17545(set, abstractC8639);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Set m30739(Set set, InterfaceC6163 interfaceC6163) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof C16053)) {
                return new C23513(collection, interfaceC6163);
            }
            C16053 c16053 = (C16053) collection;
            return new C23513((SortedSet) c16053.f9445, C3925.m12634(c16053.f9444, interfaceC6163));
        }
        if (!(set instanceof C16053)) {
            set.getClass();
            return new C16053(set, interfaceC6163);
        }
        C16053 c16054 = (C16053) set;
        return new C16053((Set) c16054.f9445, C3925.m12634(c16054.f9444, interfaceC6163));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m30737(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m30742(Set set, Object obj) {
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
