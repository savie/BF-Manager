package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: D971 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC14687 {
    SLL,
    LL,
    LL_EXACT_AMBIG_DETECTION;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35323(EnumC14687 enumC14687, C5783 c5783) {
        if (m35322(c5783)) {
            return true;
        }
        if (enumC14687 == SLL && c5783.f19857) {
            C5783 c5784 = new C5783();
            for (C22937 c22937 : c5783.f19856) {
                c5784.m16885(new C22937(c22937, c22937.f74514, c22937.f74515, C10212.f32654), null);
            }
            c5783 = c5784;
        }
        return m35329(m35327(c5783)) && !m35330(c5783);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35322(C5783 c5783) {
        Iterator it = c5783.f19856.iterator();
        while (it.hasNext()) {
            if (!(((C22937) it.next()).f74514 instanceof C0518)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m35332(C5783 c5783) {
        Iterator it = c5783.f19856.iterator();
        while (it.hasNext()) {
            if (((C22937) it.next()).f74514 instanceof C0518) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m35325(Collection collection) {
        return m35335(collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35321(Collection collection) {
        return !m35328(collection);
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m35328(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m35329(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35334(Collection collection) {
        Iterator it = collection.iterator();
        BitSet bitSet = (BitSet) it.next();
        while (it.hasNext()) {
            if (!((BitSet) it.next()).equals(bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m35331(Collection collection) {
        BitSet bitSetM35326 = m35326(collection);
        if (bitSetM35326.cardinality() == 1) {
            return bitSetM35326.nextSetBit(0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static BitSet m35326(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.or((BitSet) it.next());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static BitSet m35333(C5783 c5783) {
        BitSet bitSet = new BitSet();
        Iterator it = c5783.f19856.iterator();
        while (it.hasNext()) {
            bitSet.set(((C22937) it.next()).f74512);
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static Collection m35327(C5783 c5783) {
        C4247 c4247 = new C4247(C24385.f79107);
        for (C22937 c22937 : c5783.f19856) {
            BitSet bitSet = (BitSet) c4247.get(c22937);
            if (bitSet == null) {
                bitSet = new BitSet();
                c4247.put(c22937, bitSet);
            }
            bitSet.set(c22937.f74512);
        }
        return c4247.values();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static Map m35336(C5783 c5783) {
        HashMap map = new HashMap();
        for (C22937 c22937 : c5783.f19856) {
            BitSet bitSet = (BitSet) map.get(c22937.f74514);
            if (bitSet == null) {
                bitSet = new BitSet();
                map.put(c22937.f74514, bitSet);
            }
            bitSet.set(c22937.f74512);
        }
        return map;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m35330(C5783 c5783) {
        Iterator it = m35336(c5783).values().iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m35335(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.set(((BitSet) it.next()).nextSetBit(0));
            if (bitSet.cardinality() > 1) {
                return 0;
            }
        }
        return bitSet.nextSetBit(0);
    }
}
