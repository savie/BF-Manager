package l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖ᩵ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B0A */
/* JADX INFO: loaded from: classes3.dex */
public final class C2892 extends AbstractC0655 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Serializable f9480;

    public C2892(Boolean bool) {
        C17359.requireNonNull(bool);
        this.f9480 = bool;
    }

    public C2892(Number number) {
        C17359.requireNonNull(number);
        this.f9480 = number;
    }

    public C2892(String str) {
        C17359.requireNonNull(str);
        this.f9480 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m9519() {
        return this.f9480 instanceof Boolean;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m9523() {
        Serializable serializable = this.f9480;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo2866());
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m9518() {
        return this.f9480 instanceof Number;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final double m9522() {
        return this.f9480 instanceof Number ? m9521().doubleValue() : Double.parseDouble(mo2866());
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Number m9521() {
        Serializable serializable = this.f9480;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C1160((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m9520() {
        return this.f9480 instanceof String;
    }

    @Override // l.AbstractC0655
    /* JADX INFO: renamed from: ۤ */
    public final String mo2866() {
        Serializable serializable = this.f9480;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                throw new AssertionError("Unexpected value type: " + serializable.getClass());
            }
            return m9521().toString();
        }
        return (String) serializable;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final BigInteger m9524() {
        Serializable serializable = this.f9480;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m9517(this)) {
            return BigInteger.valueOf(m9521().longValue());
        }
        return C10680.m27227(mo2866());
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e A[PHI: r0
      0x001e: PHI (r0v7 double) = (r0v3 double), (r0v11 double) binds: [B:15:0x0033, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035 A[PHI: r3
      0x0035: PHI (r3v1 long) = (r3v0 long), (r3v2 long) binds: [B:15:0x0033, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    public final int hashCode() {
        double dDoubleValue;
        long j;
        long j2;
        Serializable serializable = this.f9480;
        if (serializable == null) {
            return 31;
        }
        if (m9517(this)) {
            dDoubleValue = m9521().doubleValue();
            j = (long) dDoubleValue;
            if (dDoubleValue == j) {
                j2 = (j >>> 32) ^ j;
            } else {
                long jDoubleToLongBits = Double.doubleToLongBits(dDoubleValue);
                j2 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
            }
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            dDoubleValue = m9521().doubleValue();
            j = (long) dDoubleValue;
            if (dDoubleValue == j) {
                j2 = (j >>> 32) ^ j;
            } else {
                long jDoubleToLongBits2 = Double.doubleToLongBits(dDoubleValue);
                j2 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
            }
        }
        return (int) j2;
    }

    public final boolean equals(Object obj) {
        BigDecimal bigDecimalM27228;
        BigDecimal bigDecimalM27229;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2892.class != obj.getClass()) {
            return false;
        }
        C2892 c2892 = (C2892) obj;
        Serializable serializable = c2892.f9480;
        Serializable serializable2 = this.f9480;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m9517(this) && m9517(c2892)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m9524().equals(c2892.m9524());
            }
            return m9521().longValue() == c2892.m9521().longValue();
        }
        if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
            if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                if (serializable2 instanceof BigDecimal) {
                    bigDecimalM27228 = (BigDecimal) serializable2;
                } else {
                    bigDecimalM27228 = C10680.m27228(mo2866());
                }
                if (serializable instanceof BigDecimal) {
                    bigDecimalM27229 = (BigDecimal) serializable;
                } else {
                    bigDecimalM27229 = C10680.m27228(c2892.mo2866());
                }
                return bigDecimalM27228.compareTo(bigDecimalM27229) == 0;
            }
            double dM9522 = m9522();
            double dM9523 = c2892.m9522();
            if (dM9522 != dM9523) {
                return Double.isNaN(dM9522) && Double.isNaN(dM9523);
            }
            return true;
        }
        return serializable2.equals(serializable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m9517(C2892 c2892) {
        Serializable serializable = c2892.f9480;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
