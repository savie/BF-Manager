package l;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: l.۠ܳ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R6IG */
/* JADX INFO: loaded from: classes3.dex */
public final class C8706 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f28369 = C16980.m40037(C8706.class);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Comparator f28370;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C1610 f28371;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Comparator f28372;

    public C8706(C1610 c1610) {
        this.f28371 = c1610;
        C2740 c2740 = new C2740(this);
        this.f28370 = c2740;
        this.f28372 = C8627.reversed(c2740);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7215 m23404(C24927 c24927, C24927 c24928) {
        AbstractC1566 type = c24927.getType();
        AbstractC1566 type2 = c24928.getType();
        if (type == type2 || C17359.equals(type, type2)) {
            return EnumC7215.EQUAL;
        }
        return m23399(type, type2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC7215 m23403(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        if (abstractC1566 == abstractC1567 || C17359.equals(abstractC1566, abstractC1567)) {
            return EnumC7215.EQUAL;
        }
        boolean zMo5564 = abstractC1566.mo5564();
        if (zMo5564 != abstractC1567.mo5564()) {
            if (zMo5564) {
                return m23401(abstractC1566, abstractC1567);
            }
            return m23401(abstractC1567, abstractC1566).m19810();
        }
        boolean zM5554 = abstractC1566.m5554();
        if (zM5554 != abstractC1567.m5554()) {
            if (zM5554) {
                return m23398(abstractC1567);
            }
            return m23398(abstractC1566).m19810();
        }
        if (zM5554) {
            return m23403(abstractC1566.mo5557(), abstractC1567.mo5557());
        }
        if (!zMo5564) {
            return Integer.compare(abstractC1566.mo5560().length, abstractC1567.mo5560().length) > 0 ? EnumC7215.WIDER : EnumC7215.NARROW;
        }
        boolean zM5556 = abstractC1566.m5556();
        boolean zM5557 = abstractC1567.m5556();
        boolean zMo5543 = abstractC1566.mo5543();
        boolean zMo5544 = abstractC1567.mo5543();
        if (zMo5543 && zMo5544) {
            return m23399(abstractC1566, abstractC1567);
        }
        if (zMo5543 && zM5557) {
            return EnumC7215.CONFLICT;
        }
        if (zM5556 && zMo5544) {
            return EnumC7215.CONFLICT;
        }
        if (zM5556 && zM5557) {
            EnumC12006 enumC12006Mo5558 = abstractC1566.mo5558();
            EnumC12006 enumC12006Mo5559 = abstractC1567.mo5558();
            EnumC12006 enumC12006 = EnumC12006.BOOLEAN;
            if (enumC12006Mo5558 == enumC12006 || enumC12006Mo5559 == enumC12006) {
                return enumC12006Mo5558 == enumC12006Mo5559 ? EnumC7215.EQUAL : EnumC7215.CONFLICT;
            }
            EnumC12006 enumC12007 = EnumC12006.VOID;
            if (enumC12006Mo5558 == enumC12007 || enumC12006Mo5559 == enumC12007) {
                return enumC12006Mo5558 == enumC12006Mo5559 ? EnumC7215.EQUAL : EnumC7215.CONFLICT;
            }
            if (enumC12006Mo5558 == EnumC12006.BYTE && enumC12006Mo5559 == EnumC12006.CHAR) {
                return EnumC7215.WIDER;
            }
            if (enumC12006Mo5558 == EnumC12006.SHORT && enumC12006Mo5559 == EnumC12006.CHAR) {
                return EnumC7215.WIDER;
            }
            byte bM23397 = m23397(enumC12006Mo5558);
            byte bM23398 = m23397(enumC12006Mo5559);
            if (bM23397 > bM23398) {
                return EnumC7215.WIDER;
            }
            if (bM23397 < bM23398) {
                return EnumC7215.NARROW;
            }
            return EnumC7215.EQUAL;
        }
        f28369.mo13710("Type compare function not complete, can't compare {} and {}", abstractC1566, abstractC1567);
        return EnumC7215.CONFLICT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7215 m23398(AbstractC1566 abstractC1566) {
        if (!abstractC1566.mo5564()) {
            if (abstractC1566.mo5566(EnumC12006.ARRAY)) {
                return EnumC7215.NARROW;
            }
            return EnumC7215.CONFLICT;
        }
        if (abstractC1566.mo5543()) {
            if (abstractC1566.equals(AbstractC1566.f5426)) {
                return EnumC7215.NARROW;
            }
            return EnumC7215.CONFLICT;
        }
        if (abstractC1566.m5556()) {
            return EnumC7215.CONFLICT;
        }
        throw new C8597("Unprocessed type: " + abstractC1566 + " in array compare");
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static EnumC7215 m23401(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        EnumC12006 enumC12006Mo5558;
        if (abstractC1567 == AbstractC1566.f5420) {
            return EnumC7215.NARROW;
        }
        if (abstractC1567 == AbstractC1566.f5410 && (abstractC1566.mo5543() || abstractC1566.m5554())) {
            return EnumC7215.NARROW;
        }
        if (abstractC1566.equals(AbstractC1566.f5426) && abstractC1567.m5554()) {
            return EnumC7215.WIDER;
        }
        if (abstractC1566.m5556()) {
            enumC12006Mo5558 = abstractC1566.mo5558();
        } else if (abstractC1566.m5554()) {
            enumC12006Mo5558 = EnumC12006.ARRAY;
        } else {
            enumC12006Mo5558 = EnumC12006.OBJECT;
        }
        for (EnumC12006 enumC12006 : abstractC1567.mo5560()) {
            if (enumC12006 == enumC12006Mo5558) {
                return EnumC7215.NARROW;
            }
        }
        return EnumC7215.CONFLICT;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private EnumC7215 m23399(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        boolean zEquals = abstractC1566.mo5570().equals(abstractC1567.mo5570());
        boolean zM5569 = abstractC1566.m5569();
        boolean zM55610 = abstractC1567.m5569();
        if (zM5569 && zM55610 && !zEquals) {
            return EnumC7215.CONFLICT;
        }
        boolean zMo5550 = abstractC1566.mo5550();
        boolean zMo5551 = abstractC1567.mo5550();
        if (zM5569 || zM55610) {
            AbstractC1566 abstractC1566Mo5563 = abstractC1566.mo5563();
            AbstractC1566 abstractC1566Mo5564 = abstractC1567.mo5563();
            if (abstractC1566Mo5563 != null || abstractC1566Mo5564 != null) {
                if (abstractC1566Mo5563 != null && zM55610 && abstractC1566.mo5542() == EnumC12752.UNBOUND) {
                    return EnumC7215.CONFLICT;
                }
                if (zM5569 && abstractC1566Mo5564 != null && abstractC1567.mo5542() == EnumC12752.UNBOUND) {
                    return EnumC7215.CONFLICT;
                }
            }
            if (zM5569) {
                return m23400(abstractC1566, abstractC1567);
            }
            return m23400(abstractC1567, abstractC1566).m19810();
        }
        if (zEquals) {
            if (zMo5550 != zMo5551) {
                return zMo5550 ? EnumC7215.NARROW_BY_GENERIC : EnumC7215.WIDER_BY_GENERIC;
            }
            if (abstractC1566.mo5542() == null || abstractC1567.mo5542() == null) {
                List listMo5541 = abstractC1566.mo5541();
                List listMo5542 = abstractC1567.mo5541();
                if (C4123.m13229((Collection) listMo5541) || C4123.m13229((Collection) listMo5542)) {
                    AbstractC1566 abstractC1566Mo5559 = abstractC1566.mo5559();
                    AbstractC1566 abstractC1566Mo55510 = abstractC1567.mo5559();
                    if (abstractC1566Mo5559 != null && abstractC1566Mo55510 != null) {
                        return m23403(abstractC1566Mo5559, abstractC1566Mo55510);
                    }
                } else {
                    int size = listMo5541.size();
                    if (size == listMo5542.size()) {
                        for (int i = 0; i < size; i++) {
                            EnumC7215 enumC7215M23403 = m23403((AbstractC1566) listMo5541.get(i), (AbstractC1566) listMo5542.get(i));
                            if (enumC7215M23403 != EnumC7215.EQUAL) {
                                return enumC7215M23403;
                            }
                        }
                    }
                }
            } else {
                EnumC12752 enumC12752Mo5542 = abstractC1566.mo5542();
                EnumC12752 enumC12752Mo5543 = abstractC1567.mo5542();
                EnumC12752 enumC12752 = EnumC12752.UNBOUND;
                if (enumC12752Mo5542 == enumC12752) {
                    return EnumC7215.WIDER;
                }
                if (enumC12752Mo5543 == enumC12752) {
                    return EnumC7215.NARROW;
                }
                return enumC12752Mo5542 == enumC12752Mo5543 ? m23403(abstractC1566.mo5563(), abstractC1567.mo5563()) : EnumC7215.CONFLICT;
            }
        }
        AbstractC1566 abstractC1568 = AbstractC1566.f5426;
        boolean zEquals2 = abstractC1566.equals(abstractC1568);
        if (zEquals2 || abstractC1567.equals(abstractC1568)) {
            return zEquals2 ? EnumC7215.WIDER : EnumC7215.NARROW;
        }
        C1610 c1610 = this.f28371;
        if (AbstractC1566.m5534(c1610, abstractC1566, abstractC1567)) {
            return EnumC7215.NARROW;
        }
        if (AbstractC1566.m5534(c1610, abstractC1567, abstractC1566)) {
            return EnumC7215.WIDER;
        }
        if (abstractC1566.mo5543() ? c1610.m5691().m49226(abstractC1566.mo5570()) : false) {
            if (abstractC1567.mo5543() ? c1610.m5691().m49226(abstractC1567.mo5570()) : false) {
                return EnumC7215.CONFLICT;
            }
        }
        return EnumC7215.UNKNOWN;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private EnumC7215 m23400(AbstractC1566 abstractC1566, AbstractC1566 abstractC1567) {
        if (!abstractC1567.m5569()) {
            if (abstractC1567.m5540()) {
                return EnumC7215.CONFLICT_BY_GENERIC;
            }
            boolean zEquals = abstractC1567.equals(AbstractC1566.f5426);
            List listMo5549 = abstractC1566.mo5549();
            if (listMo5549.isEmpty()) {
                return zEquals ? EnumC7215.NARROW : EnumC7215.CONFLICT;
            }
            if (listMo5549.contains(abstractC1567) || zEquals) {
                return EnumC7215.NARROW;
            }
            Iterator it = listMo5549.iterator();
            while (it.hasNext()) {
                EnumC7215 enumC7215M23399 = m23399((AbstractC1566) it.next(), abstractC1567);
                if (!enumC7215M23399.m19812()) {
                    return enumC7215M23399;
                }
            }
            return EnumC7215.NARROW;
        }
        if (abstractC1566.mo5570().equals(abstractC1567.mo5570())) {
            List listMo55410 = abstractC1566.mo5549();
            AbstractC1566 abstractC1568 = AbstractC1566.f5426;
            if (listMo55410.contains(abstractC1568)) {
                if (listMo55410.size() == 1) {
                    listMo55410 = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList = new ArrayList(listMo55410);
                    arrayList.remove(abstractC1568);
                    listMo55410 = arrayList;
                }
            }
            List listMo55411 = abstractC1567.mo5549();
            if (listMo55411.contains(abstractC1568)) {
                if (listMo55411.size() == 1) {
                    listMo55411 = Collections.EMPTY_LIST;
                } else {
                    ArrayList arrayList2 = new ArrayList(listMo55411);
                    arrayList2.remove(abstractC1568);
                    listMo55411 = arrayList2;
                }
            }
            if (listMo55410.equals(listMo55411)) {
                return EnumC7215.EQUAL;
            }
            int size = listMo55410.size();
            int size2 = listMo55411.size();
            if (size == 0) {
                return EnumC7215.WIDER;
            }
            if (size2 == 0) {
                return EnumC7215.NARROW;
            }
            if (size == 1 && size2 == 1) {
                return m23403((AbstractC1566) listMo55410.get(0), (AbstractC1566) listMo55411.get(0));
            }
        }
        return EnumC7215.CONFLICT;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte m23397(EnumC12006 enumC12006) {
        switch (C9451.f30646[enumC12006.ordinal()]) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
            case 9:
            case 10:
            case 11:
                throw new C8597("Type " + enumC12006 + " should not be here");
            default:
                throw new C8597("Unhandled type: " + enumC12006);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Comparator m23402() {
        return this.f28370;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Comparator m23405() {
        return this.f28372;
    }
}
