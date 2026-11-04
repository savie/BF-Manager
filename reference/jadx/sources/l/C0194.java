package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.֡ۙܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C0194 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public int[] f1304;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f1305;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f1307;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ArrayList f1310;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24564 f1312;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C21077[] f1313;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C13791 f1314;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public HashMap f1309 = new HashMap();

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public ArrayList f1308 = new ArrayList();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public HashMap f1306 = new HashMap();

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f1311 = true;

    /* JADX WARN: Code duplicated, block: B:164:0x0470  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13791 m1560(boolean z, C3177 c3177, C24564 c24564) {
        HashMap map;
        this.f1312 = c24564;
        C13791 c13791 = new C13791();
        c13791.f43749 = c3177.m10375();
        c13791.f43753 = c3177.m10372();
        c13791.f43755 = c3177.m10371();
        c13791.f43757 = c3177.m10374();
        c13791.f43756 = z;
        this.f1314 = c13791;
        C10391 c10391 = c24564.f79617;
        if (c10391 != null) {
            for (AbstractC19342 abstractC19342 : c10391.f33037) {
                if (abstractC19342 instanceof C21580) {
                    C17347 c17347 = abstractC19342.f62503;
                    HashMap map2 = this.f1306;
                    if (!map2.containsKey(c17347)) {
                        C11817 c11817 = new C11817();
                        c11817.f38145 = ((C21580) abstractC19342).f68940;
                        map2.put(c17347, c11817);
                    }
                }
            }
        }
        this.f1310 = c24564.f79619;
        int i = 0;
        while (true) {
            int size = this.f1310.size();
            map = this.f1309;
            if (i >= size) {
                break;
            }
            AbstractC15283 abstractC15283 = (AbstractC15283) this.f1310.get(i);
            abstractC15283.f49968 = i;
            if (abstractC15283 instanceof C19759) {
                C19759 c19759 = (C19759) abstractC15283;
                map.put(c19759.f63602, c19759);
            }
            i++;
        }
        if (this.f1312.f79620 != null) {
            LinkedList linkedList = new LinkedList();
            TreeSet treeSet = new TreeSet();
            Iterator it = this.f1312.f79620.iterator();
            while (it.hasNext()) {
                for (C17347 c17348 : ((C7409) it.next()).f24415) {
                    int iM1563 = m1563(c17348);
                    linkedList.add(Integer.valueOf(iM1563 + 1));
                    treeSet.add(Integer.valueOf(iM1563));
                }
            }
            linkedList.add(0);
            HashMap map3 = new HashMap();
            BitSet bitSet = new BitSet(this.f1310.size());
            while (!linkedList.isEmpty()) {
                Integer num = (Integer) linkedList.poll();
                int iIntValue = num.intValue();
                if (!bitSet.get(iIntValue)) {
                    bitSet.set(iIntValue);
                    if (treeSet.contains(num)) {
                        map3.put(num, null);
                    }
                    AbstractC15283 abstractC15284 = (AbstractC15283) this.f1310.get(num.intValue());
                    EnumC1114 enumC1114 = abstractC15284.f49969;
                    if (enumC1114 == null) {
                        linkedList.add(Integer.valueOf(iIntValue + 1));
                    } else {
                        if (enumC1114.m4135()) {
                            linkedList.add(Integer.valueOf(iIntValue + 1));
                        }
                        if (enumC1114.m4132()) {
                            linkedList.add(Integer.valueOf(m1563(((C11554) abstractC15284).f36338)));
                        }
                        if (enumC1114.m4133()) {
                            for (C17347 c17349 : ((AbstractC10808) abstractC15284).f34296) {
                                linkedList.add(Integer.valueOf(m1563(c17349)));
                            }
                        }
                    }
                }
            }
            if (map3.size() > 0) {
                Iterator it2 = this.f1312.f79620.iterator();
                while (it2.hasNext()) {
                    C17347[] c17347Arr = ((C7409) it2.next()).f24415;
                    for (int i2 = 0; i2 < c17347Arr.length; i2++) {
                        C17347 c173410 = c17347Arr[i2];
                        int iM1564 = m1563(c173410);
                        if (map3.containsKey(Integer.valueOf(iM1564))) {
                            C17347 c173411 = (C17347) map3.get(Integer.valueOf(iM1564));
                            if (c173411 == null) {
                                c173411 = new C17347();
                                map3.put(Integer.valueOf(iM1564), c173411);
                                C19759 c197510 = new C19759(c173411);
                                c197510.f49968 = this.f1310.size();
                                this.f1310.add(c197510);
                                map.put(c173411, c197510);
                                C11554 c11554 = new C11554(EnumC1114.f3966, 0, 0, c173410);
                                c11554.f49968 = this.f1310.size();
                                this.f1310.add(c11554);
                            }
                            c17347Arr[i2] = c173411;
                        }
                    }
                }
            }
        }
        BitSet[] bitSetArr = new BitSet[this.f1310.size()];
        int size2 = this.f1310.size();
        int[] iArr = new int[size2];
        this.f1304 = iArr;
        int i3 = 1;
        iArr[0] = 1;
        for (AbstractC15283 abstractC15285 : this.f1310) {
            EnumC1114 enumC1115 = abstractC15285.f49969;
            if (enumC1115 == null) {
                int i4 = abstractC15285.f49968;
                if (i4 < size2 - 1) {
                    int i5 = i4 + 1;
                    iArr[i5] = iArr[i5] + 1;
                }
            } else {
                if (enumC1115.m4132()) {
                    int iM1565 = m1563(((C11554) abstractC15285).f36338);
                    iArr[iM1565] = iArr[iM1565] + 1;
                }
                if (enumC1115.m4133()) {
                    for (C17347 c173412 : ((AbstractC10808) abstractC15285).f34296) {
                        int iM1566 = m1563(c173412);
                        iArr[iM1566] = iArr[iM1566] + 1;
                    }
                }
                if (enumC1115.m4135()) {
                    int i6 = abstractC15285.f49968 + 1;
                    iArr[i6] = iArr[i6] + 1;
                }
            }
        }
        BitSet bitSet2 = new BitSet(this.f1310.size());
        ArrayList<C7409> arrayList = c24564.f79620;
        if (arrayList != null) {
            for (C7409 c7409 : arrayList) {
                C17347[] c17347Arr2 = c7409.f24415;
                C17347 c173413 = c7409.f24414;
                C17347 c173414 = c7409.f24413;
                for (C17347 c173415 : c17347Arr2) {
                    bitSet2.set(m1563(c173415));
                }
                int iM1567 = m1563(c173414);
                boolean z2 = false;
                for (int iM1568 = m1563(c173413) + i3; iM1568 < iM1567; iM1568++) {
                    EnumC1114 enumC1116 = ((AbstractC15283) this.f1310.get(iM1568)).f49969;
                    if (enumC1116 != null && enumC1116.m4131()) {
                        BitSet bitSet3 = bitSetArr[iM1568];
                        if (bitSet3 == null) {
                            bitSet3 = new BitSet(this.f1310.size());
                            bitSetArr[iM1568] = bitSet3;
                        }
                        for (C17347 c173416 : c17347Arr2) {
                            int iM1569 = m1563(c173416);
                            bitSet3.set(iM1569);
                            int[] iArr2 = this.f1304;
                            iArr2[iM1569] = iArr2[iM1569] + 1;
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    ArrayList arrayList2 = this.f1314.f43748;
                    C11817 c11817M1559 = m1559(c173413);
                    C11817 c11817M15510 = m1559(c173414);
                    C11817[] c11817Arr = new C11817[c17347Arr2.length];
                    for (int i7 = 0; i7 < c17347Arr2.length; i7++) {
                        c11817Arr[i7] = m1559(c17347Arr2[i7]);
                    }
                    arrayList2.add(new C13397(c11817M1559, c11817M15510, c11817Arr, c7409.f24416));
                }
                i3 = 1;
            }
        }
        C3923 c3923 = new C3923(this);
        this.f1313 = new C21077[this.f1310.size()];
        this.f1307 = new ArrayList[this.f1310.size()];
        BitSet bitSet4 = new BitSet(this.f1310.size());
        ArrayList arrayList3 = this.f1308;
        this.f1305 = arrayList3;
        C24564 c24565 = this.f1312;
        C13791 c13792 = this.f1314;
        C21077 c21077 = new C21077(c24565.f79618);
        int i8 = c24565.f79618;
        int i9 = 0;
        for (String str : c13792.f43749) {
            char cCharAt = str.charAt(0);
            i9 += (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        }
        int i10 = i8 - i9;
        if (!c13792.f43756) {
            C4448 c4448M1556 = m1556();
            m1561(new C20022(EnumC20768.IDENTITY, c4448M1556, new C8177(EnumC22260.THIS_REF, c13792.f43755, -1)));
            c21077.m14878(i10 - 1, new C18093(c4448M1556));
        }
        for (int i11 = 0; i11 < c13792.f43749.length; i11++) {
            C4448 c4448M1557 = m1556();
            m1561(new C20022(EnumC20768.IDENTITY, c4448M1557, new C8177(EnumC22260.PARAMETER_REF, c13792.f43749[i11], i11)));
            c21077.m14878(i10, new C18093(c4448M1557));
            char cCharAt2 = c13792.f43749[i11].charAt(0);
            i10 += (cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1;
        }
        if (this.f1311) {
            for (int i12 = 0; i12 < c21077.f16917.length; i12++) {
                if (c21077.m14877(i12) == null) {
                    C4448 c4448M1558 = m1556();
                    m1561(C4360.m13864(c4448M1558, C23840.m53165(0)));
                    c21077.m14878(i12, new C18093(c4448M1558));
                }
            }
        }
        if (this.f1304[0] > 1) {
            m1562(c21077, 0);
        } else {
            this.f1313[0] = c21077;
        }
        Stack stack = new Stack();
        stack.push((AbstractC15283) this.f1310.get(0));
        C21077 c21078 = new C21077(this.f1312.f79618);
        while (!stack.isEmpty()) {
            AbstractC15283 abstractC15286 = (AbstractC15283) stack.pop();
            int i13 = abstractC15286.f49968;
            EnumC1114 enumC1117 = abstractC15286.f49969;
            if (!bitSet4.get(i13)) {
                bitSet4.set(i13);
                C21077 c21079 = this.f1313[i13];
                ArrayList[] arrayListArr = this.f1307;
                ArrayList arrayList4 = arrayListArr[i13];
                this.f1305 = arrayList4;
                if (arrayList4 == null) {
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayListArr[i13] = arrayList5;
                    this.f1305 = arrayList5;
                }
                if (abstractC15286 instanceof C19759) {
                    m1561(m1559(((C19759) abstractC15286).f63602));
                    if (bitSet2.get(i13)) {
                        C4448 c4448M1559 = m1556();
                        m1561(new C20022(EnumC20768.IDENTITY, c4448M1559, new C8177(EnumC22260.EXCEPTION_REF, "Ljava/lang/Throwable;", -1)));
                        c21079.f16916 = new C18093(c4448M1559);
                    }
                }
                BitSet bitSet5 = bitSetArr[i13];
                if (bitSet5 != null) {
                    int i14 = 0;
                    while (true) {
                        int iNextSetBit = bitSet5.nextSetBit(i14);
                        if (iNextSetBit >= 0) {
                            m1562(c21079, iNextSetBit);
                            stack.push((AbstractC15283) this.f1310.get(iNextSetBit));
                            i14 = iNextSetBit + 1;
                        }
                    }
                }
                c21078.f16916 = c21079.f16916;
                Object[] objArr = c21079.f16917;
                Object[] objArr2 = c21078.f16917;
                System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
                if (enumC1117 != null) {
                    try {
                        switch (C14363.f45289[enumC1117.ordinal()]) {
                            case 1:
                                m1561(new C17784());
                                break;
                            case 2:
                            case 3:
                            case 4:
                                m1561(new C13309(m1559(((C11554) abstractC15286).f36338)));
                                break;
                            case 5:
                                m1561(new C17038());
                                break;
                            case 6:
                                m1561(C4360.m13863(C23840.m53164(new AbstractC11071[]{new C16380("bad dex opcode")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
                                break;
                            default:
                                c21078.m14879(abstractC15286, c3923);
                                break;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Fail on Op " + enumC1117 + " index " + i13, e);
                    }
                }
                if (enumC1117 != null) {
                    if (enumC1117.m4132()) {
                        int iM15610 = m1563(((C11554) abstractC15286).f36338);
                        stack.push((AbstractC15283) this.f1310.get(iM15610));
                        m1562(c21078, iM15610);
                    }
                    if (enumC1117.m4133()) {
                        for (C17347 c173417 : ((AbstractC10808) abstractC15286).f34296) {
                            int iM15611 = m1563(c173417);
                            stack.push((AbstractC15283) this.f1310.get(iM15611));
                            m1562(c21078, iM15611);
                        }
                    }
                    if (enumC1117.m4135()) {
                        int i15 = i13 + 1;
                        stack.push((AbstractC15283) this.f1310.get(i15));
                        m1562(c21078, i15);
                    }
                } else {
                    int i16 = i13 + 1;
                    stack.push((AbstractC15283) this.f1310.get(i16));
                    m1562(c21078, i16);
                }
                if (this.f1304[i13] <= 1) {
                    this.f1313[i13] = null;
                }
                bitSet2 = bitSet2;
            }
        }
        C24498 c24498 = this.f1314.f43750;
        c24498.getClass();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            c24498.m54764((AbstractC12563) it3.next());
        }
        for (int i17 = 0; i17 < this.f1310.size(); i17++) {
            AbstractC15283 abstractC15287 = (AbstractC15283) this.f1310.get(i17);
            if (bitSet4.get(i17)) {
                ArrayList arrayList6 = this.f1307[i17];
                if (arrayList6 != null) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        c24498.m54764((AbstractC12563) it4.next());
                    }
                }
            } else if (abstractC15287 instanceof C19759) {
                c24498.m54764(m1559(((C19759) abstractC15287).f63602));
            }
        }
        this.f1307 = null;
        C17587 c17587 = new C17587();
        int i18 = 0;
        while (true) {
            C21077[] c21077Arr = this.f1313;
            if (i18 < c21077Arr.length) {
                C21077 c210710 = c21077Arr[i18];
                if (this.f1304[i18] > 1 && c210710 != null && bitSet4.get(i18)) {
                    for (int i19 = 0; i19 < c210710.f16917.length; i19++) {
                        C18093 c18093 = (C18093) c210710.m14877(i19);
                        if (c18093 != null && c18093.f59213 != null) {
                            C18093 c18094 = c18093.f59214;
                            if (c18094 != null && c18094.f59213 == null) {
                                c17587.add(c18094);
                            }
                            HashSet<C18093> hashSet = c18093.f59215;
                            if (hashSet != null) {
                                for (C18093 c18095 : hashSet) {
                                    if (c18095.f59213 == null) {
                                        c17587.add(c18095);
                                    }
                                }
                            }
                        }
                    }
                }
                i18++;
            } else {
                while (!c17587.isEmpty()) {
                    C18093 c18096 = (C18093) c17587.poll();
                    m1558(c18096);
                    C18093 c18097 = c18096.f59214;
                    if (c18097 != null && c18097.f59213 == null) {
                        c17587.add(c18097);
                    }
                    HashSet<C18093> hashSet2 = c18096.f59215;
                    if (hashSet2 != null) {
                        for (C18093 c18098 : hashSet2) {
                            if (c18098.f59213 == null) {
                                c17587.add(c18098);
                            }
                        }
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                int i20 = 0;
                while (true) {
                    C21077[] c21077Arr2 = this.f1313;
                    if (i20 < c21077Arr2.length) {
                        C21077 c210711 = c21077Arr2[i20];
                        if (this.f1304[i20] > 1 && c210711 != null && bitSet4.get(i20)) {
                            C11817 c11817M15511 = m1559(((C19759) ((AbstractC15283) this.f1310.get(i20))).f63602);
                            ArrayList arrayList8 = new ArrayList();
                            for (int i21 = 0; i21 < c210711.f16917.length; i21++) {
                                C18093 c18099 = (C18093) c210711.m14877(i21);
                                if (c18099 != null && c18099.f59213 != null) {
                                    C18093 c180910 = c18099.f59214;
                                    if (c180910 != null) {
                                        C4448 c4448M15510 = c180910.f59213;
                                        if (c4448M15510 == null) {
                                            c4448M15510 = m1556();
                                            c180910.f59213 = c4448M15510;
                                        }
                                        hashSet3.add(c4448M15510);
                                    }
                                    HashSet hashSet4 = c18099.f59215;
                                    if (hashSet4 != null) {
                                        Iterator it5 = hashSet4.iterator();
                                        while (it5.hasNext()) {
                                            hashSet3.add(m1558((C18093) it5.next()));
                                        }
                                    }
                                    if (hashSet3.size() > 0) {
                                        arrayList8.add(C4360.m13864(c18099.f59213, new C18618((AbstractC11071[]) hashSet3.toArray(new AbstractC11071[hashSet3.size()]))));
                                        hashSet3.clear();
                                    }
                                }
                            }
                            c11817M15511.f38143 = arrayList8;
                            arrayList7.add(c11817M15511);
                        }
                        i20++;
                    } else {
                        if (arrayList7.size() > 0) {
                            this.f1314.f43754 = arrayList7;
                        }
                        return this.f1314;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C4448 m1558(C18093 c18093) {
        C4448 c4448 = c18093.f59213;
        if (c4448 != null) {
            return c4448;
        }
        C4448 c4448M1556 = m1556();
        c18093.f59213 = c4448M1556;
        return c4448M1556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1562(C21077 c21077, int i) {
        C21077[] c21077Arr = this.f1313;
        C21077 c21078 = c21077Arr[i];
        if (c21078 == null) {
            c21078 = new C21077(this.f1312.f79618);
            c21077Arr[i] = c21078;
        }
        if (this.f1304[i] <= 1) {
            c21078.f16916 = c21077.f16916;
            Object[] objArr = c21077.f16917;
            Object[] objArr2 = c21078.f16917;
            System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
            return;
        }
        for (int i2 = 0; i2 < c21077.f16917.length; i2++) {
            C18093 c18093 = (C18093) c21077.m14877(i2);
            C18093 c18094 = (C18093) c21078.m14877(i2);
            if (c18093 != null) {
                if (c18094 == null) {
                    c18094 = new C18093();
                    c21078.m14878(i2, c18094);
                }
                C18093 c18095 = c18094.f59214;
                if (c18095 == null) {
                    c18094.f59214 = c18093;
                } else if (c18095 != c18093) {
                    if (c18094.f59215 == null) {
                        c18094.f59215 = new HashSet(5);
                    }
                    c18094.f59215.add(c18093);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C4448 m1556() {
        C4448 c4448 = new C4448(this.f1314.f43751.size());
        this.f1314.f43751.add(c4448);
        return c4448;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1561(AbstractC12563 abstractC12563) {
        this.f1305.add(abstractC12563);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C11817 m1559(C17347 c17347) {
        HashMap map = this.f1306;
        C11817 c11817 = (C11817) map.get(c17347);
        if (c11817 != null) {
            return c11817;
        }
        C11817 c11818 = new C11817();
        map.put(c17347, c11818);
        return c11818;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m1563(C17347 c17347) {
        return ((C19759) this.f1309.get(c17347)).f49968;
    }
}
