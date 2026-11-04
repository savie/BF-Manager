package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ܰᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14790 implements InterfaceC9437 {
    public AbstractC22338 b;
    public InterfaceC8912 c;
    public boolean d;
    public EnumC18520 e;
    public InterfaceC17116 f;
    public C10052 g;
    public final Map a = new HashMap();
    public C8561 h = C8561.d;

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.a(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ C23545 k(InterfaceC16831 interfaceC16831) {
        return AbstractC17577.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final boolean d(InterfaceC16831 interfaceC16831) {
        if (((HashMap) this.a).containsKey(interfaceC16831)) {
            return true;
        }
        InterfaceC17116 interfaceC17116 = this.f;
        if (interfaceC17116 != null && interfaceC17116.d(interfaceC16831)) {
            return true;
        }
        C10052 c10052 = this.g;
        if (c10052 == null || !c10052.d(interfaceC16831)) {
            return (interfaceC16831 == null || (interfaceC16831 instanceof EnumC8692) || !interfaceC16831.i(this)) ? false : true;
        }
        return true;
    }

    @Override // l.InterfaceC9437
    public final long C(InterfaceC16831 interfaceC16831) {
        C17359.requireNonNull(interfaceC16831, "field");
        Long l2 = (Long) ((HashMap) this.a).get(interfaceC16831);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC17116 interfaceC17116 = this.f;
        if (interfaceC17116 != null && interfaceC17116.d(interfaceC16831)) {
            return this.f.C(interfaceC16831);
        }
        C10052 c10052 = this.g;
        if (c10052 != null && c10052.d(interfaceC16831)) {
            return this.g.C(interfaceC16831);
        }
        if (interfaceC16831 instanceof EnumC8692) {
            throw new C16085(AbstractC15624.a("Unsupported field: ", interfaceC16831));
        }
        return interfaceC16831.z(this);
    }

    @Override // l.InterfaceC9437
    public final Object P(C14435 c14435) {
        if (c14435 == AbstractC17577.a) {
            return this.b;
        }
        if (c14435 == AbstractC17577.b) {
            return this.c;
        }
        if (c14435 == AbstractC17577.f) {
            InterfaceC17116 interfaceC17116 = this.f;
            if (interfaceC17116 != null) {
                return C7816.T(interfaceC17116);
            }
            return null;
        }
        if (c14435 == AbstractC17577.g) {
            return this.g;
        }
        if (c14435 == AbstractC17577.d) {
            Long l2 = (Long) ((HashMap) this.a).get(EnumC8692.OFFSET_SECONDS);
            if (l2 != null) {
                return C11149.ofTotalSeconds(l2.intValue());
            }
            AbstractC22338 abstractC22338 = this.b;
            return abstractC22338 instanceof C11149 ? abstractC22338 : c14435.g(this);
        }
        if (c14435 == AbstractC17577.e) {
            return c14435.g(this);
        }
        if (c14435 == AbstractC17577.c) {
            return null;
        }
        return c14435.g(this);
    }

    public final void v(InterfaceC16831 interfaceC16831, EnumC8692 enumC8692, Long l2) {
        Long l3 = (Long) ((HashMap) this.a).put(enumC8692, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new C21241("Conflict found: " + enumC8692 + " " + l3 + " differs from " + enumC8692 + " " + l2 + " while resolving  " + interfaceC16831);
    }

    public final void l() {
        if (((HashMap) this.a).containsKey(EnumC8692.INSTANT_SECONDS)) {
            AbstractC22338 abstractC22338 = this.b;
            if (abstractC22338 != null) {
                m(abstractC22338);
                return;
            }
            Long l2 = (Long) ((HashMap) this.a).get(EnumC8692.OFFSET_SECONDS);
            if (l2 != null) {
                m(C11149.ofTotalSeconds(l2.intValue()));
            }
        }
    }

    public final void m(AbstractC22338 abstractC22338) {
        Map map = this.a;
        EnumC8692 enumC8692 = EnumC8692.INSTANT_SECONDS;
        InterfaceC5930 interfaceC5930L = this.c.L(C0358.ofEpochSecond(((Long) ((HashMap) map).remove(enumC8692)).longValue()), abstractC22338);
        u(interfaceC5930L.e());
        v(enumC8692, EnumC8692.SECOND_OF_DAY, Long.valueOf(interfaceC5930L.toLocalTime().d0()));
    }

    public final void u(InterfaceC17116 interfaceC17116) {
        InterfaceC17116 interfaceC17117 = this.f;
        if (interfaceC17117 != null) {
            if (interfaceC17116 == null || interfaceC17117.equals(interfaceC17116)) {
                return;
            }
            throw new C21241("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC17116);
        }
        if (interfaceC17116 != null) {
            if (!this.c.equals(interfaceC17116.a())) {
                throw new C21241("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC17116;
        }
    }

    public final void p() {
        Map map = this.a;
        EnumC8692 enumC8692 = EnumC8692.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC8692)) {
            long jLongValue = ((Long) ((HashMap) this.a).remove(enumC8692)).longValue();
            EnumC18520 enumC18520 = this.e;
            if (enumC18520 == EnumC18520.STRICT || (enumC18520 == EnumC18520.SMART && jLongValue != 0)) {
                enumC8692.P(jLongValue);
            }
            EnumC8692 enumC8693 = EnumC8692.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            v(enumC8692, enumC8693, Long.valueOf(jLongValue));
        }
        Map map2 = this.a;
        EnumC8692 enumC8694 = EnumC8692.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC8694)) {
            long jLongValue2 = ((Long) ((HashMap) this.a).remove(enumC8694)).longValue();
            EnumC18520 enumC18521 = this.e;
            if (enumC18521 == EnumC18520.STRICT || (enumC18521 == EnumC18520.SMART && jLongValue2 != 0)) {
                enumC8694.P(jLongValue2);
            }
            v(enumC8694, EnumC8692.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.a;
        EnumC8692 enumC8695 = EnumC8692.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC8695)) {
            Map map4 = this.a;
            EnumC8692 enumC8696 = EnumC8692.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC8696)) {
                long jLongValue3 = ((Long) ((HashMap) this.a).remove(enumC8695)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.a).remove(enumC8696)).longValue();
                if (this.e == EnumC18520.LENIENT) {
                    v(enumC8695, EnumC8692.HOUR_OF_DAY, Long.valueOf(AbstractC1758.P(AbstractC1758.Q(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC8695.P(jLongValue3);
                    enumC8696.P(jLongValue3);
                    v(enumC8695, EnumC8692.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.a;
        EnumC8692 enumC8697 = EnumC8692.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC8697)) {
            long jLongValue5 = ((Long) ((HashMap) this.a).remove(enumC8697)).longValue();
            if (this.e != EnumC18520.LENIENT) {
                enumC8697.P(jLongValue5);
            }
            v(enumC8697, EnumC8692.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            v(enumC8697, EnumC8692.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            v(enumC8697, EnumC8692.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            v(enumC8697, EnumC8692.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.a;
        EnumC8692 enumC8698 = EnumC8692.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC8698)) {
            long jLongValue6 = ((Long) ((HashMap) this.a).remove(enumC8698)).longValue();
            if (this.e != EnumC18520.LENIENT) {
                enumC8698.P(jLongValue6);
            }
            v(enumC8698, EnumC8692.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            v(enumC8698, EnumC8692.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.a;
        EnumC8692 enumC8699 = EnumC8692.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC8699)) {
            long jLongValue7 = ((Long) ((HashMap) this.a).remove(enumC8699)).longValue();
            if (this.e != EnumC18520.LENIENT) {
                enumC8699.P(jLongValue7);
            }
            v(enumC8699, EnumC8692.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            v(enumC8699, EnumC8692.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.a;
        EnumC8692 enumC86910 = EnumC8692.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC86910)) {
            long jLongValue8 = ((Long) ((HashMap) this.a).remove(enumC86910)).longValue();
            if (this.e != EnumC18520.LENIENT) {
                enumC86910.P(jLongValue8);
            }
            v(enumC86910, EnumC8692.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            v(enumC86910, EnumC8692.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            v(enumC86910, EnumC8692.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.a;
        EnumC8692 enumC86911 = EnumC8692.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC86911)) {
            long jLongValue9 = ((Long) ((HashMap) this.a).remove(enumC86911)).longValue();
            if (this.e != EnumC18520.LENIENT) {
                enumC86911.P(jLongValue9);
            }
            v(enumC86911, EnumC8692.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            v(enumC86911, EnumC8692.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.a;
        EnumC8692 enumC86912 = EnumC8692.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC86912)) {
            long jLongValue10 = ((Long) ((HashMap) this.a).get(enumC86912)).longValue();
            EnumC18520 enumC18522 = this.e;
            EnumC18520 enumC18523 = EnumC18520.LENIENT;
            if (enumC18522 != enumC18523) {
                enumC86912.P(jLongValue10);
            }
            Map map11 = this.a;
            EnumC8692 enumC86913 = EnumC8692.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC86913)) {
                long jLongValue11 = ((Long) ((HashMap) this.a).remove(enumC86913)).longValue();
                if (this.e != enumC18523) {
                    enumC86913.P(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                v(enumC86913, enumC86912, Long.valueOf(jLongValue10));
            }
            Map map12 = this.a;
            EnumC8692 enumC86914 = EnumC8692.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC86914)) {
                long jLongValue12 = ((Long) ((HashMap) this.a).remove(enumC86914)).longValue();
                if (this.e != enumC18523) {
                    enumC86914.P(jLongValue12);
                }
                v(enumC86914, enumC86912, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        EnumC8692 enumC86915 = EnumC8692.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC86915)) {
            Map map14 = this.a;
            EnumC8692 enumC86916 = EnumC8692.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC86916)) {
                Map map15 = this.a;
                EnumC8692 enumC86917 = EnumC8692.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC86917) && ((HashMap) this.a).containsKey(enumC86912)) {
                    n(((Long) ((HashMap) this.a).remove(enumC86915)).longValue(), ((Long) ((HashMap) this.a).remove(enumC86916)).longValue(), ((Long) ((HashMap) this.a).remove(enumC86917)).longValue(), ((Long) ((HashMap) this.a).remove(enumC86912)).longValue());
                }
            }
        }
    }

    public final void n(long j, long j2, long j3, long j4) {
        if (this.e == EnumC18520.LENIENT) {
            long jP = AbstractC1758.P(AbstractC1758.P(AbstractC1758.P(AbstractC1758.Q(j, 3600000000000L), AbstractC1758.Q(j2, 60000000000L)), AbstractC1758.Q(j3, 1000000000L)), j4);
            s(C10052.V(AbstractC1758.O(jP, 86400000000000L)), C8561.a(0, 0, (int) AbstractC1758.z(jP, 86400000000000L)));
            return;
        }
        EnumC8692 enumC8692 = EnumC8692.MINUTE_OF_HOUR;
        int iA = enumC8692.b.a(j2, enumC8692);
        EnumC8692 enumC8693 = EnumC8692.NANO_OF_SECOND;
        int iA2 = enumC8693.b.a(j4, enumC8693);
        if (this.e == EnumC18520.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            s(C10052.g, C8561.a(0, 0, 1));
            return;
        }
        EnumC8692 enumC8694 = EnumC8692.HOUR_OF_DAY;
        int iA3 = enumC8694.b.a(j, enumC8694);
        EnumC8692 enumC8695 = EnumC8692.SECOND_OF_MINUTE;
        s(C10052.of(iA3, iA, enumC8695.b.a(j3, enumC8695), iA2), C8561.d);
    }

    public final void s(C10052 c10052, C8561 c8561) {
        C10052 c10053 = this.g;
        if (c10053 != null) {
            if (!c10053.equals(c10052)) {
                throw new C21241("Conflict found: Fields resolved to different times: " + this.g + " " + c10052);
            }
            C8561 c8562 = this.h;
            c8562.getClass();
            C8561 c8563 = C8561.d;
            if (c8562 != c8563 && c8561 != c8563 && !this.h.equals(c8561)) {
                throw new C21241("Conflict found: Fields resolved to different excess periods: " + this.h + " " + c8561);
            }
            this.h = c8561;
            return;
        }
        this.g = c10052;
        this.h = c8561;
    }

    public final void h(InterfaceC9437 interfaceC9437) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC16831 interfaceC16831 = (InterfaceC16831) entry.getKey();
            if (interfaceC9437.d(interfaceC16831)) {
                try {
                    long jC = interfaceC9437.C(interfaceC16831);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jC != jLongValue) {
                        throw new C21241("Conflict found: Field " + interfaceC16831 + " " + jC + " differs from " + interfaceC16831 + " " + jLongValue + " derived from " + interfaceC9437);
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            InterfaceC17116 interfaceC17116 = this.f;
            if (interfaceC17116 != null) {
                sb.append(interfaceC17116);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }
}
