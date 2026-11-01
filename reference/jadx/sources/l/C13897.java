package l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: l.ܰܶۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1P7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13897 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public String f45781;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f45782;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public boolean f45783;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f45784;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public String f45785;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public boolean f45786;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m33733() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pattern", this.f45781);
            jSONObject.put("obf", this.f45784);
            jSONObject.put("keep", this.f45782);
            jSONObject.put("xp", this.f45786);
            jSONObject.put("vfy", this.f45783);
            jSONObject.put("map", this.f45785);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33734(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("pattern")) {
                this.f45781 = jSONObject.getString("pattern");
            }
            if (jSONObject.has("obf")) {
                this.f45784 = jSONObject.getBoolean("obf");
            }
            if (jSONObject.has("keep")) {
                this.f45782 = jSONObject.getBoolean("keep");
            }
            if (jSONObject.has("xp")) {
                this.f45786 = jSONObject.getBoolean("xp");
            }
            if (jSONObject.has("vfy")) {
                this.f45783 = jSONObject.getBoolean("vfy");
            }
            if (jSONObject.has("map")) {
                this.f45785 = jSONObject.getString("map");
            }
        } catch (JSONException unused) {
        }
    }
}
