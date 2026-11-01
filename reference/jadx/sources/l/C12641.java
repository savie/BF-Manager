package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.۫᩶ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12641 extends AbstractC16874 implements Serializable {
    public static final C12641 c = new C12641();
    public static final long serialVersionUID = 1039765215346859963L;

    @Override // l.InterfaceC21233
    public final String k() {
        return "Minguo";
    }

    @Override // l.InterfaceC21233
    public final String o() {
        return "roc";
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17705 y(int i) {
        if (i == 0) {
            return EnumC2056.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC2056.ROC;
        }
        throw new C15464("Invalid era: " + i);
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 M(int i, int i2, int i3) {
        return new C23930(C18991.h0(i + 1911, i2, i3));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 q(int i, int i2) {
        return new C23930(C18991.j0(i + 1911, i2));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 j(long j) {
        return new C23930(C18991.i0(j));
    }

    @Override // l.AbstractC16874
    public final InterfaceC17579 m() {
        return new C23930(C18991.X(C18991.g0(AbstractC23225.a())));
    }

    @Override // l.InterfaceC21233
    public final InterfaceC17579 E(InterfaceC21584 interfaceC21584) {
        if (interfaceC21584 instanceof C23930) {
            return (C23930) interfaceC21584;
        }
        return new C23930(C18991.X(interfaceC21584));
    }

    @Override // l.InterfaceC21233
    public final boolean S(long j) {
        return C7122.c.S(j + 1911);
    }

    @Override // l.InterfaceC21233
    public final int z(InterfaceC17705 interfaceC17705, int i) {
        if (interfaceC17705 instanceof EnumC2056) {
            return interfaceC17705 == EnumC2056.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // l.InterfaceC21233
    public final List x() {
        return AbstractC1726.B(EnumC2056.values());
    }

    @Override // l.InterfaceC21233
    public final C1828 v(EnumC18762 enumC18762) {
        int i = AbstractC0645.a[enumC18762.ordinal()];
        if (i == 1) {
            C1828 c1828 = EnumC18762.PROLEPTIC_MONTH.b;
            return C1828.f(c1828.a - 22932, c1828.d - 22932);
        }
        if (i == 2) {
            C1828 c1829 = EnumC18762.YEAR.b;
            return C1828.g(1L, c1829.d - 1911, (-c1829.a) + 1912);
        }
        if (i != 3) {
            return enumC18762.b;
        }
        C1828 c18210 = EnumC18762.YEAR.b;
        return C1828.f(c18210.a - 1911, c18210.d - 1911);
    }

    @Override // l.AbstractC16874, l.InterfaceC21233
    public final InterfaceC17579 O(Map map, EnumC5481 enumC5481) {
        return (C23930) super.O(map, enumC5481);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC21233
    public final InterfaceC20402 P(C18285 c18285, AbstractC9114 abstractC9114) {
        return C22645.W(this, c18285, abstractC9114);
    }

    public Object writeReplace() {
        return new C3467((byte) 1, this);
    }
}
