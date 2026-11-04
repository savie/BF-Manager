package l;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: renamed from: l.᩵ۧܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A6IY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20526 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12321 f65744;

    public C20526(C12321 c12321) {
        this.f65744 = c12321;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f65744.m30728(false);
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        C12321 c12321 = this.f65744;
        if (c12321.f39594 || c12321.f39593) {
            return;
        }
        c12321.f39593 = true;
        webView.evaluateJavascript("(function(){try{localStorage.clear();sessionStorage.clear();return localStorage.length===0;}catch(e){return false;}})()", new ValueCallback() { // from class: l.ۗۧܳ
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                String str2 = (String) obj;
                C12321 c12322 = this.f10985.f65744;
                if (c12322.f39594) {
                    return;
                }
                if (!"true".equals(str2)) {
                    c12322.m30728(false);
                } else {
                    WebStorage.getInstance().deleteOrigin(c12322.f39599);
                    C12321.m30731(c12322);
                }
            }
        });
    }
}
