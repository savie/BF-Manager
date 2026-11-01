package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ܽܽᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16770 {
    public static final C22935 h = new C22935(2);
    public static final Map i;
    public C16770 a;
    public final C16770 b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', EnumC18762.ERA);
        map.put('y', EnumC18762.YEAR_OF_ERA);
        map.put('u', EnumC18762.YEAR);
        EnumC20879 enumC20879 = AbstractC20174.a;
        map.put('Q', enumC20879);
        map.put('q', enumC20879);
        EnumC18762 enumC18762 = EnumC18762.MONTH_OF_YEAR;
        map.put('M', enumC18762);
        map.put('L', enumC18762);
        map.put('D', EnumC18762.DAY_OF_YEAR);
        map.put('d', EnumC18762.DAY_OF_MONTH);
        map.put('F', EnumC18762.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC18762 enumC18763 = EnumC18762.DAY_OF_WEEK;
        map.put('E', enumC18763);
        map.put('c', enumC18763);
        map.put('e', enumC18763);
        map.put('a', EnumC18762.AMPM_OF_DAY);
        map.put('H', EnumC18762.HOUR_OF_DAY);
        map.put('k', EnumC18762.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC18762.HOUR_OF_AMPM);
        map.put('h', EnumC18762.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC18762.MINUTE_OF_HOUR);
        map.put('s', EnumC18762.SECOND_OF_MINUTE);
        EnumC18762 enumC18764 = EnumC18762.NANO_OF_SECOND;
        map.put('S', enumC18764);
        map.put('A', EnumC18762.MILLI_OF_DAY);
        map.put('n', enumC18764);
        map.put('N', EnumC18762.NANO_OF_DAY);
        map.put('g', AbstractC16646.a);
    }

    public C16770() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public C16770(C16770 c16770) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = c16770;
        this.d = true;
    }

    public final void k(InterfaceC11002 interfaceC11002) {
        C13638.requireNonNull(interfaceC11002, "field");
        j(new C21709(interfaceC11002, 1, 19, EnumC1247.NORMAL));
    }

    public final void l(InterfaceC11002 interfaceC11002, int i2) {
        C13638.requireNonNull(interfaceC11002, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        j(new C21709(interfaceC11002, i2, i2, EnumC1247.NOT_NEGATIVE));
    }

    public final void m(InterfaceC11002 interfaceC11002, int i2, int i3, EnumC1247 enumC1247) {
        if (i2 == i3 && enumC1247 == EnumC1247.NOT_NEGATIVE) {
            l(interfaceC11002, i3);
            return;
        }
        C13638.requireNonNull(interfaceC11002, "field");
        C13638.requireNonNull(enumC1247, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        j(new C21709(interfaceC11002, i2, i3, enumC1247));
    }

    public final void j(C21709 c21709) {
        C21709 c21709D;
        C16770 c16770 = this.a;
        int i2 = c16770.g;
        if (i2 < 0) {
            c16770.g = c(c21709);
            return;
        }
        C21709 c217010 = (C21709) ((ArrayList) c16770.c).get(i2);
        int i3 = c21709.b;
        int i4 = c21709.c;
        if (i3 == i4 && c21709.d == EnumC1247.NOT_NEGATIVE) {
            c21709D = c217010.e(i4);
            c(c21709.d());
            this.a.g = i2;
        } else {
            c21709D = c217010.d();
            this.a.g = c(c21709);
        }
        ((ArrayList) this.a.c).set(i2, c21709D);
    }

    public final void b(EnumC18762 enumC18762, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            j(new C13243(enumC18762, i2, i3, z));
        } else {
            c(new C13243(enumC18762, i2, i3, z));
        }
    }

    public final void i(InterfaceC11002 interfaceC11002, EnumC4069 enumC4069) {
        C13638.requireNonNull(interfaceC11002, "field");
        C13638.requireNonNull(enumC4069, "textStyle");
        c(new C21003(interfaceC11002, enumC4069, C9240.c));
    }

    public final void h(EnumC18762 enumC18762, Map map) {
        C13638.requireNonNull(enumC18762, "field");
        C13638.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC4069 enumC4069 = EnumC4069.FULL;
        c(new C21003(enumC18762, enumC4069, new C1477(new C14179(Collections.singletonMap(enumC4069, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new C18181(str, str2));
    }

    public final void f(EnumC4069 enumC4069) {
        C13638.requireNonNull(enumC4069, "style");
        if (enumC4069 != EnumC4069.FULL && enumC4069 != EnumC4069.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new C15360(0, enumC4069));
    }

    public final void d(char c) {
        c(new C13949(c));
    }

    public final void e(String str) {
        C13638.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C13949(str.charAt(0)));
        } else {
            c(new C15360(1, str));
        }
    }

    public final void a(C23351 c23351) {
        C13638.requireNonNull(c23351, "formatter");
        C2658 c2658 = c23351.a;
        if (c2658.b) {
            c2658 = new C2658(c2658.a, false);
        }
        c(c2658);
    }

    public final void o() {
        C16770 c16770 = this.a;
        c16770.g = -1;
        this.a = new C16770(c16770);
    }

    public final void n() {
        C16770 c16770 = this.a;
        if (c16770.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c16770.c).size() > 0) {
            C16770 c16771 = this.a;
            C2658 c2658 = new C2658(c16771.c, c16771.d);
            this.a = this.a.b;
            c(c2658);
            return;
        }
        this.a = this.a.b;
    }

    public final int c(InterfaceC22415 interfaceC22415) {
        C13638.requireNonNull(interfaceC22415, "pp");
        C16770 c16770 = this.a;
        int i2 = c16770.e;
        if (i2 > 0) {
            if (interfaceC22415 != null) {
                interfaceC22415 = new C18887(interfaceC22415, i2, c16770.f);
            }
            c16770.e = 0;
            c16770.f = (char) 0;
        }
        ((ArrayList) c16770.c).add(interfaceC22415);
        C16770 c16771 = this.a;
        c16771.g = -1;
        return ((ArrayList) c16771.c).size() - 1;
    }

    public final C23351 p(EnumC5481 enumC5481, InterfaceC21233 interfaceC21233) {
        return q(Locale.getDefault(), enumC5481, interfaceC21233);
    }

    public final C23351 q(Locale locale, EnumC5481 enumC5481, InterfaceC21233 interfaceC21233) {
        C13638.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        C2658 c2658 = new C2658(this.c, false);
        C4775 c4775 = C4775.a;
        return new C23351(c2658, locale, enumC5481, interfaceC21233);
    }
}
