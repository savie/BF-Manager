package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ۚ֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5005 implements InterfaceC6062, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = 57387258289L;
    public final InterfaceC21233 a;
    public final int b;
    public final int c;
    public final int d;

    static {
        AbstractC1726.B(new Object[]{EnumC22996.YEARS, EnumC22996.MONTHS, EnumC22996.DAYS});
    }

    public C5005(InterfaceC21233 interfaceC21233, int i, int i2, int i3) {
        C13638.requireNonNull(interfaceC21233, "chrono");
        this.a = interfaceC21233;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        if (this.b == 0 && this.c == 0 && this.d == 0) {
            return this.a.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.toString());
        sb.append(" P");
        int i = this.b;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.c;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.d;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // l.InterfaceC6062
    public final InterfaceC15235 l(InterfaceC15235 interfaceC15235) {
        C13638.requireNonNull(interfaceC15235, "temporal");
        InterfaceC21233 interfaceC21233 = (InterfaceC21233) interfaceC15235.T(AbstractC23702.b);
        if (interfaceC21233 == null || this.a.equals(interfaceC21233)) {
            if (this.c != 0) {
                C1828 c1828V = this.a.v(EnumC18762.MONTH_OF_YEAR);
                long j = (c1828V.a == c1828V.b && c1828V.c == c1828V.d && c1828V.d()) ? (c1828V.d - c1828V.a) + 1 : -1L;
                if (j > 0) {
                    interfaceC15235 = interfaceC15235.d((((long) this.b) * j) + ((long) this.c), EnumC22996.MONTHS);
                } else {
                    int i = this.b;
                    if (i != 0) {
                        interfaceC15235 = interfaceC15235.d(i, EnumC22996.YEARS);
                    }
                    interfaceC15235 = interfaceC15235.d(this.c, EnumC22996.MONTHS);
                }
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    interfaceC15235 = interfaceC15235.d(i2, EnumC22996.YEARS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? interfaceC15235.d(i3, EnumC22996.DAYS) : interfaceC15235;
        }
        throw new C15464("Chronology mismatch, expected: " + this.a.k() + ", actual: " + interfaceC21233.k());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5005) {
            C5005 c5005 = (C5005) obj;
            if (this.b == c5005.b && this.c == c5005.c && this.d == c5005.d && this.a.equals(c5005.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new C3467((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
