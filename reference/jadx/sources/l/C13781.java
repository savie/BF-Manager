package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.۬ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13781 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    public static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((C13781) obj).a;
    }

    static {
        C11675 c11675 = new C11675();
        c11675.m(EnumC8692.YEAR, 4, 10, EnumC8079.EXCEEDS_PAD);
        c11675.q(Locale.getDefault(), EnumC18520.SMART, null);
    }

    public static C13781 of(int i) {
        EnumC8692.YEAR.P(i);
        return new C13781(i);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C13781 c13781Of;
        if (interfaceC1235 instanceof C13781) {
            c13781Of = (C13781) interfaceC1235;
        } else {
            C17359.requireNonNull(interfaceC1235, "temporal");
            try {
                if (!C20012.c.equals(AbstractC2946.r(interfaceC1235))) {
                    interfaceC1235 = C7816.T(interfaceC1235);
                }
                c13781Of = of(interfaceC1235.i(EnumC8692.YEAR));
            } catch (C21241 e) {
                throw new C21241("Unable to obtain Year from TemporalAccessor: " + interfaceC1235 + " of type " + interfaceC1235.getClass().getName(), e);
            }
        }
        if (interfaceC2726 instanceof EnumC10183) {
            long j = ((long) c13781Of.a) - ((long) this.a);
            int i = AbstractC18388.b[((EnumC10183) interfaceC2726).ordinal()];
            if (i == 1) {
                return j;
            }
            if (i == 2) {
                return j / 10;
            }
            if (i == 3) {
                return j / 100;
            }
            if (i == 4) {
                return j / 1000;
            }
            if (i == 5) {
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return c13781Of.C(enumC8692) - C(enumC8692);
            }
            throw new C16085("Unsupported unit: " + interfaceC2726);
        }
        return interfaceC2726.i(this, c13781Of);
    }

    public C13781(int i) {
        this.a = i;
    }

    public int getValue() {
        return this.a;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.YEAR || interfaceC16831 == EnumC8692.YEAR_OF_ERA || interfaceC16831 == EnumC8692.ERA;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.YEAR_OF_ERA) {
            return C23545.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        return k(interfaceC16831).a(C(interfaceC16831), interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i = AbstractC18388.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i == 1) {
            int i2 = this.a;
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return this.a;
        }
        if (i == 3) {
            return this.a < 1 ? 0 : 1;
        }
        throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final C13781 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C13781) interfaceC16831.C(this, j);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        enumC8692.P(j);
        int i = AbstractC18388.a[enumC8692.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return of((int) j);
        }
        if (i == 2) {
            return of((int) j);
        }
        if (i == 3) {
            return C(EnumC8692.ERA) == j ? this : of(1 - this.a);
        }
        throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final C13781 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return (C13781) interfaceC2726.j(this, j);
        }
        int i = AbstractC18388.b[((EnumC10183) interfaceC2726).ordinal()];
        if (i == 1) {
            return S(j);
        }
        if (i == 2) {
            return S(AbstractC1758.Q(j, 10));
        }
        if (i == 3) {
            return S(AbstractC1758.Q(j, 100));
        }
        if (i == 4) {
            return S(AbstractC1758.Q(j, 1000));
        }
        if (i == 5) {
            EnumC8692 enumC8692 = EnumC8692.ERA;
            return b(AbstractC1758.P(C(enumC8692), j), enumC8692);
        }
        throw new C16085("Unsupported unit: " + interfaceC2726);
    }

    public final C13781 S(long j) {
        if (j == 0) {
            return this;
        }
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        return of(enumC8692.b.a(((long) this.a) + j, enumC8692));
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
            return EnumC10183.YEARS;
        }
        return AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        if (!AbstractC2946.r(interfaceC1235).equals(C20012.c)) {
            throw new C21241("Adjustment only supported on ISO date-time");
        }
        return interfaceC1235.b(this.a, EnumC8692.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C13781) && this.a == ((C13781) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new C21372((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C13781) AbstractC1758.a(c7816, this);
    }
}
