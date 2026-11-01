package l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.alipay.sdk.m.y.o;
import com.umeng.analytics.pro.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ᩴ᩶ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C18990 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean f61467;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C18990 f61468;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3094 f61469;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static synchronized C18990 m43695(Context context) {
        C1791.m5867(context.getApplicationContext());
        C23099.m51113("openSDK_LOG.Tencent", "createInstance()  -- start, appId = 101492915");
        if (TextUtils.isEmpty("101492915")) {
            C23099.m51115("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        C18990 c18990 = f61468;
        if (c18990 == null) {
            f61468 = new C18990(context);
        } else {
            c18990.f61469.m9288().getClass();
            C23099.m51113("openSDK_LOG.Tencent", "getAppId() appid =101492915");
            C14778.m35413().m35418("getAppId", "", "101492915");
        }
        if (!m43693(context)) {
            return null;
        }
        m43692("createInstance", c.d, "101492915");
        C0665.m2989().m2993(C1931.m6267(context, "101492915"));
        C23099.m51113("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f61468;
    }

    public C18990(Context context) {
        this.f61469 = C3094.m9286(context);
        C14778.m35413().m35416(context);
        C11105.m28002().m28004(context);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static void m43690() {
        C23099.m51113("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true");
        C11105.m28002().m28004(C1791.m5862());
        String strM28007 = C11105.m28002().m28007();
        if (strM28007 == null || strM28007.isEmpty()) {
            strM28007 = Build.MODEL;
        }
        C23099.m51113("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true, model = " + strM28007);
        if (strM28007 == null || strM28007.trim().isEmpty()) {
            C23099.m51115("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + strM28007 + "]");
            strM28007 = "unknown";
        }
        f61467 = true;
        C11105.m28002().m28005(C1791.m5862(), strM28007);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static boolean m43694() {
        return !f61467 || TextUtils.isEmpty(C11105.m28002().m28007());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m43693(Context context) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            C23099.m51115("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent101492915\" />,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent101492915\" />\n</intent-filter>\n</activity>");
            return false;
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            C23099.m51115("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>");
            return false;
        } catch (Throwable th2) {
            C23099.m51111("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43696(AbstractActivityC12483 abstractActivityC12483, InterfaceC18284 interfaceC18284) {
        C23099.m51113("openSDK_LOG.Tencent", "login() with activity, scope is get_simple_userinfo");
        m43692("login_scope", "scope", "get_simple_userinfo");
        this.f61469.m9287(abstractActivityC12483, interfaceC18284);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m43698() {
        C23099.m51113("openSDK_LOG.Tencent", "logout()");
        m43692("logout", new Object[0]);
        C3094 c3094 = this.f61469;
        c3094.m9288().m37567((String) null, "0");
        c3094.m9288().m37566((String) null);
        C15796 c15796M9288 = c3094.m9288();
        c3094.m9288().getClass();
        c15796M9288.getClass();
        C15796.m37563("101492915");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43691(int i, int i2, Intent intent, InterfaceC18284 interfaceC18284) {
        StringBuilder sbM2791 = C0589.m2791("onActivityResultData() reqcode = ", i, ", resultcode = ", ", data = null ? ", i2);
        sbM2791.append(intent == null);
        sbM2791.append(", listener = null ? ");
        sbM2791.append(interfaceC18284 == null);
        C23099.m51113("openSDK_LOG.Tencent", sbM2791.toString());
        m43692("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        C23245 c23245M51287 = C23245.m51287();
        c23245M51287.getClass();
        C23099.m51113("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        InterfaceC18284 interfaceC18284M51289 = c23245M51287.m51289(i);
        if (interfaceC18284M51289 != null) {
            interfaceC18284 = interfaceC18284M51289;
        } else if (interfaceC18284 == null) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return;
        } else if (i == 11101) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            C23099.m51115("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        if (i2 != -1) {
            interfaceC18284.mo16213();
            return;
        }
        if (intent == null) {
            interfaceC18284.mo16214(new C8407(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            if (intent.getBooleanExtra("key_auth_ignore_on_activity_result", false)) {
                C23099.m51113("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, ignoreOnActivityResult");
                return;
            }
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra != 0) {
                C23099.m51115("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                interfaceC18284.mo16214(new C8407(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra2 = intent.getStringExtra("key_response");
            if (stringExtra2 == null) {
                C23099.m51110("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                interfaceC18284.mo16214(new C8407(-4, "服务器返回数据格式有误!", "response is null"));
                return;
            }
            try {
                interfaceC18284.mo16215(C2761.m8423(stringExtra2));
                return;
            } catch (JSONException e) {
                interfaceC18284.mo16214(new C8407(-4, "服务器返回数据格式有误!", stringExtra2));
                C23099.m51111("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                return;
            }
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(o.c);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                interfaceC18284.mo16213();
                return;
            }
            if (d.O.equals(stringExtra3)) {
                interfaceC18284.mo16214(new C8407(-6, "unknown error", C15489.m37076(stringExtra4, "")));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    interfaceC18284.mo16215(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                    return;
                } catch (JSONException e2) {
                    C23099.m51111("openSDK_LOG.UIListenerManager", "JSONException", e2);
                    interfaceC18284.mo16214(new C8407(-4, "json error", C15489.m37076(stringExtra4, "")));
                    return;
                }
            }
            return;
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra("key_error_code", 0);
            if (intExtra2 != 0) {
                interfaceC18284.mo16214(new C8407(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra5 = intent.getStringExtra("key_response");
            if (stringExtra5 == null) {
                interfaceC18284.mo16215(new JSONObject());
                return;
            }
            try {
                interfaceC18284.mo16215(C2761.m8423(stringExtra5));
                return;
            } catch (JSONException unused) {
                interfaceC18284.mo16214(new C8407(-4, "服务器返回数据格式有误!", stringExtra5));
                return;
            }
        }
        int intExtra3 = intent.getIntExtra("key_error_code", 0);
        if (intExtra3 != 0) {
            interfaceC18284.mo16214(new C8407(intExtra3, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            interfaceC18284.mo16215(new JSONObject());
            return;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject jSONObjectM8423 = C2761.m8423(stringExtra6);
            jSONObjectM8423.put("message", stringExtra7);
            interfaceC18284.mo16215(jSONObjectM8423);
        } catch (JSONException unused2) {
            interfaceC18284.mo16214(new C8407(-4, "服务器返回数据格式有误!", stringExtra6));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m43697() {
        boolean zM9289 = this.f61469.m9289();
        C23099.m51113("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM9289);
        C14778.m35413().m35418("isSessionValid", "", Boolean.valueOf(zM9289));
        return zM9289;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43692(String str, Object... objArr) {
        String string;
        if (objArr.length != 0 && objArr.length % 2 == 0) {
            StringBuilder sb = new StringBuilder();
            int length = objArr.length;
            for (int i = 0; i < length; i += 2) {
                if (i > 0) {
                    sb.append('|');
                }
                sb.append(objArr[i]);
                sb.append(':');
                sb.append(objArr[i + 1]);
            }
            string = sb.toString();
        } else {
            string = "";
        }
        C14778.m35413().m35418(str, string, "");
    }
}
