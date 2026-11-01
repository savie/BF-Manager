package l;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.ܶۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14966 {
    public static Set a(Set set) {
        EnumC23764 enumC23764;
        Collector.Characteristics characteristics;
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC23764) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC23764 enumC23765 = (EnumC23764) it.next();
                    if (enumC23765 == null) {
                        characteristics = null;
                    } else if (enumC23765 == EnumC23764.CONCURRENT) {
                        characteristics = Collector.Characteristics.CONCURRENT;
                    } else {
                        characteristics = enumC23765 == EnumC23764.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH;
                    }
                    hashSet.add(characteristics);
                } catch (ClassCastException e) {
                    C12040.a(e, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C12040.a(next.getClass(), "java.util.stream.Collector.Characteristics");
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics2 = (Collector.Characteristics) it2.next();
                    if (characteristics2 == null) {
                        enumC23764 = null;
                    } else if (characteristics2 == Collector.Characteristics.CONCURRENT) {
                        enumC23764 = EnumC23764.CONCURRENT;
                    } else {
                        enumC23764 = characteristics2 == Collector.Characteristics.UNORDERED ? EnumC23764.UNORDERED : EnumC23764.IDENTITY_FINISH;
                    }
                    hashSet.add(enumC23764);
                } catch (ClassCastException e2) {
                    C12040.a(e2, "java.util.stream.Collector.Characteristics");
                    throw null;
                }
            }
        }
        return hashSet;
    }
}
