package l;

import android.os.Build;
import com.alipay.sdk.m.u0.b;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: l.ۘܰᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: WB05 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4209 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final void m13458(String str) {
        C4209 c4209 = C18379.f59876;
        if (!C15243.m36589((Object) C18379.f59877, (Object) str) || C18379.f59874.m55199()) {
            C18379.f59877 = str;
            C18379.f59879.mo40348(new AtomicReference(str));
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static boolean m13460(String str) {
        C15243.m36590(str, "primaryPath");
        if (Build.VERSION.SDK_INT < 33 || !((!C14584.m35213() && (str.equalsIgnoreCase("Android/data") || str.equalsIgnoreCase("Android/obb"))) || str.equalsIgnoreCase("Android/data/".concat(C21576.m49092())) || str.equalsIgnoreCase("Android/obb/".concat(C21576.m49092())))) {
            return C18379.f59875.containsKey(str);
        }
        return true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m13459(String str) {
        C15243.m36590(str, b.d);
        if (str.length() > 1 && C0878.m3577(str)) {
            str = str.substring(0, str.length() - 1);
            C15243.m36591(str, "substring(...)");
        }
        C18379.f59878 = str;
    }
}
