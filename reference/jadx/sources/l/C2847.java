package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: renamed from: l.ۖᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D1JP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2847 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5284 f9357 = null;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean f9358 = true;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m9356() {
        return f9358;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C5284 m9353() {
        return f9357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9757 m9354(C9757 c9757, int i, boolean z) {
        EnumSet enumSetAllOf = EnumSet.allOf(EnumC9558.class);
        f9358 = z;
        f9357 = C5284.f18610;
        C24960 c24960M36611 = C15262.m36611(c9757, i);
        m9355(c24960M36611, enumSetAllOf);
        C9757 c9757M8647 = C2584.m8647(c24960M36611, false);
        int iM36043 = c9757M8647.m25432().m36043();
        f9357.getClass();
        if (iM36043 <= 16) {
            return c9757M8647;
        }
        C24960 c24960M36612 = C15262.m36611(c9757, i);
        EnumSet enumSetClone = enumSetAllOf.clone();
        enumSetClone.remove(EnumC9558.CONST_COLLECTOR);
        m9355(c24960M36612, enumSetClone);
        return C2584.m8647(c24960M36612, true);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m9355(C24960 c24960, EnumSet enumSet) {
        boolean z;
        int i;
        C20946 c20946;
        C20946 c20947;
        if (enumSet.contains(EnumC9558.MOVE_PARAM_COMBINER)) {
            C10304.m26553(c24960);
        }
        if (enumSet.contains(EnumC9558.SCCP)) {
            C10787.m27492(c24960);
            C2102.m7272(c24960);
            z = false;
        } else {
            z = true;
        }
        if (enumSet.contains(EnumC9558.LITERAL_UPGRADE)) {
            C21493.m48898(c24960);
            C2102.m7272(c24960);
            z = false;
        }
        EnumC9558 enumC9558 = EnumC9558.ESCAPE_ANALYSIS;
        enumSet.remove(enumC9558);
        if (enumSet.contains(enumC9558)) {
            C24477.m54728(c24960);
            C2102.m7272(c24960);
            z = false;
        }
        if (enumSet.contains(EnumC9558.CONST_COLLECTOR)) {
            C13288 c13288 = new C13288();
            int iM55737 = c24960.m55737();
            int iM55738 = c24960.m55737();
            HashMap map = new HashMap();
            new HashSet();
            int i2 = 0;
            while (true) {
                i = 1;
                if (i2 >= iM55738) {
                    break;
                }
                AbstractC5568 abstractC5568M55738 = c24960.m55738(i2);
                if (abstractC5568M55738 != null && abstractC5568M55738.mo4988() != null) {
                    C20946 c20946M16508 = abstractC5568M55738.m16508();
                    InterfaceC22239 interfaceC22239M47898 = c20946M16508.m47898();
                    if (interfaceC22239M47898.mo8409()) {
                        AbstractC2519 abstractC2519 = (AbstractC2519) interfaceC22239M47898;
                        if (abstractC5568M55738.mo4988().m43509() == 56) {
                            abstractC5568M55738 = (AbstractC5568) j$$ExternalSyntheticOutline0.m(((C19738) c24960.m55749().get(abstractC5568M55738.m16506().m45465().nextSetBit(0))).m45460(), 1);
                        }
                        if (!abstractC5568M55738.mo4996() && !c24960.m55736(c20946M16508)) {
                            Integer num = (Integer) map.get(abstractC2519);
                            if (num == null) {
                                map.put(abstractC2519, 1);
                            } else {
                                map.put(abstractC2519, Integer.valueOf(num.intValue() + 1));
                            }
                        }
                    }
                }
                i2++;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                if (((Integer) entry.getValue()).intValue() > 1) {
                    arrayList.add((AbstractC2519) entry.getKey());
                }
            }
            Collections.sort(arrayList, new C20001(map));
            int iMin = Math.min(arrayList.size(), 5);
            C19738 c19738M55739 = c24960.m55739();
            HashMap map2 = new HashMap(iMin);
            int i3 = 0;
            while (i3 < iMin) {
                AbstractC2519 abstractC25110 = (AbstractC2519) arrayList.get(i3);
                C20946 c20946M47883 = C20946.m47883(c24960.m55744(), abstractC25110);
                C18708 c18708M3254 = C0809.m3254(abstractC25110);
                if (c18708M3254.m43508() == i) {
                    c19738M55739.m45455(new C6030(C0809.m3254(abstractC25110), C9012.f29360, c20946M47883, C0063.f947, abstractC25110));
                    c20947 = c20946M47883;
                } else {
                    C19738 c19738M557310 = c24960.m55739();
                    C19738 c19738M45459 = c19738M557310.m45459();
                    C19738 c19738M45461 = c19738M557310.m45461(c19738M45459);
                    C9012 c9012 = C9012.f29360;
                    C0063 c0063 = C0063.f947;
                    c19738M45461.m45474(new C8267(c18708M3254, c9012, c0063, C13705.f43487, abstractC25110));
                    c20947 = c20946M47883;
                    c19738M45461.m45461(c19738M45459).m45455(new C23930(C0809.m3259(c20946M47883.m47898()), c9012, c20947, c0063));
                }
                map2.put(abstractC25110, c20947);
                i3++;
                c19738M55739 = c19738M55739;
                arrayList = arrayList;
                iMin = iMin;
                i = 1;
            }
            new HashSet();
            ArrayList[] arrayListArrM55725 = c24960.m55725();
            for (int i4 = 0; i4 < iM55737; i4++) {
                AbstractC5568 abstractC5568M55739 = c24960.m55738(i4);
                if (abstractC5568M55739 != null) {
                    C20946 c20946M16509 = abstractC5568M55739.m16508();
                    InterfaceC22239 interfaceC22239M47899 = abstractC5568M55739.m16508().m47898();
                    if (interfaceC22239M47899.mo8409() && (c20946 = (C20946) map2.get((AbstractC2519) interfaceC22239M47899)) != null && !c24960.m55736(c20946M16509)) {
                        C15525 c15525 = new C15525(c13288, c20946M16509, c20946);
                        for (AbstractC5568 abstractC5568 : arrayListArrM55725[c20946M16509.m47903()]) {
                            if (!abstractC5568.mo4996() || abstractC5568.m16506().m45467().cardinality() <= 1) {
                                abstractC5568.mo4995(c15525);
                            }
                        }
                    }
                }
            }
            C2102.m7272(c24960);
            z = false;
        }
        if (z) {
            C2102.m7272(c24960);
        }
        C4822.m14852(c24960);
    }
}
