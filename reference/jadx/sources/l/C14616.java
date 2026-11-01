package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܳܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: PAJ1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14616 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f47825;

    static {
        HashMap map = new HashMap();
        f47825 = map;
        map.put("local", new C23590(1));
        map.put("zip", new C13688(2));
        map.put("tar", new C21051(2));
        map.put("compress", new C7459(1));
        map.put("archive", new C23788(0));
        map.put(b.k, new C1443(3));
        map.put("payload", new C1533(1));
        map.put("trash", new C18834(1));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m35095(String str) {
        if (!f47825.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in StatelessVisitor.Generator: ".concat(str));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC9677 m35094(byte[] bArr, boolean z) {
        C17367 c17367 = new C17367(bArr);
        Function function = (Function) f47825.get(c17367.m40458());
        if (function == null) {
            throw new RuntimeException();
        }
        AbstractC9677 abstractC9677 = (AbstractC9677) function.apply(c17367);
        if (z) {
            abstractC9677.f32622 = true;
        }
        return abstractC9677;
    }
}
