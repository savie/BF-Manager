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

/* JADX INFO: renamed from: l.ۛ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C5917 extends WebViewClient {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ a f20174;

    public C5917(a aVar) {
        this.f20174 = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri uri;
        C23099.m51107("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
        boolean zStartsWith = str.startsWith("auth://browser");
        a aVar = this.f20174;
        if (zStartsWith) {
            JSONObject jSONObjectM8433 = C2761.m8433(str);
            aVar.f871 = a.m910(aVar);
            if (!aVar.f871) {
                if (jSONObjectM8433.optString("fail_cb", null) != null) {
                    aVar.m917(jSONObjectM8433.optString("fail_cb"));
                    return true;
                }
                if (jSONObjectM8433.optInt("fall_to_wv") == 1) {
                    a.m909(aVar, aVar.f881.indexOf("?") > -1 ? com.alipay.sdk.m.w.a.p : "?");
                    a.m909(aVar, "browser_error=1");
                    if (aVar.f880 != null) {
                        aVar.f880.loadUrl(aVar.f881);
                        return true;
                    }
                } else {
                    String strOptString = jSONObjectM8433.optString("redir", null);
                    if (strOptString != null && aVar.f880 != null) {
                        aVar.f880.loadUrl(strOptString);
                        return true;
                    }
                }
            }
        } else {
            if (str.startsWith("auth://tauth.qq.com/")) {
                aVar.f884.mo16215(C2761.m8433(str));
                aVar.dismiss();
                return true;
            }
            if (str.startsWith("auth://cancel")) {
                aVar.f884.mo16213();
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
                    aVar.f869.startActivity(intent);
                    return true;
                } catch (Exception e) {
                    C23099.m51111("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e);
                    return true;
                }
            }
            try {
                if (str.startsWith("auth://progress")) {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (!pathSegments.isEmpty()) {
                        int iIntValue = Integer.valueOf(pathSegments.get(0)).intValue();
                        if (iIntValue == 0) {
                            aVar.f874.setVisibility(8);
                            if (aVar.f880 != null) {
                                aVar.f880.setVisibility(0);
                                return true;
                            }
                        } else if (iIntValue == 1) {
                            aVar.f874.setVisibility(0);
                            return true;
                        }
                    }
                } else if (!str.startsWith("auth://onLoginSubmit")) {
                    if (!aVar.f875.mo15127(aVar.f880, str)) {
                        C23099.m51113("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                        return false;
                    }
                } else {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        aVar.f877 = pathSegments2.get(0);
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
        C23099.m51113("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
        a aVar = this.f20174;
        if (!C2761.m8429(aVar.f869)) {
            aVar.f884.mo16214(new C8407(9001, "当前网络不可用，请稍后重试！", str2));
            aVar.dismiss();
            return;
        }
        if (!aVar.f879.startsWith("https://imgcache.qq.com/ptlogin/static/qzsjump.html?")) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - aVar.f870;
            if (aVar.f872 >= 1 || jElapsedRealtime >= aVar.f873) {
                if (aVar.f880 != null) {
                    aVar.f880.loadUrl(a.m913(aVar));
                    return;
                }
                return;
            } else {
                a.m914(aVar);
                aVar.f882.postDelayed(new RunnableC17206(this), 500L);
                return;
            }
        }
        aVar.f884.mo16214(new C8407(i, str, str2));
        aVar.dismiss();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        C23099.m51107("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
        super.onPageStarted(webView, str, bitmap);
        a aVar = this.f20174;
        aVar.f874.setVisibility(0);
        aVar.f870 = SystemClock.elapsedRealtime();
        if (!TextUtils.isEmpty(aVar.f879)) {
            aVar.f882.removeCallbacks((Runnable) aVar.f885.remove(aVar.f879));
        }
        aVar.f879 = str;
        RunnableC14385 runnableC14385 = new RunnableC14385(aVar, aVar.f879);
        aVar.f885.put(str, runnableC14385);
        aVar.f882.postDelayed(runnableC14385, 120000L);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        C23099.m51107("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
        a aVar = this.f20174;
        aVar.f874.setVisibility(8);
        if (aVar.f880 != null) {
            aVar.f880.setVisibility(0);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        aVar.f882.removeCallbacks((Runnable) aVar.f885.remove(str));
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(8)
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        try {
            C23099.m51115("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
        } catch (Throwable unused) {
            C23099.m51115("openSDK_LOG.AuthDialog", "-->onReceivedSslError 请求不合法，请检查手机安全设置，如系统时间、代理等");
        }
        sslErrorHandler.cancel();
    }
}
