package l;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.֨۬᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: D971 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1144 {
    SLL,
    LL,
    LL_EXACT_AMBIG_DETECTION;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4180(EnumC1144 enumC1144, C17643 c17643) {
        if (m4181(c17643)) {
            return true;
        }
        if (enumC1144 == SLL && c17643.f56080) {
            C17643 c17644 = new C17643();
            for (C20466 c20466 : c17643.f56084) {
                c17644.m41115(new C20466(c20466, c20466.f66406, c20466.f66408, C21606.f70083), null);
            }
            c17643 = c17644;
        }
        return m4190(m4186(c17643)) && !m4191(c17643);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4181(C17643 c17643) {
        Iterator it = c17643.f56084.iterator();
        while (it.hasNext()) {
            if (!(((C20466) it.next()).f66406 instanceof C6789)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m4184(C17643 c17643) {
        Iterator it = c17643.f56084.iterator();
        while (it.hasNext()) {
            if (((C20466) it.next()).f66406 instanceof C6789) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static int m4187(Collection collection) {
        return m4177(collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m4179(Collection collection) {
        return !m4176(collection);
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static boolean m4176(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m4190(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() > 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m4189(Collection collection) {
        Iterator it = collection.iterator();
        BitSet bitSet = (BitSet) it.next();
        while (it.hasNext()) {
            if (!((BitSet) it.next()).equals(bitSet)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m4183(Collection collection) {
        BitSet bitSetM4185 = m4185(collection);
        if (bitSetM4185.cardinality() == 1) {
            return bitSetM4185.nextSetBit(0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static BitSet m4185(Collection collection) {
        BitSet bitSet = new BitSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bitSet.or((BitSet) it.next());
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static BitSet m4188(C17643 c17643) {
        BitSet bitSet = new BitSet();
        Iterator it = c17643.f56084.iterator();
        while (it.hasNext()) {
            bitSet.set(((C20466) it.next()).f66405);
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static Collection m4186(C17643 c17643) {
        C22312 c22312 = new C22312(C5378.f18577);
        for (C20466 c20466 : c17643.f56084) {
            BitSet bitSet = (BitSet) c22312.get(c20466);
            if (bitSet == null) {
                bitSet = new BitSet();
                c22312.put(c20466, bitSet);
            }
            bitSet.set(c20466.f66405);
        }
        return c22312.values();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static Map m4178(C17643 c17643) {
        HashMap map = new HashMap();
        for (C20466 c20466 : c17643.f56084) {
            BitSet bitSet = (BitSet) map.get(c20466.f66406);
            if (bitSet == null) {
                bitSet = new BitSet();
                map.put(c20466.f66406, bitSet);
            }
            bitSet.set(c20466.f66405);
        }
        return map;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public static boolean m4191(C17643 c17643) {
        Iterator it = m4178(c17643).values().iterator();
        while (it.hasNext()) {
            if (((BitSet) it.next()).cardinality() == 1) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m4177(Collection collection) {
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
