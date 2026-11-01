package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۙܿᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4795 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    public static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((C4795) obj).a;
    }

    static {
        C16770 c16770 = new C16770();
        c16770.m(EnumC18762.YEAR, 4, 10, EnumC1247.EXCEEDS_PAD);
        c16770.q(Locale.getDefault(), EnumC5481.SMART, null);
    }

    public static C4795 V(int i) {
        EnumC18762.YEAR.T(i);
        return new C4795(i);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C4795 c4795V;
        if (interfaceC15235 instanceof C4795) {
            c4795V = (C4795) interfaceC15235;
        } else {
            C13638.requireNonNull(interfaceC15235, "temporal");
            try {
                if (!C7122.c.equals(AbstractC14884.r(interfaceC15235))) {
                    interfaceC15235 = C18991.X(interfaceC15235);
                }
                c4795V = V(interfaceC15235.l(EnumC18762.YEAR));
            } catch (C15464 e) {
                throw new C15464("Unable to obtain Year from TemporalAccessor: " + interfaceC15235 + " of type " + interfaceC15235.getClass().getName(), e);
            }
        }
        if (interfaceC18056 instanceof EnumC22996) {
            long j = ((long) c4795V.a) - ((long) this.a);
            int i = AbstractC6767.b[((EnumC22996) interfaceC18056).ordinal()];
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
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return c4795V.G(enumC18762) - G(enumC18762);
            }
            throw new C14530("Unsupported unit: " + interfaceC18056);
        }
        return interfaceC18056.l(this, c4795V);
    }

    public C4795(int i) {
        this.a = i;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.YEAR || interfaceC11002 == EnumC18762.YEAR_OF_ERA || interfaceC11002 == EnumC18762.ERA;
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
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i = AbstractC6767.a[((EnumC18762) interfaceC11002).ordinal()];
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
        throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C4795 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C4795) interfaceC11002.G(this, j);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        enumC18762.T(j);
        int i = AbstractC6767.a[enumC18762.ordinal()];
        if (i == 1) {
            if (this.a < 1) {
                j = 1 - j;
            }
            return V((int) j);
        }
        if (i == 2) {
            return V((int) j);
        }
        if (i == 3) {
            return G(EnumC18762.ERA) == j ? this : V(1 - this.a);
        }
        throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public final C4795 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C4795) interfaceC18056.m(this, j);
        }
        int i = AbstractC6767.b[((EnumC22996) interfaceC18056).ordinal()];
        if (i == 1) {
            return X(j);
        }
        if (i == 2) {
            return X(AbstractC1726.Q(j, 10));
        }
        if (i == 3) {
            return X(AbstractC1726.Q(j, 100));
        }
        if (i == 4) {
            return X(AbstractC1726.Q(j, 1000));
        }
        if (i == 5) {
            EnumC18762 enumC18762 = EnumC18762.ERA;
            return c(AbstractC1726.P(G(enumC18762), j), enumC18762);
        }
        throw new C14530("Unsupported unit: " + interfaceC18056);
    }

    public final C4795 X(long j) {
        if (j == 0) {
            return this;
        }
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        return V(enumC18762.b.a(((long) this.a) + j, enumC18762));
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
            return EnumC22996.YEARS;
        }
        return AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        if (!AbstractC14884.r(interfaceC15235).equals(C7122.c)) {
            throw new C15464("Adjustment only supported on ISO date-time");
        }
        return interfaceC15235.c(this.a, EnumC18762.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4795) && this.a == ((C4795) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new C3944((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C4795) AbstractC1726.a(c18991, this);
    }
}
