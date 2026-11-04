package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۠ۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8561 implements InterfaceC25037, Serializable {
    public static final C8561 d = new C8561(0, 0, 0);
    public static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC1758.B(new Object[]{EnumC10183.YEARS, EnumC10183.MONTHS, EnumC10183.DAYS});
    }

    public static C8561 of(int i, int i2, int i3) {
        return a(i, i2, i3);
    }

    public static C8561 a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new C8561(i, i2, i3);
    }

    public C8561(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public int getYears() {
        return this.a;
    }

    public int getMonths() {
        return this.b;
    }

    public int getDays() {
        return this.c;
    }

    @Override // l.InterfaceC25037
    public final InterfaceC1235 i(InterfaceC1235 interfaceC1235) {
        C17359.requireNonNull(interfaceC1235, "temporal");
        InterfaceC8912 interfaceC8912 = (InterfaceC8912) interfaceC1235.P(AbstractC17577.b);
        if (interfaceC8912 == null || C20012.c.equals(interfaceC8912)) {
            int i = this.b;
            if (i != 0) {
                long j = (((long) this.a) * 12) + ((long) i);
                if (j != 0) {
                    interfaceC1235 = interfaceC1235.c(j, EnumC10183.MONTHS);
                }
            } else {
                int i2 = this.a;
                if (i2 != 0) {
                    interfaceC1235 = interfaceC1235.c(i2, EnumC10183.YEARS);
                }
            }
            int i3 = this.c;
            return i3 != 0 ? interfaceC1235.c(i3, EnumC10183.DAYS) : interfaceC1235;
        }
        throw new C21241("Chronology mismatch, expected: ISO, actual: " + interfaceC8912.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8561) {
            C8561 c8561 = (C8561) obj;
            if (this.a == c8561.a && this.b == c8561.b && this.c == c8561.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21372(cb.f82047l, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
