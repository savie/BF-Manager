package l;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: l.۫֡ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12062 implements InterfaceC17705, Serializable {
    public static final C12062 d;
    public static final C12062[] e;
    public static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient C18991 b;
    public final transient String c;

    @Override // l.InterfaceC21584
    public final /* synthetic */ long G(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.d(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ Object T(C22935 c22935) {
        return AbstractC14884.f(this, c22935);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ boolean e(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.e(this, interfaceC11002);
    }

    @Override // l.InterfaceC21584
    public final /* synthetic */ int l(InterfaceC11002 interfaceC11002) {
        return AbstractC14884.c(this, interfaceC11002);
    }

    static {
        C12062 c12062 = new C12062(-1, C18991.h0(1868, 1, 1), "Meiji");
        d = c12062;
        e = new C12062[]{c12062, new C12062(0, C18991.h0(1912, 7, 30), "Taisho"), new C12062(1, C18991.h0(1926, 12, 25), "Showa"), new C12062(2, C18991.h0(1989, 1, 8), "Heisei"), new C12062(3, C18991.h0(2019, 5, 1), "Reiwa")};
    }

    public final C12062 k() {
        C12062[] c12062Arr = e;
        if (this == c12062Arr[c12062Arr.length - 1]) {
            return null;
        }
        return o(this.a + 1);
    }

    public C12062(int i, C18991 c18991, String str) {
        this.a = i;
        this.b = c18991;
        this.c = str;
    }

    public static C12062 o(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            C12062[] c12062Arr = e;
            if (i2 < c12062Arr.length) {
                return c12062Arr[i2];
            }
        }
        throw new C15464("Invalid era: " + i);
    }

    @Override // l.InterfaceC12413
    public final InterfaceC15235 s(InterfaceC15235 interfaceC15235) {
        return interfaceC15235.c(getValue(), EnumC18762.ERA);
    }

    public static C12062 j(C18991 c18991) {
        C12062 c12062;
        if (c18991.c0(C16295.d)) {
            throw new C15464("JapaneseDate before Meiji 6 are not supported");
        }
        int length = e.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            c12062 = e[length];
        } while (c18991.compareTo(c12062.b) < 0);
        return c12062;
    }

    @Override // l.InterfaceC17705
    public final int getValue() {
        return this.a;
    }

    @Override // l.InterfaceC21584
    public final C1828 n(InterfaceC11002 interfaceC11002) {
        EnumC18762 enumC18762 = EnumC18762.ERA;
        if (interfaceC11002 != enumC18762) {
            return AbstractC23702.d(this, interfaceC11002);
        }
        return C19823.c.v(enumC18762);
    }

    public final String toString() {
        return this.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C3467((byte) 5, this);
    }
}
