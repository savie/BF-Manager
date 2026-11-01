package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۟֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7122 extends AbstractC16874 implements Serializable {
    public static final C7122 c = new C7122();
    public static final long serialVersionUID = -1440403870442975015L;

    @Override // l.InterfaceC21233
    public final String k() {
        return "ISO";
    }

    @Override // l.InterfaceC21233
    public final String o() {
        return "iso8601";
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17705 y(int i) {
        if (i == 0) {
            return EnumC20528.BCE;
        }
        if (i == 1) {
            return EnumC20528.CE;
        }
        throw new C15464("Invalid era: " + i);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 M(int i, int i2, int i3) {
        return C18991.h0(i, i2, i3);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 q(int i, int i2) {
        return C18991.j0(i, i2);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 j(long j) {
        return C18991.i0(j);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 E(InterfaceC21584 interfaceC21584) {
        return C18991.X(interfaceC21584);
    }

    @Override // l.AbstractC16874, l.InterfaceC21233
    public final InterfaceC9819 J(InterfaceC21584 interfaceC21584) {
        return C1952.W(interfaceC21584);
    }

    @Override // l.AbstractC16874, l.InterfaceC21233
    public final InterfaceC20402 p(InterfaceC21584 interfaceC21584) {
        return C10525.V(interfaceC21584);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC20402 P(C18285 c18285, AbstractC9114 abstractC9114) {
        return C10525.ofInstant(c18285, abstractC9114);
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 m() {
        C7702 c7702A = AbstractC23225.a();
        C13638.requireNonNull(c7702A, "clock");
        return C18991.X(C18991.g0(c7702A));
    }

    @Override // l.InterfaceC21233
    public final boolean S(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // l.InterfaceC21233
    public final int z(InterfaceC17705 interfaceC17705, int i) {
        if (interfaceC17705 instanceof EnumC20528) {
            return interfaceC17705 == EnumC20528.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // l.InterfaceC21233
    public final List x() {
        return AbstractC1726.B(EnumC20528.values());
    }

    @Override // l.AbstractC16874, l.InterfaceC21233
    public final InterfaceC17579 O(Map map, EnumC5481 enumC5481) {
        return (C18991) super.O(map, enumC5481);
    }

    @Override // l.AbstractC16874
    public final void C(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.PROLEPTIC_MONTH;
        Long l2 = (Long) map.remove(enumC18762);
        if (l2 != null) {
            if (enumC5481 != EnumC5481.LENIENT) {
                enumC18762.T(l2.longValue());
            }
            long j = 12;
            AbstractC16874.l(map, EnumC18762.MONTH_OF_YEAR, ((int) AbstractC1726.O(l2.longValue(), j)) + 1);
            AbstractC16874.l(map, EnumC18762.YEAR, AbstractC1726.z(l2.longValue(), j));
        }
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 T(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.YEAR_OF_ERA;
        Long l2 = (Long) map.remove(enumC18762);
        if (l2 != null) {
            if (enumC5481 != EnumC5481.LENIENT) {
                enumC18762.T(l2.longValue());
            }
            Long l3 = (Long) map.remove(EnumC18762.ERA);
            if (l3 != null) {
                if (l3.longValue() == 1) {
                    AbstractC16874.l(map, EnumC18762.YEAR, l2.longValue());
                    return null;
                }
                if (l3.longValue() == 0) {
                    AbstractC16874.l(map, EnumC18762.YEAR, AbstractC1726.R(1L, l2.longValue()));
                    return null;
                }
                throw new C15464("Invalid value for era: " + l3);
            }
            EnumC18762 enumC18763 = EnumC18762.YEAR;
            Long l4 = (Long) map.get(enumC18763);
            if (enumC5481 != EnumC5481.STRICT) {
                AbstractC16874.l(map, enumC18763, (l4 == null || l4.longValue() > 0) ? l2.longValue() : AbstractC1726.R(1L, l2.longValue()));
                return null;
            }
            if (l4 != null) {
                long jLongValue = l4.longValue();
                long jLongValue2 = l2.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = AbstractC1726.R(1L, jLongValue2);
                }
                AbstractC16874.l(map, enumC18763, jLongValue2);
                return null;
            }
            map.put(enumC18762, l2);
            return null;
        }
        EnumC18762 enumC18764 = EnumC18762.ERA;
        if (!map.containsKey(enumC18764)) {
            return null;
        }
        enumC18764.T(((Long) map.get(enumC18764)).longValue());
        return null;
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 G(Map map, EnumC5481 enumC5481) {
        EnumC18762 enumC18762 = EnumC18762.YEAR;
        int iA = enumC18762.b.a(((Long) map.remove(enumC18762)).longValue(), enumC18762);
        boolean z = true;
        if (enumC5481 == EnumC5481.LENIENT) {
            return C18991.h0(iA, 1, 1).m0(AbstractC1726.R(((Long) map.remove(EnumC18762.MONTH_OF_YEAR)).longValue(), 1L)).l0(AbstractC1726.R(((Long) map.remove(EnumC18762.DAY_OF_MONTH)).longValue(), 1L));
        }
        EnumC18762 enumC18763 = EnumC18762.MONTH_OF_YEAR;
        int iA2 = enumC18763.b.a(((Long) map.remove(enumC18763)).longValue(), enumC18763);
        EnumC18762 enumC18764 = EnumC18762.DAY_OF_MONTH;
        int iA3 = enumC18764.b.a(((Long) map.remove(enumC18764)).longValue(), enumC18764);
        if (enumC5481 == EnumC5481.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                EnumC13824 enumC13824 = EnumC13824.FEBRUARY;
                long j = iA;
                int i = C4795.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, enumC13824.W(z));
            }
        }
        return C18991.h0(iA, iA2, iA3);
    }

    @Override // l.InterfaceC21233
    public final C1828 v(EnumC18762 enumC18762) {
        return enumC18762.b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new C3467((byte) 1, this);
    }
}
