package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.۬֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12767 extends AbstractC14758 {
    public static final long serialVersionUID = -8722293800195731463L;
    public final transient C18991 a;

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC9819 I(C3363 c3363) {
        return new C11356(this, c3363);
    }

    public C12767(C18991 c18991) {
        C13638.requireNonNull(c18991, "isoDate");
        this.a = c18991;
    }

    @Override // l.InterfaceC17579
    public final InterfaceC21233 a() {
        return C2182.c;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final int hashCode() {
        C2182.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17705 K() {
        return a0() >= 1 ? EnumC6416.BE : EnumC6416.BEFORE_BE;
    }

    @Override // l.AbstractC14758, l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.m(this);
        }
        if (!AbstractC1726.f(this, interfaceC11002)) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        int i = AbstractC21939.a[enumC18762.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.n(interfaceC11002);
        }
        if (i != 4) {
            return C2182.c.v(enumC18762);
        }
        C1828 c1828 = EnumC18762.YEAR.b;
        return C1828.f(1L, a0() <= 0 ? (-(c1828.a + 543)) + 1 : 543 + c1828.d);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            int i = AbstractC21939.a[((EnumC18762) interfaceC11002).ordinal()];
            if (i == 4) {
                int iA0 = a0();
                if (iA0 < 1) {
                    iA0 = 1 - iA0;
                }
                return iA0;
            }
            if (i == 5) {
                return ((((long) a0()) * 12) + ((long) this.a.b)) - 1;
            }
            if (i == 6) {
                return a0();
            }
            if (i != 7) {
                return this.a.G(interfaceC11002);
            }
            return a0() < 1 ? 0 : 1;
        }
        return interfaceC11002.C(this);
    }

    public final int a0() {
        return this.a.a + 543;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    /* JADX WARN: Code duplicated, block: B:29:0x0093  */
    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C12767 c(long j, InterfaceC11002 interfaceC11002) {
        int iA;
        int i;
        if (interfaceC11002 instanceof EnumC18762) {
            EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
            if (G(enumC18762) == j) {
                return this;
            }
            int[] iArr = AbstractC21939.a;
            int i2 = iArr[enumC18762.ordinal()];
            if (i2 == 4) {
                iA = C2182.c.v(enumC18762).a(j, enumC18762);
                i = iArr[enumC18762.ordinal()];
                if (i != 4) {
                    C18991 c18991 = this.a;
                    if (a0() < 1) {
                        iA = 1 - iA;
                    }
                    return c0(c18991.s0(iA - 543));
                }
                if (i != 6) {
                    return c0(this.a.s0(iA - 543));
                }
                if (i == 7) {
                    return c0(this.a.s0((-542) - a0()));
                }
            } else {
                if (i2 == 5) {
                    C2182.c.v(enumC18762).b(j, enumC18762);
                    long jA0 = ((long) a0()) * 12;
                    C18991 c18992 = this.a;
                    return c0(c18992.m0(j - ((jA0 + ((long) c18992.b)) - 1)));
                }
                if (i2 == 6 || i2 == 7) {
                    iA = C2182.c.v(enumC18762).a(j, enumC18762);
                    i = iArr[enumC18762.ordinal()];
                    if (i != 4) {
                        C18991 c18993 = this.a;
                        if (a0() < 1) {
                            iA = 1 - iA;
                        }
                        return c0(c18993.s0(iA - 543));
                    }
                    if (i != 6) {
                        return c0(this.a.s0(iA - 543));
                    }
                    if (i == 7) {
                        return c0(this.a.s0((-542) - a0()));
                    }
                }
            }
            return c0(this.a.c(j, interfaceC11002));
        }
        return (C12767) super.c(j, interfaceC11002);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    /* JADX INFO: renamed from: B */
    public final InterfaceC17579 m(InterfaceC12413 interfaceC12413) {
        return (C12767) super.m(interfaceC12413);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C12767) super.m(c18991);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 N(InterfaceC6062 interfaceC6062) {
        return (C12767) super.N(interfaceC6062);
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 Z(long j) {
        return c0(this.a.o0(j));
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 Y(long j) {
        return c0(this.a.m0(j));
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 X(long j) {
        return c0(this.a.l0(j));
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 d(long j, InterfaceC18056 interfaceC18056) {
        return (C12767) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    public final InterfaceC17579 d(long j, InterfaceC18056 interfaceC18056) {
        return (C12767) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return (C12767) super.w(j, enumC22996);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 w(long j, InterfaceC18056 interfaceC18056) {
        return (C12767) super.w(j, interfaceC18056);
    }

    public final C12767 c0(C18991 c18991) {
        return c18991.equals(this.a) ? this : new C12767(c18991);
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
        if (obj instanceof C12767) {
            return this.a.equals(((C12767) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3467((byte) 8, this);
    }
}
