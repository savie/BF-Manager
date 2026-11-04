package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ܿۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18257 implements InterfaceC25037, Comparable, Serializable {
    public static final C18257 ZERO = new C18257(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    public static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public static C18257 ofMinutes(long j) {
        return j(AbstractC1758.Q(j, 60), 0);
    }

    public static C18257 ofSeconds(long j) {
        return j(j, 0);
    }

    public static C18257 ofSeconds(long j, long j2) {
        return j(AbstractC1758.P(j, AbstractC1758.z(j2, 1000000000L)), (int) AbstractC1758.O(j2, 1000000000L));
    }

    public static C18257 ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return j(j2, i * BasicLabelFormatter.MILLION);
    }

    public static C18257 k(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return j(j2, i);
    }

    public static C18257 of(long j, InterfaceC2726 interfaceC2726) {
        C18257 c18257 = ZERO;
        c18257.getClass();
        C17359.requireNonNull(interfaceC2726, "unit");
        if (interfaceC2726 == EnumC10183.DAYS) {
            return c18257.p(AbstractC1758.Q(j, 86400), 0L);
        }
        if (interfaceC2726.isDurationEstimated()) {
            throw new C16085("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return c18257;
        }
        if (interfaceC2726 instanceof EnumC10183) {
            int i = AbstractC17028.a[((EnumC10183) interfaceC2726).ordinal()];
            if (i == 1) {
                return c18257.p(0L, j);
            }
            if (i == 2) {
                return c18257.p((j / 1000000000) * 1000, 0L).p(0L, (j % 1000000000) * 1000);
            }
            if (i != 3) {
                return i != 4 ? c18257.p(AbstractC1758.Q(interfaceC2726.getDuration().a, j), 0L) : c18257.p(j, 0L);
            }
            return c18257.p(j / 1000, (j % 1000) * 1000000);
        }
        C18257 duration = interfaceC2726.getDuration();
        duration.getClass();
        if (j == 0) {
            duration = c18257;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration.a).add(BigDecimal.valueOf(duration.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
            }
            duration = ofSeconds(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return c18257.p(duration.getSeconds(), 0L).p(0L, duration.getNano());
    }

    public static C18257 between(InterfaceC1235 interfaceC1235, InterfaceC1235 interfaceC1236) {
        try {
            return k(interfaceC1235.f(interfaceC1236, EnumC10183.NANOS));
        } catch (ArithmeticException | C21241 unused) {
            long jF = interfaceC1235.f(interfaceC1236, EnumC10183.SECONDS);
            long j = 0;
            try {
                EnumC8692 enumC8692 = EnumC8692.NANO_OF_SECOND;
                long jC = interfaceC1236.C(enumC8692) - interfaceC1235.C(enumC8692);
                if (jF > 0 && jC < 0) {
                    jF++;
                } else if (jF < 0 && jC > 0) {
                    jF--;
                }
                j = jC;
            } catch (C21241 unused2) {
            }
            return ofSeconds(jF, j);
        }
    }

    public static C18257 j(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new C18257(j, i);
    }

    public C18257(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public long getSeconds() {
        return this.a;
    }

    public int getNano() {
        return this.b;
    }

    public final C18257 p(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(AbstractC1758.P(AbstractC1758.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC25037
    public final InterfaceC1235 i(InterfaceC1235 interfaceC1235) {
        long j = this.a;
        if (j != 0) {
            interfaceC1235 = interfaceC1235.c(j, EnumC10183.SECONDS);
        }
        int i = this.b;
        return i != 0 ? interfaceC1235.c(i, EnumC10183.NANOS) : interfaceC1235;
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC1758.P(AbstractC1758.Q(j, 1000), j2 / 1000000);
    }

    public long toNanos() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC1758.P(AbstractC1758.Q(j, 1000000000L), j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(C18257 c18257) {
        int iCompare = Long.compare(this.a, c18257.a);
        return iCompare != 0 ? iCompare : this.b - c18257.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18257) {
            C18257 c18257 = (C18257) obj;
            if (this.a == c18257.a && this.b == c18257.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        if (j < 0 && this.b > 0) {
            j++;
        }
        long j2 = j / 3600;
        int i = (int) ((j % 3600) / 60);
        int i2 = (int) (j % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j2 != 0) {
            sb.append(j2);
            sb.append('H');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('M');
        }
        if (i2 == 0 && this.b == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (this.a < 0 && this.b > 0 && i2 == 0) {
            sb.append("-0");
        } else {
            sb.append(i2);
        }
        if (this.b > 0) {
            int length = sb.length();
            if (this.a < 0) {
                sb.append(2000000000 - ((long) this.b));
            } else {
                sb.append(((long) this.b) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new C21372((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
