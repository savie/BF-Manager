package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܰ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14878 implements InterfaceC12641, InterfaceC1235, InterfaceC1916, Serializable {
    public static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC17116 a;
    public final transient C10052 b;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int compareTo(InterfaceC12641 interfaceC12641) {
        return AbstractC1758.c(this, interfaceC12641);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ Object P(C14435 c14435) {
        return AbstractC1758.h(this, c14435);
    }

    @Override // l.InterfaceC12641
    public final /* synthetic */ long o(C11149 c11149) {
        return AbstractC1758.j(this, c11149);
    }

    public static C14878 R(InterfaceC8912 interfaceC8912, InterfaceC1235 interfaceC1235) {
        C14878 c14878 = (C14878) interfaceC1235;
        if (interfaceC8912.equals(c14878.a.a())) {
            return c14878;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC8912.getId() + ", actual: " + c14878.a.a().getId());
    }

    public C14878(InterfaceC17116 interfaceC17116, C10052 c10052) {
        C17359.requireNonNull(interfaceC17116, "date");
        C17359.requireNonNull(c10052, "time");
        this.a = interfaceC17116;
        this.b = c10052;
    }

    public final C14878 V(InterfaceC1235 interfaceC1235, C10052 c10052) {
        InterfaceC17116 interfaceC17116 = this.a;
        return (interfaceC17116 == interfaceC1235 && this.b == c10052) ? this : new C14878(AbstractC3692.R(interfaceC17116.a(), interfaceC1235), c10052);
    }

    @Override // l.InterfaceC12641
    public final InterfaceC8912 a() {
        return this.a.a();
    }

    @Override // l.InterfaceC12641
    public final InterfaceC17116 e() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return R(this.a.a(), AbstractC17577.b(this, j, enumC10183));
    }

    @Override // l.InterfaceC12641
    public final C10052 toLocalTime() {
        return this.b;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831 != null && interfaceC16831.i(this);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        return enumC8692.isDateBased() || enumC8692.R();
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (!((EnumC8692) interfaceC16831).R()) {
                return this.a.k(interfaceC16831);
            }
            C10052 c10052 = this.b;
            c10052.getClass();
            return AbstractC17577.d(c10052, interfaceC16831);
        }
        return interfaceC16831.j(this);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R() ? this.b.i(interfaceC16831) : this.a.i(interfaceC16831);
        }
        return k(interfaceC16831).a(C(interfaceC16831), interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R() ? this.b.C(interfaceC16831) : this.a.C(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return V(c7816, this.b);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final C14878 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (((EnumC8692) interfaceC16831).R()) {
                return V(this.a, this.b.b(j, interfaceC16831));
            }
            return V(this.a.b(j, interfaceC16831), this.b);
        }
        return R(this.a.a(), interfaceC16831.C(this, j));
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final C14878 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return R(this.a.a(), interfaceC2726.j(this, j));
        }
        switch (AbstractC24576.a[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return T(this.a, 0L, 0L, 0L, j);
            case 2:
                C14878 c14878V = V(this.a.c(j / 86400000000L, (InterfaceC2726) EnumC10183.DAYS), this.b);
                return c14878V.T(c14878V.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C14878 c14878V2 = V(this.a.c(j / 86400000, (InterfaceC2726) EnumC10183.DAYS), this.b);
                return c14878V2.T(c14878V2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return T(this.a, 0L, 0L, j, 0L);
            case 5:
                return T(this.a, 0L, j, 0L, 0L);
            case 6:
                return T(this.a, j, 0L, 0L, 0L);
            case 7:
                C14878 c14878V3 = V(this.a.c(j / 256, (InterfaceC2726) EnumC10183.DAYS), this.b);
                return c14878V3.T(c14878V3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return V(this.a.c(j, interfaceC2726), this.b);
        }
    }

    public final C14878 T(InterfaceC17116 interfaceC17116, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return V(interfaceC17116, this.b);
        }
        long j5 = j / 24;
        long j6 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jC0 = this.b.c0();
        long j7 = j6 + jC0;
        long jZ = AbstractC1758.z(j7, 86400000000000L) + j5 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long jO = AbstractC1758.O(j7, 86400000000000L);
        return V(interfaceC17116.c(jZ, (InterfaceC2726) EnumC10183.DAYS), jO == jC0 ? this.b : C10052.V(jO));
    }

    @Override // l.InterfaceC12641
    public final InterfaceC5930 A(AbstractC22338 abstractC22338) {
        return C9657.R(abstractC22338, null, this);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        int i;
        C17359.requireNonNull(interfaceC1235, "endExclusive");
        InterfaceC12641 interfaceC12641F = this.a.a().F(interfaceC1235);
        if (!(interfaceC2726 instanceof EnumC10183)) {
            C17359.requireNonNull(interfaceC2726, "unit");
            return interfaceC2726.i(this, interfaceC12641F);
        }
        EnumC10183 enumC10183 = (EnumC10183) interfaceC2726;
        EnumC10183 enumC10184 = EnumC10183.DAYS;
        if (enumC10183.compareTo(enumC10184) >= 0) {
            InterfaceC17116 interfaceC17116E = interfaceC12641F.e();
            if (interfaceC12641F.toLocalTime().compareTo(this.b) < 0) {
                interfaceC17116E = interfaceC17116E.z(1L, enumC10184);
            }
            return this.a.f(interfaceC17116E, interfaceC2726);
        }
        EnumC8692 enumC8692 = EnumC8692.EPOCH_DAY;
        long jC = interfaceC12641F.C(enumC8692) - this.a.C(enumC8692);
        switch (AbstractC24576.a[enumC10183.ordinal()]) {
            case 1:
                jC = AbstractC1758.Q(jC, 86400000000000L);
                break;
            case 2:
                jC = AbstractC1758.Q(jC, 86400000000L);
                break;
            case 3:
                jC = AbstractC1758.Q(jC, 86400000L);
                break;
            case 4:
                i = 86400;
                jC = AbstractC1758.Q(jC, i);
                break;
            case 5:
                i = 1440;
                jC = AbstractC1758.Q(jC, i);
                break;
            case 6:
                i = 24;
                jC = AbstractC1758.Q(jC, i);
                break;
            case 7:
                i = 2;
                jC = AbstractC1758.Q(jC, i);
                break;
        }
        return AbstractC1758.P(jC, this.b.f(interfaceC12641F.toLocalTime(), interfaceC2726));
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(e().D(), EnumC8692.EPOCH_DAY).b(toLocalTime().c0(), EnumC8692.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new C6676((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC12641) && AbstractC1758.c(this, (InterfaceC12641) obj) == 0;
    }
}
