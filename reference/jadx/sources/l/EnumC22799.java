package l;

import java.util.Map;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.᩸۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EnumC22799 implements InterfaceC16831 {
    public static final EnumC22799 DAY_OF_QUARTER;
    public static final EnumC22799 QUARTER_OF_YEAR;
    public static final EnumC22799 WEEK_BASED_YEAR;
    public static final EnumC22799 WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ EnumC22799[] b;

    @Override // l.InterfaceC16831
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
        return null;
    }

    public static EnumC22799 valueOf(String str) {
        return (EnumC22799) Enum.valueOf(EnumC22799.class, str);
    }

    public static EnumC22799[] values() {
        return (EnumC22799[]) b.clone();
    }

    static {
        EnumC22799 enumC22799 = new EnumC22799() { // from class: l.۬ܳۗ
            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // l.InterfaceC16831
            public final C23545 p() {
                return C23545.g(1L, 90L, 92L);
            }

            @Override // l.InterfaceC16831
            public final boolean i(InterfaceC9437 interfaceC9437) {
                if (!interfaceC9437.d(EnumC8692.DAY_OF_YEAR) || !interfaceC9437.d(EnumC8692.MONTH_OF_YEAR) || !interfaceC9437.d(EnumC8692.YEAR)) {
                    return false;
                }
                EnumC22799 enumC227910 = AbstractC15339.a;
                return AbstractC2946.r(interfaceC9437).equals(C20012.c);
            }

            @Override // l.InterfaceC16831
            public final C23545 j(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: DayOfQuarter");
                }
                long jC = interfaceC9437.C(EnumC22799.QUARTER_OF_YEAR);
                if (jC == 1) {
                    return C20012.c.O(interfaceC9437.C(EnumC8692.YEAR)) ? C23545.f(1L, 91L) : C23545.f(1L, 90L);
                }
                if (jC == 2) {
                    return C23545.f(1L, 91L);
                }
                if (jC == 3 || jC == 4) {
                    return C23545.f(1L, 92L);
                }
                return p();
            }

            @Override // l.InterfaceC16831
            public final long z(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: DayOfQuarter");
                }
                return interfaceC9437.i(EnumC8692.DAY_OF_YEAR) - EnumC22799.a[((interfaceC9437.i(EnumC8692.MONTH_OF_YEAR) - 1) / 3) + (C20012.c.O(interfaceC9437.C(EnumC8692.YEAR)) ? 4 : 0)];
            }

            @Override // l.InterfaceC16831
            public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
                long jZ = z(interfaceC1235);
                p().b(j, this);
                EnumC8692 enumC8692 = EnumC8692.DAY_OF_YEAR;
                return interfaceC1235.b((j - jZ) + interfaceC1235.C(enumC8692), enumC8692);
            }

            @Override // l.EnumC22799, l.InterfaceC16831
            public final InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
                long jR;
                C7816 c7816H0;
                EnumC8692 enumC8692 = EnumC8692.YEAR;
                Long l2 = (Long) map.get(enumC8692);
                InterfaceC16831 interfaceC16831 = EnumC22799.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(interfaceC16831);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iA = enumC8692.b.a(l2.longValue(), enumC8692);
                long jLongValue = ((Long) map.get(EnumC22799.DAY_OF_QUARTER)).longValue();
                EnumC22799 enumC227910 = AbstractC15339.a;
                if (!AbstractC2946.r(c14790).equals(C20012.c)) {
                    throw new C21241("Resolve requires IsoChronology");
                }
                if (enumC18520 == EnumC18520.LENIENT) {
                    c7816H0 = C7816.of(iA, 1, 1).h0(AbstractC1758.Q(AbstractC1758.R(l3.longValue(), 1L), 3));
                    jR = AbstractC1758.R(jLongValue, 1L);
                } else {
                    C7816 c7816Of = C7816.of(iA, ((interfaceC16831.p().a(l3.longValue(), interfaceC16831) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC18520 == EnumC18520.STRICT) {
                            j(c7816Of).b(jLongValue, this);
                        } else {
                            p().b(jLongValue, this);
                        }
                    }
                    jR = jLongValue - 1;
                    c7816H0 = c7816Of;
                }
                map.remove(this);
                map.remove(enumC8692);
                map.remove(interfaceC16831);
                return c7816H0.g0(jR);
            }
        };
        DAY_OF_QUARTER = enumC22799;
        EnumC22799 enumC227910 = new EnumC22799() { // from class: l.ۙ۫ۗ
            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // l.InterfaceC16831
            public final C23545 p() {
                return C23545.f(1L, 4L);
            }

            @Override // l.InterfaceC16831
            public final boolean i(InterfaceC9437 interfaceC9437) {
                if (!interfaceC9437.d(EnumC8692.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC22799 enumC227911 = AbstractC15339.a;
                return AbstractC2946.r(interfaceC9437).equals(C20012.c);
            }

            @Override // l.InterfaceC16831
            public final long z(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: QuarterOfYear");
                }
                return (interfaceC9437.C(EnumC8692.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // l.InterfaceC16831
            public final C23545 j(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: QuarterOfYear");
                }
                return p();
            }

            @Override // l.InterfaceC16831
            public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
                long jZ = z(interfaceC1235);
                p().b(j, this);
                EnumC8692 enumC8692 = EnumC8692.MONTH_OF_YEAR;
                return interfaceC1235.b(((j - jZ) * 3) + interfaceC1235.C(enumC8692), enumC8692);
            }
        };
        QUARTER_OF_YEAR = enumC227910;
        EnumC22799 enumC227911 = new EnumC22799() { // from class: l.᩷۫ۗ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // l.InterfaceC16831
            public final C23545 p() {
                return C23545.g(1L, 52L, 53L);
            }

            @Override // l.InterfaceC16831
            public final boolean i(InterfaceC9437 interfaceC9437) {
                if (!interfaceC9437.d(EnumC8692.EPOCH_DAY)) {
                    return false;
                }
                EnumC22799 enumC227912 = AbstractC15339.a;
                return AbstractC2946.r(interfaceC9437).equals(C20012.c);
            }

            @Override // l.InterfaceC16831
            public final C23545 j(InterfaceC9437 interfaceC9437) {
                if (i(interfaceC9437)) {
                    return EnumC22799.T(C7816.T(interfaceC9437));
                }
                throw new C16085("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // l.InterfaceC16831
            public final long z(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC22799.P(C7816.T(interfaceC9437));
            }

            @Override // l.InterfaceC16831
            public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
                p().b(j, this);
                return interfaceC1235.c(AbstractC1758.R(j, z(interfaceC1235)), EnumC10183.WEEKS);
            }

            @Override // l.EnumC22799, l.InterfaceC16831
            public final InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
                C7816 c7816B;
                long j;
                C7816 c7816I0;
                long j2;
                InterfaceC16831 interfaceC16831 = EnumC22799.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(interfaceC16831);
                EnumC8692 enumC8692 = EnumC8692.DAY_OF_WEEK;
                Long l3 = (Long) map.get(enumC8692);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iA = interfaceC16831.p().a(l2.longValue(), interfaceC16831);
                long jLongValue = ((Long) map.get(EnumC22799.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC22799 enumC227912 = AbstractC15339.a;
                if (!AbstractC2946.r(c14790).equals(C20012.c)) {
                    throw new C21241("Resolve requires IsoChronology");
                }
                C7816 c7816Of = C7816.of(iA, 1, 4);
                if (enumC18520 == EnumC18520.LENIENT) {
                    long jLongValue2 = l3.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        c7816I0 = c7816Of.i0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            c7816I0 = c7816Of.i0(AbstractC1758.R(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        c7816B = c7816Of.i0(AbstractC1758.R(jLongValue, j)).b(jLongValue2, enumC8692);
                    }
                    c7816Of = c7816I0;
                    j = 1;
                    jLongValue2 = j2 + 1;
                    c7816B = c7816Of.i0(AbstractC1758.R(jLongValue, j)).b(jLongValue2, enumC8692);
                } else {
                    int iA2 = enumC8692.b.a(l3.longValue(), enumC8692);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (enumC18520 == EnumC18520.STRICT) {
                            EnumC22799.T(c7816Of).b(jLongValue, this);
                        } else {
                            p().b(jLongValue, this);
                        }
                    }
                    c7816B = c7816Of.i0(jLongValue - 1).b(iA2, enumC8692);
                }
                map.remove(this);
                map.remove(interfaceC16831);
                map.remove(enumC8692);
                return c7816B;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC227911;
        EnumC22799 enumC227912 = new EnumC22799() { // from class: l.ۤ۫ۗ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // l.InterfaceC16831
            public final C23545 p() {
                return EnumC8692.YEAR.b;
            }

            @Override // l.InterfaceC16831
            public final boolean i(InterfaceC9437 interfaceC9437) {
                if (!interfaceC9437.d(EnumC8692.EPOCH_DAY)) {
                    return false;
                }
                EnumC22799 enumC227913 = AbstractC15339.a;
                return AbstractC2946.r(interfaceC9437).equals(C20012.c);
            }

            @Override // l.InterfaceC16831
            public final long z(InterfaceC9437 interfaceC9437) {
                if (i(interfaceC9437)) {
                    return EnumC22799.R(C7816.T(interfaceC9437));
                }
                throw new C16085("Unsupported field: WeekBasedYear");
            }

            @Override // l.InterfaceC16831
            public final C23545 j(InterfaceC9437 interfaceC9437) {
                if (!i(interfaceC9437)) {
                    throw new C16085("Unsupported field: WeekBasedYear");
                }
                return p();
            }

            @Override // l.InterfaceC16831
            public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
                if (!i(interfaceC1235)) {
                    throw new C16085("Unsupported field: WeekBasedYear");
                }
                int iA = EnumC8692.YEAR.b.a(j, EnumC22799.WEEK_BASED_YEAR);
                C7816 c7816T = C7816.T(interfaceC1235);
                EnumC8692 enumC8692 = EnumC8692.DAY_OF_WEEK;
                int i = c7816T.i(enumC8692);
                int iP = EnumC22799.P(c7816T);
                if (iP == 53 && EnumC22799.S(iA) == 52) {
                    iP = 52;
                }
                C7816 c7816Of = C7816.of(iA, 1, 4);
                return interfaceC1235.y(c7816Of.g0(((iP - 1) * 7) + (i - c7816Of.i(enumC8692))));
            }
        };
        WEEK_BASED_YEAR = enumC227912;
        b = new EnumC22799[]{enumC22799, enumC227910, enumC227911, enumC227912};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static C23545 T(C7816 c7816) {
        return C23545.f(1L, S(R(c7816)));
    }

    public static int S(int i) {
        C7816 c7816Of = C7816.of(i, 1, 1);
        if (c7816Of.V() != EnumC13387.THURSDAY) {
            return (c7816Of.V() == EnumC13387.WEDNESDAY && c7816Of.r()) ? 53 : 52;
        }
        return 53;
    }

    public static int P(C7816 c7816) {
        int iOrdinal = c7816.V().ordinal();
        int iW = c7816.W() - 1;
        int i = (3 - iOrdinal) + iW;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iW >= i3) {
            int i4 = ((iW - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && c7816.r())) {
                return i4;
            }
            return 1;
        }
        if (c7816.W() != 180) {
            c7816 = C7816.e0(c7816.a, 180);
        }
        return (int) T(c7816.j0(-1L)).d;
    }

    public static int R(C7816 c7816) {
        int year = c7816.getYear();
        int iW = c7816.W();
        if (iW <= 3) {
            return iW - c7816.V().ordinal() < -2 ? year - 1 : year;
        }
        if (iW >= 363) {
            return ((iW - 363) - (c7816.r() ? 1 : 0)) - c7816.V().ordinal() >= 0 ? year + 1 : year;
        }
        return year;
    }
}
