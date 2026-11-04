package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۗ۫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3407 implements InterfaceC16831 {
    public static final C23545 f = C23545.f(1, 7);
    public static final C23545 g = C23545.g(0, 4, 6);
    public static final C23545 h = C23545.g(0, 52, 54);
    public static final C23545 i = C23545.g(1, 52, 53);
    public final String a;
    public final C20561 b;
    public final InterfaceC2726 c;
    public final InterfaceC2726 d;
    public final C23545 e;

    @Override // l.InterfaceC16831
    public final boolean isDateBased() {
        return true;
    }

    public final InterfaceC17116 e(InterfaceC8912 interfaceC8912, int i2, int i3, int i4) {
        InterfaceC17116 interfaceC17116I = interfaceC8912.I(i2, 1, 1);
        int iH = h(1, b(interfaceC17116I));
        return interfaceC17116I.c(((Math.min(i3, a(iH, interfaceC17116I.M() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (InterfaceC2726) EnumC10183.DAYS);
    }

    public C3407(String str, C20561 c20561, InterfaceC2726 interfaceC2726, InterfaceC2726 interfaceC2727, C23545 c23545) {
        this.a = str;
        this.b = c20561;
        this.c = interfaceC2726;
        this.d = interfaceC2727;
        this.e = c23545;
    }

    @Override // l.InterfaceC16831
    public final long z(InterfaceC9437 interfaceC9437) {
        int iC;
        EnumC10183 enumC10183 = EnumC10183.WEEKS;
        InterfaceC2726 interfaceC2726 = this.d;
        if (interfaceC2726 == enumC10183) {
            iC = b(interfaceC9437);
        } else if (interfaceC2726 != EnumC10183.MONTHS) {
            if (interfaceC2726 != EnumC10183.YEARS) {
                if (interfaceC2726 == C20561.h) {
                    iC = d(interfaceC9437);
                } else if (interfaceC2726 == EnumC10183.FOREVER) {
                    iC = c(interfaceC9437);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC2726 + ", this: " + this);
                }
            } else {
                int iB = b(interfaceC9437);
                int i2 = interfaceC9437.i(EnumC8692.DAY_OF_YEAR);
                iC = a(h(i2, iB), i2);
            }
        } else {
            int iB2 = b(interfaceC9437);
            int i3 = interfaceC9437.i(EnumC8692.DAY_OF_MONTH);
            iC = a(h(i3, iB2), i3);
        }
        return iC;
    }

    public final int b(InterfaceC9437 interfaceC9437) {
        return AbstractC17577.e(interfaceC9437.i(EnumC8692.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(InterfaceC9437 interfaceC9437) {
        int iB = b(interfaceC9437);
        int i2 = interfaceC9437.i(EnumC8692.YEAR);
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_YEAR;
        int i3 = interfaceC9437.i(enumC8692);
        int iH = h(i3, iB);
        int iA = a(iH, i3);
        if (iA == 0) {
            return i2 - 1;
        }
        return iA >= a(iH, ((int) interfaceC9437.k(enumC8692).d) + this.b.b) ? i2 + 1 : i2;
    }

    public final int d(InterfaceC9437 interfaceC9437) {
        int iA;
        int iB = b(interfaceC9437);
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_YEAR;
        int i2 = interfaceC9437.i(enumC8692);
        int iH = h(i2, iB);
        int iA2 = a(iH, i2);
        if (iA2 == 0) {
            return d(AbstractC2946.r(interfaceC9437).B(interfaceC9437).z(i2, EnumC10183.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) interfaceC9437.k(enumC8692).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i2, int i3) {
        int iE = AbstractC17577.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // l.InterfaceC16831
    public final InterfaceC1235 C(InterfaceC1235 interfaceC1235, long j) {
        int iA = this.e.a(j, this);
        int i2 = interfaceC1235.i(this);
        if (iA == i2) {
            return interfaceC1235;
        }
        if (this.d != EnumC10183.FOREVER) {
            return interfaceC1235.c(iA - i2, this.c);
        }
        C20561 c20561 = this.b;
        return e(AbstractC2946.r(interfaceC1235), (int) j, interfaceC1235.i(c20561.e), interfaceC1235.i(c20561.c));
    }

    @Override // l.InterfaceC16831
    public final InterfaceC9437 k(Map map, C14790 c14790, EnumC18520 enumC18520) {
        InterfaceC17116 interfaceC17116C;
        InterfaceC17116 interfaceC17116C2;
        InterfaceC17116 interfaceC17116C3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iY = AbstractC1758.y(jLongValue);
        EnumC10183 enumC10183 = EnumC10183.WEEKS;
        C23545 c23545 = this.e;
        C20561 c20561 = this.b;
        InterfaceC2726 interfaceC2726 = this.d;
        if (interfaceC2726 == enumC10183) {
            long jE = AbstractC17577.e((c23545.a(jLongValue, this) - 1) + (c20561.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC8692.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_WEEK;
        if (map.containsKey(enumC8692)) {
            int iE = AbstractC17577.e(enumC8692.b.a(((Long) map.get(enumC8692)).longValue(), enumC8692) - c20561.a.getValue()) + 1;
            InterfaceC8912 interfaceC8912R = AbstractC2946.r(c14790);
            EnumC8692 enumC8693 = EnumC8692.YEAR;
            if (map.containsKey(enumC8693)) {
                int iA = enumC8693.b.a(((Long) map.get(enumC8693)).longValue(), enumC8693);
                EnumC10183 enumC10184 = EnumC10183.MONTHS;
                if (interfaceC2726 == enumC10184) {
                    EnumC8692 enumC8694 = EnumC8692.MONTH_OF_YEAR;
                    if (map.containsKey(enumC8694)) {
                        long jLongValue2 = ((Long) map.get(enumC8694)).longValue();
                        long j = iY;
                        if (enumC18520 == EnumC18520.LENIENT) {
                            InterfaceC17116 interfaceC17116C4 = interfaceC8912R.I(iA, 1, 1).c(AbstractC1758.R(jLongValue2, 1L), (InterfaceC2726) enumC10184);
                            int iB = b(interfaceC17116C4);
                            int i2 = interfaceC17116C4.i(EnumC8692.DAY_OF_MONTH);
                            interfaceC17116C3 = interfaceC17116C4.c(AbstractC1758.P(AbstractC1758.Q(AbstractC1758.R(j, a(h(i2, iB), i2)), 7), iE - b(interfaceC17116C4)), (InterfaceC2726) EnumC10183.DAYS);
                        } else {
                            InterfaceC17116 interfaceC17116I = interfaceC8912R.I(iA, enumC8694.b.a(jLongValue2, enumC8694), 1);
                            long jA = c23545.a(j, this);
                            int iB2 = b(interfaceC17116I);
                            int i3 = interfaceC17116I.i(EnumC8692.DAY_OF_MONTH);
                            InterfaceC17116 interfaceC17116C5 = interfaceC17116I.c((((int) (jA - ((long) a(h(i3, iB2), i3)))) * 7) + (iE - b(interfaceC17116I)), (InterfaceC2726) EnumC10183.DAYS);
                            if (enumC18520 == EnumC18520.STRICT && interfaceC17116C5.C(enumC8694) != jLongValue2) {
                                throw new C21241("Strict mode rejected resolved date as it is in a different month");
                            }
                            interfaceC17116C3 = interfaceC17116C5;
                        }
                        map.remove(this);
                        map.remove(enumC8693);
                        map.remove(enumC8694);
                        map.remove(enumC8692);
                        return interfaceC17116C3;
                    }
                }
                if (interfaceC2726 == EnumC10183.YEARS) {
                    long j2 = iY;
                    InterfaceC17116 interfaceC17116I2 = interfaceC8912R.I(iA, 1, 1);
                    if (enumC18520 == EnumC18520.LENIENT) {
                        int iB3 = b(interfaceC17116I2);
                        int i4 = interfaceC17116I2.i(EnumC8692.DAY_OF_YEAR);
                        interfaceC17116C2 = interfaceC17116I2.c(AbstractC1758.P(AbstractC1758.Q(AbstractC1758.R(j2, a(h(i4, iB3), i4)), 7), iE - b(interfaceC17116I2)), (InterfaceC2726) EnumC10183.DAYS);
                    } else {
                        long jA2 = c23545.a(j2, this);
                        int iB4 = b(interfaceC17116I2);
                        int i5 = interfaceC17116I2.i(EnumC8692.DAY_OF_YEAR);
                        InterfaceC17116 interfaceC17116C6 = interfaceC17116I2.c((((int) (jA2 - ((long) a(h(i5, iB4), i5)))) * 7) + (iE - b(interfaceC17116I2)), (InterfaceC2726) EnumC10183.DAYS);
                        if (enumC18520 == EnumC18520.STRICT && interfaceC17116C6.C(enumC8693) != iA) {
                            throw new C21241("Strict mode rejected resolved date as it is in a different year");
                        }
                        interfaceC17116C2 = interfaceC17116C6;
                    }
                    map.remove(this);
                    map.remove(enumC8693);
                    map.remove(enumC8692);
                    return interfaceC17116C2;
                }
            } else if ((interfaceC2726 == C20561.h || interfaceC2726 == EnumC10183.FOREVER) && map.containsKey(c20561.f) && map.containsKey(c20561.e)) {
                C3407 c3407 = c20561.f;
                int iA2 = c3407.e.a(((Long) map.get(c3407)).longValue(), c20561.f);
                if (enumC18520 == EnumC18520.LENIENT) {
                    interfaceC17116C = e(interfaceC8912R, iA2, 1, iE).c(AbstractC1758.R(((Long) map.get(c20561.e)).longValue(), 1L), (InterfaceC2726) enumC10183);
                } else {
                    C3407 c3408 = c20561.e;
                    InterfaceC17116 interfaceC17116E = e(interfaceC8912R, iA2, c3408.e.a(((Long) map.get(c3408)).longValue(), c20561.e), iE);
                    if (enumC18520 == EnumC18520.STRICT && c(interfaceC17116E) != iA2) {
                        throw new C21241("Strict mode rejected resolved date as it is in a different week-based-year");
                    }
                    interfaceC17116C = interfaceC17116E;
                }
                map.remove(this);
                map.remove(c20561.f);
                map.remove(c20561.e);
                map.remove(enumC8692);
                return interfaceC17116C;
            }
        }
        return null;
    }

    @Override // l.InterfaceC16831
    public final C23545 p() {
        return this.e;
    }

    @Override // l.InterfaceC16831
    public final boolean i(InterfaceC9437 interfaceC9437) {
        if (!interfaceC9437.d(EnumC8692.DAY_OF_WEEK)) {
            return false;
        }
        EnumC10183 enumC10183 = EnumC10183.WEEKS;
        InterfaceC2726 interfaceC2726 = this.d;
        if (interfaceC2726 == enumC10183) {
            return true;
        }
        if (interfaceC2726 == EnumC10183.MONTHS) {
            return interfaceC9437.d(EnumC8692.DAY_OF_MONTH);
        }
        if (interfaceC2726 == EnumC10183.YEARS) {
            return interfaceC9437.d(EnumC8692.DAY_OF_YEAR);
        }
        if (interfaceC2726 == C20561.h) {
            return interfaceC9437.d(EnumC8692.DAY_OF_YEAR);
        }
        if (interfaceC2726 == EnumC10183.FOREVER) {
            return interfaceC9437.d(EnumC8692.YEAR);
        }
        return false;
    }

    @Override // l.InterfaceC16831
    public final C23545 j(InterfaceC9437 interfaceC9437) {
        EnumC10183 enumC10183 = EnumC10183.WEEKS;
        InterfaceC2726 interfaceC2726 = this.d;
        if (interfaceC2726 == enumC10183) {
            return this.e;
        }
        if (interfaceC2726 == EnumC10183.MONTHS) {
            return f(interfaceC9437, EnumC8692.DAY_OF_MONTH);
        }
        if (interfaceC2726 == EnumC10183.YEARS) {
            return f(interfaceC9437, EnumC8692.DAY_OF_YEAR);
        }
        if (interfaceC2726 == C20561.h) {
            return g(interfaceC9437);
        }
        if (interfaceC2726 == EnumC10183.FOREVER) {
            return EnumC8692.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC2726 + ", this: " + this);
    }

    public final C23545 f(InterfaceC9437 interfaceC9437, EnumC8692 enumC8692) {
        int iH = h(interfaceC9437.i(enumC8692), b(interfaceC9437));
        C23545 c23545K = interfaceC9437.k(enumC8692);
        return C23545.f(a(iH, (int) c23545K.a), a(iH, (int) c23545K.d));
    }

    public final C23545 g(InterfaceC9437 interfaceC9437) {
        EnumC8692 enumC8692 = EnumC8692.DAY_OF_YEAR;
        if (!interfaceC9437.d(enumC8692)) {
            return h;
        }
        int iB = b(interfaceC9437);
        int i2 = interfaceC9437.i(enumC8692);
        int iH = h(i2, iB);
        int iA = a(iH, i2);
        if (iA != 0) {
            int i3 = (int) interfaceC9437.k(enumC8692).d;
            int iA2 = a(iH, this.b.b + i3);
            if (iA >= iA2) {
                return g(AbstractC2946.r(interfaceC9437).B(interfaceC9437).c((i3 - i2) + 8, (InterfaceC2726) EnumC10183.DAYS));
            }
            return C23545.f(1L, iA2 - 1);
        }
        return g(AbstractC2946.r(interfaceC9437).B(interfaceC9437).z(i2 + 7, EnumC10183.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
