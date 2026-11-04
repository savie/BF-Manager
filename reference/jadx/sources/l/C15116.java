package l;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tencent.connect.auth.a;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܳۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15116 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f49329;

    public C15116(a aVar) {
        this.f49329 = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C21587.m49118("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
        boolean zStartsWith = str.startsWith("auth://browser");
        a aVar = this.f49329;
        if (zStartsWith) {
            JSONObject jSONObjectM47038 = C20512.m47038(str);
            aVar.f868 = a.m906(aVar);
            if (!aVar.f868) {
                if (jSONObjectM47038.optString("fail_cb", null) != null) {
                    aVar.m911(jSONObjectM47038.optString("fail_cb"));
                    return true;
                }
                if (jSONObjectM47038.optInt("fall_to_wv") == 1) {
                    a.m905(aVar, aVar.f869.indexOf("?") > -1 ? com.alipay.sdk.m.w.a.p : "?");
                    a.m905(aVar, "browser_error=1");
                    if (aVar.f860 != null) {
                        aVar.f860.loadUrl(aVar.f869);
                        return true;
                    }
                } else {
                    String strOptString = jSONObjectM47038.optString("redir", null);
                    if (strOptString != null && aVar.f860 != null) {
                        aVar.f860.loadUrl(strOptString);
                        return true;
                    }
                }
            }
        } else {
            if (str.startsWith("auth://tauth.qq.com/")) {
                aVar.f874.mo2048(C20512.m47038(str));
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://cancel")) {
                aVar.f874.mo2046();
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://close")) {
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("download://") || str.endsWith(".apk")) {
                try {
                    if (str.startsWith("download://")) {
                        uri = Uri.parse(Uri.decode(str.substring(11)));
                    } else {
                        uri = Uri.parse(Uri.decode(str));
                    }
                    Intent intent = new Intent("android.intent.action.VIEW", uri);
                    intent.addFlags(268435456);
                    aVar.f864.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    C21587.m49112("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                    return true;
                }
            }
            try {
                if (str.startsWith("auth://progress")) {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        int iIntValue = Integer.valueOf(pathSegments.get(0)).intValue();
                        if (iIntValue == 0) {
                            aVar.f866.setVisibility(8);
                            if (aVar.f860 != null) {
                                aVar.f860.setVisibility(0);
                                return true;
                            }
                        } else if (iIntValue == 1) {
                            aVar.f866.setVisibility(0);
                            return true;
                        }
                    }
                } else if (!str.startsWith("auth://onLoginSubmit")) {
                    if (!aVar.f862.mo47661(aVar.f860, str)) {
                        C21587.m49113("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                        return false;
                    }
                } else {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        aVar.f867 = pathSegments2.get(0);
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        C21587.m49113("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
        a aVar = this.f49329;
        if (!C20512.m47035(aVar.f864)) {
            aVar.f874.mo2047(new C1121(9001, "当前网络不可用，请稍后重试！", str2));
            aVar.dismiss();
            return;
        }
        if (!aVar.f875.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.f876;
            if (aVar.f861 >= 1 || jElapsedRealtime >= aVar.f873) {
                if (aVar.f860 != null) {
                    aVar.f860.loadUrl(a.m909(aVar));
                    return;
                }
                return;
            } else {
                a.m903(aVar);
                aVar.f858.postDelayed(new RunnableC19592(this), 500L);
                return;
            }
        }
        aVar.f874.mo2047(new C1121(i, str, str2));
        aVar.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C21587.m49118("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        a aVar = this.f49329;
        aVar.f866.setVisibility(0);
        aVar.f876 = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(aVar.f875)) {
            aVar.f858.removeCallbacks((Runnable) aVar.f870.remove(aVar.f875));
        }
        aVar.f875 = str;
        RunnableC1693 runnableC1693 = new RunnableC1693(aVar, aVar.f875);
        aVar.f870.put(str, runnableC1693);
        aVar.f858.postDelayed(runnableC1693, 120000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C21587.m49118("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
        a aVar = this.f49329;
        aVar.f866.setVisibility(8);
        if (aVar.f860 != null) {
            aVar.f860.setVisibility(0);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aVar.f858.removeCallbacks((Runnable) aVar.f870.remove(str));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            C21587.m49116("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
        } catch (Throwable unused) {
            C21587.m49116("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
        }
        sslErrorHandler.cancel();
    }
}
