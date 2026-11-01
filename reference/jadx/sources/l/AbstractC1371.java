package l;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alipay.sdk.m.u0.c;
import com.tencent.connect.common.AssistActivity;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.֨᩷ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1371 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static boolean f5740;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static String f5741;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static String f5742;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static String f5743;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C15796 f5744;

    public AbstractC1371(C15796 c15796) {
        this.f5744 = c15796;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m4819() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", C11105.m28002().m28006());
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        C15796 c15796 = this.f5744;
        if (c15796.m37569()) {
            bundle.putString("access_token", c15796.m37565());
            bundle.putString("oauth_consumer_key", "101492915");
            bundle.putString("openid", c15796.m37570());
        }
        SharedPreferences sharedPreferences = C1791.m5862().getSharedPreferences("pfStore", 0);
        if (f5740) {
            bundle.putString("pf", "desktop_m_qq-" + f5742 + "-android-" + f5741 + "-" + f5743);
            return bundle;
        }
        bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m4820() {
        Bundle bundleM4819 = m4819();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty("")) {
            bundleM4819.putString("need_version", "");
        }
        sb.append(C16044.m38038(bundleM4819));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Bundle m4821() {
        Bundle bundle = new Bundle();
        bundle.putString(c.d, "101492915");
        C15796 c15796 = this.f5744;
        if (c15796.m37569()) {
            bundle.putString("keystr", c15796.m37565());
            bundle.putString("keytype", "0x80");
        }
        String strM37570 = c15796.m37570();
        if (strM37570 != null) {
            bundle.putString("hopenid", strM37570);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = C1791.m5862().getSharedPreferences("pfStore", 0);
        if (f5740) {
            bundle.putString("pf", "desktop_m_qq-" + f5742 + "-android-" + f5741 + "-" + f5743);
        } else {
            bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
            bundle.putString("pf", "openmobile_android");
        }
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Intent m4817(Activity activity, Intent intent) {
        PendingIntent activity2;
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        try {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent2.putExtra("key_request_orientation", activity.getRequestedOrientation());
        intent2.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", intent);
        try {
            C23099.m51113("openSDK_LOG.BaseApi", "setActivityIntent requestCode: 11101");
            if (Build.VERSION.SDK_INT >= 23) {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1140850688);
            } else {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1073741824);
            }
            intent2.putExtra("key_extra_pending_intent", activity2);
        } catch (Throwable th2) {
            C23099.m51111("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m4818(Activity activity, Intent intent) {
        intent.putExtra("key_request_code", 11101);
        try {
            activity.startActivityForResult(m4817(activity, intent), 11101);
        } catch (Exception e) {
            C23099.m51111("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }
}
