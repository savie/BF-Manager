package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.۫ۤ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes4.dex */
public final class C13053 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f41774 = "";

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f41775 = "";

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static C13053 m32513() {
        return C15290.f49992;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32515(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f41775;
        if (str == null || str.trim().isEmpty()) {
            this.f41775 = sharedPreferences.getString("build_model", "");
            C21587.m49113("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f41775);
        }
        String str2 = this.f41774;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f41774 = sharedPreferences.getString("build_device", "");
            C21587.m49113("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f41774);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m32514() {
        return this.f41774;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String m32517() {
        String str = this.f41775;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes(a.D), 2);
            } catch (UnsupportedEncodingException e) {
                C21587.m49116("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m32518() {
        return this.f41775;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32516(Context context, String str) {
        C21587.m49113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f41775 = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f41775;
        if (str2 != null && str2.equals(str)) {
            C21587.m49113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f41775 = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f41775).commit();
            C21587.m49113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }
}
