package l;

import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16874 implements InterfaceC21233 {
    public static final ConcurrentMapC13783 a = new ConcurrentMapC13783();
    public static final ConcurrentMapC13783 b = new ConcurrentMapC13783();

    public abstract /* synthetic */ InterfaceC17579 m();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return k().compareTo(((InterfaceC21233) obj).k());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static InterfaceC21233 n(InterfaceC21233 interfaceC21233, String str) {
        String strO;
        InterfaceC21233 interfaceC21234 = (InterfaceC21233) a.putIfAbsent(str, interfaceC21233);
        if (interfaceC21234 == null && (strO = interfaceC21233.o()) != null) {
            b.putIfAbsent(strO, interfaceC21233);
        }
        return interfaceC21234;
    }

    @Override // l.InterfaceC21233
    public InterfaceC17579 O(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.EPOCH_DAY;
        if (map.containsKey(enumC18762)) {
            return j(((Long) map.remove(enumC18762)).longValue());
        }
        C(map, enumC5481);
        InterfaceC17579 interfaceC17579T = T(map, enumC5481);
        if (interfaceC17579T != null) {
            return interfaceC17579T;
        }
        EnumC18762 enumC18763 = EnumC18762.YEAR;
        if (!map.containsKey(enumC18763)) {
            return null;
        }
        EnumC18762 enumC18764 = EnumC18762.MONTH_OF_YEAR;
        if (map.containsKey(enumC18764)) {
            if (map.containsKey(EnumC18762.DAY_OF_MONTH)) {
                return G(map, enumC5481);
            }
            EnumC18762 enumC18765 = EnumC18762.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(enumC18765)) {
                EnumC18762 enumC18766 = EnumC18762.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (!map.containsKey(enumC18766)) {
                    EnumC18762 enumC18767 = EnumC18762.DAY_OF_WEEK;
                    if (map.containsKey(enumC18767)) {
                        int iA = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
                        if (enumC5481 == EnumC5481.LENIENT) {
                            return s(M(iA, 1, 1), AbstractC1726.R(((Long) map.remove(enumC18764)).longValue(), 1L), AbstractC1726.R(((Long) map.remove(enumC18765)).longValue(), 1L), AbstractC1726.R(((Long) map.remove(enumC18767)).longValue(), 1L));
                        }
                        int iA2 = v(enumC18764).a(((Long) map.remove(enumC18764)).longValue(), enumC18764);
                        InterfaceC17579 interfaceC17579M = M(iA, iA2, 1).d((v(enumC18765).a(((Long) map.remove(enumC18765)).longValue(), enumC18765) - 1) * 7, (InterfaceC18056) EnumC22996.DAYS).m(new C17351(EnumC16169.V(v(enumC18767).a(((Long) map.remove(enumC18767)).longValue(), enumC18767)).getValue(), 0));
                        if (enumC5481 != EnumC5481.STRICT || interfaceC17579M.l(enumC18764) == iA2) {
                            return interfaceC17579M;
                        }
                        throw new C15464("Strict mode rejected resolved date as it is in a different month");
                    }
                } else {
                    int iA3 = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
                    if (enumC5481 == EnumC5481.LENIENT) {
                        long jR = AbstractC1726.R(((Long) map.remove(enumC18764)).longValue(), 1L);
                        return M(iA3, 1, 1).d(jR, (InterfaceC18056) EnumC22996.MONTHS).d(AbstractC1726.R(((Long) map.remove(enumC18765)).longValue(), 1L), (InterfaceC18056) EnumC22996.WEEKS).d(AbstractC1726.R(((Long) map.remove(enumC18766)).longValue(), 1L), (InterfaceC18056) EnumC22996.DAYS);
                    }
                    int iA4 = v(enumC18764).a(((Long) map.remove(enumC18764)).longValue(), enumC18764);
                    InterfaceC17579 interfaceC17579D = M(iA3, iA4, 1).d((v(enumC18766).a(((Long) map.remove(enumC18766)).longValue(), enumC18766) - 1) + ((v(enumC18765).a(((Long) map.remove(enumC18765)).longValue(), enumC18765) - 1) * 7), (InterfaceC18056) EnumC22996.DAYS);
                    if (enumC5481 != EnumC5481.STRICT || interfaceC17579D.l(enumC18764) == iA4) {
                        return interfaceC17579D;
                    }
                    throw new C15464("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        EnumC18762 enumC18768 = EnumC18762.DAY_OF_YEAR;
        if (!map.containsKey(enumC18768)) {
            EnumC18762 enumC18769 = EnumC18762.ALIGNED_WEEK_OF_YEAR;
            if (!map.containsKey(enumC18769)) {
                return null;
            }
            EnumC18762 enumC187610 = EnumC18762.ALIGNED_DAY_OF_WEEK_IN_YEAR;
            if (!map.containsKey(enumC187610)) {
                EnumC18762 enumC187611 = EnumC18762.DAY_OF_WEEK;
                if (!map.containsKey(enumC187611)) {
                    return null;
                }
                int iA5 = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
                if (enumC5481 == EnumC5481.LENIENT) {
                    return s(q(iA5, 1), 0L, AbstractC1726.R(((Long) map.remove(enumC18769)).longValue(), 1L), AbstractC1726.R(((Long) map.remove(enumC187611)).longValue(), 1L));
                }
                InterfaceC17579 interfaceC17579M2 = q(iA5, 1).d((v(enumC18769).a(((Long) map.remove(enumC18769)).longValue(), enumC18769) - 1) * 7, (InterfaceC18056) EnumC22996.DAYS).m(new C17351(EnumC16169.V(v(enumC187611).a(((Long) map.remove(enumC187611)).longValue(), enumC187611)).getValue(), 0));
                if (enumC5481 != EnumC5481.STRICT || interfaceC17579M2.l(enumC18763) == iA5) {
                    return interfaceC17579M2;
                }
                throw new C15464("Strict mode rejected resolved date as it is in a different year");
            }
            int iA6 = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
            if (enumC5481 == EnumC5481.LENIENT) {
                return q(iA6, 1).d(AbstractC1726.R(((Long) map.remove(enumC18769)).longValue(), 1L), (InterfaceC18056) EnumC22996.WEEKS).d(AbstractC1726.R(((Long) map.remove(enumC187610)).longValue(), 1L), (InterfaceC18056) EnumC22996.DAYS);
            }
            InterfaceC17579 interfaceC17579D2 = q(iA6, 1).d((v(enumC187610).a(((Long) map.remove(enumC187610)).longValue(), enumC187610) - 1) + ((v(enumC18769).a(((Long) map.remove(enumC18769)).longValue(), enumC18769) - 1) * 7), (InterfaceC18056) EnumC22996.DAYS);
            if (enumC5481 != EnumC5481.STRICT || interfaceC17579D2.l(enumC18763) == iA6) {
                return interfaceC17579D2;
            }
            throw new C15464("Strict mode rejected resolved date as it is in a different year");
        }
        int iA7 = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
        if (enumC5481 == EnumC5481.LENIENT) {
            return q(iA7, 1).d(AbstractC1726.R(((Long) map.remove(enumC18768)).longValue(), 1L), (InterfaceC18056) EnumC22996.DAYS);
        }
        return q(iA7, v(enumC18768).a(((Long) map.remove(enumC18768)).longValue(), enumC18768));
    }

    @Override // l.InterfaceC21233
    public InterfaceC9819 J(InterfaceC21584 interfaceC21584) {
        try {
            return E(interfaceC21584).I(C3363.X(interfaceC21584));
        } catch (C15464 e) {
            throw new C15464("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + interfaceC21584.getClass(), e);
        }
    }

    public void C(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC18762);
        if (l2 != null) {
            if (enumC5481 != EnumC5481.LENIENT) {
                enumC18762.T(l2.longValue());
            }
            InterfaceC17579 interfaceC17579C = m().c(1L, (InterfaceC11002) EnumC18762.DAY_OF_MONTH).c(l2.longValue(), (InterfaceC11002) enumC18762);
            EnumC18762 enumC18763 = EnumC18762.MONTH_OF_YEAR;
            l(map, enumC18763, interfaceC17579C.l(enumC18763));
            EnumC18762 enumC18764 = EnumC18762.YEAR;
            l(map, enumC18764, interfaceC17579C.l(enumC18764));
        }
    }

    public InterfaceC17579 T(Map map, EnumC5481 enumC5481) {
        int iY;
        EnumC18762 enumC18762 = EnumC18762.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC18762);
        if (l2 != null) {
            EnumC18762 enumC18763 = EnumC18762.ERA;
            Long l3 = (Long) map.remove(enumC18763);
            if (enumC5481 != EnumC5481.LENIENT) {
                iY = v(enumC18762).a(l2.longValue(), enumC18762);
            } else {
                iY = AbstractC1726.y(l2.longValue());
            }
            if (l3 != null) {
                l(map, EnumC18762.YEAR, z(y(v(enumC18763).a(l3.longValue(), enumC18763)), iY));
                return null;
            }
            EnumC18762 enumC18764 = EnumC18762.YEAR;
            if (map.containsKey(enumC18764)) {
                l(map, enumC18764, z(q(v(enumC18764).a(((Long) map.get(enumC18764)).longValue(), enumC18764), 1).K(), iY));
                return null;
            }
            if (enumC5481 == EnumC5481.STRICT) {
                map.put(enumC18762, l2);
                return null;
            }
            List listX = x();
            if (listX.isEmpty()) {
                l(map, enumC18764, iY);
                return null;
            }
            l(map, enumC18764, z((InterfaceC17705) listX.get(listX.size() - 1), iY));
            return null;
        }
        EnumC18762 enumC18765 = EnumC18762.ERA;
        if (!map.containsKey(enumC18765)) {
            return null;
        }
        v(enumC18765).b(((Long) map.get(enumC18765)).longValue(), enumC18765);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [l.᩶᩶ᩴ] */
    @Override // l.InterfaceC21233
    public InterfaceC20402 p(InterfaceC21584 interfaceC21584) {
        try {
            AbstractC9114 abstractC9114V = AbstractC9114.V(interfaceC21584);
            try {
                interfaceC21584 = P(C18285.W(interfaceC21584), abstractC9114V);
                return interfaceC21584;
            } catch (C15464 unused) {
                return C22645.V(abstractC9114V, null, C11356.V(this, J(interfaceC21584)));
            }
        } catch (C15464 e) {
            throw new C15464("Unable to obtain ChronoZonedDateTime from TemporalAccessor: " + interfaceC21584.getClass(), e);
        }
    }

    public InterfaceC17579 G(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        int iA = v(enumC18762).a(((Long) map.remove(enumC18762)).longValue(), enumC18762);
        if (enumC5481 == EnumC5481.LENIENT) {
            long jR = AbstractC1726.R(((Long) map.remove(EnumC18762.MONTH_OF_YEAR)).longValue(), 1L);
            return M(iA, 1, 1).d(jR, (InterfaceC18056) EnumC22996.MONTHS).d(AbstractC1726.R(((Long) map.remove(EnumC18762.DAY_OF_MONTH)).longValue(), 1L), (InterfaceC18056) EnumC22996.DAYS);
        }
        EnumC18762 enumC18763 = EnumC18762.MONTH_OF_YEAR;
        int iA2 = v(enumC18763).a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
        EnumC18762 enumC18764 = EnumC18762.DAY_OF_MONTH;
        int iA3 = v(enumC18764).a(((Long) map.remove(enumC18764)).longValue(), enumC18764);
        if (enumC5481 != EnumC5481.SMART) {
            return M(iA, iA2, iA3);
        }
        try {
            return M(iA, iA2, iA3);
        } catch (C15464 unused) {
            return M(iA, iA2, 1).m(new C22935(3));
        }
    }

    public static InterfaceC17579 s(InterfaceC17579 interfaceC17579, long j, long j2, long j3) {
        long j4;
        InterfaceC17579 interfaceC17579D = interfaceC17579.d(j, (InterfaceC18056) EnumC22996.MONTHS);
        EnumC22996 enumC22996 = EnumC22996.WEEKS;
        InterfaceC17579 interfaceC17579D2 = interfaceC17579D.d(j2, (InterfaceC18056) enumC22996);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC17579D2 = interfaceC17579D2.d(j5 / 7, (InterfaceC18056) enumC22996);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC17579D2 = interfaceC17579D2.d(AbstractC1726.R(j3, 7L) / 7, (InterfaceC18056) enumC22996);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC17579D2.m(new C17351(EnumC16169.V((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return interfaceC17579D2.m(new C17351(EnumC16169.V((int) j3).getValue(), 0));
    }

    public static void l(Map map, EnumC18762 enumC18762, long j) {
        Long l2 = (Long) map.get(enumC18762);
        if (l2 != null && l2.longValue() != j) {
            throw new C15464("Conflict found: " + enumC18762 + " " + l2 + " differs from " + enumC18762 + " " + j);
        }
        map.put(enumC18762, Long.valueOf(j));
    }

    @Override // l.InterfaceC21233
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC16874) && k().compareTo(((AbstractC16874) obj).k()) == 0;
    }

    @Override // l.InterfaceC21233
    public final int hashCode() {
        return getClass().hashCode() ^ k().hashCode();
    }

    @Override // l.InterfaceC21233
    public final String toString() {
        return k();
    }
}
