package l;

import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܳۧܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: J1PQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C15306 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final C1132 f50037 = new C1132();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Collection f50039;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f50040 = 0;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Comparator f50038 = f50037;

    public C15306(Collection collection) {
        this.f50039 = collection;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15306 m36752(Collection collection) {
        return new C15306(collection);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36757(int i) {
        this.f50040 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m36758(C8589 c8589) {
        this.f50038 = c8589;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19782 m36756() {
        String[] strArr;
        Collection<String> collection = this.f50039;
        int i = this.f50040;
        Comparator comparator = this.f50038;
        boolean z = i == 1;
        boolean z2 = i == 2;
        for (int i2 = 0; i2 < 5; i2++) {
            try {
                HashMap map = new HashMap();
                C19782 c19782M36753 = m36753("", map, z2);
                for (String str : collection) {
                    int iLastIndexOf = str.lastIndexOf(47);
                    if (iLastIndexOf == -1) {
                        strArr = new String[]{"", str};
                    } else {
                        strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                    }
                    m36753(strArr[0], map, z2).f63642.add(new C22020(strArr[1], str));
                }
                if (z) {
                    m36754(c19782M36753);
                }
                c19782M36753.m45558(comparator);
                return c19782M36753;
            } catch (ConcurrentModificationException unused) {
                Thread.yield();
            }
        }
        return new C19782(null, "", "");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19782 m36753(String str, HashMap map, boolean z) {
        String[] strArr;
        C19782 c19782;
        C19782 c19783;
        C19782 c19784 = (C19782) map.get(str);
        if (c19784 != null) {
            return c19784;
        }
        if (str.isEmpty()) {
            c19783 = new C19782(null, "", str);
        } else {
            if (z) {
                C19782 c19782M36753 = m36753("", map, true);
                c19782 = new C19782(c19782M36753, str.replace('/', '.'), str);
                c19782M36753.f63639.add(c19782);
            } else {
                int iLastIndexOf = str.lastIndexOf(47);
                if (iLastIndexOf == -1) {
                    strArr = new String[]{"", str};
                } else {
                    strArr = new String[]{str.substring(0, iLastIndexOf), str.substring(iLastIndexOf + 1)};
                }
                C19782 c19782M36754 = m36753(strArr[0], map, false);
                c19782 = new C19782(c19782M36754, strArr[1], str);
                c19782M36754.f63639.add(c19782);
            }
            c19783 = c19782;
        }
        map.put(str, c19783);
        return c19783;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m36751(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String m36755(String str) {
        int iLastIndexOf = str.lastIndexOf(47);
        return iLastIndexOf == -1 ? "" : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m36754(C19782 c19782) {
        if (c19782.f63643 != null && c19782.f63639.size() == 1 && c19782.f63642.isEmpty()) {
            C19782 c19783 = (C19782) c19782.f63639.remove(0);
            c19782.f63640 += "." + c19783.f63640;
            c19782.f63641 = c19783.f63641;
            c19782.f63639.addAll(c19783.f63639);
            c19782.f63642.addAll(c19783.f63642);
            Iterator it = c19782.f63639.iterator();
            while (it.hasNext()) {
                ((C19782) it.next()).f63643 = c19782;
            }
            Iterator it2 = c19782.f63642.iterator();
            while (it2.hasNext()) {
                ((C22020) it2.next()).getClass();
            }
            m36754(c19782);
        }
        Iterator it3 = c19782.f63639.iterator();
        while (it3.hasNext()) {
            m36754((C19782) it3.next());
        }
    }
}
