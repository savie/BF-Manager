package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.᩺᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes.dex */
public final class C24608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f79714;

    static {
        HashMap map = new HashMap();
        f79714 = map;
        map.put("KDF/Counter/HMACSHA256", new C12673());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC13944 m54938() {
        InterfaceC15436 interfaceC15436 = (InterfaceC15436) f79714.get("KDF/Counter/HMACSHA256");
        if (interfaceC15436 == null) {
            throw new IllegalArgumentException("Unknown DerivationFunction KDF/Counter/HMACSHA256");
        }
        return (InterfaceC13944) interfaceC15436.create();
    }
}
