package l;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: l.ۗ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes2.dex */
public final class C3094 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C7328 f11682;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C15796 f11683;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3094 m9286(Context context) {
        C1791.m5867(context.getApplicationContext());
        C23099.m51113("openSDK_LOG.QQAuth", "QQAuth -- createInstance() --start");
        C3094 c3094 = new C3094();
        C23099.m51113("openSDK_LOG.QQAuth", "new QQAuth() --start");
        C15796 c15796 = new C15796();
        c3094.f11683 = c15796;
        c3094.f11682 = new C7328(c15796);
        C22851.m50592(context, c15796);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("BuglySdkInfos", 0).edit();
        editorEdit.putString("bcb3903995", "3.5.18.lite");
        editorEdit.apply();
        C23099.m51113("openSDK_LOG.QQAuth", "new QQAuth() --end");
        C23099.m51113("openSDK_LOG.QQAuth", "QQAuth -- createInstance()  --end");
        return c3094;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9287(Activity activity, InterfaceC18284 interfaceC18284) {
        C7328 c7328 = this.f11682;
        C23099.m51113("openSDK_LOG.QQAuth", "login()");
        C23099.m51113("openSDK_LOG.QQAuth", "-->login activity: " + activity);
        try {
            String strM9946 = C3342.m9946(activity);
            if (strM9946 != null) {
                String strM31080 = C12516.m31080(new File(strM9946));
                if (!TextUtils.isEmpty(strM31080)) {
                    C23099.m51107("openSDK_LOG.QQAuth", "-->login channelId: " + strM31080);
                    C23099.m51113("openSDK_LOG.QQAuth", "loginWithOEM");
                    AbstractC1371.f5740 = true;
                    String str = strM31080.equals("") ? "null" : strM31080;
                    if (strM31080.equals("")) {
                        strM31080 = "null";
                    }
                    AbstractC1371.f5742 = strM31080;
                    AbstractC1371.f5741 = str;
                    AbstractC1371.f5743 = "null";
                    return c7328.m19595(activity, interfaceC18284);
                }
            }
        } catch (Throwable th) {
            C23099.m51111("openSDK_LOG.QQAuth", "-->login get channel id exception.", th);
        }
        C23099.m51110("openSDK_LOG.QQAuth", "-->login channelId is null ");
        AbstractC1371.f5740 = false;
        return c7328.m19595(activity, interfaceC18284);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15796 m9288() {
        return this.f11683;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m9289() {
        C15796 c15796 = this.f11683;
        C23099.m51113("openSDK_LOG.QQAuth", "isSessionValid(), result = ".concat(c15796.m37569() ? "true" : "false"));
        return c15796.m37569();
    }
}
