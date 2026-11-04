package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.ۧܳۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11675 {
    public static final C14435 h = new C14435(2);
    public static final Map i;
    public C11675 a;
    public final C11675 b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', EnumC8692.ERA);
        map.put('y', EnumC8692.YEAR_OF_ERA);
        map.put('u', EnumC8692.YEAR);
        EnumC22799 enumC22799 = AbstractC15339.a;
        map.put('Q', enumC22799);
        map.put('q', enumC22799);
        EnumC8692 enumC8692 = EnumC8692.MONTH_OF_YEAR;
        map.put('M', enumC8692);
        map.put('L', enumC8692);
        map.put('D', EnumC8692.DAY_OF_YEAR);
        map.put('d', EnumC8692.DAY_OF_MONTH);
        map.put('F', EnumC8692.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        EnumC8692 enumC8693 = EnumC8692.DAY_OF_WEEK;
        map.put('E', enumC8693);
        map.put('c', enumC8693);
        map.put('e', enumC8693);
        map.put('a', EnumC8692.AMPM_OF_DAY);
        map.put('H', EnumC8692.HOUR_OF_DAY);
        map.put('k', EnumC8692.CLOCK_HOUR_OF_DAY);
        map.put('K', EnumC8692.HOUR_OF_AMPM);
        map.put('h', EnumC8692.CLOCK_HOUR_OF_AMPM);
        map.put('m', EnumC8692.MINUTE_OF_HOUR);
        map.put('s', EnumC8692.SECOND_OF_MINUTE);
        EnumC8692 enumC8694 = EnumC8692.NANO_OF_SECOND;
        map.put('S', enumC8694);
        map.put('A', EnumC8692.MILLI_OF_DAY);
        map.put('n', enumC8694);
        map.put('N', EnumC8692.NANO_OF_DAY);
        map.put('g', AbstractC5645.a);
    }

    public C11675() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public C11675(C11675 c11675) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = c11675;
        this.d = true;
    }

    public final void k(InterfaceC16831 interfaceC16831) {
        C17359.requireNonNull(interfaceC16831, "field");
        j(new C8824(interfaceC16831, 1, 19, EnumC8079.NORMAL));
    }

    public final void l(InterfaceC16831 interfaceC16831, int i2) {
        C17359.requireNonNull(interfaceC16831, "field");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
        j(new C8824(interfaceC16831, i2, i2, EnumC8079.NOT_NEGATIVE));
    }

    public final void m(InterfaceC16831 interfaceC16831, int i2, int i3, EnumC8079 enumC8079) {
        if (i2 == i3 && enumC8079 == EnumC8079.NOT_NEGATIVE) {
            l(interfaceC16831, i3);
            return;
        }
        C17359.requireNonNull(interfaceC16831, "field");
        C17359.requireNonNull(enumC8079, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 < i2) {
            throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
        }
        j(new C8824(interfaceC16831, i2, i3, enumC8079));
    }

    public final void j(C8824 c8824) {
        C8824 c8824D;
        C11675 c11675 = this.a;
        int i2 = c11675.g;
        if (i2 < 0) {
            c11675.g = c(c8824);
            return;
        }
        C8824 c8825 = (C8824) ((ArrayList) c11675.c).get(i2);
        int i3 = c8824.b;
        int i4 = c8824.c;
        if (i3 == i4 && c8824.d == EnumC8079.NOT_NEGATIVE) {
            c8824D = c8825.e(i4);
            c(c8824.d());
            this.a.g = i2;
        } else {
            c8824D = c8825.d();
            this.a.g = c(c8824);
        }
        ((ArrayList) this.a.c).set(i2, c8824D);
    }

    public final void b(EnumC8692 enumC8692, int i2, int i3, boolean z) {
        if (i2 == i3 && !z) {
            j(new C19266(enumC8692, i2, i3, z));
        } else {
            c(new C19266(enumC8692, i2, i3, z));
        }
    }

    public final void i(InterfaceC16831 interfaceC16831, EnumC10315 enumC10315) {
        C17359.requireNonNull(interfaceC16831, "field");
        C17359.requireNonNull(enumC10315, "textStyle");
        c(new C15404(interfaceC16831, enumC10315, C12553.c));
    }

    public final void h(EnumC8692 enumC8692, Map map) {
        C17359.requireNonNull(enumC8692, "field");
        C17359.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        EnumC10315 enumC10315 = EnumC10315.FULL;
        c(new C15404(enumC8692, enumC10315, new C20758(new C3604(Collections.singletonMap(enumC10315, linkedHashMap)))));
    }

    public final void g(String str, String str2) {
        c(new C7333(str, str2));
    }

    public final void f(EnumC10315 enumC10315) {
        C17359.requireNonNull(enumC10315, "style");
        if (enumC10315 != EnumC10315.FULL && enumC10315 != EnumC10315.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new C2858(0, enumC10315));
    }

    public final void d(char c) {
        c(new C4350(c));
    }

    public final void e(String str) {
        C17359.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new C4350(str.charAt(0)));
        } else {
            c(new C2858(1, str));
        }
    }

    public final void a(C23742 c23742) {
        C17359.requireNonNull(c23742, "formatter");
        C21504 c21504 = c23742.a;
        if (c21504.b) {
            c21504 = new C21504(c21504.a, false);
        }
        c(c21504);
    }

    public final void o() {
        C11675 c11675 = this.a;
        c11675.g = -1;
        this.a = new C11675(c11675);
    }

    public final void n() {
        C11675 c11675 = this.a;
        if (c11675.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) c11675.c).size() > 0) {
            C11675 c11676 = this.a;
            C21504 c21504 = new C21504(c11676.c, c11676.d);
            this.a = this.a.b;
            c(c21504);
            return;
        }
        this.a = this.a.b;
    }

    public final int c(InterfaceC0621 interfaceC0621) {
        C17359.requireNonNull(interfaceC0621, "pp");
        C11675 c11675 = this.a;
        int i2 = c11675.e;
        if (i2 > 0) {
            if (interfaceC0621 != null) {
                interfaceC0621 = new C14044(interfaceC0621, i2, c11675.f);
            }
            c11675.e = 0;
            c11675.f = (char) 0;
        }
        ((ArrayList) c11675.c).add(interfaceC0621);
        C11675 c11676 = this.a;
        c11676.g = -1;
        return ((ArrayList) c11676.c).size() - 1;
    }

    public final C23742 p(EnumC18520 enumC18520, InterfaceC8912 interfaceC8912) {
        return q(Locale.getDefault(), enumC18520, interfaceC8912);
    }

    public final C23742 q(Locale locale, EnumC18520 enumC18520, InterfaceC8912 interfaceC8912) {
        C17359.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        C21504 c21504 = new C21504(this.c, false);
        C24488 c24488 = C24488.a;
        return new C23742(c21504, locale, enumC18520, interfaceC8912);
    }
}
