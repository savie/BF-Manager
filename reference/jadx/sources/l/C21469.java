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

/* JADX INFO: renamed from: l.᩸ۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: E72G */
/* JADX INFO: loaded from: classes4.dex */
public final class C21469 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ActivityC10181 f69782;

    public C21469(ActivityC10181 activityC10181) {
        this.f69782 = activityC10181;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return ActivityC10181.m25918(this.f69782, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (!webResourceRequest.isForMainFrame()) {
            return false;
        }
        Uri url = webResourceRequest.getUrl();
        ActivityC10181 activityC10181 = this.f69782;
        boolean zM25914 = activityC10181.m25914(url);
        if (!zM25914) {
            activityC10181.m25950(url);
            ActivityC10181.m25957(activityC10181, url);
        }
        return zM25914;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f69782.m25914(Uri.parse(str));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        ActivityC10181 activityC10181 = this.f69782;
        if (activityC10181.f34779 != null) {
            activityC10181.f34779.m49037();
        }
        if (activityC10181.f34773.f30176 >= 0) {
            webView.setBackgroundColor((activityC10181.m25915(str) && C16135.m38190(activityC10181)) ? Color.rgb(13, 17, 23) : -1);
        }
        Uri uri = str == null ? null : Uri.parse(str);
        activityC10181.m25950(uri);
        ActivityC10181.m25957(activityC10181, uri);
        activityC10181.m25922(0, true);
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        ActivityC10181.m25937(this.f69782, webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        ActivityC10181 activityC10181 = this.f69782;
        ActivityC10181.m25937(activityC10181, webView, str);
        activityC10181.m25951(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ActivityC10181 activityC10181 = this.f69782;
        activityC10181.m25922(100, false);
        activityC10181.m25910();
        activityC10181.m25951(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (webResourceRequest.isForMainFrame()) {
            ActivityC10181 activityC10181 = this.f69782;
            activityC10181.m25916();
            ActivityC10181.m25913(activityC10181, webResourceRequest.getUrl());
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        ActivityC10181 activityC10181 = this.f69782;
        activityC10181.m25916();
        ActivityC10181.m25913(activityC10181, str2 == null ? null : Uri.parse(str2));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        if (webResourceRequest.isForMainFrame()) {
            this.f69782.m25916();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f69782.m25916();
        sslErrorHandler.cancel();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        ViewGroup viewGroup = (ViewGroup) webView.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(webView);
        }
        webView.destroy();
        ActivityC10181 activityC10181 = this.f69782;
        if (activityC10181.f34791 == webView) {
            activityC10181.f34791 = null;
        }
        activityC10181.m25916();
        C15829.m37611(R.string.MT_Protector);
        activityC10181.finish();
        return true;
    }
}
