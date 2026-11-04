package l;

import android.webkit.WebView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ᩴ᩷᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public class C20095 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public WeakReference f64580;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f64581;

    public C20095(WebView webView, long j) {
        this.f64580 = new WeakReference(webView);
        this.f64581 = j;
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo42433() {
        WebView webView = (WebView) this.f64580.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f64581 + ",{'r':0,'result':'undefined'});");
    }

    /* JADX INFO: renamed from: ᩷ */
    public void mo42435() {
        WebView webView = (WebView) this.f64580.get();
        if (webView == null) {
            return;
        }
        webView.loadUrl("javascript:window.JsBridge&&JsBridge.callback(" + this.f64581 + ",{'r':1,'result':'no such method'})");
    }

    /* JADX INFO: renamed from: ۙ */
    public void mo42434(String str) {
        WebView webView = (WebView) this.f64580.get();
        if (webView != null) {
            webView.loadUrl("javascript:" + str);
        }
    }
}
