package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܽۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes4.dex */
public final class C16467 {
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean m38730(AbstractC3384 abstractC3384) {
        return abstractC3384.mo5435() == EnumC10297.f35189;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m38737(AbstractC3384 abstractC3384) {
        EnumC10297 enumC10297Mo5435 = abstractC3384.mo5435();
        return enumC10297Mo5435 == EnumC10297.f35230 || enumC10297Mo5435 == EnumC10297.f35278 || enumC10297Mo5435 == EnumC10297.f35050;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38738(AbstractC3384 abstractC3384) {
        EnumC10297 enumC10297Mo5435 = abstractC3384.mo5435();
        return enumC10297Mo5435 == EnumC10297.f35147 || enumC10297Mo5435 == EnumC10297.f35164 || enumC10297Mo5435 == EnumC10297.f35286;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38735(AbstractC3384 abstractC3384) {
        return (abstractC3384.mo5435().f35324 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38736(AbstractC3384 abstractC3384, Set set) {
        Iterator it = abstractC3384.m10035().m36037().iterator();
        while (it.hasNext()) {
            if (!set.contains((C5171) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38731(C20700 c20700, int i, int i2) {
        List list = c20700.f67317;
        Set set = c20700.f67314;
        while (i2 >= 0) {
            AbstractC3384 abstractC3384 = (AbstractC3384) list.get(i2);
            if (m38737(abstractC3384) && ((InterfaceC4685) abstractC3384).mo1140() == i) {
                return ((InterfaceC1157) abstractC3384).mo1144();
            }
            if (!m38735(abstractC3384) || m38736(abstractC3384, set)) {
                return -1;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m38732(InterfaceC8858 interfaceC8858) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC8858.mo9699().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38733(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC1594 interfaceC1594 = (InterfaceC1594) it.next();
            switch (interfaceC1594.mo5435().f35329) {
                case 1:
                    if (set.contains(((InterfaceC15914) ((InterfaceC13859) interfaceC1594).getReference()).getType())) {
                        return true;
                    }
                    break;
                case 2:
                    if (set.contains(((InterfaceC18735) ((InterfaceC13859) interfaceC1594).getReference()).mo1183())) {
                        return true;
                    }
                    break;
                case 3:
                    if (set.contains(((InterfaceC8858) ((InterfaceC13859) interfaceC1594).getReference()).mo9700())) {
                        return true;
                    }
                    break;
                case 4:
                case 5:
                case 6:
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m38739(C20700 c20700, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C11522 c11522 : c20700.f67316) {
            C19995 c19995 = new C19995();
            c19995.f63996 = c11522.f38738.m14324().m36038();
            c19995.f63995 = c11522.f38737.m14324().m36038();
            AbstractC22433 abstractC22433Of = AbstractC22433.of((Object) c11522.f38739);
            c19995.f63997 = new int[abstractC22433Of.size()];
            for (int i3 = 0; i3 < abstractC22433Of.size(); i3++) {
                c19995.f63997[i3] = ((AbstractC9736) abstractC22433Of.get(i3)).m24691().m14324().m36038();
            }
            linkedList.add(c19995);
        }
        return m38734(c20700.f67317, linkedList, i, i2, new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m38734(List list, LinkedList linkedList, int i, int i2, HashSet hashSet) {
        C0238 c0238 = new C0238(i);
        while (i2 < list.size() && hashSet.add(Integer.valueOf(i2))) {
            Iterator it = linkedList.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C19995 c19995 = (C19995) it.next();
                if (i2 >= c19995.f63996 && i2 < c19995.f63995) {
                    it.remove();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i3 : c19995.f63997) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (m38734(list, linkedList, i, ((Integer) it2.next()).intValue(), hashSet)) {
                        return true;
                    }
                }
            }
            AbstractC3384 abstractC3384 = (AbstractC3384) list.get(i2);
            c0238.m1607(abstractC3384);
            if (!c0238.f1425) {
                if (c0238.f1426) {
                    break;
                }
                if (!m38735(abstractC3384)) {
                    if (!(abstractC3384 instanceof AbstractC4465)) {
                        break;
                    }
                    return m38734(list, linkedList, i, ((AbstractC4465) abstractC3384).m12443().m14324().m36038(), hashSet);
                }
                int i4 = C15762.f51064[abstractC3384.mo5435().f35328.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    int iM36038 = ((AbstractC4465) abstractC3384).m12443().m14324().m36038();
                    if (!m38734(list, linkedList, i, i2 + 1, hashSet)) {
                        if (m38734(list, linkedList, i, iM36038, hashSet)) {
                        }
                    }
                } else if (i4 != 3 || (abstractC3384.mo5435() != EnumC10297.f35282 && abstractC3384.mo5435() != EnumC10297.f35153)) {
                    i2++;
                } else if (!m38734(list, linkedList, i, i2 + 1, hashSet)) {
                    Iterator it3 = ((AbstractC13639) ((AbstractC4465) abstractC3384).m12443().m14324().m36033()).mo14955().iterator();
                    while (it3.hasNext()) {
                        if (m38734(list, linkedList, i, ((C14490) it3.next()).m34886().m14324().m36038(), hashSet)) {
                        }
                    }
                    break;
                }
            }
            return true;
        }
        return false;
    }
}
