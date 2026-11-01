package l;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l.۬ܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public class C13221 extends WebView {
    public C13221(Context context) {
        super(context);
        removeJavascriptInterface("searchBoxJavaBridge_");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C23099.m51113("openSDK_LOG.OpenWebView", "removeJSInterface");
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WebSettings settings = getSettings();
        if (settings == null) {
            return;
        }
        settings.setSavePassword(false);
        try {
            Method method = settings.getClass().getMethod("removeJavascriptInterface", String.class);
            if (method != null) {
                method.invoke(this, "searchBoxJavaBridge_");
                method.invoke(this, "accessibility");
                method.invoke(this, "accessibilityTraversal");
                C23099.m51113("openSDK_LOG.OpenWebView", "remove js interface");
            }
        } catch (Exception e) {
            C23099.m51115("openSDK_LOG.OpenWebView", "remove js interface.e:" + e.toString());
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        try {
            getSettings().setBuiltInZoomControls(true);
            getSettings().setDisplayZoomControls(false);
            setVisibility(8);
            C23099.m51113("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls");
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.OpenWebView", "-->OpenWebView.destroy setBuiltInZoomControls", e);
        }
        super.destroy();
    }
}
