package l;

import android.webkit.WebView;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.y.o;
import com.google.android.material.motion.MotionUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23224 extends C17599 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public String f75354;

    public C23224(WebView webView, long j, String str) {
        super(webView, j);
        this.f75354 = str;
    }

    @Override // l.C17599
    /* JADX INFO: renamed from: ۙ */
    public final void mo40918() {
        C23099.m51107("openSDK_LOG.SecureJsListener", "-->onComplete, result: null");
    }

    @Override // l.C17599
    /* JADX INFO: renamed from: ܰ */
    public final void mo40920() {
        C23099.m51110("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    @Override // l.C17599
    /* JADX INFO: renamed from: ۙ */
    public final void mo40919(String str) {
        C23099.m51107("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(o.c, !C6870.f23161 ? -4 : 0);
            jSONObject.put("sn", this.f55938);
            jSONObject.put(e.m, str);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        WebView webView = (WebView) this.f55937.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:if(!!");
            String str2 = this.f75354;
            stringBuffer.append(str2);
            stringBuffer.append("){");
            stringBuffer.append(str2);
            stringBuffer.append(MotionUtils.EASING_TYPE_FORMAT_START);
            stringBuffer.append(string);
            stringBuffer.append(")}");
            String string2 = stringBuffer.toString();
            C23099.m51107("openSDK_LOG.SecureJsListener", "-->callback, callback: " + string2);
            webView.loadUrl(string2);
        }
    }
}
