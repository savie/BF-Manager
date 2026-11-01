package l;

import com.alipay.sdk.m.b0.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.۫ۗ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C12146 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f40650;

    static {
        HashMap map = new HashMap();
        f40650 = map;
        map.put("AES/CCM/NoPadding", new C15674());
        map.put(a.f, new C0150());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC17789 m30219(String str) {
        InterfaceC0337 interfaceC0337 = (InterfaceC0337) f40650.get(str);
        if (interfaceC0337 != null) {
            return (InterfaceC17789) interfaceC0337.create();
        }
        throw new IllegalArgumentException(C0252.m1693("Unknown AEADCipher ", str));
    }
}
