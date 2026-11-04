package l;

import java.util.HashMap;

/* JADX INFO: renamed from: l.ۗ᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99JQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C3724 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f12803;

    static {
        HashMap map = new HashMap();
        f12803 = map;
        map.put("DES/ECB/NoPadding", new C25354());
        map.put("RC4", new C17894());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC7233 m12123() {
        InterfaceC15436 interfaceC15436 = (InterfaceC15436) f12803.get("RC4");
        if (interfaceC15436 == null) {
            throw new IllegalArgumentException("Unknown Cipher RC4");
        }
        return (InterfaceC7233) interfaceC15436.create();
    }
}
