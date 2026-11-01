package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ܽ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16295 extends AbstractC14758 {
    public static final C18991 d = C18991.h0(1873, 1, 1);
    public static final long serialVersionUID = -305327627230580483L;
    public final transient C18991 a;
    public final transient C12062 b;
    public final transient int c;

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC9819 I(C3363 c3363) {
        return new C11356(this, c3363);
    }

    public C16295(C18991 c18991) {
        if (c18991.c0(d)) {
            throw new C15464("JapaneseDate before Meiji 6 is not supported");
        }
        C12062 c12062J = C12062.j(c18991);
        this.b = c12062J;
        this.c = (c18991.a - c12062J.b.a) + 1;
        this.a = c18991;
    }

    public C16295(C12062 c12062, int i, C18991 c18991) {
        if (c18991.c0(d)) {
            throw new C15464("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = c12062;
        this.c = i;
        this.a = c18991;
    }

    @Override // l.InterfaceC17579
    public final InterfaceC21233 a() {
        return C19823.c;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final int hashCode() {
        C19823.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17705 K() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // l.AbstractC14758, l.InterfaceC17579
    public final int Q() {
        int iQ;
        C12062 c12062K = this.b.k();
        if (c12062K != null) {
            C18991 c18991 = c12062K.b;
            if (c18991.a == this.a.a) {
                iQ = c18991.a0() - 1;
            } else {
                iQ = this.a.Q();
            }
        } else {
            iQ = this.a.Q();
        }
        return this.c == 1 ? iQ - (this.b.b.a0() - 1) : iQ;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 == EnumC18762.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC11002 == EnumC18762.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC11002 == EnumC18762.ALIGNED_WEEK_OF_MONTH || interfaceC11002 == EnumC18762.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC11002 instanceof EnumC18762) {
            return ((EnumC18762) interfaceC11002).isDateBased();
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.AbstractC14758, l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.m(this);
        }
        if (!e(interfaceC11002)) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        int i = AbstractC0066.a[enumC18762.ordinal()];
        if (i == 1) {
            return C1828.f(1L, this.a.d0());
        }
        if (i == 2) {
            return C1828.f(1L, Q());
        }
        if (i != 3) {
            return C19823.c.v(enumC18762);
        }
        C12062 c12062 = this.b;
        int i2 = c12062.b.a;
        C12062 c12062K = c12062.k();
        return c12062K != null ? C1828.f(1L, (c12062K.b.a - i2) + 1) : C1828.f(1L, 999999999 - i2);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        switch (AbstractC0066.a[((EnumC18762) interfaceC11002).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.a0() - this.b.b.a0()) + 1 : this.a.a0();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
            case 8:
                return this.b.a;
            default:
                return this.a.G(interfaceC11002);
        }
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C16295 c(long j, InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
            if (G(enumC18762) == j) {
                return this;
            }
            int[] iArr = AbstractC0066.a;
            int i = iArr[enumC18762.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C19823 c19823 = C19823.c;
                int iA = c19823.v(enumC18762).a(j, enumC18762);
                int i2 = iArr[enumC18762.ordinal()];
                if (i2 == 3) {
                    return d0(this.a.s0(c19823.z(this.b, iA)));
                }
                if (i2 == 8) {
                    return d0(this.a.s0(c19823.z(C12062.o(iA), this.c)));
                }
                if (i2 == 9) {
                    return d0(this.a.s0(iA));
                }
            }
            return d0(this.a.c(j, interfaceC11002));
        }
        return (C16295) super.c(j, interfaceC11002);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    /* JADX INFO: renamed from: B */
    public final InterfaceC17579 m(InterfaceC12413 interfaceC12413) {
        return (C16295) super.m(interfaceC12413);
    }

    public final C16295 c0(C22935 c22935) {
        return (C16295) super.m(c22935);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C16295) super.m(c18991);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 N(InterfaceC6062 interfaceC6062) {
        return (C16295) super.N(interfaceC6062);
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 Z(long j) {
        return d0(this.a.o0(j));
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 Y(long j) {
        return d0(this.a.m0(j));
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 X(long j) {
        return d0(this.a.l0(j));
    }

    public final C16295 a0(long j, EnumC22996 enumC22996) {
        return (C16295) super.d(j, (InterfaceC18056) enumC22996);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 d(long j, InterfaceC18056 interfaceC18056) {
        return (C16295) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    public final InterfaceC17579 d(long j, InterfaceC18056 interfaceC18056) {
        return (C16295) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return (C16295) super.w(j, enumC22996);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 w(long j, InterfaceC18056 interfaceC18056) {
        return (C16295) super.w(j, interfaceC18056);
    }

    public final C16295 d0(C18991 c18991) {
        return c18991.equals(this.a) ? this : new C16295(c18991);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final long H() {
        return this.a.H();
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16295) {
            return this.a.equals(((C16295) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3467((byte) 4, this);
    }
}
