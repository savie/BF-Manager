package l;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.֨᩺ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y8QE */
/* JADX INFO: loaded from: classes2.dex */
public final class C1432 extends AbstractC4254 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long[] f5886;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long[] f5887;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f5888;

    public C1432() {
        super(new C7928());
        this.f5888 = -9223372036854775807L;
        this.f5886 = new long[0];
        this.f5887 = new long[0];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m5004() {
        return this.f5888;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long[] m5006() {
        return this.f5886;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long[] m5007() {
        return this.f5887;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5005(long j, C2460 c2460) {
        if (c2460.m7516() != 2 || !"onMetaData".equals(m5003(c2460)) || c2460.m7503() == 0 || c2460.m7516() != 8) {
            return false;
        }
        HashMap mapM5002 = m5002(c2460);
        Object obj = mapM5002.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f5888 = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapM5002.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f5886 = new long[size];
                this.f5887 = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f5886[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f5887[i] = ((Double) obj5).longValue();
                    } else {
                        this.f5886 = new long[0];
                        this.f5887 = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m5003(C2460 c2460) {
        int iM7519 = c2460.m7519();
        int iM7500 = c2460.m7500();
        c2460.m7535(iM7519);
        return new String(c2460.m7518(), iM7500, iM7519);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static HashMap m5002(C2460 c2460) {
        int iM7531 = c2460.m7531();
        HashMap map = new HashMap(iM7531);
        for (int i = 0; i < iM7531; i++) {
            String strM5003 = m5003(c2460);
            Serializable serializableM5001 = m5001(c2460.m7516(), c2460);
            if (serializableM5001 != null) {
                map.put(strM5003, serializableM5001);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Serializable m5001(int i, C2460 c2460) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c2460.m7529()));
        }
        if (i == 1) {
            return Boolean.valueOf(c2460.m7516() == 1);
        }
        if (i == 2) {
            return m5003(c2460);
        }
        if (i != 3) {
            if (i == 8) {
                return m5002(c2460);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c2460.m7529()));
                c2460.m7535(2);
                return date;
            }
            int iM7531 = c2460.m7531();
            ArrayList arrayList = new ArrayList(iM7531);
            for (int i2 = 0; i2 < iM7531; i2++) {
                Serializable serializableM5001 = m5001(c2460.m7516(), c2460);
                if (serializableM5001 != null) {
                    arrayList.add(serializableM5001);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM5003 = m5003(c2460);
            int iM7516 = c2460.m7516();
            if (iM7516 == 9) {
                return map;
            }
            Serializable serializableM5002 = m5001(iM7516, c2460);
            if (serializableM5002 != null) {
                map.put(strM5003, serializableM5002);
            }
        }
    }
}
