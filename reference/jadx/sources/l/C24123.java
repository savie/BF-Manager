package l;

import com.umeng.analytics.pro.j$$ExternalSyntheticOutline0;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩺ۜۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes.dex */
public final class C24123 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f77967;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f77968;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f77969;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f77970;

    public C24123(C10628 c10628) {
        ArrayList arrayList;
        C3239 c3239;
        int i;
        int iMo2841 = c10628.mo2841();
        Collection collectionMo2840 = c10628.mo2840();
        List<C4181> listMo2839 = c10628.mo2839();
        this.f77967 = new ArrayList();
        this.f77968 = 0;
        this.f77969 = 0;
        this.f77970 = iMo2841;
        if (((AbstractCollection) collectionMo2840).isEmpty()) {
            throw new IllegalArgumentException();
        }
        C3239 c32310 = new C3239(this, "B0", iMo2841);
        Iterator it = ((AbstractList) collectionMo2840).iterator();
        int i2 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c32310.f10565;
            if (!zHasNext) {
                break;
            }
            AbstractC12384 abstractC12384 = (AbstractC12384) it.next();
            if (!((AbstractCollection) abstractC12384.m30863().m24747()).isEmpty()) {
                if (arrayList.isEmpty()) {
                    c32310.f10555 = true;
                } else if (!c32310.f10555 && arrayList.size() == 1 && ((AbstractC12384) arrayList.get(0)).mo30864() == EnumC22631.f73424) {
                    arrayList.clear();
                    c32310.f10555 = true;
                } else {
                    this.f77967.add(c32310);
                    C3239 c32311 = new C3239(this, "B" + i2, iMo2841);
                    c32311.f10555 = true;
                    c32310.m10593(c32311, false);
                    c32311.m10592(c32310);
                    c32310 = c32311;
                    i2++;
                }
            }
            c32310.f10565.add(abstractC12384);
            if (abstractC12384.mo30864().m51000()) {
                int i3 = C6223.f21145[abstractC12384.mo30864().f73508.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    c32310.f10563 = ((AbstractC6419) abstractC12384).m18177().m48562();
                    this.f77967.add(c32310);
                    StringBuilder sb = new StringBuilder("B");
                    i = i2 + 1;
                    sb.append(i2);
                    c3239 = new C3239(this, sb.toString(), iMo2841);
                    c32310.m10593(c3239, false);
                    c3239.m10592(c32310);
                    c32310 = c3239;
                    i2 = i;
                } else if (i3 == 3 && (abstractC12384.mo30864() == EnumC22631.f73464 || abstractC12384.mo30864() == EnumC22631.f73309)) {
                    c32310.f10552 = ((AbstractC6419) abstractC12384).m18177().m48562();
                    this.f77967.add(c32310);
                    StringBuilder sb2 = new StringBuilder("B");
                    i = i2 + 1;
                    sb2.append(i2);
                    c3239 = new C3239(this, sb2.toString(), iMo2841);
                    c32310.m10593(c3239, false);
                    c3239.m10592(c32310);
                    c32310 = c3239;
                    i2 = i;
                }
            } else {
                if (abstractC12384 instanceof InterfaceC20347) {
                    c32310.f10563 = ((AbstractC6419) abstractC12384).m18177().m48562();
                }
                this.f77967.add(c32310);
                c32310 = new C3239(this, "B" + i2, iMo2841);
                i2++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f77967.add(c32310);
        }
        HashMap map = new HashMap(this.f77967.size());
        for (C3239 c32312 : this.f77967) {
            map.put(Integer.valueOf(c32312.m10596().m30863().m24742()), c32312);
        }
        for (C3239 c32313 : this.f77967) {
            int i4 = c32313.f10563;
            ArrayList arrayList2 = c32313.f10565;
            if (i4 != -1) {
                C3239 c32314 = (C3239) map.get(Integer.valueOf(i4));
                c32314 = c32314 == null ? (C3239) map.get(Integer.valueOf(c32313.f10563 + 1)) : c32314;
                if (c32314 == null) {
                    throw new RuntimeException("Block not found: address " + Integer.toHexString(c32313.f10563) + ", " + Integer.toHexString(c32313.m10596().m30863().m24742()) + ", " + Integer.toHexString(((AbstractC12384) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).m30863().m24742()));
                }
                c32314.m10592(c32313);
                c32313.m10593(c32314, false);
            } else {
                int i5 = c32313.f10552;
                if (i5 == -1) {
                    continue;
                } else {
                    C3239 c32315 = (C3239) map.get(Integer.valueOf(i5));
                    if (c32315 == null) {
                        throw new RuntimeException("Block not found: address " + c32313.f10552);
                    }
                    if (!c32315.f10562.startsWith("Switch_")) {
                        c32315.f10562 = "Switch_" + c32315.f10562;
                    }
                    c32315.m10592(c32313);
                    c32313.m10593(c32315, false);
                    int iM24742 = ((AbstractC12384) j$$ExternalSyntheticOutline0.m(arrayList2, 1)).m30863().m24742();
                    InterfaceC14379 interfaceC14379 = (InterfaceC14379) c32315.f10565.get(0);
                    C17359.requireNonNull(interfaceC14379);
                    Iterator it2 = interfaceC14379.mo20143().iterator();
                    while (it2.hasNext()) {
                        int offset = ((InterfaceC3939) it2.next()).getOffset() + iM24742;
                        C3239 c32316 = (C3239) map.get(Integer.valueOf(offset));
                        if (c32316 == null) {
                            throw new RuntimeException(C13645.m33382(offset, "Block not found: address "));
                        }
                        c32316.m10592(c32315);
                        c32315.m10593(c32316, false);
                    }
                }
            }
        }
        for (C4181 c4181 : listMo2839) {
            AbstractC20589 abstractC20589 = c4181.f14179;
            C3239 c32317 = (C3239) map.get(Integer.valueOf(abstractC20589.m47178().m48562()));
            c32317 = c32317 == null ? (C3239) map.get(Integer.valueOf(abstractC20589.m47178().m48562() + 1)) : c32317;
            if (c32317 == null) {
                throw new RuntimeException("Block not found: address " + abstractC20589.m47178().m48562());
            }
            if (!c32317.f10562.startsWith("Catch_")) {
                c32317.f10562 = "Catch_" + c32317.f10562;
            }
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                if (iIntValue >= c4181.f14178.m48562() && iIntValue < c4181.f14177.m48562()) {
                    C3239 c32318 = (C3239) entry.getValue();
                    c32318.m10593(c32317, true);
                    c32317.m10592(c32318);
                }
            }
        }
        map.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m53669() {
        int i = this.f77970;
        boolean[] zArr = new boolean[i];
        Arrays.fill(zArr, true);
        C20393 c20393 = new C20393(this, zArr);
        ArrayList<C3239> arrayList = this.f77967;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C3239) it.next()).f10565.iterator();
            while (it2.hasNext()) {
                C24869.m55395((AbstractC12384) it2.next(), true, c20393);
            }
        }
        boolean z = arrayList.size() > 40;
        for (C3239 c3239 : arrayList) {
            c3239.getClass();
            HashSet hashSet = new HashSet();
            TreeSet treeSet = c3239.f10554;
            treeSet.clear();
            TreeSet treeSet2 = c3239.f10561;
            treeSet2.clear();
            c3239.f10560.clear();
            C17409 c17409 = new C17409(c3239, hashSet);
            Iterator it3 = c3239.f10565.iterator();
            while (it3.hasNext()) {
                C24869.m55395((AbstractC12384) it3.next(), false, c17409);
            }
            treeSet2.removeAll(treeSet);
        }
        if (!z && arrayList.size() > 10) {
            for (C3239 c32310 : arrayList) {
                if (c32310.f10566.isEmpty()) {
                    c32310.m10590();
                }
            }
        }
        boolean[] zArr2 = new boolean[i];
        for (C3239 c32311 : arrayList) {
            ArrayList arrayList2 = c32311.f10566;
            ArrayList arrayList3 = c32311.f10565;
            if (arrayList2.isEmpty()) {
                Arrays.fill(zArr2, true);
            } else if (z) {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            } else {
                Arrays.fill(zArr2, true);
                Iterator it4 = ((TreeSet) c32311.m10595()).iterator();
                while (it4.hasNext()) {
                    zArr2[((Integer) it4.next()).intValue()] = false;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    if (zArr[i2]) {
                        zArr2[i2] = true;
                    }
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it5 = c32311.f10553.iterator();
            while (it5.hasNext()) {
                hashSet2.addAll(((C3239) it5.next()).m10597());
            }
            C12188 c12188 = new C12188(this, zArr2, hashSet2);
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AbstractC12384 abstractC12384 = (AbstractC12384) arrayList3.get(size);
                C24869.m55395(abstractC12384, true, c12188);
                abstractC12384.m30863().m24744((boolean[]) zArr2.clone());
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final ArrayList m53670() {
        return this.f77967;
    }
}
