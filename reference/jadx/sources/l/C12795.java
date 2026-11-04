package l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.۫ۖ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C12795 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC3846 f40926;

    public C12795(ActivityC3846 activityC3846) {
        this.f40926 = activityC3846;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        ActivityC3846 activityC3846 = this.f40926;
        if (activityC3846.f13129 != null) {
            activityC3846.f13129.m40556(webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.isForMainFrame());
        }
        return ActivityC3846.m12393(activityC3846, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        ActivityC3846 activityC3846 = this.f40926;
        boolean zM12455 = activityC3846.m12455(url);
        if (!zM12455) {
            activityC3846.m12442();
            activityC3846.m12468(url);
            ActivityC3846.m12462(activityC3846, url);
        }
        return zM12455;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri = Uri.parse(str);
        ActivityC3846 activityC3846 = this.f40926;
        boolean zM12455 = activityC3846.m12455(uri);
        if (!zM12455) {
            activityC3846.m12442();
        }
        return zM12455;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ActivityC3846 activityC3846 = this.f40926;
        activityC3846.f13145.m19026();
        if (activityC3846.f13108 != null) {
            activityC3846.f13108.m26212();
        }
        activityC3846.f13109 = str;
        ActivityC3846.m12427(activityC3846);
        if (activityC3846.f13129 != null) {
            activityC3846.f13129.m40558();
        }
        if (activityC3846.f13130 != null) {
            activityC3846.f13130.m25573();
        }
        if (activityC3846.f13138 != null) {
            C23238.m52216(activityC3846.f13138, null);
        }
        activityC3846.f13127 = new C17270();
        ActivityC3846.m12451(activityC3846);
        if (activityC3846.f13142 != null) {
            activityC3846.f13142.m34682();
        }
        if (activityC3846.f13140.f77610 >= 0) {
            webView.setBackgroundColor((activityC3846.m12471(str) && C23434.m52629(activityC3846)) ? Color.rgb(13, 17, 23) : -1);
        }
        Uri uri = str != null ? Uri.parse(str) : null;
        activityC3846.m12468(uri);
        ActivityC3846.m12462(activityC3846, uri);
        activityC3846.m12460(0, true);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        ActivityC3846.m12463(this.f40926, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        ActivityC3846 activityC3846 = this.f40926;
        ActivityC3846.m12434(activityC3846, webView, str);
        ActivityC3846.m12463(activityC3846, webView, str);
        activityC3846.m12432(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ActivityC3846 activityC3846 = this.f40926;
        ActivityC3846.m12434(activityC3846, webView, str);
        activityC3846.m12460(100, false);
        activityC3846.m12438();
        activityC3846.m12432(str);
        activityC3846.f13145.m19023();
        if (activityC3846.f13130 != null) {
            activityC3846.f13130.m25571(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC3846 activityC3846 = this.f40926;
            activityC3846.f13109 = null;
            activityC3846.f13117 = null;
            activityC3846.m12456();
            ActivityC3846.m12470(activityC3846, webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ActivityC3846 activityC3846 = this.f40926;
        activityC3846.f13109 = null;
        activityC3846.f13117 = null;
        activityC3846.m12456();
        ActivityC3846.m12470(activityC3846, str2 != null ? Uri.parse(str2) : null);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC3846 activityC3846 = this.f40926;
            activityC3846.f13109 = null;
            activityC3846.f13117 = null;
            activityC3846.m12456();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f40926.m12456();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ActivityC3846 activityC3846 = this.f40926;
        activityC3846.f13118 = true;
        if (activityC3846.f13108 != null) {
            activityC3846.f13108.m26204();
        }
        ActivityC3846.m12451(activityC3846);
        if (activityC3846.f13129 != null) {
            activityC3846.f13129.m40555();
        }
        if (activityC3846.f13130 != null) {
            activityC3846.f13130.m25570();
        }
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        if (activityC3846.f13116 == webView) {
            activityC3846.f13116 = null;
        }
        activityC3846.m12456();
        C22673.m51152(R.string.MT_Protector);
        activityC3846.finish();
        return true;
    }
}
