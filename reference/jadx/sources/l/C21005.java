package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;
import java.util.TreeSet;

/* JADX INFO: renamed from: l.᩷ܽ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 262Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C21005 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47171(AbstractC4777 abstractC4777) {
        EnumC2890 enumC2890 = abstractC4777.f16795;
        if (enumC2890.m8693()) {
            return true;
        }
        if (!enumC2890.m8694()) {
            return false;
        }
        EnumC19699 enumC19699 = abstractC4777.f16801;
        if (enumC19699 == EnumC19699.E1) {
            return m47172(abstractC4777.mo5126());
        }
        if (enumC19699 == EnumC19699.E2) {
            return m47172(abstractC4777.mo13244()) || m47172(abstractC4777.mo13245());
        }
        throw new RuntimeException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m47172(AbstractC7124 abstractC7124) {
        EnumC9947 enumC9947 = abstractC7124.f23823;
        if (!enumC9947.m25173()) {
            if (!enumC9947.m25174()) {
                return false;
            }
            int i = C18889.f61165[abstractC7124.f23822.ordinal()];
            if (i == 1) {
                return m47172(abstractC7124.mo19020());
            }
            if (i == 2) {
                if (!m47172(abstractC7124.mo19024()) && !m47172(abstractC7124.mo19019())) {
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
    public static void m47168(C9116 c9116) {
        AbstractC4777 abstractC4777M13247;
        C17002 c17002Mo986;
        for (AbstractC4777 abstractC4777 : c9116.f31045) {
            abstractC4777.f16794 = null;
            abstractC4777.f16799 = null;
            TreeSet treeSet = abstractC4777.f16796;
            if (treeSet == null) {
                abstractC4777.f16796 = new TreeSet(c9116.f31045);
            } else {
                treeSet.clear();
            }
        }
        Iterator it = c9116.f31045.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC4777 abstractC4778 = (AbstractC4777) it.next();
            EnumC2890 enumC2890 = abstractC4778.f16795;
            if (enumC2890.m8695() && (c17002Mo986 = ((InterfaceC12064) abstractC4778).mo986()) != null) {
                c17002Mo986.f16796.add(abstractC4778);
            }
            if (enumC2890.m8697() && (abstractC4777M13247 = abstractC4778.m13247()) != null) {
                abstractC4777M13247.f16796.add(abstractC4778);
            }
            if (enumC2890.m8696()) {
                AbstractC19825 abstractC19825 = (AbstractC19825) abstractC4778;
                C17002 c17002 = abstractC19825.f63629;
                if (c17002 != null) {
                    c17002.f16796.add(abstractC4778);
                }
                for (C17002 c17003 : abstractC19825.f63630) {
                    if (c17003 != null) {
                        c17003.f16796.add(abstractC4778);
                    }
                }
            }
        }
        for (C16876 c16876 : c9116.f31040) {
            for (AbstractC4777 abstractC4777M13248 = c16876.f53976; abstractC4777M13248 != c16876.f53975; abstractC4777M13248 = abstractC4777M13248.m13247()) {
                if (m47171(abstractC4777M13248)) {
                    TreeSet treeSet2 = abstractC4777M13248.f16799;
                    if (treeSet2 == null) {
                        treeSet2 = new TreeSet(c9116.f31045);
                        abstractC4777M13248.f16799 = treeSet2;
                    }
                    for (C17002 c17004 : c16876.f53977) {
                        if (c17004 != null) {
                            c17004.f16796.add(abstractC4777M13248);
                        }
                        treeSet2.add(c17004);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47169(C9116 c9116, InterfaceC8306 interfaceC8306) {
        Iterator it = c9116.f31045.iterator();
        while (it.hasNext()) {
            ((AbstractC4777) it.next()).f16798 = false;
        }
        Stack stack = new Stack();
        stack.add(c9116.f31045.getFirst());
        while (!stack.isEmpty()) {
            AbstractC4777 abstractC4777 = (AbstractC4777) stack.pop();
            boolean z = abstractC4777.f16798;
            EnumC2890 enumC2890 = abstractC4777.f16795;
            if (!z) {
                abstractC4777.f16798 = true;
                TreeSet treeSet = abstractC4777.f16799;
                if (treeSet != null) {
                    Iterator it2 = treeSet.iterator();
                    while (it2.hasNext()) {
                        stack.push((C17002) it2.next());
                    }
                }
                if (interfaceC8306 != null) {
                    interfaceC8306.mo15198(abstractC4777);
                }
                if (enumC2890.m8696()) {
                    AbstractC19825 abstractC19825 = (AbstractC19825) abstractC4777;
                    Collections.addAll(stack, abstractC19825.f63630);
                    stack.add(abstractC19825.f63629);
                }
                if (enumC2890.m8695()) {
                    stack.add(((InterfaceC12064) abstractC4777).mo986());
                }
                if (enumC2890.m8697()) {
                    stack.add(abstractC4777.m13247());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47170(C11834 c11834, InterfaceC19595 interfaceC19595) {
        C10653 c10653;
        if (c11834.m29524() == 0) {
            return;
        }
        Iterator it = c11834.iterator();
        while (true) {
            c10653 = null;
            if (!it.hasNext()) {
                break;
            }
            AbstractC4777 abstractC4777 = (AbstractC4777) it.next();
            abstractC4777.f16798 = false;
            abstractC4777.f16794 = null;
        }
        Stack stack = new Stack();
        AbstractC4777 first = c11834.getFirst();
        if (first.f16795 == EnumC2890.LABEL && first.f16796.size() > 0) {
            c10653 = new C10653();
            first.f16796.add(c10653);
        }
        stack.add(first);
        first.f16794 = interfaceC19595.mo6322();
        while (!stack.isEmpty()) {
            AbstractC4777 abstractC4778 = (AbstractC4777) stack.pop();
            if (abstractC4778 != 0) {
                EnumC2890 enumC2890 = abstractC4778.f16795;
                if (!abstractC4778.f16798) {
                    abstractC4778.f16798 = true;
                    Object obj = abstractC4778.f16794;
                    TreeSet<C17002> treeSet = abstractC4778.f16799;
                    if (treeSet != null) {
                        for (C17002 c17002 : treeSet) {
                            c17002.f16794 = interfaceC19595.mo6323(obj, c17002.f16794, abstractC4778, c17002);
                            stack.push(c17002);
                        }
                    }
                    Object objMo6324 = interfaceC19595.mo6324(obj, abstractC4778);
                    if (enumC2890.m8696()) {
                        AbstractC19825 abstractC19825 = (AbstractC19825) abstractC4778;
                        for (C17002 c17003 : abstractC19825.f63630) {
                            c17003.f16794 = interfaceC19595.mo6323(objMo6324, c17003.f16794, abstractC4778, c17003);
                            stack.push(c17003);
                        }
                        C17002 c17004 = abstractC19825.f63629;
                        c17004.f16794 = interfaceC19595.mo6323(objMo6324, c17004.f16794, abstractC4778, c17004);
                        stack.push(c17004);
                    }
                    if (enumC2890.m8695()) {
                        C17002 c17002Mo986 = ((InterfaceC12064) abstractC4778).mo986();
                        c17002Mo986.f16794 = interfaceC19595.mo6323(objMo6324, c17002Mo986.f16794, abstractC4778, c17002Mo986);
                        stack.push(c17002Mo986);
                    }
                    if (enumC2890.m8697()) {
                        AbstractC4777 abstractC4777M13247 = abstractC4778.m13247();
                        abstractC4777M13247.f16794 = interfaceC19595.mo6323(objMo6324, abstractC4777M13247.f16794, abstractC4778, abstractC4777M13247);
                        stack.push(abstractC4777M13247);
                    }
                }
            }
        }
        if (c10653 != null) {
            first.f16796.remove(c10653);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static AbstractC7124 m47174(AbstractC7124 abstractC7124, InterfaceC7600 interfaceC7600) {
        int i = C18889.f61165[abstractC7124.f23822.ordinal()];
        if (i == 1) {
            abstractC7124.mo19021(m47174(abstractC7124.mo19020(), interfaceC7600));
            return abstractC7124;
        }
        if (i == 2) {
            abstractC7124.mo19026(m47174(abstractC7124.mo19024(), interfaceC7600));
            abstractC7124.mo19025(m47174(abstractC7124.mo19019(), interfaceC7600));
            return abstractC7124;
        }
        if (i != 3) {
            if (i == 4 && abstractC7124.f23823 == EnumC9947.LOCAL) {
                return interfaceC7600.mo4154((C2184) abstractC7124);
            }
        } else {
            AbstractC7124[] abstractC7124ArrMo19023 = abstractC7124.mo19023();
            for (int i2 = 0; i2 < abstractC7124ArrMo19023.length; i2++) {
                abstractC7124ArrMo19023[i2] = m47174(abstractC7124ArrMo19023[i2], interfaceC7600);
            }
        }
        return abstractC7124;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47167(AbstractC7124 abstractC7124, InterfaceC7600 interfaceC7600) {
        int i = C18889.f61165[abstractC7124.f23822.ordinal()];
        if (i == 1) {
            m47167(abstractC7124.mo19020(), interfaceC7600);
            return;
        }
        if (i == 2) {
            m47167(abstractC7124.mo19024(), interfaceC7600);
            m47167(abstractC7124.mo19019(), interfaceC7600);
            return;
        }
        if (i != 3) {
            if (i == 4 && abstractC7124.f23823 == EnumC9947.LOCAL) {
                interfaceC7600.mo4154((C2184) abstractC7124);
                return;
            }
            return;
        }
        for (AbstractC7124 abstractC7125 : abstractC7124.mo19023()) {
            m47167(abstractC7125, interfaceC7600);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m47175(AbstractC4777 abstractC4777, InterfaceC7600 interfaceC7600, boolean z) {
        ArrayList arrayList;
        int[] iArr = C18889.f61165;
        EnumC19699 enumC19699 = abstractC4777.f16801;
        EnumC2890 enumC2890 = abstractC4777.f16795;
        int i = iArr[enumC19699.ordinal()];
        if (i == 1) {
            abstractC4777.mo5125(m47174(abstractC4777.mo5126(), interfaceC7600));
            return;
        }
        if (i == 2) {
            AbstractC7124 abstractC7124Mo13244 = abstractC4777.mo13244();
            if (abstractC7124Mo13244.f23823 == EnumC9947.LOCAL && (enumC2890 == EnumC2890.ASSIGN || enumC2890 == EnumC2890.IDENTITY)) {
                abstractC4777.mo13246(m47174(abstractC4777.mo13245(), interfaceC7600));
                abstractC4777.mo13248(interfaceC7600.mo4153((C2184) abstractC7124Mo13244, (C15592) abstractC4777));
                return;
            } else {
                abstractC4777.mo13248(m47174(abstractC4777.mo13244(), interfaceC7600));
                abstractC4777.mo13246(m47174(abstractC4777.mo13245(), interfaceC7600));
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC2890 == EnumC2890.LABEL && (arrayList = ((C17002) abstractC4777).f54351) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m47175((C15592) it.next(), interfaceC7600, false);
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47166(AbstractC4777 abstractC4777, InterfaceC7600 interfaceC7600, boolean z) {
        ArrayList arrayList;
        int[] iArr = C18889.f61165;
        EnumC19699 enumC19699 = abstractC4777.f16801;
        EnumC2890 enumC2890 = abstractC4777.f16795;
        int i = iArr[enumC19699.ordinal()];
        if (i == 1) {
            m47167(abstractC4777.mo5126(), interfaceC7600);
            return;
        }
        if (i == 2) {
            AbstractC7124 abstractC7124Mo13244 = abstractC4777.mo13244();
            if (abstractC7124Mo13244.f23823 == EnumC9947.LOCAL && (enumC2890 == EnumC2890.ASSIGN || enumC2890 == EnumC2890.IDENTITY)) {
                m47167(abstractC4777.mo13245(), interfaceC7600);
                interfaceC7600.mo4153((C2184) abstractC7124Mo13244, (C15592) abstractC4777);
                return;
            } else {
                m47167(abstractC4777.mo13244(), interfaceC7600);
                m47167(abstractC4777.mo13245(), interfaceC7600);
                return;
            }
        }
        if ((i == 3 || i == 4) && z && enumC2890 == EnumC2890.LABEL && (arrayList = ((C17002) abstractC4777).f54351) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m47166((C15592) it.next(), interfaceC7600, false);
            }
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static int m47173(C9116 c9116) {
        Iterator it = c9116.f31044.iterator();
        int i = 0;
        while (it.hasNext()) {
            ((C2184) it.next()).f7921 = i;
            i++;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47165(AbstractC4777 abstractC4777, HashSet hashSet) {
        EnumC2890 enumC2890 = abstractC4777.f16795;
        if (enumC2890.m8695()) {
            hashSet.add(((InterfaceC12064) abstractC4777).mo986());
        }
        if (enumC2890.m8697()) {
            hashSet.add(abstractC4777.m13247());
        }
        if (enumC2890.m8696()) {
            AbstractC19825 abstractC19825 = (AbstractC19825) abstractC4777;
            hashSet.add(abstractC19825.f63629);
            for (C17002 c17002 : abstractC19825.f63630) {
                hashSet.add(c17002);
            }
        }
        TreeSet treeSet = abstractC4777.f16799;
        if (treeSet != null) {
            hashSet.addAll(treeSet);
        }
    }
}
