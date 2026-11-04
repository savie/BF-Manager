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

/* JADX INFO: renamed from: l.ۛۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6168 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static String f21015;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static String f21016;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static String f21017;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static boolean f21018;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C13878 f21019;

    public AbstractC6168(C13878 c13878) {
        this.f21019 = c13878;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Bundle m17772() {
        Bundle bundle = new Bundle();
        bundle.putString("format", "json");
        bundle.putString("status_os", Build.VERSION.RELEASE);
        bundle.putString("status_machine", C13053.m32513().m32517());
        bundle.putString("status_version", Build.VERSION.SDK);
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        C13878 c13878 = this.f21019;
        if (c13878.m33822()) {
            bundle.putString("access_token", c13878.m33818());
            bundle.putString("oauth_consumer_key", "101492915");
            bundle.putString("openid", c13878.m33823());
        }
        SharedPreferences sharedPreferences = C5596.m16575().getSharedPreferences("pfStore", 0);
        if (f21018) {
            bundle.putString("pf", "desktop_m_qq-" + f21015 + "-android-" + f21016 + "-" + f21017);
            return bundle;
        }
        bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m17773() {
        Bundle bundleM17772 = m17772();
        StringBuilder sb = new StringBuilder("https://openmobile.qq.com/oauth2.0/m_jump_by_version?");
        if (!TextUtils.isEmpty("")) {
            bundleM17772.putString("need_version", "");
        }
        sb.append(C14127.m34338(bundleM17772));
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Bundle m17774() {
        Bundle bundle = new Bundle();
        bundle.putString(c.d, "101492915");
        C13878 c13878 = this.f21019;
        if (c13878.m33822()) {
            bundle.putString("keystr", c13878.m33818());
            bundle.putString("keytype", "0x80");
        }
        String strM33823 = c13878.m33823();
        if (strM33823 != null) {
            bundle.putString("hopenid", strM33823);
        }
        bundle.putString("platform", "androidqz");
        SharedPreferences sharedPreferences = C5596.m16575().getSharedPreferences("pfStore", 0);
        if (f21018) {
            bundle.putString("pf", "desktop_m_qq-" + f21015 + "-android-" + f21016 + "-" + f21017);
        } else {
            bundle.putString("pf", sharedPreferences.getString("pf", "openmobile_android"));
            bundle.putString("pf", "openmobile_android");
        }
        bundle.putString("sdkv", "3.5.18.lite");
        bundle.putString("sdkp", am.av);
        return bundle;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static Intent m17770(Activity activity, Intent intent) {
        PendingIntent activity2;
        Intent intent2 = new Intent(activity.getApplicationContext(), (Class<?>) AssistActivity.class);
        intent2.putExtra("is_login", true);
        try {
            if (intent.getClipData() == null) {
                intent.setClipData(ClipData.newPlainText(null, null));
            }
            intent.setFlags(intent.getFlags() & (-196));
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.BaseApi", "setActivityIntent security catch exception", th);
        }
        intent2.putExtra("key_request_orientation", activity.getRequestedOrientation());
        intent2.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", intent);
        try {
            C21587.m49113("openSDK_LOG.BaseApi", "setActivityIntent requestCode: 11101");
            if (Build.VERSION.SDK_INT >= 23) {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1140850688);
            } else {
                activity2 = PendingIntent.getActivity(activity, 11101, intent, 1073741824);
            }
            intent2.putExtra("key_extra_pending_intent", activity2);
        } catch (Throwable th2) {
            C21587.m49112("openSDK_LOG.BaseApi", "setActivityIntent create pendingIntent exception", th2);
        }
        return intent2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m17771(Activity activity, Intent intent) {
        intent.putExtra("key_request_code", 11101);
        try {
            activity.startActivityForResult(m17770(activity, intent), 11101);
        } catch (Exception e) {
            C21587.m49112("openSDK_LOG.BaseApi", "startAssitActivity exception", e);
        }
    }
}
