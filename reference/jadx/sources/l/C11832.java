package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: l.ۨܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11832 implements InterfaceC21584 {
    public AbstractC9114 b;
    public InterfaceC21233 c;
    public boolean d;
    public EnumC5481 e;
    public InterfaceC17579 f;
    public C3363 g;
    public final Map a = new HashMap();
    public C13118 h = C13118.d;

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.a(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ C1828 n(InterfaceC11002 interfaceC11002) {
        return AbstractC23702.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final boolean e(InterfaceC11002 interfaceC11002) {
        if (((HashMap) this.a).containsKey(interfaceC11002)) {
            return true;
        }
        InterfaceC17579 interfaceC17579 = this.f;
        if (interfaceC17579 != null && interfaceC17579.e(interfaceC11002)) {
            return true;
        }
        C3363 c3363 = this.g;
        if (c3363 == null || !c3363.e(interfaceC11002)) {
            return (interfaceC11002 == null || (interfaceC11002 instanceof EnumC18762) || !interfaceC11002.l(this)) ? false : true;
        }
        return true;
    }

    @Override // l.InterfaceC21584
    public final long G(InterfaceC11002 interfaceC11002) {
        C13638.requireNonNull(interfaceC11002, "field");
        Long l2 = (Long) ((HashMap) this.a).get(interfaceC11002);
        if (l2 != null) {
            return l2.longValue();
        }
        InterfaceC17579 interfaceC17579 = this.f;
        if (interfaceC17579 != null && interfaceC17579.e(interfaceC11002)) {
            return this.f.G(interfaceC11002);
        }
        C3363 c3363 = this.g;
        if (c3363 != null && c3363.e(interfaceC11002)) {
            return this.g.G(interfaceC11002);
        }
        if (interfaceC11002 instanceof EnumC18762) {
            throw new C14530(AbstractC21107.a("Unsupported field: ", interfaceC11002));
        }
        return interfaceC11002.C(this);
    }

    @Override // l.InterfaceC21584
    public final Object T(C22935 c22935) {
        if (c22935 == AbstractC23702.a) {
            return this.b;
        }
        if (c22935 == AbstractC23702.b) {
            return this.c;
        }
        if (c22935 == AbstractC23702.f) {
            InterfaceC17579 interfaceC17579 = this.f;
            if (interfaceC17579 != null) {
                return C18991.X(interfaceC17579);
            }
            return null;
        }
        if (c22935 == AbstractC23702.g) {
            return this.g;
        }
        if (c22935 == AbstractC23702.d) {
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18762.OFFSET_SECONDS);
            if (l2 != null) {
                return C2678.e0(l2.intValue());
            }
            AbstractC9114 abstractC9114 = this.b;
            return abstractC9114 instanceof C2678 ? abstractC9114 : c22935.h(this);
        }
        if (c22935 == AbstractC23702.e) {
            return c22935.h(this);
        }
        if (c22935 == AbstractC23702.c) {
            return null;
        }
        return c22935.h(this);
    }

    public final void x(InterfaceC11002 interfaceC11002, EnumC18762 enumC18762, Long l2) {
        Long l3 = (Long) ((HashMap) this.a).put(enumC18762, l2);
        if (l3 == null || l3.longValue() == l2.longValue()) {
            return;
        }
        throw new C15464("Conflict found: " + enumC18762 + " " + l3 + " differs from " + enumC18762 + " " + l2 + " while resolving  " + interfaceC11002);
    }

    public final void k() {
        if (((HashMap) this.a).containsKey(EnumC18762.INSTANT_SECONDS)) {
            AbstractC9114 abstractC9114 = this.b;
            if (abstractC9114 != null) {
                o(abstractC9114);
                return;
            }
            Long l2 = (Long) ((HashMap) this.a).get(EnumC18762.OFFSET_SECONDS);
            if (l2 != null) {
                o(C2678.e0(l2.intValue()));
            }
        }
    }

    public final void o(AbstractC9114 abstractC9114) {
        Map map = this.a;
        EnumC18762 enumC18762 = EnumC18762.INSTANT_SECONDS;
        InterfaceC20402 interfaceC20402P = this.c.P(C18285.ofEpochSecond(((Long) ((HashMap) map).remove(enumC18762)).longValue()), abstractC9114);
        v(interfaceC20402P.f());
        x(enumC18762, EnumC18762.SECOND_OF_DAY, Long.valueOf(interfaceC20402P.b().i0()));
    }

    public final void v(InterfaceC17579 interfaceC17579) {
        InterfaceC17579 interfaceC175710 = this.f;
        if (interfaceC175710 != null) {
            if (interfaceC17579 == null || interfaceC175710.equals(interfaceC17579)) {
                return;
            }
            throw new C15464("Conflict found: Fields resolved to two different dates: " + this.f + " " + interfaceC17579);
        }
        if (interfaceC17579 != null) {
            if (!this.c.equals(interfaceC17579.a())) {
                throw new C15464("ChronoLocalDate must use the effective parsed chronology: " + this.c);
            }
            this.f = interfaceC17579;
        }
    }

    public final void q() {
        Map map = this.a;
        EnumC18762 enumC18762 = EnumC18762.CLOCK_HOUR_OF_DAY;
        if (((HashMap) map).containsKey(enumC18762)) {
            long jLongValue = ((Long) ((HashMap) this.a).remove(enumC18762)).longValue();
            EnumC5481 enumC5481 = this.e;
            if (enumC5481 == EnumC5481.STRICT || (enumC5481 == EnumC5481.SMART && jLongValue != 0)) {
                enumC18762.T(jLongValue);
            }
            EnumC18762 enumC18763 = EnumC18762.HOUR_OF_DAY;
            if (jLongValue == 24) {
                jLongValue = 0;
            }
            x(enumC18762, enumC18763, Long.valueOf(jLongValue));
        }
        Map map2 = this.a;
        EnumC18762 enumC18764 = EnumC18762.CLOCK_HOUR_OF_AMPM;
        if (((HashMap) map2).containsKey(enumC18764)) {
            long jLongValue2 = ((Long) ((HashMap) this.a).remove(enumC18764)).longValue();
            EnumC5481 enumC5482 = this.e;
            if (enumC5482 == EnumC5481.STRICT || (enumC5482 == EnumC5481.SMART && jLongValue2 != 0)) {
                enumC18764.T(jLongValue2);
            }
            x(enumC18764, EnumC18762.HOUR_OF_AMPM, Long.valueOf(jLongValue2 != 12 ? jLongValue2 : 0L));
        }
        Map map3 = this.a;
        EnumC18762 enumC18765 = EnumC18762.AMPM_OF_DAY;
        if (((HashMap) map3).containsKey(enumC18765)) {
            Map map4 = this.a;
            EnumC18762 enumC18766 = EnumC18762.HOUR_OF_AMPM;
            if (((HashMap) map4).containsKey(enumC18766)) {
                long jLongValue3 = ((Long) ((HashMap) this.a).remove(enumC18765)).longValue();
                long jLongValue4 = ((Long) ((HashMap) this.a).remove(enumC18766)).longValue();
                if (this.e == EnumC5481.LENIENT) {
                    x(enumC18765, EnumC18762.HOUR_OF_DAY, Long.valueOf(AbstractC1726.P(AbstractC1726.Q(jLongValue3, 12), jLongValue4)));
                } else {
                    enumC18765.T(jLongValue3);
                    enumC18766.T(jLongValue3);
                    x(enumC18765, EnumC18762.HOUR_OF_DAY, Long.valueOf((jLongValue3 * 12) + jLongValue4));
                }
            }
        }
        Map map5 = this.a;
        EnumC18762 enumC18767 = EnumC18762.NANO_OF_DAY;
        if (((HashMap) map5).containsKey(enumC18767)) {
            long jLongValue5 = ((Long) ((HashMap) this.a).remove(enumC18767)).longValue();
            if (this.e != EnumC5481.LENIENT) {
                enumC18767.T(jLongValue5);
            }
            x(enumC18767, EnumC18762.HOUR_OF_DAY, Long.valueOf(jLongValue5 / 3600000000000L));
            x(enumC18767, EnumC18762.MINUTE_OF_HOUR, Long.valueOf((jLongValue5 / 60000000000L) % 60));
            x(enumC18767, EnumC18762.SECOND_OF_MINUTE, Long.valueOf((jLongValue5 / 1000000000) % 60));
            x(enumC18767, EnumC18762.NANO_OF_SECOND, Long.valueOf(jLongValue5 % 1000000000));
        }
        Map map6 = this.a;
        EnumC18762 enumC18768 = EnumC18762.MICRO_OF_DAY;
        if (((HashMap) map6).containsKey(enumC18768)) {
            long jLongValue6 = ((Long) ((HashMap) this.a).remove(enumC18768)).longValue();
            if (this.e != EnumC5481.LENIENT) {
                enumC18768.T(jLongValue6);
            }
            x(enumC18768, EnumC18762.SECOND_OF_DAY, Long.valueOf(jLongValue6 / 1000000));
            x(enumC18768, EnumC18762.MICRO_OF_SECOND, Long.valueOf(jLongValue6 % 1000000));
        }
        Map map7 = this.a;
        EnumC18762 enumC18769 = EnumC18762.MILLI_OF_DAY;
        if (((HashMap) map7).containsKey(enumC18769)) {
            long jLongValue7 = ((Long) ((HashMap) this.a).remove(enumC18769)).longValue();
            if (this.e != EnumC5481.LENIENT) {
                enumC18769.T(jLongValue7);
            }
            x(enumC18769, EnumC18762.SECOND_OF_DAY, Long.valueOf(jLongValue7 / 1000));
            x(enumC18769, EnumC18762.MILLI_OF_SECOND, Long.valueOf(jLongValue7 % 1000));
        }
        Map map8 = this.a;
        EnumC18762 enumC187610 = EnumC18762.SECOND_OF_DAY;
        if (((HashMap) map8).containsKey(enumC187610)) {
            long jLongValue8 = ((Long) ((HashMap) this.a).remove(enumC187610)).longValue();
            if (this.e != EnumC5481.LENIENT) {
                enumC187610.T(jLongValue8);
            }
            x(enumC187610, EnumC18762.HOUR_OF_DAY, Long.valueOf(jLongValue8 / 3600));
            x(enumC187610, EnumC18762.MINUTE_OF_HOUR, Long.valueOf((jLongValue8 / 60) % 60));
            x(enumC187610, EnumC18762.SECOND_OF_MINUTE, Long.valueOf(jLongValue8 % 60));
        }
        Map map9 = this.a;
        EnumC18762 enumC187611 = EnumC18762.MINUTE_OF_DAY;
        if (((HashMap) map9).containsKey(enumC187611)) {
            long jLongValue9 = ((Long) ((HashMap) this.a).remove(enumC187611)).longValue();
            if (this.e != EnumC5481.LENIENT) {
                enumC187611.T(jLongValue9);
            }
            x(enumC187611, EnumC18762.HOUR_OF_DAY, Long.valueOf(jLongValue9 / 60));
            x(enumC187611, EnumC18762.MINUTE_OF_HOUR, Long.valueOf(jLongValue9 % 60));
        }
        Map map10 = this.a;
        EnumC18762 enumC187612 = EnumC18762.NANO_OF_SECOND;
        if (((HashMap) map10).containsKey(enumC187612)) {
            long jLongValue10 = ((Long) ((HashMap) this.a).get(enumC187612)).longValue();
            EnumC5481 enumC5483 = this.e;
            EnumC5481 enumC5484 = EnumC5481.LENIENT;
            if (enumC5483 != enumC5484) {
                enumC187612.T(jLongValue10);
            }
            Map map11 = this.a;
            EnumC18762 enumC187613 = EnumC18762.MICRO_OF_SECOND;
            if (((HashMap) map11).containsKey(enumC187613)) {
                long jLongValue11 = ((Long) ((HashMap) this.a).remove(enumC187613)).longValue();
                if (this.e != enumC5484) {
                    enumC187613.T(jLongValue11);
                }
                jLongValue10 = (jLongValue10 % 1000) + (jLongValue11 * 1000);
                x(enumC187613, enumC187612, Long.valueOf(jLongValue10));
            }
            Map map12 = this.a;
            EnumC18762 enumC187614 = EnumC18762.MILLI_OF_SECOND;
            if (((HashMap) map12).containsKey(enumC187614)) {
                long jLongValue12 = ((Long) ((HashMap) this.a).remove(enumC187614)).longValue();
                if (this.e != enumC5484) {
                    enumC187614.T(jLongValue12);
                }
                x(enumC187614, enumC187612, Long.valueOf((jLongValue10 % 1000000) + (jLongValue12 * 1000000)));
            }
        }
        Map map13 = this.a;
        EnumC18762 enumC187615 = EnumC18762.HOUR_OF_DAY;
        if (((HashMap) map13).containsKey(enumC187615)) {
            Map map14 = this.a;
            EnumC18762 enumC187616 = EnumC18762.MINUTE_OF_HOUR;
            if (((HashMap) map14).containsKey(enumC187616)) {
                Map map15 = this.a;
                EnumC18762 enumC187617 = EnumC18762.SECOND_OF_MINUTE;
                if (((HashMap) map15).containsKey(enumC187617) && ((HashMap) this.a).containsKey(enumC187612)) {
                    p(((Long) ((HashMap) this.a).remove(enumC187615)).longValue(), ((Long) ((HashMap) this.a).remove(enumC187616)).longValue(), ((Long) ((HashMap) this.a).remove(enumC187617)).longValue(), ((Long) ((HashMap) this.a).remove(enumC187612)).longValue());
                }
            }
        }
    }

    public final void p(long j, long j2, long j3, long j4) {
        if (this.e == EnumC5481.LENIENT) {
            long jP = AbstractC1726.P(AbstractC1726.P(AbstractC1726.P(AbstractC1726.Q(j, 3600000000000L), AbstractC1726.Q(j2, 60000000000L)), AbstractC1726.Q(j3, 1000000000L)), j4);
            s(C3363.a0(AbstractC1726.O(jP, 86400000000000L)), C13118.a(0, 0, (int) AbstractC1726.z(jP, 86400000000000L)));
            return;
        }
        EnumC18762 enumC18762 = EnumC18762.MINUTE_OF_HOUR;
        int iA = enumC18762.b.a(j2, enumC18762);
        EnumC18762 enumC18763 = EnumC18762.NANO_OF_SECOND;
        int iA2 = enumC18763.b.a(j4, enumC18763);
        if (this.e == EnumC5481.SMART && j == 24 && iA == 0 && j3 == 0 && iA2 == 0) {
            s(C3363.g, C13118.a(0, 0, 1));
            return;
        }
        EnumC18762 enumC18764 = EnumC18762.HOUR_OF_DAY;
        int iA3 = enumC18764.b.a(j, enumC18764);
        EnumC18762 enumC18765 = EnumC18762.SECOND_OF_MINUTE;
        s(C3363.Z(iA3, iA, enumC18765.b.a(j3, enumC18765), iA2), C13118.d);
    }

    public final void s(C3363 c3363, C13118 c13118) {
        C3363 c3364 = this.g;
        if (c3364 != null) {
            if (!c3364.equals(c3363)) {
                throw new C15464("Conflict found: Fields resolved to different times: " + this.g + " " + c3363);
            }
            C13118 c13119 = this.h;
            c13119.getClass();
            C13118 c131110 = C13118.d;
            if (c13119 != c131110 && c13118 != c131110 && !this.h.equals(c13118)) {
                throw new C15464("Conflict found: Fields resolved to different excess periods: " + this.h + " " + c13118);
            }
            this.h = c13118;
            return;
        }
        this.g = c3363;
        this.h = c13118;
    }

    public final void j(InterfaceC21584 interfaceC21584) {
        Iterator it = ((HashMap) this.a).entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            InterfaceC11002 interfaceC11002 = (InterfaceC11002) entry.getKey();
            if (interfaceC21584.e(interfaceC11002)) {
                try {
                    long jG = interfaceC21584.G(interfaceC11002);
                    long jLongValue = ((Long) entry.getValue()).longValue();
                    if (jG != jLongValue) {
                        throw new C15464("Conflict found: Field " + interfaceC11002 + " " + jG + " differs from " + interfaceC11002 + " " + jLongValue + " derived from " + interfaceC21584);
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
            InterfaceC17579 interfaceC17579 = this.f;
            if (interfaceC17579 != null) {
                sb.append(interfaceC17579);
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
