package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C2612 implements InterfaceC9323 {
    @Override // l.InterfaceC9323
    /* JADX INFO: renamed from: ۙ */
    public final void mo2173(Intent intent, Bundle bundle) {
        InterfaceC19020 interfaceC19020M48149 = C21084.m48147().m48149(11101);
        if (interfaceC19020M48149 == null) {
            C21587.m49116("AuthActionHandler", "handleActionAuth listener is null");
            return;
        }
        if (intent == null) {
            C21587.m49116("AuthActionHandler", "handleActionAuth intent null");
            interfaceC19020M48149.mo2047(new C1121(-6, "无法解析回调数据：intent数据为空", "无法解析回调数据：intent数据为空"));
            return;
        }
        int intExtra = intent.getIntExtra("key_auth_result_code", Integer.MIN_VALUE);
        C21587.m49113("AuthActionHandler", "handleActionAuth resultCode: " + intExtra);
        if (intExtra != -1) {
            if (intExtra != 0) {
                interfaceC19020M48149.mo2047(new C1121(-6, C13645.m33382(intExtra, "无法解析回调数据：resultCode="), C13645.m33382(intExtra, "无法解析回调数据：resultCode=")));
                return;
            } else {
                interfaceC19020M48149.mo2046();
                return;
            }
        }
        Bundle bundleExtra = intent.getBundleExtra("key_auth_result_data");
        if (bundleExtra == null) {
            C21587.m49116("AuthActionHandler", "handleActionAuth resultOk but data is null");
            interfaceC19020M48149.mo2047(new C1121(-6, "无法解析回调数据：data为空", "无法解析回调数据：data为空"));
            return;
        }
        try {
            String string = bundleExtra.getString("key_response");
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                String strOptString = jSONObject.optString("openid");
                String strOptString2 = jSONObject.optString("access_token");
                String strOptString3 = jSONObject.optString("proxy_code");
                long jOptLong = jSONObject.optLong("proxy_expires_in");
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                    C21587.m49113("AuthActionHandler", "--checkAuthJsonDataValid--openid and token not empty, setResult ACTIVITY_OK");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    C21587.m49114("AuthActionHandler", "--checkAuthJsonDataValid--openid or token is empty, setResult ACTIVITY_CANCEL");
                } else {
                    C21587.m49113("AuthActionHandler", "--checkAuthJsonDataValid--proxy_code and proxy_expires_in are valid");
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_action", "action_login");
                intent2.putExtras(bundleExtra);
                C21084.m48147().getClass();
                C21084.m48148(intent2, interfaceC19020M48149);
                return;
            }
        } catch (Exception e) {
            C21587.m49116("AuthActionHandler", "--checkAuthJsonDataValid--parse response failed");
            C21587.m49112("AuthActionHandler", "--checkAuthJsonDataValid--parse response exception", e);
        }
        C21587.m49116("AuthActionHandler", "handleActionAuth resultOk but data is invalid");
        interfaceC19020M48149.mo2047(new C1121(-6, "无法解析回调数据：data解析异常", "无法解析回调数据：data解析异常"));
    }
}
