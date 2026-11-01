package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ᩳ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18285 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final C18285 EPOCH = new C18285(0, 0);
    public static final C18285 c = ofEpochSecond(-31557014167219200L, 0);
    public static final C18285 d = ofEpochSecond(31556889864403199L, 999999999);
    public static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    public static C18285 now() {
        return AbstractC23225.systemUTC().instant();
    }

    public static C18285 ofEpochSecond(long j) {
        return V(j, 0);
    }

    public static C18285 ofEpochSecond(long j, long j2) {
        return V(AbstractC1726.P(j, AbstractC1726.z(j2, 1000000000L)), (int) AbstractC1726.O(j2, 1000000000L));
    }

    public static C18285 ofEpochMilli(long j) {
        long j2 = 1000;
        return V(AbstractC1726.z(j, j2), ((int) AbstractC1726.O(j, j2)) * BasicLabelFormatter.MILLION);
    }

    public static C18285 W(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C18285) {
            return (C18285) interfaceC21584;
        }
        C13638.requireNonNull(interfaceC21584, "temporal");
        try {
            return ofEpochSecond(interfaceC21584.G(EnumC18762.INSTANT_SECONDS), interfaceC21584.l(EnumC18762.NANO_OF_SECOND));
        } catch (C15464 e) {
            throw new C15464("Unable to obtain Instant from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName(), e);
        }
    }

    public static C18285 V(long j, int i) {
        if ((((long) i) | j) == 0) {
            return EPOCH;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C15464("Instant exceeds minimum or maximum instant");
        }
        return new C18285(j, i);
    }

    public C18285(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.INSTANT_SECONDS || interfaceC11002 == EnumC18762.NANO_OF_SECOND || interfaceC11002 == EnumC18762.MICRO_OF_SECOND || interfaceC11002 == EnumC18762.MILLI_OF_SECOND;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return AbstractC23702.d(this, interfaceC11002).a(interfaceC11002.C(this), interfaceC11002);
        }
        int i = AbstractC5711.a[((EnumC18762) interfaceC11002).ordinal()];
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
            EnumC18762 enumC18762 = EnumC18762.INSTANT_SECONDS;
            enumC18762.b.a(this.a, enumC18762);
        }
        throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        int i;
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i2 = AbstractC5711.a[((EnumC18762) interfaceC11002).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else if (i2 == 2) {
            i = this.b / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
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

    @Override // l.InterfaceC15235
    public final InterfaceC15235 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C18285) interfaceC11002.G(this, j);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        enumC18762.T(j);
        int i = AbstractC5711.a[enumC18762.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i2 = ((int) j) * 1000;
                if (i2 != this.b) {
                    return V(this.a, i2);
                }
            } else if (i == 3) {
                int i3 = ((int) j) * BasicLabelFormatter.MILLION;
                if (i3 != this.b) {
                    return V(this.a, i3);
                }
            } else {
                if (i != 4) {
                    throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
                }
                if (j != this.a) {
                    return V(j, this.b);
                }
            }
        } else if (j != this.b) {
            return V(this.a, (int) j);
        }
        return this;
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C18285 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C18285) interfaceC18056.m(this, j);
        }
        switch (AbstractC5711.b[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return X(0L, j);
            case 2:
                return X(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return X(j / 1000, (j % 1000) * 1000000);
            case 4:
                return X(j, 0L);
            case 5:
                return X(AbstractC1726.Q(j, 60), 0L);
            case 6:
                return X(AbstractC1726.Q(j, 3600), 0L);
            case 7:
                return X(AbstractC1726.Q(j, 43200), 0L);
            case 8:
                return X(AbstractC1726.Q(j, 86400), 0L);
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final C18285 X(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofEpochSecond(AbstractC1726.P(AbstractC1726.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        if (c22935 == AbstractC23702.b || c22935 == AbstractC23702.a || c22935 == AbstractC23702.e || c22935 == AbstractC23702.d || c22935 == AbstractC23702.f || c22935 == AbstractC23702.g) {
            return null;
        }
        return c22935.h(this);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(this.a, EnumC18762.INSTANT_SECONDS).c(this.b, EnumC18762.NANO_OF_SECOND);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C18285 c18285W = W(interfaceC15235);
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return interfaceC18056.l(this, c18285W);
        }
        switch (AbstractC5711.b[((EnumC22996) interfaceC18056).ordinal()]) {
            case 1:
                return AbstractC1726.P(AbstractC1726.Q(AbstractC1726.R(c18285W.a, this.a), 1000000000L), c18285W.b - this.b);
            case 2:
                return AbstractC1726.P(AbstractC1726.Q(AbstractC1726.R(c18285W.a, this.a), 1000000000L), c18285W.b - this.b) / 1000;
            case 3:
                return AbstractC1726.R(c18285W.toEpochMilli(), toEpochMilli());
            case 4:
                return Z(c18285W);
            case 5:
                return Z(c18285W) / 60;
            case 6:
                return Z(c18285W) / 3600;
            case 7:
                return Z(c18285W) / 43200;
            case 8:
                return Z(c18285W) / 86400;
            default:
                throw new C14530("Unsupported unit: " + interfaceC18056);
        }
    }

    public final long Z(C18285 c18285) {
        long jR = AbstractC1726.R(c18285.a, this.a);
        long j = c18285.b - this.b;
        if (jR <= 0 || j >= 0) {
            return (jR >= 0 || j <= 0) ? jR : jR + 1;
        }
        return jR - 1;
    }

    public C10525 atZone(AbstractC9114 abstractC9114) {
        return C10525.ofInstant(this, abstractC9114);
    }

    public long toEpochMilli() {
        long j = this.a;
        return (j >= 0 || this.b <= 0) ? AbstractC1726.P(AbstractC1726.Q(j, 1000), this.b / BasicLabelFormatter.MILLION) : AbstractC1726.P(AbstractC1726.Q(j + 1, 1000), (this.b / BasicLabelFormatter.MILLION) - 1000);
    }

    @Override // java.lang.Comparable
    public int compareTo(C18285 c18285) {
        int iCompare = Long.compare(this.a, c18285.a);
        return iCompare != 0 ? iCompare : this.b - c18285.b;
    }

    public boolean isAfter(C18285 c18285) {
        return compareTo(c18285) > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18285) {
            C18285 c18285 = (C18285) obj;
            if (this.a == c18285.a && this.b == c18285.b) {
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
        return C23351.h.format(this);
    }

    private Object writeReplace() {
        return new C3944((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C18285) AbstractC1726.a(c18991, this);
    }
}
