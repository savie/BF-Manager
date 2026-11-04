package l;

import android.webkit.WebView;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܿۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C18274 extends C20095 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public String f59619;

    public C18274(WebView webView, long j, String str) {
        super(webView, j);
        this.f59619 = str;
    }

    @Override // l.C20095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo42433() {
        C21587.m49118("openSDK_LOG.SecureJsListener", "-->onComplete, result: null");
    }

    @Override // l.C20095
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo42435() {
        C21587.m49111("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // l.C20095
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo42434(String str) {
        C21587.m49118("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.c, !C14873.f48605 ? -4 : 0);
            jSONObject.put("sn", this.f64581);
            jSONObject.put(e.m, str);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        WebView webView = (WebView) this.f64580.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            String str2 = this.f59619;
            stringBuffer.append(str2);
            stringBuffer.append("){");
            stringBuffer.append(str2);
            stringBuffer.append(MotionUtils.EASING_TYPE_FORMAT_START);
            stringBuffer.append(string);
            stringBuffer.append(")}");
            String string2 = stringBuffer.toString();
            C21587.m49118("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string2);
            webView.loadUrl(string2);
        }
    }
}
