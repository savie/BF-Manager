package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ۚᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5842 extends AbstractC11895 implements Serializable {
    public static final C5842 c = new C5842();
    public static final long serialVersionUID = 459996390165777884L;

    @Override // l.InterfaceC8912
    public final String getId() {
        return "Japanese";
    }

    @Override // l.InterfaceC8912
    public final String l() {
        return "japanese";
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 I(int i, int i2, int i3) {
        return new C11807(C7816.of(i, i2, i3));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 n(int i, int i2) {
        return new C11807(C7816.e0(i, i2));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 h(long j) {
        return new C11807(C7816.d0(j));
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 j() {
        return new C11807(C7816.T(C7816.c0(AbstractC14527.a())));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 B(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C11807) {
            return (C11807) interfaceC9437;
        }
        return new C11807(C7816.T(interfaceC9437));
    }

    @Override // l.InterfaceC8912
    public final List u() {
        C25234[] c25234Arr = C25234.e;
        return AbstractC1758.B((C25234[]) Arrays.copyOf(c25234Arr, c25234Arr.length));
    }

    @Override // l.InterfaceC8912
    public final boolean O(long j) {
        return C20012.c.O(j);
    }

    @Override // l.InterfaceC8912
    public final int w(InterfaceC7421 interfaceC7421, int i) {
        if (!(interfaceC7421 instanceof C25234)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        C25234 c25234 = (C25234) interfaceC7421;
        int year = (c25234.b.getYear() + i) - 1;
        if (i != 1 && (year < -999999999 || year > 999999999 || year < c25234.b.getYear() || interfaceC7421 != C25234.h(C7816.of(year, 1, 1)))) {
            throw new C21241("Invalid yearOfEra value");
        }
        return year;
    }

    @Override // l.InterfaceC8912
    public final InterfaceC7421 v(int i) {
        return C25234.m(i);
    }

    @Override // l.InterfaceC8912
    public final C23545 s(EnumC8692 enumC8692) {
        switch (AbstractC13299.a[enumC8692.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C16085("Unsupported field: " + enumC8692);
            case 5:
                C25234[] c25234Arr = C25234.e;
                int year = c25234Arr[c25234Arr.length - 1].b.getYear();
                int year2 = BasicLabelFormatter.BILLION - c25234Arr[c25234Arr.length - 1].b.getYear();
                int year3 = c25234Arr[0].b.getYear();
                int i = 1;
                while (true) {
                    C25234[] c25234Arr2 = C25234.e;
                    if (i >= c25234Arr2.length) {
                        return C23545.g(1L, year2, 999999999 - year);
                    }
                    C25234 c25234 = c25234Arr2[i];
                    year2 = Math.min(year2, (c25234.b.getYear() - year3) + 1);
                    year3 = c25234.b.getYear();
                    i++;
                }
                break;
            case 6:
                C25234 c25235 = C25234.d;
                long j = EnumC8692.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (C25234 c25236 : C25234.e) {
                    long jMin2 = Math.min(jMin, (c25236.b.M() - c25236.b.W()) + 1);
                    jMin = c25236.l() != null ? Math.min(jMin2, c25236.l().b.W() - 1) : jMin2;
                }
                return C23545.g(1L, jMin, EnumC8692.DAY_OF_YEAR.b.d);
            case 7:
                return C23545.f(C11807.d.getYear(), 999999999L);
            case 8:
                long j2 = C25234.d.a;
                C25234[] c25234Arr3 = C25234.e;
                return C23545.f(j2, c25234Arr3[c25234Arr3.length - 1].a);
            default:
                return enumC8692.b;
        }
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC17116 K(Map map, EnumC18520 enumC18520) {
        return (C11807) super.K(map, enumC18520);
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 P(Map map, EnumC18520 enumC18520) {
        C11807 c11807Y;
        EnumC8692 enumC8692 = EnumC8692.ERA;
        Long l2 = (Long) map.get(enumC8692);
        C25234 c25234M = l2 != null ? C25234.m(s(enumC8692).a(l2.longValue(), enumC8692)) : null;
        EnumC8692 enumC8693 = EnumC8692.YEAR_OF_ERA;
        Long l3 = (Long) map.get(enumC8693);
        int iA = l3 != null ? s(enumC8693).a(l3.longValue(), enumC8693) : 0;
        if (c25234M == null && l3 != null && !map.containsKey(EnumC8692.YEAR) && enumC18520 != EnumC18520.STRICT) {
            C25234[] c25234Arr = C25234.e;
            c25234M = ((C25234[]) Arrays.copyOf(c25234Arr, c25234Arr.length))[((C25234[]) Arrays.copyOf(c25234Arr, c25234Arr.length)).length - 1];
        }
        if (l3 != null && c25234M != null) {
            EnumC8692 enumC8694 = EnumC8692.MONTH_OF_YEAR;
            if (map.containsKey(enumC8694)) {
                EnumC8692 enumC8695 = EnumC8692.DAY_OF_MONTH;
                if (map.containsKey(enumC8695)) {
                    map.remove(enumC8692);
                    map.remove(enumC8693);
                    if (enumC18520 == EnumC18520.LENIENT) {
                        return new C11807(C7816.of((c25234M.b.getYear() + iA) - 1, 1, 1)).W(AbstractC1758.R(((Long) map.remove(enumC8694)).longValue(), 1L), EnumC10183.MONTHS).W(AbstractC1758.R(((Long) map.remove(enumC8695)).longValue(), 1L), EnumC10183.DAYS);
                    }
                    int iA2 = s(enumC8694).a(((Long) map.remove(enumC8694)).longValue(), enumC8694);
                    int iA3 = s(enumC8695).a(((Long) map.remove(enumC8695)).longValue(), enumC8695);
                    if (enumC18520 != EnumC18520.SMART) {
                        C7816 c7816 = C11807.d;
                        C17359.requireNonNull(c25234M, "era");
                        C7816 c7816Of = C7816.of((c25234M.b.getYear() + iA) - 1, iA2, iA3);
                        if (c7816Of.Y(c25234M.b) || c25234M != C25234.h(c7816Of)) {
                            throw new C21241("year, month, and day not valid for Era");
                        }
                        return new C11807(c25234M, iA, c7816Of);
                    }
                    if (iA < 1) {
                        throw new C21241("Invalid YearOfEra: " + iA);
                    }
                    int year = (c25234M.b.getYear() + iA) - 1;
                    try {
                        c11807Y = new C11807(C7816.of(year, iA2, iA3));
                    } catch (C21241 unused) {
                        c11807Y = new C11807(C7816.of(year, iA2, 1)).Y(new C14435(3));
                    }
                    if (c11807Y.b == c25234M || AbstractC17577.a(c11807Y, EnumC8692.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return c11807Y;
                    }
                    throw new C21241("Invalid YearOfEra for Era: " + c25234M + " " + iA);
                }
            }
            EnumC8692 enumC8696 = EnumC8692.DAY_OF_YEAR;
            if (map.containsKey(enumC8696)) {
                map.remove(enumC8692);
                map.remove(enumC8693);
                if (enumC18520 == EnumC18520.LENIENT) {
                    return new C11807(C7816.e0((c25234M.b.getYear() + iA) - 1, 1)).W(AbstractC1758.R(((Long) map.remove(enumC8696)).longValue(), 1L), EnumC10183.DAYS);
                }
                int iA4 = s(enumC8696).a(((Long) map.remove(enumC8696)).longValue(), enumC8696);
                C7816 c7817 = C11807.d;
                C17359.requireNonNull(c25234M, "era");
                C7816 c7816E0 = iA == 1 ? C7816.e0(c25234M.b.getYear(), (c25234M.b.W() + iA4) - 1) : C7816.e0((c25234M.b.getYear() + iA) - 1, iA4);
                if (c7816E0.Y(c25234M.b) || c25234M != C25234.h(c7816E0)) {
                    throw new C21241("Invalid parameters");
                }
                return new C11807(c25234M, iA, c7816E0);
            }
        }
        return null;
    }

    @Override // l.InterfaceC8912
    public final InterfaceC5930 L(C0358 c0358, AbstractC22338 abstractC22338) {
        return C9657.S(this, c0358, abstractC22338);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C6676((byte) 1, this);
    }
}
