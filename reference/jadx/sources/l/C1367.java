package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.֨ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1367 implements InterfaceC0621 {
    public final String toString() {
        return "Instant()";
    }

    @Override // l.InterfaceC0621
    public final boolean i(C16150 c16150, StringBuilder sb) {
        Long lA = c16150.a(EnumC8692.INSTANT_SECONDS);
        InterfaceC9437 interfaceC9437 = c16150.a;
        EnumC8692 enumC8692 = EnumC8692.NANO_OF_SECOND;
        Long lValueOf = interfaceC9437.d(enumC8692) ? Long.valueOf(interfaceC9437.C(enumC8692)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = enumC8692.b.a(lValueOf != null ? lValueOf.longValue() : 0L, enumC8692);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jZ = AbstractC1758.z(j, 315569520000L) + 1;
            C19003 c19003U = C19003.U(AbstractC1758.O(j, 315569520000L) - 62167219200L, 0, C11149.f);
            if (jZ > 0) {
                sb.append('+');
                sb.append(jZ);
            }
            sb.append(c19003U);
            if (c19003U.b.getSecond() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C19003 c19003U2 = C19003.U(j4 - 62167219200L, 0, C11149.f);
            int length = sb.length();
            sb.append(c19003U2);
            if (c19003U2.b.getSecond() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (c19003U2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iA > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iA <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iA / i2;
                sb.append((char) (i3 + 48));
                iA -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // l.InterfaceC0621
    public final int j(C25102 c25102, CharSequence charSequence, int i) {
        C11675 c11675 = new C11675();
        c11675.a(C23742.f);
        c11675.d('T');
        EnumC8692 enumC8692 = EnumC8692.HOUR_OF_DAY;
        c11675.l(enumC8692, 2);
        c11675.d(':');
        EnumC8692 enumC8693 = EnumC8692.MINUTE_OF_HOUR;
        c11675.l(enumC8693, 2);
        c11675.d(':');
        EnumC8692 enumC8694 = EnumC8692.SECOND_OF_MINUTE;
        c11675.l(enumC8694, 2);
        EnumC8692 enumC8695 = EnumC8692.NANO_OF_SECOND;
        int i2 = 1;
        c11675.b(enumC8695, 0, 9, true);
        c11675.d('Z');
        C21504 c21504 = c11675.q(Locale.getDefault(), EnumC18520.SMART, null).a;
        if (c21504.b) {
            c21504 = new C21504(c21504.a, false);
        }
        C25102 c25103 = new C25102(c25102.a);
        c25103.b = c25102.b;
        c25103.c = c25102.c;
        int iJ = c21504.j(c25103, charSequence, i);
        if (iJ < 0) {
            return iJ;
        }
        long jLongValue = c25103.d(EnumC8692.YEAR).longValue();
        int iIntValue = c25103.d(EnumC8692.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c25103.d(EnumC8692.DAY_OF_MONTH).intValue();
        int iIntValue3 = c25103.d(enumC8692).intValue();
        int iIntValue4 = c25103.d(enumC8693).intValue();
        Long lD = c25103.d(enumC8694);
        Long lD2 = c25103.d(enumC8695);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else {
            if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                c25102.c().d = true;
                iIntValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            C19003 c19003 = C19003.c;
            C7816 c7816Of = C7816.of(i3, iIntValue, iIntValue2);
            C10052 c10052Of = C10052.of(iIntValue3, iIntValue4, iIntValue5, 0);
            return c25102.f(enumC8695, iIntValue6, i, c25102.f(EnumC8692.INSTANT_SECONDS, AbstractC1758.Q(jLongValue / 10000, 315569520000L) + AbstractC1758.j(new C19003(c7816Of, c10052Of).Z(c7816Of.g0(i2), c10052Of), C11149.f), i, iJ));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
