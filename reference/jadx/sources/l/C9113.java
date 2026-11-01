package l;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۡ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C9113 implements InterfaceC19696 {
    @Override // l.InterfaceC19696
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo23453(Intent intent, Bundle bundle) {
        InterfaceC18284 interfaceC18284M51289 = C23245.m51287().m51289(11101);
        if (interfaceC18284M51289 == null) {
            C23099.m51115("AuthActionHandler", "handleActionAuth listener is null");
            return;
        }
        if (intent == null) {
            C23099.m51115("AuthActionHandler", "handleActionAuth intent null");
            interfaceC18284M51289.mo16214(new C8407(-6, "无法解析回调数据：intent数据为空", "无法解析回调数据：intent数据为空"));
            return;
        }
        int intExtra = intent.getIntExtra("key_auth_result_code", Integer.MIN_VALUE);
        C23099.m51113("AuthActionHandler", "handleActionAuth resultCode: " + intExtra);
        if (intExtra != -1) {
            if (intExtra != 0) {
                interfaceC18284M51289.mo16214(new C8407(-6, C8479.m22141(intExtra, "无法解析回调数据：resultCode="), C8479.m22141(intExtra, "无法解析回调数据：resultCode=")));
                return;
            } else {
                interfaceC18284M51289.mo16213();
                return;
            }
        }
        Bundle bundleExtra = intent.getBundleExtra("key_auth_result_data");
        if (bundleExtra == null) {
            C23099.m51115("AuthActionHandler", "handleActionAuth resultOk but data is null");
            interfaceC18284M51289.mo16214(new C8407(-6, "无法解析回调数据：data为空", "无法解析回调数据：data为空"));
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
                    C23099.m51113("AuthActionHandler", "--checkAuthJsonDataValid--openid and token not empty, setResult ACTIVITY_OK");
                } else if (TextUtils.isEmpty(strOptString3) || jOptLong == 0) {
                    C23099.m51112("AuthActionHandler", "--checkAuthJsonDataValid--openid or token is empty, setResult ACTIVITY_CANCEL");
                } else {
                    C23099.m51113("AuthActionHandler", "--checkAuthJsonDataValid--proxy_code and proxy_expires_in are valid");
                }
                Intent intent2 = new Intent();
                intent2.putExtra("key_action", "action_login");
                intent2.putExtras(bundleExtra);
                C23245.m51287().getClass();
                C23245.m51288(intent2, interfaceC18284M51289);
                return;
            }
        } catch (Exception e) {
            C23099.m51115("AuthActionHandler", "--checkAuthJsonDataValid--parse response failed");
            C23099.m51111("AuthActionHandler", "--checkAuthJsonDataValid--parse response exception", e);
        }
        C23099.m51115("AuthActionHandler", "handleActionAuth resultOk but data is invalid");
        interfaceC18284M51289.mo16214(new C8407(-6, "无法解析回调数据：data解析异常", "无法解析回调数据：data解析异常"));
    }
}
