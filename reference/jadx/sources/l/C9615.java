package l;

import com.alipay.sdk.m.m.b;
import java.util.HashMap;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢ۬᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 969A */
/* JADX INFO: loaded from: classes3.dex */
public final class C9615 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final HashMap f32396;

    static {
        HashMap map = new HashMap();
        f32396 = map;
        map.put("local", new C16485(1));
        map.put("zip", new C3105(2));
        map.put("tar", new C23726(0));
        map.put("compress", new C22124(1));
        map.put("archive", new C14554(0));
        map.put(b.k, new C13315(1));
        map.put("payload", new C4141(1));
        map.put("trash", new C1852(0));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24522(String str) {
        if (!f32396.containsKey(str)) {
            throw new RuntimeException("Type has not been registered in FileVisitor.Generator: ".concat(str));
        }
        C14616.m35095(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static AbstractC11462 m24521(C17367 c17367) {
        Function function = (Function) f32396.get(c17367.m40458());
        if (function == null) {
            throw new RuntimeException();
        }
        return (AbstractC11462) function.apply(c17367);
    }
}
