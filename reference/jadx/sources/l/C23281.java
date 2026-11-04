package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: X156 */
/* JADX INFO: loaded from: classes.dex */
public final class C23281 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52400(EnumC19396 enumC19396, EnumC19396 enumC19397, EnumC19396 enumC19398, EnumC19396 enumC19399) {
        EnumC19396 enumC193910;
        EnumC19396 enumC193911;
        EnumC19396 enumC193912 = EnumC19396.FIXED;
        return (enumC19398 == enumC193912 || enumC19398 == (enumC193911 = EnumC19396.WRAP_CONTENT) || (enumC19398 == EnumC19396.MATCH_PARENT && enumC19396 != enumC193911)) || (enumC19399 == enumC193912 || enumC19399 == (enumC193910 = EnumC19396.WRAP_CONTENT) || (enumC19399 == EnumC19396.MATCH_PARENT && enumC19397 != enumC193910));
    }

    /* JADX WARN: Code duplicated, block: B:190:0x0356  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m52399(C1497 c1497, InterfaceC15075 interfaceC15075) {
        C18059 c18059;
        int iM42077;
        int iM42078;
        C18059 c180510;
        C18059 c180511;
        ArrayList arrayList = c1497.f33652;
        int size = arrayList.size();
        char c = 0;
        for (int i = 0; i < size; i++) {
            C10445 c10445 = (C10445) arrayList.get(i);
            EnumC19396[] enumC19396Arr = c1497.f33210;
            EnumC19396 enumC19396 = enumC19396Arr[0];
            EnumC19396 enumC19397 = enumC19396Arr[1];
            EnumC19396[] enumC19396Arr2 = c10445.f33210;
            if (!m52400(enumC19396, enumC19397, enumC19396Arr2[0], enumC19396Arr2[1]) || (c10445 instanceof C2988)) {
                return false;
            }
        }
        int i2 = 0;
        ArrayList arrayList2 = null;
        ArrayList<C14174> arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList<C14174> arrayList5 = null;
        ArrayList arrayList6 = null;
        ArrayList arrayList7 = null;
        while (i2 < size) {
            C10445 c10446 = (C10445) arrayList.get(i2);
            EnumC19396[] enumC19396Arr3 = c1497.f33210;
            EnumC19396 enumC19398 = enumC19396Arr3[c];
            EnumC19396 enumC19399 = enumC19396Arr3[1];
            EnumC19396[] enumC19396Arr4 = c10446.f33210;
            if (!m52400(enumC19398, enumC19399, enumC19396Arr4[0], enumC19396Arr4[1])) {
                C1497.m5330(c10446, interfaceC15075, c1497.f5214);
            }
            boolean z = c10446 instanceof C7463;
            if (z) {
                C7463 c7463 = (C7463) c10446;
                if (c7463.m20502() == 0) {
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(c7463);
                }
                if (c7463.m20502() == 1) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(c7463);
                }
            }
            if (c10446 instanceof C14174) {
                if (c10446 instanceof C24618) {
                    C24618 c24618 = (C24618) c10446;
                    if (c24618.m54950() == 0) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c24618);
                    }
                    if (c24618.m54950() == 1) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c24618);
                    }
                } else {
                    C14174 c14174 = (C14174) c10446;
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c14174);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                    }
                    arrayList5.add(c14174);
                }
            }
            if (c10446.f33212.f2744 == null && c10446.f33248.f2744 == null && !z && !(c10446 instanceof C24618)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(c10446);
            }
            if (c10446.f33197.f2744 == null && c10446.f33216.f2744 == null && c10446.f33202.f2744 == null && !z && !(c10446 instanceof C24618)) {
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                }
                arrayList7.add(c10446);
            }
            i2++;
            c = 0;
        }
        ArrayList<C18059> arrayList8 = new ArrayList();
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                m52398((C7463) it.next(), 0, arrayList8, (C18059) null);
            }
        }
        C18059 c180512 = null;
        int i3 = 0;
        if (arrayList3 != null) {
            for (C14174 c14175 : arrayList3) {
                C18059 c18059M52398 = m52398(c14175, i3, arrayList8, c180512);
                c14175.m34461(i3, c18059M52398, arrayList8);
                c18059M52398.m42079(arrayList8);
                c180512 = null;
                i3 = 0;
            }
        }
        C0751 c0751Mo20495 = c1497.mo20495(EnumC18650.LEFT);
        if (c0751Mo20495.m3101() != null) {
            Iterator it2 = c0751Mo20495.m3101().iterator();
            while (it2.hasNext()) {
                m52398(((C0751) it2.next()).f2747, 0, arrayList8, (C18059) null);
            }
        }
        C0751 c0751Mo20496 = c1497.mo20495(EnumC18650.RIGHT);
        if (c0751Mo20496.m3101() != null) {
            Iterator it3 = c0751Mo20496.m3101().iterator();
            while (it3.hasNext()) {
                m52398(((C0751) it3.next()).f2747, 0, arrayList8, (C18059) null);
            }
        }
        C0751 c0751Mo20497 = c1497.mo20495(EnumC18650.CENTER);
        if (c0751Mo20497.m3101() != null) {
            Iterator it4 = c0751Mo20497.m3101().iterator();
            while (it4.hasNext()) {
                m52398(((C0751) it4.next()).f2747, 0, arrayList8, (C18059) null);
            }
        }
        C18059 c180513 = null;
        if (arrayList6 != null) {
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                m52398((C10445) it5.next(), 0, arrayList8, (C18059) null);
            }
        }
        if (arrayList4 != null) {
            Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                m52398((C7463) it6.next(), 1, arrayList8, (C18059) null);
            }
        }
        if (arrayList5 != null) {
            for (C14174 c14176 : arrayList5) {
                C18059 c18059M52399 = m52398(c14176, 1, arrayList8, c180513);
                c14176.m34461(1, c18059M52399, arrayList8);
                c18059M52399.m42079(arrayList8);
                c180513 = null;
            }
        }
        C0751 c0751Mo20498 = c1497.mo20495(EnumC18650.TOP);
        if (c0751Mo20498.m3101() != null) {
            Iterator it7 = c0751Mo20498.m3101().iterator();
            while (it7.hasNext()) {
                m52398(((C0751) it7.next()).f2747, 1, arrayList8, (C18059) null);
            }
        }
        C0751 c0751Mo20499 = c1497.mo20495(EnumC18650.BASELINE);
        if (c0751Mo20499.m3101() != null) {
            Iterator it8 = c0751Mo20499.m3101().iterator();
            while (it8.hasNext()) {
                m52398(((C0751) it8.next()).f2747, 1, arrayList8, (C18059) null);
            }
        }
        C0751 c0751Mo204910 = c1497.mo20495(EnumC18650.BOTTOM);
        if (c0751Mo204910.m3101() != null) {
            Iterator it9 = c0751Mo204910.m3101().iterator();
            while (it9.hasNext()) {
                m52398(((C0751) it9.next()).f2747, 1, arrayList8, (C18059) null);
            }
        }
        C0751 c0751Mo204911 = c1497.mo20495(EnumC18650.CENTER);
        if (c0751Mo204911.m3101() != null) {
            Iterator it10 = c0751Mo204911.m3101().iterator();
            while (it10.hasNext()) {
                m52398(((C0751) it10.next()).f2747, 1, arrayList8, (C18059) null);
            }
        }
        C18059 c180514 = null;
        if (arrayList7 != null) {
            Iterator it11 = arrayList7.iterator();
            while (it11.hasNext()) {
                m52398((C10445) it11.next(), 1, arrayList8, (C18059) null);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C10445 c10447 = (C10445) arrayList.get(i4);
            EnumC19396[] enumC19396Arr5 = c10447.f33210;
            EnumC19396 enumC193910 = enumC19396Arr5[0];
            EnumC19396 enumC193911 = EnumC19396.MATCH_CONSTRAINT;
            if (enumC193910 == enumC193911 && enumC19396Arr5[1] == enumC193911) {
                int i5 = c10447.f33214;
                int size2 = arrayList8.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size2) {
                        c180510 = null;
                        break;
                    }
                    c180510 = (C18059) arrayList8.get(i6);
                    if (i5 == c180510.f59124) {
                        break;
                    }
                    i6++;
                }
                int i7 = c10447.f33211;
                int size3 = arrayList8.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size3) {
                        c180511 = null;
                        break;
                    }
                    c180511 = (C18059) arrayList8.get(i8);
                    if (i7 == c180511.f59124) {
                        break;
                    }
                    i8++;
                }
                if (c180510 != null && c180511 != null) {
                    c180510.m42078(0, c180511);
                    c180511.f59125 = 2;
                    arrayList8.remove(c180510);
                }
            }
        }
        if (arrayList8.size() <= 1) {
            return false;
        }
        if (c1497.f33210[0] == EnumC19396.WRAP_CONTENT) {
            int i9 = 0;
            c18059 = null;
            for (C18059 c180515 : arrayList8) {
                if (c180515.f59125 != 1 && (iM42078 = c180515.m42077(c1497.m5341(), 0)) > i9) {
                    c18059 = c180515;
                    i9 = iM42078;
                }
            }
            if (c18059 != null) {
                c1497.m26820(EnumC19396.FIXED);
                c1497.m26805(i9);
            } else {
                c18059 = null;
            }
        } else {
            c18059 = null;
        }
        if (c1497.f33210[1] == EnumC19396.WRAP_CONTENT) {
            int i10 = 0;
            C18059 c180516 = null;
            for (C18059 c180517 : arrayList8) {
                if (c180517.f59125 != 0 && (iM42077 = c180517.m42077(c1497.m5341(), 1)) > i10) {
                    c180516 = c180517;
                    i10 = iM42077;
                }
            }
            if (c180516 != null) {
                c1497.m26862(EnumC19396.FIXED);
                c1497.m26824(i10);
                c180514 = c180516;
            }
        }
        return (c18059 == null && c180514 == null) ? false : true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C18059 m52398(C10445 c10445, int i, ArrayList arrayList, C18059 c18059) {
        int i2;
        int i3;
        if (i == 0) {
            i2 = c10445.f33214;
        } else {
            i2 = c10445.f33211;
        }
        if (i2 != -1 && (c18059 == null || i2 != c18059.f59124)) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                C18059 c180510 = (C18059) arrayList.get(i4);
                if (c180510.f59124 == i2) {
                    if (c18059 != null) {
                        c18059.m42078(i, c180510);
                        arrayList.remove(c18059);
                    }
                    c18059 = c180510;
                    break;
                }
            }
        } else if (i2 != -1) {
            return c18059;
        }
        if (c18059 == null) {
            if (c10445 instanceof C14174) {
                C14174 c14174 = (C14174) c10445;
                int i5 = 0;
                while (true) {
                    if (i5 >= c14174.f44822) {
                        i3 = -1;
                        break;
                    }
                    C10445 c10446 = c14174.f44823[i5];
                    if ((i == 0 && (i3 = c10446.f33214) != -1) || (i == 1 && (i3 = c10446.f33211) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i3 != -1) {
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        C18059 c180511 = (C18059) arrayList.get(i6);
                        if (c180511.f59124 == i3) {
                            c18059 = c180511;
                            break;
                        }
                    }
                }
            }
            if (c18059 == null) {
                c18059 = new C18059(i);
            }
            arrayList.add(c18059);
        }
        int i7 = c18059.f59124;
        if (c18059.m42080(c10445)) {
            if (c10445 instanceof C7463) {
                C7463 c7463 = (C7463) c10445;
                c7463.m20504().m3103(c7463.m20502() == 0 ? 1 : 0, c18059, arrayList);
            }
            if (i == 0) {
                c10445.f33214 = i7;
                c10445.f33212.m3103(i, c18059, arrayList);
                c10445.f33248.m3103(i, c18059, arrayList);
            } else {
                c10445.f33211 = i7;
                c10445.f33197.m3103(i, c18059, arrayList);
                c10445.f33202.m3103(i, c18059, arrayList);
                c10445.f33216.m3103(i, c18059, arrayList);
            }
            c10445.f33251.m3103(i, c18059, arrayList);
        }
        return c18059;
    }
}
