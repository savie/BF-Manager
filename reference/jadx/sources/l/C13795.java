package l;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: l.۬ۤ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: RIVL */
/* JADX INFO: loaded from: classes4.dex */
public final class C13795 extends AbstractC2609 {
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC1118 m33705() {
        C0701 c0701M4153 = m8737().m4153();
        C19017 c19017M4147 = m8737().m4147();
        if (!c0701M4153.m3010()) {
            return new C16779(m8736(), c0701M4153, c19017M4147);
        }
        List listM44105 = c19017M4147.m44105();
        ListIterator listIterator = listM44105.listIterator(listM44105.size());
        int i = 0;
        while (listIterator.hasPrevious()) {
            C18959 c18959 = (C18959) listIterator.previous();
            int i2 = C7084.f23352[c18959.getType().ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (c18959.m44039() != 0) {
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                    if (abstractC16481Mo44035 instanceof C6041) {
                        c0701M4153.m3007((C6041) abstractC16481Mo44035);
                    }
                }
                i++;
            } else {
                if (!c0701M4153.m3013(c18959)) {
                    break;
                }
                i++;
                c0701M4153.m3008(c18959);
            }
        }
        c19017M4147.m44107(c19017M4147.m44108() + i);
        C21943 c21943M44106 = c19017M4147.m44106();
        if (c19017M4147.m44108() >= ((ArrayList) c21943M44106.mo1986()).size()) {
            return new C12304(m8736(), c0701M4153, c21943M44106);
        }
        return new C16779(m8736(), c0701M4153, c19017M4147);
    }
}
