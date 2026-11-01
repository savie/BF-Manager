package l;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܿ᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public class C17599 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f55937;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f55938;

    public C17599(WebView webView, long j) {
        this.f55937 = new WeakReference(webView);
        this.f55938 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo40918() {
        WebView webView = (WebView) this.f55937.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f55938 + ",{'r':0,'result':'undefined'});");
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo40920() {
        WebView webView = (WebView) this.f55937.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f55938 + ",{'r':1,'result':'no such method'})");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo40919(String str) {
        WebView webView = (WebView) this.f55937.get();
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }
}
