package l;

import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: renamed from: l.ۚۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes2.dex */
public final class C5338 extends WebChromeClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f18762;

    public C5338(ActivityC3846 activityC3846) {
        this.f18762 = activityC3846;
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        String url = webView.getUrl();
        ActivityC3846 activityC3846 = this.f18762;
        if (activityC3846.m12471(url)) {
            activityC3846.setTitle(ActivityC3846.m12453(activityC3846, webView.getUrl()));
        } else {
            if (str == null || str.trim().isEmpty()) {
                return;
            }
            activityC3846.setTitle(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        this.f18762.m12460(i, i < 100);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        ActivityC3846 activityC3846 = this.f18762;
        ActivityC3846.m12414(activityC3846, ActivityC3846.m12444(activityC3846, str), str2, jsResult, false);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        ActivityC3846 activityC3846 = this.f18762;
        ActivityC3846.m12414(activityC3846, ActivityC3846.m12444(activityC3846, str), str2, jsResult, true);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        ActivityC3846 activityC3846 = this.f18762;
        if (activityC3846.f13130 != null && activityC3846.f13130.m25572(str, str2, jsPromptResult)) {
            return true;
        }
        ActivityC3846.m12415(activityC3846, ActivityC3846.m12444(activityC3846, str), str2, str3, jsPromptResult);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ActivityC3846.m12411(this.f18762, valueCallback, fileChooserParams);
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        permissionRequest.deny();
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        callback.invoke(str, false, false);
    }
}
