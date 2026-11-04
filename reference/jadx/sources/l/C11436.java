package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۧۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: I6DT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11436 extends AbstractC16700 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21965 f35942;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public C21965 f35943;

    @Override // l.AbstractC16700, l.InterfaceC13673
    public final String getName() {
        return "EnumVisitor";
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final void mo8439(C1610 c1610) {
        AbstractC1566 abstractC1566 = AbstractC1566.f5414;
        this.f35943 = C21965.m49691(c1610, C1345.m4955(c1610, abstractC1566), "valueOf", Arrays.asList(AbstractC1566.f5427, AbstractC1566.f5417), abstractC1566);
        AbstractC1566 abstractC1567 = AbstractC1566.f5426;
        this.f35942 = C21965.m49691(c1610, C1345.m4955(c1610, abstractC1567), "clone", Collections.EMPTY_LIST, abstractC1567);
    }

    @Override // l.AbstractC16700, l.InterfaceC13673
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo22644(C24927 c24927) {
        boolean zM28791;
        if (!c24927.m55554()) {
            return true;
        }
        try {
            zM28791 = m28791(c24927);
        } catch (Exception e) {
            c24927.m31134("Enum visitor error", e);
            zM28791 = false;
        }
        if (zM28791) {
            return true;
        }
        C10293 c10293Mo8547 = c24927.mo8547();
        if (!c10293Mo8547.m26539()) {
            return true;
        }
        c24927.mo8501(c10293Mo8547.m26546(16384));
        c24927.m31138("Failed to restore enum class, 'enum' modifier removed");
        return true;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private boolean m28791(C24927 c24927) {
        C22485 c22485;
        C18959 c18959M17529;
        C3319 c3319;
        C21219 c21219;
        C6787 c6787;
        C24927 c24927M5671;
        String str = "values()" + C15186.m36535(AbstractC1566.m5528(c24927.m55571().getType()));
        Iterator it = c24927.getMethods().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                AbstractC1566 abstractC1566M55553 = c24927.m55553();
                if (abstractC1566M55553 != null && abstractC1566M55553.mo5570().equals(AbstractC1566.f5414.mo5570())) {
                    c24927.mo17866(EnumC1763.REMOVE_SUPER_CLASS);
                }
                C2551 c2551M55570 = c24927.m55570("<clinit>()V");
                if (c2551M55570 == null) {
                    c24927.m31138("Enum class init method not found");
                    return false;
                }
                C12050 c12050M8515 = c2551M55570.m8515();
                if (c12050M8515 == null || c2551M55570.m8508().isEmpty()) {
                    return false;
                }
                ArrayList arrayList = new ArrayList();
                for (InterfaceC6281 interfaceC6281 : (ArrayList) c12050M8515.mo19035()) {
                    if (!(interfaceC6281 instanceof C21943)) {
                        break;
                    }
                    arrayList.add((C21943) interfaceC6281);
                }
                if (arrayList.isEmpty()) {
                    c24927.m31138("Unexpected branching in enum static init block");
                    return false;
                }
                final C1742 c1742 = new C1742(c24927, c2551M55570, arrayList);
                C24927 c24928 = c1742.f5943;
                int i2 = 1;
                List list = (List) C1170.stream(c24928.getFields()).filter(new C22625(0)).filter(new C4593(1)).filter(new C19641(0, c24928.m55571().getType())).collect(C2025.toList());
                if (list.isEmpty()) {
                    c24928.m31138("$VALUES field not found");
                    return false;
                }
                if (list.size() > 1) {
                    C1170.removeIf(list, new C15165(0));
                }
                if (list.size() > 1) {
                    C15867 c15867FindAny = C1170.stream(list).filter(new C12928(0)).findAny();
                    if (c15867FindAny.isPresent()) {
                        list.clear();
                        list.add((C17467) c15867FindAny.get());
                    }
                }
                if (list.size() != 1) {
                    c24928.m31138("Found several \"values\" enum fields: " + list);
                    return false;
                }
                C17467 c17467 = (C17467) list.get(0);
                c1742.f5942 = c17467;
                C14022 c14022Mo13008 = c17467.mo13008();
                Iterator it2 = c1742.f5940.iterator();
                loop2: while (true) {
                    if (!it2.hasNext()) {
                        c22485 = null;
                        break;
                    }
                    C21943 c21943 = (C21943) it2.next();
                    for (C18959 c18959 : (ArrayList) c21943.mo1986()) {
                        if (c18959.getType() == EnumC24203.SPUT) {
                            C3319 c33110 = (C3319) c18959;
                            if (((C14022) c33110.m10937()).equals(c14022Mo13008)) {
                                c22485 = new C22485(c21943, c33110);
                                break loop2;
                            }
                        }
                    }
                }
                if (c22485 == null) {
                    return false;
                }
                C18959 c18959M50720 = c22485.m50720();
                c1742.f5941 = c18959M50720;
                AbstractC16481 abstractC16481Mo44035 = c18959M50720.mo44035(0);
                abstractC16481Mo44035.getClass();
                List listM28786 = abstractC16481Mo44035 instanceof C17227 ? m28786(c1742, ((C17227) abstractC16481Mo44035).m40461()) : (!(abstractC16481Mo44035 instanceof C6041) || (c18959M17529 = ((C6041) abstractC16481Mo44035).m17529()) == null) ? null : m28786(c1742, c18959M17529);
                if (listM28786 == null) {
                    c24927.m31138("Unknown enum class pattern. Please report as an issue!");
                    return false;
                }
                C18959 c189510 = c1742.f5941;
                ArrayList arrayList2 = c1742.f5944;
                arrayList2.add(c189510);
                C1017 c1017 = new C1017(listM28786);
                c1017.m3914(c2551M55570);
                c24927.mo17864(c1017);
                for (C9965 c9965 : c1017.m3913()) {
                    c9965.m25797().mo17866(EnumC1763.DONT_GENERATE);
                    C6787 c6787M25798 = c9965.m25798();
                    C1345 c1345M18927 = c6787M25798.m18927();
                    if (!c1345M18927.equals(c24928.m55571()) && (c24927M5671 = c24928.mo8527().m5671(c1345M18927)) != null) {
                        for (C2551 c2551 : c24927M5671.getMethods()) {
                            if (c2551.mo8547().m26543()) {
                                c2551.mo17866(EnumC1763.DONT_GENERATE);
                            }
                        }
                        c9965.m25796(c24927M5671);
                        if (!c24927M5671.m55574().equals(c24928)) {
                            c24928.m55577(c24927M5671);
                            c24927M5671.mo17866(EnumC1763.DONT_GENERATE);
                        }
                    }
                    C2551 c2551M5668 = c24928.mo8527().m5668(c6787M25798.mo18926());
                    if (c2551M5668 != null) {
                        C21482.m48888(c2551M5668, 0);
                        if (c2551M5668.mo8532().m49705() > 1) {
                            C21482.m48888(c2551M5668, 1);
                        }
                    }
                    C6041 c6041M44027 = c6787M25798.m44027();
                    if (c6041M44027 == null || c6041M44027.m17530().m41946().size() <= 2) {
                        arrayList2.add(c6787M25798);
                    } else if (C1170.stream(c6041M44027.m17530().m41946()).anyMatch(new Predicate() { // from class: l.۬۠ۗ
                        @Override // java.util.function.Predicate
                        public /* synthetic */ Predicate and(Predicate predicate) {
                            return C19025.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* JADX INFO: renamed from: negate */
                        public /* synthetic */ Predicate mo7134negate() {
                            return C19025.$default$negate(this);
                        }

                        public /* synthetic */ Predicate or(Predicate predicate) {
                            return C19025.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return !c1742.f5944.contains(((C6041) obj).m39118());
                        }
                    })) {
                        C3319 c33111 = new C3319(EnumC24203.SGET, c9965.m25797().mo13008(), 0);
                        c33111.m44031(c6041M44027.mo17528());
                        Iterator it3 = c2551M55570.m8508().iterator();
                        while (it3.hasNext() && !C23231.m52179(c2551M55570, (C21943) it3.next(), c6787M25798, c33111)) {
                        }
                    }
                }
                C17467 c17468 = c1742.f5942;
                EnumC1763 enumC1763 = EnumC1763.DONT_GENERATE;
                c17468.mo17866(enumC1763);
                C9804.m25532(c2551M55570, arrayList2);
                if (c2551M55570.m8507() == 0) {
                    c2551M55570.mo17866(enumC1763);
                } else if (!arrayList2.isEmpty()) {
                    C7347.m20164(c2551M55570);
                }
                C17467 c17469 = c1742.f5942;
                AbstractC1566 type = c24927.m55571().getType();
                String str2 = "values()" + C15186.m36535(AbstractC1566.m5528(type));
                C2551 c2552 = null;
                for (C2551 c2553 : c24927.getMethods()) {
                    C21965 c21965Mo8532 = c2553.mo8532();
                    if (!c21965Mo8532.m49706() && !c2553.m8524()) {
                        String strM49701 = c21965Mo8532.m49701();
                        if (c21965Mo8532.m49703()) {
                            C21482.m48888(c2553, i);
                            if (c2553.mo8532().m49705() > i2) {
                                C21482.m48888(c2553, i2);
                            }
                            Iterator it4 = c2553.m8508().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    c6787 = null;
                                    break;
                                }
                                for (C18959 c189511 : (ArrayList) ((C21943) it4.next()).mo1986()) {
                                    if (c189511.getType() == EnumC24203.CONSTRUCTOR) {
                                        c6787 = (C6787) c189511;
                                        if (c6787.m18922() && c6787.m44039() != 0 && c6787.mo18926().m49707().equals("java.lang.Enum.<init>(Ljava/lang/String;I)V")) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (c6787 != null) {
                                c6787.mo17866(EnumC1763.DONT_GENERATE);
                                C9804.m25534(c2553, c6787);
                            }
                            if ((strM49701.equals("<init>(Ljava/lang/String;I)V") || strM49701.equals("<init>(Ljava/lang/String;)V")) && c2553.m8507() == 0) {
                                c2553.mo17866(EnumC1763.DONT_GENERATE);
                            }
                        } else if (c21965Mo8532.m49701().equals(str2)) {
                            if (m28789(c2553, type)) {
                                c2553.mo17866(EnumC1763.DONT_GENERATE);
                                c2552 = c2553;
                            }
                        } else if (c21965Mo8532.getName().equals("valueOf")) {
                            C4725 c4725 = new C4725(0);
                            int i3 = C8314.f27285;
                            C18959 c18959M22401 = (c2553.m8524() || c2553.m8489().size() != 1) ? null : C8314.m22401(c2553, EnumC24203.RETURN, c4725);
                            if (c18959M22401 != null && (c3319 = (C3319) C8314.m22403(C8314.m22402(C8314.m22399(c18959M22401)), EnumC24203.CHECK_CAST)) != null && C17359.equals(c3319.m10937(), type) && (c21219 = (C21219) C8314.m22403(C8314.m22402(C8314.m22399((C18959) c3319)), EnumC24203.INVOKE)) != null && c21219.mo18926().equals(this.f35943)) {
                                c2553.mo17866(EnumC1763.DONT_GENERATE);
                            }
                        }
                    }
                    i = 0;
                    i2 = 1;
                }
                C14022 c14022Mo13009 = c17469.mo13008();
                for (C2551 c2554 : c24927.getMethods()) {
                    C21965 c21965Mo8533 = c2554.mo8532();
                    if (!c21965Mo8533.m49703() && !c21965Mo8533.m49706() && !c2554.m8524() && c2554 != c2552) {
                        C21879 c21879 = new C21879(c14022Mo13009);
                        if (C8314.m22401(c2554, EnumC24203.SGET, c21879) != null) {
                            C10690 c10690 = new C10690(this, c21879, c2552, c2554, type, c14022Mo13009);
                            for (C21943 c21944 : c2554.m8508()) {
                                ArrayList arrayList3 = (ArrayList) c21944.mo1986();
                                int size = arrayList3.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    C18959 c189512 = (C18959) arrayList3.get(i4);
                                    C8314.m22405(c2554, c189512, c10690);
                                    C18959 c189513 = (C18959) c10690.apply(c189512);
                                    if (c189513 != null) {
                                        C23231.m52172(c2554, c21944, i4, c189513);
                                    }
                                }
                            }
                        }
                    }
                }
                c24927.mo8501(c24927.mo8547().m26546(16).m26546(1024).m26546(8));
                for (C2551 c2555 : c24927.getMethods()) {
                    if (c2555.mo8532().m49703()) {
                        c2555.mo8501(c2555.mo8547().m26546(7));
                    }
                }
                c24927.mo17866(EnumC1763.CONVERTED_ENUM);
                return true;
            }
            C2551 c2556 = (C2551) it.next();
            if (c2556.mo8532().m49701().equals(str) && !m28789(c2556, c24927.m55571().getType())) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0167  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static List m28786(C1742 c1742, C18959 c18959) {
        C18959 c18959M39118;
        C17467 c17467M28788;
        C9965 c9965M28787;
        C18959 c18959M22402;
        ArrayList arrayList = c1742.f5944;
        C24927 c24927 = c1742.f5943;
        int i = C5471.f19068[c18959.getType().ordinal()];
        if (i == 1) {
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC16481 abstractC16481 : c18959.m44026()) {
                abstractC16481.getClass();
                if (abstractC16481 instanceof C17227) {
                    C18959 c18959M40461 = ((C17227) abstractC16481).m40461();
                    if (c18959M40461.getType() == EnumC24203.SGET) {
                        c9965M28787 = m28790(c1742, c18959M40461);
                    } else {
                        C6787 c6787 = c18959M40461.getType() == EnumC24203.CONSTRUCTOR ? (C6787) c18959M40461 : null;
                        if (c6787 != null) {
                            C17467 c17467M28789 = m28788(c24927, "EF" + c6787.getOffset());
                            c24927.m55544(c17467M28789);
                            c9965M28787 = m28787(c1742, c17467M28789, c6787);
                        } else {
                            c9965M28787 = null;
                        }
                    }
                } else if (abstractC16481 instanceof C6041) {
                    C6041 c6041 = (C6041) abstractC16481;
                    C18959 c18959M17529 = c6041.m17529();
                    if (c18959M17529 == null || c18959M17529.getType() != EnumC24203.SGET) {
                        C17973 c17973M17530 = c6041.m17530();
                        if (c17973M17530.m41952() == 0 || (c18959M39118 = c17973M17530.m41930().m39118()) == null || c18959M39118.getType() != EnumC24203.CONSTRUCTOR) {
                            c9965M28787 = null;
                        } else {
                            C18959 c18959M39119 = ((C6041) c17973M17530.m41946().get(0)).m39118();
                            if (c18959M39119 == null || c18959M39119.getType() != EnumC24203.SPUT || (c17467M28788 = c24927.m55538((C14022) ((C3319) c18959M39119).m10937())) == null) {
                                c17467M28788 = null;
                            } else {
                                arrayList.add(c18959M39119);
                            }
                            if (c17467M28788 == null) {
                                c17467M28788 = m28788(c24927, "EF" + c6041.m17532());
                                c24927.m55544(c17467M28788);
                            }
                            c9965M28787 = m28787(c1742, c17467M28788, (C6787) c18959M39118);
                        }
                    } else {
                        c9965M28787 = m28790(c1742, c18959M17529);
                    }
                } else {
                    c9965M28787 = null;
                }
                if (c9965M28787 != null) {
                    arrayList2.add(c9965M28787);
                }
            }
            arrayList.add(c18959);
            return arrayList2;
        }
        if (i == 2) {
            C2551 c2551M5668 = c24927.mo8527().m5668(((C21219) c18959).mo18926());
            if (c2551M5668 != null && !c2551M5668.m8534() && (c18959M22402 = C8314.m22402(C8314.m22399(C23231.m52200((InterfaceC23435) C4123.m13219(c2551M5668.m8489()))))) != null) {
                List listM28786 = m28786(c1742, c18959M22402);
                if (listM28786 != null && C6823.m19004(c2551M5668.m8514(), (Object) c1742.f5939) && c2551M5668.getName().equals("values")) {
                    c2551M5668.mo17866(EnumC1763.DONT_GENERATE);
                }
                return listM28786;
            }
        } else if (i == 3 && c18959.mo44035(0).mo39117()) {
            return Collections.EMPTY_LIST;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9965 m28790(C1742 c1742, C18959 c18959) {
        C6787 c6787;
        C18959 c18959M17529;
        C24927 c24927 = c1742.f5943;
        if (c18959.getType() == EnumC24203.SGET) {
            C14022 c14022 = (C14022) ((C3319) c18959).m10937();
            ArrayList arrayList = c1742.f5944;
            C17467 c17467M55538 = c24927.m55538(c14022);
            if (c17467M55538 != null) {
                Iterator it = c1742.f5940.iterator();
                loop0: while (true) {
                    if (!it.hasNext()) {
                        c18959 = null;
                        break;
                    }
                    for (C18959 c189510 : (ArrayList) ((C21943) it.next()).mo1986()) {
                        if (c189510 != null && c189510.getType() == EnumC24203.SPUT && C17359.equals(c24927.m55538((C14022) ((C3319) c189510).m10937()), c17467M55538)) {
                            break loop0;
                        }
                    }
                }
                if (c189510 != null) {
                    if (c189510.m44039() != 1) {
                        c6787 = null;
                    } else {
                        AbstractC16481 abstractC16481Mo44035 = c189510.mo44035(0);
                        abstractC16481Mo44035.getClass();
                        if (!(abstractC16481Mo44035 instanceof C17227) ? !((abstractC16481Mo44035 instanceof C6041) && (c18959M17529 = ((C6041) abstractC16481Mo44035).m17529()) != null && c18959M17529.getType() == EnumC24203.CONSTRUCTOR) : (c18959M17529 = ((C17227) abstractC16481Mo44035).m40461()) == null || c18959M17529.getType() != EnumC24203.CONSTRUCTOR) {
                            c6787 = null;
                        } else {
                            c6787 = (C6787) c18959M17529;
                        }
                    }
                    if (c6787 != null) {
                        C6041 c6041M44027 = c18959.m44027();
                        if (c6041M44027 == null || c6041M44027.m17530().m41952() == 1) {
                            arrayList.add(c18959);
                        }
                        arrayList.add(c189510);
                        return m28787(c1742, c17467M55538, c6787);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C17467 m28788(C24927 c24927, String str) {
        C17467 c17467 = new C17467(c24927, C14022.m34144(c24927.mo8527(), c24927.m55571(), str, c24927.getType()), 0);
        c17467.mo17866(EnumC1763.SYNTHETIC);
        c17467.m31137("Fake field, exist only in values array");
        return c17467;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9965 m28787(C1742 c1742, C17467 c17467, C6787 c6787) {
        C6041 c6041;
        C14022 c14022;
        C24927 c24927 = c1742.f5943;
        ArrayList arrayList = c1742.f5944;
        C24927 c24927M5671 = c24927.mo8527().m5671(c6787.m18927());
        C6787 c6788 = null;
        if (c24927M5671 == null || ((!c24927M5671.equals(c24927) && !c24927M5671.mo17867(C11457.f36004)) || c24927.mo8527().m5668(c6787.mo18926()) == null)) {
            return null;
        }
        if (c6787.m44039() != 0) {
            ArrayList arrayList2 = new ArrayList();
            c6787.mo14760((Collection) arrayList2);
            if (!arrayList2.isEmpty()) {
                C6787 c6789 = (C6787) c6787.mo4072();
                ArrayList arrayList3 = new ArrayList();
                c6789.mo14760((Collection) arrayList3);
                Iterator it = arrayList3.iterator();
                do {
                    if (!it.hasNext()) {
                        c6788 = c6789;
                        break;
                    }
                    c6041 = (C6041) it.next();
                    C17973 c17973M17530 = c6041.m17530();
                    C18959 c18959M22403 = C8314.m22403(c17973M17530.m41951(), EnumC24203.CONSTRUCTOR);
                    if (c18959M22403 != null && ((C6787) c18959M22403).m18927().equals(c24927.m55571())) {
                        Iterator it2 = c17973M17530.m41946().iterator();
                        c14022 = null;
                        while (true) {
                            if (!it2.hasNext()) {
                                if (c14022 == null) {
                                    break;
                                }
                                arrayList.add(c18959M22403);
                                break;
                            }
                            C18959 c18959M39118 = ((C6041) it2.next()).m39118();
                            if (c18959M39118 != null) {
                                int i = C5471.f19068[c18959M39118.getType().ordinal()];
                                if (i == 1) {
                                    AbstractC16481 abstractC16481Mo44035 = c1742.f5941.mo44035(0);
                                    abstractC16481Mo44035.getClass();
                                    C18959 c18959M40461 = abstractC16481Mo44035 instanceof C17227 ? ((C17227) abstractC16481Mo44035).m40461() : null;
                                    if (c18959M40461 != null) {
                                        if (c18959M40461 != c18959M39118) {
                                        }
                                    } else if (!(abstractC16481Mo44035 instanceof C6041) || ((C6041) abstractC16481Mo44035).m17529() != c18959M39118) {
                                    }
                                } else if (i == 4) {
                                    c14022 = (C14022) ((C3319) c18959M39118).m10937();
                                    if (!c14022.m34148().equals(c24927.m55571()) || !c14022.m34149().equals(c24927.getType())) {
                                    }
                                } else if (i == 5 && ((C6787) c18959M39118).m18927().equals(c24927.m55571())) {
                                }
                            }
                            c14022 = null;
                            break;
                        }
                    }
                    c14022 = null;
                    break;
                    if (c14022 == null) {
                        break;
                    }
                } while (c6789.mo14762(c6041, AbstractC16481.m39112(new C3319(EnumC24203.SGET, c14022, 0))));
                if (c6788 == null) {
                    throw new C8597("Init of enum field '" + c17467.getName() + "' uses external variables");
                }
                arrayList.add(c6787);
                c6787 = c6788;
            }
        }
        return new C9965(c17467, c6787);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private boolean m28789(C2551 c2551, AbstractC1566 abstractC1566) {
        C18959 c18959M52155;
        C3319 c3319;
        C21219 c21219;
        AbstractC1566 abstractC1566Mo8519 = c2551.mo8519();
        return abstractC1566Mo8519.m5554() && abstractC1566Mo8519.mo5557().equals(abstractC1566) && (c18959M52155 = C23231.m52155(c2551)) != null && c18959M52155.getType() == EnumC24203.RETURN && c18959M52155.m44039() == 1 && (c3319 = (C3319) C8314.m22403(C8314.m22402(C8314.m22399(c18959M52155)), EnumC24203.CHECK_CAST)) != null && C17359.equals(c3319.m10937(), AbstractC1566.m5528(abstractC1566)) && (c21219 = (C21219) C8314.m22403(C8314.m22402(C8314.m22399((C18959) c3319)), EnumC24203.INVOKE)) != null && c21219.mo18926().equals(this.f35942);
    }
}
