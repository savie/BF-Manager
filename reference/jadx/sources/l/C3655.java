package l;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ۗ᩶ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 18YS */
/* JADX INFO: loaded from: classes3.dex */
public class C3655 implements InterfaceC23180 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final BitSet f12501;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11858 f12502;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f12503;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f12504;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final ArrayList f12505;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C2711 f12506;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C9422 f12507;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final BitSet f12508;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f12509 = new IdentityHashMap();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C0805 f12510;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public HashMap f12511;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final HashMap f12512;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final ArrayList f12513;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public int f12514;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f12515;

    public C3655(C11858 c11858) {
        this.f12502 = c11858;
        ArrayList arrayList = new ArrayList(c11858.m29715());
        arrayList.add(new C2909());
        arrayList.add(new C7384());
        arrayList.add(new C11024());
        arrayList.add(new C1418());
        arrayList.add(new C19975());
        this.f12513 = arrayList;
        List listM29712 = c11858.m29712();
        HashMap map = new HashMap();
        Object[] objArr = {new C10366(), new C11770()};
        ArrayList arrayList2 = new ArrayList(2);
        int iM9136 = 0;
        while (iM9136 < 2) {
            Object obj = objArr[iM9136];
            iM9136 = C2764.m9136(obj, arrayList2, obj, iM9136, 1);
        }
        m11842(C4681.unmodifiableList(arrayList2), map);
        m11842(listM29712, map);
        this.f12512 = map;
        ArrayList arrayList3 = new ArrayList(c11858.m29716());
        arrayList3.add(new C5059());
        this.f12505 = arrayList3;
        Set setM29713 = c11858.m29713();
        BitSet bitSet = new BitSet();
        Iterator it = setM29713.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        bitSet.set(33);
        this.f12501 = bitSet;
        int iM29714 = c11858.m29714();
        this.f12515 = iM29714;
        this.f12503 = iM29714 != Integer.MAX_VALUE;
        Set setKeySet = this.f12512.keySet();
        ArrayList arrayList4 = this.f12513;
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            bitSet2.set(((Character) it2.next()).charValue());
        }
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((InterfaceC0059) it3.next()).mo978().iterator();
            while (it4.hasNext()) {
                bitSet2.set(((Character) it4.next()).charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        this.f12508 = bitSet2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11842(List list, HashMap map) {
        C0672 c0672;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC21907 interfaceC21907 = (InterfaceC21907) it.next();
            char cMo2907 = interfaceC21907.mo2907();
            char cMo2904 = interfaceC21907.mo2904();
            if (cMo2907 == cMo2904) {
                InterfaceC21907 interfaceC21908 = (InterfaceC21907) map.get(Character.valueOf(cMo2907));
                if (interfaceC21908 != null && interfaceC21908.mo2907() == interfaceC21908.mo2904()) {
                    if (interfaceC21908 instanceof C0672) {
                        c0672 = (C0672) interfaceC21908;
                    } else {
                        C0672 c0673 = new C0672(cMo2907);
                        c0673.m2906(interfaceC21908);
                        c0672 = c0673;
                    }
                    c0672.m2906(interfaceC21907);
                    map.put(Character.valueOf(cMo2907), c0672);
                } else {
                    m11841(cMo2907, interfaceC21907, map);
                }
            } else {
                m11841(cMo2907, interfaceC21907, map);
                m11841(cMo2904, interfaceC21907, map);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11841(char c, InterfaceC21907 interfaceC21907, HashMap map) {
        if (((InterfaceC21907) map.put(Character.valueOf(c), interfaceC21907)) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0805 m11850() {
        return this.f12510;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0221 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0232  */
    /* JADX WARN: Code duplicated, block: B:110:0x0234  */
    /* JADX WARN: Code duplicated, block: B:113:0x023c  */
    /* JADX WARN: Code duplicated, block: B:115:0x023f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0248  */
    /* JADX WARN: Code duplicated, block: B:123:0x0253  */
    /* JADX WARN: Code duplicated, block: B:125:0x0268  */
    /* JADX WARN: Code duplicated, block: B:127:0x026c  */
    /* JADX WARN: Code duplicated, block: B:158:0x033c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0393  */
    /* JADX WARN: Code duplicated, block: B:287:0x0177 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:288:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x011d  */
    /* JADX WARN: Code duplicated, block: B:42:0x012d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171 A[LOOP:5: B:40:0x0127->B:50:0x0171, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0177  */
    /* JADX WARN: Code duplicated, block: B:53:0x0185  */
    /* JADX WARN: Code duplicated, block: B:55:0x019d  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b7 A[LOOP:6: B:57:0x01af->B:59:0x01b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:86:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x020f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0212 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:99:0x021f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Override // l.InterfaceC23180
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo11851(C20942 c20942, AbstractC4534 abstractC4534) {
        List listM54899;
        ArrayList arrayList;
        Object obj;
        C16333 c16333;
        String strM47873;
        C23793 c23793;
        AbstractC4534 abstractC4534M16931;
        AbstractC4534 abstractC4534M11840;
        String strM40051;
        String strM40052;
        String strM47874;
        List list;
        InterfaceC21907 interfaceC21907;
        int iM3238;
        C9753 c9753M3237;
        ArrayList arrayList2;
        int iM3241;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        C17079 c17079;
        C2711 c2711;
        C2711 c2712;
        C9753 c9753M3238;
        Iterator it;
        C2076 c2076Mo2196;
        AbstractC4534 abstractC4534M7152;
        this.f12510 = C0805.m3226(c20942);
        int i = 1;
        this.f12504 = !c20942.m47875().isEmpty();
        char c = 0;
        this.f12514 = 0;
        ArrayList arrayList3 = null;
        this.f12506 = null;
        this.f12507 = null;
        this.f12509.clear();
        HashMap map = new HashMap();
        for (InterfaceC0059 interfaceC0059 : this.f12513) {
            InterfaceC17958 interfaceC17958Create = interfaceC0059.create();
            Iterator it2 = interfaceC0059.mo978().iterator();
            while (it2.hasNext()) {
                ((List) C11392.computeIfAbsent(map, (Character) it2.next(), new C4527(6))).add(interfaceC17958Create);
            }
        }
        this.f12511 = map;
        while (true) {
            char cM3234 = this.f12510.m3234();
            if (cM3234 == 0) {
                listM54899 = null;
            } else if (cM3234 != '\n') {
                if (cM3234 == '[') {
                    C9753 c9753M3239 = this.f12510.m3237();
                    this.f12510.m3240();
                    C9753 c9753M32310 = this.f12510.m3237();
                    C24672 c24672M11840 = m11840(this.f12510.m3230(c9753M3239, c9753M32310));
                    C9422 c9422M24793 = C9422.m24793(c24672M11840, c9753M3239, c9753M32310, this.f12507, this.f12506);
                    C9422 c9422 = this.f12507;
                    if (c9422 != null) {
                        c9422.f30573 = true;
                    }
                    this.f12507 = c9422M24793;
                    Object[] objArr = {c24672M11840};
                    arrayList = new ArrayList(1);
                    obj = objArr[0];
                } else if (cM3234 == ']') {
                    C9753 c9753M32311 = this.f12510.m3237();
                    this.f12510.m3240();
                    C9753 c9753M32312 = this.f12510.m3237();
                    C9422 c9423 = this.f12507;
                    if (c9423 == null) {
                        abstractC4534M11840 = m11840(this.f12510.m3230(c9753M32311, c9753M32312));
                    } else {
                        C24672 c24672 = c9423.f30570;
                        C9753 c9753 = c9423.f30571;
                        if (c9423.f30566) {
                            C9753 c9753M32313 = this.f12510.m3237();
                            C0805 c0805 = this.f12510;
                            if (c0805.m3235('(')) {
                                c0805.m3236();
                                char cM3235 = c0805.m3234();
                                C9753 c9753M32314 = c0805.m3237();
                                if (C12295.m30689(c0805)) {
                                    if (cM3235 == '<') {
                                        c16333 = arrayList3;
                                        strM40051 = arrayList3;
                                        strM47874 = C1402.m5124(i, i, c0805.m3230(c9753M32314, c0805.m3237()).m47873());
                                    } else {
                                        c16333 = arrayList3;
                                        strM40051 = arrayList3;
                                        strM47874 = c0805.m3230(c9753M32314, c0805.m3237()).m47873();
                                    }
                                    strM40051 = C16991.m40051(strM47874);
                                }
                                if (strM40051 != 0) {
                                    if (c0805.m3236() >= i) {
                                        C9753 c9753M32315 = c0805.m3237();
                                        if (C12295.m30691(c0805)) {
                                            String strM47875 = c0805.m3230(c9753M32315, c0805.m3237()).m47873();
                                            strM40052 = C16991.m40051(strM47875.substring(i, strM47875.length() - i));
                                        } else {
                                            strM40052 = null;
                                        }
                                        c0805.m3236();
                                    } else {
                                        strM40052 = null;
                                    }
                                    if (c0805.m3235(')')) {
                                        c16333 = new C16333(strM40051, strM40052);
                                    } else {
                                        c16333 = 0;
                                    }
                                } else {
                                    c16333 = 0;
                                }
                            }
                            if (c16333 != 0) {
                                c23793 = new C23793(c9423.f30570, this.f12510.m3230(c9753, c9753M32311).m47873(), null, c16333.f53049, c16333.f53050);
                            } else {
                                this.f12510.m3231(c9753M32313);
                                C0805 c0806 = this.f12510;
                                if (c0806.m3235('[')) {
                                    C9753 c9753M32316 = c0806.m3237();
                                    if (C12295.m30692(c0806)) {
                                        C9753 c9753M32317 = c0806.m3237();
                                        if (c0806.m3235(']')) {
                                            strM47873 = c0806.m3230(c9753M32316, c9753M32317).m47873();
                                            if (strM47873.length() > 999) {
                                                strM47873 = null;
                                            }
                                        } else {
                                            strM47873 = null;
                                        }
                                    } else {
                                        strM47873 = null;
                                    }
                                } else {
                                    strM47873 = null;
                                }
                                String str = strM47873;
                                if (str == null) {
                                    this.f12510.m3231(c9753M32313);
                                }
                                c23793 = (c9423.f30573 && (str == null || str.isEmpty()) && c24672 == null) ? null : new C23793(c9423.f30570, this.f12510.m3230(c9753, c9753M32311).m47873(), str, null, null);
                            }
                            C9753 c9754 = c9423.f30574;
                            C9753 c9755 = c9423.f30567;
                            C2711 c2713 = c9423.f30569;
                            AbstractC4534 abstractC4535 = c9423.f30568;
                            if (c23793 != null) {
                                C9753 c9753M32318 = this.f12510.m3237();
                                Iterator it3 = this.f12505.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        C5805 c5805Mo15305 = ((InterfaceC18704) it3.next()).mo15305(c23793, this.f12510, this.f12502);
                                        if (C1402.m5130(c5805Mo15305)) {
                                            abstractC4534M16931 = c5805Mo15305.m16931();
                                            C9753 c9753M16934 = c5805Mo15305.m16934();
                                            boolean zM16933 = c5805Mo15305.m16933();
                                            int i2 = C25285.f81671[c5805Mo15305.m16932().ordinal()];
                                            if (i2 != 1) {
                                                if (i2 == 2) {
                                                    this.f12510.m3231(c9753M16934);
                                                    while (true) {
                                                        C2711 c2714 = this.f12506;
                                                        if (c2714 == null || c2714 == c2713) {
                                                            break;
                                                        } else {
                                                            m11849(c2714);
                                                        }
                                                    }
                                                    if (this.f12504) {
                                                        if (zM16933 && c9755 != null) {
                                                            c9754 = c9755;
                                                        }
                                                        C0805 c0807 = this.f12510;
                                                        abstractC4534M16931.m14255(c0807.m3230(c9754, c0807.m3237()).m47875());
                                                    }
                                                    m11847();
                                                    if (zM16933 && c24672 != null) {
                                                        abstractC4535 = c24672;
                                                    }
                                                    while (abstractC4535 != null) {
                                                        AbstractC4534 abstractC4534M14261 = abstractC4535.m14261();
                                                        abstractC4535.m14260();
                                                        abstractC4535 = abstractC4534M14261;
                                                    }
                                                    m11845(abstractC4534M16931, m11839(abstractC4534M16931.m14254(), (C24672) null) + 1);
                                                    if (c24672 != null && zM16933) {
                                                        break;
                                                    }
                                                    for (C9422 c9424 = this.f12507; c9424 != null; c9424 = c9424.f30565) {
                                                        if (c9424.f30570 == null) {
                                                            c9424.f30566 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            } else {
                                                this.f12510.m3231(c9753M16934);
                                                if (!this.f12503 || c9423.f30572 < this.f12515) {
                                                    AbstractC4534 abstractC4534M14262 = abstractC4535.m14261();
                                                    while (abstractC4534M14262 != null) {
                                                        AbstractC4534 abstractC4534M14263 = abstractC4534M14262.m14261();
                                                        abstractC4534M16931.m14256(abstractC4534M14262);
                                                        abstractC4534M14262 = abstractC4534M14263;
                                                    }
                                                    if (this.f12504) {
                                                        if (zM16933 && c9755 != null) {
                                                            c9754 = c9755;
                                                        }
                                                        C0805 c0808 = this.f12510;
                                                        abstractC4534M16931.m14255(c0808.m3230(c9754, c0808.m3237()).m47875());
                                                    }
                                                    m11843(c2713);
                                                    m11844(abstractC4534M16931);
                                                    if (zM16933 && c24672 != null) {
                                                        c24672.m14260();
                                                    }
                                                    abstractC4535.m14260();
                                                    m11847();
                                                    m11845(abstractC4534M16931, c9423.f30572 + 1);
                                                    if (c24672 != null) {
                                                        break;
                                                    }
                                                    for (C9422 c9425 = this.f12507; c9425 != null; c9425 = c9425.f30565) {
                                                        if (c9425.f30570 == null) {
                                                            c9425.f30566 = false;
                                                        }
                                                    }
                                                    break;
                                                }
                                            }
                                        } else {
                                            this.f12510.m3231(c9753M32318);
                                        }
                                        c23793 = c23793;
                                    }
                                    abstractC4534M16931 = null;
                                    break;
                                }
                            }
                            abstractC4534M16931 = null;
                            break;
                            if (abstractC4534M16931 != null) {
                                abstractC4534M11840 = abstractC4534M16931;
                            } else {
                                this.f12510.m3231(c9753M32312);
                                m11847();
                                abstractC4534M11840 = m11840(this.f12510.m3230(c9753M32311, c9753M32312));
                            }
                        } else {
                            m11847();
                            abstractC4534M11840 = m11840(this.f12510.m3230(c9753M32311, c9753M32312));
                        }
                    }
                    Object[] objArr2 = {abstractC4534M11840};
                    ArrayList arrayList4 = new ArrayList(1);
                    Object obj2 = objArr2[0];
                    listM54899 = C24579.m54899(obj2, arrayList4, obj2, arrayList4);
                } else if (this.f12501.get(cM3234)) {
                    C9753 c9753M32319 = this.f12510.m3237();
                    C9753 c9753M32320 = this.f12510.m3237();
                    this.f12510.m3240();
                    C9753 c9753M32321 = this.f12510.m3237();
                    if (this.f12510.m3235('[')) {
                        C9753 c9753M32322 = this.f12510.m3237();
                        C24672 c24672M11841 = m11840(this.f12510.m3230(c9753M32320, c9753M32321));
                        C24672 c24672M11842 = m11840(this.f12510.m3230(c9753M32321, c9753M32322));
                        C9422 c9422M24794 = C9422.m24794(c24672M11841, c9753M32320, c24672M11842, c9753M32321, c9753M32322, this.f12507, this.f12506);
                        C9422 c9426 = this.f12507;
                        if (c9426 != null) {
                            c9426.f30573 = i;
                        }
                        this.f12507 = c9422M24794;
                        Object[] objArr3 = new Object[2];
                        objArr3[c] = c24672M11841;
                        objArr3[i] = c24672M11842;
                        ArrayList arrayList5 = new ArrayList(2);
                        int iM9136 = 0;
                        while (iM9136 < 2) {
                            Object obj3 = objArr3[iM9136];
                            iM9136 = C2764.m9136(obj3, arrayList5, obj3, iM9136, i);
                        }
                        listM54899 = C4681.unmodifiableList(arrayList5);
                    } else {
                        listM54899 = arrayList3;
                    }
                    if (listM54899 == null) {
                        this.f12510.m3231(c9753M32319);
                        if (this.f12508.get(cM3234)) {
                            list = (List) this.f12511.get(Character.valueOf(cM3234));
                            if (list != null) {
                                c9753M3238 = this.f12510.m3237();
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        c2076Mo2196 = ((InterfaceC17958) it.next()).mo2196(this);
                                        if (c2076Mo2196 != null) {
                                            abstractC4534M7152 = c2076Mo2196.m7152();
                                            this.f12510.m3231(c2076Mo2196.m7153());
                                            if (this.f12504 && abstractC4534M7152.m14263().isEmpty()) {
                                                C0805 c0809 = this.f12510;
                                                abstractC4534M7152.m14255(c0809.m3230(c9753M3238, c0809.m3237()).m47875());
                                            }
                                            Object[] objArr4 = new Object[i];
                                            objArr4[c] = abstractC4534M7152;
                                            arrayList = new ArrayList(i);
                                            obj = objArr4[c];
                                        } else {
                                            this.f12510.m3231(c9753M3238);
                                        }
                                    } else {
                                        interfaceC21907 = (InterfaceC21907) this.f12512.get(Character.valueOf(cM3234));
                                        if (interfaceC21907 != null) {
                                            iM3238 = this.f12510.m3238();
                                            c9753M3237 = this.f12510.m3237();
                                            if (this.f12510.m3239(cM3234) < interfaceC21907.mo2908()) {
                                                this.f12510.m3231(c9753M3237);
                                                c17079 = arrayList3;
                                            } else {
                                                arrayList2 = new ArrayList();
                                                this.f12510.m3231(c9753M3237);
                                                while (this.f12510.m3235(cM3234)) {
                                                    C0805 c08010 = this.f12510;
                                                    arrayList2.add(m11840(c08010.m3230(c9753M3237, c08010.m3237())));
                                                    c9753M3237 = this.f12510.m3237();
                                                }
                                                iM3241 = this.f12510.m3241();
                                                if (iM3238 != 0 || C6790.m18960(iM3238)) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                if (iM3238 != 0 || C6790.m18975(iM3238)) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (iM3241 != 0 || C6790.m18960(iM3241)) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                if (iM3241 != 0 || C6790.m18975(iM3241)) {
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
                                                if (cM3234 == '_') {
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
                                                    if (z5 || cM3234 != interfaceC21907.mo2907()) {
                                                        z7 = false;
                                                    } else {
                                                        z7 = true;
                                                    }
                                                    if (z6 || cM3234 != interfaceC21907.mo2904()) {
                                                        z8 = false;
                                                    } else {
                                                        z8 = true;
                                                    }
                                                    z9 = z7;
                                                }
                                                c17079 = new C17079(arrayList2, z9, z8);
                                            }
                                            if (c17079 != 0) {
                                                arrayList3 = c17079.f55762;
                                                c2711 = new C2711(arrayList3, cM3234, c17079.f55763, c17079.f55761, this.f12506);
                                                this.f12506 = c2711;
                                                c2712 = c2711.f9056;
                                                if (c2712 != null) {
                                                    c2712.f9058 = c2711;
                                                }
                                            }
                                            if (arrayList3 != null) {
                                                listM54899 = arrayList3;
                                            }
                                        }
                                        Object[] objArr5 = new Object[i];
                                        objArr5[c] = m11848();
                                        arrayList = new ArrayList(i);
                                        obj = objArr5[c];
                                    }
                                }
                            } else {
                                interfaceC21907 = (InterfaceC21907) this.f12512.get(Character.valueOf(cM3234));
                                if (interfaceC21907 != null) {
                                    iM3238 = this.f12510.m3238();
                                    c9753M3237 = this.f12510.m3237();
                                    if (this.f12510.m3239(cM3234) < interfaceC21907.mo2908()) {
                                        this.f12510.m3231(c9753M3237);
                                        c17079 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f12510.m3231(c9753M3237);
                                        while (this.f12510.m3235(cM3234)) {
                                            C0805 c08011 = this.f12510;
                                            arrayList2.add(m11840(c08011.m3230(c9753M3237, c08011.m3237())));
                                            c9753M3237 = this.f12510.m3237();
                                        }
                                        iM3241 = this.f12510.m3241();
                                        if (iM3238 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM3238 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM3241 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM3241 != 0) {
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
                                        if (cM3234 == '_') {
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
                                        c17079 = new C17079(arrayList2, z9, z8);
                                    }
                                    if (c17079 != 0) {
                                        arrayList3 = c17079.f55762;
                                        c2711 = new C2711(arrayList3, cM3234, c17079.f55763, c17079.f55761, this.f12506);
                                        this.f12506 = c2711;
                                        c2712 = c2711.f9056;
                                        if (c2712 != null) {
                                            c2712.f9058 = c2711;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listM54899 = arrayList3;
                                    }
                                }
                                Object[] objArr6 = new Object[i];
                                objArr6[c] = m11848();
                                arrayList = new ArrayList(i);
                                obj = objArr6[c];
                            }
                        } else {
                            Object[] objArr7 = new Object[i];
                            objArr7[c] = m11848();
                            arrayList = new ArrayList(i);
                            obj = objArr7[c];
                        }
                    }
                } else if (this.f12508.get(cM3234)) {
                    Object[] objArr8 = new Object[i];
                    objArr8[c] = m11848();
                    arrayList = new ArrayList(i);
                    obj = objArr8[c];
                } else {
                    list = (List) this.f12511.get(Character.valueOf(cM3234));
                    if (list != null) {
                        c9753M3238 = this.f12510.m3237();
                        it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                c2076Mo2196 = ((InterfaceC17958) it.next()).mo2196(this);
                                if (c2076Mo2196 != null) {
                                    abstractC4534M7152 = c2076Mo2196.m7152();
                                    this.f12510.m3231(c2076Mo2196.m7153());
                                    if (this.f12504) {
                                        C0805 c08012 = this.f12510;
                                        abstractC4534M7152.m14255(c08012.m3230(c9753M3238, c08012.m3237()).m47875());
                                    }
                                    Object[] objArr9 = new Object[i];
                                    objArr9[c] = abstractC4534M7152;
                                    arrayList = new ArrayList(i);
                                    obj = objArr9[c];
                                } else {
                                    this.f12510.m3231(c9753M3238);
                                }
                            } else {
                                interfaceC21907 = (InterfaceC21907) this.f12512.get(Character.valueOf(cM3234));
                                if (interfaceC21907 != null) {
                                    iM3238 = this.f12510.m3238();
                                    c9753M3237 = this.f12510.m3237();
                                    if (this.f12510.m3239(cM3234) < interfaceC21907.mo2908()) {
                                        this.f12510.m3231(c9753M3237);
                                        c17079 = arrayList3;
                                    } else {
                                        arrayList2 = new ArrayList();
                                        this.f12510.m3231(c9753M3237);
                                        while (this.f12510.m3235(cM3234)) {
                                            C0805 c08013 = this.f12510;
                                            arrayList2.add(m11840(c08013.m3230(c9753M3237, c08013.m3237())));
                                            c9753M3237 = this.f12510.m3237();
                                        }
                                        iM3241 = this.f12510.m3241();
                                        if (iM3238 != 0) {
                                            z = true;
                                        } else {
                                            z = true;
                                        }
                                        if (iM3238 != 0) {
                                            z2 = true;
                                        } else {
                                            z2 = true;
                                        }
                                        if (iM3241 != 0) {
                                            z3 = true;
                                        } else {
                                            z3 = true;
                                        }
                                        if (iM3241 != 0) {
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
                                        if (cM3234 == '_') {
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
                                        c17079 = new C17079(arrayList2, z9, z8);
                                    }
                                    if (c17079 != 0) {
                                        arrayList3 = c17079.f55762;
                                        c2711 = new C2711(arrayList3, cM3234, c17079.f55763, c17079.f55761, this.f12506);
                                        this.f12506 = c2711;
                                        c2712 = c2711.f9056;
                                        if (c2712 != null) {
                                            c2712.f9058 = c2711;
                                        }
                                    }
                                    if (arrayList3 != null) {
                                        listM54899 = arrayList3;
                                    }
                                }
                                Object[] objArr10 = new Object[i];
                                objArr10[c] = m11848();
                                arrayList = new ArrayList(i);
                                obj = objArr10[c];
                            }
                        }
                    } else {
                        interfaceC21907 = (InterfaceC21907) this.f12512.get(Character.valueOf(cM3234));
                        if (interfaceC21907 != null) {
                            iM3238 = this.f12510.m3238();
                            c9753M3237 = this.f12510.m3237();
                            if (this.f12510.m3239(cM3234) < interfaceC21907.mo2908()) {
                                this.f12510.m3231(c9753M3237);
                                c17079 = arrayList3;
                            } else {
                                arrayList2 = new ArrayList();
                                this.f12510.m3231(c9753M3237);
                                while (this.f12510.m3235(cM3234)) {
                                    C0805 c08014 = this.f12510;
                                    arrayList2.add(m11840(c08014.m3230(c9753M3237, c08014.m3237())));
                                    c9753M3237 = this.f12510.m3237();
                                }
                                iM3241 = this.f12510.m3241();
                                if (iM3238 != 0) {
                                    z = true;
                                } else {
                                    z = true;
                                }
                                if (iM3238 != 0) {
                                    z2 = true;
                                } else {
                                    z2 = true;
                                }
                                if (iM3241 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                if (iM3241 != 0) {
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
                                if (cM3234 == '_') {
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
                                c17079 = new C17079(arrayList2, z9, z8);
                            }
                            if (c17079 != 0) {
                                arrayList3 = c17079.f55762;
                                c2711 = new C2711(arrayList3, cM3234, c17079.f55763, c17079.f55761, this.f12506);
                                this.f12506 = c2711;
                                c2712 = c2711.f9056;
                                if (c2712 != null) {
                                    c2712.f9058 = c2711;
                                }
                            }
                            if (arrayList3 != null) {
                                listM54899 = arrayList3;
                            }
                        }
                        Object[] objArr11 = new Object[i];
                        objArr11[c] = m11848();
                        arrayList = new ArrayList(i);
                        obj = objArr11[c];
                    }
                }
                listM54899 = C24579.m54899(obj, arrayList, obj, arrayList);
            } else {
                this.f12510.m3240();
                boolean z10 = this.f12514 >= 2;
                this.f12514 = 0;
                Object[] objArr12 = {z10 ? new C0584() : new C12737()};
                ArrayList arrayList6 = new ArrayList(1);
                Object obj4 = objArr12[0];
                listM54899 = C24579.m54899(obj4, arrayList6, obj4, arrayList6);
            }
            if (listM54899 == null) {
                m11843((C2711) null);
                m11844(abstractC4534);
                return;
            }
            arrayList3 = null;
            Iterator it4 = listM54899.iterator();
            while (it4.hasNext()) {
                abstractC4534.m14256((AbstractC4534) it4.next());
            }
            c = 0;
            i = 1;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C24672 m11840(C20942 c20942) {
        C24672 c24672 = new C24672(c20942.m47873());
        c24672.m14255(c20942.m47875());
        return c24672;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private void m11847() {
        int i;
        C9422 c9422 = this.f12507;
        C9422 c9423 = c9422.f30565;
        this.f12507 = c9423;
        if (c9423 == null || (i = c9422.f30572) <= c9423.f30572) {
            return;
        }
        c9423.f30572 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C24672 m11848() {
        char cM3234;
        C9753 c9753M3237 = this.f12510.m3237();
        this.f12510.m3240();
        while (true) {
            cM3234 = this.f12510.m3234();
            if (cM3234 == 0 || this.f12508.get(cM3234)) {
                break;
            }
            this.f12510.m3240();
        }
        C0805 c0805 = this.f12510;
        C20942 c20942M3230 = c0805.m3230(c9753M3237, c0805.m3237());
        String strM47873 = c20942M3230.m47873();
        if (cM3234 == '\n') {
            int length = strM47873.length();
            do {
                length--;
                if (length < 0) {
                    length = -1;
                    break;
                }
            } while (strM47873.charAt(length) == ' ');
            int i = length + 1;
            this.f12514 = strM47873.length() - i;
            strM47873 = strM47873.substring(0, i);
        } else if (cM3234 == 0) {
            strM47873 = strM47873.substring(0, C6790.m18973(strM47873.length() - 1, 0, strM47873) + 1);
        }
        C24672 c24672 = new C24672(strM47873);
        c24672.m14255(c20942M3230.m47875());
        return c24672;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11843(C2711 c2711) {
        int i;
        boolean z;
        AbstractC4534 abstractC4534M14261;
        HashMap map = new HashMap();
        C2711 c2712 = this.f12506;
        while (c2712 != null) {
            C2711 c2713 = c2712.f9056;
            if (c2713 == c2711) {
                break;
            } else {
                c2712 = c2713;
            }
        }
        while (c2712 != null) {
            ArrayList arrayList = c2712.f9055;
            char c = c2712.f9060;
            InterfaceC21907 interfaceC21907 = (InterfaceC21907) this.f12512.get(Character.valueOf(c));
            if (!c2712.m9029() || interfaceC21907 == null) {
                c2712 = c2712.f9058;
            } else {
                C17825 c17825 = new C17825(c, (c2712.m9033() % 3) + (c2712.m9032() ? 3 : 0));
                C2711 c2714 = (C2711) map.get(c17825);
                char cMo2907 = interfaceC21907.mo2907();
                C2711 c2715 = c2712.f9056;
                C24672 c24672 = (C24672) arrayList.get(0);
                int i2 = 0;
                int iMo2905 = 0;
                while (true) {
                    if (c2715 != null && c2715 != c2711 && c2715 != c2714) {
                        if (this.f12503) {
                            int iMax = Math.max(i2, m11839(c2715.m9030().m14261(), c24672));
                            C24672 c24672M9030 = c2715.m9030();
                            if (iMax < this.f12515) {
                                i2 = iMax;
                                c24672 = c24672M9030;
                            }
                        }
                        if (c2715.m9032() && c2715.f9060 == cMo2907 && (iMo2905 = interfaceC21907.mo2905(c2715, c2712)) > 0) {
                            i = i2 + 1;
                            abstractC4534M14261 = c2715.m9030().m14261();
                            z = true;
                            break;
                        }
                        c2715 = c2715.f9056;
                    }
                    abstractC4534M14261 = null;
                    z = false;
                    i = 0;
                    break;
                }
                if (z) {
                    for (int i3 = 0; i3 < iMo2905; i3++) {
                        ((C24672) C18011.m41990(c2715.f9055, 1)).m14260();
                    }
                    for (int i4 = 0; i4 < iMo2905; i4++) {
                        ((C24672) arrayList.remove(0)).m14260();
                    }
                    C2711 c2716 = c2712.f9056;
                    while (c2716 != null && c2716 != c2715) {
                        C2711 c2717 = c2716.f9056;
                        m11849(c2716);
                        c2716 = c2717;
                    }
                    if (abstractC4534M14261 != null) {
                        m11845(abstractC4534M14261, i);
                    }
                    if (c2715.f9055.size() == 0) {
                        m11849(c2715);
                    }
                    if (arrayList.size() == 0) {
                        C2711 c2718 = c2712.f9058;
                        m11849(c2712);
                        c2712 = c2718;
                    }
                } else {
                    map.put(c17825, c2712.f9056);
                    if (!c2712.m9032()) {
                        m11849(c2712);
                    }
                    c2712 = c2712.f9058;
                }
            }
        }
        while (true) {
            C2711 c2719 = this.f12506;
            if (c2719 == null || c2719 == c2711) {
                return;
            } else {
                m11849(c2719);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11845(AbstractC4534 abstractC4534, int i) {
        if (this.f12503) {
            this.f12509.put(abstractC4534, Integer.valueOf(i));
            C9422 c9422 = this.f12507;
            if (c9422 == null || i <= c9422.f30572) {
                return;
            }
            c9422.f30572 = i;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private int m11839(AbstractC4534 abstractC4534, C24672 c24672) {
        int iIntValue = 0;
        while (abstractC4534 != null && abstractC4534 != c24672) {
            Integer num = (Integer) this.f12509.get(abstractC4534);
            if (num != null && num.intValue() > iIntValue) {
                iIntValue = num.intValue();
            }
            abstractC4534 = abstractC4534.m14261();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private void m11849(C2711 c2711) {
        C2711 c2712 = c2711.f9056;
        if (c2712 != null) {
            c2712.f9058 = c2711.f9058;
        }
        C2711 c2713 = c2711.f9058;
        if (c2713 == null) {
            this.f12506 = c2712;
        } else {
            c2713.f9056 = c2712;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11844(AbstractC4534 abstractC4534) {
        if (abstractC4534.m14254() == null) {
            return;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(abstractC4534);
        while (!arrayDeque.isEmpty()) {
            AbstractC4534 abstractC4535 = (AbstractC4534) arrayDeque.removeLast();
            AbstractC4534 abstractC4534M14265 = abstractC4535.m14265();
            int length = 0;
            C24672 c24672 = null;
            C24672 c24673 = null;
            for (AbstractC4534 abstractC4534M14254 = abstractC4535.m14254(); abstractC4534M14254 != null; abstractC4534M14254 = abstractC4534M14254.m14261()) {
                if (abstractC4534M14254 instanceof C24672) {
                    c24673 = (C24672) abstractC4534M14254;
                    if (c24672 == null) {
                        c24672 = c24673;
                    }
                    length = c24673.m55016().length() + length;
                } else {
                    m11846(c24672, c24673, length);
                    if (abstractC4534M14254.m14254() != null) {
                        arrayDeque.addLast(abstractC4534M14254);
                    }
                    length = 0;
                    c24672 = null;
                    c24673 = null;
                }
                if (abstractC4534M14254 == abstractC4534M14265) {
                    break;
                }
            }
            m11846(c24672, c24673, length);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m11846(C24672 c24672, C24672 c24673, int i) {
        C1551 c1551;
        if (c24672 == null || c24673 == null || c24672 == c24673) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(c24672.m55016());
        if (this.f12504) {
            c1551 = new C1551();
            c1551.m5481(c24672.m14263());
        } else {
            c1551 = null;
        }
        AbstractC4534 abstractC4534M14261 = c24672.m14261();
        AbstractC4534 abstractC4534M14262 = c24673.m14261();
        while (abstractC4534M14261 != abstractC4534M14262) {
            sb.append(((C24672) abstractC4534M14261).m55016());
            if (c1551 != null) {
                c1551.m5481(abstractC4534M14261.m14263());
            }
            AbstractC4534 abstractC4534M14263 = abstractC4534M14261.m14261();
            abstractC4534M14261.m14260();
            abstractC4534M14261 = abstractC4534M14263;
        }
        c24672.m55017(sb.toString());
        if (c1551 != null) {
            c24672.m14255(c1551.m5480());
        }
    }
}
