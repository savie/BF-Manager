package l;

import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;

/* JADX INFO: renamed from: l.ܺ۟ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: V75S */
/* JADX INFO: loaded from: classes4.dex */
public final class C16684 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final long f53901;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final String f53902;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f53903;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f53904;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final String f53905;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f53906;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final long f53907;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f53908;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String f53909;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C24890 f53910;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f53911;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final long f53912;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f53913;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f53914;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean f53915;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f53916;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f53917;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f53918;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f53919;

    public C16684(JSONObject jSONObject) {
        jSONObject.getString(MotionUtils.EASING_TYPE_PATH, "");
        this.f53905 = jSONObject.getString("type", "");
        jSONObject.getString("className", "");
        jSONObject.getString("realClassName", "");
        this.f53916 = jSONObject.getString("arch", "");
        this.f53909 = jSONObject.getString(am.w, "");
        this.f53911 = jSONObject.getString("machine", "");
        this.f53903 = jSONObject.getString("abi", "");
        this.f53902 = jSONObject.getString(am.x, "");
        this.f53908 = jSONObject.getString("subsystem", "");
        this.f53913 = jSONObject.getString("interpreter", "");
        this.f53917 = jSONObject.getInt("bits", 0);
        this.f53919 = jSONObject.getBoolean("hasVirtualAddress", false);
        this.f53915 = jSONObject.getBoolean("positionIndependent", false);
        this.f53918 = jSONObject.getBoolean("nx", false);
        this.f53914 = jSONObject.getBoolean("canary", false);
        this.f53906 = C21160.m48263(jSONObject, "baseAddress", 0L);
        this.f53901 = C21160.m48263(jSONObject, "entryVirtualAddress", 0L);
        this.f53904 = C21160.m48263(jSONObject, "entryPhysicalAddress", 0L);
        this.f53912 = C21160.m48263(jSONObject, "initVirtualAddress", 0L);
        this.f53907 = C21160.m48263(jSONObject, "finiVirtualAddress", 0L);
        this.f53910 = C24890.m55422(jSONObject.getJSONObject("counts"));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C16684 m39446(JSONObject jSONObject) {
        return new C16684(jSONObject);
    }
}
