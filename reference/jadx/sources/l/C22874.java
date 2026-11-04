package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩸ܳܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 262Q */
/* JADX INFO: loaded from: classes.dex */
public final class C22874 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51599(AbstractC12563 abstractC12563) {
        EnumC20768 enumC20768 = abstractC12563.f40344;
        if (enumC20768.m47515()) {
            return true;
        }
        if (!enumC20768.m47513()) {
            return false;
        }
        EnumC7080 enumC7080 = abstractC12563.f40352;
        if (enumC7080 == EnumC7080.E1) {
            return m51598(abstractC12563.mo31271());
        }
        if (enumC7080 == EnumC7080.E2) {
            return m51598(abstractC12563.mo11730()) || m51598(abstractC12563.mo11728());
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m51598(AbstractC11071 abstractC11071) {
        EnumC22260 enumC22260 = abstractC11071.f34921;
        if (!enumC22260.m50311()) {
            if (!enumC22260.m50312()) {
                return false;
            }
            int i = C8834.f28894[abstractC11071.f34922.ordinal()];
            if (i == 1) {
                return m51598(abstractC11071.mo20366());
            }
            if (i == 2) {
                if (!m51598(abstractC11071.mo27979()) && !m51598(abstractC11071.mo27977())) {
                    return false;
                }
            } else {
                throw new RuntimeException();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51595(C13791 c13791) {
        AbstractC12563 abstractC12563M31273;
        C11817 c11817Mo7315;
        for (AbstractC12563 abstractC12563 : c13791.f43750) {
            abstractC12563.f40353 = null;
            abstractC12563.f40347 = null;
            TreeSet treeSet = abstractC12563.f40345;
            if (treeSet == null) {
                abstractC12563.f40345 = new TreeSet(c13791.f43750);
            } else {
                treeSet.clear();
            }
        }
        Iterator it = c13791.f43750.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC12563 abstractC12564 = (AbstractC12563) it.next();
            EnumC20768 enumC20768 = abstractC12564.f40344;
            if (enumC20768.m47514() && (c11817Mo7315 = ((InterfaceC2123) abstractC12564).mo7315()) != null) {
                c11817Mo7315.f40345.add(abstractC12564);
            }
            if (enumC20768.m47517() && (abstractC12563M31273 = abstractC12564.m31273()) != null) {
                abstractC12563M31273.f40345.add(abstractC12564);
            }
            if (enumC20768.m47516()) {
                AbstractC15546 abstractC15546 = (AbstractC15546) abstractC12564;
                C11817 c11817 = abstractC15546.f50567;
                if (c11817 != null) {
                    c11817.f40345.add(abstractC12564);
                }
                for (C11817 c11818 : abstractC15546.f50568) {
                    if (c11818 != null) {
                        c11818.f40345.add(abstractC12564);
                    }
                }
            }
        }
        for (C13397 c13397 : c13791.f43748) {
            for (AbstractC12563 abstractC12563M31274 = c13397.f42695; abstractC12563M31274 != c13397.f42694; abstractC12563M31274 = abstractC12563M31274.m31273()) {
                if (m51599(abstractC12563M31274)) {
                    TreeSet treeSet2 = abstractC12563M31274.f40347;
                    if (treeSet2 == null) {
                        treeSet2 = new TreeSet(c13791.f43750);
                        abstractC12563M31274.f40347 = treeSet2;
                    }
                    for (C11817 c11819 : c13397.f42696) {
                        if (c11819 != null) {
                            c11819.f40345.add(abstractC12563M31274);
                        }
                        treeSet2.add(c11819);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51596(C13791 c13791, InterfaceC7343 interfaceC7343) {
        Iterator it = c13791.f43750.iterator();
        while (it.hasNext()) {
            ((AbstractC12563) it.next()).f40348 = false;
        }
        Stack stack = new Stack();
        stack.add(c13791.f43750.getFirst());
        while (!stack.isEmpty()) {
            AbstractC12563 abstractC12563 = (AbstractC12563) stack.pop();
            boolean z = abstractC12563.f40348;
            EnumC20768 enumC20768 = abstractC12563.f40344;
            if (!z) {
                abstractC12563.f40348 = true;
                TreeSet treeSet = abstractC12563.f40347;
                if (treeSet != null) {
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        stack.push((C11817) it2.next());
                    }
                }
                if (interfaceC7343 != null) {
                    interfaceC7343.mo20160(abstractC12563);
                }
                if (enumC20768.m47516()) {
                    AbstractC15546 abstractC15546 = (AbstractC15546) abstractC12563;
                    Collections.addAll(stack, abstractC15546.f50568);
                    stack.add(abstractC15546.f50567);
                }
                if (enumC20768.m47514()) {
                    stack.add(((InterfaceC2123) abstractC12563).mo7315());
                }
                if (enumC20768.m47517()) {
                    stack.add(abstractC12563.m31273());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51597(C24498 c24498, InterfaceC14054 interfaceC14054) {
        C17038 c17038;
        if (c24498.m54763() == 0) {
            return;
        }
        Iterator it = c24498.iterator();
        while (true) {
            c17038 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC12563 abstractC12563 = (AbstractC12563) it.next();
            abstractC12563.f40348 = false;
            abstractC12563.f40353 = null;
        }
        Stack stack = new Stack();
        AbstractC12563 first = c24498.getFirst();
        if (first.f40344 == EnumC20768.LABEL && first.f40345.size() > 0) {
            c17038 = new C17038();
            first.f40345.add(c17038);
        }
        stack.add(first);
        first.f40353 = interfaceC14054.mo13331();
        while (!stack.isEmpty()) {
            AbstractC12563 abstractC12564 = (AbstractC12563) stack.pop();
            if (abstractC12564 != 0) {
                EnumC20768 enumC20768 = abstractC12564.f40344;
                if (!abstractC12564.f40348) {
                    abstractC12564.f40348 = true;
                    Object obj = abstractC12564.f40353;
                    TreeSet<C11817> treeSet = abstractC12564.f40347;
                    if (treeSet != null) {
                        for (C11817 c11817 : treeSet) {
                            c11817.f40353 = interfaceC14054.mo6602(obj, c11817.f40353, abstractC12564, c11817);
                            stack.push(c11817);
                        }
                    }
                    Object objMo13332 = interfaceC14054.mo13332(obj, abstractC12564);
                    if (enumC20768.m47516()) {
                        AbstractC15546 abstractC15546 = (AbstractC15546) abstractC12564;
                        for (C11817 c11818 : abstractC15546.f50568) {
                            c11818.f40353 = interfaceC14054.mo6602(objMo13332, c11818.f40353, abstractC12564, c11818);
                            stack.push(c11818);
                        }
                        C11817 c11819 = abstractC15546.f50567;
                        c11819.f40353 = interfaceC14054.mo6602(objMo13332, c11819.f40353, abstractC12564, c11819);
                        stack.push(c11819);
                    }
                    if (enumC20768.m47514()) {
                        C11817 c11817Mo7315 = ((InterfaceC2123) abstractC12564).mo7315();
                        c11817Mo7315.f40353 = interfaceC14054.mo6602(objMo13332, c11817Mo7315.f40353, abstractC12564, c11817Mo7315);
                        stack.push(c11817Mo7315);
                    }
                    if (enumC20768.m47517()) {
                        AbstractC12563 abstractC12563M31273 = abstractC12564.m31273();
                        abstractC12563M31273.f40353 = interfaceC14054.mo6602(objMo13332, abstractC12563M31273.f40353, abstractC12564, abstractC12563M31273);
                        stack.push(abstractC12563M31273);
                    }
                }
            }
        }
        if (c17038 != null) {
            first.f40345.remove(c17038);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static AbstractC11071 m51601(AbstractC11071 abstractC11071, InterfaceC10939 interfaceC10939) {
        int i = C8834.f28894[abstractC11071.f34922.ordinal()];
        if (i == 1) {
            abstractC11071.mo20367(m51601(abstractC11071.mo20366(), interfaceC10939));
            return abstractC11071;
        }
        if (i == 2) {
            abstractC11071.mo27980(m51601(abstractC11071.mo27979(), interfaceC10939));
            abstractC11071.mo27978(m51601(abstractC11071.mo27977(), interfaceC10939));
            return abstractC11071;
        }
        if (i != 3) {
            if (i == 4 && abstractC11071.f34921 == EnumC22260.LOCAL) {
                return interfaceC10939.mo5057((C4448) abstractC11071);
            }
        } else {
            AbstractC11071[] abstractC11071ArrMo15448 = abstractC11071.mo15448();
            for (int i2 = 0; i2 < abstractC11071ArrMo15448.length; i2++) {
                abstractC11071ArrMo15448[i2] = m51601(abstractC11071ArrMo15448[i2], interfaceC10939);
            }
        }
        return abstractC11071;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51592(AbstractC11071 abstractC11071, InterfaceC10939 interfaceC10939) {
        int i = C8834.f28894[abstractC11071.f34922.ordinal()];
        if (i == 1) {
            m51592(abstractC11071.mo20366(), interfaceC10939);
            return;
        }
        if (i == 2) {
            m51592(abstractC11071.mo27979(), interfaceC10939);
            m51592(abstractC11071.mo27977(), interfaceC10939);
            return;
        }
        if (i != 3) {
            if (i == 4 && abstractC11071.f34921 == EnumC22260.LOCAL) {
                interfaceC10939.mo5057((C4448) abstractC11071);
                return;
            }
            return;
        }
        for (AbstractC11071 abstractC11072 : abstractC11071.mo15448()) {
            m51592(abstractC11072, interfaceC10939);
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m51602(AbstractC12563 abstractC12563, InterfaceC10939 interfaceC10939, boolean z) {
        ArrayList arrayList;
        int[] iArr = C8834.f28894;
        EnumC7080 enumC7080 = abstractC12563.f40352;
        EnumC20768 enumC20768 = abstractC12563.f40344;
        int i = iArr[enumC7080.ordinal()];
        if (i == 1) {
            abstractC12563.mo31270(m51601(abstractC12563.mo31271(), interfaceC10939));
            return;
        }
        if (i == 2) {
            AbstractC11071 abstractC11071Mo11730 = abstractC12563.mo11730();
            if (abstractC11071Mo11730.f34921 == EnumC22260.LOCAL && (enumC20768 == EnumC20768.ASSIGN || enumC20768 == EnumC20768.IDENTITY)) {
                abstractC12563.mo11727(m51601(abstractC12563.mo11728(), interfaceC10939));
                abstractC12563.mo11729(interfaceC10939.mo5056((C4448) abstractC11071Mo11730, (C20022) abstractC12563));
                return;
            } else {
                abstractC12563.mo11729(m51601(abstractC12563.mo11730(), interfaceC10939));
                abstractC12563.mo11727(m51601(abstractC12563.mo11728(), interfaceC10939));
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC20768 == EnumC20768.LABEL && (arrayList = ((C11817) abstractC12563).f38143) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m51602((C20022) it.next(), interfaceC10939, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51594(AbstractC12563 abstractC12563, InterfaceC10939 interfaceC10939, boolean z) {
        ArrayList arrayList;
        int[] iArr = C8834.f28894;
        EnumC7080 enumC7080 = abstractC12563.f40352;
        EnumC20768 enumC20768 = abstractC12563.f40344;
        int i = iArr[enumC7080.ordinal()];
        if (i == 1) {
            m51592(abstractC12563.mo31271(), interfaceC10939);
            return;
        }
        if (i == 2) {
            AbstractC11071 abstractC11071Mo11730 = abstractC12563.mo11730();
            if (abstractC11071Mo11730.f34921 == EnumC22260.LOCAL && (enumC20768 == EnumC20768.ASSIGN || enumC20768 == EnumC20768.IDENTITY)) {
                m51592(abstractC12563.mo11728(), interfaceC10939);
                interfaceC10939.mo5056((C4448) abstractC11071Mo11730, (C20022) abstractC12563);
                return;
            } else {
                m51592(abstractC12563.mo11730(), interfaceC10939);
                m51592(abstractC12563.mo11728(), interfaceC10939);
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC20768 == EnumC20768.LABEL && (arrayList = ((C11817) abstractC12563).f38143) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m51594((C20022) it.next(), interfaceC10939, false);
            }
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static int m51600(C13791 c13791) {
        Iterator it = c13791.f43751.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C4448) it.next()).f15916 = i;
            i++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51593(AbstractC12563 abstractC12563, HashSet hashSet) {
        EnumC20768 enumC20768 = abstractC12563.f40344;
        if (enumC20768.m47514()) {
            hashSet.add(((InterfaceC2123) abstractC12563).mo7315());
        }
        if (enumC20768.m47517()) {
            hashSet.add(abstractC12563.m31273());
        }
        if (enumC20768.m47516()) {
            AbstractC15546 abstractC15546 = (AbstractC15546) abstractC12563;
            hashSet.add(abstractC15546.f50567);
            for (C11817 c11817 : abstractC15546.f50568) {
                hashSet.add(c11817);
            }
        }
        TreeSet treeSet = abstractC12563.f40347;
        if (treeSet != null) {
            hashSet.addAll(treeSet);
        }
    }
}
