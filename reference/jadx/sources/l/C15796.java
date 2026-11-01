package l;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܺ۟ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C15796 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f51142;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C20277 f51143;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f51144;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f51145 = -1;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f51146;

    public C15796() {
        try {
            new C20734(this).start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m37569() {
        return this.f51144 != null && System.currentTimeMillis() < this.f51145;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m37565() {
        return this.f51144;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37567(String str, String str2) {
        this.f51144 = str;
        this.f51145 = 0L;
        if (str2 != null) {
            this.f51145 = (Long.parseLong(str2) * 1000) + System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m37570() {
        return this.f51146;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37566(String str) {
        this.f51146 = str;
        C14778.m35413().m35417(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m37568(JSONObject jSONObject) {
        try {
            m37564("saveSession");
            return m37562(jSONObject, this.f51143);
        } catch (Exception e) {
            C23099.m51113("openSDK_LOG.QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public synchronized void m37564(String str) {
        if (this.f51143 == null) {
            C23099.m51113("openSDK_LOG.QQToken", "initAESUtils ".concat(str));
            this.f51143 = new C20277(C1791.m5862());
            C23099.m51113("openSDK_LOG.QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static synchronized SharedPreferences m37560() {
        if (f51142 == null) {
            f51142 = C1791.m5862().getSharedPreferences("token_info_file", 0);
        }
        return f51142;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m37562(JSONObject jSONObject, C20277 c20277) {
        if (C1791.m5862() == null) {
            C23099.m51113("openSDK_LOG.QQToken", "saveJsonPreference context null");
            return false;
        }
        try {
            String string = jSONObject.getString("expires_in");
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("expires_time", (Long.parseLong(string) * 1000) + System.currentTimeMillis());
                String str = Base64.encodeToString(C2761.m8431("101492915"), 2) + "_aes_google";
                String strM45776 = c20277.m45776(jSONObject.toString());
                if (str.length() > 6 && strM45776 != null) {
                    m37560().edit().putString(str, strM45776).commit();
                    C23099.m51113("openSDK_LOG.QQToken", "saveJsonPreference sucess");
                    return true;
                }
                C23099.m51113("openSDK_LOG.QQToken", "saveJsonPreference keyEncode or josnEncode null");
                return false;
            }
            C23099.m51113("openSDK_LOG.QQToken", "expires is null");
            return false;
        } catch (Exception e) {
            C23099.m51115("openSDK_LOG.QQToken", "saveJsonPreference exception:" + e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static void m37563(String str) {
        SharedPreferences.Editor editorEdit = m37560().edit();
        editorEdit.remove(Base64.encodeToString(C2761.m8431(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C2761.m8431(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C2761.m8431(str), 2) + "_aes_google");
        editorEdit.apply();
        C23099.m51113("openSDK_LOG.QQToken", "removeSession sucess");
    }
}
