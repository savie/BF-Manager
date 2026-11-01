package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.ۤ᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10525 implements InterfaceC15235, InterfaceC20402, Serializable {
    public static final long serialVersionUID = -6260982410461394882L;
    public final C1952 a;
    public final C2678 b;
    public final AbstractC9114 c;

    @Override // l.InterfaceC20402
    public final /* synthetic */ long U() {
        return AbstractC1726.k(this);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1726.d(this, (InterfaceC20402) obj);
    }

    @Override // l.InterfaceC20402
    public final InterfaceC21233 a() {
        return ((C18991) f()).a();
    }

    public static C10525 W(C1952 c1952, AbstractC9114 abstractC9114, C2678 c2678) {
        C13638.requireNonNull(c1952, "localDateTime");
        C13638.requireNonNull(abstractC9114, "zone");
        if (abstractC9114 instanceof C2678) {
            return new C10525(c1952, abstractC9114, (C2678) abstractC9114);
        }
        C15380 c15380W = abstractC9114.W();
        List listF = c15380W.f(c1952);
        if (listF.size() == 1) {
            c2678 = (C2678) listF.get(0);
        } else if (listF.size() != 0) {
            if (c2678 == null || !listF.contains(c2678)) {
                c2678 = (C2678) C13638.requireNonNull((C2678) listF.get(0), "offset");
            }
        } else {
            Object objE = c15380W.e(c1952);
            C13263 c13263 = objE instanceof C13263 ? (C13263) objE : null;
            c1952 = c1952.b0(C21813.ofSeconds(c13263.d.b - c13263.c.b).a);
            c2678 = c13263.d;
        }
        return new C10525(c1952, abstractC9114, c2678);
    }

    public static C10525 ofInstant(C18285 c18285, AbstractC9114 abstractC9114) {
        C13638.requireNonNull(c18285, "instant");
        C13638.requireNonNull(abstractC9114, "zone");
        return s(c18285.getEpochSecond(), c18285.getNano(), abstractC9114);
    }

    public static C10525 s(long j, int i, AbstractC9114 abstractC9114) {
        C2678 c2678D = abstractC9114.W().d(C18285.ofEpochSecond(j, i));
        return new C10525(C1952.Z(j, i, c2678D), abstractC9114, c2678D);
    }

    @Override // l.InterfaceC20402
    public final C18285 toInstant() {
        return C18285.ofEpochSecond(U(), b().d);
    }

    public static C10525 V(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C10525) {
            return (C10525) interfaceC21584;
        }
        try {
            AbstractC9114 abstractC9114V = AbstractC9114.V(interfaceC21584);
            EnumC18762 enumC18762 = EnumC18762.INSTANT_SECONDS;
            if (!interfaceC21584.e(enumC18762)) {
                return W(C1952.Y(C18991.X(interfaceC21584), C3363.X(interfaceC21584)), abstractC9114V, null);
            }
            return s(interfaceC21584.G(enumC18762), interfaceC21584.l(EnumC18762.NANO_OF_SECOND), abstractC9114V);
        } catch (C15464 e) {
            throw new C15464("Unable to obtain ZonedDateTime from TemporalAccessor: " + interfaceC21584 + " of type " + interfaceC21584.getClass().getName(), e);
        }
    }

    public C10525(C1952 c1952, AbstractC9114 abstractC9114, C2678 c2678) {
        this.a = c1952;
        this.b = c2678;
        this.c = abstractC9114;
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
            if (interfaceC11002 == EnumC18762.INSTANT_SECONDS || interfaceC11002 == EnumC18762.OFFSET_SECONDS) {
                return ((EnumC18762) interfaceC11002).b;
            }
            return this.a.n(interfaceC11002);
        }
        return interfaceC11002.m(this);
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            int i = AbstractC22435.a[((EnumC18762) interfaceC11002).ordinal()];
            if (i == 1) {
                throw new C14530("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.l(interfaceC11002);
        }
        return AbstractC1726.e(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i = AbstractC22435.a[((EnumC18762) interfaceC11002).ordinal()];
        if (i != 1) {
            return i != 2 ? this.a.G(interfaceC11002) : this.b.b;
        }
        return AbstractC1726.k(this);
    }

    @Override // l.InterfaceC20402
    public final C2678 h() {
        return this.b;
    }

    @Override // l.InterfaceC20402
    public final AbstractC9114 F() {
        return this.c;
    }

    @Override // l.InterfaceC20402
    public final InterfaceC20402 A(AbstractC9114 abstractC9114) {
        C13638.requireNonNull(abstractC9114, "zone");
        return this.c.equals(abstractC9114) ? this : W(this.a, abstractC9114, this.b);
    }

    @Override // l.InterfaceC20402
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C10525 i(AbstractC9114 abstractC9114) {
        C13638.requireNonNull(abstractC9114, "zone");
        if (this.c.equals(abstractC9114)) {
            return this;
        }
        C1952 c1952 = this.a;
        C2678 c2678 = this.b;
        c1952.getClass();
        return s(AbstractC1726.j(c1952, c2678), this.a.b.d, abstractC9114);
    }

    @Override // l.InterfaceC20402
    public final InterfaceC9819 t() {
        return this.a;
    }

    @Override // l.InterfaceC20402
    public final InterfaceC17579 f() {
        return this.a.a;
    }

    @Override // l.InterfaceC20402
    public final C3363 b() {
        return this.a.b;
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return W(C1952.Y(c18991, this.a.b), this.c, this.b);
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
            int i = AbstractC22435.a[enumC18762.ordinal()];
            if (i == 1) {
                return s(j, this.a.b.d, this.c);
            }
            if (i != 2) {
                return W(this.a.c(j, interfaceC11002), this.c, this.b);
            }
            C2678 c2678E0 = C2678.e0(enumC18762.b.a(j, enumC18762));
            return (c2678E0.equals(this.b) || !this.c.W().f(this.a).contains(c2678E0)) ? this : new C10525(this.a, this.c, c2678E0);
        }
        return (C10525) interfaceC11002.G(this, j);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C10525 d(long j, InterfaceC18056 interfaceC18056) {
        if (!(interfaceC18056 instanceof EnumC22996)) {
            return (C10525) interfaceC18056.m(this, j);
        }
        EnumC22996 enumC22996 = (EnumC22996) interfaceC18056;
        if (enumC22996.compareTo(EnumC22996.DAYS) >= 0 && enumC22996 != EnumC22996.FOREVER) {
            return W(this.a.d(j, interfaceC18056), this.c, this.b);
        }
        C1952 c1952A0 = this.a.d(j, interfaceC18056);
        C2678 c2678 = this.b;
        AbstractC9114 abstractC9114 = this.c;
        C13638.requireNonNull(c1952A0, "localDateTime");
        C13638.requireNonNull(c2678, "offset");
        C13638.requireNonNull(abstractC9114, "zone");
        if (abstractC9114.W().f(c1952A0).contains(c2678)) {
            return new C10525(c1952A0, abstractC9114, c2678);
        }
        c1952A0.getClass();
        return s(AbstractC1726.j(c1952A0, c2678), c1952A0.b.d, abstractC9114);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return j == Long.MIN_VALUE ? d(C17492.FOREVER_NS, enumC22996).d(1L, enumC22996) : d(-j, enumC22996);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.f) {
            return this.a.a;
        }
        return AbstractC1726.i(this, c22935);
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C10525 c10525V = V(interfaceC15235);
        if (interfaceC18056 instanceof EnumC22996) {
            C10525 c10525I = c10525V.i(this.c);
            EnumC22996 enumC22996 = (EnumC22996) interfaceC18056;
            if (enumC22996.compareTo(EnumC22996.DAYS) >= 0 && enumC22996 != EnumC22996.FOREVER) {
                return this.a.g(c10525I.a, interfaceC18056);
            }
            return new C8408(this.a, this.b).g(new C8408(c10525I.a, c10525I.b), interfaceC18056);
        }
        return interfaceC18056.l(this, c10525V);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10525) {
            C10525 c10525 = (C10525) obj;
            if (this.a.equals(c10525.a) && this.b.equals(c10525.b) && this.c.equals(c10525.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.a.toString() + this.b.c;
        C2678 c2678 = this.b;
        AbstractC9114 abstractC9114 = this.c;
        if (c2678 == abstractC9114) {
            return str;
        }
        return str + "[" + abstractC9114.toString() + "]";
    }

    private Object writeReplace() {
        return new C3944((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
