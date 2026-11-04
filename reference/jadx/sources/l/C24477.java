package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩺ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBGE */
/* JADX INFO: loaded from: classes.dex */
public final class C24477 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f79424 = new ArrayList();

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C24960 f79425;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f79426;

    public C24477(C24960 c24960) {
        this.f79425 = c24960;
        this.f79426 = c24960.m55737();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m54721(C20946 c20946) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f79424;
            if (i >= arrayList.size() || ((C12542) arrayList.get(i)).f40246.get(c20946.m47903())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC5568 m54722(AbstractC5568 abstractC5568) {
        return (AbstractC5568) j$$ExternalSyntheticOutline0.m(((C19738) this.f79425.m55749().get(abstractC5568.m16506().m45465().nextSetBit(0))).m45460(), 1);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private AbstractC5568 m54729(AbstractC5568 abstractC5568) {
        return (AbstractC5568) ((C19738) this.f79425.m55749().get(abstractC5568.m16506().m45467().nextSetBit(0))).m45460().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54728(C24960 c24960) {
        Iterator it;
        C24477 c24477 = new C24477(c24960);
        c24960.m55750(new C20747(c24477));
        ArrayList<C12542> arrayList = c24477.f79424;
        for (C12542 c12542 : arrayList) {
            if (c12542.f40245 != EnumC6577.NONE) {
                for (C12542 c12543 : c12542.f40242) {
                    if (c12542.f40245.compareTo(c12543.f40245) > 0) {
                        c12543.f40245 = c12542.f40245;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C12542 c12544 = (C12542) it2.next();
            if (c12544.f40244 && c12544.f40245 == EnumC6577.NONE) {
                int i = 0;
                int iNextSetBit = c12544.f40246.nextSetBit(0);
                AbstractC5568 abstractC5568M55738 = c24960.m55738(iNextSetBit);
                AbstractC5568 abstractC5568M54722 = c24477.m54722(abstractC5568M55738);
                int iMo17877 = ((AbstractC24149) abstractC5568M54722.mo4992().m31619get(0).m47898()).mo17877();
                ArrayList arrayList2 = new ArrayList(iMo17877);
                HashSet hashSet = new HashSet();
                C5085 type = abstractC5568M55738.m16508().getType();
                for (int i2 = 0; i2 < iMo17877; i2++) {
                    AbstractC24149 abstractC24149M22802 = C8485.m22802(type.m15378());
                    C20946 c20946M47883 = C20946.m47883(c24960.m55744(), abstractC24149M22802);
                    arrayList2.add(c20946M47883);
                    c24477.m54724(abstractC5568M55738, C0063.f947, c20946M47883, 5, abstractC24149M22802);
                }
                hashSet.add(abstractC5568M54722);
                hashSet.add(abstractC5568M55738);
                for (AbstractC5568 abstractC5568 : c24960.m55752(iNextSetBit)) {
                    int size = arrayList2.size();
                    int iM43509 = abstractC5568.mo4988().m43509();
                    if (iM43509 != 34) {
                        if (iM43509 == 57) {
                            ArrayList arrayListM28484 = ((C11249) abstractC5568.mo4993()).m28484();
                            int i3 = 0;
                            while (i3 < size) {
                                C20946 c20946M47884 = C20946.m47883(((C20946) arrayList2.get(i3)).m47903(), (InterfaceC22239) arrayListM28484.get(i3));
                                C0063 c0063 = C0063.f947;
                                AbstractC13487 abstractC13487 = (AbstractC13487) arrayListM28484.get(i3);
                                ArrayList arrayList3 = arrayListM28484;
                                int i4 = i3;
                                c24477.m54724(abstractC5568, c0063, c20946M47884, 5, abstractC13487);
                                arrayList2.set(i4, c20946M47884);
                                i3 = i4 + 1;
                                arrayListM28484 = arrayList3;
                                it2 = it2;
                            }
                        } else if (iM43509 == 38) {
                            AbstractC5568 abstractC5568M54729 = c24477.m54729(abstractC5568);
                            C0063 c0063Mo4992 = abstractC5568.mo4992();
                            int iMo17878 = ((AbstractC24149) c0063Mo4992.m31619get(1).m47898()).mo17877();
                            if (iMo17878 < size) {
                                C20946 c20946 = (C20946) arrayList2.get(iMo17878);
                                c24477.m54724(abstractC5568M54729, C0063.m1033(c20946), c20946.m47899(abstractC5568M54729.m16508().m47903()), 2, null);
                            } else {
                                c24477.m54725(abstractC5568M54729, c0063Mo4992.m31619get(1), hashSet);
                                hashSet.add((AbstractC5568) abstractC5568M54729.m16506().m45460().get(2));
                            }
                            hashSet.add(abstractC5568M54729);
                        } else if (iM43509 == 39) {
                            C0063 c0063Mo4993 = abstractC5568.mo4992();
                            int iMo17879 = ((AbstractC24149) c0063Mo4993.m31619get(2).m47898()).mo17877();
                            if (iMo17879 < size) {
                                C20946 c20946M31619get = c0063Mo4993.m31619get(i);
                                C20946 c20946M47899 = c20946M31619get.m47899(((C20946) arrayList2.get(iMo17879)).m47903());
                                c24477.m54724(abstractC5568, C0063.m1033(c20946M31619get), c20946M47899, 2, null);
                                arrayList2.set(iMo17879, c20946M47899.m47888());
                            } else {
                                c24477.m54725(abstractC5568, c0063Mo4993.m31619get(2), hashSet);
                            }
                        }
                        it = it2;
                    } else {
                        it = it2;
                        InterfaceC6052 interfaceC6052M47898 = abstractC5568M54722.mo4992().m31619get(0).m47898();
                        AbstractC5568 abstractC5568M547210 = c24477.m54729(abstractC5568);
                        c24477.m54724(abstractC5568M547210, C0063.f947, abstractC5568M547210.m16508(), 5, (AbstractC13487) interfaceC6052M47898);
                        hashSet.add(abstractC5568M547210);
                    }
                    hashSet.add(abstractC5568);
                    it2 = it;
                    i = 0;
                }
                Iterator it3 = it2;
                c24960.m55728(hashSet);
                c24960.m55745();
                int i5 = c24477.f79426;
                C15262.m36612(i5, c24960);
                for (int i6 = 0; i6 < c24960.m55737(); i6++) {
                    AbstractC5568 abstractC5568M55739 = c24960.m55738(i6);
                    if (abstractC5568M55739 != null && abstractC5568M55739.mo4988() != null && abstractC5568M55739.mo4988().m43509() == 2) {
                        ArrayList[] arrayListArrM55725 = c24960.m55725();
                        C20946 c20946M31619get2 = abstractC5568M55739.mo4992().m31619get(0);
                        C20946 c20946M16508 = abstractC5568M55739.m16508();
                        if (c20946M31619get2.m47903() >= i5 || c20946M16508.m47903() >= i5) {
                            C23731 c23731 = new C23731(c24477, c20946M16508, c20946M31619get2);
                            Iterator it4 = arrayListArrM55725[c20946M16508.m47903()].iterator();
                            while (it4.hasNext()) {
                                ((AbstractC5568) it4.next()).mo4995(c23731);
                            }
                        }
                    }
                }
                it2 = it3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c1  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m54727(C24477 c24477, C1356 c1356) {
        C12542 c12542;
        C20946 c20946M31619get;
        int iM54721;
        int i = c24477.f79426;
        ArrayList arrayList = c24477.f79424;
        int iM43509 = c1356.mo4988().m43509();
        C20946 c20946M16508 = c1356.m16508();
        if (iM43509 != 56 || c20946M16508.m47898().mo8408() != 9) {
            if (iM43509 == 3 && c20946M16508.m47898().mo8408() == 9) {
                C12542 c12543 = new C12542(c20946M16508.m47903(), i, EnumC6577.NONE);
                arrayList.add(c12543);
                c24477.m54726(c20946M16508, c12543);
                return;
            } else {
                if (iM43509 == 55 && c20946M16508.m47898().mo8408() == 9) {
                    C12542 c12544 = new C12542(c20946M16508.m47903(), i, EnumC6577.NONE);
                    arrayList.add(c12544);
                    c24477.m54726(c20946M16508, c12544);
                    return;
                }
                return;
            }
        }
        C20946 c20946M16509 = c1356.m16508();
        AbstractC5568 abstractC5568M54722 = c24477.m54722(c1356);
        int iM435010 = abstractC5568M54722.mo4988().m43509();
        if (iM435010 == 5) {
            c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.NONE);
            arrayList.add(c12542);
        } else if (iM435010 == 38 || iM435010 == 45) {
            c20946M31619get = abstractC5568M54722.mo4992().m31619get(0);
            iM54721 = c24477.m54721(c20946M31619get);
            if (iM54721 != arrayList.size()) {
                c12542 = (C12542) arrayList.get(iM54721);
                c12542.f40246.set(c20946M16509.m47903());
            } else {
                if (c20946M31619get.getType() == C5085.f17762) {
                    c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.NONE);
                } else {
                    c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.GLOBAL);
                }
                arrayList.add(c12542);
            }
        } else {
            if (iM435010 != 46) {
                switch (iM435010) {
                    case 40:
                        c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.NONE);
                        break;
                    case 41:
                    case 42:
                        if (abstractC5568M54722.mo4992().m31619get(0).m47898().mo8409()) {
                            c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.NONE);
                            c12542.f40244 = true;
                        } else {
                            c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.GLOBAL);
                        }
                        break;
                    case 43:
                        c20946M31619get = abstractC5568M54722.mo4992().m31619get(0);
                        iM54721 = c24477.m54721(c20946M31619get);
                        if (iM54721 != arrayList.size()) {
                            c12542 = (C12542) arrayList.get(iM54721);
                            c12542.f40246.set(c20946M16509.m47903());
                        } else if (c20946M31619get.getType() == C5085.f17762) {
                            c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.NONE);
                        } else {
                            c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.GLOBAL);
                        }
                        break;
                    default:
                        c12542 = null;
                        break;
                }
            } else {
                c12542 = new C12542(c20946M16509.m47903(), i, EnumC6577.GLOBAL);
            }
            arrayList.add(c12542);
        }
        c24477.m54726(c20946M16508, c12542);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54726(C20946 c20946, C12542 c12542) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c20946);
        while (!arrayList.isEmpty()) {
            C20946 c20947 = (C20946) C18011.m41990(arrayList, 1);
            for (AbstractC5568 abstractC5568 : this.f79425.m55752(c20947.m47903())) {
                C18708 c18708Mo4988 = abstractC5568.mo4988();
                ArrayList arrayList2 = this.f79424;
                if (c18708Mo4988 == null) {
                    int iM54721 = m54721(abstractC5568.m16508());
                    if (iM54721 != arrayList2.size()) {
                        C12542 c12543 = (C12542) arrayList2.get(iM54721);
                        if (c12543 != c12542) {
                            c12542.f40244 = false;
                            c12542.f40246.or(c12543.f40246);
                            if (c12542.f40245.compareTo(c12543.f40245) < 0) {
                                c12542.f40245 = c12543.f40245;
                            }
                            for (C12542 c12544 : c12543.f40243) {
                                c12544.f40242.remove(c12543);
                                c12544.f40242.add(c12542);
                                c12542.f40243.add(c12544);
                            }
                            for (C12542 c12545 : c12543.f40242) {
                                c12545.f40243.remove(c12543);
                                c12545.f40243.add(c12542);
                                c12542.f40242.add(c12545);
                            }
                            arrayList2.remove(iM54721);
                        }
                    } else {
                        c12542.f40246.set(abstractC5568.m16508().m47903());
                        arrayList.add(abstractC5568.m16508());
                    }
                } else {
                    int iM43509 = abstractC5568.mo4988().m43509();
                    if (iM43509 != 2) {
                        if (iM43509 != 33 && iM43509 != 35) {
                            if (iM43509 == 43 || iM43509 == 7 || iM43509 == 8) {
                                EnumC6577 enumC6577 = c12542.f40245;
                                EnumC6577 enumC6578 = EnumC6577.METHOD;
                                if (enumC6577.compareTo(enumC6578) < 0) {
                                    c12542.f40245 = enumC6578;
                                }
                            } else if (iM43509 != 38) {
                                if (iM43509 != 39) {
                                    switch (iM43509) {
                                        case 47:
                                            break;
                                        case 48:
                                            c12542.f40245 = EnumC6577.GLOBAL;
                                            break;
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                    }
                                } else if (!abstractC5568.mo4992().m31619get(2).m47898().mo8409()) {
                                    c12542.f40244 = false;
                                }
                                if (abstractC5568.mo4992().m31619get(0).m47898().mo8408() == 9) {
                                    c12542.f40244 = false;
                                    ArrayList arrayList3 = c12542.f40242;
                                    ArrayList arrayList4 = c12542.f40243;
                                    C0063 c0063Mo4992 = abstractC5568.mo4992();
                                    if (c0063Mo4992.m31619get(0).m47903() == c20947.m47903()) {
                                        int iM54722 = m54721(c0063Mo4992.m31619get(1));
                                        if (iM54722 != arrayList2.size()) {
                                            C12542 c12546 = (C12542) arrayList2.get(iM54722);
                                            if (!arrayList4.contains(c12546)) {
                                                arrayList4.add(c12546);
                                            }
                                            if (!c12546.f40242.contains(c12542)) {
                                                c12546.f40242.add(c12542);
                                            }
                                            if (c12542.f40245.compareTo(c12546.f40245) < 0) {
                                                c12542.f40245 = c12546.f40245;
                                            }
                                        }
                                    } else {
                                        int iM54723 = m54721(c0063Mo4992.m31619get(0));
                                        if (iM54723 != arrayList2.size()) {
                                            C12542 c12547 = (C12542) arrayList2.get(iM54723);
                                            if (!c12547.f40243.contains(c12542)) {
                                                c12547.f40243.add(c12542);
                                            }
                                            if (!arrayList3.contains(c12547)) {
                                                arrayList3.add(c12547);
                                            }
                                            if (c12547.f40245.compareTo(c12542.f40245) < 0) {
                                                c12547.f40245 = c12542.f40245;
                                            }
                                        }
                                    }
                                }
                            } else if (!abstractC5568.mo4992().m31619get(1).m47898().mo8409()) {
                                c12542.f40244 = false;
                            }
                        }
                        c12542.f40245 = EnumC6577.INTER;
                    } else {
                        c12542.f40246.set(abstractC5568.m16508().m47903());
                        arrayList.add(abstractC5568.m16508());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54725(AbstractC5568 abstractC5568, C20946 c20946, HashSet hashSet) {
        C1028 c1028 = new C1028(C1555.f5360);
        C0063 c0063 = C0063.f947;
        m54723(abstractC5568, c0063, 40, c1028);
        C19738 c19738M16506 = abstractC5568.m16506();
        C19738 c19738M45461 = c19738M16506.m45461(c19738M16506.m45459());
        AbstractC5568 abstractC5569 = (AbstractC5568) c19738M45461.m45460().get(0);
        C24960 c24960 = this.f79425;
        C20946 c20946M47883 = C20946.m47883(c24960.m55744(), c1028);
        m54724(abstractC5569, c0063, c20946M47883, 56, null);
        C19738 c19738M45462 = c19738M45461.m45461(c19738M45461.m45459());
        AbstractC5568 abstractC55610 = (AbstractC5568) c19738M45462.m45460().get(0);
        m54723(abstractC55610, C0063.m1031(c20946M47883, c20946), 52, new C18181(c1028, new C0282(new C9976("<init>"), new C9976("(I)V"))));
        hashSet.add(abstractC55610);
        C19738 c19738M45463 = c19738M45462.m45461(c19738M45462.m45459());
        AbstractC5568 abstractC55611 = (AbstractC5568) c19738M45463.m45460().get(0);
        m54723(abstractC55611, C0063.m1033(c20946M47883), 35, null);
        c19738M45463.m45452(c19738M45463.m45448(), c24960.m55746().m45472());
        hashSet.add(abstractC55611);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54724(AbstractC5568 abstractC5568, C0063 c0063, C20946 c20946, int i, AbstractC13487 abstractC13487) {
        C18708 c18708M3250;
        AbstractC17216 c6030;
        AbstractC17216 abstractC17216Mo4993 = abstractC5568.mo4993();
        if (i == 56) {
            c18708M3250 = C0809.m3259(c20946.getType());
        } else {
            c18708M3250 = C0809.m3250(i, c20946, c0063, abstractC13487);
        }
        C18708 c18708 = c18708M3250;
        if (abstractC13487 == null) {
            c6030 = new C23930(c18708, abstractC17216Mo4993.m40433(), c20946, c0063);
        } else {
            c6030 = new C6030(c18708, abstractC17216Mo4993.m40433(), c20946, c0063, abstractC13487);
        }
        C1356 c1356 = new C1356(c6030, abstractC5568.m16506());
        ArrayList arrayListM45460 = abstractC5568.m16506().m45460();
        arrayListM45460.add(arrayListM45460.lastIndexOf(abstractC5568), c1356);
        C24960 c24960 = this.f79425;
        c24960.m55729(c1356, (C0063) null);
        c24960.m55731(c1356, (C20946) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m54723(AbstractC5568 abstractC5568, C0063 c0063, int i, AbstractC2519 abstractC2519) {
        AbstractC17216 c8267;
        AbstractC17216 abstractC17216Mo4993 = abstractC5568.mo4993();
        C18708 c18708M3250 = C0809.m3250(i, null, c0063, abstractC2519);
        if (abstractC2519 == null) {
            c8267 = new C6776(c18708M3250, abstractC17216Mo4993.m40433(), c0063, C13705.f43487);
        } else {
            c8267 = new C8267(c18708M3250, abstractC17216Mo4993.m40433(), c0063, C13705.f43487, abstractC2519);
        }
        C1356 c1356 = new C1356(c8267, abstractC5568.m16506());
        ArrayList arrayListM45460 = abstractC5568.m16506().m45460();
        arrayListM45460.add(arrayListM45460.lastIndexOf(abstractC5568), c1356);
        C24960 c24960 = this.f79425;
        c24960.m55729(c1356, (C0063) null);
        c24960.m55731(c1356, (C20946) null);
    }
}
