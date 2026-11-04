package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۟ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7816 implements InterfaceC1235, InterfaceC1916, InterfaceC17116, Serializable {
    public static final C7816 d = of(-999999999, 1, 1);
    public static final C7816 e = of(999999999, 12, 31);
    public static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public static C7816 now() {
        return c0(AbstractC14527.a());
    }

    public static C7816 c0(C20100 c20100) {
        C17359.requireNonNull(c20100, "clock");
        C0358 c0358Instant = c20100.instant();
        AbstractC22338 abstractC22338 = c20100.a;
        C17359.requireNonNull(c0358Instant, "instant");
        C17359.requireNonNull(abstractC22338, "zone");
        return d0(AbstractC1758.z(c0358Instant.getEpochSecond() + ((long) abstractC22338.S().d(c0358Instant).getTotalSeconds()), 86400));
    }

    public static C7816 of(int i, int i2, int i3) {
        EnumC8692.YEAR.P(i);
        EnumC8692.MONTH_OF_YEAR.P(i2);
        EnumC8692.DAY_OF_MONTH.P(i3);
        return S(i, i2, i3);
    }

    public static C7816 e0(int i, int i2) {
        long j = i;
        EnumC8692.YEAR.P(j);
        EnumC8692.DAY_OF_YEAR.P(i2);
        boolean zO = C20012.c.O(j);
        if (i2 == 366 && !zO) {
            throw new C21241("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC6456 enumC6456U = EnumC6456.U(((i2 - 1) / 31) + 1);
        if (i2 > (enumC6456U.S(zO) + enumC6456U.R(zO)) - 1) {
            enumC6456U = EnumC6456.a[((((int) 1) + 12) + enumC6456U.ordinal()) % 12];
        }
        return new C7816(i, enumC6456U.getValue(), (i2 - enumC6456U.R(zO)) + 1);
    }

    public static C7816 d0(long j) {
        long j2;
        EnumC8692.EPOCH_DAY.P(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        return new C7816(enumC8692.b.a(j7, enumC8692), i3, i4);
    }

    public static C7816 T(InterfaceC9437 interfaceC9437) {
        C17359.requireNonNull(interfaceC9437, "temporal");
        C7816 c7816 = (C7816) interfaceC9437.P(AbstractC17577.f);
        if (c7816 != null) {
            return c7816;
        }
        throw new C21241("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName());
    }

    public static C7816 S(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C20012.c.O(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C21241("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C21241("Invalid date '" + EnumC6456.U(i2).name() + " " + i3 + "'");
            }
        }
        return new C7816(i, i2, i3);
    }

    public static C7816 k0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C20012.c.O((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new C7816(i, i2, i3);
    }

    public C7816(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        return AbstractC1758.f(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.j(this);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        if (!enumC8692.isDateBased()) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        int i = AbstractC16282.a[enumC8692.ordinal()];
        if (i == 1) {
            return C23545.f(1L, Z());
        }
        if (i == 2) {
            return C23545.f(1L, M());
        }
        if (i == 3) {
            return C23545.f(1L, (EnumC6456.U(this.b) != EnumC6456.FEBRUARY || r()) ? 5L : 4L);
        }
        if (i != 4) {
            return enumC8692.b;
        }
        return getYear() <= 0 ? C23545.f(1L, 1000000000L) : C23545.f(1L, 999999999L);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return U(interfaceC16831);
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (interfaceC16831 == EnumC8692.EPOCH_DAY) {
                return D();
            }
            if (interfaceC16831 == EnumC8692.PROLEPTIC_MONTH) {
                return X();
            }
            return U(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    public final int U(InterfaceC16831 interfaceC16831) {
        switch (AbstractC16282.a[((EnumC8692) interfaceC16831).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return W();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return V().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((W() - 1) % 7) + 1;
            case 8:
                throw new C16085("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((W() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new C16085("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    public final long X() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // l.InterfaceC17116
    public final InterfaceC8912 a() {
        return C20012.c;
    }

    @Override // l.InterfaceC17116
    public final InterfaceC7421 G() {
        return getYear() >= 1 ? EnumC15536.CE : EnumC15536.BCE;
    }

    public int getYear() {
        return this.a;
    }

    public int getMonthValue() {
        return this.b;
    }

    public final int W() {
        return (EnumC6456.U(this.b).R(r()) + this.c) - 1;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public final EnumC13387 V() {
        return EnumC13387.R(((int) AbstractC1758.O(D() + 3, 7)) + 1);
    }

    @Override // l.InterfaceC17116
    public final boolean r() {
        return C20012.c.O(this.a);
    }

    public final int Z() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return r() ? 29 : 28;
    }

    @Override // l.InterfaceC17116
    public final int M() {
        return r() ? 366 : 365;
    }

    @Override // l.InterfaceC17116
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7816 y(InterfaceC1916 interfaceC1916) {
        if (interfaceC1916 instanceof C7816) {
            return (C7816) interfaceC1916;
        }
        return (C7816) interfaceC1916.p(this);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public final C7816 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C7816) interfaceC16831.C(this, j);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        enumC8692.P(j);
        switch (AbstractC16282.a[enumC8692.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return of(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (W() != i2) {
                    return e0(this.a, i2);
                }
                return this;
            case 3:
                return i0(j - C(EnumC8692.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return n0((int) j);
            case 5:
                return g0(j - ((long) V().getValue()));
            case 6:
                return g0(j - C(EnumC8692.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return g0(j - C(EnumC8692.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return d0(j);
            case 9:
                return i0(j - C(EnumC8692.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    EnumC8692.MONTH_OF_YEAR.P(i3);
                    return k0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return h0(j - X());
            case 12:
                return n0((int) j);
            case 13:
                if (C(EnumC8692.ERA) != j) {
                    return n0(1 - this.a);
                }
                return this;
            default:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    public final C7816 n0(int i) {
        if (this.a == i) {
            return this;
        }
        EnumC8692.YEAR.P(i);
        return k0(i, this.b, this.c);
    }

    @Override // l.InterfaceC17116
    public final InterfaceC17116 J(InterfaceC25037 interfaceC25037) {
        if (interfaceC25037 != null) {
            C8561 c8561 = (C8561) interfaceC25037;
            return h0((((long) c8561.a) * 12) + ((long) c8561.b)).g0(c8561.getDays());
        }
        C17359.requireNonNull(interfaceC25037, "amountToAdd");
        return (C7816) ((C8561) interfaceC25037).i(this);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final C7816 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return (C7816) interfaceC2726.j(this, j);
        }
        switch (AbstractC16282.b[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return g0(j);
            case 2:
                return i0(j);
            case 3:
                return h0(j);
            case 4:
                return j0(j);
            case 5:
                return j0(AbstractC1758.Q(j, 10));
            case 6:
                return j0(AbstractC1758.Q(j, 100));
            case 7:
                return j0(AbstractC1758.Q(j, 1000));
            case 8:
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return b(AbstractC1758.P(C(enumC8692), j), enumC8692);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final C7816 j0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        return k0(enumC8692.b.a(((long) this.a) + j, enumC8692), this.b, this.c);
    }

    public final C7816 h0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        long j3 = 12;
        return k0(enumC8692.b.a(AbstractC1758.z(j2, j3), enumC8692), ((int) AbstractC1758.O(j2, j3)) + 1, this.c);
    }

    public final C7816 i0(long j) {
        return g0(AbstractC1758.Q(j, 7));
    }

    public final C7816 g0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new C7816(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jZ = Z();
                if (j2 <= jZ) {
                    return new C7816(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new C7816(this.a, s + 1, (int) (j2 - jZ));
                }
                EnumC8692.YEAR.P(this.a + 1);
                return new C7816(this.a + 1, 1, (int) (j2 - jZ));
            }
        }
        return d0(AbstractC1758.P(D(), j));
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C7816 z(long j, InterfaceC2726 interfaceC2726) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, interfaceC2726).c(1L, interfaceC2726) : c(-j, interfaceC2726);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        return c14435 == AbstractC17577.f ? this : AbstractC1758.g(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return AbstractC1758.a(this, interfaceC1235);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C7816 c7816T = T(interfaceC1235);
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return interfaceC2726.i(this, c7816T);
        }
        switch (AbstractC16282.b[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return c7816T.D() - D();
            case 2:
                return (c7816T.D() - D()) / 7;
            case 3:
                return b0(c7816T);
            case 4:
                return b0(c7816T) / 12;
            case 5:
                return b0(c7816T) / 120;
            case 6:
                return b0(c7816T) / 1200;
            case 7:
                return b0(c7816T) / 12000;
            case 8:
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return c7816T.C(enumC8692) - C(enumC8692);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final long b0(C7816 c7816) {
        return (((c7816.X() * 32) + ((long) c7816.getDayOfMonth())) - ((X() * 32) + ((long) getDayOfMonth()))) / 32;
    }

    @Override // l.InterfaceC17116
    public final InterfaceC12641 E(C10052 c10052) {
        return C19003.of(this, c10052);
    }

    public C23084 atStartOfDay(AbstractC22338 abstractC22338) {
        C17359.requireNonNull(abstractC22338, "zone");
        C19003 c19003Of = C19003.of(this, C10052.g);
        if (!(abstractC22338 instanceof C11149)) {
            Object objE = abstractC22338.S().e(c19003Of);
            C6391 c6391 = objE instanceof C6391 ? (C6391) objE : null;
            if (c6391 != null && c6391.i()) {
                c19003Of = c6391.b.W(c6391.d.getTotalSeconds() - c6391.c.getTotalSeconds());
            }
        }
        return C23084.S(c19003Of, null, abstractC22338);
    }

    @Override // l.InterfaceC17116
    public final long D() {
        long j;
        long j2 = this.a;
        long j3 = this.b;
        long j4 = 365 * j2;
        if (j2 >= 0) {
            j = ((j2 + 399) / 400) + (((3 + j2) / 4) - ((99 + j2) / 100)) + j4;
        } else {
            j = j4 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
        }
        long j5 = (((367 * j3) - 362) / 12) + j + ((long) (this.c - 1));
        if (j3 > 2) {
            j5 = !r() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC17116 interfaceC17116) {
        if (interfaceC17116 instanceof C7816) {
            return R((C7816) interfaceC17116);
        }
        return AbstractC1758.b(this, interfaceC17116);
    }

    public final int R(C7816 c7816) {
        int i = this.a - c7816.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - c7816.b;
        return i2 == 0 ? this.c - c7816.c : i2;
    }

    public final boolean Y(InterfaceC17116 interfaceC17116) {
        if (interfaceC17116 instanceof C7816) {
            return R((C7816) interfaceC17116) < 0;
        }
        return D() < interfaceC17116.D();
    }

    @Override // l.InterfaceC17116
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7816) && R((C7816) obj) == 0;
    }

    @Override // l.InterfaceC17116
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // l.InterfaceC17116
    public final String toString() {
        int i = this.a;
        short s = this.b;
        short s2 = this.c;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21372((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
