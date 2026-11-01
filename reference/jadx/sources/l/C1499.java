package l;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫֨᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: AARN */
/* JADX INFO: loaded from: classes2.dex */
public class C1499 extends AbstractC14822 {

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public static final boolean f6053;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f6054;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C23724 f6055;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C13577 f6056;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4943 f6057;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public EnumC1144 f6058;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C23724[] f6059;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public C23289 f6060;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC7060 f6061;

    @Override // l.AbstractC14822
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5172() {
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean mo5182() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5173(C20466 c20466, AbstractC2120 abstractC2120, C17643 c17643, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (abstractC2120.f7777) {
            for (int i2 = 0; i2 < abstractC2120.f7778.size(); i2++) {
                AbstractC2120 abstractC2121 = abstractC2120.m6671(i2).f55272;
                if (m5157(abstractC2121, z3)) {
                    mo5173(c20466, abstractC2121, c17643, hashSet, z, z2, i, z3);
                } else {
                    mo5174(new C20466(c20466, abstractC2121, c20466.f66408, c20466.f66404), c17643, hashSet, z, z2, i, z3);
                }
            }
            return;
        }
        c17643.m41114(c20466, abstractC2120, c20466.f66408, c20466.f66404, this.f6056);
    }

    public C1499(AbstractC7060 abstractC7060, C16233 c16233, C23724[] c23724Arr, C2555 c2555) {
        super(c16233, c2555);
        this.f6058 = EnumC1144.LL;
        this.f6061 = abstractC7060;
        this.f6059 = c23724Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo5159(int i, C4943 c4943, C23289 c23289) {
        C9613 c9613Mo5165;
        this.f6057 = c4943;
        this.f6054 = c4943.index();
        this.f6060 = c23289;
        C23724 c23724 = this.f6059[i];
        this.f6055 = c23724;
        c4943.mo11328();
        int i2 = this.f6054;
        try {
            if (c23724.m52254()) {
                c9613Mo5165 = c23724.m52252(this.f6061.m18922());
            } else {
                c9613Mo5165 = c23724.f76772;
            }
            if (c9613Mo5165 == null) {
                if (c23289 == null) {
                    c23289 = C23289.f75535;
                }
                C17643 c17643M5168 = m5168((AbstractC2120) c23724.f76773, C23289.f75535, false);
                if (c23724.m52254()) {
                    c23724.f76772.f32382 = c17643M5168;
                    c9613Mo5165 = mo5165(c23724, new C9613(m5169(c17643M5168)));
                    c23724.m52253(this.f6061.m18922(), c9613Mo5165);
                } else {
                    c9613Mo5165 = mo5165(c23724, new C9613(c17643M5168));
                    c23724.f76772 = c9613Mo5165;
                }
            }
            return m5161(c23724, c9613Mo5165, c4943, i2, c23289);
        } finally {
            this.f6056 = null;
            this.f6055 = null;
            c4943.mo11329(i2);
            c4943.getClass();
        }
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static int m5158(C17643 c17643) {
        int i = 0;
        for (C20466 c20466 : c17643.f56084) {
            if (i == 0) {
                i = c20466.f66405;
            } else if (c20466.f66405 != i) {
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5161(C23724 c23724, C9613 c9613, C4943 c4943, int i, C23289 c23289) {
        BitSet bitSet;
        int iMo11332 = c4943.mo11332(1);
        C9613 c9614 = c9613;
        while (true) {
            C9613 c9613Mo5164 = mo5164(iMo11332, c9614);
            if (c9613Mo5164 == null) {
                c9613Mo5164 = mo5166(c23724, c9614, iMo11332);
            }
            C9613 c9615 = c9613Mo5164;
            if (c9615 == AbstractC14822.f48445) {
                C4237 c4237M5180 = m5180(i, c4943, c23289);
                c4943.mo11329(i);
                int iM5160 = m5160(c9614.f32382, c23289);
                if (iM5160 != 0) {
                    return iM5160;
                }
                throw c4237M5180;
            }
            if (c9615.f32380 && this.f6058 != EnumC1144.SLL) {
                BitSet bitSet2 = c9615.f32382.f56081;
                if (c9615.f32383 != null) {
                    int iIndex = c4943.index();
                    if (iIndex != i) {
                        c4943.mo11329(i);
                    }
                    BitSet bitSetM5163 = m5163(c9615.f32383, c23289);
                    if (bitSetM5163.cardinality() == 1) {
                        return bitSetM5163.nextSetBit(0);
                    }
                    if (iIndex != i) {
                        c4943.mo11329(iIndex);
                    }
                    bitSet = bitSetM5163;
                } else {
                    bitSet = bitSet2;
                }
                C17643 c17643M5168 = m5168((AbstractC2120) c23724.f76773, c23289, true);
                C17643 c17643 = c9615.f32382;
                int iIndex2 = c4943.index();
                AbstractC7060 abstractC7060 = this.f6061;
                if (abstractC7060 != null) {
                    abstractC7060.m43801().mo16070(this.f6061, c23724, i, iIndex2, bitSet, c17643);
                }
                return mo5162(c23724, c9615, c17643M5168, c4943, i, c23289);
            }
            if (c9615.f32384) {
                if (c9615.f32383 == null) {
                    return c9615.f32387;
                }
                int iIndex3 = c4943.index();
                c4943.mo11329(i);
                BitSet bitSetM5164 = m5163(c9615.f32383, c23289);
                int iCardinality = bitSetM5164.cardinality();
                if (iCardinality == 0) {
                    throw m5180(i, c4943, c23289);
                }
                if (iCardinality == 1) {
                    return bitSetM5164.nextSetBit(0);
                }
                m5175(c23724, i, iIndex3, false, bitSetM5164, c9615.f32382);
                return bitSetM5164.nextSetBit(0);
            }
            if (iMo11332 != -1) {
                c4943.mo11333();
                iMo11332 = c4943.mo11332(1);
            }
            c9614 = c9615;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9613 mo5164(int i, C9613 c9613) {
        int i2;
        C9613[] c9613Arr = c9613.f32386;
        if (c9613Arr == null || (i2 = i + 1) < 0 || i2 >= c9613Arr.length) {
            return null;
        }
        return c9613Arr[i2];
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[PHI: r10
      0x00ac: PHI (r10v1 l.ۡ۬᩵) = (r10v3 l.ۡ۬᩵), (r10v4 l.ۡ۬᩵), (r10v5 l.ۡ۬᩵) binds: [B:31:0x009a, B:32:0x009c, B:35:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9613 mo5166(C23724 c23724, C9613 c9613, int i) {
        BitSet bitSet;
        C17643 c17643Mo5170 = mo5170(c9613.f32382, i, false);
        if (c17643Mo5170 == null) {
            C9613 c9614 = AbstractC14822.f48445;
            m5167(c23724, c9613, i, c9614);
            return c9614;
        }
        C9613 c9615 = new C9613(c17643Mo5170);
        int iM5158 = m5158(c17643Mo5170);
        if (iM5158 != 0) {
            c9615.f32384 = true;
            c9615.f32382.f56082 = iM5158;
            c9615.f32387 = iM5158;
        } else if (mo5178(c17643Mo5170)) {
            c9615.f32382.f56081 = mo5179(c17643Mo5170);
            c9615.f32380 = true;
            c9615.f32384 = true;
            c9615.f32387 = c9615.f32382.f56081.nextSetBit(0);
        }
        if (c9615.f32384 && c9615.f32382.f56080) {
            int size = this.f48446.m38343(c23724.f76776).f7778.size();
            C17643 c17643 = c9615.f32382;
            if (c17643.f56082 != 0) {
                bitSet = new BitSet();
                bitSet.set(c17643.f56082);
            } else {
                bitSet = c17643.f56081;
            }
            AbstractC8907[] abstractC8907Arr = new AbstractC8907[size + 1];
            for (C20466 c20466 : c9615.f32382.f56084) {
                if (bitSet.get(c20466.f66405)) {
                    int i2 = c20466.f66405;
                    AbstractC8907 abstractC8907 = abstractC8907Arr[i2];
                    AbstractC8907 abstractC8908 = c20466.f66404;
                    AbstractC8907 abstractC8909 = abstractC8907;
                    if (abstractC8907 == null) {
                        abstractC8909 = abstractC8908;
                    } else if (abstractC8908 != null) {
                        C21606 c21606 = C21606.f70083;
                        if (abstractC8907 == c21606 || abstractC8908 == c21606) {
                            AbstractC8907 abstractC89010 = c21606;
                            abstractC89010 = c21606;
                            abstractC8909 = abstractC89010;
                        } else {
                            C18078 c18078 = new C18078(abstractC8907, abstractC8908);
                            AbstractC8907[] abstractC8907Arr2 = c18078.f57842;
                            abstractC89010 = c18078;
                            if (abstractC8907Arr2.length == 1) {
                                abstractC8909 = abstractC8907Arr2[0];
                            } else {
                                AbstractC8907 abstractC89011 = c21606;
                                abstractC89011 = c21606;
                                abstractC8909 = abstractC89011;
                            }
                        }
                    }
                    abstractC8907Arr[i2] = abstractC8909;
                }
            }
            int i3 = 0;
            for (int i4 = 1; i4 <= size; i4++) {
                AbstractC8907 abstractC89012 = abstractC8907Arr[i4];
                if (abstractC89012 == null) {
                    abstractC8907Arr[i4] = C21606.f70083;
                } else if (abstractC89012 != C21606.f70083) {
                    i3++;
                }
            }
            AbstractC8907[] abstractC8907Arr3 = abstractC8907Arr;
            if (i3 == 0) {
                abstractC8907Arr3 = null;
            }
            if (abstractC8907Arr3 == null) {
                c9615.f32387 = bitSet.nextSetBit(0);
            } else {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i5 = 1; i5 < abstractC8907Arr3.length; i5++) {
                    AbstractC8907 abstractC89013 = abstractC8907Arr3[i5];
                    if (bitSet != null && bitSet.get(i5)) {
                        C1850 c1850 = new C1850();
                        c1850.f7063 = i5;
                        c1850.f7064 = abstractC89013;
                        arrayList.add(c1850);
                    }
                    if (abstractC89013 != C21606.f70083) {
                        z = true;
                    }
                }
                c9615.f32383 = z ? (C1850[]) arrayList.toArray(new C1850[0]) : null;
                c9615.f32387 = 0;
            }
            if (c9615.f32383 != null) {
                c9615.f32387 = 0;
            }
        }
        return m5167(c23724, c9613, i, c9615);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean mo5178(C17643 c17643) {
        return EnumC1144.m4180(this.f6058, c17643);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int mo5162(C23724 c23724, C9613 c9613, C17643 c17643, C4943 c4943, int i, C23289 c23289) {
        C17643 c17643Mo5170;
        int iM4177;
        boolean z;
        c4943.mo11329(i);
        int iMo11332 = c4943.mo11332(1);
        while (true) {
            c17643Mo5170 = mo5170(c17643, iMo11332, true);
            if (c17643Mo5170 == null) {
                C4237 c4237M5180 = m5180(i, c4943, c23289);
                c4943.mo11329(i);
                int iM5160 = m5160(c17643, c23289);
                if (iM5160 != 0) {
                    return iM5160;
                }
                throw c4237M5180;
            }
            Collection collectionM4186 = EnumC1144.m4186(c17643Mo5170);
            int iM5158 = m5158(c17643Mo5170);
            c17643Mo5170.f56082 = iM5158;
            if (iM5158 == 0) {
                if (this.f6058 != EnumC1144.LL_EXACT_AMBIG_DETECTION) {
                    iM5158 = EnumC1144.m4187(collectionM4186);
                    if (iM5158 != 0) {
                    }
                } else if (EnumC1144.m4179(collectionM4186) && EnumC1144.m4189(collectionM4186)) {
                    iM4177 = EnumC1144.m4177(collectionM4186);
                    z = true;
                    break;
                }
                if (iMo11332 != -1) {
                    c4943.mo11333();
                    iMo11332 = c4943.mo11332(1);
                }
                c17643 = c17643Mo5170;
            }
            iM4177 = iM5158;
            z = false;
            break;
        }
        if (c17643Mo5170.f56082 != 0) {
            m5176(c23724, iM4177, c17643Mo5170, i, c4943.index());
            return iM4177;
        }
        m5175(c23724, i, c4943.index(), z, c17643Mo5170.m41117(), c17643Mo5170);
        return iM4177;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17643 mo5171(boolean z) {
        return new C17643(z, false);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C17643 mo5170(C17643 c17643, int i, boolean z) {
        C16233 c16233;
        int i2;
        if (this.f6056 == null) {
            this.f6056 = new C13577();
        }
        C17643 c17643Mo5171 = mo5171(z);
        ArrayList arrayList = c17643Mo5171.f56084;
        Iterator it = c17643.f56084.iterator();
        ArrayList arrayList2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c16233 = this.f48446;
            if (!zHasNext) {
                break;
            }
            C20466 c20466 = (C20466) it.next();
            AbstractC2120 abstractC2120 = c20466.f66406;
            if (!(abstractC2120 instanceof C6789)) {
                int i3 = 0;
                for (int size = abstractC2120.f7778.size(); i3 < size; size = size) {
                    AbstractC17373 abstractC17373M6671 = c20466.f66406.m6671(i3);
                    AbstractC2120 abstractC2121 = abstractC17373M6671.mo12147(i, c16233.f52364) ? abstractC17373M6671.f55272 : null;
                    if (abstractC2121 != null) {
                        c17643Mo5171.m41114(c20466, abstractC2121, c20466.f66408, c20466.f66404, this.f6056);
                    }
                    i3++;
                }
            } else if (z || i == -1) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c20466);
            }
        }
        C17643 c17644 = (arrayList2 != null || i == -1 || (arrayList.size() != 1 && m5158(c17643Mo5171) == 0)) ? null : c17643Mo5171;
        if (c17644 == null) {
            C17643 c17643Mo5172 = mo5171(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mo5174((C20466) it2.next(), c17643Mo5172, hashSet, false, z, 0, z2);
            }
            i2 = -1;
            c17644 = c17643Mo5172;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c17644 == c17643Mo5171;
            if (!EnumC1144.m4181(c17644)) {
                C17643 c17643Mo5173 = mo5171(c17644.f56079);
                for (C20466 c20467 : c17644.f56084) {
                    AbstractC2120 abstractC2122 = c20467.f66406;
                    if (!(abstractC2122 instanceof C6789)) {
                        if (z3 && abstractC2122.f7777 && c16233.m38341(abstractC2122).m3508(-2)) {
                            c17643Mo5173.m41114(c20467, c16233.f52363[c20467.f66406.f7773], c20467.f66408, c20467.f66404, this.f6056);
                        }
                    } else {
                        c17643Mo5173.m41115(c20467, this.f6056);
                    }
                }
                c17644 = c17643Mo5173;
            }
        }
        if (arrayList2 != null && (!z || !EnumC1144.m4184(c17644))) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c17644.m41115((C20466) it3.next(), this.f6056);
            }
        }
        if (c17644.f56084.isEmpty()) {
            return null;
        }
        return c17644;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17643 m5168(AbstractC2120 abstractC2120, C23289 c23289, boolean z) {
        C7495 c7495M29309 = AbstractC11729.m29309(this.f48446, c23289);
        C17643 c17643Mo5171 = mo5171(z);
        int i = 0;
        while (i < abstractC2120.f7778.size()) {
            int i2 = i + 1;
            mo5174(new C20466(abstractC2120.m6671(i).f55272, i2, c7495M29309), c17643Mo5171, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c17643Mo5171;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17643 m5169(C17643 c17643) {
        AbstractC11729 abstractC11729;
        AbstractC8907 abstractC8907Mo21490;
        HashMap map = new HashMap();
        C17643 c17643Mo5171 = mo5171(c17643.f56079);
        ArrayList<C20466> arrayList = c17643.f56084;
        for (C20466 c20466 : arrayList) {
            int i = c20466.f66405;
            AbstractC8907 abstractC8907 = c20466.f66404;
            if (i == 1 && (abstractC8907Mo21490 = abstractC8907.mo21490(this.f6061, this.f6060)) != null) {
                map.put(Integer.valueOf(c20466.f66406.f7775), c20466.f66408);
                if (abstractC8907Mo21490 != abstractC8907) {
                    c17643Mo5171.m41114(c20466, c20466.f66406, c20466.f66408, abstractC8907Mo21490, this.f6056);
                } else {
                    c17643Mo5171.m41115(c20466, this.f6056);
                }
            }
        }
        for (C20466 c20467 : arrayList) {
            if (c20467.f66405 != 1 && ((c20467.f66407 & 1073741824) != 0 || (abstractC11729 = (AbstractC11729) map.get(Integer.valueOf(c20467.f66406.f7775))) == null || !abstractC11729.equals(c20467.f66408))) {
                c17643Mo5171.m41115(c20467, this.f6056);
            }
        }
        return c17643Mo5171;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static int m5156(C17643 c17643) {
        C0875 c0875 = new C0875(new int[0]);
        for (C20466 c20466 : c17643.f56084) {
            if ((c20466.f66407 & (-1073741825)) > 0 || ((c20466.f66406 instanceof C6789) && c20466.f66408.m29312())) {
                c0875.m3502(c20466.f66405);
            }
        }
        if (c0875.m3505() == 0) {
            return 0;
        }
        return c0875.m3500();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m5160(C17643 c17643, C23289 c23289) {
        int iM5156;
        C17643 c17643Mo5171 = mo5171(c17643.f56079);
        C17643 c17643Mo5172 = mo5171(c17643.f56079);
        for (C20466 c20466 : c17643.f56084) {
            AbstractC8907 abstractC8907 = c20466.f66404;
            if (abstractC8907 == C21606.f70083 || abstractC8907.mo21489(this.f6061, c23289)) {
                c17643Mo5171.m41115(c20466, null);
            } else {
                c17643Mo5172.m41115(c20466, null);
            }
        }
        int iM5157 = m5156(c17643Mo5171);
        if (iM5157 != 0) {
            return iM5157;
        }
        if (c17643Mo5172.f56084.size() <= 0 || (iM5156 = m5156(c17643Mo5172)) == 0) {
            return 0;
        }
        return iM5156;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m5163(C1850[] c1850Arr, C23289 c23289) {
        BitSet bitSet = new BitSet();
        for (C1850 c1850 : c1850Arr) {
            AbstractC8907 abstractC8907 = c1850.f7064;
            int i = c1850.f7063;
            if (abstractC8907 == C21606.f70083) {
                bitSet.set(i);
            } else if (abstractC8907.mo21489(this.f6061, c23289)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo5174(C20466 c20466, C17643 c17643, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c20466.f66406 instanceof C6789) {
            if (!c20466.f66408.mo10719()) {
                for (int i2 = 0; i2 < c20466.f66408.mo10717(); i2++) {
                    if (c20466.f66408.mo10718(i2) != Integer.MAX_VALUE) {
                        C20466 c20467 = new C20466((AbstractC2120) this.f48446.f52365.get(c20466.f66408.mo10718(i2)), c20466.f66405, c20466.f66408.mo10716(i2), c20466.f66404);
                        c20467.f66407 = c20466.f66407;
                        mo5174(c20467, c17643, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c17643.m41114(c20466, c20466.f66406, C3615.f13295, c20466.f66404, this.f6056);
                    } else {
                        m5181(c20466, c17643, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c17643.m41115(c20466, this.f6056);
                return;
            }
        }
        m5181(c20466, c17643, hashSet, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0217  */
    /* JADX WARN: Code duplicated, block: B:108:0x022c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0238  */
    /* JADX WARN: Code duplicated, block: B:112:0x023c  */
    /* JADX WARN: Code duplicated, block: B:122:0x0268  */
    /* JADX WARN: Code duplicated, block: B:123:0x026f  */
    /* JADX WARN: Code duplicated, block: B:135:0x0299  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0134  */
    /* JADX WARN: Code duplicated, block: B:78:0x013f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0144  */
    /* JADX WARN: Code duplicated, block: B:81:0x0153  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:99:0x01e3  */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m5181(C20466 c20466, C17643 c17643, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        AbstractC17373 abstractC17373M6671;
        boolean z4;
        boolean z5;
        int iMo12146;
        C4672 c4672;
        C20466 c20467;
        C20466 c20468;
        C17643 c17644;
        int i2;
        int i3;
        C23724 c23724;
        C13846 c13846;
        C17643 c17645 = c17643;
        AbstractC2120 abstractC2120 = c20466.f66406;
        AbstractC8907 abstractC8907 = c20466.f66404;
        if (!abstractC2120.f7777) {
            c17645.m41115(c20466, this.f6056);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC2120.f7778.size()) {
            int i6 = 1;
            if (i5 != 0 || f6053 || abstractC2120.mo2265() != 10 || !((C20196) abstractC2120).f65545 || c20466.f66408.mo10719() || c20466.f66408.m29312()) {
                abstractC17373M6671 = abstractC2120.m6671(i5);
                if ((abstractC17373M6671 instanceof C4321) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!mo5182() && abstractC2120.f7777 && !(abstractC2120 instanceof C6789) && abstractC17373M6671.mo12146() == 1 && m5157(abstractC17373M6671.f55272, z3)) {
                    mo5173(c20466, abstractC17373M6671.f55272, c17643, hashSet, z4, z2, i, z3);
                    c17644 = c17645;
                } else {
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo12146 = abstractC17373M6671.mo12146();
                    AbstractC7060 abstractC7060 = this.f6061;
                    if (iMo12146 != 10) {
                        switch (iMo12146) {
                            case 1:
                                c20468 = new C20466(c20466, abstractC17373M6671.f55272, c20466.f66408, abstractC8907);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3 && abstractC17373M6671.mo12147(-1, 1)) {
                                    c20468 = new C20466(c20466, abstractC17373M6671.f55272, c20466.f66408, abstractC8907);
                                } else {
                                    c20468 = null;
                                }
                                break;
                            case 3:
                                C23018 c23018 = (C23018) abstractC17373M6671;
                                c20467 = new C20466(c20466, c23018.f55272, C7495.m19996(c20466.f66408, c23018.f74809.f7775), abstractC8907);
                                c20468 = c20467;
                                break;
                            case 4:
                                c13846 = (C13846) abstractC17373M6671;
                                int i7 = c13846.f45677;
                                int i8 = c13846.f45678;
                                boolean z6 = c13846.f45679;
                                if (!z4 || (z6 && (!z6 || !z5))) {
                                    c20468 = new C20466(c20466, c13846.f55272, c20466.f66408, abstractC8907);
                                } else if (!z2) {
                                    c20467 = new C20466(c20466, c13846.f55272, c20466.f66408, AbstractC8907.m23168(abstractC8907, new C19490(i8, i7, z6)));
                                    c20468 = c20467;
                                } else {
                                    int iIndex = this.f6057.index();
                                    this.f6057.mo11329(this.f6054);
                                    boolean zMo21489 = new C19490(i8, i7, z6).mo21489(abstractC7060, this.f6060);
                                    this.f6057.mo11329(iIndex);
                                    if (!zMo21489) {
                                        c20468 = null;
                                    } else {
                                        c20468 = new C20466(c20466, c13846.f55272, c20466.f66408, abstractC8907);
                                    }
                                }
                                break;
                            case 6:
                                c20468 = new C20466(c20466, ((C4321) abstractC17373M6671).f55272, c20466.f66408, abstractC8907);
                                break;
                            default:
                                c20468 = null;
                                break;
                        }
                    } else {
                        c4672 = (C4672) abstractC17373M6671;
                        int i9 = c4672.f16535;
                        if (z4 || !z5) {
                            c20467 = new C20466(c20466, c4672.f55272, c20466.f66408, abstractC8907);
                        } else if (z2) {
                            int iIndex2 = this.f6057.index();
                            this.f6057.mo11329(this.f6054);
                            boolean zMo18914 = abstractC7060.mo18914(new C8201(i9).f28562);
                            this.f6057.mo11329(iIndex2);
                            if (zMo18914) {
                                c20468 = new C20466(c20466, c4672.f55272, c20466.f66408, abstractC8907);
                            } else {
                                c20468 = null;
                            }
                        } else {
                            c20467 = new C20466(c20466, c4672.f55272, c20466.f66408, AbstractC8907.m23168(abstractC8907, new C8201(i9)));
                        }
                        c20468 = c20467;
                    }
                    if (c20468 == null) {
                        c17644 = c17643;
                    } else {
                        if (abstractC2120 instanceof C6789) {
                            c23724 = this.f6055;
                            if (c23724 != null && c23724.m52254() && ((C6438) abstractC17373M6671).m17621() == this.f6055.f76773.f7773) {
                                c20468.f66407 |= 1073741824;
                            }
                            c20468.f66407++;
                            if (hashSet.add(c20468)) {
                                c17644 = c17643;
                                c17644.f56085 = true;
                                i3 = i - 1;
                            } else {
                                c17644 = c17643;
                            }
                        } else {
                            c17644 = c17643;
                            if (!abstractC17373M6671.mo12939() || hashSet.add(c20468)) {
                                if ((abstractC17373M6671 instanceof C23018) || i < 0) {
                                    i2 = i;
                                } else {
                                    i3 = i + 1;
                                }
                                mo5174(c20468, c17643, hashSet, z4, z2, i2, z3);
                            }
                        }
                        i2 = i3;
                        mo5174(c20468, c17643, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iMo10717 = c20466.f66408.mo10717();
                int i10 = 0;
                while (true) {
                    C16233 c16233 = this.f48446;
                    if (i10 >= iMo10717) {
                        C21961 c21961 = (C21961) c16233.f52365.get(((AbstractC0793) abstractC2120.m6671(i4).f55272).f3382.f7775);
                        int i11 = 0;
                        while (true) {
                            if (i11 < iMo10717) {
                                AbstractC2120 abstractC2121 = (AbstractC2120) c16233.f52365.get(c20466.f66408.mo10718(i11));
                                if (abstractC2121.f7778.size() == i6 && abstractC2121.m6671(i4).mo12939()) {
                                    AbstractC2120 abstractC2122 = abstractC2121.m6671(i4).f55272;
                                    if ((abstractC2121.mo2265() == 8 && abstractC2122 == abstractC2120) || abstractC2121 == c21961 || abstractC2122 == c21961 || (abstractC2122.mo2265() == 8 && abstractC2122.f7778.size() == 1 && abstractC2122.m6671(0).mo12939() && abstractC2122.m6671(0).f55272 == abstractC2120)) {
                                        i4 = 0;
                                        i11++;
                                        i6 = 1;
                                    }
                                }
                            }
                            c17644 = c17645;
                        }
                    } else if (((AbstractC2120) c16233.f52365.get(c20466.f66408.mo10718(i10))).f7773 == abstractC2120.f7773) {
                        i10++;
                    }
                    abstractC17373M6671 = abstractC2120.m6671(i5);
                    if (abstractC17373M6671 instanceof C4321) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!mo5182()) {
                    }
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo12146 = abstractC17373M6671.mo12146();
                    AbstractC7060 abstractC7061 = this.f6061;
                    if (iMo12146 != 10) {
                        switch (iMo12146) {
                            case 1:
                                c20468 = new C20466(c20466, abstractC17373M6671.f55272, c20466.f66408, abstractC8907);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c20468 = null;
                                } else {
                                    c20468 = null;
                                }
                                break;
                            case 3:
                                C23018 c23019 = (C23018) abstractC17373M6671;
                                c20467 = new C20466(c20466, c23019.f55272, C7495.m19996(c20466.f66408, c23019.f74809.f7775), abstractC8907);
                                c20468 = c20467;
                                break;
                            case 4:
                                c13846 = (C13846) abstractC17373M6671;
                                int i12 = c13846.f45677;
                                int i13 = c13846.f45678;
                                boolean z7 = c13846.f45679;
                                if (!z4) {
                                    c20468 = new C20466(c20466, c13846.f55272, c20466.f66408, abstractC8907);
                                } else {
                                    c20468 = new C20466(c20466, c13846.f55272, c20466.f66408, abstractC8907);
                                }
                                break;
                            case 6:
                                c20468 = new C20466(c20466, ((C4321) abstractC17373M6671).f55272, c20466.f66408, abstractC8907);
                                break;
                            default:
                                c20468 = null;
                                break;
                        }
                    } else {
                        c4672 = (C4672) abstractC17373M6671;
                        int i14 = c4672.f16535;
                        if (z4) {
                            c20467 = new C20466(c20466, c4672.f55272, c20466.f66408, abstractC8907);
                            c20468 = c20467;
                        } else {
                            c20467 = new C20466(c20466, c4672.f55272, c20466.f66408, abstractC8907);
                            c20468 = c20467;
                        }
                    }
                    if (c20468 == null) {
                        c17644 = c17643;
                    } else {
                        if (abstractC2120 instanceof C6789) {
                            c23724 = this.f6055;
                            if (c23724 != null) {
                                c20468.f66407 |= 1073741824;
                            }
                            c20468.f66407++;
                            if (hashSet.add(c20468)) {
                                c17644 = c17643;
                            } else {
                                c17644 = c17643;
                                c17644.f56085 = true;
                                i3 = i - 1;
                            }
                        } else {
                            c17644 = c17643;
                            if (!abstractC17373M6671.mo12939()) {
                            }
                            if (abstractC17373M6671 instanceof C23018) {
                            }
                            i2 = i;
                            mo5174(c20468, c17643, hashSet, z4, z2, i2, z3);
                        }
                        i2 = i3;
                        mo5174(c20468, c17643, hashSet, z4, z2, i2, z3);
                    }
                }
            }
            c17645 = c17644;
            i5++;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m5157(AbstractC2120 abstractC2120, boolean z) {
        if ((abstractC2120 instanceof C6789) || (abstractC2120 instanceof C20196)) {
            return false;
        }
        boolean z2 = abstractC2120.f7777;
        for (int i = 0; i < abstractC2120.f7778.size(); i++) {
            AbstractC17373 abstractC17373M6671 = abstractC2120.m6671(i);
            int iMo12146 = abstractC17373M6671.mo12146();
            if (z2) {
                if (iMo12146 != 1) {
                    return false;
                }
            } else {
                if (abstractC17373M6671.mo12939() || (z && ((iMo12146 == 5 || iMo12146 == 2 || iMo12146 == 7) && abstractC17373M6671.mo12147(-1, 1)))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public BitSet mo5179(C17643 c17643) {
        return EnumC1144.m4185(EnumC1144.m4186(c17643));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C4237 m5180(int i, C4943 c4943, C23289 c23289) {
        return new C4237(this.f6061, c4943, c4943.m13722(i), c4943.mo13724(1), c23289);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9613 m5167(C23724 c23724, C9613 c9613, int i, C9613 c9614) {
        if (c9614 == null) {
            return null;
        }
        C9613 c9613Mo5165 = mo5165(c23724, c9614);
        if (c9613 == null || i < -1 || i > this.f48446.f52364) {
            return c9613Mo5165;
        }
        synchronized (c9613) {
            if (c9613.f32386 == null) {
                c9613.f32386 = new C9613[this.f48446.f52364 + 2];
            }
            c9613.f32386[i + 1] = c9613Mo5165;
        }
        return c9613Mo5165;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C9613 mo5165(C23724 c23724, C9613 c9613) {
        if (c9613 == AbstractC14822.f48445) {
            return c9613;
        }
        synchronized (c23724.f76774) {
            C9613 c9614 = (C9613) c23724.f76774.get(c9613);
            if (c9614 != null) {
                return c9614;
            }
            c9613.f32385 = c23724.f76774.size();
            C17643 c17643 = c9613.f32382;
            boolean z = c17643.f56087;
            if (!z) {
                ArrayList<C20466> arrayList = c17643.f56084;
                if (z) {
                    throw new IllegalStateException("This set is readonly");
                }
                if (!arrayList.isEmpty()) {
                    for (C20466 c20466 : arrayList) {
                        c20466.f66408 = mo35507(c20466.f66408);
                    }
                }
                c9613.f32382.m41116();
            }
            c23724.f76774.put(c9613, c9613);
            return c9613;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5176(C23724 c23724, int i, C17643 c17643, int i2, int i3) {
        AbstractC7060 abstractC7060 = this.f6061;
        if (abstractC7060 != null) {
            abstractC7060.m43801().mo16069(this.f6061, c23724, i2, i3, i, c17643);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5175(C23724 c23724, int i, int i2, boolean z, BitSet bitSet, C17643 c17643) {
        AbstractC7060 abstractC7060 = this.f6061;
        if (abstractC7060 != null) {
            abstractC7060.m43801().mo16071(this.f6061, c23724, i, i2, z, bitSet, c17643);
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC1144 m5177() {
        return this.f6058;
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C14201());
        } catch (SecurityException unused) {
            str = null;
        }
        f6053 = Boolean.parseBoolean(str);
    }
}
