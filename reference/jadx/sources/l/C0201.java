package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.TDialog;

/* JADX INFO: renamed from: l.֡ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C0201 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f1339;

    public C0201(TDialog tDialog) {
        this.f1339 = tDialog;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C21587.m49118("openSDK_LOG.TDialog", "Redirect URL: " + str);
        C16782 c16782M39621 = C16782.m39621();
        TDialog tDialog = this.f1339;
        if (str.startsWith(c16782M39621.m39622((Context) tDialog.f893.get(), "auth://tauth.qq.com/"))) {
            tDialog.f890.mo2048(C20512.m47038(str));
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://cancel")) {
            tDialog.f890.mo2046();
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://close")) {
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("download://") || str.endsWith(".apk")) {
            try {
                if (str.startsWith("download://")) {
                    uri = Uri.parse(Uri.decode(str.substring(11)));
                } else {
                    uri = Uri.parse(Uri.decode(str));
                }
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.addFlags(268435456);
                if (tDialog.f893 != null && tDialog.f893.get() != null) {
                    ((Context) tDialog.f893.get()).startActivity(intent);
                }
            } catch (Exception unused) {
            }
        } else if (!str.startsWith("auth://progress")) {
            return false;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        TDialog tDialog = this.f1339;
        tDialog.f890.mo2047(new C1121(i, str, str2));
        if (tDialog.f893 != null && tDialog.f893.get() != null) {
            Toast.makeText((Context) tDialog.f893.get(), "网络连接异常或系统错误", 0).show();
        }
        tDialog.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C21587.m49118("openSDK_LOG.TDialog", "Webview loading URL: " + str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        TDialog tDialog = this.f1339;
        if (tDialog.f889 != null) {
            tDialog.f889.setVisibility(0);
        }
    }
}
