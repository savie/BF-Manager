package l;

import com.alipay.sdk.m.b0.a;
import java.util.HashMap;

/* JADX INFO: renamed from: l.֫᩹ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: G9IQ */
/* JADX INFO: loaded from: classes2.dex */
public final class C2233 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f7320;

    static {
        HashMap map = new HashMap();
        f7320 = map;
        map.put("AES/CCM/NoPadding", new C20132());
        map.put(a.f, new C13419());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static InterfaceC2758 m7620(String str) {
        InterfaceC15436 interfaceC15436 = (InterfaceC15436) f7320.get(str);
        if (interfaceC15436 != null) {
            return (InterfaceC2758) interfaceC15436.create();
        }
        throw new IllegalArgumentException(C25272.m56409("Unknown AEADCipher ", str));
    }
}
