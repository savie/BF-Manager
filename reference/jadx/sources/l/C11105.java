package l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.alipay.sdk.m.w.a;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: l.ۧܺᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51RR */
/* JADX INFO: loaded from: classes3.dex */
public final class C11105 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public String f37690 = "";

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f37691 = "";

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static C11105 m28002() {
        return C6165.f21021;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28004(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f37691;
        if (str == null || str.trim().isEmpty()) {
            this.f37691 = sharedPreferences.getString("build_model", "");
            C23099.m51113("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f37691);
        }
        String str2 = this.f37690;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f37690 = sharedPreferences.getString("build_device", "");
            C23099.m51113("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f37690);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28003() {
        return this.f37690;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m28006() {
        String str = this.f37691;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes(a.D), 2);
            } catch (UnsupportedEncodingException e) {
                C23099.m51115("openSDK_LOG.Util", "convert2Base64String exception: " + e.getMessage());
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m28007() {
        return this.f37691;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28005(Context context, String str) {
        C23099.m51113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f37691 = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f37691;
        if (str2 != null && str2.equals(str)) {
            C23099.m51113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f37691 = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f37691).commit();
            C23099.m51113("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }
}
