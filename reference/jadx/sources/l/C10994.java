package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R790 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10994 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f34739;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public boolean f34741;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f34742;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final HashMap f34740 = new HashMap();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final HashMap f34738 = new HashMap();

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static ArrayList m27838(C10994 c10994, int i) {
        c10994.getClass();
        ArrayList arrayList = new ArrayList();
        for (C5775 c5775 : c10994.f34740.values()) {
            if (c5775.f19838 == i) {
                arrayList.add(c5775);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m27834(C10994 c10994, C5775 c5775) {
        c10994.f34740.put(Integer.valueOf(c5775.f19839), c5775);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m27841(C10994 c10994) {
        long jM40007;
        for (C5775 c5775 : c10994.m27830()) {
            if (c5775.f19841 <= 0 || c5775.f19843 || c5775.f19837) {
                throw new C25167();
            }
            long j = c10994.f34739;
            if (j > 0) {
                long j2 = c10994.f34742;
                if (j2 > 0) {
                    jM40007 = C16961.m40007(j, j2);
                } else if (c5775.f19840 <= 0 && c10994.f34742 > 0) {
                    jM40007 = C16961.m40007(c5775.f19840, c10994.f34742);
                } else if (c5775.f19844 > 0) {
                    jM40007 = C16961.m40007(c5775.f19844, c5775.f19841);
                } else {
                    jM40007 = -9223372036854775807L;
                }
            } else if (c5775.f19840 <= 0) {
                if (c5775.f19844 > 0) {
                    jM40007 = C16961.m40007(c5775.f19844, c5775.f19841);
                } else {
                    jM40007 = -9223372036854775807L;
                }
            } else if (c5775.f19844 > 0) {
                jM40007 = C16961.m40007(c5775.f19844, c5775.f19841);
            } else {
                jM40007 = -9223372036854775807L;
            }
            c5775.f19842 = jM40007;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static boolean m27837(C10994 c10994) {
        if (c10994.f34741) {
            return true;
        }
        Iterator it = c10994.f34740.values().iterator();
        while (it.hasNext()) {
            if (((C5775) it.next()).f19837) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList m27830() {
        ArrayList arrayList = new ArrayList();
        for (C5775 c5775 : this.f34740.values()) {
            if (c5775.f19838 == 1 || c5775.f19838 == 2) {
                arrayList.add(c5775);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5029 m27832(C10994 c10994, int i) {
        return (C5029) c10994.f34738.get(Integer.valueOf(i));
    }
}
