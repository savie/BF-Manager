package l;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.ۘ᩷᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B5TO */
/* JADX INFO: loaded from: classes2.dex */
public final class C4196 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C1374[] f15248;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public int[] f15249;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public ArrayList f15250;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList[] f15253;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C2639 f15255;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ArrayList f15256;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C9116 f15257;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public HashMap f15247 = new HashMap();

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public ArrayList f15252 = new ArrayList();

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public HashMap f15254 = new HashMap();

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f15251 = true;

    /* JADX WARN: Code duplicated, block: B:164:0x0470  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9116 m11841(boolean z, C3097 c3097, C2639 c2639) {
        HashMap map;
        this.f15255 = c2639;
        C9116 c9116 = new C9116();
        c9116.f31041 = c3097.m9291();
        c9116.f31038 = c3097.m9296();
        c9116.f31042 = c3097.m9294();
        c9116.f31039 = c3097.m9295();
        c9116.f31046 = z;
        this.f15257 = c9116;
        C15341 c15341 = c2639.f10288;
        if (c15341 != null) {
            for (AbstractC23102 abstractC23102 : c15341.f49949) {
                if (abstractC23102 instanceof C1228) {
                    C14388 c14388 = abstractC23102.f75054;
                    HashMap map2 = this.f15254;
                    if (!map2.containsKey(c14388)) {
                        C17002 c17002 = new C17002();
                        c17002.f54353 = ((C1228) abstractC23102).f5391;
                        map2.put(c14388, c17002);
                    }
                }
            }
        }
        this.f15256 = c2639.f10290;
        int i = 0;
        while (true) {
            int size = this.f15256.size();
            map = this.f15247;
            if (i >= size) {
                break;
            }
            AbstractC0523 abstractC0523 = (AbstractC0523) this.f15256.get(i);
            abstractC0523.f2211 = i;
            if (abstractC0523 instanceof C20280) {
                C20280 c20280 = (C20280) abstractC0523;
                map.put(c20280.f65724, c20280);
            }
            i++;
        }
        if (this.f15255.f10287 != null) {
            LinkedList linkedList = new LinkedList();
            TreeSet treeSet = new TreeSet();
            Iterator it = this.f15255.f10287.iterator();
            while (it.hasNext()) {
                for (C14388 c14389 : ((C19574) it.next()).f62890) {
                    int iM11845 = m11845(c14389);
                    linkedList.add(Integer.valueOf(iM11845 + 1));
                    treeSet.add(Integer.valueOf(iM11845));
                }
            }
            linkedList.add(0);
            HashMap map3 = new HashMap();
            BitSet bitSet = new BitSet(this.f15256.size());
            while (!linkedList.isEmpty()) {
                Integer num = (Integer) linkedList.poll();
                int iIntValue = num.intValue();
                if (!bitSet.get(iIntValue)) {
                    bitSet.set(iIntValue);
                    if (treeSet.contains(num)) {
                        map3.put(num, null);
                    }
                    AbstractC0523 abstractC0524 = (AbstractC0523) this.f15256.get(num.intValue());
                    EnumC21815 enumC21815 = abstractC0524.f2212;
                    if (enumC21815 == null) {
                        linkedList.add(Integer.valueOf(iIntValue + 1));
                    } else {
                        if (enumC21815.m48575()) {
                            linkedList.add(Integer.valueOf(iIntValue + 1));
                        }
                        if (enumC21815.m48573()) {
                            linkedList.add(Integer.valueOf(m11845(((C6168) abstractC0524).f21023)));
                        }
                        if (enumC21815.m48571()) {
                            for (C14388 c143810 : ((AbstractC20985) abstractC0524).f68331) {
                                linkedList.add(Integer.valueOf(m11845(c143810)));
                            }
                        }
                    }
                }
            }
            if (map3.size() > 0) {
                Iterator it2 = this.f15255.f10287.iterator();
                while (it2.hasNext()) {
                    C14388[] c14388Arr = ((C19574) it2.next()).f62890;
                    for (int i2 = 0; i2 < c14388Arr.length; i2++) {
                        C14388 c143811 = c14388Arr[i2];
                        int iM11846 = m11845(c143811);
                        if (map3.containsKey(Integer.valueOf(iM11846))) {
                            C14388 c143812 = (C14388) map3.get(Integer.valueOf(iM11846));
                            if (c143812 == null) {
                                c143812 = new C14388();
                                map3.put(Integer.valueOf(iM11846), c143812);
                                C20280 c20281 = new C20280(c143812);
                                c20281.f2211 = this.f15256.size();
                                this.f15256.add(c20281);
                                map.put(c143812, c20281);
                                C6168 c6168 = new C6168(EnumC21815.f70770, 0, 0, c143811);
                                c6168.f2211 = this.f15256.size();
                                this.f15256.add(c6168);
                            }
                            c14388Arr[i2] = c143812;
                        }
                    }
                }
            }
        }
        BitSet[] bitSetArr = new BitSet[this.f15256.size()];
        int size2 = this.f15256.size();
        int[] iArr = new int[size2];
        this.f15249 = iArr;
        int i3 = 1;
        iArr[0] = 1;
        for (AbstractC0523 abstractC0525 : this.f15256) {
            EnumC21815 enumC21816 = abstractC0525.f2212;
            if (enumC21816 == null) {
                int i4 = abstractC0525.f2211;
                if (i4 < size2 - 1) {
                    int i5 = i4 + 1;
                    iArr[i5] = iArr[i5] + 1;
                }
            } else {
                if (enumC21816.m48573()) {
                    int iM11847 = m11845(((C6168) abstractC0525).f21023);
                    iArr[iM11847] = iArr[iM11847] + 1;
                }
                if (enumC21816.m48571()) {
                    for (C14388 c143813 : ((AbstractC20985) abstractC0525).f68331) {
                        int iM11848 = m11845(c143813);
                        iArr[iM11848] = iArr[iM11848] + 1;
                    }
                }
                if (enumC21816.m48575()) {
                    int i6 = abstractC0525.f2211 + 1;
                    iArr[i6] = iArr[i6] + 1;
                }
            }
        }
        BitSet bitSet2 = new BitSet(this.f15256.size());
        ArrayList<C19574> arrayList = c2639.f10287;
        if (arrayList != null) {
            for (C19574 c19574 : arrayList) {
                C14388[] c14388Arr2 = c19574.f62890;
                C14388 c143814 = c19574.f62889;
                C14388 c143815 = c19574.f62888;
                for (C14388 c143816 : c14388Arr2) {
                    bitSet2.set(m11845(c143816));
                }
                int iM11849 = m11845(c143815);
                boolean z2 = false;
                for (int iM118410 = m11845(c143814) + i3; iM118410 < iM11849; iM118410++) {
                    EnumC21815 enumC21817 = ((AbstractC0523) this.f15256.get(iM118410)).f2212;
                    if (enumC21817 != null && enumC21817.m48572()) {
                        BitSet bitSet3 = bitSetArr[iM118410];
                        if (bitSet3 == null) {
                            bitSet3 = new BitSet(this.f15256.size());
                            bitSetArr[iM118410] = bitSet3;
                        }
                        for (C14388 c143817 : c14388Arr2) {
                            int iM118411 = m11845(c143817);
                            bitSet3.set(iM118411);
                            int[] iArr2 = this.f15249;
                            iArr2[iM118411] = iArr2[iM118411] + 1;
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    ArrayList arrayList2 = this.f15257.f31040;
                    C17002 c17002M11842 = m11842(c143814);
                    C17002 c17002M11843 = m11842(c143815);
                    C17002[] c17002Arr = new C17002[c14388Arr2.length];
                    for (int i7 = 0; i7 < c14388Arr2.length; i7++) {
                        c17002Arr[i7] = m11842(c14388Arr2[i7]);
                    }
                    arrayList2.add(new C16876(c17002M11842, c17002M11843, c17002Arr, c19574.f62887));
                }
                i3 = 1;
            }
        }
        C5608 c5608 = new C5608(this);
        this.f15248 = new C1374[this.f15256.size()];
        this.f15253 = new ArrayList[this.f15256.size()];
        BitSet bitSet4 = new BitSet(this.f15256.size());
        ArrayList arrayList3 = this.f15252;
        this.f15250 = arrayList3;
        C2639 c26310 = this.f15255;
        C9116 c9117 = this.f15257;
        C1374 c1374 = new C1374(c26310.f10289);
        int i8 = c26310.f10289;
        int i9 = 0;
        for (String str : c9117.f31041) {
            char cCharAt = str.charAt(0);
            i9 += (cCharAt == 'J' || cCharAt == 'D') ? 2 : 1;
        }
        int i10 = i8 - i9;
        if (!c9117.f31046) {
            C2184 c2184M11838 = m11838();
            m11844(new C15592(EnumC2890.IDENTITY, c2184M11838, new C3595(EnumC9947.THIS_REF, c9117.f31042, -1)));
            c1374.m26297(i10 - 1, new C13370(c2184M11838));
        }
        for (int i11 = 0; i11 < c9117.f31041.length; i11++) {
            C2184 c2184M11839 = m11838();
            m11844(new C15592(EnumC2890.IDENTITY, c2184M11839, new C3595(EnumC9947.PARAMETER_REF, c9117.f31041[i11], i11)));
            c1374.m26297(i10, new C13370(c2184M11839));
            char cCharAt2 = c9117.f31041[i11].charAt(0);
            i10 += (cCharAt2 == 'J' || cCharAt2 == 'D') ? 2 : 1;
        }
        if (this.f15251) {
            for (int i12 = 0; i12 < c1374.f35580.length; i12++) {
                if (c1374.m26296(i12) == null) {
                    C2184 c2184M118310 = m11838();
                    m11844(C2660.m8188(c2184M118310, C2058.m6556(0)));
                    c1374.m26297(i12, new C13370(c2184M118310));
                }
            }
        }
        if (this.f15249[0] > 1) {
            m11843(c1374, 0);
        } else {
            this.f15248[0] = c1374;
        }
        Stack stack = new Stack();
        stack.push((AbstractC0523) this.f15256.get(0));
        C1374 c1375 = new C1374(this.f15255.f10289);
        while (!stack.isEmpty()) {
            AbstractC0523 abstractC0526 = (AbstractC0523) stack.pop();
            int i13 = abstractC0526.f2211;
            EnumC21815 enumC21818 = abstractC0526.f2212;
            if (!bitSet4.get(i13)) {
                bitSet4.set(i13);
                C1374 c1376 = this.f15248[i13];
                ArrayList[] arrayListArr = this.f15253;
                ArrayList arrayList4 = arrayListArr[i13];
                this.f15250 = arrayList4;
                if (arrayList4 == null) {
                    ArrayList arrayList5 = new ArrayList(1);
                    arrayListArr[i13] = arrayList5;
                    this.f15250 = arrayList5;
                }
                if (abstractC0526 instanceof C20280) {
                    m11844(m11842(((C20280) abstractC0526).f65724));
                    if (bitSet2.get(i13)) {
                        C2184 c2184M118311 = m11838();
                        m11844(new C15592(EnumC2890.IDENTITY, c2184M118311, new C3595(EnumC9947.EXCEPTION_REF, "Ljava/lang/Throwable;", -1)));
                        c1376.f35579 = new C13370(c2184M118311);
                    }
                }
                BitSet bitSet5 = bitSetArr[i13];
                if (bitSet5 != null) {
                    int i14 = 0;
                    while (true) {
                        int iNextSetBit = bitSet5.nextSetBit(i14);
                        if (iNextSetBit >= 0) {
                            m11843(c1376, iNextSetBit);
                            stack.push((AbstractC0523) this.f15256.get(iNextSetBit));
                            i14 = iNextSetBit + 1;
                        }
                    }
                }
                c1375.f35579 = c1376.f35579;
                Object[] objArr = c1376.f35580;
                Object[] objArr2 = c1375.f35580;
                System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
                if (enumC21818 != null) {
                    try {
                        switch (C22542.f73511[enumC21818.ordinal()]) {
                            case 1:
                                m11844(new C23353());
                                break;
                            case 2:
                            case 3:
                            case 4:
                                m11844(new C0068(m11842(((C6168) abstractC0526).f21023)));
                                break;
                            case 5:
                                m11844(new C10653());
                                break;
                            case 6:
                                m11844(C2660.m8187(C2058.m6555(new AbstractC7124[]{new C14760("bad dex opcode")}, new String[]{"Ljava/lang/String;"}, "Ljava/lang/VerifyError;")));
                                break;
                            default:
                                c1375.m26298(abstractC0526, c5608);
                                break;
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Fail on Op " + enumC21818 + " index " + i13, e);
                    }
                }
                if (enumC21818 != null) {
                    if (enumC21818.m48573()) {
                        int iM118412 = m11845(((C6168) abstractC0526).f21023);
                        stack.push((AbstractC0523) this.f15256.get(iM118412));
                        m11843(c1375, iM118412);
                    }
                    if (enumC21818.m48571()) {
                        for (C14388 c143818 : ((AbstractC20985) abstractC0526).f68331) {
                            int iM118413 = m11845(c143818);
                            stack.push((AbstractC0523) this.f15256.get(iM118413));
                            m11843(c1375, iM118413);
                        }
                    }
                    if (enumC21818.m48575()) {
                        int i15 = i13 + 1;
                        stack.push((AbstractC0523) this.f15256.get(i15));
                        m11843(c1375, i15);
                    }
                } else {
                    int i16 = i13 + 1;
                    stack.push((AbstractC0523) this.f15256.get(i16));
                    m11843(c1375, i16);
                }
                if (this.f15249[i13] <= 1) {
                    this.f15248[i13] = null;
                }
                bitSet2 = bitSet2;
            }
        }
        C11834 c11834 = this.f15257.f31045;
        c11834.getClass();
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            c11834.m29525((AbstractC4777) it3.next());
        }
        for (int i17 = 0; i17 < this.f15256.size(); i17++) {
            AbstractC0523 abstractC0527 = (AbstractC0523) this.f15256.get(i17);
            if (bitSet4.get(i17)) {
                ArrayList arrayList6 = this.f15253[i17];
                if (arrayList6 != null) {
                    Iterator it4 = arrayList6.iterator();
                    while (it4.hasNext()) {
                        c11834.m29525((AbstractC4777) it4.next());
                    }
                }
            } else if (abstractC0527 instanceof C20280) {
                c11834.m29525(m11842(((C20280) abstractC0527).f65724));
            }
        }
        this.f15253 = null;
        C23704 c23704 = new C23704();
        int i18 = 0;
        while (true) {
            C1374[] c1374Arr = this.f15248;
            if (i18 < c1374Arr.length) {
                C1374 c1377 = c1374Arr[i18];
                if (this.f15249[i18] > 1 && c1377 != null && bitSet4.get(i18)) {
                    for (int i19 = 0; i19 < c1377.f35580.length; i19++) {
                        C13370 c13370 = (C13370) c1377.m26296(i19);
                        if (c13370 != null && c13370.f44297 != null) {
                            C13370 c13371 = c13370.f44298;
                            if (c13371 != null && c13371.f44297 == null) {
                                c23704.add(c13371);
                            }
                            HashSet<C13370> hashSet = c13370.f44299;
                            if (hashSet != null) {
                                for (C13370 c13372 : hashSet) {
                                    if (c13372.f44297 == null) {
                                        c23704.add(c13372);
                                    }
                                }
                            }
                        }
                    }
                }
                i18++;
            } else {
                while (!c23704.isEmpty()) {
                    C13370 c13373 = (C13370) c23704.poll();
                    m11840(c13373);
                    C13370 c13374 = c13373.f44298;
                    if (c13374 != null && c13374.f44297 == null) {
                        c23704.add(c13374);
                    }
                    HashSet<C13370> hashSet2 = c13373.f44299;
                    if (hashSet2 != null) {
                        for (C13370 c13375 : hashSet2) {
                            if (c13375.f44297 == null) {
                                c23704.add(c13375);
                            }
                        }
                    }
                }
                HashSet hashSet3 = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                int i20 = 0;
                while (true) {
                    C1374[] c1374Arr2 = this.f15248;
                    if (i20 < c1374Arr2.length) {
                        C1374 c1378 = c1374Arr2[i20];
                        if (this.f15249[i20] > 1 && c1378 != null && bitSet4.get(i20)) {
                            C17002 c17002M11844 = m11842(((C20280) ((AbstractC0523) this.f15256.get(i20))).f65724);
                            ArrayList arrayList8 = new ArrayList();
                            for (int i21 = 0; i21 < c1378.f35580.length; i21++) {
                                C13370 c13376 = (C13370) c1378.m26296(i21);
                                if (c13376 != null && c13376.f44297 != null) {
                                    C13370 c13377 = c13376.f44298;
                                    if (c13377 != null) {
                                        C2184 c2184M118312 = c13377.f44297;
                                        if (c2184M118312 == null) {
                                            c2184M118312 = m11838();
                                            c13377.f44297 = c2184M118312;
                                        }
                                        hashSet3.add(c2184M118312);
                                    }
                                    HashSet hashSet4 = c13376.f44299;
                                    if (hashSet4 != null) {
                                        Iterator it5 = hashSet4.iterator();
                                        while (it5.hasNext()) {
                                            hashSet3.add(m11840((C13370) it5.next()));
                                        }
                                    }
                                    if (hashSet3.size() > 0) {
                                        arrayList8.add(C2660.m8188(c13376.f44297, new C0773((AbstractC7124[]) hashSet3.toArray(new AbstractC7124[hashSet3.size()]))));
                                        hashSet3.clear();
                                    }
                                }
                            }
                            c17002M11844.f54351 = arrayList8;
                            arrayList7.add(c17002M11844);
                        }
                        i20++;
                    } else {
                        if (arrayList7.size() > 0) {
                            this.f15257.f31047 = arrayList7;
                        }
                        return this.f15257;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2184 m11840(C13370 c13370) {
        C2184 c2184 = c13370.f44297;
        if (c2184 != null) {
            return c2184;
        }
        C2184 c2184M11838 = m11838();
        c13370.f44297 = c2184M11838;
        return c2184M11838;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11843(C1374 c1374, int i) {
        C1374[] c1374Arr = this.f15248;
        C1374 c1375 = c1374Arr[i];
        if (c1375 == null) {
            c1375 = new C1374(this.f15255.f10289);
            c1374Arr[i] = c1375;
        }
        if (this.f15249[i] <= 1) {
            c1375.f35579 = c1374.f35579;
            Object[] objArr = c1374.f35580;
            Object[] objArr2 = c1375.f35580;
            System.arraycopy(objArr, 0, objArr2, 0, objArr2.length);
            return;
        }
        for (int i2 = 0; i2 < c1374.f35580.length; i2++) {
            C13370 c13370 = (C13370) c1374.m26296(i2);
            C13370 c13371 = (C13370) c1375.m26296(i2);
            if (c13370 != null) {
                if (c13371 == null) {
                    c13371 = new C13370();
                    c1375.m26297(i2, c13371);
                }
                C13370 c13372 = c13371.f44298;
                if (c13372 == null) {
                    c13371.f44298 = c13370;
                } else if (c13372 != c13370) {
                    if (c13371.f44299 == null) {
                        c13371.f44299 = new HashSet(5);
                    }
                    c13371.f44299.add(c13370);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C2184 m11838() {
        C2184 c2184 = new C2184(this.f15257.f31044.size());
        this.f15257.f31044.add(c2184);
        return c2184;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11844(AbstractC4777 abstractC4777) {
        this.f15250.add(abstractC4777);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17002 m11842(C14388 c14388) {
        HashMap map = this.f15254;
        C17002 c17002 = (C17002) map.get(c14388);
        if (c17002 != null) {
            return c17002;
        }
        C17002 c17003 = new C17002();
        map.put(c14388, c17003);
        return c17003;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m11845(C14388 c14388) {
        return ((C20280) this.f15247.get(c14388)).f2211;
    }
}
