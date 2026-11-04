package l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.ᩳᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19266 extends C8824 {
    public final boolean g;

    @Override // l.C8824
    public final boolean b(C25102 c25102) {
        return c25102.c && this.b == this.c && !this.g;
    }

    @Override // l.C8824, l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        boolean z = c25102.c;
        C23742 c23742 = c25102.a;
        int i2 = (z || b(c25102)) ? this.b : 0;
        int i3 = (c25102.c || b(c25102)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                c23742.c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = 0;
            int i7 = i4;
            while (i7 < iMin) {
                int i8 = i7 + 1;
                char cCharAt2 = charSequence.charAt(i7);
                c23742.c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 < 0) {
                    if (i8 >= i5) {
                        break;
                    }
                    return ~i4;
                }
                i6 = (i6 * 10) + i9;
                i7 = i8;
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i6).movePointLeft(i7 - i4);
            C23545 c23545P = this.a.p();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c23545P.a);
            return c25102.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c23545P.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public C19266(InterfaceC16831 interfaceC16831, int i, int i2, boolean z) {
        this(interfaceC16831, i, i2, z, 0);
        C17359.requireNonNull(interfaceC16831, "field");
        C23545 c23545P = interfaceC16831.p();
        if (c23545P.a != c23545P.b || c23545P.c != c23545P.d) {
            throw new IllegalArgumentException(AbstractC15624.a("Field must have a fixed set of values: ", interfaceC16831));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    public C19266(InterfaceC16831 interfaceC16831, int i, int i2, boolean z, int i3) {
        super(interfaceC16831, i, i2, EnumC8079.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // l.C8824
    public final C8824 d() {
        if (this.e == -1) {
            return this;
        }
        return new C19266(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C8824
    public final C8824 e(int i) {
        return new C19266(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C8824, l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        InterfaceC16831 interfaceC16831 = this.a;
        Long lA = c16150.a(interfaceC16831);
        if (lA == null) {
            return false;
        }
        C24488 c24488 = c16150.b.c;
        long jLongValue = lA.longValue();
        C23545 c23545P = interfaceC16831.p();
        c23545P.b(jLongValue, interfaceC16831);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c23545P.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c23545P.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            c24488.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c24488.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c24488.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // l.C8824
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
