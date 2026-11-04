package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.ۗۙ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 16GA */
/* JADX INFO: loaded from: classes3.dex */
public final class C3181 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public HashMap f10323;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.Map] */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        ?? map;
        HashMap map2 = new HashMap();
        for (C24927 c24927 : (ArrayList) c1610.m5677()) {
            ArrayList<C17467> arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            C24927 c24927M5672 = c24927;
            while (c24927M5672 != null) {
                if (!hashSet.add(c24927M5672)) {
                    C4937.forEach(hashSet, new C15932(1, "Found 'super' loop in classes: " + hashSet));
                    break;
                }
                for (C17467 c17467 : c24927M5672.getFields()) {
                    if (!c17467.mo8547().m26540()) {
                        arrayList.add(c17467);
                    }
                }
                AbstractC1566 abstractC1566M55553 = c24927M5672.m55553();
                if (abstractC1566M55553 == null) {
                    break;
                } else {
                    c24927M5672 = c24927.mo8527().m5672(abstractC1566M55553);
                }
            }
            if (arrayList.isEmpty()) {
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap(arrayList.size());
                for (C17467 c17468 : arrayList) {
                    ((List) C11392.computeIfAbsent(map3, c17468.getName(), new C0948(7))).add(c17468);
                }
                C1170.removeIf(map3.entrySet(), new C16605());
                if (map3.isEmpty()) {
                    map = Collections.EMPTY_MAP;
                } else {
                    map = new HashMap();
                    for (List<C17467> list : map3.values()) {
                        if (((C17467) list.get(0)).m40972() == c24927 && list.size() == 2) {
                            C17467 c17469 = (C17467) list.get(1);
                            if (c17469.m40972() != c24927) {
                                map.put(c17469.mo13008(), EnumC23319.SUPER);
                            }
                        } else {
                            for (C17467 c174610 : list) {
                                if (c174610.m40972() != c24927) {
                                    map.put(c174610.mo13008(), EnumC23319.CAST);
                                }
                            }
                        }
                    }
                }
            }
            if (!map.isEmpty()) {
                C15859 c15859 = new C15859(0);
                c15859.f51570 = map;
                map2.put(c24927.m55569(), c15859);
            }
        }
        this.f10323 = map2;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        C15859 c15859;
        EnumC23319 enumC23319;
        if (c2551.m8524()) {
            return;
        }
        HashMap map = this.f10323;
        Iterator it = c2551.m8508().iterator();
        while (it.hasNext()) {
            for (C18959 c18959 : (ArrayList) ((C21943) it.next()).mo1986()) {
                int i = C17351.f56465[c18959.getType().ordinal()];
                C14022 c14022 = (i == 1 || i == 2) ? (C14022) ((C3319) c18959).m10937() : null;
                if (c14022 != null) {
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(c18959.m44039() - 1);
                    AbstractC1566 type = abstractC16481Mo44035.getType();
                    if (type.mo5564() && type.mo5543() && (c15859 = (C15859) map.get(type.mo5570())) != null && (enumC23319 = (EnumC23319) c15859.f51570.get(c14022)) != null) {
                        if (enumC23319 == EnumC23319.SUPER && abstractC16481Mo44035.mo17865(EnumC1763.THIS)) {
                            abstractC16481Mo44035.mo17866(EnumC1763.SUPER);
                        } else {
                            C3319 c3319 = new C3319(EnumC24203.CAST, c14022.m34148().getType(), 1);
                            c3319.mo44014(abstractC16481Mo44035.mo17528());
                            c3319.mo17866(EnumC1763.SYNTHETIC);
                            c3319.mo17866(EnumC1763.EXPLICIT_CAST);
                            abstractC16481Mo44035.m39113(c2551, (C18959) c3319, false);
                        }
                    }
                }
            }
        }
    }
}
