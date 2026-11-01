package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۢۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C9324 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f31646;

    static {
        HashMap map = new HashMap();
        f31646 = map;
        map.put("DES/ECB/NoPadding", new C5795());
        map.put("RC4", new C23435());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7912 m23969() {
        InterfaceC0337 interfaceC0337 = (InterfaceC0337) f31646.get("RC4");
        if (interfaceC0337 == null) {
            throw new IllegalArgumentException("Unknown Cipher RC4");
        }
        return (InterfaceC7912) interfaceC0337.create();
    }
}
