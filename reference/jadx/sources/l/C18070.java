package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܿۘܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18070 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f59151;

    static {
        HashMap map = new HashMap();
        f59151 = map;
        map.put("local", new C0652(1));
        map.put("zip", new C8110(1));
        map.put("tar", new C19297(1));
        map.put("compress", new C10346(1));
        map.put("archive", new C24057(2));
        map.put(b.k, new C6376(1));
        map.put("payload", new C17205(1));
        map.put("trash", new C14359(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m42102(String str) {
        if (!f59151.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in StatelessVisitor.Generator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC7629 m42101(byte[] bArr, boolean z) {
        C20348 c20348 = new C20348(bArr);
        Function function = (Function) f59151.get(c20348.m46758());
        if (function == null) {
            throw new RuntimeException();
        }
        AbstractC7629 abstractC7629 = (AbstractC7629) function.apply(c20348);
        if (z) {
            abstractC7629.f25172 = true;
        }
        return abstractC7629;
    }
}
