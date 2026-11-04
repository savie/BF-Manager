package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: l.ۤᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11061 extends AbstractC3692 {
    public static final long serialVersionUID = -5207853542612002020L;
    public final transient C5096 a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC12641 E(C10052 c10052) {
        return new C14878(this, c10052);
    }

    public C11061(C5096 c5096, int i, int i2, int i3) {
        c5096.U(i, i2, i3);
        this.a = c5096;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public C11061(C5096 c5096, long j) {
        int i = (int) j;
        c5096.R();
        if (i < c5096.e || i >= c5096.f) {
            throw new C21241("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(c5096.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int[] iArr = {c5096.T(iBinarySearch), ((c5096.g + iBinarySearch) % 12) + 1, (i - c5096.d[iBinarySearch]) + 1};
        this.a = c5096;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // l.InterfaceC17116
    public final InterfaceC8912 a() {
        return this.a;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC7421 G() {
        return EnumC22996.AH;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final int M() {
        return this.a.X(this.b, 12);
    }

    @Override // l.AbstractC3692, l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.j(this);
        }
        if (!AbstractC1758.f(this, interfaceC16831)) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        int i = AbstractC22250.a[enumC8692.ordinal()];
        if (i == 1) {
            return C23545.f(1L, this.a.V(this.b, this.c));
        }
        if (i != 2) {
            return i != 3 ? this.a.s(enumC8692) : C23545.f(1L, 5L);
        }
        return C23545.f(1L, M());
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        switch (AbstractC22250.a[((EnumC8692) interfaceC16831).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                return W();
            case 3:
                return ((this.d - 1) / 7) + 1;
            case 4:
                return ((int) AbstractC1758.O(D() + 3, 7)) + 1;
            case 5:
                return ((this.d - 1) % 7) + 1;
            case 6:
                return ((W() - 1) % 7) + 1;
            case 7:
                return D();
            case 8:
                return ((W() - 1) / 7) + 1;
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
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public final C11061 b(long j, InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return (C11061) super.b(j, interfaceC16831);
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        this.a.s(enumC8692).b(j, enumC8692);
        int i = (int) j;
        switch (AbstractC22250.a[enumC8692.ordinal()]) {
            case 1:
                return Z(this.b, this.c, i);
            case 2:
                return T(Math.min(i, M()) - W());
            case 3:
                return T((j - C(EnumC8692.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return T(j - ((long) (((int) AbstractC1758.O(D() + 3, 7)) + 1)));
            case 5:
                return T(j - C(EnumC8692.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return T(j - C(EnumC8692.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new C11061(this.a, j);
            case 8:
                return T((j - C(EnumC8692.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return Z(this.b, i, this.d);
            case 10:
                return U(j - (((((long) this.b) * 12) + ((long) this.c)) - 1));
            case 11:
                if (this.b < 1) {
                    i = 1 - i;
                }
                return Z(i, this.c, this.d);
            case 12:
                return Z(i, this.c, this.d);
            case 13:
                return Z(1 - this.b, this.c, this.d);
            default:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
    }

    public final C11061 Z(int i, int i2, int i3) {
        int iV = this.a.V(i, i2);
        if (i3 > iV) {
            i3 = iV;
        }
        return new C11061(this.a, i, i2, i3);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C11061) super.y(c7816);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 y(InterfaceC1916 interfaceC1916) {
        return (C11061) super.y(interfaceC1916);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 J(InterfaceC25037 interfaceC25037) {
        return (C11061) super.J(interfaceC25037);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final long D() {
        return this.a.U(this.b, this.c, this.d);
    }

    public final int W() {
        return this.a.X(this.b, this.c - 1) + this.d;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final boolean r() {
        return this.a.O(this.b);
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 V(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return Z(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // l.AbstractC3692
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final C11061 U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        C5096 c5096 = this.a;
        long jZ = AbstractC1758.z(j2, 12L);
        if (jZ >= c5096.T(0) && jZ <= c5096.T(c5096.d.length - 1) - 1) {
            return Z((int) jZ, ((int) AbstractC1758.O(j2, 12L)) + 1, this.d);
        }
        throw new C21241("Invalid Hijrah year: " + jZ);
    }

    @Override // l.AbstractC3692
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C11061 T(long j) {
        return new C11061(this.a, D() + j);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 c(long j, InterfaceC2726 interfaceC2726) {
        return (C11061) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    public final InterfaceC17116 c(long j, InterfaceC2726 interfaceC2726) {
        return (C11061) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    /* JADX INFO: renamed from: t */
    public final InterfaceC17116 z(long j, InterfaceC2726 interfaceC2726) {
        return (C11061) super.z(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return (C11061) super.z(j, enumC10183);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11061) {
            C11061 c11061 = (C11061) obj;
            if (this.b == c11061.b && this.c == c11061.c && this.d == c11061.d && this.a.equals(c11061.a)) {
                return true;
            }
        }
        return false;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
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
        return new C6676((byte) 6, this);
    }
}
