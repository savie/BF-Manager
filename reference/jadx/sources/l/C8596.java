package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: l.۠ۧᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAR2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8596 {
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static HashMap m23114() {
        C4122 c4122M24622;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        List<AbstractC22044> listMo4299 = C6382.f21568.m49876("syntax/custom").mo4299(true);
        HashSet hashSet2 = new HashSet();
        for (AbstractC22044 abstractC22044 : listMo4299) {
            if (abstractC22044.mo4304()) {
                int i = C9341.f30354;
                String name = abstractC22044.getName();
                String str = null;
                if (name.endsWith(".cache")) {
                    String strM5124 = C1402.m5124(6, 0, name);
                    String lowerCase = strM5124.toLowerCase(Locale.ROOT);
                    if (strM5124.equals(lowerCase)) {
                        str = lowerCase;
                    }
                }
                if (str != null) {
                    hashSet2.add(str);
                }
            }
        }
        for (AbstractC22044 abstractC22045 : listMo4299) {
            if (abstractC22045.mo4304() && abstractC22045.getName().endsWith(".cache") && (c4122M24622 = C9341.m24622(abstractC22045)) != null) {
                String str2 = c4122M24622.f13989;
                if (str2 != null) {
                    hashSet.add(str2);
                    map.remove(str2);
                    map2.remove(str2);
                } else {
                    C16800 c16800 = c4122M24622.f13990;
                    String lowerCase2 = c16800.m39683().toLowerCase(Locale.ROOT);
                    if (!hashSet.contains(lowerCase2) && (!hashSet2.contains(lowerCase2) || abstractC22045.getName().equals(C9341.m24591(abstractC22045.m49856(), lowerCase2).getName()))) {
                        C16800 c16801 = (C16800) map.get(lowerCase2);
                        AbstractC22044 abstractC22046 = (AbstractC22044) map2.get(lowerCase2);
                        if (c16801 != null) {
                            int iM23109 = m23109(abstractC22045, c16800);
                            int iM231010 = m23109(abstractC22046, c16801);
                            if (iM23109 != iM231010) {
                                if (iM23109 > iM231010) {
                                }
                            } else if (abstractC22045.getName().compareTo(abstractC22046.getName()) < 0) {
                            }
                        }
                        map.put(lowerCase2, c16800);
                        map2.put(lowerCase2, abstractC22045);
                    }
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23109(AbstractC22044 abstractC22044, C16800 c16800) {
        String name = abstractC22044.getName();
        if (name.equals(C9341.m24591(abstractC22044.m49856(), c16800.m39683()).getName())) {
            return 2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c16800.m39683());
        sb.append(".cache");
        return name.equals(sb.toString()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m23110() {
        return C9341.m24625();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16800 m23111(String str, String str2) {
        C5219.m15703(str);
        C0393 c0393 = new C0393(str2);
        String strM15710 = C5219.m15710(str2, str);
        C10093 c10093 = new C10093(new C16947(strM15710, new RunnableC10858(1)));
        c10093.m24868(c0393);
        C10246 c10246 = new C10246(new C3523(c10093));
        c10246.m24868(c0393);
        C16800 c16800 = new C16800(c10246.m26390());
        c16800.m39691();
        C20661.m47275(c16800);
        C9341.m24603(c16800, strM15710);
        return c16800;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23112(AbstractC22044 abstractC22044) {
        C9341.m24607(abstractC22044);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m23113(C16800 c16800) {
        return C9341.m24615(c16800);
    }
}
