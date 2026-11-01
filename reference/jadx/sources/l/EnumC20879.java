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
/* JADX INFO: renamed from: l.᩷۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class EnumC20879 implements InterfaceC11002 {
    public static final EnumC20879 DAY_OF_QUARTER;
    public static final EnumC20879 QUARTER_OF_YEAR;
    public static final EnumC20879 WEEK_BASED_YEAR;
    public static final EnumC20879 WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ EnumC20879[] b;

    @Override // l.InterfaceC11002
    public final boolean isDateBased() {
        return true;
    }

    public /* synthetic */ InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
        return null;
    }

    public static EnumC20879 valueOf(String str) {
        return (EnumC20879) Enum.valueOf(EnumC20879.class, str);
    }

    public static EnumC20879[] values() {
        return (EnumC20879[]) b.clone();
    }

    static {
        EnumC20879 enumC20879 = new EnumC20879() { // from class: l.᩵۫ᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }

            @Override // l.InterfaceC11002
            public final C1828 s() {
                return C1828.g(1L, 90L, 92L);
            }

            @Override // l.InterfaceC11002
            public final boolean l(InterfaceC21584 interfaceC21584) {
                if (!interfaceC21584.e(EnumC18762.DAY_OF_YEAR) || !interfaceC21584.e(EnumC18762.MONTH_OF_YEAR) || !interfaceC21584.e(EnumC18762.YEAR)) {
                    return false;
                }
                EnumC20879 enumC208710 = AbstractC20174.a;
                return AbstractC14884.r(interfaceC21584).equals(C7122.c);
            }

            @Override // l.InterfaceC11002
            public final C1828 m(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: DayOfQuarter");
                }
                long jG = interfaceC21584.G(EnumC20879.QUARTER_OF_YEAR);
                if (jG == 1) {
                    return C7122.c.S(interfaceC21584.G(EnumC18762.YEAR)) ? C1828.f(1L, 91L) : C1828.f(1L, 90L);
                }
                if (jG == 2) {
                    return C1828.f(1L, 91L);
                }
                if (jG == 3 || jG == 4) {
                    return C1828.f(1L, 92L);
                }
                return s();
            }

            @Override // l.InterfaceC11002
            public final long C(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: DayOfQuarter");
                }
                return interfaceC21584.l(EnumC18762.DAY_OF_YEAR) - EnumC20879.a[((interfaceC21584.l(EnumC18762.MONTH_OF_YEAR) - 1) / 3) + (C7122.c.S(interfaceC21584.G(EnumC18762.YEAR)) ? 4 : 0)];
            }

            @Override // l.InterfaceC11002
            public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
                long jC = C(interfaceC15235);
                s().b(j, this);
                EnumC18762 enumC18762 = EnumC18762.DAY_OF_YEAR;
                return interfaceC15235.c((j - jC) + interfaceC15235.G(enumC18762), enumC18762);
            }

            @Override // l.EnumC20879, l.InterfaceC11002
            public final InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
                long jR;
                C18991 c18991M0;
                EnumC18762 enumC18762 = EnumC18762.YEAR;
                Long l2 = (Long) map.get(enumC18762);
                InterfaceC11002 interfaceC11002 = EnumC20879.QUARTER_OF_YEAR;
                Long l3 = (Long) map.get(interfaceC11002);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iA = enumC18762.b.a(l2.longValue(), enumC18762);
                long jLongValue = ((Long) map.get(EnumC20879.DAY_OF_QUARTER)).longValue();
                EnumC20879 enumC208710 = AbstractC20174.a;
                if (!AbstractC14884.r(c11832).equals(C7122.c)) {
                    throw new C15464("Resolve requires IsoChronology");
                }
                if (enumC5481 == EnumC5481.LENIENT) {
                    c18991M0 = C18991.h0(iA, 1, 1).m0(AbstractC1726.Q(AbstractC1726.R(l3.longValue(), 1L), 3));
                    jR = AbstractC1726.R(jLongValue, 1L);
                } else {
                    C18991 c18991H0 = C18991.h0(iA, ((interfaceC11002.s().a(l3.longValue(), interfaceC11002) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (enumC5481 == EnumC5481.STRICT) {
                            m(c18991H0).b(jLongValue, this);
                        } else {
                            s().b(jLongValue, this);
                        }
                    }
                    jR = jLongValue - 1;
                    c18991M0 = c18991H0;
                }
                map.remove(this);
                map.remove(enumC18762);
                map.remove(interfaceC11002);
                return c18991M0.l0(jR);
            }
        };
        DAY_OF_QUARTER = enumC20879;
        EnumC20879 enumC208710 = new EnumC20879() { // from class: l.ۡ۫ᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }

            @Override // l.InterfaceC11002
            public final C1828 s() {
                return C1828.f(1L, 4L);
            }

            @Override // l.InterfaceC11002
            public final boolean l(InterfaceC21584 interfaceC21584) {
                if (!interfaceC21584.e(EnumC18762.MONTH_OF_YEAR)) {
                    return false;
                }
                EnumC20879 enumC208711 = AbstractC20174.a;
                return AbstractC14884.r(interfaceC21584).equals(C7122.c);
            }

            @Override // l.InterfaceC11002
            public final long C(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: QuarterOfYear");
                }
                return (interfaceC21584.G(EnumC18762.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // l.InterfaceC11002
            public final C1828 m(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: QuarterOfYear");
                }
                return s();
            }

            @Override // l.InterfaceC11002
            public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
                long jC = C(interfaceC15235);
                s().b(j, this);
                EnumC18762 enumC18762 = EnumC18762.MONTH_OF_YEAR;
                return interfaceC15235.c(((j - jC) * 3) + interfaceC15235.G(enumC18762), enumC18762);
            }
        };
        QUARTER_OF_YEAR = enumC208710;
        EnumC20879 enumC208711 = new EnumC20879() { // from class: l.ۤ۫ᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }

            @Override // l.InterfaceC11002
            public final C1828 s() {
                return C1828.g(1L, 52L, 53L);
            }

            @Override // l.InterfaceC11002
            public final boolean l(InterfaceC21584 interfaceC21584) {
                if (!interfaceC21584.e(EnumC18762.EPOCH_DAY)) {
                    return false;
                }
                EnumC20879 enumC208712 = AbstractC20174.a;
                return AbstractC14884.r(interfaceC21584).equals(C7122.c);
            }

            @Override // l.InterfaceC11002
            public final C1828 m(InterfaceC21584 interfaceC21584) {
                if (l(interfaceC21584)) {
                    return EnumC20879.X(C18991.X(interfaceC21584));
                }
                throw new C14530("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // l.InterfaceC11002
            public final long C(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: WeekOfWeekBasedYear");
                }
                return EnumC20879.T(C18991.X(interfaceC21584));
            }

            @Override // l.InterfaceC11002
            public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
                s().b(j, this);
                return interfaceC15235.d(AbstractC1726.R(j, C(interfaceC15235)), EnumC22996.WEEKS);
            }

            @Override // l.EnumC20879, l.InterfaceC11002
            public final InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
                C18991 c18991C;
                long j;
                C18991 c18991N0;
                long j2;
                InterfaceC11002 interfaceC11002 = EnumC20879.WEEK_BASED_YEAR;
                Long l2 = (Long) map.get(interfaceC11002);
                EnumC18762 enumC18762 = EnumC18762.DAY_OF_WEEK;
                Long l3 = (Long) map.get(enumC18762);
                if (l2 == null || l3 == null) {
                    return null;
                }
                int iA = interfaceC11002.s().a(l2.longValue(), interfaceC11002);
                long jLongValue = ((Long) map.get(EnumC20879.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                EnumC20879 enumC208712 = AbstractC20174.a;
                if (!AbstractC14884.r(c11832).equals(C7122.c)) {
                    throw new C15464("Resolve requires IsoChronology");
                }
                C18991 c18991H0 = C18991.h0(iA, 1, 4);
                if (enumC5481 == EnumC5481.LENIENT) {
                    long jLongValue2 = l3.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        c18991N0 = c18991H0.n0(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            c18991N0 = c18991H0.n0(AbstractC1726.R(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        c18991C = c18991H0.n0(AbstractC1726.R(jLongValue, j)).c(jLongValue2, enumC18762);
                    }
                    c18991H0 = c18991N0;
                    j = 1;
                    jLongValue2 = j2 + 1;
                    c18991C = c18991H0.n0(AbstractC1726.R(jLongValue, j)).c(jLongValue2, enumC18762);
                } else {
                    int iA2 = enumC18762.b.a(l3.longValue(), enumC18762);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (enumC5481 == EnumC5481.STRICT) {
                            EnumC20879.X(c18991H0).b(jLongValue, this);
                        } else {
                            s().b(jLongValue, this);
                        }
                    }
                    c18991C = c18991H0.n0(jLongValue - 1).c(iA2, enumC18762);
                }
                map.remove(this);
                map.remove(interfaceC11002);
                map.remove(enumC18762);
                return c18991C;
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = enumC208711;
        EnumC20879 enumC208712 = new EnumC20879() { // from class: l.۟۫ᩴ
            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }

            @Override // l.InterfaceC11002
            public final C1828 s() {
                return EnumC18762.YEAR.b;
            }

            @Override // l.InterfaceC11002
            public final boolean l(InterfaceC21584 interfaceC21584) {
                if (!interfaceC21584.e(EnumC18762.EPOCH_DAY)) {
                    return false;
                }
                EnumC20879 enumC208713 = AbstractC20174.a;
                return AbstractC14884.r(interfaceC21584).equals(C7122.c);
            }

            @Override // l.InterfaceC11002
            public final long C(InterfaceC21584 interfaceC21584) {
                if (l(interfaceC21584)) {
                    return EnumC20879.V(C18991.X(interfaceC21584));
                }
                throw new C14530("Unsupported field: WeekBasedYear");
            }

            @Override // l.InterfaceC11002
            public final C1828 m(InterfaceC21584 interfaceC21584) {
                if (!l(interfaceC21584)) {
                    throw new C14530("Unsupported field: WeekBasedYear");
                }
                return s();
            }

            @Override // l.InterfaceC11002
            public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
                if (!l(interfaceC15235)) {
                    throw new C14530("Unsupported field: WeekBasedYear");
                }
                int iA = EnumC18762.YEAR.b.a(j, EnumC20879.WEEK_BASED_YEAR);
                C18991 c18991X = C18991.X(interfaceC15235);
                EnumC18762 enumC18762 = EnumC18762.DAY_OF_WEEK;
                int iL = c18991X.l(enumC18762);
                int iT = EnumC20879.T(c18991X);
                if (iT == 53 && EnumC20879.W(iA) == 52) {
                    iT = 52;
                }
                C18991 c18991H0 = C18991.h0(iA, 1, 4);
                return interfaceC15235.m(c18991H0.l0(((iT - 1) * 7) + (iL - c18991H0.l(enumC18762))));
            }
        };
        WEEK_BASED_YEAR = enumC208712;
        b = new EnumC20879[]{enumC20879, enumC208710, enumC208711, enumC208712};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static C1828 X(C18991 c18991) {
        return C1828.f(1L, W(V(c18991)));
    }

    public static int W(int i) {
        C18991 c18991H0 = C18991.h0(i, 1, 1);
        if (c18991H0.Z() != EnumC16169.THURSDAY) {
            return (c18991H0.Z() == EnumC16169.WEDNESDAY && c18991H0.u()) ? 53 : 52;
        }
        return 53;
    }

    public static int T(C18991 c18991) {
        int iOrdinal = c18991.Z().ordinal();
        int iA0 = c18991.a0() - 1;
        int i = (3 - iOrdinal) + iA0;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (iA0 >= i3) {
            int i4 = ((iA0 - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && c18991.u())) {
                return i4;
            }
            return 1;
        }
        if (c18991.a0() != 180) {
            c18991 = C18991.j0(c18991.a, 180);
        }
        return (int) X(c18991.o0(-1L)).d;
    }

    public static int V(C18991 c18991) {
        int i = c18991.a;
        int iA0 = c18991.a0();
        if (iA0 <= 3) {
            return iA0 - c18991.Z().ordinal() < -2 ? i - 1 : i;
        }
        if (iA0 >= 363) {
            return ((iA0 - 363) - (c18991.u() ? 1 : 0)) - c18991.Z().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
