package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹᩻᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22627 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C1522 f73724 = new C1522(3);

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Collection f73726;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f73727 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Comparator f73725 = f73724;

    public C22627(Collection collection) {
        this.f73726 = collection;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C22627 m50152(Collection collection) {
        return new C22627(collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50156(int i) {
        this.f73727 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50157(C12119 c12119) {
        this.f73725 = c12119;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5693 m50155() {
        String[] strArr;
        Collection<String> collection = this.f73726;
        int i = this.f73727;
        Comparator comparator = this.f73725;
        boolean z = i == 1;
        boolean z2 = i == 2;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                HashMap map = new HashMap();
                C5693 c5693M50151 = m50151("", map, z2);
                for (String str : collection) {
                    int iLastIndexOf = str.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        strArr = new String[]{"", str};
                    } else {
                        strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                    }
                    m50151(strArr[0], map, z2).f19420.add(new C14161(strArr[1], str));
                }
                if (z) {
                    m50153(c5693M50151);
                }
                c5693M50151.m15700(comparator);
                return c5693M50151;
            } catch (ConcurrentModificationException unused) {
                Thread.yield();
            }
        }
        return new C5693(null, "", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5693 m50151(String str, HashMap map, boolean z) {
        String[] strArr;
        C5693 c5693;
        C5693 c5694;
        C5693 c5695 = (C5693) map.get(str);
        if (c5695 != null) {
            return c5695;
        }
        if (str.isEmpty()) {
            c5694 = new C5693(null, "", str);
        } else {
            if (z) {
                C5693 c5693M50151 = m50151("", map, true);
                c5693 = new C5693(c5693M50151, str.replace('/', '.'), str);
                c5693M50151.f19417.add(c5693);
            } else {
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf == -1) {
                    strArr = new String[]{"", str};
                } else {
                    strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                }
                C5693 c5693M50152 = m50151(strArr[0], map, false);
                c5693 = new C5693(c5693M50152, strArr[1], str);
                c5693M50152.f19417.add(c5693);
            }
            c5694 = c5693;
        }
        map.put(str, c5694);
        return c5694;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m50150(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String m50154(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m50153(C5693 c5693) {
        if (c5693.f19416 != null && c5693.f19417.size() == 1 && c5693.f19420.isEmpty()) {
            C5693 c5694 = (C5693) c5693.f19417.remove(0);
            c5693.f19419 += "." + c5694.f19419;
            c5693.f19418 = c5694.f19418;
            c5693.f19417.addAll(c5694.f19417);
            c5693.f19420.addAll(c5694.f19420);
            Iterator it = c5693.f19417.iterator();
            while (it.hasNext()) {
                ((C5693) it.next()).f19416 = c5693;
            }
            Iterator it2 = c5693.f19420.iterator();
            while (it2.hasNext()) {
                ((C14161) it2.next()).getClass();
            }
            m50153(c5693);
        }
        Iterator it3 = c5693.f19417.iterator();
        while (it3.hasNext()) {
            m50153((C5693) it3.next());
        }
    }
}
