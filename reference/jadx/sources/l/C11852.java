package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۨܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11852 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C11852 c11852 = (C11852) obj;
        int i = this.a - c11852.a;
        return i == 0 ? this.b - c11852.b : i;
    }

    static {
        C16770 c16770 = new C16770();
        c16770.m(EnumC18762.YEAR, 4, 10, EnumC1247.EXCEEDS_PAD);
        c16770.d('-');
        c16770.l(EnumC18762.MONTH_OF_YEAR, 2);
        c16770.q(Locale.getDefault(), EnumC5481.SMART, null);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C11852 c11852;
        if (interfaceC15235 instanceof C11852) {
            c11852 = (C11852) interfaceC15235;
        } else {
            C13638.requireNonNull(interfaceC15235, "temporal");
            try {
                if (!C7122.c.equals(AbstractC14884.r(interfaceC15235))) {
                    interfaceC15235 = C18991.X(interfaceC15235);
                }
                EnumC18762 enumC18762 = EnumC18762.YEAR;
                int iL = interfaceC15235.l(enumC18762);
                EnumC18762 enumC18763 = EnumC18762.MONTH_OF_YEAR;
                int iL2 = interfaceC15235.l(enumC18763);
                enumC18762.T(iL);
                enumC18763.T(iL2);
                c11852 = new C11852(iL, iL2);
            } catch (C15464 e) {
                throw new C15464("Unable to obtain YearMonth from TemporalAccessor: " + interfaceC15235 + " of type " + interfaceC15235.getClass().getName(), e);
            }
        }
        if (interfaceC18056 instanceof EnumC22996) {
            long jV = c11852.V() - V();
            switch (AbstractC13969.b[((EnumC22996) interfaceC18056).ordinal()]) {
                case 1:
                    return jV;
                case 2:
                    return jV / 12;
                case 3:
                    return jV / 120;
                case 4:
                    return jV / 1200;
                case 5:
                    return jV / 12000;
                case 6:
                    EnumC18762 enumC18764 = EnumC18762.ERA;
                    return c11852.G(enumC18764) - G(enumC18764);
                default:
                    throw new C14530("Unsupported unit: " + interfaceC18056);
            }
        }
        return interfaceC18056.l(this, c11852);
    }

    public C11852(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final C11852 Z(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new C11852(i, i2);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.YEAR || interfaceC11002 == EnumC18762.MONTH_OF_YEAR || interfaceC11002 == EnumC18762.PROLEPTIC_MONTH || interfaceC11002 == EnumC18762.YEAR_OF_ERA || interfaceC11002 == EnumC18762.ERA;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.YEAR_OF_ERA) {
            return C1828.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        return n(interfaceC11002).a(G(interfaceC11002), interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        int i;
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i2 = AbstractC13969.a[((EnumC18762) interfaceC11002).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return V();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
            }
            i = this.a;
        }
        return i;
    }

    public final long V() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C11852 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C11852) interfaceC11002.G(this, j);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        enumC18762.T(j);
        int i = AbstractC13969.a[enumC18762.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            EnumC18762.MONTH_OF_YEAR.T(i2);
            return Z(this.a, i2);
        }
        if (i == 2) {
            return X(j - V());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            EnumC18762.YEAR.T(i3);
            return Z(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            EnumC18762.YEAR.T(i4);
            return Z(i4, this.b);
        }
        if (i != 5) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        if (G(EnumC18762.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        EnumC18762.YEAR.T(i5);
        return Z(i5, this.b);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C11852 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C11852) interfaceC18056.m(this, j);
        }
        switch (AbstractC13969.b[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return Y(j);
            case 3:
                return Y(AbstractC1726.Q(j, 10));
            case 4:
                return Y(AbstractC1726.Q(j, 100));
            case 5:
                return Y(AbstractC1726.Q(j, 1000));
            case 6:
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return c(AbstractC1726.P(G(enumC18762), j), enumC18762);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final C11852 Y(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        return Z(enumC18762.b.a(((long) this.a) + j, enumC18762), this.b);
    }

    public final C11852 X(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        long j3 = 12;
        return Z(enumC18762.b.a(AbstractC1726.z(j2, j3), enumC18762), ((int) AbstractC1726.O(j2, j3)) + 1);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.b) {
            return C7122.c;
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.MONTHS;
        }
        return AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        if (!AbstractC14884.r(interfaceC15235).equals(C7122.c)) {
            throw new C15464("Adjustment only supported on ISO date-time");
        }
        return interfaceC15235.c(V(), EnumC18762.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11852) {
            C11852 c11852 = (C11852) obj;
            if (this.a == c11852.a && this.b == c11852.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a ^ (this.b << 27);
    }

    public final String toString() {
        int iAbs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + 10000);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C3944((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C11852) AbstractC1726.a(c18991, this);
    }
}
