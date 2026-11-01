package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩴ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18991 implements InterfaceC15235, InterfaceC12413, InterfaceC17579, Serializable {
    public static final C18991 d = h0(-999999999, 1, 1);
    public static final C18991 e = h0(999999999, 12, 31);
    public static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        h0(1970, 1, 1);
    }

    public static C18991 now() {
        return g0(AbstractC23225.a());
    }

    public static C18991 g0(C7702 c7702) {
        C13638.requireNonNull(c7702, "clock");
        C18285 c18285Instant = c7702.instant();
        AbstractC9114 abstractC9114 = c7702.a;
        C13638.requireNonNull(c18285Instant, "instant");
        C13638.requireNonNull(abstractC9114, "zone");
        return i0(AbstractC1726.z(c18285Instant.getEpochSecond() + ((long) abstractC9114.W().d(c18285Instant).b), 86400));
    }

    public static C18991 h0(int i, int i2, int i3) {
        EnumC18762.YEAR.T(i);
        EnumC18762.MONTH_OF_YEAR.T(i2);
        EnumC18762.DAY_OF_MONTH.T(i3);
        return W(i, i2, i3);
    }

    public static C18991 j0(int i, int i2) {
        long j = i;
        EnumC18762.YEAR.T(j);
        EnumC18762.DAY_OF_YEAR.T(i2);
        boolean zS = C7122.c.S(j);
        if (i2 == 366 && !zS) {
            throw new C15464("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        EnumC13824 enumC13824Y = EnumC13824.Y(((i2 - 1) / 31) + 1);
        if (i2 > (enumC13824Y.W(zS) + enumC13824Y.V(zS)) - 1) {
            enumC13824Y = EnumC13824.a[((((int) 1) + 12) + enumC13824Y.ordinal()) % 12];
        }
        return new C18991(i, enumC13824Y.getValue(), (i2 - enumC13824Y.V(zS)) + 1);
    }

    public static C18991 i0(long j) {
        long j2;
        EnumC18762.EPOCH_DAY.T(j);
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
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        return new C18991(enumC18762.b.a(j7, enumC18762), i3, i4);
    }

    public static C18991 X(InterfaceC21584 interfaceC21584) {
        C13638.requireNonNull(interfaceC21584, "temporal");
        C18991 c18991 = (C18991) interfaceC21584.T(AbstractC23702.f);
        if (c18991 != null) {
            return c18991;
        }
        throw new C15464("Unable to obtain LocalDate from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName());
    }

    public static C18991 W(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else if (C7122.c.S(i)) {
                i4 = 29;
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new C15464("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new C15464("Invalid date '" + EnumC13824.Y(i2).name() + " " + i3 + "'");
            }
        }
        return new C18991(i, i2, i3);
    }

    public static C18991 p0(int i, int i2, int i3) {
        if (i2 == 2) {
            i3 = Math.min(i3, C7122.c.S((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new C18991(i, i2, i3);
    }

    public C18991(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        return AbstractC1726.f(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.m(this);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        if (!enumC18762.isDateBased()) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        int i = AbstractC10651.a[enumC18762.ordinal()];
        if (i == 1) {
            return C1828.f(1L, d0());
        }
        if (i == 2) {
            return C1828.f(1L, Q());
        }
        if (i == 3) {
            return C1828.f(1L, (EnumC13824.Y(this.b) != EnumC13824.FEBRUARY || u()) ? 5L : 4L);
        }
        if (i != 4) {
            return enumC18762.b;
        }
        return this.a <= 0 ? C1828.f(1L, 1000000000L) : C1828.f(1L, 999999999L);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return Y(interfaceC11002);
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 == EnumC18762.EPOCH_DAY) {
                return H();
            }
            if (interfaceC11002 == EnumC18762.PROLEPTIC_MONTH) {
                return b0();
            }
            return Y(interfaceC11002);
        }
        return interfaceC11002.C(this);
    }

    public final int Y(InterfaceC11002 interfaceC11002) {
        switch (AbstractC10651.a[((EnumC18762) interfaceC11002).ordinal()]) {
            case 1:
                return this.c;
            case 2:
                return a0();
            case 3:
                return ((this.c - 1) / 7) + 1;
            case 4:
                int i = this.a;
                return i >= 1 ? i : 1 - i;
            case 5:
                return Z().getValue();
            case 6:
                return ((this.c - 1) % 7) + 1;
            case 7:
                return ((a0() - 1) % 7) + 1;
            case 8:
                throw new C14530("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((a0() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new C14530("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return this.a;
            case 13:
                return this.a >= 1 ? 1 : 0;
            default:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    public final long b0() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // l.InterfaceC17579
    public final InterfaceC21233 a() {
        return C7122.c;
    }

    @Override // l.InterfaceC17579
    public final InterfaceC17705 K() {
        return this.a >= 1 ? EnumC20528.CE : EnumC20528.BCE;
    }

    public final int a0() {
        return (EnumC13824.Y(this.b).V(u()) + this.c) - 1;
    }

    public final EnumC16169 Z() {
        return EnumC16169.V(((int) AbstractC1726.O(H() + 3, 7)) + 1);
    }

    @Override // l.InterfaceC17579
    public final boolean u() {
        return C7122.c.S(this.a);
    }

    public final int d0() {
        short s = this.b;
        if (s != 2) {
            return (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31;
        }
        return u() ? 29 : 28;
    }

    @Override // l.InterfaceC17579
    public final int Q() {
        return u() ? 366 : 365;
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C18991 m(InterfaceC12413 interfaceC12413) {
        if (interfaceC12413 instanceof C18991) {
            return (C18991) interfaceC12413;
        }
        return (C18991) interfaceC12413.s(this);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public final C18991 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C18991) interfaceC11002.G(this, j);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        enumC18762.T(j);
        switch (AbstractC10651.a[enumC18762.ordinal()]) {
            case 1:
                int i = (int) j;
                if (this.c != i) {
                    return h0(this.a, this.b, i);
                }
                return this;
            case 2:
                int i2 = (int) j;
                if (a0() != i2) {
                    return j0(this.a, i2);
                }
                return this;
            case 3:
                return n0(j - G(EnumC18762.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.a < 1) {
                    j = 1 - j;
                }
                return s0((int) j);
            case 5:
                return l0(j - ((long) Z().getValue()));
            case 6:
                return l0(j - G(EnumC18762.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return l0(j - G(EnumC18762.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return i0(j);
            case 9:
                return n0(j - G(EnumC18762.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i3 = (int) j;
                if (this.b != i3) {
                    EnumC18762.MONTH_OF_YEAR.T(i3);
                    return p0(this.a, i3, this.c);
                }
                return this;
            case 11:
                return m0(j - b0());
            case 12:
                return s0((int) j);
            case 13:
                if (G(EnumC18762.ERA) != j) {
                    return s0(1 - this.a);
                }
                return this;
            default:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    public final C18991 s0(int i) {
        if (this.a == i) {
            return this;
        }
        EnumC18762.YEAR.T(i);
        return p0(i, this.b, this.c);
    }

    @Override // l.InterfaceC17579
    public final InterfaceC17579 N(InterfaceC6062 interfaceC6062) {
        if (interfaceC6062 != null) {
            C13118 c13118 = (C13118) interfaceC6062;
            return m0((((long) c13118.a) * 12) + ((long) c13118.b)).l0(c13118.c);
        }
        C13638.requireNonNull(interfaceC6062, "amountToAdd");
        return (C18991) ((C13118) interfaceC6062).l(this);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public final C18991 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C18991) interfaceC18056.m(this, j);
        }
        switch (AbstractC10651.b[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return l0(j);
            case 2:
                return n0(j);
            case 3:
                return m0(j);
            case 4:
                return o0(j);
            case 5:
                return o0(AbstractC1726.Q(j, 10));
            case 6:
                return o0(AbstractC1726.Q(j, 100));
            case 7:
                return o0(AbstractC1726.Q(j, 1000));
            case 8:
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return c(AbstractC1726.P(G(enumC18762), j), enumC18762);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final C18991 o0(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        return p0(enumC18762.b.a(((long) this.a) + j, enumC18762), this.b, this.c);
    }

    public final C18991 m0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        long j3 = 12;
        return p0(enumC18762.b.a(AbstractC1726.z(j2, j3), enumC18762), ((int) AbstractC1726.O(j2, j3)) + 1, this.c);
    }

    public final C18991 n0(long j) {
        return l0(AbstractC1726.Q(j, 7));
    }

    public final C18991 l0(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            if (j2 <= 28) {
                return new C18991(this.a, this.b, (int) j2);
            }
            if (j2 <= 59) {
                long jD0 = d0();
                if (j2 <= jD0) {
                    return new C18991(this.a, this.b, (int) j2);
                }
                short s = this.b;
                if (s < 12) {
                    return new C18991(this.a, s + 1, (int) (j2 - jD0));
                }
                EnumC18762.YEAR.T(this.a + 1);
                return new C18991(this.a + 1, 1, (int) (j2 - jD0));
            }
        }
        return i0(AbstractC1726.P(H(), j));
    }

    @Override // l.InterfaceC17579
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C18991 w(long j, InterfaceC18056 interfaceC18056) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, interfaceC18056).d(1L, interfaceC18056) : d(-j, interfaceC18056);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        return c22935 == AbstractC23702.f ? this : AbstractC1726.g(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return AbstractC1726.a(this, interfaceC15235);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C18991 c18991X = X(interfaceC15235);
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return interfaceC18056.l(this, c18991X);
        }
        switch (AbstractC10651.b[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return c18991X.H() - H();
            case 2:
                return (c18991X.H() - H()) / 7;
            case 3:
                return f0(c18991X);
            case 4:
                return f0(c18991X) / 12;
            case 5:
                return f0(c18991X) / 120;
            case 6:
                return f0(c18991X) / 1200;
            case 7:
                return f0(c18991X) / 12000;
            case 8:
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return c18991X.G(enumC18762) - G(enumC18762);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final long f0(C18991 c18991) {
        return (((c18991.b0() * 32) + ((long) c18991.c)) - ((b0() * 32) + ((long) this.c))) / 32;
    }

    @Override // l.InterfaceC17579
    public final InterfaceC9819 I(C3363 c3363) {
        return C1952.Y(this, c3363);
    }

    public C10525 atStartOfDay(AbstractC9114 abstractC9114) {
        C13638.requireNonNull(abstractC9114, "zone");
        C1952 c1952Y = C1952.Y(this, C3363.g);
        if (!(abstractC9114 instanceof C2678)) {
            Object objE = abstractC9114.W().e(c1952Y);
            C13263 c13263 = objE instanceof C13263 ? (C13263) objE : null;
            if (c13263 != null && c13263.l()) {
                c1952Y = c13263.b.b0(c13263.d.b - c13263.c.b);
            }
        }
        return C10525.W(c1952Y, abstractC9114, null);
    }

    @Override // l.InterfaceC17579
    public final long H() {
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
            j5 = !u() ? j5 - 2 : j5 - 1;
        }
        return j5 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC17579 interfaceC17579) {
        if (interfaceC17579 instanceof C18991) {
            return V((C18991) interfaceC17579);
        }
        return AbstractC1726.b(this, interfaceC17579);
    }

    public final int V(C18991 c18991) {
        int i = this.a - c18991.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - c18991.b;
        return i2 == 0 ? this.c - c18991.c : i2;
    }

    public final boolean c0(InterfaceC17579 interfaceC17579) {
        if (interfaceC17579 instanceof C18991) {
            return V((C18991) interfaceC17579) < 0;
        }
        return H() < interfaceC17579.H();
    }

    @Override // l.InterfaceC17579
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18991) && V((C18991) obj) == 0;
    }

    @Override // l.InterfaceC17579
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // l.InterfaceC17579
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
        return new C3944((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
