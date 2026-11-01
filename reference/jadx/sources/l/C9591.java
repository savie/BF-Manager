package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۢ۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9591 implements InterfaceC11002 {
    public static final C1828 f = C1828.f(1, 7);
    public static final C1828 g = C1828.g(0, 4, 6);
    public static final C1828 h = C1828.g(0, 52, 54);
    public static final C1828 i = C1828.g(1, 52, 53);
    public final String a;
    public final C3239 b;
    public final InterfaceC18056 c;
    public final InterfaceC18056 d;
    public final C1828 e;

    @Override // l.InterfaceC11002
    public final boolean isDateBased() {
        return true;
    }

    public final InterfaceC17579 e(InterfaceC21233 interfaceC21233, int i2, int i3, int i4) {
        InterfaceC17579 interfaceC17579M = interfaceC21233.M(i2, 1, 1);
        int iH = h(1, b(interfaceC17579M));
        return interfaceC17579M.d(((Math.min(i3, a(iH, interfaceC17579M.Q() + this.b.b) - 1) - 1) * 7) + (i4 - 1) + (-iH), (InterfaceC18056) EnumC22996.DAYS);
    }

    public C9591(String str, C3239 c3239, InterfaceC18056 interfaceC18056, InterfaceC18056 interfaceC18057, C1828 c1828) {
        this.a = str;
        this.b = c3239;
        this.c = interfaceC18056;
        this.d = interfaceC18057;
        this.e = c1828;
    }

    @Override // l.InterfaceC11002
    public final long C(InterfaceC21584 interfaceC21584) {
        int iC;
        EnumC22996 enumC22996 = EnumC22996.WEEKS;
        InterfaceC18056 interfaceC18056 = this.d;
        if (interfaceC18056 == enumC22996) {
            iC = b(interfaceC21584);
        } else if (interfaceC18056 != EnumC22996.MONTHS) {
            if (interfaceC18056 != EnumC22996.YEARS) {
                if (interfaceC18056 == C3239.h) {
                    iC = d(interfaceC21584);
                } else if (interfaceC18056 == EnumC22996.FOREVER) {
                    iC = c(interfaceC21584);
                } else {
                    throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC18056 + ", this: " + this);
                }
            } else {
                int iB = b(interfaceC21584);
                int iL = interfaceC21584.l(EnumC18762.DAY_OF_YEAR);
                iC = a(h(iL, iB), iL);
            }
        } else {
            int iB2 = b(interfaceC21584);
            int iL2 = interfaceC21584.l(EnumC18762.DAY_OF_MONTH);
            iC = a(h(iL2, iB2), iL2);
        }
        return iC;
    }

    public final int b(InterfaceC21584 interfaceC21584) {
        return AbstractC23702.e(interfaceC21584.l(EnumC18762.DAY_OF_WEEK) - this.b.a.getValue()) + 1;
    }

    public final int c(InterfaceC21584 interfaceC21584) {
        int iB = b(interfaceC21584);
        int iL = interfaceC21584.l(EnumC18762.YEAR);
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_YEAR;
        int iL2 = interfaceC21584.l(enumC18762);
        int iH = h(iL2, iB);
        int iA = a(iH, iL2);
        if (iA == 0) {
            return iL - 1;
        }
        return iA >= a(iH, ((int) interfaceC21584.n(enumC18762).d) + this.b.b) ? iL + 1 : iL;
    }

    public final int d(InterfaceC21584 interfaceC21584) {
        int iA;
        int iB = b(interfaceC21584);
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_YEAR;
        int iL = interfaceC21584.l(enumC18762);
        int iH = h(iL, iB);
        int iA2 = a(iH, iL);
        if (iA2 == 0) {
            return d(AbstractC14884.r(interfaceC21584).E(interfaceC21584).w(iL, EnumC22996.DAYS));
        }
        return (iA2 <= 50 || iA2 < (iA = a(iH, ((int) interfaceC21584.n(enumC18762).d) + this.b.b))) ? iA2 : (iA2 - iA) + 1;
    }

    public final int h(int i2, int i3) {
        int iE = AbstractC23702.e(i2 - i3);
        return iE + 1 > this.b.b ? 7 - iE : -iE;
    }

    public static int a(int i2, int i3) {
        return ((i3 - 1) + (i2 + 7)) / 7;
    }

    @Override // l.InterfaceC11002
    public final InterfaceC15235 G(InterfaceC15235 interfaceC15235, long j) {
        int iA = this.e.a(j, this);
        int iL = interfaceC15235.l(this);
        if (iA == iL) {
            return interfaceC15235;
        }
        if (this.d != EnumC22996.FOREVER) {
            return interfaceC15235.d(iA - iL, this.c);
        }
        C3239 c3239 = this.b;
        return e(AbstractC14884.r(interfaceC15235), (int) j, interfaceC15235.l(c3239.e), interfaceC15235.l(c3239.c));
    }

    @Override // l.InterfaceC11002
    public final InterfaceC21584 n(Map map, C11832 c11832, EnumC5481 enumC5481) {
        InterfaceC17579 interfaceC17579D;
        InterfaceC17579 interfaceC17579D2;
        InterfaceC17579 interfaceC17579D3;
        long jLongValue = ((Long) map.get(this)).longValue();
        int iY = AbstractC1726.y(jLongValue);
        EnumC22996 enumC22996 = EnumC22996.WEEKS;
        C1828 c1828 = this.e;
        C3239 c3239 = this.b;
        InterfaceC18056 interfaceC18056 = this.d;
        if (interfaceC18056 == enumC22996) {
            long jE = AbstractC23702.e((c1828.a(jLongValue, this) - 1) + (c3239.a.getValue() - 1)) + 1;
            map.remove(this);
            map.put(EnumC18762.DAY_OF_WEEK, Long.valueOf(jE));
            return null;
        }
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_WEEK;
        if (map.containsKey(enumC18762)) {
            int iE = AbstractC23702.e(enumC18762.b.a(((Long) map.get(enumC18762)).longValue(), enumC18762) - c3239.a.getValue()) + 1;
            InterfaceC21233 interfaceC21233R = AbstractC14884.r(c11832);
            EnumC18762 enumC18763 = EnumC18762.YEAR;
            if (map.containsKey(enumC18763)) {
                int iA = enumC18763.b.a(((Long) map.get(enumC18763)).longValue(), enumC18763);
                EnumC22996 enumC22997 = EnumC22996.MONTHS;
                if (interfaceC18056 == enumC22997) {
                    EnumC18762 enumC18764 = EnumC18762.MONTH_OF_YEAR;
                    if (map.containsKey(enumC18764)) {
                        long jLongValue2 = ((Long) map.get(enumC18764)).longValue();
                        long j = iY;
                        if (enumC5481 == EnumC5481.LENIENT) {
                            InterfaceC17579 interfaceC17579D4 = interfaceC21233R.M(iA, 1, 1).d(AbstractC1726.R(jLongValue2, 1L), (InterfaceC18056) enumC22997);
                            int iB = b(interfaceC17579D4);
                            int iL = interfaceC17579D4.l(EnumC18762.DAY_OF_MONTH);
                            interfaceC17579D3 = interfaceC17579D4.d(AbstractC1726.P(AbstractC1726.Q(AbstractC1726.R(j, a(h(iL, iB), iL)), 7), iE - b(interfaceC17579D4)), (InterfaceC18056) EnumC22996.DAYS);
                        } else {
                            InterfaceC17579 interfaceC17579M = interfaceC21233R.M(iA, enumC18764.b.a(jLongValue2, enumC18764), 1);
                            long jA = c1828.a(j, this);
                            int iB2 = b(interfaceC17579M);
                            int iL2 = interfaceC17579M.l(EnumC18762.DAY_OF_MONTH);
                            InterfaceC17579 interfaceC17579D5 = interfaceC17579M.d((((int) (jA - ((long) a(h(iL2, iB2), iL2)))) * 7) + (iE - b(interfaceC17579M)), (InterfaceC18056) EnumC22996.DAYS);
                            if (enumC5481 == EnumC5481.STRICT && interfaceC17579D5.G(enumC18764) != jLongValue2) {
                                throw new C15464("Strict mode rejected resolved date as it is in a different month");
                            }
                            interfaceC17579D3 = interfaceC17579D5;
                        }
                        map.remove(this);
                        map.remove(enumC18763);
                        map.remove(enumC18764);
                        map.remove(enumC18762);
                        return interfaceC17579D3;
                    }
                }
                if (interfaceC18056 == EnumC22996.YEARS) {
                    long j2 = iY;
                    InterfaceC17579 interfaceC17579M2 = interfaceC21233R.M(iA, 1, 1);
                    if (enumC5481 == EnumC5481.LENIENT) {
                        int iB3 = b(interfaceC17579M2);
                        int iL3 = interfaceC17579M2.l(EnumC18762.DAY_OF_YEAR);
                        interfaceC17579D2 = interfaceC17579M2.d(AbstractC1726.P(AbstractC1726.Q(AbstractC1726.R(j2, a(h(iL3, iB3), iL3)), 7), iE - b(interfaceC17579M2)), (InterfaceC18056) EnumC22996.DAYS);
                    } else {
                        long jA2 = c1828.a(j2, this);
                        int iB4 = b(interfaceC17579M2);
                        int iL4 = interfaceC17579M2.l(EnumC18762.DAY_OF_YEAR);
                        InterfaceC17579 interfaceC17579D6 = interfaceC17579M2.d((((int) (jA2 - ((long) a(h(iL4, iB4), iL4)))) * 7) + (iE - b(interfaceC17579M2)), (InterfaceC18056) EnumC22996.DAYS);
                        if (enumC5481 == EnumC5481.STRICT && interfaceC17579D6.G(enumC18763) != iA) {
                            throw new C15464("Strict mode rejected resolved date as it is in a different year");
                        }
                        interfaceC17579D2 = interfaceC17579D6;
                    }
                    map.remove(this);
                    map.remove(enumC18763);
                    map.remove(enumC18762);
                    return interfaceC17579D2;
                }
            } else if ((interfaceC18056 == C3239.h || interfaceC18056 == EnumC22996.FOREVER) && map.containsKey(c3239.f) && map.containsKey(c3239.e)) {
                C9591 c9591 = c3239.f;
                int iA2 = c9591.e.a(((Long) map.get(c9591)).longValue(), c3239.f);
                if (enumC5481 == EnumC5481.LENIENT) {
                    interfaceC17579D = e(interfaceC21233R, iA2, 1, iE).d(AbstractC1726.R(((Long) map.get(c3239.e)).longValue(), 1L), (InterfaceC18056) enumC22996);
                } else {
                    C9591 c9592 = c3239.e;
                    InterfaceC17579 interfaceC17579E = e(interfaceC21233R, iA2, c9592.e.a(((Long) map.get(c9592)).longValue(), c3239.e), iE);
                    if (enumC5481 == EnumC5481.STRICT && c(interfaceC17579E) != iA2) {
                        throw new C15464("Strict mode rejected resolved date as it is in a different week-based-year");
                    }
                    interfaceC17579D = interfaceC17579E;
                }
                map.remove(this);
                map.remove(c3239.f);
                map.remove(c3239.e);
                map.remove(enumC18762);
                return interfaceC17579D;
            }
        }
        return null;
    }

    @Override // l.InterfaceC11002
    public final C1828 s() {
        return this.e;
    }

    @Override // l.InterfaceC11002
    public final boolean l(InterfaceC21584 interfaceC21584) {
        if (!interfaceC21584.e(EnumC18762.DAY_OF_WEEK)) {
            return false;
        }
        EnumC22996 enumC22996 = EnumC22996.WEEKS;
        InterfaceC18056 interfaceC18056 = this.d;
        if (interfaceC18056 == enumC22996) {
            return true;
        }
        if (interfaceC18056 == EnumC22996.MONTHS) {
            return interfaceC21584.e(EnumC18762.DAY_OF_MONTH);
        }
        if (interfaceC18056 == EnumC22996.YEARS) {
            return interfaceC21584.e(EnumC18762.DAY_OF_YEAR);
        }
        if (interfaceC18056 == C3239.h) {
            return interfaceC21584.e(EnumC18762.DAY_OF_YEAR);
        }
        if (interfaceC18056 == EnumC22996.FOREVER) {
            return interfaceC21584.e(EnumC18762.YEAR);
        }
        return false;
    }

    @Override // l.InterfaceC11002
    public final C1828 m(InterfaceC21584 interfaceC21584) {
        EnumC22996 enumC22996 = EnumC22996.WEEKS;
        InterfaceC18056 interfaceC18056 = this.d;
        if (interfaceC18056 == enumC22996) {
            return this.e;
        }
        if (interfaceC18056 == EnumC22996.MONTHS) {
            return f(interfaceC21584, EnumC18762.DAY_OF_MONTH);
        }
        if (interfaceC18056 == EnumC22996.YEARS) {
            return f(interfaceC21584, EnumC18762.DAY_OF_YEAR);
        }
        if (interfaceC18056 == C3239.h) {
            return g(interfaceC21584);
        }
        if (interfaceC18056 == EnumC22996.FOREVER) {
            return EnumC18762.YEAR.b;
        }
        throw new IllegalStateException("unreachable, rangeUnit: " + interfaceC18056 + ", this: " + this);
    }

    public final C1828 f(InterfaceC21584 interfaceC21584, EnumC18762 enumC18762) {
        int iH = h(interfaceC21584.l(enumC18762), b(interfaceC21584));
        C1828 c1828N = interfaceC21584.n(enumC18762);
        return C1828.f(a(iH, (int) c1828N.a), a(iH, (int) c1828N.d));
    }

    public final C1828 g(InterfaceC21584 interfaceC21584) {
        EnumC18762 enumC18762 = EnumC18762.DAY_OF_YEAR;
        if (!interfaceC21584.e(enumC18762)) {
            return h;
        }
        int iB = b(interfaceC21584);
        int iL = interfaceC21584.l(enumC18762);
        int iH = h(iL, iB);
        int iA = a(iH, iL);
        if (iA != 0) {
            int i2 = (int) interfaceC21584.n(enumC18762).d;
            int iA2 = a(iH, this.b.b + i2);
            if (iA >= iA2) {
                return g(AbstractC14884.r(interfaceC21584).E(interfaceC21584).d((i2 - iL) + 8, (InterfaceC18056) EnumC22996.DAYS));
            }
            return C1828.f(1L, iA2 - 1);
        }
        return g(AbstractC14884.r(interfaceC21584).E(interfaceC21584).w(iL + 7, EnumC22996.DAYS));
    }

    public final String toString() {
        return this.a + "[" + this.b.toString() + "]";
    }
}
