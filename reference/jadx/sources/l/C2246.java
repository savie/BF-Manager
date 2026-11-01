package l;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: renamed from: l.ۖۖ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 8B0A */
/* JADX INFO: loaded from: classes2.dex */
public final class C2246 extends AbstractC1810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Serializable f8047;

    public C2246(Boolean bool) {
        C13638.requireNonNull(bool);
        this.f8047 = bool;
    }

    public C2246(Number number) {
        C13638.requireNonNull(number);
        this.f8047 = number;
    }

    public C2246(String str) {
        C13638.requireNonNull(str);
        this.f8047 = str;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m6896() {
        Serializable serializable = this.f8047;
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).booleanValue();
        }
        return Boolean.parseBoolean(mo5903());
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m6898() {
        return this.f8047 instanceof Boolean;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m6895() {
        return this.f8047 instanceof Number;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final double m6899() {
        return this.f8047 instanceof Number ? m6893().doubleValue() : Double.parseDouble(mo5903());
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final Number m6893() {
        Serializable serializable = this.f8047;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new C9304((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m6897() {
        return this.f8047 instanceof String;
    }

    @Override // l.AbstractC1810
    /* JADX INFO: renamed from: ۨ */
    public final String mo5903() {
        Serializable serializable = this.f8047;
        if (!(serializable instanceof String)) {
            if (!(serializable instanceof Number)) {
                if (serializable instanceof Boolean) {
                    return ((Boolean) serializable).toString();
                }
                throw new AssertionError("Unexpected value type: " + serializable.getClass());
            }
            return m6893().toString();
        }
        return (String) serializable;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final BigInteger m6894() {
        Serializable serializable = this.f8047;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m6892(this)) {
            return BigInteger.valueOf(m6893().longValue());
        }
        return C12914.m31998(mo5903());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f8047;
        if (serializable == null) {
            return 31;
        }
        if (m6892(this)) {
            jDoubleToLongBits = m6893().longValue();
        } else if (serializable instanceof Number) {
            jDoubleToLongBits = Double.doubleToLongBits(m6893().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final boolean equals(Object obj) {
        BigDecimal bigDecimalM31999;
        BigDecimal bigDecimalM319910;
        if (this == obj) {
            return true;
        }
        if (obj == null || C2246.class != obj.getClass()) {
            return false;
        }
        C2246 c2246 = (C2246) obj;
        Serializable serializable = c2246.f8047;
        Serializable serializable2 = this.f8047;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (m6892(this) && m6892(c2246)) {
            if ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) {
                return m6894().equals(c2246.m6894());
            }
            return m6893().longValue() == c2246.m6893().longValue();
        }
        if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
            if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                if (serializable2 instanceof BigDecimal) {
                    bigDecimalM31999 = (BigDecimal) serializable2;
                } else {
                    bigDecimalM31999 = C12914.m31999(mo5903());
                }
                if (serializable instanceof BigDecimal) {
                    bigDecimalM319910 = (BigDecimal) serializable;
                } else {
                    bigDecimalM319910 = C12914.m31999(c2246.mo5903());
                }
                return bigDecimalM31999.compareTo(bigDecimalM319910) == 0;
            }
            double dM6899 = m6899();
            double dM68910 = c2246.m6899();
            if (dM6899 != dM68910) {
                return Double.isNaN(dM6899) && Double.isNaN(dM68910);
            }
            return true;
        }
        return serializable2.equals(serializable);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m6892(C2246 c2246) {
        Serializable serializable = c2246.f8047;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }
}
