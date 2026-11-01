package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: l.᩺֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22645 implements InterfaceC20402, Serializable {
    public static final long serialVersionUID = -5261813987200935591L;
    public final transient C11356 a;
    public final transient C2678 b;
    public final transient AbstractC9114 c;

    @Override // l.InterfaceC21584
    public final /* synthetic */ Object T(C22935 c22935) {
        return AbstractC1726.i(this, c22935);
    }

    @Override // l.InterfaceC20402
    public final /* synthetic */ long U() {
        return AbstractC1726.k(this);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC1726.e(this, interfaceC11002);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return AbstractC1726.d(this, (InterfaceC20402) obj);
    }

    public static C22645 V(AbstractC9114 abstractC9114, C2678 c2678, C11356 c11356) {
        C13638.requireNonNull(c11356, "localDateTime");
        C13638.requireNonNull(abstractC9114, "zone");
        if (abstractC9114 instanceof C2678) {
            return new C22645(abstractC9114, (C2678) abstractC9114, c11356);
        }
        C15380 c15380W = abstractC9114.W();
        C1952 c1952W = C1952.W(c11356);
        List listF = c15380W.f(c1952W);
        if (listF.size() == 1) {
            c2678 = (C2678) listF.get(0);
        } else if (listF.size() != 0) {
            if (c2678 == null || !listF.contains(c2678)) {
                c2678 = (C2678) listF.get(0);
            }
        } else {
            Object objE = c15380W.e(c1952W);
            C13263 c13263 = objE instanceof C13263 ? (C13263) objE : null;
            c11356 = c11356.X(c11356.a, 0L, 0L, C21813.ofSeconds(c13263.d.b - c13263.c.b).a, 0L);
            c2678 = c13263.d;
        }
        C13638.requireNonNull(c2678, "offset");
        return new C22645(abstractC9114, c2678, c11356);
    }

    public static C22645 W(InterfaceC21233 interfaceC21233, C18285 c18285, AbstractC9114 abstractC9114) {
        C2678 c2678D = abstractC9114.W().d(c18285);
        C13638.requireNonNull(c2678D, "offset");
        return new C22645(abstractC9114, c2678D, (C11356) interfaceC21233.J(C1952.Z(c18285.getEpochSecond(), c18285.getNano(), c2678D)));
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            if (interfaceC11002 != EnumC18762.INSTANT_SECONDS && interfaceC11002 != EnumC18762.OFFSET_SECONDS) {
                return ((C11356) t()).n(interfaceC11002);
            }
            return ((EnumC18762) interfaceC11002).b;
        }
        return interfaceC11002.m(this);
    }

    public static C22645 s(InterfaceC21233 interfaceC21233, InterfaceC15235 interfaceC15235) {
        C22645 c22645 = (C22645) interfaceC15235;
        if (interfaceC21233.equals(c22645.a())) {
            return c22645;
        }
        throw new ClassCastException("Chronology mismatch, required: " + interfaceC21233.k() + ", actual: " + c22645.a().k());
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            int i = AbstractC0771.a[((EnumC18762) interfaceC11002).ordinal()];
            if (i == 1) {
                return U();
            }
            if (i != 2) {
                return ((C11356) t()).G(interfaceC11002);
            }
            return h().b;
        }
        return interfaceC11002.C(this);
    }

    public C22645(AbstractC9114 abstractC9114, C2678 c2678, C11356 c11356) {
        this.a = (C11356) C13638.requireNonNull(c11356, "dateTime");
        this.b = (C2678) C13638.requireNonNull(c2678, "offset");
        this.c = (AbstractC9114) C13638.requireNonNull(abstractC9114, "zone");
    }

    @Override // l.InterfaceC20402
    public final C2678 h() {
        return this.b;
    }

    @Override // l.InterfaceC20402
    public final InterfaceC17579 f() {
        return ((C11356) t()).f();
    }

    @Override // l.InterfaceC20402
    public final C3363 b() {
        return ((C11356) t()).b();
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    @Override // l.InterfaceC20402
    public final InterfaceC9819 t() {
        return this.a;
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

    @Override // l.InterfaceC20402
    public final AbstractC9114 F() {
        return this.c;
    }

    @Override // l.InterfaceC20402
    public final InterfaceC21233 a() {
        return f().a();
    }

    @Override // l.InterfaceC20402
    public final InterfaceC20402 A(AbstractC9114 abstractC9114) {
        return V(abstractC9114, this.b, this.a);
    }

    @Override // l.InterfaceC20402
    public final InterfaceC20402 i(AbstractC9114 abstractC9114) {
        C13638.requireNonNull(abstractC9114, "zone");
        if (this.c.equals(abstractC9114)) {
            return this;
        }
        C11356 c11356 = this.a;
        C2678 c2678 = this.b;
        c11356.getClass();
        return W(a(), AbstractC1726.l(c11356, c2678), abstractC9114);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return true;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return s(a(), interfaceC11002.G(this, j));
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        int i = AbstractC3593.a[enumC18762.ordinal()];
        if (i == 1) {
            return d(j - AbstractC1726.k(this), EnumC22996.SECONDS);
        }
        if (i != 2) {
            return V(this.c, this.b, this.a.c(j, interfaceC11002));
        }
        C2678 c2678E0 = C2678.e0(enumC18762.b.a(j, enumC18762));
        C11356 c11356 = this.a;
        c11356.getClass();
        return W(a(), AbstractC1726.l(c11356, c2678E0), this.c);
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C22645 d(long j, InterfaceC18056 interfaceC18056) {
        if (interfaceC18056 instanceof EnumC22996) {
            return s(a(), this.a.d(j, interfaceC18056).s(this));
        }
        return s(a(), interfaceC18056.m(this, j));
    }

    @Override // l.InterfaceC15235
    public final long g(InterfaceC15235 interfaceC15235, InterfaceC18056 interfaceC18056) {
        C13638.requireNonNull(interfaceC15235, "endExclusive");
        InterfaceC20402 interfaceC20402P = a().p(interfaceC15235);
        if (interfaceC18056 instanceof EnumC22996) {
            return this.a.g(interfaceC20402P.i(this.b).t(), interfaceC18056);
        }
        C13638.requireNonNull(interfaceC18056, "unit");
        return interfaceC18056.l(this, interfaceC20402P);
    }

    private Object writeReplace() {
        return new C3467((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC20402) && AbstractC1726.d(this, (InterfaceC20402) obj) == 0;
    }

    @Override // l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return s(a(), c18991.s(this));
    }

    @Override // l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return s(a(), AbstractC23702.b(this, j, enumC22996));
    }

    @Override // l.InterfaceC20402
    public final C18285 toInstant() {
        return C18285.ofEpochSecond(U(), b().d);
    }
}
