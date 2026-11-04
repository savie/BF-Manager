package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.᩹᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23830 extends AbstractC3692 {
    public static final long serialVersionUID = 1300372329181994526L;
    public final transient C7816 a;

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC12641 E(C10052 c10052) {
        return new C14878(this, c10052);
    }

    public C23830(C7816 c7816) {
        C17359.requireNonNull(c7816, "isoDate");
        this.a = c7816;
    }

    @Override // l.InterfaceC17116
    public final InterfaceC8912 a() {
        return C25322.c;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final int hashCode() {
        C25322.c.getClass();
        return this.a.hashCode() ^ (-1990173233);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC7421 G() {
        return W() >= 1 ? EnumC20846.ROC : EnumC20846.BEFORE_ROC;
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
        int i = AbstractC17862.a[enumC8692.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.k(interfaceC16831);
        }
        if (i != 4) {
            return C25322.c.s(enumC8692);
        }
        C23545 c23545 = EnumC8692.YEAR.b;
        return C23545.f(1L, W() <= 0 ? (-c23545.a) + 1912 : c23545.d - 1911);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            int i = AbstractC17862.a[((EnumC8692) interfaceC16831).ordinal()];
            if (i == 4) {
                int iW = W();
                if (iW < 1) {
                    iW = 1 - iW;
                }
                return iW;
            }
            if (i == 5) {
                return ((((long) W()) * 12) + ((long) this.a.getMonthValue())) - 1;
            }
            if (i == 6) {
                return W();
            }
            if (i != 7) {
                return this.a.C(interfaceC16831);
            }
            return W() < 1 ? 0 : 1;
        }
        return interfaceC16831.z(this);
    }

    public final int W() {
        return this.a.getYear() - 1911;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x006f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0080  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C23830 b(long j, InterfaceC16831 interfaceC16831) {
        int iA;
        int i;
        int i2;
        if (interfaceC16831 instanceof EnumC8692) {
            EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
            if (C(enumC8692) == j) {
                return this;
            }
            int[] iArr = AbstractC17862.a;
            int i3 = iArr[enumC8692.ordinal()];
            if (i3 == 4) {
                iA = C25322.c.s(enumC8692).a(j, enumC8692);
                i = iArr[enumC8692.ordinal()];
                if (i != 4) {
                    C7816 c7816 = this.a;
                    if (W() >= 1) {
                        i2 = iA + 1911;
                    } else {
                        i2 = 1912 - iA;
                    }
                    return Y(c7816.n0(i2));
                }
                if (i != 6) {
                    return Y(this.a.n0(iA + 1911));
                }
                if (i == 7) {
                    return Y(this.a.n0(1912 - W()));
                }
            } else {
                if (i3 == 5) {
                    C25322.c.s(enumC8692).b(j, enumC8692);
                    return Y(this.a.h0(j - (((((long) W()) * 12) + ((long) this.a.getMonthValue())) - 1)));
                }
                if (i3 == 6 || i3 == 7) {
                    iA = C25322.c.s(enumC8692).a(j, enumC8692);
                    i = iArr[enumC8692.ordinal()];
                    if (i != 4) {
                        C7816 c7817 = this.a;
                        if (W() >= 1) {
                            i2 = iA + 1911;
                        } else {
                            i2 = 1912 - iA;
                        }
                        return Y(c7817.n0(i2));
                    }
                    if (i != 6) {
                        return Y(this.a.n0(iA + 1911));
                    }
                    if (i == 7) {
                        return Y(this.a.n0(1912 - W()));
                    }
                }
            }
            return Y(this.a.b(j, interfaceC16831));
        }
        return (C23830) super.b(j, interfaceC16831);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C23830) super.y(c7816);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 y(InterfaceC1916 interfaceC1916) {
        return (C23830) super.y(interfaceC1916);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 J(InterfaceC25037 interfaceC25037) {
        return (C23830) super.J(interfaceC25037);
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 V(long j) {
        return Y(this.a.j0(j));
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 U(long j) {
        return Y(this.a.h0(j));
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 T(long j) {
        return Y(this.a.g0(j));
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 c(long j, InterfaceC2726 interfaceC2726) {
        return (C23830) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    public final InterfaceC17116 c(long j, InterfaceC2726 interfaceC2726) {
        return (C23830) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    /* JADX INFO: renamed from: t */
    public final InterfaceC17116 z(long j, InterfaceC2726 interfaceC2726) {
        return (C23830) super.z(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return (C23830) super.z(j, enumC10183);
    }

    public final C23830 Y(C7816 c7816) {
        return c7816.equals(this.a) ? this : new C23830(c7816);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final long D() {
        return this.a.D();
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23830) {
            return this.a.equals(((C23830) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C6676((byte) 7, this);
    }
}
