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

/* JADX INFO: renamed from: l.ۧ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: U6V6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11241 {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final byte[] f35488;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public long f35489;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f35491;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public long f35492;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f35493;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f35494;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f35495;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public long f35496;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f35497;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f35498;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f35499;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public long f35500;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f35502;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f35503;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public long f35501 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f35490 = -1;

    static {
        byte[] bArr = new byte[32];
        f35488 = bArr;
        new SecureRandom().nextBytes(bArr);
    }

    public C11241(String str, String str2, String str3, long j, long j2, String str4) {
        this.f35493 = str;
        this.f35497 = str2;
        this.f35499 = str3;
        this.f35502 = j;
        this.f35494 = j2;
        this.f35498 = str4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m28467() {
        byte[] bytes = JSON.object().add(am.aE, 1).add(MotionUtils.EASING_TYPE_PATH, this.f35493).add("query", this.f35497).add("encoding", this.f35499).add("size", this.f35502).add("modified", this.f35494).add("sample", this.f35498).add("anchorLine", this.f35492).add("anchorByte", this.f35500).add("line", this.f35495).add("pending", this.f35503).add("outputLine", this.f35489).add("outputColumn", this.f35491).add("delivered", this.f35501).add("afterThrough", this.f35490).add("searched", this.f35496).toString().getBytes(StandardCharsets.UTF_8);
        return Base64.encodeToString(bytes, 11) + "." + Base64.encodeToString(m28466(bytes), 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11241 m28465(String str, String str2) throws C10186 {
        try {
            if (str.length() > 32768) {
                throw new IllegalArgumentException();
            }
            int iIndexOf = str.indexOf(46);
            if (iIndexOf <= 0 || iIndexOf != str.lastIndexOf(46)) {
                throw new IllegalArgumentException();
            }
            byte[] bArrDecode = Base64.decode(str.substring(0, iIndexOf), 11);
            if (!MessageDigest.isEqual(m28466(bArrDecode), Base64.decode(str.substring(iIndexOf + 1), 11))) {
                throw new IllegalArgumentException();
            }
            JSONObject jSONObjectAsObject = JSON.parse(new String(bArrDecode, StandardCharsets.UTF_8)).asObject();
            if (jSONObjectAsObject.getInt(am.aE) != 1 || !str2.equals(jSONObjectAsObject.getString(MotionUtils.EASING_TYPE_PATH))) {
                throw new IllegalArgumentException();
            }
            C11241 c11241 = new C11241(str2, jSONObjectAsObject.getString("query"), jSONObjectAsObject.getString("encoding"), jSONObjectAsObject.getLong("size"), jSONObjectAsObject.getLong("modified"), jSONObjectAsObject.getString("sample"));
            c11241.f35492 = jSONObjectAsObject.getLong("anchorLine");
            c11241.f35500 = jSONObjectAsObject.getLong("anchorByte");
            c11241.f35495 = jSONObjectAsObject.getLong("line");
            c11241.f35503 = jSONObjectAsObject.getBoolean("pending");
            c11241.f35489 = jSONObjectAsObject.getLong("outputLine");
            c11241.f35491 = jSONObjectAsObject.getLong("outputColumn");
            c11241.f35501 = jSONObjectAsObject.getLong("delivered");
            c11241.f35490 = jSONObjectAsObject.getLong("afterThrough");
            c11241.f35496 = jSONObjectAsObject.getLong("searched");
            return c11241;
        } catch (RuntimeException unused) {
            throw C10186.m26302("FILE_INVALID_CURSOR", "The text search cursor is invalid or does not match this request. Restart with cursor=\"\".", "warning", (JSONArray) null, JSON.object().add(MotionUtils.EASING_TYPE_PATH, str2));
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static byte[] m28466(byte[] bArr) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(f35488, "HmacSHA256"));
            return mac.doFinal(bArr);
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException("HmacSHA256 unavailable", e);
        }
    }
}
