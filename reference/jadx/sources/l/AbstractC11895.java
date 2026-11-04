package l;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11895 implements InterfaceC8912 {
    public static final ConcurrentMapC17249 a = new ConcurrentMapC17249();
    public static final ConcurrentMapC17249 b = new ConcurrentMapC17249();

    public abstract /* synthetic */ InterfaceC17116 j();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return getId().compareTo(((InterfaceC8912) obj).getId());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static InterfaceC8912 k(InterfaceC8912 interfaceC8912, String str) {
        String strL;
        InterfaceC8912 interfaceC8913 = (InterfaceC8912) a.putIfAbsent(str, interfaceC8912);
        if (interfaceC8913 == null && (strL = interfaceC8912.l()) != null) {
            b.putIfAbsent(strL, interfaceC8912);
        }
        return interfaceC8913;
    }

    @Override // l.InterfaceC8912
    public InterfaceC17116 K(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.EPOCH_DAY;
        if (map.containsKey(enumC8692)) {
            return h(((Long) map.remove(enumC8692)).longValue());
        }
        z(map, enumC18520);
        InterfaceC17116 interfaceC17116P = P(map, enumC18520);
        if (interfaceC17116P != null) {
            return interfaceC17116P;
        }
        EnumC8692 enumC8693 = EnumC8692.YEAR;
        if (!map.containsKey(enumC8693)) {
            return null;
        }
        EnumC8692 enumC8694 = EnumC8692.MONTH_OF_YEAR;
        if (map.containsKey(enumC8694)) {
            if (map.containsKey(EnumC8692.DAY_OF_MONTH)) {
                return C(map, enumC18520);
            }
            EnumC8692 enumC8695 = EnumC8692.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC8695)) {
                EnumC8692 enumC8696 = EnumC8692.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC8696)) {
                    EnumC8692 enumC8697 = EnumC8692.DAY_OF_WEEK;
                    if (map.containsKey(enumC8697)) {
                        int iA = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
                        if (enumC18520 == EnumC18520.LENIENT) {
                            return p(I(iA, 1, 1), AbstractC1758.R(((Long) map.remove(enumC8694)).longValue(), 1L), AbstractC1758.R(((Long) map.remove(enumC8695)).longValue(), 1L), AbstractC1758.R(((Long) map.remove(enumC8697)).longValue(), 1L));
                        }
                        int iA2 = s(enumC8694).a(((Long) map.remove(enumC8694)).longValue(), enumC8694);
                        InterfaceC17116 interfaceC17116Y = I(iA, iA2, 1).c((s(enumC8695).a(((Long) map.remove(enumC8695)).longValue(), enumC8695) - 1) * 7, (InterfaceC2726) EnumC10183.DAYS).y(new C11610(EnumC13387.R(s(enumC8697).a(((Long) map.remove(enumC8697)).longValue(), enumC8697)).getValue(), 0));
                        if (enumC18520 != EnumC18520.STRICT || interfaceC17116Y.i(enumC8694) == iA2) {
                            return interfaceC17116Y;
                        }
                        throw new C21241("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
                    if (enumC18520 == EnumC18520.LENIENT) {
                        long jR = AbstractC1758.R(((Long) map.remove(enumC8694)).longValue(), 1L);
                        return I(iA3, 1, 1).c(jR, (InterfaceC2726) EnumC10183.MONTHS).c(AbstractC1758.R(((Long) map.remove(enumC8695)).longValue(), 1L), (InterfaceC2726) EnumC10183.WEEKS).c(AbstractC1758.R(((Long) map.remove(enumC8696)).longValue(), 1L), (InterfaceC2726) EnumC10183.DAYS);
                    }
                    int iA4 = s(enumC8694).a(((Long) map.remove(enumC8694)).longValue(), enumC8694);
                    InterfaceC17116 interfaceC17116C = I(iA3, iA4, 1).c((s(enumC8696).a(((Long) map.remove(enumC8696)).longValue(), enumC8696) - 1) + ((s(enumC8695).a(((Long) map.remove(enumC8695)).longValue(), enumC8695) - 1) * 7), (InterfaceC2726) EnumC10183.DAYS);
                    if (enumC18520 != EnumC18520.STRICT || interfaceC17116C.i(enumC8694) == iA4) {
                        return interfaceC17116C;
                    }
                    throw new C21241("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC8692 enumC8698 = EnumC8692.DAY_OF_YEAR;
        if (!map.containsKey(enumC8698)) {
            EnumC8692 enumC8699 = EnumC8692.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC8699)) {
                return null;
            }
            EnumC8692 enumC86910 = EnumC8692.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC86910)) {
                EnumC8692 enumC86911 = EnumC8692.DAY_OF_WEEK;
                if (!map.containsKey(enumC86911)) {
                    return null;
                }
                int iA5 = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
                if (enumC18520 == EnumC18520.LENIENT) {
                    return p(n(iA5, 1), 0L, AbstractC1758.R(((Long) map.remove(enumC8699)).longValue(), 1L), AbstractC1758.R(((Long) map.remove(enumC86911)).longValue(), 1L));
                }
                InterfaceC17116 interfaceC17116Y2 = n(iA5, 1).c((s(enumC8699).a(((Long) map.remove(enumC8699)).longValue(), enumC8699) - 1) * 7, (InterfaceC2726) EnumC10183.DAYS).y(new C11610(EnumC13387.R(s(enumC86911).a(((Long) map.remove(enumC86911)).longValue(), enumC86911)).getValue(), 0));
                if (enumC18520 != EnumC18520.STRICT || interfaceC17116Y2.i(enumC8693) == iA5) {
                    return interfaceC17116Y2;
                }
                throw new C21241("Strict mode rejected resolved date as it is in a different year");
            }
            int iA6 = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
            if (enumC18520 == EnumC18520.LENIENT) {
                return n(iA6, 1).c(AbstractC1758.R(((Long) map.remove(enumC8699)).longValue(), 1L), (InterfaceC2726) EnumC10183.WEEKS).c(AbstractC1758.R(((Long) map.remove(enumC86910)).longValue(), 1L), (InterfaceC2726) EnumC10183.DAYS);
            }
            InterfaceC17116 interfaceC17116C2 = n(iA6, 1).c((s(enumC86910).a(((Long) map.remove(enumC86910)).longValue(), enumC86910) - 1) + ((s(enumC8699).a(((Long) map.remove(enumC8699)).longValue(), enumC8699) - 1) * 7), (InterfaceC2726) EnumC10183.DAYS);
            if (enumC18520 != EnumC18520.STRICT || interfaceC17116C2.i(enumC8693) == iA6) {
                return interfaceC17116C2;
            }
            throw new C21241("Strict mode rejected resolved date as it is in a different year");
        }
        int iA7 = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
        if (enumC18520 == EnumC18520.LENIENT) {
            return n(iA7, 1).c(AbstractC1758.R(((Long) map.remove(enumC8698)).longValue(), 1L), (InterfaceC2726) EnumC10183.DAYS);
        }
        return n(iA7, s(enumC8698).a(((Long) map.remove(enumC8698)).longValue(), enumC8698));
    }

    @Override // l.InterfaceC8912
    public InterfaceC12641 F(InterfaceC9437 interfaceC9437) {
        try {
            return B(interfaceC9437).E(C10052.T(interfaceC9437));
        } catch (C21241 e) {
            throw new C21241("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC9437.getClass(), e);
        }
    }

    public void z(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC8692);
        if (l2 != null) {
            if (enumC18520 != EnumC18520.LENIENT) {
                enumC8692.P(l2.longValue());
            }
            InterfaceC17116 interfaceC17116B = j().b(1L, (InterfaceC16831) EnumC8692.DAY_OF_MONTH).b(l2.longValue(), (InterfaceC16831) enumC8692);
            EnumC8692 enumC8693 = EnumC8692.MONTH_OF_YEAR;
            i(map, enumC8693, interfaceC17116B.i(enumC8693));
            EnumC8692 enumC8694 = EnumC8692.YEAR;
            i(map, enumC8694, interfaceC17116B.i(enumC8694));
        }
    }

    public InterfaceC17116 P(Map map, EnumC18520 enumC18520) {
        int iY;
        EnumC8692 enumC8692 = EnumC8692.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC8692);
        if (l2 != null) {
            EnumC8692 enumC8693 = EnumC8692.ERA;
            Long l3 = (Long) map.remove(enumC8693);
            if (enumC18520 != EnumC18520.LENIENT) {
                iY = s(enumC8692).a(l2.longValue(), enumC8692);
            } else {
                iY = AbstractC1758.y(l2.longValue());
            }
            if (l3 != null) {
                i(map, EnumC8692.YEAR, w(v(s(enumC8693).a(l3.longValue(), enumC8693)), iY));
                return null;
            }
            EnumC8692 enumC8694 = EnumC8692.YEAR;
            if (map.containsKey(enumC8694)) {
                i(map, enumC8694, w(n(s(enumC8694).a(((Long) map.get(enumC8694)).longValue(), enumC8694), 1).G(), iY));
                return null;
            }
            if (enumC18520 == EnumC18520.STRICT) {
                map.put(enumC8692, l2);
                return null;
            }
            List listU = u();
            if (listU.isEmpty()) {
                i(map, enumC8694, iY);
                return null;
            }
            i(map, enumC8694, w((InterfaceC7421) listU.get(listU.size() - 1), iY));
            return null;
        }
        EnumC8692 enumC8695 = EnumC8692.ERA;
        if (!map.containsKey(enumC8695)) {
            return null;
        }
        s(enumC8695).b(((Long) map.get(enumC8695)).longValue(), enumC8695);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.ۚ᩸ۗ] */
    @Override // l.InterfaceC8912
    public InterfaceC5930 m(InterfaceC9437 interfaceC9437) {
        try {
            AbstractC22338 abstractC22338R = AbstractC22338.R(interfaceC9437);
            try {
                interfaceC9437 = L(C0358.S(interfaceC9437), abstractC22338R);
                return interfaceC9437;
            } catch (C21241 unused) {
                return C9657.R(abstractC22338R, null, C14878.R(this, F(interfaceC9437)));
            }
        } catch (C21241 e) {
            throw new C21241("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC9437.getClass(), e);
        }
    }

    public InterfaceC17116 C(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        int iA = s(enumC8692).a(((Long) map.remove(enumC8692)).longValue(), enumC8692);
        if (enumC18520 == EnumC18520.LENIENT) {
            long jR = AbstractC1758.R(((Long) map.remove(EnumC8692.MONTH_OF_YEAR)).longValue(), 1L);
            return I(iA, 1, 1).c(jR, (InterfaceC2726) EnumC10183.MONTHS).c(AbstractC1758.R(((Long) map.remove(EnumC8692.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC2726) EnumC10183.DAYS);
        }
        EnumC8692 enumC8693 = EnumC8692.MONTH_OF_YEAR;
        int iA2 = s(enumC8693).a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
        EnumC8692 enumC8694 = EnumC8692.DAY_OF_MONTH;
        int iA3 = s(enumC8694).a(((Long) map.remove(enumC8694)).longValue(), enumC8694);
        if (enumC18520 != EnumC18520.SMART) {
            return I(iA, iA2, iA3);
        }
        try {
            return I(iA, iA2, iA3);
        } catch (C21241 unused) {
            return I(iA, iA2, 1).y(new C14435(3));
        }
    }

    public static InterfaceC17116 p(InterfaceC17116 interfaceC17116, long j, long j2, long j3) {
        long j4;
        InterfaceC17116 interfaceC17116C = interfaceC17116.c(j, (InterfaceC2726) EnumC10183.MONTHS);
        EnumC10183 enumC10183 = EnumC10183.WEEKS;
        InterfaceC17116 interfaceC17116C2 = interfaceC17116C.c(j2, (InterfaceC2726) enumC10183);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC17116C2 = interfaceC17116C2.c(j5 / 7, (InterfaceC2726) enumC10183);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC17116C2 = interfaceC17116C2.c(AbstractC1758.R(j3, 7L) / 7, (InterfaceC2726) enumC10183);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC17116C2.y(new C11610(EnumC13387.R((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return interfaceC17116C2.y(new C11610(EnumC13387.R((int) j3).getValue(), 0));
    }

    public static void i(Map map, EnumC8692 enumC8692, long j) {
        Long l2 = (Long) map.get(enumC8692);
        if (l2 != null && l2.longValue() != j) {
            throw new C21241("Conflict found: " + enumC8692 + " " + l2 + " differs from " + enumC8692 + " " + j);
        }
        map.put(enumC8692, Long.valueOf(j));
    }

    @Override // l.InterfaceC8912
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC11895) && getId().compareTo(((AbstractC11895) obj).getId()) == 0;
    }

    @Override // l.InterfaceC8912
    public final int hashCode() {
        return getClass().hashCode() ^ getId().hashCode();
    }

    @Override // l.InterfaceC8912
    public final String toString() {
        return getId();
    }
}
