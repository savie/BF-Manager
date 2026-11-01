package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C64A */
/* JADX INFO: loaded from: classes4.dex */
public final class C20300 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m45813(C9116 c9116) {
        C21005.m47168(c9116);
        ArrayList arrayList = c9116.f31044;
        C21005.m47169(c9116, (InterfaceC8306) null);
        ArrayList arrayList2 = c9116.f31040;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                C16876 c16876 = (C16876) it.next();
                AbstractC4777 abstractC4777M13247 = c16876.f53976;
                while (true) {
                    if (abstractC4777M13247 != c16876.f53975) {
                        if (!abstractC4777M13247.f16798 || !C21005.m47171(abstractC4777M13247)) {
                            abstractC4777M13247 = abstractC4777M13247.m13247();
                        } else {
                            boolean z = true;
                            boolean z2 = true;
                            for (C17002 c17002 : c16876.f53977) {
                                if (c17002.f16798) {
                                    z = false;
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z) {
                                it.remove();
                                break;
                            }
                            c16876.f53976.f16798 = true;
                            c16876.f53975.f16798 = true;
                            if (!z2) {
                                ArrayList arrayList3 = new ArrayList(c16876.f53977.length);
                                ArrayList arrayList4 = new ArrayList(c16876.f53977.length);
                                int i = 0;
                                while (true) {
                                    C17002[] c17002Arr = c16876.f53977;
                                    if (i >= c17002Arr.length) {
                                        break;
                                    }
                                    arrayList4.add(c17002Arr[i]);
                                    arrayList3.add(c16876.f53974[i]);
                                    i++;
                                }
                                c16876.f53977 = (C17002[]) arrayList4.toArray(new C17002[arrayList4.size()]);
                                c16876.f53974 = (String[]) arrayList3.toArray(new String[arrayList3.size()]);
                                break;
                            }
                            break;
                        }
                    } else {
                        it.remove();
                        break;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = c9116.f31045.iterator();
        while (it2.hasNext()) {
            AbstractC4777 abstractC4777 = (AbstractC4777) it2.next();
            if (!abstractC4777.f16798) {
                it2.remove();
            } else {
                EnumC2890 enumC2890 = abstractC4777.f16795;
                if (enumC2890 == EnumC2890.ASSIGN || enumC2890 == EnumC2890.IDENTITY) {
                    if (abstractC4777.mo13244().f23823 == EnumC9947.LOCAL) {
                        hashSet.add((C2184) abstractC4777.mo13244());
                    }
                }
            }
        }
        ArrayList arrayList5 = c9116.f31047;
        if (arrayList5 != null) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                C17002 c17003 = (C17002) it3.next();
                if (!c17003.f16798) {
                    it3.remove();
                } else {
                    ArrayList arrayList6 = c17003.f54351;
                    if (arrayList6 != null) {
                        Iterator it4 = arrayList6.iterator();
                        while (it4.hasNext()) {
                            hashSet.add((C2184) ((C15592) it4.next()).f31402);
                        }
                    }
                }
            }
        }
        arrayList.clear();
        arrayList.addAll(hashSet);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList7 = c9116.f31047;
        if (arrayList7 != null) {
            Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ArrayList arrayList8 = ((C17002) it5.next()).f54351;
                if (arrayList8 != null) {
                    Iterator it6 = arrayList8.iterator();
                    while (it6.hasNext()) {
                        C0773 c0773 = (C0773) ((C15592) it6.next()).f31401;
                        for (AbstractC7124 abstractC7124 : c0773.f29544) {
                            if (!hashSet.contains(abstractC7124)) {
                                for (AbstractC7124 abstractC7125 : c0773.f29544) {
                                    if (hashSet.contains(abstractC7125)) {
                                        hashSet2.add(abstractC7125);
                                    }
                                }
                                c0773.f29544 = (AbstractC7124[]) hashSet2.toArray(new AbstractC7124[hashSet2.size()]);
                                hashSet2.clear();
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
}
