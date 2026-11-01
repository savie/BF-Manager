package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.֨۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1122 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 7264499704384272492L;
    public final C3363 a;
    public final C2678 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1122 c1122 = (C1122) obj;
        if (this.b.equals(c1122.b)) {
            return this.a.compareTo(c1122.a);
        }
        int iCompare = Long.compare(W(), c1122.W());
        return iCompare == 0 ? this.a.compareTo(c1122.a) : iCompare;
    }

    static {
        C3363 c3363 = C3363.e;
        C2678 c2678 = C2678.h;
        c3363.getClass();
        new C1122(c3363, c2678);
        C3363 c3364 = C3363.f;
        C2678 c2679 = C2678.g;
        c3364.getClass();
        new C1122(c3364, c2679);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C1122 c1122;
        if (interfaceC15235 instanceof C1122) {
            c1122 = (C1122) interfaceC15235;
        } else {
            try {
                c1122 = new C1122(C3363.X(interfaceC15235), C2678.b0(interfaceC15235));
            } catch (C15464 e) {
                throw new C15464("Unable to obtain OffsetTime from TemporalAccessor: " + interfaceC15235 + " of type " + interfaceC15235.getClass().getName(), e);
            }
        }
        if (interfaceC18056 instanceof EnumC22996) {
            long jW = c1122.W() - W();
            switch (AbstractC22290.a[((EnumC22996) interfaceC18056).ordinal()]) {
                case 1:
                    return jW;
                case 2:
                    return jW / 1000;
                case 3:
                    return jW / 1000000;
                case 4:
                    return jW / 1000000000;
                case 5:
                    return jW / 60000000000L;
                case 6:
                    return jW / 3600000000000L;
                case 7:
                    return jW / 43200000000000L;
                default:
                    throw new C14530("Unsupported unit: " + interfaceC18056);
            }
        }
        return interfaceC18056.l(this, c1122);
    }

    public C1122(C3363 c3363, C2678 c2678) {
        this.a = (C3363) C13638.requireNonNull(c3363, "time");
        this.b = (C2678) C13638.requireNonNull(c2678, "offset");
    }

    public final C1122 X(C3363 c3363, C2678 c2678) {
        return (this.a == c3363 && this.b.equals(c2678)) ? this : new C1122(c3363, c2678);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).V() || interfaceC11002 == EnumC18762.OFFSET_SECONDS;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 != EnumC18762.OFFSET_SECONDS) {
                C3363 c3363 = this.a;
                c3363.getClass();
                return AbstractC23702.d(c3363, interfaceC11002);
            }
            return ((EnumC18762) interfaceC11002).b;
        }
        return interfaceC11002.m(this);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 == EnumC18762.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.G(interfaceC11002);
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 == EnumC18762.OFFSET_SECONDS) {
                EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
                return X(this.a, C2678.e0(enumC18762.b.a(j, enumC18762)));
            }
            return X(this.a.c(j, interfaceC11002), this.b);
        }
        return (C1122) interfaceC11002.G(this, j);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public final C1122 d(long j, InterfaceC18056 interfaceC18056) {
        if (interfaceC18056 instanceof EnumC22996) {
            return X(this.a.d(j, interfaceC18056), this.b);
        }
        return (C1122) interfaceC18056.m(this, j);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.d || c22935 == AbstractC23702.e) {
            return this.b;
        }
        if (((c22935 == AbstractC23702.a) || (c22935 == AbstractC23702.b)) || c22935 == AbstractC23702.f) {
            return null;
        }
        if (c22935 == AbstractC23702.g) {
            return this.a;
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        return c22935.h(this);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(this.a.h0(), EnumC18762.NANO_OF_DAY).c(this.b.b, EnumC18762.OFFSET_SECONDS);
    }

    public final long W() {
        return this.a.h0() - (((long) this.b.b) * 1000000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1122) {
            C1122 c1122 = (C1122) obj;
            if (this.a.equals(c1122.a) && this.b.equals(c1122.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new C3944((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C1122) AbstractC1726.a(c18991, this);
    }
}
