package l;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۖۢۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 592R */
/* JADX INFO: loaded from: classes2.dex */
public final class C2446 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f9757;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f9758;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f9759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Matcher f9760;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7426(C2446 c2446) {
        this.f9757 = c2446.f9757;
        this.f9758 = c2446.f9758;
        this.f9759 = c2446.f9759;
        this.f9760 = null;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7430() {
        if (this.f9758 || !this.f9759) {
            return;
        }
        this.f9760 = Pattern.compile(this.f9757).matcher("");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7429(String str) {
        if (this.f9758) {
            return true;
        }
        if (this.f9759) {
            return this.f9760.reset(str).matches();
        }
        return str.equals(this.f9757);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m7428() {
        return this.f9758 || !TextUtils.isEmpty(this.f9757);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7427(JSONObject jSONObject, char c) throws JSONException {
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
        this.f9757 = str;
        this.f9759 = jSONObject.getInt(strValueOf2) != 0;
        this.f9758 = jSONObject.getInt(strValueOf3) != 0;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m7431(JSONObject jSONObject, char c) throws JSONException {
        char c2 = (char) (c + 1);
        String strValueOf = String.valueOf(c);
        char c3 = (char) (c2 + 1);
        String strValueOf2 = String.valueOf(c2);
        String strValueOf3 = String.valueOf(c3);
        String str = this.f9757;
        if (str == null) {
            str = "";
        }
        jSONObject.put(strValueOf, str);
        jSONObject.put(strValueOf2, this.f9759 ? 1 : 0);
        jSONObject.put(strValueOf3, this.f9758 ? 1 : 0);
    }

    public final String toString() {
        if (this.f9758) {
            return "*";
        }
        return this.f9759 ? C22697.m50267(new StringBuilder("/"), this.f9757, "/") : this.f9757;
    }
}
