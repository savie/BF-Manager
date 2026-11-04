package l;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ܺۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16608 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C8658 f53713;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C13878 f53714;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16608 m39289(Context context) {
        C5596.m16571(context.getApplicationContext());
        C21587.m49113("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C16608 c16608 = new C16608();
        C21587.m49113("openSDK_LOG.QQAuth", "new QQAuth() --start");
        C13878 c13878 = new C13878();
        c16608.f53714 = c13878;
        c16608.f53713 = new C8658(c13878);
        C21338.m48571(context, c13878);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", "3.5.18.lite");
        editorEdit.apply();
        C21587.m49113("openSDK_LOG.QQAuth", "new QQAuth() --end");
        C21587.m49113("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c16608;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39290(Activity activity, InterfaceC19020 interfaceC19020) {
        C8658 c8658 = this.f53713;
        C21587.m49113("openSDK_LOG.QQAuth", "login()");
        C21587.m49113("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        try {
            String strM41147 = C17528.m41147(activity);
            if (strM41147 != null) {
                String strM51288 = C22750.m51288(new File(strM41147));
                if (!TextUtils.isEmpty(strM51288)) {
                    C21587.m49118("openSDK_LOG.QQAuth", "-->login channelId: " + strM51288);
                    C21587.m49113("openSDK_LOG.QQAuth", "loginWithOEM");
                    AbstractC6168.f21018 = true;
                    String str = strM51288.equals("") ? "null" : strM51288;
                    if (strM51288.equals("")) {
                        strM51288 = "null";
                    }
                    AbstractC6168.f21015 = strM51288;
                    AbstractC6168.f21016 = str;
                    AbstractC6168.f21017 = "null";
                    return c8658.m23308(activity, interfaceC19020);
                }
            }
        } catch (Throwable th) {
            C21587.m49112("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        C21587.m49111("openSDK_LOG.QQAuth", "-->login channelId is null ");
        AbstractC6168.f21018 = false;
        return c8658.m23308(activity, interfaceC19020);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13878 m39291() {
        return this.f53714;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m39292() {
        C13878 c13878 = this.f53714;
        C21587.m49113("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(c13878.m33822() ? "true" : "false"));
        return c13878.m33822();
    }
}
