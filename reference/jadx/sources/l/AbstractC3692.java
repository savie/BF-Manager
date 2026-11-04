package l;

import java.io.Serializable;

/* JADX INFO: renamed from: l.ۗ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3692 implements InterfaceC17116, InterfaceC1235, InterfaceC1916, Serializable {
    public static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ int compareTo(InterfaceC17116 interfaceC17116) {
        return AbstractC1758.b(this, interfaceC17116);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ Object P(C14435 c14435) {
        return AbstractC1758.g(this, c14435);
    }

    public abstract InterfaceC17116 T(long j);

    public abstract InterfaceC17116 U(long j);

    public abstract InterfaceC17116 V(long j);

    @Override // l.InterfaceC17116, l.InterfaceC9437
    public /* synthetic */ boolean d(InterfaceC16831 interfaceC16831) {
        return AbstractC1758.f(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public /* synthetic */ C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC1916
    public final /* synthetic */ InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return AbstractC1758.a(this, interfaceC1235);
    }

    public static InterfaceC17116 R(InterfaceC8912 interfaceC8912, InterfaceC1235 interfaceC1235) {
        InterfaceC17116 interfaceC17116 = (InterfaceC17116) interfaceC1235;
        if (interfaceC8912.equals(interfaceC17116.a())) {
            return interfaceC17116;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + interfaceC8912.getId() + ", actual: " + interfaceC17116.a().getId());
    }

    @Override // l.InterfaceC17116
    public InterfaceC12641 E(C10052 c10052) {
        return new C14878(this, c10052);
    }

    @Override // l.InterfaceC1235
    public InterfaceC17116 c(long j, InterfaceC2726 interfaceC2726) {
        boolean z = interfaceC2726 instanceof EnumC10183;
        if (!z) {
            if (!z) {
                return R(a(), interfaceC2726.j(this, j));
            }
            throw new C16085("Unsupported unit: " + interfaceC2726);
        }
        switch (AbstractC16370.a[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return T(AbstractC1758.Q(j, 7));
            case 3:
                return U(j);
            case 4:
                return V(j);
            case 5:
                return V(AbstractC1758.Q(j, 10));
            case 6:
                return V(AbstractC1758.Q(j, 100));
            case 7:
                return V(AbstractC1758.Q(j, 1000));
            case 8:
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return b(AbstractC1758.P(C(enumC8692), j), (InterfaceC16831) enumC8692);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    @Override // l.InterfaceC17116
    public InterfaceC7421 G() {
        return a().v(AbstractC17577.a(this, EnumC8692.ERA));
    }

    @Override // l.InterfaceC17116
    public boolean r() {
        return a().O(C(EnumC8692.YEAR));
    }

    @Override // l.InterfaceC17116
    public int M() {
        return r() ? 366 : 365;
    }

    @Override // l.InterfaceC17116, l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C17359.requireNonNull(interfaceC1235, "endExclusive");
        InterfaceC17116 interfaceC17116B = a().B(interfaceC1235);
        if (!(interfaceC2726 instanceof EnumC10183)) {
            C17359.requireNonNull(interfaceC2726, "unit");
            return interfaceC2726.i(this, interfaceC17116B);
        }
        switch (AbstractC16370.a[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return interfaceC17116B.D() - D();
            case 2:
                return (interfaceC17116B.D() - D()) / 7;
            case 3:
                return S(interfaceC17116B);
            case 4:
                return S(interfaceC17116B) / 12;
            case 5:
                return S(interfaceC17116B) / 120;
            case 6:
                return S(interfaceC17116B) / 1200;
            case 7:
                return S(interfaceC17116B) / 12000;
            case 8:
                EnumC8692 enumC8692 = EnumC8692.ERA;
                return interfaceC17116B.C(enumC8692) - C(enumC8692);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final long S(InterfaceC17116 interfaceC17116) {
        if (a().s(EnumC8692.MONTH_OF_YEAR).d != 12) {
            throw new IllegalStateException("ChronoLocalDateImpl only supports Chronologies with 12 months per year");
        }
        EnumC8692 enumC8692 = EnumC8692.PROLEPTIC_MONTH;
        long jC = C(enumC8692) * 32;
        EnumC8692 enumC8693 = EnumC8692.DAY_OF_MONTH;
        return (((interfaceC17116.C(enumC8692) * 32) + ((long) interfaceC17116.i(enumC8693))) - (jC + ((long) AbstractC17577.a(this, enumC8693)))) / 32;
    }

    @Override // l.InterfaceC17116
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC17116) && AbstractC1758.b(this, (InterfaceC17116) obj) == 0;
    }

    @Override // l.InterfaceC17116
    public int hashCode() {
        long jD = D();
        return a().hashCode() ^ ((int) (jD ^ (jD >>> 32)));
    }

    @Override // l.InterfaceC1235
    public InterfaceC17116 y(InterfaceC1916 interfaceC1916) {
        return R(a(), interfaceC1916.p(this));
    }

    @Override // l.InterfaceC17116
    public final String toString() {
        long jC = C(EnumC8692.YEAR_OF_ERA);
        long jC2 = C(EnumC8692.MONTH_OF_YEAR);
        long jC3 = C(EnumC8692.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(G());
        sb.append(" ");
        sb.append(jC);
        sb.append(jC2 < 10 ? "-0" : "-");
        sb.append(jC2);
        sb.append(jC3 < 10 ? "-0" : "-");
        sb.append(jC3);
        return sb.toString();
    }

    @Override // l.InterfaceC1235
    public InterfaceC17116 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return R(a(), interfaceC16831.C(this, j));
    }

    @Override // l.InterfaceC17116
    public InterfaceC17116 J(InterfaceC25037 interfaceC25037) {
        return R(a(), interfaceC25037.i(this));
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: t */
    public InterfaceC17116 z(long j, InterfaceC2726 interfaceC2726) {
        return R(a(), AbstractC17577.b(this, j, interfaceC2726));
    }

    @Override // l.InterfaceC17116
    public long D() {
        return C(EnumC8692.EPOCH_DAY);
    }
}
