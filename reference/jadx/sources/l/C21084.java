package l;

import android.content.Intent;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩶ۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes5.dex */
public final class C21084 {

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C21084 f67357;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f67358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C21084 m48147() {
        if (f67357 == null) {
            C21084 c21084 = new C21084();
            Map mapSynchronizedMap = C4681.synchronizedMap(new HashMap());
            c21084.f67358 = mapSynchronizedMap;
            if (mapSynchronizedMap == null) {
                c21084.f67358 = C4681.synchronizedMap(new HashMap());
            }
            f67357 = c21084;
        }
        return f67357;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48151(InterfaceC19020 interfaceC19020) {
        String strM41146 = C17528.m41146(11101);
        if (strM41146 == null) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=11101");
            return;
        }
        synchronized (this.f67358) {
            Map map = this.f67358;
            C14370 c14370 = new C14370();
            c14370.f45302 = interfaceC19020;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19020 m48149(int i) {
        String strM41146 = C17528.m41146(i);
        if (strM41146 == null) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            return null;
        }
        return m48150(strM41146);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC19020 m48150(String str) {
        C14370 c14370;
        if (str == null) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f67358) {
            c14370 = (C14370) this.f67358.get(str);
            this.f67358.remove(str);
        }
        if (c14370 == null) {
            return null;
        }
        return c14370.f45302;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m48148(Intent intent, InterfaceC19020 interfaceC19020) {
        C21587.m49113("openSDK_LOG.UIListenerManager", "handleDataToListener");
        String stringExtra = intent.getStringExtra("key_action");
        if (!"action_login".equals(stringExtra)) {
            if ("action_share".equals(stringExtra)) {
                String stringExtra2 = intent.getStringExtra(o.c);
                String stringExtra3 = intent.getStringExtra("response");
                if ("cancel".equals(stringExtra2)) {
                    interfaceC19020.mo2046();
                    return;
                }
                if (d.O.equals(stringExtra2)) {
                    interfaceC19020.mo2047(new C1121(-6, "unknown error", C14483.m34972(stringExtra3, "")));
                    return;
                } else {
                    if ("complete".equals(stringExtra2)) {
                        try {
                            interfaceC19020.mo2048(new JSONObject(stringExtra3 == null ? "{\"ret\": 0}" : stringExtra3));
                            return;
                        } catch (JSONException unused) {
                            interfaceC19020.mo2047(new C1121(-4, "json error", C14483.m34972(stringExtra3, "")));
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        int intExtra = intent.getIntExtra("key_error_code", 0);
        if (intExtra != 0) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
            interfaceC19020.mo2047(new C1121(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra4 = intent.getStringExtra("key_response");
        if (stringExtra4 == null) {
            C21587.m49111("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            interfaceC19020.mo2048(new JSONObject());
            return;
        }
        try {
            interfaceC19020.mo2048(C20512.m47044(stringExtra4));
        } catch (JSONException e) {
            interfaceC19020.mo2047(new C1121(-4, "服务器返回数据格式有误!", stringExtra4));
            C21587.m49112("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
        }
    }
}
