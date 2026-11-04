package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ᩳ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: EIX3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18938 extends AbstractC16700 {
    /* JADX WARN: Code duplicated, block: B:101:0x021d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        C11457 c11457;
        boolean z;
        C11457 c11458;
        boolean z2;
        boolean z3;
        C24927 c24928 = c24927;
        boolean z4 = false;
        if (c24928.mo17865(EnumC1763.PACKAGE_INFO)) {
            return false;
        }
        Iterator it = c24927.m55534().iterator();
        while (it.hasNext()) {
            mo22644((C24927) it.next());
        }
        if (m43960(c24927)) {
            c24928.mo17866(EnumC1763.DONT_GENERATE);
            return false;
        }
        C11457 c11459 = C11457.f36004;
        boolean zMo17867 = c24928.mo17867(c11459);
        if (zMo17867 || c24927.m55571().m4962()) {
            for (C17467 c17467 : c24927.getFields()) {
                AbstractC1566 type = c17467.getType();
                if (c17467.mo8547().m26528() && type.mo5543() && !type.m5569()) {
                    C24927 c24927M5671 = c24927.mo8527().m5671(C1345.m4955(c24927.mo8527(), type));
                    C1345 c1345M4973 = c24927.m55571().m4973();
                    if (c24927M5671 != null) {
                        if (C17359.equals(c1345M4973, c24927M5671.m55571())) {
                            z = true;
                        } else {
                            C4000 c4000 = (C4000) c24928.mo17862((InterfaceC2157) c11459);
                            if (c4000 == null || !c4000.m12936().equals(c24927M5671)) {
                                z3 = false;
                                break;
                            }
                            final boolean[] zArr = new boolean[1];
                            zArr[z4 ? 1 : 0] = z4;
                            Iterator it2 = c24927.getMethods().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    final C2551 c2551 = (C2551) it2.next();
                                    if (c2551.m8529()) {
                                        Iterator it3 = c2551.m8514().iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                C2551 c2552 = (C2551) it3.next();
                                                if (c2552.m8536().equals(c24927M5671) && c2552.m8508() != null) {
                                                    Iterator it4 = c2552.m8508().iterator();
                                                    while (true) {
                                                        if (it4.hasNext()) {
                                                            Iterator it5 = ((ArrayList) ((C21943) it4.next()).mo1986()).iterator();
                                                            while (true) {
                                                                if (it5.hasNext()) {
                                                                    if (((Boolean) ((C18959) it5.next()).m44009(new Function() { // from class: l.۟۠ۗ
                                                                        @Override // java.util.function.Function
                                                                        /* JADX INFO: renamed from: andThen */
                                                                        public /* synthetic */ Function mo10608andThen(Function function) {
                                                                            return C24247.$default$andThen(this, function);
                                                                        }

                                                                        @Override // java.util.function.Function
                                                                        public /* synthetic */ Function compose(Function function) {
                                                                            return C24247.$default$compose(this, function);
                                                                        }

                                                                        @Override // java.util.function.Function
                                                                        public final Object apply(Object obj) {
                                                                            C18959 c18959 = (C18959) obj;
                                                                            if (!(c18959 instanceof C6787) || !((C6787) c18959).mo18926().equals(c2551.mo8532())) {
                                                                                return null;
                                                                            }
                                                                            zArr[0] = true;
                                                                            if (c18959.m44039() != 0) {
                                                                                AbstractC16481 abstractC16481Mo44035 = c18959.mo44035(0);
                                                                                abstractC16481Mo44035.getClass();
                                                                                if (abstractC16481Mo44035.mo17865(EnumC1763.THIS)) {
                                                                                    return null;
                                                                                }
                                                                            }
                                                                            return Boolean.TRUE;
                                                                        }
                                                                    })) != null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z3 = false;
                                                break;
                                            }
                                            continue;
                                        }
                                    }
                                } else {
                                    z3 = zArr[z4 ? 1 : 0];
                                    break;
                                }
                            }
                            if (z3) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (zMo17867 || z) {
                            int i = 0;
                            ?? r2 = z4;
                            for (C2551 c2553 : c24927.getMethods()) {
                                if (c2553.m8524() || !c2553.mo8547().m26543()) {
                                    c11458 = c11459;
                                    z2 = false;
                                } else {
                                    ?? M8526 = c2553.m8526();
                                    if (M8526.isEmpty()) {
                                        c11458 = c11459;
                                        z2 = false;
                                    } else {
                                        EnumC1763 enumC1763 = EnumC1763.SKIP_FIRST_ARG;
                                        if (c2553.mo17865(enumC1763)) {
                                            c11458 = c11459;
                                        } else {
                                            C6041 c6041 = (C6041) M8526.get(r2);
                                            if (c6041.getType().equals(c24927M5671.m55571().getType())) {
                                                C21943 c21943 = (C21943) c2553.m8535().m49639().get(r2);
                                                ?? r15 = (ArrayList) c21943.mo1986();
                                                if (r15.isEmpty()) {
                                                    z2 = false;
                                                    c11458 = c11459;
                                                } else {
                                                    C18959 c18959 = (C18959) r15.get(r2);
                                                    if (c18959.getType() != EnumC24203.IPUT) {
                                                        z2 = false;
                                                        c11458 = c11459;
                                                    } else {
                                                        C3319 c3319 = (C3319) c18959;
                                                        C14022 c14022 = (C14022) c3319.m10937();
                                                        c11458 = c11459;
                                                        if (c14022.equals(c17467.mo13008()) && c3319.mo44035(0).equals(c6041)) {
                                                            c2553.mo17866(enumC1763);
                                                            C9804.m25537(c2553, c21943, c18959);
                                                            if (c6041.m17530().m41952() != 0) {
                                                                C3319 c33110 = new C3319(EnumC24203.IGET, c14022, 1);
                                                                c33110.mo44014(c18959.mo44035(1));
                                                                Iterator it6 = new ArrayList(c6041.m17530().m41946()).iterator();
                                                                while (it6.hasNext()) {
                                                                    ((AbstractC16481) it6.next()).m39113(c2553, (C18959) c33110, true);
                                                                }
                                                            }
                                                            z2 = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                z2 = false;
                                                c11458 = c11459;
                                            }
                                        }
                                        z2 = false;
                                    }
                                }
                                if (z2) {
                                    i++;
                                }
                                r2 = 0;
                                c11459 = c11458;
                            }
                            c11457 = c11459;
                            if (i != 0) {
                                if (z) {
                                    c17467.mo17864(new C13694(c24927M5671.m55571()));
                                }
                                c17467.mo17866(EnumC1763.DONT_GENERATE);
                            }
                        }
                        z4 = false;
                        c24928 = c24927;
                        c11459 = c11457;
                    }
                }
                c11457 = c11459;
                z4 = false;
                c24928 = c24927;
                c11459 = c11457;
            }
        }
        C4937.forEach(c24927.getMethods(), new C18192(0));
        C4937.forEach(c24927.getMethods(), new C0293(0));
        return false;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m43960(C24927 c24927) {
        return c24927.mo8547().m26528() && c24927.getFields().isEmpty() && c24927.getMethods().isEmpty() && c24927.m55534().isEmpty();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static void m43959(C2551 c2551) {
        C18959 c18959M52155;
        C21965 c21965Mo18926;
        C2551 c2551M5668;
        if (c2551.m8524() || c2551.mo17865(EnumC1763.DONT_GENERATE) || !c2551.mo8547().m26528()) {
            return;
        }
        C24927 c24927M8536 = c2551.m8536();
        if (c24927M8536.mo8527().m5681().m17703()) {
            ArrayList arrayListM52146 = C23231.m52146(c2551.m8508());
            if (arrayListM52146.size() == 1) {
                C18959 c18959M40461 = (C18959) arrayListM52146.get(0);
                if (c18959M40461.getType() == EnumC24203.RETURN) {
                    AbstractC16481 abstractC16481Mo44035 = c18959M40461.mo44035(0);
                    abstractC16481Mo44035.getClass();
                    if (abstractC16481Mo44035 instanceof C17227) {
                        c18959M40461 = ((C17227) abstractC16481Mo44035).m40461();
                    }
                }
                if (c18959M40461.getType() == EnumC24203.INVOKE) {
                    C21219 c21219 = (C21219) c18959M40461;
                    if (c21219.m48374() != EnumC0336.SUPER && (c2551M5668 = c2551.mo8527().m5668((c21965Mo18926 = c21219.mo18926()))) != null && !c2551M5668.mo8547().m26540() && c21965Mo18926.m49705() == c2551.mo8532().m49705() && c2551.m8536().equals(c2551M5668.m8536())) {
                        Iterator it = c18959M40461.m44026().iterator();
                        do {
                            if (!it.hasNext()) {
                                if (!c2551.getName().equals(c2551M5668.getName())) {
                                    break;
                                }
                                C10293 c10293Mo8547 = c2551.mo8547();
                                boolean zM26547 = c10293Mo8547.m26547();
                                C11457 c11457 = C11457.f36025;
                                if (zM26547) {
                                    if (c10293Mo8547.m26548() || c2551M5668.mo8547().m26532(c10293Mo8547)) {
                                        break;
                                        break;
                                    }
                                    AbstractC16481 abstractC16481Mo13131 = c21219.mo13131();
                                    List listM8526 = c2551.m8526();
                                    if (abstractC16481Mo13131 == null || !abstractC16481Mo13131.m39115(c2551.m8517()) || c21219.m44039() != listM8526.size() + 1) {
                                        break;
                                        break;
                                        break;
                                    }
                                    List listM49702 = c21219.mo18926().m49702();
                                    int i = 0;
                                    loop1: while (true) {
                                        if (i >= listM8526.size()) {
                                            c2551M5668.mo17864(new C23720(c2551));
                                            c2551M5668.m39412(c2551, c11457);
                                            c2551M5668.m31133("Method merged with bridge method: " + c2551.mo8532().m49701());
                                            c2551.mo17866(EnumC1763.DONT_GENERATE);
                                            return;
                                        }
                                        int i2 = i + 1;
                                        AbstractC16481 abstractC16481Mo44036 = c21219.mo44035(i2);
                                        while (true) {
                                            abstractC16481Mo44036.getClass();
                                            if (abstractC16481Mo44036 instanceof C17227) {
                                                C3319 c3319 = (C3319) ((C17227) abstractC16481Mo44036).m40461();
                                                if (!((AbstractC1566) listM49702.get(i)).equals(c3319.m10937())) {
                                                    break;
                                                } else {
                                                    abstractC16481Mo44036 = c3319.mo44035(0);
                                                }
                                            } else if (!abstractC16481Mo44036.m39115((C6041) listM8526.get(i))) {
                                                break;
                                            } else {
                                                i = i2;
                                            }
                                        }
                                    }
                                } else {
                                    if (c2551.m8514().isEmpty() || c10293Mo8547.m26542() || c10293Mo8547.m26541() || c2551.mo17862((InterfaceC2157) c11457) != null) {
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                    Iterator it2 = c2551.m8514().iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            c2551M5668.mo17864(new C23720(c2551));
                                            c2551M5668.m39412(c2551, c11457);
                                            c2551M5668.m31133("Method merged with bridge method: " + c2551.mo8532().m49701());
                                            c2551.mo17866(EnumC1763.DONT_GENERATE);
                                            return;
                                        }
                                    } while (C17446.m40944((C2551) it2.next(), c2551M5668));
                                }
                            }
                        } while (m43958((AbstractC16481) it.next()));
                    }
                }
            }
        }
        if (c2551.m8529()) {
            if ((c2551.mo17865(EnumC1763.METHOD_CANDIDATE_FOR_INLINE) || c2551.mo17865(EnumC1763.ANONYMOUS_CONSTRUCTOR)) && (c18959M52155 = C23231.m52155(c2551)) != null) {
                List<C6041> listM8527 = c2551.m8526();
                boolean z = false;
                for (C6041 c6041 : listM8527) {
                    AbstractC1566 type = c6041.getType();
                    if (type.mo5543()) {
                        C24927 c24927M5672 = c24927M8536.mo8527().m5672(type);
                        if (c24927M5672 == null) {
                            C1345 c1345M4955 = C1345.m4955(c24927M8536.mo8527(), type);
                            if (c1345M4955.m4973() != null && c24927M8536.m55568().startsWith(c1345M4955.m4973().m4957())) {
                                c6041.mo17866(EnumC1763.REMOVE);
                                z = true;
                            }
                        } else if (c24927M5672.mo17865(EnumC1763.DONT_GENERATE) || m43960(c24927M5672)) {
                            c6041.mo17866(EnumC1763.REMOVE);
                            z = true;
                        }
                    }
                }
                if (z && c18959M52155.getType() == EnumC24203.CONSTRUCTOR) {
                    C6787 c6787 = (C6787) c18959M52155;
                    if (!c6787.m18923() || listM8527.isEmpty()) {
                        return;
                    }
                    if (((C6041) listM8527.get(0)).getType().equals(c24927M8536.m55574().m55571().getType())) {
                        C21482.m48888(c2551, 0);
                    }
                    int size = listM8527.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        C17973 c17973M17530 = ((C6041) listM8527.get(i3)).m17530();
                        if (c17973M17530 != null && c17973M17530.m41952() == 0) {
                            C21482.m48888(c2551, i3);
                        }
                    }
                    C2551 c2551M5669 = c24927M8536.mo8527().m5668(c6787.mo18926());
                    if (c2551M5669 != null) {
                        c2551.mo17864(new C23720(c2551M5669));
                        c2551.mo17866(EnumC1763.DONT_GENERATE);
                        int i4 = C12152.f39062;
                        List listM8514 = c2551M5669.m8514();
                        List listM8515 = c2551.m8514();
                        if (listM8514.isEmpty()) {
                            listM8514 = listM8515;
                        } else if (!listM8515.isEmpty()) {
                            TreeSet treeSet = new TreeSet(listM8514);
                            treeSet.addAll(listM8515);
                            listM8514 = new ArrayList(treeSet);
                        }
                        listM8514.remove(c2551);
                        c2551M5669.m8520(listM8514);
                        c2551.m8520(Collections.EMPTY_LIST);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43958(AbstractC16481 abstractC16481) {
        abstractC16481.getClass();
        if (abstractC16481 instanceof C6041) {
            return true;
        }
        if (abstractC16481 instanceof C17227) {
            C18959 c18959M40461 = ((C17227) abstractC16481).m40461();
            if (c18959M40461.getType() == EnumC24203.CHECK_CAST) {
                return m43958(c18959M40461.mo44035(0));
            }
        }
        return false;
    }
}
