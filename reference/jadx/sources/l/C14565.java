package l;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: l.ܰۧ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G4YY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14565 {
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean m35134(AbstractC12384 abstractC12384) {
        return abstractC12384.mo30864() == EnumC22631.f73319;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m35131(AbstractC12384 abstractC12384) {
        EnumC22631 enumC22631Mo30864 = abstractC12384.mo30864();
        return enumC22631Mo30864 == EnumC22631.f73393 || enumC22631Mo30864 == EnumC22631.f73465 || enumC22631Mo30864 == EnumC22631.f73433;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35133(AbstractC12384 abstractC12384) {
        EnumC22631 enumC22631Mo30864 = abstractC12384.mo30864();
        return enumC22631Mo30864 == EnumC22631.f73369 || enumC22631Mo30864 == EnumC22631.f73302 || enumC22631Mo30864 == EnumC22631.f73278;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35129(AbstractC12384 abstractC12384) {
        return (abstractC12384.mo30864().f73512 & 4) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35130(AbstractC12384 abstractC12384, Set set) {
        Iterator it = abstractC12384.m30863().m24747().iterator();
        while (it.hasNext()) {
            if (!set.contains((C21335) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m35125(C12328 c12328, int i, int i2) {
        List list = c12328.f39608;
        Set set = c12328.f39609;
        while (i2 >= 0) {
            AbstractC12384 abstractC12384 = (AbstractC12384) list.get(i2);
            if (m35131(abstractC12384) && ((InterfaceC12142) abstractC12384).mo1542() == i) {
                return ((InterfaceC18109) abstractC12384).mo1541();
            }
            if (!m35129(abstractC12384) || m35130(abstractC12384, set)) {
                return -1;
            }
            i2--;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static String m35126(InterfaceC4859 interfaceC4859) {
        StringBuilder sb = new StringBuilder();
        Iterator it = interfaceC4859.mo6805().iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35127(Iterable iterable, Set set) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            InterfaceC23331 interfaceC23331 = (InterfaceC23331) it.next();
            switch (interfaceC23331.mo30864().f73513) {
                case 1:
                    if (set.contains(((InterfaceC19775) ((InterfaceC6177) interfaceC23331).getReference()).getType())) {
                        return true;
                    }
                    break;
                case 2:
                    if (set.contains(((InterfaceC8304) ((InterfaceC6177) interfaceC23331).getReference()).mo4500())) {
                        return true;
                    }
                    break;
                case 3:
                    if (set.contains(((InterfaceC4859) ((InterfaceC6177) interfaceC23331).getReference()).mo6804())) {
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m35132(C12328 c12328, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        for (C4181 c4181 : c12328.f39607) {
            C24263 c24263 = new C24263();
            c24263.f78560 = c4181.f14178.m48561().m24745();
            c24263.f78559 = c4181.f14177.m48561().m24745();
            AbstractC1928 abstractC1928Of = AbstractC1928.of((Object) c4181.f14179);
            c24263.f78561 = new int[abstractC1928Of.size()];
            for (int i3 = 0; i3 < abstractC1928Of.size(); i3++) {
                c24263.f78561[i3] = ((AbstractC20589) abstractC1928Of.get(i3)).m47178().m48561().m24745();
            }
            linkedList.add(c24263);
        }
        return m35128(c12328.f39608, linkedList, i, i2, new HashSet());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m35128(List list, LinkedList linkedList, int i, int i2, HashSet hashSet) {
        C4125 c4125 = new C4125(i);
        while (i2 < list.size() && hashSet.add(Integer.valueOf(i2))) {
            Iterator it = linkedList.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                C24263 c24263 = (C24263) it.next();
                if (i2 >= c24263.f78560 && i2 < c24263.f78559) {
                    it.remove();
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    for (int i3 : c24263.f78561) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (m35128(list, linkedList, i, ((Integer) it2.next()).intValue(), hashSet)) {
                        return true;
                    }
                }
            }
            AbstractC12384 abstractC12384 = (AbstractC12384) list.get(i2);
            c4125.m13233(abstractC12384);
            if (!c4125.f13992) {
                if (c4125.f13993) {
                    break;
                }
                if (!m35129(abstractC12384)) {
                    if (!(abstractC12384 instanceof AbstractC6419)) {
                        break;
                    }
                    return m35128(list, linkedList, i, ((AbstractC6419) abstractC12384).m18177().m48561().m24745(), hashSet);
                }
                int i4 = C6363.f21492[abstractC12384.mo30864().f73508.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    int iM24745 = ((AbstractC6419) abstractC12384).m18177().m48561().m24745();
                    if (!m35128(list, linkedList, i, i2 + 1, hashSet)) {
                        if (m35128(list, linkedList, i, iM24745, hashSet)) {
                        }
                    }
                } else if (i4 != 3 || (abstractC12384.mo30864() != EnumC22631.f73464 && abstractC12384.mo30864() != EnumC22631.f73309)) {
                    i2++;
                } else if (!m35128(list, linkedList, i, i2 + 1, hashSet)) {
                    Iterator it3 = ((AbstractC24319) ((AbstractC6419) abstractC12384).m18177().m48561().m24749()).mo20143().iterator();
                    while (it3.hasNext()) {
                        if (m35128(list, linkedList, i, ((C23812) it3.next()).m53133().m48561().m24745(), hashSet)) {
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
