package l;

import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.᩻ܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes.dex */
public final class C23775 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f76889;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f76890;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final long f76891;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f76892;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f76893;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final long f76894;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f76895;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final String f76896;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f76897;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f76898;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f76899;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f76900;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f76901;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final String f76902;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f76903;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f76904;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f76905;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C11075 f76906;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean f76907;

    public C23775(JSONObject jSONObject) {
        jSONObject.getString(MotionUtils.EASING_TYPE_PATH, "");
        this.f76897 = jSONObject.getString("type", "");
        jSONObject.getString("className", "");
        jSONObject.getString("realClassName", "");
        this.f76900 = jSONObject.getString("arch", "");
        this.f76889 = jSONObject.getString(am.w, "");
        this.f76902 = jSONObject.getString("machine", "");
        this.f76892 = jSONObject.getString("abi", "");
        this.f76895 = jSONObject.getString(am.x, "");
        this.f76896 = jSONObject.getString("subsystem", "");
        this.f76905 = jSONObject.getString("interpreter", "");
        this.f76890 = jSONObject.getInt("bits", 0);
        this.f76907 = jSONObject.getBoolean("hasVirtualAddress", false);
        this.f76904 = jSONObject.getBoolean("positionIndependent", false);
        this.f76903 = jSONObject.getBoolean("nx", false);
        this.f76893 = jSONObject.getBoolean("canary", false);
        this.f76898 = C1383.m4844(jSONObject, "baseAddress", 0L);
        this.f76891 = C1383.m4844(jSONObject, "entryVirtualAddress", 0L);
        this.f76899 = C1383.m4844(jSONObject, "entryPhysicalAddress", 0L);
        this.f76901 = C1383.m4844(jSONObject, "initVirtualAddress", 0L);
        this.f76894 = C1383.m4844(jSONObject, "finiVirtualAddress", 0L);
        this.f76906 = C11075.m27925(jSONObject.getJSONObject("counts"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C23775 m52319(JSONObject jSONObject) {
        return new C23775(jSONObject);
    }
}
