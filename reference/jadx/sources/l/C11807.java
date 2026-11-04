package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: renamed from: l.ۧᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11807 extends AbstractC3692 {
    public static final C7816 d = C7816.of(1873, 1, 1);
    public static final long serialVersionUID = -305327627230580483L;
    public final transient C7816 a;
    public final transient C25234 b;
    public final transient int c;

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC12641 E(C10052 c10052) {
        return new C14878(this, c10052);
    }

    public C11807(C7816 c7816) {
        if (c7816.Y(d)) {
            throw new C21241("JapaneseDate before Meiji 6 is not supported");
        }
        C25234 c25234H = C25234.h(c7816);
        this.b = c25234H;
        this.c = (c7816.getYear() - c25234H.b.getYear()) + 1;
        this.a = c7816;
    }

    public C11807(C25234 c25234, int i, C7816 c7816) {
        if (c7816.Y(d)) {
            throw new C21241("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = c25234;
        this.c = i;
        this.a = c7816;
    }

    @Override // l.InterfaceC17116
    public final InterfaceC8912 a() {
        return C5842.c;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final int hashCode() {
        C5842.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC7421 G() {
        return this.b;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final int M() {
        int iM;
        C25234 c25234L = this.b.l();
        if (c25234L != null && c25234L.b.getYear() == this.a.getYear()) {
            iM = c25234L.b.W() - 1;
        } else {
            iM = this.a.M();
        }
        return this.c == 1 ? iM - (this.b.b.W() - 1) : iM;
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 == EnumC8692.ALIGNED_DAY_OF_WEEK_IN_MONTH || interfaceC16831 == EnumC8692.ALIGNED_DAY_OF_WEEK_IN_YEAR || interfaceC16831 == EnumC8692.ALIGNED_WEEK_OF_MONTH || interfaceC16831 == EnumC8692.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (interfaceC16831 instanceof EnumC8692) {
            return ((EnumC8692) interfaceC16831).isDateBased();
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.AbstractC3692, l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.j(this);
        }
        if (!d(interfaceC16831)) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
        int i = AbstractC2113.a[enumC8692.ordinal()];
        if (i == 1) {
            return C23545.f(1L, this.a.Z());
        }
        if (i == 2) {
            return C23545.f(1L, M());
        }
        if (i != 3) {
            return C5842.c.s(enumC8692);
        }
        int year = this.b.b.getYear();
        C25234 c25234L = this.b.l();
        return c25234L != null ? C23545.f(1L, (c25234L.b.getYear() - year) + 1) : C23545.f(1L, 999999999 - year);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        switch (AbstractC2113.a[((EnumC8692) interfaceC16831).ordinal()]) {
            case 2:
                return this.c == 1 ? (this.a.W() - this.b.b.W()) + 1 : this.a.W();
            case 3:
                return this.c;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
            case 8:
                return this.b.a;
            default:
                return this.a.C(interfaceC16831);
        }
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final C11807 b(long j, InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            EnumC8692 enumC8692 = (EnumC8692) interfaceC16831;
            if (C(enumC8692) == j) {
                return this;
            }
            int[] iArr = AbstractC2113.a;
            int i = iArr[enumC8692.ordinal()];
            if (i == 3 || i == 8 || i == 9) {
                C5842 c5842 = C5842.c;
                int iA = c5842.s(enumC8692).a(j, enumC8692);
                int i2 = iArr[enumC8692.ordinal()];
                if (i2 == 3) {
                    return Z(this.a.n0(c5842.w(this.b, iA)));
                }
                if (i2 == 8) {
                    return Z(this.a.n0(c5842.w(C25234.m(iA), this.c)));
                }
                if (i2 == 9) {
                    return Z(this.a.n0(iA));
                }
            }
            return Z(this.a.b(j, interfaceC16831));
        }
        return (C11807) super.b(j, interfaceC16831);
    }

    public final C11807 Y(C14435 c14435) {
        return (C11807) super.y(c14435);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    /* JADX INFO: renamed from: j */
    public final InterfaceC1235 y(C7816 c7816) {
        return (C11807) super.y(c7816);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 y(InterfaceC1916 interfaceC1916) {
        return (C11807) super.y(interfaceC1916);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    public final InterfaceC17116 J(InterfaceC25037 interfaceC25037) {
        return (C11807) super.J(interfaceC25037);
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 V(long j) {
        return Z(this.a.j0(j));
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 U(long j) {
        return Z(this.a.h0(j));
    }

    @Override // l.AbstractC3692
    public final InterfaceC17116 T(long j) {
        return Z(this.a.g0(j));
    }

    public final C11807 W(long j, EnumC10183 enumC10183) {
        return (C11807) super.c(j, (InterfaceC2726) enumC10183);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 c(long j, InterfaceC2726 interfaceC2726) {
        return (C11807) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116, l.InterfaceC1235
    public final InterfaceC17116 c(long j, InterfaceC2726 interfaceC2726) {
        return (C11807) super.c(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC17116
    /* JADX INFO: renamed from: t */
    public final InterfaceC17116 z(long j, InterfaceC2726 interfaceC2726) {
        return (C11807) super.z(j, interfaceC2726);
    }

    @Override // l.AbstractC3692, l.InterfaceC1235
    public final InterfaceC1235 z(long j, EnumC10183 enumC10183) {
        return (C11807) super.z(j, enumC10183);
    }

    public final C11807 Z(C7816 c7816) {
        return c7816.equals(this.a) ? this : new C11807(c7816);
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
        if (obj instanceof C11807) {
            return this.a.equals(((C11807) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C6676((byte) 4, this);
    }
}
