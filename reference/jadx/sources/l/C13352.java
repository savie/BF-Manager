package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: X156 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13352 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32850(EnumC7313 enumC7313, EnumC7313 enumC7314, EnumC7313 enumC7315, EnumC7313 enumC7316) {
        EnumC7313 enumC7317;
        EnumC7313 enumC7318;
        EnumC7313 enumC7319 = EnumC7313.FIXED;
        return (enumC7315 == enumC7319 || enumC7315 == (enumC7318 = EnumC7313.WRAP_CONTENT) || (enumC7315 == EnumC7313.MATCH_PARENT && enumC7313 != enumC7318)) || (enumC7316 == enumC7319 || enumC7316 == (enumC7317 = EnumC7313.WRAP_CONTENT) || (enumC7316 == EnumC7313.MATCH_PARENT && enumC7314 != enumC7317));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0356  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m32851(C15781 c15781, InterfaceC9431 interfaceC9431) {
        C19702 c19702;
        int iM44824;
        int iM44825;
        C19702 c19703;
        C19702 c19704;
        ArrayList arrayList = c15781.f76249;
        int size = arrayList.size();
        char c = 0;
        for (int i = 0; i < size; i++) {
            C20719 c20719 = (C20719) arrayList.get(i);
            EnumC7313[] enumC7313Arr = c15781.f67434;
            EnumC7313 enumC7313 = enumC7313Arr[0];
            EnumC7313 enumC7314 = enumC7313Arr[1];
            EnumC7313[] enumC7313Arr2 = c20719.f67434;
            if (!m32850(enumC7313, enumC7314, enumC7313Arr2[0], enumC7313Arr2[1]) || (c20719 instanceof C0257)) {
                return false;
            }
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        ArrayList<C17191> arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList<C17191> arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (i2 < size) {
            C20719 c207110 = (C20719) arrayList.get(i2);
            EnumC7313[] enumC7313Arr3 = c15781.f67434;
            EnumC7313 enumC7315 = enumC7313Arr3[c];
            EnumC7313 enumC7316 = enumC7313Arr3[1];
            EnumC7313[] enumC7313Arr4 = c207110.f67434;
            if (!m32850(enumC7315, enumC7316, enumC7313Arr4[0], enumC7313Arr4[1])) {
                C15781.m37521(c207110, interfaceC9431, c15781.f51105);
            }
            boolean z = c207110 instanceof C12253;
            if (z) {
                C12253 c12253 = (C12253) c207110;
                if (c12253.m30459() == 0) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c12253);
                }
                if (c12253.m30459() == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c12253);
                }
            }
            if (c207110 instanceof C17191) {
                if (c207110 instanceof C21424) {
                    C21424 c21424 = (C21424) c207110;
                    if (c21424.m47999() == 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c21424);
                    }
                    if (c21424.m47999() == 1) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c21424);
                    }
                } else {
                    C17191 c17191 = (C17191) c207110;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c17191);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(c17191);
                }
            }
            if (c207110.f67385.f29981 == null && c207110.f67421.f29981 == null && !z && !(c207110 instanceof C21424)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c207110);
            }
            if (c207110.f67392.f29981 == null && c207110.f67387.f29981 == null && c207110.f67404.f29981 == null && !z && !(c207110 instanceof C21424)) {
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                arrayList7.add(c207110);
            }
            i2++;
            c = 0;
        }
        ArrayList<C19702> arrayList8 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m32849((C12253) it.next(), 0, arrayList8, (C19702) null);
            }
        }
        C19702 c19705 = null;
        int i3 = 0;
        if (arrayList3 != null) {
            for (C17191 c17192 : arrayList3) {
                C19702 c19702M32849 = m32849(c17192, i3, arrayList8, c19705);
                c17192.m40112(i3, c19702M32849, arrayList8);
                c19702M32849.m44826(arrayList8);
                c19705 = null;
                i3 = 0;
            }
        }
        C8725 c8725Mo30461 = c15781.mo30461(EnumC19308.LEFT);
        if (c8725Mo30461.m22569() != null) {
            Iterator it2 = c8725Mo30461.m22569().iterator();
            while (it2.hasNext()) {
                m32849(((C8725) it2.next()).f29983, 0, arrayList8, (C19702) null);
            }
        }
        C8725 c8725Mo30462 = c15781.mo30461(EnumC19308.RIGHT);
        if (c8725Mo30462.m22569() != null) {
            Iterator it3 = c8725Mo30462.m22569().iterator();
            while (it3.hasNext()) {
                m32849(((C8725) it3.next()).f29983, 0, arrayList8, (C19702) null);
            }
        }
        C8725 c8725Mo30463 = c15781.mo30461(EnumC19308.CENTER);
        if (c8725Mo30463.m22569() != null) {
            Iterator it4 = c8725Mo30463.m22569().iterator();
            while (it4.hasNext()) {
                m32849(((C8725) it4.next()).f29983, 0, arrayList8, (C19702) null);
            }
        }
        C19702 c19706 = null;
        if (arrayList6 != null) {
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                m32849((C20719) it5.next(), 0, arrayList8, (C19702) null);
            }
        }
        if (arrayList4 != null) {
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                m32849((C12253) it6.next(), 1, arrayList8, (C19702) null);
            }
        }
        if (arrayList5 != null) {
            for (C17191 c17193 : arrayList5) {
                C19702 c19702M328410 = m32849(c17193, 1, arrayList8, c19706);
                c17193.m40112(1, c19702M328410, arrayList8);
                c19702M328410.m44826(arrayList8);
                c19706 = null;
            }
        }
        C8725 c8725Mo30464 = c15781.mo30461(EnumC19308.TOP);
        if (c8725Mo30464.m22569() != null) {
            Iterator it7 = c8725Mo30464.m22569().iterator();
            while (it7.hasNext()) {
                m32849(((C8725) it7.next()).f29983, 1, arrayList8, (C19702) null);
            }
        }
        C8725 c8725Mo30465 = c15781.mo30461(EnumC19308.BASELINE);
        if (c8725Mo30465.m22569() != null) {
            Iterator it8 = c8725Mo30465.m22569().iterator();
            while (it8.hasNext()) {
                m32849(((C8725) it8.next()).f29983, 1, arrayList8, (C19702) null);
            }
        }
        C8725 c8725Mo30466 = c15781.mo30461(EnumC19308.BOTTOM);
        if (c8725Mo30466.m22569() != null) {
            Iterator it9 = c8725Mo30466.m22569().iterator();
            while (it9.hasNext()) {
                m32849(((C8725) it9.next()).f29983, 1, arrayList8, (C19702) null);
            }
        }
        C8725 c8725Mo30467 = c15781.mo30461(EnumC19308.CENTER);
        if (c8725Mo30467.m22569() != null) {
            Iterator it10 = c8725Mo30467.m22569().iterator();
            while (it10.hasNext()) {
                m32849(((C8725) it10.next()).f29983, 1, arrayList8, (C19702) null);
            }
        }
        C19702 c19707 = null;
        if (arrayList7 != null) {
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                m32849((C20719) it11.next(), 1, arrayList8, (C19702) null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C20719 c207111 = (C20719) arrayList.get(i4);
            EnumC7313[] enumC7313Arr5 = c207111.f67434;
            EnumC7313 enumC7317 = enumC7313Arr5[0];
            EnumC7313 enumC7318 = EnumC7313.MATCH_CONSTRAINT;
            if (enumC7317 == enumC7318 && enumC7313Arr5[1] == enumC7318) {
                int i5 = c207111.f67400;
                int size2 = arrayList8.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        c19703 = null;
                        break;
                    }
                    c19703 = (C19702) arrayList8.get(i6);
                    if (i5 == c19703.f63255) {
                        break;
                    }
                    i6++;
                }
                int i7 = c207111.f67435;
                int size3 = arrayList8.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        c19704 = null;
                        break;
                    }
                    c19704 = (C19702) arrayList8.get(i8);
                    if (i7 == c19704.f63255) {
                        break;
                    }
                    i8++;
                }
                if (c19703 != null && c19704 != null) {
                    c19703.m44825(0, c19704);
                    c19704.f63257 = 2;
                    arrayList8.remove(c19703);
                }
            }
        }
        if (arrayList8.size() <= 1) {
            return false;
        }
        if (c15781.f67434[0] == EnumC7313.WRAP_CONTENT) {
            int i9 = 0;
            c19702 = null;
            for (C19702 c19708 : arrayList8) {
                if (c19708.f63257 != 1 && (iM44825 = c19708.m44824(c15781.m37530(), 0)) > i9) {
                    c19702 = c19708;
                    i9 = iM44825;
                }
            }
            if (c19702 != null) {
                c15781.m46591(EnumC7313.FIXED);
                c15781.m46608(i9);
            } else {
                c19702 = null;
            }
        } else {
            c19702 = null;
        }
        if (c15781.f67434[1] == EnumC7313.WRAP_CONTENT) {
            int i10 = 0;
            C19702 c19709 = null;
            for (C19702 c197010 : arrayList8) {
                if (c197010.f63257 != 0 && (iM44824 = c197010.m44824(c15781.m37530(), 1)) > i10) {
                    c19709 = c197010;
                    i10 = iM44824;
                }
            }
            if (c19709 != null) {
                c15781.m46626(EnumC7313.FIXED);
                c15781.m46620(i10);
                c19707 = c19709;
            }
        }
        return (c19702 == null && c19707 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19702 m32849(C20719 c20719, int i, ArrayList arrayList, C19702 c19702) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = c20719.f67400;
        } else {
            i2 = c20719.f67435;
        }
        if (i2 != -1 && (c19702 == null || i2 != c19702.f63255)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C19702 c19703 = (C19702) arrayList.get(i4);
                if (c19703.f63255 == i2) {
                    if (c19702 != null) {
                        c19702.m44825(i, c19703);
                        arrayList.remove(c19702);
                    }
                    c19702 = c19703;
                    break;
                }
            }
        } else if (i2 != -1) {
            return c19702;
        }
        if (c19702 == null) {
            if (c20719 instanceof C17191) {
                C17191 c17191 = (C17191) c20719;
                int i5 = 0;
                while (true) {
                    if (i5 >= c17191.f54816) {
                        i3 = -1;
                        break;
                    }
                    C20719 c207110 = c17191.f54815[i5];
                    if ((i == 0 && (i3 = c207110.f67400) != -1) || (i == 1 && (i3 = c207110.f67435) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i3 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C19702 c19704 = (C19702) arrayList.get(i6);
                        if (c19704.f63255 == i3) {
                            c19702 = c19704;
                            break;
                        }
                    }
                }
            }
            if (c19702 == null) {
                c19702 = new C19702(i);
            }
            arrayList.add(c19702);
        }
        int i7 = c19702.f63255;
        if (c19702.m44827(c20719)) {
            if (c20719 instanceof C12253) {
                C12253 c12253 = (C12253) c20719;
                c12253.m30472().m22571(c12253.m30459() == 0 ? 1 : 0, c19702, arrayList);
            }
            if (i == 0) {
                c20719.f67400 = i7;
                c20719.f67385.m22571(i, c19702, arrayList);
                c20719.f67421.m22571(i, c19702, arrayList);
            } else {
                c20719.f67435 = i7;
                c20719.f67392.m22571(i, c19702, arrayList);
                c20719.f67404.m22571(i, c19702, arrayList);
                c20719.f67387.m22571(i, c19702, arrayList);
            }
            c20719.f67432.m22571(i, c19702, arrayList);
        }
        return c19702;
    }
}
