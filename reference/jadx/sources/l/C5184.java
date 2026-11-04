package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5184 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C5184 c5184 = (C5184) obj;
        int i = this.a - c5184.a;
        return i == 0 ? this.b - c5184.b : i;
    }

    static {
        C11675 c11675 = new C11675();
        c11675.m(EnumC8692.YEAR, 4, 10, EnumC8079.EXCEEDS_PAD);
        c11675.d('-');
        c11675.l(EnumC8692.MONTH_OF_YEAR, 2);
        c11675.q(Locale.getDefault(), EnumC18520.SMART, null);
    }

    public static C5184 of(int i, int i2) {
        EnumC8692.YEAR.P(i);
        EnumC8692.MONTH_OF_YEAR.P(i2);
        return new C5184(i, i2);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C5184 c5184Of;
        if (interfaceC1235 instanceof C5184) {
            c5184Of = (C5184) interfaceC1235;
        } else {
            C17359.requireNonNull(interfaceC1235, "temporal");
            try {
                if (!C20012.c.equals(AbstractC2946.r(interfaceC1235))) {
                    interfaceC1235 = C7816.T(interfaceC1235);
                }
                c5184Of = of(interfaceC1235.i(EnumC8692.YEAR), interfaceC1235.i(EnumC8692.MONTH_OF_YEAR));
            } catch (C21241 e) {
                throw new C21241("Unable to obtain YearMonth from TemporalAccessor: " + interfaceC1235 + " of type " + interfaceC1235.getClass().getName(), e);
            }
        }
        if (interfaceC2726 instanceof EnumC10183) {
            long jR = c5184Of.R() - R();
            switch (AbstractC0489.b[((EnumC10183) interfaceC2726).ordinal()]) {
                case 1:
                    return jR;
                case 2:
                    return jR / 12;
                case 3:
                    return jR / 120;
                case 4:
                    return jR / 1200;
                case 5:
                    return jR / 12000;
                case 6:
                    EnumC8692 enumC8692 = EnumC8692.ERA;
                    return c5184Of.C(enumC8692) - C(enumC8692);
                default:
                    throw new C16085("Unsupported unit: " + interfaceC2726);
            }
        }
        return interfaceC2726.i(this, c5184Of);
    }

    public C5184(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final C5184 V(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new C5184(i, i2);
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.YEAR || interfaceC16831 == EnumC8692.MONTH_OF_YEAR || interfaceC16831 == EnumC8692.PROLEPTIC_MONTH || interfaceC16831 == EnumC8692.YEAR_OF_ERA || interfaceC16831 == EnumC8692.ERA;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.YEAR_OF_ERA) {
            return C23545.f(1L, getYear() <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        return k(interfaceC16831).a(C(interfaceC16831), interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        int i;
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i2 = AbstractC0489.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return R();
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
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
            }
            i = this.a;
        }
        return i;
    }

    public final long R() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    public int getYear() {
        return this.a;
    }

    public int getMonthValue() {
        return this.b;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C5184 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C5184) interfaceC16831.C(this, j);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        enumC8692.P(j);
        int i = AbstractC0489.a[enumC8692.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            EnumC8692.MONTH_OF_YEAR.P(i2);
            return V(this.a, i2);
        }
        if (i == 2) {
            return T(j - R());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            EnumC8692.YEAR.P(i3);
            return V(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            EnumC8692.YEAR.P(i4);
            return V(i4, this.b);
        }
        if (i != 5) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        if (C(EnumC8692.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        EnumC8692.YEAR.P(i5);
        return V(i5, this.b);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C5184 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return (C5184) interfaceC2726.j(this, j);
        }
        switch (AbstractC0489.b[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return U(j);
            case 3:
                return U(AbstractC1758.Q(j, 10));
            case 4:
                return U(AbstractC1758.Q(j, 100));
            case 5:
                return U(AbstractC1758.Q(j, 1000));
            case 6:
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return b(AbstractC1758.P(C(enumC8692), j), enumC8692);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final C5184 U(long j) {
        if (j == 0) {
            return this;
        }
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        return V(enumC8692.b.a(((long) this.a) + j, enumC8692), this.b);
    }

    public final C5184 T(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        long j3 = 12;
        return V(enumC8692.b.a(AbstractC1758.z(j2, j3), enumC8692), ((int) AbstractC1758.O(j2, j3)) + 1);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.b) {
            return C20012.c;
        }
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.MONTHS;
        }
        return AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        if (!AbstractC2946.r(interfaceC1235).equals(C20012.c)) {
            throw new C21241("Adjustment only supported on ISO date-time");
        }
        return interfaceC1235.b(R(), EnumC8692.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5184) {
            C5184 c5184 = (C5184) obj;
            if (this.a == c5184.a && this.b == c5184.b) {
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
        return new C21372((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C5184) AbstractC1758.a(c7816, this);
    }
}
