package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: l.᩶۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2IVE */
/* JADX INFO: loaded from: classes5.dex */
public final class C21176 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        if (c2551.mo8532().m49702().size() > 255) {
            if (c2551.m8514().isEmpty()) {
                c2551.m8553();
                break;
            }
            C18959[] c18959ArrM8506 = c2551.m8506();
            if (c18959ArrM8506.length == 0) {
                c2551.m8553();
                break;
            }
            int length = c18959ArrM8506.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    c2551.m8553();
                    break;
                }
                C18959 c18959 = c18959ArrM8506[i];
                if (c18959 != null && c18959.getType() != EnumC24203.NOP && (c18959.getType() != EnumC24203.RETURN || c18959.m44039() != 0)) {
                    break;
                } else {
                    i++;
                }
            }
        }
        C18959[] c18959ArrM8507 = c2551.m8506();
        if (c18959ArrM8507 == null || c18959ArrM8507.length == 0) {
            return;
        }
        int iM8518 = c2551.m8518();
        ArrayList arrayList = new ArrayList();
        for (C18959 c189510 : c2551.m8506()) {
            if (c189510 != null) {
                arrayList.clear();
                C6041 c6041M44027 = c189510.m44027();
                if (c6041M44027 != null) {
                    arrayList.add(c6041M44027);
                }
                c189510.mo14760((Collection) arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    int iM17532 = ((C6041) it.next()).m17532();
                    if (iM17532 < 0) {
                        throw new C8597("Incorrect negative register number in instruction: " + c189510);
                    }
                    if (iM17532 >= iM8518) {
                        throw new C8597("Incorrect register number in instruction: " + c189510 + ", expected to be less than " + iM8518);
                    }
                }
            }
        }
    }
}
