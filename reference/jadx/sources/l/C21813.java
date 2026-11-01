package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.᩸᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21813 implements InterfaceC6062, Comparable, Serializable {
    public static final C21813 ZERO = new C21813(0, 0);
    public static final BigInteger c = BigInteger.valueOf(1000000000);
    public static final long serialVersionUID = 3078945930695997490L;
    public final long a;
    public final int b;

    public static C21813 ofMinutes(long j) {
        return m(AbstractC1726.Q(j, 60), 0);
    }

    public static C21813 ofSeconds(long j) {
        return m(j, 0);
    }

    public static C21813 s(long j, long j2) {
        return m(AbstractC1726.P(j, AbstractC1726.z(j2, 1000000000L)), (int) AbstractC1726.O(j2, 1000000000L));
    }

    public static C21813 ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return m(j2, i * BasicLabelFormatter.MILLION);
    }

    public static C21813 n(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (((long) i) + 1000000000);
            j2--;
        }
        return m(j2, i);
    }

    public static C21813 of(long j, InterfaceC18056 interfaceC18056) {
        C21813 c21813 = ZERO;
        c21813.getClass();
        C13638.requireNonNull(interfaceC18056, "unit");
        if (interfaceC18056 == EnumC22996.DAYS) {
            return c21813.C(AbstractC1726.Q(j, 86400), 0L);
        }
        if (interfaceC18056.isDurationEstimated()) {
            throw new C14530("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return c21813;
        }
        if (interfaceC18056 instanceof EnumC22996) {
            int i = AbstractC17000.a[((EnumC22996) interfaceC18056).ordinal()];
            if (i == 1) {
                return c21813.C(0L, j);
            }
            if (i == 2) {
                return c21813.C((j / 1000000000) * 1000, 0L).C(0L, (j % 1000000000) * 1000);
            }
            if (i != 3) {
                return i != 4 ? c21813.C(AbstractC1726.Q(interfaceC18056.getDuration().a, j), 0L) : c21813.C(j, 0L);
            }
            return c21813.C(j / 1000, (j % 1000) * 1000000);
        }
        C21813 duration = interfaceC18056.getDuration();
        duration.getClass();
        if (j == 0) {
            duration = c21813;
        } else if (j != 1) {
            BigInteger bigIntegerExact = BigDecimal.valueOf(duration.a).add(BigDecimal.valueOf(duration.b, 9)).multiply(BigDecimal.valueOf(j)).movePointRight(9).toBigIntegerExact();
            BigInteger[] bigIntegerArrDivideAndRemainder = bigIntegerExact.divideAndRemainder(c);
            if (bigIntegerArrDivideAndRemainder[0].bitLength() > 63) {
                throw new ArithmeticException("Exceeds capacity of Duration: " + bigIntegerExact);
            }
            duration = s(bigIntegerArrDivideAndRemainder[0].longValue(), bigIntegerArrDivideAndRemainder[1].intValue());
        }
        return c21813.C(duration.a, 0L).C(0L, duration.b);
    }

    public static C21813 between(InterfaceC15235 interfaceC15235, InterfaceC15235 interfaceC15236) {
        try {
            return n(interfaceC15235.g(interfaceC15236, EnumC22996.NANOS));
        } catch (ArithmeticException | C15464 unused) {
            long jG = interfaceC15235.g(interfaceC15236, EnumC22996.SECONDS);
            long j = 0;
            try {
                EnumC18762 enumC18762 = EnumC18762.NANO_OF_SECOND;
                long jG2 = interfaceC15236.G(enumC18762) - interfaceC15235.G(enumC18762);
                if (jG > 0 && jG2 < 0) {
                    jG++;
                } else if (jG < 0 && jG2 > 0) {
                    jG--;
                }
                j = jG2;
            } catch (C15464 unused2) {
            }
            return s(jG, j);
        }
    }

    public static C21813 m(long j, int i) {
        if ((((long) i) | j) == 0) {
            return ZERO;
        }
        return new C21813(j, i);
    }

    public C21813(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public boolean isZero() {
        return (this.a | ((long) this.b)) == 0;
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public final C21813 C(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return s(AbstractC1726.P(AbstractC1726.P(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // l.InterfaceC6062
    public final InterfaceC15235 l(InterfaceC15235 interfaceC15235) {
        long j = this.a;
        if (j != 0) {
            interfaceC15235 = interfaceC15235.d(j, EnumC22996.SECONDS);
        }
        int i = this.b;
        return i != 0 ? interfaceC15235.d(i, EnumC22996.NANOS) : interfaceC15235;
    }

    public long toMillis() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC1726.P(AbstractC1726.Q(j, 1000), j2 / 1000000);
    }

    public long toNanos() {
        long j = this.a;
        long j2 = this.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        return AbstractC1726.P(AbstractC1726.Q(j, 1000000000L), j2);
    }

    @Override // java.lang.Comparable
    public int compareTo(C21813 c21813) {
        int iCompare = Long.compare(this.a, c21813.a);
        return iCompare != 0 ? iCompare : this.b - c21813.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C21813) {
            C21813 c21813 = (C21813) obj;
            if (this.a == c21813.a && this.b == c21813.b) {
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
        return new C3944((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
