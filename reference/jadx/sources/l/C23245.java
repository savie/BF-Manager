package l;

import android.content.Intent;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩺᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes.dex */
public final class C23245 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C23245 f75424;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Map f75425;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23245 m51287() {
        if (f75424 == null) {
            C23245 c23245 = new C23245();
            Map mapSynchronizedMap = C0561.synchronizedMap(new HashMap());
            c23245.f75425 = mapSynchronizedMap;
            if (mapSynchronizedMap == null) {
                c23245.f75425 = C0561.synchronizedMap(new HashMap());
            }
            f75424 = c23245;
        }
        return f75424;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51291(InterfaceC18284 interfaceC18284) {
        String strM9945 = C3342.m9945(11101);
        if (strM9945 == null) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "setListener action is null! rquestCode=11101");
            return;
        }
        synchronized (this.f75425) {
            Map map = this.f75425;
            C7016 c7016 = new C7016();
            c7016.f23583 = interfaceC18284;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18284 m51289(int i) {
        String strM9945 = C3342.m9945(i);
        if (strM9945 == null) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "getListner action is null! rquestCode=" + i);
            return null;
        }
        return m51290(strM9945);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18284 m51290(String str) {
        C7016 c7016;
        if (str == null) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "getListnerWithAction action is null!");
            return null;
        }
        synchronized (this.f75425) {
            c7016 = (C7016) this.f75425.get(str);
            this.f75425.remove(str);
        }
        if (c7016 == null) {
            return null;
        }
        return c7016.f23583;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51288(Intent intent, InterfaceC18284 interfaceC18284) {
        C23099.m51113("openSDK_LOG.UIListenerManager", "handleDataToListener");
        String stringExtra = intent.getStringExtra("key_action");
        if (!"action_login".equals(stringExtra)) {
            if ("action_share".equals(stringExtra)) {
                String stringExtra2 = intent.getStringExtra(o.c);
                String stringExtra3 = intent.getStringExtra("response");
                if ("cancel".equals(stringExtra2)) {
                    interfaceC18284.mo16213();
                    return;
                }
                if (d.O.equals(stringExtra2)) {
                    interfaceC18284.mo16214(new C8407(-6, "unknown error", C15489.m37076(stringExtra3, "")));
                    return;
                } else {
                    if ("complete".equals(stringExtra2)) {
                        try {
                            interfaceC18284.mo16215(new JSONObject(stringExtra3 == null ? "{\"ret\": 0}" : stringExtra3));
                            return;
                        } catch (JSONException unused) {
                            interfaceC18284.mo16214(new C8407(-4, "json error", C15489.m37076(stringExtra3, "")));
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
            C23099.m51115("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra + "");
            interfaceC18284.mo16214(new C8407(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra4 = intent.getStringExtra("key_response");
        if (stringExtra4 == null) {
            C23099.m51110("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
            interfaceC18284.mo16215(new JSONObject());
            return;
        }
        try {
            interfaceC18284.mo16215(C2761.m8423(stringExtra4));
        } catch (JSONException e) {
            interfaceC18284.mo16214(new C8407(-4, "服务器返回数据格式有误!", stringExtra4));
            C23099.m51111("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
        }
    }
}
