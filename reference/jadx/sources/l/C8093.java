package l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۟ᩴ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: V6HT */
/* JADX INFO: loaded from: classes4.dex */
public final class C8093 extends AbstractC6683 {
    /* JADX WARN: Code duplicated, block: B:13:0x002e  */
    @Override // l.AbstractC6683, l.InterfaceC14892
    /* JADX INFO: renamed from: ۙ */
    public final void mo18704(C2551 c2551, InterfaceC23435 interfaceC23435) {
        boolean zM19005;
        int i;
        for (C18959 c18959 : interfaceC23435.mo1986()) {
            C6041 c6041M44027 = c18959.m44027();
            if (c6041M44027 != null) {
                C17973 c17973M17530 = c6041M44027.m17530();
                boolean z = false;
                if (c17973M17530 == null) {
                    zM19005 = true;
                } else {
                    ArrayList arrayListM41946 = c17973M17530.m41946();
                    if (arrayListM41946.isEmpty()) {
                        zM19005 = true;
                    } else {
                        zM19005 = c17973M17530.m41947() ? false : C6823.m19005((List) arrayListM41946, (Predicate) new C5384(this, c2551));
                    }
                }
                if (zM19005) {
                    if (c18959.m44017()) {
                        z = true;
                    } else if (c18959.m44025() || (i = C19280.f62336[c18959.getType().ordinal()]) == 1 || i == 2) {
                        c18959.mo17866(EnumC1763.REMOVE);
                        c18959.mo17866(EnumC1763.DONT_GENERATE);
                        z = true;
                    }
                    if (z) {
                        c18959.m44031((C6041) null);
                        c2551.m8504(c17973M17530);
                        Iterator it = c17973M17530.m41946().iterator();
                        while (it.hasNext()) {
                            ((C6041) it.next()).m17522();
                        }
                    }
                }
            }
        }
    }
}
