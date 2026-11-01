package l;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.֡ܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: C7P7 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0461 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C0192 m2294(C0192 c0192, Collection collection) throws C18537 {
        if (!c0192.m1419().isEmpty()) {
            final C20234 c20234M1420 = c0192.m1420(collection);
            AbstractC16706 abstractC16706ListIterator = c0192.m1419().listIterator(0);
            C18116 c18116M42177 = C18116.m42177();
            while (abstractC16706ListIterator.hasNext()) {
                C20218 c20218M2297 = m2297(abstractC16706ListIterator);
                if (!c20218M2297.m45706() && C9030.stream(c20218M2297.m45712()).allMatch(new Predicate() { // from class: l.᩷ܰ᩸
                    @Override // java.util.function.Predicate
                    public /* synthetic */ Predicate and(Predicate predicate) {
                        return C8512.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* JADX INFO: renamed from: negate */
                    public /* synthetic */ Predicate mo9645negate() {
                        return C8512.$default$negate(this);
                    }

                    public /* synthetic */ Predicate or(Predicate predicate) {
                        return C8512.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return c20234M1420.mo26254(Integer.valueOf(((C15716) ((InterfaceC15670) obj).mo37335()).getIndex()));
                    }
                })) {
                    ArrayList arrayList = new ArrayList();
                    int iM45710 = c20218M2297.m45710();
                    arrayList.add(c20218M2297);
                    int iM45708 = -1;
                    while (abstractC16706ListIterator.hasNext()) {
                        C20218 c20218M2298 = m2297(abstractC16706ListIterator);
                        if (c20218M2298.m45706()) {
                            break;
                        }
                        arrayList.add(c20218M2298);
                        iM45708 = c20218M2298.m45708();
                    }
                    AbstractC10959 abstractC10959M27714 = AbstractC10959.m27714();
                    abstractC10959M27714.getClass();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        while (it.hasNext()) {
                            Object next2 = it.next();
                            if (abstractC10959M27714.compare(next, next2) > 0) {
                                ArrayList arrayListM27717 = AbstractC10959.m27714().m27717(arrayList);
                                StringBuilder sb = new StringBuilder();
                                for (int i = 0; i < arrayListM27717.size(); i++) {
                                    if (i > 0) {
                                        AbstractC16706 abstractC16706ListIterator2 = ((C20218) arrayList.get(i)).m45709().listIterator(0);
                                        while (abstractC16706ListIterator2.hasNext()) {
                                            sb.append(((InterfaceC20608) abstractC16706ListIterator2.next()).getText());
                                        }
                                    }
                                    sb.append(((C20218) arrayListM27717.get(i)).m45707());
                                    if (i < arrayListM27717.size() - 1) {
                                        AbstractC16706 abstractC16706ListIterator3 = ((C20218) arrayList.get(i)).m45711().listIterator(0);
                                        while (abstractC16706ListIterator3.hasNext()) {
                                            sb.append(((InterfaceC20608) abstractC16706ListIterator3.next()).getText());
                                        }
                                    }
                                }
                                c18116M42177.m42178(C9548.m24401(Integer.valueOf(iM45710), Integer.valueOf(iM45708)), sb.toString());
                                break;
                            }
                            next = next2;
                        }
                    }
                }
            }
            Map mapM42179 = c18116M42177.m42179();
            if (!((AbstractMap) mapM42179).isEmpty()) {
                StringBuilder sb2 = new StringBuilder(c0192.m1425());
                for (Map.Entry entry : mapM42179.entrySet()) {
                    C9548 c9548 = (C9548) entry.getKey();
                    sb2.replace(((Integer) c9548.m24409()).intValue(), ((Integer) c9548.m24407()).intValue(), (String) entry.getValue());
                }
                return new C0192(sb2.toString());
            }
        }
        return c0192;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20218 m2297(Iterator it) {
        InterfaceC15670 interfaceC15670 = (InterfaceC15670) it.next();
        int i = AbstractC22433.f73217;
        C4793 c4793 = new C4793();
        c4793.m52163(interfaceC15670);
        if (!((C15716) interfaceC15670.mo37335()).getText().equals("non")) {
            AbstractC22433 abstractC22433M13309 = c4793.m13309();
            return new C20218(abstractC22433M13309, m2296(abstractC22433M13309));
        }
        if (!it.hasNext()) {
            return new C20218(AbstractC22433.of(), null);
        }
        InterfaceC15670 interfaceC15671 = (InterfaceC15670) it.next();
        c4793.m52163(interfaceC15671);
        if (!((C15716) interfaceC15671.mo37335()).getText().equals("-") || !it.hasNext()) {
            return new C20218(AbstractC22433.of(), null);
        }
        c4793.m52163((InterfaceC15670) it.next());
        AbstractC22433 abstractC22433M133010 = c4793.m13309();
        return new C20218(abstractC22433M133010, m2296(abstractC22433M133010));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4870 m2296(AbstractC22433 abstractC22433) {
        if (abstractC22433.size() == 1) {
            return m2295((InterfaceC15670) abstractC22433.get(0));
        }
        EnumC4870 enumC4870M2295 = m2295((InterfaceC15670) C22808.m50475(abstractC22433));
        if (enumC4870M2295 == null) {
            return null;
        }
        return EnumC4870.valueOf("NON_" + enumC4870M2295.name());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4870 m2295(InterfaceC15670 interfaceC15670) {
        EnumC0573 enumC0573M37427 = ((C15716) interfaceC15670.mo37335()).m37427();
        if (enumC0573M37427 != null) {
            switch (C15985.f51766[enumC0573M37427.ordinal()]) {
                case 1:
                    return EnumC4870.f17141;
                case 2:
                    return EnumC4870.f17133;
                case 3:
                    return EnumC4870.f17131;
                case 4:
                    return EnumC4870.f17140;
                case 5:
                    return EnumC4870.f17128;
                case 6:
                    return EnumC4870.f17127;
                case 7:
                    return EnumC4870.f17138;
                case 8:
                    return EnumC4870.f17130;
                case 9:
                    return EnumC4870.f17135;
                case 10:
                    return EnumC4870.f17129;
                case 11:
                    return EnumC4870.f17134;
                case 12:
                    return EnumC4870.f17132;
            }
        }
        String text = ((C15716) interfaceC15670.mo37335()).getText();
        text.getClass();
        if (text.equals("sealed")) {
            return EnumC4870.valueOf("SEALED");
        }
        return null;
    }
}
