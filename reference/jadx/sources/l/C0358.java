package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֡ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0358 implements InterfaceC1235, InterfaceC1916, Comparable, Serializable {
    public static final C0358 EPOCH = new C0358(0, 0);
    public static final C0358 c = ofEpochSecond(-31557014167219200L, 0);
    public static final C0358 d = ofEpochSecond(31556889864403199L, 999999999);
    public static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public static C0358 now() {
        return AbstractC14527.systemUTC().instant();
    }

    public static C0358 ofEpochSecond(long j) {
        return R(j, 0);
    }

    public static C0358 ofEpochSecond(long j, long j2) {
        return R(AbstractC1758.P(j, AbstractC1758.z(j2, 1000000000L)), (int) AbstractC1758.O(j2, 1000000000L));
    }

    public static C0358 ofEpochMilli(long j) {
        long j2 = 1000;
        return R(AbstractC1758.z(j, j2), ((int) AbstractC1758.O(j, j2)) * BasicLabelFormatter.MILLION);
    }

    public static C0358 S(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C0358) {
            return (C0358) interfaceC9437;
        }
        C17359.requireNonNull(interfaceC9437, "temporal");
        try {
            return ofEpochSecond(interfaceC9437.C(EnumC8692.INSTANT_SECONDS), interfaceC9437.i(EnumC8692.NANO_OF_SECOND));
        } catch (C21241 e) {
            throw new C21241("Unable to obtain Instant from TemporalAccessor: " + interfaceC9437 + " of type " + interfaceC9437.getClass().getName(), e);
        }
    }

    public static C0358 R(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C21241("Instant exceeds minimum or maximum instant");
        }
        return new C0358(j, i);
    }

    public C0358(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.INSTANT_SECONDS || interfaceC16831 == EnumC8692.NANO_OF_SECOND || interfaceC16831 == EnumC8692.MICRO_OF_SECOND || interfaceC16831 == EnumC8692.MILLI_OF_SECOND;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return AbstractC17577.d(this, interfaceC16831).a(interfaceC16831.z(this), interfaceC16831);
        }
        int i = AbstractC17774.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return this.b / 1000;
        }
        if (i == 3) {
            return this.b / BasicLabelFormatter.MILLION;
        }
        if (i == 4) {
            EnumC8692 enumC8692 = EnumC8692.INSTANT_SECONDS;
            enumC8692.b.a(this.a, enumC8692);
        }
        throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        int i;
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i2 = AbstractC17774.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
            }
            i = this.b / BasicLabelFormatter.MILLION;
        }
        return i;
    }

    public long getEpochSecond() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C0358) interfaceC16831.C(this, j);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        enumC8692.P(j);
        int i = AbstractC17774.a[enumC8692.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return R(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * BasicLabelFormatter.MILLION;
                if (i3 != this.b) {
                    return R(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
                }
                if (j != this.a) {
                    return R(j, this.b);
                }
            }
        } else if (j != this.b) {
            return R(this.a, (int) j);
        }
        return this;
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final C0358 c(long j, InterfaceC2726 interfaceC2726) {
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return (C0358) interfaceC2726.j(this, j);
        }
        switch (AbstractC17774.b[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return T(0L, j);
            case 2:
                return T(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return T(j / 1000, (j % 1000) * 1000000);
            case 4:
                return T(j, 0L);
            case 5:
                return T(AbstractC1758.Q(j, 60), 0L);
            case 6:
                return T(AbstractC1758.Q(j, 3600), 0L);
            case 7:
                return T(AbstractC1758.Q(j, 43200), 0L);
            case 8:
                return T(AbstractC1758.Q(j, 86400), 0L);
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final C0358 T(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC1758.P(AbstractC1758.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return j == Long.MIN_VALUE ? c(C25227.FOREVER_NS, enumC10183).c(1L, enumC10183) : c(-j, enumC10183);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.c) {
            return EnumC10183.NANOS;
        }
        if (c14435 == AbstractC17577.b || c14435 == AbstractC17577.a || c14435 == AbstractC17577.e || c14435 == AbstractC17577.d || c14435 == AbstractC17577.f || c14435 == AbstractC17577.g) {
            return null;
        }
        return c14435.g(this);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(this.a, EnumC8692.INSTANT_SECONDS).b(this.b, EnumC8692.NANO_OF_SECOND);
    }

    @Override // l.InterfaceC1235
    public final long f(InterfaceC1235 interfaceC1235, InterfaceC2726 interfaceC2726) {
        C0358 c0358S = S(interfaceC1235);
        if (!(interfaceC2726 instanceof EnumC10183)) {
            return interfaceC2726.i(this, c0358S);
        }
        switch (AbstractC17774.b[((EnumC10183) interfaceC2726).ordinal()]) {
            case 1:
                return AbstractC1758.P(AbstractC1758.Q(AbstractC1758.R(c0358S.a, this.a), 1000000000L), c0358S.b - this.b);
            case 2:
                return AbstractC1758.P(AbstractC1758.Q(AbstractC1758.R(c0358S.a, this.a), 1000000000L), c0358S.b - this.b) / 1000;
            case 3:
                return AbstractC1758.R(c0358S.toEpochMilli(), toEpochMilli());
            case 4:
                return V(c0358S);
            case 5:
                return V(c0358S) / 60;
            case 6:
                return V(c0358S) / 3600;
            case 7:
                return V(c0358S) / 43200;
            case 8:
                return V(c0358S) / 86400;
            default:
                throw new C16085("Unsupported unit: " + interfaceC2726);
        }
    }

    public final long V(C0358 c0358) {
        long jR = AbstractC1758.R(c0358.a, this.a);
        long j = c0358.b - this.b;
        if (jR <= 0 || j >= 0) {
            return (jR >= 0 || j <= 0) ? jR : jR + 1;
        }
        return jR - 1;
    }

    public C23084 atZone(AbstractC22338 abstractC22338) {
        return C23084.ofInstant(this, abstractC22338);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? AbstractC1758.P(AbstractC1758.Q(j, 1000), this.b / BasicLabelFormatter.MILLION) : AbstractC1758.P(AbstractC1758.Q(j + 1, 1000), (this.b / BasicLabelFormatter.MILLION) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(C0358 c0358) {
        int iCompare = Long.compare(this.a, c0358.a);
        return iCompare != 0 ? iCompare : this.b - c0358.b;
    }

    public boolean isAfter(C0358 c0358) {
        return compareTo(c0358) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0358) {
            C0358 c0358 = (C0358) obj;
            if (this.a == c0358.a && this.b == c0358.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return C23742.h.format(this);
    }

    private Object writeReplace() {
        return new C21372((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C0358) AbstractC1758.a(c7816, this);
    }
}
