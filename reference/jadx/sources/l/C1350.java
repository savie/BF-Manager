package l;

import android.webkit.WebSettings;
import android.webkit.WebView;

/* JADX INFO: renamed from: l.֨᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1350 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4756(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxJavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        WebSettings settings = webView.getSettings();
        if (settings != null) {
            try {
                settings.setSavePassword(false);
                settings.setAllowFileAccess(false);
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
            } catch (Exception e) {
                C23099.m51111("WebViewUtils", "Exception", e);
            }
            settings.setJavaScriptEnabled(true);
        }
    }
}
