package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩵۬ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46GW */
/* JADX INFO: loaded from: classes5.dex */
public final class C20583 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C1610 f65910;

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        this.f65910 = c1610;
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo1737(C2551 c2551) {
        C3582 c3582 = (C3582) c2551.mo17862(C11457.f35999);
        if (c3582 == null) {
            c3582 = new C3582(new HashSet());
            c2551.mo17864(c3582);
        }
        if (!c3582.m11643() && (c2551.m8524() || c2551.m8508() != null)) {
            c3582.m11642();
            if (!c2551.m8524() && c2551.m8508() != null) {
                try {
                    for (C21943 c21943 : c2551.m8508()) {
                        boolean z = c21943.mo17865(EnumC1763.REMOVE) || c21943.mo17865(EnumC1763.DONT_GENERATE);
                        HashSet hashSet = new HashSet();
                        C21922 c21922 = (C21922) c21943.mo17862((InterfaceC2157) C11457.f36015);
                        if (c21922 != null) {
                            Iterator it = ((ArrayList) c21922.m49617()).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    C19684 c19684 = (C19684) it.next();
                                    if (!c19684.m45366()) {
                                        hashSet.add(c19684.m45373().toString());
                                    }
                                }
                            }
                        }
                        Iterator it2 = ((ArrayList) c21943.mo1986()).iterator();
                        while (it2.hasNext()) {
                            m47174(c2551, (C18959) it2.next(), hashSet, z);
                        }
                    }
                } catch (Exception e) {
                    c2551.m31134("Failed to analyze thrown exceptions", e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        C20802 c20802 = (C20802) c2551.mo17862(C25278.f81642);
        if (c20802 != null && !c20802.m47582().isEmpty()) {
            Iterator it3 = c20802.m47582().iterator();
            while (it3.hasNext()) {
                AbstractC1566 abstractC1566M5538 = AbstractC1566.m5538((String) it3.next());
                if (m47172(abstractC1566M5538) == EnumC3429.NO_EXCEPTION) {
                    arrayList.add(abstractC1566M5538);
                } else {
                    ((HashSet) c3582.m11641()).add(abstractC1566M5538.mo5570());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            c2551.m31138("Byte code manipulation detected: skipped illegal throws declarations: " + arrayList);
        }
        Set setM11641 = c3582.m11641();
        HashSet<String> hashSet2 = (HashSet) setM11641;
        if (hashSet2.contains("java.lang.Exception")) {
            C1170.removeIf(setM11641, new C6563(4));
            return;
        }
        if (hashSet2.contains("java.lang.Throwable")) {
            final int i = 1;
            C1170.removeIf(setM11641, new Predicate() { // from class: l.ۖᩴᩴ
                @Override // java.util.function.Predicate
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return C19025.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* JADX INFO: renamed from: negate */
                public /* synthetic */ Predicate mo7134negate() {
                    switch (i) {
                        case 0:
                            break;
                    }
                    return C19025.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return C19025.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    switch (i) {
                        case 0:
                            return ((EnumC2536) obj).m8461();
                        default:
                            return !((String) obj).equals("java.lang.Throwable");
                    }
                }
            });
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : hashSet2) {
            for (String str2 : hashSet2) {
                if (!str.equals(str2)) {
                    if (str.equals(str2) ? true : this.f65910.m5691().m49227(str).contains(str2)) {
                        arrayList2.add(str);
                    }
                }
            }
        }
        C4937.forEach(arrayList2, new C23567(0, setM11641));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47174(C2551 c2551, C18959 c18959, HashSet hashSet, boolean z) {
        C18959 c18959M17529;
        if (!z && c18959.getType() == EnumC24203.THROW && !c18959.mo17865(EnumC1763.DONT_GENERATE)) {
            AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
            if (abstractC16481Mo44035 instanceof C6041) {
                C6041 c6041 = (C6041) abstractC16481Mo44035;
                AbstractC1566 type = c6041.getType();
                if (type.equals(AbstractC1566.f5432) && (c18959M17529 = c6041.m17529()) != null && c18959M17529.getType() == EnumC24203.MOVE_EXCEPTION && c18959M17529.m44027().mo17865(EnumC1763.CUSTOM_DECLARE)) {
                    return;
                }
                m47173(c2551, type, hashSet);
                return;
            }
            if (abstractC16481Mo44035 instanceof C17227) {
                m47173(c2551, ((C17227) abstractC16481Mo44035).getType(), hashSet);
                return;
            }
            return;
        }
        if (c18959.getType() == EnumC24203.INVOKE) {
            C21965 c21965Mo18926 = ((C21219) c18959).mo18926();
            String strM49697 = c21965Mo18926.m49697(false, true);
            C1345 c1345M49700 = c21965Mo18926.m49700();
            C24927 c24927M5671 = this.f65910.m5671(c1345M49700);
            C11457 c11457 = C11457.f35999;
            C10492 c10492 = null;
            C2551 c2552 = null;
            if (c24927M5671 == null) {
                C7289 c7289M49222 = this.f65910.m5691().m49222(c1345M49700.getType());
                if (c7289M49222 != null) {
                    for (Map.Entry entry : c7289M49222.m19960().entrySet()) {
                        if (((String) entry.getKey()).startsWith(strM49697)) {
                            c10492 = (C10492) entry.getValue();
                            break;
                        }
                    }
                    if (c10492 == null || c10492.mo8542() == null || c10492.mo8542().isEmpty() || ((C3582) c2551.mo17862((InterfaceC2157) c11457)) == null) {
                        return;
                    }
                    Iterator it = c10492.mo8542().iterator();
                    while (it.hasNext()) {
                        m47173(c2551, (AbstractC1566) it.next(), hashSet);
                    }
                    return;
                }
                return;
            }
            String strM49701 = c21965Mo18926.m49701();
            Iterator it2 = c24927M5671.getMethods().iterator();
            while (true) {
                if (it2.hasNext()) {
                    C2551 c2553 = (C2551) it2.next();
                    if (c2553.mo8532().m49701().equals(strM49701)) {
                        c2552 = c2553;
                        break;
                    }
                } else {
                    for (C2551 c2554 : c24927M5671.getMethods()) {
                        if (c2554.mo8532().m49701().startsWith(strM49697) && !c2554.mo8547().m26540() && c24927M5671.mo8527().m5687().m23403(c2554.mo8532().m49698(), c21965Mo18926.m49698()).m19811()) {
                            c2552 = c2554;
                            break;
                        }
                    }
                    break;
                }
            }
            if (c2552 == null) {
                return;
            }
            mo1737(c2552);
            C3582 c3582 = (C3582) c2552.mo17862((InterfaceC2157) c11457);
            if (((C3582) c2551.mo17862((InterfaceC2157) c11457)) == null || c3582 == null || ((HashSet) c3582.m11641()).isEmpty()) {
                return;
            }
            Iterator it3 = ((HashSet) c3582.m11641()).iterator();
            while (it3.hasNext()) {
                m47173(c2551, AbstractC1566.m5538((String) it3.next()), hashSet);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private void m47173(C2551 c2551, AbstractC1566 abstractC1566, HashSet hashSet) {
        if (abstractC1566.mo5564()) {
            EnumC3429 enumC3429M47172 = m47172(abstractC1566);
            if (enumC3429M47172 == EnumC3429.UNKNOWN_TYPE) {
                c2551.m31137("Thrown type has an unknown type hierarchy: " + abstractC1566);
            } else if (enumC3429M47172 != EnumC3429.THROWS_REQUIRED) {
                return;
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String strMo5570 = abstractC1566.mo5570();
                if (strMo5570.equals(str) ? true : this.f65910.m5691().m49227(strMo5570).contains(str)) {
                    return;
                }
            }
            ((HashSet) ((C3582) c2551.mo17862((InterfaceC2157) C11457.f35999)).m11641()).add(abstractC1566.mo5570());
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private EnumC3429 m47172(AbstractC1566 abstractC1566) {
        if (abstractC1566 == null || abstractC1566.equals(AbstractC1566.f5426)) {
            return EnumC3429.NO_EXCEPTION;
        }
        if (!abstractC1566.mo5564() || !this.f65910.m5691().m49226(abstractC1566.mo5570())) {
            return EnumC3429.UNKNOWN_TYPE;
        }
        if (m47175(abstractC1566, AbstractC1566.f5431) || m47175(abstractC1566, AbstractC1566.f5409)) {
            return EnumC3429.RUNTIME;
        }
        if (m47175(abstractC1566, AbstractC1566.f5432) || m47175(abstractC1566, AbstractC1566.f5422)) {
            return EnumC3429.THROWS_REQUIRED;
        }
        return EnumC3429.NO_EXCEPTION;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m47175(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        if (abstractC1566.equals(abstractC1567)) {
            return true;
        }
        C21681 c21681M5691 = this.f65910.m5691();
        String strMo5570 = abstractC1566.mo5570();
        return c21681M5691.m49227(strMo5570).contains(abstractC1567.mo5570());
    }
}
