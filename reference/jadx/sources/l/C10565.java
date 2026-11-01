package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ۤ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: HBGE */
/* JADX INFO: loaded from: classes3.dex */
public final class C10565 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f36165 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C4108 f36166;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f36167;

    public C10565(C4108 c4108) {
        this.f36166 = c4108;
        this.f36167 = c4108.m11685();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m26715(C16251 c16251) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f36165;
            if (i >= arrayList.size() || ((C19737) arrayList.get(i)).f63424.get(c16251.m38400())) {
                break;
            }
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private AbstractC22454 m26716(AbstractC22454 abstractC22454) {
        return (AbstractC22454) C19084.m43861(((C11871) this.f36166.m11687().get(abstractC22454.m49949().m29596().nextSetBit(0))).m29613(), 1);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private AbstractC22454 m26723(AbstractC22454 abstractC22454) {
        return (AbstractC22454) ((C11871) this.f36166.m11687().get(abstractC22454.m49949().m29622().nextSetBit(0))).m29613().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26717(C4108 c4108) {
        Iterator it;
        C10565 c10565 = new C10565(c4108);
        c4108.m11688(new C8448(c10565));
        ArrayList<C19737> arrayList = c10565.f36165;
        for (C19737 c19737 : arrayList) {
            if (c19737.f63428 != EnumC9154.NONE) {
                for (C19737 c19738 : c19737.f63425) {
                    if (c19737.f63428.compareTo(c19738.f63428) > 0) {
                        c19738.f63428 = c19737.f63428;
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C19737 c19739 = (C19737) it2.next();
            if (c19739.f63426 && c19739.f63428 == EnumC9154.NONE) {
                int i = 0;
                int iNextSetBit = c19739.f63424.nextSetBit(0);
                AbstractC22454 abstractC22454M11684 = c4108.m11684(iNextSetBit);
                AbstractC22454 abstractC22454M26716 = c10565.m26716(abstractC22454M11684);
                int iMo21658 = ((AbstractC10377) abstractC22454M26716.mo17429().m15275get(0).m38401()).mo21658();
                ArrayList arrayList2 = new ArrayList(iMo21658);
                HashSet hashSet = new HashSet();
                C3320 type = abstractC22454M11684.m49955().getType();
                for (int i2 = 0; i2 < iMo21658; i2++) {
                    AbstractC10377 abstractC10377M35085 = C14611.m35085(type.m9843());
                    C16251 c16251M38381 = C16251.m38381(c4108.m11689(), abstractC10377M35085);
                    arrayList2.add(c16251M38381);
                    c10565.m26721(abstractC22454M11684, C0727.f3015, c16251M38381, 5, abstractC10377M35085);
                }
                hashSet.add(abstractC22454M26716);
                hashSet.add(abstractC22454M11684);
                for (AbstractC22454 abstractC22454 : c4108.m11667(iNextSetBit)) {
                    int size = arrayList2.size();
                    int iM31572 = abstractC22454.mo17426().m31572();
                    if (iM31572 != 34) {
                        if (iM31572 == 57) {
                            ArrayList arrayListM12018 = ((C4255) abstractC22454.mo17428()).m12018();
                            int i3 = 0;
                            while (i3 < size) {
                                C16251 c16251M38382 = C16251.m38381(((C16251) arrayList2.get(i3)).m38400(), (InterfaceC4919) arrayListM12018.get(i3));
                                C0727 c0727 = C0727.f3015;
                                AbstractC9901 abstractC9901 = (AbstractC9901) arrayListM12018.get(i3);
                                ArrayList arrayList3 = arrayListM12018;
                                int i4 = i3;
                                c10565.m26721(abstractC22454, c0727, c16251M38382, 5, abstractC9901);
                                arrayList2.set(i4, c16251M38382);
                                i3 = i4 + 1;
                                arrayListM12018 = arrayList3;
                                it2 = it2;
                            }
                        } else if (iM31572 == 38) {
                            AbstractC22454 abstractC22454M26723 = c10565.m26723(abstractC22454);
                            C0727 c0727Mo17429 = abstractC22454.mo17429();
                            int iMo21659 = ((AbstractC10377) c0727Mo17429.m15275get(1).m38401()).mo21658();
                            if (iMo21659 < size) {
                                C16251 c16251 = (C16251) arrayList2.get(iMo21659);
                                c10565.m26721(abstractC22454M26723, C0727.m3151(c16251), c16251.m38397(abstractC22454M26723.m49955().m38400()), 2, null);
                            } else {
                                c10565.m26722(abstractC22454M26723, c0727Mo17429.m15275get(1), hashSet);
                                hashSet.add((AbstractC22454) abstractC22454M26723.m49949().m29613().get(2));
                            }
                            hashSet.add(abstractC22454M26723);
                        } else if (iM31572 == 39) {
                            C0727 c0727Mo174210 = abstractC22454.mo17429();
                            int iMo216510 = ((AbstractC10377) c0727Mo174210.m15275get(2).m38401()).mo21658();
                            if (iMo216510 < size) {
                                C16251 c16251M15275get = c0727Mo174210.m15275get(i);
                                C16251 c16251M38397 = c16251M15275get.m38397(((C16251) arrayList2.get(iMo216510)).m38400());
                                c10565.m26721(abstractC22454, C0727.m3151(c16251M15275get), c16251M38397, 2, null);
                                arrayList2.set(iMo216510, c16251M38397.m38402());
                            } else {
                                c10565.m26722(abstractC22454, c0727Mo174210.m15275get(2), hashSet);
                            }
                        }
                        it = it2;
                    } else {
                        it = it2;
                        InterfaceC19653 interfaceC19653M38401 = abstractC22454M26716.mo17429().m15275get(0).m38401();
                        AbstractC22454 abstractC22454M26724 = c10565.m26723(abstractC22454);
                        c10565.m26721(abstractC22454M26724, C0727.f3015, abstractC22454M26724.m49955(), 5, (AbstractC9901) interfaceC19653M38401);
                        hashSet.add(abstractC22454M26724);
                    }
                    hashSet.add(abstractC22454);
                    it2 = it;
                    i = 0;
                }
                Iterator it3 = it2;
                c4108.m11671(hashSet);
                c4108.m11692();
                int i5 = c10565.f36167;
                C2697.m8231(i5, c4108);
                for (int i6 = 0; i6 < c4108.m11685(); i6++) {
                    AbstractC22454 abstractC22454M11685 = c4108.m11684(i6);
                    if (abstractC22454M11685 != null && abstractC22454M11685.mo17426() != null && abstractC22454M11685.mo17426().m31572() == 2) {
                        ArrayList[] arrayListArrM11668 = c4108.m11668();
                        C16251 c16251M15275get2 = abstractC22454M11685.mo17429().m15275get(0);
                        C16251 c16251M49955 = abstractC22454M11685.m49955();
                        if (c16251M15275get2.m38400() >= i5 || c16251M49955.m38400() >= i5) {
                            C18325 c18325 = new C18325(c10565, c16251M49955, c16251M15275get2);
                            Iterator it4 = arrayListArrM11668[c16251M49955.m38400()].iterator();
                            while (it4.hasNext()) {
                                ((AbstractC22454) it4.next()).mo17427(c18325);
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
    public static void m26718(C10565 c10565, C6330 c6330) {
        C19737 c19737;
        C16251 c16251M15275get;
        int iM26715;
        int i = c10565.f36167;
        ArrayList arrayList = c10565.f36165;
        int iM31572 = c6330.mo17426().m31572();
        C16251 c16251M49955 = c6330.m49955();
        if (iM31572 != 56 || c16251M49955.m38401().mo9834() != 9) {
            if (iM31572 == 3 && c16251M49955.m38401().mo9834() == 9) {
                C19737 c19738 = new C19737(c16251M49955.m38400(), i, EnumC9154.NONE);
                arrayList.add(c19738);
                c10565.m26719(c16251M49955, c19738);
                return;
            } else {
                if (iM31572 == 55 && c16251M49955.m38401().mo9834() == 9) {
                    C19737 c19739 = new C19737(c16251M49955.m38400(), i, EnumC9154.NONE);
                    arrayList.add(c19739);
                    c10565.m26719(c16251M49955, c19739);
                    return;
                }
                return;
            }
        }
        C16251 c16251M49956 = c6330.m49955();
        AbstractC22454 abstractC22454M26716 = c10565.m26716(c6330);
        int iM31573 = abstractC22454M26716.mo17426().m31572();
        if (iM31573 == 5) {
            c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.NONE);
            arrayList.add(c19737);
        } else if (iM31573 == 38 || iM31573 == 45) {
            c16251M15275get = abstractC22454M26716.mo17429().m15275get(0);
            iM26715 = c10565.m26715(c16251M15275get);
            if (iM26715 != arrayList.size()) {
                c19737 = (C19737) arrayList.get(iM26715);
                c19737.f63424.set(c16251M49956.m38400());
            } else {
                if (c16251M15275get.getType() == C3320.f12286) {
                    c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.NONE);
                } else {
                    c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.GLOBAL);
                }
                arrayList.add(c19737);
            }
        } else {
            if (iM31573 != 46) {
                switch (iM31573) {
                    case 40:
                        c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.NONE);
                        break;
                    case 41:
                    case 42:
                        if (abstractC22454M26716.mo17429().m15275get(0).m38401().mo9847()) {
                            c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.NONE);
                            c19737.f63426 = true;
                        } else {
                            c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.GLOBAL);
                        }
                        break;
                    case 43:
                        c16251M15275get = abstractC22454M26716.mo17429().m15275get(0);
                        iM26715 = c10565.m26715(c16251M15275get);
                        if (iM26715 != arrayList.size()) {
                            c19737 = (C19737) arrayList.get(iM26715);
                            c19737.f63424.set(c16251M49956.m38400());
                        } else if (c16251M15275get.getType() == C3320.f12286) {
                            c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.NONE);
                        } else {
                            c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.GLOBAL);
                        }
                        break;
                    default:
                        c19737 = null;
                        break;
                }
            } else {
                c19737 = new C19737(c16251M49956.m38400(), i, EnumC9154.GLOBAL);
            }
            arrayList.add(c19737);
        }
        c10565.m26719(c16251M49955, c19737);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26719(C16251 c16251, C19737 c19737) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c16251);
        while (!arrayList.isEmpty()) {
            C16251 c16252 = (C16251) C17745.m41308(arrayList, 1);
            for (AbstractC22454 abstractC22454 : this.f36166.m11667(c16252.m38400())) {
                C12723 c12723Mo17426 = abstractC22454.mo17426();
                ArrayList arrayList2 = this.f36165;
                if (c12723Mo17426 == null) {
                    int iM26715 = m26715(abstractC22454.m49955());
                    if (iM26715 != arrayList2.size()) {
                        C19737 c19738 = (C19737) arrayList2.get(iM26715);
                        if (c19738 != c19737) {
                            c19737.f63426 = false;
                            c19737.f63424.or(c19738.f63424);
                            if (c19737.f63428.compareTo(c19738.f63428) < 0) {
                                c19737.f63428 = c19738.f63428;
                            }
                            for (C19737 c19739 : c19738.f63427) {
                                c19739.f63425.remove(c19738);
                                c19739.f63425.add(c19737);
                                c19737.f63427.add(c19739);
                            }
                            for (C19737 c197310 : c19738.f63425) {
                                c197310.f63427.remove(c19738);
                                c197310.f63427.add(c19737);
                                c19737.f63425.add(c197310);
                            }
                            arrayList2.remove(iM26715);
                        }
                    } else {
                        c19737.f63424.set(abstractC22454.m49955().m38400());
                        arrayList.add(abstractC22454.m49955());
                    }
                } else {
                    int iM31572 = abstractC22454.mo17426().m31572();
                    if (iM31572 != 2) {
                        if (iM31572 != 33 && iM31572 != 35) {
                            if (iM31572 == 43 || iM31572 == 7 || iM31572 == 8) {
                                EnumC9154 enumC9154 = c19737.f63428;
                                EnumC9154 enumC9155 = EnumC9154.METHOD;
                                if (enumC9154.compareTo(enumC9155) < 0) {
                                    c19737.f63428 = enumC9155;
                                }
                            } else if (iM31572 != 38) {
                                if (iM31572 != 39) {
                                    switch (iM31572) {
                                        case 47:
                                            break;
                                        case 48:
                                            c19737.f63428 = EnumC9154.GLOBAL;
                                            break;
                                        case 49:
                                        case 50:
                                        case 51:
                                        case 52:
                                        case 53:
                                            break;
                                    }
                                } else if (!abstractC22454.mo17429().m15275get(2).m38401().mo9847()) {
                                    c19737.f63426 = false;
                                }
                                if (abstractC22454.mo17429().m15275get(0).m38401().mo9834() == 9) {
                                    c19737.f63426 = false;
                                    ArrayList arrayList3 = c19737.f63425;
                                    ArrayList arrayList4 = c19737.f63427;
                                    C0727 c0727Mo17429 = abstractC22454.mo17429();
                                    if (c0727Mo17429.m15275get(0).m38400() == c16252.m38400()) {
                                        int iM26716 = m26715(c0727Mo17429.m15275get(1));
                                        if (iM26716 != arrayList2.size()) {
                                            C19737 c197311 = (C19737) arrayList2.get(iM26716);
                                            if (!arrayList4.contains(c197311)) {
                                                arrayList4.add(c197311);
                                            }
                                            if (!c197311.f63425.contains(c19737)) {
                                                c197311.f63425.add(c19737);
                                            }
                                            if (c19737.f63428.compareTo(c197311.f63428) < 0) {
                                                c19737.f63428 = c197311.f63428;
                                            }
                                        }
                                    } else {
                                        int iM26717 = m26715(c0727Mo17429.m15275get(0));
                                        if (iM26717 != arrayList2.size()) {
                                            C19737 c197312 = (C19737) arrayList2.get(iM26717);
                                            if (!c197312.f63427.contains(c19737)) {
                                                c197312.f63427.add(c19737);
                                            }
                                            if (!arrayList3.contains(c197312)) {
                                                arrayList3.add(c197312);
                                            }
                                            if (c197312.f63428.compareTo(c19737.f63428) < 0) {
                                                c197312.f63428 = c19737.f63428;
                                            }
                                        }
                                    }
                                }
                            } else if (!abstractC22454.mo17429().m15275get(1).m38401().mo9847()) {
                                c19737.f63426 = false;
                            }
                        }
                        c19737.f63428 = EnumC9154.INTER;
                    } else {
                        c19737.f63424.set(abstractC22454.m49955().m38400());
                        arrayList.add(abstractC22454.m49955());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26722(AbstractC22454 abstractC22454, C16251 c16251, HashSet hashSet) {
        C6143 c6143 = new C6143(C13429.f44425);
        C0727 c0727 = C0727.f3015;
        m26720(abstractC22454, c0727, 40, c6143);
        C11871 c11871M49949 = abstractC22454.m49949();
        C11871 c11871M29614 = c11871M49949.m29614(c11871M49949.m29616());
        AbstractC22454 abstractC22455 = (AbstractC22454) c11871M29614.m29613().get(0);
        C4108 c4108 = this.f36166;
        C16251 c16251M38381 = C16251.m38381(c4108.m11689(), c6143);
        m26721(abstractC22455, c0727, c16251M38381, 56, null);
        C11871 c11871M29615 = c11871M29614.m29614(c11871M29614.m29616());
        AbstractC22454 abstractC22456 = (AbstractC22454) c11871M29615.m29613().get(0);
        m26720(abstractC22456, C0727.m3149(c16251M38381, c16251), 52, new C20255(c6143, new C0498(new C17432("<init>"), new C17432("(I)V"))));
        hashSet.add(abstractC22456);
        C11871 c11871M29616 = c11871M29615.m29614(c11871M29615.m29616());
        AbstractC22454 abstractC22457 = (AbstractC22454) c11871M29616.m29613().get(0);
        m26720(abstractC22457, C0727.m3151(c16251M38381), 35, null);
        c11871M29616.m29602(c11871M29616.m29599(), c4108.m11680().m29617());
        hashSet.add(abstractC22457);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26721(AbstractC22454 abstractC22454, C0727 c0727, C16251 c16251, int i, AbstractC9901 abstractC9901) {
        C12723 c12723M17482;
        AbstractC15546 c9196;
        AbstractC15546 abstractC15546Mo17428 = abstractC22454.mo17428();
        if (i == 56) {
            c12723M17482 = C6372.m17480(c16251.getType());
        } else {
            c12723M17482 = C6372.m17482(i, c16251, c0727, abstractC9901);
        }
        C12723 c12723 = c12723M17482;
        if (abstractC9901 == null) {
            c9196 = new C10607(c12723, abstractC15546Mo17428.m37183(), c16251, c0727);
        } else {
            c9196 = new C9196(c12723, abstractC15546Mo17428.m37183(), c16251, c0727, abstractC9901);
        }
        C6330 c6330 = new C6330(c9196, abstractC22454.m49949());
        ArrayList arrayListM29613 = abstractC22454.m49949().m29613();
        arrayListM29613.add(arrayListM29613.lastIndexOf(abstractC22454), c6330);
        C4108 c4108 = this.f36166;
        c4108.m11673(c6330, (C0727) null);
        c4108.m11677(c6330, (C16251) null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m26720(AbstractC22454 abstractC22454, C0727 c0727, int i, AbstractC23783 abstractC23783) {
        AbstractC15546 c14840;
        AbstractC15546 abstractC15546Mo17428 = abstractC22454.mo17428();
        C12723 c12723M17482 = C6372.m17482(i, null, c0727, abstractC23783);
        if (abstractC23783 == null) {
            c14840 = new C2138(c12723M17482, abstractC15546Mo17428.m37183(), c0727, C9672.f32573);
        } else {
            c14840 = new C14840(c12723M17482, abstractC15546Mo17428.m37183(), c0727, C9672.f32573, abstractC23783);
        }
        C6330 c6330 = new C6330(c14840, abstractC22454.m49949());
        ArrayList arrayListM29613 = abstractC22454.m49949().m29613();
        arrayListM29613.add(arrayListM29613.lastIndexOf(abstractC22454), c6330);
        C4108 c4108 = this.f36166;
        c4108.m11673(c6330, (C0727) null);
        c4108.m11677(c6330, (C16251) null);
    }
}
