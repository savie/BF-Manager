package l;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 1IVR */
/* JADX INFO: loaded from: classes.dex */
public final class C21584 extends AbstractC16700 {
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        try {
            C19310 c19310M8533 = c2551.m8533();
            if (c19310M8533 != null) {
                m49104(c2551, c19310M8533);
            }
        } catch (C10088 e) {
            c2551.m31138(e.getMessage());
        } catch (Exception e2) {
            c2551.m31134("Failed to parse debug info", e2);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49104(C2551 c2551, C19310 c19310) {
        int iM16977;
        String strM33382;
        C18959[] c18959ArrM8506 = c2551.m8506();
        Map mapM44689 = c19310.m44689();
        if (!mapM44689.isEmpty()) {
            for (Map.Entry entry : mapM44689.entrySet()) {
                try {
                    C18959 c18959 = c18959ArrM8506[((Integer) entry.getKey()).intValue()];
                    if (c18959 != null) {
                        c18959.m16978(((Integer) entry.getValue()).intValue());
                    }
                } catch (Exception e) {
                    c2551.m31134("Error attach source line", e);
                }
            }
            int iOrElse = C1170.stream(mapM44689.values()).mapToInt(new C14870()).min().orElse(Integer.MAX_VALUE);
            if (iOrElse < 3) {
                strM33382 = C13645.m33382(iOrElse, "Lines numbers was adjusted: min line is ");
            } else {
                List list = (List) C1170.stream(((Map) C1170.stream(mapM44689.values()).collect(C2025.toMap(new C9587(6), new C4921(4), new C24117()))).entrySet()).filter(new C22075(1)).collect(C2025.toList());
                strM33382 = list.isEmpty() ? null : "Repeating lines: " + list;
            }
            if (strM33382 != null) {
                c2551.m31133("Don't trust debug lines info. ".concat(strM33382));
            } else {
                c2551.mo17866(EnumC1763.USE_LINES_HINTS);
            }
        }
        List<InterfaceC9415> listM44688 = c19310.m44688();
        if (!listM44688.isEmpty()) {
            for (InterfaceC9415 interfaceC9415 : listM44688) {
                int iMo24789 = interfaceC9415.mo24789();
                int iMo24790 = interfaceC9415.mo24790();
                int iMo24788 = interfaceC9415.mo24788();
                C24466 c24466 = new C24466(m49103(c2551, interfaceC9415), interfaceC9415.getName());
                if (iMo24790 <= 0) {
                    C6041 c6041M8517 = c2551.m8517();
                    if (c6041M8517 != null) {
                        m49102(c6041M8517, c24466, iMo24789);
                    }
                    Iterator it = c2551.m8526().iterator();
                    while (it.hasNext()) {
                        m49102((C6041) it.next(), c24466, iMo24789);
                    }
                    iMo24790 = 0;
                }
                while (iMo24790 <= iMo24788) {
                    C18959 c189510 = c18959ArrM8506[iMo24790];
                    if (c189510 != null) {
                        Iterator it2 = c189510.m44026().iterator();
                        int iM49102 = 0;
                        while (it2.hasNext()) {
                            iM49102 += m49102((AbstractC16481) it2.next(), c24466, iMo24789);
                        }
                        if (iM49102 == 0) {
                            m49102(c189510.m44027(), c24466, iMo24789);
                        }
                    }
                    iMo24790++;
                }
            }
            c2551.mo17864(new C2091(listM44688));
        }
        for (C18959 c189511 : c18959ArrM8506) {
            if (c189511 != null && (iM16977 = c189511.m16977()) != 0) {
                c2551.m16978(iM16977 - 1);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m49102(AbstractC16481 abstractC16481, C24466 c24466, int i) {
        if (!(abstractC16481 instanceof C6041)) {
            return 0;
        }
        C6041 c6041 = (C6041) abstractC16481;
        if (i != c6041.m17532()) {
            return 0;
        }
        c6041.mo17864(c24466);
        return 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC1566 m49103(C2551 c2551, InterfaceC9415 interfaceC9415) {
        AbstractC1566 abstractC1566M5535 = AbstractC1566.m5535(interfaceC9415.getType());
        String signature = interfaceC9415.getSignature();
        if (signature != null) {
            try {
                AbstractC1566 abstractC1566M28575 = new C11304(signature).m28575();
                c2551.mo8527().m5692().getClass();
                C3101.m10100(c2551, abstractC1566M28575);
                if (m49105(c2551, abstractC1566M5535, abstractC1566M28575)) {
                    return abstractC1566M28575;
                }
            } catch (Exception e) {
                c2551.m31134("Can't parse signature for local variable: ".concat(signature), e);
                return abstractC1566M5535;
            }
        }
        return abstractC1566M5535;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m49105(C2551 c2551, AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        AbstractC1566 abstractC1566Mo5555 = abstractC1567.mo5555();
        if (abstractC1566Mo5555.mo5550()) {
            if (abstractC1566.mo5555().mo5570().equals(abstractC1566Mo5555.mo5570())) {
                return true;
            }
            c2551.m31138("Generic types in debug info not equals: " + abstractC1566 + " != " + abstractC1567);
            return true;
        }
        return abstractC1566Mo5555.m5569();
    }
}
