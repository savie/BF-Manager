package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ۙ᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5206 {
    public static Set a(Set set) {
        EnumC13211 enumC13211;
        Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC13211) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC13211 enumC13212 = (EnumC13211) it.next();
                    if (enumC13212 == null) {
                        characteristics = null;
                    } else if (enumC13212 == EnumC13211.CONCURRENT) {
                        characteristics = Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = enumC13212 == EnumC13211.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e) {
                    C16041.a(e, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C16041.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                    if (characteristics2 == null) {
                        enumC13211 = null;
                    } else if (characteristics2 == Collector.Characteristics.CONCURRENT) {
                        enumC13211 = EnumC13211.CONCURRENT;
                    } else {
                        enumC13211 = characteristics2 == Collector.Characteristics.UNORDERED ? EnumC13211.UNORDERED : EnumC13211.IDENTITY_FINISH;
                    }
                    hashSet.add(enumC13211);
                } catch (ClassCastException e2) {
                    C16041.a(e2, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
