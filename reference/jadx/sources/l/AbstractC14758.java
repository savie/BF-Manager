package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ܳ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC14758 implements InterfaceC17579, InterfaceC15235, InterfaceC12413, Serializable {
    public static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ int compareTo(InterfaceC17579 interfaceC17579) {
        return AbstractC1726.b(this, interfaceC17579);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ Object T(C22935 c22935) {
        return AbstractC1726.g(this, c22935);
    }

    public abstract InterfaceC17579 X(long j);

    public abstract InterfaceC17579 Y(long j);

    public abstract InterfaceC17579 Z(long j);

    @Override // l.InterfaceC17579, l.InterfaceC21584
    public /* synthetic */ boolean e(InterfaceC11002 interfaceC11002) {
        return AbstractC1726.f(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public /* synthetic */ C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC12413
    public final /* synthetic */ InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return AbstractC1726.a(this, interfaceC15235);
    }

    public static InterfaceC17579 V(InterfaceC21233 interfaceC21233, InterfaceC15235 interfaceC15235) {
        InterfaceC17579 interfaceC17579 = (InterfaceC17579) interfaceC15235;
        if (interfaceC21233.equals(interfaceC17579.a())) {
            return interfaceC17579;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC21233.k() + ", actual: " + interfaceC17579.a().k());
    }

    @Override // l.InterfaceC17579
    public InterfaceC9819 I(C3363 c3363) {
        return new C11356(this, c3363);
    }

    @Override // l.InterfaceC15235
    public InterfaceC17579 d(long j, InterfaceC18056 interfaceC18056) {
        boolean z = interfaceC18056 instanceof EnumC22996;
        if (!z) {
            if (!z) {
                return V(a(), interfaceC18056.m(this, j));
            }
            throw new C14530("Unsupported unit: " + interfaceC18056);
        }
        switch (AbstractC11230.a[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return X(j);
            case 2:
                return X(AbstractC1726.Q(j, 7));
            case 3:
                return Y(j);
            case 4:
                return Z(j);
            case 5:
                return Z(AbstractC1726.Q(j, 10));
            case 6:
                return Z(AbstractC1726.Q(j, 100));
            case 7:
                return Z(AbstractC1726.Q(j, 1000));
            case 8:
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return c(AbstractC1726.P(G(enumC18762), j), (InterfaceC11002) enumC18762);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    @Override // l.InterfaceC17579
    public InterfaceC17705 K() {
        return a().y(AbstractC23702.a(this, EnumC18762.ERA));
    }

    @Override // l.InterfaceC17579
    public boolean u() {
        return a().S(G(EnumC18762.YEAR));
    }

    @Override // l.InterfaceC17579
    public int Q() {
        return u() ? 366 : 365;
    }

    @Override // l.InterfaceC17579, l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C13638.requireNonNull(interfaceC15235, "endExclusive");
        InterfaceC17579 interfaceC17579E = a().E(interfaceC15235);
        if (!(interfaceC18056 instanceof EnumC22996)) {
            C13638.requireNonNull(interfaceC18056, "unit");
            return interfaceC18056.l(this, interfaceC17579E);
        }
        switch (AbstractC11230.a[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return interfaceC17579E.H() - H();
            case 2:
                return (interfaceC17579E.H() - H()) / 7;
            case 3:
                return W(interfaceC17579E);
            case 4:
                return W(interfaceC17579E) / 12;
            case 5:
                return W(interfaceC17579E) / 120;
            case 6:
                return W(interfaceC17579E) / 1200;
            case 7:
                return W(interfaceC17579E) / 12000;
            case 8:
                EnumC18762 enumC18762 = EnumC18762.ERA;
                return interfaceC17579E.G(enumC18762) - G(enumC18762);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final long W(InterfaceC17579 interfaceC17579) {
        if (a().v(EnumC18762.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC18762 enumC18762 = EnumC18762.PROLEPTIC_MONTH;
        long jG = G(enumC18762) * 32;
        EnumC18762 enumC18763 = EnumC18762.DAY_OF_MONTH;
        return (((interfaceC17579.G(enumC18762) * 32) + ((long) interfaceC17579.l(enumC18763))) - (jG + ((long) AbstractC23702.a(this, enumC18763)))) / 32;
    }

    @Override // l.InterfaceC17579
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC17579) && AbstractC1726.b(this, (InterfaceC17579) obj) == 0;
    }

    @Override // l.InterfaceC17579
    public int hashCode() {
        long jH = H();
        return a().hashCode() ^ ((int) (jH ^ (jH >>> 32)));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: B */
    public InterfaceC17579 m(InterfaceC12413 interfaceC12413) {
        return V(a(), interfaceC12413.s(this));
    }

    @Override // l.InterfaceC17579
    public final String toString() {
        long jG = G(EnumC18762.YEAR_OF_ERA);
        long jG2 = G(EnumC18762.MONTH_OF_YEAR);
        long jG3 = G(EnumC18762.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(K());
        sb.append(" ");
        sb.append(jG);
        sb.append(jG2 < 10 ? "-0" : "-");
        sb.append(jG2);
        sb.append(jG3 < 10 ? "-0" : "-");
        sb.append(jG3);
        return sb.toString();
    }

    @Override // l.InterfaceC15235
    public InterfaceC17579 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return V(a(), interfaceC11002.G(this, j));
    }

    @Override // l.InterfaceC17579
    public InterfaceC17579 N(InterfaceC6062 interfaceC6062) {
        return V(a(), interfaceC6062.l(this));
    }

    @Override // l.InterfaceC15235
    public InterfaceC17579 w(long j, InterfaceC18056 interfaceC18056) {
        return V(a(), AbstractC23702.b(this, j, interfaceC18056));
    }

    @Override // l.InterfaceC17579
    public long H() {
        return G(EnumC18762.EPOCH_DAY);
    }
}
