package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۡ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8534 extends AbstractC14758 {
    public static final long serialVersionUID = -5207853542612002020L;
    public final transient C7828 a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC9819 I(C3363 c3363) {
        return new C11356(this, c3363);
    }

    public C8534(C7828 c7828, int i, int i2, int i3) {
        c7828.Y(i, i2, i3);
        this.a = c7828;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public C8534(C7828 c7828, long j) {
        int i = (int) j;
        c7828.V();
        if (i < c7828.e || i >= c7828.f) {
            throw new C15464("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c7828.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c7828.X(iBinarySearch), ((c7828.g + iBinarySearch) % 12) + 1, (i - c7828.d[iBinarySearch]) + 1};
        this.a = c7828;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // l.InterfaceC17579
    public final InterfaceC21233 a() {
        return this.a;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17705 K() {
        return EnumC9945.AH;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final int Q() {
        return this.a.b0(this.b, 12);
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
        int i = AbstractC19117.a[enumC18762.ordinal()];
        if (i == 1) {
            return C1828.f(1L, this.a.Z(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.v(enumC18762) : C1828.f(1L, 5L);
        }
        return C1828.f(1L, Q());
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        switch (AbstractC19117.a[((EnumC18762) interfaceC11002).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return a0();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC1726.O(H() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((a0() - 1) % 7) + 1;
            case 7:
                return H();
            case 8:
                return ((a0() - 1) / 7) + 1;
            case 9:
                return this.c;
            case 10:
                return ((((long) this.b) * 12) + ((long) this.c)) - 1;
            case 11:
                return this.b;
            case 12:
                return this.b;
            case 13:
                return this.b <= 1 ? 0 : 1;
            default:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final C8534 c(long j, InterfaceC11002 interfaceC11002) {
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return (C8534) super.c(j, interfaceC11002);
        }
        EnumC18762 enumC18762 = (EnumC18762) interfaceC11002;
        this.a.v(enumC18762).b(j, enumC18762);
        int i = (int) j;
        switch (AbstractC19117.a[enumC18762.ordinal()]) {
            case 1:
                return d0(this.b, this.c, i);
            case 2:
                return X(Math.min(i, Q()) - a0());
            case 3:
                return X((j - G(EnumC18762.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return X(j - ((long) (((int) AbstractC1726.O(H() + 3, 7)) + 1)));
            case 5:
                return X(j - G(EnumC18762.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return X(j - G(EnumC18762.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C8534(this.a, j);
            case 8:
                return X((j - G(EnumC18762.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return d0(this.b, i, this.d);
            case 10:
                return Y(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return d0(i, this.c, this.d);
            case 12:
                return d0(i, this.c, this.d);
            case 13:
                return d0(1 - this.b, this.c, this.d);
            default:
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
    }

    public final C8534 d0(int i, int i2, int i3) {
        int iZ = this.a.Z(i, i2);
        if (i3 > iZ) {
            i3 = iZ;
        }
        return new C8534(this.a, i, i2, i3);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    /* JADX INFO: renamed from: B */
    public final InterfaceC17579 m(InterfaceC12413 interfaceC12413) {
        return (C8534) super.m(interfaceC12413);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 m(C18991 c18991) {
        return (C8534) super.m(c18991);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 N(InterfaceC6062 interfaceC6062) {
        return (C8534) super.N(interfaceC6062);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final long H() {
        return this.a.Y(this.b, this.c, this.d);
    }

    public final int a0() {
        return this.a.b0(this.b, this.c - 1) + this.d;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final boolean u() {
        return this.a.S(this.b);
    }

    @Override // l.AbstractC14758
    public final InterfaceC17579 Z(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return d0(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // l.AbstractC14758
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final C8534 Y(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        C7828 c7828 = this.a;
        long jZ = AbstractC1726.z(j2, 12L);
        if (jZ >= c7828.X(0) && jZ <= c7828.X(c7828.d.length - 1) - 1) {
            return d0((int) jZ, ((int) AbstractC1726.O(j2, 12L)) + 1, this.d);
        }
        throw new C15464("Invalid Hijrah year: " + jZ);
    }

    @Override // l.AbstractC14758
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final C8534 X(long j) {
        return new C8534(this.a, H() + j);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    public final InterfaceC15235 d(long j, InterfaceC18056 interfaceC18056) {
        return (C8534) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579, l.InterfaceC15235
    public final InterfaceC17579 d(long j, InterfaceC18056 interfaceC18056) {
        return (C8534) super.d(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC15235
    /* JADX INFO: renamed from: C */
    public final InterfaceC15235 w(long j, EnumC22996 enumC22996) {
        return (C8534) super.w(j, enumC22996);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final InterfaceC17579 w(long j, InterfaceC18056 interfaceC18056) {
        return (C8534) super.w(j, interfaceC18056);
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8534) {
            C8534 c8534 = (C8534) obj;
            if (this.b == c8534.b && this.c == c8534.c && this.d == c8534.d && this.a.equals(c8534.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC14758, l.InterfaceC17579
    public final int hashCode() {
        int i = this.b;
        int i2 = this.c;
        int i3 = this.d;
        this.a.getClass();
        return (((i << 11) + (i2 << 6)) + i3) ^ ((i & (-2048)) ^ 2100100019);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3467((byte) 6, this);
    }
}
