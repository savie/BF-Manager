package l;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: l.ۧ۬᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: H6ZH */
/* JADX INFO: loaded from: classes3.dex */
public final class C11646 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ int f37671 = 0;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f37672;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static final WeakHashMap f37673;

    static {
        Uri.parse("*");
        Uri.parse("");
        f37672 = true;
        f37673 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static PackageInfo m29275() {
        if (Build.VERSION.SDK_INT >= 26) {
            return C4189.m13370();
        }
        try {
            return m29280();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static PackageInfo m29280() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", null).invoke(null, null);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C1681 m29276(WebView webView) {
        if (C19580.f63143.mo27117() && f37672) {
            WeakHashMap weakHashMap = f37673;
            C1681 c1681 = (C1681) weakHashMap.get(webView);
            if (c1681 != null) {
                return c1681;
            }
            C1681 c1682 = new C1681(C5410.m16137().createWebView(webView));
            weakHashMap.put(webView, c1682);
            return c1682;
        }
        return new C1681(C5410.m16137().createWebView(webView));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29279(WebView webView, String str, Set set, C11021 c11021) {
        if (C19580.f63136.mo27117()) {
            m29276(webView).m6028(str, (String[]) set.toArray(new String[0]), c11021);
            return;
        }
        throw C19580.m45180();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m29278(WebView webView, String str) {
        if (C19580.f63136.mo27117()) {
            m29276(webView).m6027(str);
            return;
        }
        throw C19580.m45180();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C19105 m29277(WebView webView, String str, Set set) {
        if (C19580.f63144.mo27117()) {
            return m29276(webView).m6026(str, (String[]) set.toArray(new String[0]));
        }
        throw C19580.m45180();
    }
}
