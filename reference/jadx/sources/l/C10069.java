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

/* JADX INFO: renamed from: l.ۢۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C10069 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean f32292;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C10069 f32293;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16608 f32294;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static synchronized C10069 m26034(Context context) {
        C5596.m16571(context.getApplicationContext());
        C21587.m49113("openSDK_LOG.Tencent", "createInstance()  -- start, appId = 101492915");
        if (TextUtils.isEmpty("101492915")) {
            C21587.m49116("openSDK_LOG.Tencent", "appId should not be empty!");
            return null;
        }
        C10069 c10069 = f32293;
        if (c10069 == null) {
            f32293 = new C10069(context);
        } else {
            c10069.f32294.m39291().getClass();
            C21587.m49113("openSDK_LOG.Tencent", "getAppId() appid =101492915");
            C2196.m7504().m7509("getAppId", "", "101492915");
        }
        if (!m26032(context)) {
            return null;
        }
        m26031("createInstance", c.d, "101492915");
        C22333.m50398().m50402(C24988.m55831(context, "101492915"));
        C21587.m49113("openSDK_LOG.Tencent", "createInstance()  -- end");
        return f32293;
    }

    public C10069(Context context) {
        this.f32294 = C16608.m39289(context);
        C2196.m7504().m7507(context);
        C13053.m32513().m32515(context);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static void m26035() {
        C21587.m49113("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true");
        C13053.m32513().m32515(C5596.m16575());
        String strM32518 = C13053.m32513().m32518();
        if (strM32518 == null || strM32518.isEmpty()) {
            strM32518 = Build.MODEL;
        }
        C21587.m49113("openSDK_LOG.Tencent", "setIsPermissionGranted, isPermissionGranted: true, model = " + strM32518);
        if (strM32518 == null || strM32518.trim().isEmpty()) {
            C21587.m49116("openSDK_LOG.Tencent", "setIsPermissionGranted error! model= [" + strM32518 + "]");
            strM32518 = "unknown";
        }
        f32292 = true;
        C13053.m32513().m32516(C5596.m16575(), strM32518);
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static boolean m26033() {
        return !f32292 || TextUtils.isEmpty(C13053.m32513().m32518());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26032(Context context) {
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.tauth.AuthActivity"), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            C21587.m49116("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent101492915\" />,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent101492915\" />\n</intent-filter>\n</activity>");
            return false;
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.Tencent", "checkManifestConfig exception", th);
        }
        try {
            context.getPackageManager().getActivityInfo(new ComponentName(context.getPackageName(), "com.tencent.connect.common.AssistActivity"), 128);
            return true;
        } catch (PackageManager.NameNotFoundException unused2) {
            C21587.m49116("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档.\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>");
            return false;
        } catch (Throwable th2) {
            C21587.m49112("openSDK_LOG.Tencent", "checkManifestConfig exception", th2);
            return true;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m26036(AbstractActivityC17204 abstractActivityC17204, InterfaceC19020 interfaceC19020) {
        C21587.m49113("openSDK_LOG.Tencent", "login() with activity, scope is get_simple_userinfo");
        m26031("login_scope", "scope", "get_simple_userinfo");
        this.f32294.m39290(abstractActivityC17204, interfaceC19020);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m26038() {
        C21587.m49113("openSDK_LOG.Tencent", "logout()");
        m26031("logout", new Object[0]);
        C16608 c16608 = this.f32294;
        c16608.m39291().m33820((String) null, "0");
        c16608.m39291().m33819((String) null);
        C13878 c13878M39291 = c16608.m39291();
        c16608.m39291().getClass();
        c13878M39291.getClass();
        C13878.m33815("101492915");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26030(int i, int i2, Intent intent, InterfaceC19020 interfaceC19020) {
        StringBuilder sbM5126 = C1402.m5126("onActivityResultData() reqcode = ", i, ", resultcode = ", ", data = null ? ", i2);
        sbM5126.append(intent == null);
        sbM5126.append(", listener = null ? ");
        sbM5126.append(interfaceC19020 == null);
        C21587.m49113("openSDK_LOG.Tencent", sbM5126.toString());
        m26031("onActivityResultData", "requestCode", Integer.valueOf(i), "resultCode", Integer.valueOf(i2));
        C21084 c21084M48147 = C21084.m48147();
        c21084M48147.getClass();
        C21587.m49113("openSDK_LOG.UIListenerManager", "onActivityResult req=" + i + " res=" + i2);
        InterfaceC19020 interfaceC19020M48149 = c21084M48147.m48149(i);
        if (interfaceC19020M48149 != null) {
            interfaceC19020 = interfaceC19020M48149;
        } else if (interfaceC19020 == null) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "onActivityResult can't find the listener");
            return;
        } else if (i == 11101) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "登录的接口回调不能重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11105) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "Social Api 的接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        } else if (i == 11106) {
            C21587.m49116("openSDK_LOG.UIListenerManager", "Social Api 的H5接口回调需要使用param来重新构建，暂时无法提供，先记录下来这种情况是否存在");
        }
        if (i2 != -1) {
            interfaceC19020.mo2046();
            return;
        }
        if (intent == null) {
            interfaceC19020.mo2047(new C1121(-6, "onActivityResult intent data is null.", "onActivityResult intent data is null."));
            return;
        }
        String stringExtra = intent.getStringExtra("key_action");
        if ("action_login".equals(stringExtra)) {
            if (intent.getBooleanExtra("key_auth_ignore_on_activity_result", false)) {
                C21587.m49113("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, ignoreOnActivityResult");
                return;
            }
            int intExtra = intent.getIntExtra("key_error_code", 0);
            if (intExtra != 0) {
                C21587.m49116("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onError = " + intExtra);
                interfaceC19020.mo2047(new C1121(intExtra, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra2 = intent.getStringExtra("key_response");
            if (stringExtra2 == null) {
                C21587.m49111("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, onComplete");
                interfaceC19020.mo2047(new C1121(-4, "服务器返回数据格式有误!", "response is null"));
                return;
            }
            try {
                interfaceC19020.mo2048(C20512.m47044(stringExtra2));
                return;
            } catch (JSONException e) {
                interfaceC19020.mo2047(new C1121(-4, "服务器返回数据格式有误!", stringExtra2));
                C21587.m49112("openSDK_LOG.UIListenerManager", "OpenUi, onActivityResult, json error", e);
                return;
            }
        }
        if ("action_share".equals(stringExtra) || "action_request_avatar".equals(stringExtra) || "action_request_dynamic_avatar".equals(stringExtra) || "action_request_set_emotion".equals(stringExtra) || "guildOpen".equals(stringExtra)) {
            String stringExtra3 = intent.getStringExtra(o.c);
            String stringExtra4 = intent.getStringExtra("response");
            if ("cancel".equals(stringExtra3)) {
                interfaceC19020.mo2046();
                return;
            }
            if (d.O.equals(stringExtra3)) {
                interfaceC19020.mo2047(new C1121(-6, "unknown error", C14483.m34972(stringExtra4, "")));
                return;
            }
            if ("complete".equals(stringExtra3)) {
                try {
                    interfaceC19020.mo2048(new JSONObject(stringExtra4 == null ? "{\"ret\": 0}" : stringExtra4));
                    return;
                } catch (JSONException e2) {
                    C21587.m49112("openSDK_LOG.UIListenerManager", "JSONException", e2);
                    interfaceC19020.mo2047(new C1121(-4, "json error", C14483.m34972(stringExtra4, "")));
                    return;
                }
            }
            return;
        }
        if (!"action_common_channel".equals(stringExtra)) {
            int intExtra2 = intent.getIntExtra("key_error_code", 0);
            if (intExtra2 != 0) {
                interfaceC19020.mo2047(new C1121(intExtra2, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
                return;
            }
            String stringExtra5 = intent.getStringExtra("key_response");
            if (stringExtra5 == null) {
                interfaceC19020.mo2048(new JSONObject());
                return;
            }
            try {
                interfaceC19020.mo2048(C20512.m47044(stringExtra5));
                return;
            } catch (JSONException unused) {
                interfaceC19020.mo2047(new C1121(-4, "服务器返回数据格式有误!", stringExtra5));
                return;
            }
        }
        int intExtra3 = intent.getIntExtra("key_error_code", 0);
        if (intExtra3 != 0) {
            interfaceC19020.mo2047(new C1121(intExtra3, intent.getStringExtra("key_error_msg"), intent.getStringExtra("key_error_detail")));
            return;
        }
        String stringExtra6 = intent.getStringExtra("response");
        if (stringExtra6 == null) {
            interfaceC19020.mo2048(new JSONObject());
            return;
        }
        try {
            String stringExtra7 = intent.getStringExtra("message");
            JSONObject jSONObjectM47044 = C20512.m47044(stringExtra6);
            jSONObjectM47044.put("message", stringExtra7);
            interfaceC19020.mo2048(jSONObjectM47044);
        } catch (JSONException unused2) {
            interfaceC19020.mo2047(new C1121(-4, "服务器返回数据格式有误!", stringExtra6));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m26037() {
        boolean zM39292 = this.f32294.m39292();
        C21587.m49113("openSDK_LOG.Tencent", "isSessionValid() isvalid =" + zM39292);
        C2196.m7504().m7509("isSessionValid", "", Boolean.valueOf(zM39292));
        return zM39292;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m26031(String str, Object... objArr) {
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
        C2196.m7504().m7509(str, string, "");
    }
}
