package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩳۧ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QE */
/* JADX INFO: loaded from: classes5.dex */
public final class C19040 extends AbstractC1141 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long[] f61671;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f61672;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long[] f61673;

    public C19040() {
        super(new C4586());
        this.f61672 = -9223372036854775807L;
        this.f61673 = new long[0];
        this.f61671 = new long[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m44138() {
        return this.f61672;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long[] m44140() {
        return this.f61673;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long[] m44141() {
        return this.f61671;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m44139(long j, C21287 c21287) {
        if (c21287.m48493() != 2 || !"onMetaData".equals(m44137(c21287)) || c21287.m48486() == 0 || c21287.m48493() != 8) {
            return false;
        }
        HashMap mapM44136 = m44136(c21287);
        Object obj = mapM44136.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f61672 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM44136.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f61673 = new long[size];
                this.f61671 = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f61673[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f61671[i] = ((Double) obj5).longValue();
                    } else {
                        this.f61673 = new long[0];
                        this.f61671 = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m44137(C21287 c21287) {
        int iM48494 = c21287.m48494();
        int iM48516 = c21287.m48516();
        c21287.m48503(iM48494);
        return new String(c21287.m48497(), iM48516, iM48494);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m44136(C21287 c21287) {
        int iM48512 = c21287.m48512();
        HashMap map = new HashMap(iM48512);
        for (int i = 0; i < iM48512; i++) {
            String strM44137 = m44137(c21287);
            Serializable serializableM44135 = m44135(c21287.m48493(), c21287);
            if (serializableM44135 != null) {
                map.put(strM44137, serializableM44135);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Serializable m44135(int i, C21287 c21287) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c21287.m48518()));
        }
        if (i == 1) {
            return Boolean.valueOf(c21287.m48493() == 1);
        }
        if (i == 2) {
            return m44137(c21287);
        }
        if (i != 3) {
            if (i == 8) {
                return m44136(c21287);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c21287.m48518()));
                c21287.m48503(2);
                return date;
            }
            int iM48512 = c21287.m48512();
            ArrayList arrayList = new ArrayList(iM48512);
            for (int i2 = 0; i2 < iM48512; i2++) {
                Serializable serializableM44135 = m44135(c21287.m48493(), c21287);
                if (serializableM44135 != null) {
                    arrayList.add(serializableM44135);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM44137 = m44137(c21287);
            int iM48493 = c21287.m48493();
            if (iM48493 == 9) {
                return map;
            }
            Serializable serializableM44136 = m44135(iM48493, c21287);
            if (serializableM44136 != null) {
                map.put(strM44137, serializableM44136);
            }
        }
    }
}
