package l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.tencent.open.TDialog;

/* JADX INFO: renamed from: l.᩸᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C21833 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TDialog f70886;

    public C21833(TDialog tDialog) {
        this.f70886 = tDialog;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C23099.m51107("openSDK_LOG.TDialog", "Redirect URL: " + str);
        C9694 c9694M24660 = C9694.m24660();
        TDialog tDialog = this.f70886;
        if (str.startsWith(c9694M24660.m24661((Context) tDialog.f898.get(), "auth://tauth.qq.com/"))) {
            tDialog.f901.mo16215(C2761.m8433(str));
            if (tDialog.isShowing()) {
                tDialog.dismiss();
                return true;
            }
        } else if (str.startsWith("auth://cancel")) {
            tDialog.f901.mo16213();
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
                if (tDialog.f898 != null && tDialog.f898.get() != null) {
                    ((Context) tDialog.f898.get()).startActivity(intent);
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
        TDialog tDialog = this.f70886;
        tDialog.f901.mo16214(new C8407(i, str, str2));
        if (tDialog.f898 != null && tDialog.f898.get() != null) {
            Toast.makeText((Context) tDialog.f898.get(), "网络连接异常或系统错误", 0).show();
        }
        tDialog.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C23099.m51107("openSDK_LOG.TDialog", "Webview loading URL: " + str);
        super.onPageStarted(webView, str, bitmap);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        TDialog tDialog = this.f70886;
        if (tDialog.f900 != null) {
            tDialog.f900.setVisibility(0);
        }
    }
}
