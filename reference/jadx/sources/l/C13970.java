package l;

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

/* JADX INFO: renamed from: l.ܰܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 014Q */
/* JADX INFO: loaded from: classes3.dex */
public final class C13970 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f45945;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ArrayList f45946;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f45947;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f45948;

    public C13970(C10111 c10111) {
        ArrayList arrayList;
        C1829 c1829;
        int i;
        int iMo11507 = c10111.mo11507();
        Collection collectionMo11508 = c10111.mo11508();
        List<C11522> listMo11511 = c10111.mo11511();
        this.f45946 = new ArrayList();
        this.f45947 = 0;
        this.f45948 = 0;
        this.f45945 = iMo11507;
        if (((AbstractCollection) collectionMo11508).isEmpty()) {
            throw new IllegalArgumentException();
        }
        C1829 c18210 = new C1829(this, "B0", iMo11507);
        Iterator it = ((AbstractList) collectionMo11508).iterator();
        int i2 = 1;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = c18210.f7004;
            if (!zHasNext) {
                break;
            }
            AbstractC3384 abstractC3384 = (AbstractC3384) it.next();
            if (!((AbstractCollection) abstractC3384.m10035().m36037()).isEmpty()) {
                if (arrayList.isEmpty()) {
                    c18210.f7010 = true;
                } else if (!c18210.f7010 && arrayList.size() == 1 && ((AbstractC3384) arrayList.get(0)).mo5435() == EnumC10297.f35298) {
                    arrayList.clear();
                    c18210.f7010 = true;
                } else {
                    this.f45946.add(c18210);
                    C1829 c18211 = new C1829(this, "B" + i2, iMo11507);
                    c18211.f7010 = true;
                    c18210.m5979(c18211, false);
                    c18211.m5978(c18210);
                    c18210 = c18211;
                    i2++;
                }
            }
            c18210.f7004.add(abstractC3384);
            if (abstractC3384.mo5435().m26111()) {
                int i3 = C4796.f16860[abstractC3384.mo5435().f35328.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    c18210.f7016 = ((AbstractC4465) abstractC3384).m12443().m14323();
                    this.f45946.add(c18210);
                    StringBuilder sb = new StringBuilder("B");
                    i = i2 + 1;
                    sb.append(i2);
                    c1829 = new C1829(this, sb.toString(), iMo11507);
                    c18210.m5979(c1829, false);
                    c1829.m5978(c18210);
                    c18210 = c1829;
                    i2 = i;
                } else if (i3 == 3 && (abstractC3384.mo5435() == EnumC10297.f35282 || abstractC3384.mo5435() == EnumC10297.f35153)) {
                    c18210.f7009 = ((AbstractC4465) abstractC3384).m12443().m14323();
                    this.f45946.add(c18210);
                    StringBuilder sb2 = new StringBuilder("B");
                    i = i2 + 1;
                    sb2.append(i2);
                    c1829 = new C1829(this, sb2.toString(), iMo11507);
                    c18210.m5979(c1829, false);
                    c1829.m5978(c18210);
                    c18210 = c1829;
                    i2 = i;
                }
            } else {
                if (abstractC3384 instanceof InterfaceC3005) {
                    c18210.f7016 = ((AbstractC4465) abstractC3384).m12443().m14323();
                }
                this.f45946.add(c18210);
                c18210 = new C1829(this, "B" + i2, iMo11507);
                i2++;
            }
        }
        if (!arrayList.isEmpty()) {
            this.f45946.add(c18210);
        }
        HashMap map = new HashMap(this.f45946.size());
        for (C1829 c18212 : this.f45946) {
            map.put(Integer.valueOf(c18212.m5982().m10035().m36034()), c18212);
        }
        for (C1829 c18213 : this.f45946) {
            int i4 = c18213.f7016;
            ArrayList arrayList2 = c18213.f7004;
            if (i4 != -1) {
                C1829 c18214 = (C1829) map.get(Integer.valueOf(i4));
                c18214 = c18214 == null ? (C1829) map.get(Integer.valueOf(c18213.f7016 + 1)) : c18214;
                if (c18214 == null) {
                    throw new RuntimeException("Block not found: address " + Integer.toHexString(c18213.f7016) + ", " + Integer.toHexString(c18213.m5982().m10035().m36034()) + ", " + Integer.toHexString(((AbstractC3384) C19084.m43861(arrayList2, 1)).m10035().m36034()));
                }
                c18214.m5978(c18213);
                c18213.m5979(c18214, false);
            } else {
                int i5 = c18213.f7009;
                if (i5 == -1) {
                    continue;
                } else {
                    C1829 c18215 = (C1829) map.get(Integer.valueOf(i5));
                    if (c18215 == null) {
                        throw new RuntimeException("Block not found: address " + c18213.f7009);
                    }
                    if (!c18215.f7007.startsWith("Switch_")) {
                        c18215.f7007 = "Switch_" + c18215.f7007;
                    }
                    c18215.m5978(c18213);
                    c18213.m5979(c18215, false);
                    int iM36034 = ((AbstractC3384) C19084.m43861(arrayList2, 1)).m10035().m36034();
                    InterfaceC5391 interfaceC5391 = (InterfaceC5391) c18215.f7004.get(0);
                    C13638.requireNonNull(interfaceC5391);
                    Iterator it2 = interfaceC5391.mo14955().iterator();
                    while (it2.hasNext()) {
                        int iMo8019 = ((InterfaceC2568) it2.next()).mo8019() + iM36034;
                        C1829 c18216 = (C1829) map.get(Integer.valueOf(iMo8019));
                        if (c18216 == null) {
                            throw new RuntimeException(C8479.m22141(iMo8019, "Block not found: address "));
                        }
                        c18216.m5978(c18215);
                        c18215.m5979(c18216, false);
                    }
                }
            }
        }
        for (C11522 c11522 : listMo11511) {
            AbstractC9736 abstractC9736 = c11522.f38739;
            C1829 c18217 = (C1829) map.get(Integer.valueOf(abstractC9736.m24691().m14323()));
            c18217 = c18217 == null ? (C1829) map.get(Integer.valueOf(abstractC9736.m24691().m14323() + 1)) : c18217;
            if (c18217 == null) {
                throw new RuntimeException("Block not found: address " + abstractC9736.m24691().m14323());
            }
            if (!c18217.f7007.startsWith("Catch_")) {
                c18217.f7007 = "Catch_" + c18217.f7007;
            }
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Integer) entry.getKey()).intValue();
                if (iIntValue >= c11522.f38738.m14323() && iIntValue < c11522.f38737.m14323()) {
                    C1829 c18218 = (C1829) entry.getValue();
                    c18218.m5979(c18217, true);
                    c18217.m5978(c18218);
                }
            }
        }
        map.clear();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33819() {
        int i = this.f45945;
        boolean[] zArr = new boolean[i];
        Arrays.fill(zArr, true);
        C9592 c9592 = new C9592(this, zArr);
        ArrayList<C1829> arrayList = this.f45946;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C1829) it.next()).f7004.iterator();
            while (it2.hasNext()) {
                C17352.m40379((AbstractC3384) it2.next(), true, c9592);
            }
        }
        boolean z = arrayList.size() > 40;
        for (C1829 c1829 : arrayList) {
            c1829.getClass();
            HashSet hashSet = new HashSet();
            TreeSet treeSet = c1829.f7011;
            treeSet.clear();
            TreeSet treeSet2 = c1829.f7017;
            treeSet2.clear();
            c1829.f7013.clear();
            C11003 c11003 = new C11003(c1829, hashSet);
            Iterator it3 = c1829.f7004.iterator();
            while (it3.hasNext()) {
                C17352.m40379((AbstractC3384) it3.next(), false, c11003);
            }
            treeSet2.removeAll(treeSet);
        }
        if (!z && arrayList.size() > 10) {
            for (C1829 c18210 : arrayList) {
                if (c18210.f7015.isEmpty()) {
                    c18210.m5976();
                }
            }
        }
        boolean[] zArr2 = new boolean[i];
        for (C1829 c18211 : arrayList) {
            ArrayList arrayList2 = c18211.f7015;
            ArrayList arrayList3 = c18211.f7004;
            if (arrayList2.isEmpty()) {
                Arrays.fill(zArr2, true);
            } else if (z) {
                System.arraycopy(zArr, 0, zArr2, 0, i);
            } else {
                Arrays.fill(zArr2, true);
                Iterator it4 = ((TreeSet) c18211.m5980()).iterator();
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
            Iterator it5 = c18211.f7006.iterator();
            while (it5.hasNext()) {
                hashSet2.addAll(((C1829) it5.next()).m5975());
            }
            C3240 c3240 = new C3240(this, zArr2, hashSet2);
            for (int size = arrayList3.size() - 1; size >= 0; size--) {
                AbstractC3384 abstractC3384 = (AbstractC3384) arrayList3.get(size);
                C17352.m40379(abstractC3384, true, c3240);
                abstractC3384.m10035().m36036((boolean[]) zArr2.clone());
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final ArrayList m33820() {
        return this.f45946;
    }
}
