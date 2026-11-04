package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.᩸ۜۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592R */
/* JADX INFO: loaded from: classes.dex */
public final class C22629 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f73224;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f73225;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Matcher f73226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f73227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50978(C22629 c22629) {
        this.f73227 = c22629.f73227;
        this.f73224 = c22629.f73224;
        this.f73225 = c22629.f73225;
        this.f73226 = null;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50982() {
        if (this.f73224 || !this.f73225) {
            return;
        }
        this.f73226 = Pattern.compile(this.f73227).matcher("");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50981(String str) {
        if (this.f73224) {
            return true;
        }
        if (this.f73225) {
            return this.f73226.reset(str).matches();
        }
        return str.equals(this.f73227);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m50980() {
        return this.f73224 || !TextUtils.isEmpty(this.f73227);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50979(JSONObject jSONObject, char c) throws JSONException {
        String str;
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        if (jSONObject.has(strValueOf)) {
            Object obj = jSONObject.get(strValueOf);
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        this.f73227 = str;
        this.f73225 = jSONObject.getInt(strValueOf2) != 0;
        this.f73224 = jSONObject.getInt(strValueOf3) != 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m50983(JSONObject jSONObject, char c) throws JSONException {
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        String str = this.f73227;
        if (str == null) {
            str = "";
        }
        jSONObject.put(strValueOf, str);
        jSONObject.put(strValueOf2, this.f73225 ? 1 : 0);
        jSONObject.put(strValueOf3, this.f73224 ? 1 : 0);
    }

    public final String toString() {
        if (this.f73224) {
            return "*";
        }
        return this.f73225 ? C8947.m23910(new StringBuilder("/"), this.f73227, "/") : this.f73227;
    }
}
