package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.֨ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1104 implements InterfaceC9437, InterfaceC1916, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C1104 c1104 = (C1104) obj;
        int i = this.a - c1104.a;
        return i == 0 ? this.b - c1104.b : i;
    }

    static {
        C11675 c11675 = new C11675();
        c11675.e("--");
        c11675.l(EnumC8692.MONTH_OF_YEAR, 2);
        c11675.d('-');
        c11675.l(EnumC8692.DAY_OF_MONTH, 2);
        c11675.q(Locale.getDefault(), EnumC18520.SMART, null);
    }

    public static C1104 of(int i, int i2) {
        EnumC6456 enumC6456U = EnumC6456.U(i);
        C17359.requireNonNull(enumC6456U, "month");
        EnumC8692.DAY_OF_MONTH.P(i2);
        if (i2 > enumC6456U.T()) {
            throw new C21241("Illegal value for DayOfMonth field, value " + i2 + " is not valid for month " + enumC6456U.name());
        }
        return new C1104(enumC6456U.getValue(), i2);
    }

    public C1104(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (interfaceC16831 instanceof EnumC8692) {
            return interfaceC16831 == EnumC8692.MONTH_OF_YEAR || interfaceC16831 == EnumC8692.DAY_OF_MONTH;
        }
        return interfaceC16831 != null && interfaceC16831.i(this);
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        int i;
        if (interfaceC16831 == EnumC8692.MONTH_OF_YEAR) {
            return interfaceC16831.p();
        }
        if (interfaceC16831 != EnumC8692.DAY_OF_MONTH) {
            return AbstractC17577.d(this, interfaceC16831);
        }
        EnumC6456 enumC6456U = EnumC6456.U(this.a);
        enumC6456U.getClass();
        int i2 = AbstractC12421.a[enumC6456U.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return C23545.g(1L, i, EnumC6456.U(this.a).T());
    }

    @Override // l.InterfaceC9437
    public final int i(InterfaceC16831 interfaceC16831) {
        return k(interfaceC16831).a(C(interfaceC16831), interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        int i;
        if (!(interfaceC16831 instanceof EnumC8692)) {
            return interfaceC16831.z(this);
        }
        int i2 = AbstractC24356.a[((EnumC8692) interfaceC16831).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
            }
            i = this.a;
        }
        return i;
    }

    public int getMonthValue() {
        return this.a;
    }

    public int getDayOfMonth() {
        return this.b;
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.b) {
            return C20012.c;
        }
        return AbstractC17577.c(this, c14435);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        if (!AbstractC2946.r(interfaceC1235).equals(C20012.c)) {
            throw new C21241("Adjustment only supported on ISO date-time");
        }
        InterfaceC1235 interfaceC1235B = interfaceC1235.b(this.a, EnumC8692.MONTH_OF_YEAR);
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_MONTH;
        return interfaceC1235B.b(Math.min(interfaceC1235B.k(enumC8692).d, this.b), enumC8692);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1104) {
            C1104 c1104 = (C1104) obj;
            if (this.a == c1104.a && this.b == c1104.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 6) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        sb.append(this.a < 10 ? "0" : "");
        sb.append(this.a);
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21372(cb.k, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
