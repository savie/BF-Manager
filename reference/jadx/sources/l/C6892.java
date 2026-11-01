package l;

import java.util.Locale;

/* JADX INFO: renamed from: l.ۜܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6892 implements InterfaceC22415 {
    public final String toString() {
        return "Instant()";
    }

    @Override // l.InterfaceC22415
    public final boolean l(C11126 c11126, StringBuilder sb) {
        Long lA = c11126.a(EnumC18762.INSTANT_SECONDS);
        InterfaceC21584 interfaceC21584 = c11126.a;
        EnumC18762 enumC18762 = EnumC18762.NANO_OF_SECOND;
        Long lValueOf = interfaceC21584.e(enumC18762) ? Long.valueOf(interfaceC21584.G(enumC18762)) : null;
        int i = 0;
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        int iA = enumC18762.b.a(lValueOf != null ? lValueOf.longValue() : 0L, enumC18762);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jZ = AbstractC1726.z(j, 315569520000L) + 1;
            C1952 c1952Z = C1952.Z(AbstractC1726.O(j, 315569520000L) - 62167219200L, 0, C2678.f);
            if (jZ > 0) {
                sb.append('+');
                sb.append(jZ);
            }
            sb.append(c1952Z);
            if (c1952Z.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            C1952 c1952Z2 = C1952.Z(j4 - 62167219200L, 0, C2678.f);
            int length = sb.length();
            sb.append(c1952Z2);
            if (c1952Z2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (c1952Z2.a.a == -10000) {
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

    @Override // l.InterfaceC22415
    public final int m(C12537 c12537, CharSequence charSequence, int i) {
        C16770 c16770 = new C16770();
        c16770.a(C23351.f);
        c16770.d('T');
        EnumC18762 enumC18762 = EnumC18762.HOUR_OF_DAY;
        c16770.l(enumC18762, 2);
        c16770.d(':');
        EnumC18762 enumC18763 = EnumC18762.MINUTE_OF_HOUR;
        c16770.l(enumC18763, 2);
        c16770.d(':');
        EnumC18762 enumC18764 = EnumC18762.SECOND_OF_MINUTE;
        c16770.l(enumC18764, 2);
        EnumC18762 enumC18765 = EnumC18762.NANO_OF_SECOND;
        int i2 = 1;
        c16770.b(enumC18765, 0, 9, true);
        c16770.d('Z');
        C2658 c2658 = c16770.q(Locale.getDefault(), EnumC5481.SMART, null).a;
        if (c2658.b) {
            c2658 = new C2658(c2658.a, false);
        }
        C12537 c12538 = new C12537(c12537.a);
        c12538.b = c12537.b;
        c12538.c = c12537.c;
        int iM = c2658.m(c12538, charSequence, i);
        if (iM < 0) {
            return iM;
        }
        long jLongValue = c12538.d(EnumC18762.YEAR).longValue();
        int iIntValue = c12538.d(EnumC18762.MONTH_OF_YEAR).intValue();
        int iIntValue2 = c12538.d(EnumC18762.DAY_OF_MONTH).intValue();
        int iIntValue3 = c12538.d(enumC18762).intValue();
        int iIntValue4 = c12538.d(enumC18763).intValue();
        Long lD = c12538.d(enumC18764);
        Long lD2 = c12538.d(enumC18765);
        int iIntValue5 = lD != null ? lD.intValue() : 0;
        int iIntValue6 = lD2 != null ? lD2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            iIntValue3 = 0;
        } else {
            if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                c12537.c().d = true;
                iIntValue5 = 59;
            }
            i2 = 0;
        }
        int i3 = ((int) jLongValue) % 10000;
        try {
            C1952 c1952 = C1952.c;
            C18991 c18991H0 = C18991.h0(i3, iIntValue, iIntValue2);
            C3363 c3363Z = C3363.Z(iIntValue3, iIntValue4, iIntValue5, 0);
            return c12537.f(enumC18765, iIntValue6, i, c12537.f(EnumC18762.INSTANT_SECONDS, AbstractC1726.Q(jLongValue / 10000, 315569520000L) + AbstractC1726.j(new C1952(c18991H0, c3363Z).e0(c18991H0.l0(i2), c3363Z), C2678.f), i, iM));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }
}
