package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩳۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19003 implements InterfaceC1235, InterfaceC1916, InterfaceC12641, Serializable {
    public static final C19003 c = of(C7816.d, C10052.e);
    public static final C19003 d = of(C7816.e, C10052.f);
    public static final long serialVersionUID = 6207766400415563566L;
    public final C7816 a;
    public final C10052 b;

    @Override // l.InterfaceC12641
    public final /* synthetic */ long o(C11149 c11149) {
        return AbstractC1758.j(this, c11149);
    }

    @Override // l.InterfaceC12641
    public final InterfaceC8912 a() {
        return ((C7816) e()).a();
    }

    @Override // l.InterfaceC12641
    public final InterfaceC5930 A(AbstractC22338 abstractC22338) {
        return C23084.S(this, null, abstractC22338);
    }

    public static C19003 of(C7816 c7816, C10052 c10052) {
        C17359.requireNonNull(c7816, "date");
        C17359.requireNonNull(c10052, "time");
        return new C19003(c7816, c10052);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(((C7816) e()).D(), EnumC8692.EPOCH_DAY).b(toLocalTime().c0(), EnumC8692.NANO_OF_DAY);
    }

    public static C19003 U(long j, int i, C11149 c11149) {
        C17359.requireNonNull(c11149, "offset");
        long j2 = i;
        EnumC8692.NANO_OF_SECOND.P(j2);
        long totalSeconds = j + ((long) c11149.getTotalSeconds());
        long j3 = 86400;
        return new C19003(C7816.d0(AbstractC1758.z(totalSeconds, j3)), C10052.V((((long) ((int) AbstractC1758.O(totalSeconds, j3))) * 1000000000) + j2));
    }

    public static C19003 S(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C19003) {
            return (C19003) interfaceC9437;
        }
        if (interfaceC9437 instanceof C23084) {
            return ((C23084) interfaceC9437).q();
        }
        if (interfaceC9437 instanceof C9306) {
            return ((C9306) interfaceC9437).toLocalDateTime();
        }
        try {
            return new C19003(C7816.T(interfaceC9437), C10052.T(interfaceC9437));
        } catch (C21241 e) {
            throw new C21241("Unable to obtain LocalDateTime from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName(), e);
        }
    }

    public C19003(C7816 c7816, C10052 c10052) {
        this.a = c7816;
        this.b = c10052;
    }

    public final C19003 Z(C7816 c7816, C10052 c10052) {
        return (this.a == c7816 && this.b == c10052) ? this : new C19003(c7816, c10052);
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
            if (((EnumC8692) interfaceC16831).R()) {
                C10052 c10052 = this.b;
                c10052.getClass();
                return AbstractC17577.d(c10052, interfaceC16831);
            }
            return this.a.k(interfaceC16831);
        }
        return interfaceC16831.j(this);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R() ? this.b.i(interfaceC16831) : this.a.i(interfaceC16831);
        }
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).R() ? this.b.C(interfaceC16831) : this.a.C(interfaceC16831);
        }
        return interfaceC16831.z(this);
    }

    @Override // l.InterfaceC12641
    /* JADX INFO: renamed from: toLocalDate, reason: merged with bridge method [inline-methods] */
    public C7816 e() {
        return this.a;
    }

    @Override // l.InterfaceC12641
    public C10052 toLocalTime() {
        return this.b;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return Z(c7816, this.b);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C19003 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            if (((EnumC8692) interfaceC16831).R()) {
                return Z(this.a, this.b.b(j, interfaceC16831));
            }
            return Z(this.a.b(j, interfaceC16831), this.b);
        }
        return (C19003) interfaceC16831.C(this, j);
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C19003 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return (C19003) interfaceC2726.j(this, j);
        }
        switch (AbstractC3472.a[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return X(this.a, 0L, 0L, 0L, j);
            case 2:
                C19003 c19003Z = Z(this.a.g0(j / 86400000000L), this.b);
                return c19003Z.X(c19003Z.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
            case 3:
                C19003 c19003Z2 = Z(this.a.g0(j / 86400000), this.b);
                return c19003Z2.X(c19003Z2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
            case 4:
                return W(j);
            case 5:
                return X(this.a, 0L, j, 0L, 0L);
            case 6:
                return X(this.a, j, 0L, 0L, 0L);
            case 7:
                C19003 c19003Z3 = Z(this.a.g0(j / 256), this.b);
                return c19003Z3.X(c19003Z3.a, (j % 256) * 12, 0L, 0L, 0L);
            default:
                return Z(this.a.c(j, interfaceC2726), this.b);
        }
    }

    public final C19003 W(long j) {
        return X(this.a, 0L, 0L, j, 0L);
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    public final C19003 X(C7816 c7816, long j, long j2, long j3, long j4) {
        if ((j | j2 | j3 | j4) == 0) {
            return Z(c7816, this.b);
        }
        long j5 = 1;
        long jC0 = this.b.c0();
        long j6 = ((((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L)) * j5) + jC0;
        long jZ = AbstractC1758.z(j6, 86400000000000L) + (((j / 24) + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L)) * j5);
        long jO = AbstractC1758.O(j6, 86400000000000L);
        return Z(c7816.g0(jZ), jO == jC0 ? this.b : C10052.V(jO));
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.f) {
            return this.a;
        }
        return AbstractC1758.h(this, c14435);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d7  */
    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        long jQ;
        long j;
        C19003 c19003S = S(interfaceC1235);
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return interfaceC2726.i(this, c19003S);
        }
        EnumC10183 enumC10183 = (EnumC10183) interfaceC2726;
        if (enumC10183.compareTo(EnumC10183.DAYS) >= 0) {
            C7816 c7816G0 = c19003S.a;
            C7816 c7816 = this.a;
            if (c7816 == null) {
                if (c7816G0.D() > c7816.D()) {
                    if (c19003S.b.compareTo(this.b) < 0) {
                        c7816G0 = c7816G0.g0(-1L);
                    }
                }
                return this.a.f(c7816G0, interfaceC2726);
            }
            c7816G0.getClass();
            if (c7816G0.R(c7816) > 0) {
                if (c19003S.b.compareTo(this.b) < 0) {
                    c7816G0 = c7816G0.g0(-1L);
                }
            }
            return this.a.f(c7816G0, interfaceC2726);
            if (c7816G0.Y(this.a) && c19003S.b.compareTo(this.b) > 0) {
                c7816G0 = c7816G0.g0(1L);
            }
            return this.a.f(c7816G0, interfaceC2726);
        }
        C7816 c7817 = this.a;
        C7816 c7818 = c19003S.a;
        c7817.getClass();
        long jD = c7818.D() - c7817.D();
        if (jD == 0) {
            return this.b.f(c19003S.b, interfaceC2726);
        }
        long jC0 = c19003S.b.c0() - this.b.c0();
        if (jD > 0) {
            jQ = jD - 1;
            j = jC0 + 86400000000000L;
        } else {
            jQ = jD + 1;
            j = jC0 - 86400000000000L;
        }
        switch (AbstractC3472.a[enumC10183.ordinal()]) {
            case 1:
                jQ = AbstractC1758.Q(jQ, 86400000000000L);
                break;
            case 2:
                jQ = AbstractC1758.Q(jQ, 86400000000L);
                j /= 1000;
                break;
            case 3:
                jQ = AbstractC1758.Q(jQ, 86400000L);
                j /= 1000000;
                break;
            case 4:
                jQ = AbstractC1758.Q(jQ, 86400);
                j /= 1000000000;
                break;
            case 5:
                jQ = AbstractC1758.Q(jQ, 1440);
                j /= 60000000000L;
                break;
            case 6:
                jQ = AbstractC1758.Q(jQ, 24);
                j /= 3600000000000L;
                break;
            case 7:
                jQ = AbstractC1758.Q(jQ, 2);
                j /= 43200000000000L;
                break;
        }
        return AbstractC1758.P(jQ, j);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC12641 interfaceC12641) {
        if (interfaceC12641 instanceof C19003) {
            return R((C19003) interfaceC12641);
        }
        return AbstractC1758.c(this, interfaceC12641);
    }

    public final int R(C19003 c19003) {
        int iR = this.a.R(c19003.e());
        return iR == 0 ? this.b.compareTo(c19003.toLocalTime()) : iR;
    }

    public final boolean T(InterfaceC12641 interfaceC12641) {
        if (interfaceC12641 instanceof C19003) {
            return R((C19003) interfaceC12641) < 0;
        }
        long jD = ((C7816) e()).D();
        long jD2 = interfaceC12641.e().D();
        return jD < jD2 || (jD == jD2 && toLocalTime().c0() < interfaceC12641.toLocalTime().c0());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C19003) {
            C19003 c19003 = (C19003) obj;
            if (this.a.equals(c19003.a) && this.b.equals(c19003.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + "T" + this.b.toString();
    }

    private Object writeReplace() {
        return new C21372((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
