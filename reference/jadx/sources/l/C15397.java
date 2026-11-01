package l;

import android.util.Base64;
import bin.mt.json.JSON;
import bin.mt.json.JSONArray;
import bin.mt.json.JSONObject;
import com.google.android.material.motion.MotionUtils;
import com.umeng.analytics.pro.am;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SecureRandom;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: l.ܶᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: U6V6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C15397 {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final byte[] f50114;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f50115;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public long f50117;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f50119;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final String f50120;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f50121;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public long f50122;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f50123;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String f50124;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public long f50125;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f50126;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f50127;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f50128;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f50129;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f50116 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f50118 = -1;

    static {
        byte[] bArr = new byte[32];
        f50114 = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    public C15397(String str, String str2, String str3, long j, long j2, String str4) {
        this.f50120 = str;
        this.f50124 = str2;
        this.f50119 = str3;
        this.f50126 = j;
        this.f50115 = j2;
        this.f50127 = str4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m36831() {
        byte[] bytes = JSON.object().add(am.aE, 1).add(MotionUtils.EASING_TYPE_PATH, this.f50120).add("query", this.f50124).add("encoding", this.f50119).add("size", this.f50126).add("modified", this.f50115).add("sample", this.f50127).add("anchorLine", this.f50121).add("anchorByte", this.f50123).add("line", this.f50128).add("pending", this.f50129).add("outputLine", this.f50117).add("outputColumn", this.f50122).add("delivered", this.f50116).add("afterThrough", this.f50118).add("searched", this.f50125).toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(m36830(bytes), 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C15397 m36829(String str, String str2) throws C12731 {
        try {
            if (str.length() > 32768) {
                throw new IllegalArgumentException();
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46)) {
                throw new IllegalArgumentException();
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(m36830(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw new IllegalArgumentException();
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            if (jSONObjectAsObject.getInt(am.aE) != 1 || !str2.equals(jSONObjectAsObject.getString(MotionUtils.EASING_TYPE_PATH))) {
                throw new IllegalArgumentException();
            }
            C15397 c15397 = new C15397(str2, jSONObjectAsObject.getString("query"), jSONObjectAsObject.getString("encoding"), jSONObjectAsObject.getLong("size"), jSONObjectAsObject.getLong("modified"), jSONObjectAsObject.getString("sample"));
            c15397.f50121 = jSONObjectAsObject.getLong("anchorLine");
            c15397.f50123 = jSONObjectAsObject.getLong("anchorByte");
            c15397.f50128 = jSONObjectAsObject.getLong("line");
            c15397.f50129 = jSONObjectAsObject.getBoolean("pending");
            c15397.f50117 = jSONObjectAsObject.getLong("outputLine");
            c15397.f50122 = jSONObjectAsObject.getLong("outputColumn");
            c15397.f50116 = jSONObjectAsObject.getLong("delivered");
            c15397.f50118 = jSONObjectAsObject.getLong("afterThrough");
            c15397.f50125 = jSONObjectAsObject.getLong("searched");
            return c15397;
        } catch (RuntimeException unused) {
            throw C12731.m31627("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m36830(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f50114, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }
}
