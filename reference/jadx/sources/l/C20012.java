package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.ᩴᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20012 extends AbstractC11895 implements Serializable {
    public static final C20012 c = new C20012();
    public static final long serialVersionUID = -1440403870442975015L;

    @Override // l.InterfaceC8912
    public final String getId() {
        return "ISO";
    }

    @Override // l.InterfaceC8912
    public final String l() {
        return "iso8601";
    }

    @Override // l.InterfaceC8912
    public final InterfaceC7421 v(int i) {
        if (i == 0) {
            return EnumC15536.BCE;
        }
        if (i == 1) {
            return EnumC15536.CE;
        }
        throw new C21241("Invalid era: " + i);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 I(int i, int i2, int i3) {
        return C7816.of(i, i2, i3);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 n(int i, int i2) {
        return C7816.e0(i, i2);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 h(long j) {
        return C7816.d0(j);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 B(InterfaceC9437 interfaceC9437) {
        return C7816.T(interfaceC9437);
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC12641 F(InterfaceC9437 interfaceC9437) {
        return C19003.S(interfaceC9437);
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC5930 m(InterfaceC9437 interfaceC9437) {
        return C23084.R(interfaceC9437);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC5930 L(C0358 c0358, AbstractC22338 abstractC22338) {
        return C23084.ofInstant(c0358, abstractC22338);
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 j() {
        C20100 c20100A = AbstractC14527.a();
        C17359.requireNonNull(c20100A, "clock");
        return C7816.T(C7816.c0(c20100A));
    }

    @Override // l.InterfaceC8912
    public final boolean O(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // l.InterfaceC8912
    public final int w(InterfaceC7421 interfaceC7421, int i) {
        if (interfaceC7421 instanceof EnumC15536) {
            return interfaceC7421 == EnumC15536.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // l.InterfaceC8912
    public final List u() {
        return AbstractC1758.B(EnumC15536.values());
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC17116 K(Map map, EnumC18520 enumC18520) {
        return (C7816) super.K(map, enumC18520);
    }

    @Override // l.AbstractC11895
    public final void z(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC8692);
        if (l2 != null) {
            if (enumC18520 != EnumC18520.LENIENT) {
                enumC8692.P(l2.longValue());
            }
            long j = 12;
            AbstractC11895.i(map, EnumC8692.MONTH_OF_YEAR, ((int) AbstractC1758.O(l2.longValue(), j)) + 1);
            AbstractC11895.i(map, EnumC8692.YEAR, AbstractC1758.z(l2.longValue(), j));
        }
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 P(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC8692);
        if (l2 != null) {
            if (enumC18520 != EnumC18520.LENIENT) {
                enumC8692.P(l2.longValue());
            }
            Long l3 = (Long) map.remove(EnumC8692.ERA);
            if (l3 != null) {
                if (l3.longValue() == 1) {
                    AbstractC11895.i(map, EnumC8692.YEAR, l2.longValue());
                    return null;
                }
                if (l3.longValue() == 0) {
                    AbstractC11895.i(map, EnumC8692.YEAR, AbstractC1758.R(1L, l2.longValue()));
                    return null;
                }
                throw new C21241("Invalid value for era: " + l3);
            }
            EnumC8692 enumC8693 = EnumC8692.YEAR;
            Long l4 = (Long) map.get(enumC8693);
            if (enumC18520 != EnumC18520.STRICT) {
                AbstractC11895.i(map, enumC8693, (l4 == null || l4.longValue() > 0) ? l2.longValue() : AbstractC1758.R(1L, l2.longValue()));
                return null;
            }
            if (l4 != null) {
                long jLongValue = l4.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = AbstractC1758.R(1L, jLongValue2);
                }
                AbstractC11895.i(map, enumC8693, jLongValue2);
                return null;
            }
            map.put(enumC8692, l2);
            return null;
        }
        EnumC8692 enumC8694 = EnumC8692.ERA;
        if (!map.containsKey(enumC8694)) {
            return null;
        }
        enumC8694.P(((Long) map.get(enumC8694)).longValue());
        return null;
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 C(Map map, EnumC18520 enumC18520) {
        EnumC8692 enumC8692 = EnumC8692.YEAR;
        int iA = enumC8692.b.a(((Long) map.remove(enumC8692)).longValue(), enumC8692);
        boolean z = true;
        if (enumC18520 == EnumC18520.LENIENT) {
            return C7816.of(iA, 1, 1).h0(AbstractC1758.R(((Long) map.remove(EnumC8692.MONTH_OF_YEAR)).longValue(), 1L)).g0(AbstractC1758.R(((Long) map.remove(EnumC8692.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC8692 enumC8693 = EnumC8692.MONTH_OF_YEAR;
        int iA2 = enumC8693.b.a(((Long) map.remove(enumC8693)).longValue(), enumC8693);
        EnumC8692 enumC8694 = EnumC8692.DAY_OF_MONTH;
        int iA3 = enumC8694.b.a(((Long) map.remove(enumC8694)).longValue(), enumC8694);
        if (enumC18520 == EnumC18520.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                EnumC6456 enumC6456 = EnumC6456.FEBRUARY;
                long j = iA;
                int i = C13781.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, enumC6456.S(z));
            }
        }
        return C7816.of(iA, iA2, iA3);
    }

    @Override // l.InterfaceC8912
    public final C23545 s(EnumC8692 enumC8692) {
        return enumC8692.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C6676((byte) 1, this);
    }
}
