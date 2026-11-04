package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵ۧ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: W856 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20531 {
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m47073(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            return C23231.m52183((InterfaceC23435) interfaceC6281);
        }
        if (interfaceC6281 instanceof InterfaceC3297) {
            for (InterfaceC6281 interfaceC6282 : ((InterfaceC3297) interfaceC6281).mo10884()) {
                if (interfaceC6282 == null || !m47073(interfaceC6282)) {
                    return false;
                }
            }
            return true;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            InterfaceC6281 interfaceC6283 = (InterfaceC6281) C4123.m13231(((InterfaceC18213) interfaceC6281).mo19035());
            return interfaceC6283 != null && m47073(interfaceC6283);
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21943 m47065(InterfaceC6281 interfaceC6281) {
        Object obj = null;
        if (interfaceC6281 instanceof InterfaceC23435) {
            if (interfaceC6281 instanceof C21943) {
                return (C21943) interfaceC6281;
            }
        } else {
            if (interfaceC6281 instanceof InterfaceC12246) {
                List listMo1257 = ((InterfaceC12246) interfaceC6281).mo1257();
                if (listMo1257 != null && !listMo1257.isEmpty()) {
                    obj = listMo1257.get(0);
                }
                return (C21943) obj;
            }
            if (interfaceC6281 instanceof C18017) {
                return m47065(((C18017) interfaceC6281).m41998());
            }
            if (interfaceC6281 instanceof C14287) {
                return ((C14287) interfaceC6281).m34697();
            }
            if (!(interfaceC6281 instanceof InterfaceC18213)) {
                throw new C8597(m47083(interfaceC6281));
            }
            Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it.hasNext()) {
                C21943 c21943M47065 = m47065((InterfaceC6281) it.next());
                if (c21943M47065 != null) {
                    return c21943M47065;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m47079(InterfaceC6281 interfaceC6281) {
        if (!(interfaceC6281 instanceof InterfaceC23435)) {
            if (interfaceC6281 instanceof InterfaceC12246) {
                return ((InterfaceC12246) interfaceC6281).mo1256();
            }
            if (interfaceC6281 instanceof InterfaceC3297) {
                List listMo10884 = ((InterfaceC3297) interfaceC6281).mo10884();
                if (!listMo10884.isEmpty()) {
                    Iterator it = listMo10884.iterator();
                    while (it.hasNext()) {
                        int iM47079 = m47079((InterfaceC6281) it.next());
                        if (iM47079 != 0) {
                            return iM47079;
                        }
                    }
                }
                return 0;
            }
            if (interfaceC6281 instanceof InterfaceC18213) {
                List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
                if (!listMo19035.isEmpty()) {
                    Iterator it2 = listMo19035.iterator();
                    while (it2.hasNext()) {
                        int iM470710 = m47079((InterfaceC6281) it2.next());
                        if (iM470710 != 0) {
                            return iM470710;
                        }
                    }
                }
            }
        } else {
            Iterator it3 = ((InterfaceC23435) interfaceC6281).mo1986().iterator();
            while (it3.hasNext()) {
                int iM16977 = ((C18959) it3.next()).m16977();
                if (iM16977 != 0) {
                    return iM16977;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C18959 m47082(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            List listMo1986 = ((InterfaceC23435) interfaceC6281).mo1986();
            if (!listMo1986.isEmpty()) {
                return (C18959) C7750.m21093(1, listMo1986);
            }
        } else {
            if (interfaceC6281 instanceof InterfaceC3297) {
                return null;
            }
            if (!(interfaceC6281 instanceof InterfaceC18213)) {
                throw new C8597(m47083(interfaceC6281));
            }
            List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
            if (!listMo19035.isEmpty()) {
                return m47082((InterfaceC6281) C7750.m21093(1, listMo19035));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static C22485 m47078(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            InterfaceC23435 interfaceC23435 = (InterfaceC23435) interfaceC6281;
            C18959 c18959 = (C18959) C6823.m18999(interfaceC23435.mo1986());
            if (c18959 == null) {
                return null;
            }
            return new C22485(interfaceC23435, c18959);
        }
        if (interfaceC6281 instanceof InterfaceC3297) {
            List<InterfaceC6281> listMo10884 = ((InterfaceC3297) interfaceC6281).mo10884();
            if (C1170.stream(listMo10884).filter(new C17547(0)).count() != 1) {
                return null;
            }
            for (InterfaceC6281 interfaceC6282 : listMo10884) {
                if (interfaceC6282 != null) {
                    return m47078(interfaceC6282);
                }
            }
            return null;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
            if (listMo19035.isEmpty()) {
                return null;
            }
            return m47078((InterfaceC6281) C6823.m18999(listMo19035));
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static InterfaceC23435 m47074(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            return (InterfaceC23435) interfaceC6281;
        }
        if (interfaceC6281 instanceof InterfaceC3297) {
            return null;
        }
        if (!(interfaceC6281 instanceof InterfaceC18213)) {
            throw new C8597(m47083(interfaceC6281));
        }
        List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
        if (listMo19035.isEmpty()) {
            return null;
        }
        return m47074((InterfaceC6281) C7750.m21093(1, listMo19035));
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static boolean m47076(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 == null) {
            return false;
        }
        return m47070(interfaceC6281, interfaceC6281);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47070(InterfaceC6281 interfaceC6281, InterfaceC6281 interfaceC6282) {
        if (interfaceC6282 instanceof C21943) {
            if (!C23231.m52185((C21943) interfaceC6282)) {
                return m47081((InterfaceC23435) interfaceC6282, interfaceC6281);
            }
        } else {
            if (interfaceC6282 instanceof InterfaceC3297) {
                return C6823.m19005(((InterfaceC3297) interfaceC6282).mo10884(), (Predicate) new C20954(2));
            }
            if (interfaceC6282 instanceof InterfaceC23435) {
                return m47081((InterfaceC23435) interfaceC6282, interfaceC6281);
            }
            if (!(interfaceC6282 instanceof InterfaceC18213)) {
                throw new C8597(m47083(interfaceC6282));
            }
            List listMo19035 = ((InterfaceC18213) interfaceC6282).mo19035();
            if (listMo19035.isEmpty() || !m47070(interfaceC6281, (InterfaceC6281) C7750.m21093(1, listMo19035))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47081(InterfaceC23435 interfaceC23435, InterfaceC6281 interfaceC6281) {
        C18959 c18959M52200 = C23231.m52200(interfaceC23435);
        if (c18959M52200 == null) {
            return false;
        }
        EnumC24203 type = c18959M52200.getType();
        if (type == EnumC24203.RETURN) {
            return true;
        }
        if (type == EnumC24203.THROW) {
            C21922 c21922 = (C21922) c18959M52200.mo17862((InterfaceC2157) C11457.f36015);
            if (c21922 == null) {
                return true;
            }
            Iterator it = ((ArrayList) c21922.m49617()).iterator();
            while (it.hasNext()) {
                if (m47080(((C19684) it.next()).m45368(), interfaceC6281)) {
                    return false;
                }
            }
            return true;
        }
        if (type != EnumC24203.BREAK) {
            return false;
        }
        C24884 c24884 = (C24884) c18959M52200.mo17862((InterfaceC2157) C11457.f36019);
        if (c24884 != null) {
            Iterator it2 = c24884.m55414().iterator();
            while (it2.hasNext()) {
                if (!m47080(((C11785) it2.next()).m29616(), interfaceC6281)) {
                    return true;
                }
            }
        }
        C25212 c25212 = (C25212) c18959M52200.mo17862((InterfaceC2157) C11457.f36029);
        return (c25212 == null || m47080(c25212.m56214().m29616(), interfaceC6281)) ? false : true;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static boolean m47077(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            return C23231.m52184((InterfaceC23435) interfaceC6281, EnumC24203.BREAK);
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            List listMo19035 = ((InterfaceC18213) interfaceC6281).mo19035();
            return !listMo19035.isEmpty() && m47077((InterfaceC6281) C7750.m21093(1, listMo19035));
        }
        throw new C8597("Unknown container type: " + interfaceC6281);
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static int m47063(InterfaceC6281 interfaceC6281) {
        int iM47063 = 0;
        if (interfaceC6281 instanceof InterfaceC23435) {
            Iterator it = ((InterfaceC23435) interfaceC6281).mo1986().iterator();
            while (it.hasNext()) {
                if (!((C18959) it.next()).mo17865(EnumC1763.DONT_GENERATE)) {
                    iM47063++;
                }
            }
            return iM47063;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            Iterator it2 = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it2.hasNext()) {
                iM47063 += m47063((InterfaceC6281) it2.next());
            }
            return iM47063;
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static boolean m47075(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 == null) {
            return false;
        }
        if (interfaceC6281 instanceof InterfaceC23435) {
            Iterator it = ((InterfaceC23435) interfaceC6281).mo1986().iterator();
            while (it.hasNext()) {
                if (!((C18959) it.next()).mo17865(EnumC1763.DONT_GENERATE)) {
                }
            }
            return false;
        }
        if (interfaceC6281 instanceof C6831) {
            return true;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            Iterator it2 = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it2.hasNext()) {
                if (m47075((InterfaceC6281) it2.next())) {
                }
            }
            return false;
        }
        throw new C8597(m47083(interfaceC6281));
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47069(InterfaceC6281 interfaceC6281, HashSet hashSet) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            hashSet.add((InterfaceC23435) interfaceC6281);
        } else {
            if (interfaceC6281 instanceof InterfaceC18213) {
                Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
                while (it.hasNext()) {
                    m47069((InterfaceC6281) it.next(), hashSet);
                }
                return;
            }
            throw new C8597(m47083(interfaceC6281));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m47080(C21943 c21943, InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            return interfaceC6281 == c21943;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it.hasNext()) {
                if (m47080(c21943, (InterfaceC6281) it.next())) {
                    return true;
                }
            }
            return false;
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47071(InterfaceC6281 interfaceC6281, InterfaceC18213 interfaceC18213) {
        if (interfaceC6281 == interfaceC18213) {
            return true;
        }
        InterfaceC18213 parent = interfaceC18213.getParent();
        while (true) {
            InterfaceC18213 interfaceC18214 = parent;
            InterfaceC18213 interfaceC18215 = interfaceC18213;
            interfaceC18213 = interfaceC18214;
            if (interfaceC6281 == interfaceC18213) {
                return true;
            }
            if (interfaceC18213 == null) {
                if (!interfaceC18215.mo17867(C11457.f36036)) {
                    return false;
                }
                if (interfaceC6281 == interfaceC18215) {
                    return true;
                }
                if (!(interfaceC6281 instanceof InterfaceC18213)) {
                    return false;
                }
                for (InterfaceC6281 interfaceC6282 : ((InterfaceC18213) interfaceC6281).mo19035()) {
                    C12971 c12971 = (C12971) interfaceC6282.mo17862((InterfaceC2157) C11457.f36033);
                    if (c12971 != null && (interfaceC6282 instanceof InterfaceC18213)) {
                        Iterator it = c12971.m32377().iterator();
                        while (it.hasNext()) {
                            if (m47071((InterfaceC6281) ((C19684) it.next()).m45364(), interfaceC18215)) {
                                return true;
                            }
                        }
                    }
                    if (m47071(interfaceC6282, interfaceC18215)) {
                        return true;
                    }
                }
                return false;
            }
            parent = interfaceC18213.getParent();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC6281 m47064(InterfaceC23435 interfaceC23435, InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 instanceof InterfaceC23435) {
            if (interfaceC6281 == interfaceC23435) {
                return interfaceC6281;
            }
            return null;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            InterfaceC18213 interfaceC18213 = (InterfaceC18213) interfaceC6281;
            Iterator it = interfaceC18213.mo19035().iterator();
            while (it.hasNext()) {
                InterfaceC6281 interfaceC6281M47064 = m47064(interfaceC23435, (InterfaceC6281) it.next());
                if (interfaceC6281M47064 != null) {
                    return interfaceC6281M47064 instanceof InterfaceC23435 ? interfaceC18213 : interfaceC6281M47064;
                }
            }
            return null;
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47072(C21943 c21943, InterfaceC6281 interfaceC6281) {
        if (c21943 == interfaceC6281) {
            return true;
        }
        if (interfaceC6281 instanceof C21943) {
            return C23231.m52193(c21943, (C21943) interfaceC6281);
        }
        if (interfaceC6281 instanceof InterfaceC23435) {
            return false;
        }
        if (interfaceC6281 instanceof InterfaceC18213) {
            Iterator it = ((InterfaceC18213) interfaceC6281).mo19035().iterator();
            while (it.hasNext()) {
                if (m47072(c21943, (InterfaceC6281) it.next())) {
                    return true;
                }
            }
            return false;
        }
        throw new C8597(m47083(interfaceC6281));
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static String m47083(InterfaceC6281 interfaceC6281) {
        if (interfaceC6281 == null) {
            return "Null container variable";
        }
        return "Unknown container type: " + interfaceC6281.getClass();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47066(C2551 c2551, InterfaceC6281 interfaceC6281, Consumer consumer) {
        C24590.m54902(c2551, interfaceC6281, new C16055(consumer));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47068(C2551 c2551, InterfaceC6281 interfaceC6281, C13498 c13498) {
        C24590.m54902(c2551, interfaceC6281, new C23515(c13498));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47067(C2551 c2551, InterfaceC6281 interfaceC6281, EnumC1763 enumC1763) {
        m47066(c2551, interfaceC6281, new C3377(enumC1763));
    }
}
