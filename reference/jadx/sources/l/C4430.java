package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۘ᩷᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: P6HD */
/* JADX INFO: loaded from: classes3.dex */
public final class C4430 extends AbstractC16700 {
    static {
        C16980.m40037(C4430.class);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        try {
            C11457 c11457 = C11457.f36003;
            if (c2551.mo17867(c11457)) {
                m14086(c2551);
                c2551.m39419(c11457);
            }
            m14085(c2551);
        } catch (Exception e) {
            c2551.m31134("Failed to apply debug info", e);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14086(final C2551 c2551) {
        C4937.forEach(c2551.m8490(), new Consumer() { // from class: l.ۛ᩷᩵
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void n(Object obj) {
                C4430.m14083(c2551, (C17973) obj);
            }

            public /* synthetic */ Consumer andThen(Consumer consumer) {
                return C12312.$default$andThen(this, consumer);
            }
        });
        if (!c2551.m8534()) {
            ArrayList<C18959> arrayList = new ArrayList(c2551.m8489().size());
            Iterator it = c2551.m8489().iterator();
            C18959 c18959 = null;
            while (it.hasNext()) {
                C18959 c18959M52200 = C23231.m52200((InterfaceC23435) it.next());
                if (c18959M52200 != null) {
                    if (c18959M52200.mo17865(EnumC1763.ORIG_RETURN)) {
                        c18959 = c18959M52200;
                    } else {
                        arrayList.add(c18959M52200);
                    }
                }
            }
            if (c18959 != null) {
                for (C18959 c189510 : arrayList) {
                    AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                    AbstractC16481 abstractC16481Mo44036 = c189510.mo44035(0);
                    abstractC16481Mo44035.getClass();
                    if (abstractC16481Mo44035 instanceof C6041) {
                        abstractC16481Mo44036.getClass();
                        if (abstractC16481Mo44036 instanceof C6041) {
                            C6041 c6041 = (C6041) abstractC16481Mo44035;
                            m14084(c2551, ((C6041) abstractC16481Mo44036).m17530(), c6041.getType(), c6041.getName());
                        }
                    }
                    c189510.m16978(c18959.m16977());
                }
            }
        }
        C4937.forEach(c2551.m8490(), new C13782(2, c2551));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m14083(C2551 c2551, C17973 c17973) {
        C18959 c18959M39118;
        C6041 c6041M41930 = c17973.m41930();
        C11457 c11457 = C11457.f36008;
        C24466 c24466 = (C24466) c6041M41930.mo17862((InterfaceC2157) c11457);
        if (c24466 == null ? false : m14084(c2551, c17973, c24466.m54717(), c24466.m54716())) {
            return;
        }
        Iterator it = c17973.m41946().iterator();
        while (it.hasNext()) {
            C24466 c24467 = (C24466) ((C6041) it.next()).mo17862((InterfaceC2157) c11457);
            if (c24467 == null ? false : m14084(c2551, c17973, c24467.m54717(), c24467.m54716())) {
                return;
            }
        }
        C2091 c2091 = (C2091) c2551.mo17862((InterfaceC2157) C11457.f36003);
        if (c2091 == null) {
            return;
        }
        C23327 c23327Max = C1170.stream(c17973.m41946()).mapToInt(new C24568()).max();
        if (c23327Max.isEmpty()) {
            return;
        }
        C6041 c6041M41931 = c17973.m41930();
        int offset = (c6041M41931 == null || (c18959M39118 = c6041M41931.m39118()) == null) ? -1 : c18959M39118.getOffset();
        int asInt = c23327Max.getAsInt();
        int iM41954 = c17973.m41954();
        for (InterfaceC9415 interfaceC9415 : c2091.m7188()) {
            if (interfaceC9415.mo24789() == iM41954) {
                int iMo24790 = interfaceC9415.mo24790();
                int iMo24788 = interfaceC9415.mo24788();
                if (!(iMo24790 <= offset && offset <= iMo24788)) {
                    if (iMo24790 <= asInt && asInt <= iMo24788) {
                    }
                }
                m14084(c2551, c17973, C21584.m49103(c2551, interfaceC9415), interfaceC9415.getName());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m14084(C2551 c2551, C17973 c17973, AbstractC1566 abstractC1566, String str) {
        if (c2551.mo8527().m5685().m26145(c2551, c17973, abstractC1566) == EnumC4695.REJECT) {
            return false;
        }
        if (str == null || str.isEmpty()) {
            return true;
        }
        c17973.m41931(str);
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m14087(C2551 c2551, C17973 c17973) {
        List listM44026;
        C11720 c11720;
        String name;
        for (C18981 c18981 : c17973.m41940()) {
            HashSet hashSet = new HashSet(c18981.m44039() + 1);
            C6041 c6041M44027 = c18981.m44027();
            if (C1402.m5130(c6041M44027) && (name = c6041M44027.getName()) != null) {
                hashSet.add(name);
            }
            C4937.forEach(c18981.m44026(), new C11296(3, hashSet));
            if (hashSet.size() == 1) {
                String str = (String) hashSet.iterator().next();
                c18981.m44027().setName(str);
                listM44026 = c18981.m44026();
                c11720 = new C11720(1, str);
            } else if (hashSet.size() > 1) {
                c2551.m31133("Different variable names in phi insn: " + hashSet + ", use first");
                String str2 = (String) hashSet.iterator().next();
                c18981.m44027().setName(str2);
                listM44026 = c18981.m44026();
                c11720 = new C11720(1, str2);
            }
            C4937.forEach(listM44026, c11720);
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m14085(C2551 c2551) {
        C4394 c4394 = (C4394) c2551.mo17862(C25278.f81638);
        if (c4394 == null) {
            return;
        }
        try {
            ArrayList arrayList = (ArrayList) c4394.m13999();
            if (arrayList.size() != c2551.mo8532().m49705()) {
                return;
            }
            int i = 0;
            for (C6041 c6041 : c2551.m8526()) {
                int i2 = i + 1;
                C24532 c24532 = (C24532) arrayList.get(i);
                String strM54813 = c24532.m54813();
                if (strM54813 != null && !strM54813.isEmpty()) {
                    C11260 c11260M41945 = c6041.m17530().m41945();
                    c11260M41945.m28506(strM54813);
                    if (C18366.m42831(c24532.m54812(), 16)) {
                        c11260M41945.m28514();
                    } else {
                        continue;
                    }
                }
                i = i2;
            }
        } catch (Exception e) {
            c2551.m31134("Failed to process method parameters attribute: " + c4394.m13999(), e);
        }
    }
}
