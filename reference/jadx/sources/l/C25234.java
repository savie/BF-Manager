package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.᩻ᩴۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C25234 implements InterfaceC7421, Serializable {
    public static final C25234 d;
    public static final C25234[] e;
    public static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient C7816 b;
    public final transient String c;

    @Override // l.InterfaceC9437
    public final /* synthetic */ long C(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.d(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ Object P(C14435 c14435) {
        return AbstractC2946.f(this, c14435);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ boolean d(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.e(this, interfaceC16831);
    }

    @Override // l.InterfaceC9437
    public final /* synthetic */ int i(InterfaceC16831 interfaceC16831) {
        return AbstractC2946.c(this, interfaceC16831);
    }

    static {
        C25234 c25234 = new C25234(-1, C7816.of(1868, 1, 1), "Meiji");
        d = c25234;
        e = new C25234[]{c25234, new C25234(0, C7816.of(1912, 7, 30), "Taisho"), new C25234(1, C7816.of(1926, 12, 25), "Showa"), new C25234(2, C7816.of(1989, 1, 8), "Heisei"), new C25234(3, C7816.of(2019, 5, 1), "Reiwa")};
    }

    public final C25234 l() {
        C25234[] c25234Arr = e;
        if (this == c25234Arr[c25234Arr.length - 1]) {
            return null;
        }
        return m(this.a + 1);
    }

    public C25234(int i, C7816 c7816, String str) {
        this.a = i;
        this.b = c7816;
        this.c = str;
    }

    public static C25234 m(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C25234[] c25234Arr = e;
            if (i2 < c25234Arr.length) {
                return c25234Arr[i2];
            }
        }
        throw new C21241("Invalid era: " + i);
    }

    @Override // l.InterfaceC1916
    public final InterfaceC1235 p(InterfaceC1235 interfaceC1235) {
        return interfaceC1235.b(getValue(), EnumC8692.ERA);
    }

    public static C25234 h(C7816 c7816) {
        C25234 c25234;
        if (c7816.Y(C11807.d)) {
            throw new C21241("JapaneseDate before Meiji 6 are not supported");
        }
        int length = e.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            c25234 = e[length];
        } while (c7816.compareTo(c25234.b) < 0);
        return c25234;
    }

    @Override // l.InterfaceC7421
    public final int getValue() {
        return this.a;
    }

    @Override // l.InterfaceC9437
    public final C23545 k(InterfaceC16831 interfaceC16831) {
        EnumC8692 enumC8692 = EnumC8692.ERA;
        if (interfaceC16831 != enumC8692) {
            return AbstractC17577.d(this, interfaceC16831);
        }
        return C5842.c.s(enumC8692);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C6676((byte) 5, this);
    }
}
