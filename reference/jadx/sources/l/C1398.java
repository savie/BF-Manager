package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֨᩵ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes2.dex */
public final class C1398 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f4974;

    static {
        HashMap map = new HashMap();
        f4974 = map;
        map.put("local", new C10080(2));
        map.put("zip", new C4527(1));
        map.put("tar", new C3900(2));
        map.put("compress", new C19705(1));
        map.put("archive", new C0652(0));
        map.put(b.k, new C8110(0));
        map.put("payload", new C19297(0));
        map.put("trash", new C10346(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m5108(String str) {
        if (!f4974.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in FileVisitor.Generator: ".concat(str));
        }
        C18070.m42102(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC7364 m5107(C20348 c20348) {
        Function function = (Function) f4974.get(c20348.m46758());
        if (function == null) {
            throw new RuntimeException();
        }
        return (AbstractC7364) function.apply(c20348);
    }
}
