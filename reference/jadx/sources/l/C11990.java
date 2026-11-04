package l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ۨ֡ۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11990 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f38629;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f38630;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public boolean f38631;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean f38632;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f38633;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public String f38634;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m30127() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pattern", this.f38634);
            jSONObject.put("obf", this.f38630);
            jSONObject.put("keep", this.f38629);
            jSONObject.put("xp", this.f38631);
            jSONObject.put("vfy", this.f38632);
            jSONObject.put("map", this.f38633);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30128(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pattern")) {
                this.f38634 = jSONObject.getString("pattern");
            }
            if (jSONObject.has("obf")) {
                this.f38630 = jSONObject.getBoolean("obf");
            }
            if (jSONObject.has("keep")) {
                this.f38629 = jSONObject.getBoolean("keep");
            }
            if (jSONObject.has("xp")) {
                this.f38631 = jSONObject.getBoolean("xp");
            }
            if (jSONObject.has("vfy")) {
                this.f38632 = jSONObject.getBoolean("vfy");
            }
            if (jSONObject.has("map")) {
                this.f38633 = jSONObject.getString("map");
            }
        } catch (JSONException unused) {
        }
    }
}
