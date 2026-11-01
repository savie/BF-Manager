package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.֫۫᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E5K2 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1830 extends AbstractC10872 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5983(C9116 c9116) {
        ArrayList arrayList;
        int iIntValue;
        ArrayList<C15592> arrayList2 = new ArrayList();
        for (AbstractC4777 first = c9116.f31045.getFirst(); first != null; first = first.m13247()) {
            if (first.f16795 == EnumC2890.ASSIGN) {
                C15592 c15592 = (C15592) first;
                if (c15592.f31402.f23823 == EnumC9947.LOCAL) {
                    AbstractC7124 abstractC7124 = c15592.f31401;
                    if (abstractC7124.f23823 == EnumC9947.CONSTANT) {
                        Object obj = ((C14760) abstractC7124).f48276;
                        if ((obj instanceof Number) && !(obj instanceof Long) && !(obj instanceof Double) && ((iIntValue = ((Number) obj).intValue()) == 0 || iIntValue == 1)) {
                            arrayList2.add(c15592);
                        }
                    }
                }
            }
        }
        boolean z = false;
        if (arrayList2.size() != 0 && (arrayList = c9116.f31047) != null) {
            z = false;
            for (C15592 c15593 : arrayList2) {
                C2184 c2184 = (C2184) c15593.f31402;
                Iterator it = arrayList.iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    Iterator it2 = ((C17002) it.next()).f54351.iterator();
                    while (it2.hasNext()) {
                        AbstractC7124[] abstractC7124ArrMo19023 = ((C15592) it2.next()).f31401.mo19023();
                        for (int i = 0; i < abstractC7124ArrMo19023.length; i++) {
                            if (abstractC7124ArrMo19023[i] == c2184) {
                                if (z2) {
                                    z2 = false;
                                } else {
                                    C2184 c2185 = new C2184(-1);
                                    c9116.f31044.add(c2185);
                                    c9116.f31045.m29526(c15593, C2660.m8188(c2185, c15593.f31401.clone()));
                                    abstractC7124ArrMo19023[i] = c2185;
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
