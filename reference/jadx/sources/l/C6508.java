package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۜۘۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAR2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6508 {
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static HashMap m17715() {
        C9601 c9601M31902;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        List<AbstractC20745> listMo33983 = C11904.f39938.m46690("syntax/custom").mo33983(true);
        HashSet hashSet2 = new HashSet();
        for (AbstractC20745 abstractC20745 : listMo33983) {
            if (abstractC20745.mo33971()) {
                int i = C12859.f42771;
                String name = abstractC20745.getName();
                String str = null;
                if (name.endsWith(".cache")) {
                    String strM46498 = C20630.m46498(6, 0, name);
                    String lowerCase = strM46498.toLowerCase(Locale.ROOT);
                    if (strM46498.equals(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (str != null) {
                    hashSet2.add(str);
                }
            }
        }
        for (AbstractC20745 abstractC20746 : listMo33983) {
            if (abstractC20746.mo33971() && abstractC20746.getName().endsWith(".cache") && (c9601M31902 = C12859.m31902(abstractC20746)) != null) {
                String str2 = c9601M31902.f32348;
                if (str2 != null) {
                    hashSet.add(str2);
                    map.remove(str2);
                    map2.remove(str2);
                } else {
                    C20889 c20889 = c9601M31902.f32349;
                    String lowerCase2 = c20889.m46958().toLowerCase(Locale.ROOT);
                    if (!hashSet.contains(lowerCase2) && (!hashSet2.contains(lowerCase2) || abstractC20746.getName().equals(C12859.m31877(abstractC20746.m46711(), lowerCase2).getName()))) {
                        C20889 c208810 = (C20889) map.get(lowerCase2);
                        AbstractC20745 abstractC20747 = (AbstractC20745) map2.get(lowerCase2);
                        if (c208810 != null) {
                            int iM17710 = m17710(abstractC20746, c20889);
                            int iM17711 = m17710(abstractC20747, c208810);
                            if (iM17710 != iM17711) {
                                if (iM17710 > iM17711) {
                                }
                            } else if (abstractC20746.getName().compareTo(abstractC20747.getName()) < 0) {
                            }
                        }
                        map.put(lowerCase2, c20889);
                        map2.put(lowerCase2, abstractC20746);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m17710(AbstractC20745 abstractC20745, C20889 c20889) {
        String name = abstractC20745.getName();
        if (name.equals(C12859.m31877(abstractC20745.m46711(), c20889.m46958()).getName())) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c20889.m46958());
        sb.append(".cache");
        return name.equals(sb.toString()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m17711() {
        return C12859.m31868();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20889 m17712(String str, String str2) {
        C8439.m22093(str);
        C11448 c11448 = new C11448(str2);
        String strM22100 = C8439.m22100(str2, str);
        C22343 c22343 = new C22343(new C14325(strM22100, new RunnableC19683()));
        c22343.m43803(c11448);
        C22199 c22199 = new C22199(new C4943(c22343));
        c22199.m43803(c11448);
        C20889 c20889 = new C20889(c22199.m49291());
        c20889.m46963();
        C1900.m6195(c20889);
        C12859.m31889(c20889, strM22100);
        return c20889;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17713(AbstractC20745 abstractC20745) {
        C12859.m31886(abstractC20745);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17714(C20889 c20889) {
        return C12859.m31897(c20889);
    }
}
