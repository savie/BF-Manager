package l;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܶ۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6F5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16107 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1610 f52174;

    static {
        C16980.m40037(C16107.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f52174 = c1610;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.m8524()) {
            return;
        }
        for (C21943 c21943 : c2551.m8508()) {
            if (!c21943.mo17865(EnumC1763.DONT_GENERATE)) {
                for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                    if (!c18959.mo17865(EnumC1763.DONT_GENERATE)) {
                        c18959.mo14761(new C16853(this, c2551, 0));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38267(C16107 c16107, C2551 c2551, C18959 c18959) {
        AbstractC1566 type;
        ArrayList arrayList;
        List listMo8537;
        AbstractC1566 abstractC1566;
        if (c18959 instanceof AbstractC15251) {
            AbstractC15251 abstractC15251 = (AbstractC15251) c18959;
            if (abstractC15251.mo18926().m49705() == 0) {
                return;
            }
            InterfaceC21197 interfaceC21197M19301 = c16107.f52174.m5683().m19301(abstractC15251);
            if (interfaceC21197M19301 != null) {
                if (interfaceC21197M19301.mo8510() && (abstractC1566 = (AbstractC1566) C4123.m13231(interfaceC21197M19301.mo8537())) != null && abstractC1566.m5554()) {
                    abstractC15251.mo17866(EnumC1763.VARARG_CALL);
                }
                C21965 c21965Mo18926 = abstractC15251.mo18926();
                if ((abstractC15251 instanceof C6787) && ((C6787) abstractC15251).m18922()) {
                    type = c2551.m8536().m55553();
                } else {
                    AbstractC16481 abstractC16481Mo13131 = abstractC15251.mo13131();
                    if (abstractC16481Mo13131 != null) {
                        type = abstractC16481Mo13131.getType();
                    } else {
                        type = c21965Mo18926.m49700().getType();
                    }
                }
                ArrayList arrayListM19300 = c16107.f52174.m5683().m19300(type, c21965Mo18926);
                if (arrayListM19300.isEmpty()) {
                    return;
                }
                AbstractC1566 type2 = abstractC15251.mo18926().m49700().getType();
                AbstractC16481 abstractC16481Mo13132 = abstractC15251.mo13131();
                if (abstractC16481Mo13132 != null) {
                    type2 = abstractC16481Mo13132.getType();
                } else if (abstractC15251.getType() == EnumC24203.CONSTRUCTOR && abstractC15251.m44027() != null) {
                    type2 = abstractC15251.m44027().getType();
                }
                C3101 c3101M5692 = c16107.f52174.m5692();
                Map mapM10108 = c3101M5692.m10108(type2);
                Map mapM10104 = c3101M5692.m10104(abstractC15251);
                if (mapM10108 == null || mapM10108.isEmpty()) {
                    mapM10108 = mapM10104;
                } else if (mapM10104 != null && !mapM10104.isEmpty()) {
                    HashMap map = new HashMap(mapM10104.size() + mapM10108.size());
                    map.putAll(mapM10108);
                    map.putAll(mapM10104);
                    mapM10108 = map;
                }
                InterfaceC21197 interfaceC21197M38265 = c16107.m38265(interfaceC21197M19301, mapM10108);
                ArrayList arrayList2 = new ArrayList(arrayListM19300.size() + 1);
                Iterator it = arrayListM19300.iterator();
                while (it.hasNext()) {
                    arrayList2.add(c16107.m38265((InterfaceC21197) it.next(), mapM10108));
                }
                arrayList2.add(interfaceC21197M38265);
                int iMo13126 = abstractC15251.mo13126();
                ArrayList arrayListM38264 = m38264(abstractC15251, iMo13126);
                if (c16107.m38269(interfaceC21197M38265, arrayList2, arrayListM38264)) {
                    listMo8537 = arrayListM38264;
                } else {
                    int size = arrayListM38264.size();
                    arrayList = new ArrayList(arrayListM38264);
                    if (!m38268(arrayList, interfaceC21197M38265.mo8537()) || !c16107.m38269(interfaceC21197M38265, arrayList2, arrayList)) {
                        listMo8537 = arrayList;
                        boolean z = false;
                        for (int i = 0; i < size; i++) {
                            AbstractC1566 abstractC1567 = (AbstractC1566) arrayList.get(i);
                            AbstractC1566 abstractC1568 = (AbstractC1566) interfaceC21197M38265.mo8537().get(i);
                            if (!abstractC1567.mo5550() && abstractC1568.mo5550()) {
                                arrayList.set(i, abstractC1568);
                                z = true;
                            }
                        }
                        if (!z || !c16107.m38269(interfaceC21197M38265, arrayList2, arrayList)) {
                            if (size == 1) {
                                listMo8537 = interfaceC21197M38265.mo8537();
                            } else {
                                listMo8537 = interfaceC21197M38265.mo8537();
                            }
                        }
                    }
                }
                listMo8537 = arrayList;
                listMo8537 = arrayList;
                C8706 c8706M5687 = c2551.mo8527().m5687();
                List listMo8538 = interfaceC21197M38265.mo8537();
                int size2 = listMo8537.size();
                ArrayList arrayList3 = new ArrayList(size2);
                for (int i2 = 0; i2 < size2; i2++) {
                    AbstractC1566 abstractC1569 = (AbstractC1566) listMo8538.get(i2);
                    AbstractC1566 abstractC15610 = (AbstractC1566) listMo8537.get(i2);
                    if (c8706M5687.m23403(abstractC1569, abstractC15610) == EnumC7215.NARROW_BY_GENERIC) {
                        arrayList3.add(abstractC1569);
                    } else {
                        arrayList3.add(abstractC15610);
                    }
                }
                m38266(abstractC15251, iMo13126, arrayListM38264, arrayList3);
                return;
            }
            int iMo13127 = abstractC15251.mo13126();
            ArrayList arrayListM38265 = m38264(abstractC15251, iMo13127);
            ArrayList arrayList4 = new ArrayList(arrayListM38265);
            if (m38268(arrayList4, abstractC15251.mo18926().m49702())) {
                m38266(abstractC15251, iMo13127, arrayListM38265, arrayList4);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38266(AbstractC15251 abstractC15251, int i, ArrayList arrayList, ArrayList arrayList2) {
        int iM44039 = abstractC15251.m44039();
        for (int i2 = i; i2 < iM44039; i2++) {
            AbstractC16481 abstractC16481Mo44035 = abstractC15251.mo44035(i2);
            int i3 = i2 - i;
            AbstractC1566 abstractC1566 = (AbstractC1566) arrayList.get(i3);
            AbstractC1566 abstractC1567 = (AbstractC1566) arrayList2.get(i3);
            if (abstractC1567 != null) {
                if (abstractC1567.equals(abstractC1566)) {
                    abstractC16481Mo44035.getClass();
                    if (abstractC16481Mo44035 instanceof C17227) {
                        C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                        if (c18959M40461.getType() == EnumC24203.CHECK_CAST) {
                            c18959M40461.mo17866(EnumC1763.EXPLICIT_CAST);
                        }
                    }
                } else {
                    abstractC16481Mo44035.getClass();
                    if ((abstractC16481Mo44035 instanceof C23195) && abstractC1566.m5556() && abstractC1567.m5556()) {
                        abstractC16481Mo44035.mo1130(abstractC1567);
                        abstractC16481Mo44035.mo17866(EnumC1763.EXPLICIT_PRIMITIVE_TYPE);
                    } else {
                        EnumC24203 enumC24203 = EnumC24203.CHECK_CAST;
                        int i4 = C8314.f27285;
                        if ((abstractC16481Mo44035 instanceof C17227) && ((C17227) abstractC16481Mo44035).m40461().getType() == enumC24203) {
                            ((C3319) ((C17227) abstractC16481Mo44035).m40461()).m10935(abstractC1567);
                        } else {
                            C3319 c3319 = new C3319(EnumC24203.CAST, abstractC1567, 1);
                            c3319.mo44014(abstractC16481Mo44035);
                            c3319.mo17866(EnumC1763.EXPLICIT_CAST);
                            AbstractC16481 abstractC16481M39112 = AbstractC16481.m39112(c3319);
                            abstractC16481M39112.mo1130(abstractC1567);
                            abstractC15251.mo44012(i2, abstractC16481M39112);
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private InterfaceC21197 m38265(InterfaceC21197 interfaceC21197, Map map) {
        AbstractC1566 abstractC1566M10105;
        List listMo8537 = interfaceC21197.mo8537();
        int size = listMo8537.size();
        ArrayList arrayList = new ArrayList(size);
        boolean z = false;
        for (int i = 0; i < size; i++) {
            AbstractC1566 abstractC1566 = (AbstractC1566) listMo8537.get(i);
            if (abstractC1566 == null) {
                throw new C8597("Null arg type in " + interfaceC21197 + " at: " + i + " in: " + listMo8537);
            }
            if (abstractC1566.m5567()) {
                AbstractC1566 abstractC1566M10106 = this.f52174.m5692().m10105(abstractC1566, map);
                if (abstractC1566M10106 == null || abstractC1566M10106.equals(abstractC1566)) {
                    abstractC1566M10106 = (AbstractC1566) interfaceC21197.mo8532().m49702().get(i);
                }
                arrayList.add(abstractC1566M10106);
                z = true;
            } else {
                arrayList.add(abstractC1566);
            }
        }
        AbstractC1566 abstractC1566Mo8519 = interfaceC21197.mo8519();
        if (abstractC1566Mo8519.m5567() && ((abstractC1566M10105 = this.f52174.m5692().m10105(abstractC1566Mo8519, map)) == null || abstractC1566M10105.m5567())) {
            abstractC1566Mo8519 = interfaceC21197.mo8532().m49698();
            z = true;
        }
        if (!z) {
            return interfaceC21197;
        }
        C17130 c17130 = new C17130(interfaceC21197);
        c17130.m40284(arrayList);
        c17130.m40285(abstractC1566Mo8519);
        return c17130;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38268(ArrayList arrayList, List list) {
        int size = arrayList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (!((AbstractC1566) arrayList.get(i)).mo5564()) {
                arrayList.set(i, (AbstractC1566) list.get(i));
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m38269(InterfaceC21197 interfaceC21197, ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            ArrayList arrayListM38263 = m38263(arrayList, arrayList2, new C20957(2));
            if (arrayListM38263.size() == 1) {
                return ((InterfaceC21197) arrayListM38263.get(0)).equals(interfaceC21197);
            }
            ArrayList arrayListM38264 = m38263(arrayList, arrayList2, new C3984(7));
            if (arrayListM38264.size() == 1) {
                return ((InterfaceC21197) arrayListM38264.get(0)).equals(interfaceC21197);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private ArrayList m38263(ArrayList arrayList, ArrayList arrayList2, Function function) {
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC21197 interfaceC21197 = (InterfaceC21197) it.next();
            List listMo8537 = interfaceC21197.mo8537();
            int size = listMo8537.size();
            if (size == arrayList2.size()) {
                C8706 c8706M26142 = this.f52174.m5685().m26142();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        arrayList3.add(interfaceC21197);
                        break;
                    }
                    if (!((Boolean) function.apply(c8706M26142.m23403((AbstractC1566) arrayList2.get(i), (AbstractC1566) listMo8537.get(i)))).booleanValue()) {
                        break;
                    }
                    i++;
                }
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static ArrayList m38264(AbstractC15251 abstractC15251, int i) {
        AbstractC1566 abstractC1566M10936;
        int iM44039 = abstractC15251.m44039();
        ArrayList arrayList = new ArrayList(iM44039);
        while (i < iM44039) {
            AbstractC16481 abstractC16481Mo44035 = abstractC15251.mo44035(i);
            if (abstractC16481Mo44035 instanceof C23195) {
                C23195 c23195 = (C23195) abstractC16481Mo44035;
                AbstractC1566 type = c23195.getType();
                if (c23195.m52122() == 0 && (type.mo5543() || type.m5554())) {
                    abstractC1566M10936 = AbstractC1566.f5410;
                } else if (type.m5556() && !abstractC16481Mo44035.mo17865(EnumC1763.EXPLICIT_PRIMITIVE_TYPE)) {
                    abstractC1566M10936 = AbstractC1566.f5429;
                } else {
                    abstractC1566M10936 = abstractC16481Mo44035.getType();
                }
            } else if (abstractC16481Mo44035 instanceof C6041) {
                abstractC1566M10936 = abstractC16481Mo44035.getType();
            } else if (abstractC16481Mo44035 instanceof C17227) {
                C18959 c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                int i2 = C17599.f57133[c18959M40461.getType().ordinal()];
                if (i2 == 1 || i2 == 2) {
                    abstractC1566M10936 = ((C3319) c18959M40461).m10936();
                } else if (c18959M40461.m44027() != null) {
                    abstractC1566M10936 = c18959M40461.m44027().getType();
                } else {
                    abstractC1566M10936 = abstractC16481Mo44035.getType();
                }
            } else {
                throw new C8597("Unknown var type for: " + abstractC16481Mo44035);
            }
            arrayList.add(abstractC1566M10936);
            i++;
        }
        return arrayList;
    }
}
