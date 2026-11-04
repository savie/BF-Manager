package l;

import android.annotation.TargetApi;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.۬۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13878 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static SharedPreferences f44016;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f44017;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f44018 = -1;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f44019;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C4850 f44020;

    public C13878() {
        try {
            new C7167(this).start();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m33822() {
        return this.f44017 != null && System.currentTimeMillis() < this.f44018;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33818() {
        return this.f44017;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33820(String str, String str2) {
        this.f44017 = str;
        this.f44018 = 0L;
        if (str2 != null) {
            this.f44018 = (Long.parseLong(str2) * 1000) + System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m33823() {
        return this.f44019;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33819(String str) {
        this.f44019 = str;
        C2196.m7504().m7508(str);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m33821(JSONObject jSONObject) {
        try {
            m33816("saveSession");
            return m33814(jSONObject, this.f44020);
        } catch (Exception e) {
            C21587.m49113("openSDK_LOG.QQToken", "login saveSession" + e.toString());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public synchronized void m33816(String str) {
        if (this.f44020 == null) {
            C21587.m49113("openSDK_LOG.QQToken", "initAESUtils ".concat(str));
            this.f44020 = new C4850(C5596.m16575());
            C21587.m49113("openSDK_LOG.QQToken", "initAESUtils " + str + " end");
        }
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static synchronized SharedPreferences m33817() {
        if (f44016 == null) {
            f44016 = C5596.m16575().getSharedPreferences("token_info_file", 0);
        }
        return f44016;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static synchronized boolean m33814(JSONObject jSONObject, C4850 c4850) {
        if (C5596.m16575() == null) {
            C21587.m49113("openSDK_LOG.QQToken", "saveJsonPreference context null");
            return false;
        }
        try {
            String string = jSONObject.getString("expires_in");
            if (!TextUtils.isEmpty(string)) {
                jSONObject.put("expires_time", (Long.parseLong(string) * 1000) + System.currentTimeMillis());
                String str = Base64.encodeToString(C20512.m47040("101492915"), 2) + "_aes_google";
                String strM14896 = c4850.m14896(jSONObject.toString());
                if (str.length() > 6 && strM14896 != null) {
                    m33817().edit().putString(str, strM14896).commit();
                    C21587.m49113("openSDK_LOG.QQToken", "saveJsonPreference sucess");
                    return true;
                }
                C21587.m49113("openSDK_LOG.QQToken", "saveJsonPreference keyEncode or josnEncode null");
                return false;
            }
            C21587.m49113("openSDK_LOG.QQToken", "expires is null");
            return false;
        } catch (Exception e) {
            C21587.m49116("openSDK_LOG.QQToken", "saveJsonPreference exception:" + e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static void m33815(String str) {
        SharedPreferences.Editor editorEdit = m33817().edit();
        editorEdit.remove(Base64.encodeToString(C20512.m47040(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C20512.m47040(str), 2) + "_spkey");
        editorEdit.remove(Base64.encodeToString(C20512.m47040(str), 2) + "_aes_google");
        editorEdit.apply();
        C21587.m49113("openSDK_LOG.QQToken", "removeSession sucess");
    }
}
