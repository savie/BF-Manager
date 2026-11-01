package l;

import com.google.android.material.slider.BasicLabelFormatter;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19823 extends AbstractC16874 implements Serializable {
    public static final C19823 c = new C19823();
    public static final long serialVersionUID = 459996390165777884L;

    @Override // l.InterfaceC21233
    public final String k() {
        return "Japanese";
    }

    @Override // l.InterfaceC21233
    public final String o() {
        return "japanese";
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 M(int i, int i2, int i3) {
        return new C16295(C18991.h0(i, i2, i3));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 q(int i, int i2) {
        return new C16295(C18991.j0(i, i2));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 j(long j) {
        return new C16295(C18991.i0(j));
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 m() {
        return new C16295(C18991.X(C18991.g0(AbstractC23225.a())));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 E(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C16295) {
            return (C16295) interfaceC21584;
        }
        return new C16295(C18991.X(interfaceC21584));
    }

    @Override // l.InterfaceC21233
    public final List x() {
        C12062[] c12062Arr = C12062.e;
        return AbstractC1726.B((C12062[]) Arrays.copyOf(c12062Arr, c12062Arr.length));
    }

    @Override // l.InterfaceC21233
    public final boolean S(long j) {
        return C7122.c.S(j);
    }

    @Override // l.InterfaceC21233
    public final int z(InterfaceC17705 interfaceC17705, int i) {
        if (!(interfaceC17705 instanceof C12062)) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int i2 = ((C12062) interfaceC17705).b.a;
        int i3 = (i2 + i) - 1;
        if (i != 1 && (i3 < -999999999 || i3 > 999999999 || i3 < i2 || interfaceC17705 != C12062.j(C18991.h0(i3, 1, 1)))) {
            throw new C15464("Invalid yearOfEra value");
        }
        return i3;
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17705 y(int i) {
        return C12062.o(i);
    }

    @Override // l.InterfaceC21233
    public final C1828 v(EnumC18762 enumC18762) {
        switch (AbstractC15590.a[enumC18762.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                throw new C14530("Unsupported field: " + enumC18762);
            case 5:
                C12062[] c12062Arr = C12062.e;
                int i = c12062Arr[c12062Arr.length - 1].b.a;
                int iMin = BasicLabelFormatter.BILLION - c12062Arr[c12062Arr.length - 1].b.a;
                int i2 = c12062Arr[0].b.a;
                int i3 = 1;
                while (true) {
                    C12062[] c12062Arr2 = C12062.e;
                    if (i3 >= c12062Arr2.length) {
                        return C1828.g(1L, iMin, 999999999 - i);
                    }
                    C12062 c12062 = c12062Arr2[i3];
                    iMin = Math.min(iMin, (c12062.b.a - i2) + 1);
                    i2 = c12062.b.a;
                    i3++;
                }
                break;
            case 6:
                C12062 c12063 = C12062.d;
                long j = EnumC18762.DAY_OF_YEAR.b.c;
                long jMin = j;
                for (C12062 c12064 : C12062.e) {
                    long jMin2 = Math.min(jMin, (c12064.b.Q() - c12064.b.a0()) + 1);
                    jMin = c12064.k() != null ? Math.min(jMin2, c12064.k().b.a0() - 1) : jMin2;
                }
                return C1828.g(1L, jMin, EnumC18762.DAY_OF_YEAR.b.d);
            case 7:
                return C1828.f(C16295.d.a, 999999999L);
            case 8:
                long j2 = C12062.d.a;
                C12062[] c12062Arr3 = C12062.e;
                return C1828.f(j2, c12062Arr3[c12062Arr3.length - 1].a);
            default:
                return enumC18762.b;
        }
    }

    @Override // l.AbstractC16874, l.InterfaceC21233
    public final InterfaceC17579 O(Map map, EnumC5481 enumC5481) {
        return (C16295) super.O(map, enumC5481);
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 T(Map map, EnumC5481 enumC5481) {
        C18991 c18991J0;
        C16295 c16295C0;
        EnumC18762 enumC18762 = EnumC18762.ERA;
        Long l2 = (Long) map.get(enumC18762);
        C12062 c12062O = l2 != null ? C12062.o(v(enumC18762).a(l2.longValue(), enumC18762)) : null;
        EnumC18762 enumC18763 = EnumC18762.YEAR_OF_ERA;
        Long l3 = (Long) map.get(enumC18763);
        int iA = l3 != null ? v(enumC18763).a(l3.longValue(), enumC18763) : 0;
        if (c12062O == null && l3 != null && !map.containsKey(EnumC18762.YEAR) && enumC5481 != EnumC5481.STRICT) {
            C12062[] c12062Arr = C12062.e;
            c12062O = ((C12062[]) Arrays.copyOf(c12062Arr, c12062Arr.length))[((C12062[]) Arrays.copyOf(c12062Arr, c12062Arr.length)).length - 1];
        }
        if (l3 != null && c12062O != null) {
            EnumC18762 enumC18764 = EnumC18762.MONTH_OF_YEAR;
            if (map.containsKey(enumC18764)) {
                EnumC18762 enumC18765 = EnumC18762.DAY_OF_MONTH;
                if (map.containsKey(enumC18765)) {
                    map.remove(enumC18762);
                    map.remove(enumC18763);
                    if (enumC5481 == EnumC5481.LENIENT) {
                        return new C16295(C18991.h0((c12062O.b.a + iA) - 1, 1, 1)).a0(AbstractC1726.R(((Long) map.remove(enumC18764)).longValue(), 1L), EnumC22996.MONTHS).a0(AbstractC1726.R(((Long) map.remove(enumC18765)).longValue(), 1L), EnumC22996.DAYS);
                    }
                    int iA2 = v(enumC18764).a(((Long) map.remove(enumC18764)).longValue(), enumC18764);
                    int iA3 = v(enumC18765).a(((Long) map.remove(enumC18765)).longValue(), enumC18765);
                    if (enumC5481 != EnumC5481.SMART) {
                        C18991 c18991 = C16295.d;
                        C13638.requireNonNull(c12062O, "era");
                        C18991 c18991H0 = C18991.h0((c12062O.b.a + iA) - 1, iA2, iA3);
                        if (c18991H0.c0(c12062O.b) || c12062O != C12062.j(c18991H0)) {
                            throw new C15464("year, month, and day not valid for Era");
                        }
                        return new C16295(c12062O, iA, c18991H0);
                    }
                    if (iA < 1) {
                        throw new C15464("Invalid YearOfEra: " + iA);
                    }
                    int i = (c12062O.b.a + iA) - 1;
                    try {
                        c16295C0 = new C16295(C18991.h0(i, iA2, iA3));
                    } catch (C15464 unused) {
                        c16295C0 = new C16295(C18991.h0(i, iA2, 1)).c0(new C22935(3));
                    }
                    if (c16295C0.b == c12062O || AbstractC23702.a(c16295C0, EnumC18762.YEAR_OF_ERA) <= 1 || iA <= 1) {
                        return c16295C0;
                    }
                    throw new C15464("Invalid YearOfEra for Era: " + c12062O + " " + iA);
                }
            }
            EnumC18762 enumC18766 = EnumC18762.DAY_OF_YEAR;
            if (map.containsKey(enumC18766)) {
                map.remove(enumC18762);
                map.remove(enumC18763);
                if (enumC5481 == EnumC5481.LENIENT) {
                    return new C16295(C18991.j0((c12062O.b.a + iA) - 1, 1)).a0(AbstractC1726.R(((Long) map.remove(enumC18766)).longValue(), 1L), EnumC22996.DAYS);
                }
                int iA4 = v(enumC18766).a(((Long) map.remove(enumC18766)).longValue(), enumC18766);
                C18991 c18992 = C16295.d;
                C13638.requireNonNull(c12062O, "era");
                if (iA == 1) {
                    C18991 c18993 = c12062O.b;
                    c18991J0 = C18991.j0(c18993.a, (c18993.a0() + iA4) - 1);
                } else {
                    c18991J0 = C18991.j0((c12062O.b.a + iA) - 1, iA4);
                }
                if (c18991J0.c0(c12062O.b) || c12062O != C12062.j(c18991J0)) {
                    throw new C15464("Invalid parameters");
                }
                return new C16295(c12062O, iA, c18991J0);
            }
        }
        return null;
    }

    @Override // l.InterfaceC21233
    public final InterfaceC20402 P(C18285 c18285, AbstractC9114 abstractC9114) {
        return C22645.W(this, c18285, abstractC9114);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C3467((byte) 1, this);
    }
}
