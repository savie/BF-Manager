package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۨۙᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: U9KI */
/* JADX INFO: loaded from: classes3.dex */
public final class C11479 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f38647;

    static {
        HashMap map = new HashMap();
        f38647 = map;
        map.put("KDF/Counter/HMACSHA256", new C4422());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC19201 m28667() {
        InterfaceC0337 interfaceC0337 = (InterfaceC0337) f38647.get("KDF/Counter/HMACSHA256");
        if (interfaceC0337 == null) {
            throw new IllegalArgumentException("Unknown DerivationFunction KDF/Counter/HMACSHA256");
        }
        return (InterfaceC19201) interfaceC0337.create();
    }
}
