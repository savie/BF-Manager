package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.ܿ᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18608 implements InterfaceC25037, Serializable {
    public static final /* synthetic */ int e = 0;
    public static final long serialVersionUID = 57387258289L;
    public final InterfaceC8912 a;
    public final int b;
    public final int c;
    public final int d;

    static {
        AbstractC1758.B(new Object[]{EnumC10183.YEARS, EnumC10183.MONTHS, EnumC10183.DAYS});
    }

    public C18608(InterfaceC8912 interfaceC8912, int i, int i2, int i3) {
        C17359.requireNonNull(interfaceC8912, "chrono");
        this.a = interfaceC8912;
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

    @Override // l.InterfaceC25037
    public final InterfaceC1235 i(InterfaceC1235 interfaceC1235) {
        C17359.requireNonNull(interfaceC1235, "temporal");
        InterfaceC8912 interfaceC8912 = (InterfaceC8912) interfaceC1235.P(AbstractC17577.b);
        if (interfaceC8912 == null || this.a.equals(interfaceC8912)) {
            if (this.c != 0) {
                C23545 c23545S = this.a.s(EnumC8692.MONTH_OF_YEAR);
                long j = (c23545S.a == c23545S.b && c23545S.c == c23545S.d && c23545S.d()) ? (c23545S.d - c23545S.a) + 1 : -1L;
                if (j > 0) {
                    interfaceC1235 = interfaceC1235.c((((long) this.b) * j) + ((long) this.c), EnumC10183.MONTHS);
                } else {
                    int i = this.b;
                    if (i != 0) {
                        interfaceC1235 = interfaceC1235.c(i, EnumC10183.YEARS);
                    }
                    interfaceC1235 = interfaceC1235.c(this.c, EnumC10183.MONTHS);
                }
            } else {
                int i2 = this.b;
                if (i2 != 0) {
                    interfaceC1235 = interfaceC1235.c(i2, EnumC10183.YEARS);
                }
            }
            int i3 = this.d;
            return i3 != 0 ? interfaceC1235.c(i3, EnumC10183.DAYS) : interfaceC1235;
        }
        throw new C21241("Chronology mismatch, expected: " + this.a.getId() + ", actual: " + interfaceC8912.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18608) {
            C18608 c18608 = (C18608) obj;
            if (this.b == c18608.b && this.c == c18608.c && this.d == c18608.d && this.a.equals(c18608.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b)) ^ this.a.hashCode();
    }

    public Object writeReplace() {
        return new C6676((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
