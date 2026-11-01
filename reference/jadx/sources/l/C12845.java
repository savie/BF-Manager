package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12845 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f42741;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f42744;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f42745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final HashMap f42743 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f42742 = new HashMap();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static ArrayList m31860(C12845 c12845, int i) {
        c12845.getClass();
        ArrayList arrayList = new ArrayList();
        for (C21311 c21311 : c12845.f42743.values()) {
            if (c21311.f69337 == i) {
                arrayList.add(c21311);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m31857(C12845 c12845, C21311 c21311) {
        c12845.f42743.put(Integer.valueOf(c21311.f69336), c21311);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m31852(C12845 c12845) {
        long jM44089;
        for (C21311 c21311 : c12845.m31853()) {
            if (c21311.f69339 <= 0 || c21311.f69338 || c21311.f69334) {
                throw new C7906();
            }
            long j = c12845.f42744;
            if (j > 0) {
                long j2 = c12845.f42741;
                if (j2 > 0) {
                    jM44089 = C19195.m44089(j, j2);
                } else if (c21311.f69332 <= 0 && c12845.f42741 > 0) {
                    jM44089 = C19195.m44089(c21311.f69332, c12845.f42741);
                } else if (c21311.f69333 > 0) {
                    jM44089 = C19195.m44089(c21311.f69333, c21311.f69339);
                } else {
                    jM44089 = -9223372036854775807L;
                }
            } else if (c21311.f69332 <= 0) {
                if (c21311.f69333 > 0) {
                    jM44089 = C19195.m44089(c21311.f69333, c21311.f69339);
                } else {
                    jM44089 = -9223372036854775807L;
                }
            } else if (c21311.f69333 > 0) {
                jM44089 = C19195.m44089(c21311.f69333, c21311.f69339);
            } else {
                jM44089 = -9223372036854775807L;
            }
            c21311.f69335 = jM44089;
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m31858(C12845 c12845) {
        if (c12845.f42745) {
            return true;
        }
        Iterator it = c12845.f42743.values().iterator();
        while (it.hasNext()) {
            if (((C21311) it.next()).f69334) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList m31853() {
        ArrayList arrayList = new ArrayList();
        for (C21311 c21311 : this.f42743.values()) {
            if (c21311.f69337 == 1 || c21311.f69337 == 2) {
                arrayList.add(c21311);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22017 m31855(C12845 c12845, int i) {
        return (C22017) c12845.f42742.get(Integer.valueOf(i));
    }
}
