package l;

import android.os.Build;
import com.alipay.sdk.m.u0.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.֡۟ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0262 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m1761(String str) {
        C0262 c0262 = C17196.f54822;
        if (!C13465.m32965((Object) C17196.f54826, (Object) str) || C17196.f54824.m50802()) {
            C17196.f54826 = str;
            C17196.f54827.mo23641(new AtomicReference(str));
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static boolean m1763(String str) {
        C13465.m32966(str, "primaryPath");
        if (Build.VERSION.SDK_INT < 33 || !((!C5553.m15303() && (str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb"))) || str.equalsIgnoreCase("Android/data/".concat(C16737.m39293())) || str.equalsIgnoreCase("Android/obb/".concat(C16737.m39293())))) {
            return C17196.f54825.containsKey(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m1762(String str) {
        C13465.m32966(str, b.d);
        if (str.length() > 1 && C12529.m31137(str)) {
            str = str.substring(0, str.length() - 1);
            C13465.m32967(str, "substring(...)");
        }
        C17196.f54823 = str;
    }
}
