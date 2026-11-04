package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩻᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C25322 extends AbstractC11895 implements Serializable {
    public static final C25322 c = new C25322();
    public static final long serialVersionUID = 1039765215346859963L;

    @Override // l.InterfaceC8912
    public final String getId() {
        return "Minguo";
    }

    @Override // l.InterfaceC8912
    public final String l() {
        return "roc";
    }

    @Override // l.InterfaceC8912
    public final InterfaceC7421 v(int i) {
        if (i == 0) {
            return EnumC20846.BEFORE_ROC;
        }
        if (i == 1) {
            return EnumC20846.ROC;
        }
        throw new C21241("Invalid era: " + i);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 I(int i, int i2, int i3) {
        return new C23830(C7816.of(i + 1911, i2, i3));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 n(int i, int i2) {
        return new C23830(C7816.e0(i + 1911, i2));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 h(long j) {
        return new C23830(C7816.d0(j));
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 j() {
        return new C23830(C7816.T(C7816.c0(AbstractC14527.a())));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 B(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C23830) {
            return (C23830) interfaceC9437;
        }
        return new C23830(C7816.T(interfaceC9437));
    }

    @Override // l.InterfaceC8912
    public final boolean O(long j) {
        return C20012.c.O(j + 1911);
    }

    @Override // l.InterfaceC8912
    public final int w(InterfaceC7421 interfaceC7421, int i) {
        if (interfaceC7421 instanceof EnumC20846) {
            return interfaceC7421 == EnumC20846.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    @Override // l.InterfaceC8912
    public final List u() {
        return AbstractC1758.B(EnumC20846.values());
    }

    @Override // l.InterfaceC8912
    public final C23545 s(EnumC8692 enumC8692) {
        int i = AbstractC2201.a[enumC8692.ordinal()];
        if (i == 1) {
            C23545 c23545 = EnumC8692.PROLEPTIC_MONTH.b;
            return C23545.f(c23545.a - 22932, c23545.d - 22932);
        }
        if (i == 2) {
            C23545 c23546 = EnumC8692.YEAR.b;
            return C23545.g(1L, c23546.d - 1911, (-c23546.a) + 1912);
        }
        if (i != 3) {
            return enumC8692.b;
        }
        C23545 c23547 = EnumC8692.YEAR.b;
        return C23545.f(c23547.a - 1911, c23547.d - 1911);
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC17116 K(Map map, EnumC18520 enumC18520) {
        return (C23830) super.K(map, enumC18520);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // l.InterfaceC8912
    public final InterfaceC5930 L(C0358 c0358, AbstractC22338 abstractC22338) {
        return C9657.S(this, c0358, abstractC22338);
    }

    public Object writeReplace() {
        return new C6676((byte) 1, this);
    }
}
