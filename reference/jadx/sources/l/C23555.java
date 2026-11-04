package l;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩹۫ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E5K2 */
/* JADX INFO: loaded from: classes.dex */
public final class C23555 extends AbstractC8909 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52756(C13791 c13791) {
        ArrayList arrayList;
        int iIntValue;
        ArrayList<C20022> arrayList2 = new ArrayList();
        for (AbstractC12563 first = c13791.f43750.getFirst(); first != null; first = first.m31273()) {
            if (first.f40344 == EnumC20768.ASSIGN) {
                C20022 c20022 = (C20022) first;
                if (c20022.f12388.f34921 == EnumC22260.LOCAL) {
                    AbstractC11071 abstractC11071 = c20022.f12387;
                    if (abstractC11071.f34921 == EnumC22260.CONSTANT) {
                        Object obj = ((C16380) abstractC11071).f53172;
                        if ((obj instanceof Number) && !(obj instanceof Long) && !(obj instanceof Double) && ((iIntValue = ((Number) obj).intValue()) == 0 || iIntValue == 1)) {
                            arrayList2.add(c20022);
                        }
                    }
                }
            }
        }
        boolean z = false;
        if (arrayList2.size() != 0 && (arrayList = c13791.f43754) != null) {
            z = false;
            for (C20022 c20023 : arrayList2) {
                C4448 c4448 = (C4448) c20023.f12388;
                Iterator it = arrayList.iterator();
                boolean z2 = true;
                while (it.hasNext()) {
                    Iterator it2 = ((C11817) it.next()).f38143.iterator();
                    while (it2.hasNext()) {
                        AbstractC11071[] abstractC11071ArrMo15448 = ((C20022) it2.next()).f12387.mo15448();
                        for (int i = 0; i < abstractC11071ArrMo15448.length; i++) {
                            if (abstractC11071ArrMo15448[i] == c4448) {
                                if (z2) {
                                    z2 = false;
                                } else {
                                    C4448 c4449 = new C4448(-1);
                                    c13791.f43751.add(c4449);
                                    c13791.f43750.m54765(c20023, C4360.m13864(c4449, c20023.f12387.clone()));
                                    abstractC11071ArrMo15448[i] = c4449;
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
