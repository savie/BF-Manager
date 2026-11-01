package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.bouncycastle.i18n.TextBundle;

/* JADX INFO: renamed from: l.۠᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8408 implements InterfaceC15235, InterfaceC12413, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = 2287754244819255394L;
    public final C1952 a;
    public final C2678 b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int iCompare;
        C8408 c8408 = (C8408) obj;
        if (this.b.equals(c8408.b)) {
            iCompare = this.a.compareTo(c8408.a);
        } else {
            C1952 c1952 = this.a;
            C2678 c2678 = this.b;
            c1952.getClass();
            long j = AbstractC1726.j(c1952, c2678);
            C1952 c1953 = c8408.a;
            C2678 c2679 = c8408.b;
            c1953.getClass();
            iCompare = Long.compare(j, AbstractC1726.j(c1953, c2679));
            if (iCompare == 0) {
                iCompare = this.a.b.d - c8408.a.b.d;
            }
        }
        return iCompare == 0 ? this.a.compareTo(c8408.a) : iCompare;
    }

    static {
        C1952 c1952 = C1952.c;
        C2678 c2678 = C2678.h;
        c1952.getClass();
        new C8408(c1952, c2678);
        C1952 c1953 = C1952.d;
        C2678 c2679 = C2678.g;
        c1953.getClass();
        new C8408(c1953, c2679);
    }

    public static C8408 W(C18285 c18285, AbstractC9114 abstractC9114) {
        C13638.requireNonNull(c18285, "instant");
        C13638.requireNonNull(abstractC9114, "zone");
        C2678 c2678D = abstractC9114.W().d(c18285);
        return new C8408(C1952.Z(c18285.getEpochSecond(), c18285.getNano(), c2678D), c2678D);
    }

    public static C8408 V(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C8408) {
            return (C8408) interfaceC21584;
        }
        try {
            C2678 c2678B0 = C2678.b0(interfaceC21584);
            C18991 c18991 = (C18991) interfaceC21584.T(AbstractC23702.f);
            C3363 c3363 = (C3363) interfaceC21584.T(AbstractC23702.g);
            if (c18991 != null && c3363 != null) {
                return new C8408(C1952.Y(c18991, c3363), c2678B0);
            }
            return W(C18285.W(interfaceC21584), c2678B0);
        } catch (C15464 e) {
            throw new C15464("Unable to obtain OffsetDateTime from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName(), e);
        }
    }

    public static C8408 parse(CharSequence charSequence) {
        String string;
        C23351 c23351 = C23351.g;
        C13638.requireNonNull(c23351, "formatter");
        C22935 c22935 = new C22935(1);
        c23351.getClass();
        C13638.requireNonNull(charSequence, TextBundle.TEXT_ENTRY);
        C13638.requireNonNull(c22935, "query");
        try {
            return (C8408) c23351.a(charSequence).T(c22935);
        } catch (C17475 e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            C17475 c17475 = new C17475("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw c17475;
        }
    }

    public C8408(C1952 c1952, C2678 c2678) {
        this.a = (C1952) C13638.requireNonNull(c1952, "dateTime");
        this.b = (C2678) C13638.requireNonNull(c2678, "offset");
    }

    public final C8408 Y(C1952 c1952, C2678 c2678) {
        return (this.a == c1952 && this.b.equals(c2678)) ? this : new C8408(c1952, c2678);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return true;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 != EnumC18762.INSTANT_SECONDS && interfaceC11002 != EnumC18762.OFFSET_SECONDS) {
                return this.a.n(interfaceC11002);
            }
            return ((EnumC18762) interfaceC11002).b;
        }
        return interfaceC11002.m(this);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            int i = AbstractC5356.a[((EnumC18762) interfaceC11002).ordinal()];
            if (i == 1) {
                throw new C14530("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.l(interfaceC11002);
        }
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i = AbstractC5356.a[((EnumC18762) interfaceC11002).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.G(interfaceC11002) : this.b.b;
        }
        C1952 c1952 = this.a;
        C2678 c2678 = this.b;
        c1952.getClass();
        return AbstractC1726.j(c1952, c2678);
    }

    public int getNano() {
        return this.a.b.d;
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        C1952 c1952 = this.a;
        return Y(c1952.e0(c18991, c1952.b), this.b);
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
            int i = AbstractC5356.a[enumC18762.ordinal()];
            if (i == 1) {
                return W(C18285.ofEpochSecond(j, getNano()), this.b);
            }
            if (i == 2) {
                return Y(this.a, C2678.e0(enumC18762.b.a(j, enumC18762)));
            }
            return Y(this.a.c(j, interfaceC11002), this.b);
        }
        return (C8408) interfaceC11002.G(this, j);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C8408 d(long j, InterfaceC18056 interfaceC18056) {
        if (interfaceC18056 instanceof EnumC22996) {
            return Y(this.a.d(j, interfaceC18056), this.b);
        }
        return (C8408) interfaceC18056.m(this, j);
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
        if (c22935 == AbstractC23702.a) {
            return null;
        }
        if (c22935 == AbstractC23702.f) {
            return this.a.a;
        }
        if (c22935 == AbstractC23702.g) {
            return this.a.b;
        }
        if (c22935 == AbstractC23702.b) {
            return C7122.c;
        }
        if (c22935 == AbstractC23702.c) {
            return EnumC22996.NANOS;
        }
        return c22935.h(this);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(this.a.a.H(), EnumC18762.EPOCH_DAY).c(this.a.b.h0(), EnumC18762.NANO_OF_DAY).c(this.b.b, EnumC18762.OFFSET_SECONDS);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C8408 c8408V = V(interfaceC15235);
        if (interfaceC18056 instanceof EnumC22996) {
            C2678 c2678 = this.b;
            if (!c2678.equals(c8408V.b)) {
                c8408V = new C8408(c8408V.a.b0(c2678.b - c8408V.b.b), c2678);
            }
            return this.a.g(c8408V.a, interfaceC18056);
        }
        return interfaceC18056.l(this, c8408V);
    }

    public C18285 toInstant() {
        C1952 c1952 = this.a;
        C2678 c2678 = this.b;
        c1952.getClass();
        return AbstractC1726.l(c1952, c2678);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8408) {
            C8408 c8408 = (C8408) obj;
            if (this.a.equals(c8408.a) && this.b.equals(c8408.b)) {
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
        return new C3944((byte) 10, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
