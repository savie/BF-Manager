package l;

import com.google.android.material.motion.MotionUtils;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: l.۬ܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13243 extends C21709 {
    public final boolean g;

    @Override // l.C21709
    public final boolean b(C12537 c12537) {
        return c12537.c && this.b == this.c && !this.g;
    }

    @Override // l.C21709, l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        boolean z = c12537.c;
        C23351 c23351 = c12537.a;
        int i2 = (z || b(c12537)) ? this.b : 0;
        int i3 = (c12537.c || b(c12537)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                c23351.c.getClass();
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
                c23351.c.getClass();
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
            C1828 c1828S = this.a.s();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1828S.a);
            return c12537.f(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c1828S.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i7);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public C13243(InterfaceC11002 interfaceC11002, int i, int i2, boolean z) {
        this(interfaceC11002, i, i2, z, 0);
        C13638.requireNonNull(interfaceC11002, "field");
        C1828 c1828S = interfaceC11002.s();
        if (c1828S.a != c1828S.b || c1828S.c != c1828S.d) {
            throw new IllegalArgumentException(AbstractC21107.a("Field must have a fixed set of values: ", interfaceC11002));
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

    public C13243(InterfaceC11002 interfaceC11002, int i, int i2, boolean z, int i3) {
        super(interfaceC11002, i, i2, EnumC1247.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // l.C21709
    public final C21709 d() {
        if (this.e == -1) {
            return this;
        }
        return new C13243(this.a, this.b, this.c, this.g, -1);
    }

    @Override // l.C21709
    public final C21709 e(int i) {
        return new C13243(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // l.C21709, l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        InterfaceC11002 interfaceC11002 = this.a;
        Long lA = c11126.a(interfaceC11002);
        if (lA == null) {
            return false;
        }
        C4775 c4775 = c11126.b.c;
        long jLongValue = lA.longValue();
        C1828 c1828S = interfaceC11002.s();
        c1828S.b(jLongValue, interfaceC11002);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1828S.a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c1828S.d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
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
            c4775.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z) {
                c4775.getClass();
                sb.append('.');
            }
            for (int i2 = 0; i2 < i; i2++) {
                c4775.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // l.C21709
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
