package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: renamed from: l.ۖ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2533 implements InterfaceC21584, InterfaceC12413, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    public static final long serialVersionUID = -939150713474957432L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2533 c2533 = (C2533) obj;
        int i = this.a - c2533.a;
        return i == 0 ? this.b - c2533.b : i;
    }

    static {
        C16770 c16770 = new C16770();
        c16770.e("--");
        c16770.l(EnumC18762.MONTH_OF_YEAR, 2);
        c16770.d('-');
        c16770.l(EnumC18762.DAY_OF_MONTH, 2);
        c16770.q(Locale.getDefault(), EnumC5481.SMART, null);
    }

    public C2533(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (interfaceC11002 instanceof EnumC18762) {
            return interfaceC11002 == EnumC18762.MONTH_OF_YEAR || interfaceC11002 == EnumC18762.DAY_OF_MONTH;
        }
        return interfaceC11002 != null && interfaceC11002.l(this);
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        int i;
        if (interfaceC11002 == EnumC18762.MONTH_OF_YEAR) {
            return interfaceC11002.s();
        }
        if (interfaceC11002 != EnumC18762.DAY_OF_MONTH) {
            return AbstractC23702.d(this, interfaceC11002);
        }
        EnumC13824 enumC13824Y = EnumC13824.Y(this.a);
        enumC13824Y.getClass();
        int i2 = AbstractC4650.a[enumC13824Y.ordinal()];
        if (i2 != 1) {
            i = (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        } else {
            i = 28;
        }
        return C1828.g(1L, i, EnumC13824.Y(this.a).X());
    }

    @Override // l.InterfaceC21584
    public final int l(InterfaceC11002 interfaceC11002) {
        return n(interfaceC11002).a(G(interfaceC11002), interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        int i;
        if (!(interfaceC11002 instanceof EnumC18762)) {
            return interfaceC11002.C(this);
        }
        int i2 = AbstractC11707.a[((EnumC18762) interfaceC11002).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 != 2) {
                throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
            }
            i = this.a;
        }
        return i;
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.b) {
            return C7122.c;
        }
        return AbstractC23702.c(this, c22935);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        if (!AbstractC14884.r(interfaceC15235).equals(C7122.c)) {
            throw new C15464("Adjustment only supported on ISO date-time");
        }
        InterfaceC15235 interfaceC15235C = interfaceC15235.c(this.a, EnumC18762.MONTH_OF_YEAR);
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_MONTH;
        return interfaceC15235C.c(Math.min(interfaceC15235C.n(enumC18762).d, this.b), enumC18762);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2533) {
            C2533 c2533 = (C2533) obj;
            if (this.a == c2533.a && this.b == c2533.b) {
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
        return new C3944(cb.k, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
