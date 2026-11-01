package l;

import com.umeng.analytics.pro.cb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: l.۬۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13118 implements InterfaceC6062, Serializable {
    public static final C13118 d = new C13118(0, 0, 0);
    public static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        AbstractC1726.B(new Object[]{EnumC22996.YEARS, EnumC22996.MONTHS, EnumC22996.DAYS});
    }

    public static C13118 a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new C13118(i, i2, i3);
    }

    public C13118(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // l.InterfaceC6062
    public final InterfaceC15235 l(InterfaceC15235 interfaceC15235) {
        C13638.requireNonNull(interfaceC15235, "temporal");
        InterfaceC21233 interfaceC21233 = (InterfaceC21233) interfaceC15235.T(AbstractC23702.b);
        if (interfaceC21233 == null || C7122.c.equals(interfaceC21233)) {
            int i = this.b;
            if (i != 0) {
                long j = (((long) this.a) * 12) + ((long) i);
                if (j != 0) {
                    interfaceC15235 = interfaceC15235.d(j, EnumC22996.MONTHS);
                }
            } else {
                int i2 = this.a;
                if (i2 != 0) {
                    interfaceC15235 = interfaceC15235.d(i2, EnumC22996.YEARS);
                }
            }
            int i3 = this.c;
            return i3 != 0 ? interfaceC15235.d(i3, EnumC22996.DAYS) : interfaceC15235;
        }
        throw new C15464("Chronology mismatch, expected: ISO, actual: " + interfaceC21233.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13118) {
            C13118 c13118 = (C13118) obj;
            if (this.a == c13118.a && this.b == c13118.b && this.c == c13118.c) {
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
        return new C3944(cb.f77931l, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
