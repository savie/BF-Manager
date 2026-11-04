package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: l.᩶᩸ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C21592 extends AbstractC11895 implements Serializable {
    public static final C21592 c = new C21592();
    public static final long serialVersionUID = 2775954514031616474L;

    @Override // l.InterfaceC8912
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // l.InterfaceC8912
    public final String l() {
        return "buddhist";
    }

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // l.InterfaceC8912
    public final InterfaceC7421 v(int i) {
        if (i == 0) {
            return EnumC1455.BEFORE_BE;
        }
        if (i == 1) {
            return EnumC1455.BE;
        }
        throw new C21241("Invalid era: " + i);
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 I(int i, int i2, int i3) {
        return new C19354(C7816.of(i - 543, i2, i3));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 n(int i, int i2) {
        return new C19354(C7816.e0(i - 543, i2));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 h(long j) {
        return new C19354(C7816.d0(j));
    }

    @Override // l.AbstractC11895
    public final InterfaceC17116 j() {
        return new C19354(C7816.T(C7816.c0(AbstractC14527.a())));
    }

    @Override // l.InterfaceC8912
    public final InterfaceC17116 B(InterfaceC9437 interfaceC9437) {
        if (interfaceC9437 instanceof C19354) {
            return (C19354) interfaceC9437;
        }
        return new C19354(C7816.T(interfaceC9437));
    }

    @Override // l.InterfaceC8912
    public final boolean O(long j) {
        return C20012.c.O(j - 543);
    }

    @Override // l.InterfaceC8912
    public final int w(InterfaceC7421 interfaceC7421, int i) {
        if (interfaceC7421 instanceof EnumC1455) {
            return interfaceC7421 == EnumC1455.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    @Override // l.InterfaceC8912
    public final List u() {
        return AbstractC1758.B(EnumC1455.values());
    }

    @Override // l.InterfaceC8912
    public final C23545 s(EnumC8692 enumC8692) {
        int i = AbstractC4438.a[enumC8692.ordinal()];
        if (i == 1) {
            C23545 c23545 = EnumC8692.PROLEPTIC_MONTH.b;
            return C23545.f(c23545.a + 6516, c23545.d + 6516);
        }
        if (i == 2) {
            C23545 c23546 = EnumC8692.YEAR.b;
            return C23545.g(1L, (-(c23546.a + 543)) + 1, c23546.d + 543);
        }
        if (i != 3) {
            return enumC8692.b;
        }
        C23545 c23547 = EnumC8692.YEAR.b;
        return C23545.f(c23547.a + 543, c23547.d + 543);
    }

    @Override // l.AbstractC11895, l.InterfaceC8912
    public final InterfaceC17116 K(Map map, EnumC18520 enumC18520) {
        return (C19354) super.K(map, enumC18520);
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
