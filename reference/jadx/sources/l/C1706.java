package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.֫۠᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes2.dex */
public class C1706 implements InterfaceC14429 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public C15113 f6735;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6736;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final BitSet f6737;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16524 f6738;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f6739;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final ArrayList f6740;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f6741;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean f6742;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final HashMap f6743;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f6744 = new IdentityHashMap();

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final BitSet f6745;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f6746;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C6707 f6747;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C6645 f6748;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final int f6749;

    public C1706(C16524 c16524) {
        this.f6738 = c16524;
        ArrayList arrayList = new ArrayList(c16524.m38899());
        arrayList.add(new C21793());
        arrayList.add(new C18971());
        arrayList.add(new C10505());
        arrayList.add(new C23205());
        arrayList.add(new C21087());
        this.f6736 = arrayList;
        List listM38896 = c16524.m38896();
        HashMap map = new HashMap();
        Object[] objArr = {new C6976(), new C12621()};
        ArrayList arrayList2 = new ArrayList(2);
        int iM51269 = 0;
        while (iM51269 < 2) {
            Object obj = objArr[iM51269];
            iM51269 = C23234.m51269(obj, arrayList2, obj, iM51269, 1);
        }
        m5671(C0561.unmodifiableList(arrayList2), map);
        m5671(listM38896, map);
        this.f6743 = map;
        ArrayList arrayList3 = new ArrayList(c16524.m38894());
        arrayList3.add(new C19677());
        this.f6740 = arrayList3;
        Set setM38898 = c16524.m38898();
        BitSet bitSet = new BitSet();
        Iterator it = setM38898.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f6737 = bitSet;
        int iM38897 = c16524.m38897();
        this.f6749 = iM38897;
        this.f6742 = iM38897 != Integer.MAX_VALUE;
        Set setKeySet = this.f6743.keySet();
        ArrayList arrayList4 = this.f6736;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC22230) it3.next()).mo26660().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f6745 = bitSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5671(List list, HashMap map) {
        C1331 c1331;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC19408 interfaceC19408 = (InterfaceC19408) it.next();
            char cMo4732 = interfaceC19408.mo4732();
            char cMo4729 = interfaceC19408.mo4729();
            if (cMo4732 == cMo4729) {
                InterfaceC19408 interfaceC19409 = (InterfaceC19408) map.get(Character.valueOf(cMo4732));
                if (interfaceC19409 != null && interfaceC19409.mo4732() == interfaceC19409.mo4729()) {
                    if (interfaceC19409 instanceof C1331) {
                        c1331 = (C1331) interfaceC19409;
                    } else {
                        C1331 c1332 = new C1331(cMo4732);
                        c1332.m4731(interfaceC19409);
                        c1331 = c1332;
                    }
                    c1331.m4731(interfaceC19408);
                    map.put(Character.valueOf(cMo4732), c1331);
                } else {
                    m5670(cMo4732, interfaceC19408, map);
                }
            } else {
                m5670(cMo4732, interfaceC19408, map);
                m5670(cMo4729, interfaceC19408, map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5670(char c, InterfaceC19408 interfaceC19408, HashMap map) {
        if (((InterfaceC19408) map.put(Character.valueOf(c), interfaceC19408)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6707 m5679() {
        return this.f6747;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x022c  */
    /* JADX WARN: Code duplicated, block: B:105:0x022f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0235  */
    /* JADX WARN: Code duplicated, block: B:109:0x0237  */
    /* JADX WARN: Code duplicated, block: B:110:0x0239  */
    /* JADX WARN: Code duplicated, block: B:113:0x0241  */
    /* JADX WARN: Code duplicated, block: B:115:0x0244  */
    /* JADX WARN: Code duplicated, block: B:118:0x024d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0258  */
    /* JADX WARN: Code duplicated, block: B:125:0x026d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0271  */
    /* JADX WARN: Code duplicated, block: B:158:0x0341  */
    /* JADX WARN: Code duplicated, block: B:173:0x0398  */
    /* JADX WARN: Code duplicated, block: B:287:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:37:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x0122  */
    /* JADX WARN: Code duplicated, block: B:42:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0176 A[LOOP:5: B:40:0x012c->B:50:0x0176, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x017c  */
    /* JADX WARN: Code duplicated, block: B:53:0x018a  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x01bc A[LOOP:6: B:57:0x01b4->B:59:0x01bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0200  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x0214  */
    /* JADX WARN: Code duplicated, block: B:92:0x0217 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x021f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0224  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // l.InterfaceC14429
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5680(C2473 c2473, AbstractC19367 abstractC19367) {
        List listUnmodifiableList;
        ArrayList arrayList;
        Object obj;
        C23580 c23580;
        String strM7583;
        C14408 c14408;
        AbstractC19367 abstractC19367M2893;
        AbstractC19367 abstractC19367M5669;
        String strM17350;
        String strM17351;
        String strM7584;
        List list;
        InterfaceC19408 interfaceC19408;
        int iM18134;
        C3884 c3884M18139;
        ArrayList arrayList2;
        int iM18127;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C5940 c5940;
        C15113 c15113;
        C15113 c15114;
        C3884 c3884M181310;
        Iterator it;
        C16854 c16854Mo14672;
        AbstractC19367 abstractC19367M39512;
        this.f6747 = C6707.m18124(c2473);
        int i = 1;
        this.f6741 = !c2473.m7585().isEmpty();
        int i2 = 0;
        this.f6746 = 0;
        ArrayList arrayList3 = null;
        this.f6735 = null;
        this.f6748 = null;
        this.f6744.clear();
        HashMap map = new HashMap();
        for (InterfaceC22230 interfaceC22230 : this.f6736) {
            InterfaceC5296 interfaceC5296Create = interfaceC22230.create();
            Iterator it2 = interfaceC22230.mo26660().iterator();
            while (it2.hasNext()) {
                ((List) C9735.computeIfAbsent(map, (Character) it2.next(), new C12291(i2))).add(interfaceC5296Create);
            }
        }
        this.f6739 = map;
        while (true) {
            char cM18135 = this.f6747.m18135();
            if (cM18135 == 0) {
                listUnmodifiableList = null;
            } else if (cM18135 != '\n') {
                if (cM18135 == '[') {
                    C3884 c3884M181311 = this.f6747.m18139();
                    this.f6747.m18138();
                    C3884 c3884M181312 = this.f6747.m18139();
                    C17250 c17250M5669 = m5669(this.f6747.m18130(c3884M181311, c3884M181312));
                    C6645 c6645M18023 = C6645.m18023(c17250M5669, c3884M181311, c3884M181312, this.f6748, this.f6735);
                    C6645 c6645 = this.f6748;
                    if (c6645 != null) {
                        c6645.f22454 = true;
                    }
                    this.f6748 = c6645M18023;
                    Object[] objArr = {c17250M5669};
                    arrayList = new ArrayList(1);
                    obj = objArr[0];
                } else if (cM18135 == ']') {
                    C3884 c3884M181313 = this.f6747.m18139();
                    this.f6747.m18138();
                    C3884 c3884M181314 = this.f6747.m18139();
                    C6645 c6646 = this.f6748;
                    if (c6646 == null) {
                        abstractC19367M5669 = m5669(this.f6747.m18130(c3884M181313, c3884M181314));
                    } else {
                        C17250 c17250 = c6646.f22446;
                        C3884 c3884 = c6646.f22455;
                        if (c6646.f22449) {
                            C3884 c3884M181315 = this.f6747.m18139();
                            C6707 c6707 = this.f6747;
                            if (c6707.m18136('(')) {
                                c6707.m18126();
                                char cM18136 = c6707.m18135();
                                C3884 c3884M181316 = c6707.m18139();
                                if (C3335.m9933(c6707)) {
                                    if (cM18136 == '<') {
                                        c23580 = arrayList3;
                                        strM17350 = arrayList3;
                                        strM7584 = C20630.m46498(i, i, c6707.m18130(c3884M181316, c6707.m18139()).m7583());
                                    } else {
                                        c23580 = arrayList3;
                                        strM17350 = arrayList3;
                                        strM7584 = c6707.m18130(c3884M181316, c6707.m18139()).m7583();
                                    }
                                    strM17350 = C6270.m17350(strM7584);
                                }
                                if (strM17350 != 0) {
                                    if (c6707.m18126() >= i) {
                                        C3884 c3884M181317 = c6707.m18139();
                                        if (C3335.m9935(c6707)) {
                                            String strM7585 = c6707.m18130(c3884M181317, c6707.m18139()).m7583();
                                            strM17351 = C6270.m17350(strM7585.substring(i, strM7585.length() - i));
                                        } else {
                                            strM17351 = null;
                                        }
                                        c6707.m18126();
                                    } else {
                                        strM17351 = null;
                                    }
                                    if (c6707.m18136(')')) {
                                        c23580 = new C23580(strM17350, strM17351);
                                    } else {
                                        c23580 = 0;
                                    }
                                } else {
                                    c23580 = 0;
                                }
                            }
                            if (c23580 != 0) {
                                c14408 = new C14408(c6646.f22446, this.f6747.m18130(c3884, c3884M181313).m7583(), null, c23580.f76380, c23580.f76381);
                            } else {
                                this.f6747.m18131(c3884M181315);
                                C6707 c6708 = this.f6747;
                                if (c6708.m18136('[')) {
                                    C3884 c3884M181318 = c6708.m18139();
                                    if (C3335.m9936(c6708)) {
                                        C3884 c3884M181319 = c6708.m18139();
                                        if (c6708.m18136(']')) {
                                            strM7583 = c6708.m18130(c3884M181318, c3884M181319).m7583();
                                            if (strM7583.length() > 999) {
                                                strM7583 = null;
                                            }
                                        } else {
                                            strM7583 = null;
                                        }
                                    } else {
                                        strM7583 = null;
                                    }
                                } else {
                                    strM7583 = null;
                                }
                                String str = strM7583;
                                if (str == null) {
                                    this.f6747.m18131(c3884M181315);
                                }
                                c14408 = (c6646.f22454 && (str == null || str.isEmpty()) && c17250 == null) ? null : new C14408(c6646.f22446, this.f6747.m18130(c3884, c3884M181313).m7583(), str, null, null);
                            }
                            C3884 c3885 = c6646.f22447;
                            C3884 c3886 = c6646.f22453;
                            C15113 c15115 = c6646.f22451;
                            AbstractC19367 abstractC19368 = c6646.f22452;
                            if (c14408 != null) {
                                C3884 c3884M181320 = this.f6747.m18139();
                                Iterator it3 = this.f6740.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C0625 c0625Mo32260 = ((InterfaceC13058) it3.next()).mo32260(c14408, this.f6747, this.f6738);
                                        if (C6009.m16315(c0625Mo32260)) {
                                            abstractC19367M2893 = c0625Mo32260.m2893();
                                            C3884 c3884M2896 = c0625Mo32260.m2896();
                                            boolean zM2894 = c0625Mo32260.m2894();
                                            int i3 = C17229.f54902[c0625Mo32260.m2895().ordinal()];
                                            if (i3 != 1) {
                                                if (i3 == 2) {
                                                    this.f6747.m18131(c3884M2896);
                                                    while (true) {
                                                        C15113 c15116 = this.f6735;
                                                        if (c15116 == null || c15116 == c15115) {
                                                            break;
                                                        } else {
                                                            m5678(c15116);
                                                        }
                                                    }
                                                    if (this.f6741) {
                                                        if (zM2894 && c3886 != null) {
                                                            c3885 = c3886;
                                                        }
                                                        C6707 c6709 = this.f6747;
                                                        abstractC19367M2893.m44384(c6709.m18130(c3885, c6709.m18139()).m7585());
                                                    }
                                                    m5676();
                                                    if (zM2894 && c17250 != null) {
                                                        abstractC19368 = c17250;
                                                    }
                                                    while (abstractC19368 != null) {
                                                        AbstractC19367 abstractC19367M44390 = abstractC19368.m44390();
                                                        abstractC19368.m44391();
                                                        abstractC19368 = abstractC19367M44390;
                                                    }
                                                    m5675(abstractC19367M2893, m5668(abstractC19367M2893.m44383(), (C17250) null) + 1);
                                                    if (c17250 != null && zM2894) {
                                                        break;
                                                    }
                                                    for (C6645 c6647 = this.f6748; c6647 != null; c6647 = c6647.f22448) {
                                                        if (c6647.f22446 == null) {
                                                            c6647.f22449 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                this.f6747.m18131(c3884M2896);
                                                if (!this.f6742 || c6646.f22450 < this.f6749) {
                                                    AbstractC19367 abstractC19367M44391 = abstractC19368.m44390();
                                                    while (abstractC19367M44391 != null) {
                                                        AbstractC19367 abstractC19367M44392 = abstractC19367M44391.m44390();
                                                        abstractC19367M2893.m44388(abstractC19367M44391);
                                                        abstractC19367M44391 = abstractC19367M44392;
                                                    }
                                                    if (this.f6741) {
                                                        if (zM2894 && c3886 != null) {
                                                            c3885 = c3886;
                                                        }
                                                        C6707 c67010 = this.f6747;
                                                        abstractC19367M2893.m44384(c67010.m18130(c3885, c67010.m18139()).m7585());
                                                    }
                                                    m5672(c15115);
                                                    m5674(abstractC19367M2893);
                                                    if (zM2894 && c17250 != null) {
                                                        c17250.m44391();
                                                    }
                                                    abstractC19368.m44391();
                                                    m5676();
                                                    m5675(abstractC19367M2893, c6646.f22450 + 1);
                                                    if (c17250 != null) {
                                                        break;
                                                    }
                                                    for (C6645 c6648 = this.f6748; c6648 != null; c6648 = c6648.f22448) {
                                                        if (c6648.f22446 == null) {
                                                            c6648.f22449 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            this.f6747.m18131(c3884M181320);
                                        }
                                        c14408 = c14408;
                                    }
                                    abstractC19367M2893 = null;
                                    break;
                                }
                            }
                            abstractC19367M2893 = null;
                            break;
                            if (abstractC19367M2893 != null) {
                                abstractC19367M5669 = abstractC19367M2893;
                            } else {
                                this.f6747.m18131(c3884M181314);
                                m5676();
                                abstractC19367M5669 = m5669(this.f6747.m18130(c3884M181313, c3884M181314));
                            }
                        } else {
                            m5676();
                            abstractC19367M5669 = m5669(this.f6747.m18130(c3884M181313, c3884M181314));
                        }
                    }
                    Object[] objArr2 = {abstractC19367M5669};
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    C13638.requireNonNull(obj2);
                    arrayList4.add(obj2);
                    listUnmodifiableList = C0561.unmodifiableList(arrayList4);
                } else if (this.f6737.get(cM18135)) {
                    C3884 c3884M181321 = this.f6747.m18139();
                    C3884 c3884M181322 = this.f6747.m18139();
                    this.f6747.m18138();
                    C3884 c3884M181323 = this.f6747.m18139();
                    if (this.f6747.m18136('[')) {
                        C3884 c3884M181324 = this.f6747.m18139();
                        C17250 c17250M56610 = m5669(this.f6747.m18130(c3884M181322, c3884M181323));
                        C17250 c17250M56611 = m5669(this.f6747.m18130(c3884M181323, c3884M181324));
                        C6645 c6645M18024 = C6645.m18024(c17250M56610, c3884M181322, c17250M56611, c3884M181323, c3884M181324, this.f6748, this.f6735);
                        C6645 c6649 = this.f6748;
                        if (c6649 != null) {
                            c6649.f22454 = i;
                        }
                        this.f6748 = c6645M18024;
                        Object[] objArr3 = new Object[2];
                        objArr3[i2] = c17250M56610;
                        objArr3[i] = c17250M56611;
                        ArrayList arrayList5 = new ArrayList(2);
                        int iM51269 = 0;
                        while (iM51269 < 2) {
                            Object obj3 = objArr3[iM51269];
                            iM51269 = C23234.m51269(obj3, arrayList5, obj3, iM51269, i);
                        }
                        listUnmodifiableList = C0561.unmodifiableList(arrayList5);
                    } else {
                        listUnmodifiableList = arrayList3;
                    }
                    if (listUnmodifiableList == null) {
                        this.f6747.m18131(c3884M181321);
                        if (this.f6745.get(cM18135)) {
                            list = (List) this.f6739.get(Character.valueOf(cM18135));
                            if (list != null) {
                                c3884M181310 = this.f6747.m18139();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c16854Mo14672 = ((InterfaceC5296) it.next()).mo14672(this);
                                        if (c16854Mo14672 != null) {
                                            abstractC19367M39512 = c16854Mo14672.m39512();
                                            this.f6747.m18131(c16854Mo14672.m39513());
                                            if (this.f6741 && abstractC19367M39512.m44394().isEmpty()) {
                                                C6707 c67011 = this.f6747;
                                                abstractC19367M39512.m44384(c67011.m18130(c3884M181310, c67011.m18139()).m7585());
                                            }
                                            Object[] objArr4 = new Object[i];
                                            objArr4[i2] = abstractC19367M39512;
                                            arrayList = new ArrayList(i);
                                            obj = objArr4[i2];
                                        } else {
                                            this.f6747.m18131(c3884M181310);
                                        }
                                    } else {
                                        interfaceC19408 = (InterfaceC19408) this.f6743.get(Character.valueOf(cM18135));
                                        if (interfaceC19408 != null) {
                                            iM18134 = this.f6747.m18134();
                                            c3884M18139 = this.f6747.m18139();
                                            if (this.f6747.m18137(cM18135) < interfaceC19408.mo4733()) {
                                                this.f6747.m18131(c3884M18139);
                                                c5940 = arrayList3;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f6747.m18131(c3884M18139);
                                                while (this.f6747.m18136(cM18135)) {
                                                    C6707 c67012 = this.f6747;
                                                    arrayList2.add(m5669(c67012.m18130(c3884M18139, c67012.m18139())));
                                                    c3884M18139 = this.f6747.m18139();
                                                }
                                                iM18127 = this.f6747.m18127();
                                                if (iM18134 != 0 || C22851.m50585(iM18134)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (iM18134 != 0 || C22851.m50593(iM18134)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (iM18127 != 0 || C22851.m50585(iM18127)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (iM18127 != 0 || C22851.m50593(iM18127)) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                if (z4 && (!z3 || z2 || z)) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z2 && (!z || z4 || z3)) {
                                                    z6 = true;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (cM18135 == '_') {
                                                    if (z5 || (z6 && !z)) {
                                                        z9 = false;
                                                    } else {
                                                        z9 = true;
                                                    }
                                                    if (z6 || (z5 && !z3)) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                } else {
                                                    if (z5 || cM18135 != interfaceC19408.mo4732()) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    if (z6 || cM18135 != interfaceC19408.mo4729()) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    z9 = z7;
                                                }
                                                c5940 = new C5940(arrayList2, z9, z8);
                                            }
                                            if (c5940 != 0) {
                                                arrayList3 = c5940.f20211;
                                                c15113 = new C15113(arrayList3, cM18135, c5940.f20212, c5940.f20210, this.f6735);
                                                this.f6735 = c15113;
                                                c15114 = c15113.f49355;
                                                if (c15114 != null) {
                                                    c15114.f49358 = c15113;
                                                }
                                            }
                                            if (arrayList3 != null) {
                                                listUnmodifiableList = arrayList3;
                                            }
                                        }
                                        Object[] objArr5 = new Object[i];
                                        objArr5[i2] = m5677();
                                        arrayList = new ArrayList(i);
                                        obj = objArr5[i2];
                                    }
                                }
                            } else {
                                interfaceC19408 = (InterfaceC19408) this.f6743.get(Character.valueOf(cM18135));
                                if (interfaceC19408 != null) {
                                    iM18134 = this.f6747.m18134();
                                    c3884M18139 = this.f6747.m18139();
                                    if (this.f6747.m18137(cM18135) < interfaceC19408.mo4733()) {
                                        this.f6747.m18131(c3884M18139);
                                        c5940 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f6747.m18131(c3884M18139);
                                        while (this.f6747.m18136(cM18135)) {
                                            C6707 c67013 = this.f6747;
                                            arrayList2.add(m5669(c67013.m18130(c3884M18139, c67013.m18139())));
                                            c3884M18139 = this.f6747.m18139();
                                        }
                                        iM18127 = this.f6747.m18127();
                                        if (iM18134 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM18134 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM18127 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM18127 != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z2) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (cM18135 == '_') {
                                            if (z5) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z7;
                                        }
                                        c5940 = new C5940(arrayList2, z9, z8);
                                    }
                                    if (c5940 != 0) {
                                        arrayList3 = c5940.f20211;
                                        c15113 = new C15113(arrayList3, cM18135, c5940.f20212, c5940.f20210, this.f6735);
                                        this.f6735 = c15113;
                                        c15114 = c15113.f49355;
                                        if (c15114 != null) {
                                            c15114.f49358 = c15113;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr6 = new Object[i];
                                objArr6[i2] = m5677();
                                arrayList = new ArrayList(i);
                                obj = objArr6[i2];
                            }
                        } else {
                            Object[] objArr7 = new Object[i];
                            objArr7[i2] = m5677();
                            arrayList = new ArrayList(i);
                            obj = objArr7[i2];
                        }
                    }
                } else if (this.f6745.get(cM18135)) {
                    Object[] objArr8 = new Object[i];
                    objArr8[i2] = m5677();
                    arrayList = new ArrayList(i);
                    obj = objArr8[i2];
                } else {
                    list = (List) this.f6739.get(Character.valueOf(cM18135));
                    if (list != null) {
                        c3884M181310 = this.f6747.m18139();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c16854Mo14672 = ((InterfaceC5296) it.next()).mo14672(this);
                                if (c16854Mo14672 != null) {
                                    abstractC19367M39512 = c16854Mo14672.m39512();
                                    this.f6747.m18131(c16854Mo14672.m39513());
                                    if (this.f6741) {
                                        C6707 c67014 = this.f6747;
                                        abstractC19367M39512.m44384(c67014.m18130(c3884M181310, c67014.m18139()).m7585());
                                    }
                                    Object[] objArr9 = new Object[i];
                                    objArr9[i2] = abstractC19367M39512;
                                    arrayList = new ArrayList(i);
                                    obj = objArr9[i2];
                                } else {
                                    this.f6747.m18131(c3884M181310);
                                }
                            } else {
                                interfaceC19408 = (InterfaceC19408) this.f6743.get(Character.valueOf(cM18135));
                                if (interfaceC19408 != null) {
                                    iM18134 = this.f6747.m18134();
                                    c3884M18139 = this.f6747.m18139();
                                    if (this.f6747.m18137(cM18135) < interfaceC19408.mo4733()) {
                                        this.f6747.m18131(c3884M18139);
                                        c5940 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f6747.m18131(c3884M18139);
                                        while (this.f6747.m18136(cM18135)) {
                                            C6707 c67015 = this.f6747;
                                            arrayList2.add(m5669(c67015.m18130(c3884M18139, c67015.m18139())));
                                            c3884M18139 = this.f6747.m18139();
                                        }
                                        iM18127 = this.f6747.m18127();
                                        if (iM18134 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM18134 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM18127 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM18127 != 0) {
                                            z4 = true;
                                        } else {
                                            z4 = true;
                                        }
                                        if (z4) {
                                            z5 = false;
                                        } else {
                                            z5 = false;
                                        }
                                        if (z2) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (cM18135 == '_') {
                                            if (z5) {
                                                z9 = false;
                                            } else {
                                                z9 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                        } else {
                                            if (z5) {
                                                z7 = false;
                                            } else {
                                                z7 = false;
                                            }
                                            if (z6) {
                                                z8 = false;
                                            } else {
                                                z8 = false;
                                            }
                                            z9 = z7;
                                        }
                                        c5940 = new C5940(arrayList2, z9, z8);
                                    }
                                    if (c5940 != 0) {
                                        arrayList3 = c5940.f20211;
                                        c15113 = new C15113(arrayList3, cM18135, c5940.f20212, c5940.f20210, this.f6735);
                                        this.f6735 = c15113;
                                        c15114 = c15113.f49355;
                                        if (c15114 != null) {
                                            c15114.f49358 = c15113;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listUnmodifiableList = arrayList3;
                                    }
                                }
                                Object[] objArr10 = new Object[i];
                                objArr10[i2] = m5677();
                                arrayList = new ArrayList(i);
                                obj = objArr10[i2];
                            }
                        }
                    } else {
                        interfaceC19408 = (InterfaceC19408) this.f6743.get(Character.valueOf(cM18135));
                        if (interfaceC19408 != null) {
                            iM18134 = this.f6747.m18134();
                            c3884M18139 = this.f6747.m18139();
                            if (this.f6747.m18137(cM18135) < interfaceC19408.mo4733()) {
                                this.f6747.m18131(c3884M18139);
                                c5940 = arrayList3;
                            } else {
                                arrayList2 = new ArrayList();
                                this.f6747.m18131(c3884M18139);
                                while (this.f6747.m18136(cM18135)) {
                                    C6707 c67016 = this.f6747;
                                    arrayList2.add(m5669(c67016.m18130(c3884M18139, c67016.m18139())));
                                    c3884M18139 = this.f6747.m18139();
                                }
                                iM18127 = this.f6747.m18127();
                                if (iM18134 != 0) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                if (iM18134 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (iM18127 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (iM18127 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = true;
                                }
                                if (z4) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                }
                                if (z2) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                if (cM18135 == '_') {
                                    if (z5) {
                                        z9 = false;
                                    } else {
                                        z9 = false;
                                    }
                                    if (z6) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                } else {
                                    if (z5) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                    }
                                    if (z6) {
                                        z8 = false;
                                    } else {
                                        z8 = false;
                                    }
                                    z9 = z7;
                                }
                                c5940 = new C5940(arrayList2, z9, z8);
                            }
                            if (c5940 != 0) {
                                arrayList3 = c5940.f20211;
                                c15113 = new C15113(arrayList3, cM18135, c5940.f20212, c5940.f20210, this.f6735);
                                this.f6735 = c15113;
                                c15114 = c15113.f49355;
                                if (c15114 != null) {
                                    c15114.f49358 = c15113;
                                }
                            }
                            if (arrayList3 != null) {
                                listUnmodifiableList = arrayList3;
                            }
                        }
                        Object[] objArr11 = new Object[i];
                        objArr11[i2] = m5677();
                        arrayList = new ArrayList(i);
                        obj = objArr11[i2];
                    }
                }
                C13638.requireNonNull(obj);
                arrayList.add(obj);
                listUnmodifiableList = C0561.unmodifiableList(arrayList);
            } else {
                this.f6747.m18138();
                boolean z10 = this.f6746 >= 2;
                this.f6746 = 0;
                Object[] objArr12 = {z10 ? new C1021() : new C20073()};
                ArrayList arrayList6 = new ArrayList(1);
                Object obj4 = objArr12[0];
                C13638.requireNonNull(obj4);
                arrayList6.add(obj4);
                listUnmodifiableList = C0561.unmodifiableList(arrayList6);
            }
            if (listUnmodifiableList == null) {
                m5672((C15113) null);
                m5674(abstractC19367);
                return;
            }
            arrayList3 = null;
            Iterator it4 = listUnmodifiableList.iterator();
            while (it4.hasNext()) {
                abstractC19367.m44388((AbstractC19367) it4.next());
            }
            i2 = 0;
            i = 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17250 m5669(C2473 c2473) {
        C17250 c17250 = new C17250(c2473.m7583());
        c17250.m44384(c2473.m7585());
        return c17250;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m5676() {
        int i;
        C6645 c6645 = this.f6748;
        C6645 c6646 = c6645.f22448;
        this.f6748 = c6646;
        if (c6646 == null || (i = c6645.f22450) <= c6646.f22450) {
            return;
        }
        c6646.f22450 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private C17250 m5677() {
        char cM18135;
        C3884 c3884M18139 = this.f6747.m18139();
        this.f6747.m18138();
        while (true) {
            cM18135 = this.f6747.m18135();
            if (cM18135 == 0 || this.f6745.get(cM18135)) {
                break;
            }
            this.f6747.m18138();
        }
        C6707 c6707 = this.f6747;
        C2473 c2473M18130 = c6707.m18130(c3884M18139, c6707.m18139());
        String strM7583 = c2473M18130.m7583();
        if (cM18135 == '\n') {
            int length = strM7583.length();
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (strM7583.charAt(length) == ' ');
            int i = length + 1;
            this.f6746 = strM7583.length() - i;
            strM7583 = strM7583.substring(0, i);
        } else if (cM18135 == 0) {
            strM7583 = strM7583.substring(0, C22851.m50589(strM7583.length() - 1, 0, strM7583) + 1);
        }
        C17250 c17250 = new C17250(strM7583);
        c17250.m44384(c2473M18130.m7585());
        return c17250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5672(C15113 c15113) {
        int i;
        boolean z;
        AbstractC19367 abstractC19367M44390;
        HashMap map = new HashMap();
        C15113 c15114 = this.f6735;
        while (c15114 != null) {
            C15113 c15115 = c15114.f49355;
            if (c15115 == c15113) {
                break;
            } else {
                c15114 = c15115;
            }
        }
        while (c15114 != null) {
            ArrayList arrayList = c15114.f49359;
            char c = c15114.f49356;
            InterfaceC19408 interfaceC19408 = (InterfaceC19408) this.f6743.get(Character.valueOf(c));
            if (!c15114.m36200() || interfaceC19408 == null) {
                c15114 = c15114.f49358;
            } else {
                C10880 c10880 = new C10880(c, (c15114.m36198() % 3) + (c15114.m36203() ? 3 : 0));
                C15113 c15116 = (C15113) map.get(c10880);
                char cMo4732 = interfaceC19408.mo4732();
                C15113 c15117 = c15114.f49355;
                C17250 c17250 = (C17250) arrayList.get(0);
                int i2 = 0;
                int iMo4730 = 0;
                while (true) {
                    if (c15117 != null && c15117 != c15113 && c15117 != c15116) {
                        if (this.f6742) {
                            int iMax = Math.max(i2, m5668(c15117.m36201().m44390(), c17250));
                            C17250 c17250M36201 = c15117.m36201();
                            if (iMax < this.f6749) {
                                i2 = iMax;
                                c17250 = c17250M36201;
                            }
                        }
                        if (c15117.m36203() && c15117.f49356 == cMo4732 && (iMo4730 = interfaceC19408.mo4730(c15117, c15114)) > 0) {
                            i = i2 + 1;
                            abstractC19367M44390 = c15117.m36201().m44390();
                            z = true;
                            break;
                        }
                        c15117 = c15117.f49355;
                    }
                    abstractC19367M44390 = null;
                    z = false;
                    i = 0;
                    break;
                }
                if (z) {
                    for (int i3 = 0; i3 < iMo4730; i3++) {
                        ((C17250) C17745.m41308(c15117.f49359, 1)).m44391();
                    }
                    for (int i4 = 0; i4 < iMo4730; i4++) {
                        ((C17250) arrayList.remove(0)).m44391();
                    }
                    C15113 c15118 = c15114.f49355;
                    while (c15118 != null && c15118 != c15117) {
                        C15113 c15119 = c15118.f49355;
                        m5678(c15118);
                        c15118 = c15119;
                    }
                    if (abstractC19367M44390 != null) {
                        m5675(abstractC19367M44390, i);
                    }
                    if (c15117.f49359.size() == 0) {
                        m5678(c15117);
                    }
                    if (arrayList.size() == 0) {
                        C15113 c151110 = c15114.f49358;
                        m5678(c15114);
                        c15114 = c151110;
                    }
                } else {
                    map.put(c10880, c15114.f49355);
                    if (!c15114.m36203()) {
                        m5678(c15114);
                    }
                    c15114 = c15114.f49358;
                }
            }
        }
        while (true) {
            C15113 c151111 = this.f6735;
            if (c151111 == null || c151111 == c15113) {
                return;
            } else {
                m5678(c151111);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5675(AbstractC19367 abstractC19367, int i) {
        if (this.f6742) {
            this.f6744.put(abstractC19367, Integer.valueOf(i));
            C6645 c6645 = this.f6748;
            if (c6645 == null || i <= c6645.f22450) {
                return;
            }
            c6645.f22450 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m5668(AbstractC19367 abstractC19367, C17250 c17250) {
        int iIntValue = 0;
        while (abstractC19367 != null && abstractC19367 != c17250) {
            Integer num = (Integer) this.f6744.get(abstractC19367);
            if (num != null && num.intValue() > iIntValue) {
                iIntValue = num.intValue();
            }
            abstractC19367 = abstractC19367.m44390();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    private void m5678(C15113 c15113) {
        C15113 c15114 = c15113.f49355;
        if (c15114 != null) {
            c15114.f49358 = c15113.f49358;
        }
        C15113 c15115 = c15113.f49358;
        if (c15115 == null) {
            this.f6735 = c15114;
        } else {
            c15115.f49355 = c15114;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5674(AbstractC19367 abstractC19367) {
        if (abstractC19367.m44383() == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(abstractC19367);
        while (!arrayDeque.isEmpty()) {
            AbstractC19367 abstractC19368 = (AbstractC19367) arrayDeque.removeLast();
            AbstractC19367 abstractC19367M44392 = abstractC19368.m44392();
            int length = 0;
            C17250 c17250 = null;
            C17250 c17251 = null;
            for (AbstractC19367 abstractC19367M44383 = abstractC19368.m44383(); abstractC19367M44383 != null; abstractC19367M44383 = abstractC19367M44383.m44390()) {
                if (abstractC19367M44383 instanceof C17250) {
                    c17251 = (C17250) abstractC19367M44383;
                    if (c17250 == null) {
                        c17250 = c17251;
                    }
                    length = c17251.m40214().length() + length;
                } else {
                    m5673(c17250, c17251, length);
                    if (abstractC19367M44383.m44383() != null) {
                        arrayDeque.addLast(abstractC19367M44383);
                    }
                    length = 0;
                    c17250 = null;
                    c17251 = null;
                }
                if (abstractC19367M44383 == abstractC19367M44392) {
                    break;
                }
            }
            m5673(c17250, c17251, length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m5673(C17250 c17250, C17250 c17251, int i) {
        C16545 c16545;
        if (c17250 == null || c17251 == null || c17250 == c17251) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c17250.m40214());
        if (this.f6741) {
            c16545 = new C16545();
            c16545.m38948(c17250.m44394());
        } else {
            c16545 = null;
        }
        AbstractC19367 abstractC19367M44390 = c17250.m44390();
        AbstractC19367 abstractC19367M44391 = c17251.m44390();
        while (abstractC19367M44390 != abstractC19367M44391) {
            sb.append(((C17250) abstractC19367M44390).m40214());
            if (c16545 != null) {
                c16545.m38948(abstractC19367M44390.m44394());
            }
            AbstractC19367 abstractC19367M44392 = abstractC19367M44390.m44390();
            abstractC19367M44390.m44391();
            abstractC19367M44390 = abstractC19367M44392;
        }
        c17250.m40215(sb.toString());
        if (c16545 != null) {
            c17250.m44384(c16545.m38947());
        }
    }
}
