package l;

import java.security.AccessController;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.ܽܶۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: AARN */
/* JADX INFO: loaded from: classes5.dex */
public class C17671 extends AbstractC16969 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final boolean f58065;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C20875 f58066;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C25351[] f58067;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public EnumC14687 f58068;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f58069;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C7998 f58070;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C3523 f58071;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C25351 f58072;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final AbstractC0540 f58073;

    @Override // l.AbstractC16969
    /* JADX INFO: renamed from: ۙ */
    public final void mo4767() {
    }

    /* JADX INFO: renamed from: ᩷ */
    public boolean mo4380() {
        return false;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4377(C22937 c22937, AbstractC17715 abstractC17715, C5783 c5783, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (abstractC17715.f58210) {
            for (int i2 = 0; i2 < abstractC17715.f58208.size(); i2++) {
                AbstractC17715 abstractC17716 = abstractC17715.m41478(i2).f20405;
                if (m41329(abstractC17716, z3)) {
                    mo4377(c22937, abstractC17716, c5783, hashSet, z, z2, i, z3);
                } else {
                    mo4376(new C22937(c22937, abstractC17716, c22937.f74515, c22937.f74516), c5783, hashSet, z, z2, i, z3);
                }
            }
            return;
        }
        c5783.m16884(c22937, abstractC17715, c22937.f74515, c22937.f74516, this.f58066);
    }

    public C17671(AbstractC0540 abstractC0540, C11002 c11002, C25351[] c25351Arr, C6485 c6485) {
        super(c11002, c6485);
        this.f58068 = EnumC14687.LL;
        this.f58073 = abstractC0540;
        this.f58067 = c25351Arr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ */
    public int mo4368(int i, C3523 c3523, C7998 c7998) {
        C16399 c16399Mo4374;
        this.f58071 = c3523;
        this.f58069 = c3523.index();
        this.f58070 = c7998;
        C25351 c25351 = this.f58067[i];
        this.f58072 = c25351;
        c3523.mo11529();
        int i2 = this.f58069;
        try {
            if (c25351.m56686()) {
                c16399Mo4374 = c25351.m56684(this.f58073.m2523());
            } else {
                c16399Mo4374 = c25351.f81862;
            }
            if (c16399Mo4374 == null) {
                if (c7998 == null) {
                    c7998 = C7998.f26546;
                }
                C5783 c5783M41336 = m41336((AbstractC17715) c25351.f81858, C7998.f26546, false);
                if (c25351.m56686()) {
                    c25351.f81862.f53210 = c5783M41336;
                    c16399Mo4374 = mo4374(c25351, new C16399(m41335(c5783M41336)));
                    c25351.m56685(this.f58073.m2523(), c16399Mo4374);
                } else {
                    c16399Mo4374 = mo4374(c25351, new C16399(c5783M41336));
                    c25351.f81862 = c16399Mo4374;
                }
            }
            return m41333(c25351, c16399Mo4374, c3523, i2, c7998);
        } finally {
            this.f58066 = null;
            this.f58072 = null;
            c3523.mo11530(i2);
            c3523.getClass();
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static int m41330(C5783 c5783) {
        int i = 0;
        for (C22937 c22937 : c5783.f19856) {
            if (i == 0) {
                i = c22937.f74512;
            } else if (c22937.f74512 != i) {
                return 0;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41333(C25351 c25351, C16399 c16399, C3523 c3523, int i, C7998 c7998) {
        BitSet bitSet;
        int iMo11537 = c3523.mo11537(1);
        C16399 c163910 = c16399;
        while (true) {
            C16399 c16399Mo4373 = mo4373(iMo11537, c163910);
            if (c16399Mo4373 == null) {
                c16399Mo4373 = mo4375(c25351, c163910, iMo11537);
            }
            C16399 c163911 = c16399Mo4373;
            if (c163911 == AbstractC16969.f55480) {
                C18439 c18439M41341 = m41341(i, c3523, c7998);
                c3523.mo11530(i);
                int iM41332 = m41332(c163910.f53210, c7998);
                if (iM41332 != 0) {
                    return iM41332;
                }
                throw c18439M41341;
            }
            if (c163911.f53213 && this.f58068 != EnumC14687.SLL) {
                BitSet bitSet2 = c163911.f53210.f19859;
                if (c163911.f53215 != null) {
                    int iIndex = c3523.index();
                    if (iIndex != i) {
                        c3523.mo11530(i);
                    }
                    BitSet bitSetM41334 = m41334(c163911.f53215, c7998);
                    if (bitSetM41334.cardinality() == 1) {
                        return bitSetM41334.nextSetBit(0);
                    }
                    if (iIndex != i) {
                        c3523.mo11530(iIndex);
                    }
                    bitSet = bitSetM41334;
                } else {
                    bitSet = bitSet2;
                }
                C5783 c5783M41336 = m41336((AbstractC17715) c25351.f81858, c7998, true);
                C5783 c5783 = c163911.f53210;
                int iIndex2 = c3523.index();
                AbstractC0540 abstractC0540 = this.f58073;
                if (abstractC0540 != null) {
                    abstractC0540.m24873().mo7004(this.f58073, c25351, i, iIndex2, bitSet, c5783);
                }
                return mo4369(c25351, c163911, c5783M41336, c3523, i, c7998);
            }
            if (c163911.f53212) {
                if (c163911.f53215 == null) {
                    return c163911.f53214;
                }
                int iIndex3 = c3523.index();
                c3523.mo11530(i);
                BitSet bitSetM41335 = m41334(c163911.f53215, c7998);
                int iCardinality = bitSetM41335.cardinality();
                if (iCardinality == 0) {
                    throw m41341(i, c3523, c7998);
                }
                if (iCardinality == 1) {
                    return bitSetM41335.nextSetBit(0);
                }
                m41338(c25351, i, iIndex3, false, bitSetM41335, c163911.f53210);
                return bitSetM41335.nextSetBit(0);
            }
            if (iMo11537 != -1) {
                c3523.mo11538();
                iMo11537 = c3523.mo11537(1);
            }
            c163910 = c163911;
        }
    }

    /* JADX INFO: renamed from: ۙ */
    public C16399 mo4373(int i, C16399 c16399) {
        int i2;
        C16399[] c16399Arr = c16399.f53216;
        if (c16399Arr == null || (i2 = i + 1) < 0 || i2 >= c16399Arr.length) {
            return null;
        }
        return c16399Arr[i2];
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ac A[PHI: r10
      0x00ac: PHI (r10v1 l.ۜܶۨ) = (r10v3 l.ۜܶۨ), (r10v4 l.ۜܶۨ), (r10v5 l.ۜܶۨ) binds: [B:31:0x009a, B:32:0x009c, B:35:0x00a7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۙ */
    public C16399 mo4375(C25351 c25351, C16399 c16399, int i) {
        BitSet bitSet;
        C5783 c5783Mo4370 = mo4370(c16399.f53210, i, false);
        if (c5783Mo4370 == null) {
            C16399 c163910 = AbstractC16969.f55480;
            m41337(c25351, c16399, i, c163910);
            return c163910;
        }
        C16399 c163911 = new C16399(c5783Mo4370);
        int iM41330 = m41330(c5783Mo4370);
        if (iM41330 != 0) {
            c163911.f53212 = true;
            c163911.f53210.f19858 = iM41330;
            c163911.f53214 = iM41330;
        } else if (mo4378(c5783Mo4370)) {
            c163911.f53210.f19859 = mo4379(c5783Mo4370);
            c163911.f53213 = true;
            c163911.f53212 = true;
            c163911.f53214 = c163911.f53210.f19859.nextSetBit(0);
        }
        if (c163911.f53212 && c163911.f53210.f19857) {
            int size = this.f55481.m27846(c25351.f81861).f58208.size();
            C5783 c5783 = c163911.f53210;
            if (c5783.f19858 != 0) {
                bitSet = new BitSet();
                bitSet.set(c5783.f19858);
            } else {
                bitSet = c5783.f19859;
            }
            AbstractC7230[] abstractC7230Arr = new AbstractC7230[size + 1];
            for (C22937 c22937 : c163911.f53210.f19856) {
                if (bitSet.get(c22937.f74512)) {
                    int i2 = c22937.f74512;
                    AbstractC7230 abstractC7230 = abstractC7230Arr[i2];
                    AbstractC7230 abstractC7231 = c22937.f74516;
                    AbstractC7230 abstractC7232 = abstractC7230;
                    if (abstractC7230 == null) {
                        abstractC7232 = abstractC7231;
                    } else if (abstractC7231 != null) {
                        C10212 c10212 = C10212.f32654;
                        if (abstractC7230 == c10212 || abstractC7231 == c10212) {
                            AbstractC7230 abstractC7233 = c10212;
                            abstractC7233 = c10212;
                            abstractC7232 = abstractC7233;
                        } else {
                            C1264 c1264 = new C1264(abstractC7230, abstractC7231);
                            AbstractC7230[] abstractC7230Arr2 = c1264.f4557;
                            abstractC7233 = c1264;
                            if (abstractC7230Arr2.length == 1) {
                                abstractC7232 = abstractC7230Arr2[0];
                            } else {
                                AbstractC7230 abstractC7234 = c10212;
                                abstractC7234 = c10212;
                                abstractC7232 = abstractC7234;
                            }
                        }
                    }
                    abstractC7230Arr[i2] = abstractC7232;
                }
            }
            int i3 = 0;
            for (int i4 = 1; i4 <= size; i4++) {
                AbstractC7230 abstractC7235 = abstractC7230Arr[i4];
                if (abstractC7235 == null) {
                    abstractC7230Arr[i4] = C10212.f32654;
                } else if (abstractC7235 != C10212.f32654) {
                    i3++;
                }
            }
            AbstractC7230[] abstractC7230Arr3 = abstractC7230Arr;
            if (i3 == 0) {
                abstractC7230Arr3 = null;
            }
            if (abstractC7230Arr3 == null) {
                c163911.f53214 = bitSet.nextSetBit(0);
            } else {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (int i5 = 1; i5 < abstractC7230Arr3.length; i5++) {
                    AbstractC7230 abstractC7236 = abstractC7230Arr3[i5];
                    if (bitSet != null && bitSet.get(i5)) {
                        C17891 c17891 = new C17891();
                        c17891.f58622 = i5;
                        c17891.f58623 = abstractC7236;
                        arrayList.add(c17891);
                    }
                    if (abstractC7236 != C10212.f32654) {
                        z = true;
                    }
                }
                c163911.f53215 = z ? (C17891[]) arrayList.toArray(new C17891[0]) : null;
                c163911.f53214 = 0;
            }
            if (c163911.f53215 != null) {
                c163911.f53214 = 0;
            }
        }
        return m41337(c25351, c16399, i, c163911);
    }

    /* JADX INFO: renamed from: ۤ */
    public boolean mo4378(C5783 c5783) {
        return EnumC14687.m35323(this.f58068, c5783);
    }

    /* JADX INFO: renamed from: ۙ */
    public int mo4369(C25351 c25351, C16399 c16399, C5783 c5783, C3523 c3523, int i, C7998 c7998) {
        C5783 c5783Mo4370;
        int iM35335;
        boolean z;
        c3523.mo11530(i);
        int iMo11537 = c3523.mo11537(1);
        while (true) {
            c5783Mo4370 = mo4370(c5783, iMo11537, true);
            if (c5783Mo4370 == null) {
                C18439 c18439M41341 = m41341(i, c3523, c7998);
                c3523.mo11530(i);
                int iM41332 = m41332(c5783, c7998);
                if (iM41332 != 0) {
                    return iM41332;
                }
                throw c18439M41341;
            }
            Collection collectionM35327 = EnumC14687.m35327(c5783Mo4370);
            int iM41330 = m41330(c5783Mo4370);
            c5783Mo4370.f19858 = iM41330;
            if (iM41330 == 0) {
                if (this.f58068 != EnumC14687.LL_EXACT_AMBIG_DETECTION) {
                    iM41330 = EnumC14687.m35325(collectionM35327);
                    if (iM41330 != 0) {
                    }
                } else if (EnumC14687.m35321(collectionM35327) && EnumC14687.m35334(collectionM35327)) {
                    iM35335 = EnumC14687.m35335(collectionM35327);
                    z = true;
                    break;
                }
                if (iMo11537 != -1) {
                    c3523.mo11538();
                    iMo11537 = c3523.mo11537(1);
                }
                c5783 = c5783Mo4370;
            }
            iM35335 = iM41330;
            z = false;
            break;
        }
        if (c5783Mo4370.f19858 != 0) {
            m41339(c25351, iM35335, c5783Mo4370, i, c3523.index());
            return iM35335;
        }
        m41338(c25351, i, c3523.index(), z, c5783Mo4370.m16887(), c5783Mo4370);
        return iM35335;
    }

    /* JADX INFO: renamed from: ۙ */
    public C5783 mo4371(boolean z) {
        return new C5783(z, false);
    }

    /* JADX INFO: renamed from: ۙ */
    public C5783 mo4370(C5783 c5783, int i, boolean z) {
        C11002 c11002;
        int i2;
        if (this.f58066 == null) {
            this.f58066 = new C20875();
        }
        C5783 c5783Mo4371 = mo4371(z);
        ArrayList arrayList = c5783Mo4371.f19856;
        Iterator it = c5783.f19856.iterator();
        ArrayList arrayList2 = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            c11002 = this.f55481;
            if (!zHasNext) {
                break;
            }
            C22937 c22937 = (C22937) it.next();
            AbstractC17715 abstractC17715 = c22937.f74514;
            if (!(abstractC17715 instanceof C0518)) {
                int i3 = 0;
                for (int size = abstractC17715.f58208.size(); i3 < size; size = size) {
                    AbstractC5959 abstractC5959M41478 = c22937.f74514.m41478(i3);
                    AbstractC17715 abstractC17716 = abstractC5959M41478.mo2569(i, c11002.f34756) ? abstractC5959M41478.f20405 : null;
                    if (abstractC17716 != null) {
                        c5783Mo4371.m16884(c22937, abstractC17716, c22937.f74515, c22937.f74516, this.f58066);
                    }
                    i3++;
                }
            } else if (z || i == -1) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(c22937);
            }
        }
        C5783 c5784 = (arrayList2 != null || i == -1 || (arrayList.size() != 1 && m41330(c5783Mo4371) == 0)) ? null : c5783Mo4371;
        if (c5784 == null) {
            C5783 c5783Mo4372 = mo4371(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                mo4376((C22937) it2.next(), c5783Mo4372, hashSet, false, z, 0, z2);
            }
            i2 = -1;
            c5784 = c5783Mo4372;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c5784 == c5783Mo4371;
            if (!EnumC14687.m35322(c5784)) {
                C5783 c5783Mo4373 = mo4371(c5784.f19861);
                for (C22937 c22938 : c5784.f19856) {
                    AbstractC17715 abstractC17717 = c22938.f74514;
                    if (!(abstractC17717 instanceof C0518)) {
                        if (z3 && abstractC17717.f58210 && c11002.m27844(abstractC17717).m35864(-2)) {
                            c5783Mo4373.m16884(c22938, c11002.f34752[c22938.f74514.f58211], c22938.f74515, c22938.f74516, this.f58066);
                        }
                    } else {
                        c5783Mo4373.m16885(c22938, this.f58066);
                    }
                }
                c5784 = c5783Mo4373;
            }
        }
        if (arrayList2 != null && (!z || !EnumC14687.m35332(c5784))) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                c5784.m16885((C22937) it3.next(), this.f58066);
            }
        }
        if (c5784.f19856.isEmpty()) {
            return null;
        }
        return c5784;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5783 m41336(AbstractC17715 abstractC17715, C7998 c7998, boolean z) {
        C5213 c5213M30918 = AbstractC12450.m30918(this.f55481, c7998);
        C5783 c5783Mo4371 = mo4371(z);
        int i = 0;
        while (i < abstractC17715.f58208.size()) {
            int i2 = i + 1;
            mo4376(new C22937(abstractC17715.m41478(i).f20405, i2, c5213M30918), c5783Mo4371, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c5783Mo4371;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5783 m41335(C5783 c5783) {
        AbstractC12450 abstractC12450;
        AbstractC7230 abstractC7230Mo4585;
        HashMap map = new HashMap();
        C5783 c5783Mo4371 = mo4371(c5783.f19861);
        ArrayList<C22937> arrayList = c5783.f19856;
        for (C22937 c22937 : arrayList) {
            int i = c22937.f74512;
            AbstractC7230 abstractC7230 = c22937.f74516;
            if (i == 1 && (abstractC7230Mo4585 = abstractC7230.mo4585(this.f58073, this.f58070)) != null) {
                map.put(Integer.valueOf(c22937.f74514.f58209), c22937.f74515);
                if (abstractC7230Mo4585 != abstractC7230) {
                    c5783Mo4371.m16884(c22937, c22937.f74514, c22937.f74515, abstractC7230Mo4585, this.f58066);
                } else {
                    c5783Mo4371.m16885(c22937, this.f58066);
                }
            }
        }
        for (C22937 c22938 : arrayList) {
            if (c22938.f74512 != 1 && ((c22938.f74513 & 1073741824) != 0 || (abstractC12450 = (AbstractC12450) map.get(Integer.valueOf(c22938.f74514.f58209))) == null || !abstractC12450.equals(c22938.f74515))) {
                c5783Mo4371.m16885(c22938, this.f58066);
            }
        }
        return c5783Mo4371;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static int m41331(C5783 c5783) {
        C14907 c14907 = new C14907(new int[0]);
        for (C22937 c22937 : c5783.f19856) {
            if ((c22937.f74513 & (-1073741825)) > 0 || ((c22937.f74514 instanceof C0518) && c22937.f74515.m30921())) {
                c14907.m35858(c22937.f74512);
            }
        }
        if (c14907.m35862() == 0) {
            return 0;
        }
        return c14907.m35856();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m41332(C5783 c5783, C7998 c7998) {
        int iM41331;
        C5783 c5783Mo4371 = mo4371(c5783.f19861);
        C5783 c5783Mo4372 = mo4371(c5783.f19861);
        for (C22937 c22937 : c5783.f19856) {
            AbstractC7230 abstractC7230 = c22937.f74516;
            if (abstractC7230 == C10212.f32654 || abstractC7230.mo4584(this.f58073, c7998)) {
                c5783Mo4371.m16885(c22937, null);
            } else {
                c5783Mo4372.m16885(c22937, null);
            }
        }
        int iM41332 = m41331(c5783Mo4371);
        if (iM41332 != 0) {
            return iM41332;
        }
        if (c5783Mo4372.f19856.size() <= 0 || (iM41331 = m41331(c5783Mo4372)) == 0) {
            return 0;
        }
        return iM41331;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final BitSet m41334(C17891[] c17891Arr, C7998 c7998) {
        BitSet bitSet = new BitSet();
        for (C17891 c17891 : c17891Arr) {
            AbstractC7230 abstractC7230 = c17891.f58623;
            int i = c17891.f58622;
            if (abstractC7230 == C10212.f32654) {
                bitSet.set(i);
            } else if (abstractC7230.mo4584(this.f58073, c7998)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo4376(C22937 c22937, C5783 c5783, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c22937.f74514 instanceof C0518) {
            if (!c22937.f74515.mo30922()) {
                for (int i2 = 0; i2 < c22937.f74515.mo15679(); i2++) {
                    if (c22937.f74515.mo15680(i2) != Integer.MAX_VALUE) {
                        C22937 c22938 = new C22937((AbstractC17715) this.f55481.f34748.get(c22937.f74515.mo15680(i2)), c22937.f74512, c22937.f74515.mo15678(i2), c22937.f74516);
                        c22938.f74513 = c22937.f74513;
                        mo4376(c22938, c5783, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c5783.m16884(c22937, c22937.f74514, C18461.f60086, c22937.f74516, this.f58066);
                    } else {
                        m41342(c22937, c5783, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c5783.m16885(c22937, this.f58066);
                return;
            }
        }
        m41342(c22937, c5783, hashSet, z, z2, i, z3);
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
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m41342(C22937 c22937, C5783 c5783, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        AbstractC5959 abstractC5959M41478;
        boolean z4;
        boolean z5;
        int iMo2568;
        C3501 c3501;
        C22937 c22938;
        C22937 c22939;
        C5783 c5784;
        int i2;
        int i3;
        C25351 c25351;
        C20655 c20655;
        C5783 c5785 = c5783;
        AbstractC17715 abstractC17715 = c22937.f74514;
        AbstractC7230 abstractC7230 = c22937.f74516;
        if (!abstractC17715.f58210) {
            c5785.m16885(c22937, this.f58066);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC17715.f58208.size()) {
            int i6 = 1;
            if (i5 != 0 || f58065 || abstractC17715.mo2479() != 10 || !((C23113) abstractC17715).f74966 || c22937.f74515.mo30922() || c22937.f74515.m30921()) {
                abstractC5959M41478 = abstractC17715.m41478(i5);
                if ((abstractC5959M41478 instanceof C3545) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!mo4380() && abstractC17715.f58210 && !(abstractC17715 instanceof C0518) && abstractC5959M41478.mo2568() == 1 && m41329(abstractC5959M41478.f20405, z3)) {
                    mo4377(c22937, abstractC5959M41478.f20405, c5783, hashSet, z4, z2, i, z3);
                    c5784 = c5785;
                } else {
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo2568 = abstractC5959M41478.mo2568();
                    AbstractC0540 abstractC0540 = this.f58073;
                    if (iMo2568 != 10) {
                        switch (iMo2568) {
                            case 1:
                                c22939 = new C22937(c22937, abstractC5959M41478.f20405, c22937.f74515, abstractC7230);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3 && abstractC5959M41478.mo2569(-1, 1)) {
                                    c22939 = new C22937(c22937, abstractC5959M41478.f20405, c22937.f74515, abstractC7230);
                                } else {
                                    c22939 = null;
                                }
                                break;
                            case 3:
                                C7976 c7976 = (C7976) abstractC5959M41478;
                                c22938 = new C22937(c22937, c7976.f20405, C5213.m15677(c22937.f74515, c7976.f26510.f58209), abstractC7230);
                                c22939 = c22938;
                                break;
                            case 4:
                                c20655 = (C20655) abstractC5959M41478;
                                int i7 = c20655.f66241;
                                int i8 = c20655.f66240;
                                boolean z6 = c20655.f66239;
                                if (!z4 || (z6 && (!z6 || !z5))) {
                                    c22939 = new C22937(c22937, c20655.f20405, c22937.f74515, abstractC7230);
                                } else if (!z2) {
                                    c22938 = new C22937(c22937, c20655.f20405, c22937.f74515, AbstractC7230.m19830(abstractC7230, new C8721(i8, i7, z6)));
                                    c22939 = c22938;
                                } else {
                                    int iIndex = this.f58071.index();
                                    this.f58071.mo11530(this.f58069);
                                    boolean zMo4584 = new C8721(i8, i7, z6).mo4584(abstractC0540, this.f58070);
                                    this.f58071.mo11530(iIndex);
                                    if (!zMo4584) {
                                        c22939 = null;
                                    } else {
                                        c22939 = new C22937(c22937, c20655.f20405, c22937.f74515, abstractC7230);
                                    }
                                }
                                break;
                            case 6:
                                c22939 = new C22937(c22937, ((C3545) abstractC5959M41478).f20405, c22937.f74515, abstractC7230);
                                break;
                            default:
                                c22939 = null;
                                break;
                        }
                    } else {
                        c3501 = (C3501) abstractC5959M41478;
                        int i9 = c3501.f12074;
                        if (z4 || !z5) {
                            c22938 = new C22937(c22937, c3501.f20405, c22937.f74515, abstractC7230);
                        } else if (z2) {
                            int iIndex2 = this.f58071.index();
                            this.f58071.mo11530(this.f58069);
                            boolean zMo2516 = abstractC0540.mo2516(new C2755(i9).f9117);
                            this.f58071.mo11530(iIndex2);
                            if (zMo2516) {
                                c22939 = new C22937(c22937, c3501.f20405, c22937.f74515, abstractC7230);
                            } else {
                                c22939 = null;
                            }
                        } else {
                            c22938 = new C22937(c22937, c3501.f20405, c22937.f74515, AbstractC7230.m19830(abstractC7230, new C2755(i9)));
                        }
                        c22939 = c22938;
                    }
                    if (c22939 == null) {
                        c5784 = c5783;
                    } else {
                        if (abstractC17715 instanceof C0518) {
                            c25351 = this.f58072;
                            if (c25351 != null && c25351.m56686() && ((C0562) abstractC5959M41478).m2571() == this.f58072.f81858.f58211) {
                                c22939.f74513 |= 1073741824;
                            }
                            c22939.f74513++;
                            if (hashSet.add(c22939)) {
                                c5784 = c5783;
                                c5784.f19864 = true;
                                i3 = i - 1;
                            } else {
                                c5784 = c5783;
                            }
                        } else {
                            c5784 = c5783;
                            if (!abstractC5959M41478.mo2570() || hashSet.add(c22939)) {
                                if ((abstractC5959M41478 instanceof C7976) || i < 0) {
                                    i2 = i;
                                } else {
                                    i3 = i + 1;
                                }
                                mo4376(c22939, c5783, hashSet, z4, z2, i2, z3);
                            }
                        }
                        i2 = i3;
                        mo4376(c22939, c5783, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iMo15679 = c22937.f74515.mo15679();
                int i10 = 0;
                while (true) {
                    C11002 c11002 = this.f55481;
                    if (i10 >= iMo15679) {
                        C4291 c4291 = (C4291) c11002.f34748.get(((AbstractC14731) abstractC17715.m41478(i4).f20405).f48134.f58209);
                        int i11 = 0;
                        while (true) {
                            if (i11 < iMo15679) {
                                AbstractC17715 abstractC17716 = (AbstractC17715) c11002.f34748.get(c22937.f74515.mo15680(i11));
                                if (abstractC17716.f58208.size() == i6 && abstractC17716.m41478(i4).mo2570()) {
                                    AbstractC17715 abstractC17717 = abstractC17716.m41478(i4).f20405;
                                    if ((abstractC17716.mo2479() == 8 && abstractC17717 == abstractC17715) || abstractC17716 == c4291 || abstractC17717 == c4291 || (abstractC17717.mo2479() == 8 && abstractC17717.f58208.size() == 1 && abstractC17717.m41478(0).mo2570() && abstractC17717.m41478(0).f20405 == abstractC17715)) {
                                        i4 = 0;
                                        i11++;
                                        i6 = 1;
                                    }
                                }
                            }
                            c5784 = c5785;
                        }
                    } else if (((AbstractC17715) c11002.f34748.get(c22937.f74515.mo15680(i10))).f58211 == abstractC17715.f58211) {
                        i10++;
                    }
                    abstractC5959M41478 = abstractC17715.m41478(i5);
                    if (abstractC5959M41478 instanceof C3545) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (!mo4380()) {
                    }
                    i5 = i5;
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo2568 = abstractC5959M41478.mo2568();
                    AbstractC0540 abstractC0541 = this.f58073;
                    if (iMo2568 != 10) {
                        switch (iMo2568) {
                            case 1:
                                c22939 = new C22937(c22937, abstractC5959M41478.f20405, c22937.f74515, abstractC7230);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c22939 = null;
                                } else {
                                    c22939 = null;
                                }
                                break;
                            case 3:
                                C7976 c7977 = (C7976) abstractC5959M41478;
                                c22938 = new C22937(c22937, c7977.f20405, C5213.m15677(c22937.f74515, c7977.f26510.f58209), abstractC7230);
                                c22939 = c22938;
                                break;
                            case 4:
                                c20655 = (C20655) abstractC5959M41478;
                                int i12 = c20655.f66241;
                                int i13 = c20655.f66240;
                                boolean z7 = c20655.f66239;
                                if (!z4) {
                                    c22939 = new C22937(c22937, c20655.f20405, c22937.f74515, abstractC7230);
                                } else {
                                    c22939 = new C22937(c22937, c20655.f20405, c22937.f74515, abstractC7230);
                                }
                                break;
                            case 6:
                                c22939 = new C22937(c22937, ((C3545) abstractC5959M41478).f20405, c22937.f74515, abstractC7230);
                                break;
                            default:
                                c22939 = null;
                                break;
                        }
                    } else {
                        c3501 = (C3501) abstractC5959M41478;
                        int i14 = c3501.f12074;
                        if (z4) {
                            c22938 = new C22937(c22937, c3501.f20405, c22937.f74515, abstractC7230);
                            c22939 = c22938;
                        } else {
                            c22938 = new C22937(c22937, c3501.f20405, c22937.f74515, abstractC7230);
                            c22939 = c22938;
                        }
                    }
                    if (c22939 == null) {
                        c5784 = c5783;
                    } else {
                        if (abstractC17715 instanceof C0518) {
                            c25351 = this.f58072;
                            if (c25351 != null) {
                                c22939.f74513 |= 1073741824;
                            }
                            c22939.f74513++;
                            if (hashSet.add(c22939)) {
                                c5784 = c5783;
                            } else {
                                c5784 = c5783;
                                c5784.f19864 = true;
                                i3 = i - 1;
                            }
                        } else {
                            c5784 = c5783;
                            if (!abstractC5959M41478.mo2570()) {
                            }
                            if (abstractC5959M41478 instanceof C7976) {
                            }
                            i2 = i;
                            mo4376(c22939, c5783, hashSet, z4, z2, i2, z3);
                        }
                        i2 = i3;
                        mo4376(c22939, c5783, hashSet, z4, z2, i2, z3);
                    }
                }
            }
            c5785 = c5784;
            i5++;
            i4 = 0;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m41329(AbstractC17715 abstractC17715, boolean z) {
        if ((abstractC17715 instanceof C0518) || (abstractC17715 instanceof C23113)) {
            return false;
        }
        boolean z2 = abstractC17715.f58210;
        for (int i = 0; i < abstractC17715.f58208.size(); i++) {
            AbstractC5959 abstractC5959M41478 = abstractC17715.m41478(i);
            int iMo2568 = abstractC5959M41478.mo2568();
            if (z2) {
                if (iMo2568 != 1) {
                    return false;
                }
            } else {
                if (abstractC5959M41478.mo2570() || (z && ((iMo2568 == 5 || iMo2568 == 2 || iMo2568 == 7) && abstractC5959M41478.mo2569(-1, 1)))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷ */
    public BitSet mo4379(C5783 c5783) {
        return EnumC14687.m35326(EnumC14687.m35327(c5783));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C18439 m41341(int i, C3523 c3523, C7998 c7998) {
        return new C18439(this.f58073, c3523, c3523.m11534(i), c3523.mo5263(1), c7998);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16399 m41337(C25351 c25351, C16399 c16399, int i, C16399 c163910) {
        if (c163910 == null) {
            return null;
        }
        C16399 c16399Mo4374 = mo4374(c25351, c163910);
        if (c16399 == null || i < -1 || i > this.f55481.f34756) {
            return c16399Mo4374;
        }
        synchronized (c16399) {
            if (c16399.f53216 == null) {
                c16399.f53216 = new C16399[this.f55481.f34756 + 2];
            }
            c16399.f53216[i + 1] = c16399Mo4374;
        }
        return c16399Mo4374;
    }

    /* JADX INFO: renamed from: ۙ */
    public C16399 mo4374(C25351 c25351, C16399 c16399) {
        if (c16399 == AbstractC16969.f55480) {
            return c16399;
        }
        synchronized (c25351.f81860) {
            C16399 c163910 = (C16399) c25351.f81860.get(c16399);
            if (c163910 != null) {
                return c163910;
            }
            c16399.f53211 = c25351.f81860.size();
            C5783 c5783 = c16399.f53210;
            boolean z = c5783.f19860;
            if (!z) {
                ArrayList<C22937> arrayList = c5783.f19856;
                if (z) {
                    throw new IllegalStateException("This set is readonly");
                }
                if (!arrayList.isEmpty()) {
                    for (C22937 c22937 : arrayList) {
                        c22937.f74515 = mo4372(c22937.f74515);
                    }
                }
                c16399.f53210.m16886();
            }
            c25351.f81860.put(c16399, c16399);
            return c16399;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41339(C25351 c25351, int i, C5783 c5783, int i2, int i3) {
        AbstractC0540 abstractC0540 = this.f58073;
        if (abstractC0540 != null) {
            abstractC0540.m24873().mo7003(this.f58073, c25351, i2, i3, i, c5783);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m41338(C25351 c25351, int i, int i2, boolean z, BitSet bitSet, C5783 c5783) {
        AbstractC0540 abstractC0540 = this.f58073;
        if (abstractC0540 != null) {
            abstractC0540.m24873().mo7005(this.f58073, c25351, i, i2, z, bitSet, c5783);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC14687 m41340() {
        return this.f58068;
    }

    static {
        String str;
        try {
            str = (String) AccessController.doPrivileged(new C16925());
        } catch (SecurityException unused) {
            str = null;
        }
        f58065 = Boolean.parseBoolean(str);
    }
}
